package com.moovit;

import android.content.Intent;

public abstract class MoovitIntentService extends MoovitLooperService {
    /* renamed from: d */
    public final void mo19675d(int i, Intent intent) {
        mo44577s();
        stopSelf(i);
    }

    /* renamed from: o */
    public final synchronized void mo44576o() {
    }

    /* renamed from: s */
    public abstract void mo44577s();
}
