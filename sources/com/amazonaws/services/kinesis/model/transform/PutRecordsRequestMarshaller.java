package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Request;
import com.amazonaws.http.HttpHeader;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.kinesis.model.PutRecordsRequest;
import com.amazonaws.services.kinesis.model.PutRecordsRequestEntry;
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

public class PutRecordsRequestMarshaller implements Marshaller<Request<PutRecordsRequest>, PutRecordsRequest> {
    public Request<PutRecordsRequest> marshall(PutRecordsRequest putRecordsRequest) {
        if (putRecordsRequest != null) {
            DefaultRequest defaultRequest = new DefaultRequest(putRecordsRequest, "AmazonKinesis");
            defaultRequest.addHeader("X-Amz-Target", "Kinesis_20131202.PutRecords");
            defaultRequest.setHttpMethod(HttpMethodName.POST);
            defaultRequest.setResourcePath("/");
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream, 8192);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(gZIPOutputStream, StringUtils.UTF8);
                AwsJsonWriter jsonWriter = JsonUtils.getJsonWriter(outputStreamWriter);
                jsonWriter.beginObject();
                if (putRecordsRequest.getRecords() != null) {
                    List<PutRecordsRequestEntry> records = putRecordsRequest.getRecords();
                    jsonWriter.name("Records");
                    jsonWriter.beginArray();
                    for (PutRecordsRequestEntry next : records) {
                        if (next != null) {
                            PutRecordsRequestEntryJsonMarshaller.getInstance().marshall(next, jsonWriter);
                        }
                    }
                    jsonWriter.endArray();
                }
                if (putRecordsRequest.getStreamName() != null) {
                    String streamName = putRecordsRequest.getStreamName();
                    jsonWriter.name(JSONRecordAdapter.STREAM_NAME_FIELD);
                    jsonWriter.value(streamName);
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
            throw new AmazonClientException("Invalid argument passed to marshall(PutRecordsRequest)");
        }
    }
}
