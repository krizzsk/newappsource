package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;

final class zzc implements Runnable {
    public final /* synthetic */ BroadcastReceiver.PendingResult zza;

    public zzc(CampaignTrackingReceiver campaignTrackingReceiver, BroadcastReceiver.PendingResult pendingResult) {
        this.zza = pendingResult;
    }

    public final void run() {
        BroadcastReceiver.PendingResult pendingResult = this.zza;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
