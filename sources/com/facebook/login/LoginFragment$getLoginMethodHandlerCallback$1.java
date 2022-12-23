package com.facebook.login;

import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentActivity;
import bf0.C21050d;
import com.facebook.internal.CallbackManagerImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo59060d2 = {"Landroidx/activity/result/ActivityResult;", "result", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 5, 1})
final class LoginFragment$getLoginMethodHandlerCallback$1 extends Lambda implements C24236l<ActivityResult, C21050d> {
    public final /* synthetic */ FragmentActivity $activity;
    public final /* synthetic */ C2477i this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginFragment$getLoginMethodHandlerCallback$1(C2477i iVar, FragmentActivity fragmentActivity) {
        super(1);
        this.this$0 = iVar;
        this.$activity = fragmentActivity;
    }

    public final Object invoke(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        C24362h.m61211f(activityResult, "result");
        if (activityResult.f528b == -1) {
            this.this$0.mo12700H1().mo12663m(CallbackManagerImpl.RequestCodeOffset.Login.toRequestCode(), activityResult.f528b, activityResult.f529c);
        } else {
            this.$activity.finish();
        }
        return C21050d.f52856a;
    }
}
