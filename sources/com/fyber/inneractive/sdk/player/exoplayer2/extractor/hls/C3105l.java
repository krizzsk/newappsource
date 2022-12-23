package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.C3230l;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3080f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3123l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3124m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.text.C3307a;
import com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.C3309a;
import com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.C3310b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3403r;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l */
public final class C3105l implements C3080f {

    /* renamed from: g */
    public static final Pattern f10715g = Pattern.compile("LOCAL:([^,]+)");

    /* renamed from: h */
    public static final Pattern f10716h = Pattern.compile("MPEGTS:(\\d+)");

    /* renamed from: a */
    public final String f10717a;

    /* renamed from: b */
    public final C3403r f10718b;

    /* renamed from: c */
    public final C3393k f10719c = new C3393k();

    /* renamed from: d */
    public C3088h f10720d;

    /* renamed from: e */
    public byte[] f10721e = new byte[1024];

    /* renamed from: f */
    public int f10722f;

    public C3105l(String str, C3403r rVar) {
        this.f10717a = str;
        this.f10718b = rVar;
    }

    /* renamed from: a */
    public boolean mo14115a(C3087g gVar) throws IOException, InterruptedException {
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public void mo14116b() {
    }

    /* renamed from: a */
    public void mo14114a(C3088h hVar) {
        this.f10720d = hVar;
        hVar.mo14123a(new C3124m.C3125a(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo14113a(long j, long j2) {
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public int mo14112a(C3087g gVar, C3123l lVar) throws IOException, InterruptedException {
        Matcher matcher;
        String d;
        int i;
        C3072b bVar = (C3072b) gVar;
        int i2 = (int) bVar.f10547b;
        int i3 = this.f10722f;
        byte[] bArr = this.f10721e;
        if (i3 == bArr.length) {
            if (i2 != -1) {
                i = i2;
            } else {
                i = bArr.length;
            }
            this.f10721e = Arrays.copyOf(bArr, (i * 3) / 2);
        }
        byte[] bArr2 = this.f10721e;
        int i4 = this.f10722f;
        int a = bVar.mo14081a(bArr2, i4, bArr2.length - i4);
        if (a != -1) {
            int i5 = this.f10722f + a;
            this.f10722f = i5;
            if (i2 == -1 || i5 != i2) {
                return 0;
            }
        }
        C3393k kVar = new C3393k(this.f10721e);
        try {
            Pattern pattern = C3310b.f11879a;
            String d2 = kVar.mo14546d();
            if (d2 == null || !C3310b.f11880b.matcher(d2).matches()) {
                throw new C3307a("Expected WEBVTT. Got " + d2);
            }
            long j = 0;
            long j2 = 0;
            while (true) {
                String d3 = kVar.mo14546d();
                if (TextUtils.isEmpty(d3)) {
                    while (true) {
                        String d4 = kVar.mo14546d();
                        if (d4 == null) {
                            matcher = null;
                            break;
                        } else if (C3310b.f11879a.matcher(d4).matches()) {
                            do {
                                d = kVar.mo14546d();
                                if (d == null) {
                                    break;
                                }
                            } while (d.isEmpty());
                        } else {
                            matcher = C3309a.f11878a.matcher(d4);
                            if (matcher.matches()) {
                                break;
                            }
                        }
                    }
                    if (matcher == null) {
                        mo14174a(0);
                    } else {
                        long a2 = C3310b.m8357a(matcher.group(1));
                        long a3 = this.f10718b.mo14583a((j2 + a2) - j);
                        C3161n a4 = mo14174a(a3 - a2);
                        this.f10719c.mo14540a(this.f10721e, this.f10722f);
                        a4.mo14099a(this.f10719c, this.f10722f);
                        a4.mo14096a(a3, 1, this.f10722f, 0, (byte[]) null);
                    }
                    return -1;
                } else if (d3.startsWith("X-TIMESTAMP-MAP")) {
                    Matcher matcher2 = f10715g.matcher(d3);
                    if (matcher2.find()) {
                        Matcher matcher3 = f10716h.matcher(d3);
                        if (matcher3.find()) {
                            j = C3310b.m8357a(matcher2.group(1));
                            j2 = (Long.parseLong(matcher3.group(1)) * 1000000) / 90000;
                        } else {
                            throw new C3230l(C25541a.m63881k("X-TIMESTAMP-MAP doesn't contain media timestamp: ", d3));
                        }
                    } else {
                        throw new C3230l(C25541a.m63881k("X-TIMESTAMP-MAP doesn't contain local timestamp: ", d3));
                    }
                }
            }
        } catch (C3307a e) {
            throw new C3230l((Throwable) e);
        }
    }

    /* renamed from: a */
    public final C3161n mo14174a(long j) {
        C3161n a = this.f10720d.mo14122a(0, 3);
        a.mo14098a(C3226i.m8179a((String) null, "text/vtt", (String) null, -1, 0, this.f10717a, -1, (C3059a) null, j, Collections.emptyList()));
        this.f10720d.mo14124c();
        return a;
    }
}
