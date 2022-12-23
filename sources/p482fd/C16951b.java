package p482fd;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import androidx.appcompat.app.C0262r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: fd.b */
public final class C16951b {

    /* renamed from: c */
    public static final C0262r f43985c = new C0262r("MissingSplitsAppComponentsHelper");

    /* renamed from: a */
    public final Context f43986a;

    /* renamed from: b */
    public final PackageManager f43987b;

    public C16951b(Context context, PackageManager packageManager) {
        this.f43986a = context;
        this.f43987b = packageManager;
    }

    /* renamed from: a */
    public final List mo49576a() {
        try {
            ArrayList arrayList = new ArrayList();
            PackageInfo packageInfo = this.f43987b.getPackageInfo(this.f43986a.getPackageName(), 526);
            ProviderInfo[] providerInfoArr = packageInfo.providers;
            if (providerInfoArr != null) {
                Collections.addAll(arrayList, providerInfoArr);
            }
            ActivityInfo[] activityInfoArr = packageInfo.receivers;
            if (activityInfoArr != null) {
                Collections.addAll(arrayList, activityInfoArr);
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            if (serviceInfoArr != null) {
                Collections.addAll(arrayList, serviceInfoArr);
            }
            return arrayList;
        } catch (PackageManager.NameNotFoundException e) {
            f43985c.mo978e("Failed to resolve own package : %s", e);
            return Collections.emptyList();
        }
    }

    /* renamed from: b */
    public final void mo49577b(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ComponentInfo componentInfo = (ComponentInfo) it.next();
            this.f43987b.setComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name), i, 1);
        }
    }
}
