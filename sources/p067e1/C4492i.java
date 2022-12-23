package p067e1;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: e1.i */
public final class C4492i {
    /* renamed from: a */
    public static int m11716a(AppOpsManager appOpsManager, String str, int i, String str2) {
        if (appOpsManager == null) {
            return 1;
        }
        return appOpsManager.checkOpNoThrow(str, i, str2);
    }

    /* renamed from: b */
    public static String m11717b(Context context) {
        return context.getOpPackageName();
    }

    /* renamed from: c */
    public static AppOpsManager m11718c(Context context) {
        return (AppOpsManager) context.getSystemService(AppOpsManager.class);
    }
}
