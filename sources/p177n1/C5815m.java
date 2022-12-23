package p177n1;

import android.content.Context;
import android.os.UserManager;

/* renamed from: n1.m */
public final class C5815m {
    /* renamed from: a */
    public static boolean m14248a(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}
