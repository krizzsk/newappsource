package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: h */
    public static final int[] f14608h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b */
    public final Handler f14609b;

    /* renamed from: c */
    public final int[] f14610c = new int[1];

    /* renamed from: d */
    public EGLDisplay f14611d;

    /* renamed from: e */
    public EGLContext f14612e;

    /* renamed from: f */
    public EGLSurface f14613f;

    /* renamed from: g */
    public SurfaceTexture f14614g;

    public static final class GlException extends RuntimeException {
        public GlException(String str) {
            super(str);
        }
    }

    public EGLSurfaceTexture(Handler handler) {
        this.f14609b = handler;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f14609b.post(this);
    }

    public final void run() {
        SurfaceTexture surfaceTexture = this.f14614g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
