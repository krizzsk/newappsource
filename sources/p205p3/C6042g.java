package p205p3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import p081f3.C4656h;

/* renamed from: p3.g */
public final class C6042g {
    static {
        C4656h.m11961e("PackageManagerHelper");
    }

    /* renamed from: a */
    public static void m14529a(Context context, Class<?> cls, boolean z) {
        int i;
        String str;
        String str2 = "enabled";
        try {
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            C4656h c = C4656h.m11960c();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            if (z) {
                str = str2;
            } else {
                str = "disabled";
            }
            objArr[1] = str;
            String.format("%s %s", objArr);
            c.mo20176a(new Throwable[0]);
        } catch (Exception e) {
            C4656h c2 = C4656h.m11960c();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (!z) {
                str2 = "disabled";
            }
            objArr2[1] = str2;
            String.format("%s could not be %s", objArr2);
            c2.mo20176a(e);
        }
    }
}
