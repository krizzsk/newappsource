package m50;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.payment.clearance.CreditCardToken;
import com.moovit.view.p340cc.C7959a;
import java.util.Map;
import m60.C18342b;

/* renamed from: m50.k */
public class C18338k extends C18342b {

    /* renamed from: u */
    public static final /* synthetic */ int f46764u = 0;

    /* renamed from: t2 */
    public final Task<CreditCardToken> mo50791t2(Context context, String str, C7959a aVar, Map<String, String> map) {
        return Tasks.call(MoovitExecutors.f37327IO, new C18328d(this, context, aVar, 1));
    }
}
