package p399bw;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import p543hq.C17474b;

/* renamed from: bw.e */
public final /* synthetic */ class C13701e implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C13704g f33770b;

    /* renamed from: c */
    public final /* synthetic */ ListItemView f33771c;

    /* renamed from: d */
    public final /* synthetic */ MoovitActivity f33772d;

    /* renamed from: e */
    public final /* synthetic */ ViewGroup f33773e;

    public /* synthetic */ C13701e(C13704g gVar, ListItemView listItemView, MoovitActivity moovitActivity, CoordinatorLayout coordinatorLayout, CoordinatorLayout.C0752e eVar) {
        this.f33770b = gVar;
        this.f33771c = listItemView;
        this.f33772d = moovitActivity;
        this.f33773e = coordinatorLayout;
    }

    public final void onClick(View view) {
        boolean z;
        int i;
        AnalyticsEventKey analyticsEventKey;
        C13704g gVar = this.f33770b;
        ListItemView listItemView = this.f33771c;
        MoovitActivity moovitActivity = this.f33772d;
        ViewGroup viewGroup = this.f33773e;
        gVar.getClass();
        if (view.getId() == R.id.action_yes) {
            z = true;
        } else {
            z = false;
        }
        listItemView.setAccessoryView((View) null);
        if (z) {
            i = R.string.feedback_popup_like;
        } else {
            i = R.string.feedback_popup_dislike;
        }
        listItemView.setTitle(i);
        C13704g.f33780d.mo49545d(gVar.f33781a, Boolean.TRUE);
        if (z) {
            analyticsEventKey = AnalyticsEventKey.SMART_FEEDBACK_YES;
        } else {
            analyticsEventKey = AnalyticsEventKey.SMART_FEEDBACK_NO;
        }
        moovitActivity.mo44545v2(new C17474b.C17475a(analyticsEventKey).mo49933a());
        UiUtils.m40259r(listItemView, new C13702f(false, listItemView, viewGroup));
    }
}
