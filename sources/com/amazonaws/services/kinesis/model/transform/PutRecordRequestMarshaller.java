package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kinesis.model.PutRecordRequest;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.json.AwsJsonWriter;
import com.amazonaws.util.json.JsonUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.util.zip.GZIPOutputStream;
import p001a0.C0016g;

public class PutRecordRequestMarshaller implements Marshaller<Request<PutRecordRequest>, PutRecordRequest> {
    public Request<PutRecordRequest> marshall(PutRecordRequest putRecordRequest) {
        if (putRecordRequest != null) {
            DefaultRequest defaultRequest = new DefaultRequest(putRecordRequest, "AmazonKinesis");
            defaultRequest.addHeader("X-Amz-Target", "Kinesis_20131202.PutRecord");
            defaultRequest.setHttpMethod(HttpMethodName.POST);
            defaultRequest.setResourcePath("");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream, 8192);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(gZIPOutputStream, StringUtils.UTF8);
                AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(outputStreamWriter);
                jsonWriter.beginObject();
                if (putRecordRequest.getStreamName() != null) {
                    jsonWriter.name(JSONRecordAdapter.STREAM_NAME_FIELD).value(putRecordRequest.getStreamName());
                }
                if (putRecordRequest.getData() != null) {
                    jsonWriter.name(JSONRecordAdapter.DATA_FIELD_KEY).value(putRecordRequest.getData());
                }
                if (putRecordRequest.getPartitionKey() != null) {
                    jsonWriter.name(JSONRecordAdapter.PARTITION_KEY_FIELD).value(putRecordRequest.getPartitionKey());
                }
                if (putRecordRequest.getExplicitHashKey() != null) {
                    jsonWriter.name("ExplicitHashKey").value(putRecordRequest.getExplicitHashKey());
                }
                if (putRecordRequest.getSequenceNumberForOrdering() != null) {
                    jsonWriter.name("SequenceNumberForOrdering").value(putRecordRequest.getSequenceNumberForOrdering());
                }
                jsonWriter.endObject();
                jsonWriter.flush();
                gZIPOutputStream.finish();
                outputStreamWriter.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                defaultRequest.setContent(new ByteArrayInputStream(byteArray));
                defaultRequest.addHeader(HttpHeader.CONTENT_LENGTH, Integer.toString(byteArray.length));
                defaultRequest.addHeader(HttpHeader.CONTENT_TYPE, "application/x-amz-json-1.1");
                defaultRequest.addHeader("Content-Encoding", "gzip");
                return defaultRequest;
            } catch (Throwable th) {
                throw new AmazonClientException(C0016g.m32p(th, C13555b.m33972k("Unable to marshall request to JSON: ")), th);
            }
        } else {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }
    }
}
