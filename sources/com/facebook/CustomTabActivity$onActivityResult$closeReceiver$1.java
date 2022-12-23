package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"com/facebook/CustomTabActivity$onActivityResult$closeReceiver$1", "Landroid/content/BroadcastReceiver;", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class CustomTabActivity$onActivityResult$closeReceiver$1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ CustomTabActivity f8400a;

    public CustomTabActivity$onActivityResult$closeReceiver$1(CustomTabActivity customTabActivity) {
        this.f8400a = customTabActivity;
    }

    public final void onReceive(Context context, Intent intent) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(intent, "intent");
        this.f8400a.finish();
    }
}
