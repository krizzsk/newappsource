package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.C0572a;
import androidx.camera.core.impl.C0587k;
import androidx.camera.core.impl.C0589m;
import androidx.camera.core.impl.C0595r;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import mf0.C24361g;
import p066e0.C4443m;
import p115i0.C5231g;
import p304x.C7090q;

public abstract class UseCase {

    /* renamed from: a */
    public final HashSet f1860a = new HashSet();

    /* renamed from: b */
    public final Object f1861b = new Object();

    /* renamed from: c */
    public State f1862c = State.INACTIVE;

    /* renamed from: d */
    public C0595r<?> f1863d;

    /* renamed from: e */
    public C0595r<?> f1864e;

    /* renamed from: f */
    public C0595r<?> f1865f;

    /* renamed from: g */
    public Size f1866g;

    /* renamed from: h */
    public C0595r<?> f1867h;

    /* renamed from: i */
    public Rect f1868i;

    /* renamed from: j */
    public CameraInternal f1869j;

    /* renamed from: k */
    public SessionConfig f1870k = SessionConfig.m1602a();

    public enum State {
        ACTIVE,
        INACTIVE
    }

    /* renamed from: androidx.camera.core.UseCase$a */
    public static /* synthetic */ class C0538a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f1871a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.camera.core.UseCase$State[] r0 = androidx.camera.core.UseCase.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1871a = r0
                androidx.camera.core.UseCase$State r1 = androidx.camera.core.UseCase.State.INACTIVE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1871a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.UseCase$State r1 = androidx.camera.core.UseCase.State.ACTIVE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.UseCase.C0538a.<clinit>():void");
        }
    }

    /* renamed from: androidx.camera.core.UseCase$b */
    public interface C0539b {
        /* renamed from: a */
        void mo2391a();

        void onDetach();
    }

    /* renamed from: androidx.camera.core.UseCase$c */
    public interface C0540c {
        /* renamed from: a */
        void mo2235a(UseCase useCase);

        /* renamed from: b */
        void mo2237b(UseCase useCase);

        /* renamed from: d */
        void mo2239d(UseCase useCase);

        /* renamed from: e */
        void mo2241e(UseCase useCase);
    }

    public UseCase(C0595r<?> rVar) {
        this.f1864e = rVar;
        this.f1865f = rVar;
    }

    /* renamed from: a */
    public final CameraInternal mo2366a() {
        CameraInternal cameraInternal;
        synchronized (this.f1861b) {
            cameraInternal = this.f1869j;
        }
        return cameraInternal;
    }

    /* renamed from: b */
    public final CameraControlInternal mo2367b() {
        synchronized (this.f1861b) {
            CameraInternal cameraInternal = this.f1869j;
            if (cameraInternal == null) {
                CameraControlInternal.C0562a aVar = CameraControlInternal.f1919a;
                return aVar;
            }
            C7090q cameraControlInternal = cameraInternal.getCameraControlInternal();
            return cameraControlInternal;
        }
    }

    /* renamed from: c */
    public final String mo2368c() {
        CameraInternal a = mo2366a();
        C24361g.m61185s(a, "No camera attached to use case: " + this);
        return a.getCameraInfoInternal().f22138a;
    }

    /* renamed from: d */
    public abstract C0595r<?> mo2369d(boolean z, UseCaseConfigFactory useCaseConfigFactory);

    /* renamed from: e */
    public final int mo2370e() {
        return this.f1865f.getInputFormat();
    }

    /* renamed from: f */
    public final String mo2371f() {
        C0595r<?> rVar = this.f1865f;
        StringBuilder k = C13555b.m33972k("<UnknownUseCase-");
        k.append(hashCode());
        k.append(">");
        return rVar.getTargetName(k.toString());
    }

    /* renamed from: g */
    public final int mo2372g(CameraInternal cameraInternal) {
        return cameraInternal.getCameraInfoInternal().getSensorRotationDegrees(((C0587k) this.f1865f).mo2491i());
    }

    /* renamed from: h */
    public abstract C0595r.C0596a<?, ?, ?> mo2373h(Config config);

    /* renamed from: i */
    public final boolean mo2374i(String str) {
        if (mo2366a() == null) {
            return false;
        }
        return Objects.equals(str, mo2368c());
    }

    /* renamed from: j */
    public final C0595r<?> mo2375j(C4443m mVar, C0595r<?> rVar, C0595r<?> rVar2) {
        C0589m mVar2;
        if (rVar2 != null) {
            mVar2 = C0589m.m1675u(rVar2);
            mVar2.f2015x.remove(C5231g.f17323t);
        } else {
            mVar2 = C0589m.m1674t();
        }
        for (Config.C0564a next : this.f1864e.listOptions()) {
            mVar2.mo2502v(next, this.f1864e.mo2424c(next), this.f1864e.mo2422a(next));
        }
        if (rVar != null) {
            for (Config.C0564a next2 : rVar.listOptions()) {
                if (!next2.mo2447b().equals(C5231g.f17323t.f1951a)) {
                    mVar2.mo2502v(next2, rVar.mo2424c(next2), rVar.mo2422a(next2));
                }
            }
        }
        if (mVar2.mo2425e(C0587k.f2008i)) {
            C0572a aVar = C0587k.f2005f;
            if (mVar2.mo2425e(aVar)) {
                mVar2.f2015x.remove(aVar);
            }
        }
        return mo2385t(mVar, mo2373h(mVar2));
    }

    /* renamed from: k */
    public final void mo2376k() {
        this.f1862c = State.ACTIVE;
        mo2379n();
    }

    /* renamed from: l */
    public final void mo2377l() {
        this.f1862c = State.INACTIVE;
        mo2379n();
    }

    /* renamed from: m */
    public final void mo2378m() {
        Iterator it = this.f1860a.iterator();
        while (it.hasNext()) {
            ((C0540c) it.next()).mo2239d(this);
        }
    }

    /* renamed from: n */
    public final void mo2379n() {
        int i = C0538a.f1871a[this.f1862c.ordinal()];
        if (i == 1) {
            Iterator it = this.f1860a.iterator();
            while (it.hasNext()) {
                ((C0540c) it.next()).mo2241e(this);
            }
        } else if (i == 2) {
            Iterator it2 = this.f1860a.iterator();
            while (it2.hasNext()) {
                ((C0540c) it2.next()).mo2235a(this);
            }
        }
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: o */
    public final void mo2380o(CameraInternal cameraInternal, C0595r<?> rVar, C0595r<?> rVar2) {
        synchronized (this.f1861b) {
            this.f1869j = cameraInternal;
            this.f1860a.add(cameraInternal);
        }
        this.f1863d = rVar;
        this.f1867h = rVar2;
        C0595r<?> j = mo2375j(cameraInternal.getCameraInfoInternal(), this.f1863d, this.f1867h);
        this.f1865f = j;
        C0539b m = j.mo2494m();
        if (m != null) {
            cameraInternal.getCameraInfoInternal();
            m.mo2391a();
        }
        mo2381p();
    }

    /* renamed from: p */
    public void mo2381p() {
    }

    /* renamed from: q */
    public void mo2382q() {
    }

    /* renamed from: r */
    public final void mo2383r(CameraInternal cameraInternal) {
        boolean z;
        mo2384s();
        C0539b m = this.f1865f.mo2494m();
        if (m != null) {
            m.onDetach();
        }
        synchronized (this.f1861b) {
            if (cameraInternal == this.f1869j) {
                z = true;
            } else {
                z = false;
            }
            C24361g.m61175n(z);
            this.f1860a.remove(this.f1869j);
            this.f1869j = null;
        }
        this.f1866g = null;
        this.f1868i = null;
        this.f1865f = this.f1864e;
        this.f1863d = null;
        this.f1867h = null;
    }

    /* renamed from: s */
    public void mo2384s() {
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.camera.core.impl.r$a<?, ?, ?>, androidx.camera.core.impl.r$a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.camera.core.impl.C0595r<?> mo2385t(p066e0.C4443m r1, androidx.camera.core.impl.C0595r.C0596a<?, ?, ?> r2) {
        /*
            r0 = this;
            androidx.camera.core.impl.r r1 = r2.getUseCaseConfig()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.UseCase.mo2385t(e0.m, androidx.camera.core.impl.r$a):androidx.camera.core.impl.r");
    }

    /* renamed from: u */
    public void mo2386u() {
    }

    /* renamed from: v */
    public abstract Size mo2387v(Size size);

    /* renamed from: w */
    public void mo2388w(Matrix matrix) {
    }

    /* renamed from: x */
    public void mo2389x(Rect rect) {
        this.f1868i = rect;
    }

    /* renamed from: y */
    public final void mo2390y(SessionConfig sessionConfig) {
        this.f1870k = sessionConfig;
        for (DeferrableSurface next : sessionConfig.mo2457b()) {
            if (next.f1931h == null) {
                next.f1931h = getClass();
            }
        }
    }
}
