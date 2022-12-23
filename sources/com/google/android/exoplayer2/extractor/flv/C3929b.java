package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import p173ma.C5754v;
import p277ub.C6795o;
import p277ub.C6803r;
import p290vb.C6932a;

/* renamed from: com.google.android.exoplayer2.extractor.flv.b */
public final class C3929b extends TagPayloadReader {

    /* renamed from: b */
    public final C6803r f13750b = new C6803r(C6795o.f21007a);

    /* renamed from: c */
    public final C6803r f13751c = new C6803r(4);

    /* renamed from: d */
    public int f13752d;

    /* renamed from: e */
    public boolean f13753e;

    /* renamed from: f */
    public boolean f13754f;

    /* renamed from: g */
    public int f13755g;

    public C3929b(C5754v vVar) {
        super(vVar);
    }

    /* renamed from: a */
    public final boolean mo16024a(C6803r rVar) throws TagPayloadReader.UnsupportedFormatException {
        int p = rVar.mo22997p();
        int i = (p >> 4) & 15;
        int i2 = p & 15;
        if (i2 == 7) {
            this.f13755g = i;
            if (i != 5) {
                return true;
            }
            return false;
        }
        throw new TagPayloadReader.UnsupportedFormatException(C13715c.m34241g(39, "Video format not supported: ", i2));
    }

    /* renamed from: b */
    public final boolean mo16025b(long j, C6803r rVar) throws ParserException {
        int i;
        int p = rVar.mo22997p();
        byte[] bArr = rVar.f21038a;
        int i2 = rVar.f21039b;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        byte b = (((bArr[i2] & 255) << 24) >> 8) | ((bArr[i3] & 255) << 8);
        int i5 = i4 + 1;
        rVar.f21039b = i5;
        long j2 = (((long) ((bArr[i4] & 255) | b)) * 1000) + j;
        if (p == 0 && !this.f13753e) {
            C6803r rVar2 = new C6803r(new byte[(rVar.f21040c - i5)]);
            rVar.mo22983b(0, rVar.f21040c - rVar.f21039b, rVar2.f21038a);
            C6932a a = C6932a.m16352a(rVar2);
            this.f13752d = a.f21600b;
            Format.C3872b bVar = new Format.C3872b();
            bVar.f13446k = "video/avc";
            bVar.f13443h = a.f21604f;
            bVar.f13451p = a.f21601c;
            bVar.f13452q = a.f21602d;
            bVar.f13455t = a.f21603e;
            bVar.f13448m = a.f21599a;
            this.f13745a.mo20632c(bVar.mo15806a());
            this.f13753e = true;
            return false;
        } else if (p != 1 || !this.f13753e) {
            return false;
        } else {
            if (this.f13755g == 1) {
                i = 1;
            } else {
                i = 0;
            }
            if (!this.f13754f && i == 0) {
                return false;
            }
            byte[] bArr2 = this.f13751c.f21038a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i6 = 4 - this.f13752d;
            int i7 = 0;
            while (rVar.f21040c - rVar.f21039b > 0) {
                rVar.mo22983b(i6, this.f13752d, this.f13751c.f21038a);
                this.f13751c.mo23007z(0);
                int s = this.f13751c.mo23000s();
                this.f13750b.mo23007z(0);
                this.f13745a.mo20631b(4, this.f13750b);
                this.f13745a.mo20631b(s, rVar);
                i7 = i7 + 4 + s;
            }
            this.f13745a.mo20633d(j2, i, i7, 0, (C5754v.C5755a) null);
            this.f13754f = true;
            return true;
        }
    }
}
