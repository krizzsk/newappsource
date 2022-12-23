package com.amazonaws.services.kinesisfirehose.model.transform;

import com.amazonaws.services.kinesisfirehose.model.Record;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

class RecordJsonUnmarshaller implements Unmarshaller<Record, JsonUnmarshallerContext> {
    private static RecordJsonUnmarshaller instance;

    public static RecordJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new RecordJsonUnmarshaller();
        }
        return instance;
    }

    public Record unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Record record = new Record();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals(JSONRecordAdapter.DATA_FIELD_KEY)) {
                record.setData(SimpleTypeJsonUnmarshallers.ByteBufferJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return record;
    }
}
