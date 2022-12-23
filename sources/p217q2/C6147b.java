package p217q2;

import com.veriff.sdk.camera.core.ImageCapture;
import java.util.List;
import p227r.C6227a;
import p269u2.C6685f;

/* renamed from: q2.b */
public final /* synthetic */ class C6147b implements C6227a {

    /* renamed from: b */
    public final /* synthetic */ int f19509b;

    public /* synthetic */ C6147b(int i) {
        this.f19509b = i;
    }

    public final Object apply(Object obj) {
        switch (this.f19509b) {
            case 0:
                return Long.valueOf(((C6685f) obj).executeInsert());
            default:
                return ImageCapture.lambda$issueTakePicture$20((List) obj);
        }
    }
}
