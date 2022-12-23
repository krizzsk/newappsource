package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p001a0.C0008a0;
import p001a0.C0018i;
import p001a0.C0020k;
import p001a0.C0033w;
import p019b0.C1438o;
import p066e0.C4436j0;
import p089g0.C4721b;
import p327z.C7372g;
import p695od.C18728c;

/* renamed from: androidx.camera.camera2.internal.o */
public final class C0525o {

    /* renamed from: a */
    public final C0527b f1816a;

    /* renamed from: androidx.camera.camera2.internal.o$a */
    public static class C0526a {

        /* renamed from: a */
        public final Executor f1817a;

        /* renamed from: b */
        public final ScheduledExecutorService f1818b;

        /* renamed from: c */
        public final Handler f1819c;

        /* renamed from: d */
        public final C0516i f1820d;

        /* renamed from: e */
        public final C4436j0 f1821e;

        /* renamed from: f */
        public final C4436j0 f1822f;

        /* renamed from: g */
        public final boolean f1823g;

        public C0526a(Handler handler, C0516i iVar, C4436j0 j0Var, C4436j0 j0Var2, SequentialExecutor sequentialExecutor, C4721b bVar) {
            boolean z;
            boolean z2;
            this.f1817a = sequentialExecutor;
            this.f1818b = bVar;
            this.f1819c = handler;
            this.f1820d = iVar;
            this.f1821e = j0Var;
            this.f1822f = j0Var2;
            boolean e = j0Var2.mo19959e(C0008a0.class);
            boolean e2 = j0Var.mo19959e(C0033w.class);
            boolean e3 = j0Var.mo19959e(C0020k.class);
            boolean z3 = true;
            if (e || e2 || e3) {
                z = true;
            } else {
                z = false;
            }
            if (!z && !new C1438o(j0Var).f5293a) {
                if (((C0018i) j0Var2.mo19960g(C0018i.class)) != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    z3 = false;
                }
            }
            this.f1823g = z3;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: x.s1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: androidx.camera.camera2.internal.m} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: x.s1} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: x.s1} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.camera.camera2.internal.C0525o mo2352a() {
            /*
                r9 = this;
                androidx.camera.camera2.internal.o r0 = new androidx.camera.camera2.internal.o
                boolean r1 = r9.f1823g
                if (r1 == 0) goto L_0x0019
                x.s1 r1 = new x.s1
                e0.j0 r5 = r9.f1821e
                e0.j0 r6 = r9.f1822f
                androidx.camera.camera2.internal.i r4 = r9.f1820d
                java.util.concurrent.Executor r7 = r9.f1817a
                java.util.concurrent.ScheduledExecutorService r8 = r9.f1818b
                android.os.Handler r3 = r9.f1819c
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8)
                goto L_0x0026
            L_0x0019:
                androidx.camera.camera2.internal.m r1 = new androidx.camera.camera2.internal.m
                androidx.camera.camera2.internal.i r2 = r9.f1820d
                java.util.concurrent.Executor r3 = r9.f1817a
                java.util.concurrent.ScheduledExecutorService r4 = r9.f1818b
                android.os.Handler r5 = r9.f1819c
                r1.<init>(r2, r3, r4, r5)
            L_0x0026:
                r0.<init>(r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C0525o.C0526a.mo2352a():androidx.camera.camera2.internal.o");
        }
    }

    /* renamed from: androidx.camera.camera2.internal.o$b */
    public interface C0527b {
        /* renamed from: a */
        C18728c mo2340a(ArrayList arrayList);

        /* renamed from: b */
        C18728c<Void> mo2341b(CameraDevice cameraDevice, C7372g gVar, List<DeferrableSurface> list);

        boolean stop();
    }

    public C0525o(C0522m mVar) {
        this.f1816a = mVar;
    }
}
