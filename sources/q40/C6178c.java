package q40;

import android.content.Context;
import android.content.SharedPreferences;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitApplication;
import com.moovit.network.model.ServerId;
import com.moovit.offline.GtfsConfiguration;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import l40.C5605d;
import p172m9.C5720b;
import p824tp.C19728f;
import p824tp.C19731i;
import p977zz.C20944i0;
import q00.C19047a;
import t40.C6590a;
import u00.C19815e;
import u40.C6698a;
import u40.C6699b;
import u40.C6702e;
import u40.C6704g;
import u40.C6705h;

/* renamed from: q40.c */
public final class C6178c {

    /* renamed from: a */
    public final C5605d f19568a;

    /* renamed from: b */
    public final C6177b f19569b = new C6177b();

    /* renamed from: c */
    public final ThreadPoolExecutor f19570c = C5720b.m14033A(5, "pt-group");

    /* renamed from: d */
    public final ThreadPoolExecutor f19571d = C5720b.m14033A(5, "pt-line");

    public C6178c(C5605d dVar) {
        this.f19568a = dVar;
    }

    /* renamed from: b */
    public static boolean m14732b(Context context, C19728f fVar) {
        boolean z;
        C19731i j = MoovitApplication.f37317k.mo44558j();
        j.getClass();
        C19815e d = j.mo52085c(fVar.f50165a).mo51802d();
        if (d.mo52120l(1231, context)) {
            File j2 = d.mo52118j(context, false);
            if (j2.exists() && j2.isDirectory()) {
                ArrayList b = GtfsConfiguration.m11401b(192);
                if (!b.isEmpty()) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("gtfs_dal", 0);
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        String str = (String) it.next();
                        File file = new File(j2, str);
                        if (!file.exists() || !file.isFile()) {
                            break;
                        }
                        String k = C25541a.m63881k("last_modified_", str);
                        Long l = Long.MIN_VALUE;
                        C21100e.m49373x(k, "name");
                        if (currentTimeMillis - Long.valueOf(sharedPreferences.getLong(k, l.longValue())).longValue() > C19815e.f50354e) {
                            break;
                        }
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final Task<C6590a> mo22161a(C13752e eVar, C19728f fVar, C19047a aVar, int i, ServerId serverId) {
        C6590a aVar2 = (C6590a) this.f19569b.f19566i.get(new C20944i0(Integer.valueOf(i), serverId));
        if (aVar2 != null) {
            return Tasks.forResult(aVar2);
        }
        C6698a aVar3 = new C6698a(eVar.f33852a, fVar, new C6702e(this, this.f19568a, this.f19569b, eVar, fVar, aVar, i, serverId));
        return Tasks.call(this.f19570c, aVar3).continueWith(this.f19570c, new C6705h()).continueWith(this.f19570c, new C6704g()).addOnCompleteListener((Executor) this.f19570c, aVar3).continueWith(this.f19570c, new C6699b());
    }
}
