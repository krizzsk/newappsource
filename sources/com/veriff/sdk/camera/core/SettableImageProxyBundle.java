package com.veriff.sdk.camera.core;

import android.util.SparseArray;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.impl.ImageProxyBundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p358af.C13437d;
import p695od.C18728c;

final class SettableImageProxyBundle implements ImageProxyBundle {
    private final List<Integer> mCaptureIdList;
    private boolean mClosed = false;
    public final SparseArray<CallbackToFutureAdapter.C0673a<ImageProxy>> mCompleters = new SparseArray<>();
    private final SparseArray<C18728c<ImageProxy>> mFutureResults = new SparseArray<>();
    public final Object mLock = new Object();
    private final List<ImageProxy> mOwnedImageProxies = new ArrayList();
    private String mTagBundleKey;

    public SettableImageProxyBundle(List<Integer> list, String str) {
        this.mCaptureIdList = list;
        this.mTagBundleKey = str;
        setup();
    }

    private void setup() {
        synchronized (this.mLock) {
            for (Integer intValue : this.mCaptureIdList) {
                final int intValue2 = intValue.intValue();
                this.mFutureResults.put(intValue2, CallbackToFutureAdapter.m1884a(new CallbackToFutureAdapter.C0674b<ImageProxy>() {
                    public Object attachCompleter(CallbackToFutureAdapter.C0673a<ImageProxy> aVar) {
                        synchronized (SettableImageProxyBundle.this.mLock) {
                            SettableImageProxyBundle.this.mCompleters.put(intValue2, aVar);
                        }
                        return C13437d.m33707l(C13555b.m33972k("getImageProxy(id: "), intValue2, ")");
                    }
                }));
            }
        }
    }

    public void addImageProxy(ImageProxy imageProxy) {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                Integer num = (Integer) imageProxy.getImageInfo().getTagBundle().getTag(this.mTagBundleKey);
                if (num != null) {
                    CallbackToFutureAdapter.C0673a aVar = this.mCompleters.get(num.intValue());
                    if (aVar != null) {
                        this.mOwnedImageProxies.add(imageProxy);
                        aVar.mo2697b(imageProxy);
                        return;
                    }
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + num);
                }
                throw new IllegalArgumentException("CaptureId is null.");
            }
        }
    }

    public void close() {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                for (ImageProxy close : this.mOwnedImageProxies) {
                    close.close();
                }
                this.mOwnedImageProxies.clear();
                this.mFutureResults.clear();
                this.mCompleters.clear();
                this.mClosed = true;
            }
        }
    }

    public List<Integer> getCaptureIds() {
        return Collections.unmodifiableList(this.mCaptureIdList);
    }

    public C18728c<ImageProxy> getImageProxy(int i) {
        C18728c<ImageProxy> cVar;
        synchronized (this.mLock) {
            if (!this.mClosed) {
                cVar = this.mFutureResults.get(i);
                if (cVar == null) {
                    throw new IllegalArgumentException("ImageProxyBundle does not contain this id: " + i);
                }
            } else {
                throw new IllegalStateException("ImageProxyBundle already closed.");
            }
        }
        return cVar;
    }

    public void reset() {
        synchronized (this.mLock) {
            if (!this.mClosed) {
                for (ImageProxy close : this.mOwnedImageProxies) {
                    close.close();
                }
                this.mOwnedImageProxies.clear();
                this.mFutureResults.clear();
                this.mCompleters.clear();
                setup();
            }
        }
    }
}
