package p501fw;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.subscription.AdFreeMenuItemFragment;
import com.moovit.app.subscription.SubscriptionsActivity;
import com.moovit.app.suggestedroutes.TripPlanOptions;
import com.moovit.app.surveys.data.remote.SurveyAnswerTreeNode;
import com.moovit.app.tod.pincode.TodAutonomousRidePinCodeDialogFragment;
import com.moovit.app.tod.shuttle.booking.subscriptionenroll.TodShuttleBookingSubscriptionEnrollDialogFragment;
import com.moovit.app.tod.view.TodOrderAssignmentListItemView;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.app.useraccount.notifications.UserNotificationsCenterActivity;
import com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity;
import com.moovit.app.wondo.tickets.rewards.WondoRewardsActivity;
import com.moovit.auth.FirebaseAuthUtils;
import com.moovit.commons.utils.Color;
import com.moovit.itinerary.model.TripPlanConfig;
import com.moovit.location.LocationSettingsFixer;
import com.moovit.location.mappicker.MapLocationPickerActivity;
import com.moovit.map.MapFragment;
import com.moovit.payment.account.PaymentAccountActivity;
import com.moovit.payment.account.PaymentAccountMenuItemFragment;
import com.moovit.payment.account.external.employee.EmployeeAccountActivity;
import com.moovit.payment.account.paymentmethod.PaymentAccountPaymentMethodsFragment;
import com.moovit.payment.account.profile.PaymentAccountAddProfileActivity;
import com.moovit.payment.gateway.C16328a;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationType;
import com.moovit.request.RequestOptions;
import com.moovit.ticketing.ticket.C7762g;
import com.moovit.ticketing.ticket.TicketId;
import com.moovit.ticketing.validation.TicketValidationActivity;
import com.moovit.transit.LocationDescriptor;
import com.moovit.tripplanner.TripPlannerTime;
import com.moovit.view.PromotionBannerView;
import com.moovit.view.p340cc.C7959a;
import com.moovit.web.WebViewActivity;
import com.umo.ads.p348o.zzc;
import com.veriff.sdk.views.camera.p978ui.C22912b;
import g50.C25727a;
import h60.C17374z0;
import j90.C12789b;
import java.util.concurrent.TimeUnit;
import k60.C18000b;
import mf0.C24362h;
import o10.C18684c;
import p001a0.C0016g;
import p066e0.C4452q0;
import p066e0.C4454r0;
import p304x.C7038d0;
import p372at.C13515b;
import p495fq.C17057b;
import p503fy.C17125a;
import p543hq.C17474b;
import p572iw.C17663f;
import p572iw.C17666h;
import p572iw.C17674j;
import p668my.C18479c;
import p783rw.C19372d;
import p783rw.C19373e;
import p808sx.C19572h;
import p824tp.C19746x;
import p927xw.C20640h;
import p927xw.C20647n;
import p977zz.C20964s0;
import q50.C19082c;
import q60.C19088b;
import r60.C19234e;
import r60.C19242g;
import v40.C25750e;
import w40.C25765g;
import w80.C13220b;

/* renamed from: fw.a */
public final /* synthetic */ class C17102a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f44266b;

    /* renamed from: c */
    public final /* synthetic */ Object f44267c;

    public /* synthetic */ C17102a(Object obj, int i) {
        this.f44266b = i;
        this.f44267c = obj;
    }

    public final void onClick(View view) {
        String str;
        switch (this.f44266b) {
            case 0:
                AdFreeMenuItemFragment adFreeMenuItemFragment = (AdFreeMenuItemFragment) this.f44267c;
                int i = AdFreeMenuItemFragment.f39754p;
                adFreeMenuItemFragment.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "ad_free_menu_item_click");
                adFreeMenuItemFragment.mo46797j2(aVar.mo49933a());
                Context context = view.getContext();
                TrackingEvent trackingEvent = TrackingEvent.SUBSCRIPTIONS_INDICATOR;
                SharedPreferences sharedPreferences = context.getSharedPreferences("events_tracker_store", 0);
                sharedPreferences.edit().putInt(trackingEvent.getPrefsKey(), sharedPreferences.getInt(trackingEvent.getPrefsKey(), 0) + 1).apply();
                adFreeMenuItemFragment.mo45936m2();
                Context context2 = view.getContext();
                int i2 = SubscriptionsActivity.f39776Y;
                adFreeMenuItemFragment.startActivity(new Intent(context2, SubscriptionsActivity.class));
                return;
            case 1:
                C17663f fVar = (C17663f) this.f44267c;
                int i3 = C17663f.f45392x;
                fVar.getClass();
                long longValue = ((Long) view.getTag()).longValue();
                TripPlannerTime r2 = fVar.mo50112r2(((TripPlanOptions) fVar.f40537p).f39803b, longValue);
                if (r2 != null) {
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "trip_plan_later_button_clicked");
                    aVar2.mo49939g(AnalyticsAttributeKey.TRIP_PLAN_TIME_TYPE, C0016g.m16F(r2.f23799b));
                    aVar2.mo49936d(AnalyticsAttributeKey.TIME, TimeUnit.MILLISECONDS.toMinutes(longValue));
                    aVar2.mo49936d(AnalyticsAttributeKey.DATE, r2.mo24487b());
                    fVar.mo46797j2(aVar2.mo49933a());
                    fVar.mo50114u2(r2, 300);
                    return;
                }
                return;
            case 2:
                C17666h.C17670d dVar = (C17666h.C17670d) this.f44267c;
                C17666h hVar = C17666h.this;
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "new_routes_snackbar_clicked");
                hVar.mo46797j2(aVar3.mo49933a());
                C17666h hVar2 = C17666h.this;
                TripPlanConfig tripPlanConfig = hVar2.f45408F;
                if (tripPlanConfig != null) {
                    hVar2.mo52810z2(tripPlanConfig);
                }
                hVar2.f45408F = null;
                hVar2.mo52808q2(hVar2.f45407E);
                hVar2.f45407E.clear();
                if (hVar2.f45403A == null) {
                    hVar2.f45403A = new C17674j(hVar2, hVar2.getContext());
                }
                hVar2.f45403A.mo23803d();
                hVar2.mo50121K2();
                C17666h.this.f45409G = null;
                return;
            case 3:
                C19373e eVar = (C19373e) this.f44267c;
                String str2 = C19373e.f49295k;
                eVar.getClass();
                eVar.mo46753L1(C19373e.C19374a.class, new C19372d(0, eVar, (SurveyAnswerTreeNode) view.getTag()));
                eVar.dismissAllowingStateLoss();
                return;
            case 4:
                C20647n nVar = (C20647n) this.f44267c;
                String str3 = C20647n.f52214k;
                nVar.getClass();
                if (!view.isActivated()) {
                    for (View activated : nVar.f52217j) {
                        activated.setActivated(false);
                    }
                    view.setActivated(true);
                    nVar.mo52824S1();
                    return;
                }
                return;
            case 5:
                TodAutonomousRidePinCodeDialogFragment todAutonomousRidePinCodeDialogFragment = (TodAutonomousRidePinCodeDialogFragment) this.f44267c;
                int i4 = TodAutonomousRidePinCodeDialogFragment.f40368m;
                C24362h.m61211f(todAutonomousRidePinCodeDialogFragment, "this$0");
                todAutonomousRidePinCodeDialogFragment.dismissAllowingStateLoss();
                return;
            case 6:
                TodShuttleBookingSubscriptionEnrollDialogFragment todShuttleBookingSubscriptionEnrollDialogFragment = (TodShuttleBookingSubscriptionEnrollDialogFragment) this.f44267c;
                int i5 = TodShuttleBookingSubscriptionEnrollDialogFragment.f40407n;
                C24362h.m61211f(todShuttleBookingSubscriptionEnrollDialogFragment, "this$0");
                todShuttleBookingSubscriptionEnrollDialogFragment.dismissAllowingStateLoss();
                return;
            case 7:
                TodOrderAssignmentListItemView todOrderAssignmentListItemView = (TodOrderAssignmentListItemView) this.f44267c;
                int i6 = TodOrderAssignmentListItemView.f40454B;
                todOrderAssignmentListItemView.getClass();
                String str4 = (String) view.getTag();
                if (!C20964s0.m49090h(str4)) {
                    Context context3 = view.getContext();
                    context3.startActivity(WebViewActivity.m18168y2(todOrderAssignmentListItemView.getContext(), C20640h.m48521a(context3, str4), ""));
                    return;
                }
                return;
            case 8:
                C19572h hVar3 = (C19572h) this.f44267c;
                int i7 = C19572h.f49749k;
                hVar3.getClass();
                C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "save_clicked");
                hVar3.mo22564R1(aVar4.mo49933a());
                hVar3.mo46753L1(C19572h.C19573a.class, new C7038d0(hVar3.mo51915S1(), 13));
                hVar3.dismiss();
                return;
            case 9:
                UserNotificationsCenterActivity userNotificationsCenterActivity = (UserNotificationsCenterActivity) this.f44267c;
                int i8 = UserNotificationsCenterActivity.f40616o0;
                userNotificationsCenterActivity.f40620Z.setRefreshing(true);
                C17125a aVar5 = userNotificationsCenterActivity.f40617U;
                synchronized (aVar5) {
                    if (aVar5.f44339e == null) {
                        C17125a.C17126a aVar6 = new C17125a.C17126a();
                        aVar5.f44339e = aVar6;
                        aVar6.execute(new Void[0]);
                        return;
                    }
                    return;
                }
            case 10:
                C18479c cVar = (C18479c) this.f44267c;
                int i9 = C18479c.f47082d;
                cVar.mo50584J1();
                Context context4 = cVar.getContext();
                MoovitConnectProviderActivity.Mode mode = MoovitConnectProviderActivity.Mode.SIGN_UP;
                int i11 = MoovitConnectProviderActivity.f40653x0;
                Intent intent = new Intent(context4, MoovitConnectProviderActivity.class);
                intent.putExtra("extra_action", mode);
                Fragment parentFragment = cVar.getParentFragment();
                if (parentFragment != null) {
                    parentFragment.startActivityForResult(intent, 1001);
                    return;
                } else {
                    cVar.startActivityForResult(intent, 1001);
                    return;
                }
            case 11:
                WondoRewardsActivity wondoRewardsActivity = WondoRewardsActivity.this;
                if (wondoRewardsActivity.f37313z) {
                    int i12 = WondoRewardsActivity.f40774Z;
                    wondoRewardsActivity.mo46740z2();
                    return;
                }
                return;
            case 12:
                C18684c.C18686b bVar = (C18684c.C18686b) this.f44267c;
                C18684c cVar2 = C18684c.this;
                if (cVar2.f40824e && cVar2.f40831l.mo44597e()) {
                    C18684c cVar3 = C18684c.this;
                    cVar3.mo51057m2(cVar3.f47570t);
                    return;
                }
                return;
            case 13:
                MapLocationPickerActivity mapLocationPickerActivity = (MapLocationPickerActivity) this.f44267c;
                mapLocationPickerActivity.mo44545v2(mapLocationPickerActivity.f42281p0.mo49933a());
                LocationDescriptor locationDescriptor = (LocationDescriptor) mapLocationPickerActivity.f42275Y.getTag();
                if (locationDescriptor != null && locationDescriptor.f23651f == null) {
                    locationDescriptor.f23651f = mapLocationPickerActivity.getString(C19746x.map_tapped_location);
                }
                Intent intent2 = new Intent();
                intent2.putExtra("descriptor", locationDescriptor);
                mapLocationPickerActivity.setResult(-1, intent2);
                mapLocationPickerActivity.finish();
                return;
            case 14:
                MapFragment mapFragment = (MapFragment) this.f44267c;
                if (mapFragment.f42381t0 && mapFragment.f40822c != null && mapFragment.f42345F0 != null) {
                    LocationSettingsFixer.C16198a aVar7 = new LocationSettingsFixer.C16198a((C15682c<?>) mapFragment);
                    aVar7.f42259f = true;
                    aVar7.mo48529b(C19746x.location_rational_map_follow_title, C19746x.location_rational_map_follow_message);
                    aVar7.mo48528a(new C17057b(mapFragment, 2));
                    return;
                }
                return;
            case 15:
                PaymentAccountMenuItemFragment paymentAccountMenuItemFragment = (PaymentAccountMenuItemFragment) this.f44267c;
                int i13 = PaymentAccountMenuItemFragment.f63832r;
                paymentAccountMenuItemFragment.getClass();
                Boolean bool = Boolean.TRUE;
                boolean equals = bool.equals(view.getTag(C25750e.view_tag_param2));
                boolean equals2 = bool.equals(view.getTag(C25750e.view_tag_param3));
                C17474b.C17475a aVar8 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
                if (equals2) {
                    str = "payment_account_reconnect_clicked";
                } else {
                    str = "payment_account_login_clicked";
                }
                aVar8.mo49939g(analyticsAttributeKey, str);
                aVar8.mo49941i(AnalyticsAttributeKey.IS_LOGGED_IN, equals);
                paymentAccountMenuItemFragment.mo46797j2(aVar8.mo49933a());
                if (equals) {
                    Context context5 = view.getContext();
                    int i14 = PaymentAccountActivity.f63829X;
                    paymentAccountMenuItemFragment.startActivity(new Intent(context5, PaymentAccountActivity.class));
                    return;
                }
                String str5 = (String) view.getTag(C25750e.view_tag_param1);
                if (str5 != null) {
                    paymentAccountMenuItemFragment.startActivity(PaymentRegistrationActivity.m41717A2(view.getContext(), PaymentRegistrationType.REGISTRATION, str5));
                    return;
                }
                return;
            case 16:
                EmployeeAccountActivity employeeAccountActivity = (EmployeeAccountActivity) this.f44267c;
                int i15 = EmployeeAccountActivity.f63998U;
                employeeAccountActivity.getClass();
                C17474b.C17475a aVar9 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar9.mo49939g(AnalyticsAttributeKey.TYPE, "payment_account_pricing_clicked");
                employeeAccountActivity.mo44545v2(aVar9.mo49933a());
                FirebaseAuthUtils.m40012b(0, false).addOnSuccessListener(new C13515b(employeeAccountActivity, 8));
                return;
            case 17:
                PaymentAccountPaymentMethodsFragment.m64193m2(PaymentAccountPaymentMethodsFragment.this);
                return;
            case 18:
                C25727a aVar10 = (C25727a) this.f44267c;
                int i16 = C25727a.f64156p;
                aVar10.getClass();
                C17474b.C17475a aVar11 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar11.mo49939g(AnalyticsAttributeKey.TYPE, "save_clicked");
                aVar11.mo49937e(AnalyticsAttributeKey.ID, aVar10.f64157n.f42828b);
                aVar10.mo46797j2(aVar11.mo49933a());
                aVar10.mo46786U1(PaymentAccountAddProfileActivity.class, new C19372d(3, aVar10, C25765g.m64314b(aVar10.getChildFragmentManager())));
                return;
            case 19:
                C19082c cVar4 = (C19082c) this.f44267c;
                int i17 = C19082c.f48505t;
                cVar4.getClass();
                C17474b.C17475a aVar12 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar12.mo49939g(AnalyticsAttributeKey.TYPE, "credit_card");
                cVar4.mo46797j2(aVar12.mo49933a());
                C7959a b = cVar4.f48506p.mo24788b();
                if (b != null) {
                    cVar4.f48507q.setClickable(false);
                    cVar4.f48507q.setTextColor(Color.f41004h.f41007b);
                    cVar4.f48509s.setVisibility(0);
                    cVar4.mo51515p2(b);
                    return;
                }
                return;
            case 20:
                C16328a aVar13 = (C16328a) this.f44267c;
                int i18 = C16328a.f42681h;
                aVar13.getClass();
                aVar13.mo46753L1(PaymentGatewayFragment.class, new C4454r0(12));
                aVar13.dismissAllowingStateLoss();
                return;
            case 21:
                C18000b bVar2 = (C18000b) this.f44267c;
                if (bVar2.f46093u == null) {
                    C17474b.C17475a aVar14 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar14.mo49939g(AnalyticsAttributeKey.TYPE, "birth_date");
                    bVar2.mo46797j2(aVar14.mo49933a());
                    bVar2.mo50499o2().f42755m = bVar2.f46092t;
                    bVar2.mo50507x2();
                    C17374z0 z0Var = new C17374z0(bVar2.mo46783R1(), bVar2.f46092t.getTimeInMillis());
                    StringBuilder sb = new StringBuilder();
                    C13715c.m34249o(C17374z0.class, sb, "_");
                    sb.append(z0Var.f44762w);
                    String sb2 = sb.toString();
                    RequestOptions L1 = bVar2.mo46777L1();
                    L1.f42909f = true;
                    bVar2.f46093u = bVar2.mo46793f2(sb2, z0Var, L1, bVar2.f46090r);
                    return;
                }
                return;
            case 22:
                C19088b bVar3 = (C19088b) this.f44267c;
                int i19 = C19088b.f48519z;
                bVar3.getClass();
                C17474b.C17475a aVar15 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar15.mo49939g(AnalyticsAttributeKey.TYPE, "pango_card");
                bVar3.mo46797j2(aVar15.mo49933a());
                bVar3.mo51521n2(true);
                return;
            case 23:
                C19242g gVar = (C19242g) this.f44267c;
                int i21 = C19242g.f48870h;
                gVar.getClass();
                C17474b.C17475a aVar16 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar16.mo49939g(AnalyticsAttributeKey.TYPE, "switch_device_dialog_ok_clicked");
                gVar.mo22564R1(aVar16.mo49933a());
                gVar.mo46753L1(C19234e.class, new C4452q0(16));
                gVar.dismissAllowingStateLoss();
                return;
            case 24:
                ((C13220b) this.f44267c).mo23784A();
                return;
            case 25:
                C7762g gVar2 = (C7762g) this.f44267c;
                int i22 = C7762g.f23551y;
                gVar2.getClass();
                C12789b bVar4 = (C12789b) view.getTag();
                if (bVar4 != null) {
                    C17474b.C17475a aVar17 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar17.mo49939g(AnalyticsAttributeKey.TYPE, "provider_validation_clicked");
                    aVar17.mo49937e(AnalyticsAttributeKey.ID, bVar4.f31612a);
                    gVar2.mo46797j2(aVar17.mo49933a());
                    gVar2.startActivity(TicketValidationActivity.m17717y2(view.getContext(), bVar4.f31612a, (String) null, (TicketId) null));
                    return;
                }
                return;
            case 26:
                PromotionBannerView promotionBannerView = (PromotionBannerView) this.f44267c;
                promotionBannerView.f23957b.mo49545d(promotionBannerView.getContext().getSharedPreferences("promotion_banner_view", 0), Long.valueOf(System.currentTimeMillis()));
                promotionBannerView.mo24712a();
                PromotionBannerView.C7926a aVar18 = promotionBannerView.f23968m;
                if (aVar18 != null) {
                    aVar18.mo24257a();
                    return;
                }
                return;
            case 27:
                zzc zzc = (zzc) this.f44267c;
                C24362h.m61211f(zzc, "this$0");
                if (zzc.f30869y) {
                    zzc.mo35818x(false);
                    zzc.mo35809f(zzc.f30833A);
                }
                ImageView imageView = zzc.f30863s;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                zzc.f30855k = false;
                zzc.mo35814o(true, false);
                return;
            default:
                ((C22912b) this.f44267c).m56544c(view);
                return;
        }
    }
}
