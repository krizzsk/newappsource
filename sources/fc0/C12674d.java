package fc0;

import ce0.C21100e;
import com.umo.ads.p350u.zzm;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: fc0.d */
public final class C12674d {

    /* renamed from: a */
    public int f31321a;

    /* renamed from: b */
    public int f31322b;

    /* renamed from: c */
    public zzm f31323c = zzm.TOPRIGHT;

    /* renamed from: d */
    public int f31324d;

    /* renamed from: e */
    public int f31325e;

    /* renamed from: f */
    public boolean f31326f;

    public final String toString() {
        String str;
        switch (this.f31323c.ordinal()) {
            case 0:
                str = "top-left";
                break;
            case 1:
                str = "top-center";
                break;
            case 2:
                str = "top-right";
                break;
            case 3:
                str = "center";
                break;
            case 4:
                str = "bottom-left";
                break;
            case 5:
                str = "bottom-center";
                break;
            case 6:
                str = "bottom-right";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        StringBuilder J0 = C21100e.m49315J0("{ width: ");
        J0.append(this.f31321a);
        J0.append(", height: ");
        J0.append(this.f31322b);
        J0.append(", customClosePosition: '");
        J0.append(str);
        J0.append("', offsetX: ");
        J0.append(this.f31324d);
        J0.append(", offsetY: ");
        J0.append(this.f31325e);
        J0.append(", allowOffscreen: '");
        return C25541a.m63885p(J0, this.f31326f, "' }");
    }
}
