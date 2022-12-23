package kd0;

import android.os.Bundle;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.vungle.warren.C23231u1;
import p198o9.C6012a;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: kd0.d */
public final class C23759d {

    /* renamed from: b */
    public static C23759d f60026b;

    /* renamed from: a */
    public final ConcurrentHashMap<String, C6012a> f60027a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static String m58338a(Bundle bundle, Bundle bundle2) {
        String str;
        if (bundle == null || !bundle.containsKey("playPlacement")) {
            str = null;
        } else {
            str = bundle.getString("playPlacement");
        }
        if (bundle2 != null && bundle2.containsKey("placementID")) {
            if (str != null) {
                String str2 = VungleMediationAdapter.TAG;
            }
            str = bundle2.getString("placementID");
        }
        if (str == null) {
            String str3 = VungleMediationAdapter.TAG;
        }
        return str;
    }

    /* renamed from: b */
    public static synchronized C23759d m58339b() {
        C23759d dVar;
        synchronized (C23759d.class) {
            if (f60026b == null) {
                f60026b = new C23759d();
            }
            dVar = f60026b;
        }
        return dVar;
    }

    /* renamed from: c */
    public final void mo59003c(String str, C6012a aVar) {
        String str2 = VungleMediationAdapter.TAG;
        if (this.f60027a.remove(str, aVar) && aVar != null) {
            this.f60027a.size();
            aVar.mo22016a();
            C23231u1 u1Var = aVar.f19211b;
            if (u1Var != null) {
                u1Var.hashCode();
                C23231u1 u1Var2 = aVar.f19211b;
                u1Var2.mo58322a(true);
                u1Var2.f58957e = true;
                u1Var2.f58961i = null;
                aVar.f19211b = null;
            }
        }
    }
}
