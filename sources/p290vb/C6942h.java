package p290vb;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Surface;
import android.view.WindowManager;
import p054d0.C4314v;
import p277ub.C6774a0;

/* renamed from: vb.h */
public final class C6942h {

    /* renamed from: a */
    public final C6933b f21664a = new C6933b();

    /* renamed from: b */
    public final C6943a f21665b;

    /* renamed from: c */
    public final C6947d f21666c;

    /* renamed from: d */
    public boolean f21667d;

    /* renamed from: e */
    public Surface f21668e;

    /* renamed from: f */
    public float f21669f;

    /* renamed from: g */
    public float f21670g;

    /* renamed from: h */
    public float f21671h;

    /* renamed from: i */
    public float f21672i;

    /* renamed from: j */
    public long f21673j;

    /* renamed from: k */
    public long f21674k;

    /* renamed from: l */
    public long f21675l;

    /* renamed from: m */
    public long f21676m;

    /* renamed from: n */
    public long f21677n;

    /* renamed from: o */
    public long f21678o;

    /* renamed from: p */
    public long f21679p;

    /* renamed from: vb.h$a */
    public interface C6943a {

        /* renamed from: vb.h$a$a */
        public interface C6944a {
        }

        /* renamed from: a */
        void mo23189a();

        /* renamed from: b */
        void mo23190b(C4314v vVar);
    }

    /* renamed from: vb.h$b */
    public static final class C6945b implements C6943a {

        /* renamed from: a */
        public final WindowManager f21680a;

        public C6945b(WindowManager windowManager) {
            this.f21680a = windowManager;
        }

        /* renamed from: a */
        public final void mo23189a() {
        }

        /* renamed from: b */
        public final void mo23190b(C4314v vVar) {
            vVar.mo19836e(this.f21680a.getDefaultDisplay());
        }
    }

    /* renamed from: vb.h$c */
    public static final class C6946c implements C6943a, DisplayManager.DisplayListener {

        /* renamed from: a */
        public final DisplayManager f21681a;

        /* renamed from: b */
        public C6943a.C6944a f21682b;

        public C6946c(DisplayManager displayManager) {
            this.f21681a = displayManager;
        }

        /* renamed from: a */
        public final void mo23189a() {
            this.f21681a.unregisterDisplayListener(this);
            this.f21682b = null;
        }

        /* renamed from: b */
        public final void mo23190b(C4314v vVar) {
            this.f21682b = vVar;
            this.f21681a.registerDisplayListener(this, C6774a0.m15949i((Handler.Callback) null));
            vVar.mo19836e(this.f21681a.getDisplay(0));
        }

        public final void onDisplayAdded(int i) {
        }

        public final void onDisplayChanged(int i) {
            C6943a.C6944a aVar = this.f21682b;
            if (aVar != null && i == 0) {
                ((C4314v) aVar).mo19836e(this.f21681a.getDisplay(0));
            }
        }

        public final void onDisplayRemoved(int i) {
        }
    }

    /* renamed from: vb.h$d */
    public static final class C6947d implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f */
        public static final C6947d f21683f = new C6947d();

        /* renamed from: b */
        public volatile long f21684b = -9223372036854775807L;

        /* renamed from: c */
        public final Handler f21685c;

        /* renamed from: d */
        public Choreographer f21686d;

        /* renamed from: e */
        public int f21687e;

        public C6947d() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i = C6774a0.f20959a;
            Handler handler = new Handler(looper, this);
            this.f21685c = handler;
            handler.sendEmptyMessage(0);
        }

        public final void doFrame(long j) {
            this.f21684b = j;
            Choreographer choreographer = this.f21686d;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500);
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f21686d = Choreographer.getInstance();
                return true;
            } else if (i == 1) {
                int i2 = this.f21687e + 1;
                this.f21687e = i2;
                if (i2 == 1) {
                    Choreographer choreographer = this.f21686d;
                    choreographer.getClass();
                    choreographer.postFrameCallback(this);
                }
                return true;
            } else if (i != 2) {
                return false;
            } else {
                int i3 = this.f21687e - 1;
                this.f21687e = i3;
                if (i3 == 0) {
                    Choreographer choreographer2 = this.f21686d;
                    choreographer2.getClass();
                    choreographer2.removeFrameCallback(this);
                    this.f21684b = -9223372036854775807L;
                }
                return true;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6942h(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            vb.b r0 = new vb.b
            r0.<init>()
            r3.f21664a = r0
            r0 = 0
            if (r4 == 0) goto L_0x003b
            android.content.Context r4 = r4.getApplicationContext()
            int r1 = p277ub.C6774a0.f20959a
            r2 = 17
            if (r1 < r2) goto L_0x0027
            java.lang.String r1 = "display"
            java.lang.Object r1 = r4.getSystemService(r1)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            if (r1 == 0) goto L_0x0027
            vb.h$c r2 = new vb.h$c
            r2.<init>(r1)
            goto L_0x0028
        L_0x0027:
            r2 = r0
        L_0x0028:
            if (r2 != 0) goto L_0x003c
            java.lang.String r1 = "window"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 == 0) goto L_0x003b
            vb.h$b r2 = new vb.h$b
            r2.<init>(r4)
            goto L_0x003c
        L_0x003b:
            r2 = r0
        L_0x003c:
            r3.f21665b = r2
            if (r2 == 0) goto L_0x0042
            vb.h$d r0 = p290vb.C6942h.C6947d.f21683f
        L_0x0042:
            r3.f21666c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f21673j = r0
            r3.f21674k = r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.f21669f = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f21672i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p290vb.C6942h.<init>(android.content.Context):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        if (java.lang.Math.abs(r0 - r10.f21670g) < r1) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008d, code lost:
        if (r10.f21664a.f21609e >= 30) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23187a() {
        /*
            r10 = this;
            int r0 = p277ub.C6774a0.f20959a
            r1 = 30
            if (r0 < r1) goto L_0x0098
            android.view.Surface r0 = r10.f21668e
            if (r0 != 0) goto L_0x000c
            goto L_0x0098
        L_0x000c:
            vb.b r0 = r10.f21664a
            boolean r0 = r0.mo23170a()
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r0 == 0) goto L_0x0038
            vb.b r0 = r10.f21664a
            boolean r3 = r0.mo23170a()
            if (r3 == 0) goto L_0x0035
            r3 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            vb.b$a r0 = r0.f21605a
            long r5 = r0.f21614e
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            long r7 = r0.f21615f
            long r7 = r7 / r5
        L_0x0031:
            double r5 = (double) r7
            double r3 = r3 / r5
            float r0 = (float) r3
            goto L_0x003a
        L_0x0035:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x003a
        L_0x0038:
            float r0 = r10.f21669f
        L_0x003a:
            float r3 = r10.f21670g
            int r4 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r4 != 0) goto L_0x0041
            return
        L_0x0041:
            r4 = 1
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0086
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0086
            vb.b r1 = r10.f21664a
            boolean r1 = r1.mo23170a()
            if (r1 == 0) goto L_0x0070
            vb.b r1 = r10.f21664a
            boolean r2 = r1.mo23170a()
            if (r2 == 0) goto L_0x0060
            vb.b$a r1 = r1.f21605a
            long r1 = r1.f21615f
            goto L_0x0065
        L_0x0060:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0065:
            r6 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x0070
            r1 = 1
            goto L_0x0071
        L_0x0070:
            r1 = 0
        L_0x0071:
            if (r1 == 0) goto L_0x0077
            r1 = 1017370378(0x3ca3d70a, float:0.02)
            goto L_0x0079
        L_0x0077:
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0079:
            float r2 = r10.f21670g
            float r2 = r0 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0090
            goto L_0x0091
        L_0x0086:
            if (r6 == 0) goto L_0x0089
            goto L_0x0091
        L_0x0089:
            vb.b r2 = r10.f21664a
            int r2 = r2.f21609e
            if (r2 < r1) goto L_0x0090
            goto L_0x0091
        L_0x0090:
            r4 = 0
        L_0x0091:
            if (r4 == 0) goto L_0x0098
            r10.f21670g = r0
            r10.mo23188b(r5)
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p290vb.C6942h.mo23187a():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23188b(boolean r5) {
        /*
            r4 = this;
            int r0 = p277ub.C6774a0.f20959a
            r1 = 30
            if (r0 < r1) goto L_0x003a
            android.view.Surface r0 = r4.f21668e
            if (r0 != 0) goto L_0x000b
            goto L_0x003a
        L_0x000b:
            boolean r1 = r4.f21667d
            r2 = 0
            if (r1 == 0) goto L_0x001d
            float r1 = r4.f21670g
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x001d
            float r3 = r4.f21672i
            float r3 = r3 * r1
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            if (r5 != 0) goto L_0x0027
            float r5 = r4.f21671h
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0027
            return
        L_0x0027:
            r4.f21671h = r3
            int r5 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x002f
            r5 = 0
            goto L_0x0030
        L_0x002f:
            r5 = 1
        L_0x0030:
            r0.setFrameRate(r3, r5)     // Catch:{ IllegalStateException -> 0x0034 }
            goto L_0x003a
        L_0x0034:
            r5 = move-exception
            java.lang.String r0 = "Failed to call Surface.setFrameRate"
            p277ub.C6776b0.m15968a(r0, r5)
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p290vb.C6942h.mo23188b(boolean):void");
    }
}
