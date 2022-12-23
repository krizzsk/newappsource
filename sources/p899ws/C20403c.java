package p899ws;

import android.text.Editable;
import com.moovit.app.help.feedback.FeedbackFormActivity;
import i00.C17522a;

/* renamed from: ws.c */
public final class C20403c extends C17522a {

    /* renamed from: b */
    public final /* synthetic */ FeedbackFormActivity f51702b;

    public C20403c(FeedbackFormActivity feedbackFormActivity) {
        this.f51702b = feedbackFormActivity;
    }

    public final void afterTextChanged(Editable editable) {
        FeedbackFormActivity feedbackFormActivity = this.f51702b;
        feedbackFormActivity.f38107l0.setError((CharSequence) null);
        feedbackFormActivity.mo45047B2();
    }
}
