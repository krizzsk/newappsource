package p732pq;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import c00.C13723g;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.tranzmate.R;
import h60.C17327j1;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import p495fq.C17058c;
import p543hq.C17474b;
import p584jl.C17885a;
import p613kq.C18114a;
import p613kq.C18115b;
import p613kq.C18116c;
import p874vr.C20199a;
import p977zz.C20975x0;
import q00.C19047a;
import w40.C25761d;

/* renamed from: pq.l */
public abstract class C18951l<A extends MoovitAppActivity> extends C18116c<A> {

    /* renamed from: v */
    public static final /* synthetic */ int f48251v = 0;

    /* renamed from: s */
    public String f48252s;

    /* renamed from: t */
    public final HashSet f48253t = new HashSet();

    /* renamed from: u */
    public final AtomicReference<C18952a> f48254u = new AtomicReference<>(C18952a.m46066a());

    /* renamed from: pq.l$a */
    public static class C18952a {

        /* renamed from: a */
        public final String f48255a;

        /* renamed from: b */
        public final Collection<TransitStop> f48256b;

        /* renamed from: c */
        public final Collection<TransitLine> f48257c;

        public C18952a(String str, AbstractCollection abstractCollection, Collection collection) {
            C21100e.m49373x(str, LinksConfiguration.KEY_KEY);
            this.f48255a = str;
            C21100e.m49373x(abstractCollection, "stops");
            this.f48256b = abstractCollection;
            C21100e.m49373x(collection, "lines");
            this.f48257c = collection;
        }

        /* renamed from: a */
        public static C18952a m46066a() {
            return new C18952a("empty", new ArrayList(0), new ArrayList(0));
        }
    }

    public C18951l(Class<A> cls) {
        super(cls);
    }

    /* renamed from: A2 */
    public final C18952a mo51466A2() {
        C18952a z2;
        String B2 = mo51461B2();
        C18952a aVar = this.f48254u.get();
        if (C20975x0.m49118e(B2, aVar.f48255a)) {
            return aVar;
        }
        synchronized (this.f48254u) {
            z2 = mo51463z2();
            C13723g.m34285f(z2.f48256b, (ArrayList) null, new C18947h(this, 0));
            C13723g.m34285f(z2.f48257c, (ArrayList) null, new C18948i(this, 0));
            this.f48254u.set(z2);
        }
        return z2;
    }

    /* renamed from: B2 */
    public abstract String mo51461B2();

    /* renamed from: C2 */
    public final void mo51467C2(PaymentAccount paymentAccount) {
        if (paymentAccount != null) {
            if (!PaymentAccount.m64175c(paymentAccount, this.f48252s, PaymentAccountContextStatus.INCOMPLETE)) {
                LocationSettingsFixer.C16198a aVar = new LocationSettingsFixer.C16198a((C15682c<?>) this);
                aVar.mo48529b(R.string.accessibility_no_gps_popup_title, R.string.accessibility_no_gps_popup_message);
                aVar.f42260g = true;
                aVar.mo48528a(new C17058c(this, 1));
                return;
            }
        }
        mo50553o2();
        startActivity(PaymentRegistrationActivity.m41717A2(requireContext(), PaymentRegistrationType.REGISTRATION, this.f48252s));
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    /* renamed from: V1 */
    public final void mo40555V1() {
        C19047a aVar = (C19047a) mo46776J1("CONFIGURATION");
        this.f48252s = (String) aVar.mo51505b(C20199a.f51267b1);
        this.f48253t.clear();
        this.f48253t.addAll((Collection) aVar.mo51505b(C20199a.f51269c1));
        super.mo40555V1();
    }

    /* renamed from: p2 */
    public final void mo50554p2(Button button) {
        C17885a.m44441i(button, 0, R.attr.outlinedRoundedButtonMediumStyle, 2131953333);
        button.setText(R.string.quick_action_notify_driver);
        C17885a.m44467v0(button, R.drawable.ic_notify_driver_16);
    }

    /* renamed from: q2 */
    public Task<Boolean> mo50555q2() {
        C18952a A2 = mo51466A2();
        if (A2.f48256b.isEmpty() || A2.f48257c.isEmpty()) {
            return Tasks.forResult(Boolean.FALSE);
        }
        if (((Boolean) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C20199a.f51271d1)).booleanValue()) {
            return Tasks.forResult(Boolean.TRUE);
        }
        return C25761d.m64299a().mo83587b(false).onSuccessTask(MoovitExecutors.COMPUTATION, new C17327j1(this, 9));
    }

    /* renamed from: r2 */
    public final void mo50556r2(View view) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "notify_driver_clicked");
        mo46797j2(aVar.mo49933a());
        mo50561w2(true);
        C25761d.m64299a().mo83587b(false).addOnSuccessListener((Activity) requireActivity(), new C18114a(this, 1)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C18115b(this, 1));
    }

    /* renamed from: z2 */
    public abstract C18952a mo51463z2();
}
