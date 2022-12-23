package n20;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import com.moovit.MoovitApplication;
import com.moovit.appdata.UserContextLoader;
import com.moovit.offline.GtfsConfiguration;
import g30.C4776h;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import l40.C5603c;
import m20.C18322a;
import p081f3.C4648b;
import p081f3.C4665k;
import p824tp.C19722a0;
import p824tp.C19728f;

/* renamed from: n20.a */
public final class C18511a implements C18322a {
    /* renamed from: a */
    public final String mo50104a() {
        return "gtfs_dynamic_data_updater";
    }

    /* renamed from: b */
    public final C4665k mo50105b() {
        C4665k.C4666a b = C16530d.m42009b(this, 1, TimeUnit.DAYS, 12, TimeUnit.HOURS);
        C4648b.C4649a aVar = new C4648b.C4649a();
        aVar.f15887c = NetworkType.UNMETERED;
        return (C4665k) ((C4665k.C4666a) b.mo20192f(new C4648b(aVar))).mo20190b();
    }

    /* renamed from: c */
    public final ListenableWorker.C1379a mo50106c(Context context) throws Exception {
        C19722a0 a0Var;
        if (!UserContextLoader.m40004l(context)) {
            a0Var = null;
        } else {
            a0Var = (C19722a0) MoovitApplication.f37317k.f37321e.mo50695h("USER_CONTEXT", true);
        }
        if (a0Var == null) {
            return new ListenableWorker.C1379a.C1382c();
        }
        GtfsConfiguration gtfsConfiguration = (GtfsConfiguration) MoovitApplication.f37317k.f37321e.mo50695h("GTFS_CONFIGURATION", true);
        if (gtfsConfiguration == null) {
            return new ListenableWorker.C1379a.C1381b();
        }
        if ((gtfsConfiguration.f15147b & 192) == 0) {
            return new ListenableWorker.C1379a.C1382c();
        }
        C19728f fVar = (C19728f) MoovitApplication.f37317k.f37321e.mo50695h("METRO_CONTEXT", true);
        if (fVar == null) {
            return new ListenableWorker.C1379a.C1381b();
        }
        C4776h hVar = fVar.f50165a;
        try {
            if (new C5603c(context, hVar.f16126a, hVar.f16127b, hVar.f16128c, gtfsConfiguration.f15147b & 192, true).call().booleanValue()) {
                return new ListenableWorker.C1379a.C1382c();
            }
            return new ListenableWorker.C1379a.C1380a();
        } catch (Exception e) {
            throw new IOException("Failed to download dynamic GTFS files!", e);
        }
    }
}
