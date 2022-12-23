package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.PutRecordsRequestEntry;
import com.amazonaws.util.json.AwsJsonWriter;
import java.nio.ByteBuffer;

class PutRecordsRequestEntryJsonMarshaller {
    private static PutRecordsRequestEntryJsonMarshaller instance;

    public static PutRecordsRequestEntryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new PutRecordsRequestEntryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(PutRecordsRequestEntry putRecordsRequestEntry, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (putRecordsRequestEntry.getData() != null) {
            ByteBuffer data = putRecordsRequestEntry.getData();
            awsJsonWriter.name(JSONRecordAdapter.DATA_FIELD_KEY);
            awsJsonWriter.value(data);
        }
        if (putRecordsRequestEntry.getExplicitHashKey() != null) {
            String explicitHashKey = putRecordsRequestEntry.getExplicitHashKey();
            awsJsonWriter.name("ExplicitHashKey");
            awsJsonWriter.value(explicitHashKey);
        }
        if (putRecordsRequestEntry.getPartitionKey() != null) {
            String partitionKey = putRecordsRequestEntry.getPartitionKey();
            awsJsonWriter.name(JSONRecordAdapter.PARTITION_KEY_FIELD);
            awsJsonWriter.value(partitionKey);
        }
        awsJsonWriter.endObject();
    }
}
