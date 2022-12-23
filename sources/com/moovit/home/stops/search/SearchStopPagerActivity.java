package com.moovit.home.stops.search;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.moovit.MoovitActivity;
import com.moovit.home.stops.search.SearchStopPagerFragment;
import com.moovit.transit.TransitType;
import java.util.ArrayList;
import o10.C18682a;
import p824tp.C19740r;
import p824tp.C19742t;

public final class SearchStopPagerActivity extends MoovitActivity implements SearchStopPagerFragment.C16013c, C18682a {

    /* renamed from: U */
    public static final /* synthetic */ int f41692U = 0;

    /* renamed from: F */
    public final ArrayList mo48174F() {
        return getIntent().getParcelableArrayListExtra("transit_types");
    }

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
        setContentView(C19742t.search_stop_pager_activity);
        SearchStopPagerFragment searchStopPagerFragment = (SearchStopPagerFragment) getSupportFragmentManager().mo3983z(C19740r.search_stops_pager_fragment);
        searchStopPagerFragment.setHasOptionsMenu(true);
        setSupportActionBar((Toolbar) searchStopPagerFragment.mo46799l2(C19740r.tool_bar));
        String stringExtra = getIntent().getStringExtra("title");
        if (stringExtra != null) {
            setTitle(stringExtra);
        }
    }

    public final void setSupportActionBar(Toolbar toolbar) {
        super.setSupportActionBar(toolbar);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo793o(true);
            supportActionBar.mo791m(true);
        }
    }
}
