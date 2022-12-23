package p663mt;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.home.stops.search.SearchStopItem;
import com.moovit.home.stops.search.SearchStopPagerFragment;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitType;
import com.tranzmate.R;
import java.util.List;
import o10.C18682a;
import p450dt.C16703d;
import p824tp.C19740r;

/* renamed from: mt.c */
public class C18434c extends C16703d implements C18682a {
    /* renamed from: Q */
    public final void mo48169Q(SearchStopItem searchStopItem, TransitType transitType, boolean z) {
        startActivity(StopDetailActivity.m39207B2(getContext(), searchStopItem.getServerId(), (ServerId) null, (TransitStop) null, (List) null));
    }

    /* renamed from: n2 */
    public final Toolbar mo45130n2() {
        return (Toolbar) ((SearchStopPagerFragment) getChildFragmentManager().mo3983z(R.id.search_stops_pager_fragment)).mo46799l2(C19740r.tool_bar);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.stops_pager_home_fragment, viewGroup, false);
    }

    public final void onPause() {
        super.onPause();
        ((SearchStopPagerFragment) getChildFragmentManager().mo3983z(R.id.search_stops_pager_fragment)).setHasOptionsMenu(false);
    }

    public final void onResume() {
        super.onResume();
        ((SearchStopPagerFragment) getChildFragmentManager().mo3983z(R.id.search_stops_pager_fragment)).setHasOptionsMenu(true);
    }
}
