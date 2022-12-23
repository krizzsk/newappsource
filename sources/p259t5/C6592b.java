package p259t5;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0297i;
import androidx.appcompat.widget.C0475w0;
import androidx.lifecycle.C1043v;
import c00.C13717b;
import com.appboy.p044ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.facebook.appevents.C2342l;
import com.google.android.exoplayer2.p052ui.C4060z;
import com.google.android.exoplayer2.p052ui.StyledPlayerControlView;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ads.C14764y;
import com.moovit.app.carpool.CarpoolIntroActivity;
import com.moovit.app.carpool.history.CarpoolHistoryActivity;
import com.moovit.app.gcm.popup.rate.C14885b;
import com.moovit.app.general.aboutandcontact.AboutAndContactActivity;
import com.moovit.app.general.aboutandcontact.AckActivity;
import com.moovit.app.home.dashboard.C14936e;
import com.moovit.app.home.dashboard.suggestions.itinerary.FrequentItinerarySuggestionFragment;
import com.moovit.app.home.dashboard.suggestions.itinerary.ItinerarySuggestionViewModel;
import com.moovit.app.home.lines.favorites.FavoriteLinesFragment;
import com.moovit.app.intro.UserCreationFailureActivity;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.app.metro.selection.SelectMetroActivity;
import com.moovit.app.mot.activation.MotActivationDetailsActivity;
import com.moovit.app.mot.center.MotActivationCenterActivity;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.p417qr.C15176b;
import com.moovit.app.mot.purchase.C15161a;
import com.moovit.app.mot.purchase.MotQrCodeActivationActivity;
import com.moovit.app.mot.purchase.MotQrCodeScanActivity;
import com.moovit.app.reports.service.C15227h;
import com.moovit.app.reports.service.ReportBarView;
import com.moovit.app.ridesharing.C15241a;
import com.moovit.app.ridesharing.registration.RideSharingProfileActivity;
import com.moovit.app.search.locations.C15284a;
import com.moovit.app.stoparrivals.StopArrivalsActivity;
import com.moovit.app.stoparrivals.TripsSelectionUpdate;
import com.moovit.app.stopdetail.C15340c;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.design.dialog.AlertDialogFragment;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.external.mot.MotPaymentAccountActivity;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import j00.C17691i;
import ja0.C12797f;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Set;
import mf0.C24362h;
import p175n.C5773f;
import p429cw.C16515e;
import p472er.C16865g;
import p499fu.C17074b;
import p501fw.C17113k;
import p543hq.C17474b;
import p583jk.C17884p;
import p664mu.C18451j;
import p664mu.C18462q;
import p687nt.C18604l;
import p688nu.C18633e;
import p778rr.C19318b;
import p782rv.C19356m;
import p923xs.C20577i;
import p977zz.C20927a0;

/* renamed from: t5.b */
public final /* synthetic */ class C6592b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f20411b;

    /* renamed from: c */
    public final /* synthetic */ Object f20412c;

    public /* synthetic */ C6592b(Object obj, int i) {
        this.f20411b = i;
        this.f20412c = obj;
    }

    public final void onClick(View view) {
        int i;
        boolean z;
        boolean z2 = true;
        switch (this.f20411b) {
            case 0:
                ((DefaultInAppMessageViewWrapper) this.f20412c).lambda$createClickListener$1(view);
                return;
            case 1:
                StyledPlayerControlView.C4014f fVar = (StyledPlayerControlView.C4014f) this.f20412c;
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                int adapterPosition = fVar.getAdapterPosition();
                if (adapterPosition == 0) {
                    styledPlayerControlView.mo16523e(styledPlayerControlView.f14289A0);
                    return;
                } else if (adapterPosition == 1) {
                    styledPlayerControlView.mo16523e(styledPlayerControlView.f14301G0);
                    return;
                } else {
                    styledPlayerControlView.f14291B0.dismiss();
                    return;
                }
            case 2:
                C4060z.m10920a((C4060z) this.f20412c, view);
                return;
            case 3:
                String str = MoovitActivity.f37291T;
                ((MoovitActivity) this.f20412c).recreate();
                return;
            case 4:
                C14764y yVar = (C14764y) this.f20412c;
                int i2 = C14764y.f37582n;
                yVar.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "subscriptions_promo_cell_subscribe_clicked");
                yVar.mo46797j2(aVar.mo49933a());
                Intent i3 = C20927a0.m49014i(Uri.parse("moovit://subscriptions").buildUpon().build());
                i3.setPackage(yVar.requireContext().getPackageName());
                C20927a0.m49017l(view.getContext(), i3);
                return;
            case 5:
                CarpoolIntroActivity carpoolIntroActivity = (CarpoolIntroActivity) this.f20412c;
                int i4 = CarpoolIntroActivity.f37626U;
                carpoolIntroActivity.getClass();
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "carpool_ride_clicked");
                carpoolIntroActivity.mo44545v2(aVar2.mo49933a());
                Set<CarpoolLeg.CarpoolProvider> set = C16865g.f43870a;
                SharedPreferences.Editor edit = carpoolIntroActivity.getSharedPreferences("com.moovit.carpool.CarpoolUtils", 0).edit();
                edit.putBoolean("carpoolRideMapItemDialogShown", true);
                edit.apply();
                Intent intent = (Intent) carpoolIntroActivity.getIntent().getParcelableExtra("activity_to_start");
                if (intent != null) {
                    carpoolIntroActivity.startActivity(intent);
                }
                carpoolIntroActivity.finish();
                return;
            case 6:
                CarpoolHistoryActivity carpoolHistoryActivity = (CarpoolHistoryActivity) this.f20412c;
                int i5 = CarpoolHistoryActivity.f37778m0;
                carpoolHistoryActivity.getClass();
                carpoolHistoryActivity.startActivity(new Intent("android.settings.SETTINGS"));
                return;
            case 7:
                C19318b bVar = (C19318b) this.f20412c;
                int i6 = C19318b.f49162j;
                bVar.getClass();
                int id = view.getId();
                bVar.f49164i.setEnabled(true);
                Iterator it = bVar.f49163h.iterator();
                while (it.hasNext()) {
                    CheckBox checkBox = (CheckBox) it.next();
                    if (checkBox.getId() == id) {
                        z = true;
                    } else {
                        z = false;
                    }
                    checkBox.setChecked(z);
                }
                switch (id) {
                    case R.id.option_1 /*2131363658*/:
                        bVar.f49164i.setTag("option_1");
                        return;
                    case R.id.option_2 /*2131363659*/:
                        bVar.f49164i.setTag("option_2");
                        return;
                    case R.id.option_3 /*2131363660*/:
                        bVar.f49164i.setTag("option_3");
                        return;
                    case R.id.option_4 /*2131363661*/:
                        bVar.f49164i.setTag("option_4");
                        return;
                    case R.id.option_5 /*2131363662*/:
                        bVar.f49164i.setTag("option_5");
                        return;
                    case R.id.option_6 /*2131363663*/:
                        bVar.f49164i.setTag("option_6");
                        return;
                    default:
                        return;
                }
            case 8:
                String str2 = C14885b.f38035i;
                ((C14885b) this.f20412c).dismiss();
                return;
            case 9:
                AboutAndContactActivity aboutAndContactActivity = (AboutAndContactActivity) this.f20412c;
                int i7 = AboutAndContactActivity.f38043U;
                aboutAndContactActivity.getClass();
                aboutAndContactActivity.startActivity(new Intent(aboutAndContactActivity, AckActivity.class));
                return;
            case 10:
                C20577i iVar = C20577i.this;
                if (iVar.f40824e) {
                    iVar.f52054p.mo52902c(iVar.f52055q);
                    return;
                }
                return;
            case 11:
                C14936e.m37727p2((C14936e) this.f20412c, view);
                return;
            case 12:
                FrequentItinerarySuggestionFragment frequentItinerarySuggestionFragment = (FrequentItinerarySuggestionFragment) this.f20412c;
                int i8 = FrequentItinerarySuggestionFragment.f38307u;
                C24362h.m61211f(frequentItinerarySuggestionFragment, "this$0");
                ItinerarySuggestionViewModel itinerarySuggestionViewModel = (ItinerarySuggestionViewModel) frequentItinerarySuggestionFragment.f38308s.getValue();
                LocationDescriptor locationDescriptor = (LocationDescriptor) ((C1043v) itinerarySuggestionViewModel.f38325c.getValue()).getValue();
                if (locationDescriptor != null) {
                    ((C1043v) itinerarySuggestionViewModel.f38325c.getValue()).setValue(locationDescriptor);
                }
                frequentItinerarySuggestionFragment.mo45170p2(false);
                frequentItinerarySuggestionFragment.mo45171q2(4);
                frequentItinerarySuggestionFragment.mo45180n2(0);
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "search_clicked");
                aVar3.mo49939g(AnalyticsAttributeKey.PROVIDER, "suggestions_data_type_route");
                frequentItinerarySuggestionFragment.mo46797j2(aVar3.mo49933a());
                return;
            case 13:
                FavoriteLinesFragment.m37878m2(FavoriteLinesFragment.this, FavoriteLinesFragment.ShowMeHowType.FAVORITE_LINE);
                return;
            case 14:
                C18604l lVar = (C18604l) this.f20412c;
                int i9 = C18604l.f47374T;
                lVar.getClass();
                C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "show_me_how_clicked");
                lVar.mo46797j2(aVar4.mo49933a());
                AlertDialogFragment.C15856a aVar5 = new AlertDialogFragment.C15856a(lVar.requireContext());
                Uri V = C17884p.m44351V(lVar.getResources(), R.raw.mov_favorite_station);
                if (V == null) {
                    aVar5.f41328b.remove("video");
                } else {
                    aVar5.f41328b.putParcelable("video", V);
                }
                AlertDialogFragment.C15856a g = aVar5.mo47683l(R.string.favorite_station_empty_state_popup_new_title).mo47678g(R.string.favorite_station_empty_state_popup_new_message);
                g.f41328b.putBoolean("isMessageCentered", false);
                AlertDialogFragment.C15856a j = g.mo47681j(R.string.got_it);
                j.mo47675d(true);
                j.mo47673b().show(lVar.getChildFragmentManager(), (String) null);
                return;
            case 15:
                UserCreationFailureActivity userCreationFailureActivity = (UserCreationFailureActivity) this.f20412c;
                int i11 = UserCreationFailureActivity.f38450X;
                userCreationFailureActivity.getClass();
                int i12 = SelectMetroActivity.f38970p0;
                userCreationFailureActivity.startActivityForResult(new Intent(userCreationFailureActivity, SelectMetroActivity.class), 1042);
                userCreationFailureActivity.mo45251A2();
                return;
            case 16:
                C17074b.C17075a aVar6 = ((C17074b) this.f20412c).f44262e;
                if (aVar6 != null) {
                    ((C15101a) aVar6).mo45446B0();
                    return;
                }
                return;
            case 17:
                C18451j jVar = (C18451j) this.f20412c;
                int i13 = C18451j.f47036q;
                Context requireContext = jVar.requireContext();
                TrackingEvent trackingEvent = TrackingEvent.MOT_ACCOUNT_BLACKLIST_CLICKED;
                SharedPreferences sharedPreferences = requireContext.getSharedPreferences("events_tracker_store", 0);
                sharedPreferences.edit().putInt(trackingEvent.getPrefsKey(), sharedPreferences.getInt(trackingEvent.getPrefsKey(), 0) + 1).apply();
                C17474b.C17475a aVar7 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar7.mo49939g(AnalyticsAttributeKey.TYPE, "blacklist_clicked");
                jVar.mo46797j2(aVar7.mo49933a());
                Context requireContext2 = jVar.requireContext();
                int i14 = MotPaymentAccountActivity.f64002X;
                jVar.startActivity(new Intent(requireContext2, MotPaymentAccountActivity.class));
                return;
            case 18:
                int i15 = C18633e.f47485r;
                MotActivationCenterActivity motActivationCenterActivity = (MotActivationCenterActivity) ((C18633e) this.f20412c).f40822c;
                motActivationCenterActivity.getClass();
                C17474b.C17475a aVar8 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar8.mo49939g(AnalyticsAttributeKey.TYPE, "mot_new_ride_clicked");
                motActivationCenterActivity.mo44545v2(aVar8.mo49933a());
                C18462q.m45321a(motActivationCenterActivity);
                return;
            case 19:
                MotQrCodeActivationActivity motQrCodeActivationActivity = (MotQrCodeActivationActivity) this.f20412c;
                int i16 = MotQrCodeActivationActivity.f39026X;
                motQrCodeActivationActivity.getClass();
                Context context = view.getContext();
                int i17 = MotQrCodeScanActivity.f39030U;
                Intent intent2 = new Intent(context, MotQrCodeScanActivity.class);
                intent2.addFlags(603979776);
                motQrCodeActivationActivity.startActivity(intent2);
                motQrCodeActivationActivity.finish();
                return;
            case 20:
                C15161a aVar9 = (C15161a) this.f20412c;
                int i18 = C15161a.f39052i;
                aVar9.getClass();
                C17474b.C17475a aVar10 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar10.mo49939g(AnalyticsAttributeKey.TYPE, "mot_station_entrance_explanation_close_clicked");
                aVar9.mo22564R1(aVar10.mo49933a());
                aVar9.mo46753L1(C15161a.C15162a.class, new C2342l(10));
                aVar9.dismissAllowingStateLoss();
                return;
            case 21:
                C15176b bVar2 = (C15176b) this.f20412c;
                MotActivation motActivation = (MotActivation) C13717b.m34256c(bVar2.f39094o);
                C17474b.C17475a aVar11 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar11.mo49939g(AnalyticsAttributeKey.TYPE, "mot_activation_details_clicked");
                aVar11.mo49943k(AnalyticsAttributeKey.ID, motActivation.f38985b);
                bVar2.mo46797j2(aVar11.mo49933a());
                A a = bVar2.f40822c;
                int i19 = MotActivationDetailsActivity.f38974X;
                Intent intent3 = new Intent(a, MotActivationDetailsActivity.class);
                intent3.putExtra("activation", motActivation);
                bVar2.startActivity(intent3);
                return;
            case 22:
                ReportBarView reportBarView = (ReportBarView) this.f20412c;
                LinearLayout.LayoutParams layoutParams = ReportBarView.f39221n;
                reportBarView.getClass();
                int intValue = ((Integer) view.getTag()).intValue();
                if (reportBarView.f39228h != intValue) {
                    AnimatorSet animatorSet = reportBarView.f39232l;
                    if (animatorSet != null) {
                        animatorSet.end();
                        reportBarView.f39232l = null;
                    }
                    View childAt = reportBarView.f39231k.getChildAt(reportBarView.f39228h * 2);
                    View childAt2 = reportBarView.f39231k.getChildAt(intValue * 2);
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, View.SCALE_X, new float[]{0.0f});
                    ofFloat.setInterpolator(new AccelerateInterpolator());
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(childAt, View.SCALE_Y, new float[]{0.0f});
                    ofFloat2.setInterpolator(new AccelerateInterpolator());
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(reportBarView.f39230j, C17691i.f45445c, new int[]{reportBarView.f39229i[intValue]});
                    ofInt.setInterpolator(new LinearInterpolator());
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(childAt2, View.SCALE_X, new float[]{1.0f});
                    ofFloat3.setInterpolator(new DecelerateInterpolator());
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(childAt2, View.SCALE_Y, new float[]{1.0f});
                    ofFloat4.setInterpolator(new DecelerateInterpolator());
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    reportBarView.f39232l = animatorSet2;
                    animatorSet2.play(ofFloat).with(ofFloat2).before(ofInt);
                    reportBarView.f39232l.play(ofInt).before(ofFloat3);
                    reportBarView.f39232l.play(ofFloat3).with(ofFloat4);
                    reportBarView.f39232l.setDuration(100);
                    reportBarView.f39232l.addListener(new C15227h(reportBarView));
                    reportBarView.f39228h = intValue;
                    reportBarView.f39232l.start();
                    return;
                }
                return;
            case 23:
                int i21 = C15241a.f39309p;
                ((C15241a) this.f20412c).dismissAllowingStateLoss();
                return;
            case 24:
                int i22 = RideSharingProfileActivity.f39360Y;
                ((RideSharingProfileActivity) this.f20412c).getClass();
                return;
            case 25:
                C19356m mVar = (C19356m) this.f20412c;
                int i23 = C19356m.f49247B;
                mVar.getClass();
                C17474b.C17475a aVar12 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar12.mo49939g(AnalyticsAttributeKey.TYPE, "validate_phone_edit_clicked");
                mVar.mo46797j2(aVar12.mo49933a());
                mVar.mo51744o2();
                return;
            case 26:
                C15284a aVar13 = (C15284a) this.f20412c;
                ServerId serverId = C15284a.f39471U;
                aVar13.getClass();
                Context context2 = view.getContext();
                C0475w0 w0Var = new C0475w0(context2, view, 0);
                new C5773f(context2).inflate(R.menu.base_search_fragment_clear_history, w0Var.f1650b);
                w0Var.f1653e = aVar13.f39434q;
                C0297i iVar2 = w0Var.f1652d;
                if (!iVar2.mo1208b()) {
                    if (iVar2.f984f == null) {
                        z2 = false;
                    } else {
                        iVar2.mo1210d(0, 0, false, false);
                    }
                }
                if (!z2) {
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                return;
            case 27:
                StopArrivalsActivity stopArrivalsActivity = (StopArrivalsActivity) this.f20412c;
                int i24 = StopArrivalsActivity.f39603q0;
                C24362h.m61211f(stopArrivalsActivity, "this$0");
                C17474b.C17475a aVar14 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar14.mo49939g(AnalyticsAttributeKey.TYPE, "zoom_out_in_clicked");
                stopArrivalsActivity.mo44545v2(aVar14.mo49933a());
                TripsSelectionUpdate tripsSelectionUpdate = (TripsSelectionUpdate) stopArrivalsActivity.mo45868y2().f39638j.getValue();
                if (tripsSelectionUpdate != null) {
                    ((C16515e) stopArrivalsActivity.f39606Y.getValue()).mo49302b(tripsSelectionUpdate.f39625d);
                    return;
                }
                return;
            case 28:
                C15340c cVar = (C15340c) this.f20412c;
                cVar.f39716u.mo45911T(cVar.f39705j);
                return;
            default:
                C17113k.C17114a aVar15 = (C17113k.C17114a) this.f20412c;
                aVar15.getClass();
                C12797f fVar2 = (C12797f) view.getTag();
                if (fVar2 != null) {
                    i = fVar2.getBindingAdapterPosition();
                } else {
                    i = -1;
                }
                if (i != -1) {
                    int i25 = aVar15.f44293k;
                    aVar15.f44293k = i;
                    aVar15.notifyItemChanged(i25);
                    aVar15.notifyItemChanged(aVar15.f44293k);
                    C17113k kVar = C17113k.this;
                    BigDecimal bigDecimal = C17113k.f44286p;
                    kVar.mo49696m2();
                    return;
                }
                return;
        }
    }
}
