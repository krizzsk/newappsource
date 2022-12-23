package p782rv;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationActivity;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationInfo;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.design.view.ProgressView;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import p428cv.C16499a;
import p428cv.C16500b;
import p428cv.C16508i;
import p428cv.C16509j;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

/* renamed from: rv.b */
public class C19333b extends C19332a {

    /* renamed from: q */
    public static final /* synthetic */ int f49194q = 0;

    /* renamed from: n */
    public final C19334a f49195n = new C19334a();

    /* renamed from: o */
    public final C19335b f49196o = new C19335b();

    /* renamed from: p */
    public ProgressView f49197p;

    /* renamed from: rv.b$a */
    public class C19334a extends C20438i<C16499a, C16500b> {
        public C19334a() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C16499a aVar = (C16499a) cVar;
            C19333b bVar = C19333b.this;
            String str = ((C16500b) gVar).f43098m;
            int i = C19333b.f49194q;
            bVar.mo51742m2().f39398n = str;
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C16499a aVar = (C16499a) cVar;
            C19333b bVar = C19333b.this;
            int i = C19333b.f49194q;
            bVar.mo51748s2("CUSTOMER_TOKEN_ERROR_ALERT_DIALOG_TAG");
            return true;
        }
    }

    /* renamed from: rv.b$b */
    public class C19335b extends C20438i<C16508i, C16509j> {
        public C19335b() {
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C16508i iVar = (C16508i) cVar;
            C16509j jVar = (C16509j) gVar;
            C19333b.this.mo51745p2(false);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C16508i iVar = (C16508i) cVar;
            C19333b bVar = C19333b.this;
            int i = C19333b.f49194q;
            bVar.mo51748s2("PAYMENT_METHOD_ERROR_ALERT_DIALOG_TAG");
            return true;
        }
    }

    /* renamed from: E1 */
    public final void mo44504E1(Bundle bundle, String str) {
        if ("CUSTOMER_TOKEN_ERROR_ALERT_DIALOG_TAG".equals(str) || "PAYMENT_METHOD_ERROR_ALERT_DIALOG_TAG".equals(str)) {
            ((RideSharingRegistrationActivity) this.f40822c).finish();
        } else {
            super.mo44504E1(bundle, str);
        }
    }

    /* renamed from: n2 */
    public final AnalyticsEventKey mo51743n2() {
        return AnalyticsEventKey.STEP_CREDIT_CARD;
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo51747r2(false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 38325) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
        } else {
            if (i2 != 0) {
                mo51748s2("PAYMENT_METHOD_ERROR_ALERT_DIALOG_TAG");
            } else {
                ((RideSharingRegistrationActivity) this.f40822c).onBackPressed();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ride_sharing_registration_step_credit_card_fragment, viewGroup, false);
        this.f49197p = (ProgressView) inflate.findViewById(R.id.loading_view);
        return inflate;
    }

    /* renamed from: r2 */
    public final void mo51747r2(boolean z) {
        RideSharingRegistrationInfo m2 = mo51742m2();
        if (z || m2.f39398n == null) {
            ProgressView progressView = this.f49197p;
            if (progressView != null) {
                progressView.setVisibility(0);
                this.f49197p.setText((int) R.string.ride_sharing_registration_verifying_payment_method);
            }
            C16499a aVar = new C16499a(mo46783R1());
            RequestOptions L1 = mo46777L1();
            L1.f42909f = true;
            mo46793f2("get_customer_token", aVar, L1, this.f49195n);
        }
    }

    /* renamed from: s2 */
    public final void mo51748s2(String str) {
        AlertDialogFragment.C15856a aVar = new AlertDialogFragment.C15856a(requireContext());
        aVar.mo47676e(R.drawable.img_empty_warning, false);
        AlertDialogFragment.C15856a l = aVar.mo47683l(R.string.ride_sharing_registration_general_error);
        l.mo47674c(true);
        AlertDialogFragment b = l.mo47682k(str).mo47681j(R.string.retry_connect).mo47680i(R.string.cancel).mo47673b();
        b.setTargetFragment(this, 0);
        mo46795h2(b);
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        if ("CUSTOMER_TOKEN_ERROR_ALERT_DIALOG_TAG".equals(str)) {
            if (i == -1) {
                mo51747r2(true);
            } else {
                ((RideSharingRegistrationActivity) this.f40822c).finish();
            }
            return true;
        } else if ("PAYMENT_METHOD_ERROR_ALERT_DIALOG_TAG".equals(str)) {
            if (i == -1) {
                RideSharingRegistrationInfo m2 = mo51742m2();
                String str2 = m2.f39398n;
                String str3 = m2.f39399o;
                String str4 = m2.f39400p;
                ProgressView progressView = this.f49197p;
                if (progressView != null) {
                    progressView.setVisibility(0);
                    this.f49197p.setText((int) R.string.ride_sharing_registration_verifying_payment_method);
                }
                C16508i iVar = new C16508i(mo46783R1(), str3, true, str2, str4, (String) null, (String) null);
                RequestOptions L1 = mo46777L1();
                L1.f42909f = true;
                mo46793f2("sent_payment_method", iVar, L1, this.f49196o);
            } else {
                ((RideSharingRegistrationActivity) this.f40822c).finish();
            }
            return true;
        } else {
            super.mo19430t0(str, i, bundle);
            return true;
        }
    }
}
