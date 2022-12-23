package com.usebutton.thirdparty.android.support.p354v4.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ArrayBlockingQueue;
import p229r1.C6236f;

/* renamed from: com.usebutton.thirdparty.android.support.v4.view.AsyncLayoutInflater */
public final class AsyncLayoutInflater {
    private static final String TAG = "AsyncLayoutInflater";
    /* access modifiers changed from: private */
    public Handler mHandler;
    private Handler.Callback mHandlerCallback = new Handler.Callback() {
        public boolean handleMessage(Message message) {
            InflateRequest inflateRequest = (InflateRequest) message.obj;
            if (inflateRequest.view == null) {
                inflateRequest.view = AsyncLayoutInflater.this.mInflater.inflate(inflateRequest.resid, inflateRequest.parent, false);
            }
            inflateRequest.callback.onInflateFinished(inflateRequest.view, inflateRequest.resid, inflateRequest.parent);
            AsyncLayoutInflater.this.mInflateThread.releaseRequest(inflateRequest);
            return true;
        }
    };
    /* access modifiers changed from: private */
    public InflateThread mInflateThread;
    /* access modifiers changed from: private */
    public LayoutInflater mInflater;

    /* renamed from: com.usebutton.thirdparty.android.support.v4.view.AsyncLayoutInflater$BasicInflater */
    public static class BasicInflater extends LayoutInflater {
        private static final String[] sClassPrefixList = {"android.widget.", "android.webkit.", "android.app."};

        public BasicInflater(Context context) {
            super(context);
        }

        public LayoutInflater cloneInContext(Context context) {
            return new BasicInflater(context);
        }

        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            String[] strArr = sClassPrefixList;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                try {
                    View createView = createView(str, strArr[i], attributeSet);
                    if (createView != null) {
                        return createView;
                    }
                    i++;
                } catch (ClassNotFoundException unused) {
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* renamed from: com.usebutton.thirdparty.android.support.v4.view.AsyncLayoutInflater$InflateRequest */
    public static class InflateRequest {
        public OnInflateFinishedListener callback;
        public AsyncLayoutInflater inflater;
        public ViewGroup parent;
        public int resid;
        public View view;

        private InflateRequest() {
        }
    }

    /* renamed from: com.usebutton.thirdparty.android.support.v4.view.AsyncLayoutInflater$InflateThread */
    public static class InflateThread extends Thread {
        private static final InflateThread sInstance;
        private ArrayBlockingQueue<InflateRequest> mQueue = new ArrayBlockingQueue<>(10);
        private C6236f<InflateRequest> mRequestPool = new C6236f<>(10);

        static {
            InflateThread inflateThread = new InflateThread();
            sInstance = inflateThread;
            inflateThread.start();
        }

        private InflateThread() {
        }

        public static InflateThread getInstance() {
            return sInstance;
        }

        public void enqueue(InflateRequest inflateRequest) {
            try {
                this.mQueue.put(inflateRequest);
            } catch (InterruptedException e) {
                throw new RuntimeException("Failed to enqueue async inflate request", e);
            }
        }

        public InflateRequest obtainRequest() {
            InflateRequest b = this.mRequestPool.mo22237b();
            if (b == null) {
                return new InflateRequest();
            }
            return b;
        }

        public void releaseRequest(InflateRequest inflateRequest) {
            inflateRequest.callback = null;
            inflateRequest.inflater = null;
            inflateRequest.parent = null;
            inflateRequest.resid = 0;
            inflateRequest.view = null;
            this.mRequestPool.mo22236a(inflateRequest);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|9|7) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:7:0x0000, LOOP_START, MTH_ENTER_BLOCK, SYNTHETIC, Splitter:B:0:0x0000] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
            L_0x0000:
                java.util.concurrent.ArrayBlockingQueue<com.usebutton.thirdparty.android.support.v4.view.AsyncLayoutInflater$InflateRequest> r0 = r5.mQueue     // Catch:{ InterruptedException -> 0x0000 }
                java.lang.Object r0 = r0.take()     // Catch:{ InterruptedException -> 0x0000 }
                com.usebutton.thirdparty.android.support.v4.view.AsyncLayoutInflater$InflateRequest r0 = (com.usebutton.thirdparty.android.support.p354v4.view.AsyncLayoutInflater.InflateRequest) r0     // Catch:{ InterruptedException -> 0x0000 }
                r1 = 0
                com.usebutton.thirdparty.android.support.v4.view.AsyncLayoutInflater r2 = r0.inflater     // Catch:{ RuntimeException -> 0x0019 }
                android.view.LayoutInflater r2 = r2.mInflater     // Catch:{ RuntimeException -> 0x0019 }
                int r3 = r0.resid     // Catch:{ RuntimeException -> 0x0019 }
                android.view.ViewGroup r4 = r0.parent     // Catch:{ RuntimeException -> 0x0019 }
                android.view.View r2 = r2.inflate(r3, r4, r1)     // Catch:{ RuntimeException -> 0x0019 }
                r0.view = r2     // Catch:{ RuntimeException -> 0x0019 }
            L_0x0019:
                com.usebutton.thirdparty.android.support.v4.view.AsyncLayoutInflater r2 = r0.inflater
                android.os.Handler r2 = r2.mHandler
                android.os.Message r0 = android.os.Message.obtain(r2, r1, r0)
                r0.sendToTarget()
                goto L_0x0000
            */
            throw new UnsupportedOperationException("Method not decompiled: com.usebutton.thirdparty.android.support.p354v4.view.AsyncLayoutInflater.InflateThread.run():void");
        }
    }

    /* renamed from: com.usebutton.thirdparty.android.support.v4.view.AsyncLayoutInflater$OnInflateFinishedListener */
    public interface OnInflateFinishedListener {
        void onInflateFinished(View view, int i, ViewGroup viewGroup);
    }

    public AsyncLayoutInflater(Context context) {
        this.mInflater = new BasicInflater(context);
        this.mHandler = new Handler(this.mHandlerCallback);
        this.mInflateThread = InflateThread.getInstance();
    }

    public void inflate(int i, ViewGroup viewGroup, OnInflateFinishedListener onInflateFinishedListener) {
        if (onInflateFinishedListener != null) {
            InflateRequest obtainRequest = this.mInflateThread.obtainRequest();
            obtainRequest.inflater = this;
            obtainRequest.resid = i;
            obtainRequest.parent = viewGroup;
            obtainRequest.callback = onInflateFinishedListener;
            this.mInflateThread.enqueue(obtainRequest);
            return;
        }
        throw new NullPointerException("callback argument may not be null!");
    }
}
