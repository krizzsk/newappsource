package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.q */
public final class C3364q implements C3353g {

    /* renamed from: a */
    public final C3327a0<? super C3364q> f12057a;

    /* renamed from: b */
    public RandomAccessFile f12058b;

    /* renamed from: c */
    public Uri f12059c;

    /* renamed from: d */
    public long f12060d;

    /* renamed from: e */
    public boolean f12061e;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.q$a */
    public static class C3365a extends IOException {
        public C3365a(IOException iOException) {
            super(iOException);
        }
    }

    public C3364q(C3327a0<? super C3364q> a0Var) {
        this.f12057a = a0Var;
    }

    /* renamed from: a */
    public long mo13780a(C3357j jVar) throws C3365a {
        try {
            this.f12059c = jVar.f12004a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(jVar.f12004a.getPath(), "r");
            this.f12058b = randomAccessFile;
            randomAccessFile.seek(jVar.f12007d);
            long j = jVar.f12008e;
            if (j == -1) {
                j = this.f12058b.length() - jVar.f12007d;
            }
            this.f12060d = j;
            if (j >= 0) {
                this.f12061e = true;
                C3327a0<? super C3364q> a0Var = this.f12057a;
                if (a0Var != null) {
                    ((C3359l) a0Var).mo14508a(this, jVar);
                }
                return this.f12060d;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new C3365a(e);
        }
    }

    public void close() throws C3365a {
        this.f12059c = null;
        try {
            RandomAccessFile randomAccessFile = this.f12058b;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f12058b = null;
            if (this.f12061e) {
                this.f12061e = false;
                C3327a0<? super C3364q> a0Var = this.f12057a;
                if (a0Var != null) {
                    ((C3359l) a0Var).mo14507a(this);
                }
            }
        } catch (IOException e) {
            throw new C3365a(e);
        } catch (Throwable th) {
            this.f12058b = null;
            if (this.f12061e) {
                this.f12061e = false;
                C3327a0<? super C3364q> a0Var2 = this.f12057a;
                if (a0Var2 != null) {
                    ((C3359l) a0Var2).mo14507a(this);
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public int mo13779a(byte[] bArr, int i, int i2) throws C3365a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f12060d;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.f12058b.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                long j2 = (long) read;
                this.f12060d -= j2;
                C3327a0<? super C3364q> a0Var = this.f12057a;
                if (a0Var != null) {
                    C3359l lVar = (C3359l) a0Var;
                    synchronized (lVar) {
                        lVar.f12022d += j2;
                    }
                }
            }
            return read;
        } catch (IOException e) {
            throw new C3365a(e);
        }
    }

    /* renamed from: a */
    public Uri mo13781a() {
        return this.f12059c;
    }
}
