package p662ms;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.view.View;
import ce0.C21100e;
import com.appboy.models.outgoing.AttributionData;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.accessibility.UserAccessibilityPrefActivity;
import com.moovit.app.carpool.center.CarpoolCenterActivity;
import com.moovit.app.general.SpreadTheLoveActivity;
import com.moovit.app.general.aboutandcontact.AboutAndContactActivity;
import com.moovit.app.general.more.DrawerFragment;
import com.moovit.app.general.settings.SettingsActivity;
import com.moovit.app.general.transportationmaps.TransportationMapsActivity;
import com.moovit.app.mot.center.MotActivationCenterActivity;
import com.moovit.app.ridesharing.RideSharingCenterActivity;
import com.moovit.app.ridesharing.registration.RideSharingProfileActivity;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationActivity;
import com.moovit.app.ridesharing.registration.RideSharingRegistrationType;
import com.moovit.app.tod.center.TodRidesCenterActivity;
import com.moovit.app.useraccount.ConnectActivity;
import com.moovit.app.useraccount.campaigns.Campaign;
import com.moovit.app.useraccount.campaigns.CampaignActivity;
import com.moovit.app.useraccount.notifications.UserNotificationsCenterActivity;
import com.moovit.app.useraccount.profile.EditProfileActivity;
import com.moovit.app.wondo.tickets.codes.WondoCodesActivity;
import com.moovit.app.wondo.tickets.fullscreen.WondoFullScreenActivity;
import com.moovit.app.wondo.tickets.invite.WondoInviteActivity;
import com.moovit.app.wondo.tickets.model.WondoCampaign;
import com.moovit.app.wondo.tickets.offers.WondoOffersActivity;
import com.moovit.app.wondo.tickets.rewards.WondoRewardsActivity;
import com.moovit.payment.account.actions.PaymentAccountActionActivity;
import com.moovit.payment.account.actions.model.RedeemBenefitActionIntent;
import com.moovit.payment.wallet.center.WalletActivity;
import com.moovit.ridesharing.model.RideSharingRegistrationSteps;
import com.moovit.ticketing.wallet.UserWalletActivity;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import com.usebutton.sdk.internal.api.AppActionRequest;
import mf0.C24362h;
import p503fy.C17127b;
import p543hq.C17474b;
import p615ks.C18126a;
import p977zz.C20927a0;

/* renamed from: ms.a */
public class C18429a implements View.OnClickListener {

    /* renamed from: b */
    public final DrawerFragment f46989b;

    public C18429a(DrawerFragment drawerFragment) {
        C21100e.m49373x(drawerFragment, "fragment");
        this.f46989b = drawerFragment;
    }

    /* renamed from: a */
    public final void mo50881a(String str) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, str);
        this.f46989b.mo46797j2(aVar.mo49933a());
    }

    public void onClick(View view) {
        String str;
        Object tag = view.getTag();
        if (tag instanceof Campaign) {
            Campaign campaign = (Campaign) tag;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CAMPAIGN_CLICKED);
            aVar.mo49935c(AnalyticsAttributeKey.ID, campaign.f40553b);
            this.f46989b.mo46797j2(aVar.mo49933a());
            Context context = view.getContext();
            int i = CampaignActivity.f40555Z;
            Intent intent = new Intent(context, CampaignActivity.class);
            intent.putExtra(AttributionData.CAMPAIGN_KEY, campaign);
            this.f46989b.startActivity(intent);
            return;
        }
        Context context2 = view.getContext();
        switch (view.getId()) {
            case R.id.menu_about:
                DrawerFragment drawerFragment = this.f46989b;
                int i2 = AboutAndContactActivity.f38043U;
                drawerFragment.startActivity(new Intent(context2, AboutAndContactActivity.class));
                return;
            case R.id.menu_accessibility:
                mo50881a("accessibility_clicked");
                DrawerFragment drawerFragment2 = this.f46989b;
                int i3 = UserAccessibilityPrefActivity.f37419X;
                drawerFragment2.startActivity(new Intent(context2, UserAccessibilityPrefActivity.class));
                return;
            case R.id.menu_accessibility_statement:
                mo50881a("accessibility_statement_clicked");
                DrawerFragment drawerFragment3 = this.f46989b;
                drawerFragment3.startActivity(WebViewActivity.m18168y2(context2, drawerFragment3.getString(R.string.accessibility_statement_mobile_url), this.f46989b.getString(R.string.accessibility_statement)));
                return;
            case R.id.menu_carpool_center:
                mo50881a("carpool_center_clicked");
                this.f46989b.startActivity(CarpoolCenterActivity.m37255y2(context2));
                return;
            case R.id.menu_favorites_sync:
                boolean equals = Boolean.TRUE.equals(view.getTag(R.id.view_tag_param1));
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "favorites_sync_clicked");
                aVar2.mo49941i(AnalyticsAttributeKey.IS_LOGGED_IN, equals);
                this.f46989b.mo46797j2(aVar2.mo49933a());
                if (equals) {
                    DrawerFragment drawerFragment4 = this.f46989b;
                    Context context3 = view.getContext();
                    int i4 = EditProfileActivity.f40629m0;
                    drawerFragment4.startActivity(new Intent(context3, EditProfileActivity.class));
                    return;
                }
                DrawerFragment drawerFragment5 = this.f46989b;
                Context context4 = view.getContext();
                int i5 = ConnectActivity.f40549l0;
                drawerFragment5.startActivity(new Intent(context4, ConnectActivity.class));
                return;
            case R.id.menu_feedback:
                mo50881a("send_feedback_clicked");
                this.f46989b.startActivity(Intent.createChooser(C20927a0.m49009d(context2.getString(R.string.support_email_subject), (String) null, new String[]{context2.getString(R.string.support_email)}), context2.getText(R.string.send_email_chooser_hint)));
                return;
            case R.id.menu_help:
                DrawerFragment drawerFragment6 = this.f46989b;
                drawerFragment6.startActivity(WebViewActivity.m18168y2(context2, drawerFragment6.getString(R.string.user_guide_url), this.f46989b.getString(R.string.user_guide_title)));
                return;
            case R.id.menu_mot_center:
                mo50881a("mot_center_clicked");
                DrawerFragment drawerFragment7 = this.f46989b;
                int i6 = MotActivationCenterActivity.f38976Y;
                drawerFragment7.startActivity(new Intent(context2, MotActivationCenterActivity.class));
                return;
            case R.id.menu_notifications_center:
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "notification_center_clicked");
                aVar3.mo49935c(AnalyticsAttributeKey.RED_BADGE_COUNT, C17127b.m43096b(view.getContext()).mo49718c());
                this.f46989b.mo46797j2(aVar3.mo49933a());
                DrawerFragment drawerFragment8 = this.f46989b;
                int i7 = UserNotificationsCenterActivity.f40616o0;
                drawerFragment8.startActivity(new Intent(context2, UserNotificationsCenterActivity.class));
                return;
            case R.id.menu_rate_us:
                mo50881a("rate_us_clicked");
                C20927a0.m49018m(context2, context2.getPackageName());
                return;
            case R.id.menu_redeem_benefit:
                mo50881a("home_menu_item_redeem_benefit_clicked");
                DrawerFragment drawerFragment9 = this.f46989b;
                RedeemBenefitActionIntent redeemBenefitActionIntent = new RedeemBenefitActionIntent();
                int i8 = PaymentAccountActionActivity.f63869X;
                C24362h.m61211f(context2, AppActionRequest.KEY_CONTEXT);
                Intent intent2 = new Intent(context2, PaymentAccountActionActivity.class);
                intent2.putExtra("accountActionIntent", redeemBenefitActionIntent);
                drawerFragment9.startActivity(intent2);
                return;
            case R.id.menu_ride_sharing_center:
                mo50881a("ride_sharing_center_clicked");
                DrawerFragment drawerFragment10 = this.f46989b;
                int i9 = RideSharingCenterActivity.f39304Z;
                drawerFragment10.startActivity(new Intent(context2, RideSharingCenterActivity.class));
                return;
            case R.id.menu_ride_sharing_login:
                boolean equals2 = Boolean.TRUE.equals(view.getTag(R.id.view_tag_param1));
                WondoCampaign wondoCampaign = (WondoCampaign) view.getTag(R.id.view_tag_param2);
                if (equals2) {
                    mo50881a("edit_profile_clicked");
                    DrawerFragment drawerFragment11 = this.f46989b;
                    int i11 = RideSharingProfileActivity.f39360Y;
                    drawerFragment11.startActivity(new Intent(context2, RideSharingProfileActivity.class));
                    return;
                } else if (wondoCampaign != null) {
                    mo50881a("ride_sharing_login_clicked");
                    this.f46989b.startActivity(WondoFullScreenActivity.m39967y2(context2, wondoCampaign.f40695c));
                    return;
                } else {
                    mo50881a("ride_sharing_login_clicked");
                    this.f46989b.startActivity(RideSharingRegistrationActivity.m39024z2(context2, RideSharingRegistrationType.CONNECT, new RideSharingRegistrationSteps(true, false, false, false), "menu_login"));
                    return;
                }
            case R.id.menu_service_alerts:
                mo50881a("service_alert_clicked");
                this.f46989b.startActivity((Intent) view.getTag());
                return;
            case R.id.menu_settings:
                mo50881a("settings_clicked");
                DrawerFragment drawerFragment12 = this.f46989b;
                int i12 = SettingsActivity.f38055U;
                drawerFragment12.startActivity(new Intent(context2, SettingsActivity.class));
                return;
            case R.id.menu_spread_the_love:
                mo50881a("spread_the_love_clicked");
                DrawerFragment drawerFragment13 = this.f46989b;
                int i13 = SpreadTheLoveActivity.f38042U;
                drawerFragment13.startActivity(new Intent(context2, SpreadTheLoveActivity.class));
                return;
            case R.id.menu_tickets_center:
                mo50881a("tickets_center_clicked");
                this.f46989b.startActivity(UserWalletActivity.m17744y2(context2));
                return;
            case R.id.menu_tod_rides_center:
                DrawerFragment drawerFragment14 = this.f46989b;
                int i14 = TodRidesCenterActivity.f40201l0;
                drawerFragment14.startActivity(new Intent(context2, TodRidesCenterActivity.class));
                return;
            case R.id.menu_transportation_maps:
                mo50881a("line_maps_clicked");
                DrawerFragment drawerFragment15 = this.f46989b;
                int i15 = TransportationMapsActivity.f38085Y;
                drawerFragment15.startActivity(new Intent(context2, TransportationMapsActivity.class));
                return;
            case R.id.menu_unified_wallet_center:
                mo50881a("home_menu_item_unified_wallet_clicked");
                DrawerFragment drawerFragment16 = this.f46989b;
                int i16 = WalletActivity.f42881l0;
                Intent intent3 = new Intent(context2, WalletActivity.class);
                intent3.putExtra("tab", (Parcelable) null);
                drawerFragment16.startActivity(intent3);
                return;
            case R.id.menu_version_details:
                mo50881a("new_in_this_version_clicked");
                if (C18126a.m44816a(context2)) {
                    str = this.f46989b.getString(R.string.new_version_available);
                } else {
                    str = this.f46989b.getString(R.string.new_in_this_version);
                }
                DrawerFragment drawerFragment17 = this.f46989b;
                drawerFragment17.startActivity(WebViewActivity.m18168y2(context2, drawerFragment17.getString(R.string.whats_new_link_android), str));
                C18126a.f46340a.mo49545d(context2.getSharedPreferences("com.moovit.general.ApplicationVersionPrefs", 0), C18126a.f46341b);
                return;
            case R.id.menu_wondo_codes:
                mo50881a("home_menu_item_wondo_codes_clicked");
                WondoCampaign wondoCampaign2 = (WondoCampaign) view.getTag();
                if (wondoCampaign2 != null) {
                    this.f46989b.startActivity(WondoFullScreenActivity.m39967y2(context2, wondoCampaign2.f40695c));
                    return;
                }
                DrawerFragment drawerFragment18 = this.f46989b;
                int i17 = WondoCodesActivity.f40679Z;
                drawerFragment18.startActivity(new Intent(context2, WondoCodesActivity.class));
                return;
            case R.id.menu_wondo_faq:
                mo50881a("home_menu_item_wondo_faq_clicked");
                DrawerFragment drawerFragment19 = this.f46989b;
                drawerFragment19.startActivity(WebViewActivity.m18168y2(context2, drawerFragment19.getString(R.string.wondo_faq_url), this.f46989b.getString(R.string.wondo_faq_title)));
                return;
            case R.id.menu_wondo_invite:
                mo50881a("home_menu_item_wondo_invite_clicked");
                WondoCampaign wondoCampaign3 = (WondoCampaign) view.getTag();
                if (wondoCampaign3 != null) {
                    this.f46989b.startActivity(WondoFullScreenActivity.m39967y2(context2, wondoCampaign3.f40695c));
                    return;
                }
                DrawerFragment drawerFragment20 = this.f46989b;
                int i18 = WondoInviteActivity.f40691Y;
                Intent intent4 = new Intent(context2, WondoInviteActivity.class);
                intent4.putExtra("auto_share", false);
                drawerFragment20.startActivity(intent4);
                return;
            case R.id.menu_wondo_offers:
                mo50881a("home_menu_item_wondo_offers_clicked");
                WondoCampaign wondoCampaign4 = (WondoCampaign) view.getTag();
                if (wondoCampaign4 != null) {
                    this.f46989b.startActivity(WondoFullScreenActivity.m39967y2(context2, wondoCampaign4.f40695c));
                    return;
                } else {
                    this.f46989b.startActivity(WondoOffersActivity.m39988y2(context2, (String) null));
                    return;
                }
            case R.id.menu_wondo_rewards:
                mo50881a("home_menu_item_wondo_rewards_clicked");
                WondoCampaign wondoCampaign5 = (WondoCampaign) view.getTag();
                if (wondoCampaign5 != null) {
                    this.f46989b.startActivity(WondoFullScreenActivity.m39967y2(context2, wondoCampaign5.f40695c));
                    return;
                }
                DrawerFragment drawerFragment21 = this.f46989b;
                int i19 = WondoRewardsActivity.f40774Z;
                drawerFragment21.startActivity(new Intent(context2, WondoRewardsActivity.class));
                return;
            default:
                return;
        }
    }
}
