package p805su;

import androidx.recyclerview.widget.RecyclerView;
import c70.C13751d;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.app.mot.purchase.MotQrCodeActivationActivity;
import com.moovit.image.ImageProviderFragment;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.payment.account.external.C25651a;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import m60.C18341a;
import q50.C19083d;
import z60.C20811b;

/* renamed from: su.e */
public final /* synthetic */ class C19543e implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f49657b;

    /* renamed from: c */
    public final /* synthetic */ Object f49658c;

    public /* synthetic */ C19543e(Object obj, int i) {
        this.f49657b = i;
        this.f49658c = obj;
    }

    public final void onFailure(Exception exc) {
        switch (this.f49657b) {
            case 0:
                int i = C19544f.f49659s;
                ((C19544f) this.f49658c).mo51902r2();
                return;
            case 1:
                int i2 = C19554k.f49700n;
                MotQrCodeActivationActivity motQrCodeActivationActivity = (MotQrCodeActivationActivity) ((C19554k) this.f49658c).f40822c;
                motQrCodeActivationActivity.getClass();
                motQrCodeActivationActivity.mo45585z2(new C19560p(), "trip", false);
                return;
            case 2:
                ((ImageProviderFragment) this.f49658c).mo48176j0(((ImageProviderFragment) this.f49658c).f41702n.f41707e, exc);
                return;
            case 3:
                MicroMobilityPurchaseActivity microMobilityPurchaseActivity = (MicroMobilityPurchaseActivity) this.f49658c;
                int i3 = MicroMobilityPurchaseActivity.f14911Y;
                microMobilityPurchaseActivity.mo44506I1();
                microMobilityPurchaseActivity.mo19506A2(exc);
                return;
            case 4:
                int i4 = C25651a.f63987s;
                ((C25651a) this.f49658c).mo83457n2((PaymentAccount) null);
                return;
            case 5:
                C19083d dVar = (C19083d) this.f49658c;
                int i5 = C19083d.f48510t;
                dVar.mo46795h2(C13751d.m34341b(dVar.requireContext(), "receive_url_error", exc));
                return;
            case 6:
                ((C18341a) this.f49658c).mo50795o2(exc);
                return;
            case 7:
                RecyclerView recyclerView = ((C20811b) this.f49658c).f52532p;
                recyclerView.setAdapter(C13751d.m34340a(exc, recyclerView.getContext()));
                return;
            default:
                int i6 = PurchaseTicketActivity.f23250Y;
                ((PurchaseTicketActivity) this.f49658c).mo24027A2(exc);
                return;
        }
    }
}
