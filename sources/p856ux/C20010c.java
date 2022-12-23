package p856ux;

import aa0.C7537i;
import android.content.Context;
import c70.C13752e;
import com.moovit.appdata.UserContextLoader;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.network.model.ServerId;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import mf0.C24361g;
import n10.C18508e;
import n20.C18516f;
import p786rz.C19387a;
import p824tp.C19722a0;
import p977zz.C20943i;
import x90.C13242b;
import y90.C13272f;

/* renamed from: ux.c */
public final class C20010c implements C13242b {

    /* renamed from: a */
    public final /* synthetic */ int f50857a;

    public /* synthetic */ C20010c(int i) {
        this.f50857a = i;
    }

    /* renamed from: a */
    public final void mo40113a(C13752e eVar) {
        switch (this.f50857a) {
            case 0:
                Context context = eVar.f33852a;
                File file = new File(new File(context.getFilesDir(), "stores"), "search_line_history");
                if (file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (!C24361g.m61154X(listFiles)) {
                        for (File name : listFiles) {
                            ServerId b = ServerId.m11392b(name.getName());
                            C7537i iVar = new C7537i(context, "search_line_history", b, SearchLineItem.f41636j, SearchLineItem.f41635i);
                            iVar.mo51501d();
                            iVar.mo51499b();
                            ArrayList d = ServerId.m11393d(iVar.f48432b);
                            Collections.reverse(d);
                            C18508e eVar2 = new C18508e(context, b);
                            eVar2.mo51501d();
                            eVar2.mo51499b();
                            eVar2.f48438c.mo40646d(d);
                            eVar2.mo51500c();
                        }
                        C19387a.m46676h(file);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Context context2 = eVar.f33852a;
                C13272f m = UserContextLoader.m40005m(context2);
                if (m != null) {
                    C18516f.m45397d(context2, new C19722a0(m));
                }
                context2.deleteFile("location_triggers_state.dat");
                context2.deleteFile("dc_geofence_objects");
                context2.deleteFile("geofence_entry_location_file");
                context2.deleteFile("dynamic_geofence_file");
                return;
            case 2:
                Context context3 = eVar.f33852a;
                context3.deleteFile("new_dynamic_geofence_file");
                context3.deleteFile("dc_new_dynamic_geofence_objects");
                context3.deleteFile("geofence_entry_location_file");
                context3.deleteFile("collector_service_state_new");
                context3.deleteFile("data_collection.log");
                context3.deleteFile("wifi_connections_conf_dc_file");
                context3.deleteFile("dc_file_bin");
                C20943i.m49049b(context3, "data_collection");
                C20943i.m49049b(context3, "data_collection_last_modified_prefs_name");
                return;
            case 3:
                try {
                    C19387a.m46676h(new File(new File(eVar.f33852a.getFilesDir(), "stores"), "metro_languages"));
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 4:
                Context context4 = eVar.f33852a;
                C19387a.m46676h(new File(context4.getFilesDir(), "masabi_config"));
                context4.deleteFile("ticketing_user_wallet_store");
                return;
            default:
                Context context5 = eVar.f33852a;
                C20943i.m49049b(context5, "ResourceRequest");
                context5.deleteFile("supported_metros.dat");
                C19387a.m46675g(context5.getDir("survey_configurations", 0));
                return;
        }
    }

    public final String toString() {
        switch (this.f50857a) {
            case 0:
                return "Upgrader119To120";
            case 1:
                return "Upgrader290To291";
            case 2:
                return "Upgrader368To369";
            case 3:
                return "Upgrader414To415";
            case 4:
                return "Upgrader455To456";
            default:
                return "Upgrader526To527";
        }
    }
}
