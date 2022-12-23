package com.usebutton.sdk.internal.util;

import android.net.Uri;
import android.util.LruCache;
import com.usebutton.sdk.internal.functional.Getter;
import com.usebutton.sdk.internal.models.Configuration;
import java.util.Locale;

public class MemoryLink extends ResourceLink<Uri, Data> {
    private static final int CACHE_SIZE_BYTES = 1048576;
    private static final String TAG = "MemoryLink";
    private final Getter<Configuration> mConfiguration;
    private int mMaxItemSize;
    private LruCache<Uri, Data> mStore;

    public MemoryLink(Getter<Configuration> getter, ResourceLink resourceLink) {
        super(resourceLink);
        this.mConfiguration = getter;
    }

    private LruCache<Uri, Data> getStore() {
        if (this.mStore == null) {
            this.mStore = new LruCache<Uri, Data>(CACHE_SIZE_BYTES) {
                public int sizeOf(Uri uri, Data data) {
                    byte[] bArr;
                    if (data == null || (bArr = data.mData) == null) {
                        return 0;
                    }
                    return bArr.length;
                }
            };
            this.mMaxItemSize = this.mConfiguration.get().getParameters().getCacheImageMaxSizeBytes();
        }
        return this.mStore;
    }

    public synchronized int size() {
        return getStore().size();
    }

    public Data doGet(Uri uri) {
        return getStore().get(uri);
    }

    public void doPut(Uri uri, Data data) {
        byte[] bArr;
        if (data == null || (bArr = data.mData) == null) {
            getStore().put(uri, data);
        } else if (bArr.length > this.mMaxItemSize) {
            ButtonLog.verbose(TAG, String.format(Locale.US, "Rejecting value for %s since size %d is greater than the per item limit of %d", new Object[]{uri, Integer.valueOf(bArr.length), Integer.valueOf(this.mMaxItemSize)}));
        } else {
            getStore().put(uri, data);
        }
    }
}
