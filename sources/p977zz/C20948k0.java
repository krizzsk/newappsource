package p977zz;

import android.content.Context;
import p090g1.C4732a;

/* renamed from: zz.k0 */
public final class C20948k0 {
    /* renamed from: a */
    public static boolean m49058a(Context context, String... strArr) {
        for (String checkSelfPermission : strArr) {
            if (C4732a.checkSelfPermission(context, checkSelfPermission) != 0) {
                return false;
            }
        }
        return true;
    }
}
