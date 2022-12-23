package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.EnhancedMetrics;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

class EnhancedMetricsJsonUnmarshaller implements Unmarshaller<EnhancedMetrics, JsonUnmarshallerContext> {
    private static EnhancedMetricsJsonUnmarshaller instance;

    public static EnhancedMetricsJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new EnhancedMetricsJsonUnmarshaller();
        }
        return instance;
    }

    public EnhancedMetrics unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EnhancedMetrics enhancedMetrics = new EnhancedMetrics();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("ShardLevelMetrics")) {
                enhancedMetrics.setShardLevelMetrics(new ListUnmarshaller(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return enhancedMetrics;
    }
}
