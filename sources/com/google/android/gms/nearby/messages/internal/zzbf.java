package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.internal.nearby.zznp;
import com.google.android.gms.nearby.messages.SubscribeCallback;

final class zzbf extends zznp {
    public final /* synthetic */ void notifyListener(Object obj) {
        ((SubscribeCallback) obj).onExpired();
    }
}
