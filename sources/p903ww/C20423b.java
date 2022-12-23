package p903ww;

import android.view.View;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.payment.account.model.PaymentAccount;

/* renamed from: ww.b */
public final /* synthetic */ class C20423b implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ C20424c f51741b;

    /* renamed from: c */
    public final /* synthetic */ View f51742c;

    public /* synthetic */ C20423b(C20424c cVar, View view) {
        this.f51741b = cVar;
        this.f51742c = view;
    }

    public final void onFailure(Exception exc) {
        C20424c cVar = this.f51741b;
        View view = this.f51742c;
        int i = C20424c.f51743q;
        cVar.mo52620r2(view, (PaymentAccount) null);
    }
}
