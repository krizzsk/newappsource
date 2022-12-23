package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.EnhancedMetrics;
import com.amazonaws.services.kinesis.model.StreamDescriptionSummary;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;
import java.util.List;

class StreamDescriptionSummaryJsonMarshaller {
    private static StreamDescriptionSummaryJsonMarshaller instance;

    public static StreamDescriptionSummaryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StreamDescriptionSummaryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StreamDescriptionSummary streamDescriptionSummary, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (streamDescriptionSummary.getStreamName() != null) {
            String streamName = streamDescriptionSummary.getStreamName();
            awsJsonWriter.name(JSONRecordAdapter.STREAM_NAME_FIELD);
            awsJsonWriter.value(streamName);
        }
        if (streamDescriptionSummary.getStreamARN() != null) {
            String streamARN = streamDescriptionSummary.getStreamARN();
            awsJsonWriter.name("StreamARN");
            awsJsonWriter.value(streamARN);
        }
        if (streamDescriptionSummary.getStreamStatus() != null) {
            String streamStatus = streamDescriptionSummary.getStreamStatus();
            awsJsonWriter.name("StreamStatus");
            awsJsonWriter.value(streamStatus);
        }
        if (streamDescriptionSummary.getRetentionPeriodHours() != null) {
            Integer retentionPeriodHours = streamDescriptionSummary.getRetentionPeriodHours();
            awsJsonWriter.name("RetentionPeriodHours");
            awsJsonWriter.value((Number) retentionPeriodHours);
        }
        if (streamDescriptionSummary.getStreamCreationTimestamp() != null) {
            Date streamCreationTimestamp = streamDescriptionSummary.getStreamCreationTimestamp();
            awsJsonWriter.name("StreamCreationTimestamp");
            awsJsonWriter.value(streamCreationTimestamp);
        }
        if (streamDescriptionSummary.getEnhancedMonitoring() != null) {
            List<EnhancedMetrics> enhancedMonitoring = streamDescriptionSummary.getEnhancedMonitoring();
            awsJsonWriter.name("EnhancedMonitoring");
            awsJsonWriter.beginArray();
            for (EnhancedMetrics next : enhancedMonitoring) {
                if (next != null) {
                    EnhancedMetricsJsonMarshaller.getInstance().marshall(next, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (streamDescriptionSummary.getEncryptionType() != null) {
            String encryptionType = streamDescriptionSummary.getEncryptionType();
            awsJsonWriter.name("EncryptionType");
            awsJsonWriter.value(encryptionType);
        }
        if (streamDescriptionSummary.getKeyId() != null) {
            String keyId = streamDescriptionSummary.getKeyId();
            awsJsonWriter.name("KeyId");
            awsJsonWriter.value(keyId);
        }
        if (streamDescriptionSummary.getOpenShardCount() != null) {
            Integer openShardCount = streamDescriptionSummary.getOpenShardCount();
            awsJsonWriter.name("OpenShardCount");
            awsJsonWriter.value((Number) openShardCount);
        }
        awsJsonWriter.endObject();
    }
}
