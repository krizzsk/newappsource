package p899ws;

import android.widget.ExpandableListView;
import com.moovit.app.help.feedback.FeedbackTypeSelectionActivity;

/* renamed from: ws.i */
public final class C20409i implements ExpandableListView.OnGroupExpandListener {

    /* renamed from: a */
    public int f51708a = -1;

    /* renamed from: b */
    public final /* synthetic */ FeedbackTypeSelectionActivity f51709b;

    public C20409i(FeedbackTypeSelectionActivity feedbackTypeSelectionActivity) {
        this.f51709b = feedbackTypeSelectionActivity;
    }

    public final void onGroupExpand(int i) {
        int i2 = this.f51708a;
        if (!(i2 == -1 || i2 == i)) {
            this.f51709b.f38120Z.collapseGroup(i2);
        }
        this.f51708a = i;
        FeedbackTypeSelectionActivity feedbackTypeSelectionActivity = this.f51709b;
        int i3 = FeedbackTypeSelectionActivity.f38116l0;
        feedbackTypeSelectionActivity.mo45056y2();
    }
}
