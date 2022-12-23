package com.veriff.sdk.internal;

import android.os.Handler;

/* renamed from: com.veriff.sdk.internal.fd */
public class C21623fd implements C21636fm {

    /* renamed from: a */
    private final Handler f54625a;

    public C21623fd(Handler handler) {
        this.f54625a = handler;
    }

    /* renamed from: a */
    public void mo54894a(Runnable runnable) {
        this.f54625a.post(runnable);
    }

    /* renamed from: b */
    public void mo54895b(Runnable runnable) {
        this.f54625a.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public void mo54893a(long j, Runnable runnable) {
        this.f54625a.postDelayed(runnable, j);
    }
}
