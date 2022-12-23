package com.moovit.sdk.profilers;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.appboy.AppboyBootReceiver;
import com.moovit.sdk.utils.SafeBroadcastReceiver;
import java.util.concurrent.TimeUnit;
import n70.C18535a;
import n70.C18536b;

public class ProfilersReactivator extends SafeBroadcastReceiver {
    static {
        Class<ProfilersReactivator> cls = ProfilersReactivator.class;
    }

    /* renamed from: a */
    public final void mo23871a(Context context, Intent intent) {
        int i;
        String str;
        String action = intent.getAction();
        ProfilerLog c = ProfilerLog.m41879c(context);
        c.mo49244b("ProfilersReactivator", "Received action " + action);
        action.getClass();
        char c2 = 65535;
        switch (action.hashCode()) {
            case -1787487905:
                if (action.equals("android.intent.action.QUICKBOOT_POWERON")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1417835046:
                if (action.equals("com.htc.intent.action.QUICKBOOT_POWERON")) {
                    c2 = 1;
                    break;
                }
                break;
            case 798292259:
                if (action.equals(AppboyBootReceiver.BOOT_COMPLETE_ACTION)) {
                    c2 = 2;
                    break;
                }
                break;
            case 1737074039:
                if (action.equals("android.intent.action.MY_PACKAGE_REPLACED")) {
                    c2 = 3;
                    break;
                }
                break;
            case 2128850451:
                if (action.equals("com.moovit.profiler.ProfilersReactivator.RESTORE_STATE_ACTION")) {
                    c2 = 4;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
            case 1:
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 4;
                break;
            default:
                ProfilerLog c3 = ProfilerLog.m41879c(context);
                c3.mo49244b("ProfilersReactivator", "Received unknown action: " + action);
                return;
        }
        Class<ProfilersReactivator> cls = ProfilersReactivator.class;
        ((PowerManager) context.getSystemService("power")).newWakeLock(1, "ProfilersReactivator").acquire(TimeUnit.MINUTES.toMillis(1));
        C18536b.m45451a().getClass();
        for (C18535a aVar : C18536b.m45452b(context)) {
            if (aVar.mo50941j()) {
                if (i == 1) {
                    str = "reboot";
                } else if (i == 2) {
                    str = "package upgrade";
                } else if (i != 4) {
                    str = "";
                } else {
                    str = "restore state";
                }
                aVar.mo50942l("Restoring profiler state due to " + str);
                aVar.mo49255m(i);
                aVar.mo50942l("Profiler reactivated due to " + str);
            }
        }
    }
}
