package com.veriff.sdk.internal;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.veriff.sdk.internal.C21625ff;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.util.C24465j;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\b\u0010\u0003\u001a\u00020\u0002H\u0004J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, mo59060d2 = {"Lcom/veriff/sdk/internal/TrackingHandle;", "Lcom/veriff/sdk/internal/Idler$Handle;", "Lbf0/d;", "finalize", "release", "", "releaseInternal", "softRelease", "Lcom/veriff/sdk/internal/Idler$Listener;", "listener", "Lcom/veriff/sdk/internal/Idler$Listener;", "", "obtainTrace", "Ljava/lang/Throwable;", "getObtainTrace", "()Ljava/lang/Throwable;", "releaseTrace", "getReleaseTrace", "setReleaseTrace", "(Ljava/lang/Throwable;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "released", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getReleased", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "setReleased", "(Ljava/util/concurrent/atomic/AtomicBoolean;)V", "Ljava/util/Date;", "stamp", "Ljava/util/Date;", "getStamp", "()Ljava/util/Date;", "setStamp", "(Ljava/util/Date;)V", "Lcom/veriff/sdk/internal/Idler$Tag;", "tag", "Lcom/veriff/sdk/internal/Idler$Tag;", "<init>", "(Lcom/veriff/sdk/internal/Idler$Listener;Lcom/veriff/sdk/internal/Idler$Tag;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.fs */
final class C21642fs implements C21625ff.C21626a {

    /* renamed from: a */
    private AtomicBoolean f54660a = new AtomicBoolean(false);

    /* renamed from: b */
    private final Throwable f54661b = new Throwable();

    /* renamed from: c */
    private Throwable f54662c;

    /* renamed from: d */
    private Date f54663d = new Date();

    /* renamed from: f */
    private final C21625ff.C21628c f54664f;

    public C21642fs(C21625ff.C21627b bVar, C21625ff.C21628c cVar) {
        C24362h.m61211f(bVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C24362h.m61211f(cVar, "tag");
        this.f54664f = cVar;
        bVar.increment(cVar.mo54904a());
        C21637fn.m52524d().mo54893a(25000, new Runnable(this) {

            /* renamed from: a */
            public final /* synthetic */ C21642fs f54665a;

            {
                this.f54665a = r1;
            }

            public final void run() {
                if (!this.f54665a.mo54915c().get()) {
                    C24465j a = C24465j.m61536a(C21642fs.class);
                    StringBuilder k = C13555b.m33972k("Handle obtained here at ");
                    k.append(this.f54665a.mo54917e());
                    k.append(" still in use");
                    a.mo60712w(k.toString(), this.f54665a.mo54916d());
                }
            }
        });
    }

    /* renamed from: f */
    private final boolean m52542f() {
        if (!this.f54660a.compareAndSet(false, true)) {
            return false;
        }
        this.f54664f.mo54904a();
        throw null;
    }

    /* renamed from: a */
    public void mo54900a() {
        if (!m52542f()) {
            throw new IllegalStateException("IdlerHandle already released!", this.f54662c);
        }
    }

    /* renamed from: b */
    public void mo54901b() {
        m52542f();
    }

    /* renamed from: c */
    public final AtomicBoolean mo54915c() {
        return this.f54660a;
    }

    /* renamed from: d */
    public final Throwable mo54916d() {
        return this.f54661b;
    }

    /* renamed from: e */
    public final Date mo54917e() {
        return this.f54663d;
    }

    public final void finalize() {
        if (!this.f54660a.get()) {
            StringBuilder k = C13555b.m33972k("IdlerHandle obtained here at ");
            k.append(this.f54663d);
            k.append(" never released");
            throw new IllegalStateException(k.toString(), this.f54661b);
        }
    }
}
