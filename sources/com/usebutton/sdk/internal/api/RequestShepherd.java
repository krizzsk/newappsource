package com.usebutton.sdk.internal.api;

import android.content.Context;
import com.usebutton.sdk.internal.util.ButtonLog;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class RequestShepherd {
    public static final int CAPACITY = 100;
    private static final Comparator<File> NEWEST_TO_OLDEST_COMPARER = new Comparator<File>() {
        public int compare(File file, File file2) {
            return file.getName().compareTo(file2.getName());
        }
    };
    private static final String REQUEST_FOLDER = "com.usebutton.requests-1";
    private static final String TAG = "RequestShepherd";
    private final Context mContext;
    private final Object mFileSystemLock = new Object();
    private int mNextSequence = 0;
    private File mRequestDir;

    public RequestShepherd(Context context) {
        this.mContext = context.getApplicationContext();
    }

    private void deleteFile(File file) {
        if (file != null) {
            synchronized (this.mFileSystemLock) {
                if (file.exists()) {
                    file.delete();
                }
            }
        }
    }

    private synchronized File getRequestDir() {
        if (this.mRequestDir == null) {
            this.mRequestDir = new File(this.mContext.getCacheDir(), REQUEST_FOLDER);
        }
        if (!this.mRequestDir.exists()) {
            this.mRequestDir.mkdirs();
        }
        return this.mRequestDir;
    }

    private boolean isEmpty(File[] fileArr) {
        return fileArr == null || fileArr.length == 0;
    }

    private File nextRequestFile() {
        File[] listFiles;
        synchronized (this.mFileSystemLock) {
            listFiles = getRequestDir().listFiles();
        }
        if (isEmpty(listFiles)) {
            return null;
        }
        Arrays.sort(listFiles, NEWEST_TO_OLDEST_COMPARER);
        return listFiles[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x003d A[SYNTHETIC, Splitter:B:27:0x003d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String readFile(java.io.File r5) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.Object r0 = r4.mFileSystemLock
            monitor-enter(r0)
            boolean r1 = r5.exists()     // Catch:{ all -> 0x004a }
            r2 = 0
            if (r1 != 0) goto L_0x000c
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x000c:
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x003a }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x003a }
            r3.<init>(r5)     // Catch:{ all -> 0x003a }
            r1.<init>(r3)     // Catch:{ all -> 0x003a }
            java.io.StringWriter r5 = new java.io.StringWriter     // Catch:{ all -> 0x0037 }
            r5.<init>()     // Catch:{ all -> 0x0037 }
        L_0x001b:
            java.lang.String r2 = r1.readLine()     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x0025
            r5.append(r2)     // Catch:{ all -> 0x0037 }
            goto L_0x001b
        L_0x0025:
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0037 }
            r1.close()     // Catch:{ IOException -> 0x002d }
            goto L_0x0035
        L_0x002d:
            r1 = move-exception
            java.lang.String r2 = "RequestShepherd"
            java.lang.String r3 = "Could not close reader."
            com.usebutton.sdk.internal.util.ButtonLog.warn(r2, r3, r1)     // Catch:{ all -> 0x004a }
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r5
        L_0x0037:
            r5 = move-exception
            r2 = r1
            goto L_0x003b
        L_0x003a:
            r5 = move-exception
        L_0x003b:
            if (r2 == 0) goto L_0x0049
            r2.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0049
        L_0x0041:
            r1 = move-exception
            java.lang.String r2 = "RequestShepherd"
            java.lang.String r3 = "Could not close reader."
            com.usebutton.sdk.internal.util.ButtonLog.warn(r2, r3, r1)     // Catch:{ all -> 0x004a }
        L_0x0049:
            throw r5     // Catch:{ all -> 0x004a }
        L_0x004a:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.api.RequestShepherd.readFile(java.io.File):java.lang.String");
    }

    private void trimToCapacity() {
        synchronized (this.mFileSystemLock) {
            File[] listFiles = getRequestDir().listFiles();
            if (!isEmpty(listFiles)) {
                if (listFiles.length >= 100) {
                    Arrays.sort(listFiles, NEWEST_TO_OLDEST_COMPARER);
                    for (int i = 0; i < listFiles.length - 100; i++) {
                        listFiles[i].delete();
                    }
                }
            }
        }
    }

    public File fileForRequest(Request request) {
        return new File(getRequestDir(), request.getRequestId());
    }

    public boolean hasPendingRequests() {
        File[] listFiles;
        synchronized (this.mFileSystemLock) {
            listFiles = getRequestDir().listFiles();
        }
        if (listFiles == null || listFiles.length <= 0) {
            return false;
        }
        return true;
    }

    public void markAsDone(Request request) {
        File fileForRequest = fileForRequest(request);
        deleteFile(fileForRequest);
        ButtonLog.infoFormat(TAG, "Marked request as OK: %s", fileForRequest);
    }

    public Request nextPendingRequest() {
        File nextRequestFile = nextRequestFile();
        if (nextRequestFile == null) {
            return null;
        }
        try {
            String readFile = readFile(nextRequestFile);
            ButtonLog.infoFormat(TAG, "Found persisted request at: %s", nextRequestFile);
            if (readFile == null) {
                deleteFile(nextRequestFile);
            }
            return Request.read(readFile);
        } catch (IOException e) {
            ButtonLog.warn(TAG, "Couldn't read persisted request, will delete.", e);
            deleteFile(nextRequestFile);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0076 A[SYNTHETIC, Splitter:B:34:0x0076] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void watch(com.usebutton.sdk.internal.api.Request r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            int r1 = r7.mNextSequence
            int r2 = r1 + 1
            r7.mNextSequence = r2
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.setRequestId(r0)
            java.io.File r0 = r7.fileForRequest(r8)
            r1 = 0
            java.lang.Object r2 = r7.mFileSystemLock     // Catch:{ IOException -> 0x0063 }
            monitor-enter(r2)     // Catch:{ IOException -> 0x0063 }
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ all -> 0x005e }
            r3.<init>(r0)     // Catch:{ all -> 0x005e }
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ all -> 0x005b }
            r1.<init>()     // Catch:{ all -> 0x005b }
            r8.write(r1)     // Catch:{ all -> 0x005b }
            java.lang.String r8 = r1.toString()     // Catch:{ all -> 0x005b }
            r3.write(r8)     // Catch:{ all -> 0x005b }
            java.lang.String r8 = "RequestShepherd"
            java.lang.String r4 = "Wrote request to: %s %s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x005b }
            r6 = 0
            r5[r6] = r0     // Catch:{ all -> 0x005b }
            r6 = 1
            r5[r6] = r1     // Catch:{ all -> 0x005b }
            com.usebutton.sdk.internal.util.ButtonLog.infoFormat(r8, r4, r5)     // Catch:{ all -> 0x005b }
            monitor-exit(r2)     // Catch:{ all -> 0x005b }
            r7.trimToCapacity()     // Catch:{ IOException -> 0x0058, all -> 0x0055 }
            r3.close()     // Catch:{ IOException -> 0x0073 }
            goto L_0x0073
        L_0x0055:
            r8 = move-exception
            r1 = r3
            goto L_0x0074
        L_0x0058:
            r8 = move-exception
            r1 = r3
            goto L_0x0064
        L_0x005b:
            r8 = move-exception
            r1 = r3
            goto L_0x005f
        L_0x005e:
            r8 = move-exception
        L_0x005f:
            monitor-exit(r2)     // Catch:{ all -> 0x005e }
            throw r8     // Catch:{ IOException -> 0x0063 }
        L_0x0061:
            r8 = move-exception
            goto L_0x0074
        L_0x0063:
            r8 = move-exception
        L_0x0064:
            java.lang.String r2 = "RequestShepherd"
            java.lang.String r3 = "Couldn't write request to disk, not much we can do."
            com.usebutton.sdk.internal.util.ButtonLog.warn(r2, r3, r8)     // Catch:{ all -> 0x0061 }
            r7.deleteFile(r0)     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x0073
            r1.close()     // Catch:{ IOException -> 0x0073 }
        L_0x0073:
            return
        L_0x0074:
            if (r1 == 0) goto L_0x0079
            r1.close()     // Catch:{ IOException -> 0x0079 }
        L_0x0079:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.api.RequestShepherd.watch(com.usebutton.sdk.internal.api.Request):void");
    }
}
