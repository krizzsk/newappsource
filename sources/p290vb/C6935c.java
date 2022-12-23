package p290vb;

import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;
import p277ub.C6795o;
import p277ub.C6803r;
import p277ub.C6804s;
import p389bl.C13637c;

/* renamed from: vb.c */
public final class C6935c {

    /* renamed from: a */
    public final List<byte[]> f21618a;

    /* renamed from: b */
    public final int f21619b;

    /* renamed from: c */
    public final String f21620c;

    public C6935c(int i, List list, String str) {
        this.f21618a = list;
        this.f21619b = i;
        this.f21620c = str;
    }

    /* renamed from: a */
    public static C6935c m16357a(C6803r rVar) throws ParserException {
        List list;
        C6803r rVar2 = rVar;
        try {
            rVar2.mo22981A(21);
            int p = rVar.mo22997p() & 3;
            int p2 = rVar.mo22997p();
            int i = rVar2.f21039b;
            int i2 = 0;
            for (int i3 = 0; i3 < p2; i3++) {
                rVar2.mo22981A(1);
                int u = rVar.mo23002u();
                for (int i4 = 0; i4 < u; i4++) {
                    int u2 = rVar.mo23002u();
                    i2 += u2 + 4;
                    rVar2.mo22981A(u2);
                }
            }
            rVar2.mo23007z(i);
            byte[] bArr = new byte[i2];
            String str = null;
            int i5 = 0;
            for (int i6 = 0; i6 < p2; i6++) {
                int p3 = rVar.mo22997p() & 127;
                int u3 = rVar.mo23002u();
                for (int i7 = 0; i7 < u3; i7++) {
                    int u4 = rVar.mo23002u();
                    System.arraycopy(C6795o.f21007a, 0, bArr, i5, 4);
                    int i8 = i5 + 4;
                    System.arraycopy(rVar2.f21038a, rVar2.f21039b, bArr, i8, u4);
                    if (p3 == 33 && i7 == 0) {
                        str = C13637c.m34070j(new C6804s(bArr, i8, i8 + u4));
                    }
                    i5 = i8 + u4;
                    rVar2.mo22981A(u4);
                }
            }
            if (i2 == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new C6935c(p + 1, list, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException("Error parsing HEVC config", e);
        }
    }
}
