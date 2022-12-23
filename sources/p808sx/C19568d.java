package p808sx;

import a60.C13390a;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.view.View;
import com.facebook.appevents.C2341k;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tripplanner.C15578a;
import com.moovit.devices.HuaweiProtectedAppIntroActivity;
import com.moovit.home.lines.search.C16004b;
import com.moovit.home.lines.search.SearchLineFragment;
import com.moovit.home.lines.search.SearchLineItem;
import com.moovit.payment.account.external.mot.MotPaymentAccountActivity;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.ticketing.purchase.PurchaseIntent;
import com.moovit.ticketing.purchase.PurchaseTicketActivity;
import com.moovit.ticketing.purchase.type.PurchaseType;
import com.moovit.ticketing.purchase.type.PurchaseTypeSelectionStep;
import com.moovit.ticketing.purchase.type.PurchaseTypeSelectionStepResult;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitAgency;
import com.moovit.web.WebViewActivity;
import g90.C12693a;
import ja0.C12791b;
import ja0.C12797f;
import java.util.Arrays;
import java.util.Collections;
import k60.C18007e;
import k90.C12820b;
import n10.C18504a;
import n10.C18507d;
import n10.C18508e;
import p001a0.C0016g;
import p019b0.C1436m;
import p495fq.C17056a;
import p543hq.C17474b;
import p552hz.C17520c;
import s60.C19440e;
import t60.C19634d;
import t60.C19636e;
import v40.C25754i;
import x30.C7154a;
import z80.C13338a;

/* renamed from: sx.d */
public final /* synthetic */ class C19568d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f49742b;

    /* renamed from: c */
    public final /* synthetic */ Object f49743c;

    public /* synthetic */ C19568d(Object obj, int i) {
        this.f49742b = i;
        this.f49743c = obj;
    }

    public final void onClick(View view) {
        C16004b.C16006b bVar;
        String str;
        ProfileCertificateData P0;
        switch (this.f49742b) {
            case 0:
                C15578a aVar = (C15578a) this.f49743c;
                int i = C15578a.f40521w;
                aVar.getClass();
                aVar.mo46797j2(new C17474b.C17475a(AnalyticsEventKey.SWITCH_DIRECTIONS_CLICKED).mo49933a());
                for (View clickable : Arrays.asList(new View[]{aVar.f40524p, aVar.f40525q, aVar.f40527s})) {
                    clickable.setClickable(false);
                }
                LocationDescriptor locationDescriptor = aVar.f40528t;
                aVar.f40528t = aVar.f40529u;
                aVar.f40529u = locationDescriptor;
                int height = (aVar.f40524p.getHeight() + (aVar.f40526r.getHeight() + aVar.f40523o.getTop())) - aVar.f40522n.getTop();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar.f40522n, View.TRANSLATION_Y, new float[]{(float) height});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aVar.f40523o, View.TRANSLATION_Y, new float[]{(float) (-height)});
                float rotation = aVar.f40527s.getRotation();
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(aVar.f40527s, View.ROTATION, new float[]{180.0f - rotation});
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
                animatorSet.setDuration(100);
                animatorSet.addListener(new C19569e(aVar));
                animatorSet.start();
                return;
            case 1:
                C17520c cVar = (C17520c) this.f49743c;
                int i2 = C17520c.f45103w;
                cVar.mo49969e2("open_app");
                cVar.dismissAllowingStateLoss();
                return;
            case 2:
                HuaweiProtectedAppIntroActivity huaweiProtectedAppIntroActivity = (HuaweiProtectedAppIntroActivity) this.f49743c;
                int i3 = HuaweiProtectedAppIntroActivity.f41469X;
                huaweiProtectedAppIntroActivity.mo44547w2("huawei_open_settings_clicked");
                try {
                    huaweiProtectedAppIntroActivity.startActivity(C17056a.f44218e);
                } catch (ActivityNotFoundException unused) {
                }
                huaweiProtectedAppIntroActivity.finish();
                return;
            case 3:
                C16004b bVar2 = (C16004b) this.f49743c;
                bVar2.getClass();
                C12797f fVar = (C12797f) view.getTag();
                int adapterPosition = fVar.getAdapterPosition();
                if (adapterPosition != -1 && (bVar = (C16004b.C16006b) bVar2.mo4436j(adapterPosition)) != null && bVar.f41666e != null && bVar.f41668g != null) {
                    Context e = fVar.mo39638e();
                    SearchLineItem searchLineItem = bVar.f41666e;
                    LineServiceAlertDigest lineServiceAlertDigest = bVar.f41668g;
                    boolean z = bVar.f41667f;
                    C18508e f = C18508e.m45375f(e);
                    f.mo51499b();
                    f.f48438c.mo40645c(searchLineItem.f41637b);
                    f.mo51498a();
                    SearchLineFragment searchLineFragment = SearchLineFragment.this;
                    if (searchLineFragment.f40824e) {
                        int i4 = SearchLineFragment.f41623w;
                        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "service_alert_clicked");
                        aVar2.mo49939g(AnalyticsAttributeKey.TRANSIT_TYPE, C0016g.m15E(searchLineFragment.f41628r));
                        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.AGENCY_NAME;
                        TransitAgency transitAgency = searchLineFragment.f41629s;
                        if (transitAgency != null) {
                            str = transitAgency.f23673c;
                        } else {
                            str = "All";
                        }
                        aVar2.mo49939g(analyticsAttributeKey, str);
                        aVar2.mo49941i(AnalyticsAttributeKey.IS_RECENT, z);
                        aVar2.mo49937e(AnalyticsAttributeKey.SELECTED_ID, searchLineItem.f41637b);
                        aVar2.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, C0016g.m15E(searchLineItem.f41639d.get()));
                        aVar2.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, adapterPosition);
                        aVar2.mo49935c(AnalyticsAttributeKey.NUMBER_OF_RESULTS, searchLineFragment.f41624n.getItemCount());
                        aVar2.mo49939g(AnalyticsAttributeKey.SERVICE_ALERT_TYPE, C0016g.m12B(lineServiceAlertDigest.f23186c.f23213b));
                        searchLineFragment.mo46797j2(aVar2.mo49933a());
                        searchLineFragment.mo46786U1(C18504a.class, new C18507d(searchLineFragment, searchLineItem, lineServiceAlertDigest, z));
                        return;
                    }
                    return;
                }
                return;
            case 4:
                int i5 = C7154a.f22224r;
                ((C7154a) this.f49743c).mo23441o2();
                return;
            case 5:
                MotPaymentAccountActivity motPaymentAccountActivity = (MotPaymentAccountActivity) this.f49743c;
                int i6 = MotPaymentAccountActivity.f64002X;
                String string = motPaymentAccountActivity.getString(C25754i.payment_mot_services_terms);
                String string2 = motPaymentAccountActivity.getString(C25754i.payment_mot_services_terms_link);
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "terms_of_use_clicked");
                aVar3.mo49939g(AnalyticsAttributeKey.URI, string2);
                motPaymentAccountActivity.mo44545v2(aVar3.mo49933a());
                motPaymentAccountActivity.startActivity(WebViewActivity.m18168y2(motPaymentAccountActivity, string2, string));
                return;
            case 6:
                int i7 = C13390a.f33229p;
                ((C13390a) this.f49743c).mo40266S1();
                return;
            case 7:
                int i8 = PaymentGatewayFragment.f42661y;
                ((PaymentGatewayFragment) this.f49743c).mo48926n2(true);
                return;
            case 8:
                int i9 = C18007e.f46109A;
                ((C18007e) this.f49743c).mo50511y2();
                return;
            case 9:
                C19440e eVar = (C19440e) this.f49743c;
                int i11 = C19440e.f49452h;
                eVar.getClass();
                C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "ok_clicked");
                eVar.mo22564R1(aVar4.mo49933a());
                eVar.dismissAllowingStateLoss();
                eVar.mo46753L1(C19440e.C19441a.class, new C2341k(9));
                return;
            case 10:
                C19636e eVar2 = (C19636e) this.f49743c;
                if (eVar2.f49823o.validate() && (P0 = eVar2.mo51978P0()) != null) {
                    eVar2.mo46786U1(C19634d.C19635a.class, new C1436m(P0, 11));
                    return;
                }
                return;
            case 11:
                int i12 = C13338a.f33117x;
                ((C13338a) this.f49743c).mo40232n2(false);
                return;
            case 12:
                C12693a aVar5 = (C12693a) this.f49743c;
                int i13 = C12693a.f31345r;
                aVar5.getClass();
                PurchaseType purchaseType = (PurchaseType) view.getTag();
                if (purchaseType != null) {
                    PurchaseTypeSelectionStep purchaseTypeSelectionStep = (PurchaseTypeSelectionStep) aVar5.f32728o;
                    C17474b.C17475a aVar6 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar6.mo49939g(AnalyticsAttributeKey.TYPE, "item_selected");
                    aVar6.mo49939g(AnalyticsAttributeKey.SELECTED_ID, purchaseType.f23460b);
                    aVar6.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, purchaseType.f23462d);
                    aVar6.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, purchaseTypeSelectionStep.f23247c);
                    aVar5.mo46797j2(aVar6.mo49933a());
                    aVar5.mo40058n2(new PurchaseTypeSelectionStepResult(purchaseTypeSelectionStep.f23246b, purchaseType.f23460b));
                    return;
                }
                return;
            case 13:
                C12820b bVar3 = (C12820b) this.f49743c;
                int i14 = C12820b.f31687v;
                bVar3.getClass();
                C17474b.C17475a aVar7 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar7.mo49939g(AnalyticsAttributeKey.TYPE, "purchase_clicked");
                bVar3.mo46797j2(aVar7.mo49933a());
                bVar3.startActivity(PurchaseTicketActivity.m17465z2(view.getContext(), (PurchaseIntent) null));
                return;
            default:
                C12791b bVar4 = (C12791b) this.f49743c;
                bVar4.getClass();
                int adapterPosition2 = ((C12797f) view.getTag()).getAdapterPosition();
                if (bVar4.f31616j != null && adapterPosition2 != -1) {
                    bVar4.f31616j.mo20740f(Collections.unmodifiableList(bVar4.f31613g), bVar4.mo39636j(adapterPosition2), adapterPosition2);
                    return;
                }
                return;
        }
    }
}
