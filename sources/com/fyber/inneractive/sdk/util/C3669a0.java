package com.fyber.inneractive.sdk.util;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.C3671b0;

/* renamed from: com.fyber.inneractive.sdk.util.a0 */
public class C3669a0 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ C3671b0 f12823a;

    public C3669a0(C3671b0 b0Var) {
        this.f12823a = b0Var;
    }

    public void onReceive(Context context, Intent intent) {
        boolean z;
        C3671b0 b0Var = this.f12823a;
        b0Var.getClass();
        IAlog.m9902a("%sonReceive. action = %s", IAlog.m9899a((Object) b0Var), intent.getAction());
        C3671b0 b0Var2 = this.f12823a;
        synchronized (b0Var2) {
            try {
                z = ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
            } catch (Exception unused) {
                IAlog.m9902a("%sFailed to get lock screen status", IAlog.m9899a((Object) b0Var2));
                z = false;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                b0Var2.f12825b = true;
            } else if (("android.intent.action.SCREEN_ON".equals(intent.getAction()) && !z) || "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                b0Var2.f12825b = false;
            }
            IAlog.m9902a("%sNew screen state is locked: %s. number of listeners: %d", IAlog.m9899a((Object) b0Var2), Boolean.valueOf(b0Var2.f12825b), Integer.valueOf(b0Var2.f12824a.size()));
            for (C3671b0.C3673b b : b0Var2.f12824a) {
                b.mo15276b(b0Var2.f12825b);
            }
        }
    }
}
