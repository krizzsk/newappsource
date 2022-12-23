package q50;

import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.payment.clearance.model.ClearanceProviderInstructions;
import e50.C25719a;
import e50.C25720b;
import java.util.concurrent.Callable;
import q50.C19080b;

/* renamed from: q50.a */
public final /* synthetic */ class C19079a implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C19080b f48499b;

    /* renamed from: c */
    public final /* synthetic */ C19080b.C19081a f48500c;

    public /* synthetic */ C19079a(C19080b bVar, C19080b.C19081a aVar) {
        this.f48499b = bVar;
        this.f48500c = aVar;
    }

    public final Object call() {
        C19080b bVar = this.f48499b;
        C19080b.C19081a aVar = this.f48500c;
        ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions = bVar.f48502n;
        T t = aVar.f48504b;
        ClearanceProviderInstructions clearanceProviderInstructions = clearanceProviderPaymentInstructions.f42587e.f42774c;
        return ((C25720b) new C25719a(bVar.mo46783R1(), clearanceProviderInstructions.f42605c, t, clearanceProviderPaymentInstructions.f42589g, clearanceProviderPaymentInstructions.f42587e.f42773b).mo52626J()).f64150m;
    }
}
