package com.veriff.sdk.internal;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.veriff.sdk.internal.cp */
class C21532cp {

    /* renamed from: b */
    public final C21486bs f54188b;

    /* renamed from: c */
    public final Handler f54189c;

    /* renamed from: d */
    public long f54190d;

    /* renamed from: e */
    public long f54191e;

    /* renamed from: f */
    public long f54192f;

    /* renamed from: g */
    public long f54193g;

    /* renamed from: h */
    public long f54194h;

    /* renamed from: i */
    public long f54195i;

    /* renamed from: j */
    public long f54196j;

    /* renamed from: k */
    public long f54197k;

    /* renamed from: l */
    public int f54198l;

    /* renamed from: m */
    public int f54199m;

    /* renamed from: n */
    public int f54200n;

    /* renamed from: com.veriff.sdk.internal.cp$a */
    public static class C21533a extends Handler {

        /* renamed from: a */
        private final C21532cp f54201a;

        public C21533a(Looper looper, C21532cp cpVar) {
            super(looper);
            this.f54201a = cpVar;
        }

        public void handleMessage(final Message message) {
            int i = message.what;
            if (i == 0) {
                this.f54201a.mo54541c();
            } else if (i == 1) {
                this.f54201a.mo54543d();
            } else if (i == 2) {
                this.f54201a.mo54539b((long) message.arg1);
            } else if (i == 3) {
                this.f54201a.mo54542c((long) message.arg1);
            } else if (i != 4) {
                C21512ci.f54109a.post(new Runnable(this) {
                    public void run() {
                        StringBuilder k = C13555b.m33972k("Unhandled stats message.");
                        k.append(message.what);
                        throw new AssertionError(k.toString());
                    }
                });
            } else {
                this.f54201a.mo54537a((Long) message.obj);
            }
        }
    }

    public C21532cp(C21486bs bsVar) {
        this.f54188b = bsVar;
        HandlerThread handlerThread = new HandlerThread("Picasso-Stats", 10);
        handlerThread.start();
        C21537cs.m51504a(handlerThread.getLooper());
        this.f54189c = new C21533a(handlerThread.getLooper(), this);
    }

    /* renamed from: a */
    public void mo54536a(Bitmap bitmap) {
        m51477a(bitmap, 2);
    }

    /* renamed from: b */
    public void mo54540b(Bitmap bitmap) {
        m51477a(bitmap, 3);
    }

    /* renamed from: c */
    public void mo54541c() {
        this.f54190d++;
    }

    /* renamed from: d */
    public void mo54543d() {
        this.f54191e++;
    }

    /* renamed from: e */
    public C21535cq mo54544e() {
        return new C21535cq(this.f54188b.mo54436b(), this.f54188b.mo54433a(), this.f54190d, this.f54191e, this.f54192f, this.f54193g, this.f54194h, this.f54195i, this.f54196j, this.f54197k, this.f54198l, this.f54199m, this.f54200n, System.currentTimeMillis());
    }

    /* renamed from: a */
    public void mo54535a(long j) {
        Handler handler = this.f54189c;
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(j)));
    }

    /* renamed from: b */
    public void mo54538b() {
        this.f54189c.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public void mo54542c(long j) {
        this.f54200n++;
        long j2 = this.f54194h + j;
        this.f54194h = j2;
        this.f54197k = m51476a(this.f54199m, j2);
    }

    /* renamed from: a */
    public void mo54534a() {
        this.f54189c.sendEmptyMessage(0);
    }

    /* renamed from: b */
    public void mo54539b(long j) {
        int i = this.f54199m + 1;
        this.f54199m = i;
        long j2 = this.f54193g + j;
        this.f54193g = j2;
        this.f54196j = m51476a(i, j2);
    }

    /* renamed from: a */
    public void mo54537a(Long l) {
        this.f54198l++;
        long longValue = l.longValue() + this.f54192f;
        this.f54192f = longValue;
        this.f54195i = m51476a(this.f54198l, longValue);
    }

    /* renamed from: a */
    private void m51477a(Bitmap bitmap, int i) {
        int a = C21537cs.m51493a(bitmap);
        Handler handler = this.f54189c;
        handler.sendMessage(handler.obtainMessage(i, a, 0));
    }

    /* renamed from: a */
    private static long m51476a(int i, long j) {
        return j / ((long) i);
    }
}
