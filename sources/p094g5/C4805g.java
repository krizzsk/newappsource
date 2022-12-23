package p094g5;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* renamed from: g5.g */
public final class C4805g implements C4814k0<Integer> {

    /* renamed from: a */
    public static final C4805g f16200a = new C4805g();

    /* renamed from: a */
    public final Object mo20314a(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        double d;
        if (jsonReader.mo6824B() == JsonReader.Token.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.mo6830e();
        }
        double x = jsonReader.mo6837x();
        double x2 = jsonReader.mo6837x();
        double x3 = jsonReader.mo6837x();
        if (jsonReader.mo6824B() == JsonReader.Token.NUMBER) {
            d = jsonReader.mo6837x();
        } else {
            d = 1.0d;
        }
        if (z) {
            jsonReader.mo6832q();
        }
        if (x <= 1.0d && x2 <= 1.0d && x3 <= 1.0d) {
            x *= 255.0d;
            x2 *= 255.0d;
            x3 *= 255.0d;
            if (d <= 1.0d) {
                d *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d, (int) x, (int) x2, (int) x3));
    }
}
