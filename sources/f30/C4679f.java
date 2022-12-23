package f30;

import android.os.Build;
import java.util.Arrays;
import java.util.TimeZone;
import p977zz.C20943i;

/* renamed from: f30.f */
public final class C4679f {

    /* renamed from: a */
    public final String f15938a = Build.DEVICE;

    /* renamed from: b */
    public final String f15939b = Build.MODEL;

    /* renamed from: c */
    public final String f15940c = Build.DISPLAY;

    /* renamed from: d */
    public final String f15941d = Build.MANUFACTURER;

    /* renamed from: e */
    public final String f15942e = Build.VERSION.RELEASE;

    /* renamed from: f */
    public final int f15943f = Build.VERSION.SDK_INT;

    /* renamed from: g */
    public final String[] f15944g;

    /* renamed from: h */
    public final TimeZone f15945h;

    public C4679f() {
        this.f15944g = C20943i.m49051d(21) ? Build.SUPPORTED_ABIS : new String[]{Build.CPU_ABI, Build.CPU_ABI2};
        this.f15945h = TimeZone.getDefault();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("SystemMetrics: [");
        k.append(this.f15938a);
        k.append(", ");
        k.append(this.f15939b);
        k.append(", ");
        k.append(this.f15940c);
        k.append(", ");
        k.append(this.f15941d);
        k.append(", ");
        k.append(this.f15942e);
        k.append(", ");
        k.append(this.f15943f);
        k.append(", ");
        k.append(Arrays.toString(this.f15944g));
        k.append(this.f15945h);
        k.append("]");
        return k.toString();
    }
}
