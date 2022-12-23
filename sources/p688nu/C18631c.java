package p688nu;

import a70.C13394a;
import a70.C13396b;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import c70.C13751d;
import com.facebook.appevents.C2342l;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.payment.account.certificate.PaymentAccountCertificatesFragment;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.wallet.WalletTab;
import com.moovit.request.UserRequestError;
import com.moovit.ticketing.activation.BaseTicketActivationActivity;
import p572iw.C17666h;
import x60.C20451a;

/* renamed from: nu.c */
public final /* synthetic */ class C18631c implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f47481b;

    /* renamed from: c */
    public final /* synthetic */ Object f47482c;

    public /* synthetic */ C18631c(Object obj, int i) {
        this.f47481b = i;
        this.f47482c = obj;
    }

    public final void onFailure(Exception exc) {
        switch (this.f47481b) {
            case 0:
                int i = C18633e.f47485r;
                ((View) this.f47482c).setVisibility(8);
                return;
            case 1:
                int i2 = C17666h.f45402O;
                ((C17666h) this.f47482c).mo50123M2((PaymentAccount) null);
                return;
            case 2:
                int i3 = PaymentAccountCertificatesFragment.f63937p;
                ((PaymentAccountCertificatesFragment) this.f47482c).mo83434n2((PaymentAccount) null);
                return;
            case 3:
                C20451a aVar = (C20451a) this.f47482c;
                int i4 = C20451a.f51799w;
                aVar.mo46795h2(C13751d.m34341b(aVar.requireContext(), "receive_url_error", exc));
                return;
            case 4:
                C13394a aVar2 = (C13394a) this.f47482c;
                WalletTab walletTab = C13394a.f33242q;
                aVar2.f33244p.setAdapter((RecyclerView.Adapter) null);
                aVar2.mo46786U1(C13396b.class, new C2342l(14));
                return;
            default:
                BaseTicketActivationActivity baseTicketActivationActivity = (BaseTicketActivationActivity) this.f47482c;
                baseTicketActivationActivity.getClass();
                baseTicketActivationActivity.mo44530n2(C13751d.m34341b(baseTicketActivationActivity, (String) null, exc));
                if (exc instanceof UserRequestError) {
                    baseTicketActivationActivity.mo23966C2(true);
                    return;
                }
                return;
        }
    }
}
