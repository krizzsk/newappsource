package com.moovit.home.stops.search;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.transit.TransitType;
import o10.C18682a;
import o10.C18684c;
import p001a0.C0016g;
import p543hq.C17474b;
import p824tp.C19740r;
import p824tp.C19742t;

public final class SearchStopActivity extends MoovitActivity implements C18682a {

    /* renamed from: U */
    public static final /* synthetic */ int f41686U = 0;

    /* renamed from: Q */
    public final void mo48169Q(SearchStopItem searchStopItem, TransitType transitType, boolean z) {
        Intent intent = new Intent();
        intent.putExtra("item", searchStopItem);
        intent.putExtra("transitType", transitType);
        intent.putExtra("fromRecent", z);
        setResult(-1, intent);
        finish();
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C19742t.search_stop_activity);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager.mo3923A("search_stops_fragment") == null) {
            C0909a aVar = new C0909a(supportFragmentManager);
            int i = C19740r.search_stops_fragment_container;
            int i2 = C18684c.f47563u;
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("isSearchEnabled", true);
            bundle2.putParcelable("transitType", (TransitType) getIntent().getParcelableExtra("transitType"));
            C18684c cVar = new C18684c();
            cVar.setArguments(bundle2);
            aVar.mo4041e(i, cVar, "search_stops_fragment", 1);
            aVar.mo4045k();
        }
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        C17474b.C17475a m1 = super.mo19762m1();
        m1.mo49939g(AnalyticsAttributeKey.TRANSIT_TYPE, C0016g.m15E((TransitType) getIntent().getParcelableExtra("transitType")));
        return m1;
    }
}
