package p304x;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.C0578e;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0590n;
import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfMode;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.impl.utils.executor.SequentialExecutor;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.play.core.appupdate.C14226d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p019b0.C1431h;
import p019b0.C1435l;
import p054d0.C4289j0;
import p054d0.C4291k0;
import p066e0.C4436j0;
import p066e0.C4450p0;
import p089g0.C4720a;
import p102h0.C5019d;
import p102h0.C5023g;
import p102h0.C5028j;
import p291w.C6956a;
import p304x.C7090q;
import p316y.C7225s;
import p373au.C13533e;
import p695od.C18728c;
import p900wt.C20415e;

/* renamed from: x.f0 */
public final class C7045f0 {

    /* renamed from: a */
    public final C7090q f21910a;

    /* renamed from: b */
    public final C1435l f21911b;

    /* renamed from: c */
    public final C4436j0 f21912c;

    /* renamed from: d */
    public final Executor f21913d;

    /* renamed from: e */
    public final boolean f21914e;

    /* renamed from: f */
    public int f21915f = 1;

    /* renamed from: x.f0$a */
    public static class C7046a implements C7050d {

        /* renamed from: a */
        public final C7090q f21916a;

        /* renamed from: b */
        public final C1431h f21917b;

        /* renamed from: c */
        public final int f21918c;

        /* renamed from: d */
        public boolean f21919d = false;

        public C7046a(C7090q qVar, int i, C1431h hVar) {
            this.f21916a = qVar;
            this.f21918c = i;
            this.f21917b = hVar;
        }

        /* renamed from: a */
        public final C18728c<Boolean> mo23303a(TotalCaptureResult totalCaptureResult) {
            if (!C7045f0.m16553a(this.f21918c, totalCaptureResult)) {
                return C5023g.m12857e(Boolean.FALSE);
            }
            C4289j0.m11435b("Camera2CapturePipeline");
            this.f21919d = true;
            C5019d a = C5019d.m12842a(CallbackToFutureAdapter.m1884a(new C7038d0(this, 0)));
            C7042e0 e0Var = new C7042e0(0);
            C4720a s0 = C14226d.m35352s0();
            a.getClass();
            return C5023g.m12860h(a, e0Var, s0);
        }

        /* renamed from: b */
        public final boolean mo23304b() {
            return this.f21918c == 0;
        }

        /* renamed from: c */
        public final void mo23305c() {
            if (this.f21919d) {
                C4289j0.m11435b("Camera2CapturePipeline");
                this.f21916a.f22041h.mo23309a(false, true);
                this.f21917b.f5280b = false;
            }
        }
    }

    /* renamed from: x.f0$b */
    public static class C7047b implements C7050d {

        /* renamed from: a */
        public final C7090q f21920a;

        /* renamed from: b */
        public boolean f21921b = false;

        public C7047b(C7090q qVar) {
            this.f21920a = qVar;
        }

        /* renamed from: a */
        public final C18728c<Boolean> mo23303a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            C5028j.C5031c e = C5023g.m12857e(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return e;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                C4289j0.m11435b("Camera2CapturePipeline");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    C4289j0.m11435b("Camera2CapturePipeline");
                    this.f21921b = true;
                    C7066j1 j1Var = this.f21920a.f22041h;
                    if (j1Var.f21972c) {
                        C0578e.C0579a aVar = new C0578e.C0579a();
                        aVar.f1979c = j1Var.f21973d;
                        aVar.f1981e = true;
                        C0589m t = C0589m.m1674t();
                        t.mo2503w(C6956a.m16424s(CaptureRequest.CONTROL_AF_TRIGGER), 1);
                        aVar.mo2481c(new C6956a(C0590n.m1678s(t)));
                        aVar.mo2480b(new C7060h1());
                        j1Var.f21970a.mo23337p(Collections.singletonList(aVar.mo2482d()));
                    }
                }
            }
            return e;
        }

        /* renamed from: b */
        public final boolean mo23304b() {
            return true;
        }

        /* renamed from: c */
        public final void mo23305c() {
            if (this.f21921b) {
                C4289j0.m11435b("Camera2CapturePipeline");
                this.f21920a.f22041h.mo23309a(true, false);
            }
        }
    }

    /* renamed from: x.f0$c */
    public static class C7048c {

        /* renamed from: i */
        public static final long f21922i;

        /* renamed from: j */
        public static final long f21923j;

        /* renamed from: a */
        public final int f21924a;

        /* renamed from: b */
        public final Executor f21925b;

        /* renamed from: c */
        public final C7090q f21926c;

        /* renamed from: d */
        public final C1431h f21927d;

        /* renamed from: e */
        public final boolean f21928e;

        /* renamed from: f */
        public long f21929f = f21922i;

        /* renamed from: g */
        public final ArrayList f21930g = new ArrayList();

        /* renamed from: h */
        public final C7049a f21931h = new C7049a();

        /* renamed from: x.f0$c$a */
        public class C7049a implements C7050d {
            public C7049a() {
            }

            /* renamed from: a */
            public final C18728c<Boolean> mo23303a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator it = C7048c.this.f21930g.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C7050d) it.next()).mo23303a(totalCaptureResult));
                }
                return C5023g.m12860h(C5023g.m12854b(arrayList), new C20415e(0), C14226d.m35352s0());
            }

            /* renamed from: b */
            public final boolean mo23304b() {
                Iterator it = C7048c.this.f21930g.iterator();
                while (it.hasNext()) {
                    if (((C7050d) it.next()).mo23304b()) {
                        return true;
                    }
                }
                return false;
            }

            /* renamed from: c */
            public final void mo23305c() {
                Iterator it = C7048c.this.f21930g.iterator();
                while (it.hasNext()) {
                    ((C7050d) it.next()).mo23305c();
                }
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f21922i = timeUnit.toNanos(1);
            f21923j = timeUnit.toNanos(5);
        }

        public C7048c(int i, Executor executor, C7090q qVar, boolean z, C1431h hVar) {
            this.f21924a = i;
            this.f21925b = executor;
            this.f21926c = qVar;
            this.f21928e = z;
            this.f21927d = hVar;
        }
    }

    /* renamed from: x.f0$d */
    public interface C7050d {
        /* renamed from: a */
        C18728c<Boolean> mo23303a(TotalCaptureResult totalCaptureResult);

        /* renamed from: b */
        boolean mo23304b();

        /* renamed from: c */
        void mo23305c();
    }

    /* renamed from: x.f0$e */
    public static class C7051e implements C7090q.C7093c {

        /* renamed from: a */
        public CallbackToFutureAdapter.C0673a<TotalCaptureResult> f21933a;

        /* renamed from: b */
        public final CallbackToFutureAdapter.C0675c f21934b = CallbackToFutureAdapter.m1884a(new C7071l0(this, 0));

        /* renamed from: c */
        public final long f21935c;

        /* renamed from: d */
        public final C7052a f21936d;

        /* renamed from: e */
        public volatile Long f21937e = null;

        /* renamed from: x.f0$e$a */
        public interface C7052a {
        }

        public C7051e(long j, C4291k0 k0Var) {
            this.f21935c = j;
            this.f21936d = k0Var;
        }

        public final boolean onCaptureResult(TotalCaptureResult totalCaptureResult) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            Long l = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l != null && this.f21937e == null) {
                this.f21937e = l;
            }
            Long l2 = this.f21937e;
            if (0 == this.f21935c || l2 == null || l == null || l.longValue() - l2.longValue() <= this.f21935c) {
                C7052a aVar = this.f21936d;
                if (aVar != null) {
                    ((C7048c) ((C4291k0) aVar).f15212c).getClass();
                    C7037d dVar = new C7037d(C4450p0.f15508b, totalCaptureResult);
                    if (dVar.mo23294d() == CameraCaptureMetaData$AfMode.OFF || dVar.mo23294d() == CameraCaptureMetaData$AfMode.UNKNOWN || dVar.mo23295e() == CameraCaptureMetaData$AfState.PASSIVE_FOCUSED || dVar.mo23295e() == CameraCaptureMetaData$AfState.PASSIVE_NOT_FOCUSED || dVar.mo23295e() == CameraCaptureMetaData$AfState.LOCKED_FOCUSED || dVar.mo23295e() == CameraCaptureMetaData$AfState.LOCKED_NOT_FOCUSED) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dVar.mo23293c() == CameraCaptureMetaData$AeState.CONVERGED || dVar.mo23293c() == CameraCaptureMetaData$AeState.FLASH_REQUIRED || dVar.mo23293c() == CameraCaptureMetaData$AeState.UNKNOWN) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (dVar.mo23296f() == CameraCaptureMetaData$AwbState.CONVERGED || dVar.mo23296f() == CameraCaptureMetaData$AwbState.UNKNOWN) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    Objects.toString(dVar.mo23293c());
                    Objects.toString(dVar.mo23295e());
                    Objects.toString(dVar.mo23296f());
                    C4289j0.m11435b("Camera2CapturePipeline");
                    if (!z || !z2 || !z3) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z4) {
                        return false;
                    }
                }
                this.f21933a.mo2697b(totalCaptureResult);
                return true;
            }
            this.f21933a.mo2697b(null);
            C4289j0.m11435b("Camera2CapturePipeline");
            return true;
        }
    }

    /* renamed from: x.f0$f */
    public static class C7053f implements C7050d {

        /* renamed from: a */
        public final C7090q f21938a;

        /* renamed from: b */
        public final int f21939b;

        /* renamed from: c */
        public boolean f21940c = false;

        public C7053f(C7090q qVar, int i) {
            this.f21938a = qVar;
            this.f21939b = i;
        }

        /* renamed from: a */
        public final C18728c<Boolean> mo23303a(TotalCaptureResult totalCaptureResult) {
            if (C7045f0.m16553a(this.f21939b, totalCaptureResult)) {
                if (this.f21938a.f22049p) {
                    C4289j0.m11435b("Camera2CapturePipeline");
                } else {
                    C4289j0.m11435b("Camera2CapturePipeline");
                    this.f21940c = true;
                    C5019d a = C5019d.m12842a(CallbackToFutureAdapter.m1884a(new C13533e(this, 0)));
                    C7074m0 m0Var = new C7074m0(0);
                    C4720a s0 = C14226d.m35352s0();
                    a.getClass();
                    return C5023g.m12860h(a, m0Var, s0);
                }
            }
            return C5023g.m12857e(Boolean.FALSE);
        }

        /* renamed from: b */
        public final boolean mo23304b() {
            return this.f21939b == 0;
        }

        /* renamed from: c */
        public final void mo23305c() {
            if (this.f21940c) {
                this.f21938a.f22043j.mo23370a((CallbackToFutureAdapter.C0673a<Void>) null, false);
                C4289j0.m11435b("Camera2CapturePipeline");
            }
        }
    }

    public C7045f0(C7090q qVar, C7225s sVar, C4436j0 j0Var, SequentialExecutor sequentialExecutor) {
        boolean z = true;
        this.f21910a = qVar;
        Integer num = (Integer) sVar.mo23532a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f21914e = (num == null || num.intValue() != 2) ? false : z;
        this.f21913d = sequentialExecutor;
        this.f21912c = j0Var;
        this.f21911b = new C1435l(j0Var);
    }

    /* renamed from: a */
    public static boolean m16553a(int i, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (i == 0) {
            if (totalCaptureResult != null) {
                num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
            } else {
                num = null;
            }
            if (num == null || num.intValue() != 4) {
                return false;
            }
            return true;
        } else if (i == 1) {
            return true;
        } else {
            if (i == 2) {
                return false;
            }
            throw new AssertionError(i);
        }
    }
}
