package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.b */
public final class C3072b implements C3087g {

    /* renamed from: g */
    public static final byte[] f10545g = new byte[4096];

    /* renamed from: a */
    public final C3353g f10546a;

    /* renamed from: b */
    public final long f10547b;

    /* renamed from: c */
    public long f10548c;

    /* renamed from: d */
    public byte[] f10549d = new byte[SQLiteDatabase.OPEN_FULLMUTEX];

    /* renamed from: e */
    public int f10550e;

    /* renamed from: f */
    public int f10551f;

    public C3072b(C3353g gVar, long j, long j2) {
        this.f10546a = gVar;
        this.f10548c = j;
        this.f10547b = j2;
    }

    /* renamed from: a */
    public boolean mo14085a(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!mo14084a(i2, z)) {
            return false;
        }
        System.arraycopy(this.f10549d, this.f10550e - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: b */
    public int mo14086b(int i) throws IOException, InterruptedException {
        int min = Math.min(this.f10551f, i);
        mo14089d(min);
        if (min == 0) {
            byte[] bArr = f10545g;
            min = mo14082a(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        mo14083a(min);
        return min;
    }

    /* renamed from: c */
    public void mo14088c(int i) throws IOException, InterruptedException {
        int min = Math.min(this.f10551f, i);
        mo14089d(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            byte[] bArr = f10545g;
            i2 = mo14082a(bArr, -i2, Math.min(i, bArr.length + i2), i2, false);
        }
        mo14083a(i2);
    }

    /* renamed from: d */
    public final void mo14089d(int i) {
        byte[] bArr;
        int i2 = this.f10551f - i;
        this.f10551f = i2;
        this.f10550e = 0;
        byte[] bArr2 = this.f10549d;
        if (i2 < bArr2.length - 524288) {
            bArr = new byte[(SQLiteDatabase.OPEN_FULLMUTEX + i2)];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.f10549d = bArr;
    }

    /* renamed from: a */
    public boolean mo14084a(int i, boolean z) throws IOException, InterruptedException {
        int i2 = this.f10550e + i;
        byte[] bArr = this.f10549d;
        if (i2 > bArr.length) {
            int i3 = SQLiteDatabase.OPEN_FULLMUTEX + i2;
            int i4 = C3406u.f12148a;
            this.f10549d = Arrays.copyOf(this.f10549d, Math.max(i3, Math.min(bArr.length * 2, i2 + 524288)));
        }
        int min = Math.min(this.f10551f - this.f10550e, i);
        while (min < i) {
            min = mo14082a(this.f10549d, this.f10550e, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        int i5 = this.f10550e + i;
        this.f10550e = i5;
        this.f10551f = Math.max(this.f10551f, i5);
        return true;
    }

    /* renamed from: b */
    public boolean mo14087b(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int i3;
        int i4 = this.f10551f;
        if (i4 == 0) {
            i3 = 0;
        } else {
            int min = Math.min(i4, i2);
            System.arraycopy(this.f10549d, 0, bArr, i, min);
            mo14089d(min);
            i3 = min;
        }
        while (i3 < i2 && i3 != -1) {
            i3 = mo14082a(bArr, i, i2, i3, z);
        }
        mo14083a(i3);
        if (i3 != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public int mo14081a(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int i3 = this.f10551f;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.f10549d, 0, bArr, i, min);
            mo14089d(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = mo14082a(bArr, i, i2, 0, true);
        }
        mo14083a(i4);
        return i4;
    }

    /* renamed from: a */
    public final int mo14082a(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int a = this.f10546a.mo13779a(bArr, i + i3, i2 - i3);
            if (a != -1) {
                return i3 + a;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    /* renamed from: a */
    public final void mo14083a(int i) {
        if (i != -1) {
            this.f10548c += (long) i;
        }
    }
}
