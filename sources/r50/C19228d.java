package r50;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.payment.clearance.CreditCardToken;
import com.moovit.view.p340cc.C7959a;
import i80.C12759a;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import m60.C18342b;
import p304x.C7070l;
import p664mu.C18436b;

/* renamed from: r50.d */
public class C19228d extends C18342b {

    /* renamed from: u */
    public static final /* synthetic */ int f48828u = 0;

    /* renamed from: t2 */
    public final Task<CreditCardToken> mo50791t2(Context context, String str, C7959a aVar, Map<String, String> map) {
        C18436b bVar = new C18436b(context, str, aVar);
        ExecutorService executorService = MoovitExecutors.f37327IO;
        return Tasks.call(executorService, bVar).continueWith(executorService, new C12759a(context, bVar)).onSuccessTask(MoovitExecutors.COMPUTATION, new C7070l(aVar, 18));
    }
}
