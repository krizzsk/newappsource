package com.moovit.app.ads;

import a70.C13394a;
import a70.C13396b;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.Location;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import c00.C13717b;
import com.facebook.appevents.C2342l;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.tabs.TabLayout;
import com.moovit.MoovitExecutors;
import com.moovit.app.ads.MobileAdsManager;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.C16285j;
import com.moovit.map.MapFragment;
import com.moovit.payment.account.certificate.PaymentAccountCertificatesFragment;
import com.moovit.payment.account.model.PaymentAccount;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import com.moovit.payment.wallet.WalletTab;
import com.moovit.ticketing.wallet.UserWalletActivity;
import com.moovit.ticketing.wallet.UserWalletTab;
import h60.C17356t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import l30.C5577i;
import m80.C12869e;
import n00.C18492b;
import p115i0.C5227c;
import p130j2.C5367a;
import p572iw.C17666h;
import p903ww.C20424c;
import p921xq.C20554a;
import s90.C13087i;
import x60.C20451a;
import x60.C20454b;
import z60.C20810a;

/* renamed from: com.moovit.app.ads.n */
public final /* synthetic */ class C14753n implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f37559b;

    /* renamed from: c */
    public final /* synthetic */ Object f37560c;

    public /* synthetic */ C14753n(Object obj, int i) {
        this.f37559b = i;
        this.f37560c = obj;
    }

    public final void onSuccess(Object obj) {
        int i = 0;
        switch (this.f37559b) {
            case 0:
                Void voidR = (Void) obj;
                MobileAdsFenceReceiver.f37450a.mo49545d((SharedPreferences) this.f37560c, Boolean.TRUE);
                return;
            case 1:
                MobileAdsManager mobileAdsManager = (MobileAdsManager) this.f37560c;
                C20554a aVar = (C20554a) obj;
                EnumSet<AdSource> enumSet = MobileAdsManager.f37451p;
                mobileAdsManager.getClass();
                String str = aVar.f51992d;
                C20554a aVar2 = (C20554a) mobileAdsManager.f37467i.put(str, aVar);
                if (aVar2 != null) {
                    MoovitExecutors.COMPUTATION.execute(new MobileAdsManager.C14730g(mobileAdsManager.f37461c, Collections.singleton(aVar2)));
                }
                MoovitExecutors.COMPUTATION.execute(new MobileAdsManager.C14729f(str));
                return;
            case 2:
                MoovitSubscriptionsManager.m39314a((MoovitSubscriptionsManager) this.f37560c, (MoovitSubscriptionsManager.C15361d) obj);
                return;
            case 3:
                int i2 = C17666h.f45402O;
                ((C17666h) this.f37560c).mo50123M2((PaymentAccount) obj);
                return;
            case 4:
                PaymentAccount paymentAccount = (PaymentAccount) obj;
                int i3 = C20424c.f51743q;
                ((C20424c) this.f37560c).mo52618p2();
                return;
            case 5:
                MapFragment mapFragment = (MapFragment) this.f37560c;
                Location location = (Location) obj;
                C5227c cVar = MapFragment.f42333I0;
                if (location == null) {
                    mapFragment.getClass();
                    return;
                } else if (mapFragment.mo48624U2()) {
                    mapFragment.mo46790c2(location);
                    return;
                } else {
                    C16285j jVar = mapFragment.f42368n;
                    if (jVar != null) {
                        jVar.mo48787d(LatLonE6.m40177j(location), mapFragment.mo48618O2());
                        return;
                    }
                    return;
                }
            case 6:
                Void voidR2 = (Void) obj;
                C5367a.m13473a(((C5577i) this.f37560c).f18277a).mo21147c(new Intent("com.moovit.micromobility.action.updated"));
                return;
            case 7:
                int i4 = PaymentAccountCertificatesFragment.f63937p;
                ((PaymentAccountCertificatesFragment) this.f37560c).mo83434n2((PaymentAccount) obj);
                return;
            case 8:
                C20451a aVar3 = (C20451a) this.f37560c;
                C17356t tVar = (C17356t) obj;
                int i5 = C20451a.f51799w;
                aVar3.getClass();
                String str2 = tVar.f44756m;
                WebInstruction webInstruction = tVar.f44757n;
                if (aVar3.getView() != null) {
                    aVar3.f51803u.setWebViewClient(new C20454b(aVar3, webInstruction));
                    aVar3.f51803u.loadUrl(str2);
                    return;
                }
                return;
            case 9:
                C13394a aVar4 = (C13394a) this.f37560c;
                List list = (List) obj;
                WalletTab walletTab = C13394a.f33242q;
                aVar4.getClass();
                ArrayList arrayList = new ArrayList(2);
                if (!C13717b.m34258e(list)) {
                    arrayList.add(new C20810a(aVar4, list.subList(0, Math.min(list.size(), 3))));
                }
                if (arrayList.isEmpty()) {
                    aVar4.f33244p.setAdapter((RecyclerView.Adapter) null);
                    aVar4.mo46786U1(C13396b.class, new C2342l(14));
                } else if (arrayList.size() == 1) {
                    aVar4.f33244p.mo4627l0((RecyclerView.Adapter) arrayList.get(0));
                    aVar4.mo46786U1(C13396b.class, new C2342l(14));
                } else {
                    aVar4.f33244p.mo4627l0(new ConcatAdapter(ConcatAdapter.Config.f4185b, arrayList));
                    aVar4.mo46786U1(C13396b.class, new C2342l(14));
                }
                aVar4.mo40270o2();
                return;
            default:
                UserWalletActivity userWalletActivity = (UserWalletActivity) this.f37560c;
                List<UserWalletTab> list2 = (List) obj;
                userWalletActivity.f23615Y = list2;
                UserWalletTab userWalletTab = (UserWalletTab) userWalletActivity.getIntent().getParcelableExtra("tab");
                if (userWalletTab != null) {
                    i = Math.max(0, list2.indexOf(userWalletTab));
                }
                userWalletActivity.f23614X.setAdapter(new C18492b((PagerAdapter) new C13087i(userWalletActivity, userWalletActivity.getSupportFragmentManager(), list2), userWalletActivity.f23614X));
                userWalletActivity.f23614X.setCurrentLogicalItem(i);
                userWalletActivity.f23614X.addOnPageChangeListener(userWalletActivity.f23613U);
                ((TabLayout) userWalletActivity.findViewById(C12869e.tabs)).setupWithViewPager(userWalletActivity.f23614X);
                userWalletActivity.mo24280z2(i);
                return;
        }
    }
}
