package com.amazonaws.services.kinesisfirehose.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kinesisfirehose.model.PutRecordBatchRequest;
import com.amazonaws.services.kinesisfirehose.model.Record;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import p001a0.C0016g;

public class PutRecordBatchRequestMarshaller implements Marshaller<Request<PutRecordBatchRequest>, PutRecordBatchRequest> {
    public Request<PutRecordBatchRequest> marshall(PutRecordBatchRequest putRecordBatchRequest) {
        if (putRecordBatchRequest != null) {
            DefaultRequest defaultRequest = new DefaultRequest(putRecordBatchRequest, "AmazonKinesisFirehose");
            defaultRequest.addHeader("X-Amz-Target", "Firehose_20150804.PutRecordBatch");
            defaultRequest.setHttpMethod(HttpMethodName.POST);
            defaultRequest.setResourcePath("/");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream, 8192);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(gZIPOutputStream, StringUtils.UTF8);
                AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(outputStreamWriter);
                jsonWriter.beginObject();
                if (putRecordBatchRequest.getDeliveryStreamName() != null) {
                    String deliveryStreamName = putRecordBatchRequest.getDeliveryStreamName();
                    jsonWriter.name("DeliveryStreamName");
                    jsonWriter.value(deliveryStreamName);
                }
                if (putRecordBatchRequest.getRecords() != null) {
                    List<Record> records = putRecordBatchRequest.getRecords();
                    jsonWriter.name("Records");
                    jsonWriter.beginArray();
                    for (Record next : records) {
                        if (next != null) {
                            RecordJsonMarshaller.getInstance().marshall(next, jsonWriter);
                        }
                    }
                    jsonWriter.endArray();
                }
                jsonWriter.endObject();
                jsonWriter.flush();
                gZIPOutputStream.finish();
                outputStreamWriter.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                defaultRequest.setContent(new ByteArrayInputStream(byteArray));
                defaultRequest.addHeader(HttpHeader.CONTENT_LENGTH, Integer.toString(byteArray.length));
                defaultRequest.addHeader("Content-Encoding", "gzip");
                if (!defaultRequest.getHeaders().containsKey(HttpHeader.CONTENT_TYPE)) {
                    defaultRequest.addHeader(HttpHeader.CONTENT_TYPE, "application/x-amz-json-1.1");
                }
                return defaultRequest;
            } catch (Throwable th) {
                throw new AmazonClientException(C0016g.m32p(th, C13555b.m33972k("Unable to marshall request to JSON: ")), th);
            }
        } else {
            throw new AmazonClientException("Invalid argument passed to marshall(PutRecordBatchRequest)");
        }
    }
}
