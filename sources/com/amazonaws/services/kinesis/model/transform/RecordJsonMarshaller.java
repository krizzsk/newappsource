package com.amazonaws.services.kinesis.model.transform;

import com.amazonaws.services.kinesis.model.Record;
import com.amazonaws.util.json.AwsJsonWriter;
import java.nio.ByteBuffer;
import java.util.Date;

class RecordJsonMarshaller {
    private static RecordJsonMarshaller instance;

    public static RecordJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new RecordJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Record record, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (record.getSequenceNumber() != null) {
            String sequenceNumber = record.getSequenceNumber();
            awsJsonWriter.name(JSONRecordAdapter.SEQUENCE_NUMBER_FIELD);
            awsJsonWriter.value(sequenceNumber);
        }
        if (record.getApproximateArrivalTimestamp() != null) {
            Date approximateArrivalTimestamp = record.getApproximateArrivalTimestamp();
            awsJsonWriter.name("ApproximateArrivalTimestamp");
            awsJsonWriter.value(approximateArrivalTimestamp);
        }
        if (record.getData() != null) {
            ByteBuffer data = record.getData();
            awsJsonWriter.name(JSONRecordAdapter.DATA_FIELD_KEY);
            awsJsonWriter.value(data);
        }
        if (record.getPartitionKey() != null) {
            String partitionKey = record.getPartitionKey();
            awsJsonWriter.name(JSONRecordAdapter.PARTITION_KEY_FIELD);
            awsJsonWriter.value(partitionKey);
        }
        if (record.getEncryptionType() != null) {
            String encryptionType = record.getEncryptionType();
            awsJsonWriter.name("EncryptionType");
            awsJsonWriter.value(encryptionType);
        }
        awsJsonWriter.endObject();
    }
}
