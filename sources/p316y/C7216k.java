package p316y;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.bumptech.glide.C2116c;
import com.bumptech.glide.C2129i;
import com.cubic.umo.p045ad.ext.interfaces.UMOAdKitBannerView;
import com.cubic.umo.p045ad.playback.p046ui.views.AKImageView;
import kotlin.jvm.internal.Ref$IntRef;
import mf0.C24362h;
import p060d6.C4385f;
import p316y.C7208f;

/* renamed from: y.k */
public final /* synthetic */ class C7216k implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f22354b;

    /* renamed from: c */
    public final /* synthetic */ Object f22355c;

    /* renamed from: d */
    public final /* synthetic */ Object f22356d;

    /* renamed from: e */
    public final /* synthetic */ Object f22357e;

    /* renamed from: f */
    public final /* synthetic */ Object f22358f;

    public /* synthetic */ C7216k(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f22354b = i;
        this.f22355c = obj;
        this.f22356d = obj2;
        this.f22357e = obj3;
        this.f22358f = obj4;
    }

    public final void run() {
        switch (this.f22354b) {
            case 0:
                ((C7208f.C7210b) this.f22355c).f22334a.onCaptureCompleted((CameraCaptureSession) this.f22356d, (CaptureRequest) this.f22357e, (TotalCaptureResult) this.f22358f);
                return;
            default:
                UMOAdKitBannerView uMOAdKitBannerView = (UMOAdKitBannerView) this.f22355c;
                String str = (String) this.f22356d;
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.f22357e;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) this.f22358f;
                UMOAdKitBannerView.Companion companion = UMOAdKitBannerView.f7241i;
                C24362h.m61211f(uMOAdKitBannerView, "this$0");
                C24362h.m61211f(str, "$phLocalFilePath");
                C24362h.m61211f(ref$IntRef, "$imageWidth");
                C24362h.m61211f(ref$IntRef2, "$imageHeight");
                AKImageView aKImageView = uMOAdKitBannerView.f7246f;
                if (aKImageView != null) {
                    Context context = uMOAdKitBannerView.getContext();
                    DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                    C24362h.m61210e(displayMetrics, "getSystem().displayMetrics");
                    DisplayMetrics displayMetrics2 = Resources.getSystem().getDisplayMetrics();
                    C24362h.m61210e(displayMetrics2, "getSystem().displayMetrics");
                    ((C2129i) ((C2129i) C2116c.m5521c(context).mo22193f(context).mo10880p(str).mo22726i(C4385f.f15423d)).mo22737v((int) TypedValue.applyDimension(1, (float) ref$IntRef.element, displayMetrics), (int) TypedValue.applyDimension(1, (float) ref$IntRef2.element, displayMetrics2))).mo10850T(aKImageView);
                }
                UMOAdKitBannerView.m5802h(uMOAdKitBannerView, true);
                return;
        }
    }
}
