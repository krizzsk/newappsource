package com.vungle.warren;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.vungle.warren.d0 */
public final class C23110d0 extends BroadcastReceiver {

    /* renamed from: a */
    public final /* synthetic */ NativeAdLayout f58662a;

    public C23110d0(NativeAdLayout nativeAdLayout) {
        this.f58662a = nativeAdLayout;
    }

    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("command");
        if ("stopAll".equalsIgnoreCase(stringExtra)) {
            NativeAdLayout nativeAdLayout = this.f58662a;
            nativeAdLayout.hashCode();
            if (!nativeAdLayout.f58505e) {
                nativeAdLayout.f58505e = true;
                return;
            }
            return;
        }
        Class<NativeAdLayout> cls = NativeAdLayout.class;
        VungleLogger.m57032e("NativeAdLayout#onAttachedToWindow", String.format("Receiving Invalid Broadcast: %1$s", new Object[]{stringExtra}));
    }
}
