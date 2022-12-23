package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.kinesis.AmazonKinesis;
import com.amazonaws.services.kinesis.model.PutRecordsRequest;
import com.amazonaws.services.kinesis.model.PutRecordsRequestEntry;
import com.amazonaws.services.kinesis.model.PutRecordsResult;
import com.amazonaws.util.StringUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

class KinesisStreamRecordSender implements RecordSender {
    private final AmazonKinesis client;
    private final String partitionKey;
    private final String userAgent;

    public KinesisStreamRecordSender(AmazonKinesis amazonKinesis, String str) {
        this(amazonKinesis, str, (String) null);
    }

    public boolean isRecoverable(AmazonClientException amazonClientException) {
        if (amazonClientException instanceof AmazonServiceException) {
            String errorCode = ((AmazonServiceException) amazonClientException).getErrorCode();
            if ("InternalFailure".equals(errorCode) || "ServiceUnavailable".equals(errorCode) || "Throttling".equals(errorCode) || "ProvisionedThroughputExceededException".equals(errorCode)) {
                return true;
            }
            return false;
        } else if (amazonClientException.getCause() == null || !(amazonClientException.getCause() instanceof IOException)) {
            return false;
        } else {
            return true;
        }
    }

    public List<byte[]> sendBatch(String str, List<byte[]> list) {
        String str2;
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        PutRecordsRequest putRecordsRequest = new PutRecordsRequest();
        putRecordsRequest.setStreamName(str);
        ArrayList arrayList = new ArrayList(list.size());
        for (byte[] next : list) {
            if (StringUtils.isBlank(this.partitionKey)) {
                str2 = UUID.randomUUID().toString();
            } else {
                str2 = this.partitionKey;
            }
            PutRecordsRequestEntry putRecordsRequestEntry = new PutRecordsRequestEntry();
            putRecordsRequestEntry.setData(ByteBuffer.wrap(next));
            putRecordsRequestEntry.setPartitionKey(str2);
            arrayList.add(putRecordsRequestEntry);
        }
        putRecordsRequest.setRecords(arrayList);
        putRecordsRequest.getRequestClientOptions().appendUserAgent(this.userAgent);
        PutRecordsResult putRecords = this.client.putRecords(putRecordsRequest);
        int size = putRecords.getRecords().size();
        ArrayList arrayList2 = new ArrayList(putRecords.getFailedRecordCount().intValue());
        for (int i = 0; i < size; i++) {
            if (putRecords.getRecords().get(i).getErrorCode() != null) {
                arrayList2.add(list.get(i));
            }
        }
        return arrayList2;
    }

    public KinesisStreamRecordSender(AmazonKinesis amazonKinesis, String str, String str2) {
        this.client = amazonKinesis;
        this.userAgent = str;
        this.partitionKey = str2;
    }
}
