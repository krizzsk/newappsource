package com.moovit.app.subscription;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C1026n0;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import java.util.Collections;
import java.util.Set;
import k00.C17988b;
import p501fw.C17102a;
import p923xs.C20581k;

public class AdFreeMenuItemFragment extends C15682c<MoovitActivity> {

    /* renamed from: p */
    public static final /* synthetic */ int f39754p = 0;

    /* renamed from: n */
    public C15364b f39755n;

    /* renamed from: o */
    public ListItemView f39756o;

    public AdFreeMenuItemFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        mo45936m2();
        MoovitSubscriptionsManager.m39315c((MoovitApplication) this.f39755n.f3907b).f39763e.observe(getViewLifecycleOwner(), new C20581k(this, 1));
    }

    /* renamed from: m2 */
    public final void mo45936m2() {
        ListItemView listItemView = this.f39756o;
        if (listItemView != null) {
            Context context = listItemView.getContext();
            TrackingEvent trackingEvent = TrackingEvent.SUBSCRIPTIONS_INDICATOR;
            boolean z = false;
            if (context.getSharedPreferences("events_tracker_store", 0).getInt(trackingEvent.getPrefsKey(), 0) >= trackingEvent.getMaxOccurrences()) {
                z = true;
            }
            if (!z) {
                this.f39756o.setAccessoryText((int) R.string.new_badge);
                this.f39756o.setAccessoryThemeTextAppearance(R.attr.textAppearanceFootnote);
                this.f39756o.setAccessoryThemeTextColor(R.attr.colorOnStatus);
                this.f39756o.getAccessoryView().setBackground(C17988b.m44612c(this.f39756o.getContext(), R.drawable.bg_badge, R.attr.colorInfo));
                return;
            }
            this.f39756o.setAccessoryView((View) null);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f39755n = (C15364b) new C1026n0(this).mo4313a(C15364b.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ad_free_menu_fragment, viewGroup, false);
        ListItemView listItemView = (ListItemView) inflate.findViewById(R.id.ad_free_menu_item);
        this.f39756o = listItemView;
        listItemView.setOnClickListener(new C17102a(this, 0));
        return inflate;
    }
}
