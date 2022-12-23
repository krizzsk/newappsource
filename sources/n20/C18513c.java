package n20;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import com.moovit.MoovitApplication;
import com.moovit.appdata.UserContextLoader;
import com.moovit.offline.GtfsConfiguration;
import java.util.concurrent.TimeUnit;
import m20.C18322a;
import p081f3.C4648b;
import p081f3.C4665k;
import p824tp.C19722a0;

/* renamed from: n20.c */
public final class C18513c implements C18322a {
    /* renamed from: a */
    public final String mo50104a() {
        return "gtfs_initializer";
    }

    /* renamed from: b */
    public final C4665k mo50105b() {
        C4665k.C4666a b = C16530d.m42009b(this, 1, TimeUnit.DAYS, 12, TimeUnit.HOURS);
        C4648b.C4649a aVar = new C4648b.C4649a();
        aVar.f15887c = NetworkType.UNMETERED;
        return (C4665k) ((C4665k.C4666a) b.mo20192f(new C4648b(aVar))).mo20190b();
    }

    /* renamed from: c */
    public final ListenableWorker.C1379a mo50106c(Context context) {
        C19722a0 a0Var;
        if (!UserContextLoader.m40004l(context)) {
            a0Var = null;
        } else {
            a0Var = (C19722a0) MoovitApplication.f37317k.f37321e.mo50695h("USER_CONTEXT", true);
        }
        if (a0Var == null) {
            return new ListenableWorker.C1379a.C1382c();
        }
        if (((GtfsConfiguration) MoovitApplication.f37317k.f37321e.mo50695h("GTFS_CONFIGURATION", true)) == null) {
            return new ListenableWorker.C1379a.C1381b();
        }
        if (MoovitApplication.f37317k.f37321e.mo50702n("GTFS_CONFIGURATION")) {
            return new ListenableWorker.C1379a.C1382c();
        }
        return new ListenableWorker.C1379a.C1380a();
    }
}
