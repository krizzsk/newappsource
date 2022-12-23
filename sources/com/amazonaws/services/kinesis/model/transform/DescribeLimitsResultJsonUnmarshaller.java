package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.DescribeLimitsResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

public class DescribeLimitsResultJsonUnmarshaller implements Unmarshaller<DescribeLimitsResult, JsonUnmarshallerContext> {
    private static DescribeLimitsResultJsonUnmarshaller instance;

    public static DescribeLimitsResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeLimitsResultJsonUnmarshaller();
        }
        return instance;
    }

    public DescribeLimitsResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DescribeLimitsResult describeLimitsResult = new DescribeLimitsResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("ShardLimit")) {
                describeLimitsResult.setShardLimit(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("OpenShardCount")) {
                describeLimitsResult.setOpenShardCount(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeLimitsResult;
    }
}
