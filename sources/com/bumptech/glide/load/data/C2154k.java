package com.bumptech.glide.load.data;

import com.bumptech.glide.load.data.C2144e;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import p072e6.C4564b;

/* renamed from: com.bumptech.glide.load.data.k */
public final class C2154k implements C2144e<InputStream> {

    /* renamed from: a */
    public final RecyclableBufferedInputStream f6974a;

    /* renamed from: com.bumptech.glide.load.data.k$a */
    public static final class C2155a implements C2144e.C2145a<InputStream> {

        /* renamed from: a */
        public final C4564b f6975a;

        public C2155a(C4564b bVar) {
            this.f6975a = bVar;
        }

        /* renamed from: a */
        public final Class<InputStream> mo10902a() {
            return InputStream.class;
        }

        /* renamed from: b */
        public final C2144e mo10903b(Object obj) {
            return new C2154k((InputStream) obj, this.f6975a);
        }
    }

    public C2154k(InputStream inputStream, C4564b bVar) {
        RecyclableBufferedInputStream recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, bVar);
        this.f6974a = recyclableBufferedInputStream;
        recyclableBufferedInputStream.mark(5242880);
    }

    /* renamed from: a */
    public final Object mo10898a() throws IOException {
        this.f6974a.reset();
        return this.f6974a;
    }

    /* renamed from: b */
    public final void mo10899b() {
        this.f6974a.release();
    }
}
