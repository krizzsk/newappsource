package com.amazonaws.services.cognitoidentity;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceClient;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.ClientConfiguration;
import com.amazonaws.Request;
import com.amazonaws.Response;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.handlers.HandlerChainFactory;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.http.HttpClient;
import com.amazonaws.http.HttpResponseHandler;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.http.JsonResponseHandler;
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.metrics.MetricType;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.services.cognitoidentity.model.DeleteIdentityPoolRequest;
import com.amazonaws.services.cognitoidentity.model.SetIdentityPoolRolesRequest;
import com.amazonaws.services.cognitoidentity.model.UnlinkDeveloperIdentityRequest;
import com.amazonaws.services.cognitoidentity.model.UnlinkIdentityRequest;
import com.amazonaws.services.cognitoidentity.model.transform.ConcurrentModificationExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.DeleteIdentityPoolRequestMarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.DeveloperUserAlreadyRegisteredExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.ExternalServiceExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.InternalErrorExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.InvalidIdentityPoolConfigurationExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.InvalidParameterExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.LimitExceededExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.NotAuthorizedExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.ResourceConflictExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.ResourceNotFoundExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.SetIdentityPoolRolesRequestMarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.TooManyRequestsExceptionUnmarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.UnlinkDeveloperIdentityRequestMarshaller;
import com.amazonaws.services.cognitoidentity.model.transform.UnlinkIdentityRequestMarshaller;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import java.util.ArrayList;
import java.util.List;

public class AmazonCognitoIdentityClient extends AmazonWebServiceClient implements AmazonCognitoIdentity {
    private AWSCredentialsProvider awsCredentialsProvider;
    public List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    @Deprecated
    public AmazonCognitoIdentityClient() {
        this((AWSCredentialsProvider) new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration clientConfiguration) {
        return clientConfiguration;
    }

    private void init() {
        ArrayList arrayList = new ArrayList();
        this.jsonErrorUnmarshallers = arrayList;
        arrayList.add(new ConcurrentModificationExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new DeveloperUserAlreadyRegisteredExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new ExternalServiceExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new InternalErrorExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new InvalidIdentityPoolConfigurationExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new InvalidParameterExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new NotAuthorizedExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new ResourceConflictExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new TooManyRequestsExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        setEndpoint("cognito-identity.us-east-1.amazonaws.com");
        this.endpointPrefix = "cognito-identity";
        HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
        this.requestHandler2s.addAll(handlerChainFactory.newRequestHandlerChain("/com/amazonaws/services/cognitoidentity/request.handlers"));
        this.requestHandler2s.addAll(handlerChainFactory.newRequestHandler2Chain("/com/amazonaws/services/cognitoidentity/request.handler2s"));
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(Request<Y> request, HttpResponseHandler<AmazonWebServiceResponse<X>> httpResponseHandler, ExecutionContext executionContext) {
        request.setEndpoint(this.endpoint);
        request.setTimeOffset(this.timeOffset);
        AWSRequestMetrics awsRequestMetrics = executionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.CredentialsRequestTime;
        awsRequestMetrics.startEvent((MetricType) field);
        try {
            AWSCredentials credentials = this.awsCredentialsProvider.getCredentials();
            awsRequestMetrics.endEvent((MetricType) field);
            AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
            if (!(originalRequest == null || originalRequest.getRequestCredentials() == null)) {
                credentials = originalRequest.getRequestCredentials();
            }
            executionContext.setCredentials(credentials);
            return this.client.execute(request, httpResponseHandler, new JsonErrorResponseHandler(this.jsonErrorUnmarshallers), executionContext);
        } catch (Throwable th) {
            awsRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.CredentialsRequestTime);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolResult createIdentityPool(com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.CreateIdentityPoolRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.CreateIdentityPoolRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.CreateIdentityPoolResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.CreateIdentityPoolResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolResult r0 = (com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.createIdentityPool(com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolRequest):com.amazonaws.services.cognitoidentity.model.CreateIdentityPoolResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesResult deleteIdentities(com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.DeleteIdentitiesRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.DeleteIdentitiesRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.DeleteIdentitiesResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.DeleteIdentitiesResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesResult r0 = (com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.deleteIdentities(com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesRequest):com.amazonaws.services.cognitoidentity.model.DeleteIdentitiesResult");
    }

    public void deleteIdentityPool(DeleteIdentityPoolRequest deleteIdentityPoolRequest) throws AmazonServiceException, AmazonClientException {
        Request<DeleteIdentityPoolRequest> request;
        ExecutionContext createExecutionContext = createExecutionContext((AmazonWebServiceRequest) deleteIdentityPoolRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent((MetricType) field);
        try {
            AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
            awsRequestMetrics.startEvent((MetricType) field2);
            try {
                request = new DeleteIdentityPoolRequestMarshaller().marshall(deleteIdentityPoolRequest);
                try {
                    request.setAWSRequestMetrics(awsRequestMetrics);
                } catch (Throwable th) {
                    th = th;
                    awsRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.RequestMarshallTime);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                request = null;
                awsRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.RequestMarshallTime);
                throw th;
            }
            try {
                awsRequestMetrics.endEvent((MetricType) field2);
                invoke(request, new JsonResponseHandler((Unmarshaller) null), createExecutionContext);
                awsRequestMetrics.endEvent((MetricType) field);
                endClientExecution(awsRequestMetrics, request, (Response<?>) null, true);
            } catch (Throwable th3) {
                th = th3;
                awsRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, (Response<?>) null, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = null;
            awsRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, (Response<?>) null, true);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.DescribeIdentityResult describeIdentity(com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.DescribeIdentityRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.DescribeIdentityRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.DescribeIdentityResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.DescribeIdentityResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.DescribeIdentityResult r0 = (com.amazonaws.services.cognitoidentity.model.DescribeIdentityResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.describeIdentity(com.amazonaws.services.cognitoidentity.model.DescribeIdentityRequest):com.amazonaws.services.cognitoidentity.model.DescribeIdentityResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolResult describeIdentityPool(com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.DescribeIdentityPoolRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.DescribeIdentityPoolRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.DescribeIdentityPoolResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.DescribeIdentityPoolResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolResult r0 = (com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.describeIdentityPool(com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolRequest):com.amazonaws.services.cognitoidentity.model.DescribeIdentityPoolResult");
    }

    @Deprecated
    public ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest amazonWebServiceRequest) {
        return this.client.getResponseMetadataForRequest(amazonWebServiceRequest);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult getCredentialsForIdentity(com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.GetCredentialsForIdentityRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.GetCredentialsForIdentityRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.GetCredentialsForIdentityResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.GetCredentialsForIdentityResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult r0 = (com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.getCredentialsForIdentity(com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityRequest):com.amazonaws.services.cognitoidentity.model.GetCredentialsForIdentityResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.GetIdResult getId(com.amazonaws.services.cognitoidentity.model.GetIdRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.GetIdRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.GetIdRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.GetIdRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.GetIdResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.GetIdResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.GetIdResult r0 = (com.amazonaws.services.cognitoidentity.model.GetIdResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.getId(com.amazonaws.services.cognitoidentity.model.GetIdRequest):com.amazonaws.services.cognitoidentity.model.GetIdResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesResult getIdentityPoolRoles(com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.GetIdentityPoolRolesRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.GetIdentityPoolRolesRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.GetIdentityPoolRolesResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.GetIdentityPoolRolesResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesResult r0 = (com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.getIdentityPoolRoles(com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesRequest):com.amazonaws.services.cognitoidentity.model.GetIdentityPoolRolesResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult getOpenIdToken(com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.GetOpenIdTokenRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.GetOpenIdTokenRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.GetOpenIdTokenResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.GetOpenIdTokenResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult r0 = (com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.getOpenIdToken(com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest):com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityResult getOpenIdTokenForDeveloperIdentity(com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.GetOpenIdTokenForDeveloperIdentityRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.GetOpenIdTokenForDeveloperIdentityRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.GetOpenIdTokenForDeveloperIdentityResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.GetOpenIdTokenForDeveloperIdentityResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityResult r0 = (com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.getOpenIdTokenForDeveloperIdentity(com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityRequest):com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenForDeveloperIdentityResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.GetPrincipalTagAttributeMapResult getPrincipalTagAttributeMap(com.amazonaws.services.cognitoidentity.model.GetPrincipalTagAttributeMapRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.GetPrincipalTagAttributeMapRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.GetPrincipalTagAttributeMapRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.GetPrincipalTagAttributeMapRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.GetPrincipalTagAttributeMapResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.GetPrincipalTagAttributeMapResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.GetPrincipalTagAttributeMapResult r0 = (com.amazonaws.services.cognitoidentity.model.GetPrincipalTagAttributeMapResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.getPrincipalTagAttributeMap(com.amazonaws.services.cognitoidentity.model.GetPrincipalTagAttributeMapRequest):com.amazonaws.services.cognitoidentity.model.GetPrincipalTagAttributeMapResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.ListIdentitiesResult listIdentities(com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.ListIdentitiesRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.ListIdentitiesRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.ListIdentitiesResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.ListIdentitiesResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.ListIdentitiesResult r0 = (com.amazonaws.services.cognitoidentity.model.ListIdentitiesResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.listIdentities(com.amazonaws.services.cognitoidentity.model.ListIdentitiesRequest):com.amazonaws.services.cognitoidentity.model.ListIdentitiesResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsResult listIdentityPools(com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.ListIdentityPoolsRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.ListIdentityPoolsRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.ListIdentityPoolsResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.ListIdentityPoolsResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsResult r0 = (com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.listIdentityPools(com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsRequest):com.amazonaws.services.cognitoidentity.model.ListIdentityPoolsResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.ListTagsForResourceResult listTagsForResource(com.amazonaws.services.cognitoidentity.model.ListTagsForResourceRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.ListTagsForResourceRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.ListTagsForResourceRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.ListTagsForResourceRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.ListTagsForResourceResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.ListTagsForResourceResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.ListTagsForResourceResult r0 = (com.amazonaws.services.cognitoidentity.model.ListTagsForResourceResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.listTagsForResource(com.amazonaws.services.cognitoidentity.model.ListTagsForResourceRequest):com.amazonaws.services.cognitoidentity.model.ListTagsForResourceResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityResult lookupDeveloperIdentity(com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.LookupDeveloperIdentityRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.LookupDeveloperIdentityRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.LookupDeveloperIdentityResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.LookupDeveloperIdentityResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityResult r0 = (com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.lookupDeveloperIdentity(com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityRequest):com.amazonaws.services.cognitoidentity.model.LookupDeveloperIdentityResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesResult mergeDeveloperIdentities(com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.MergeDeveloperIdentitiesRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.MergeDeveloperIdentitiesRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.MergeDeveloperIdentitiesResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.MergeDeveloperIdentitiesResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesResult r0 = (com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.mergeDeveloperIdentities(com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesRequest):com.amazonaws.services.cognitoidentity.model.MergeDeveloperIdentitiesResult");
    }

    public void setIdentityPoolRoles(SetIdentityPoolRolesRequest setIdentityPoolRolesRequest) throws AmazonServiceException, AmazonClientException {
        Request<SetIdentityPoolRolesRequest> request;
        ExecutionContext createExecutionContext = createExecutionContext((AmazonWebServiceRequest) setIdentityPoolRolesRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent((MetricType) field);
        try {
            AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
            awsRequestMetrics.startEvent((MetricType) field2);
            try {
                request = new SetIdentityPoolRolesRequestMarshaller().marshall(setIdentityPoolRolesRequest);
                try {
                    request.setAWSRequestMetrics(awsRequestMetrics);
                } catch (Throwable th) {
                    th = th;
                    awsRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.RequestMarshallTime);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                request = null;
                awsRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.RequestMarshallTime);
                throw th;
            }
            try {
                awsRequestMetrics.endEvent((MetricType) field2);
                invoke(request, new JsonResponseHandler((Unmarshaller) null), createExecutionContext);
                awsRequestMetrics.endEvent((MetricType) field);
                endClientExecution(awsRequestMetrics, request, (Response<?>) null, true);
            } catch (Throwable th3) {
                th = th3;
                awsRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, (Response<?>) null, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = null;
            awsRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, (Response<?>) null, true);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.SetPrincipalTagAttributeMapResult setPrincipalTagAttributeMap(com.amazonaws.services.cognitoidentity.model.SetPrincipalTagAttributeMapRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.SetPrincipalTagAttributeMapRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.SetPrincipalTagAttributeMapRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.SetPrincipalTagAttributeMapRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.SetPrincipalTagAttributeMapResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.SetPrincipalTagAttributeMapResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.SetPrincipalTagAttributeMapResult r0 = (com.amazonaws.services.cognitoidentity.model.SetPrincipalTagAttributeMapResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.setPrincipalTagAttributeMap(com.amazonaws.services.cognitoidentity.model.SetPrincipalTagAttributeMapRequest):com.amazonaws.services.cognitoidentity.model.SetPrincipalTagAttributeMapResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.TagResourceResult tagResource(com.amazonaws.services.cognitoidentity.model.TagResourceRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.TagResourceRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.TagResourceRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.TagResourceRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.TagResourceResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.TagResourceResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.TagResourceResult r0 = (com.amazonaws.services.cognitoidentity.model.TagResourceResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.tagResource(com.amazonaws.services.cognitoidentity.model.TagResourceRequest):com.amazonaws.services.cognitoidentity.model.TagResourceResult");
    }

    public void unlinkDeveloperIdentity(UnlinkDeveloperIdentityRequest unlinkDeveloperIdentityRequest) throws AmazonServiceException, AmazonClientException {
        Request<UnlinkDeveloperIdentityRequest> request;
        ExecutionContext createExecutionContext = createExecutionContext((AmazonWebServiceRequest) unlinkDeveloperIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent((MetricType) field);
        try {
            AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
            awsRequestMetrics.startEvent((MetricType) field2);
            try {
                request = new UnlinkDeveloperIdentityRequestMarshaller().marshall(unlinkDeveloperIdentityRequest);
                try {
                    request.setAWSRequestMetrics(awsRequestMetrics);
                } catch (Throwable th) {
                    th = th;
                    awsRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.RequestMarshallTime);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                request = null;
                awsRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.RequestMarshallTime);
                throw th;
            }
            try {
                awsRequestMetrics.endEvent((MetricType) field2);
                invoke(request, new JsonResponseHandler((Unmarshaller) null), createExecutionContext);
                awsRequestMetrics.endEvent((MetricType) field);
                endClientExecution(awsRequestMetrics, request, (Response<?>) null, true);
            } catch (Throwable th3) {
                th = th3;
                awsRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, (Response<?>) null, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = null;
            awsRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, (Response<?>) null, true);
            throw th;
        }
    }

    public void unlinkIdentity(UnlinkIdentityRequest unlinkIdentityRequest) throws AmazonServiceException, AmazonClientException {
        Request<UnlinkIdentityRequest> request;
        ExecutionContext createExecutionContext = createExecutionContext((AmazonWebServiceRequest) unlinkIdentityRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent((MetricType) field);
        try {
            AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
            awsRequestMetrics.startEvent((MetricType) field2);
            try {
                request = new UnlinkIdentityRequestMarshaller().marshall(unlinkIdentityRequest);
                try {
                    request.setAWSRequestMetrics(awsRequestMetrics);
                } catch (Throwable th) {
                    th = th;
                    awsRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.RequestMarshallTime);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                request = null;
                awsRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.RequestMarshallTime);
                throw th;
            }
            try {
                awsRequestMetrics.endEvent((MetricType) field2);
                invoke(request, new JsonResponseHandler((Unmarshaller) null), createExecutionContext);
                awsRequestMetrics.endEvent((MetricType) field);
                endClientExecution(awsRequestMetrics, request, (Response<?>) null, true);
            } catch (Throwable th3) {
                th = th3;
                awsRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.ClientExecuteTime);
                endClientExecution(awsRequestMetrics, request, (Response<?>) null, true);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            request = null;
            awsRequestMetrics.endEvent((MetricType) AWSRequestMetrics.Field.ClientExecuteTime);
            endClientExecution(awsRequestMetrics, request, (Response<?>) null, true);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.UntagResourceResult untagResource(com.amazonaws.services.cognitoidentity.model.UntagResourceRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.UntagResourceRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.UntagResourceRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.UntagResourceRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.UntagResourceResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.UntagResourceResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.UntagResourceResult r0 = (com.amazonaws.services.cognitoidentity.model.UntagResourceResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.untagResource(com.amazonaws.services.cognitoidentity.model.UntagResourceRequest):com.amazonaws.services.cognitoidentity.model.UntagResourceResult");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.amazonaws.Request} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: com.amazonaws.Response} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.amazonaws.Request} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolResult updateIdentityPool(com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
        /*
            r8 = this;
            com.amazonaws.http.ExecutionContext r0 = r8.createExecutionContext((com.amazonaws.AmazonWebServiceRequest) r9)
            com.amazonaws.util.AWSRequestMetrics r1 = r0.getAwsRequestMetrics()
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.startEvent((com.amazonaws.metrics.MetricType) r2)
            r3 = 1
            r4 = 0
            com.amazonaws.util.AWSRequestMetrics$Field r5 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x004d }
            r1.startEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x004d }
            com.amazonaws.services.cognitoidentity.model.transform.UpdateIdentityPoolRequestMarshaller r6 = new com.amazonaws.services.cognitoidentity.model.transform.UpdateIdentityPoolRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.transform.UpdateIdentityPoolResultJsonUnmarshaller r5 = new com.amazonaws.services.cognitoidentity.model.transform.UpdateIdentityPoolResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolResult r0 = (com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolResult) r0     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r9, r4, r3)
            return r0
        L_0x003e:
            r0 = move-exception
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            r9 = r4
        L_0x0042:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.RequestMarshallTime     // Catch:{ all -> 0x0048 }
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r7 = r4
            r4 = r9
            r9 = r7
            goto L_0x004f
        L_0x004d:
            r0 = move-exception
            r9 = r4
        L_0x004f:
            com.amazonaws.util.AWSRequestMetrics$Field r2 = com.amazonaws.util.AWSRequestMetrics.Field.ClientExecuteTime
            r1.endEvent((com.amazonaws.metrics.MetricType) r2)
            r8.endClientExecution(r1, r4, r9, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.cognitoidentity.AmazonCognitoIdentityClient.updateIdentityPool(com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolRequest):com.amazonaws.services.cognitoidentity.model.UpdateIdentityPoolResult");
    }

    @Deprecated
    public AmazonCognitoIdentityClient(ClientConfiguration clientConfiguration) {
        this((AWSCredentialsProvider) new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    public AmazonCognitoIdentityClient(AWSCredentials aWSCredentials) {
        this(aWSCredentials, new ClientConfiguration());
    }

    public AmazonCognitoIdentityClient(AWSCredentials aWSCredentials, ClientConfiguration clientConfiguration) {
        this((AWSCredentialsProvider) new StaticCredentialsProvider(aWSCredentials), clientConfiguration);
    }

    public AmazonCognitoIdentityClient(AWSCredentialsProvider aWSCredentialsProvider) {
        this(aWSCredentialsProvider, new ClientConfiguration());
    }

    public AmazonCognitoIdentityClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(aWSCredentialsProvider, clientConfiguration, (HttpClient) new UrlHttpClient(clientConfiguration));
    }

    @Deprecated
    public AmazonCognitoIdentityClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        this.awsCredentialsProvider = aWSCredentialsProvider;
        init();
    }

    public AmazonCognitoIdentityClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);
        this.awsCredentialsProvider = aWSCredentialsProvider;
        init();
    }
}
