package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3351f;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3355h;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3379z;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.C3331a;
import java.io.IOException;
import java.io.InterruptedIOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.d */
public final class C3337d implements C3353g {

    /* renamed from: a */
    public final C3331a f11936a;

    /* renamed from: b */
    public final C3353g f11937b;

    /* renamed from: c */
    public final C3353g f11938c;

    /* renamed from: d */
    public final C3353g f11939d;

    /* renamed from: e */
    public final C3338a f11940e;

    /* renamed from: f */
    public final boolean f11941f;

    /* renamed from: g */
    public final boolean f11942g;

    /* renamed from: h */
    public final boolean f11943h;

    /* renamed from: i */
    public C3353g f11944i;

    /* renamed from: j */
    public boolean f11945j;

    /* renamed from: k */
    public Uri f11946k;

    /* renamed from: l */
    public int f11947l;

    /* renamed from: m */
    public String f11948m;

    /* renamed from: n */
    public long f11949n;

    /* renamed from: o */
    public long f11950o;

    /* renamed from: p */
    public C3341g f11951p;

    /* renamed from: q */
    public boolean f11952q;

    /* renamed from: r */
    public boolean f11953r;

    /* renamed from: s */
    public long f11954s;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.d$a */
    public interface C3338a {
        /* renamed from: a */
        void mo14480a(long j, long j2);
    }

    public C3337d(C3331a aVar, C3353g gVar, C3353g gVar2, C3351f fVar, int i, C3338a aVar2) {
        boolean z;
        boolean z2;
        this.f11936a = aVar;
        this.f11937b = gVar2;
        boolean z3 = false;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f11941f = z;
        if ((i & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f11942g = z2;
        this.f11943h = (i & 4) != 0 ? true : z3;
        this.f11939d = gVar;
        if (fVar != null) {
            this.f11938c = new C3379z(gVar, fVar);
        } else {
            this.f11938c = null;
        }
        this.f11940e = aVar2;
    }

    /* renamed from: a */
    public long mo13780a(C3357j jVar) throws IOException {
        try {
            Uri uri = jVar.f12004a;
            this.f11946k = uri;
            this.f11947l = jVar.f12010g;
            String str = jVar.f12009f;
            if (str == null) {
                str = uri.toString();
            }
            this.f11948m = str;
            this.f11949n = jVar.f12007d;
            boolean z = (this.f11942g && this.f11952q) || (jVar.f12008e == -1 && this.f11943h);
            this.f11953r = z;
            long j = jVar.f12008e;
            if (j == -1) {
                if (!z) {
                    long a = this.f11936a.mo14461a(str);
                    this.f11950o = a;
                    if (a != -1) {
                        long j2 = a - jVar.f12007d;
                        this.f11950o = j2;
                        if (j2 <= 0) {
                            throw new C3355h(0);
                        }
                    }
                    mo14478a(true);
                    return this.f11950o;
                }
            }
            this.f11950o = j;
            mo14478a(true);
            return this.f11950o;
        } catch (IOException e) {
            mo14477a(e);
            throw e;
        }
    }

    /* renamed from: b */
    public final void mo14479b() throws IOException {
        C3353g gVar = this.f11944i;
        if (gVar != null) {
            try {
                gVar.close();
                this.f11944i = null;
                this.f11945j = false;
            } finally {
                C3341g gVar2 = this.f11951p;
                if (gVar2 != null) {
                    this.f11936a.mo14467b(gVar2);
                    this.f11951p = null;
                }
            }
        }
    }

    public void close() throws IOException {
        this.f11946k = null;
        C3338a aVar = this.f11940e;
        if (aVar != null && this.f11954s > 0) {
            aVar.mo14480a(this.f11936a.mo14460a(), this.f11954s);
            this.f11954s = 0;
        }
        try {
            mo14479b();
        } catch (IOException e) {
            mo14477a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public int mo13779a(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f11950o == 0) {
            return -1;
        }
        try {
            int a = this.f11944i.mo13779a(bArr, i, i2);
            if (a >= 0) {
                if (this.f11944i == this.f11937b) {
                    this.f11954s += (long) a;
                }
                long j = (long) a;
                this.f11949n += j;
                long j2 = this.f11950o;
                if (j2 != -1) {
                    this.f11950o = j2 - j;
                }
            } else {
                if (this.f11945j) {
                    long j3 = this.f11949n;
                    if (this.f11944i == this.f11938c) {
                        this.f11936a.mo14465a(this.f11948m, j3);
                    }
                    this.f11950o = 0;
                }
                mo14479b();
                long j4 = this.f11950o;
                if ((j4 > 0 || j4 == -1) && mo14478a(false)) {
                    return mo13779a(bArr, i, i2);
                }
            }
            return a;
        } catch (IOException e) {
            mo14477a(e);
            throw e;
        }
    }

    /* renamed from: a */
    public Uri mo13781a() {
        C3353g gVar = this.f11944i;
        return gVar == this.f11939d ? gVar.mo13781a() : this.f11946k;
    }

    /* renamed from: a */
    public final boolean mo14478a(boolean z) throws IOException {
        C3341g gVar;
        C3357j jVar;
        IOException iOException = null;
        if (this.f11953r) {
            gVar = null;
        } else if (this.f11941f) {
            try {
                gVar = this.f11936a.mo14466b(this.f11948m, this.f11949n);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        } else {
            gVar = this.f11936a.mo14468c(this.f11948m, this.f11949n);
        }
        boolean z2 = true;
        if (gVar == null) {
            this.f11944i = this.f11939d;
            Uri uri = this.f11946k;
            long j = this.f11949n;
            jVar = new C3357j(uri, (byte[]) null, j, j, this.f11950o, this.f11948m, this.f11947l);
        } else if (gVar.f11962d) {
            Uri fromFile = Uri.fromFile(gVar.f11963e);
            long j2 = this.f11949n - gVar.f11960b;
            long j3 = gVar.f11961c - j2;
            long j4 = this.f11950o;
            if (j4 != -1) {
                j3 = Math.min(j3, j4);
            }
            C3357j jVar2 = new C3357j(fromFile, (byte[]) null, this.f11949n, j2, j3, this.f11948m, this.f11947l);
            this.f11944i = this.f11937b;
            jVar = jVar2;
        } else {
            long j5 = gVar.f11961c;
            if (j5 == -1) {
                j5 = this.f11950o;
            } else {
                long j6 = this.f11950o;
                if (j6 != -1) {
                    j5 = Math.min(j5, j6);
                }
            }
            Uri uri2 = this.f11946k;
            long j7 = this.f11949n;
            jVar = new C3357j(uri2, (byte[]) null, j7, j7, j5, this.f11948m, this.f11947l);
            C3353g gVar2 = this.f11938c;
            if (gVar2 != null) {
                this.f11944i = gVar2;
                this.f11951p = gVar;
            } else {
                this.f11944i = this.f11939d;
                this.f11936a.mo14467b(gVar);
            }
        }
        this.f11945j = jVar.f12008e == -1;
        long j8 = 0;
        try {
            j8 = this.f11944i.mo13780a(jVar);
        } catch (IOException e) {
            if (!z && this.f11945j) {
                Throwable th = e;
                while (true) {
                    if (th != null) {
                        if ((th instanceof C3355h) && ((C3355h) th).f11997a == 0) {
                            break;
                        }
                        th = th.getCause();
                    } else {
                        break;
                    }
                }
            }
            iOException = e;
            if (iOException == null) {
                z2 = false;
            } else {
                throw iOException;
            }
        }
        if (this.f11945j && j8 != -1) {
            this.f11950o = j8;
            long j9 = jVar.f12007d + j8;
            if (this.f11944i == this.f11938c) {
                this.f11936a.mo14465a(this.f11948m, j9);
            }
        }
        return z2;
    }

    /* renamed from: a */
    public final void mo14477a(IOException iOException) {
        if (this.f11944i == this.f11937b || (iOException instanceof C3331a.C3332a)) {
            this.f11952q = true;
        }
    }
}
