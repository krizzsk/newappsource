package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import p001a0.C0016g;

public class AWS4Signer extends AbstractAWSSigner implements ServiceAwareSigner, RegionAwareSigner, Presigner {
    public static final String ALGORITHM = "AWS4-HMAC-SHA256";
    private static final String DATE_PATTERN = "yyyyMMdd";
    private static final long MAX_EXPIRATION_TIME_IN_SECONDS = 604800;
    private static final long MILLISEC = 1000;
    public static final String TERMINATOR = "aws4_request";
    private static final String TIME_PATTERN = "yyyyMMdd'T'HHmmss'Z'";
    public static final Log log = LogFactory.getLog((Class<?>) AWS4Signer.class);
    public boolean doubleUrlEncode;
    public Date overriddenDate;
    public String regionName;
    public String serviceName;

    public static class HeaderSigningResult {
        private final String dateTime;
        private final byte[] kSigning;
        private final String scope;
        private final byte[] signature;

        public HeaderSigningResult(String str, String str2, byte[] bArr, byte[] bArr2) {
            this.dateTime = str;
            this.scope = str2;
            this.kSigning = bArr;
            this.signature = bArr2;
        }

        public String getDateTime() {
            return this.dateTime;
        }

        public byte[] getKSigning() {
            byte[] bArr = this.kSigning;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        public String getScope() {
            return this.scope;
        }

        public byte[] getSignature() {
            byte[] bArr = this.signature;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
    }

    public AWS4Signer() {
        this(true);
    }

    public void addHostHeader(Request<?> request) {
        String host = request.getEndpoint().getHost();
        if (HttpUtils.isUsingNonDefaultPort(request.getEndpoint())) {
            StringBuilder t = C0016g.m36t(host, ":");
            t.append(request.getEndpoint().getPort());
            host = t.toString();
        }
        request.addHeader(HttpHeader.HOST, host);
    }

    public void addSessionCredentials(Request<?> request, AWSSessionCredentials aWSSessionCredentials) {
        request.addHeader("x-amz-security-token", aWSSessionCredentials.getSessionToken());
    }

    public String calculateContentHash(Request<?> request) {
        InputStream binaryRequestPayloadStream = getBinaryRequestPayloadStream(request);
        binaryRequestPayloadStream.mark(-1);
        String hex = BinaryUtils.toHex(hash(binaryRequestPayloadStream));
        try {
            binaryRequestPayloadStream.reset();
            return hex;
        } catch (IOException e) {
            throw new AmazonClientException("Unable to reset stream after calculating AWS4 signature", e);
        }
    }

    public String calculateContentHashPresign(Request<?> request) {
        return calculateContentHash(request);
    }

    public final HeaderSigningResult computeSignature(Request<?> request, String str, String str2, String str3, String str4, AWSCredentials aWSCredentials) {
        String extractRegionName = extractRegionName(request.getEndpoint());
        String extractServiceName = extractServiceName(request.getEndpoint());
        String o = C0016g.m31o(C16759e.m42352h(str, "/", extractRegionName, "/", extractServiceName), "/", TERMINATOR);
        String stringToSign = getStringToSign(str3, str2, o, getCanonicalRequest(request, str4));
        StringBuilder k = C13555b.m33972k("AWS4");
        k.append(aWSCredentials.getAWSSecretKey());
        String sb = k.toString();
        Charset charset = StringUtils.UTF8;
        byte[] bytes = sb.getBytes(charset);
        SigningAlgorithm signingAlgorithm = SigningAlgorithm.HmacSHA256;
        byte[] sign = sign(TERMINATOR, sign(extractServiceName, sign(extractRegionName, sign(str, bytes, signingAlgorithm), signingAlgorithm), signingAlgorithm), signingAlgorithm);
        return new HeaderSigningResult(str2, o, sign, sign(stringToSign.getBytes(charset), sign, signingAlgorithm));
    }

    public String extractRegionName(URI uri) {
        String str = this.regionName;
        if (str != null) {
            return str;
        }
        return AwsHostNameUtils.parseRegionName(uri.getHost(), this.serviceName);
    }

    public String extractServiceName(URI uri) {
        String str = this.serviceName;
        if (str != null) {
            return str;
        }
        return AwsHostNameUtils.parseServiceName(uri);
    }

    public String getCanonicalRequest(Request<?> request, String str) {
        String appendUri = HttpUtils.appendUri(request.getEndpoint().getPath(), request.getResourcePath());
        String str2 = request.getHttpMethod().toString() + "\n" + getCanonicalizedResourcePath(appendUri, this.doubleUrlEncode) + "\n" + getCanonicalizedQueryString(request) + "\n" + getCanonicalizedHeaderString(request) + "\n" + getSignedHeadersString(request) + "\n" + str;
        log.debug("AWS4 Canonical Request: '\"" + str2 + "\"");
        return str2;
    }

    public String getCanonicalizedHeaderString(Request<?> request) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(request.getHeaders().keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (needsSign(str)) {
                String replaceAll = StringUtils.lowerCase(str).replaceAll("\\s+", " ");
                String str2 = request.getHeaders().get(str);
                sb.append(replaceAll);
                sb.append(":");
                if (str2 != null) {
                    sb.append(str2.replaceAll("\\s+", " "));
                }
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final long getDateFromRequest(Request<?> request) {
        Date signatureDate = getSignatureDate(getTimeOffset(request));
        Date date = this.overriddenDate;
        if (date != null) {
            signatureDate = date;
        }
        return signatureDate.getTime();
    }

    public final String getDateStamp(long j) {
        return DateUtils.format(DATE_PATTERN, new Date(j));
    }

    public String getScope(Request<?> request, String str) {
        return C0016g.m31o(C16759e.m42352h(str, "/", extractRegionName(request.getEndpoint()), "/", extractServiceName(request.getEndpoint())), "/", TERMINATOR);
    }

    public String getSignedHeadersString(Request<?> request) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(request.getHeaders().keySet());
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (needsSign(str)) {
                if (sb.length() > 0) {
                    sb.append(";");
                }
                sb.append(StringUtils.lowerCase(str));
            }
        }
        return sb.toString();
    }

    public String getStringToSign(String str, String str2, String str3, String str4) {
        StringBuilder h = C16759e.m42352h(str, "\n", str2, "\n", str3);
        h.append("\n");
        h.append(BinaryUtils.toHex(hash(str4)));
        String sb = h.toString();
        Log log2 = log;
        log2.debug("AWS4 String to Sign: '\"" + sb + "\"");
        return sb;
    }

    public final String getTimeStamp(long j) {
        return DateUtils.format("yyyyMMdd'T'HHmmss'Z'", new Date(j));
    }

    public boolean needsSign(String str) {
        if ("date".equalsIgnoreCase(str) || "Content-MD5".equalsIgnoreCase(str) || "host".equalsIgnoreCase(str) || str.startsWith("x-amz") || str.startsWith("X-Amz")) {
            return true;
        }
        return false;
    }

    public void overrideDate(Date date) {
        this.overriddenDate = date;
    }

    public void presignRequest(Request<?> request, AWSCredentials aWSCredentials, Date date) {
        long j;
        if (!(aWSCredentials instanceof AnonymousAWSCredentials)) {
            if (date != null) {
                j = (date.getTime() - System.currentTimeMillis()) / MILLISEC;
            } else {
                j = 604800;
            }
            if (j <= MAX_EXPIRATION_TIME_IN_SECONDS) {
                addHostHeader(request);
                AWSCredentials sanitizeCredentials = sanitizeCredentials(aWSCredentials);
                if (sanitizeCredentials instanceof AWSSessionCredentials) {
                    request.addParameter("X-Amz-Security-Token", ((AWSSessionCredentials) sanitizeCredentials).getSessionToken());
                }
                long dateFromRequest = getDateFromRequest(request);
                String dateStamp = getDateStamp(dateFromRequest);
                String timeStamp = getTimeStamp(dateFromRequest);
                request.addParameter("X-Amz-Algorithm", ALGORITHM);
                request.addParameter("X-Amz-Date", timeStamp);
                request.addParameter("X-Amz-SignedHeaders", getSignedHeadersString(request));
                request.addParameter("X-Amz-Expires", Long.toString(j));
                request.addParameter("X-Amz-Credential", sanitizeCredentials.getAWSAccessKeyId() + "/" + getScope(request, dateStamp));
                request.addParameter("X-Amz-Signature", BinaryUtils.toHex(computeSignature(request, dateStamp, timeStamp, ALGORITHM, calculateContentHashPresign(request), sanitizeCredentials).getSignature()));
                return;
            }
            StringBuilder k = C13555b.m33972k("Requests that are pre-signed by SigV4 algorithm are valid for at most 7 days. The expiration date set on the current request [");
            k.append(getTimeStamp(date.getTime()));
            k.append("] has exceeded this limit.");
            throw new AmazonClientException(k.toString());
        }
    }

    public void processRequestPayload(Request<?> request, HeaderSigningResult headerSigningResult) {
    }

    public void setRegionName(String str) {
        this.regionName = str;
    }

    public void setServiceName(String str) {
        this.serviceName = str;
    }

    public void sign(Request<?> request, AWSCredentials aWSCredentials) {
        if (!(aWSCredentials instanceof AnonymousAWSCredentials)) {
            AWSCredentials sanitizeCredentials = sanitizeCredentials(aWSCredentials);
            if (sanitizeCredentials instanceof AWSSessionCredentials) {
                addSessionCredentials(request, (AWSSessionCredentials) sanitizeCredentials);
            }
            addHostHeader(request);
            long dateFromRequest = getDateFromRequest(request);
            String dateStamp = getDateStamp(dateFromRequest);
            String scope = getScope(request, dateStamp);
            String calculateContentHash = calculateContentHash(request);
            String timeStamp = getTimeStamp(dateFromRequest);
            request.addHeader("X-Amz-Date", timeStamp);
            if (request.getHeaders().get("x-amz-content-sha256") != null && "required".equals(request.getHeaders().get("x-amz-content-sha256"))) {
                request.addHeader("x-amz-content-sha256", calculateContentHash);
            }
            HeaderSigningResult computeSignature = computeSignature(request, dateStamp, timeStamp, ALGORITHM, calculateContentHash, sanitizeCredentials);
            String k = C25541a.m63881k("Credential=", sanitizeCredentials.getAWSAccessKeyId() + "/" + scope);
            StringBuilder k2 = C13555b.m33972k("SignedHeaders=");
            k2.append(getSignedHeadersString(request));
            String sb = k2.toString();
            StringBuilder k3 = C13555b.m33972k("Signature=");
            k3.append(BinaryUtils.toHex(computeSignature.getSignature()));
            String sb2 = k3.toString();
            StringBuilder h = C16759e.m42352h("AWS4-HMAC-SHA256 ", k, ", ", sb, ", ");
            h.append(sb2);
            request.addHeader(HttpHeader.AUTHORIZATION, h.toString());
            processRequestPayload(request, computeSignature);
        }
    }

    public AWS4Signer(boolean z) {
        this.doubleUrlEncode = z;
    }
}
