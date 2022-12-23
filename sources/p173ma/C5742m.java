package p173ma;

import java.util.Arrays;
import p173ma.C5744o;
import p277ub.C6803r;

/* renamed from: ma.m */
public final class C5742m {
    /* renamed from: a */
    public static C5744o.C5745a m14137a(C6803r rVar) {
        rVar.mo22981A(1);
        int r = rVar.mo22999r();
        long j = ((long) rVar.f21039b) + ((long) r);
        int i = r / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long j2 = rVar.mo22991j();
            if (j2 == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = j2;
            jArr2[i2] = rVar.mo22991j();
            rVar.mo22981A(2);
            i2++;
        }
        rVar.mo22981A((int) (j - ((long) rVar.f21039b)));
        return new C5744o.C5745a(jArr, jArr2);
    }
}
