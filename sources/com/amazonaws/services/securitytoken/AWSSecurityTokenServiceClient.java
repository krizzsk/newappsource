package com.amazonaws.services.securitytoken;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.http.DefaultErrorResponseHandler;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpClient;
import com.amazonaws.http.StaxResponseHandler;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.regions.ServiceAbbreviations;
import com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest;
import com.amazonaws.services.securitytoken.model.GetCallerIdentityResult;
import com.amazonaws.services.securitytoken.model.GetSessionTokenRequest;
import com.amazonaws.services.securitytoken.model.GetSessionTokenResult;
import com.amazonaws.services.securitytoken.model.transform.ExpiredTokenExceptionUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.IDPCommunicationErrorExceptionUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.IDPRejectedClaimExceptionUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.InvalidAuthorizationMessageExceptionUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.InvalidIdentityTokenExceptionUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.MalformedPolicyDocumentExceptionUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.PackedPolicyTooLargeExceptionUnmarshaller;
import com.amazonaws.services.securitytoken.model.transform.RegionDisabledExceptionUnmarshaller;
import com.amazonaws.transform.StandardErrorUnmarshaller;
import com.amazonaws.transform.StaxUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;

public class AWSSecurityTokenServiceClient extends AmazonWebServiceClient implements AWSSecurityTokenService {
    private AWSCredentialsProvider awsCredentialsProvider;
    public final List<Unmarshaller<AmazonServiceException, Node>> exceptionUnmarshallers;

    @Deprecated
    public AWSSecurityTokenServiceClient() {
        this((AWSCredentialsProvider) new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration clientConfiguration) {
        return clientConfiguration;
    }

    private void init() {
        this.exceptionUnmarshallers.add(new ExpiredTokenExceptionUnmarshaller());
        this.exceptionUnmarshallers.add(new IDPCommunicationErrorExceptionUnmarshaller());
        this.exceptionUnmarshallers.add(new IDPRejectedClaimExceptionUnmarshaller());
        this.exceptionUnmarshallers.add(new InvalidAuthorizationMessageExceptionUnmarshaller());
        this.exceptionUnmarshallers.add(new InvalidIdentityTokenExceptionUnmarshaller());
        this.exceptionUnmarshallers.add(new MalformedPolicyDocumentExceptionUnmarshaller());
        this.exceptionUnmarshallers.add(new PackedPolicyTooLargeExceptionUnmarshaller());
        this.exceptionUnmarshallers.add(new RegionDisabledExceptionUnmarshaller());
        this.exceptionUnmarshallers.add(new StandardErrorUnmarshaller());
        setEndpoint("sts.amazonaws.com");
        this.endpointPrefix = ServiceAbbreviations.STS;
        HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
        this.requestHandler2s.addAll(handlerChainFactory.newRequestHandlerChain("/com/amazonaws/services/securitytoken/request.handlers"));
        this.requestHandler2s.addAll(handlerChainFactory.newRequestHandler2Chain("/com/amazonaws/services/securitytoken/request.handler2s"));
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, Unmarshaller<X, StaxUnmarshallerContext> unmarshaller, ExecutionContext executionContext) {
        request.setEndpoint(this.endpoint);
        request.setTimeOffset(this.timeOffset);
        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        AWSCredentials credentials = this.awsCredentialsProvider.getCredentials();
        if (originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }
        executionContext.setCredentials(credentials);
        return this.client.execute(request, new StaxResponseHandler(unmarshaller), new DefaultErrorResponseHandler(this.exceptionUnmarshallers), executionContext);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.securitytoken.model.AssumeRoleResult assumeRole(com.amazonaws.services.securitytoken.model.AssumeRoleRequest r7) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r6 = this;
            com.amazonaws.http.ExecutionContext r0 = r6.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r7)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 0
            com.amazonaws.services.securitytoken.model.transform.AssumeRoleRequestMarshaller r4 = new com.amazonaws.services.securitytoken.model.transform.AssumeRoleRequestMarshaller     // Catch:{ all -> 0x0035 }
            r4.<init>()     // Catch:{ all -> 0x0035 }
            com.amazonaws.Request r7 = r4.marshall((com.amazonaws.services.securitytoken.model.AssumeRoleRequest) r7)     // Catch:{ all -> 0x0035 }
            r7.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x0030 }
            com.amazonaws.services.securitytoken.model.transform.AssumeRoleResultStaxUnmarshaller r4 = new com.amazonaws.services.securitytoken.model.transform.AssumeRoleResultStaxUnmarshaller     // Catch:{ all -> 0x0030 }
            r4.<init>()     // Catch:{ all -> 0x0030 }
            com.amazonaws.Response r3 = r6.invoke(r7, r4, r0)     // Catch:{ all -> 0x0030 }
            java.lang.Object r0 = r3.getAwsResponse()     // Catch:{ all -> 0x0030 }
            com.amazonaws.services.securitytoken.model.AssumeRoleResult r0 = (com.amazonaws.services.securitytoken.model.AssumeRoleResult) r0     // Catch:{ all -> 0x0030 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r6.endClientExecution(r1, r7, r3)
            return r0
        L_0x0030:
            r0 = move-exception
            r5 = r3
            r3 = r7
            r7 = r5
            goto L_0x0037
        L_0x0035:
            r0 = move-exception
            r7 = r3
        L_0x0037:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r6.endClientExecution(r1, r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient.assumeRole(com.amazonaws.services.securitytoken.model.AssumeRoleRequest):com.amazonaws.services.securitytoken.model.AssumeRoleResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLResult assumeRoleWithSAML(com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest r7) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r6 = this;
            com.amazonaws.http.ExecutionContext r0 = r6.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r7)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 0
            com.amazonaws.services.securitytoken.model.transform.AssumeRoleWithSAMLRequestMarshaller r4 = new com.amazonaws.services.securitytoken.model.transform.AssumeRoleWithSAMLRequestMarshaller     // Catch:{ all -> 0x0035 }
            r4.<init>()     // Catch:{ all -> 0x0035 }
            com.amazonaws.Request r7 = r4.marshall((com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest) r7)     // Catch:{ all -> 0x0035 }
            r7.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x0030 }
            com.amazonaws.services.securitytoken.model.transform.AssumeRoleWithSAMLResultStaxUnmarshaller r4 = new com.amazonaws.services.securitytoken.model.transform.AssumeRoleWithSAMLResultStaxUnmarshaller     // Catch:{ all -> 0x0030 }
            r4.<init>()     // Catch:{ all -> 0x0030 }
            com.amazonaws.Response r3 = r6.invoke(r7, r4, r0)     // Catch:{ all -> 0x0030 }
            java.lang.Object r0 = r3.getAwsResponse()     // Catch:{ all -> 0x0030 }
            com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLResult r0 = (com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLResult) r0     // Catch:{ all -> 0x0030 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r6.endClientExecution(r1, r7, r3)
            return r0
        L_0x0030:
            r0 = move-exception
            r5 = r3
            r3 = r7
            r7 = r5
            goto L_0x0037
        L_0x0035:
            r0 = move-exception
            r7 = r3
        L_0x0037:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r6.endClientExecution(r1, r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient.assumeRoleWithSAML(com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest):com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult assumeRoleWithWebIdentity(com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest r7) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r6 = this;
            com.amazonaws.http.ExecutionContext r0 = r6.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r7)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 0
            com.amazonaws.services.securitytoken.model.transform.AssumeRoleWithWebIdentityRequestMarshaller r4 = new com.amazonaws.services.securitytoken.model.transform.AssumeRoleWithWebIdentityRequestMarshaller     // Catch:{ all -> 0x0035 }
            r4.<init>()     // Catch:{ all -> 0x0035 }
            com.amazonaws.Request r7 = r4.marshall((com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest) r7)     // Catch:{ all -> 0x0035 }
            r7.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x0030 }
            com.amazonaws.services.securitytoken.model.transform.AssumeRoleWithWebIdentityResultStaxUnmarshaller r4 = new com.amazonaws.services.securitytoken.model.transform.AssumeRoleWithWebIdentityResultStaxUnmarshaller     // Catch:{ all -> 0x0030 }
            r4.<init>()     // Catch:{ all -> 0x0030 }
            com.amazonaws.Response r3 = r6.invoke(r7, r4, r0)     // Catch:{ all -> 0x0030 }
            java.lang.Object r0 = r3.getAwsResponse()     // Catch:{ all -> 0x0030 }
            com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult r0 = (com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult) r0     // Catch:{ all -> 0x0030 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r6.endClientExecution(r1, r7, r3)
            return r0
        L_0x0030:
            r0 = move-exception
            r5 = r3
            r3 = r7
            r7 = r5
            goto L_0x0037
        L_0x0035:
            r0 = move-exception
            r7 = r3
        L_0x0037:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r6.endClientExecution(r1, r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient.assumeRoleWithWebIdentity(com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest):com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageResult decodeAuthorizationMessage(com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest r7) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r6 = this;
            com.amazonaws.http.ExecutionContext r0 = r6.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r7)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 0
            com.amazonaws.services.securitytoken.model.transform.DecodeAuthorizationMessageRequestMarshaller r4 = new com.amazonaws.services.securitytoken.model.transform.DecodeAuthorizationMessageRequestMarshaller     // Catch:{ all -> 0x0035 }
            r4.<init>()     // Catch:{ all -> 0x0035 }
            com.amazonaws.Request r7 = r4.marshall((com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest) r7)     // Catch:{ all -> 0x0035 }
            r7.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x0030 }
            com.amazonaws.services.securitytoken.model.transform.DecodeAuthorizationMessageResultStaxUnmarshaller r4 = new com.amazonaws.services.securitytoken.model.transform.DecodeAuthorizationMessageResultStaxUnmarshaller     // Catch:{ all -> 0x0030 }
            r4.<init>()     // Catch:{ all -> 0x0030 }
            com.amazonaws.Response r3 = r6.invoke(r7, r4, r0)     // Catch:{ all -> 0x0030 }
            java.lang.Object r0 = r3.getAwsResponse()     // Catch:{ all -> 0x0030 }
            com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageResult r0 = (com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageResult) r0     // Catch:{ all -> 0x0030 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r6.endClientExecution(r1, r7, r3)
            return r0
        L_0x0030:
            r0 = move-exception
            r5 = r3
            r3 = r7
            r7 = r5
            goto L_0x0037
        L_0x0035:
            r0 = move-exception
            r7 = r3
        L_0x0037:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r6.endClientExecution(r1, r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient.decodeAuthorizationMessage(com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest):com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.securitytoken.model.GetAccessKeyInfoResult getAccessKeyInfo(com.amazonaws.services.securitytoken.model.GetAccessKeyInfoRequest r7) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r6 = this;
            com.amazonaws.http.ExecutionContext r0 = r6.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r7)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 0
            com.amazonaws.services.securitytoken.model.transform.GetAccessKeyInfoRequestMarshaller r4 = new com.amazonaws.services.securitytoken.model.transform.GetAccessKeyInfoRequestMarshaller     // Catch:{ all -> 0x0035 }
            r4.<init>()     // Catch:{ all -> 0x0035 }
            com.amazonaws.Request r7 = r4.marshall((com.amazonaws.services.securitytoken.model.GetAccessKeyInfoRequest) r7)     // Catch:{ all -> 0x0035 }
            r7.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x0030 }
            com.amazonaws.services.securitytoken.model.transform.GetAccessKeyInfoResultStaxUnmarshaller r4 = new com.amazonaws.services.securitytoken.model.transform.GetAccessKeyInfoResultStaxUnmarshaller     // Catch:{ all -> 0x0030 }
            r4.<init>()     // Catch:{ all -> 0x0030 }
            com.amazonaws.Response r3 = r6.invoke(r7, r4, r0)     // Catch:{ all -> 0x0030 }
            java.lang.Object r0 = r3.getAwsResponse()     // Catch:{ all -> 0x0030 }
            com.amazonaws.services.securitytoken.model.GetAccessKeyInfoResult r0 = (com.amazonaws.services.securitytoken.model.GetAccessKeyInfoResult) r0     // Catch:{ all -> 0x0030 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r6.endClientExecution(r1, r7, r3)
            return r0
        L_0x0030:
            r0 = move-exception
            r5 = r3
            r3 = r7
            r7 = r5
            goto L_0x0037
        L_0x0035:
            r0 = move-exception
            r7 = r3
        L_0x0037:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r6.endClientExecution(r1, r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient.getAccessKeyInfo(com.amazonaws.services.securitytoken.model.GetAccessKeyInfoRequest):com.amazonaws.services.securitytoken.model.GetAccessKeyInfoResult");
    }

    @Deprecated
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest amazonWebServiceRequest) {
        return this.client.getResponseMetadataForRequest(amazonWebServiceRequest);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.securitytoken.model.GetCallerIdentityResult getCallerIdentity(com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest r7) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r6 = this;
            com.amazonaws.http.ExecutionContext r0 = r6.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r7)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 0
            com.amazonaws.services.securitytoken.model.transform.GetCallerIdentityRequestMarshaller r4 = new com.amazonaws.services.securitytoken.model.transform.GetCallerIdentityRequestMarshaller     // Catch:{ all -> 0x0035 }
            r4.<init>()     // Catch:{ all -> 0x0035 }
            com.amazonaws.Request r7 = r4.marshall((com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest) r7)     // Catch:{ all -> 0x0035 }
            r7.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x0030 }
            com.amazonaws.services.securitytoken.model.transform.GetCallerIdentityResultStaxUnmarshaller r4 = new com.amazonaws.services.securitytoken.model.transform.GetCallerIdentityResultStaxUnmarshaller     // Catch:{ all -> 0x0030 }
            r4.<init>()     // Catch:{ all -> 0x0030 }
            com.amazonaws.Response r3 = r6.invoke(r7, r4, r0)     // Catch:{ all -> 0x0030 }
            java.lang.Object r0 = r3.getAwsResponse()     // Catch:{ all -> 0x0030 }
            com.amazonaws.services.securitytoken.model.GetCallerIdentityResult r0 = (com.amazonaws.services.securitytoken.model.GetCallerIdentityResult) r0     // Catch:{ all -> 0x0030 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r6.endClientExecution(r1, r7, r3)
            return r0
        L_0x0030:
            r0 = move-exception
            r5 = r3
            r3 = r7
            r7 = r5
            goto L_0x0037
        L_0x0035:
            r0 = move-exception
            r7 = r3
        L_0x0037:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r6.endClientExecution(r1, r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient.getCallerIdentity(com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest):com.amazonaws.services.securitytoken.model.GetCallerIdentityResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.securitytoken.model.GetFederationTokenResult getFederationToken(com.amazonaws.services.securitytoken.model.GetFederationTokenRequest r7) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r6 = this;
            com.amazonaws.http.ExecutionContext r0 = r6.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r7)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 0
            com.amazonaws.services.securitytoken.model.transform.GetFederationTokenRequestMarshaller r4 = new com.amazonaws.services.securitytoken.model.transform.GetFederationTokenRequestMarshaller     // Catch:{ all -> 0x0035 }
            r4.<init>()     // Catch:{ all -> 0x0035 }
            com.amazonaws.Request r7 = r4.marshall((com.amazonaws.services.securitytoken.model.GetFederationTokenRequest) r7)     // Catch:{ all -> 0x0035 }
            r7.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x0030 }
            com.amazonaws.services.securitytoken.model.transform.GetFederationTokenResultStaxUnmarshaller r4 = new com.amazonaws.services.securitytoken.model.transform.GetFederationTokenResultStaxUnmarshaller     // Catch:{ all -> 0x0030 }
            r4.<init>()     // Catch:{ all -> 0x0030 }
            com.amazonaws.Response r3 = r6.invoke(r7, r4, r0)     // Catch:{ all -> 0x0030 }
            java.lang.Object r0 = r3.getAwsResponse()     // Catch:{ all -> 0x0030 }
            com.amazonaws.services.securitytoken.model.GetFederationTokenResult r0 = (com.amazonaws.services.securitytoken.model.GetFederationTokenResult) r0     // Catch:{ all -> 0x0030 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r6.endClientExecution(r1, r7, r3)
            return r0
        L_0x0030:
            r0 = move-exception
            r5 = r3
            r3 = r7
            r7 = r5
            goto L_0x0037
        L_0x0035:
            r0 = move-exception
            r7 = r3
        L_0x0037:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r6.endClientExecution(r1, r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient.getFederationToken(com.amazonaws.services.securitytoken.model.GetFederationTokenRequest):com.amazonaws.services.securitytoken.model.GetFederationTokenResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.securitytoken.model.GetSessionTokenResult getSessionToken(com.amazonaws.services.securitytoken.model.GetSessionTokenRequest r7) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r6 = this;
            com.amazonaws.http.ExecutionContext r0 = r6.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r7)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 0
            com.amazonaws.services.securitytoken.model.transform.GetSessionTokenRequestMarshaller r4 = new com.amazonaws.services.securitytoken.model.transform.GetSessionTokenRequestMarshaller     // Catch:{ all -> 0x0035 }
            r4.<init>()     // Catch:{ all -> 0x0035 }
            com.amazonaws.Request r7 = r4.marshall((com.amazonaws.services.securitytoken.model.GetSessionTokenRequest) r7)     // Catch:{ all -> 0x0035 }
            r7.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x0030 }
            com.amazonaws.services.securitytoken.model.transform.GetSessionTokenResultStaxUnmarshaller r4 = new com.amazonaws.services.securitytoken.model.transform.GetSessionTokenResultStaxUnmarshaller     // Catch:{ all -> 0x0030 }
            r4.<init>()     // Catch:{ all -> 0x0030 }
            com.amazonaws.Response r3 = r6.invoke(r7, r4, r0)     // Catch:{ all -> 0x0030 }
            java.lang.Object r0 = r3.getAwsResponse()     // Catch:{ all -> 0x0030 }
            com.amazonaws.services.securitytoken.model.GetSessionTokenResult r0 = (com.amazonaws.services.securitytoken.model.GetSessionTokenResult) r0     // Catch:{ all -> 0x0030 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r6.endClientExecution(r1, r7, r3)
            return r0
        L_0x0030:
            r0 = move-exception
            r5 = r3
            r3 = r7
            r7 = r5
            goto L_0x0037
        L_0x0035:
            r0 = move-exception
            r7 = r3
        L_0x0037:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r6.endClientExecution(r1, r3, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient.getSessionToken(com.amazonaws.services.securitytoken.model.GetSessionTokenRequest):com.amazonaws.services.securitytoken.model.GetSessionTokenResult");
    }

    @Deprecated
    public AWSSecurityTokenServiceClient(ClientConfiguration clientConfiguration) {
        this((AWSCredentialsProvider) new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    public AWSSecurityTokenServiceClient(AWSCredentials aWSCredentials) {
        this(aWSCredentials, new ClientConfiguration());
    }

    public AWSSecurityTokenServiceClient(AWSCredentials aWSCredentials, ClientConfiguration clientConfiguration) {
        this((AWSCredentialsProvider) new StaticCredentialsProvider(aWSCredentials), clientConfiguration);
    }

    public AWSSecurityTokenServiceClient(AWSCredentialsProvider aWSCredentialsProvider) {
        this(aWSCredentialsProvider, new ClientConfiguration());
    }

    public AWSSecurityTokenServiceClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(aWSCredentialsProvider, clientConfiguration, (HttpClient) new UrlHttpClient(clientConfiguration));
    }

    @Deprecated
    public AWSSecurityTokenServiceClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        this.exceptionUnmarshallers = new ArrayList();
        this.awsCredentialsProvider = aWSCredentialsProvider;
        init();
    }

    public AWSSecurityTokenServiceClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);
        this.exceptionUnmarshallers = new ArrayList();
        this.awsCredentialsProvider = aWSCredentialsProvider;
        init();
    }

    public GetCallerIdentityResult getCallerIdentity() throws AmazonServiceException, AmazonClientException {
        return getCallerIdentity(new GetCallerIdentityRequest());
    }

    public GetSessionTokenResult getSessionToken() throws AmazonServiceException, AmazonClientException {
        return getSessionToken(new GetSessionTokenRequest());
    }
}
