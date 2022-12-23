package n20;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import com.moovit.MoovitApplication;
import java.util.concurrent.TimeUnit;
import m20.C18322a;
import p081f3.C4648b;
import p081f3.C4665k;
import p646lz.C18299a;

/* renamed from: n20.h */
public final class C18521h implements C18322a {
    /* renamed from: a */
    public final String mo50104a() {
        return "search_fts_data_updater";
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
        boolean z;
        boolean z2;
        C18299a aVar = MoovitApplication.f37317k.f37321e;
        boolean z3 = false;
        if (aVar.mo50695h("SEARCH_LINE_FTS", false) != null) {
            z = true;
        } else {
            z = false;
        }
        if (aVar.mo50695h("SEARCH_STOP_FTS", false) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = z & z2;
        if (aVar.mo50695h("SEARCH_CUSTOM_POI_FTS", false) != null) {
            z3 = true;
        }
        if (z4 && z3) {
            return new ListenableWorker.C1379a.C1382c();
        }
        return new ListenableWorker.C1379a.C1380a();
    }
}
