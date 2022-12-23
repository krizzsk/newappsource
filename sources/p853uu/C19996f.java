package p853uu;

import a40.C0078a;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.home.dashboard.C14944i;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.model.MotActivationStationInfo;
import com.moovit.app.mot.p417qr.C15174a;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.ImageProviderFragment;
import com.moovit.image.model.Image;
import com.moovit.location.C16202a;
import com.moovit.location.LocationAlertFragment;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.moovit.micromobility.MicroMobilityRideDetailsActivity;
import com.moovit.micromobility.action.MicroMobilityAction;
import com.moovit.micromobility.damage.MicroMobilityReportDamageActivity;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.micromobility.ride.MicroMobilityRideMetric;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.ticket.C7762g;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.C7925b;
import java.io.File;
import java.util.List;
import l30.C5566a0;
import l30.C5570c0;
import l30.C5585p;
import l30.C5593v;
import l30.C5595x;
import l30.C5596y;
import l30.C5597z;
import m30.C5679b;
import p054d0.C4294m;
import p066e0.C4454r0;
import p543hq.C17474b;
import p977zz.C20941h;
import p977zz.C20975x0;
import q50.C19080b;
import t30.C6580t;
import x00.C20440a;
import z20.C20806a;

/* renamed from: uu.f */
public final /* synthetic */ class C19996f implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f50839b;

    /* renamed from: c */
    public final /* synthetic */ Object f50840c;

    public /* synthetic */ C19996f(Object obj, int i) {
        this.f50839b = i;
        this.f50840c = obj;
    }

    public final void onSuccess(Object obj) {
        TransitStop transitStop;
        String str;
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        String str2 = null;
        switch (this.f50839b) {
            case 0:
                C15174a aVar = (C15174a) this.f50840c;
                List<MotActivation> list = (List) obj;
                int i5 = C15174a.f39086r;
                A a = aVar.f40822c;
                if (a != null) {
                    if (C13717b.m34258e(list)) {
                        a.finish();
                        return;
                    }
                    aVar.f39089p = list;
                    MotActivationStationInfo motActivationStationInfo = ((MotActivation) C13717b.m34256c(list)).f38997n;
                    if (motActivationStationInfo != null) {
                        transitStop = motActivationStationInfo.f39021b.get();
                    } else {
                        transitStop = null;
                    }
                    if (transitStop != null) {
                        str = transitStop.f23731c;
                    } else {
                        str = null;
                    }
                    aVar.f39088o.setStationName(str);
                    aVar.f39088o.setQrCodes(C13720d.m34273c(list, (C13722f) null, new C4454r0(4)));
                    MotActivation motActivation = (MotActivation) C13717b.m34256c(list);
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                    aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "mot_activation_qr_viewer_station_entrance_impression");
                    aVar2.mo49943k(AnalyticsAttributeKey.ID, motActivation.f38985b);
                    aVar2.mo49944l(AnalyticsAttributeKey.COUNT, Integer.valueOf(list.size()));
                    aVar2.mo49943k(AnalyticsAttributeKey.AGENCY_ID, motActivation.mo45526d());
                    aVar2.mo49945m(AnalyticsAttributeKey.AGENCY_NAME, motActivation.mo45529f());
                    aVar.mo46797j2(aVar2.mo49933a());
                    C20806a.C20807a aVar3 = new C20806a.C20807a("train_ride_entrance_view");
                    aVar3.mo52934b("mot", "feature");
                    MarketingEventImpressionBinder.m41586a(aVar, aVar3.mo52933a());
                    return;
                }
                return;
            case 1:
                ImageProviderFragment.m40787p2((ImageProviderFragment) this.f50840c, (File) obj);
                return;
            case 2:
                LocationAlertFragment locationAlertFragment = (LocationAlertFragment) this.f50840c;
                C16202a.C16203a aVar4 = (C16202a.C16203a) obj;
                if (aVar4 != null) {
                    locationAlertFragment.f42239q = aVar4;
                    locationAlertFragment.mo48519n2();
                    return;
                }
                int i6 = LocationAlertFragment.f42235x;
                locationAlertFragment.getClass();
                return;
            case 3:
                MicroMobilityRideDetailsActivity microMobilityRideDetailsActivity = (MicroMobilityRideDetailsActivity) this.f50840c;
                MicroMobilityRide microMobilityRide = (MicroMobilityRide) obj;
                int i7 = MicroMobilityRideDetailsActivity.f14839Y;
                microMobilityRideDetailsActivity.getClass();
                ServerId serverId = microMobilityRide.f14986d;
                C0078a aVar5 = microMobilityRide.f14992j;
                C5585p pVar = microMobilityRideDetailsActivity.f14841X;
                pVar.f18304c.mo48656t2(new C14944i(2, pVar, microMobilityRide));
                microMobilityRideDetailsActivity.f14841X.mo21409a(microMobilityRide);
                TextView textView = (TextView) microMobilityRideDetailsActivity.findViewById(C5597z.date);
                C0078a aVar6 = microMobilityRide.f14992j;
                if (microMobilityRide.f14991i.f15007b == MicroMobilityRide.Status.COMPLETED) {
                    j = aVar6.f200e;
                } else {
                    j = microMobilityRide.f14990h;
                }
                textView.setText(C7925b.m18023k(microMobilityRideDetailsActivity, j));
                TextView textView2 = (TextView) microMobilityRideDetailsActivity.findViewById(C5597z.status);
                MicroMobilityRide.Status status = microMobilityRide.f14991i.f15007b;
                Context context = textView2.getContext();
                int i8 = C5593v.f18327a[status.ordinal()];
                if (i8 == 1) {
                    i3 = C5596y.ic_alert_complete_16_good;
                    i2 = C5570c0.micro_mobility_ride_status_completed;
                    i = C5595x.colorGood;
                } else if (i8 == 2) {
                    i3 = C5596y.ic_alert_cancelled_16_critical;
                    i2 = C5570c0.micro_mobility_ride_status_canceled;
                    i = C5595x.colorCritical;
                } else if (i8 == 3) {
                    i3 = C5596y.ic_alert_warning_16_problem;
                    i2 = C5570c0.micro_mobility_ride_status_expired;
                    i = C5595x.colorProblem;
                } else {
                    throw new IllegalStateException("Ride details screen should be open only with COMPLETED / CANCELLED / EXPIRED statuses.");
                }
                textView2.setText(i2);
                textView2.setTextColor(C20941h.m49043f(i, context));
                C15780a.m40272e(textView2, i3);
                textView2.setContentDescription(context.getString(C5570c0.voiceover_ride_status, new Object[]{textView2.getText()}));
                ListItemView listItemView = (ListItemView) microMobilityRideDetailsActivity.findViewById(C5597z.provider_details);
                listItemView.setIcon(aVar5.f196a);
                listItemView.setTitle((CharSequence) aVar5.f204i);
                listItemView.setSubtitle((CharSequence) aVar5.f205j);
                LocationDescriptor locationDescriptor = aVar5.f198c;
                LocationDescriptor locationDescriptor2 = aVar5.f199d;
                View findViewById = microMobilityRideDetailsActivity.findViewById(C5597z.trip_details_group);
                if (locationDescriptor2 == null) {
                    findViewById.setVisibility(8);
                } else {
                    microMobilityRideDetailsActivity.mo19439y2(microMobilityRideDetailsActivity.mo44549x2(C5597z.origin), locationDescriptor);
                    microMobilityRideDetailsActivity.mo19439y2(microMobilityRideDetailsActivity.mo44549x2(C5597z.destination), locationDescriptor2);
                    microMobilityRideDetailsActivity.mo19437A2();
                }
                List<MicroMobilityRideMetric> list2 = aVar5.f208m;
                if (C13717b.m34258e(list2)) {
                    i4 = 0;
                } else {
                    i4 = list2.size();
                }
                LinearLayout linearLayout = (LinearLayout) microMobilityRideDetailsActivity.findViewById(C5597z.container);
                UiUtils.m40250i(linearLayout, C5566a0.micro_mobility_metric_view, 0, i4);
                for (int i9 = 0; i9 < i4; i9++) {
                    ListItemView listItemView2 = (ListItemView) linearLayout.getChildAt(i9);
                    MicroMobilityRideMetric microMobilityRideMetric = list2.get(i9);
                    listItemView2.setIcon(microMobilityRideMetric.f14995b);
                    listItemView2.setTitle((CharSequence) microMobilityRideMetric.f14996c);
                    listItemView2.setSubtitle((CharSequence) microMobilityRideMetric.f14997d);
                    C20440a aVar7 = microMobilityRideMetric.f14998e;
                    if (aVar7 == null) {
                        listItemView2.setAccessoryView((View) null);
                    } else if (aVar7.mo52636a()) {
                        listItemView2.setAccessoryText(aVar7.f51782b);
                    } else {
                        Image image = aVar7.f51781a;
                        if (image != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            listItemView2.setIcon(image);
                        }
                    }
                }
                int i11 = aVar5.f206k;
                if (i11 != -1) {
                    z = true;
                } else {
                    z = false;
                }
                ListItemView listItemView3 = (ListItemView) microMobilityRideDetailsActivity.findViewById(C5597z.ride_rating);
                View findViewById2 = microMobilityRideDetailsActivity.findViewById(C5597z.divider3);
                if (z) {
                    ((RatingBar) listItemView3.getAccessoryView()).setRating((float) i11);
                    UiUtils.m40238F(0, listItemView3, findViewById2);
                } else {
                    UiUtils.m40238F(8, listItemView3, findViewById2);
                }
                ServerId serverId2 = microMobilityRide.f14986d;
                List<MicroMobilityAction> list3 = microMobilityRide.f14992j.f209n;
                FragmentManager supportFragmentManager = microMobilityRideDetailsActivity.getSupportFragmentManager();
                C5679b bVar = (C5679b) supportFragmentManager.mo3923A("micro_mobility_actions");
                if (bVar == null || !serverId2.equals(bVar.f18461n) || !C20975x0.m49118e(list3, bVar.f18462o)) {
                    C0909a aVar8 = new C0909a(supportFragmentManager);
                    int i12 = C5597z.fragment_container;
                    ServerId serverId3 = microMobilityRide.f14986d;
                    int i13 = C5679b.f18460q;
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("rideId", serverId3);
                    bundle.putParcelableArrayList("actions", C13717b.m34264k(list3));
                    C5679b bVar2 = new C5679b();
                    bVar2.setArguments(bundle);
                    aVar8.mo4111f(i12, bVar2, "micro_mobility_actions");
                    aVar8.mo4043i();
                }
                C0078a aVar9 = microMobilityRide.f14992j;
                String f = aVar9.f198c.mo24313f();
                LocationDescriptor locationDescriptor3 = aVar9.f199d;
                if (locationDescriptor3 != null) {
                    str2 = locationDescriptor3.mo24313f();
                }
                C17474b.C17475a aVar10 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar10.mo49939g(AnalyticsAttributeKey.TYPE, "micro_mobility_ride_details_impression");
                aVar10.mo49937e(AnalyticsAttributeKey.ID, microMobilityRide.f14986d);
                aVar10.mo49939g(AnalyticsAttributeKey.PROVIDER, microMobilityRide.f14984b);
                aVar10.mo49939g(AnalyticsAttributeKey.ITEM_ID, microMobilityRide.f14985c);
                aVar10.mo49937e(AnalyticsAttributeKey.VEHICLE_TYPE_ID, microMobilityRide.f14987e);
                aVar10.mo49939g(AnalyticsAttributeKey.STATUS, C25541a.m63893x(microMobilityRide.f14991i.f15007b));
                aVar10.mo49945m(AnalyticsAttributeKey.ORIGIN, f);
                aVar10.mo49945m(AnalyticsAttributeKey.DESTINATION, str2);
                microMobilityRideDetailsActivity.mo44545v2(aVar10.mo49933a());
                return;
            case 4:
                MicroMobilityReportDamageActivity microMobilityReportDamageActivity = (MicroMobilityReportDamageActivity) this.f50840c;
                C6580t tVar = (C6580t) obj;
                int i14 = MicroMobilityReportDamageActivity.f14858l0;
                microMobilityReportDamageActivity.getClass();
                C17474b.C17475a aVar11 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar11.mo49939g(AnalyticsAttributeKey.TYPE, "micro_mobility_report_damage_success_dialog");
                microMobilityReportDamageActivity.mo44545v2(aVar11.mo49933a());
                AlertDialogFragment.C15856a k = new AlertDialogFragment.C15856a((Context) microMobilityReportDamageActivity).mo47682k("report_sent_successfully_dialog");
                k.mo47676e(C5596y.ic_check_mark_ring_56_good, false);
                microMobilityReportDamageActivity.mo44530n2(k.mo47683l(C5570c0.micro_mobility_report_damage_success_title).mo47678g(C5570c0.micro_mobility_report_damage_success_message).mo47681j(C5570c0.got_it).mo47673b());
                return;
            case 5:
                C19080b bVar3 = (C19080b) this.f50840c;
                PaymentMethod paymentMethod = (PaymentMethod) obj;
                ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions = bVar3.f48502n;
                if (bVar3.f40822c != null) {
                    C17474b.C17475a aVar12 = new C17474b.C17475a(AnalyticsEventKey.SET_CREDIT_CARD_RESULT);
                    aVar12.mo49941i(AnalyticsAttributeKey.SUCCESS, true);
                    bVar3.mo46797j2(aVar12.mo49933a());
                    C20806a.C20807a aVar13 = new C20806a.C20807a("payment_method_tap");
                    aVar13.mo52934b(clearanceProviderPaymentInstructions.f42584b, "payment_context");
                    aVar13.mo52935c();
                    bVar3.mo46786U1(ClearanceProvider.C16293a.class, new C4294m(4, clearanceProviderPaymentInstructions.f42587e.f42774c.f42605c, paymentMethod));
                    return;
                }
                return;
            case 6:
                PurchaseTicketActivity purchaseTicketActivity = (PurchaseTicketActivity) this.f50840c;
                String str3 = (String) obj;
                ((PurchaseStep) purchaseTicketActivity.f23251X.f32739b.mo4292b(str3)).mo24015b(purchaseTicketActivity, str3);
                return;
            default:
                int i15 = C7762g.f23551y;
                ((C7762g) this.f50840c).mo24256p2((PaymentAccount) obj);
                return;
        }
    }
}
