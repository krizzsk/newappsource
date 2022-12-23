package p094g5;

import com.airbnb.lottie.C1867f;
import com.airbnb.lottie.parser.moshi.C1902a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p037c5.C1780a;
import p037c5.C1781b;
import p037c5.C1783d;
import p037c5.C1785f;
import p107h5.C5059g;

/* renamed from: g5.d */
public final class C4799d {
    /* renamed from: a */
    public static C1780a m12136a(C1902a aVar, C1867f fVar) throws IOException {
        return new C1780a(C4825u.m12155a(aVar, fVar, 1.0f, C4805g.f16200a, false));
    }

    /* renamed from: b */
    public static C1781b m12137b(JsonReader jsonReader, C1867f fVar, boolean z) throws IOException {
        float f;
        if (z) {
            f = C5059g.m12910c();
        } else {
            f = 1.0f;
        }
        return new C1781b(C4825u.m12155a(jsonReader, fVar, f, C4815l.f16221a, false));
    }

    /* renamed from: c */
    public static C1783d m12138c(C1902a aVar, C1867f fVar) throws IOException {
        return new C1783d(C4825u.m12155a(aVar, fVar, 1.0f, C4821r.f16231a, false));
    }

    /* renamed from: d */
    public static C1785f m12139d(C1902a aVar, C1867f fVar) throws IOException {
        return new C1785f(C4825u.m12155a(aVar, fVar, C5059g.m12910c(), C4831z.f16249a, true));
    }
}
