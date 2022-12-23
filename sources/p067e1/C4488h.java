package p067e1;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: e1.h */
public final class C4488h {
    /* renamed from: a */
    public static <T> T m11710a(Context context, Class<T> cls) {
        return context.getSystemService(cls);
    }

    /* renamed from: b */
    public static int m11711b(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    /* renamed from: c */
    public static int m11712c(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    /* renamed from: d */
    public static String m11713d(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
