package com.moovit.payment.account.external;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.activity.result.C0207b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import c00.C13723g;
import c50.C25555a;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.C15682c;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.account.PaymentAccountActivity;
import com.moovit.payment.account.external.ExternalPaymentAccountHelper;
import com.moovit.payment.account.external.accessibletaxi.AccessibleTaxiExternalPaymentAccountHelper;
import com.moovit.payment.account.external.busitalia.BusItaliaExternalPaymentAccountHelper;
import com.moovit.payment.account.external.employee.ArrivaEmployeeExternalPaymentAccountHelper;
import com.moovit.payment.account.external.gtt.GTTExternalPaymentAccountHelper;
import com.moovit.payment.account.external.marubeni.MarubeniPremiumExternalPaymentAccountHelper;
import com.moovit.payment.account.external.mot.MotExternalPaymentAccountHelper;
import com.moovit.payment.account.external.student.ArrivaStudentExternalPaymentAccountHelper;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountContext;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import ja0.C12797f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import o00.C18676l;
import o00.C18681n;
import p054d0.C4267a0;
import p065e.C4413c;
import p241s0.C6302b;
import p613kq.C18114a;
import p613kq.C18115b;
import p761qy.C19201a;
import q00.C19047a;
import v40.C25748c;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import v50.C20101a;
import w40.C25761d;

public class ExternalPaymentAccountsFragment extends C15682c<PaymentAccountActivity> {

    /* renamed from: r */
    public static final C6302b f63974r;

    /* renamed from: n */
    public final C0207b<Intent> f63975n = registerForActivityResult(new C4413c(), new C4267a0(this, 14));

    /* renamed from: o */
    public final C19201a f63976o = new C19201a(this, 6);

    /* renamed from: p */
    public final C25648a f63977p = new C25648a();

    /* renamed from: q */
    public RecyclerView f63978q;

    /* renamed from: com.moovit.payment.account.external.ExternalPaymentAccountsFragment$a */
    public class C25648a extends BroadcastReceiver {
        public C25648a() {
        }

        public final void onReceive(Context context, Intent intent) {
            ExternalPaymentAccountsFragment externalPaymentAccountsFragment = ExternalPaymentAccountsFragment.this;
            C6302b bVar = ExternalPaymentAccountsFragment.f63974r;
            externalPaymentAccountsFragment.mo83452m2();
        }
    }

    /* renamed from: com.moovit.payment.account.external.ExternalPaymentAccountsFragment$b */
    public static class C25649b extends C18676l<PaymentAccountContext, C18676l.C18678b<PaymentAccountContext>, C12797f> {

        /* renamed from: j */
        public final View.OnClickListener f63980j;

        public C25649b(C19201a aVar) {
            C21100e.m49373x(aVar, "clickListener");
            this.f63980j = aVar;
        }

        /* renamed from: t */
        public final void mo23817t(RecyclerView.C1119a0 a0Var, int i, int i2) {
            boolean z;
            C12797f fVar = (C12797f) a0Var;
            PaymentAccountContext paymentAccountContext = (PaymentAccountContext) ((C18676l.C18678b) mo51052n(i)).get(i2);
            String str = paymentAccountContext.f64030b;
            PaymentAccountContextStatus paymentAccountContextStatus = paymentAccountContext.f64031c;
            String str2 = null;
            ExternalPaymentAccountHelper externalPaymentAccountHelper = (ExternalPaymentAccountHelper) ExternalPaymentAccountsFragment.f63974r.getOrDefault(str, null);
            ExternalPaymentAccountHelper.C25647a u1 = externalPaymentAccountHelper.mo44695u1(fVar.mo39638e(), paymentAccountContextStatus);
            ListItemView listItemView = (ListItemView) fVar.itemView;
            listItemView.setTag(C25750e.view_tag_param1, paymentAccountContext);
            listItemView.setTag(C25750e.view_tag_param2, u1.f63973b);
            listItemView.setOnClickListener(this.f63980j);
            if (u1.f63973b != null) {
                z = true;
            } else {
                z = false;
            }
            listItemView.setClickable(z);
            listItemView.setIcon(externalPaymentAccountHelper.getIconResId());
            listItemView.setTitle(externalPaymentAccountHelper.getNameResId());
            listItemView.setSubtitle(u1.f63972a);
            listItemView.setIconTopEndDecorationDrawable(externalPaymentAccountHelper.mo44691e(paymentAccountContextStatus));
            int i1 = externalPaymentAccountHelper.mo44694i1(paymentAccountContextStatus);
            if (i1 != 0) {
                str2 = fVar.mo39638e().getString(i1);
            }
            listItemView.setContentDescription(str2);
        }

        /* renamed from: v */
        public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
            ((ListItemView) ((C12797f) a0Var).itemView).setTitle(((C18676l.C18678b) mo51052n(i)).f47556c);
        }

        /* renamed from: w */
        public final RecyclerView.C1119a0 mo23819w(ViewGroup viewGroup, int i) {
            return new C12797f(LayoutInflater.from(viewGroup.getContext()).inflate(C25751f.payment_account_external_account_list_item, viewGroup, false));
        }

        /* renamed from: x */
        public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
            ListItemView listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, C25748c.listItemSectionHeaderStyle);
            listItemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new C12797f(listItemView);
        }
    }

    static {
        C6302b bVar = new C6302b(6);
        f63974r = bVar;
        bVar.put("IsraelMot", new MotExternalPaymentAccountHelper());
        bVar.put("BusItalia", new BusItaliaExternalPaymentAccountHelper());
        bVar.put("GTT", new GTTExternalPaymentAccountHelper());
        bVar.put("Arriva@Connect Verified Account", new ArrivaEmployeeExternalPaymentAccountHelper());
        bVar.put("Arriva@Student Account", new ArrivaStudentExternalPaymentAccountHelper());
        bVar.put("MarubeniPremium", new MarubeniPremiumExternalPaymentAccountHelper());
    }

    public ExternalPaymentAccountsFragment() {
        super(PaymentAccountActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        String str = (String) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C20101a.f51011X);
        f63974r.put(str, new AccessibleTaxiExternalPaymentAccountHelper(str));
        if (this.f40824e) {
            mo83452m2();
        }
    }

    /* renamed from: m2 */
    public final void mo83452m2() {
        if (getView() != null && this.f40824e) {
            C25761d.m64299a().mo83587b(false).addOnSuccessListener((Activity) requireActivity(), new C18114a(this, 10)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C18115b(this, 5));
        }
    }

    /* renamed from: n2 */
    public final void mo83453n2(PaymentAccount paymentAccount) {
        if (paymentAccount == null) {
            this.f63978q.setAdapter((RecyclerView.Adapter) null);
            return;
        }
        ArrayList<T> c = C13723g.m34282c(paymentAccount.f64014c, new C25555a(requireContext(), 0));
        if (C13717b.m34258e(c)) {
            this.f63978q.setAdapter((RecyclerView.Adapter) null);
            return;
        }
        C25649b bVar = new C25649b(this.f63976o);
        bVar.mo51055y(Collections.singletonList(new C18676l.C18678b(getString(C25754i.payment_my_account_external_accounts_header), c)));
        this.f63978q.setLayoutManager(new LinearLayoutManager(requireContext()));
        RecyclerView recyclerView = this.f63978q;
        Context requireContext = requireContext();
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        sparseIntArray.put(1, C25749d.divider_horizontal);
        recyclerView.mo4593g(new C18681n(requireContext, sparseIntArray, false), -1);
        this.f63978q.setAdapter(bVar);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1022) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            Toast.makeText(requireActivity(), C25754i.payment_external_connected_success, 1).show();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.external_payment_accounts_fragment, viewGroup, false);
        this.f63978q = (RecyclerView) inflate.findViewById(C25750e.recycler_view);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C25761d.m64300h(requireContext(), this.f63977p);
        if (mo46775H1()) {
            mo83452m2();
        }
    }

    public final void onStop() {
        super.onStop();
        C25761d.m64301k(requireContext(), this.f63977p);
    }
}
