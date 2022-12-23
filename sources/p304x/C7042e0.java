package p304x;

import androidx.camera.core.C0612l;
import com.veriff.sdk.camera.core.ImageCapture;
import java.util.List;
import p227r.C6227a;

/* renamed from: x.e0 */
public final /* synthetic */ class C7042e0 implements C6227a {

    /* renamed from: b */
    public final /* synthetic */ int f21904b;

    public /* synthetic */ C7042e0(int i) {
        this.f21904b = i;
    }

    public final Object apply(Object obj) {
        switch (this.f21904b) {
            case 0:
                Void voidR = (Void) obj;
                return Boolean.TRUE;
            case 1:
                List list = (List) obj;
                C0612l.C0618f fVar = C0612l.f2108F;
                return null;
            default:
                return ImageCapture.lambda$preTakePicture$13((Boolean) obj);
        }
    }
}
