package com.moovit.app.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.awareness.fence.FenceState;
import f00.C16919g;

public class MobileAdsFenceReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final C16919g.C16920a f37450a = new C16919g.C16920a("ads_fence_register_indicator", false);

    public final void onReceive(Context context, Intent intent) {
        FenceState extract = FenceState.extract(intent);
        extract.getCurrentState();
        if (extract.getCurrentState() == 2) {
            MobileAdsManager.m37073h().mo44712n("ads_fence", 0, false);
        }
    }
}
