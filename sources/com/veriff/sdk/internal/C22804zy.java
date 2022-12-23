package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C22740ym;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.veriff.sdk.internal.zy */
public final class C22804zy implements C22740ym.C22741a {

    /* renamed from: a */
    private final List<C22740ym> f57856a;

    /* renamed from: b */
    private final C22794zr f57857b;

    /* renamed from: c */
    private final C22784zk f57858c;

    /* renamed from: d */
    private final int f57859d;

    /* renamed from: e */
    private final C22752ys f57860e;

    /* renamed from: f */
    private final C22713xw f57861f;

    /* renamed from: g */
    private final int f57862g;

    /* renamed from: h */
    private final int f57863h;

    /* renamed from: i */
    private final int f57864i;

    /* renamed from: j */
    private int f57865j;

    public C22804zy(List<C22740ym> list, C22794zr zrVar, C22784zk zkVar, int i, C22752ys ysVar, C22713xw xwVar, int i2, int i3, int i4) {
        this.f57856a = list;
        this.f57857b = zrVar;
        this.f57858c = zkVar;
        this.f57859d = i;
        this.f57860e = ysVar;
        this.f57861f = xwVar;
        this.f57862g = i2;
        this.f57863h = i3;
        this.f57864i = i4;
    }

    /* renamed from: a */
    public C22740ym.C22741a mo57321a(int i, TimeUnit timeUnit) {
        return new C22804zy(this.f57856a, this.f57857b, this.f57858c, this.f57859d, this.f57860e, this.f57861f, C22766za.m55819a("timeout", (long) i, timeUnit), this.f57863h, this.f57864i);
    }

    /* renamed from: b */
    public int mo57324b() {
        return this.f57862g;
    }

    /* renamed from: c */
    public int mo57326c() {
        return this.f57863h;
    }

    /* renamed from: d */
    public int mo57328d() {
        return this.f57864i;
    }

    /* renamed from: e */
    public C22794zr mo57557e() {
        return this.f57857b;
    }

    /* renamed from: f */
    public C22784zk mo57558f() {
        C22784zk zkVar = this.f57858c;
        if (zkVar != null) {
            return zkVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public C22740ym.C22741a mo57325b(int i, TimeUnit timeUnit) {
        return new C22804zy(this.f57856a, this.f57857b, this.f57858c, this.f57859d, this.f57860e, this.f57861f, this.f57862g, C22766za.m55819a("timeout", (long) i, timeUnit), this.f57864i);
    }

    /* renamed from: c */
    public C22740ym.C22741a mo57327c(int i, TimeUnit timeUnit) {
        return new C22804zy(this.f57856a, this.f57857b, this.f57858c, this.f57859d, this.f57860e, this.f57861f, this.f57862g, this.f57863h, C22766za.m55819a("timeout", (long) i, timeUnit));
    }

    /* renamed from: a */
    public C22752ys mo57322a() {
        return this.f57860e;
    }

    /* renamed from: a */
    public C22757yu mo57323a(C22752ys ysVar) throws IOException {
        return mo57556a(ysVar, this.f57857b, this.f57858c);
    }

    /* renamed from: a */
    public C22757yu mo57556a(C22752ys ysVar, C22794zr zrVar, C22784zk zkVar) throws IOException {
        if (this.f57859d < this.f57856a.size()) {
            this.f57865j++;
            C22784zk zkVar2 = this.f57858c;
            if (zkVar2 != null && !zkVar2.mo57491a().mo57516a(ysVar.mo57390a())) {
                StringBuilder k = C13555b.m33972k("network interceptor ");
                k.append(this.f57856a.get(this.f57859d - 1));
                k.append(" must retain the same host and port");
                throw new IllegalStateException(k.toString());
            } else if (this.f57858c == null || this.f57865j <= 1) {
                C22804zy zyVar = new C22804zy(this.f57856a, zrVar, zkVar, this.f57859d + 1, ysVar, this.f57861f, this.f57862g, this.f57863h, this.f57864i);
                C22740ym ymVar = this.f57856a.get(this.f57859d);
                C22757yu a = ymVar.mo53658a(zyVar);
                if (zkVar != null && this.f57859d + 1 < this.f57856a.size() && zyVar.f57865j != 1) {
                    throw new IllegalStateException("network interceptor " + ymVar + " must call proceed() exactly once");
                } else if (a == null) {
                    throw new NullPointerException("interceptor " + ymVar + " returned null");
                } else if (a.mo57424h() != null) {
                    return a;
                } else {
                    throw new IllegalStateException("interceptor " + ymVar + " returned a response with no body");
                }
            } else {
                StringBuilder k2 = C13555b.m33972k("network interceptor ");
                k2.append(this.f57856a.get(this.f57859d - 1));
                k2.append(" must call proceed() exactly once");
                throw new IllegalStateException(k2.toString());
            }
        } else {
            throw new AssertionError();
        }
    }
}
