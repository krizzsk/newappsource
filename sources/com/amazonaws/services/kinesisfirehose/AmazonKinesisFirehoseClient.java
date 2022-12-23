package com.amazonaws.services.kinesisfirehose;

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
import com.amazonaws.http.UrlHttpClient;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.metrics.MetricType;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.services.kinesisfirehose.model.transform.InvalidArgumentExceptionUnmarshaller;
import com.amazonaws.services.kinesisfirehose.model.transform.InvalidKMSResourceExceptionUnmarshaller;
import com.amazonaws.services.kinesisfirehose.model.transform.ResourceNotFoundExceptionUnmarshaller;
import com.amazonaws.services.kinesisfirehose.model.transform.ServiceUnavailableExceptionUnmarshaller;
import com.amazonaws.transform.JsonErrorUnmarshaller;
import com.amazonaws.util.AWSRequestMetrics;
import java.util.ArrayList;
import java.util.List;

public class AmazonKinesisFirehoseClient extends AmazonWebServiceClient implements AmazonKinesisFirehose {
    private AWSCredentialsProvider awsCredentialsProvider;
    public List<JsonErrorUnmarshaller> jsonErrorUnmarshallers;

    @Deprecated
    public AmazonKinesisFirehoseClient() {
        this((AWSCredentialsProvider) new DefaultAWSCredentialsProviderChain(), new ClientConfiguration());
    }

    private static ClientConfiguration adjustClientConfiguration(ClientConfiguration clientConfiguration) {
        return clientConfiguration;
    }

    private void init() {
        ArrayList arrayList = new ArrayList();
        this.jsonErrorUnmarshallers = arrayList;
        arrayList.add(new InvalidArgumentExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new InvalidKMSResourceExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new ResourceNotFoundExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new ServiceUnavailableExceptionUnmarshaller());
        this.jsonErrorUnmarshallers.add(new JsonErrorUnmarshaller());
        setEndpoint("firehose.us-east-1.amazonaws.com");
        this.endpointPrefix = "firehose";
        HandlerChainFactory handlerChainFactory = new HandlerChainFactory();
        this.requestHandler2s.addAll(handlerChainFactory.newRequestHandlerChain("/com/amazonaws/services/kinesisfirehose/request.handlers"));
        this.requestHandler2s.addAll(handlerChainFactory.newRequestHandler2Chain("/com/amazonaws/services/kinesisfirehose/request.handler2s"));
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
    public com.amazonaws.services.kinesisfirehose.model.PutRecordBatchResult putRecordBatch(com.amazonaws.services.kinesisfirehose.model.PutRecordBatchRequest r9) throws com.amazonaws.AmazonServiceException, com.amazonaws.AmazonClientException {
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
            com.amazonaws.services.kinesisfirehose.model.transform.PutRecordBatchRequestMarshaller r6 = new com.amazonaws.services.kinesisfirehose.model.transform.PutRecordBatchRequestMarshaller     // Catch:{ all -> 0x0040 }
            r6.<init>()     // Catch:{ all -> 0x0040 }
            com.amazonaws.Request r9 = r6.marshall((com.amazonaws.services.kinesisfirehose.model.PutRecordBatchRequest) r9)     // Catch:{ all -> 0x0040 }
            r9.setAWSRequestMetrics(r1)     // Catch:{ all -> 0x003e }
            r1.endEvent((com.amazonaws.metrics.MetricType) r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesisfirehose.model.transform.PutRecordBatchResultJsonUnmarshaller r5 = new com.amazonaws.services.kinesisfirehose.model.transform.PutRecordBatchResultJsonUnmarshaller     // Catch:{ all -> 0x0048 }
            r5.<init>()     // Catch:{ all -> 0x0048 }
            com.amazonaws.http.JsonResponseHandler r6 = new com.amazonaws.http.JsonResponseHandler     // Catch:{ all -> 0x0048 }
            r6.<init>(r5)     // Catch:{ all -> 0x0048 }
            com.amazonaws.Response r4 = r8.invoke(r9, r6, r0)     // Catch:{ all -> 0x0048 }
            java.lang.Object r0 = r4.getAwsResponse()     // Catch:{ all -> 0x0048 }
            com.amazonaws.services.kinesisfirehose.model.PutRecordBatchResult r0 = (com.amazonaws.services.kinesisfirehose.model.PutRecordBatchResult) r0     // Catch:{ all -> 0x0048 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehoseClient.putRecordBatch(com.amazonaws.services.kinesisfirehose.model.PutRecordBatchRequest):com.amazonaws.services.kinesisfirehose.model.PutRecordBatchResult");
    }

    @Deprecated
    public AmazonKinesisFirehoseClient(ClientConfiguration clientConfiguration) {
        this((AWSCredentialsProvider) new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    public AmazonKinesisFirehoseClient(AWSCredentials aWSCredentials) {
        this(aWSCredentials, new ClientConfiguration());
    }

    public AmazonKinesisFirehoseClient(AWSCredentials aWSCredentials, ClientConfiguration clientConfiguration) {
        this((AWSCredentialsProvider) new StaticCredentialsProvider(aWSCredentials), clientConfiguration);
    }

    public AmazonKinesisFirehoseClient(AWSCredentialsProvider aWSCredentialsProvider) {
        this(aWSCredentialsProvider, new ClientConfiguration());
    }

    public AmazonKinesisFirehoseClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration) {
        this(aWSCredentialsProvider, clientConfiguration, (HttpClient) new UrlHttpClient(clientConfiguration));
    }

    @Deprecated
    public AmazonKinesisFirehoseClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration, RequestMetricCollector requestMetricCollector) {
        super(adjustClientConfiguration(clientConfiguration), requestMetricCollector);
        this.awsCredentialsProvider = aWSCredentialsProvider;
        init();
    }

    public AmazonKinesisFirehoseClient(AWSCredentialsProvider aWSCredentialsProvider, ClientConfiguration clientConfiguration, HttpClient httpClient) {
        super(adjustClientConfiguration(clientConfiguration), httpClient);
        this.awsCredentialsProvider = aWSCredentialsProvider;
        init();
    }
}
