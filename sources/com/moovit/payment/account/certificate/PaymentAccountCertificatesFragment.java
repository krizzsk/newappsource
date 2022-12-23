package com.moovit.payment.account.certificate;

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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.C15682c;
import com.moovit.app.ads.C14753n;
import com.moovit.design.view.list.ListItemView;
import com.moovit.payment.account.PaymentAccountActivity;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountCertificatePreview;
import com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus;
import ja0.C12797f;
import java.util.Collections;
import java.util.List;
import o00.C18676l;
import o00.C18681n;
import p451du.C16723t;
import p688nu.C18631c;
import p810sz.C19617r;
import v40.C25748c;
import v40.C25749d;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import w40.C25761d;
import w40.C25765g;

public class PaymentAccountCertificatesFragment extends C15682c<PaymentAccountActivity> {

    /* renamed from: p */
    public static final /* synthetic */ int f63937p = 0;

    /* renamed from: n */
    public final C25635a f63938n = new C25635a();

    /* renamed from: o */
    public RecyclerView f63939o;

    /* renamed from: com.moovit.payment.account.certificate.PaymentAccountCertificatesFragment$a */
    public class C25635a extends BroadcastReceiver {
        public C25635a() {
        }

        public final void onReceive(Context context, Intent intent) {
            PaymentAccountCertificatesFragment paymentAccountCertificatesFragment = PaymentAccountCertificatesFragment.this;
            int i = PaymentAccountCertificatesFragment.f63937p;
            paymentAccountCertificatesFragment.mo83433m2();
        }
    }

    /* renamed from: com.moovit.payment.account.certificate.PaymentAccountCertificatesFragment$b */
    public class C25636b extends C18676l<PaymentAccountCertificatePreview, C18676l.C18678b<PaymentAccountCertificatePreview>, C12797f> {
        public C25636b() {
        }

        /* renamed from: t */
        public final void mo23817t(RecyclerView.C1119a0 a0Var, int i, int i2) {
            boolean z;
            String str;
            PaymentAccountCertificatePreview paymentAccountCertificatePreview = (PaymentAccountCertificatePreview) ((C18676l.C18678b) mo51052n(i)).get(i2);
            String str2 = paymentAccountCertificatePreview.f64023b;
            PaymentCertificateStatus paymentCertificateStatus = paymentAccountCertificatePreview.f64028g;
            ListItemView listItemView = (ListItemView) ((C12797f) a0Var).itemView;
            listItemView.setOnClickListener(new C16723t(6, this, paymentAccountCertificatePreview));
            int i3 = 0;
            if (str2 != null) {
                z = true;
            } else {
                z = false;
            }
            listItemView.setClickable(z);
            listItemView.setIcon(paymentAccountCertificatePreview.f64024c);
            listItemView.setTitle((CharSequence) paymentAccountCertificatePreview.f64025d);
            listItemView.setSubtitle((CharSequence) paymentAccountCertificatePreview.f64026e);
            C19617r rVar = C25765g.f64279a;
            int i4 = C25765g.C25766a.f64281a[paymentCertificateStatus.ordinal()];
            if (i4 == 1) {
                i3 = C25749d.ic_alert_pending_16_problem;
            } else if (i4 == 3) {
                i3 = C25749d.ic_alert_ring_16_critical;
            } else if (i4 == 5) {
                i3 = C25749d.ic_alert_complete_16_good;
            }
            listItemView.setIconTopStartDecorationDrawable(i3);
            if (str2 != null) {
                str = paymentAccountCertificatePreview.f64027f;
            } else {
                str = null;
            }
            listItemView.setAccessoryText((CharSequence) str);
        }

        /* renamed from: v */
        public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
            ((ListItemView) ((C12797f) a0Var).itemView).setText(((C18676l.C18678b) mo51052n(i)).f47556c);
        }

        /* renamed from: w */
        public final RecyclerView.C1119a0 mo23819w(ViewGroup viewGroup, int i) {
            return new C12797f(LayoutInflater.from(viewGroup.getContext()).inflate(C25751f.payment_account_certificate_list_item, viewGroup, false));
        }

        /* renamed from: x */
        public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
            ListItemView listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, C25748c.listItemSectionHeaderStyle);
            listItemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new C12797f(listItemView);
        }
    }

    public PaymentAccountCertificatesFragment() {
        super(PaymentAccountActivity.class);
    }

    /* renamed from: m2 */
    public final void mo83433m2() {
        if (getView() != null && this.f40824e) {
            C25761d.m64299a().mo83587b(false).addOnSuccessListener((Activity) requireActivity(), new C14753n(this, 7)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C18631c(this, 2));
        }
    }

    /* renamed from: n2 */
    public final void mo83434n2(PaymentAccount paymentAccount) {
        if (paymentAccount == null) {
            this.f63939o.setAdapter((RecyclerView.Adapter) null);
            return;
        }
        List<PaymentAccountCertificatePreview> list = paymentAccount.f64018g;
        if (C13717b.m34258e(list)) {
            this.f63939o.setAdapter((RecyclerView.Adapter) null);
            return;
        }
        C25636b bVar = new C25636b();
        bVar.mo51055y(Collections.singletonList(new C18676l.C18678b(getString(C25754i.payment_my_account_certificates_header), list)));
        this.f63939o.setAdapter(bVar);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C25751f.payment_account_certificates_fragment, viewGroup, false);
        Context context = inflate.getContext();
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C25750e.recycler_view);
        this.f63939o = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        RecyclerView recyclerView2 = this.f63939o;
        SparseIntArray sparseIntArray = new SparseIntArray(1);
        sparseIntArray.put(1, C25749d.divider_horizontal);
        recyclerView2.mo4593g(new C18681n(context, sparseIntArray, false), -1);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        C25761d.m64300h(requireContext(), this.f63938n);
        mo83433m2();
    }

    public final void onStop() {
        super.onStop();
        C25761d.m64301k(requireContext(), this.f63938n);
    }
}
