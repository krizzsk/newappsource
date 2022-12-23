package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: com.fyber.inneractive.sdk.util.w0 */
public class C3741w0 {

    /* renamed from: a */
    public final TimeUnit f12939a;

    /* renamed from: b */
    public final long f12940b;

    /* renamed from: c */
    public Handler f12941c;

    /* renamed from: d */
    public boolean f12942d;

    /* renamed from: e */
    public C3743b f12943e;

    /* renamed from: f */
    public long f12944f;

    /* renamed from: com.fyber.inneractive.sdk.util.w0$a */
    public static class C3742a extends Handler {

        /* renamed from: a */
        public final WeakReference<C3741w0> f12945a;

        public C3742a(C3741w0 w0Var) {
            super(Looper.getMainLooper());
            this.f12945a = new WeakReference<>(w0Var);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            C3741w0 w0Var = this.f12945a.get();
            if (w0Var != null && message.what == 1932593528 && !w0Var.f12942d) {
                w0Var.mo15390a(message.getWhen());
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.util.w0$b */
    public interface C3743b {
        /* renamed from: a */
        void mo13200a(C3741w0 w0Var);
    }

    public C3741w0(TimeUnit timeUnit, long j) {
        this.f12942d = false;
        this.f12944f = 0;
        this.f12940b = j;
        this.f12939a = timeUnit;
        IAlog.m9902a("Visible time counter init - time %d", Long.valueOf(j));
    }

    /* renamed from: a */
    public void mo15389a() {
        this.f12942d = true;
        Handler handler = this.f12941c;
        if (handler != null) {
            handler.removeMessages(1932593528);
        }
    }

    /* renamed from: b */
    public void mo15391b() {
        this.f12942d = false;
        mo15390a(SystemClock.uptimeMillis());
    }

    /* renamed from: c */
    public void mo15392c() {
        C3742a aVar = new C3742a(this);
        this.f12941c = aVar;
        this.f12942d = false;
        aVar.sendEmptyMessage(1932593528);
    }

    /* renamed from: a */
    public final void mo15390a(long j) {
        long uptimeMillis = (SystemClock.uptimeMillis() - j) + 50 + this.f12944f;
        this.f12944f = uptimeMillis;
        if (this.f12943e == null || uptimeMillis <= this.f12939a.toMillis(this.f12940b)) {
            Handler handler = this.f12941c;
            if (handler != null && this.f12943e != null) {
                handler.removeMessages(1932593528);
                this.f12941c.sendEmptyMessageDelayed(1932593528, 50);
                return;
            }
            return;
        }
        this.f12943e.mo13200a(this);
    }

    public C3741w0(TimeUnit timeUnit, long j, long j2) {
        this.f12942d = false;
        this.f12940b = j;
        this.f12939a = timeUnit;
        this.f12944f = j2;
        IAlog.m9902a("Visible time counter init - time %d", Long.valueOf(j));
    }
}
