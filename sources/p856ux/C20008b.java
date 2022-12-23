package p856ux;

import aa0.C7537i;
import android.content.Context;
import c00.C13729j;
import c70.C13752e;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import java.io.File;
import java.util.Iterator;
import p435de.C16596f;
import p669mz.C18482c;
import p786rz.C19387a;
import p824tp.C19722a0;
import p824tp.C19731i;
import s00.C19393f;
import t00.C19623b;
import x90.C13242b;
import y90.C13272f;

/* renamed from: ux.b */
public final class C20008b implements C13242b {

    /* renamed from: a */
    public final /* synthetic */ int f50856a;

    public /* synthetic */ C20008b(int i) {
        this.f50856a = i;
    }

    /* renamed from: a */
    public final void mo40113a(C13752e eVar) {
        C13272f m;
        C13272f m2;
        int i = this.f50856a;
        switch (i) {
            case 0:
                Context context = eVar.f33852a;
                context.deleteDatabase("mapcache");
                File file = new File(new File(context.getFilesDir(), "stores"), "navigation");
                if (file.isDirectory()) {
                    C19387a.m46674f(file);
                    return;
                }
                return;
            case 1:
            case 2:
                return;
            case 3:
                Context context2 = eVar.f33852a;
                SQLiteDatabase readableDatabase = DatabaseHelper.get(context2).getReadableDatabase();
                C19393f.f49325q.getClass();
                Iterator it = C19393f.m46695e(readableDatabase).iterator();
                while (it.hasNext()) {
                    ServerId serverId = (ServerId) it.next();
                    try {
                        C7537i iVar = new C7537i(context2, "recent_search_locations", serverId, LocationDescriptor.f23646m, LocationDescriptor.f23645l);
                        iVar.mo51501d();
                        boolean z = false;
                        iVar.mo51499b();
                        Iterator<T> it2 = iVar.f48432b.iterator();
                        while (true) {
                            C13729j jVar = (C13729j) it2;
                            if (jVar.hasNext()) {
                                if (((LocationDescriptor) jVar.next()).mo24310d() == null) {
                                    ((C18482c.C18483a) it2).remove();
                                    z = true;
                                }
                            } else if (z) {
                                iVar.mo51500c();
                            }
                        }
                    } catch (Exception e) {
                        C16596f a = C16596f.m42113a();
                        a.mo49364c(new ApplicationBugException("Failed to fix recent search location store for metro_id=" + serverId, e));
                    }
                }
                return;
            case 4:
                eVar.f33852a.deleteFile("payment_account.dat");
                return;
            default:
                Context context3 = eVar.f33852a;
                C19722a0 a0Var = null;
                switch (i) {
                    case 2:
                        if (UserContextLoader.m40004l(context3) && (m2 = UserContextLoader.m40005m(context3)) != null) {
                            a0Var = new C19722a0(m2);
                            break;
                        }
                    default:
                        if (UserContextLoader.m40004l(context3) && (m = UserContextLoader.m40005m(context3)) != null) {
                            a0Var = new C19722a0(m);
                            break;
                        }
                }
                if (a0Var != null) {
                    C19623b c = C19731i.m47197a(context3).f50175e.mo51800c();
                    ServerId serverId2 = a0Var.f50160a.f32927c;
                    c.getClass();
                    C19623b.m47058d(context3, serverId2);
                    return;
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f50856a) {
            case 0:
                return "Upgrader115To116";
            case 1:
                return "Upgrader270To271";
            case 2:
                return "Upgrader366To367";
            case 3:
                return "Upgrader411To412";
            case 4:
                return "Upgrader450To451";
            default:
                return "Upgrader518To519";
        }
    }
}
