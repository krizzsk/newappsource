package com.veriff.sdk.internal;

import com.appsflyer.internal.referrer.Payload;
import com.veriff.sdk.internal.C22752ys;
import com.veriff.sdk.internal.C22757yu;
import java.util.Objects;

public final class acu<T> {

    /* renamed from: a */
    private final C22757yu f53773a;

    /* renamed from: b */
    private final T f53774b;

    /* renamed from: c */
    private final C22759yv f53775c;

    private acu(C22757yu yuVar, T t, C22759yv yvVar) {
        this.f53773a = yuVar;
        this.f53774b = t;
        this.f53775c = yvVar;
    }

    /* renamed from: a */
    public static <T> acu<T> m50801a(T t) {
        return m50802a(t, new C22757yu.C22758a().mo57433a(200).mo57441a(Payload.RESPONSE_OK).mo57437a(C22749yq.HTTP_1_1).mo57438a(new C22752ys.C22753a().mo57406a("http://localhost/").mo57409a()).mo57443a());
    }

    /* renamed from: b */
    public String mo54071b() {
        return this.f53773a.mo57421e();
    }

    /* renamed from: c */
    public C22736yk mo54072c() {
        return this.f53773a.mo57423g();
    }

    /* renamed from: d */
    public boolean mo54073d() {
        return this.f53773a.mo57420d();
    }

    /* renamed from: e */
    public T mo54074e() {
        return this.f53774b;
    }

    /* renamed from: f */
    public C22759yv mo54075f() {
        return this.f53775c;
    }

    public String toString() {
        return this.f53773a.toString();
    }

    /* renamed from: a */
    public static <T> acu<T> m50802a(T t, C22757yu yuVar) {
        Objects.requireNonNull(yuVar, "rawResponse == null");
        if (yuVar.mo57420d()) {
            return new acu<>(yuVar, t, (C22759yv) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    /* renamed from: a */
    public static <T> acu<T> m50800a(C22759yv yvVar, C22757yu yuVar) {
        Objects.requireNonNull(yvVar, "body == null");
        Objects.requireNonNull(yuVar, "rawResponse == null");
        if (!yuVar.mo57420d()) {
            return new acu<>(yuVar, (Object) null, yvVar);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    /* renamed from: a */
    public int mo54070a() {
        return this.f53773a.mo57418c();
    }
}
