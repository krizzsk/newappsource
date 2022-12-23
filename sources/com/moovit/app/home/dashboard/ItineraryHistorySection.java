package com.moovit.app.home.dashboard;

import a00.C13382a;
import aa0.C7539k;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C0475w0;
import c00.C13717b;
import ce0.C21100e;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.history.TripHistoryActivity;
import com.moovit.app.history.model.HistoryItem;
import com.moovit.app.history.model.JourneyHistoryItem;
import com.moovit.app.history.model.OfflineTripPlanHistoryItem;
import com.moovit.app.history.model.TripPlanHistoryItem;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.list.FixedListView;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p372at.C13516c;
import p543hq.C17474b;

public class ItineraryHistorySection extends C15682c<MoovitActivity> implements C13516c.C13517a {

    /* renamed from: r */
    public static final /* synthetic */ int f38172r = 0;

    /* renamed from: n */
    public ViewGroup f38173n;

    /* renamed from: o */
    public ListItemView f38174o;

    /* renamed from: p */
    public int f38175p = 0;

    /* renamed from: q */
    public C13516c f38176q = null;

    /* renamed from: com.moovit.app.home.dashboard.ItineraryHistorySection$a */
    public static class C14923a implements HistoryItem.C14912a<View>, View.OnClickListener, C0475w0.C0476a {

        /* renamed from: b */
        public final ItineraryHistorySection f38177b;

        /* renamed from: c */
        public final HistoryItem f38178c;

        public C14923a(ItineraryHistorySection itineraryHistorySection, HistoryItem historyItem) {
            C21100e.m49373x(itineraryHistorySection, "section");
            this.f38177b = itineraryHistorySection;
            C21100e.m49373x(historyItem, "item");
            this.f38178c = historyItem;
        }

        /* renamed from: D */
        public final Object mo40412D(TripPlanHistoryItem tripPlanHistoryItem) {
            return mo45123a(this.f38177b.getContext(), tripPlanHistoryItem);
        }

        /* renamed from: a */
        public final ListItemView mo45123a(Context context, JourneyHistoryItem journeyHistoryItem) {
            ListItemView listItemView = new ListItemView(context, (AttributeSet) null, R.attr.listItemLabeledStyle);
            listItemView.setIcon((int) R.drawable.ic_clock_24_on_surface_emphasis_low);
            listItemView.setTitle((CharSequence) journeyHistoryItem.mo45084s0().f23643b.mo24313f());
            listItemView.setSubtitle((CharSequence) journeyHistoryItem.mo45084s0().f23644c.mo24313f());
            listItemView.setTag(journeyHistoryItem);
            listItemView.setOnClickListener(this);
            listItemView.setAccessoryIgnoreHorizontalPadding(true);
            listItemView.setAccessoryView((int) R.layout.list_item_accessory_overflow_button);
            listItemView.setLayoutParams(FixedListView.m40337h(context, 0, R.drawable.divider_horizontal, 1));
            View accessoryView = listItemView.getAccessoryView();
            accessoryView.setOnClickListener(new C7539k(accessoryView, R.menu.dashboard_menu_history, this));
            C13382a.m33674j(listItemView, context.getString(R.string.voice_over_tripplan_from, new Object[]{listItemView.getTitle()}), context.getString(R.string.voice_over_tripplan_to, new Object[]{listItemView.getSubtitle()}));
            return listItemView;
        }

        /* renamed from: e1 */
        public final Object mo40413e1(OfflineTripPlanHistoryItem offlineTripPlanHistoryItem) {
            return mo45123a(this.f38177b.getContext(), offlineTripPlanHistoryItem);
        }

        public final void onClick(View view) {
            ItineraryHistorySection itineraryHistorySection = this.f38177b;
            HistoryItem historyItem = this.f38178c;
            int i = ItineraryHistorySection.f38172r;
            itineraryHistorySection.getClass();
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "recent_trip_clicked");
            itineraryHistorySection.mo46797j2(aVar.mo49933a());
            Context context = itineraryHistorySection.getContext();
            String id = historyItem.getId();
            int i2 = TripHistoryActivity.f38127U;
            Intent intent = new Intent(context, TripHistoryActivity.class);
            intent.putExtra("historyItemId", id);
            itineraryHistorySection.startActivity(intent);
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            if (menuItem.getItemId() != R.id.menu_delete) {
                return true;
            }
            ItineraryHistorySection itineraryHistorySection = this.f38177b;
            HistoryItem historyItem = this.f38178c;
            C13516c cVar = itineraryHistorySection.f38176q;
            if (cVar == null) {
                return true;
            }
            cVar.mo40410c(Collections.singletonList(historyItem));
            return true;
        }
    }

    public ItineraryHistorySection() {
        super(MoovitActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("HISTORY");
    }

    /* renamed from: V1 */
    public final void mo40555V1() {
        super.mo40555V1();
        C13516c cVar = (C13516c) mo46776J1("HISTORY");
        this.f38176q = cVar;
        if (this.f40824e) {
            mo45122m2(cVar);
            this.f38176q.f33437e.add(this);
        }
    }

    /* renamed from: m1 */
    public final void mo40411m1(C13516c cVar) {
        mo45122m2(cVar);
    }

    /* renamed from: m2 */
    public final void mo45122m2(C13516c cVar) {
        ViewGroup viewGroup = this.f38173n;
        viewGroup.removeViews(1, viewGroup.getChildCount() - 1);
        List<HistoryItem> e = cVar.f33436d.mo40647e();
        if (C13717b.m34258e(e)) {
            this.f38174o.setVisibility(8);
            if (this.f38175p != 0) {
                LayoutInflater.from(getContext()).inflate(this.f38175p, this.f38173n, true);
                return;
            }
            return;
        }
        this.f38174o.setVisibility(0);
        for (HistoryItem aVar : e) {
            C14923a aVar2 = new C14923a(this, aVar);
            this.f38173n.addView((View) aVar2.f38178c.mo45080Z1(aVar2));
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.history_section_fragment, viewGroup, false);
        this.f38173n = (ViewGroup) inflate.findViewById(R.id.list_view);
        this.f38174o = (ListItemView) inflate.findViewById(R.id.header);
        return inflate;
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f38176q = null;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f38173n = null;
        this.f38174o = null;
    }

    /* JADX INFO: finally extract failed */
    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray n = UiUtils.m40255n(context, attributeSet, new int[]{R.attr.emptyViewLayout});
        try {
            int resourceId = n.getResourceId(0, 0);
            n.recycle();
            this.f38175p = resourceId;
        } catch (Throwable th) {
            n.recycle();
            throw th;
        }
    }

    public final void onStart() {
        super.onStart();
        C13516c cVar = this.f38176q;
        if (cVar != null) {
            mo45122m2(cVar);
            this.f38176q.f33437e.add(this);
        }
    }

    public final void onStop() {
        super.onStop();
        C13516c cVar = this.f38176q;
        if (cVar != null) {
            cVar.f33437e.remove(this);
        }
    }
}
