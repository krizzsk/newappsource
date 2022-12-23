package p829tu;

import c00.C13722f;
import com.moovit.app.mot.purchase.model.MotQrCodeTrip;

/* renamed from: tu.l */
public final /* synthetic */ class C19781l implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ long f50289b;

    /* renamed from: c */
    public final /* synthetic */ long f50290c;

    public /* synthetic */ C19781l(long j, long j2) {
        this.f50289b = j;
        this.f50290c = j2;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        long j = this.f50289b;
        long j2 = this.f50290c;
        long g = ((MotQrCodeTrip) obj).f39074d.mo24631g();
        return j <= g && g <= j2;
    }
}
