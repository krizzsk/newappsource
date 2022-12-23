package com.usebutton.sdk.internal.util;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import com.usebutton.sdk.internal.functional.Getter;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class DiskLink extends ResourceLink<Uri, Data> {
    private static final int APP_VERSION = 1;
    public static final int BUFFER_SIZE = 4096;
    private static final long FLUSH_INTERVAL = TimeUnit.SECONDS.toMillis(2);
    public static final int INDEX_IMAGE = 0;
    private static final String TAG = "DiskLink";
    private final File mCacheDir;
    private final Getter<Configuration> mConfiguration;
    private Runnable mDoFlush = new Runnable() {
        public void run() {
            try {
                DiskLruCache access$000 = DiskLink.this.getStore();
                if (access$000 != null) {
                    access$000.flush();
                    ButtonLog.info(DiskLink.TAG, "Flushed cache to disk.");
                }
            } catch (IOException e) {
                ButtonLog.warn(DiskLink.TAG, "Cache flush failed", e);
            }
        }
    };
    private final Handler mHandler = new Handler();
    private int mMaxItemSize;
    private DiskLruCache mStore;

    public DiskLink(Context context, Getter<Configuration> getter) {
        this.mCacheDir = context.getCacheDir();
        this.mConfiguration = getter;
    }

    private String getKey(Uri uri) {
        return ButtonUtil.md5(uri.toString());
    }

    /* access modifiers changed from: private */
    public DiskLruCache getStore() {
        if (this.mStore == null) {
            Configuration configuration = this.mConfiguration.get();
            try {
                this.mStore = DiskLruCache.open(new File(this.mCacheDir, "com.usebutton.assets"), 1, 1, (long) configuration.getParameters().getCacheImageGlobalSizeBytes());
            } catch (IOException e) {
                ButtonLog.warn(TAG, "Couldn't create cache.", e);
            }
            this.mMaxItemSize = configuration.getParameters().getCacheImageMaxSizeBytes();
        }
        return this.mStore;
    }

    private void scheduleFlush() {
        this.mHandler.removeCallbacks(this.mDoFlush);
        this.mHandler.postDelayed(this.mDoFlush, FLUSH_INTERVAL);
    }

    public synchronized int size() {
        int i;
        DiskLruCache store = getStore();
        if (store != null) {
            i = (int) store.size();
        } else {
            i = 0;
        }
        return i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.usebutton.sdk.internal.util.DiskLruCache} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.usebutton.sdk.internal.util.DiskLruCache} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.usebutton.sdk.internal.util.DiskLruCache} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.usebutton.sdk.internal.util.DiskLruCache} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.usebutton.sdk.internal.util.DiskLruCache} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: com.usebutton.sdk.internal.util.DiskLruCache} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.usebutton.sdk.internal.util.DiskLruCache} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: com.usebutton.sdk.internal.util.DiskLruCache} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: com.usebutton.sdk.internal.util.DiskLruCache} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: com.usebutton.sdk.internal.util.DiskLruCache} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: com.usebutton.sdk.internal.util.DiskLruCache} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.usebutton.sdk.internal.util.DiskLruCache} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.usebutton.sdk.internal.util.Data doGet(android.net.Uri r8) {
        /*
            r7 = this;
            java.lang.String r0 = "DiskLink"
            com.usebutton.sdk.internal.util.DiskLruCache r1 = r7.getStore()
            r2 = 0
            if (r1 == 0) goto L_0x0095
            boolean r3 = r1.isClosed()
            if (r3 == 0) goto L_0x0011
            goto L_0x0095
        L_0x0011:
            java.lang.String r3 = r7.getKey(r8)     // Catch:{ IOException -> 0x0075, OutOfMemoryError -> 0x005e, all -> 0x005c }
            com.usebutton.sdk.internal.util.DiskLruCache$Snapshot r1 = r1.get(r3)     // Catch:{ IOException -> 0x0075, OutOfMemoryError -> 0x005e, all -> 0x005c }
            if (r1 != 0) goto L_0x001f
            com.usebutton.sdk.internal.util.DiskLruCache.closeQuietly(r2)
            return r2
        L_0x001f:
            r3 = 0
            java.io.InputStream r1 = r1.getInputStream(r3)     // Catch:{ IOException -> 0x0075, OutOfMemoryError -> 0x005e, all -> 0x005c }
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x005a, OutOfMemoryError -> 0x0058 }
            r4.<init>()     // Catch:{ IOException -> 0x005a, OutOfMemoryError -> 0x0058 }
            r5 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x005a, OutOfMemoryError -> 0x0058 }
        L_0x002d:
            int r6 = r1.read(r5)     // Catch:{ IOException -> 0x005a, OutOfMemoryError -> 0x0058 }
            if (r6 >= 0) goto L_0x0054
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x005a, OutOfMemoryError -> 0x0058 }
            r3.<init>()     // Catch:{ IOException -> 0x005a, OutOfMemoryError -> 0x0058 }
            java.lang.String r5 = "Get hit for image: "
            r3.append(r5)     // Catch:{ IOException -> 0x005a, OutOfMemoryError -> 0x0058 }
            r3.append(r8)     // Catch:{ IOException -> 0x005a, OutOfMemoryError -> 0x0058 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x005a, OutOfMemoryError -> 0x0058 }
            com.usebutton.sdk.internal.util.ButtonLog.info(r0, r3)     // Catch:{ IOException -> 0x005a, OutOfMemoryError -> 0x0058 }
            com.usebutton.sdk.internal.util.Data r3 = new com.usebutton.sdk.internal.util.Data     // Catch:{ IOException -> 0x005a, OutOfMemoryError -> 0x0058 }
            byte[] r4 = r4.toByteArray()     // Catch:{ IOException -> 0x005a, OutOfMemoryError -> 0x0058 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x005a, OutOfMemoryError -> 0x0058 }
            com.usebutton.sdk.internal.util.DiskLruCache.closeQuietly(r1)
            return r3
        L_0x0054:
            r4.write(r5, r3, r6)     // Catch:{ IOException -> 0x005a, OutOfMemoryError -> 0x0058 }
            goto L_0x002d
        L_0x0058:
            r3 = move-exception
            goto L_0x0060
        L_0x005a:
            r3 = move-exception
            goto L_0x0077
        L_0x005c:
            r8 = move-exception
            goto L_0x0091
        L_0x005e:
            r3 = move-exception
            r1 = r2
        L_0x0060:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r4.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "Ran out of memory while reading asset for url: "
            r4.append(r5)     // Catch:{ all -> 0x008f }
            r4.append(r8)     // Catch:{ all -> 0x008f }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x008f }
            com.usebutton.sdk.internal.util.ButtonLog.warn(r0, r8, r3)     // Catch:{ all -> 0x008f }
            goto L_0x008b
        L_0x0075:
            r3 = move-exception
            r1 = r2
        L_0x0077:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r4.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "Exception while reading cached value for "
            r4.append(r5)     // Catch:{ all -> 0x008f }
            r4.append(r8)     // Catch:{ all -> 0x008f }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x008f }
            com.usebutton.sdk.internal.util.ButtonLog.warn(r0, r8, r3)     // Catch:{ all -> 0x008f }
        L_0x008b:
            com.usebutton.sdk.internal.util.DiskLruCache.closeQuietly(r1)
            return r2
        L_0x008f:
            r8 = move-exception
            r2 = r1
        L_0x0091:
            com.usebutton.sdk.internal.util.DiskLruCache.closeQuietly(r2)
            throw r8
        L_0x0095:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.util.DiskLink.doGet(android.net.Uri):com.usebutton.sdk.internal.util.Data");
    }

    public void doPut(Uri uri, Data data) {
        DiskLruCache store = getStore();
        if (data != null && data.mData != null && store != null && !store.isClosed()) {
            byte[] bArr = data.mData;
            if (bArr.length > this.mMaxItemSize) {
                ButtonLog.info(TAG, String.format(Locale.US, "Rejecting %d bytes for %s, greater than per item limit %d bytes.", new Object[]{Integer.valueOf(bArr.length), uri, Integer.valueOf(this.mMaxItemSize)}));
                return;
            }
            try {
                String key = getKey(uri);
                DiskLruCache.Snapshot snapshot = store.get(key);
                if (snapshot == null) {
                    Editor edit = store.edit(key);
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(edit.newOutputStream(0));
                    bufferedOutputStream.write(data.mData);
                    bufferedOutputStream.close();
                    edit.commit();
                    scheduleFlush();
                    ButtonLog.info(TAG, String.format(Locale.US, "Put %d bytes for URL: %s", new Object[]{Integer.valueOf(data.mData.length), uri}));
                    return;
                }
                snapshot.getInputStream(0).close();
            } catch (IOException e) {
                ButtonLog.warn(TAG, "Exception while writing data for " + uri, e);
            }
        }
    }
}
