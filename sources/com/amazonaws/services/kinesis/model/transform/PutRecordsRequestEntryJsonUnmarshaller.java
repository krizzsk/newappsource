package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.PutRecordsRequestEntry;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

class PutRecordsRequestEntryJsonUnmarshaller implements Unmarshaller<PutRecordsRequestEntry, JsonUnmarshallerContext> {
    private static PutRecordsRequestEntryJsonUnmarshaller instance;

    public static PutRecordsRequestEntryJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new PutRecordsRequestEntryJsonUnmarshaller();
        }
        return instance;
    }

    public PutRecordsRequestEntry unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PutRecordsRequestEntry putRecordsRequestEntry = new PutRecordsRequestEntry();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals(JSONRecordAdapter.DATA_FIELD_KEY)) {
                putRecordsRequestEntry.setData(SimpleTypeJsonUnmarshallers.ByteBufferJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("ExplicitHashKey")) {
                putRecordsRequestEntry.setExplicitHashKey(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(JSONRecordAdapter.PARTITION_KEY_FIELD)) {
                putRecordsRequestEntry.setPartitionKey(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return putRecordsRequestEntry;
    }
}
