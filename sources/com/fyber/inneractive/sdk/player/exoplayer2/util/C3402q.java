package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C3052b;
import com.fyber.inneractive.sdk.player.exoplayer2.C3231m;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.q */
public final class C3402q implements C3387g {

    /* renamed from: a */
    public boolean f12141a;

    /* renamed from: b */
    public long f12142b;

    /* renamed from: c */
    public long f12143c;

    /* renamed from: d */
    public C3231m f12144d = C3231m.f11655d;

    /* renamed from: a */
    public void mo14580a(long j) {
        this.f12142b = j;
        if (this.f12141a) {
            this.f12143c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: i */
    public C3231m mo14006i() {
        return this.f12144d;
    }

    /* renamed from: o */
    public long mo14008o() {
        long j;
        long j2 = this.f12142b;
        if (!this.f12141a) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f12143c;
        C3231m mVar = this.f12144d;
        if (mVar.f11656a == 1.0f) {
            j = C3052b.m7657a(elapsedRealtime);
        } else {
            j = elapsedRealtime * ((long) mVar.f11658c);
        }
        return j2 + j;
    }

    /* renamed from: a */
    public void mo14581a(C3387g gVar) {
        mo14580a(gVar.mo14008o());
        this.f12144d = gVar.mo14006i();
    }

    /* renamed from: a */
    public C3231m mo13997a(C3231m mVar) {
        if (this.f12141a) {
            mo14580a(mo14008o());
        }
        this.f12144d = mVar;
        return mVar;
    }
}
