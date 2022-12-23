package com.amazonaws.http;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.RequestClientOptions;
import com.amazonaws.Response;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.handlers.CredentialsRequestHandler;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.internal.CRC32MismatchException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.MetricType;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.retry.RetryPolicy;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.TimingInfo;
import com.amazonaws.util.URIBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class AmazonHttpClient {
    private static final String HEADER_SDK_RETRY_INFO = "aws-sdk-retry";
    private static final String HEADER_SDK_TRANSACTION_ID = "aws-sdk-invocation-id";
    private static final String HEADER_USER_AGENT = "User-Agent";
    private static final int HTTP_STATUS_MULTIPLE_CHOICES = 300;
    private static final int HTTP_STATUS_OK = 200;
    private static final int HTTP_STATUS_REQ_TOO_LONG = 413;
    private static final int HTTP_STATUS_SERVICE_UNAVAILABLE = 503;
    private static final int HTTP_STATUS_TEMP_REDIRECT = 307;
    private static final Log REQUEST_LOG = LogFactory.getLog("com.amazonaws.request");
    private static final long TIME_MILLISEC = 1000;
    public static final Log log = LogFactory.getLog((Class<?>) AmazonHttpClient.class);
    public final ClientConfiguration config;
    public final HttpClient httpClient;
    private final HttpRequestFactory requestFactory;
    private final RequestMetricCollector requestMetricCollector;

    public AmazonHttpClient(ClientConfiguration clientConfiguration) {
        this(clientConfiguration, (HttpClient) new UrlHttpClient(clientConfiguration));
    }

    public static String createUserAgentString(String str, String str2) {
        if (str.contains(str2)) {
            return str;
        }
        return str.trim() + " " + str2.trim();
    }

    private String getServerDateFromException(String str) {
        int i;
        int indexOf = str.indexOf("(");
        if (str.contains(" + 15")) {
            i = str.indexOf(" + 15");
        } else {
            i = str.indexOf(" - 15");
        }
        return str.substring(indexOf + 1, i);
    }

    private <T extends Throwable> T handleUnexpectedFailure(T t, AWSRequestMetrics aWSRequestMetrics) {
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.Exception;
        aWSRequestMetrics.incrementCounter((MetricType) field);
        aWSRequestMetrics.addProperty((MetricType) field, (Object) t);
        return t;
    }

    private boolean isRequestSuccessful(HttpResponse httpResponse) {
        int statusCode = httpResponse.getStatusCode();
        return statusCode >= HTTP_STATUS_OK && statusCode < 300;
    }

    private static boolean isTemporaryRedirect(HttpResponse httpResponse) {
        int statusCode = httpResponse.getStatusCode();
        String str = httpResponse.getHeaders().get(HttpHeader.LOCATION);
        if (statusCode != HTTP_STATUS_TEMP_REDIRECT || str == null || str.isEmpty()) {
            return false;
        }
        return true;
    }

    private long pauseBeforeNextRetry(AmazonWebServiceRequest amazonWebServiceRequest, AmazonClientException amazonClientException, int i, RetryPolicy retryPolicy) {
        int i2 = (i - 1) - 1;
        long delayBeforeNextRetry = retryPolicy.getBackoffStrategy().delayBeforeNextRetry(amazonWebServiceRequest, amazonClientException, i2);
        Log log2 = log;
        if (log2.isDebugEnabled()) {
            log2.debug("Retriable error detected, will retry in " + delayBeforeNextRetry + "ms, attempt number: " + i2);
        }
        try {
            Thread.sleep(delayBeforeNextRetry);
            return delayBeforeNextRetry;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AmazonClientException(e.getMessage(), e);
        }
    }

    private boolean shouldRetry(AmazonWebServiceRequest amazonWebServiceRequest, InputStream inputStream, AmazonClientException amazonClientException, int i, RetryPolicy retryPolicy) {
        int i2 = i - 1;
        int maxErrorRetry = this.config.getMaxErrorRetry();
        if (maxErrorRetry < 0 || !retryPolicy.isMaxErrorRetryInClientConfigHonored()) {
            maxErrorRetry = retryPolicy.getMaxErrorRetry();
        }
        if (i2 >= maxErrorRetry) {
            return false;
        }
        if (inputStream == null || inputStream.markSupported()) {
            return retryPolicy.getRetryCondition().shouldRetry(amazonWebServiceRequest, amazonClientException, i2);
        }
        Log log2 = log;
        if (log2.isDebugEnabled()) {
            log2.debug("Content not repeatable");
        }
        return false;
    }

    public void afterError(Request<?> request, Response<?> response, List<RequestHandler2> list, AmazonClientException amazonClientException) {
        for (RequestHandler2 afterError : list) {
            afterError.afterError(request, response, amazonClientException);
        }
    }

    public <T> void afterResponse(Request<?> request, List<RequestHandler2> list, Response<T> response, TimingInfo timingInfo) {
        for (RequestHandler2 afterResponse : list) {
            afterResponse.afterResponse(request, response);
        }
    }

    public <T> Response<T> execute(Request<?> request, HttpResponseHandler<AmazonWebServiceResponse<T>> httpResponseHandler, HttpResponseHandler<AmazonServiceException> httpResponseHandler2, ExecutionContext executionContext) {
        if (request.getHostPrefix() != null) {
            try {
                URI endpoint = request.getEndpoint();
                request.setEndpoint(URIBuilder.builder(endpoint).host(request.getHostPrefix() + endpoint.getHost()).build());
            } catch (URISyntaxException e) {
                Log log2 = log;
                if (log2.isDebugEnabled()) {
                    StringBuilder k = C13555b.m33972k("Failed to prepend host prefix: ");
                    k.append(e.getMessage());
                    log2.debug(k.toString(), e);
                }
            }
        }
        if (executionContext != null) {
            List<RequestHandler2> requestHandler2s = requestHandler2s(request, executionContext);
            AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
            Response<T> response = null;
            try {
                response = executeHelper(request, httpResponseHandler, httpResponseHandler2, executionContext);
                afterResponse(request, requestHandler2s, response, awsRequestMetrics.getTimingInfo().endTiming());
                return response;
            } catch (AmazonClientException e2) {
                afterError(request, response, requestHandler2s, e2);
                throw e2;
            }
        } else {
            throw new AmazonClientException("Internal SDK Error: No execution context parameter specified.");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.amazonaws.http.HttpResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: com.amazonaws.http.HttpResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: com.amazonaws.http.HttpResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: com.amazonaws.http.HttpResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: com.amazonaws.http.HttpResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: com.amazonaws.http.HttpResponseHandler<com.amazonaws.AmazonWebServiceResponse<T>>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: com.amazonaws.http.HttpResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v31, resolved type: com.amazonaws.http.HttpResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v32, resolved type: com.amazonaws.http.HttpResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v33, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v34, resolved type: com.amazonaws.http.HttpResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v35, resolved type: com.amazonaws.http.HttpResponse} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v63, resolved type: long} */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r6v10 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c1, code lost:
        r9 = "Cannot close the response content.";
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01c5, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01c6, code lost:
        r9 = "Cannot close the response content.";
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0255, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0329, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x032b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x032c, code lost:
        r9 = "Cannot close the response content.";
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0332, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0333, code lost:
        r9 = "Cannot close the response content.";
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0338, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0339, code lost:
        r9 = "Cannot close the response content.";
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0362, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0363, code lost:
        r21 = r1;
        r9 = "Cannot close the response content.";
        r24 = r5;
        r25 = r6;
        r23 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x036f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0370, code lost:
        r21 = r1;
        r9 = "Cannot close the response content.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0375, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0376, code lost:
        r9 = "Cannot close the response content.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x037e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x037f, code lost:
        r9 = "Cannot close the response content.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x038b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x038c, code lost:
        r9 = "Cannot close the response content.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0398, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0399, code lost:
        r2 = r0;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:?, code lost:
        r1.debug("Unable to execute HTTP request: " + r0.getMessage(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0408, code lost:
        resetRequestAfterError(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0413, code lost:
        if (r19.getRawContent() != null) goto L_0x0415;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0415, code lost:
        r19.getRawContent().close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x041d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x041e, code lost:
        log.warn(r9, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0423, code lost:
        r5 = r15;
        r6 = r19;
        r1 = r20;
        r2 = r21;
        r4 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:?, code lost:
        throw r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0442, code lost:
        r6.getRawContent().close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00da, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00db, code lost:
        r21 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00de, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r10.endEvent((com.amazonaws.metrics.MetricType) com.amazonaws.util.AWSRequestMetrics.Field.RetryPauseTime);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e6, code lost:
        r2 = r0;
        r9 = "Cannot close the response content.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ea, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00eb, code lost:
        r9 = "Cannot close the response content.";
        r15 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012e, code lost:
        r4 = r0;
        r10.endEvent((com.amazonaws.metrics.MetricType) com.amazonaws.util.AWSRequestMetrics.Field.RequestSigningTime);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0134, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01bb, code lost:
        r2 = r0;
        r9 = "Cannot close the response content.";
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01c0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01c5 A[ExcHandler: RuntimeException (e java.lang.RuntimeException), Splitter:B:73:0x0171] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x032b A[ExcHandler: all (th java.lang.Throwable), Splitter:B:70:0x0168] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0332 A[ExcHandler: Error (e java.lang.Error), Splitter:B:70:0x0168] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0338 A[ExcHandler: RuntimeException (e java.lang.RuntimeException), Splitter:B:70:0x0168] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0375 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:41:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x037e A[ExcHandler: Error (e java.lang.Error), Splitter:B:17:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x038b A[Catch:{ IOException -> 0x0362, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x0375, all -> 0x0398 }, ExcHandler: RuntimeException (e java.lang.RuntimeException), Splitter:B:17:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03af A[SYNTHETIC, Splitter:B:228:0x03af] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0408 A[Catch:{ all -> 0x0435 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0434 A[EDGE_INSN: B:243:0x0434->B:244:? ?: BREAK  , SYNTHETIC, Splitter:B:243:0x0434] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0442 A[Catch:{ IOException -> 0x044a }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e5 A[ExcHandler: all (r0v108 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:17:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ba A[ExcHandler: all (r0v89 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:73:0x0171] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c0 A[ExcHandler: Error (e java.lang.Error), Splitter:B:73:0x0171] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> com.amazonaws.Response<T> executeHelper(com.amazonaws.Request<?> r27, com.amazonaws.http.HttpResponseHandler<com.amazonaws.AmazonWebServiceResponse<T>> r28, com.amazonaws.http.HttpResponseHandler<com.amazonaws.AmazonServiceException> r29, com.amazonaws.http.ExecutionContext r30) {
        /*
            r26 = this;
            r7 = r26
            r8 = r27
            r9 = r30
            com.amazonaws.util.AWSRequestMetrics r10 = r30.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r0 = com.amazonaws.util.AWSRequestMetrics.Field.ServiceName
            java.lang.String r1 = r27.getServiceName()
            r10.addProperty((com.amazonaws.metrics.MetricType) r0, (java.lang.Object) r1)
            com.amazonaws.util.AWSRequestMetrics$Field r0 = com.amazonaws.util.AWSRequestMetrics.Field.ServiceEndpoint
            java.net.URI r1 = r27.getEndpoint()
            r10.addProperty((com.amazonaws.metrics.MetricType) r0, (java.lang.Object) r1)
            r26.setUserAgent(r27)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "aws-sdk-invocation-id"
            r8.addHeader(r1, r0)
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            java.util.Map r0 = r27.getParameters()
            r11.<init>(r0)
            java.util.HashMap r12 = new java.util.HashMap
            java.util.Map r0 = r27.getHeaders()
            r12.<init>(r0)
            java.io.InputStream r13 = r27.getContent()
            if (r13 == 0) goto L_0x004e
            boolean r0 = r13.markSupported()
            if (r0 == 0) goto L_0x004e
            r0 = -1
            r13.mark(r0)
        L_0x004e:
            com.amazonaws.auth.AWSCredentials r14 = r30.getCredentials()
            r0 = 0
            r1 = 0
            r2 = r1
            r1 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r16 = 0
            r17 = 0
        L_0x005e:
            r15 = 1
            r19 = r6
            int r6 = r0 + 1
            com.amazonaws.util.AWSRequestMetrics$Field r0 = com.amazonaws.util.AWSRequestMetrics.Field.RequestCount
            r20 = r1
            r21 = r2
            long r1 = (long) r6
            r10.setCounter((com.amazonaws.metrics.MetricType) r0, (long) r1)
            if (r6 <= r15) goto L_0x0078
            r8.setParameters(r11)
            r8.setHeaders(r12)
            r8.setContent(r13)
        L_0x0078:
            if (r16 == 0) goto L_0x00b0
            java.net.URI r0 = r27.getEndpoint()
            if (r0 != 0) goto L_0x00b0
            java.lang.String r0 = r27.getResourcePath()
            if (r0 != 0) goto L_0x00b0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r16.getScheme()
            r0.append(r1)
            java.lang.String r1 = "://"
            r0.append(r1)
            java.lang.String r1 = r16.getAuthority()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.net.URI r0 = java.net.URI.create(r0)
            r8.setEndpoint(r0)
            java.lang.String r0 = r16.getPath()
            r8.setResourcePath(r0)
        L_0x00b0:
            java.lang.String r3 = "Cannot close the response content."
            if (r6 <= r15) goto L_0x00f3
            com.amazonaws.util.AWSRequestMetrics$Field r0 = com.amazonaws.util.AWSRequestMetrics.Field.RetryPauseTime     // Catch:{ IOException -> 0x00ea, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            r10.startEvent((com.amazonaws.metrics.MetricType) r0)     // Catch:{ IOException -> 0x00ea, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            com.amazonaws.AmazonWebServiceRequest r1 = r27.getOriginalRequest()     // Catch:{ all -> 0x00de }
            com.amazonaws.ClientConfiguration r2 = r7.config     // Catch:{ all -> 0x00de }
            com.amazonaws.retry.RetryPolicy r2 = r2.getRetryPolicy()     // Catch:{ all -> 0x00de }
            long r1 = r7.pauseBeforeNextRetry(r1, r4, r6, r2)     // Catch:{ all -> 0x00de }
            r10.endEvent((com.amazonaws.metrics.MetricType) r0)     // Catch:{ IOException -> 0x00da, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            java.io.InputStream r0 = r27.getContent()     // Catch:{ IOException -> 0x00da, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            if (r0 == 0) goto L_0x00f5
            boolean r4 = r0.markSupported()     // Catch:{ IOException -> 0x00da, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            if (r4 == 0) goto L_0x00f5
            r0.reset()     // Catch:{ IOException -> 0x00da, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            goto L_0x00f5
        L_0x00da:
            r0 = move-exception
            r21 = r1
            goto L_0x00eb
        L_0x00de:
            r0 = move-exception
            com.amazonaws.util.AWSRequestMetrics$Field r1 = com.amazonaws.util.AWSRequestMetrics.Field.RetryPauseTime     // Catch:{ IOException -> 0x00ea, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            r10.endEvent((com.amazonaws.metrics.MetricType) r1)     // Catch:{ IOException -> 0x00ea, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            throw r0     // Catch:{ IOException -> 0x00ea, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
        L_0x00e5:
            r0 = move-exception
            r2 = r0
            r9 = r3
            goto L_0x0378
        L_0x00ea:
            r0 = move-exception
        L_0x00eb:
            r9 = r3
            r15 = r5
        L_0x00ed:
            r25 = r6
        L_0x00ef:
            r23 = r11
            goto L_0x03a5
        L_0x00f3:
            r1 = r21
        L_0x00f5:
            java.lang.String r0 = "aws-sdk-retry"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x039c, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x0375 }
            r4.<init>()     // Catch:{ IOException -> 0x039c, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x0375 }
            int r15 = r6 + -1
            r4.append(r15)     // Catch:{ IOException -> 0x039c, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x0375 }
            java.lang.String r15 = "/"
            r4.append(r15)     // Catch:{ IOException -> 0x039c, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x0375 }
            r4.append(r1)     // Catch:{ IOException -> 0x039c, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x0375 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x039c, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x0375 }
            r8.addHeader(r0, r4)     // Catch:{ IOException -> 0x039c, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x0375 }
            if (r5 != 0) goto L_0x011c
            java.net.URI r0 = r27.getEndpoint()     // Catch:{ IOException -> 0x00da, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            com.amazonaws.auth.Signer r0 = r9.getSignerByURI(r0)     // Catch:{ IOException -> 0x00da, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            r15 = r0
            goto L_0x011d
        L_0x011c:
            r15 = r5
        L_0x011d:
            if (r15 == 0) goto L_0x0135
            if (r14 == 0) goto L_0x0135
            com.amazonaws.util.AWSRequestMetrics$Field r0 = com.amazonaws.util.AWSRequestMetrics.Field.RequestSigningTime     // Catch:{ IOException -> 0x036f, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            r10.startEvent((com.amazonaws.metrics.MetricType) r0)     // Catch:{ IOException -> 0x036f, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            r15.sign(r8, r14)     // Catch:{ all -> 0x012d }
            r10.endEvent((com.amazonaws.metrics.MetricType) r0)     // Catch:{ IOException -> 0x036f, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            goto L_0x0135
        L_0x012d:
            r0 = move-exception
            r4 = r0
            com.amazonaws.util.AWSRequestMetrics$Field r0 = com.amazonaws.util.AWSRequestMetrics.Field.RequestSigningTime     // Catch:{ IOException -> 0x036f, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            r10.endEvent((com.amazonaws.metrics.MetricType) r0)     // Catch:{ IOException -> 0x036f, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            throw r4     // Catch:{ IOException -> 0x036f, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
        L_0x0135:
            com.amazonaws.logging.Log r0 = REQUEST_LOG     // Catch:{ IOException -> 0x036f, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x0375 }
            boolean r4 = r0.isDebugEnabled()     // Catch:{ IOException -> 0x036f, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x0375 }
            if (r4 == 0) goto L_0x0155
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x036f, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            r4.<init>()     // Catch:{ IOException -> 0x036f, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            java.lang.String r5 = "Sending Request: "
            r4.append(r5)     // Catch:{ IOException -> 0x036f, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            java.lang.String r5 = r27.toString()     // Catch:{ IOException -> 0x036f, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            r4.append(r5)     // Catch:{ IOException -> 0x036f, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x036f, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
            r0.debug(r4)     // Catch:{ IOException -> 0x036f, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x00e5 }
        L_0x0155:
            com.amazonaws.http.HttpRequestFactory r0 = r7.requestFactory     // Catch:{ IOException -> 0x036f, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x0375 }
            com.amazonaws.ClientConfiguration r4 = r7.config     // Catch:{ IOException -> 0x036f, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x0375 }
            com.amazonaws.http.HttpRequest r5 = r0.createHttpRequest(r8, r4, r9)     // Catch:{ IOException -> 0x036f, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x0375 }
            com.amazonaws.util.AWSRequestMetrics$Field r0 = com.amazonaws.util.AWSRequestMetrics.Field.HttpRequestTime     // Catch:{ IOException -> 0x0362, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x0375 }
            r10.startEvent((com.amazonaws.metrics.MetricType) r0)     // Catch:{ IOException -> 0x0362, RuntimeException -> 0x038b, Error -> 0x037e, all -> 0x0375 }
            com.amazonaws.http.HttpClient r4 = r7.httpClient     // Catch:{ all -> 0x034c }
            com.amazonaws.http.HttpResponse r4 = r4.execute(r5)     // Catch:{ all -> 0x034c }
            r10.endEvent((com.amazonaws.metrics.MetricType) r0)     // Catch:{ IOException -> 0x033e, RuntimeException -> 0x0338, Error -> 0x0332, all -> 0x032b }
            boolean r0 = r7.isRequestSuccessful(r4)     // Catch:{ IOException -> 0x033e, RuntimeException -> 0x0338, Error -> 0x0332, all -> 0x032b }
            if (r0 == 0) goto L_0x01d4
            com.amazonaws.util.AWSRequestMetrics$Field r0 = com.amazonaws.util.AWSRequestMetrics.Field.StatusCode     // Catch:{ IOException -> 0x01ca, RuntimeException -> 0x01c5, Error -> 0x01c0, all -> 0x01ba }
            int r17 = r4.getStatusCode()     // Catch:{ IOException -> 0x01ca, RuntimeException -> 0x01c5, Error -> 0x01c0, all -> 0x01ba }
            r21 = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r17)     // Catch:{ IOException -> 0x0255, RuntimeException -> 0x01c5, Error -> 0x01c0, all -> 0x01ba }
            r10.addProperty((com.amazonaws.metrics.MetricType) r0, (java.lang.Object) r1)     // Catch:{ IOException -> 0x0255, RuntimeException -> 0x01c5, Error -> 0x01c0, all -> 0x01ba }
            boolean r1 = r28.needsConnectionLeftOpen()     // Catch:{ IOException -> 0x0255, RuntimeException -> 0x01c5, Error -> 0x01c0, all -> 0x01ba }
            r2 = r28
            java.lang.Object r0 = r7.handleResponse(r8, r2, r4, r9)     // Catch:{ IOException -> 0x01b6, RuntimeException -> 0x01b1, Error -> 0x01ac, all -> 0x01a6 }
            com.amazonaws.Response r2 = new com.amazonaws.Response     // Catch:{ IOException -> 0x01b6, RuntimeException -> 0x01b1, Error -> 0x01ac, all -> 0x01a6 }
            r2.<init>(r0, r4)     // Catch:{ IOException -> 0x01b6, RuntimeException -> 0x01b1, Error -> 0x01ac, all -> 0x01a6 }
            if (r1 != 0) goto L_0x01a5
            java.io.InputStream r0 = r4.getRawContent()     // Catch:{ IOException -> 0x019f }
            if (r0 == 0) goto L_0x01a5
            java.io.InputStream r0 = r4.getRawContent()     // Catch:{ IOException -> 0x019f }
            r0.close()     // Catch:{ IOException -> 0x019f }
            goto L_0x01a5
        L_0x019f:
            r0 = move-exception
            com.amazonaws.logging.Log r1 = log
            r1.warn(r3, r0)
        L_0x01a5:
            return r2
        L_0x01a6:
            r0 = move-exception
            r2 = r0
            r9 = r3
            r6 = r4
            goto L_0x0438
        L_0x01ac:
            r0 = move-exception
            r9 = r3
            r6 = r4
            goto L_0x0384
        L_0x01b1:
            r0 = move-exception
            r9 = r3
            r6 = r4
            goto L_0x0391
        L_0x01b6:
            r0 = move-exception
            r20 = r1
            goto L_0x01cd
        L_0x01ba:
            r0 = move-exception
            r2 = r0
            r9 = r3
            r6 = r4
            goto L_0x037a
        L_0x01c0:
            r0 = move-exception
            r9 = r3
            r6 = r4
            goto L_0x0382
        L_0x01c5:
            r0 = move-exception
            r9 = r3
            r6 = r4
            goto L_0x038f
        L_0x01ca:
            r0 = move-exception
            r21 = r1
        L_0x01cd:
            r9 = r3
            r19 = r4
            r17 = r5
            goto L_0x00ed
        L_0x01d4:
            r21 = r1
            boolean r0 = isTemporaryRedirect(r4)     // Catch:{ IOException -> 0x0329, RuntimeException -> 0x0338, Error -> 0x0332, all -> 0x032b }
            if (r0 == 0) goto L_0x0258
            java.util.Map r0 = r4.getHeaders()     // Catch:{ IOException -> 0x0255, RuntimeException -> 0x01c5, Error -> 0x01c0, all -> 0x01ba }
            java.lang.String r1 = "Location"
            java.lang.Object r0 = r0.get(r1)     // Catch:{ IOException -> 0x0255, RuntimeException -> 0x01c5, Error -> 0x01c0, all -> 0x01ba }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0255, RuntimeException -> 0x01c5, Error -> 0x01c0, all -> 0x01ba }
            com.amazonaws.logging.Log r1 = log     // Catch:{ IOException -> 0x0255, RuntimeException -> 0x01c5, Error -> 0x01c0, all -> 0x01ba }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0255, RuntimeException -> 0x01c5, Error -> 0x01c0, all -> 0x01ba }
            r2.<init>()     // Catch:{ IOException -> 0x0255, RuntimeException -> 0x01c5, Error -> 0x01c0, all -> 0x01ba }
            r23 = r3
            java.lang.String r3 = "Redirecting to: "
            r2.append(r3)     // Catch:{ IOException -> 0x024a, RuntimeException -> 0x0242, Error -> 0x023a, all -> 0x0231 }
            r2.append(r0)     // Catch:{ IOException -> 0x024a, RuntimeException -> 0x0242, Error -> 0x023a, all -> 0x0231 }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x024a, RuntimeException -> 0x0242, Error -> 0x023a, all -> 0x0231 }
            r1.debug(r2)     // Catch:{ IOException -> 0x024a, RuntimeException -> 0x0242, Error -> 0x023a, all -> 0x0231 }
            java.net.URI r16 = java.net.URI.create(r0)     // Catch:{ IOException -> 0x024a, RuntimeException -> 0x0242, Error -> 0x023a, all -> 0x0231 }
            r1 = 0
            r8.setEndpoint(r1)     // Catch:{ IOException -> 0x024a, RuntimeException -> 0x0242, Error -> 0x023a, all -> 0x0231 }
            r8.setResourcePath(r1)     // Catch:{ IOException -> 0x024a, RuntimeException -> 0x0242, Error -> 0x023a, all -> 0x0231 }
            com.amazonaws.util.AWSRequestMetrics$Field r1 = com.amazonaws.util.AWSRequestMetrics.Field.StatusCode     // Catch:{ IOException -> 0x024a, RuntimeException -> 0x0242, Error -> 0x023a, all -> 0x0231 }
            int r2 = r4.getStatusCode()     // Catch:{ IOException -> 0x024a, RuntimeException -> 0x0242, Error -> 0x023a, all -> 0x0231 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x024a, RuntimeException -> 0x0242, Error -> 0x023a, all -> 0x0231 }
            r10.addProperty((com.amazonaws.metrics.MetricType) r1, (java.lang.Object) r2)     // Catch:{ IOException -> 0x024a, RuntimeException -> 0x0242, Error -> 0x023a, all -> 0x0231 }
            com.amazonaws.util.AWSRequestMetrics$Field r1 = com.amazonaws.util.AWSRequestMetrics.Field.RedirectLocation     // Catch:{ IOException -> 0x024a, RuntimeException -> 0x0242, Error -> 0x023a, all -> 0x0231 }
            r10.addProperty((com.amazonaws.metrics.MetricType) r1, (java.lang.Object) r0)     // Catch:{ IOException -> 0x024a, RuntimeException -> 0x0242, Error -> 0x023a, all -> 0x0231 }
            com.amazonaws.util.AWSRequestMetrics$Field r0 = com.amazonaws.util.AWSRequestMetrics.Field.AWSRequestID     // Catch:{ IOException -> 0x024a, RuntimeException -> 0x0242, Error -> 0x023a, all -> 0x0231 }
            r1 = 0
            r10.addProperty((com.amazonaws.metrics.MetricType) r0, (java.lang.Object) r1)     // Catch:{ IOException -> 0x024a, RuntimeException -> 0x0242, Error -> 0x023a, all -> 0x0231 }
            r24 = r5
            r25 = r6
            r1 = r20
            r9 = r23
            r2 = 0
            r23 = r11
            r11 = r4
            goto L_0x02bb
        L_0x0231:
            r0 = move-exception
            r2 = r0
            r6 = r4
            r1 = r20
            r9 = r23
            goto L_0x0438
        L_0x023a:
            r0 = move-exception
            r6 = r4
            r1 = r20
            r9 = r23
            goto L_0x0384
        L_0x0242:
            r0 = move-exception
            r6 = r4
            r1 = r20
            r9 = r23
            goto L_0x0391
        L_0x024a:
            r0 = move-exception
            r19 = r4
            r17 = r5
            r25 = r6
            r9 = r23
            goto L_0x00ef
        L_0x0255:
            r0 = move-exception
            goto L_0x01cd
        L_0x0258:
            r23 = r3
            boolean r17 = r29.needsConnectionLeftOpen()     // Catch:{ IOException -> 0x0321, RuntimeException -> 0x031c, Error -> 0x0317, all -> 0x0312 }
            r3 = r29
            com.amazonaws.AmazonServiceException r0 = r7.handleErrorResponse(r8, r3, r4)     // Catch:{ IOException -> 0x0302, RuntimeException -> 0x02f9, Error -> 0x02f0, all -> 0x02e6 }
            com.amazonaws.util.AWSRequestMetrics$Field r1 = com.amazonaws.util.AWSRequestMetrics.Field.AWSRequestID     // Catch:{ IOException -> 0x0302, RuntimeException -> 0x02f9, Error -> 0x02f0, all -> 0x02e6 }
            java.lang.String r2 = r0.getRequestId()     // Catch:{ IOException -> 0x0302, RuntimeException -> 0x02f9, Error -> 0x02f0, all -> 0x02e6 }
            r10.addProperty((com.amazonaws.metrics.MetricType) r1, (java.lang.Object) r2)     // Catch:{ IOException -> 0x0302, RuntimeException -> 0x02f9, Error -> 0x02f0, all -> 0x02e6 }
            com.amazonaws.util.AWSRequestMetrics$Field r1 = com.amazonaws.util.AWSRequestMetrics.Field.AWSErrorCode     // Catch:{ IOException -> 0x0302, RuntimeException -> 0x02f9, Error -> 0x02f0, all -> 0x02e6 }
            java.lang.String r2 = r0.getErrorCode()     // Catch:{ IOException -> 0x0302, RuntimeException -> 0x02f9, Error -> 0x02f0, all -> 0x02e6 }
            r10.addProperty((com.amazonaws.metrics.MetricType) r1, (java.lang.Object) r2)     // Catch:{ IOException -> 0x0302, RuntimeException -> 0x02f9, Error -> 0x02f0, all -> 0x02e6 }
            com.amazonaws.util.AWSRequestMetrics$Field r1 = com.amazonaws.util.AWSRequestMetrics.Field.StatusCode     // Catch:{ IOException -> 0x0302, RuntimeException -> 0x02f9, Error -> 0x02f0, all -> 0x02e6 }
            int r2 = r0.getStatusCode()     // Catch:{ IOException -> 0x0302, RuntimeException -> 0x02f9, Error -> 0x02f0, all -> 0x02e6 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ IOException -> 0x0302, RuntimeException -> 0x02f9, Error -> 0x02f0, all -> 0x02e6 }
            r10.addProperty((com.amazonaws.metrics.MetricType) r1, (java.lang.Object) r2)     // Catch:{ IOException -> 0x0302, RuntimeException -> 0x02f9, Error -> 0x02f0, all -> 0x02e6 }
            com.amazonaws.AmazonWebServiceRequest r2 = r27.getOriginalRequest()     // Catch:{ IOException -> 0x0302, RuntimeException -> 0x02f9, Error -> 0x02f0, all -> 0x02e6 }
            java.io.InputStream r19 = r5.getContent()     // Catch:{ IOException -> 0x0302, RuntimeException -> 0x02f9, Error -> 0x02f0, all -> 0x02e6 }
            com.amazonaws.ClientConfiguration r1 = r7.config     // Catch:{ IOException -> 0x0302, RuntimeException -> 0x02f9, Error -> 0x02f0, all -> 0x02e6 }
            com.amazonaws.retry.RetryPolicy r20 = r1.getRetryPolicy()     // Catch:{ IOException -> 0x0302, RuntimeException -> 0x02f9, Error -> 0x02f0, all -> 0x02e6 }
            r1 = r26
            r9 = r23
            r3 = r19
            r23 = r11
            r11 = r4
            r4 = r0
            r24 = r5
            r5 = r6
            r25 = r6
            r6 = r20
            boolean r1 = r1.shouldRetry(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x02e4, RuntimeException -> 0x02e2, Error -> 0x02e0, all -> 0x02de }
            if (r1 == 0) goto L_0x02dd
            boolean r1 = com.amazonaws.retry.RetryUtils.isClockSkewError(r0)     // Catch:{ IOException -> 0x02e4, RuntimeException -> 0x02e2, Error -> 0x02e0, all -> 0x02de }
            if (r1 == 0) goto L_0x02b5
            long r1 = r7.parseClockSkewOffset(r11, r0)     // Catch:{ IOException -> 0x02e4, RuntimeException -> 0x02e2, Error -> 0x02e0, all -> 0x02de }
            com.amazonaws.SDKGlobalConfiguration.setGlobalTimeOffset((long) r1)     // Catch:{ IOException -> 0x02e4, RuntimeException -> 0x02e2, Error -> 0x02e0, all -> 0x02de }
        L_0x02b5:
            r7.resetRequestAfterError(r8, r0)     // Catch:{ IOException -> 0x02e4, RuntimeException -> 0x02e2, Error -> 0x02e0, all -> 0x02de }
            r2 = r0
            r1 = r17
        L_0x02bb:
            if (r1 != 0) goto L_0x02d3
            if (r11 == 0) goto L_0x02d3
            java.io.InputStream r0 = r11.getRawContent()     // Catch:{ IOException -> 0x02cd }
            if (r0 == 0) goto L_0x02d3
            java.io.InputStream r0 = r11.getRawContent()     // Catch:{ IOException -> 0x02cd }
            r0.close()     // Catch:{ IOException -> 0x02cd }
            goto L_0x02d3
        L_0x02cd:
            r0 = move-exception
            com.amazonaws.logging.Log r3 = log
            r3.warn(r9, r0)
        L_0x02d3:
            r4 = r2
            r6 = r11
            r5 = r15
            r2 = r21
            r17 = r24
            r11 = 0
            goto L_0x042c
        L_0x02dd:
            throw r0     // Catch:{ IOException -> 0x02e4, RuntimeException -> 0x02e2, Error -> 0x02e0, all -> 0x02de }
        L_0x02de:
            r0 = move-exception
            goto L_0x02ea
        L_0x02e0:
            r0 = move-exception
            goto L_0x02f4
        L_0x02e2:
            r0 = move-exception
            goto L_0x02fd
        L_0x02e4:
            r0 = move-exception
            goto L_0x030c
        L_0x02e6:
            r0 = move-exception
            r11 = r4
            r9 = r23
        L_0x02ea:
            r2 = r0
            r6 = r11
            r1 = r17
            goto L_0x0438
        L_0x02f0:
            r0 = move-exception
            r11 = r4
            r9 = r23
        L_0x02f4:
            r6 = r11
            r1 = r17
            goto L_0x0384
        L_0x02f9:
            r0 = move-exception
            r11 = r4
            r9 = r23
        L_0x02fd:
            r6 = r11
            r1 = r17
            goto L_0x0391
        L_0x0302:
            r0 = move-exception
            r24 = r5
            r25 = r6
            r9 = r23
            r23 = r11
            r11 = r4
        L_0x030c:
            r19 = r11
            r20 = r17
            goto L_0x036c
        L_0x0312:
            r0 = move-exception
            r11 = r4
            r9 = r23
            goto L_0x032e
        L_0x0317:
            r0 = move-exception
            r11 = r4
            r9 = r23
            goto L_0x0335
        L_0x031c:
            r0 = move-exception
            r11 = r4
            r9 = r23
            goto L_0x033b
        L_0x0321:
            r0 = move-exception
            r24 = r5
            r25 = r6
            r9 = r23
            goto L_0x0346
        L_0x0329:
            r0 = move-exception
            goto L_0x0341
        L_0x032b:
            r0 = move-exception
            r9 = r3
            r11 = r4
        L_0x032e:
            r2 = r0
            r6 = r11
            goto L_0x037a
        L_0x0332:
            r0 = move-exception
            r9 = r3
            r11 = r4
        L_0x0335:
            r6 = r11
            goto L_0x0382
        L_0x0338:
            r0 = move-exception
            r9 = r3
            r11 = r4
        L_0x033b:
            r6 = r11
            goto L_0x038f
        L_0x033e:
            r0 = move-exception
            r21 = r1
        L_0x0341:
            r9 = r3
            r24 = r5
            r25 = r6
        L_0x0346:
            r23 = r11
            r11 = r4
            r19 = r11
            goto L_0x036c
        L_0x034c:
            r0 = move-exception
            r21 = r1
            r9 = r3
            r24 = r5
            r25 = r6
            r23 = r11
            com.amazonaws.util.AWSRequestMetrics$Field r1 = com.amazonaws.util.AWSRequestMetrics.Field.HttpRequestTime     // Catch:{ IOException -> 0x0360, RuntimeException -> 0x035e, Error -> 0x035c }
            r10.endEvent((com.amazonaws.metrics.MetricType) r1)     // Catch:{ IOException -> 0x0360, RuntimeException -> 0x035e, Error -> 0x035c }
            throw r0     // Catch:{ IOException -> 0x0360, RuntimeException -> 0x035e, Error -> 0x035c }
        L_0x035c:
            r0 = move-exception
            goto L_0x0380
        L_0x035e:
            r0 = move-exception
            goto L_0x038d
        L_0x0360:
            r0 = move-exception
            goto L_0x036c
        L_0x0362:
            r0 = move-exception
            r21 = r1
            r9 = r3
            r24 = r5
            r25 = r6
            r23 = r11
        L_0x036c:
            r17 = r24
            goto L_0x03a5
        L_0x036f:
            r0 = move-exception
            r21 = r1
            r9 = r3
            goto L_0x00ed
        L_0x0375:
            r0 = move-exception
            r9 = r3
        L_0x0377:
            r2 = r0
        L_0x0378:
            r6 = r19
        L_0x037a:
            r1 = r20
            goto L_0x0438
        L_0x037e:
            r0 = move-exception
            r9 = r3
        L_0x0380:
            r6 = r19
        L_0x0382:
            r1 = r20
        L_0x0384:
            java.lang.Throwable r0 = r7.handleUnexpectedFailure(r0, r10)     // Catch:{ all -> 0x0398 }
            java.lang.Error r0 = (java.lang.Error) r0     // Catch:{ all -> 0x0398 }
            throw r0     // Catch:{ all -> 0x0398 }
        L_0x038b:
            r0 = move-exception
            r9 = r3
        L_0x038d:
            r6 = r19
        L_0x038f:
            r1 = r20
        L_0x0391:
            java.lang.Throwable r0 = r7.handleUnexpectedFailure(r0, r10)     // Catch:{ all -> 0x0398 }
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch:{ all -> 0x0398 }
            throw r0     // Catch:{ all -> 0x0398 }
        L_0x0398:
            r0 = move-exception
            r2 = r0
            goto L_0x0438
        L_0x039c:
            r0 = move-exception
            r21 = r1
            r9 = r3
            r25 = r6
            r23 = r11
            r15 = r5
        L_0x03a5:
            com.amazonaws.logging.Log r1 = log     // Catch:{ all -> 0x0435 }
            boolean r2 = r1.isDebugEnabled()     // Catch:{ all -> 0x0435 }
            java.lang.String r3 = "Unable to execute HTTP request: "
            if (r2 == 0) goto L_0x03c5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0435 }
            r2.<init>()     // Catch:{ all -> 0x0435 }
            r2.append(r3)     // Catch:{ all -> 0x0435 }
            java.lang.String r4 = r0.getMessage()     // Catch:{ all -> 0x0435 }
            r2.append(r4)     // Catch:{ all -> 0x0435 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0435 }
            r1.debug(r2, r0)     // Catch:{ all -> 0x0435 }
        L_0x03c5:
            com.amazonaws.util.AWSRequestMetrics$Field r1 = com.amazonaws.util.AWSRequestMetrics.Field.Exception     // Catch:{ all -> 0x0435 }
            r10.incrementCounter((com.amazonaws.metrics.MetricType) r1)     // Catch:{ all -> 0x0435 }
            r10.addProperty((com.amazonaws.metrics.MetricType) r1, (java.lang.Object) r0)     // Catch:{ all -> 0x0435 }
            com.amazonaws.util.AWSRequestMetrics$Field r1 = com.amazonaws.util.AWSRequestMetrics.Field.AWSRequestID     // Catch:{ all -> 0x0435 }
            r11 = 0
            r10.addProperty((com.amazonaws.metrics.MetricType) r1, (java.lang.Object) r11)     // Catch:{ all -> 0x0435 }
            com.amazonaws.AmazonClientException r6 = new com.amazonaws.AmazonClientException     // Catch:{ all -> 0x0435 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0435 }
            r1.<init>()     // Catch:{ all -> 0x0435 }
            r1.append(r3)     // Catch:{ all -> 0x0435 }
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x0435 }
            r1.append(r2)     // Catch:{ all -> 0x0435 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0435 }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x0435 }
            com.amazonaws.AmazonWebServiceRequest r2 = r27.getOriginalRequest()     // Catch:{ all -> 0x0435 }
            java.io.InputStream r3 = r17.getContent()     // Catch:{ all -> 0x0435 }
            com.amazonaws.ClientConfiguration r1 = r7.config     // Catch:{ all -> 0x0435 }
            com.amazonaws.retry.RetryPolicy r18 = r1.getRetryPolicy()     // Catch:{ all -> 0x0435 }
            r1 = r26
            r4 = r6
            r5 = r25
            r24 = r6
            r6 = r18
            boolean r1 = r1.shouldRetry(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0435 }
            if (r1 == 0) goto L_0x0434
            r7.resetRequestAfterError(r8, r0)     // Catch:{ all -> 0x0435 }
            if (r20 != 0) goto L_0x0423
            if (r19 == 0) goto L_0x0423
            java.io.InputStream r0 = r19.getRawContent()     // Catch:{ IOException -> 0x041d }
            if (r0 == 0) goto L_0x0423
            java.io.InputStream r0 = r19.getRawContent()     // Catch:{ IOException -> 0x041d }
            r0.close()     // Catch:{ IOException -> 0x041d }
            goto L_0x0423
        L_0x041d:
            r0 = move-exception
            com.amazonaws.logging.Log r1 = log
            r1.warn(r9, r0)
        L_0x0423:
            r5 = r15
            r6 = r19
            r1 = r20
            r2 = r21
            r4 = r24
        L_0x042c:
            r9 = r30
            r11 = r23
            r0 = r25
            goto L_0x005e
        L_0x0434:
            throw r24     // Catch:{ all -> 0x0435 }
        L_0x0435:
            r0 = move-exception
            goto L_0x0377
        L_0x0438:
            if (r1 != 0) goto L_0x0450
            if (r6 == 0) goto L_0x0450
            java.io.InputStream r0 = r6.getRawContent()     // Catch:{ IOException -> 0x044a }
            if (r0 == 0) goto L_0x0450
            java.io.InputStream r0 = r6.getRawContent()     // Catch:{ IOException -> 0x044a }
            r0.close()     // Catch:{ IOException -> 0x044a }
            goto L_0x0450
        L_0x044a:
            r0 = move-exception
            com.amazonaws.logging.Log r1 = log
            r1.warn(r9, r0)
        L_0x0450:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.http.AmazonHttpClient.executeHelper(com.amazonaws.Request, com.amazonaws.http.HttpResponseHandler, com.amazonaws.http.HttpResponseHandler, com.amazonaws.http.ExecutionContext):com.amazonaws.Response");
    }

    public void finalize() throws Throwable {
        shutdown();
        super.finalize();
    }

    public RequestMetricCollector getRequestMetricCollector() {
        return this.requestMetricCollector;
    }

    @Deprecated
    public ResponseMetadata getResponseMetadataForRequest(AmazonWebServiceRequest amazonWebServiceRequest) {
        return null;
    }

    public AmazonServiceException handleErrorResponse(Request<?> request, HttpResponseHandler<AmazonServiceException> httpResponseHandler, HttpResponse httpResponse) throws IOException {
        AmazonServiceException amazonServiceException;
        int statusCode = httpResponse.getStatusCode();
        try {
            amazonServiceException = httpResponseHandler.handle(httpResponse);
            Log log2 = REQUEST_LOG;
            log2.debug("Received error response: " + amazonServiceException.toString());
        } catch (Exception e) {
            if (statusCode == 413) {
                amazonServiceException = new AmazonServiceException("Request entity too large");
                amazonServiceException.setServiceName(request.getServiceName());
                amazonServiceException.setStatusCode(413);
                amazonServiceException.setErrorType(AmazonServiceException.ErrorType.Client);
                amazonServiceException.setErrorCode("Request entity too large");
            } else if (statusCode == HTTP_STATUS_SERVICE_UNAVAILABLE && "Service Unavailable".equalsIgnoreCase(httpResponse.getStatusText())) {
                amazonServiceException = new AmazonServiceException("Service unavailable");
                amazonServiceException.setServiceName(request.getServiceName());
                amazonServiceException.setStatusCode(HTTP_STATUS_SERVICE_UNAVAILABLE);
                amazonServiceException.setErrorType(AmazonServiceException.ErrorType.Service);
                amazonServiceException.setErrorCode("Service unavailable");
            } else if (e instanceof IOException) {
                throw ((IOException) e);
            } else {
                StringBuilder k = C13555b.m33972k("Unable to unmarshall error response (");
                k.append(e.getMessage());
                k.append("). Response Code: ");
                k.append(statusCode);
                k.append(", Response Text: ");
                k.append(httpResponse.getStatusText());
                k.append(", Response Headers: ");
                k.append(httpResponse.getHeaders());
                throw new AmazonClientException(k.toString(), e);
            }
        }
        amazonServiceException.setStatusCode(statusCode);
        amazonServiceException.setServiceName(request.getServiceName());
        amazonServiceException.fillInStackTrace();
        return amazonServiceException;
    }

    public <T> T handleResponse(Request<?> request, HttpResponseHandler<AmazonWebServiceResponse<T>> httpResponseHandler, HttpResponse httpResponse, ExecutionContext executionContext) throws IOException {
        AWSRequestMetrics awsRequestMetrics;
        try {
            awsRequestMetrics = executionContext.getAwsRequestMetrics();
            AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ResponseProcessingTime;
            awsRequestMetrics.startEvent((MetricType) field);
            AmazonWebServiceResponse handle = httpResponseHandler.handle(httpResponse);
            awsRequestMetrics.endEvent((MetricType) field);
            if (handle != null) {
                Log log2 = REQUEST_LOG;
                if (log2.isDebugEnabled()) {
                    log2.debug("Received successful response: " + httpResponse.getStatusCode() + ", AWS Request ID: " + handle.getRequestId());
                }
                awsRequestMetrics.addProperty((MetricType) AWSRequestMetrics.Field.AWSRequestID, (Object) handle.getRequestId());
                return handle.getResult();
            }
            throw new RuntimeException("Unable to unmarshall response metadata. Response Code: " + httpResponse.getStatusCode() + ", Response Text: " + httpResponse.getStatusText());
        } catch (CRC32MismatchException e) {
            throw e;
        } catch (IOException e2) {
            throw e2;
        } catch (Exception e3) {
            StringBuilder k = C13555b.m33972k("Unable to unmarshall response (");
            k.append(e3.getMessage());
            k.append("). Response Code: ");
            k.append(httpResponse.getStatusCode());
            k.append(", Response Text: ");
            k.append(httpResponse.getStatusText());
            throw new AmazonClientException(k.toString(), e3);
        } catch (Throwable th) {
            awsRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.ResponseProcessingTime);
            throw th;
        }
    }

    public long parseClockSkewOffset(HttpResponse httpResponse, AmazonServiceException amazonServiceException) {
        Date date;
        Date date2 = new Date();
        String str = httpResponse.getHeaders().get(HttpHeader.DATE);
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    try {
                        date = DateUtils.parseRFC822Date(str);
                        return (date2.getTime() - date.getTime()) / TIME_MILLISEC;
                    } catch (RuntimeException e) {
                        e = e;
                        log.warn("Unable to parse clock skew offset from response: " + str, e);
                        return 0;
                    }
                }
            } catch (RuntimeException e2) {
                e = e2;
                str = null;
                log.warn("Unable to parse clock skew offset from response: " + str, e);
                return 0;
            }
        }
        str = getServerDateFromException(amazonServiceException.getMessage());
        date = DateUtils.parseCompressedISO8601Date(str);
        return (date2.getTime() - date.getTime()) / TIME_MILLISEC;
    }

    public List<RequestHandler2> requestHandler2s(Request<?> request, ExecutionContext executionContext) {
        List<RequestHandler2> requestHandler2s = executionContext.getRequestHandler2s();
        if (requestHandler2s == null) {
            return Collections.emptyList();
        }
        for (RequestHandler2 next : requestHandler2s) {
            if (next instanceof CredentialsRequestHandler) {
                ((CredentialsRequestHandler) next).setCredentials(executionContext.getCredentials());
            }
            next.beforeRequest(request);
        }
        return requestHandler2s;
    }

    public void resetRequestAfterError(Request<?> request, Exception exc) {
        if (request.getContent() != null) {
            if (request.getContent().markSupported()) {
                try {
                    request.getContent().reset();
                } catch (IOException unused) {
                    throw new AmazonClientException("Encountered an exception and couldn't reset the stream to retry", exc);
                }
            } else {
                throw new AmazonClientException("Encountered an exception and stream is not resettable", exc);
            }
        }
    }

    public void setUserAgent(Request<?> request) {
        String str;
        RequestClientOptions requestClientOptions;
        String clientMarker;
        String str2 = ClientConfiguration.DEFAULT_USER_AGENT;
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest == null || (requestClientOptions = originalRequest.getRequestClientOptions()) == null || (clientMarker = requestClientOptions.getClientMarker(RequestClientOptions.Marker.USER_AGENT)) == null) {
            str = str2;
        } else {
            str = createUserAgentString(str2, clientMarker);
        }
        if (!str2.equals(this.config.getUserAgent())) {
            str = createUserAgentString(str, this.config.getUserAgent());
        }
        if (this.config.getUserAgentOverride() != null) {
            str = this.config.getUserAgentOverride();
        }
        request.addHeader("User-Agent", str);
    }

    public void shutdown() {
        this.httpClient.shutdown();
    }

    @Deprecated
    public AmazonHttpClient(ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector2) {
        this(clientConfiguration, new UrlHttpClient(clientConfiguration), requestMetricCollector2);
    }

    public AmazonHttpClient(ClientConfiguration clientConfiguration, HttpClient httpClient2) {
        this.requestFactory = new HttpRequestFactory();
        this.config = clientConfiguration;
        this.httpClient = httpClient2;
        this.requestMetricCollector = null;
    }

    @Deprecated
    public AmazonHttpClient(ClientConfiguration clientConfiguration, HttpClient httpClient2, RequestMetricCollector requestMetricCollector2) {
        this.requestFactory = new HttpRequestFactory();
        this.config = clientConfiguration;
        this.httpClient = httpClient2;
        this.requestMetricCollector = requestMetricCollector2;
    }
}
