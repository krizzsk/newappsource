package com.amazonaws.services.kinesis;

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
import com.amazonaws.services.kinesis.model.AddTagsToStreamRequest;
import com.amazonaws.services.kinesis.model.CreateStreamRequest;
import com.amazonaws.services.kinesis.model.DecreaseStreamRetentionPeriodRequest;
import com.amazonaws.services.kinesis.model.DeleteStreamRequest;
import com.amazonaws.services.kinesis.model.DescribeStreamRequest;
import com.amazonaws.services.kinesis.model.DescribeStreamResult;
import com.amazonaws.services.kinesis.model.GetShardIteratorRequest;
import com.amazonaws.services.kinesis.model.GetShardIteratorResult;
import com.amazonaws.services.kinesis.model.IncreaseStreamRetentionPeriodRequest;
import com.amazonaws.services.kinesis.model.ListStreamsRequest;
import com.amazonaws.services.kinesis.model.ListStreamsResult;
import com.amazonaws.services.kinesis.model.MergeShardsRequest;
import com.amazonaws.services.kinesis.model.PutRecordRequest;
import com.amazonaws.services.kinesis.model.PutRecordResult;
import com.amazonaws.services.kinesis.model.RemoveTagsFromStreamRequest;
import com.amazonaws.services.kinesis.model.SplitShardRequest;
import com.amazonaws.services.kinesis.model.StartStreamEncryptionRequest;
import com.amazonaws.services.kinesis.model.StopStreamEncryptionRequest;
import com.amazonaws.services.kinesis.model.transform.AddTagsToStreamRequestMarshaller;
import com.amazonaws.services.kinesis.model.transform.CreateStreamRequestMarshaller;
import com.amazonaws.services.kinesis.model.transform.DecreaseStreamRetentionPeriodRequestMarshaller;
import com.amazonaws.services.kinesis.model.transform.DeleteStreamRequestMarshaller;
import com.amazonaws.services.kinesis.model.transform.ExpiredIteratorExceptionUnmarshaller;
import com.amazonaws.services.kinesis.model.transform.ExpiredNextTokenExceptionUnmarshaller;
import com.amazonaws.services.kinesis.model.transform.IncreaseStreamRetentionPeriodRequestMarshaller;
import com.amazonaws.services.kinesis.model.transform.InvalidArgumentExceptionUnmarshaller;
import com.amazonaws.services.kinesis.model.transform.KMSAccessDeniedExceptionUnmarshaller;
import com.amazonaws.services.kinesis.model.transform.KMSDisabledExceptionUnmarshaller;
import com.amazonaws.services.kinesis.model.transform.KMSInvalidStateExceptionUnmarshaller;
import com.amazonaws.services.kinesis.model.transform.KMSNotFoundExceptionUnmarshaller;
import com.amazonaws.services.kinesis.model.transform.KMSOptInRequiredExceptionUnmarshaller;
import com.amazonaws.services.kinesis.model.transform.KMSThrottlingExceptionUnmarshaller;
import com.amazonaws.services.kinesis.model.transform.LimitExceededExceptionUnmarshaller;
import com.amazonaws.services.kinesis.model.transform.MergeShardsRequestMarshaller;
import com.amazonaws.services.kinesis.model.transform.ProvisionedThroughputExceededExceptionUnmarshaller;
import com.amazonaws.services.kinesis.model.transform.RemoveTagsFromStreamRequestMarshaller;
import com.amazonaws.services.kinesis.model.transform.ResourceInUseExceptionUnmarshaller;
import com.amazonaws.services.kinesis.model.transform.ResourceNotFoundExceptionUnmarshaller;
import com.amazonaws.services.kinesis.model.transform.SplitShardRequestMarshaller;
import com.amazonaws.services.kinesis.model.transform.StartStreamEncryptionRequestMarshaller;
import com.amazonaws.services.kinesis.model.transform.StopStreamEncryptionRequestMarshaller;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class AmazonKinesisClient extends AmazonWebServiceClient implements AmazonKinesis {
    private AWSCredentialsProvider awsCredentialsProvider;
    public List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    @Deprecated
    public AmazonKinesisClient() {
        this((AWSCredentialsProvider) new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration clientConfiguration) {
        return clientConfiguration;
    }

    private void init() {
        ArrayList arrayList = new ArrayList();
        this.jsonErrorUnmarshallers = arrayList;
        arrayList.add(new ExpiredIteratorExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new ExpiredNextTokenExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new InvalidArgumentExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new KMSAccessDeniedExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new KMSDisabledExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new KMSInvalidStateExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new KMSNotFoundExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new KMSOptInRequiredExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new KMSThrottlingExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new LimitExceededExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new ProvisionedThroughputExceededExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new ResourceInUseExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        setEndpoint("kinesis.us-east-1.amazonaws.com");
        this.endpointPrefix = "kinesis";
        HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
        this.requestHandler2s.addAll(handlerChainFactory.newRequestHandlerChain("/com/amazonaws/services/kinesis/request.handlers"));
        this.requestHandler2s.addAll(handlerChainFactory.newRequestHandler2Chain("/com/amazonaws/services/kinesis/request.handler2s"));
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

    public void addTagsToStream(AddTagsToStreamRequest addTagsToStreamRequest) throws AmazonServiceException, AmazonClientException {
        Request<AddTagsToStreamRequest> request;
        ExecutionContext createExecutionContext = createExecutionContext((AmazonWebServiceRequest) addTagsToStreamRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent((MetricType) field);
        try {
            AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
            awsRequestMetrics.startEvent((MetricType) field2);
            try {
                request = new AddTagsToStreamRequestMarshaller().marshall(addTagsToStreamRequest);
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

    public void createStream(CreateStreamRequest createStreamRequest) throws AmazonServiceException, AmazonClientException {
        Request<CreateStreamRequest> request;
        ExecutionContext createExecutionContext = createExecutionContext((AmazonWebServiceRequest) createStreamRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent((MetricType) field);
        try {
            AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
            awsRequestMetrics.startEvent((MetricType) field2);
            try {
                request = new CreateStreamRequestMarshaller().marshall(createStreamRequest);
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

    public void decreaseStreamRetentionPeriod(DecreaseStreamRetentionPeriodRequest decreaseStreamRetentionPeriodRequest) throws AmazonServiceException, AmazonClientException {
        Request<DecreaseStreamRetentionPeriodRequest> request;
        ExecutionContext createExecutionContext = createExecutionContext((AmazonWebServiceRequest) decreaseStreamRetentionPeriodRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent((MetricType) field);
        try {
            AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
            awsRequestMetrics.startEvent((MetricType) field2);
            try {
                request = new DecreaseStreamRetentionPeriodRequestMarshaller().marshall(decreaseStreamRetentionPeriodRequest);
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

    public void deleteStream(DeleteStreamRequest deleteStreamRequest) throws AmazonServiceException, AmazonClientException {
        Request<DeleteStreamRequest> request;
        ExecutionContext createExecutionContext = createExecutionContext((AmazonWebServiceRequest) deleteStreamRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent((MetricType) field);
        try {
            AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
            awsRequestMetrics.startEvent((MetricType) field2);
            try {
                request = new DeleteStreamRequestMarshaller().marshall(deleteStreamRequest);
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
    public com.amazonaws.services.kinesis.model.DescribeLimitsResult describeLimits(com.amazonaws.services.kinesis.model.DescribeLimitsRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
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
            com.amazonaws.services.kinesis.model.transform.DescribeLimitsRequestMarshaller r6 = new com.amazonaws.services.kinesis.model.transform.DescribeLimitsRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.kinesis.model.DescribeLimitsRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.transform.DescribeLimitsResultJsonUnmarshaller r5 = new com.amazonaws.services.kinesis.model.transform.DescribeLimitsResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.DescribeLimitsResult r0 = (com.amazonaws.services.kinesis.model.DescribeLimitsResult) r0     // Catch:{ all -> 0x0048 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.kinesis.AmazonKinesisClient.describeLimits(com.amazonaws.services.kinesis.model.DescribeLimitsRequest):com.amazonaws.services.kinesis.model.DescribeLimitsResult");
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
    public com.amazonaws.services.kinesis.model.DescribeStreamResult describeStream(com.amazonaws.services.kinesis.model.DescribeStreamRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
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
            com.amazonaws.services.kinesis.model.transform.DescribeStreamRequestMarshaller r6 = new com.amazonaws.services.kinesis.model.transform.DescribeStreamRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.kinesis.model.DescribeStreamRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.transform.DescribeStreamResultJsonUnmarshaller r5 = new com.amazonaws.services.kinesis.model.transform.DescribeStreamResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.DescribeStreamResult r0 = (com.amazonaws.services.kinesis.model.DescribeStreamResult) r0     // Catch:{ all -> 0x0048 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.kinesis.AmazonKinesisClient.describeStream(com.amazonaws.services.kinesis.model.DescribeStreamRequest):com.amazonaws.services.kinesis.model.DescribeStreamResult");
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
    public com.amazonaws.services.kinesis.model.DescribeStreamSummaryResult describeStreamSummary(com.amazonaws.services.kinesis.model.DescribeStreamSummaryRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
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
            com.amazonaws.services.kinesis.model.transform.DescribeStreamSummaryRequestMarshaller r6 = new com.amazonaws.services.kinesis.model.transform.DescribeStreamSummaryRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.kinesis.model.DescribeStreamSummaryRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.transform.DescribeStreamSummaryResultJsonUnmarshaller r5 = new com.amazonaws.services.kinesis.model.transform.DescribeStreamSummaryResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.DescribeStreamSummaryResult r0 = (com.amazonaws.services.kinesis.model.DescribeStreamSummaryResult) r0     // Catch:{ all -> 0x0048 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.kinesis.AmazonKinesisClient.describeStreamSummary(com.amazonaws.services.kinesis.model.DescribeStreamSummaryRequest):com.amazonaws.services.kinesis.model.DescribeStreamSummaryResult");
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
    public com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringResult disableEnhancedMonitoring(com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
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
            com.amazonaws.services.kinesis.model.transform.DisableEnhancedMonitoringRequestMarshaller r6 = new com.amazonaws.services.kinesis.model.transform.DisableEnhancedMonitoringRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.transform.DisableEnhancedMonitoringResultJsonUnmarshaller r5 = new com.amazonaws.services.kinesis.model.transform.DisableEnhancedMonitoringResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringResult r0 = (com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringResult) r0     // Catch:{ all -> 0x0048 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.kinesis.AmazonKinesisClient.disableEnhancedMonitoring(com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringRequest):com.amazonaws.services.kinesis.model.DisableEnhancedMonitoringResult");
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
    public com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringResult enableEnhancedMonitoring(com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
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
            com.amazonaws.services.kinesis.model.transform.EnableEnhancedMonitoringRequestMarshaller r6 = new com.amazonaws.services.kinesis.model.transform.EnableEnhancedMonitoringRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.transform.EnableEnhancedMonitoringResultJsonUnmarshaller r5 = new com.amazonaws.services.kinesis.model.transform.EnableEnhancedMonitoringResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringResult r0 = (com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringResult) r0     // Catch:{ all -> 0x0048 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.kinesis.AmazonKinesisClient.enableEnhancedMonitoring(com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringRequest):com.amazonaws.services.kinesis.model.EnableEnhancedMonitoringResult");
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
    public com.amazonaws.services.kinesis.model.GetRecordsResult getRecords(com.amazonaws.services.kinesis.model.GetRecordsRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
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
            com.amazonaws.services.kinesis.model.transform.GetRecordsRequestMarshaller r6 = new com.amazonaws.services.kinesis.model.transform.GetRecordsRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.kinesis.model.GetRecordsRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.transform.GetRecordsResultJsonUnmarshaller r5 = new com.amazonaws.services.kinesis.model.transform.GetRecordsResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.GetRecordsResult r0 = (com.amazonaws.services.kinesis.model.GetRecordsResult) r0     // Catch:{ all -> 0x0048 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.kinesis.AmazonKinesisClient.getRecords(com.amazonaws.services.kinesis.model.GetRecordsRequest):com.amazonaws.services.kinesis.model.GetRecordsResult");
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
    public com.amazonaws.services.kinesis.model.GetShardIteratorResult getShardIterator(com.amazonaws.services.kinesis.model.GetShardIteratorRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
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
            com.amazonaws.services.kinesis.model.transform.GetShardIteratorRequestMarshaller r6 = new com.amazonaws.services.kinesis.model.transform.GetShardIteratorRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.kinesis.model.GetShardIteratorRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.transform.GetShardIteratorResultJsonUnmarshaller r5 = new com.amazonaws.services.kinesis.model.transform.GetShardIteratorResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.GetShardIteratorResult r0 = (com.amazonaws.services.kinesis.model.GetShardIteratorResult) r0     // Catch:{ all -> 0x0048 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.kinesis.AmazonKinesisClient.getShardIterator(com.amazonaws.services.kinesis.model.GetShardIteratorRequest):com.amazonaws.services.kinesis.model.GetShardIteratorResult");
    }

    public void increaseStreamRetentionPeriod(IncreaseStreamRetentionPeriodRequest increaseStreamRetentionPeriodRequest) throws AmazonServiceException, AmazonClientException {
        Request<IncreaseStreamRetentionPeriodRequest> request;
        ExecutionContext createExecutionContext = createExecutionContext((AmazonWebServiceRequest) increaseStreamRetentionPeriodRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent((MetricType) field);
        try {
            AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
            awsRequestMetrics.startEvent((MetricType) field2);
            try {
                request = new IncreaseStreamRetentionPeriodRequestMarshaller().marshall(increaseStreamRetentionPeriodRequest);
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
    public com.amazonaws.services.kinesis.model.ListShardsResult listShards(com.amazonaws.services.kinesis.model.ListShardsRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
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
            com.amazonaws.services.kinesis.model.transform.ListShardsRequestMarshaller r6 = new com.amazonaws.services.kinesis.model.transform.ListShardsRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.kinesis.model.ListShardsRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.transform.ListShardsResultJsonUnmarshaller r5 = new com.amazonaws.services.kinesis.model.transform.ListShardsResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.ListShardsResult r0 = (com.amazonaws.services.kinesis.model.ListShardsResult) r0     // Catch:{ all -> 0x0048 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.kinesis.AmazonKinesisClient.listShards(com.amazonaws.services.kinesis.model.ListShardsRequest):com.amazonaws.services.kinesis.model.ListShardsResult");
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
    public com.amazonaws.services.kinesis.model.ListStreamsResult listStreams(com.amazonaws.services.kinesis.model.ListStreamsRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
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
            com.amazonaws.services.kinesis.model.transform.ListStreamsRequestMarshaller r6 = new com.amazonaws.services.kinesis.model.transform.ListStreamsRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.kinesis.model.ListStreamsRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.transform.ListStreamsResultJsonUnmarshaller r5 = new com.amazonaws.services.kinesis.model.transform.ListStreamsResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.ListStreamsResult r0 = (com.amazonaws.services.kinesis.model.ListStreamsResult) r0     // Catch:{ all -> 0x0048 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.kinesis.AmazonKinesisClient.listStreams(com.amazonaws.services.kinesis.model.ListStreamsRequest):com.amazonaws.services.kinesis.model.ListStreamsResult");
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
    public com.amazonaws.services.kinesis.model.ListTagsForStreamResult listTagsForStream(com.amazonaws.services.kinesis.model.ListTagsForStreamRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
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
            com.amazonaws.services.kinesis.model.transform.ListTagsForStreamRequestMarshaller r6 = new com.amazonaws.services.kinesis.model.transform.ListTagsForStreamRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.kinesis.model.ListTagsForStreamRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.transform.ListTagsForStreamResultJsonUnmarshaller r5 = new com.amazonaws.services.kinesis.model.transform.ListTagsForStreamResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.ListTagsForStreamResult r0 = (com.amazonaws.services.kinesis.model.ListTagsForStreamResult) r0     // Catch:{ all -> 0x0048 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.kinesis.AmazonKinesisClient.listTagsForStream(com.amazonaws.services.kinesis.model.ListTagsForStreamRequest):com.amazonaws.services.kinesis.model.ListTagsForStreamResult");
    }

    public void mergeShards(MergeShardsRequest mergeShardsRequest) throws AmazonServiceException, AmazonClientException {
        Request<MergeShardsRequest> request;
        ExecutionContext createExecutionContext = createExecutionContext((AmazonWebServiceRequest) mergeShardsRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent((MetricType) field);
        try {
            AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
            awsRequestMetrics.startEvent((MetricType) field2);
            try {
                request = new MergeShardsRequestMarshaller().marshall(mergeShardsRequest);
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
    public com.amazonaws.services.kinesis.model.PutRecordResult putRecord(com.amazonaws.services.kinesis.model.PutRecordRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
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
            com.amazonaws.services.kinesis.model.transform.PutRecordRequestMarshaller r6 = new com.amazonaws.services.kinesis.model.transform.PutRecordRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.kinesis.model.PutRecordRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.transform.PutRecordResultJsonUnmarshaller r5 = new com.amazonaws.services.kinesis.model.transform.PutRecordResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.PutRecordResult r0 = (com.amazonaws.services.kinesis.model.PutRecordResult) r0     // Catch:{ all -> 0x0048 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.kinesis.AmazonKinesisClient.putRecord(com.amazonaws.services.kinesis.model.PutRecordRequest):com.amazonaws.services.kinesis.model.PutRecordResult");
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
    public com.amazonaws.services.kinesis.model.PutRecordsResult putRecords(com.amazonaws.services.kinesis.model.PutRecordsRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
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
            com.amazonaws.services.kinesis.model.transform.PutRecordsRequestMarshaller r6 = new com.amazonaws.services.kinesis.model.transform.PutRecordsRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.kinesis.model.PutRecordsRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.transform.PutRecordsResultJsonUnmarshaller r5 = new com.amazonaws.services.kinesis.model.transform.PutRecordsResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.PutRecordsResult r0 = (com.amazonaws.services.kinesis.model.PutRecordsResult) r0     // Catch:{ all -> 0x0048 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.kinesis.AmazonKinesisClient.putRecords(com.amazonaws.services.kinesis.model.PutRecordsRequest):com.amazonaws.services.kinesis.model.PutRecordsResult");
    }

    public void removeTagsFromStream(RemoveTagsFromStreamRequest removeTagsFromStreamRequest) throws AmazonServiceException, AmazonClientException {
        Request<RemoveTagsFromStreamRequest> request;
        ExecutionContext createExecutionContext = createExecutionContext((AmazonWebServiceRequest) removeTagsFromStreamRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent((MetricType) field);
        try {
            AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
            awsRequestMetrics.startEvent((MetricType) field2);
            try {
                request = new RemoveTagsFromStreamRequestMarshaller().marshall(removeTagsFromStreamRequest);
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

    public void splitShard(SplitShardRequest splitShardRequest) throws AmazonServiceException, AmazonClientException {
        Request<SplitShardRequest> request;
        ExecutionContext createExecutionContext = createExecutionContext((AmazonWebServiceRequest) splitShardRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent((MetricType) field);
        try {
            AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
            awsRequestMetrics.startEvent((MetricType) field2);
            try {
                request = new SplitShardRequestMarshaller().marshall(splitShardRequest);
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

    public void startStreamEncryption(StartStreamEncryptionRequest startStreamEncryptionRequest) throws AmazonServiceException, AmazonClientException {
        Request<StartStreamEncryptionRequest> request;
        ExecutionContext createExecutionContext = createExecutionContext((AmazonWebServiceRequest) startStreamEncryptionRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent((MetricType) field);
        try {
            AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
            awsRequestMetrics.startEvent((MetricType) field2);
            try {
                request = new StartStreamEncryptionRequestMarshaller().marshall(startStreamEncryptionRequest);
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

    public void stopStreamEncryption(StopStreamEncryptionRequest stopStreamEncryptionRequest) throws AmazonServiceException, AmazonClientException {
        Request<StopStreamEncryptionRequest> request;
        ExecutionContext createExecutionContext = createExecutionContext((AmazonWebServiceRequest) stopStreamEncryptionRequest);
        AWSRequestMetrics awsRequestMetrics = createExecutionContext.getAwsRequestMetrics();
        AWSRequestMetrics.Field field = AWSRequestMetrics.Field.ClientExecuteTime;
        awsRequestMetrics.startEvent((MetricType) field);
        try {
            AWSRequestMetrics.Field field2 = AWSRequestMetrics.Field.RequestMarshallTime;
            awsRequestMetrics.startEvent((MetricType) field2);
            try {
                request = new StopStreamEncryptionRequestMarshaller().marshall(stopStreamEncryptionRequest);
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
    public com.amazonaws.services.kinesis.model.UpdateShardCountResult updateShardCount(com.amazonaws.services.kinesis.model.UpdateShardCountRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
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
            com.amazonaws.services.kinesis.model.transform.UpdateShardCountRequestMarshaller r6 = new com.amazonaws.services.kinesis.model.transform.UpdateShardCountRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.kinesis.model.UpdateShardCountRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.transform.UpdateShardCountResultJsonUnmarshaller r5 = new com.amazonaws.services.kinesis.model.transform.UpdateShardCountResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesis.model.UpdateShardCountResult r0 = (com.amazonaws.services.kinesis.model.UpdateShardCountResult) r0     // Catch:{ all -> 0x0048 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.kinesis.AmazonKinesisClient.updateShardCount(com.amazonaws.services.kinesis.model.UpdateShardCountRequest):com.amazonaws.services.kinesis.model.UpdateShardCountResult");
    }

    @Deprecated
    public AmazonKinesisClient(ClientConfiguration clientConfiguration) {
        this((AWSCredentialsProvider) new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    public AmazonKinesisClient(AWSCredentials aWSCredentials) {
        this(aWSCredentials, new ClientConfiguration());
    }

    public AmazonKinesisClient(AWSCredentials aWSCredentials, ClientConfiguration clientConfiguration) {
        this((AWSCredentialsProvider) new StaticCredentialsProvider(aWSCredentials), clientConfiguration);
    }

    public AmazonKinesisClient(AWSCredentialsProvider aWSCredentialsProvider) {
        this(aWSCredentialsProvider, new ClientConfiguration());
    }

    public AmazonKinesisClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(aWSCredentialsProvider, clientConfiguration, (HttpClient) new UrlHttpClient(clientConfiguration));
    }

    @Deprecated
    public AmazonKinesisClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        this.awsCredentialsProvider = aWSCredentialsProvider;
        init();
    }

    public AmazonKinesisClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);
        this.awsCredentialsProvider = aWSCredentialsProvider;
        init();
    }

    public void createStream(String str, Integer num) throws AmazonServiceException, AmazonClientException {
        CreateStreamRequest createStreamRequest = new CreateStreamRequest();
        createStreamRequest.setStreamName(str);
        createStreamRequest.setShardCount(num);
        createStream(createStreamRequest);
    }

    public void deleteStream(String str) throws AmazonServiceException, AmazonClientException {
        DeleteStreamRequest deleteStreamRequest = new DeleteStreamRequest();
        deleteStreamRequest.setStreamName(str);
        deleteStream(deleteStreamRequest);
    }

    public void mergeShards(String str, String str2, String str3) throws AmazonServiceException, AmazonClientException {
        MergeShardsRequest mergeShardsRequest = new MergeShardsRequest();
        mergeShardsRequest.setStreamName(str);
        mergeShardsRequest.setShardToMerge(str2);
        mergeShardsRequest.setAdjacentShardToMerge(str3);
        mergeShards(mergeShardsRequest);
    }

    public void splitShard(String str, String str2, String str3) throws AmazonServiceException, AmazonClientException {
        SplitShardRequest splitShardRequest = new SplitShardRequest();
        splitShardRequest.setStreamName(str);
        splitShardRequest.setShardToSplit(str2);
        splitShardRequest.setNewStartingHashKey(str3);
        splitShard(splitShardRequest);
    }

    public DescribeStreamResult describeStream(String str) throws AmazonServiceException, AmazonClientException {
        DescribeStreamRequest describeStreamRequest = new DescribeStreamRequest();
        describeStreamRequest.setStreamName(str);
        return describeStream(describeStreamRequest);
    }

    public GetShardIteratorResult getShardIterator(String str, String str2, String str3) throws AmazonServiceException, AmazonClientException {
        GetShardIteratorRequest getShardIteratorRequest = new GetShardIteratorRequest();
        getShardIteratorRequest.setStreamName(str);
        getShardIteratorRequest.setShardId(str2);
        getShardIteratorRequest.setShardIteratorType(str3);
        return getShardIterator(getShardIteratorRequest);
    }

    public ListStreamsResult listStreams() throws AmazonServiceException, AmazonClientException {
        return listStreams(new ListStreamsRequest());
    }

    public PutRecordResult putRecord(String str, ByteBuffer byteBuffer, String str2) throws AmazonServiceException, AmazonClientException {
        PutRecordRequest putRecordRequest = new PutRecordRequest();
        putRecordRequest.setStreamName(str);
        putRecordRequest.setData(byteBuffer);
        putRecordRequest.setPartitionKey(str2);
        return putRecord(putRecordRequest);
    }

    public ListStreamsResult listStreams(String str) throws AmazonServiceException, AmazonClientException {
        ListStreamsRequest listStreamsRequest = new ListStreamsRequest();
        listStreamsRequest.setExclusiveStartStreamName(str);
        return listStreams(listStreamsRequest);
    }

    public DescribeStreamResult describeStream(String str, String str2) throws AmazonServiceException, AmazonClientException {
        DescribeStreamRequest describeStreamRequest = new DescribeStreamRequest();
        describeStreamRequest.setStreamName(str);
        describeStreamRequest.setExclusiveStartShardId(str2);
        return describeStream(describeStreamRequest);
    }

    public GetShardIteratorResult getShardIterator(String str, String str2, String str3, String str4) throws AmazonServiceException, AmazonClientException {
        GetShardIteratorRequest getShardIteratorRequest = new GetShardIteratorRequest();
        getShardIteratorRequest.setStreamName(str);
        getShardIteratorRequest.setShardId(str2);
        getShardIteratorRequest.setShardIteratorType(str3);
        getShardIteratorRequest.setStartingSequenceNumber(str4);
        return getShardIterator(getShardIteratorRequest);
    }

    public ListStreamsResult listStreams(Integer num, String str) throws AmazonServiceException, AmazonClientException {
        ListStreamsRequest listStreamsRequest = new ListStreamsRequest();
        listStreamsRequest.setLimit(num);
        listStreamsRequest.setExclusiveStartStreamName(str);
        return listStreams(listStreamsRequest);
    }

    public PutRecordResult putRecord(String str, ByteBuffer byteBuffer, String str2, String str3) throws AmazonServiceException, AmazonClientException {
        PutRecordRequest putRecordRequest = new PutRecordRequest();
        putRecordRequest.setStreamName(str);
        putRecordRequest.setData(byteBuffer);
        putRecordRequest.setPartitionKey(str2);
        putRecordRequest.setSequenceNumberForOrdering(str3);
        return putRecord(putRecordRequest);
    }

    public DescribeStreamResult describeStream(String str, Integer num, String str2) throws AmazonServiceException, AmazonClientException {
        DescribeStreamRequest describeStreamRequest = new DescribeStreamRequest();
        describeStreamRequest.setStreamName(str);
        describeStreamRequest.setLimit(num);
        describeStreamRequest.setExclusiveStartShardId(str2);
        return describeStream(describeStreamRequest);
    }
}
