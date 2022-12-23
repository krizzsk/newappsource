package w70;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.moovit.sdk.profilers.ProfilersReactivator;
import e70.C4591d;
import p626lf.C18201b;
import p977zz.C20927a0;

/* renamed from: w70.d */
public final class C13214d implements C13216f {
    /* renamed from: a */
    public final void mo40086a(Context context) {
        boolean z;
        C4591d.m11903a(context).getClass();
        if (C4591d.m11904b() && C18201b.m44922s(context)) {
            if (context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, ProfilersReactivator.class)) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C20927a0.m49016k(context, ProfilersReactivator.class, true);
                Intent intent = new Intent("android.intent.action.MY_PACKAGE_REPLACED");
                intent.setClass(context.getApplicationContext(), ProfilersReactivator.class);
                context.sendBroadcast(intent);
            }
        }
    }
}
