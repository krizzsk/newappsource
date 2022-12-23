package p899ws;

import android.text.Editable;
import com.moovit.app.help.feedback.FeedbackFormActivity;
import i00.C17522a;

/* renamed from: ws.d */
public final class C20404d extends C17522a {

    /* renamed from: b */
    public final /* synthetic */ FeedbackFormActivity f51703b;

    public C20404d(FeedbackFormActivity feedbackFormActivity) {
        this.f51703b = feedbackFormActivity;
    }

    public final void afterTextChanged(Editable editable) {
        FeedbackFormActivity feedbackFormActivity = this.f51703b;
        feedbackFormActivity.f38109n0.setError((CharSequence) null);
        feedbackFormActivity.mo45047B2();
    }
}
