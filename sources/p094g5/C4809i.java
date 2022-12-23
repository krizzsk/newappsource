package p094g5;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.appboy.Constants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;

/* renamed from: g5.i */
public final class C4809i implements C4814k0<DocumentData> {

    /* renamed from: a */
    public static final C4809i f16204a = new C4809i();

    /* renamed from: b */
    public static final JsonReader.C1901a f16205b = JsonReader.C1901a.m5315a(Constants.APPBOY_PUSH_TITLE_KEY, InneractiveMediationDefs.GENDER_FEMALE, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    /* renamed from: a */
    public final Object mo20314a(JsonReader jsonReader, float f) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.mo6831i();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        int i = 0;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        int i2 = 0;
        int i3 = 0;
        float f5 = BitmapDescriptorFactory.HUE_RED;
        boolean z = true;
        while (jsonReader.mo6835v()) {
            switch (jsonReader.mo6826H(f16205b)) {
                case 0:
                    str = jsonReader.mo6823A();
                    break;
                case 1:
                    str2 = jsonReader.mo6823A();
                    break;
                case 2:
                    f2 = (float) jsonReader.mo6837x();
                    break;
                case 3:
                    int z2 = jsonReader.mo6838z();
                    justification2 = DocumentData.Justification.CENTER;
                    if (z2 <= justification2.ordinal() && z2 >= 0) {
                        justification2 = DocumentData.Justification.values()[z2];
                        break;
                    }
                case 4:
                    i = jsonReader.mo6838z();
                    break;
                case 5:
                    f3 = (float) jsonReader.mo6837x();
                    break;
                case 6:
                    f4 = (float) jsonReader.mo6837x();
                    break;
                case 7:
                    i2 = C4822s.m12149a(jsonReader);
                    break;
                case 8:
                    i3 = C4822s.m12149a(jsonReader);
                    break;
                case 9:
                    f5 = (float) jsonReader.mo6837x();
                    break;
                case 10:
                    z = jsonReader.mo6836w();
                    break;
                default:
                    jsonReader.mo6827K();
                    jsonReader.mo6828N();
                    break;
            }
        }
        JsonReader jsonReader2 = jsonReader;
        jsonReader.mo6833r();
        return new DocumentData(str, str2, f2, justification2, i, f3, f4, i2, i3, f5, z);
    }
}
