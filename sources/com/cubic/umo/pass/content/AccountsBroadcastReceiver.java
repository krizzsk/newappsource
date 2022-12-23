package com.cubic.umo.pass.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.cubic.umo.pass.internal.AccountController;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/cubic/umo/pass/content/AccountsBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class AccountsBroadcastReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        AccountController.f7854c.getValue().mo11665b();
    }
}
