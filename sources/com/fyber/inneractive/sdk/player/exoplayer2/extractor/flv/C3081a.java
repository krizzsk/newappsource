package com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.C3084d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3383c;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.a */
public final class C3081a extends C3084d {

    /* renamed from: e */
    public static final int[] f10589e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    public boolean f10590b;

    /* renamed from: c */
    public boolean f10591c;

    /* renamed from: d */
    public int f10592d;

    public C3081a(C3161n nVar) {
        super(nVar);
    }

    /* renamed from: a */
    public boolean mo14117a(C3393k kVar) throws C3084d.C3085a {
        String str;
        int i;
        if (!this.f10590b) {
            int l = kVar.mo14557l();
            int i2 = (l >> 4) & 15;
            this.f10592d = i2;
            if (i2 == 2) {
                this.f10608a.mo14098a(C3226i.m8178a((String) null, "audio/mpeg", (String) null, -1, -1, 1, f10589e[(l >> 2) & 3], -1, (List<byte[]>) null, (C3059a) null, 0, (String) null));
                this.f10591c = true;
            } else if (i2 == 7 || i2 == 8) {
                if (i2 == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                String str2 = str;
                if ((l & 1) == 1) {
                    i = 2;
                } else {
                    i = 3;
                }
                this.f10608a.mo14098a(C3226i.m8178a((String) null, str2, (String) null, -1, -1, 1, (int) ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED, i, (List<byte[]>) null, (C3059a) null, 0, (String) null));
                this.f10591c = true;
            } else if (i2 != 10) {
                StringBuilder k = C13555b.m33972k("Audio format not supported: ");
                k.append(this.f10592d);
                throw new C3084d.C3085a(k.toString());
            }
            this.f10590b = true;
        } else {
            kVar.mo14551f(1);
        }
        return true;
    }

    /* renamed from: b */
    public void mo14118b(C3393k kVar, long j) {
        C3393k kVar2 = kVar;
        if (this.f10592d == 2) {
            int a = kVar.mo14537a();
            this.f10608a.mo14099a(kVar2, a);
            this.f10608a.mo14096a(j, 1, a, 0, (byte[]) null);
            return;
        }
        int l = kVar.mo14557l();
        if (l == 0 && !this.f10591c) {
            int a2 = kVar.mo14537a();
            byte[] bArr = new byte[a2];
            System.arraycopy(kVar2.f12121a, kVar2.f12122b, bArr, 0, a2);
            kVar2.f12122b += a2;
            Pair<Integer, Integer> a3 = C3383c.m8512a(bArr);
            this.f10608a.mo14098a(C3226i.m8178a((String) null, "audio/mp4a-latm", (String) null, -1, -1, ((Integer) a3.second).intValue(), ((Integer) a3.first).intValue(), -1, (List<byte[]>) Collections.singletonList(bArr), (C3059a) null, 0, (String) null));
            this.f10591c = true;
        } else if (this.f10592d != 10 || l == 1) {
            int a4 = kVar.mo14537a();
            this.f10608a.mo14099a(kVar2, a4);
            this.f10608a.mo14096a(j, 1, a4, 0, (byte[]) null);
        }
    }
}
