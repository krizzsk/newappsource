package p50;

import android.net.Uri;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.commons.request.BadResponseException;
import com.moovit.payment.clearance.CreditCardRequest;
import com.moovit.payment.clearance.CreditCardToken;
import com.moovit.view.p340cc.CreditCardPreview;
import com.moovit.view.p340cc.CreditCardType;
import m60.C18345d;
import p977zz.C20964s0;

/* renamed from: p50.b */
public class C18882b extends C18345d {
    /* renamed from: r2 */
    public final Task mo50590r2(CreditCardRequest creditCardRequest, Object obj) {
        String queryParameter = ((Uri) obj).getQueryParameter("transactionId");
        if (C20964s0.m49090h(queryParameter)) {
            return Tasks.forException(new BadResponseException("Token not provided"));
        }
        return Tasks.forResult(new CreditCardToken(queryParameter, new CreditCardPreview(CreditCardType.UNKNOWN, "XXXX", (String) null, (String) null)));
    }
}
