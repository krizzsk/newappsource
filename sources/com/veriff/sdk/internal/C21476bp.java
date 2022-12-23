package com.veriff.sdk.internal;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.veriff.sdk.internal.C21512ci;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: com.veriff.sdk.internal.bp */
abstract class C21476bp<T> {

    /* renamed from: a */
    public final C21512ci f54008a;

    /* renamed from: b */
    public final C21525cl f54009b;

    /* renamed from: c */
    public final WeakReference<T> f54010c;

    /* renamed from: d */
    public final boolean f54011d;

    /* renamed from: e */
    public final int f54012e;

    /* renamed from: f */
    public final int f54013f;

    /* renamed from: g */
    public final int f54014g;

    /* renamed from: h */
    public final Drawable f54015h;

    /* renamed from: i */
    public final String f54016i;

    /* renamed from: j */
    public final Object f54017j;

    /* renamed from: k */
    public boolean f54018k;

    /* renamed from: l */
    public boolean f54019l;

    /* renamed from: com.veriff.sdk.internal.bp$a */
    public static class C21477a<M> extends WeakReference<M> {

        /* renamed from: a */
        public final C21476bp f54020a;

        public C21477a(C21476bp bpVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f54020a = bpVar;
        }
    }

    public C21476bp(C21512ci ciVar, T t, C21525cl clVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, boolean z) {
        C21477a aVar;
        this.f54008a = ciVar;
        this.f54009b = clVar;
        if (t == null) {
            aVar = null;
        } else {
            aVar = new C21477a(this, t, ciVar.f54116i);
        }
        this.f54010c = aVar;
        this.f54012e = i;
        this.f54013f = i2;
        this.f54011d = z;
        this.f54014g = i3;
        this.f54015h = drawable;
        this.f54016i = str;
        this.f54017j = obj == null ? this : obj;
    }

    /* renamed from: a */
    public void mo54394a() {
        this.f54019l = true;
    }

    /* renamed from: a */
    public abstract void mo54395a(Bitmap bitmap, C21512ci.C21518d dVar);

    /* renamed from: a */
    public abstract void mo54396a(Exception exc);

    /* renamed from: b */
    public C21525cl mo54397b() {
        return this.f54009b;
    }

    /* renamed from: c */
    public T mo54398c() {
        WeakReference<T> weakReference = this.f54010c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: d */
    public String mo54399d() {
        return this.f54016i;
    }

    /* renamed from: e */
    public boolean mo54400e() {
        return this.f54019l;
    }

    /* renamed from: f */
    public boolean mo54401f() {
        return this.f54018k;
    }

    /* renamed from: g */
    public int mo54402g() {
        return this.f54012e;
    }

    /* renamed from: h */
    public int mo54403h() {
        return this.f54013f;
    }

    /* renamed from: i */
    public C21512ci mo54404i() {
        return this.f54008a;
    }

    /* renamed from: j */
    public C21512ci.C21519e mo54405j() {
        return this.f54009b.f54169t;
    }

    /* renamed from: k */
    public Object mo54406k() {
        return this.f54017j;
    }
}
