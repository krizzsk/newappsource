package p899ws;

import com.moovit.app.help.feedback.FeedbackFormActivity;
import com.moovit.app.useraccount.manager.UserAccountManager;
import java.util.concurrent.Callable;
import p692ny.C18646a;
import p824tp.C19722a0;
import v90.C13187a;

/* renamed from: ws.b */
public final /* synthetic */ class C20402b implements Callable {

    /* renamed from: b */
    public final /* synthetic */ FeedbackFormActivity f51698b;

    /* renamed from: c */
    public final /* synthetic */ C19722a0 f51699c;

    /* renamed from: d */
    public final /* synthetic */ UserAccountManager f51700d;

    /* renamed from: e */
    public final /* synthetic */ C13187a f51701e;

    public /* synthetic */ C20402b(FeedbackFormActivity feedbackFormActivity, C19722a0 a0Var, UserAccountManager userAccountManager, C13187a aVar) {
        this.f51698b = feedbackFormActivity;
        this.f51699c = a0Var;
        this.f51700d = userAccountManager;
        this.f51701e = aVar;
    }

    public final Object call() {
        FeedbackFormActivity feedbackFormActivity = this.f51698b;
        C19722a0 a0Var = this.f51699c;
        UserAccountManager userAccountManager = this.f51700d;
        C13187a aVar = this.f51701e;
        int i = FeedbackFormActivity.f38102u0;
        return C18646a.m45608f(feedbackFormActivity.getApplicationContext(), a0Var, userAccountManager, aVar, feedbackFormActivity.f38105Y);
    }
}
