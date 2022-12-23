package com.moovit.commons.view;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import ce0.C21100e;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL10;

public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener, View.OnLayoutChangeListener {

    /* renamed from: n */
    public static final C15796g f41078n = new C15796g();

    /* renamed from: b */
    public final WeakReference<GLTextureView> f41079b = new WeakReference<>(this);

    /* renamed from: c */
    public C15795f f41080c;

    /* renamed from: d */
    public GLSurfaceView.Renderer f41081d;

    /* renamed from: e */
    public boolean f41082e;

    /* renamed from: f */
    public GLSurfaceView.EGLConfigChooser f41083f;

    /* renamed from: g */
    public GLSurfaceView.EGLContextFactory f41084g;

    /* renamed from: h */
    public GLSurfaceView.EGLWindowSurfaceFactory f41085h;

    /* renamed from: i */
    public GLSurfaceView.GLWrapper f41086i;

    /* renamed from: j */
    public int f41087j;

    /* renamed from: k */
    public int f41088k;

    /* renamed from: l */
    public boolean f41089l;

    /* renamed from: m */
    public final ArrayList f41090m = new ArrayList();

    /* renamed from: com.moovit.commons.view.GLTextureView$a */
    public abstract class C15790a implements GLSurfaceView.EGLConfigChooser {

        /* renamed from: a */
        public final int[] f41091a;

        public C15790a(int[] iArr) {
            if (GLTextureView.this.f41088k == 2) {
                int length = iArr.length;
                int[] iArr2 = new int[(length + 2)];
                int i = length - 1;
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr2[i] = 12352;
                iArr2[length] = 4;
                iArr2[length + 1] = 12344;
                iArr = iArr2;
            }
            this.f41091a = iArr;
        }

        public final EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            EGLConfig eGLConfig;
            int[] iArr = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, this.f41091a, (EGLConfig[]) null, 0, iArr)) {
                int i = 0;
                int i2 = iArr[0];
                if (i2 > 0) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[i2];
                    if (egl10.eglChooseConfig(eGLDisplay, this.f41091a, eGLConfigArr, i2, iArr)) {
                        C15791b bVar = (C15791b) this;
                        while (true) {
                            if (i >= i2) {
                                eGLConfig = null;
                                break;
                            }
                            eGLConfig = eGLConfigArr[i];
                            int a = bVar.mo47095a(egl10, eGLDisplay, eGLConfig, 12325);
                            int a2 = bVar.mo47095a(egl10, eGLDisplay, eGLConfig, 12326);
                            if (a >= bVar.f41098h && a2 >= bVar.f41099i) {
                                int a3 = bVar.mo47095a(egl10, eGLDisplay, eGLConfig, 12324);
                                int a4 = bVar.mo47095a(egl10, eGLDisplay, eGLConfig, 12323);
                                int a5 = bVar.mo47095a(egl10, eGLDisplay, eGLConfig, 12322);
                                int a6 = bVar.mo47095a(egl10, eGLDisplay, eGLConfig, 12321);
                                if (a3 == bVar.f41094d && a4 == bVar.f41095e && a5 == bVar.f41096f && a6 == bVar.f41097g) {
                                    break;
                                }
                            }
                            i++;
                        }
                        if (eGLConfig != null) {
                            return eGLConfig;
                        }
                        throw new IllegalArgumentException("No config chosen");
                    }
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                throw new IllegalArgumentException("No configs match configSpec");
            }
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
    }

    /* renamed from: com.moovit.commons.view.GLTextureView$b */
    public class C15791b extends C15790a {

        /* renamed from: c */
        public final int[] f41093c = new int[1];

        /* renamed from: d */
        public int f41094d = 8;

        /* renamed from: e */
        public int f41095e = 8;

        /* renamed from: f */
        public int f41096f = 8;

        /* renamed from: g */
        public int f41097g = 0;

        /* renamed from: h */
        public int f41098h;

        /* renamed from: i */
        public int f41099i;

        public C15791b(int i) {
            super(new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, i, 12326, 0, 12344});
            this.f41098h = i;
            this.f41099i = 0;
        }

        /* renamed from: a */
        public final int mo47095a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.f41093c)) {
                return this.f41093c[0];
            }
            return 0;
        }
    }

    /* renamed from: com.moovit.commons.view.GLTextureView$c */
    public class C15792c implements GLSurfaceView.EGLContextFactory {
        public C15792c() {
        }

        public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int i = GLTextureView.this.f41088k;
            int[] iArr = {12440, i, 12344};
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            if (i == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, eGLContext, iArr);
        }

        public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                throw new RuntimeException(C15794e.m40295c(egl10.eglGetError(), "eglDestroyContext"));
            }
        }
    }

    /* renamed from: com.moovit.commons.view.GLTextureView$d */
    public static class C15793d implements GLSurfaceView.EGLWindowSurfaceFactory {
        public final EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, (int[]) null);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    /* renamed from: com.moovit.commons.view.GLTextureView$e */
    public static class C15794e {

        /* renamed from: a */
        public final WeakReference<GLTextureView> f41102a;

        /* renamed from: b */
        public EGL10 f41103b;

        /* renamed from: c */
        public EGLDisplay f41104c;

        /* renamed from: d */
        public EGLSurface f41105d;

        /* renamed from: e */
        public EGLConfig f41106e;

        /* renamed from: f */
        public EGLContext f41107f;

        public C15794e(WeakReference<GLTextureView> weakReference) {
            C21100e.m49373x(weakReference, "glTextureViewWeakRef");
            this.f41102a = weakReference;
        }

        /* renamed from: c */
        public static String m40295c(int i, String str) {
            return C16759e.m42350f(str, " failed: ", i);
        }

        /* renamed from: a */
        public final boolean mo47100a() {
            if (this.f41103b == null) {
                throw new RuntimeException("egl not initialized");
            } else if (this.f41104c == null) {
                throw new RuntimeException("eglDisplay not initialized");
            } else if (this.f41106e != null) {
                mo47101b();
                GLTextureView gLTextureView = this.f41102a.get();
                if (gLTextureView != null) {
                    this.f41105d = gLTextureView.f41085h.createWindowSurface(this.f41103b, this.f41104c, this.f41106e, gLTextureView.getSurfaceTexture());
                } else {
                    this.f41105d = null;
                }
                EGLSurface eGLSurface = this.f41105d;
                if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                    this.f41103b.eglGetError();
                    return false;
                } else if (this.f41103b.eglMakeCurrent(this.f41104c, eGLSurface, eGLSurface, this.f41107f)) {
                    return true;
                } else {
                    m40295c(this.f41103b.eglGetError(), "eglMakeCurrent");
                    return false;
                }
            } else {
                throw new RuntimeException("eglConfig not initialized");
            }
        }

        /* renamed from: b */
        public final void mo47101b() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f41105d;
            if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                this.f41103b.eglMakeCurrent(this.f41104c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
                GLTextureView gLTextureView = this.f41102a.get();
                if (gLTextureView != null) {
                    gLTextureView.f41085h.destroySurface(this.f41103b, this.f41104c, this.f41105d);
                }
                this.f41105d = null;
            }
        }

        /* renamed from: d */
        public final void mo47102d() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f41103b = egl10;
            EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f41104c = eglGetDisplay;
            if (eglGetDisplay != EGL10.EGL_NO_DISPLAY) {
                if (this.f41103b.eglInitialize(eglGetDisplay, new int[2])) {
                    GLTextureView gLTextureView = this.f41102a.get();
                    if (gLTextureView == null) {
                        this.f41106e = null;
                        this.f41107f = null;
                    } else {
                        EGLConfig chooseConfig = gLTextureView.f41083f.chooseConfig(this.f41103b, this.f41104c);
                        this.f41106e = chooseConfig;
                        this.f41107f = gLTextureView.f41084g.createContext(this.f41103b, this.f41104c, chooseConfig);
                    }
                    EGLContext eGLContext = this.f41107f;
                    if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                        this.f41107f = null;
                        throw new RuntimeException(m40295c(this.f41103b.eglGetError(), "createContext"));
                    } else {
                        this.f41105d = null;
                    }
                } else {
                    throw new RuntimeException("eglInitialize failed");
                }
            } else {
                throw new RuntimeException("eglGetDisplay failed");
            }
        }
    }

    /* renamed from: com.moovit.commons.view.GLTextureView$f */
    public static class C15795f extends Thread {

        /* renamed from: s */
        public static final /* synthetic */ int f41108s = 0;

        /* renamed from: b */
        public boolean f41109b;

        /* renamed from: c */
        public boolean f41110c;

        /* renamed from: d */
        public boolean f41111d;

        /* renamed from: e */
        public boolean f41112e;

        /* renamed from: f */
        public boolean f41113f;

        /* renamed from: g */
        public boolean f41114g;

        /* renamed from: h */
        public boolean f41115h;

        /* renamed from: i */
        public boolean f41116i;

        /* renamed from: j */
        public int f41117j = 0;

        /* renamed from: k */
        public int f41118k = 0;

        /* renamed from: l */
        public int f41119l = 1;

        /* renamed from: m */
        public boolean f41120m = true;

        /* renamed from: n */
        public boolean f41121n;

        /* renamed from: o */
        public final ArrayList<Runnable> f41122o = new ArrayList<>();

        /* renamed from: p */
        public boolean f41123p = true;

        /* renamed from: q */
        public C15794e f41124q;

        /* renamed from: r */
        public final WeakReference<GLTextureView> f41125r;

        public C15795f(WeakReference<GLTextureView> weakReference) {
            C21100e.m49373x(weakReference, "glTextureViewWeakRef");
            this.f41125r = weakReference;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|9|10|19|16|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x000c, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0016 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m40299a(com.moovit.commons.view.GLTextureView.C15795f r2) {
            /*
                r2.getClass()
                com.moovit.commons.view.GLTextureView$g r0 = com.moovit.commons.view.GLTextureView.f41078n
                monitor-enter(r0)
                r1 = 1
                r2.f41109b = r1     // Catch:{ all -> 0x0020 }
                r0.notifyAll()     // Catch:{ all -> 0x0020 }
            L_0x000c:
                boolean r1 = r2.f41110c     // Catch:{ all -> 0x0020 }
                if (r1 != 0) goto L_0x001e
                com.moovit.commons.view.GLTextureView$g r1 = com.moovit.commons.view.GLTextureView.f41078n     // Catch:{ InterruptedException -> 0x0016 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0016 }
                goto L_0x000c
            L_0x0016:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0020 }
                r1.interrupt()     // Catch:{ all -> 0x0020 }
                goto L_0x000c
            L_0x001e:
                monitor-exit(r0)     // Catch:{ all -> 0x0020 }
                return
            L_0x0020:
                r2 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0020 }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.commons.view.GLTextureView.C15795f.m40299a(com.moovit.commons.view.GLTextureView$f):void");
        }

        /* renamed from: b */
        public static void m40300b(C15795f fVar, int i) {
            fVar.getClass();
            if (i < 0 || i > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            C15796g gVar = GLTextureView.f41078n;
            synchronized (gVar) {
                fVar.f41119l = i;
                gVar.notifyAll();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
            r1.f41112e = true;
            r2.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x0137, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:102:0x0138, code lost:
            r3 = r16;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x013f, code lost:
            r8 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:108:0x0140, code lost:
            if (r9 == false) goto L_0x0180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x0142, code lost:
            r2 = r1.f41124q;
            r6 = r2.f41107f.getGL();
            r2 = r2.f41102a.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:110:0x0152, code lost:
            if (r2 == null) goto L_0x0178;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:111:0x0154, code lost:
            r9 = r2.f41086i;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:112:0x0156, code lost:
            if (r9 == null) goto L_0x015c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x0158, code lost:
            r6 = r9.wrap(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:114:0x015c, code lost:
            r2 = r2.f41087j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x0160, code lost:
            if ((r2 & 3) == 0) goto L_0x0178;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:117:0x0164, code lost:
            if ((r2 & 1) == 0) goto L_0x0168;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x0166, code lost:
            r9 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:119:0x0168, code lost:
            r9 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x016b, code lost:
            if ((r2 & 2) == 0) goto L_0x0173;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:122:0x016d, code lost:
            r2 = new com.moovit.commons.view.GLTextureView.C15797h();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:123:0x0173, code lost:
            r2 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:124:0x0174, code lost:
            r6 = android.opengl.GLDebugHelper.wrap(r6, r9, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:125:0x0178, code lost:
            r6 = (javax.microedition.khronos.opengles.GL10) r6;
            r2 = com.moovit.commons.view.GLTextureView.f41078n;
            com.moovit.commons.view.GLTextureView.C15796g.m40306b(r6);
            r9 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:126:0x0180, code lost:
            if (r7 == false) goto L_0x0196;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:127:0x0182, code lost:
            r2 = r1.f41125r.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x018a, code lost:
            if (r2 == null) goto L_0x0195;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:129:0x018c, code lost:
            r2.f41081d.onSurfaceCreated(r6, r1.f41124q.f41106e);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:130:0x0195, code lost:
            r7 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:131:0x0196, code lost:
            if (r10 == false) goto L_0x01a8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:132:0x0198, code lost:
            r2 = r1.f41125r.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:133:0x01a0, code lost:
            if (r2 == null) goto L_0x01a7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:134:0x01a2, code lost:
            r2.f41081d.onSurfaceChanged(r6, r11, r12);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:135:0x01a7, code lost:
            r10 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:136:0x01a8, code lost:
            r2 = r1.f41125r.get();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x01b0, code lost:
            if (r2 == null) goto L_0x01b7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:138:0x01b2, code lost:
            r2.f41081d.onDrawFrame(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:139:0x01b7, code lost:
            r2 = r1.f41124q;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:140:0x01c5, code lost:
            if (r2.f41103b.eglSwapBuffers(r2.f41104c, r2.f41105d) != false) goto L_0x01ce;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x01c7, code lost:
            r0 = r2.f41103b.eglGetError();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:142:0x01ce, code lost:
            r0 = 12288;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:143:0x01d0, code lost:
            if (r0 == 12288) goto L_0x01ed;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:145:0x01d4, code lost:
            if (r0 == 12302) goto L_0x01e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:146:0x01d6, code lost:
            com.moovit.commons.view.GLTextureView.C15794e.m40295c(r0, "eglSwapBuffers");
            r2 = com.moovit.commons.view.GLTextureView.f41078n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x01dd, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:150:?, code lost:
            r1.f41112e = true;
            r2.notifyAll();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:151:0x01e4, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x01e9, code lost:
            r16 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x01ee, code lost:
            if (r13 == false) goto L_0x0138;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x01f0, code lost:
            r3 = r16;
            r4 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x011b, code lost:
            if (r14 == null) goto L_0x0124;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0124, code lost:
            if (r8 == false) goto L_0x0140;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:95:0x012c, code lost:
            if (r1.f41124q.mo47100a() != false) goto L_0x013f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x012e, code lost:
            r2 = com.moovit.commons.view.GLTextureView.f41078n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0130, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Removed duplicated region for block: B:183:0x0103 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x00d2 A[SYNTHETIC, Splitter:B:64:0x00d2] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo47103c() throws java.lang.InterruptedException {
            /*
                r17 = this;
                r1 = r17
                com.moovit.commons.view.GLTextureView$e r0 = new com.moovit.commons.view.GLTextureView$e
                java.lang.ref.WeakReference<com.moovit.commons.view.GLTextureView> r2 = r1.f41125r
                r0.<init>(r2)
                r1.f41124q = r0
                r0 = 0
                r1.f41114g = r0
                r1.f41115h = r0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
            L_0x001b:
                r14 = 0
            L_0x001c:
                com.moovit.commons.view.GLTextureView$g r15 = com.moovit.commons.view.GLTextureView.f41078n     // Catch:{ all -> 0x0205 }
                monitor-enter(r15)     // Catch:{ all -> 0x0205 }
            L_0x001f:
                boolean r2 = r1.f41109b     // Catch:{ all -> 0x0202 }
                if (r2 == 0) goto L_0x0032
                monitor-exit(r15)     // Catch:{ all -> 0x0202 }
                com.moovit.commons.view.GLTextureView$g r2 = com.moovit.commons.view.GLTextureView.f41078n
                monitor-enter(r2)
                r17.mo47106f()     // Catch:{ all -> 0x002f }
                r17.mo47105e()     // Catch:{ all -> 0x002f }
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                return
            L_0x002f:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                throw r0
            L_0x0032:
                java.util.ArrayList<java.lang.Runnable> r2 = r1.f41122o     // Catch:{ all -> 0x0202 }
                boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0202 }
                r0 = 1
                if (r2 != 0) goto L_0x004b
                java.util.ArrayList<java.lang.Runnable> r2 = r1.f41122o     // Catch:{ all -> 0x0202 }
                r14 = 0
                java.lang.Object r2 = r2.remove(r14)     // Catch:{ all -> 0x0202 }
                r14 = r2
                java.lang.Runnable r14 = (java.lang.Runnable) r14     // Catch:{ all -> 0x0202 }
                r16 = r3
                r0 = 0
                r3 = 0
                goto L_0x011a
            L_0x004b:
                boolean r2 = r1.f41116i     // Catch:{ all -> 0x0202 }
                if (r2 == 0) goto L_0x0059
                r17.mo47106f()     // Catch:{ all -> 0x0202 }
                r17.mo47105e()     // Catch:{ all -> 0x0202 }
                r2 = 0
                r1.f41116i = r2     // Catch:{ all -> 0x0202 }
                r5 = 1
            L_0x0059:
                if (r3 == 0) goto L_0x0062
                r17.mo47106f()     // Catch:{ all -> 0x0202 }
                r17.mo47105e()     // Catch:{ all -> 0x0202 }
                r3 = 0
            L_0x0062:
                boolean r2 = r1.f41111d     // Catch:{ all -> 0x0202 }
                if (r2 != 0) goto L_0x007b
                boolean r2 = r1.f41113f     // Catch:{ all -> 0x0202 }
                if (r2 != 0) goto L_0x007b
                boolean r2 = r1.f41115h     // Catch:{ all -> 0x0202 }
                if (r2 == 0) goto L_0x0071
                r17.mo47106f()     // Catch:{ all -> 0x0202 }
            L_0x0071:
                r1.f41113f = r0     // Catch:{ all -> 0x0202 }
                r2 = 0
                r1.f41112e = r2     // Catch:{ all -> 0x0202 }
                com.moovit.commons.view.GLTextureView$g r2 = com.moovit.commons.view.GLTextureView.f41078n     // Catch:{ all -> 0x0202 }
                r2.notifyAll()     // Catch:{ all -> 0x0202 }
            L_0x007b:
                boolean r2 = r1.f41111d     // Catch:{ all -> 0x0202 }
                if (r2 == 0) goto L_0x008b
                boolean r2 = r1.f41113f     // Catch:{ all -> 0x0202 }
                if (r2 == 0) goto L_0x008b
                r2 = 0
                r1.f41113f = r2     // Catch:{ all -> 0x0202 }
                com.moovit.commons.view.GLTextureView$g r2 = com.moovit.commons.view.GLTextureView.f41078n     // Catch:{ all -> 0x0202 }
                r2.notifyAll()     // Catch:{ all -> 0x0202 }
            L_0x008b:
                if (r4 == 0) goto L_0x0096
                r1.f41121n = r0     // Catch:{ all -> 0x0202 }
                com.moovit.commons.view.GLTextureView$g r2 = com.moovit.commons.view.GLTextureView.f41078n     // Catch:{ all -> 0x0202 }
                r2.notifyAll()     // Catch:{ all -> 0x0202 }
                r4 = 0
                r13 = 0
            L_0x0096:
                boolean r2 = r17.mo47104d()     // Catch:{ all -> 0x0202 }
                if (r2 == 0) goto L_0x01f6
                boolean r2 = r1.f41114g     // Catch:{ all -> 0x0202 }
                if (r2 != 0) goto L_0x00ee
                if (r5 == 0) goto L_0x00a7
                r16 = r3
                r3 = 0
                r5 = 0
                goto L_0x00f1
            L_0x00a7:
                com.moovit.commons.view.GLTextureView$g r2 = com.moovit.commons.view.GLTextureView.f41078n     // Catch:{ all -> 0x0202 }
                com.moovit.commons.view.GLTextureView$f r0 = r2.f41129d     // Catch:{ all -> 0x0202 }
                if (r0 == r1) goto L_0x00c8
                if (r0 != 0) goto L_0x00b0
                goto L_0x00c8
            L_0x00b0:
                r16 = r3
                boolean r3 = r2.f41126a     // Catch:{ all -> 0x0202 }
                if (r3 != 0) goto L_0x00b9
                r3 = 1
                r2.f41126a = r3     // Catch:{ all -> 0x0202 }
            L_0x00b9:
                boolean r3 = r2.f41128c     // Catch:{ all -> 0x0202 }
                if (r3 == 0) goto L_0x00be
                goto L_0x00cf
            L_0x00be:
                if (r0 == 0) goto L_0x00c6
                r3 = 1
                r0.f41116i = r3     // Catch:{ all -> 0x0202 }
                r2.notifyAll()     // Catch:{ all -> 0x0202 }
            L_0x00c6:
                r0 = 0
                goto L_0x00d0
            L_0x00c8:
                r16 = r3
                r2.f41129d = r1     // Catch:{ all -> 0x0202 }
                r2.notifyAll()     // Catch:{ all -> 0x0202 }
            L_0x00cf:
                r0 = 1
            L_0x00d0:
                if (r0 == 0) goto L_0x00f0
                com.moovit.commons.view.GLTextureView$e r0 = r1.f41124q     // Catch:{ RuntimeException -> 0x00e0 }
                r0.mo47102d()     // Catch:{ RuntimeException -> 0x00e0 }
                r0 = 1
                r1.f41114g = r0     // Catch:{ all -> 0x0202 }
                r2.notifyAll()     // Catch:{ all -> 0x0202 }
                r3 = 0
                r7 = 1
                goto L_0x00f1
            L_0x00e0:
                r0 = move-exception
                com.moovit.commons.view.GLTextureView$g r2 = com.moovit.commons.view.GLTextureView.f41078n     // Catch:{ all -> 0x0202 }
                com.moovit.commons.view.GLTextureView$f r3 = r2.f41129d     // Catch:{ all -> 0x0202 }
                if (r3 != r1) goto L_0x00ea
                r3 = 0
                r2.f41129d = r3     // Catch:{ all -> 0x0202 }
            L_0x00ea:
                r2.notifyAll()     // Catch:{ all -> 0x0202 }
                throw r0     // Catch:{ all -> 0x0202 }
            L_0x00ee:
                r16 = r3
            L_0x00f0:
                r3 = 0
            L_0x00f1:
                boolean r0 = r1.f41114g     // Catch:{ all -> 0x0202 }
                if (r0 == 0) goto L_0x00ff
                boolean r0 = r1.f41115h     // Catch:{ all -> 0x0202 }
                if (r0 != 0) goto L_0x00ff
                r0 = 1
                r1.f41115h = r0     // Catch:{ all -> 0x0202 }
                r8 = 1
                r9 = 1
                r10 = 1
            L_0x00ff:
                boolean r0 = r1.f41115h     // Catch:{ all -> 0x0202 }
                if (r0 == 0) goto L_0x01f8
                boolean r0 = r1.f41123p     // Catch:{ all -> 0x0202 }
                if (r0 == 0) goto L_0x0112
                int r11 = r1.f41117j     // Catch:{ all -> 0x0202 }
                int r12 = r1.f41118k     // Catch:{ all -> 0x0202 }
                r0 = 0
                r1.f41123p = r0     // Catch:{ all -> 0x0202 }
                r8 = 1
                r10 = 1
                r13 = 1
                goto L_0x0113
            L_0x0112:
                r0 = 0
            L_0x0113:
                r1.f41120m = r0     // Catch:{ all -> 0x0202 }
                com.moovit.commons.view.GLTextureView$g r2 = com.moovit.commons.view.GLTextureView.f41078n     // Catch:{ all -> 0x0202 }
                r2.notifyAll()     // Catch:{ all -> 0x0202 }
            L_0x011a:
                monitor-exit(r15)     // Catch:{ all -> 0x0202 }
                if (r14 == 0) goto L_0x0124
                r14.run()     // Catch:{ all -> 0x0205 }
                r3 = r16
                goto L_0x001b
            L_0x0124:
                if (r8 == 0) goto L_0x0140
                com.moovit.commons.view.GLTextureView$e r2 = r1.f41124q     // Catch:{ all -> 0x0205 }
                boolean r2 = r2.mo47100a()     // Catch:{ all -> 0x0205 }
                if (r2 != 0) goto L_0x013f
                com.moovit.commons.view.GLTextureView$g r2 = com.moovit.commons.view.GLTextureView.f41078n     // Catch:{ all -> 0x0205 }
                monitor-enter(r2)     // Catch:{ all -> 0x0205 }
                r15 = 1
                r1.f41112e = r15     // Catch:{ all -> 0x013c }
                r2.notifyAll()     // Catch:{ all -> 0x013c }
                monitor-exit(r2)     // Catch:{ all -> 0x013c }
            L_0x0138:
                r3 = r16
                goto L_0x01f3
            L_0x013c:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x013c }
                throw r0     // Catch:{ all -> 0x0205 }
            L_0x013f:
                r8 = 0
            L_0x0140:
                if (r9 == 0) goto L_0x0180
                com.moovit.commons.view.GLTextureView$e r2 = r1.f41124q     // Catch:{ all -> 0x0205 }
                javax.microedition.khronos.egl.EGLContext r6 = r2.f41107f     // Catch:{ all -> 0x0205 }
                javax.microedition.khronos.opengles.GL r6 = r6.getGL()     // Catch:{ all -> 0x0205 }
                java.lang.ref.WeakReference<com.moovit.commons.view.GLTextureView> r2 = r2.f41102a     // Catch:{ all -> 0x0205 }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0205 }
                com.moovit.commons.view.GLTextureView r2 = (com.moovit.commons.view.GLTextureView) r2     // Catch:{ all -> 0x0205 }
                if (r2 == 0) goto L_0x0178
                android.opengl.GLSurfaceView$GLWrapper r9 = r2.f41086i     // Catch:{ all -> 0x0205 }
                if (r9 == 0) goto L_0x015c
                javax.microedition.khronos.opengles.GL r6 = r9.wrap(r6)     // Catch:{ all -> 0x0205 }
            L_0x015c:
                int r2 = r2.f41087j     // Catch:{ all -> 0x0205 }
                r9 = r2 & 3
                if (r9 == 0) goto L_0x0178
                r9 = r2 & 1
                if (r9 == 0) goto L_0x0168
                r9 = 1
                goto L_0x0169
            L_0x0168:
                r9 = 0
            L_0x0169:
                r2 = r2 & 2
                if (r2 == 0) goto L_0x0173
                com.moovit.commons.view.GLTextureView$h r2 = new com.moovit.commons.view.GLTextureView$h     // Catch:{ all -> 0x0205 }
                r2.<init>()     // Catch:{ all -> 0x0205 }
                goto L_0x0174
            L_0x0173:
                r2 = r3
            L_0x0174:
                javax.microedition.khronos.opengles.GL r6 = android.opengl.GLDebugHelper.wrap(r6, r9, r2)     // Catch:{ all -> 0x0205 }
            L_0x0178:
                javax.microedition.khronos.opengles.GL10 r6 = (javax.microedition.khronos.opengles.GL10) r6     // Catch:{ all -> 0x0205 }
                com.moovit.commons.view.GLTextureView$g r2 = com.moovit.commons.view.GLTextureView.f41078n     // Catch:{ all -> 0x0205 }
                com.moovit.commons.view.GLTextureView.C15796g.m40306b(r6)     // Catch:{ all -> 0x0205 }
                r9 = 0
            L_0x0180:
                if (r7 == 0) goto L_0x0196
                java.lang.ref.WeakReference<com.moovit.commons.view.GLTextureView> r2 = r1.f41125r     // Catch:{ all -> 0x0205 }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0205 }
                com.moovit.commons.view.GLTextureView r2 = (com.moovit.commons.view.GLTextureView) r2     // Catch:{ all -> 0x0205 }
                if (r2 == 0) goto L_0x0195
                android.opengl.GLSurfaceView$Renderer r2 = r2.f41081d     // Catch:{ all -> 0x0205 }
                com.moovit.commons.view.GLTextureView$e r7 = r1.f41124q     // Catch:{ all -> 0x0205 }
                javax.microedition.khronos.egl.EGLConfig r7 = r7.f41106e     // Catch:{ all -> 0x0205 }
                r2.onSurfaceCreated(r6, r7)     // Catch:{ all -> 0x0205 }
            L_0x0195:
                r7 = 0
            L_0x0196:
                if (r10 == 0) goto L_0x01a8
                java.lang.ref.WeakReference<com.moovit.commons.view.GLTextureView> r2 = r1.f41125r     // Catch:{ all -> 0x0205 }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0205 }
                com.moovit.commons.view.GLTextureView r2 = (com.moovit.commons.view.GLTextureView) r2     // Catch:{ all -> 0x0205 }
                if (r2 == 0) goto L_0x01a7
                android.opengl.GLSurfaceView$Renderer r2 = r2.f41081d     // Catch:{ all -> 0x0205 }
                r2.onSurfaceChanged(r6, r11, r12)     // Catch:{ all -> 0x0205 }
            L_0x01a7:
                r10 = 0
            L_0x01a8:
                java.lang.ref.WeakReference<com.moovit.commons.view.GLTextureView> r2 = r1.f41125r     // Catch:{ all -> 0x0205 }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0205 }
                com.moovit.commons.view.GLTextureView r2 = (com.moovit.commons.view.GLTextureView) r2     // Catch:{ all -> 0x0205 }
                if (r2 == 0) goto L_0x01b7
                android.opengl.GLSurfaceView$Renderer r2 = r2.f41081d     // Catch:{ all -> 0x0205 }
                r2.onDrawFrame(r6)     // Catch:{ all -> 0x0205 }
            L_0x01b7:
                com.moovit.commons.view.GLTextureView$e r2 = r1.f41124q     // Catch:{ all -> 0x0205 }
                javax.microedition.khronos.egl.EGL10 r15 = r2.f41103b     // Catch:{ all -> 0x0205 }
                javax.microedition.khronos.egl.EGLDisplay r0 = r2.f41104c     // Catch:{ all -> 0x0205 }
                javax.microedition.khronos.egl.EGLSurface r3 = r2.f41105d     // Catch:{ all -> 0x0205 }
                boolean r0 = r15.eglSwapBuffers(r0, r3)     // Catch:{ all -> 0x0205 }
                r3 = 12288(0x3000, float:1.7219E-41)
                if (r0 != 0) goto L_0x01ce
                javax.microedition.khronos.egl.EGL10 r0 = r2.f41103b     // Catch:{ all -> 0x0205 }
                int r0 = r0.eglGetError()     // Catch:{ all -> 0x0205 }
                goto L_0x01d0
            L_0x01ce:
                r0 = 12288(0x3000, float:1.7219E-41)
            L_0x01d0:
                if (r0 == r3) goto L_0x01ed
                r2 = 12302(0x300e, float:1.7239E-41)
                if (r0 == r2) goto L_0x01e9
                java.lang.String r2 = "eglSwapBuffers"
                com.moovit.commons.view.GLTextureView.C15794e.m40295c(r0, r2)     // Catch:{ all -> 0x0205 }
                com.moovit.commons.view.GLTextureView$g r2 = com.moovit.commons.view.GLTextureView.f41078n     // Catch:{ all -> 0x0205 }
                monitor-enter(r2)     // Catch:{ all -> 0x0205 }
                r3 = 1
                r1.f41112e = r3     // Catch:{ all -> 0x01e6 }
                r2.notifyAll()     // Catch:{ all -> 0x01e6 }
                monitor-exit(r2)     // Catch:{ all -> 0x01e6 }
                goto L_0x01ee
            L_0x01e6:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x01e6 }
                throw r0     // Catch:{ all -> 0x0205 }
            L_0x01e9:
                r3 = 1
                r16 = 1
                goto L_0x01ee
            L_0x01ed:
                r3 = 1
            L_0x01ee:
                if (r13 == 0) goto L_0x0138
                r3 = r16
                r4 = 1
            L_0x01f3:
                r0 = 0
                goto L_0x001c
            L_0x01f6:
                r16 = r3
            L_0x01f8:
                com.moovit.commons.view.GLTextureView$g r0 = com.moovit.commons.view.GLTextureView.f41078n     // Catch:{ all -> 0x0202 }
                r0.wait()     // Catch:{ all -> 0x0202 }
                r3 = r16
                r0 = 0
                goto L_0x001f
            L_0x0202:
                r0 = move-exception
                monitor-exit(r15)     // Catch:{ all -> 0x0202 }
                throw r0     // Catch:{ all -> 0x0205 }
            L_0x0205:
                r0 = move-exception
                com.moovit.commons.view.GLTextureView$g r2 = com.moovit.commons.view.GLTextureView.f41078n
                monitor-enter(r2)
                r17.mo47106f()     // Catch:{ all -> 0x0211 }
                r17.mo47105e()     // Catch:{ all -> 0x0211 }
                monitor-exit(r2)     // Catch:{ all -> 0x0211 }
                throw r0
            L_0x0211:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0211 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.commons.view.GLTextureView.C15795f.mo47103c():void");
        }

        /* renamed from: d */
        public final boolean mo47104d() {
            return this.f41111d && !this.f41112e && this.f41117j > 0 && this.f41118k > 0 && (this.f41120m || this.f41119l == 1);
        }

        /* renamed from: e */
        public final void mo47105e() {
            if (this.f41114g) {
                C15794e eVar = this.f41124q;
                if (eVar.f41107f != null) {
                    GLTextureView gLTextureView = eVar.f41102a.get();
                    if (gLTextureView != null) {
                        gLTextureView.f41084g.destroyContext(eVar.f41103b, eVar.f41104c, eVar.f41107f);
                    }
                    eVar.f41107f = null;
                }
                EGLDisplay eGLDisplay = eVar.f41104c;
                if (eGLDisplay != null) {
                    eVar.f41103b.eglTerminate(eGLDisplay);
                    eVar.f41104c = null;
                }
                this.f41114g = false;
                C15796g gVar = GLTextureView.f41078n;
                if (gVar.f41129d == this) {
                    gVar.f41129d = null;
                }
                gVar.notifyAll();
            }
        }

        /* renamed from: f */
        public final void mo47106f() {
            if (this.f41115h) {
                this.f41115h = false;
                this.f41124q.mo47101b();
            }
        }

        public final void run() {
            StringBuilder k = C13555b.m33972k("GLThread ");
            k.append(getId());
            setName(k.toString());
            try {
                mo47103c();
            } catch (InterruptedException unused) {
                C15796g gVar = GLTextureView.f41078n;
            } catch (Throwable th) {
                C15796g gVar2 = GLTextureView.f41078n;
                C15796g gVar3 = GLTextureView.f41078n;
                C15796g.m40305a(this);
                throw th;
            }
            C15796g gVar4 = GLTextureView.f41078n;
            C15796g.m40305a(this);
        }
    }

    /* renamed from: com.moovit.commons.view.GLTextureView$g */
    public static class C15796g {

        /* renamed from: a */
        public boolean f41126a;

        /* renamed from: b */
        public boolean f41127b;

        /* renamed from: c */
        public boolean f41128c;

        /* renamed from: d */
        public C15795f f41129d;

        /* renamed from: a */
        public static void m40305a(C15795f fVar) {
            C15796g gVar = GLTextureView.f41078n;
            synchronized (gVar) {
                fVar.f41110c = true;
                if (gVar.f41129d == fVar) {
                    gVar.f41129d = null;
                }
                gVar.notifyAll();
            }
        }

        /* renamed from: b */
        public static void m40306b(GL10 gl10) {
            boolean z;
            C15796g gVar = GLTextureView.f41078n;
            synchronized (gVar) {
                if (!gVar.f41127b) {
                    if (!gVar.f41126a) {
                        gVar.f41126a = true;
                    }
                    if (!gl10.glGetString(7937).startsWith("Q3Dimension MSM7500 ")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    gVar.f41128c = z;
                    gVar.notifyAll();
                    gVar.f41127b = true;
                }
            }
        }
    }

    /* renamed from: com.moovit.commons.view.GLTextureView$h */
    public static class C15797h extends Writer {

        /* renamed from: b */
        public final StringBuilder f41130b = new StringBuilder();

        public final void close() {
            mo47109e();
        }

        /* renamed from: e */
        public final void mo47109e() {
            if (this.f41130b.length() > 0) {
                this.f41130b.toString();
                StringBuilder sb = this.f41130b;
                sb.delete(0, sb.length());
            }
        }

        public final void flush() {
            mo47109e();
        }

        public final void write(char[] cArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == 10) {
                    mo47109e();
                } else {
                    this.f41130b.append(c);
                }
            }
        }
    }

    /* renamed from: com.moovit.commons.view.GLTextureView$i */
    public class C15798i extends C15791b {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C15798i(boolean r2) {
            /*
                r0 = this;
                com.moovit.commons.view.GLTextureView.this = r1
                if (r2 == 0) goto L_0x0007
                r2 = 16
                goto L_0x0008
            L_0x0007:
                r2 = 0
            L_0x0008:
                r0.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.commons.view.GLTextureView.C15798i.<init>(com.moovit.commons.view.GLTextureView, boolean):void");
        }
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSurfaceTextureListener(this);
    }

    /* renamed from: a */
    public final void mo47070a() {
        if (this.f41080c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* renamed from: b */
    public final void mo47071b() {
        C15795f fVar = this.f41080c;
        int i = C15795f.f41108s;
        fVar.getClass();
        C15796g gVar = f41078n;
        synchronized (gVar) {
            fVar.f41120m = true;
            gVar.notifyAll();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|18|19|20|31|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0019, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003a */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47072c(int r4, int r5) {
        /*
            r3 = this;
            com.moovit.commons.view.GLTextureView$f r0 = r3.f41080c
            int r1 = com.moovit.commons.view.GLTextureView.C15795f.f41108s
            r0.getClass()
            com.moovit.commons.view.GLTextureView$g r1 = f41078n
            monitor-enter(r1)
            r0.f41117j = r4     // Catch:{ all -> 0x0044 }
            r0.f41118k = r5     // Catch:{ all -> 0x0044 }
            r4 = 1
            r0.f41123p = r4     // Catch:{ all -> 0x0044 }
            r0.f41120m = r4     // Catch:{ all -> 0x0044 }
            r5 = 0
            r0.f41121n = r5     // Catch:{ all -> 0x0044 }
            r1.notifyAll()     // Catch:{ all -> 0x0044 }
        L_0x0019:
            boolean r2 = r0.f41110c     // Catch:{ all -> 0x0044 }
            if (r2 != 0) goto L_0x0042
            boolean r2 = r0.f41121n     // Catch:{ all -> 0x0044 }
            if (r2 != 0) goto L_0x0042
            boolean r2 = r0.f41114g     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0031
            boolean r2 = r0.f41115h     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0031
            boolean r2 = r0.mo47104d()     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0031
            r2 = 1
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            if (r2 == 0) goto L_0x0042
            com.moovit.commons.view.GLTextureView$g r2 = f41078n     // Catch:{ InterruptedException -> 0x003a }
            r2.wait()     // Catch:{ InterruptedException -> 0x003a }
            goto L_0x0019
        L_0x003a:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0044 }
            r2.interrupt()     // Catch:{ all -> 0x0044 }
            goto L_0x0019
        L_0x0042:
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
            return
        L_0x0044:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0044 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.commons.view.GLTextureView.mo47072c(int, int):void");
    }

    public final void finalize() throws Throwable {
        try {
            C15795f fVar = this.f41080c;
            if (fVar != null) {
                C15795f.m40299a(fVar);
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f41087j;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f41089l;
    }

    public int getRenderMode() {
        int i;
        C15795f fVar = this.f41080c;
        int i2 = C15795f.f41108s;
        fVar.getClass();
        synchronized (f41078n) {
            i = fVar.f41119l;
        }
        return i;
    }

    public final void onAttachedToWindow() {
        int i;
        super.onAttachedToWindow();
        if (this.f41082e && this.f41081d != null) {
            C15795f fVar = this.f41080c;
            if (fVar != null) {
                int i2 = C15795f.f41108s;
                synchronized (f41078n) {
                    i = fVar.f41119l;
                }
            } else {
                i = 1;
            }
            C15795f fVar2 = new C15795f(this.f41079b);
            this.f41080c = fVar2;
            if (i != 1) {
                C15795f.m40300b(fVar2, i);
            }
            this.f41080c.start();
        }
        this.f41082e = false;
    }

    public final void onDetachedFromWindow() {
        C15795f fVar = this.f41080c;
        if (fVar != null) {
            C15795f.m40299a(fVar);
        }
        this.f41082e = true;
        super.onDetachedFromWindow();
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        getSurfaceTexture();
        mo47072c(i3 - i, i4 - i2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|27|23|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0010, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r4, int r5, int r6) {
        /*
            r3 = this;
            com.moovit.commons.view.GLTextureView$f r0 = r3.f41080c
            int r1 = com.moovit.commons.view.GLTextureView.C15795f.f41108s
            r0.getClass()
            com.moovit.commons.view.GLTextureView$g r1 = f41078n
            monitor-enter(r1)
            r2 = 1
            r0.f41111d = r2     // Catch:{ all -> 0x0041 }
            r1.notifyAll()     // Catch:{ all -> 0x0041 }
        L_0x0010:
            boolean r2 = r0.f41113f     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x0026
            boolean r2 = r0.f41110c     // Catch:{ all -> 0x0041 }
            if (r2 != 0) goto L_0x0026
            com.moovit.commons.view.GLTextureView$g r2 = f41078n     // Catch:{ InterruptedException -> 0x001e }
            r2.wait()     // Catch:{ InterruptedException -> 0x001e }
            goto L_0x0010
        L_0x001e:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0041 }
            r2.interrupt()     // Catch:{ all -> 0x0041 }
            goto L_0x0010
        L_0x0026:
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
            r3.mo47072c(r5, r6)
            java.util.ArrayList r0 = r3.f41090m
            java.util.Iterator r0 = r0.iterator()
        L_0x0030:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0040
            java.lang.Object r1 = r0.next()
            android.view.TextureView$SurfaceTextureListener r1 = (android.view.TextureView.SurfaceTextureListener) r1
            r1.onSurfaceTextureAvailable(r4, r5, r6)
            goto L_0x0030
        L_0x0040:
            return
        L_0x0041:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0041 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.commons.view.GLTextureView.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|11|12|27|23|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0010, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r4) {
        /*
            r3 = this;
            com.moovit.commons.view.GLTextureView$f r0 = r3.f41080c
            int r1 = com.moovit.commons.view.GLTextureView.C15795f.f41108s
            r0.getClass()
            com.moovit.commons.view.GLTextureView$g r1 = f41078n
            monitor-enter(r1)
            r2 = 0
            r0.f41111d = r2     // Catch:{ all -> 0x003f }
            r1.notifyAll()     // Catch:{ all -> 0x003f }
        L_0x0010:
            boolean r2 = r0.f41113f     // Catch:{ all -> 0x003f }
            if (r2 != 0) goto L_0x0026
            boolean r2 = r0.f41110c     // Catch:{ all -> 0x003f }
            if (r2 != 0) goto L_0x0026
            com.moovit.commons.view.GLTextureView$g r2 = f41078n     // Catch:{ InterruptedException -> 0x001e }
            r2.wait()     // Catch:{ InterruptedException -> 0x001e }
            goto L_0x0010
        L_0x001e:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x003f }
            r2.interrupt()     // Catch:{ all -> 0x003f }
            goto L_0x0010
        L_0x0026:
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            java.util.ArrayList r0 = r3.f41090m
            java.util.Iterator r0 = r0.iterator()
        L_0x002d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x003d
            java.lang.Object r1 = r0.next()
            android.view.TextureView$SurfaceTextureListener r1 = (android.view.TextureView.SurfaceTextureListener) r1
            r1.onSurfaceTextureDestroyed(r4)
            goto L_0x002d
        L_0x003d:
            r4 = 1
            return r4
        L_0x003f:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.commons.view.GLTextureView.onSurfaceTextureDestroyed(android.graphics.SurfaceTexture):boolean");
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        mo47072c(i, i2);
        Iterator it = this.f41090m.iterator();
        while (it.hasNext()) {
            ((TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
        }
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        mo47071b();
        Iterator it = this.f41090m.iterator();
        while (it.hasNext()) {
            ((TextureView.SurfaceTextureListener) it.next()).onSurfaceTextureUpdated(surfaceTexture);
        }
    }

    public void setDebugFlags(int i) {
        this.f41087j = i;
    }

    public void setEGLConfigChooser(GLSurfaceView.EGLConfigChooser eGLConfigChooser) {
        mo47070a();
        this.f41083f = eGLConfigChooser;
    }

    public void setEGLContextClientVersion(int i) {
        mo47070a();
        this.f41088k = i;
    }

    public void setEGLContextFactory(GLSurfaceView.EGLContextFactory eGLContextFactory) {
        mo47070a();
        this.f41084g = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        mo47070a();
        this.f41085h = eGLWindowSurfaceFactory;
    }

    public void setGLWrapper(GLSurfaceView.GLWrapper gLWrapper) {
        this.f41086i = gLWrapper;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.f41089l = z;
    }

    public void setRenderMode(int i) {
        C15795f.m40300b(this.f41080c, i);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        mo47070a();
        if (this.f41083f == null) {
            this.f41083f = new C15798i(true);
        }
        if (this.f41084g == null) {
            this.f41084g = new C15792c();
        }
        if (this.f41085h == null) {
            this.f41085h = new C15793d();
        }
        C21100e.m49373x(renderer, "renderer");
        this.f41081d = renderer;
        C15795f fVar = new C15795f(this.f41079b);
        this.f41080c = fVar;
        fVar.start();
    }

    public void setEGLConfigChooser(boolean z) {
        setEGLConfigChooser((GLSurfaceView.EGLConfigChooser) new C15798i(z));
    }
}
