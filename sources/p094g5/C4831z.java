package p094g5;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: g5.z */
public final class C4831z implements C4814k0<PointF> {

    /* renamed from: a */
    public static final C4831z f16249a = new C4831z();

    /* renamed from: a */
    public final Object mo20314a(JsonReader jsonReader, float f) throws IOException {
        JsonReader.Token B = jsonReader.mo6824B();
        if (B == JsonReader.Token.BEGIN_ARRAY) {
            return C4822s.m12150b(jsonReader, f);
        }
        if (B == JsonReader.Token.BEGIN_OBJECT) {
            return C4822s.m12150b(jsonReader, f);
        }
        if (B == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.mo6837x()) * f, ((float) jsonReader.mo6837x()) * f);
            while (jsonReader.mo6835v()) {
                jsonReader.mo6828N();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + B);
    }
}
