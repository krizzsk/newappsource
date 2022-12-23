package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.internal.nearby.zznp;
import com.google.android.gms.nearby.messages.PublishCallback;

final class zzbs extends zznp {
    public final /* synthetic */ void notifyListener(Object obj) {
        ((PublishCallback) obj).onExpired();
    }
}
