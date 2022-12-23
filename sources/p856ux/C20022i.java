package p856ux;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.core.app.JobIntentService;
import c70.C13752e;
import com.appsflyer.internal.referrer.Payload;
import com.moovit.app.index.UpdateIndexWithSearchHistoryService;
import com.moovit.appdata.UserContextLoader;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.genies.Genie;
import com.moovit.network.model.ServerId;
import java.io.File;
import java.util.Iterator;
import java.util.Locale;
import p786rz.C19387a;
import p824tp.C19722a0;
import p824tp.C19731i;
import p977zz.C20943i;
import p977zz.C20964s0;
import s00.C19393f;
import t00.C19623b;
import x90.C13242b;
import y90.C13266a;
import y90.C13272f;

/* renamed from: ux.i */
public final class C20022i implements C13242b {

    /* renamed from: a */
    public final /* synthetic */ int f50861a;

    public /* synthetic */ C20022i(int i) {
        this.f50861a = i;
    }

    /* renamed from: a */
    public final void mo40113a(C13752e eVar) {
        C13272f m;
        switch (this.f50861a) {
            case 0:
                File file = new File(new File(eVar.f33852a.getFilesDir(), "stores"), "navigation");
                if (file.isDirectory()) {
                    C19387a.m46676h(file);
                    return;
                }
                return;
            case 1:
                Context context = eVar.f33852a;
                boolean z = false;
                File dir = context.getDir("gtfs_configurations", 0);
                if (dir.isDirectory()) {
                    C19387a.m46676h(dir);
                }
                int i = UpdateIndexWithSearchHistoryService.f38435l;
                JobIntentService.m2303a(context, UpdateIndexWithSearchHistoryService.class, 1975, new Intent());
                Genie.LINE_VIEW_DIRECTIONS.setSeen(context);
                Genie.SUGGESTED_ROUTES_FIRST_ITINERARY.setSeen(context);
                Genie.LINE_VIEW_REPORT.setSeen(context);
                Genie.SUGGESTED_ROUTES_MULTI_ROUTES.setSeen(context);
                Genie.CARPOOL_PROMOTION.setSeen(context);
                String str = Build.MANUFACTURER;
                if (!C20964s0.m49090h(str)) {
                    z = str.toLowerCase(Locale.US).contains(Payload.SOURCE_HUAWEI);
                }
                if (z) {
                    C13266a.m33390e(context);
                    return;
                }
                return;
            case 2:
                Context context2 = eVar.f33852a;
                C19393f fVar = C19393f.f49325q;
                SQLiteDatabase readableDatabase = DatabaseHelper.get(context2).getReadableDatabase();
                fVar.getClass();
                Iterator it = C19393f.m46695e(readableDatabase).iterator();
                while (it.hasNext()) {
                    StringBuilder k = C13555b.m33972k("trip_plan_prefs_");
                    k.append(((ServerId) it.next()).mo19751c());
                    C20943i.m49049b(context2, k.toString());
                }
                return;
            case 3:
                Context context3 = eVar.f33852a;
                C19722a0 a0Var = null;
                if (UserContextLoader.m40004l(context3) && (m = UserContextLoader.m40005m(context3)) != null) {
                    a0Var = new C19722a0(m);
                }
                if (a0Var != null) {
                    C19623b c = C19731i.m47197a(context3).f50175e.mo51800c();
                    ServerId serverId = a0Var.f50160a.f32927c;
                    c.getClass();
                    C19623b.m47058d(context3, serverId);
                    return;
                }
                return;
            default:
                Context context4 = eVar.f33852a;
                C20943i.m49049b(context4, "com.moovit.braze.profile");
                context4.deleteFile("app_gcm_actions_state_v2.dat");
                return;
        }
    }

    public final String toString() {
        switch (this.f50861a) {
            case 0:
                return "Upgrader154To155";
            case 1:
                return "Upgrader301To302";
            case 2:
                return "Upgrader380To381";
            case 3:
                return "Upgrader424To425";
            default:
                return "Upgrader477To478";
        }
    }
}
