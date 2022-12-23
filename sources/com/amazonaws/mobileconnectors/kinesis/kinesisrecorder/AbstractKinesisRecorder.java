package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.FileRecordStore;
import com.amazonaws.util.StringUtils;
import java.io.IOException;
import java.util.List;

public abstract class AbstractKinesisRecorder {
    private static final Log LOGGER = LogFactory.getLog((Class<?>) AbstractKinesisRecorder.class);
    private static final int MAX_BATCH_RECORDS_SIZE_BYTES = 524288;
    private static final int MAX_RECORDS_PER_BATCH = 128;
    private static final int MAX_RETRY_COUNT = 3;
    public KinesisRecorderConfig config;
    public FileRecordStore recordStore;

    public AbstractKinesisRecorder(FileRecordStore fileRecordStore, KinesisRecorderConfig kinesisRecorderConfig) {
        if (fileRecordStore != null) {
            this.recordStore = fileRecordStore;
            this.config = kinesisRecorderConfig;
            return;
        }
        throw new IllegalArgumentException("Record store can't be null");
    }

    public synchronized void deleteAllRecords() {
        try {
            this.recordStore.iterator().removeAllRecords();
        } catch (IOException e) {
            throw new AmazonClientException("Error deleting events", e);
        }
    }

    public long getDiskByteLimit() {
        return this.config.getMaxStorageSize();
    }

    public long getDiskBytesUsed() {
        return this.recordStore.getFileSize();
    }

    public KinesisRecorderConfig getKinesisRecorderConfig() {
        return this.config;
    }

    public abstract RecordSender getRecordSender();

    public String nextBatch(FileRecordStore.RecordIterator recordIterator, List<byte[]> list, int i, int i2) {
        list.clear();
        FileRecordParser fileRecordParser = new FileRecordParser();
        int i3 = 0;
        String str = null;
        int i4 = 0;
        while (recordIterator.hasNext() && i3 < i && i4 < i2) {
            String peek = recordIterator.peek();
            if (peek == null || peek.isEmpty()) {
                recordIterator.next();
            } else {
                try {
                    fileRecordParser.parse(peek);
                    if (str != null && !str.equals(fileRecordParser.streamName)) {
                        break;
                    }
                    list.add(fileRecordParser.bytes);
                    i3++;
                    i4 += fileRecordParser.bytes.length;
                    str = fileRecordParser.streamName;
                    recordIterator.next();
                } catch (Exception e) {
                    LOGGER.warn("Failed to read line. Skip.", e);
                    recordIterator.next();
                }
            }
        }
        return str;
    }

    public void saveRecord(String str, String str2) {
        saveRecord(str.getBytes(StringUtils.UTF8), str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0081, code lost:
        throw new com.amazonaws.AmazonClientException("Failed to remove read records", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d7, code lost:
        throw new com.amazonaws.AmazonClientException("Failed to close record file", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f8, code lost:
        throw new com.amazonaws.AmazonClientException("Failed to close record file", r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:57:0x00ca, B:67:0x00ec] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035 A[ExcHandler: IOException (r0v13 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:14:0x0030] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void submitAllRecords() {
        /*
            r13 = this;
            monitor-enter(r13)
            com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.RecordSender r0 = r13.getRecordSender()     // Catch:{ all -> 0x00f9 }
            com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.FileRecordStore r1 = r13.recordStore     // Catch:{ all -> 0x00f9 }
            com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.FileRecordStore$RecordIterator r1 = r1.iterator()     // Catch:{ all -> 0x00f9 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x00f9 }
            r3 = 128(0x80, float:1.794E-43)
            r2.<init>(r3)     // Catch:{ all -> 0x00f9 }
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0016:
            r8 = 1
            boolean r9 = r1.hasNext()     // Catch:{ all -> 0x00d8 }
            if (r9 == 0) goto L_0x00b7
            r9 = 3
            if (r5 >= r9) goto L_0x00b7
            r9 = 524288(0x80000, float:7.34684E-40)
            java.lang.String r9 = r13.nextBatch(r1, r2, r3, r9)     // Catch:{ all -> 0x00d8 }
            if (r9 == 0) goto L_0x00b7
            boolean r10 = r2.isEmpty()     // Catch:{ all -> 0x00d8 }
            if (r10 == 0) goto L_0x0030
            goto L_0x00b7
        L_0x0030:
            java.util.List r10 = r0.sendBatch(r9, r2)     // Catch:{ AmazonClientException -> 0x0037, IOException -> 0x0035 }
            goto L_0x004e
        L_0x0035:
            r0 = move-exception
            goto L_0x007a
        L_0x0037:
            r10 = move-exception
            if (r7 != 0) goto L_0x0079
            java.lang.String r7 = r10.getMessage()     // Catch:{ AmazonClientException -> 0x0082, IOException -> 0x0035 }
            if (r7 == 0) goto L_0x0079
            java.lang.String r7 = r10.getMessage()     // Catch:{ AmazonClientException -> 0x0082, IOException -> 0x0035 }
            java.lang.String r11 = "Unable to unmarshall error response"
            boolean r7 = r7.contains(r11)     // Catch:{ AmazonClientException -> 0x0082, IOException -> 0x0035 }
            if (r7 == 0) goto L_0x0079
            r10 = r2
            r7 = 1
        L_0x004e:
            int r11 = r2.size()     // Catch:{ AmazonClientException -> 0x0082, IOException -> 0x0035 }
            int r12 = r10.size()     // Catch:{ AmazonClientException -> 0x0082, IOException -> 0x0035 }
            int r11 = r11 - r12
            int r6 = r6 + r11
            r1.removeReadRecords()     // Catch:{ AmazonClientException -> 0x0082, IOException -> 0x0035 }
            if (r11 != 0) goto L_0x005f
            int r5 = r5 + 1
        L_0x005f:
            boolean r11 = r10.isEmpty()     // Catch:{ AmazonClientException -> 0x0082, IOException -> 0x0035 }
            if (r11 != 0) goto L_0x0016
            java.util.Iterator r10 = r10.iterator()     // Catch:{ AmazonClientException -> 0x0082, IOException -> 0x0035 }
        L_0x0069:
            boolean r11 = r10.hasNext()     // Catch:{ AmazonClientException -> 0x0082, IOException -> 0x0035 }
            if (r11 == 0) goto L_0x0016
            java.lang.Object r11 = r10.next()     // Catch:{ AmazonClientException -> 0x0082, IOException -> 0x0035 }
            byte[] r11 = (byte[]) r11     // Catch:{ AmazonClientException -> 0x0082, IOException -> 0x0035 }
            r13.saveRecord((byte[]) r11, (java.lang.String) r9)     // Catch:{ AmazonClientException -> 0x0082, IOException -> 0x0035 }
            goto L_0x0069
        L_0x0079:
            throw r10     // Catch:{ AmazonClientException -> 0x0082, IOException -> 0x0035 }
        L_0x007a:
            com.amazonaws.AmazonClientException r2 = new com.amazonaws.AmazonClientException     // Catch:{ all -> 0x00d8 }
            java.lang.String r3 = "Failed to remove read records"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x00d8 }
            throw r2     // Catch:{ all -> 0x00d8 }
        L_0x0082:
            r3 = move-exception
            boolean r0 = r0.isRecoverable(r3)     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x0091
            com.amazonaws.logging.Log r0 = LOGGER     // Catch:{ all -> 0x00d8 }
            java.lang.String r2 = "ServiceException in submit all, the values of the data inside the requests appears valid.  The request will be kept"
            r0.error(r2, r3)     // Catch:{ all -> 0x00d8 }
            goto L_0x00ad
        L_0x0091:
            com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.KinesisRecorderConfig r0 = r13.config     // Catch:{ Exception -> 0x009b }
            com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.DeadLetterListener r0 = r0.getDeadLetterListener()     // Catch:{ Exception -> 0x009b }
            r0.onRecordsDropped(r9, r2)     // Catch:{ Exception -> 0x009b }
            goto L_0x00a3
        L_0x009b:
            r0 = move-exception
            com.amazonaws.logging.Log r2 = LOGGER     // Catch:{ all -> 0x00d8 }
            java.lang.String r5 = "DeadLetterListener onRecordsDropped has thrown an exception (user code)"
            r2.error(r5, r0)     // Catch:{ all -> 0x00d8 }
        L_0x00a3:
            r1.removeReadRecords()     // Catch:{ IOException -> 0x00ae }
            com.amazonaws.logging.Log r0 = LOGGER     // Catch:{ all -> 0x00d8 }
            java.lang.String r2 = "ServiceException in submit all, the last request is presumed to be the cause and will be dropped"
            r0.error(r2, r3)     // Catch:{ all -> 0x00d8 }
        L_0x00ad:
            throw r3     // Catch:{ all -> 0x00d8 }
        L_0x00ae:
            r0 = move-exception
            com.amazonaws.AmazonClientException r2 = new com.amazonaws.AmazonClientException     // Catch:{ all -> 0x00d8 }
            java.lang.String r3 = "Failed to drop bad records."
            r2.<init>(r3, r0)     // Catch:{ all -> 0x00d8 }
            throw r2     // Catch:{ all -> 0x00d8 }
        L_0x00b7:
            com.amazonaws.logging.Log r0 = LOGGER     // Catch:{ all -> 0x00f9 }
            java.lang.String r2 = "submitAllRecords sent %d records"
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ all -> 0x00f9 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00f9 }
            r3[r4] = r5     // Catch:{ all -> 0x00f9 }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x00f9 }
            r0.debug(r2)     // Catch:{ all -> 0x00f9 }
            r1.close()     // Catch:{ IOException -> 0x00cf }
            monitor-exit(r13)
            return
        L_0x00cf:
            r0 = move-exception
            com.amazonaws.AmazonClientException r1 = new com.amazonaws.AmazonClientException     // Catch:{ all -> 0x00f9 }
            java.lang.String r2 = "Failed to close record file"
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00f9 }
            throw r1     // Catch:{ all -> 0x00f9 }
        L_0x00d8:
            r0 = move-exception
            com.amazonaws.logging.Log r2 = LOGGER     // Catch:{ all -> 0x00f9 }
            java.lang.String r3 = "submitAllRecords sent %d records"
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x00f9 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00f9 }
            r5[r4] = r6     // Catch:{ all -> 0x00f9 }
            java.lang.String r3 = java.lang.String.format(r3, r5)     // Catch:{ all -> 0x00f9 }
            r2.debug(r3)     // Catch:{ all -> 0x00f9 }
            r1.close()     // Catch:{ IOException -> 0x00f0 }
            throw r0     // Catch:{ all -> 0x00f9 }
        L_0x00f0:
            r0 = move-exception
            com.amazonaws.AmazonClientException r1 = new com.amazonaws.AmazonClientException     // Catch:{ all -> 0x00f9 }
            java.lang.String r2 = "Failed to close record file"
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00f9 }
            throw r1     // Catch:{ all -> 0x00f9 }
        L_0x00f9:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.AbstractKinesisRecorder.submitAllRecords():void");
    }

    public void saveRecord(byte[] bArr, String str) {
        try {
            this.recordStore.put(FileRecordParser.asString(str, bArr));
        } catch (IOException e) {
            throw new AmazonClientException("Error saving record", e);
        }
    }
}
