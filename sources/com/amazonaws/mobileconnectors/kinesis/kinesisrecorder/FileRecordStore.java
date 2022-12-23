package com.amazonaws.mobileconnectors.kinesis.kinesisrecorder;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.util.StringUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

class FileRecordStore {
    private static final Log LOGGER = LogFactory.getLog((Class<?>) FileRecordStore.class);
    /* access modifiers changed from: private */
    public final ReentrantLock accessLock = new ReentrantLock(true);
    /* access modifiers changed from: private */
    public final FileManager fileManager;
    private final long maxStorageSize;
    /* access modifiers changed from: private */
    public File recordFile;
    private final String recordFileName;

    public class RecordIterator implements Iterator<String>, p988j$.util.Iterator {
        public boolean isEndOfFile = false;
        public int linesRead = 0;
        public String nextBuffer = null;
        public BufferedReader reader = null;

        public RecordIterator() {
        }

        private void resetReader() throws IOException {
            tryCloseReader();
            this.linesRead = 0;
            this.nextBuffer = null;
            this.isEndOfFile = false;
        }

        private void tryCloseReader() throws IOException {
            BufferedReader bufferedReader = this.reader;
            if (bufferedReader != null) {
                bufferedReader.close();
                this.reader = null;
            }
        }

        private boolean tryOpenReader() throws FileNotFoundException {
            if (this.reader != null) {
                return true;
            }
            if (this.isEndOfFile) {
                return false;
            }
            this.reader = new BufferedReader(new InputStreamReader(FileRecordStore.this.fileManager.newInputStream(FileRecordStore.this.recordFile), StringUtils.UTF8));
            return true;
        }

        public void close() throws IOException {
            tryCloseReader();
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        public boolean hasNext() {
            FileRecordStore.this.accessLock.lock();
            try {
                boolean z = false;
                if (this.nextBuffer == null) {
                    if (tryOpenReader()) {
                        for (boolean z2 = false; !z2; z2 = true) {
                            try {
                                this.nextBuffer = this.reader.readLine();
                            } catch (IOException unused) {
                                this.nextBuffer = null;
                            }
                        }
                        if (this.nextBuffer == null) {
                            this.isEndOfFile = true;
                            tryCloseReader();
                        }
                    }
                    FileRecordStore.this.accessLock.unlock();
                    return z;
                }
                z = true;
                FileRecordStore.this.accessLock.unlock();
                return z;
            } catch (FileNotFoundException e) {
                throw new AmazonClientException("Cannot find records file", e);
            } catch (IOException e2) {
                throw new AmazonClientException("IO Error", e2);
            } catch (Throwable th) {
                FileRecordStore.this.accessLock.unlock();
                throw th;
            }
        }

        public String peek() {
            FileRecordStore.this.accessLock.lock();
            try {
                hasNext();
                return this.nextBuffer;
            } finally {
                FileRecordStore.this.accessLock.unlock();
            }
        }

        public void remove() {
            throw new UnsupportedOperationException("The remove() operation is not supported for this iterator");
        }

        public void removeAllRecords() throws IOException {
            FileRecordStore.this.accessLock.lock();
            try {
                File unused = FileRecordStore.this.deleteAllRecords();
                resetReader();
            } finally {
                FileRecordStore.this.accessLock.unlock();
            }
        }

        public void removeReadRecords() throws IOException {
            FileRecordStore.this.accessLock.lock();
            try {
                File unused = FileRecordStore.this.deleteReadRecords(this.linesRead);
                resetReader();
            } finally {
                FileRecordStore.this.accessLock.unlock();
            }
        }

        public String next() {
            FileRecordStore.this.accessLock.lock();
            try {
                String str = this.nextBuffer;
                if (str != null) {
                    this.linesRead++;
                    this.nextBuffer = null;
                } else if (!tryOpenReader()) {
                    FileRecordStore.this.accessLock.unlock();
                    return null;
                } else {
                    String str2 = null;
                    for (boolean z = false; !z; z = true) {
                        try {
                            str2 = this.reader.readLine();
                        } catch (IOException unused) {
                            str2 = null;
                        }
                    }
                    if (str2 != null) {
                        this.linesRead++;
                    } else {
                        this.isEndOfFile = true;
                        tryCloseReader();
                    }
                    str = str2;
                }
                FileRecordStore.this.accessLock.unlock();
                return str;
            } catch (FileNotFoundException e) {
                throw new AmazonClientException("Cannot find records file", e);
            } catch (IOException e2) {
                throw new AmazonClientException("IO Error", e2);
            } catch (Throwable th) {
                FileRecordStore.this.accessLock.unlock();
                throw th;
            }
        }
    }

    public FileRecordStore(File file, String str, long j) {
        this.fileManager = new FileManager(file);
        this.recordFileName = str;
        this.maxStorageSize = j;
        try {
            tryCreateRecordsFile();
        } catch (IOException e) {
            throw new AmazonClientException("Failed to create file store", e);
        }
    }

    /* access modifiers changed from: private */
    public File deleteAllRecords() throws IOException {
        File createDirectory = this.fileManager.createDirectory(Constants.RECORDS_DIRECTORY);
        this.recordFile.delete();
        File createFile = this.fileManager.createFile(new File(createDirectory, this.recordFileName));
        this.recordFile = createFile;
        return createFile;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c3 A[SYNTHETIC, Splitter:B:48:0x00c3] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File deleteReadRecords(int r12) throws java.io.IOException {
        /*
            r11 = this;
            java.lang.String r0 = "failed to close reader"
            java.lang.String r1 = "Failed to delete read records and persist unread records"
            com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.FileManager r2 = r11.fileManager
            java.lang.String r3 = "KinesisRecorder"
            java.io.File r2 = r2.createDirectory(r3)
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r11.recordFileName
            java.lang.String r6 = ".tmp"
            java.lang.String r4 = p001a0.C0016g.m31o(r4, r5, r6)
            r3.<init>(r2, r4)
            boolean r2 = r3.exists()
            if (r2 == 0) goto L_0x0033
            boolean r2 = r3.delete()
            if (r2 == 0) goto L_0x002b
            goto L_0x0033
        L_0x002b:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "Failed to delete previous temp file"
            r12.<init>(r0)
            throw r12
        L_0x0033:
            com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.FileManager r2 = r11.fileManager
            java.io.File r2 = r2.createFile((java.io.File) r3)
            if (r2 == 0) goto L_0x00e5
            java.io.File r4 = r11.recordFile
            boolean r4 = r4.exists()
            if (r4 == 0) goto L_0x00e5
            boolean r4 = r2.exists()
            if (r4 == 0) goto L_0x00e5
            r4 = 0
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x00ba }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x00ba }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ all -> 0x00ba }
            java.io.File r8 = r11.recordFile     // Catch:{ all -> 0x00ba }
            r7.<init>(r8)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r8 = com.amazonaws.util.StringUtils.UTF8     // Catch:{ all -> 0x00ba }
            r6.<init>(r7, r8)     // Catch:{ all -> 0x00ba }
            r5.<init>(r6)     // Catch:{ all -> 0x00ba }
            java.io.PrintWriter r6 = new java.io.PrintWriter     // Catch:{ all -> 0x00b8 }
            java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00b8 }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x00b8 }
            r10 = 1
            r9.<init>(r2, r10)     // Catch:{ all -> 0x00b8 }
            r7.<init>(r9, r8)     // Catch:{ all -> 0x00b8 }
            r6.<init>(r7)     // Catch:{ all -> 0x00b8 }
            r4 = 0
        L_0x006e:
            java.lang.String r7 = r5.readLine()     // Catch:{ all -> 0x00b5 }
            if (r7 == 0) goto L_0x007e
            int r4 = r4 + r10
            if (r4 <= r12) goto L_0x006e
            r6.println(r7)     // Catch:{ all -> 0x00b5 }
            r6.flush()     // Catch:{ all -> 0x00b5 }
            goto L_0x006e
        L_0x007e:
            r6.close()
            r5.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x008b
        L_0x0085:
            r12 = move-exception
            com.amazonaws.logging.Log r4 = LOGGER
            r4.error(r0, r12)
        L_0x008b:
            java.io.File r12 = r11.recordFile
            boolean r12 = r12.delete()
            if (r12 == 0) goto L_0x00af
            java.io.File r12 = r11.recordFile
            boolean r12 = r2.renameTo(r12)
            if (r12 == 0) goto L_0x00af
            boolean r12 = r3.exists()
            if (r12 == 0) goto L_0x00e5
            boolean r12 = r3.delete()
            if (r12 != 0) goto L_0x00e5
            com.amazonaws.logging.Log r12 = LOGGER
            java.lang.String r0 = "Failed to delete temp file"
            r12.error(r0)
            goto L_0x00e5
        L_0x00af:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r1)
            throw r12
        L_0x00b5:
            r12 = move-exception
            r4 = r6
            goto L_0x00bc
        L_0x00b8:
            r12 = move-exception
            goto L_0x00bc
        L_0x00ba:
            r12 = move-exception
            r5 = r4
        L_0x00bc:
            if (r4 == 0) goto L_0x00c1
            r4.close()
        L_0x00c1:
            if (r5 == 0) goto L_0x00cd
            r5.close()     // Catch:{ IOException -> 0x00c7 }
            goto L_0x00cd
        L_0x00c7:
            r3 = move-exception
            com.amazonaws.logging.Log r4 = LOGGER
            r4.error(r0, r3)
        L_0x00cd:
            java.io.File r0 = r11.recordFile
            boolean r0 = r0.delete()
            if (r0 == 0) goto L_0x00df
            java.io.File r0 = r11.recordFile
            boolean r0 = r2.renameTo(r0)
            if (r0 != 0) goto L_0x00de
            goto L_0x00df
        L_0x00de:
            throw r12
        L_0x00df:
            java.io.IOException r12 = new java.io.IOException
            r12.<init>(r1)
            throw r12
        L_0x00e5:
            java.io.File r12 = r11.recordFile
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.FileRecordStore.deleteReadRecords(int):java.io.File");
    }

    private void tryCreateRecordsFile() throws IOException {
        File file = this.recordFile;
        if (file == null || !file.exists()) {
            synchronized (this) {
                File file2 = this.recordFile;
                if (file2 == null || !file2.exists()) {
                    this.recordFile = this.fileManager.createFile(new File(this.fileManager.createDirectory(Constants.RECORDS_DIRECTORY), this.recordFileName));
                }
            }
        }
    }

    private BufferedWriter tryInitializeWriter() throws IOException {
        tryCreateRecordsFile();
        return new BufferedWriter(new OutputStreamWriter(this.fileManager.newOutputStream(this.recordFile, true), StringUtils.UTF8));
    }

    public long getFileSize() {
        File file = this.recordFile;
        if (file == null) {
            return 0;
        }
        return file.length();
    }

    public RecordIterator iterator() {
        return new RecordIterator();
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean put(java.lang.String r7) throws java.io.IOException {
        /*
            r6 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r6.accessLock
            r0.lock()
            java.io.BufferedWriter r0 = r6.tryInitializeWriter()     // Catch:{ all -> 0x0037 }
            java.io.File r1 = r6.recordFile     // Catch:{ all -> 0x0035 }
            long r1 = r1.length()     // Catch:{ all -> 0x0035 }
            java.nio.charset.Charset r3 = com.amazonaws.util.StringUtils.UTF8     // Catch:{ all -> 0x0035 }
            byte[] r3 = r7.getBytes(r3)     // Catch:{ all -> 0x0035 }
            int r3 = r3.length     // Catch:{ all -> 0x0035 }
            long r3 = (long) r3     // Catch:{ all -> 0x0035 }
            long r1 = r1 + r3
            long r3 = r6.maxStorageSize     // Catch:{ all -> 0x0035 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0029
            r0.write(r7)     // Catch:{ all -> 0x0035 }
            r0.newLine()     // Catch:{ all -> 0x0035 }
            r0.flush()     // Catch:{ all -> 0x0035 }
            r7 = 1
            goto L_0x002a
        L_0x0029:
            r7 = 0
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            r0.close()
        L_0x002f:
            java.util.concurrent.locks.ReentrantLock r0 = r6.accessLock
            r0.unlock()
            return r7
        L_0x0035:
            r7 = move-exception
            goto L_0x0039
        L_0x0037:
            r7 = move-exception
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x003e
            r0.close()
        L_0x003e:
            java.util.concurrent.locks.ReentrantLock r0 = r6.accessLock
            r0.unlock()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.mobileconnectors.kinesis.kinesisrecorder.FileRecordStore.put(java.lang.String):boolean");
    }
}
