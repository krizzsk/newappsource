package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C3226i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3124m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C3171h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3385e;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.b */
public final class C3164b extends C3171h {

    /* renamed from: n */
    public C3385e f11225n;

    /* renamed from: o */
    public C3165a f11226o;

    /* renamed from: a */
    public void mo14230a(boolean z) {
        super.mo14230a(z);
        if (z) {
            this.f11225n = null;
            this.f11226o = null;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.b$a */
    public class C3165a implements C3169f, C3124m {

        /* renamed from: a */
        public long[] f11227a;

        /* renamed from: b */
        public long[] f11228b;

        /* renamed from: c */
        public long f11229c = -1;

        /* renamed from: d */
        public long f11230d = -1;

        public C3165a() {
        }

        /* renamed from: a */
        public long mo14225a(C3087g gVar) throws IOException, InterruptedException {
            long j = this.f11230d;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.f11230d = -1;
            return j2;
        }

        /* renamed from: a */
        public boolean mo14079a() {
            return true;
        }

        /* renamed from: b */
        public C3124m mo14227b() {
            return this;
        }

        /* renamed from: c */
        public long mo14228c(long j) {
            long j2 = (((long) C3164b.this.f11257i) * j) / 1000000;
            this.f11230d = this.f11227a[C3406u.m8599b(this.f11227a, j2, true, true)];
            return j2;
        }

        /* renamed from: a */
        public long mo14078a(long j) {
            return this.f11229c + this.f11228b[C3406u.m8599b(this.f11227a, (((long) C3164b.this.f11257i) * j) / 1000000, true, true)];
        }

        /* renamed from: c */
        public long mo14080c() {
            C3385e eVar = C3164b.this.f11225n;
            return (eVar.f12097d * 1000000) / ((long) eVar.f12094a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        r5 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo14229a(com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k r15) {
        /*
            r14 = this;
            byte[] r0 = r15.f12121a
            r1 = 0
            byte r2 = r0[r1]
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x000b
            r2 = 1
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            if (r2 != 0) goto L_0x0011
            r0 = -1
            return r0
        L_0x0011:
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r5 = 4
            int r0 = r0 >> r5
            switch(r0) {
                case 1: goto L_0x0099;
                case 2: goto L_0x0093;
                case 3: goto L_0x0093;
                case 4: goto L_0x0093;
                case 5: goto L_0x0093;
                case 6: goto L_0x0023;
                case 7: goto L_0x0023;
                case 8: goto L_0x001d;
                case 9: goto L_0x001d;
                case 10: goto L_0x001d;
                case 11: goto L_0x001d;
                case 12: goto L_0x001d;
                case 13: goto L_0x001d;
                case 14: goto L_0x001d;
                case 15: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            goto L_0x009b
        L_0x001d:
            int r0 = r0 + -8
            r15 = 256(0x100, float:3.59E-43)
            goto L_0x0096
        L_0x0023:
            r15.mo14551f(r5)
            byte[] r2 = r15.f12121a
            int r3 = r15.f12122b
            byte r2 = r2[r3]
            long r2 = (long) r2
            r5 = 7
            r6 = 7
        L_0x002f:
            r7 = 6
            if (r6 < 0) goto L_0x004a
            int r8 = r4 << r6
            long r9 = (long) r8
            long r9 = r9 & r2
            r11 = 0
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0047
            if (r6 >= r7) goto L_0x0043
            int r8 = r8 - r4
            long r8 = (long) r8
            long r2 = r2 & r8
            int r5 = r5 - r6
            goto L_0x004b
        L_0x0043:
            if (r6 != r5) goto L_0x004a
            r5 = 1
            goto L_0x004b
        L_0x0047:
            int r6 = r6 + -1
            goto L_0x002f
        L_0x004a:
            r5 = 0
        L_0x004b:
            if (r5 == 0) goto L_0x0087
            r4 = 1
        L_0x004e:
            if (r4 >= r5) goto L_0x0071
            byte[] r6 = r15.f12121a
            int r8 = r15.f12122b
            int r8 = r8 + r4
            byte r6 = r6[r8]
            r8 = r6 & 192(0xc0, float:2.69E-43)
            r9 = 128(0x80, float:1.794E-43)
            if (r8 != r9) goto L_0x0065
            long r2 = r2 << r7
            r6 = r6 & 63
            long r8 = (long) r6
            long r2 = r2 | r8
            int r4 = r4 + 1
            goto L_0x004e
        L_0x0065:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            java.lang.String r0 = "Invalid UTF-8 sequence continuation byte: "
            java.lang.String r0 = p001a0.C0016g.m29l(r0, r2)
            r15.<init>(r0)
            throw r15
        L_0x0071:
            int r2 = r15.f12122b
            int r2 = r2 + r5
            r15.f12122b = r2
            if (r0 != r7) goto L_0x007d
            int r0 = r15.mo14557l()
            goto L_0x0081
        L_0x007d:
            int r0 = r15.mo14562q()
        L_0x0081:
            r15.mo14549e(r1)
            int r3 = r0 + 1
            goto L_0x009b
        L_0x0087:
            java.lang.NumberFormatException r15 = new java.lang.NumberFormatException
            java.lang.String r0 = "Invalid UTF-8 sequence first byte: "
            java.lang.String r0 = p001a0.C0016g.m29l(r0, r2)
            r15.<init>(r0)
            throw r15
        L_0x0093:
            int r0 = r0 - r2
            r15 = 576(0x240, float:8.07E-43)
        L_0x0096:
            int r3 = r15 << r0
            goto L_0x009b
        L_0x0099:
            r3 = 192(0xc0, float:2.69E-43)
        L_0x009b:
            long r0 = (long) r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C3164b.mo14229a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):long");
    }

    /* renamed from: a */
    public boolean mo14231a(C3393k kVar, long j, C3171h.C3172a aVar) throws IOException, InterruptedException {
        C3393k kVar2 = kVar;
        C3171h.C3172a aVar2 = aVar;
        byte[] bArr = kVar2.f12121a;
        if (this.f11225n == null) {
            this.f11225n = new C3385e(bArr, 17);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, kVar2.f12123c);
            copyOfRange[4] = Byte.MIN_VALUE;
            List singletonList = Collections.singletonList(copyOfRange);
            C3385e eVar = this.f11225n;
            int i = eVar.f12096c;
            int i2 = eVar.f12094a;
            aVar2.f11262a = C3226i.m8178a((String) null, "audio/flac", (String) null, -1, i * i2, eVar.f12095b, i2, -1, (List<byte[]>) singletonList, (C3059a) null, 0, (String) null);
        } else {
            byte b = bArr[0];
            if ((b & Byte.MAX_VALUE) == 3) {
                C3165a aVar3 = new C3165a();
                this.f11226o = aVar3;
                kVar2.mo14551f(1);
                int n = kVar.mo14559n() / 18;
                aVar3.f11227a = new long[n];
                aVar3.f11228b = new long[n];
                for (int i3 = 0; i3 < n; i3++) {
                    aVar3.f11227a[i3] = kVar.mo14554i();
                    aVar3.f11228b[i3] = kVar.mo14554i();
                    kVar2.mo14551f(2);
                }
            } else {
                if (b == -1) {
                    C3165a aVar4 = this.f11226o;
                    if (aVar4 != null) {
                        aVar4.f11229c = j;
                        aVar2.f11263b = aVar4;
                    }
                    return false;
                }
            }
        }
        return true;
    }
}
