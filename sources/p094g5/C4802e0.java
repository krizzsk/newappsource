package p094g5;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.appsflyer.share.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import p024b5.C1479a;
import p059d5.C4375g;
import p107h5.C5058f;

/* renamed from: g5.e0 */
public final class C4802e0 implements C4814k0<C4375g> {

    /* renamed from: a */
    public static final C4802e0 f16196a = new C4802e0();

    /* renamed from: b */
    public static final JsonReader.C1901a f16197b = JsonReader.C1901a.m5315a(Constants.URL_CAMPAIGN, "v", "i", "o");

    /* renamed from: a */
    public final Object mo20314a(JsonReader jsonReader, float f) throws IOException {
        if (jsonReader.mo6824B() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.mo6830e();
        }
        jsonReader.mo6831i();
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z = false;
        while (jsonReader.mo6835v()) {
            int H = jsonReader.mo6826H(f16197b);
            if (H == 0) {
                z = jsonReader.mo6836w();
            } else if (H == 1) {
                arrayList = C4822s.m12151c(jsonReader, f);
            } else if (H == 2) {
                arrayList2 = C4822s.m12151c(jsonReader, f);
            } else if (H != 3) {
                jsonReader.mo6827K();
                jsonReader.mo6828N();
            } else {
                arrayList3 = C4822s.m12151c(jsonReader, f);
            }
        }
        jsonReader.mo6833r();
        if (jsonReader.mo6824B() == JsonReader.Token.END_ARRAY) {
            jsonReader.mo6832q();
        }
        if (arrayList == null || arrayList2 == null || arrayList3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (arrayList.isEmpty()) {
            return new C4375g(new PointF(), false, Collections.emptyList());
        } else {
            int size = arrayList.size();
            PointF pointF = (PointF) arrayList.get(0);
            ArrayList arrayList4 = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) arrayList.get(i);
                int i2 = i - 1;
                arrayList4.add(new C1479a(C5058f.m12904a((PointF) arrayList.get(i2), (PointF) arrayList3.get(i2)), C5058f.m12904a(pointF2, (PointF) arrayList2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = (PointF) arrayList.get(0);
                int i3 = size - 1;
                arrayList4.add(new C1479a(C5058f.m12904a((PointF) arrayList.get(i3), (PointF) arrayList3.get(i3)), C5058f.m12904a(pointF3, (PointF) arrayList2.get(0)), pointF3));
            }
            return new C4375g(pointF, z, arrayList4);
        }
    }
}
