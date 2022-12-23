package p815tg;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.common.internal.MobileVisionBase;

/* renamed from: tg.e */
public final /* synthetic */ class C19675e implements OnFailureListener {

    /* renamed from: b */
    public static final /* synthetic */ C19675e f49954b = new C19675e();

    public final void onFailure(Exception exc) {
        MobileVisionBase.f36787f.mo65689e("MobileVisionBase", "Error preloading model resource", exc);
    }
}
