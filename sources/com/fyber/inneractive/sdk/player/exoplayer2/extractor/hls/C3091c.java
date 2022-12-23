package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import android.os.SystemClock;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3106a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C3113e;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3304r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C3277a;
import com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.C3279c;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3311a;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3321e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c */
public class C3091c {

    /* renamed from: a */
    public final C3353g f10619a;

    /* renamed from: b */
    public final C3353g f10620b;

    /* renamed from: c */
    public final C3104k f10621c;

    /* renamed from: d */
    public final C3106a.C3107a[] f10622d;

    /* renamed from: e */
    public final C3113e f10623e;

    /* renamed from: f */
    public final C3304r f10624f;

    /* renamed from: g */
    public final List<C3226i> f10625g;

    /* renamed from: h */
    public boolean f10626h;

    /* renamed from: i */
    public byte[] f10627i;

    /* renamed from: j */
    public IOException f10628j;

    /* renamed from: k */
    public C3106a.C3107a f10629k;

    /* renamed from: l */
    public Uri f10630l;

    /* renamed from: m */
    public byte[] f10631m;

    /* renamed from: n */
    public String f10632n;

    /* renamed from: o */
    public byte[] f10633o;

    /* renamed from: p */
    public C3321e f10634p;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$a */
    public static final class C3092a extends C3279c {

        /* renamed from: l */
        public final String f10635l;

        /* renamed from: m */
        public byte[] f10636m;

        public C3092a(C3353g gVar, C3357j jVar, C3226i iVar, int i, Object obj, byte[] bArr, String str) {
            super(gVar, jVar, 3, iVar, i, obj, bArr);
            this.f10635l = str;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$b */
    public static final class C3093b {

        /* renamed from: a */
        public C3277a f10637a;

        /* renamed from: b */
        public boolean f10638b;

        /* renamed from: c */
        public C3106a.C3107a f10639c;

        public C3093b() {
            mo14127a();
        }

        /* renamed from: a */
        public void mo14127a() {
            this.f10637a = null;
            this.f10638b = false;
            this.f10639c = null;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.c$c */
    public static final class C3094c extends C3311a {

        /* renamed from: g */
        public int f10640g;

        public C3094c(C3304r rVar, int[] iArr) {
            super(rVar, iArr);
            this.f10640g = mo14438a(rVar.mo14431a(0));
        }

        /* renamed from: a */
        public void mo14128a(long j) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (mo14443b(this.f10640g, elapsedRealtime)) {
                for (int i = this.f11882b - 1; i >= 0; i--) {
                    if (!mo14443b(i, elapsedRealtime)) {
                        this.f10640g = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        /* renamed from: d */
        public int mo14129d() {
            return 0;
        }

        /* renamed from: e */
        public int mo14130e() {
            return this.f10640g;
        }

        /* renamed from: g */
        public Object mo14131g() {
            return null;
        }
    }

    public C3091c(C3113e eVar, C3106a.C3107a[] aVarArr, C3095d dVar, C3104k kVar, List<C3226i> list) {
        this.f10623e = eVar;
        this.f10622d = aVarArr;
        this.f10621c = kVar;
        this.f10625g = list;
        C3226i[] iVarArr = new C3226i[aVarArr.length];
        int[] iArr = new int[aVarArr.length];
        for (int i = 0; i < aVarArr.length; i++) {
            iVarArr[i] = aVarArr[i].f10729b;
            iArr[i] = i;
        }
        C3090b bVar = (C3090b) dVar;
        this.f10619a = bVar.mo14125a(1);
        this.f10620b = bVar.mo14125a(3);
        C3304r rVar = new C3304r(iVarArr);
        this.f10624f = rVar;
        this.f10634p = new C3094c(rVar, iArr);
    }

    /* renamed from: a */
    public final void mo14126a(Uri uri, String str, byte[] bArr) {
        String str2;
        int i;
        if (str.toLowerCase(Locale.getDefault()).startsWith("0x")) {
            str2 = str.substring(2);
        } else {
            str2 = str;
        }
        byte[] byteArray = new BigInteger(str2, 16).toByteArray();
        byte[] bArr2 = new byte[16];
        if (byteArray.length > 16) {
            i = byteArray.length - 16;
        } else {
            i = 0;
        }
        System.arraycopy(byteArray, i, bArr2, (16 - byteArray.length) + i, byteArray.length - i);
        this.f10630l = uri;
        this.f10631m = bArr;
        this.f10632n = str;
        this.f10633o = bArr2;
    }
}
