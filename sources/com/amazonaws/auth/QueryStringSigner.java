package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.util.DateUtils;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import p001a0.C0016g;
import p988j$.util.DesugarTimeZone;

public class QueryStringSigner extends AbstractAWSSigner {
    private Date overriddenDate;

    private String calculateStringToSignV1(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        treeMap.putAll(map);
        for (Map.Entry entry : treeMap.entrySet()) {
            sb.append((String) entry.getKey());
            sb.append((String) entry.getValue());
        }
        return sb.toString();
    }

    private String calculateStringToSignV2(Request<?> request) {
        URI endpoint = request.getEndpoint();
        Map<String, String> parameters = request.getParameters();
        StringBuilder t = C0016g.m36t("POST", "\n");
        t.append(getCanonicalizedEndpoint(endpoint));
        t.append("\n");
        t.append(getCanonicalizedResourcePath(request));
        t.append("\n");
        t.append(getCanonicalizedQueryString(parameters));
        return t.toString();
    }

    private String getCanonicalizedResourcePath(Request<?> request) {
        String str = "";
        if (request.getEndpoint().getPath() != null) {
            StringBuilder k = C13555b.m33972k(str);
            k.append(request.getEndpoint().getPath());
            str = k.toString();
        }
        if (request.getResourcePath() != null) {
            if (str.length() > 0 && !str.endsWith("/") && !request.getResourcePath().startsWith("/")) {
                str = C25541a.m63881k(str, "/");
            }
            StringBuilder k2 = C13555b.m33972k(str);
            k2.append(request.getResourcePath());
            str = k2.toString();
        } else if (!str.endsWith("/")) {
            str = C25541a.m63881k(str, "/");
        }
        if (!str.startsWith("/")) {
            str = C25541a.m63881k("/", str);
        }
        if (str.startsWith("//")) {
            return str.substring(1);
        }
        return str;
    }

    private String getFormattedTimestamp(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateUtils.ISO8601_DATE_PATTERN);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        Date date = this.overriddenDate;
        if (date != null) {
            return simpleDateFormat.format(date);
        }
        return simpleDateFormat.format(getSignatureDate(j));
    }

    public void addSessionCredentials(Request<?> request, AWSSessionCredentials aWSSessionCredentials) {
        request.addParameter("SecurityToken", aWSSessionCredentials.getSessionToken());
    }

    public void overrideDate(Date date) {
        this.overriddenDate = date;
    }

    public void sign(Request<?> request, AWSCredentials aWSCredentials) {
        sign(request, SignatureVersion.V2, SigningAlgorithm.HmacSHA256, aWSCredentials);
    }

    public void sign(Request<?> request, SignatureVersion signatureVersion, SigningAlgorithm signingAlgorithm, AWSCredentials aWSCredentials) {
        String str;
        if (!(aWSCredentials instanceof AnonymousAWSCredentials)) {
            AWSCredentials sanitizeCredentials = sanitizeCredentials(aWSCredentials);
            request.addParameter("AWSAccessKeyId", sanitizeCredentials.getAWSAccessKeyId());
            request.addParameter("SignatureVersion", signatureVersion.toString());
            request.addParameter("Timestamp", getFormattedTimestamp(getTimeOffset(request)));
            if (sanitizeCredentials instanceof AWSSessionCredentials) {
                addSessionCredentials(request, (AWSSessionCredentials) sanitizeCredentials);
            }
            if (signatureVersion.equals(SignatureVersion.V1)) {
                str = calculateStringToSignV1(request.getParameters());
            } else if (signatureVersion.equals(SignatureVersion.V2)) {
                request.addParameter("SignatureMethod", signingAlgorithm.toString());
                str = calculateStringToSignV2(request);
            } else {
                throw new AmazonClientException("Invalid Signature Version specified");
            }
            request.addParameter("Signature", signAndBase64Encode(str, sanitizeCredentials.getAWSSecretKey(), signingAlgorithm));
        }
    }
}
