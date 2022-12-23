package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.kinesisfirehose.AmazonKinesisFirehoseClient;
import com.amazonaws.util.VersionInfoUtils;
import java.io.File;
import java.util.regex.Pattern;

public class KinesisFirehoseRecorder extends AbstractKinesisRecorder {
    private static final int MAX_RECORD_SIZE_BYTES = 1024000;
    private static final String RECORD_FILE_NAME = "kinesis_firehose_records";
    private static final Pattern STREAM_NAME_PATTERN = Pattern.compile("[a-zA-Z0-9_.-]{1,64}");
    private static final String USER_AGENT = (KinesisFirehoseRecorder.class.getName() + "/" + VersionInfoUtils.getVersion());
    private FirehoseRecordSender sender;

    public KinesisFirehoseRecorder(File file, Regions regions, AWSCredentialsProvider aWSCredentialsProvider) {
        this(file, regions, aWSCredentialsProvider, new KinesisRecorderConfig());
    }

    public RecordSender getRecordSender() {
        return this.sender;
    }

    public void saveRecord(byte[] bArr, String str) {
        if (str == null || !STREAM_NAME_PATTERN.matcher(str).matches()) {
            throw new IllegalArgumentException(C25541a.m63881k("Invalid stream name: ", str));
        } else if (bArr == null || bArr.length == 0 || bArr.length > MAX_RECORD_SIZE_BYTES) {
            throw new IllegalArgumentException("Invalid data size.");
        } else {
            super.saveRecord(bArr, str);
        }
    }

    public KinesisFirehoseRecorder(File file, Regions regions, AWSCredentialsProvider aWSCredentialsProvider, KinesisRecorderConfig kinesisRecorderConfig) {
        super(new FileRecordStore(file, RECORD_FILE_NAME, kinesisRecorderConfig.getMaxStorageSize()), kinesisRecorderConfig);
        AmazonKinesisFirehoseClient amazonKinesisFirehoseClient = new AmazonKinesisFirehoseClient(aWSCredentialsProvider, kinesisRecorderConfig.getClientConfiguration());
        amazonKinesisFirehoseClient.setRegion(Region.getRegion(regions));
        this.sender = new FirehoseRecordSender(amazonKinesisFirehoseClient, USER_AGENT);
    }

    public KinesisFirehoseRecorder(FirehoseRecordSender firehoseRecordSender, FileRecordStore fileRecordStore, KinesisRecorderConfig kinesisRecorderConfig) {
        super(fileRecordStore, kinesisRecorderConfig);
        this.sender = firehoseRecordSender;
    }
}
