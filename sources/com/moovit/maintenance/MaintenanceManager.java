package com.moovit.maintenance;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.ExistingPeriodicWorkPolicy;
import com.appboy.AppboyBootReceiver;
import com.moovit.appdata.UserContextLoader;
import java.util.ArrayList;
import java.util.Iterator;
import m20.C18322a;
import p081f3.C4665k;
import p092g3.C4763k;
import p241s0.C6302b;
import p435de.C16596f;

public final class MaintenanceManager extends BroadcastReceiver {

    /* renamed from: a */
    public static final C6302b f42315a = new C6302b();

    /* renamed from: a */
    public static void m41335a(C18322a aVar) {
        C6302b bVar = f42315a;
        synchronized (bVar) {
            String a = aVar.mo50104a();
            if (bVar.containsKey(a)) {
                C16596f a2 = C16596f.m42113a();
                a2.mo49364c(new IllegalStateException("Duplicate maintenance job ids: " + a));
                return;
            }
            bVar.put(a, aVar);
        }
    }

    /* renamed from: b */
    public static void m41336b(Context context) {
        ArrayList arrayList;
        C6302b bVar = f42315a;
        synchronized (bVar) {
            arrayList = new ArrayList(bVar.values());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C18322a aVar = (C18322a) it.next();
            C4665k b = aVar.mo50105b();
            C4763k.m12079g(context).mo20276f(C25541a.m63881k("maintenance_job#", aVar.mo50104a()), ExistingPeriodicWorkPolicy.KEEP, b);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if ((AppboyBootReceiver.BOOT_COMPLETE_ACTION.equals(str) || "android.intent.action.MY_PACKAGE_REPLACED".equals(str)) && UserContextLoader.m40004l(context)) {
            m41336b(context);
        }
    }
}
