package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.StreamDescriptionSummary;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

class StreamDescriptionSummaryJsonUnmarshaller implements Unmarshaller<StreamDescriptionSummary, JsonUnmarshallerContext> {
    private static StreamDescriptionSummaryJsonUnmarshaller instance;

    public static StreamDescriptionSummaryJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new StreamDescriptionSummaryJsonUnmarshaller();
        }
        return instance;
    }

    public StreamDescriptionSummary unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        StreamDescriptionSummary streamDescriptionSummary = new StreamDescriptionSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals(JSONRecordAdapter.STREAM_NAME_FIELD)) {
                streamDescriptionSummary.setStreamName(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("StreamARN")) {
                streamDescriptionSummary.setStreamARN(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("StreamStatus")) {
                streamDescriptionSummary.setStreamStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("RetentionPeriodHours")) {
                streamDescriptionSummary.setRetentionPeriodHours(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("StreamCreationTimestamp")) {
                streamDescriptionSummary.setStreamCreationTimestamp(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("EnhancedMonitoring")) {
                streamDescriptionSummary.setEnhancedMonitoring(new ListUnmarshaller(EnhancedMetricsJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("EncryptionType")) {
                streamDescriptionSummary.setEncryptionType(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("KeyId")) {
                streamDescriptionSummary.setKeyId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("OpenShardCount")) {
                streamDescriptionSummary.setOpenShardCount(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return streamDescriptionSummary;
    }
}
