package com.veriff.sdk.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: com.veriff.sdk.internal.cb */
public final class C21500cb implements C21486bs {

    /* renamed from: b */
    public final LruCache<String, C21502a> f54077b;

    /* renamed from: com.veriff.sdk.internal.cb$a */
    public static final class C21502a {

        /* renamed from: a */
        public final Bitmap f54078a;

        /* renamed from: b */
        public final int f54079b;

        public C21502a(Bitmap bitmap, int i) {
            this.f54078a = bitmap;
            this.f54079b = i;
        }
    }

    public C21500cb(Context context) {
        this(C21537cs.m51508b(context));
    }

    /* renamed from: a */
    public Bitmap mo54434a(String str) {
        C21502a aVar = this.f54077b.get(str);
        if (aVar != null) {
            return aVar.f54078a;
        }
        return null;
    }

    /* renamed from: b */
    public int mo54436b() {
        return this.f54077b.maxSize();
    }

    public C21500cb(int i) {
        this.f54077b = new LruCache<String, C21502a>(this, i) {
            /* renamed from: a */
            public int sizeOf(String str, C21502a aVar) {
                return aVar.f54079b;
            }
        };
    }

    /* renamed from: a */
    public void mo54435a(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        int a = C21537cs.m51493a(bitmap);
        if (a > mo54436b()) {
            this.f54077b.remove(str);
        } else {
            this.f54077b.put(str, new C21502a(bitmap, a));
        }
    }

    /* renamed from: a */
    public int mo54433a() {
        return this.f54077b.size();
    }
}
