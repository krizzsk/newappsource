package p067e1;

import android.os.Bundle;
import android.os.IBinder;

/* renamed from: e1.j */
public final class C4494j {
    /* renamed from: a */
    public static IBinder m11719a(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    /* renamed from: b */
    public static void m11720b(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}
