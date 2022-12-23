package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.C2205a;
import com.bumptech.glide.load.resource.bitmap.C2208b;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import p025b6.C1492e;
import p025b6.C1493f;
import p060d6.C4397l;
import p072e6.C4564b;
import p072e6.C4566d;
import p146k6.C5498d;
import p311x6.C7165d;
import p311x6.C7174j;

/* renamed from: com.bumptech.glide.load.resource.bitmap.c */
public final class C2212c implements C1493f<InputStream, Bitmap> {

    /* renamed from: a */
    public final C2205a f7190a;

    /* renamed from: b */
    public final C4564b f7191b;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.c$a */
    public static class C2213a implements C2205a.C2207b {

        /* renamed from: a */
        public final RecyclableBufferedInputStream f7192a;

        /* renamed from: b */
        public final C7165d f7193b;

        public C2213a(RecyclableBufferedInputStream recyclableBufferedInputStream, C7165d dVar) {
            this.f7192a = recyclableBufferedInputStream;
            this.f7193b = dVar;
        }

        /* renamed from: a */
        public final void mo11007a(Bitmap bitmap, C4566d dVar) throws IOException {
            IOException iOException = this.f7193b.f22250c;
            if (iOException != null) {
                if (bitmap != null) {
                    dVar.mo20086d(bitmap);
                }
                throw iOException;
            }
        }

        /* renamed from: b */
        public final void mo11008b() {
            RecyclableBufferedInputStream recyclableBufferedInputStream = this.f7192a;
            synchronized (recyclableBufferedInputStream) {
                recyclableBufferedInputStream.f7157d = recyclableBufferedInputStream.f7155b.length;
            }
        }
    }

    public C2212c(C4564b bVar, C2205a aVar) {
        this.f7190a = aVar;
        this.f7191b = bVar;
    }

    /* renamed from: a */
    public final boolean mo5850a(Object obj, C1492e eVar) throws IOException {
        InputStream inputStream = (InputStream) obj;
        this.f7190a.getClass();
        return true;
    }

    /* renamed from: b */
    public final C4397l mo5851b(Object obj, int i, int i2, C1492e eVar) throws IOException {
        RecyclableBufferedInputStream recyclableBufferedInputStream;
        boolean z;
        C7165d dVar;
        InputStream inputStream = (InputStream) obj;
        if (inputStream instanceof RecyclableBufferedInputStream) {
            recyclableBufferedInputStream = (RecyclableBufferedInputStream) inputStream;
            z = false;
        } else {
            recyclableBufferedInputStream = new RecyclableBufferedInputStream(inputStream, this.f7191b);
            z = true;
        }
        ArrayDeque arrayDeque = C7165d.f22248d;
        synchronized (arrayDeque) {
            dVar = (C7165d) arrayDeque.poll();
        }
        if (dVar == null) {
            dVar = new C7165d();
        }
        dVar.f22249b = recyclableBufferedInputStream;
        C7174j jVar = new C7174j(dVar);
        C2213a aVar = new C2213a(recyclableBufferedInputStream, dVar);
        try {
            C2205a aVar2 = this.f7190a;
            C5498d a = aVar2.mo11005a(new C2208b.C2210b(aVar2.f7178c, jVar, aVar2.f7179d), i, i2, eVar, aVar);
            dVar.f22250c = null;
            dVar.f22249b = null;
            synchronized (arrayDeque) {
                arrayDeque.offer(dVar);
            }
            if (z) {
                recyclableBufferedInputStream.release();
            }
            return a;
        } catch (Throwable th) {
            dVar.f22250c = null;
            dVar.f22249b = null;
            ArrayDeque arrayDeque2 = C7165d.f22248d;
            synchronized (arrayDeque2) {
                arrayDeque2.offer(dVar);
                if (z) {
                    recyclableBufferedInputStream.release();
                }
                throw th;
            }
        }
    }
}
