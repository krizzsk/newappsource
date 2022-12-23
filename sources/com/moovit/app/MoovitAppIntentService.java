package com.moovit.app;

import android.content.Intent;

public abstract class MoovitAppIntentService extends MoovitAppLooperService {
    /* renamed from: d */
    public final void mo19675d(int i, Intent intent) {
        mo44687s();
        stopSelf(i);
    }

    /* renamed from: o */
    public final synchronized void mo44576o() {
    }

    /* renamed from: s */
    public abstract void mo44687s();
}
