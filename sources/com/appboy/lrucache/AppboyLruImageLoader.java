package com.appboy.lrucache;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LruCache;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.appboy.Constants;
import com.appboy.R$string;
import com.appboy.models.IInAppMessage;
import com.appboy.models.cards.Card;
import com.appboy.support.AppboyFileUtils;
import com.appboy.support.AppboyImageUtils;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.braze.enums.BrazeViewBounds;
import com.braze.images.DefaultBrazeImageLoader;
import com.braze.images.IBrazeImageLoader;
import java.io.File;
import p001a0.C0016g;
import p030bo.app.C1529b;
import p030bo.app.C1593h1;
import p304x.C7087p;

@Deprecated
@Keep
public class AppboyLruImageLoader implements IBrazeImageLoader {
    public static final String APPBOY_LRU_CACHE_FOLDER = "appboy.imageloader.lru.cache";
    public static final int DISK_CACHE_SIZE = 52428800;
    public static final String IMAGE_LOADER_THREAD_POOL_IDENTIFIER = "braze.imageloader.lru.threadpool";
    public static final String TAG = AppboyLogger.getBrazeLogTag(DefaultBrazeImageLoader.class);
    public final C1593h1 mBackgroundTaskExecutor;
    public final Object mDiskCacheLock = new Object();
    public boolean mDiskCacheStarting = true;
    public C1529b mDiskLruCache;
    public boolean mIsOffline = false;
    public final LruCache<String, Bitmap> mMemoryCache = new C1978a(this, AppboyImageUtils.getImageLoaderCacheSize());

    /* renamed from: com.appboy.lrucache.AppboyLruImageLoader$a */
    public class C1978a extends LruCache<String, Bitmap> {
        public C1978a(AppboyLruImageLoader appboyLruImageLoader, int i) {
            super(i);
        }

        /* renamed from: a */
        public int sizeOf(String str, Bitmap bitmap) {
            return bitmap.getByteCount();
        }
    }

    /* renamed from: com.appboy.lrucache.AppboyLruImageLoader$b */
    public class C1979b implements Runnable {

        /* renamed from: a */
        public final File f6836a;

        public /* synthetic */ C1979b(AppboyLruImageLoader appboyLruImageLoader, File file, C1978a aVar) {
            this(file);
        }

        public void run() {
            synchronized (AppboyLruImageLoader.this.mDiskCacheLock) {
                try {
                    AppboyLogger.m5448d(AppboyLruImageLoader.TAG, "Initializing disk cache");
                    C1529b unused = AppboyLruImageLoader.this.mDiskLruCache = new C1529b(this.f6836a, 1, 1, 52428800);
                    AppboyLogger.m5448d(AppboyLruImageLoader.TAG, "Disk cache initialized");
                } catch (Exception e) {
                    AppboyLogger.m5452e(AppboyLruImageLoader.TAG, "Caught exception creating new disk cache. Unable to create new disk cache", e);
                }
                boolean unused2 = AppboyLruImageLoader.this.mDiskCacheStarting = false;
                AppboyLruImageLoader.this.mDiskCacheLock.notifyAll();
            }
        }

        public C1979b(File file) {
            this.f6836a = file;
        }
    }

    /* renamed from: com.appboy.lrucache.AppboyLruImageLoader$c */
    public class C1980c implements Runnable {

        /* renamed from: a */
        public final ImageView f6838a;

        /* renamed from: b */
        public final Context f6839b;

        /* renamed from: c */
        public final BrazeViewBounds f6840c;

        /* renamed from: d */
        public final String f6841d;

        public /* synthetic */ C1980c(AppboyLruImageLoader appboyLruImageLoader, Context context, ImageView imageView, BrazeViewBounds brazeViewBounds, String str, C1978a aVar) {
            this(context, imageView, brazeViewBounds, str);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public /* synthetic */ void m5444a(Bitmap bitmap) {
            if (((String) this.f6838a.getTag(R$string.com_appboy_image_lru_cache_image_url_key)).equals(this.f6841d)) {
                this.f6838a.setImageBitmap(bitmap);
                if (this.f6840c == BrazeViewBounds.BASE_CARD_VIEW) {
                    AppboyImageUtils.resizeImageViewToBitmapDimensions(bitmap, this.f6838a);
                }
            }
        }

        public void run() {
            TrafficStats.setThreadStatsTag(Constants.TRAFFIC_STATS_THREAD_TAG);
            Bitmap bitmapFromUrl = AppboyLruImageLoader.this.getBitmapFromUrl(this.f6839b, this.f6841d, this.f6840c);
            if (bitmapFromUrl == null) {
                String access$300 = AppboyLruImageLoader.TAG;
                StringBuilder k = C13555b.m33972k("Failed to retrieve bitmap from url: ");
                k.append(this.f6841d);
                AppboyLogger.m5448d(access$300, k.toString());
                return;
            }
            new Handler(Looper.getMainLooper()).post(new C7087p(8, this, bitmapFromUrl));
        }

        public C1980c(Context context, ImageView imageView, BrazeViewBounds brazeViewBounds, String str) {
            this.f6838a = imageView;
            this.f6839b = context;
            this.f6840c = brazeViewBounds;
            this.f6841d = str;
            imageView.setTag(R$string.com_appboy_image_lru_cache_image_url_key, str);
        }
    }

    public AppboyLruImageLoader(Context context) {
        File diskCacheDir = getDiskCacheDir(context, APPBOY_LRU_CACHE_FOLDER);
        C1593h1 h1Var = new C1593h1(IMAGE_LOADER_THREAD_POOL_IDENTIFIER);
        this.mBackgroundTaskExecutor = h1Var;
        h1Var.execute(new C1979b(this, diskCacheDir, (C1978a) null));
    }

    public static void deleteStoredData(Context context) {
        try {
            File file = new File(context.getCacheDir(), APPBOY_LRU_CACHE_FOLDER);
            String str = TAG;
            AppboyLogger.m5457v(str, "Deleting lru image cache directory at: " + file.getAbsolutePath());
            AppboyFileUtils.deleteFileOrDirectory(file);
        } catch (Throwable th) {
            AppboyLogger.m5452e(TAG, "Failed to delete stored data in image loader", th);
        }
    }

    public static File getDiskCacheDir(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir().getPath());
        return new File(C0016g.m31o(sb, File.separator, str));
    }

    private void putBitmapIntoMemCache(String str, Bitmap bitmap) {
        this.mMemoryCache.put(str, bitmap);
    }

    private void renderUrlIntoView(Context context, String str, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        if (context == null) {
            AppboyLogger.m5448d(TAG, "Cannot retrieve bitmap with null context");
        } else if (imageView == null) {
            AppboyLogger.m5448d(TAG, "Cannot retrieve bitmap with null imageView");
        } else if (StringUtils.isNullOrBlank(str)) {
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Cannot retrieve bitmap with null or blank image url: " + str);
        } else {
            try {
                this.mBackgroundTaskExecutor.execute(new C1980c(this, context, imageView, brazeViewBounds, str, (C1978a) null));
            } catch (Throwable th) {
                String str3 = TAG;
                AppboyLogger.m5452e(str3, "Failed to render url into view. Url: " + str, th);
            }
        }
    }

    public Bitmap downloadBitmapFromUrl(Context context, Uri uri, BrazeViewBounds brazeViewBounds) {
        return AppboyImageUtils.getBitmap(context, uri, brazeViewBounds);
    }

    public Bitmap getBitmapFromCache(String str) {
        Bitmap bitmap = this.mMemoryCache.get(str);
        if (bitmap != null) {
            String str2 = TAG;
            StringBuilder l = C13555b.m33973l("Got bitmap from mem cache for key ", str, "\nMemory cache stats: ");
            l.append(this.mMemoryCache);
            AppboyLogger.m5457v(str2, l.toString());
            return bitmap;
        }
        Bitmap bitmapFromDiskCache = getBitmapFromDiskCache(str);
        if (bitmapFromDiskCache != null) {
            String str3 = TAG;
            AppboyLogger.m5457v(str3, "Got bitmap from disk cache for key " + str);
            putBitmapIntoMemCache(str, bitmapFromDiskCache);
            return bitmapFromDiskCache;
        }
        String str4 = TAG;
        AppboyLogger.m5448d(str4, "No cache hit for bitmap: " + str);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap getBitmapFromDiskCache(java.lang.String r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.mDiskCacheLock
            monitor-enter(r0)
            boolean r1 = r5.mDiskCacheStarting     // Catch:{ all -> 0x004a }
            r2 = 0
            if (r1 == 0) goto L_0x0020
            java.lang.String r1 = TAG     // Catch:{ all -> 0x004a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r3.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r4 = "Disk cache still starting. Cannot retrieve key from disk cache: "
            r3.append(r4)     // Catch:{ all -> 0x004a }
            r3.append(r6)     // Catch:{ all -> 0x004a }
            java.lang.String r6 = r3.toString()     // Catch:{ all -> 0x004a }
            com.appboy.support.AppboyLogger.m5457v(r1, r6)     // Catch:{ all -> 0x004a }
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x0020:
            bo.app.b r1 = r5.mDiskLruCache     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0048
            boolean r1 = r1.mo5904a(r6)     // Catch:{ all -> 0x004a }
            if (r1 == 0) goto L_0x0048
            java.lang.String r1 = TAG     // Catch:{ all -> 0x004a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r2.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r3 = "Getting bitmap from disk cache for key: "
            r2.append(r3)     // Catch:{ all -> 0x004a }
            r2.append(r6)     // Catch:{ all -> 0x004a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x004a }
            com.appboy.support.AppboyLogger.m5457v(r1, r2)     // Catch:{ all -> 0x004a }
            bo.app.b r1 = r5.mDiskLruCache     // Catch:{ all -> 0x004a }
            android.graphics.Bitmap r6 = r1.mo5905b(r6)     // Catch:{ all -> 0x004a }
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r6
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            return r2
        L_0x004a:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004a }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.lrucache.AppboyLruImageLoader.getBitmapFromDiskCache(java.lang.String):android.graphics.Bitmap");
    }

    public Bitmap getBitmapFromMemCache(String str) {
        return this.mMemoryCache.get(str);
    }

    public Bitmap getBitmapFromUrl(Context context, String str, BrazeViewBounds brazeViewBounds) {
        if (context == null) {
            AppboyLogger.m5448d(TAG, "Cannot retrieve bitmap with null context");
            return null;
        } else if (StringUtils.isNullOrBlank(str)) {
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Cannot retrieve bitmap with null or blank image url: " + str);
            return null;
        } else {
            try {
                Bitmap bitmapFromCache = getBitmapFromCache(str);
                if (bitmapFromCache != null) {
                    return bitmapFromCache;
                }
                if (this.mIsOffline) {
                    AppboyLogger.m5448d(TAG, "Cache is currently in offline mode. Not downloading bitmap.");
                    return null;
                }
                Uri parse = Uri.parse(str);
                Bitmap downloadBitmapFromUrl = downloadBitmapFromUrl(context, parse, brazeViewBounds);
                if (downloadBitmapFromUrl != null) {
                    putBitmapIntoCache(str, downloadBitmapFromUrl, AppboyFileUtils.isLocalUri(parse));
                }
                return downloadBitmapFromUrl;
            } catch (Throwable th) {
                String str3 = TAG;
                AppboyLogger.m5452e(str3, "Failed to get bitmap from url. Url: " + str, th);
                return null;
            }
        }
    }

    public Bitmap getInAppMessageBitmapFromUrl(Context context, IInAppMessage iInAppMessage, String str, BrazeViewBounds brazeViewBounds) {
        return getBitmapFromUrl(context, str, brazeViewBounds);
    }

    public LruCache<String, Bitmap> getMemoryCache() {
        return this.mMemoryCache;
    }

    public Bitmap getPushBitmapFromUrl(Context context, Bundle bundle, String str, BrazeViewBounds brazeViewBounds) {
        return getBitmapFromUrl(context, str, brazeViewBounds);
    }

    public boolean isDiskCacheStarting() {
        return this.mDiskCacheStarting;
    }

    public void putBitmapIntoCache(String str, Bitmap bitmap, boolean z) {
        if (getBitmapFromMemCache(str) == null) {
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Adding bitmap to mem cache for key " + str);
            this.mMemoryCache.put(str, bitmap);
        }
        if (z) {
            String str3 = TAG;
            AppboyLogger.m5448d(str3, "Skipping disk cache for key: " + str);
            return;
        }
        synchronized (this.mDiskCacheLock) {
            C1529b bVar = this.mDiskLruCache;
            if (bVar != null && !bVar.mo5904a(str)) {
                String str4 = TAG;
                AppboyLogger.m5448d(str4, "Adding bitmap to disk cache for key " + str);
                this.mDiskLruCache.mo5903a(str, bitmap);
            }
        }
    }

    public void renderUrlIntoCardView(Context context, Card card, String str, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        renderUrlIntoView(context, str, imageView, brazeViewBounds);
    }

    public void renderUrlIntoInAppMessageView(Context context, IInAppMessage iInAppMessage, String str, ImageView imageView, BrazeViewBounds brazeViewBounds) {
        renderUrlIntoView(context, str, imageView, brazeViewBounds);
    }

    public void setOffline(boolean z) {
        String str;
        String str2 = TAG;
        StringBuilder k = C13555b.m33972k("Appboy image loader outbound network requests are now ");
        if (z) {
            str = "disabled";
        } else {
            str = "enabled";
        }
        k.append(str);
        AppboyLogger.m5453i(str2, k.toString());
        this.mIsOffline = z;
    }
}
