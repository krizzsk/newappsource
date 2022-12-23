package j80;

import com.moovit.servicealerts.LineServiceAlertDigest;
import java.util.Comparator;
import p977zz.C20975x0;

/* renamed from: j80.a */
public final class C12772a implements Comparator<LineServiceAlertDigest> {
    /* renamed from: a */
    public static int m32576a(LineServiceAlertDigest lineServiceAlertDigest, LineServiceAlertDigest lineServiceAlertDigest2) {
        if (lineServiceAlertDigest == lineServiceAlertDigest2) {
            return 0;
        }
        if (lineServiceAlertDigest == null) {
            return 1;
        }
        if (lineServiceAlertDigest2 == null) {
            return -1;
        }
        return C20975x0.m49116c(lineServiceAlertDigest.f23186c.f23213b, lineServiceAlertDigest2.f23186c.f23213b);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return m32576a((LineServiceAlertDigest) obj, (LineServiceAlertDigest) obj2);
    }
}
