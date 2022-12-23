package g50;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.profile.PaymentAccountAddProfileActivity;
import g50.C25732f;
import h60.C17365w;
import ja0.C12793c;
import o00.C18665b;
import p543hq.C17474b;
import p927xw.C20648o;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import w40.C25761d;

/* renamed from: g50.d */
public class C25730d extends C15682c<PaymentAccountAddProfileActivity> implements C25732f.C25733a {

    /* renamed from: o */
    public static final /* synthetic */ int f64163o = 0;

    /* renamed from: n */
    public RecyclerView f64164n;

    public C25730d() {
        super(PaymentAccountAddProfileActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_account_add_profile_selection_fragment, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C25750e.recycler_view);
        this.f64164n = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        this.f64164n.mo4593g(new C18665b(inflate.getContext(), C25749d.divider_horizontal), -1);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "substep_profiles_selection");
        mo46797j2(aVar.mo49933a());
        ((PaymentAccountAddProfileActivity) this.f40822c).setTitle(C25754i.payment_profile_additional_title);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f64164n.mo4627l0(new C12793c());
        A a = this.f40822c;
        Task<PaymentAccount> b = C25761d.m64299a().mo83587b(false);
        Task call = Tasks.call(MoovitExecutors.f37327IO, new C17365w(mo46783R1()));
        Tasks.whenAllSuccess(b, call).addOnFailureListener((Activity) a, (OnFailureListener) new C20648o(this, 1)).addOnSuccessListener((Activity) a, new C25729c(this, b, call));
    }
}
