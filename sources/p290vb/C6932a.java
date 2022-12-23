package p290vb;

import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.List;
import p277ub.C6795o;
import p277ub.C6803r;
import p389bl.C13637c;

/* renamed from: vb.a */
public final class C6932a {

    /* renamed from: a */
    public final List<byte[]> f21599a;

    /* renamed from: b */
    public final int f21600b;

    /* renamed from: c */
    public final int f21601c;

    /* renamed from: d */
    public final int f21602d;

    /* renamed from: e */
    public final float f21603e;

    /* renamed from: f */
    public final String f21604f;

    public C6932a(ArrayList arrayList, int i, int i2, int i3, float f, String str) {
        this.f21599a = arrayList;
        this.f21600b = i;
        this.f21601c = i2;
        this.f21602d = i3;
        this.f21603e = f;
        this.f21604f = str;
    }

    /* renamed from: a */
    public static C6932a m16352a(C6803r rVar) throws ParserException {
        String str;
        float f;
        int i;
        int i2;
        try {
            rVar.mo22981A(4);
            int p = (rVar.mo22997p() & 3) + 1;
            if (p != 3) {
                ArrayList arrayList = new ArrayList();
                int p2 = rVar.mo22997p() & 31;
                for (int i3 = 0; i3 < p2; i3++) {
                    int u = rVar.mo23002u();
                    int i4 = rVar.f21039b;
                    rVar.mo22981A(u);
                    byte[] bArr = rVar.f21038a;
                    byte[] bArr2 = new byte[(u + 4)];
                    System.arraycopy(C13637c.f33640g, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i4, bArr2, 4, u);
                    arrayList.add(bArr2);
                }
                int p3 = rVar.mo22997p();
                for (int i5 = 0; i5 < p3; i5++) {
                    int u2 = rVar.mo23002u();
                    int i6 = rVar.f21039b;
                    rVar.mo22981A(u2);
                    byte[] bArr3 = rVar.f21038a;
                    byte[] bArr4 = new byte[(u2 + 4)];
                    System.arraycopy(C13637c.f33640g, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i6, bArr4, 4, u2);
                    arrayList.add(bArr4);
                }
                if (p2 > 0) {
                    C6795o.C6797b d = C6795o.m16001d(p, ((byte[]) arrayList.get(0)).length, (byte[]) arrayList.get(0));
                    int i7 = d.f21018e;
                    int i8 = d.f21019f;
                    float f2 = d.f21020g;
                    str = C13637c.m34069h(d.f21014a, d.f21015b, d.f21016c);
                    i2 = i7;
                    i = i8;
                    f = f2;
                } else {
                    str = null;
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new C6932a(arrayList, p, i2, i, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ParserException("Error parsing AVC config", e);
        }
    }
}
