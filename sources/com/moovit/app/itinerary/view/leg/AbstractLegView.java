package com.moovit.app.itinerary.view.leg;

import a00.C13382a;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c00.C13717b;
import c20.C13744a;
import ce0.C21100e;
import com.amazonaws.services.kinesis.model.InvalidArgumentException;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.itinerary.ItineraryActivity;
import com.moovit.app.itinerary.schedule.ItineraryScheduleActivity;
import com.moovit.app.taxi.TaxiOrder;
import com.moovit.app.taxi.providers.TaxiAppInfo;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.app.taxi.providers.TaxiProvidersManager;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.design.view.ImagesOrTextsView;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.CarLeg;
import com.moovit.itinerary.model.leg.DocklessBicycleLeg;
import com.moovit.itinerary.model.leg.DocklessCarLeg;
import com.moovit.itinerary.model.leg.DocklessMopedLeg;
import com.moovit.itinerary.model.leg.DocklessScooterLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.TaxiLeg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.WaitToTaxiLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.micromobility.MicroMobilityIntegrationFlow;
import com.moovit.micromobility.MicroMobilityIntegrationItem;
import com.moovit.micromobility.MicroMobilityRideActivity;
import com.moovit.micromobility.purchase.MicroMobilityPurchaseActivity;
import com.moovit.micromobility.purchase.intent.MicroMobilityPurchaseItemIntent;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7843b;
import com.moovit.util.time.C7925b;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p001a0.C0016g;
import p073e7.C4585c;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p310x5.C7156a;
import p310x5.C7158c;
import p373au.C13521a;
import p453dw.C16738n;
import p543hq.C17474b;
import p716oy.C18860a;
import p877vu.C20233c;
import p952yy.C20787c;
import p977zz.C20943i;
import p977zz.C20964s0;
import x00.C20440a;

public abstract class AbstractLegView<L extends Leg> extends ConstraintLayout {

    /* renamed from: A */
    public Leg f38689A;

    /* renamed from: B */
    public C16738n f38690B;

    /* renamed from: h */
    public C15075b f38691h;

    /* renamed from: i */
    public TextView f38692i;

    /* renamed from: j */
    public ImageView f38693j;

    /* renamed from: k */
    public ImageView f38694k;

    /* renamed from: l */
    public ViewGroup f38695l;

    /* renamed from: m */
    public TextView f38696m;

    /* renamed from: n */
    public TextView f38697n;

    /* renamed from: o */
    public ImagesOrTextsView f38698o;

    /* renamed from: p */
    public boolean f38699p;

    /* renamed from: q */
    public ViewGroup f38700q;

    /* renamed from: r */
    public TextView f38701r;

    /* renamed from: s */
    public Button f38702s;

    /* renamed from: t */
    public ImageView f38703t;

    /* renamed from: u */
    public View f38704u;

    /* renamed from: v */
    public LinearLayout f38705v;

    /* renamed from: w */
    public FormatTextView f38706w;

    /* renamed from: x */
    public LinearLayout f38707x;

    /* renamed from: y */
    public ImageView f38708y;

    /* renamed from: z */
    public L f38709z;

    public enum FooterViewType {
        NONE,
        FIXED_TEXT,
        FIXED_VIEW,
        EXPANDED_VIEW
    }

    /* renamed from: com.moovit.app.itinerary.view.leg.AbstractLegView$a */
    public static /* synthetic */ class C15074a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38710a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.app.itinerary.view.leg.AbstractLegView$FooterViewType[] r0 = com.moovit.app.itinerary.view.leg.AbstractLegView.FooterViewType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38710a = r0
                com.moovit.app.itinerary.view.leg.AbstractLegView$FooterViewType r1 = com.moovit.app.itinerary.view.leg.AbstractLegView.FooterViewType.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38710a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.itinerary.view.leg.AbstractLegView$FooterViewType r1 = com.moovit.app.itinerary.view.leg.AbstractLegView.FooterViewType.FIXED_TEXT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38710a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.itinerary.view.leg.AbstractLegView$FooterViewType r1 = com.moovit.app.itinerary.view.leg.AbstractLegView.FooterViewType.FIXED_VIEW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f38710a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.app.itinerary.view.leg.AbstractLegView$FooterViewType r1 = com.moovit.app.itinerary.view.leg.AbstractLegView.FooterViewType.EXPANDED_VIEW     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.itinerary.view.leg.AbstractLegView.C15074a.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.itinerary.view.leg.AbstractLegView$b */
    public interface C15075b {
    }

    public AbstractLegView() {
        throw null;
    }

    public AbstractLegView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.itineraryLegStyle);
    }

    private void setStopThumbnail(ServerId serverId) {
        if (serverId != null) {
            this.f38708y.setVisibility(0);
            this.f38690B.mo49422v2(serverId, this.f38708y);
        } else {
            this.f38708y.setVisibility(8);
        }
        UiUtils.m40263v(this.f38695l);
    }

    private void setupAccessibility(CharSequence charSequence) {
        C13382a.m33674j(this, charSequence);
    }

    /* renamed from: A */
    public ServerId mo45368A(L l) {
        return null;
    }

    /* renamed from: B */
    public final void mo45369B(View view, boolean z) {
        int i;
        float f;
        int i2;
        int i3;
        int i4 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        Button button = this.f38702s;
        if (z && !C20964s0.m49090h(button.getText())) {
            i4 = 0;
        }
        button.setVisibility(i4);
        this.f38703t.setVisibility(0);
        ViewPropertyAnimator animate = this.f38703t.animate();
        if (z) {
            f = 180.0f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        animate.rotation(f).start();
        ImageView imageView = this.f38703t;
        Context context = getContext();
        if (z) {
            i2 = R.string.voice_over_close_button;
        } else {
            i2 = R.string.voice_over_info;
        }
        imageView.setContentDescription(context.getString(i2));
        TextView textView = this.f38701r;
        CharSequence[] charSequenceArr = new CharSequence[2];
        charSequenceArr[0] = textView.getText();
        Context context2 = getContext();
        if (z) {
            i3 = R.string.voice_over_collapse;
        } else {
            i3 = R.string.voice_over_expand;
        }
        charSequenceArr[1] = context2.getString(i3);
        C13382a.m33674j(textView, charSequenceArr);
    }

    /* renamed from: C */
    public boolean mo45370C() {
        return this instanceof C15076a;
    }

    /* renamed from: D */
    public final void mo45371D(View view, Leg leg, Leg leg2) {
        String str;
        C15075b bVar = this.f38691h;
        if (bVar != null) {
            ItineraryActivity itineraryActivity = (ItineraryActivity) bVar;
            int type = leg.getType();
            if (type == 3) {
                Itinerary A2 = itineraryActivity.mo45266A2();
                itineraryActivity.startActivity(ItineraryScheduleActivity.m38143y2(itineraryActivity, A2, A2.mo48295u0().indexOf((WaitToTransitLineLeg) leg)));
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "more_details_schedules_clicked");
                aVar.mo49935c(AnalyticsAttributeKey.NUM_OF_ALTERNATIVES, 1);
                itineraryActivity.mo44545v2(aVar.mo49933a());
            } else if (type == 6) {
                Parcelable.Creator<TaxiProvidersManager> creator = TaxiProvidersManager.CREATOR;
                TaxiProvider c = ((TaxiProvidersManager) itineraryActivity.getSystemService("taxi_providers_manager")).mo46163c(((WaitToTaxiLeg) leg).f42122b);
                if (c != null && (leg2 instanceof TaxiLeg)) {
                    TaxiAppInfo taxiAppInfo = c.f39976k;
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.TAXI_CLICKED);
                    aVar2.mo49939g(AnalyticsAttributeKey.PROVIDER, c.f39968c);
                    aVar2.mo49941i(AnalyticsAttributeKey.TAXI_APP_INSTALLED, taxiAppInfo.mo46103c(itineraryActivity));
                    itineraryActivity.mo44545v2(aVar2.mo49933a());
                    TaxiLeg taxiLeg = (TaxiLeg) leg2;
                    TaxiOrder taxiOrder = new TaxiOrder(TaxiOrder.Source.TRIP_PLAN, taxiLeg.f42100e, taxiLeg.f42101f, taxiLeg.f42105j);
                    Itinerary A22 = itineraryActivity.mo45266A2();
                    if (A22 != null) {
                        str = A22.f41894b;
                    } else {
                        str = null;
                    }
                    c.f39976k.mo46102b().mo52438b(itineraryActivity, c, taxiOrder, str);
                }
            } else if (type == 9) {
                MultiTransitLinesLeg multiTransitLinesLeg = (MultiTransitLinesLeg) leg;
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "change_line_clicked");
                aVar3.mo49935c(AnalyticsAttributeKey.NUM_OF_ALTERNATIVES, multiTransitLinesLeg.f42086b.size());
                itineraryActivity.mo44545v2(aVar3.mo49933a());
                int i = C13521a.f33438j;
                Bundle bundle = new Bundle();
                bundle.putParcelable("multiTransitLinesLeg", multiTransitLinesLeg);
                C13521a aVar4 = new C13521a();
                aVar4.setArguments(bundle);
                aVar4.show(itineraryActivity.getSupportFragmentManager(), "choose_primary_transit_leg_dialog_tag");
            } else if (type != 10) {
                switch (type) {
                    case 14:
                        itineraryActivity.mo45267B2(((DocklessCarLeg) leg).f42025i);
                        return;
                    case 15:
                        itineraryActivity.mo45267B2(((DocklessScooterLeg) leg).f42069i);
                        return;
                    case 16:
                        itineraryActivity.mo45267B2(((DocklessMopedLeg) leg).f42047i);
                        return;
                    case 17:
                        itineraryActivity.mo45267B2(((DocklessBicycleLeg) leg).f42003i);
                        return;
                    case 18:
                        C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                        aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "navigate_clicked");
                        itineraryActivity.mo44545v2(aVar5.mo49933a());
                        C20233c.m47802c(itineraryActivity, ((CarLeg) leg).f41961e.mo24310d());
                        return;
                    default:
                        return;
                }
            } else {
                WaitToMultiTransitLinesLeg waitToMultiTransitLinesLeg = (WaitToMultiTransitLinesLeg) leg;
                int id = view.getId();
                if (id == R.id.train_assistance_button) {
                    C17474b.C17475a aVar6 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar6.mo49939g(AnalyticsAttributeKey.TYPE, "train_leg_assistance_button_clicked");
                    itineraryActivity.mo44545v2(aVar6.mo49933a());
                    itineraryActivity.startActivity(WebViewActivity.m18168y2(itineraryActivity, (String) view.getTag(R.id.view_tag_param1), itineraryActivity.getString(R.string.itinerary_train_assistance_chatbot_title)));
                } else if (id == R.id.wait_leg_action) {
                    Itinerary A23 = itineraryActivity.mo45266A2();
                    int indexOf = A23.mo48295u0().indexOf(waitToMultiTransitLinesLeg);
                    C17474b.C17475a aVar7 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar7.mo49939g(AnalyticsAttributeKey.TYPE, "more_details_schedules_clicked");
                    aVar7.mo49935c(AnalyticsAttributeKey.NUM_OF_ALTERNATIVES, waitToMultiTransitLinesLeg.f42117b.size());
                    itineraryActivity.mo44545v2(aVar7.mo49933a());
                    itineraryActivity.startActivity(ItineraryScheduleActivity.m38143y2(itineraryActivity, A23, indexOf));
                }
            }
        }
    }

    /* renamed from: E */
    public final void mo45372E(Leg leg, boolean z) {
        C15075b bVar = this.f38691h;
        if (bVar != null) {
            ItineraryActivity itineraryActivity = (ItineraryActivity) bVar;
            if (z) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.DROP_DOWN);
                aVar.mo49939g(AnalyticsAttributeKey.ITINERARY_STEP_TYPE, C0016g.m20c(leg.getType()));
                aVar.mo49939g(AnalyticsAttributeKey.ITINERARY_STEP_INDEX, String.valueOf(itineraryActivity.f38478Y.get(itineraryActivity.f38479Z).mo48295u0().indexOf(leg) + 1));
                itineraryActivity.mo44545v2(aVar.mo49933a());
            }
        }
    }

    /* renamed from: F */
    public final void mo45373F(MicroMobilityIntegrationItem microMobilityIntegrationItem, MicroMobilityIntegrationFlow microMobilityIntegrationFlow) {
        C15075b bVar = this.f38691h;
        if (bVar != null) {
            ItineraryActivity itineraryActivity = (ItineraryActivity) bVar;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "micro_mobility_integration_button_clicked");
            aVar.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, C25541a.m63892w(microMobilityIntegrationFlow));
            aVar.mo49939g(AnalyticsAttributeKey.PROVIDER, microMobilityIntegrationItem.f14812b);
            aVar.mo49939g(AnalyticsAttributeKey.ITEM_ID, microMobilityIntegrationItem.f14813c);
            itineraryActivity.mo44545v2(aVar.mo49933a());
            int i = ItineraryActivity.C15026b.f38496a[microMobilityIntegrationFlow.ordinal()];
            if (i == 1) {
                AppDeepLink appDeepLink = microMobilityIntegrationItem.f14815e;
                if (appDeepLink != null) {
                    appDeepLink.mo46946c(itineraryActivity);
                }
            } else if (i == 2 || i == 3) {
                MicroMobilityPurchaseItemIntent microMobilityPurchaseItemIntent = new MicroMobilityPurchaseItemIntent(microMobilityIntegrationItem.f14812b, microMobilityIntegrationItem.f14813c, microMobilityIntegrationFlow);
                int i2 = MicroMobilityPurchaseActivity.f14911Y;
                Intent intent = new Intent(itineraryActivity, MicroMobilityPurchaseActivity.class);
                intent.putExtra("purchaseIntent", microMobilityPurchaseItemIntent);
                itineraryActivity.startActivity(intent);
            }
        }
    }

    /* renamed from: G */
    public final void mo45374G(ServerId serverId) {
        C15075b bVar = this.f38691h;
        if (bVar != null) {
            ItineraryActivity itineraryActivity = (ItineraryActivity) bVar;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "view_ride_clicked");
            aVar.mo49937e(AnalyticsAttributeKey.ID, serverId);
            itineraryActivity.mo44545v2(aVar.mo49933a());
            itineraryActivity.startActivity(MicroMobilityRideActivity.m11106y2(itineraryActivity, serverId));
        }
    }

    /* renamed from: H */
    public void mo45375H(L l) {
    }

    /* renamed from: I */
    public final void mo45376I(L l, Leg leg, C15075b bVar, C16738n nVar) {
        int i;
        int i2;
        C21100e.m49373x(l, "leg");
        this.f38709z = l;
        this.f38689A = leg;
        this.f38691h = bVar;
        this.f38690B = nVar;
        mo45375H(l);
        setLegTitle(mo45398z(l));
        setLegSubtitle(mo45397y(l));
        setLegIcon(mo45396x(l));
        Image w = mo45395w(l);
        if (w == null && leg == null) {
            w = new ResourceImage(R.drawable.ic_location_24_secondary, new String[0]);
        }
        C13744a.m34300b(this.f38694k, w);
        setInstructionText(mo45394v(l));
        this.f38705v.removeAllViews();
        List<View> r = mo45384r(l, leg);
        for (View addView : r) {
            this.f38705v.addView(addView);
        }
        LinearLayout linearLayout = this.f38705v;
        if (r.isEmpty()) {
            i = 8;
        } else {
            i = 0;
        }
        linearLayout.setVisibility(i);
        if (!mo45370C() || !C18860a.m45884a().f48030r) {
            this.f38706w.setVisibility(8);
        } else {
            FormatTextView formatTextView = this.f38706w;
            Context context = formatTextView.getContext();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C7925b.m18024l(context, l.mo48331K1().mo24631g()));
            spannableStringBuilder.setSpan(C20964s0.m49084b(context, R.attr.textAppearanceCaptionStrong, R.attr.colorOnSurfaceEmphasisHigh), 0, spannableStringBuilder.length(), 33);
            formatTextView.setSpannedArguments(spannableStringBuilder);
            this.f38706w.setVisibility(0);
        }
        this.f38707x.removeAllViews();
        this.f38707x.setShowDividers(getBottomExtraViewsDividerSpec());
        List<View> q = mo45383q(this.f38707x, l, leg);
        for (View addView2 : q) {
            this.f38707x.addView(addView2);
        }
        LinearLayout linearLayout2 = this.f38707x;
        if (q.isEmpty()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        linearLayout2.setVisibility(i2);
        int i3 = C15074a.f38710a[mo45393u(l).ordinal()];
        if (i3 == 1) {
            this.f38700q.setVisibility(8);
        } else if (i3 == 2) {
            String s = mo45385s(l);
            UiUtils.m40234B(this.f38701r, s);
            this.f38701r.setContentDescription(s);
            this.f38703t.setVisibility(8);
            this.f38701r.setOnClickListener((View.OnClickListener) null);
        } else if (i3 == 3) {
            View t = mo45392t(l);
            this.f38704u = t;
            if (t != null) {
                this.f38700q.setVisibility(8);
                View findViewWithTag = findViewWithTag("footer_view_fixed_tag");
                if (findViewWithTag != null) {
                    this.f38705v.removeView(findViewWithTag);
                }
                t.setTag("footer_view_fixed_tag");
                t.setOnClickListener(new C4585c(this, 15));
                this.f38705v.addView(t);
                this.f38705v.setVisibility(0);
            } else {
                StringBuilder k = C13555b.m33972k("FooterViewType set to: ");
                k.append(mo45393u(l));
                k.append(" but view was not supplied");
                throw new InvalidArgumentException(k.toString());
            }
        } else if (i3 == 4) {
            View t2 = mo45392t(l);
            this.f38704u = t2;
            if (t2 != null) {
                this.f38700q.setOnClickListener(new C7158c(2, this, l));
                View view = this.f38704u;
                C13382a.C13383a aVar = C13382a.f33219a;
                if (view != null) {
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    C6333d0.C6337d.m15059s(view, 1);
                }
                View view2 = this.f38704u;
                view2.setVisibility(8);
                this.f38701r.setText(mo45385s(this.f38709z));
                view2.setTag("footer_view_expanded_tag");
                UiUtils.m40234B(this.f38702s, (CharSequence) null);
                this.f38702s.setOnClickListener(new C4052r(this, 11));
                View findViewWithTag2 = this.f38700q.findViewWithTag("footer_view_expanded_tag");
                if (findViewWithTag2 != null) {
                    this.f38700q.removeViewAt(this.f38700q.indexOfChild(findViewWithTag2));
                }
                mo45369B(view2, this.f38699p);
                this.f38700q.addView(view2);
                if (this.f38699p) {
                    mo45369B(this.f38704u, true);
                    mo45372E(l, true);
                }
            } else {
                StringBuilder k2 = C13555b.m33972k("FooterViewType set to: ");
                k2.append(mo45393u(l));
                k2.append(" but view was not supplied");
                throw new InvalidArgumentException(k2.toString());
            }
        } else {
            StringBuilder k3 = C13555b.m33972k("unknown type: ");
            k3.append(mo45393u(l));
            throw new InvalidArgumentException(k3.toString());
        }
        mo45377J();
        if (C13382a.m33671g(getContext())) {
            setOnClickListener(new C7156a(2, this, l));
        } else {
            setOnClickListener((View.OnClickListener) null);
            setClickable(false);
            setFocusable(true);
        }
        setStopThumbnail(mo45368A(l));
    }

    /* renamed from: J */
    public final void mo45377J() {
        setupAccessibility(mo45382l());
    }

    public int getBottomExtraViewsDividerSpec() {
        return 1;
    }

    public L getLeg() {
        return this.f38709z;
    }

    public View getLineConnectAnchor() {
        return this.f38693j;
    }

    public Paint getLineConnectPaint() {
        return null;
    }

    /* renamed from: l */
    public String mo45382l() {
        int childCount = this.f38705v.getChildCount();
        CharSequence charSequence = null;
        String str = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f38705v.getChildAt(i);
            if (childAt.getVisibility() == 0) {
                str = C13382a.m33667c(str, childAt.getContentDescription());
            }
        }
        CharSequence[] charSequenceArr = new CharSequence[6];
        charSequenceArr[0] = this.f38692i.getContentDescription();
        charSequenceArr[1] = this.f38697n.getContentDescription();
        charSequenceArr[2] = this.f38698o.getContentDescription();
        charSequenceArr[3] = str;
        charSequenceArr[4] = this.f38701r.getText();
        if (this.f38696m.getVisibility() == 0) {
            charSequence = this.f38696m.getContentDescription();
        }
        charSequenceArr[5] = charSequence;
        return C13382a.m33667c(charSequenceArr);
    }

    /* renamed from: q */
    public List mo45383q(LinearLayout linearLayout, Leg leg, Leg leg2) {
        return Collections.emptyList();
    }

    /* renamed from: r */
    public List mo45384r(Leg leg, Leg leg2) {
        return Collections.emptyList();
    }

    /* renamed from: s */
    public String mo45385s(L l) {
        return null;
    }

    public void setFare(String str) {
        if (str != null) {
            this.f38696m.setText(str);
            this.f38696m.setVisibility(0);
            mo45377J();
        } else {
            this.f38696m.setVisibility(4);
        }
        UiUtils.m40263v(this.f38695l);
    }

    public void setInstructionText(CharSequence charSequence) {
        this.f38692i.setText(charSequence);
        this.f38692i.setContentDescription(charSequence);
    }

    public void setLegIcon(Image image) {
        C13744a.m34301c(this.f38693j, image, 4);
    }

    public void setLegSubtitle(List<C20440a> list) {
        CharSequence charSequence;
        if (C13717b.m34258e(list)) {
            this.f38698o.setVisibility(8);
            return;
        }
        int i = 0;
        this.f38698o.setVisibility(0);
        this.f38698o.setItems(list);
        ImagesOrTextsView imagesOrTextsView = this.f38698o;
        if (C7843b.m17879f(mo45397y(this.f38709z))) {
            charSequence = C13382a.m33667c(imagesOrTextsView.getText(), imagesOrTextsView.getResources().getString(R.string.accessibility_station));
        } else {
            charSequence = imagesOrTextsView.getText();
        }
        imagesOrTextsView.setContentDescription(charSequence);
        if (C7843b.m17879f(list)) {
            i = 4;
        }
        UiUtils.m40266y(this.f38698o, UiUtils.Edge.BOTTOM, (int) UiUtils.m40246e(getContext(), (float) i));
    }

    public void setLegTitle(CharSequence charSequence) {
        if (charSequence == null) {
            this.f38697n.setVisibility(8);
            return;
        }
        this.f38697n.setVisibility(0);
        this.f38697n.setText(charSequence);
        TextView textView = this.f38697n;
        textView.setContentDescription(textView.getText());
    }

    public void setRealTime(Map<ServerId, C20787c> map) {
    }

    /* renamed from: t */
    public View mo45392t(L l) {
        throw new UnsupportedOperationException("Subclass must override getFooterView(Leg)");
    }

    /* renamed from: u */
    public abstract FooterViewType mo45393u(L l);

    /* renamed from: v */
    public abstract CharSequence mo45394v(L l);

    /* renamed from: w */
    public abstract Image mo45395w(L l);

    /* renamed from: x */
    public abstract ResourceImage mo45396x(Leg leg);

    /* renamed from: y */
    public abstract List<C20440a> mo45397y(L l);

    /* renamed from: z */
    public abstract CharSequence mo45398z(L l);

    public AbstractLegView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View.inflate(context, R.layout.leg_view, this);
        this.f38697n = (TextView) findViewById(R.id.title);
        this.f38698o = (ImagesOrTextsView) findViewById(R.id.subtitle);
        this.f38700q = (ViewGroup) findViewById(R.id.expanded_container);
        if (C20943i.m49051d(15)) {
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setStartDelay(1, 0);
            this.f38700q.setLayoutTransition(layoutTransition);
        }
        this.f38701r = (TextView) findViewById(R.id.expanded_text);
        this.f38702s = (Button) findViewById(R.id.expanded_action);
        this.f38703t = (ImageView) findViewById(R.id.expanded_icon);
        this.f38692i = (TextView) findViewById(R.id.header);
        this.f38693j = (ImageView) findViewById(R.id.icon);
        this.f38694k = (ImageView) findViewById(R.id.content_icon);
        this.f38695l = (ViewGroup) findViewById(R.id.fare_and_thumbnail_layout);
        this.f38696m = (TextView) findViewById(R.id.fare);
        this.f38705v = (LinearLayout) findViewById(R.id.extra_views);
        this.f38708y = (ImageView) findViewById(R.id.thumbnail);
        this.f38706w = (FormatTextView) findViewById(R.id.arrival_time);
        this.f38707x = (LinearLayout) findViewById(R.id.bottom_extra_views);
        if (C20943i.m49051d(15)) {
            LayoutTransition layoutTransition2 = new LayoutTransition();
            if (C20943i.m49051d(16)) {
                layoutTransition2.enableTransitionType(4);
            }
            this.f38707x.setLayoutTransition(layoutTransition2);
        }
    }
}
