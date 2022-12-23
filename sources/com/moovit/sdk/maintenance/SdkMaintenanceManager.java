package com.moovit.sdk.maintenance;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.appboy.AppboyBootReceiver;
import com.moovit.sdk.profilers.ProfilersReactivator;
import com.moovit.sdk.utils.WorkManagerReceiver;
import e70.C4591d;
import l70.C18178a;
import m70.C18349a;
import m70.C18351b;
import m70.C18352c;
import p241s0.C6302b;
import p626lf.C18201b;
import p977zz.C20927a0;

public final class SdkMaintenanceManager extends BroadcastReceiver {

    /* renamed from: a */
    public static final C6302b f43000a = new C6302b(3);

    static {
        Class<SdkMaintenanceManager> cls = SdkMaintenanceManager.class;
        m41873a(new C18352c());
        m41873a(new C18349a());
        m41873a(new C18351b());
    }

    /* renamed from: a */
    public static void m41873a(C18178a aVar) {
        C6302b bVar = f43000a;
        synchronized (bVar) {
            String a = aVar.mo50598a();
            if (!bVar.containsKey(a)) {
                bVar.put(a, aVar);
            } else {
                throw new IllegalStateException("Duplicate maintenance job: " + a);
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (AppboyBootReceiver.BOOT_COMPLETE_ACTION.equals(str) || "android.intent.action.MY_PACKAGE_REPLACED".equals(str)) {
            boolean s = C18201b.m44922s(context);
            if (s) {
                C20927a0.m49016k(context, ProfilersReactivator.class, true);
            }
            C4591d.m11903a(context).getClass();
            if (C4591d.m11904b() && s) {
                WorkManagerReceiver.m17339b(context, "com.moovit.sdk.action.SCHEDULE_MAINTENANCE_JOBS");
            } else if (s) {
                WorkManagerReceiver.m17339b(context, "com.moovit.sdk.action.SCHEDULE_CREATE_USER");
            } else {
                WorkManagerReceiver.m17339b(context, "com.moovit.sdk.action.CANCEL_MAINTENANCE_JOBS");
            }
        }
    }
}
