package p094g5;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import p120i5.C5283d;

/* renamed from: g5.d0 */
public final class C4800d0 implements C4814k0<C5283d> {

    /* renamed from: a */
    public static final C4800d0 f16193a = new C4800d0();

    /* renamed from: a */
    public final Object mo20314a(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        if (jsonReader.mo6824B() == JsonReader.Token.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.mo6830e();
        }
        float x = (float) jsonReader.mo6837x();
        float x2 = (float) jsonReader.mo6837x();
        while (jsonReader.mo6835v()) {
            jsonReader.mo6828N();
        }
        if (z) {
            jsonReader.mo6832q();
        }
        return new C5283d((x / 100.0f) * f, (x2 / 100.0f) * f);
    }
}
