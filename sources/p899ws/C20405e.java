package p899ws;

import android.text.Editable;
import com.moovit.app.help.feedback.FeedbackFormActivity;
import i00.C17522a;

/* renamed from: ws.e */
public final class C20405e extends C17522a {

    /* renamed from: b */
    public final /* synthetic */ FeedbackFormActivity f51704b;

    public C20405e(FeedbackFormActivity feedbackFormActivity) {
        this.f51704b = feedbackFormActivity;
    }

    public final void afterTextChanged(Editable editable) {
        FeedbackFormActivity feedbackFormActivity = this.f51704b;
        feedbackFormActivity.f38113r0.setError((CharSequence) null);
        feedbackFormActivity.mo45047B2();
        this.f51704b.f38113r0.setError((CharSequence) null);
    }
}
