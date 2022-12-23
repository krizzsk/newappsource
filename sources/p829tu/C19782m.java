package p829tu;

import com.moovit.app.mot.purchase.model.MotQrCodeTrip;
import java.util.Comparator;

/* renamed from: tu.m */
public final /* synthetic */ class C19782m implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ long f50291b;

    public /* synthetic */ C19782m(long j) {
        this.f50291b = j;
    }

    public final int compare(Object obj, Object obj2) {
        long j = this.f50291b;
        return Long.compare(Math.abs(j - ((MotQrCodeTrip) obj).f39074d.mo24631g()), Math.abs(j - ((MotQrCodeTrip) obj2).f39074d.mo24631g()));
    }
}
