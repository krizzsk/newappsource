package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"com/facebook/CustomTabMainActivity$onCreate$redirectReceiver$1", "Landroid/content/BroadcastReceiver;", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class CustomTabMainActivity$onCreate$redirectReceiver$1 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ CustomTabMainActivity f8411a;

    public CustomTabMainActivity$onCreate$redirectReceiver$1(CustomTabMainActivity customTabMainActivity) {
        this.f8411a = customTabMainActivity;
    }

    public final void onReceive(Context context, Intent intent) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(intent, "intent");
        Intent intent2 = new Intent(this.f8411a, CustomTabMainActivity.class);
        intent2.setAction(CustomTabMainActivity.f8406i);
        String str = CustomTabMainActivity.f8404g;
        intent2.putExtra(str, intent.getStringExtra(str));
        intent2.addFlags(603979776);
        this.f8411a.startActivity(intent2);
    }
}
