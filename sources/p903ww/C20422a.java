package p903ww;

import android.view.View;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.payment.account.model.PaymentAccount;

/* renamed from: ww.a */
public final /* synthetic */ class C20422a implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ C20424c f51739b;

    /* renamed from: c */
    public final /* synthetic */ View f51740c;

    public /* synthetic */ C20422a(C20424c cVar, View view) {
        this.f51739b = cVar;
        this.f51740c = view;
    }

    public final void onSuccess(Object obj) {
        int i = C20424c.f51743q;
        this.f51739b.mo52620r2(this.f51740c, (PaymentAccount) obj);
    }
}
