package p304x;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.C0546b;
import androidx.camera.core.C0547c;
import androidx.camera.core.CameraState;
import androidx.lifecycle.C1040t;
import androidx.lifecycle.C1044w;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p001a0.C0014e;
import p054d0.C4289j0;
import p066e0.C4424e;
import p066e0.C4436j0;
import p066e0.C4443m;
import p089g0.C4720a;
import p176n0.C5786e;
import p316y.C7197a0;
import p316y.C7225s;
import p389bl.C13641g;

/* renamed from: x.z */
public final class C7124z implements C4443m {

    /* renamed from: a */
    public final String f22138a;

    /* renamed from: b */
    public final C7225s f22139b;

    /* renamed from: c */
    public final Object f22140c = new Object();

    /* renamed from: d */
    public C7090q f22141d;

    /* renamed from: e */
    public final C7125a<CameraState> f22142e;

    /* renamed from: f */
    public ArrayList f22143f = null;

    /* renamed from: g */
    public final C4436j0 f22144g;

    /* renamed from: x.z$a */
    public static class C7125a<T> extends C1040t<T> {

        /* renamed from: a */
        public LiveData<T> f22145a;

        /* renamed from: b */
        public T f22146b;

        public C7125a(C0546b bVar) {
            this.f22146b = bVar;
        }

        public final <S> void addSource(LiveData<S> liveData, C1044w<? super S> wVar) {
            throw new UnsupportedOperationException();
        }

        public final T getValue() {
            LiveData<T> liveData = this.f22145a;
            return liveData == null ? this.f22146b : liveData.getValue();
        }

        public final void redirectTo(LiveData<T> liveData) {
            LiveData<T> liveData2 = this.f22145a;
            if (liveData2 != null) {
                super.removeSource(liveData2);
            }
            this.f22145a = liveData;
            super.addSource(liveData, new C7121y(this, 0));
        }
    }

    public C7124z(String str, C7197a0 a0Var) throws CameraAccessExceptionCompat {
        str.getClass();
        this.f22138a = str;
        C7225s b = a0Var.mo23499b(str);
        this.f22139b = b;
        this.f22144g = C13641g.m34121i(b);
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            C4289j0.m11435b("Camera2CamcorderProfileProvider");
        }
        C0014e eVar = (C0014e) C13641g.m34121i(b).mo19960g(C0014e.class);
        if (eVar != null) {
            new HashSet(new ArrayList(eVar.f5a));
        } else {
            Collections.emptySet();
        }
        this.f22142e = new C7125a<>(new C0546b(CameraState.Type.CLOSED, (C0547c) null));
    }

    /* renamed from: a */
    public final void mo19976a(C4720a aVar, C5786e eVar) {
        synchronized (this.f22140c) {
            C7090q qVar = this.f22141d;
            if (qVar == null) {
                if (this.f22143f == null) {
                    this.f22143f = new ArrayList();
                }
                this.f22143f.add(new Pair(eVar, aVar));
                return;
            }
            qVar.f22036c.execute(new C7064j(0, qVar, aVar, eVar));
        }
    }

    /* renamed from: b */
    public final void mo19977b(C4424e eVar) {
        synchronized (this.f22140c) {
            C7090q qVar = this.f22141d;
            if (qVar == null) {
                ArrayList arrayList = this.f22143f;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((Pair) it.next()).first == eVar) {
                            it.remove();
                        }
                    }
                    return;
                }
                return;
            }
            qVar.f22036c.execute(new C7041e(0, qVar, eVar));
        }
    }

    /* renamed from: c */
    public final String mo23375c() {
        return mo23376d() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    /* renamed from: d */
    public final int mo23376d() {
        Integer num = (Integer) this.f22139b.mo23532a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue();
    }

    /* renamed from: e */
    public final void mo23377e(C7090q qVar) {
        synchronized (this.f22140c) {
            try {
                this.f22141d = qVar;
                ArrayList arrayList = this.f22143f;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        C7090q qVar2 = this.f22141d;
                        qVar2.f22036c.execute(new C7064j(0, qVar2, (Executor) pair.second, (C4424e) pair.first));
                    }
                    this.f22143f = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        mo23376d();
        C4289j0.m11435b("Camera2CameraInfo");
    }

    public final String getCameraId() {
        return this.f22138a;
    }

    public final C4436j0 getCameraQuirks() {
        return this.f22144g;
    }

    public final Integer getLensFacing() {
        Integer num = (Integer) this.f22139b.mo23532a(CameraCharacteristics.LENS_FACING);
        num.getClass();
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue != 1) {
            return null;
        }
        return 1;
    }

    public final int getSensorRotationDegrees(int i) {
        Integer num = (Integer) this.f22139b.mo23532a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        Integer valueOf = Integer.valueOf(num.intValue());
        int A = C13641g.m34109A(i);
        Integer lensFacing = getLensFacing();
        boolean z = true;
        if (lensFacing == null || 1 != lensFacing.intValue()) {
            z = false;
        }
        return C13641g.m34127p(A, valueOf.intValue(), z);
    }
}
