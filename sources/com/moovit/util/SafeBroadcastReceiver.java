package com.moovit.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p435de.C16596f;

public abstract class SafeBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public abstract void mo24574a(Context context, Intent intent);

    public final void onReceive(Context context, Intent intent) {
        try {
            mo24574a(context, intent);
        } catch (Throwable th) {
            C16596f.m42113a().mo49364c(th);
            th.printStackTrace();
        }
    }
}
