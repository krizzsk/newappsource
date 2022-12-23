package com.veriff.sdk.camera.core.impl;

import android.util.Size;
import android.view.Surface;
import com.veriff.sdk.camera.core.impl.utils.futures.Futures;
import p695od.C18728c;

public final class ImmediateSurface extends DeferrableSurface {
    private final Surface mSurface;

    public ImmediateSurface(Surface surface, Size size, int i) {
        super(size, i);
        this.mSurface = surface;
    }

    public C18728c<Surface> provideSurface() {
        return Futures.immediateFuture(this.mSurface);
    }

    public ImmediateSurface(Surface surface) {
        this.mSurface = surface;
    }
}
