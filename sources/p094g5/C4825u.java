package p094g5;

import com.airbnb.lottie.C1867f;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import p120i5.C5280a;
import p332z4.C7470i;

/* renamed from: g5.u */
public final class C4825u {

    /* renamed from: a */
    public static JsonReader.C1901a f16238a = JsonReader.C1901a.m5315a("k");

    /* renamed from: a */
    public static ArrayList m12155a(JsonReader jsonReader, C1867f fVar, float f, C4814k0 k0Var, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.mo6824B() == JsonReader.Token.STRING) {
            fVar.mo6755a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.mo6831i();
        while (jsonReader.mo6835v()) {
            if (jsonReader.mo6826H(f16238a) != 0) {
                jsonReader.mo6828N();
            } else if (jsonReader.mo6824B() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.mo6830e();
                if (jsonReader.mo6824B() == JsonReader.Token.NUMBER) {
                    arrayList.add(C4824t.m12154b(jsonReader, fVar, f, k0Var, false, z));
                } else {
                    while (jsonReader.mo6835v()) {
                        arrayList.add(C4824t.m12154b(jsonReader, fVar, f, k0Var, true, z));
                    }
                }
                jsonReader.mo6832q();
            } else {
                arrayList.add(C4824t.m12154b(jsonReader, fVar, f, k0Var, false, z));
            }
        }
        jsonReader.mo6833r();
        m12156b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static void m12156b(ArrayList arrayList) {
        int i;
        T t;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C5280a aVar = (C5280a) arrayList.get(i2);
            i2++;
            C5280a aVar2 = (C5280a) arrayList.get(i2);
            aVar.f17438h = Float.valueOf(aVar2.f17437g);
            if (aVar.f17433c == null && (t = aVar2.f17432b) != null) {
                aVar.f17433c = t;
                if (aVar instanceof C7470i) {
                    ((C7470i) aVar).mo23736d();
                }
            }
        }
        C5280a aVar3 = (C5280a) arrayList.get(i);
        if ((aVar3.f17432b == null || aVar3.f17433c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
