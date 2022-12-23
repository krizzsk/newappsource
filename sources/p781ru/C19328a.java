package p781ru;

import android.os.Parcelable;
import c00.C13722f;
import com.moovit.app.mot.model.MotActivationRegionalFare;
import com.moovit.app.mot.purchase.model.MotQrCodeScanResult;

/* renamed from: ru.a */
public final /* synthetic */ class C19328a implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ float f49182b;

    public /* synthetic */ C19328a(float f) {
        this.f49182b = f;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        float f = this.f49182b;
        Parcelable.Creator<MotQrCodeScanResult> creator = MotQrCodeScanResult.CREATOR;
        return f <= ((float) ((MotActivationRegionalFare) obj).f39017c);
    }
}
