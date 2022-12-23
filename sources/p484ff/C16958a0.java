package p484ff;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;

@KeepForSdk
/* renamed from: ff.a0 */
public final class C16958a0 {

    /* renamed from: e */
    public static C16958a0 f44014e;

    /* renamed from: a */
    public String f44015a = null;

    /* renamed from: b */
    public Boolean f44016b = null;

    /* renamed from: c */
    public Boolean f44017c = null;

    /* renamed from: d */
    public final ArrayDeque f44018d = new ArrayDeque();

    /* renamed from: a */
    public static synchronized C16958a0 m42795a() {
        C16958a0 a0Var;
        synchronized (C16958a0.class) {
            if (f44014e == null) {
                f44014e = new C16958a0();
            }
            a0Var = f44014e;
        }
        return a0Var;
    }

    /* renamed from: b */
    public final boolean mo49581b(Context context) {
        boolean z;
        if (this.f44017c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f44017c = Boolean.valueOf(z);
        }
        boolean booleanValue = this.f44016b.booleanValue();
        return this.f44017c.booleanValue();
    }

    /* renamed from: c */
    public final boolean mo49582c(Context context) {
        boolean z;
        if (this.f44016b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f44016b = Boolean.valueOf(z);
        }
        boolean booleanValue = this.f44016b.booleanValue();
        return this.f44016b.booleanValue();
    }
}
