package com.veriff.sdk.internal;

import com.appboy.Constants;
import com.appsflyer.internal.referrer.Payload;
import com.veriff.sdk.internal.C21924kn;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B\u001d\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010#J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0016\u0010\u0007\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00018\u00008\u00000\u0000H\u0016J\u001c\u0010\n\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\bH\u0016J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0016\u001a\n \u0006*\u0004\u0018\u00010\u00150\u0015H\u0016J\u0010\u0010\u0018\u001a\n \u0006*\u0004\u0018\u00010\u00170\u0017H\u0016R8\u0010\u001b\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001a0\u001a \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u001a0\u001a\u0018\u00010\u00190\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, mo59060d2 = {"Lcom/veriff/sdk/internal/network/ApiCall;", "T", "Lck0/b;", "Lcom/veriff/sdk/internal/network/ApiResult;", "Lbf0/d;", "cancel", "kotlin.jvm.PlatformType", "clone", "Lck0/d;", "callback", "enqueue", "Lck0/r;", "execute", "", "isCanceled", "isExecuted", "resp", "processResponse", "", "t", "processThrowable", "Lhi0/x;", "request", "Lsi0/d0;", "timeout", "Lcom/squareup/moshi/k;", "Lmobi/lab/veriff/data/api/request/response/ErrorResponse;", "errorAdapter", "Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/o;", "moshi", "Lcom/squareup/moshi/o;", "wrapped", "Lck0/b;", "<init>", "(Lck0/b;Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.kk */
public final class C21920kk<T> implements ace<C21924kn<T>> {

    /* renamed from: a */
    private final C21420av<C22559to> f55413a;

    /* renamed from: b */
    private final ace<T> f55414b;

    /* renamed from: c */
    private final C21450bi f55415c;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0007\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J$\u0010\n\u001a\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¨\u0006\u000b"}, mo59060d2 = {"com/veriff/sdk/internal/network/ApiCall$enqueue$1", "Lck0/d;", "Lck0/b;", "call", "", "t", "Lbf0/d;", "onFailure", "Lck0/r;", "response", "onResponse", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.kk$a */
    public static final class C21921a implements acg<T> {

        /* renamed from: a */
        public final /* synthetic */ C21920kk f55416a;

        /* renamed from: b */
        public final /* synthetic */ acg f55417b;

        public C21921a(C21920kk kkVar, acg acg) {
            this.f55416a = kkVar;
            this.f55417b = acg;
        }

        /* renamed from: a */
        public void mo54010a(ace<T> ace, acu<T> acu) {
            C24362h.m61211f(ace, "call");
            C24362h.m61211f(acu, Payload.RESPONSE);
            acg acg = this.f55417b;
            C21920kk kkVar = this.f55416a;
            acg.mo54010a(kkVar, acu.m50801a(kkVar.m53494a(acu)));
        }

        /* renamed from: a_ */
        public void mo54011a_(ace<T> ace, Throwable th) {
            C24362h.m61211f(ace, "call");
            C24362h.m61211f(th, Constants.APPBOY_PUSH_TITLE_KEY);
            acg acg = this.f55417b;
            C21920kk kkVar = this.f55416a;
            acg.mo54010a(kkVar, acu.m50801a(kkVar.m53497a(th)));
        }
    }

    public C21920kk(ace<T> ace, C21450bi biVar) {
        C24362h.m61211f(ace, "wrapped");
        C24362h.m61211f(biVar, "moshi");
        this.f55414b = ace;
        this.f55415c = biVar;
        this.f55413a = biVar.mo54334a(C22559to.class);
    }

    /* renamed from: b */
    public boolean mo54004b() {
        return this.f55414b.mo54004b();
    }

    /* renamed from: c */
    public C22752ys mo54005c() {
        return this.f55414b.mo54005c();
    }

    /* renamed from: d */
    public C21920kk<T> mo54006e() {
        ace<T> e = this.f55414b.mo54006e();
        C24362h.m61210e(e, "wrapped.clone()");
        return new C21920kk<>(e, this.f55415c);
    }

    /* renamed from: a */
    public void mo54003a(acg<C21924kn<T>> acg) {
        C24362h.m61211f(acg, WidgetMessageParser.KEY_CALLBACK);
        this.f55414b.mo54003a(new C21921a(this, acg));
    }

    /* renamed from: a */
    public void mo54002a() {
        this.f55414b.mo54002a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C21924kn<T> m53494a(acu<T> acu) {
        abk c;
        if (acu.mo54073d()) {
            T e = acu.mo54074e();
            if (e != null) {
                return new C21924kn.C21927c(e);
            }
            return new C21924kn.C21928d(new IllegalStateException("Response body is null"));
        }
        C22559to toVar = null;
        try {
            C22759yv f = acu.mo54075f();
            if (!(f == null || (c = f.mo54033c()) == null)) {
                toVar = this.f55413a.mo54222a(c);
            }
        } catch (Throwable unused) {
        }
        int a = acu.mo54070a();
        C22736yk c2 = acu.mo54072c();
        C24362h.m61210e(c2, "resp.headers()");
        return new C21924kn.C21926b(a, c2, toVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C21924kn<T> m53497a(Throwable th) {
        return th instanceof IOException ? new C21924kn.C21925a((IOException) th) : new C21924kn.C21928d(th);
    }
}
