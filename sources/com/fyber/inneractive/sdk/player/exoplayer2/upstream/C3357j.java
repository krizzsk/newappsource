package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import java.util.Arrays;
import p358af.C13437d;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.j */
public final class C3357j {

    /* renamed from: a */
    public final Uri f12004a;

    /* renamed from: b */
    public final byte[] f12005b;

    /* renamed from: c */
    public final long f12006c;

    /* renamed from: d */
    public final long f12007d;

    /* renamed from: e */
    public final long f12008e;

    /* renamed from: f */
    public final String f12009f;

    /* renamed from: g */
    public final int f12010g;

    public C3357j(Uri uri, int i) {
        this(uri, 0, -1, (String) null, i);
    }

    /* renamed from: a */
    public boolean mo14502a(int i) {
        return (this.f12010g & i) == i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("DataSpec[");
        k.append(this.f12004a);
        k.append(", ");
        k.append(Arrays.toString(this.f12005b));
        k.append(", ");
        k.append(this.f12006c);
        k.append(", ");
        k.append(this.f12007d);
        k.append(", ");
        k.append(this.f12008e);
        k.append(", ");
        k.append(this.f12009f);
        k.append(", ");
        return C13437d.m33707l(k, this.f12010g, "]");
    }

    public C3357j(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, (String) null, i);
    }

    public C3357j(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, (byte[]) null, j, j2, j3, str, i);
    }

    public C3357j(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        C3380a.m8505a(j >= 0);
        C3380a.m8505a(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C3380a.m8505a(z);
        this.f12004a = uri;
        this.f12005b = null;
        this.f12006c = j;
        this.f12007d = j2;
        this.f12008e = j3;
        this.f12009f = str;
        this.f12010g = i;
    }
}
