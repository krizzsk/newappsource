package com.google.android.gms.internal.nearby;

import android.database.ContentObserver;
import android.os.Handler;

final class zzrx extends ContentObserver {
    public zzrx(Handler handler) {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        zzry.zzk.set(true);
    }
}
