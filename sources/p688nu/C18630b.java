package p688nu;

import android.graphics.Rect;
import android.view.View;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.commons.geo.BoxE6;
import com.moovit.micromobility.MicroMobilityIntegrationItem;
import com.moovit.micromobility.integration.MicroMobilityIntegrationView;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.moovit.search.C7606b;
import j90.C12788a;
import j90.C12789b;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import l30.C5583n;
import l30.C5585p;
import l90.C12850a;
import l90.C12852c;
import m90.C12889a;
import m90.C12890b;
import p259t5.C6592b;

/* renamed from: nu.b */
public final /* synthetic */ class C18630b implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f47478b;

    /* renamed from: c */
    public final /* synthetic */ Object f47479c;

    /* renamed from: d */
    public final /* synthetic */ Object f47480d;

    public /* synthetic */ C18630b(int i, Object obj, Object obj2) {
        this.f47478b = i;
        this.f47479c = obj;
        this.f47480d = obj2;
    }

    public final void onSuccess(Object obj) {
        switch (this.f47478b) {
            case 0:
                C18633e eVar = (C18633e) this.f47479c;
                View view = (View) this.f47480d;
                int i = C18633e.f47485r;
                eVar.getClass();
                if (PaymentAccount.m64175c((PaymentAccount) obj, "IsraelMot", PaymentAccountContextStatus.INCOMPLETE, PaymentAccountContextStatus.CONNECTED)) {
                    view.setVisibility(0);
                    view.setOnClickListener(new C6592b(eVar, 18));
                    return;
                }
                view.setVisibility(8);
                return;
            case 1:
                C5585p pVar = (C5585p) this.f47479c;
                pVar.f18304c.mo48656t2(new C5583n(pVar, (BoxE6) this.f47480d, (Rect) obj));
                return;
            case 2:
                MicroMobilityIntegrationView.m11166b((MicroMobilityIntegrationView) this.f47479c, (MicroMobilityIntegrationItem) this.f47480d, (MicroMobilityRide) obj);
                return;
            case 3:
                ScheduledExecutorService scheduledExecutorService = C7606b.f23156p;
                ((C7606b) this.f47479c).mo23906d((UUID) this.f47480d, (C7606b.C7608b) obj);
                return;
            case 4:
                C12788a aVar = (C12788a) this.f47479c;
                C12789b bVar = (C12789b) obj;
                if (aVar.f31611n.isInstance(bVar)) {
                    C12852c cVar = (C12852c) aVar;
                    cVar.f31783s = (C12850a) ((C12789b) aVar.f31611n.cast(bVar));
                    if (cVar.isResumed()) {
                        cVar.f31779o.mo23804e();
                        return;
                    }
                    return;
                }
                return;
            default:
                C12889a aVar2 = (C12889a) this.f47479c;
                View view2 = (View) this.f47480d;
                C12890b bVar2 = (C12890b) obj;
                if (aVar2.f31899n.isInstance(bVar2)) {
                    aVar2.mo24271n2(view2, (C12890b) aVar2.f31899n.cast(bVar2));
                    return;
                }
                return;
        }
    }
}
