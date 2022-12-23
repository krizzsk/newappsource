package com.bumptech.glide.load.engine;

import p025b6.C1487b;
import p060d6.C4397l;
import p584jl.C17885a;

/* renamed from: com.bumptech.glide.load.engine.g */
public final class C2185g<Z> implements C4397l<Z> {

    /* renamed from: b */
    public final boolean f7119b;

    /* renamed from: c */
    public final boolean f7120c;

    /* renamed from: d */
    public final C4397l<Z> f7121d;

    /* renamed from: e */
    public final C2186a f7122e;

    /* renamed from: f */
    public final C1487b f7123f;

    /* renamed from: g */
    public int f7124g;

    /* renamed from: h */
    public boolean f7125h;

    /* renamed from: com.bumptech.glide.load.engine.g$a */
    public interface C2186a {
        /* renamed from: a */
        void mo10961a(C1487b bVar, C2185g<?> gVar);
    }

    public C2185g(C4397l<Z> lVar, boolean z, boolean z2, C1487b bVar, C2186a aVar) {
        C17885a.m44458r(lVar);
        this.f7121d = lVar;
        this.f7119b = z;
        this.f7120c = z2;
        this.f7123f = bVar;
        C17885a.m44458r(aVar);
        this.f7122e = aVar;
    }

    /* renamed from: a */
    public final synchronized void mo10979a() {
        if (this.f7124g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f7125h) {
            this.f7125h = true;
            if (this.f7120c) {
                this.f7121d.mo10979a();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    /* renamed from: b */
    public final Class<Z> mo10980b() {
        return this.f7121d.mo10980b();
    }

    /* renamed from: c */
    public final synchronized void mo10981c() {
        if (!this.f7125h) {
            this.f7124g++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    /* renamed from: d */
    public final void mo10982d() {
        boolean z;
        synchronized (this) {
            int i = this.f7124g;
            if (i > 0) {
                z = true;
                int i2 = i - 1;
                this.f7124g = i2;
                if (i2 != 0) {
                    z = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z) {
            this.f7122e.mo10961a(this.f7123f, this);
        }
    }

    /* renamed from: e */
    public final int mo10983e() {
        return this.f7121d.mo10983e();
    }

    public final Z get() {
        return this.f7121d.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f7119b + ", listener=" + this.f7122e + ", key=" + this.f7123f + ", acquired=" + this.f7124g + ", isRecycled=" + this.f7125h + ", resource=" + this.f7121d + '}';
    }
}
