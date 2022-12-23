package p829tu;

import com.moovit.app.mot.purchase.model.MotQrCodeTrip;
import java.util.Comparator;

/* renamed from: tu.o */
public final /* synthetic */ class C19784o implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ long f50294b;

    public /* synthetic */ C19784o(long j) {
        this.f50294b = j;
    }

    public final int compare(Object obj, Object obj2) {
        long j = this.f50294b;
        return Long.compare(Math.abs(j - ((MotQrCodeTrip) obj).f39074d.mo24631g()), Math.abs(j - ((MotQrCodeTrip) obj2).f39074d.mo24631g()));
    }
}
