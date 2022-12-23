package com.moovit.app.ads;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnFailureListener;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.location.C16202a;
import com.tranzmate.R;
import java.util.EnumSet;
import p130j2.C5367a;
import p543hq.C17474b;
import p858uz.C20061g;

/* renamed from: com.moovit.app.ads.k */
public class C14744k extends C15682c<MoovitAppActivity> {

    /* renamed from: p */
    public static final AdSource f37529p = AdSource.DASHBOARD_SECTION_BANNER;

    /* renamed from: n */
    public final C14745a f37530n = new C14745a();

    /* renamed from: o */
    public int f37531o;

    /* renamed from: com.moovit.app.ads.k$a */
    public class C14745a extends BroadcastReceiver {
        public C14745a() {
        }

        public final void onReceive(Context context, Intent intent) {
            View view = C14744k.this.getView();
            if (view != null) {
                C14744k.m37125m2(C14744k.this, view);
            }
        }
    }

    /* renamed from: com.moovit.app.ads.k$b */
    public class C14746b implements View.OnLayoutChangeListener {
        public C14746b() {
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C14744k.m37125m2(C14744k.this, view);
            view.removeOnLayoutChangeListener(this);
        }
    }

    /* renamed from: com.moovit.app.ads.k$c */
    public class C14747c extends C14749m {

        /* renamed from: i */
        public final /* synthetic */ ViewGroup f37534i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14747c(MoovitApplication moovitApplication, MoovitActivity moovitActivity, boolean z, String str, AdView adView, ViewGroup viewGroup) {
            super(moovitApplication, moovitActivity, z, str, adView);
            this.f37534i = viewGroup;
        }

        public final void onAdLoaded() {
            super.onAdLoaded();
            C14744k kVar = C14744k.this;
            ViewGroup viewGroup = this.f37534i;
            AdSource adSource = C14744k.f37529p;
            kVar.getClass();
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "ads_section_shown");
            kVar.mo46797j2(aVar.mo49933a());
            int i = kVar.f37531o;
            viewGroup.setPadding(i, i, i, i);
        }
    }

    public C14744k() {
        super(MoovitAppActivity.class);
    }

    /* renamed from: m2 */
    public static void m37125m2(C14744k kVar, View view) {
        FragmentActivity activity = kVar.getActivity();
        if (activity != null) {
            Application application = activity.getApplication();
            if (application instanceof MoovitApplication) {
                MobileAdsManager.m37073h().mo44706c(f37529p).addOnSuccessListener((Activity) activity, new C14742i(0, kVar, application, view)).addOnFailureListener((Activity) activity, (OnFailureListener) new C14743j(kVar, application, view));
            }
        }
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(requireActivity()).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [android.content.Context, com.moovit.MoovitApplication<?, ?, ?>, com.moovit.MoovitApplication] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: n2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44748n2(com.moovit.MoovitApplication<?, ?, ?> r17, android.view.ViewGroup r18, java.lang.String r19) {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r18
            A r0 = r8.f40822c
            com.moovit.app.MoovitAppActivity r0 = (com.moovit.app.MoovitAppActivity) r0
            r11 = 0
            if (r0 != 0) goto L_0x0014
            r18.removeAllViews()
            r10.setPadding(r11, r11, r11, r11)
            return
        L_0x0014:
            long r0 = p977zz.C20930c.m49023e(r17)
            com.moovit.app.ads.AdSource r12 = f37529p
            boolean r0 = com.moovit.app.ads.C14748l.m37130c(r12, r0)
            if (r0 != 0) goto L_0x0027
            r18.removeAllViews()
            r10.setPadding(r11, r11, r11, r11)
            return
        L_0x0027:
            boolean r0 = p977zz.C20964s0.m49090h(r19)
            if (r0 == 0) goto L_0x0034
            r18.removeAllViews()
            r10.setPadding(r11, r11, r11, r11)
            return
        L_0x0034:
            com.moovit.app.ads.h r0 = new com.moovit.app.ads.h
            r0.<init>()
            android.location.Location r1 = r16.mo46780O1()
            r13 = 1
            r0.mo44745a(r13, r1)
            com.moovit.app.ads.MobileAdsManager r1 = com.moovit.app.ads.MobileAdsManager.m37073h()
            com.google.android.gms.ads.admanager.AdManagerAdRequest r14 = r1.mo44705a(r0)
            if (r14 != 0) goto L_0x0052
            r18.removeAllViews()
            r10.setPadding(r11, r11, r11, r11)
            return
        L_0x0052:
            com.google.android.gms.ads.AdView r15 = new com.google.android.gms.ads.AdView
            android.content.Context r0 = r18.getContext()
            r15.<init>(r0)
            r0 = 393216(0x60000, float:5.51013E-40)
            r15.setDescendantFocusability(r0)
            r0 = r19
            r15.setAdUnitId(r0)
            com.google.android.gms.ads.AdSize r0 = com.google.android.gms.ads.AdSize.MEDIUM_RECTANGLE
            r15.setAdSize(r0)
            com.moovit.app.ads.k$c r7 = new com.moovit.app.ads.k$c
            A r3 = r8.f40822c
            boolean r4 = r14.isTestDevice(r9)
            java.lang.String r5 = r12.adUnitIdKey
            r0 = r7
            r1 = r16
            r2 = r17
            r6 = r15
            r11 = r7
            r7 = r18
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r15.setAdListener(r11)
            r15.loadAd(r14)
            r18.removeAllViews()
            r10.addView(r15)
            com.moovit.app.ads.MobileAdsManager r0 = com.moovit.app.ads.MobileAdsManager.m37073h()
            java.lang.String r1 = r0.mo44709j()
            zz.i0 r0 = r0.mo44707d()
            tp.i r2 = r17.mo44558j()
            u2.a r2 = r2.f50173c
            com.moovit.analytics.AnalyticsFlowKey r3 = com.moovit.analytics.AnalyticsFlowKey.ADS
            hq.b[] r4 = new p543hq.C17474b[r13]
            hq.b$a r5 = new hq.b$a
            com.moovit.analytics.AnalyticsEventKey r6 = com.moovit.analytics.AnalyticsEventKey.AD
            r5.<init>(r6)
            com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.TYPE
            java.lang.String r7 = "ad_banner_initialization"
            r5.mo49939g(r6, r7)
            com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.AD_ID
            java.lang.String r7 = r15.getAdUnitId()
            r5.mo49939g(r6, r7)
            com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.AD_ID_KEY
            java.lang.String r7 = r12.adUnitIdKey
            r5.mo49939g(r6, r7)
            com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.ANALYTICS_FLOW_KEY_ID
            A r7 = r8.f40822c
            com.tranzmate.moovit.protocol.kinesis.MVAnalyticsFlowKey r7 = p172m9.C5720b.m14057h(r7)
            r5.mo49944l(r6, r7)
            com.moovit.analytics.AnalyticsAttributeKey r6 = com.moovit.analytics.AnalyticsAttributeKey.SESSION_ID
            r5.mo49945m(r6, r1)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.AB_TESTING_VARIABLE_NAME
            F r6 = r0.f52692a
            java.lang.String r6 = (java.lang.String) r6
            r5.mo49945m(r1, r6)
            com.moovit.analytics.AnalyticsAttributeKey r1 = com.moovit.analytics.AnalyticsAttributeKey.AB_TESTING_VARIABLE_VALUE
            S r0 = r0.f52693b
            java.lang.String r0 = (java.lang.String) r0
            r5.mo49945m(r1, r0)
            hq.b r0 = r5.mo49933a()
            r1 = 0
            r4[r1] = r0
            r2.getClass()
            p269u2.C6677a.m15759j(r9, r3, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.ads.C14744k.mo44748n2(com.moovit.MoovitApplication, android.view.ViewGroup, java.lang.String):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f37531o = getResources().getDimensionPixelOffset(R.dimen.screen_edge);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.ads_section_fragment, viewGroup, false);
    }

    public final void onDestroyView() {
        super.onDestroyView();
        Context requireContext = requireContext();
        C14745a aVar = this.f37530n;
        EnumSet<AdSource> enumSet = MobileAdsManager.f37451p;
        C5367a.m13473a(requireContext).mo21148d(aVar);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        MobileAdsManager.m37075o(view.getContext(), this.f37530n);
        view.addOnLayoutChangeListener(new C14746b());
    }
}
