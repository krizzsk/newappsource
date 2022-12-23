package p856ux;

import android.content.Context;
import c70.C13752e;
import com.moovit.appdata.UserContextLoader;
import f10.C16935f;
import java.io.File;
import p626lf.C18201b;
import p786rz.C19387a;
import p824tp.C19722a0;
import p977zz.C20943i;
import p977zz.C20964s0;
import x90.C13242b;
import y90.C13272f;

/* renamed from: ux.e */
public final class C20014e implements C13242b {

    /* renamed from: a */
    public final /* synthetic */ int f50859a;

    public /* synthetic */ C20014e(int i) {
        this.f50859a = i;
    }

    /* renamed from: a */
    public final void mo40113a(C13752e eVar) {
        C19722a0 a0Var;
        C13272f m;
        switch (this.f50859a) {
            case 0:
                File file = new File(eVar.f33852a.getCacheDir(), "mapItems");
                if (file.isDirectory()) {
                    C19387a.m46676h(file);
                    return;
                }
                return;
            case 1:
                Context context = eVar.f33852a;
                C19387a.m46676h(new File(context.getFilesDir(), "profilers/"));
                context.deleteFile("moovitWorld_activity_profiler_config_file_name");
                context.deleteFile("moovitWorld_bt_profiler_config_file_name");
                context.deleteFile("moovitWorld_charge_profiler_config_file_name");
                context.deleteFile("moovitWorld_places_profiler_config_file_name");
                context.deleteFile("moovitWorld_wifi_profiler_config_file_name");
                context.deleteFile("moovitWorld_wifi_scans_profiler_config_file_name");
                C20943i.m49049b(context, "profiler_results_uploader");
                C20943i.m49049b(context, "profilers_state_service_prefs");
                context.deleteFile("location_status_info_file_name");
                C13272f m2 = UserContextLoader.m40005m(context);
                if (m2 != null && !C20964s0.m49090h(m2.f32925a)) {
                    C18201b.m44928z(context, m2.f32925a);
                    return;
                }
                return;
            case 2:
                Context context2 = eVar.f33852a;
                if (UserContextLoader.m40004l(context2) && (m = UserContextLoader.m40005m(context2)) != null) {
                    a0Var = new C19722a0(m);
                } else {
                    a0Var = null;
                }
                if (a0Var != null && "5.24.0.373".equals(a0Var.f50160a.f32928d)) {
                    C16935f.m42762e(context2, (String) null);
                    return;
                }
                return;
            case 3:
                try {
                    Context context3 = eVar.f33852a;
                    for (String str : context3.fileList()) {
                        if (str.startsWith("taxi_config_provider")) {
                            context3.deleteFile(str);
                        }
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                eVar.f33852a.deleteFile("ticketing_user_wallet_store");
                return;
            default:
                eVar.f33852a.deleteFile("payment_account.dat");
                return;
        }
    }

    public final String toString() {
        switch (this.f50859a) {
            case 0:
                return "Upgrader123To124";
            case 1:
                return "Upgrader296To297";
            case 2:
                return "Upgrader372To373";
            case 3:
                return "Upgrader417To418";
            case 4:
                return "Upgrader464To465";
            default:
                return "Upgrader546To547";
        }
    }
}
