package m50;

import android.content.Context;
import c70.C13752e;
import c70.C13756i;
import ce0.C21100e;
import com.moovit.C15682c;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.payment.clearance.CreditCardToken;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import com.moovit.view.p340cc.C7959a;
import java.util.concurrent.Callable;
import n50.C18525d;
import n50.C18526e;
import p009a8.C0114n;
import p977zz.C20930c;
import q50.C19080b;

/* renamed from: m50.d */
public final /* synthetic */ class C18328d implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f46738b;

    /* renamed from: c */
    public final /* synthetic */ Context f46739c;

    /* renamed from: d */
    public final /* synthetic */ C7959a f46740d;

    /* renamed from: e */
    public final /* synthetic */ C15682c f46741e;

    public /* synthetic */ C18328d(C15682c cVar, Context context, C7959a aVar, int i) {
        this.f46738b = i;
        this.f46741e = cVar;
        this.f46739c = context;
        this.f46740d = aVar;
    }

    public final Object call() {
        CreditCardToken creditCardToken;
        switch (this.f46738b) {
            case 0:
                C18329e eVar = (C18329e) this.f46741e;
                Context context = this.f46739c;
                C7959a aVar = this.f46740d;
                int i = C18329e.f46742u;
                WebInstruction b = WebInstruction.m41734b(C20930c.m49019a(eVar.requireActivity()).getString("hostName", WidgetMessageParser.KEY_CALLBACK), "3ds");
                C13752e b2 = C13756i.m34349a(context.getApplicationContext()).mo40679b();
                boolean equals = Boolean.TRUE.equals(eVar.mo46779N1(C18331g.class, new C0114n(1)));
                String str = b.f42777b;
                String str2 = b.f42778c;
                String str3 = b.f42779d;
                String str4 = b.f42780e;
                ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions = eVar.f48502n;
                C21100e.m49373x(clearanceProviderPaymentInstructions, "paymentInstructions");
                C18526e eVar2 = (C18526e) new C18525d(b2, aVar, str, str2, str3, str4, clearanceProviderPaymentInstructions, equals).mo52626J();
                if (equals) {
                    creditCardToken = eVar2.f47155m;
                } else {
                    creditCardToken = null;
                }
                return new C19080b.C19081a(eVar2.f47156n, creditCardToken);
            default:
                Context context2 = this.f46739c;
                C7959a aVar2 = this.f46740d;
                int i2 = C18338k.f46764u;
                WebInstruction b3 = WebInstruction.m41734b(C20930c.m49019a(((C18338k) this.f46741e).requireActivity()).getString("hostName", WidgetMessageParser.KEY_CALLBACK), "3ds");
                return ((C18526e) new C18525d(C13756i.m34349a(context2.getApplicationContext()).mo40679b(), aVar2, b3.f42777b, b3.f42778c, b3.f42779d, b3.f42780e, (ClearanceProviderPaymentInstructions) null, true).mo52626J()).f47155m;
        }
    }
}
