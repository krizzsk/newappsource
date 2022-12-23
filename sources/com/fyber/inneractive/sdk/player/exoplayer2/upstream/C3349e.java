package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.e */
public final class C3349e implements C3353g {

    /* renamed from: a */
    public final ContentResolver f11990a;

    /* renamed from: b */
    public final C3327a0<? super C3349e> f11991b;

    /* renamed from: c */
    public Uri f11992c;

    /* renamed from: d */
    public AssetFileDescriptor f11993d;

    /* renamed from: e */
    public InputStream f11994e;

    /* renamed from: f */
    public long f11995f;

    /* renamed from: g */
    public boolean f11996g;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.e$a */
    public static class C3350a extends IOException {
        public C3350a(IOException iOException) {
            super(iOException);
        }
    }

    public C3349e(Context context, C3327a0<? super C3349e> a0Var) {
        this.f11990a = context.getContentResolver();
        this.f11991b = a0Var;
    }

    /* renamed from: a */
    public long mo13780a(C3357j jVar) throws C3350a {
        try {
            Uri uri = jVar.f12004a;
            this.f11992c = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.f11990a.openAssetFileDescriptor(uri, "r");
            this.f11993d = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                this.f11994e = new FileInputStream(this.f11993d.getFileDescriptor());
                long startOffset = this.f11993d.getStartOffset();
                if (this.f11994e.skip(jVar.f12007d + startOffset) - startOffset == jVar.f12007d) {
                    long j = jVar.f12008e;
                    if (j != -1) {
                        this.f11995f = j;
                    } else {
                        long length = this.f11993d.getLength();
                        this.f11995f = length;
                        if (length == -1) {
                            long available = (long) this.f11994e.available();
                            this.f11995f = available;
                            if (available == 0) {
                                this.f11995f = -1;
                            }
                        }
                    }
                    this.f11996g = true;
                    C3327a0<? super C3349e> a0Var = this.f11991b;
                    if (a0Var != null) {
                        ((C3359l) a0Var).mo14508a(this, jVar);
                    }
                    return this.f11995f;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException("Could not open file descriptor for: " + this.f11992c);
        } catch (IOException e) {
            throw new C3350a(e);
        }
    }

    public void close() throws C3350a {
        this.f11992c = null;
        try {
            InputStream inputStream = this.f11994e;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f11994e = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f11993d;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f11993d = null;
                if (this.f11996g) {
                    this.f11996g = false;
                    C3327a0<? super C3349e> a0Var = this.f11991b;
                    if (a0Var != null) {
                        ((C3359l) a0Var).mo14507a(this);
                    }
                }
            } catch (IOException e) {
                throw new C3350a(e);
            } catch (Throwable th) {
                this.f11993d = null;
                if (this.f11996g) {
                    this.f11996g = false;
                    C3327a0<? super C3349e> a0Var2 = this.f11991b;
                    if (a0Var2 != null) {
                        ((C3359l) a0Var2).mo14507a(this);
                    }
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new C3350a(e2);
        } catch (Throwable th2) {
            this.f11994e = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f11993d;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f11993d = null;
                if (this.f11996g) {
                    this.f11996g = false;
                    C3327a0<? super C3349e> a0Var3 = this.f11991b;
                    if (a0Var3 != null) {
                        ((C3359l) a0Var3).mo14507a(this);
                    }
                }
                throw th2;
            } catch (IOException e3) {
                throw new C3350a(e3);
            } catch (Throwable th3) {
                this.f11993d = null;
                if (this.f11996g) {
                    this.f11996g = false;
                    C3327a0<? super C3349e> a0Var4 = this.f11991b;
                    if (a0Var4 != null) {
                        ((C3359l) a0Var4).mo14507a(this);
                    }
                }
                throw th3;
            }
        }
    }

    /* renamed from: a */
    public int mo13779a(byte[] bArr, int i, int i2) throws C3350a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f11995f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new C3350a(e);
            }
        }
        int read = this.f11994e.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f11995f;
            if (j2 != -1) {
                this.f11995f = j2 - ((long) read);
            }
            C3327a0<? super C3349e> a0Var = this.f11991b;
            if (a0Var != null) {
                C3359l lVar = (C3359l) a0Var;
                synchronized (lVar) {
                    lVar.f12022d += (long) read;
                }
            }
            return read;
        } else if (this.f11995f == -1) {
            return -1;
        } else {
            throw new C3350a(new EOFException());
        }
    }

    /* renamed from: a */
    public Uri mo13781a() {
        return this.f11992c;
    }
}
