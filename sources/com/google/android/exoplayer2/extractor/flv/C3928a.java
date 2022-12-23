package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.util.Collections;
import p125ia.C5311a;
import p173ma.C5754v;
import p277ub.C6802q;
import p277ub.C6803r;

/* renamed from: com.google.android.exoplayer2.extractor.flv.a */
public final class C3928a extends TagPayloadReader {

    /* renamed from: e */
    public static final int[] f13746e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    public boolean f13747b;

    /* renamed from: c */
    public boolean f13748c;

    /* renamed from: d */
    public int f13749d;

    public C3928a(C5754v vVar) {
        super(vVar);
    }

    /* renamed from: a */
    public final boolean mo16022a(C6803r rVar) throws TagPayloadReader.UnsupportedFormatException {
        String str;
        if (!this.f13747b) {
            int p = rVar.mo22997p();
            int i = (p >> 4) & 15;
            this.f13749d = i;
            if (i == 2) {
                int i2 = f13746e[(p >> 2) & 3];
                Format.C3872b bVar = new Format.C3872b();
                bVar.f13446k = "audio/mpeg";
                bVar.f13459x = 1;
                bVar.f13460y = i2;
                this.f13745a.mo20632c(bVar.mo15806a());
                this.f13748c = true;
            } else if (i == 7 || i == 8) {
                if (i == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                Format.C3872b bVar2 = new Format.C3872b();
                bVar2.f13446k = str;
                bVar2.f13459x = 1;
                bVar2.f13460y = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;
                this.f13745a.mo20632c(bVar2.mo15806a());
                this.f13748c = true;
            } else if (i != 10) {
                throw new TagPayloadReader.UnsupportedFormatException(C13715c.m34241g(39, "Audio format not supported: ", this.f13749d));
            }
            this.f13747b = true;
        } else {
            rVar.mo22981A(1);
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo16023b(long j, C6803r rVar) throws ParserException {
        if (this.f13749d == 2) {
            int i = rVar.f21040c - rVar.f21039b;
            this.f13745a.mo20631b(i, rVar);
            this.f13745a.mo20633d(j, 1, i, 0, (C5754v.C5755a) null);
            return true;
        }
        int p = rVar.mo22997p();
        if (p == 0 && !this.f13748c) {
            int i2 = rVar.f21040c - rVar.f21039b;
            byte[] bArr = new byte[i2];
            rVar.mo22983b(0, i2, bArr);
            C5311a.C5312a c = C5311a.m13352c(new C6802q(bArr, i2), false);
            Format.C3872b bVar = new Format.C3872b();
            bVar.f13446k = "audio/mp4a-latm";
            bVar.f13443h = c.f17500c;
            bVar.f13459x = c.f17499b;
            bVar.f13460y = c.f17498a;
            bVar.f13448m = Collections.singletonList(bArr);
            this.f13745a.mo20632c(new Format(bVar));
            this.f13748c = true;
            return false;
        } else if (this.f13749d == 10 && p != 1) {
            return false;
        } else {
            int i3 = rVar.f21040c - rVar.f21039b;
            this.f13745a.mo20631b(i3, rVar);
            this.f13745a.mo20633d(j, 1, i3, 0, (C5754v.C5755a) null);
            return true;
        }
    }
}
