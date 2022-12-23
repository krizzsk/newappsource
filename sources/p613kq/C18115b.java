package p613kq;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.micromobility.damage.MicroMobilityReportedDamagesActivity;
import com.moovit.payment.account.external.ExternalPaymentAccountsFragment;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.settings.PaymentAccountSettingsActivity;
import com.moovit.ticketing.ticket.C7758e;
import com.usebutton.sdk.internal.api.AppActionRequest;
import k00.C17988b;
import m80.C12868d;
import m80.C12873i;
import p241s0.C6302b;
import p732pq.C18951l;
import p805su.C19548g;
import p949yv.C20772a;
import q50.C19080b;
import z00.C20795a;

/* renamed from: kq.b */
public final /* synthetic */ class C18115b implements OnFailureListener {

    /* renamed from: b */
    public final /* synthetic */ int f46315b;

    /* renamed from: c */
    public final /* synthetic */ Object f46316c;

    public /* synthetic */ C18115b(Object obj, int i) {
        this.f46315b = i;
        this.f46316c = obj;
    }

    public final void onFailure(Exception exc) {
        CharSequence charSequence;
        switch (this.f46315b) {
            case 0:
                C18116c cVar = (C18116c) this.f46316c;
                if (cVar.f40824e) {
                    cVar.mo50552n2(false);
                    return;
                }
                return;
            case 1:
                int i = C18951l.f48251v;
                ((C18951l) this.f46316c).mo51467C2((PaymentAccount) null);
                return;
            case 2:
                int i2 = C19548g.f49674o;
                ((C19548g) this.f46316c).mo51905p2();
                return;
            case 3:
                ((C20772a) this.f46316c).f52413c.postValue(null);
                return;
            case 4:
                int i3 = MicroMobilityReportedDamagesActivity.f14863l0;
                ((MicroMobilityReportedDamagesActivity) this.f46316c).finish();
                return;
            case 5:
                C6302b bVar = ExternalPaymentAccountsFragment.f63974r;
                ((ExternalPaymentAccountsFragment) this.f46316c).mo83453n2((PaymentAccount) null);
                return;
            case 6:
                int i4 = PaymentAccountSettingsActivity.f64114l0;
                ((PaymentAccountSettingsActivity) this.f46316c).finish();
                return;
            case 7:
                ((C19080b) this.f46316c).mo51512m2(exc);
                return;
            default:
                RecyclerView recyclerView = ((C7758e) this.f46316c).f23541q;
                Context context = recyclerView.getContext();
                C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
                Drawable b = C17988b.m44611b(C12868d.img_empty_error_sign, context);
                int i5 = C12873i.general_error_title;
                if (i5 == 0) {
                    charSequence = null;
                } else {
                    charSequence = context.getText(i5);
                }
                recyclerView.setAdapter(new C20795a(b, (CharSequence) null, charSequence));
                return;
        }
    }
}
