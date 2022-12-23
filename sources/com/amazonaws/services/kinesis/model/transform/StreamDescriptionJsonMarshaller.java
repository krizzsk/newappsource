package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.EnhancedMetrics;
import com.amazonaws.services.kinesis.model.Shard;
import com.amazonaws.services.kinesis.model.StreamDescription;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;
import java.util.List;

class StreamDescriptionJsonMarshaller {
    private static StreamDescriptionJsonMarshaller instance;

    public static StreamDescriptionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new StreamDescriptionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(StreamDescription streamDescription, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (streamDescription.getStreamName() != null) {
            String streamName = streamDescription.getStreamName();
            awsJsonWriter.name(JSONRecordAdapter.STREAM_NAME_FIELD);
            awsJsonWriter.value(streamName);
        }
        if (streamDescription.getStreamARN() != null) {
            String streamARN = streamDescription.getStreamARN();
            awsJsonWriter.name("StreamARN");
            awsJsonWriter.value(streamARN);
        }
        if (streamDescription.getStreamStatus() != null) {
            String streamStatus = streamDescription.getStreamStatus();
            awsJsonWriter.name("StreamStatus");
            awsJsonWriter.value(streamStatus);
        }
        if (streamDescription.getShards() != null) {
            List<Shard> shards = streamDescription.getShards();
            awsJsonWriter.name("Shards");
            awsJsonWriter.beginArray();
            for (Shard next : shards) {
                if (next != null) {
                    ShardJsonMarshaller.getInstance().marshall(next, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (streamDescription.getHasMoreShards() != null) {
            Boolean hasMoreShards = streamDescription.getHasMoreShards();
            awsJsonWriter.name("HasMoreShards");
            awsJsonWriter.value(hasMoreShards.booleanValue());
        }
        if (streamDescription.getRetentionPeriodHours() != null) {
            Integer retentionPeriodHours = streamDescription.getRetentionPeriodHours();
            awsJsonWriter.name("RetentionPeriodHours");
            awsJsonWriter.value((Number) retentionPeriodHours);
        }
        if (streamDescription.getStreamCreationTimestamp() != null) {
            Date streamCreationTimestamp = streamDescription.getStreamCreationTimestamp();
            awsJsonWriter.name("StreamCreationTimestamp");
            awsJsonWriter.value(streamCreationTimestamp);
        }
        if (streamDescription.getEnhancedMonitoring() != null) {
            List<EnhancedMetrics> enhancedMonitoring = streamDescription.getEnhancedMonitoring();
            awsJsonWriter.name("EnhancedMonitoring");
            awsJsonWriter.beginArray();
            for (EnhancedMetrics next2 : enhancedMonitoring) {
                if (next2 != null) {
                    EnhancedMetricsJsonMarshaller.getInstance().marshall(next2, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        if (streamDescription.getEncryptionType() != null) {
            String encryptionType = streamDescription.getEncryptionType();
            awsJsonWriter.name("EncryptionType");
            awsJsonWriter.value(encryptionType);
        }
        if (streamDescription.getKeyId() != null) {
            String keyId = streamDescription.getKeyId();
            awsJsonWriter.name("KeyId");
            awsJsonWriter.value(keyId);
        }
        awsJsonWriter.endObject();
    }
}
