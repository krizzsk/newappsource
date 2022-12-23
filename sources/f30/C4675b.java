package f30;

import com.moovit.commons.utils.DataUnit;
import java.io.File;
import p977zz.C20978z;

/* renamed from: f30.b */
public final class C4675b {

    /* renamed from: a */
    public final String f15921a;

    /* renamed from: b */
    public final long f15922b;

    public C4675b(String str) {
        this.f15921a = str;
        this.f15922b = C20978z.m49128d(new File(str));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("DirMetrics (");
        k.append(this.f15921a);
        k.append("): [");
        k.append(DataUnit.formatSize(this.f15922b));
        k.append("]");
        return k.toString();
    }
}
