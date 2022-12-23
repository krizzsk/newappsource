package p899ws;

import android.content.Intent;
import android.view.View;
import android.widget.ExpandableListView;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.help.feedback.CategoryType;
import com.moovit.app.help.feedback.FeedbackType;
import com.moovit.app.help.feedback.FeedbackTypeSelectionActivity;
import java.util.List;
import p543hq.C17474b;

/* renamed from: ws.g */
public final /* synthetic */ class C20407g implements ExpandableListView.OnGroupClickListener {

    /* renamed from: a */
    public final /* synthetic */ FeedbackTypeSelectionActivity f51706a;

    public /* synthetic */ C20407g(FeedbackTypeSelectionActivity feedbackTypeSelectionActivity) {
        this.f51706a = feedbackTypeSelectionActivity;
    }

    public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
        FeedbackTypeSelectionActivity feedbackTypeSelectionActivity = this.f51706a;
        int i2 = FeedbackTypeSelectionActivity.f38116l0;
        feedbackTypeSelectionActivity.getClass();
        CategoryType categoryType = (CategoryType) expandableListView.getExpandableListAdapter().getGroup(i);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "feedback_type_selection_category_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.ID, categoryType.getCategoryTypeTag());
        feedbackTypeSelectionActivity.mo44545v2(aVar.mo49933a());
        List<FeedbackType> feedbackTypes = categoryType.getFeedbackTypes();
        if (feedbackTypes.size() == 1) {
            feedbackTypeSelectionActivity.f38118X = categoryType;
            feedbackTypeSelectionActivity.f38119Y = feedbackTypes.get(0);
            feedbackTypeSelectionActivity.mo45056y2();
            Intent intent = new Intent();
            intent.putExtra("category_type", categoryType);
            intent.putExtra("feedback_type", feedbackTypes.get(0));
            feedbackTypeSelectionActivity.setResult(-1, intent);
            feedbackTypeSelectionActivity.finish();
        }
        return false;
    }
}
