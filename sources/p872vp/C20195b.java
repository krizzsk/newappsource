package p872vp;

import a00.C13382a;
import c00.C13717b;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import java.util.List;
import p977zz.C20964s0;
import x00.C20440a;

/* renamed from: vp.b */
public final class C20195b extends C13382a {

    /* renamed from: b */
    public static final /* synthetic */ int f51234b = 0;

    /* renamed from: k */
    public static String m47767k(List<C20440a> list) {
        if (C13717b.m34258e(list)) {
            return "";
        }
        StringBuilder e = C13382a.m33669e();
        for (C20440a next : list) {
            String str = next.f51783c;
            if (str != null) {
                C13382a.m33666b(e, str);
            } else if (next.mo52636a() && !C20964s0.m49092j(next.f51782b)) {
                C13382a.m33666b(e, next.f51782b);
            }
        }
        return e.toString();
    }

    /* renamed from: l */
    public static String m47768l(TransitLine transitLine) {
        TransitLineGroup b = transitLine.mo24369b();
        if (!C20964s0.m49090h(b.f23697e)) {
            return b.f23697e;
        }
        return b.f23698f;
    }
}
