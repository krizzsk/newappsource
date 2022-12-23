package fc0;

import ce0.C21100e;
import com.umo.ads.p350u.zzp;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: fc0.c */
public final class C12673c {

    /* renamed from: a */
    public boolean f31319a = true;

    /* renamed from: b */
    public zzp f31320b = zzp.NONE;

    public final String toString() {
        String str;
        int ordinal = this.f31320b.ordinal();
        if (ordinal == 0) {
            str = "portrait";
        } else if (ordinal == 1) {
            str = "landscape";
        } else if (ordinal == 2) {
            str = "none";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        StringBuilder J0 = C21100e.m49315J0("{ allowOrientationChange: '");
        J0.append(this.f31319a);
        J0.append("', forceOrientation: '");
        J0.append(str);
        J0.append("' }");
        return J0.toString();
    }
}
