package com.veriff.sdk.camera.core.impl;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.veriff.sdk.camera.core.Logger;
import com.veriff.sdk.camera.core.impl.utils.executor.CameraXExecutors;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import java.util.concurrent.atomic.AtomicInteger;
import p028ba.C1513g;
import p054d0.C4280f0;
import p695od.C18728c;

public abstract class DeferrableSurface {
    private static final boolean DEBUG = Logger.isDebugEnabled("DeferrableSurface");
    public static final Size SIZE_UNDEFINED = new Size(0, 0);
    private static final AtomicInteger TOTAL_COUNT = new AtomicInteger(0);
    private static final AtomicInteger USED_COUNT = new AtomicInteger(0);
    private boolean mClosed;
    private final Object mLock;
    private CallbackToFutureAdapter.C0673a<Void> mTerminationCompleter;
    private final C18728c<Void> mTerminationFuture;
    private int mUseCount;

    public static final class SurfaceClosedException extends Exception {
        public DeferrableSurface mDeferrableSurface;

        public SurfaceClosedException(String str, DeferrableSurface deferrableSurface) {
            super(str);
            this.mDeferrableSurface = deferrableSurface;
        }

        public DeferrableSurface getDeferrableSurface() {
            return this.mDeferrableSurface;
        }
    }

    public static final class SurfaceUnavailableException extends Exception {
        public SurfaceUnavailableException(String str) {
            super(str);
        }
    }

    public DeferrableSurface() {
        this(SIZE_UNDEFINED, 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$0(CallbackToFutureAdapter.C0673a aVar) throws Exception {
        synchronized (this.mLock) {
            this.mTerminationCompleter = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(String str) {
        try {
            this.mTerminationFuture.get();
            printGlobalDebugCounts("Surface terminated", TOTAL_COUNT.decrementAndGet(), USED_COUNT.get());
        } catch (Exception e) {
            Logger.m32241e("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.mLock) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", new Object[]{this, Boolean.valueOf(this.mClosed), Integer.valueOf(this.mUseCount)}), e);
            }
        }
    }

    private void printGlobalDebugCounts(String str, int i, int i2) {
        if (!DEBUG && Logger.isDebugEnabled("DeferrableSurface")) {
            Logger.m32239d("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        Logger.m32239d("DeferrableSurface", str + "[total_surfaces=" + i + ", used_surfaces=" + i2 + "](" + this + "}");
    }

    public final void close() {
        CallbackToFutureAdapter.C0673a<Void> aVar;
        synchronized (this.mLock) {
            if (!this.mClosed) {
                this.mClosed = true;
                if (this.mUseCount == 0) {
                    aVar = this.mTerminationCompleter;
                    this.mTerminationCompleter = null;
                } else {
                    aVar = null;
                }
                if (Logger.isDebugEnabled("DeferrableSurface")) {
                    Logger.m32239d("DeferrableSurface", "surface closed,  useCount=" + this.mUseCount + " closed=true " + this);
                }
            } else {
                aVar = null;
            }
        }
        if (aVar != null) {
            aVar.mo2697b(null);
        }
    }

    public void decrementUseCount() {
        CallbackToFutureAdapter.C0673a<Void> aVar;
        synchronized (this.mLock) {
            int i = this.mUseCount;
            if (i != 0) {
                int i2 = i - 1;
                this.mUseCount = i2;
                if (i2 != 0 || !this.mClosed) {
                    aVar = null;
                } else {
                    aVar = this.mTerminationCompleter;
                    this.mTerminationCompleter = null;
                }
                if (Logger.isDebugEnabled("DeferrableSurface")) {
                    Logger.m32239d("DeferrableSurface", "use count-1,  useCount=" + this.mUseCount + " closed=" + this.mClosed + " " + this);
                    if (this.mUseCount == 0) {
                        printGlobalDebugCounts("Surface no longer in use", TOTAL_COUNT.get(), USED_COUNT.decrementAndGet());
                    }
                }
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
        if (aVar != null) {
            aVar.mo2697b(null);
        }
    }

    public final C18728c<Surface> getSurface() {
        synchronized (this.mLock) {
            if (this.mClosed) {
                C18728c<Surface> immediateFailedFuture = Futures.immediateFailedFuture(new SurfaceClosedException("DeferrableSurface already closed.", this));
                return immediateFailedFuture;
            }
            C18728c<Surface> provideSurface = provideSurface();
            return provideSurface;
        }
    }

    public C18728c<Void> getTerminationFuture() {
        return Futures.nonCancellationPropagating(this.mTerminationFuture);
    }

    public void incrementUseCount() throws SurfaceClosedException {
        synchronized (this.mLock) {
            int i = this.mUseCount;
            if (i == 0) {
                if (this.mClosed) {
                    throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
            }
            this.mUseCount = i + 1;
            if (Logger.isDebugEnabled("DeferrableSurface")) {
                if (this.mUseCount == 1) {
                    printGlobalDebugCounts("New surface in use", TOTAL_COUNT.get(), USED_COUNT.incrementAndGet());
                }
                Logger.m32239d("DeferrableSurface", "use count+1, useCount=" + this.mUseCount + " " + this);
            }
        }
    }

    public abstract C18728c<Surface> provideSurface();

    public DeferrableSurface(Size size, int i) {
        this.mLock = new Object();
        this.mUseCount = 0;
        this.mClosed = false;
        CallbackToFutureAdapter.C0675c a = CallbackToFutureAdapter.m1884a(new C1513g(this, 15));
        this.mTerminationFuture = a;
        if (Logger.isDebugEnabled("DeferrableSurface")) {
            printGlobalDebugCounts("Surface created", TOTAL_COUNT.incrementAndGet(), USED_COUNT.get());
            a.f2322c.addListener(new C4280f0(8, this, Log.getStackTraceString(new Exception())), CameraXExecutors.directExecutor());
        }
    }
}
