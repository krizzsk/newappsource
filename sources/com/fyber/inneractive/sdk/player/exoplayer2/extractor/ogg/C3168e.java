package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.appboy.support.ValidationUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.C3230l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.e */
public final class C3168e {

    /* renamed from: h */
    public static final int f11238h = C3406u.m8589a("OggS");

    /* renamed from: a */
    public int f11239a;

    /* renamed from: b */
    public long f11240b;

    /* renamed from: c */
    public int f11241c;

    /* renamed from: d */
    public int f11242d;

    /* renamed from: e */
    public int f11243e;

    /* renamed from: f */
    public final int[] f11244f = new int[ValidationUtils.APPBOY_STRING_MAX_LENGTH];

    /* renamed from: g */
    public final C3393k f11245g = new C3393k((int) ValidationUtils.APPBOY_STRING_MAX_LENGTH);

    /* renamed from: a */
    public void mo14234a() {
        this.f11239a = 0;
        this.f11240b = 0;
        this.f11241c = 0;
        this.f11242d = 0;
        this.f11243e = 0;
    }

    /* renamed from: a */
    public boolean mo14235a(C3087g gVar, boolean z) throws IOException, InterruptedException {
        this.f11245g.mo14563r();
        mo14234a();
        C3072b bVar = (C3072b) gVar;
        long j = bVar.f10547b;
        if (!(j == -1 || j - (bVar.f10548c + ((long) bVar.f10550e)) >= 27) || !bVar.mo14085a(this.f11245g.f12121a, 0, 27, true)) {
            if (z) {
                return false;
            }
            throw new EOFException();
        } else if (this.f11245g.mo14558m() != ((long) f11238h)) {
            if (z) {
                return false;
            }
            throw new C3230l("expected OggS capture pattern at begin of page");
        } else if (this.f11245g.mo14557l() == 0) {
            this.f11239a = this.f11245g.mo14557l();
            C3393k kVar = this.f11245g;
            byte[] bArr = kVar.f12121a;
            int i = kVar.f12122b;
            int i2 = i + 1;
            int i3 = i2 + 1;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            kVar.f12122b = i8 + 1;
            this.f11240b = (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 40) | ((((long) bArr[i7]) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
            kVar.mo14550f();
            this.f11245g.mo14550f();
            this.f11245g.mo14550f();
            int l = this.f11245g.mo14557l();
            this.f11241c = l;
            this.f11242d = l + 27;
            this.f11245g.mo14563r();
            bVar.mo14085a(this.f11245g.f12121a, 0, this.f11241c, false);
            for (int i9 = 0; i9 < this.f11241c; i9++) {
                this.f11244f[i9] = this.f11245g.mo14557l();
                this.f11243e += this.f11244f[i9];
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw new C3230l("unsupported bit stream revision");
        }
    }
}
