package w30;

import com.moovit.design.view.list.AbstractListItemView;
import com.moovit.micromobility.purchase.step.filter.C4173a;
import com.moovit.payment.gateway.PaymentGatewayFragment;

/* renamed from: w30.a */
public final /* synthetic */ class C6982a implements AbstractListItemView.C15871b {

    /* renamed from: a */
    public final /* synthetic */ int f21746a;

    /* renamed from: b */
    public final /* synthetic */ Object f21747b;

    public /* synthetic */ C6982a(Object obj, int i) {
        this.f21746a = i;
        this.f21747b = obj;
    }

    /* renamed from: a */
    public final void mo23219a(AbstractListItemView abstractListItemView, boolean z) {
        switch (this.f21746a) {
            case 0:
                C4173a.C4175b bVar = (C4173a.C4175b) this.f21747b;
                bVar.getClass();
                Integer num = (Integer) abstractListItemView.getTag();
                if (z && num != null) {
                    bVar.mo19546l(num.intValue());
                    return;
                }
                return;
            default:
                ((PaymentGatewayFragment) this.f21747b).f42664p.f51442p.setValue(Boolean.valueOf(z));
                return;
        }
    }
}
