package d40;

import com.moovit.navigation.NavigationGeofence;
import java.io.IOException;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

/* renamed from: d40.a */
public final class C4343a extends C4347c {

    /* renamed from: f */
    public static final C4344a f15310f = new C4344a();

    /* renamed from: g */
    public static final C4345b f15311g = new C4345b();

    /* renamed from: d */
    public boolean f15312d;

    /* renamed from: e */
    public NavigationGeofence f15313e = null;

    /* renamed from: d40.a$a */
    public class C4344a extends C19621u<C4343a> {
        public C4344a() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            C4343a aVar = (C4343a) obj;
            qVar.mo51939l(aVar.f15316a);
            qVar.mo51967q(aVar.f15317b, NavigationGeofence.f15044h);
            qVar.mo51934b(aVar.f15312d);
            qVar.mo51940m(aVar.f15318c);
        }
    }

    /* renamed from: d40.a$b */
    public class C4345b extends C19620t<C4343a> {
        public C4345b() {
            super(C4343a.class);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new C4343a(pVar.mo51924l(), (NavigationGeofence) pVar.mo51962q(NavigationGeofence.f15045i), pVar.mo51919b(), pVar.mo51925m());
        }
    }

    public C4343a(int i, NavigationGeofence navigationGeofence, boolean z, long j) {
        super(i, navigationGeofence, j);
        this.f15312d = z;
    }
}
