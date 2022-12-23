package com.google.android.exoplayer2.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import ce0.C21100e;
import com.appsflyer.internal.referrer.Payload;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import p277ub.C6774a0;
import p277ub.C6776b0;

public final class DummySurface extends Surface {

    /* renamed from: e */
    public static int f14620e;

    /* renamed from: f */
    public static boolean f14621f;

    /* renamed from: b */
    public final boolean f14622b;

    /* renamed from: c */
    public final C4078a f14623c;

    /* renamed from: d */
    public boolean f14624d;

    /* renamed from: com.google.android.exoplayer2.video.DummySurface$a */
    public static class C4078a extends HandlerThread implements Handler.Callback {

        /* renamed from: b */
        public EGLSurfaceTexture f14625b;

        /* renamed from: c */
        public Handler f14626c;

        /* renamed from: d */
        public Error f14627d;

        /* renamed from: e */
        public RuntimeException f14628e;

        /* renamed from: f */
        public DummySurface f14629f;

        public C4078a() {
            super("ExoPlayer:DummySurface");
        }

        /* renamed from: a */
        public final void mo16720a(int i) {
            EGLConfig eGLConfig;
            int[] iArr;
            EGLSurface eGLSurface;
            int[] iArr2;
            this.f14625b.getClass();
            EGLSurfaceTexture eGLSurfaceTexture = this.f14625b;
            eGLSurfaceTexture.getClass();
            boolean z = false;
            EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            if (eglGetDisplay != null) {
                int[] iArr3 = new int[2];
                if (EGL14.eglInitialize(eglGetDisplay, iArr3, 0, iArr3, 1)) {
                    eGLSurfaceTexture.f14611d = eglGetDisplay;
                    EGLConfig[] eGLConfigArr = new EGLConfig[1];
                    int[] iArr4 = new int[1];
                    boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, EGLSurfaceTexture.f14608h, 0, eGLConfigArr, 0, 1, iArr4, 0);
                    if (!eglChooseConfig || iArr4[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                        throw new EGLSurfaceTexture.GlException(C6774a0.m15950j("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]));
                    }
                    EGLDisplay eGLDisplay = eGLSurfaceTexture.f14611d;
                    if (i == 0) {
                        iArr = new int[]{12440, 2, 12344};
                    } else {
                        iArr = new int[]{12440, 2, 12992, 1, 12344};
                    }
                    EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                    if (eglCreateContext != null) {
                        eGLSurfaceTexture.f14612e = eglCreateContext;
                        EGLDisplay eGLDisplay2 = eGLSurfaceTexture.f14611d;
                        if (i == 1) {
                            eGLSurface = EGL14.EGL_NO_SURFACE;
                        } else {
                            if (i == 2) {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                            } else {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                            }
                            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                            if (eGLSurface == null) {
                                throw new EGLSurfaceTexture.GlException("eglCreatePbufferSurface failed");
                            }
                        }
                        if (EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, eglCreateContext)) {
                            eGLSurfaceTexture.f14613f = eGLSurface;
                            GLES20.glGenTextures(1, eGLSurfaceTexture.f14610c, 0);
                            C21100e.m49353n();
                            SurfaceTexture surfaceTexture = new SurfaceTexture(eGLSurfaceTexture.f14610c[0]);
                            eGLSurfaceTexture.f14614g = surfaceTexture;
                            surfaceTexture.setOnFrameAvailableListener(eGLSurfaceTexture);
                            SurfaceTexture surfaceTexture2 = this.f14625b.f14614g;
                            surfaceTexture2.getClass();
                            if (i != 0) {
                                z = true;
                            }
                            this.f14629f = new DummySurface(this, surfaceTexture2, z);
                            return;
                        }
                        throw new EGLSurfaceTexture.GlException("eglMakeCurrent failed");
                    }
                    throw new EGLSurfaceTexture.GlException("eglCreateContext failed");
                }
                throw new EGLSurfaceTexture.GlException("eglInitialize failed");
            }
            throw new EGLSurfaceTexture.GlException("eglGetDisplay failed");
        }

        /* renamed from: b */
        public final void mo16721b() {
            this.f14625b.getClass();
            EGLSurfaceTexture eGLSurfaceTexture = this.f14625b;
            eGLSurfaceTexture.f14609b.removeCallbacks(eGLSurfaceTexture);
            try {
                SurfaceTexture surfaceTexture = eGLSurfaceTexture.f14614g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, eGLSurfaceTexture.f14610c, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = eGLSurfaceTexture.f14611d;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = eGLSurfaceTexture.f14611d;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = eGLSurfaceTexture.f14613f;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(eGLSurfaceTexture.f14611d, eGLSurfaceTexture.f14613f);
                }
                EGLContext eGLContext = eGLSurfaceTexture.f14612e;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLSurfaceTexture.f14611d, eGLContext);
                }
                if (C6774a0.f20959a >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay3 = eGLSurfaceTexture.f14611d;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(eGLSurfaceTexture.f14611d);
                }
                eGLSurfaceTexture.f14611d = null;
                eGLSurfaceTexture.f14612e = null;
                eGLSurfaceTexture.f14613f = null;
                eGLSurfaceTexture.f14614g = null;
            }
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                try {
                    mo16720a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e) {
                    C6776b0.m15968a("Failed to initialize dummy surface", e);
                    this.f14628e = e;
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    try {
                        C6776b0.m15968a("Failed to initialize dummy surface", e2);
                        this.f14627d = e2;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Throwable th) {
                        synchronized (this) {
                            notify();
                            throw th;
                        }
                    }
                }
                return true;
            } else if (i != 2) {
                return true;
            } else {
                try {
                    mo16721b();
                } catch (Throwable th2) {
                    quit();
                    throw th2;
                }
                quit();
                return true;
            }
        }
    }

    public DummySurface(C4078a aVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f14623c = aVar;
        this.f14622b = z;
    }

    /* renamed from: b */
    public static int m10942b(Context context) {
        boolean z;
        String eglQueryString;
        String eglQueryString2;
        int i = C6774a0.f20959a;
        boolean z2 = false;
        if (i >= 24 && ((i >= 26 || (!Payload.SOURCE_SAMSUNG.equals(C6774a0.f20961c) && !"XT1650".equals(C6774a0.f20962d))) && ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString2.contains("EGL_EXT_protected_content")))) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return 0;
        }
        if (i >= 17 && (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains("EGL_KHR_surfaceless_context")) {
            z2 = true;
        }
        if (z2) {
            return 1;
        }
        return 2;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0031  */
    /* renamed from: c */
    public static com.google.android.exoplayer2.video.DummySurface m10943c(android.content.Context r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0023
            java.lang.Class<com.google.android.exoplayer2.video.DummySurface> r2 = com.google.android.exoplayer2.video.DummySurface.class
            monitor-enter(r2)
            boolean r3 = f14621f     // Catch:{ all -> 0x0020 }
            if (r3 != 0) goto L_0x0013
            int r4 = m10942b(r4)     // Catch:{ all -> 0x0020 }
            f14620e = r4     // Catch:{ all -> 0x0020 }
            f14621f = r0     // Catch:{ all -> 0x0020 }
        L_0x0013:
            int r4 = f14620e     // Catch:{ all -> 0x0020 }
            if (r4 == 0) goto L_0x0019
            r4 = 1
            goto L_0x001a
        L_0x0019:
            r4 = 0
        L_0x001a:
            monitor-exit(r2)
            if (r4 == 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            r4 = 0
            goto L_0x0024
        L_0x0020:
            r4 = move-exception
            monitor-exit(r2)
            throw r4
        L_0x0023:
            r4 = 1
        L_0x0024:
            p583jk.C17875h.m44304o(r4)
            com.google.android.exoplayer2.video.DummySurface$a r4 = new com.google.android.exoplayer2.video.DummySurface$a
            r4.<init>()
            if (r5 == 0) goto L_0x0031
            int r5 = f14620e
            goto L_0x0032
        L_0x0031:
            r5 = 0
        L_0x0032:
            r4.start()
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = r4.getLooper()
            r2.<init>(r3, r4)
            r4.f14626c = r2
            com.google.android.exoplayer2.util.EGLSurfaceTexture r3 = new com.google.android.exoplayer2.util.EGLSurfaceTexture
            r3.<init>(r2)
            r4.f14625b = r3
            monitor-enter(r4)
            android.os.Handler r2 = r4.f14626c     // Catch:{ all -> 0x007d }
            android.os.Message r5 = r2.obtainMessage(r0, r5, r1)     // Catch:{ all -> 0x007d }
            r5.sendToTarget()     // Catch:{ all -> 0x007d }
        L_0x0051:
            com.google.android.exoplayer2.video.DummySurface r5 = r4.f14629f     // Catch:{ all -> 0x007d }
            if (r5 != 0) goto L_0x0063
            java.lang.RuntimeException r5 = r4.f14628e     // Catch:{ all -> 0x007d }
            if (r5 != 0) goto L_0x0063
            java.lang.Error r5 = r4.f14627d     // Catch:{ all -> 0x007d }
            if (r5 != 0) goto L_0x0063
            r4.wait()     // Catch:{ InterruptedException -> 0x0061 }
            goto L_0x0051
        L_0x0061:
            r1 = 1
            goto L_0x0051
        L_0x0063:
            monitor-exit(r4)     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x006d
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r5.interrupt()
        L_0x006d:
            java.lang.RuntimeException r5 = r4.f14628e
            if (r5 != 0) goto L_0x007c
            java.lang.Error r5 = r4.f14627d
            if (r5 != 0) goto L_0x007b
            com.google.android.exoplayer2.video.DummySurface r4 = r4.f14629f
            r4.getClass()
            return r4
        L_0x007b:
            throw r5
        L_0x007c:
            throw r5
        L_0x007d:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x007d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.DummySurface.m10943c(android.content.Context, boolean):com.google.android.exoplayer2.video.DummySurface");
    }

    public final void release() {
        super.release();
        synchronized (this.f14623c) {
            if (!this.f14624d) {
                C4078a aVar = this.f14623c;
                aVar.f14626c.getClass();
                aVar.f14626c.sendEmptyMessage(2);
                this.f14624d = true;
            }
        }
    }
}
