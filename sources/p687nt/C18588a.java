package p687nt;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.design.view.list.ListItemView;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.moovit.payment.account.model.PaymentAccountProfile;
import com.moovit.payment.account.profile.PaymentAccountProfilesFragment;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus;
import com.moovit.sdk.profilers.ProfilerLog;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.C7925b;
import j20.C17707d;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import m30.C5679b;
import p597jy.C17979a;
import p665mv.C18467c;
import p810sz.C19617r;
import q00.C19047a;
import v40.C25749d;
import v40.C25754i;
import v50.C20101a;
import w40.C25765g;
import z60.C20811b;

/* renamed from: nt.a */
public final /* synthetic */ class C18588a implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ int f47320b;

    /* renamed from: c */
    public final /* synthetic */ Object f47321c;

    public /* synthetic */ C18588a(Object obj, int i) {
        this.f47320b = i;
        this.f47321c = obj;
    }

    public final void onComplete(Task task) {
        LocationDescriptor locationDescriptor;
        PaymentAccount paymentAccount;
        List<PaymentAccountProfile> list;
        int i;
        int i2;
        String str;
        int i3 = 4;
        int i4 = 2;
        switch (this.f47320b) {
            case 0:
                C18589b bVar = (C18589b) this.f47321c;
                int i5 = C18589b.f47322n;
                bVar.getClass();
                if (task.isSuccessful()) {
                    C17707d dVar = (C17707d) task.getResult();
                    LocationDescriptor locationDescriptor2 = (LocationDescriptor) bVar.f47324i.getTag();
                    if (dVar.f45452c == 2 && (locationDescriptor = dVar.f45454e) != null) {
                        locationDescriptor.mo24317n(dVar.f45450a.mo24310d());
                        locationDescriptor2 = locationDescriptor;
                    }
                    bVar.f47328m.setVisibility(4);
                    bVar.f47324i.setTag(locationDescriptor2);
                    bVar.f47324i.setTitle((CharSequence) locationDescriptor2.f23651f);
                    bVar.f47324i.setSubtitleItems(locationDescriptor2.f23652g);
                    bVar.f47325j.setEnabled(true);
                    bVar.f47326k.setEnabled(true);
                    bVar.f47327l.setEnabled(true);
                    return;
                }
                LocationDescriptor locationDescriptor3 = (LocationDescriptor) bVar.f47324i.getTag();
                bVar.f47328m.setVisibility(4);
                bVar.f47324i.setTag(locationDescriptor3);
                bVar.f47324i.setTitle((CharSequence) locationDescriptor3.f23651f);
                bVar.f47324i.setSubtitleItems(locationDescriptor3.f23652g);
                bVar.f47325j.setEnabled(true);
                bVar.f47326k.setEnabled(true);
                bVar.f47327l.setEnabled(true);
                return;
            case 1:
                ((TodBookingOrderViewModel) this.f47321c).f40075g.setValue(Boolean.FALSE);
                return;
            case 2:
                int i6 = C5679b.f18460q;
                ((C5679b) this.f47321c).mo46784S1();
                return;
            case 3:
                int i7 = MicroMobilityPurchaseActivity.f14911Y;
                ((MicroMobilityPurchaseActivity) this.f47321c).mo44506I1();
                return;
            case 4:
                PaymentAccountProfilesFragment paymentAccountProfilesFragment = (PaymentAccountProfilesFragment) this.f47321c;
                int i8 = PaymentAccountProfilesFragment.f64106q;
                paymentAccountProfilesFragment.getClass();
                if (task.isSuccessful()) {
                    paymentAccount = (PaymentAccount) task.getResult();
                } else {
                    paymentAccount = null;
                }
                if (paymentAccount != null) {
                    list = paymentAccount.f64017f;
                } else {
                    list = Collections.emptyList();
                }
                if (list.isEmpty()) {
                    PaymentAccountProfilesFragment.m64262m2(paymentAccountProfilesFragment.f64108o, 0);
                } else {
                    boolean c = PaymentAccount.m64175c(paymentAccount, (String) ((C19047a) paymentAccountProfilesFragment.mo46776J1("CONFIGURATION")).mo51505b(C20101a.f51008U), PaymentAccountContextStatus.CONNECTED);
                    if (c) {
                        i = list.size() + 1;
                    } else {
                        i = list.size();
                    }
                    PaymentAccountProfilesFragment.m64262m2(paymentAccountProfilesFragment.f64108o, i);
                    Iterator<PaymentAccountProfile> it = list.iterator();
                    int i9 = 0;
                    while (it.hasNext()) {
                        PaymentAccountProfile next = it.next();
                        int i11 = i9 + 1;
                        ListItemView listItemView = (ListItemView) paymentAccountProfilesFragment.f64108o.getChildAt(i9);
                        PaymentProfile paymentProfile = next.f64033b;
                        PaymentCertificateStatus paymentCertificateStatus = next.f64035d;
                        listItemView.setIcon(C25749d.ic_identification_24_on_surface_emphasis_low);
                        C19617r rVar = C25765g.f64279a;
                        int[] iArr = C25765g.C25766a.f64281a;
                        int i12 = iArr[paymentCertificateStatus.ordinal()];
                        if (i12 == 1) {
                            i2 = C25749d.ic_alert_pending_16_problem;
                        } else if (i12 == i4 || i12 == 3 || i12 == i3) {
                            i2 = C25749d.ic_alert_ring_16_critical;
                        } else if (i12 == 5) {
                            i2 = 0;
                        } else {
                            throw new IllegalStateException("Unknown profile status: " + paymentCertificateStatus);
                        }
                        listItemView.setIconTopEndDecorationDrawable(i2);
                        listItemView.setTitle((CharSequence) paymentProfile.f42829c);
                        Context requireContext = paymentAccountProfilesFragment.requireContext();
                        Iterator<PaymentAccountProfile> it2 = it;
                        long j = next.f64034c;
                        int i13 = iArr[paymentCertificateStatus.ordinal()];
                        if (i13 == 1) {
                            str = requireContext.getString(C25754i.payment_mot_profile_pending_short);
                        } else if (i13 == 2) {
                            str = requireContext.getString(C25754i.payment_mot_profile_expired_short);
                        } else if (i13 == 3) {
                            str = requireContext.getString(C25754i.payment_mot_profile_unapproved_short);
                        } else if (i13 == 4) {
                            str = requireContext.getString(C25754i.payment_mot_profile_missing_short);
                        } else if (i13 != 5) {
                            throw new IllegalStateException("Unknown profile status: " + paymentCertificateStatus);
                        } else if (j != -1) {
                            str = requireContext.getString(C25754i.payment_mot_profile_validto, new Object[]{C7925b.m18022j(requireContext, j)});
                        } else {
                            str = null;
                        }
                        listItemView.setSubtitle((CharSequence) str);
                        listItemView.setOnClickListener(new C18467c(2, paymentAccountProfilesFragment, paymentProfile));
                        listItemView.setClickable(!paymentProfile.f42832f);
                        i3 = 4;
                        it = it2;
                        i9 = i11;
                        i4 = 2;
                    }
                    if (c) {
                        ListItemView listItemView2 = (ListItemView) paymentAccountProfilesFragment.f64108o.getChildAt(i9);
                        listItemView2.setTitle(C25754i.payment_mot_discount_profile);
                        listItemView2.setSubtitle(C25754i.payment_mot_discount_profile_add);
                        listItemView2.setIcon(C25749d.ic_add_24_on_surface_emphasis_low);
                        listItemView2.setIconTopEndDecorationDrawable((Drawable) null);
                        listItemView2.setOnClickListener(new C17979a(paymentAccountProfilesFragment, 8));
                    }
                }
                int i14 = 8;
                ListItemView listItemView3 = paymentAccountProfilesFragment.f64109p;
                if (paymentAccountProfilesFragment.f64108o.getChildCount() > 0) {
                    i14 = 0;
                }
                listItemView3.setVisibility(i14);
                return;
            case 5:
                ((C20811b) this.f47321c).f52531o.setRefreshing(false);
                return;
            case 6:
                Context context = (Context) this.f47321c;
                if (task.isSuccessful()) {
                    ProfilerLog.m41879c(context).mo49244b("ActivityRecognitionClientCommands", "removeActivityUpdates-completed successfully");
                    return;
                }
                ProfilerLog c2 = ProfilerLog.m41879c(context);
                StringBuilder k = C13555b.m33972k("removeActivityUpdates-failed with error ");
                k.append(task.getException());
                c2.mo49244b("ActivityRecognitionClientCommands", k.toString());
                Objects.toString(task.getException());
                return;
            default:
                int i15 = PurchaseTicketActivity.f23250Y;
                ((PurchaseTicketActivity) this.f47321c).mo44506I1();
                return;
        }
    }
}
