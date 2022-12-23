package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.EnhancedMetrics;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

class EnhancedMetricsJsonMarshaller {
    private static EnhancedMetricsJsonMarshaller instance;

    public static EnhancedMetricsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new EnhancedMetricsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(EnhancedMetrics enhancedMetrics, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (enhancedMetrics.getShardLevelMetrics() != null) {
            List<String> shardLevelMetrics = enhancedMetrics.getShardLevelMetrics();
            awsJsonWriter.name("ShardLevelMetrics");
            awsJsonWriter.beginArray();
            for (String next : shardLevelMetrics) {
                if (next != null) {
                    awsJsonWriter.value(next);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
