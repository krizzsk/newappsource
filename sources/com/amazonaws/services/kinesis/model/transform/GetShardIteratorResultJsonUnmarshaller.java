package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.GetShardIteratorResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

public class GetShardIteratorResultJsonUnmarshaller implements Unmarshaller<GetShardIteratorResult, JsonUnmarshallerContext> {
    private static GetShardIteratorResultJsonUnmarshaller instance;

    public static GetShardIteratorResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new GetShardIteratorResultJsonUnmarshaller();
        }
        return instance;
    }

    public GetShardIteratorResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        GetShardIteratorResult getShardIteratorResult = new GetShardIteratorResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("ShardIterator")) {
                getShardIteratorResult.setShardIterator(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return getShardIteratorResult;
    }
}
