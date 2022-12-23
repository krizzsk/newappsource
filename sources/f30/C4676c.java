package f30;

import android.os.Environment;
import android.os.StatFs;
import com.moovit.commons.utils.DataUnit;

/* renamed from: f30.c */
public final class C4676c {

    /* renamed from: a */
    public final String f15923a;

    /* renamed from: b */
    public final long f15924b;

    /* renamed from: c */
    public final long f15925c;

    /* renamed from: d */
    public final long f15926d;

    public C4676c(String str) {
        this.f15923a = str;
        StatFs statFs = new StatFs(str);
        this.f15924b = statFs.getTotalBytes();
        this.f15925c = statFs.getFreeBytes();
        this.f15926d = statFs.getAvailableBytes();
    }

    /* renamed from: a */
    public static C4676c m11987a() {
        return new C4676c(Environment.getDataDirectory().getAbsolutePath());
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("DiskMetrics (");
        k.append(this.f15923a);
        k.append("): [");
        k.append(DataUnit.formatSize(this.f15924b));
        k.append(", ");
        k.append(DataUnit.formatSize(this.f15925c));
        k.append(", ");
        k.append(DataUnit.formatSize(this.f15926d));
        k.append("]");
        return k.toString();
    }
}
