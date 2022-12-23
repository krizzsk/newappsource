package w50;

import androidx.lifecycle.C1044w;
import com.moovit.payment.gateway.PaymentGateway;
import y50.C20703a;

/* renamed from: w50.c */
public final /* synthetic */ class C20279c implements C1044w {

    /* renamed from: a */
    public final /* synthetic */ int f51419a;

    /* renamed from: b */
    public final /* synthetic */ C20283g f51420b;

    public /* synthetic */ C20279c(C20283g gVar, int i) {
        this.f51419a = i;
        this.f51420b = gVar;
    }

    public final void onChanged(Object obj) {
        switch (this.f51419a) {
            case 0:
                C20283g gVar = this.f51420b;
                gVar.mo52458j(gVar.f51433g.getValue(), (C20703a) obj, gVar.f51442p.getValue());
                return;
            default:
                C20283g gVar2 = this.f51420b;
                gVar2.mo52459k(gVar2.f51439m.getValue(), (PaymentGateway) obj);
                return;
        }
    }
}
