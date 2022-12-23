package p094g5;

import android.graphics.Color;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: g5.s */
public final class C4822s {

    /* renamed from: a */
    public static final JsonReader.C1901a f16232a = JsonReader.C1901a.m5315a("x", "y");

    /* renamed from: g5.s$a */
    public static /* synthetic */ class C4823a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16233a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.airbnb.lottie.parser.moshi.JsonReader$Token[] r0 = com.airbnb.lottie.parser.moshi.JsonReader.Token.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16233a = r0
                com.airbnb.lottie.parser.moshi.JsonReader$Token r1 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16233a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.parser.moshi.JsonReader$Token r1 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16233a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.parser.moshi.JsonReader$Token r1 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p094g5.C4822s.C4823a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m12149a(JsonReader jsonReader) throws IOException {
        jsonReader.mo6830e();
        int x = (int) (jsonReader.mo6837x() * 255.0d);
        int x2 = (int) (jsonReader.mo6837x() * 255.0d);
        int x3 = (int) (jsonReader.mo6837x() * 255.0d);
        while (jsonReader.mo6835v()) {
            jsonReader.mo6828N();
        }
        jsonReader.mo6832q();
        return Color.argb(ValidationUtils.APPBOY_STRING_MAX_LENGTH, x, x2, x3);
    }

    /* renamed from: b */
    public static PointF m12150b(JsonReader jsonReader, float f) throws IOException {
        int i = C4823a.f16233a[jsonReader.mo6824B().ordinal()];
        if (i == 1) {
            float x = (float) jsonReader.mo6837x();
            float x2 = (float) jsonReader.mo6837x();
            while (jsonReader.mo6835v()) {
                jsonReader.mo6828N();
            }
            return new PointF(x * f, x2 * f);
        } else if (i == 2) {
            jsonReader.mo6830e();
            float x3 = (float) jsonReader.mo6837x();
            float x4 = (float) jsonReader.mo6837x();
            while (jsonReader.mo6824B() != JsonReader.Token.END_ARRAY) {
                jsonReader.mo6828N();
            }
            jsonReader.mo6832q();
            return new PointF(x3 * f, x4 * f);
        } else if (i == 3) {
            jsonReader.mo6831i();
            float f2 = BitmapDescriptorFactory.HUE_RED;
            float f3 = BitmapDescriptorFactory.HUE_RED;
            while (jsonReader.mo6835v()) {
                int H = jsonReader.mo6826H(f16232a);
                if (H == 0) {
                    f2 = m12152d(jsonReader);
                } else if (H != 1) {
                    jsonReader.mo6827K();
                    jsonReader.mo6828N();
                } else {
                    f3 = m12152d(jsonReader);
                }
            }
            jsonReader.mo6833r();
            return new PointF(f2 * f, f3 * f);
        } else {
            StringBuilder k = C13555b.m33972k("Unknown point starts with ");
            k.append(jsonReader.mo6824B());
            throw new IllegalArgumentException(k.toString());
        }
    }

    /* renamed from: c */
    public static ArrayList m12151c(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.mo6830e();
        while (jsonReader.mo6824B() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.mo6830e();
            arrayList.add(m12150b(jsonReader, f));
            jsonReader.mo6832q();
        }
        jsonReader.mo6832q();
        return arrayList;
    }

    /* renamed from: d */
    public static float m12152d(JsonReader jsonReader) throws IOException {
        JsonReader.Token B = jsonReader.mo6824B();
        int i = C4823a.f16233a[B.ordinal()];
        if (i == 1) {
            return (float) jsonReader.mo6837x();
        }
        if (i == 2) {
            jsonReader.mo6830e();
            float x = (float) jsonReader.mo6837x();
            while (jsonReader.mo6835v()) {
                jsonReader.mo6828N();
            }
            jsonReader.mo6832q();
            return x;
        }
        throw new IllegalArgumentException("Unknown value for token of type " + B);
    }
}
