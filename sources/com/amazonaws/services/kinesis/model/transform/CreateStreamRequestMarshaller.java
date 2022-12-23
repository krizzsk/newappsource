package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kinesis.model.CreateStreamRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.StringWriter;
import p001a0.C0016g;

public class CreateStreamRequestMarshaller implements Marshaller<Request<CreateStreamRequest>, CreateStreamRequest> {
    public Request<CreateStreamRequest> marshall(CreateStreamRequest createStreamRequest) {
        if (createStreamRequest != null) {
            DefaultRequest defaultRequest = new DefaultRequest(createStreamRequest, "AmazonKinesis");
            defaultRequest.addHeader("X-Amz-Target", "Kinesis_20131202.CreateStream");
            defaultRequest.setHttpMethod(HttpMethodName.POST);
            defaultRequest.setResourcePath("/");
            try {
                StringWriter stringWriter = new StringWriter();
                AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(stringWriter);
                jsonWriter.beginObject();
                if (createStreamRequest.getStreamName() != null) {
                    String streamName = createStreamRequest.getStreamName();
                    jsonWriter.name(JSONRecordAdapter.STREAM_NAME_FIELD);
                    jsonWriter.value(streamName);
                }
                if (createStreamRequest.getShardCount() != null) {
                    Integer shardCount = createStreamRequest.getShardCount();
                    jsonWriter.name("ShardCount");
                    jsonWriter.value((Number) shardCount);
                }
                jsonWriter.endObject();
                jsonWriter.close();
                String stringWriter2 = stringWriter.toString();
                byte[] bytes = stringWriter2.getBytes(StringUtils.UTF8);
                defaultRequest.setContent(new StringInputStream(stringWriter2));
                defaultRequest.addHeader(HttpHeader.CONTENT_LENGTH, Integer.toString(bytes.length));
                if (!defaultRequest.getHeaders().containsKey(HttpHeader.CONTENT_TYPE)) {
                    defaultRequest.addHeader(HttpHeader.CONTENT_TYPE, "application/x-amz-json-1.1");
                }
                return defaultRequest;
            } catch (Throwable th) {
                throw new AmazonClientException(C0016g.m32p(th, C13555b.m33972k("Unable to marshall request to JSON: ")), th);
            }
        } else {
            throw new AmazonClientException("Invalid argument passed to marshall(CreateStreamRequest)");
        }
    }
}