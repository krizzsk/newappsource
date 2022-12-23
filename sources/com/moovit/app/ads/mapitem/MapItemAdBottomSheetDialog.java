package com.moovit.app.ads.mapitem;

import android.content.Context;
import android.content.DialogInterface;
import android.location.Location;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.lifecycle.C1021l0;
import androidx.lifecycle.C1043v;
import bf0.C21049c;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.moovit.MoovitActivity;
import com.moovit.ads.AdListener;
import com.moovit.ads.AdSize;
import com.moovit.ads.AdTargeting;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.C16255c;
import com.moovit.map.collections.category.types.DirectAdMetadata;
import kotlin.C23812a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mf0.C24362h;
import mf0.C24365j;
import p130j2.C5367a;
import p269u2.C6677a;
import p393bq.C13652a;
import p543hq.C17474b;
import p584jl.C17885a;
import p609km.C18097c;
import p824tp.C19731i;
import p873vq.C20197b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo59060d2 = {"Lcom/moovit/app/ads/mapitem/MapItemAdBottomSheetDialog;", "Lcom/moovit/map/c;", "Lcom/moovit/MoovitActivity;", "<init>", "()V", "a", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class MapItemAdBottomSheetDialog extends C16255c<MoovitActivity> {

    /* renamed from: p */
    public static final /* synthetic */ int f37544p = 0;

    /* renamed from: k */
    public final C1021l0 f37545k;

    /* renamed from: l */
    public final C21049c f37546l = C23812a.m58432b(MapItemAdBottomSheetDialog$placementId$2.f37553f);

    /* renamed from: m */
    public final C21049c f37547m = C23812a.m58432b(new MapItemAdBottomSheetDialog$metadata$2(this));

    /* renamed from: n */
    public final C21049c f37548n = C23812a.m58432b(new MapItemAdBottomSheetDialog$itemLocation$2(this));

    /* renamed from: o */
    public C14750a f37549o;

    /* renamed from: com.moovit.app.ads.mapitem.MapItemAdBottomSheetDialog$a */
    public static final class C14750a extends AdListener {

        /* renamed from: c */
        public final DirectAdMetadata f37550c;

        /* renamed from: d */
        public final Context f37551d;

        /* renamed from: e */
        public final C6677a f37552e;

        public C14750a(Context context, DirectAdMetadata directAdMetadata) {
            C24362h.m61211f(directAdMetadata, "metadata");
            this.f37550c = directAdMetadata;
            Context applicationContext = context.getApplicationContext();
            this.f37551d = applicationContext;
            C6677a aVar = C19731i.m47197a(applicationContext).f50173c;
            C24362h.m61210e(aVar, "from(appContext).analyticsRecorder");
            this.f37552e = aVar;
        }

        /* renamed from: a */
        public final void mo19369a(String str) {
            C6677a aVar = this.f37552e;
            Context context = this.f37551d;
            AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ad_clicked");
            aVar2.mo49939g(AnalyticsAttributeKey.PROVIDER, this.f37550c.f42490c);
            aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, this.f37550c.f42489b);
            C17474b[] bVarArr = {aVar2.mo49933a()};
            aVar.getClass();
            C6677a.m15759j(context, analyticsFlowKey, true, bVarArr);
        }

        /* renamed from: c */
        public final void mo19370c(String str) {
            C6677a aVar = this.f37552e;
            Context context = this.f37551d;
            AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ad_dismissed");
            aVar2.mo49939g(AnalyticsAttributeKey.PROVIDER, this.f37550c.f42490c);
            aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, this.f37550c.f42489b);
            aVar2.mo49939g(AnalyticsAttributeKey.REASON, "close_clicked");
            C17474b[] bVarArr = {aVar2.mo49933a()};
            aVar.getClass();
            C6677a.m15759j(context, analyticsFlowKey, true, bVarArr);
        }

        /* renamed from: d */
        public final void mo19371d(String str) {
            C6677a aVar = this.f37552e;
            Context context = this.f37551d;
            AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ad_impression");
            aVar2.mo49939g(AnalyticsAttributeKey.PROVIDER, this.f37550c.f42490c);
            aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, this.f37550c.f42489b);
            C17474b[] bVarArr = {aVar2.mo49933a()};
            aVar.getClass();
            C6677a.m15759j(context, analyticsFlowKey, true, bVarArr);
        }

        /* renamed from: g */
        public final void mo19372g(String str) {
        }
    }

    public MapItemAdBottomSheetDialog() {
        C21049c a = C23812a.m58431a(LazyThreadSafetyMode.NONE, new MapItemAdBottomSheetDialog$special$$inlined$viewModels$default$2(new MapItemAdBottomSheetDialog$special$$inlined$viewModels$default$1(this)));
        this.f37545k = C18097c.m44768b(this, C24365j.m61219a(MapItemAdViewModel.class), new MapItemAdBottomSheetDialog$special$$inlined$viewModels$default$3(a), new MapItemAdBottomSheetDialog$special$$inlined$viewModels$default$4(a), new MapItemAdBottomSheetDialog$special$$inlined$viewModels$default$5(this, a));
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C24362h.m61211f(bVar, "event");
        Context requireContext = requireContext();
        C24362h.m61210e(requireContext, "requireContext()");
        C19731i.m47197a(requireContext).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    /* renamed from: S1 */
    public final DirectAdMetadata mo44754S1() {
        return (DirectAdMetadata) this.f37547m.getValue();
    }

    public final void onDestroyView() {
        super.onDestroyView();
        C14750a aVar = this.f37549o;
        if (aVar != null) {
            Context requireContext = requireContext();
            C24362h.m61210e(requireContext, "requireContext()");
            C5367a.m13473a(requireContext).mo21148d(aVar);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C24362h.m61211f(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        Context requireContext = requireContext();
        C24362h.m61210e(requireContext, "requireContext()");
        C6677a aVar = C19731i.m47197a(requireContext).f50173c;
        AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.ADS;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.AD);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "ad_dismissed");
        aVar2.mo49939g(AnalyticsAttributeKey.PROVIDER, mo44754S1().f42490c);
        aVar2.mo49939g(AnalyticsAttributeKey.AD_ID, mo44754S1().f42489b);
        aVar2.mo49939g(AnalyticsAttributeKey.REASON, "close_screen");
        C17474b[] bVarArr = {aVar2.mo49933a()};
        aVar.getClass();
        C6677a.m15759j(requireContext, analyticsFlowKey, true, bVarArr);
    }

    public final void onPause() {
        super.onPause();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_direct_ad");
        aVar.mo49939g(AnalyticsAttributeKey.PROVIDER, mo44754S1().f42490c);
        aVar.mo49939g(AnalyticsAttributeKey.AD_ID, mo44754S1().f42489b);
        mo22564R1(aVar.mo49933a());
        C19731i.m47197a(requireContext()).f50173c.mo22847b(requireContext(), AnalyticsFlowKey.POPUP, true);
    }

    public final void onResume() {
        super.onResume();
        C19731i.m47197a(requireContext()).f50173c.mo22849g(requireContext(), AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_direct_ad");
        aVar.mo49939g(AnalyticsAttributeKey.PROVIDER, mo44754S1().f42490c);
        aVar.mo49939g(AnalyticsAttributeKey.AD_ID, mo44754S1().f42489b);
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        MapItemAdViewModel mapItemAdViewModel = (MapItemAdViewModel) this.f37545k.getValue();
        String str = mo44754S1().f42489b;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int q0 = C17885a.m44457q0(((double) displayMetrics.heightPixels) * 0.55d);
        float f = getResources().getDisplayMetrics().density;
        AdSize adSize = new AdSize(C17885a.m44459r0(((float) i) / f), C17885a.m44459r0(((float) q0) / f));
        String str2 = (String) this.f37546l.getValue();
        C24362h.m61211f(str2, "placementId");
        C24362h.m61211f(str, "adId");
        Location u = ((LatLonE6) this.f37548n.getValue()).mo46929u((Location) null);
        LatLonE6 latLonE6 = (LatLonE6) this.f37548n.getValue();
        C24362h.m61211f(latLonE6, "targetLocation");
        C13652a aVar = new C13652a(str2, str, new AdTargeting(u, latLonE6), adSize);
        mapItemAdViewModel.getClass();
        ((C1043v) mapItemAdViewModel.f37554c.getValue()).setValue(aVar);
        ((MapItemAdViewModel) this.f37545k.getValue()).f37556e.observe(getViewLifecycleOwner(), new C20197b(new MapItemAdBottomSheetDialog$onViewCreated$1(this, view), 0));
        Context context = view.getContext();
        C24362h.m61210e(context, "view.context");
        C14750a aVar2 = new C14750a(context, mo44754S1());
        Context context2 = view.getContext();
        C24362h.m61210e(context2, "view.context");
        AdListener.m37005h(aVar2, context2, (String) this.f37546l.getValue(), 4);
        this.f37549o = aVar2;
    }
}
