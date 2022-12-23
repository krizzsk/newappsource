package ud0;

import android.os.Bundle;
import android.util.Log;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.persistence.C23209b;
import com.vungle.warren.persistence.C23210c;
import com.vungle.warren.persistence.DatabaseHelper;
import java.io.IOException;
import java.util.List;
import od0.C24568o;
import qd0.C24732e;
import td0.C24935e;

/* renamed from: ud0.k */
public final class C25028k implements C25021e {

    /* renamed from: c */
    public static final /* synthetic */ int f63210c = 0;

    /* renamed from: a */
    public C23192a f63211a;

    /* renamed from: b */
    public VungleApiClient f63212b;

    public C25028k(VungleApiClient vungleApiClient, C23192a aVar) {
        this.f63211a = aVar;
        this.f63212b = vungleApiClient;
    }

    /* renamed from: b */
    public static C25023g m62740b(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("sendAll", z);
        C25023g gVar = new C25023g("ud0.k");
        gVar.f63202g = bundle;
        gVar.f63204i = 5;
        gVar.f63200e = 30000;
        gVar.f63203h = 1;
        return gVar;
    }

    /* renamed from: a */
    public final int mo61555a(Bundle bundle, C25024h hVar) {
        List<C24568o> list;
        if (bundle.getBoolean("sendAll", false)) {
            C23192a aVar = this.f63211a;
            aVar.getClass();
            list = (List) new C24935e(aVar.f58875b.submit(new C23209b(aVar))).get();
        } else {
            C23192a aVar2 = this.f63211a;
            aVar2.getClass();
            list = (List) new C24935e(aVar2.f58875b.submit(new C23210c(aVar2))).get();
        }
        if (list == null) {
            return 1;
        }
        for (C24568o oVar : list) {
            try {
                C24732e a = this.f63212b.mo58082k(oVar.mo60839c()).mo61216a();
                if (a.f62601a.f59412d == 200) {
                    this.f63211a.mo58271f(oVar);
                } else {
                    oVar.f62269a = 3;
                    this.f63211a.mo58288w(oVar);
                    this.f63212b.getClass();
                    long g = VungleApiClient.m57014g(a);
                    if (g > 0) {
                        C25023g b = m62740b(false);
                        b.f63199d = g;
                        hVar.mo58356b(b);
                        return 1;
                    }
                }
            } catch (IOException e) {
                for (C24568o oVar2 : list) {
                    oVar2.f62269a = 3;
                    try {
                        this.f63211a.mo58288w(oVar2);
                    } catch (DatabaseHelper.DBException unused) {
                        return 1;
                    }
                }
                Log.getStackTraceString(e);
                return 2;
            } catch (DatabaseHelper.DBException unused2) {
            }
        }
        return 0;
    }
}
