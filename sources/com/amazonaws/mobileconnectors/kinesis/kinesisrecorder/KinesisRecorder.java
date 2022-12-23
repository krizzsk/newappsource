package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.FileRecordStore;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.kinesis.AmazonKinesisClient;
import com.amazonaws.util.VersionInfoUtils;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class KinesisRecorder extends AbstractKinesisRecorder {
    private static final Log LOGGER;
    private static final int MAX_RECORD_SIZE_BYTES = 1048576;
    private static final String RECORD_FILE_NAME = "kinesis_stream_records";
    private static final Pattern STREAM_NAME_PATTERN = Pattern.compile("[a-zA-Z0-9_.-]{1,128}");
    private static final String USER_AGENT;
    private final KinesisStreamRecordSender sender;

    static {
        Class<KinesisRecorder> cls = KinesisRecorder.class;
        LOGGER = LogFactory.getLog((Class<?>) cls);
        USER_AGENT = cls.getName() + "/" + VersionInfoUtils.getVersion();
    }

    public KinesisRecorder(File file, Regions regions, AWSCredentialsProvider aWSCredentialsProvider) {
        this(file, regions, aWSCredentialsProvider, new KinesisRecorderConfig());
    }

    private void checkUpgrade(final File file) {
        if (new File(new File(file, Constants.RECORDS_DIRECTORY), Constants.RECORDS_FILE_NAME).isFile()) {
            new Thread(new Runnable() {
                public void run() {
                    KinesisRecorder.this.upgrade(file);
                }
            }).start();
        }
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

    public void upgrade(File file) {
        synchronized (this) {
            File file2 = new File(new File(file, Constants.RECORDS_DIRECTORY), Constants.RECORDS_FILE_NAME);
            if (file2.isFile()) {
                FileRecordStore.RecordIterator it = new FileRecordStore(file, Constants.RECORDS_FILE_NAME, Long.MAX_VALUE).iterator();
                while (it.hasNext()) {
                    try {
                        JSONObject jSONObject = new JSONObject(it.next());
                        saveRecord(JSONRecordAdapter.getData(jSONObject).array(), JSONRecordAdapter.getStreamName(jSONObject));
                    } catch (JSONException e) {
                        LOGGER.debug("caught exception", e);
                    }
                }
                try {
                    it.close();
                } catch (IOException e2) {
                    LOGGER.debug("caught exception", e2);
                }
                file2.delete();
            }
        }
    }

    public KinesisRecorder(File file, Regions regions, AWSCredentialsProvider aWSCredentialsProvider, KinesisRecorderConfig kinesisRecorderConfig) {
        super(new FileRecordStore(file, RECORD_FILE_NAME, kinesisRecorderConfig.getMaxStorageSize()), kinesisRecorderConfig);
        if (file == null || aWSCredentialsProvider == null || regions == null) {
            throw new IllegalArgumentException("You must pass a non-null credentialsProvider, region, directory, and config to KinesisRecordStore");
        }
        AmazonKinesisClient amazonKinesisClient = new AmazonKinesisClient(aWSCredentialsProvider, kinesisRecorderConfig.getClientConfiguration());
        amazonKinesisClient.setRegion(Region.getRegion(regions));
        this.sender = new KinesisStreamRecordSender(amazonKinesisClient, USER_AGENT, kinesisRecorderConfig.getPartitionKey());
        checkUpgrade(file);
    }

    public KinesisRecorder(KinesisStreamRecordSender kinesisStreamRecordSender, FileRecordStore fileRecordStore, KinesisRecorderConfig kinesisRecorderConfig) {
        super(fileRecordStore, kinesisRecorderConfig);
        this.sender = kinesisStreamRecordSender;
    }
}
