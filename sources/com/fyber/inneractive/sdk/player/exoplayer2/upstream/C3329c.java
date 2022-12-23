package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.c */
public final class C3329c implements C3353g {

    /* renamed from: a */
    public final AssetManager f11918a;

    /* renamed from: b */
    public final C3327a0<? super C3329c> f11919b;

    /* renamed from: c */
    public Uri f11920c;

    /* renamed from: d */
    public InputStream f11921d;

    /* renamed from: e */
    public long f11922e;

    /* renamed from: f */
    public boolean f11923f;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.c$a */
    public static final class C3330a extends IOException {
        public C3330a(IOException iOException) {
            super(iOException);
        }
    }

    public C3329c(Context context, C3327a0<? super C3329c> a0Var) {
        this.f11918a = context.getAssets();
        this.f11919b = a0Var;
    }

    /* renamed from: a */
    public long mo13780a(C3357j jVar) throws C3330a {
        try {
            Uri uri = jVar.f12004a;
            this.f11920c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            InputStream open = this.f11918a.open(path, 1);
            this.f11921d = open;
            if (open.skip(jVar.f12007d) >= jVar.f12007d) {
                long j = jVar.f12008e;
                if (j != -1) {
                    this.f11922e = j;
                } else {
                    long available = (long) this.f11921d.available();
                    this.f11922e = available;
                    if (available == 2147483647L) {
                        this.f11922e = -1;
                    }
                }
                this.f11923f = true;
                C3327a0<? super C3329c> a0Var = this.f11919b;
                if (a0Var != null) {
                    ((C3359l) a0Var).mo14508a(this, jVar);
                }
                return this.f11922e;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C3330a(e);
        }
    }

    public void close() throws C3330a {
        this.f11920c = null;
        try {
            InputStream inputStream = this.f11921d;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f11921d = null;
            if (this.f11923f) {
                this.f11923f = false;
                C3327a0<? super C3329c> a0Var = this.f11919b;
                if (a0Var != null) {
                    ((C3359l) a0Var).mo14507a(this);
                }
            }
        } catch (IOException e) {
            throw new C3330a(e);
        } catch (Throwable th) {
            this.f11921d = null;
            if (this.f11923f) {
                this.f11923f = false;
                C3327a0<? super C3329c> a0Var2 = this.f11919b;
                if (a0Var2 != null) {
                    ((C3359l) a0Var2).mo14507a(this);
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public int mo13779a(byte[] bArr, int i, int i2) throws C3330a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f11922e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C3330a(e);
            }
        }
        int read = this.f11921d.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f11922e;
            if (j2 != -1) {
                this.f11922e = j2 - ((long) read);
            }
            C3327a0<? super C3329c> a0Var = this.f11919b;
            if (a0Var != null) {
                C3359l lVar = (C3359l) a0Var;
                synchronized (lVar) {
                    lVar.f12022d += (long) read;
                }
            }
            return read;
        } else if (this.f11922e == -1) {
            return -1;
        } else {
            throw new C3330a(new EOFException());
        }
    }

    /* renamed from: a */
    public Uri mo13781a() {
        return this.f11920c;
    }
}
