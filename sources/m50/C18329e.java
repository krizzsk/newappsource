package m50;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.payment.clearance.CreditCardToken;
import com.moovit.view.p340cc.C7959a;
import java.util.Map;
import p250s9.C6489b;
import q50.C19080b;
import q50.C19082c;

/* renamed from: m50.e */
public class C18329e extends C19082c {

    /* renamed from: u */
    public static final /* synthetic */ int f46742u = 0;

    /* renamed from: V */
    public final void mo50589V(CreditCardToken creditCardToken, String str) {
        if (!Boolean.TRUE.equals(mo46779N1(C18331g.class, new C6489b(3)))) {
            creditCardToken = null;
        }
        super.mo50589V(creditCardToken, str);
    }

    /* renamed from: r2 */
    public final Task<C19080b.C19081a<CreditCardToken>> mo50784r2(Context context, String str, C7959a aVar, Map<String, String> map) {
        return Tasks.call(MoovitExecutors.f37327IO, new C18328d(this, context, aVar, 0));
    }
}
