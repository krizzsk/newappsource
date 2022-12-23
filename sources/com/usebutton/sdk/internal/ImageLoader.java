package com.usebutton.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.usebutton.sdk.internal.api.ButtonNetworkException;
import com.usebutton.sdk.internal.api.Http;
import com.usebutton.sdk.internal.api.Request;
import com.usebutton.sdk.internal.functional.Getter;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.util.ButtonThreadFactory;
import com.usebutton.sdk.internal.util.Data;
import com.usebutton.sdk.internal.util.DiskLink;
import com.usebutton.sdk.internal.util.MemoryLink;
import com.usebutton.sdk.internal.util.ViewUtils;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ImageLoader {
    private static final int CPU_COUNT;
    private static final String TAG = "ImageLoader";
    private static final Executor THREAD_POOL_EXECUTOR;
    private final MemoryLink mCacheChain;
    private final ThreadLocal<Http> mHttp;
    private final Map<ImageView, Set<WeakReference<AsyncTask>>> mTargetToTaskMap = new WeakHashMap();

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        THREAD_POOL_EXECUTOR = Executors.newFixedThreadPool(Math.min(3, availableProcessors), new ButtonThreadFactory(TAG));
    }

    public ImageLoader(Context context, Getter<Configuration> getter, final Http http) {
        this.mHttp = new ThreadLocal<Http>() {
            public Http initialValue() {
                return new Http(http.getUserAgent());
            }
        };
        this.mCacheChain = new MemoryLink(getter, new DiskLink(context, getter));
    }

    private synchronized void put(ImageView imageView, AsyncTask<Void, Void, Bitmap> asyncTask) {
        Set set = this.mTargetToTaskMap.get(imageView);
        if (set == null) {
            set = new HashSet();
            this.mTargetToTaskMap.put(imageView, set);
        }
        set.add(new WeakReference(asyncTask));
    }

    /* access modifiers changed from: private */
    public synchronized void remove(ImageView imageView, AsyncTask<Void, Void, Bitmap> asyncTask) {
        Set set = this.mTargetToTaskMap.get(imageView);
        if (set != null) {
            set.remove(asyncTask);
        }
    }

    public void execute(AsyncTask<Void, Void, Bitmap> asyncTask) {
        asyncTask.executeOnExecutor(THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public byte[] getImageData(Uri uri) throws ButtonNetworkException {
        Data data;
        synchronized (this.mCacheChain) {
            data = (Data) this.mCacheChain.get(uri);
        }
        if (data != null) {
            return data.mData;
        }
        byte[] requestBitmapData = this.mHttp.get().requestBitmapData(new Request.Get(uri));
        synchronized (this.mCacheChain) {
            this.mCacheChain.put(uri, new Data(requestBitmapData));
        }
        return requestBitmapData;
    }

    public AsyncTask load(Uri uri, ImageView imageView) {
        final int width = (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
        final int height = (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
        final WeakReference weakReference = new WeakReference(imageView);
        final Uri uri2 = uri;
        C122642 r2 = new AsyncTask<Void, Void, Bitmap>() {
            public Bitmap doInBackground(Void... voidArr) {
                try {
                    byte[] imageData = ImageLoader.this.getImageData(uri2);
                    if (isCancelled()) {
                        return null;
                    }
                    return ViewUtils.decodeImageWithin(imageData, width, height);
                } catch (ButtonNetworkException unused) {
                    return null;
                }
            }

            public void onPostExecute(Bitmap bitmap) {
                ImageView imageView = (ImageView) weakReference.get();
                ImageLoader.this.remove(imageView, this);
                if (imageView != null && imageView.getParent() != null && !isCancelled()) {
                    imageView.setImageBitmap(bitmap);
                    ViewUtils.show(imageView);
                }
            }
        };
        put(imageView, r2);
        execute(r2);
        return r2;
    }

    public synchronized void stop(ImageView imageView) {
        Set<WeakReference> set = this.mTargetToTaskMap.get(imageView);
        if (set != null) {
            for (WeakReference weakReference : set) {
                if (weakReference.get() != null) {
                    ((AsyncTask) weakReference.get()).cancel(false);
                }
            }
            set.clear();
            this.mTargetToTaskMap.remove(imageView);
        }
    }
}
