package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3351f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C3331a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3397o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b */
public final class C3334b implements C3351f {

    /* renamed from: a */
    public final C3331a f11924a;

    /* renamed from: b */
    public final long f11925b;

    /* renamed from: c */
    public final int f11926c;

    /* renamed from: d */
    public C3357j f11927d;

    /* renamed from: e */
    public File f11928e;

    /* renamed from: f */
    public OutputStream f11929f;

    /* renamed from: g */
    public FileOutputStream f11930g;

    /* renamed from: h */
    public long f11931h;

    /* renamed from: i */
    public long f11932i;

    /* renamed from: j */
    public C3397o f11933j;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.b$a */
    public static class C3335a extends C3331a.C3332a {
        public C3335a(IOException iOException) {
            super(iOException);
        }
    }

    public C3334b(C3331a aVar, long j, int i) {
        this.f11924a = (C3331a) C3380a.m8503a(aVar);
        this.f11925b = j;
        this.f11926c = i;
    }

    /* renamed from: a */
    public void mo14473a(C3357j jVar) throws C3335a {
        if (jVar.f12008e != -1 || jVar.mo14502a(2)) {
            this.f11927d = jVar;
            this.f11932i = 0;
            try {
                mo14475b();
            } catch (IOException e) {
                throw new C3335a(e);
            }
        } else {
            this.f11927d = null;
        }
    }

    /* renamed from: b */
    public final void mo14475b() throws IOException {
        long j;
        long j2 = this.f11927d.f12008e;
        if (j2 == -1) {
            j = this.f11925b;
        } else {
            j = Math.min(j2 - this.f11932i, this.f11925b);
        }
        long j3 = j;
        C3331a aVar = this.f11924a;
        C3357j jVar = this.f11927d;
        this.f11928e = aVar.mo14462a(jVar.f12009f, this.f11932i + jVar.f12006c, j3);
        FileOutputStream fileOutputStream = new FileOutputStream(this.f11928e);
        this.f11930g = fileOutputStream;
        if (this.f11926c > 0) {
            C3397o oVar = this.f11933j;
            if (oVar == null) {
                this.f11933j = new C3397o(this.f11930g, this.f11926c);
            } else {
                oVar.mo14576a(fileOutputStream);
            }
            this.f11929f = this.f11933j;
        } else {
            this.f11929f = fileOutputStream;
        }
        this.f11931h = 0;
    }

    public void close() throws C3335a {
        if (this.f11927d != null) {
            try {
                mo14472a();
            } catch (IOException e) {
                throw new C3335a(e);
            }
        }
    }

    /* renamed from: a */
    public void mo14474a(byte[] bArr, int i, int i2) throws C3335a {
        if (this.f11927d != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.f11931h == this.f11925b) {
                        mo14472a();
                        mo14475b();
                    }
                    int min = (int) Math.min((long) (i2 - i3), this.f11925b - this.f11931h);
                    this.f11929f.write(bArr, i + i3, min);
                    i3 += min;
                    long j = (long) min;
                    this.f11931h += j;
                    this.f11932i += j;
                } catch (IOException e) {
                    throw new C3335a(e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo14472a() throws IOException {
        OutputStream outputStream = this.f11929f;
        if (outputStream != null) {
            try {
                outputStream.flush();
                this.f11930g.getFD().sync();
                C3406u.m8594a((Closeable) this.f11929f);
                this.f11929f = null;
                File file = this.f11928e;
                this.f11928e = null;
                this.f11924a.mo14464a(file);
            } catch (Throwable th) {
                C3406u.m8594a((Closeable) this.f11929f);
                this.f11929f = null;
                File file2 = this.f11928e;
                this.f11928e = null;
                file2.delete();
                throw th;
            }
        }
    }
}
