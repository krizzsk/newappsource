package p829tu;

import com.moovit.app.mot.purchase.model.MotQrCodeTrip;
import java.util.Comparator;
import n10.C18509f;

/* renamed from: tu.c */
public final /* synthetic */ class C19772c implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ C18509f f50263b;

    public /* synthetic */ C19772c(C18509f fVar) {
        this.f50263b = fVar;
    }

    public final int compare(Object obj, Object obj2) {
        return this.f50263b.compare(((MotQrCodeTrip) obj).f39073c.mo24369b().f23697e, ((MotQrCodeTrip) obj2).f39073c.mo24369b().f23697e);
    }
}
