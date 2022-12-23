package p094g5;

import com.airbnb.lottie.C1867f;
import com.airbnb.lottie.parser.moshi.C1902a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import p037c5.C1781b;
import p037c5.C1784e;
import p037c5.C1788i;
import p037c5.C1792m;
import p107h5.C5059g;
import p120i5.C5280a;
import p332z4.C7470i;

/* renamed from: g5.a */
public final class C4793a {

    /* renamed from: a */
    public static final JsonReader.C1901a f16185a = JsonReader.C1901a.m5315a("k", "x", "y");

    /* renamed from: a */
    public static C1784e m12133a(C1902a aVar, C1867f fVar) throws IOException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (aVar.mo6824B() == JsonReader.Token.BEGIN_ARRAY) {
            aVar.mo6830e();
            while (aVar.mo6835v()) {
                if (aVar.mo6824B() == JsonReader.Token.BEGIN_OBJECT) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList.add(new C7470i(fVar, C4824t.m12154b(aVar, fVar, C5059g.m12910c(), C4830y.f16248a, z, false)));
            }
            aVar.mo6832q();
            C4825u.m12156b(arrayList);
        } else {
            arrayList.add(new C5280a(C4822s.m12150b(aVar, C5059g.m12910c())));
        }
        return new C1784e(arrayList);
    }

    /* renamed from: b */
    public static C1792m m12134b(C1902a aVar, C1867f fVar) throws IOException {
        aVar.mo6831i();
        C1784e eVar = null;
        C1781b bVar = null;
        C1781b bVar2 = null;
        boolean z = false;
        while (aVar.mo6824B() != JsonReader.Token.END_OBJECT) {
            int H = aVar.mo6826H(f16185a);
            if (H != 0) {
                if (H != 1) {
                    if (H != 2) {
                        aVar.mo6827K();
                        aVar.mo6828N();
                    } else if (aVar.mo6824B() == JsonReader.Token.STRING) {
                        aVar.mo6828N();
                    } else {
                        bVar2 = C4799d.m12137b(aVar, fVar, true);
                    }
                } else if (aVar.mo6824B() == JsonReader.Token.STRING) {
                    aVar.mo6828N();
                } else {
                    bVar = C4799d.m12137b(aVar, fVar, true);
                }
                z = true;
            } else {
                eVar = m12133a(aVar, fVar);
            }
        }
        aVar.mo6833r();
        if (z) {
            fVar.mo6755a("Lottie doesn't support expressions.");
        }
        if (eVar != null) {
            return eVar;
        }
        return new C1788i(bVar, bVar2);
    }
}
