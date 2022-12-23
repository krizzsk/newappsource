package p899ws;

import android.content.Intent;
import android.view.View;
import android.widget.ExpandableListView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.help.feedback.CategoryType;
import com.moovit.app.help.feedback.FeedbackType;
import com.moovit.app.help.feedback.FeedbackTypeSelectionActivity;
import p543hq.C17474b;
import p977zz.C20975x0;

/* renamed from: ws.h */
public final /* synthetic */ class C20408h implements ExpandableListView.OnChildClickListener {

    /* renamed from: a */
    public final /* synthetic */ FeedbackTypeSelectionActivity f51707a;

    public /* synthetic */ C20408h(FeedbackTypeSelectionActivity feedbackTypeSelectionActivity) {
        this.f51707a = feedbackTypeSelectionActivity;
    }

    public final boolean onChildClick(ExpandableListView expandableListView, View view, int i, int i2, long j) {
        FeedbackTypeSelectionActivity feedbackTypeSelectionActivity = this.f51707a;
        int i3 = FeedbackTypeSelectionActivity.f38116l0;
        feedbackTypeSelectionActivity.getClass();
        CategoryType categoryType = (CategoryType) expandableListView.getExpandableListAdapter().getGroup(i);
        FeedbackType feedbackType = categoryType.getFeedbackTypes().get(i2);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "feedback_type_selection_feedback_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.ID, feedbackType.getFeedbackTypeTag());
        feedbackTypeSelectionActivity.mo44545v2(aVar.mo49933a());
        if (!C20975x0.m49118e(feedbackType, feedbackTypeSelectionActivity.f38119Y)) {
            feedbackTypeSelectionActivity.f38118X = categoryType;
            feedbackTypeSelectionActivity.f38119Y = feedbackType;
            feedbackTypeSelectionActivity.mo45056y2();
        }
        Intent intent = new Intent();
        intent.putExtra("category_type", categoryType);
        intent.putExtra("feedback_type", feedbackType);
        feedbackTypeSelectionActivity.setResult(-1, intent);
        feedbackTypeSelectionActivity.finish();
        return false;
    }
}
