package com.moovit.sdk.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.moovit.sdk.profilers.ProfilerLog;

public abstract class SafeBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public abstract void mo23871a(Context context, Intent intent);

    public final void onReceive(Context context, Intent intent) {
        try {
            mo23871a(context, intent);
        } catch (Throwable th) {
            th.toString();
            ProfilerLog.m41879c(context).mo49243a("SafeBroadcastReceiver", th);
        }
    }
}
