package p212pa;

import com.appboy.models.InAppMessageBase;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p173ma.C5734g;
import p277ub.C6803r;

/* renamed from: pa.b */
public final class C6108b extends TagPayloadReader {

    /* renamed from: b */
    public long f19397b = -9223372036854775807L;

    /* renamed from: c */
    public long[] f19398c = new long[0];

    /* renamed from: d */
    public long[] f19399d = new long[0];

    public C6108b() {
        super(new C5734g());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v4, types: [int] */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.Serializable m14644b(int r4, p277ub.C6803r r5) {
        /*
            if (r4 == 0) goto L_0x0082
            r0 = 0
            r1 = 1
            if (r4 == r1) goto L_0x0076
            r1 = 2
            if (r4 == r1) goto L_0x0071
            r2 = 3
            if (r4 == r2) goto L_0x0055
            r2 = 8
            if (r4 == r2) goto L_0x0050
            r2 = 10
            if (r4 == r2) goto L_0x0034
            r0 = 11
            if (r4 == r0) goto L_0x001a
            r4 = 0
            return r4
        L_0x001a:
            java.util.Date r4 = new java.util.Date
            long r2 = r5.mo22991j()
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            double r2 = r0.doubleValue()
            long r2 = (long) r2
            r4.<init>(r2)
            r5.mo22981A(r1)
            return r4
        L_0x0034:
            int r4 = r5.mo23000s()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r4)
        L_0x003d:
            if (r0 >= r4) goto L_0x004f
            int r2 = r5.mo22997p()
            java.io.Serializable r2 = m14644b(r2, r5)
            if (r2 == 0) goto L_0x004c
            r1.add(r2)
        L_0x004c:
            int r0 = r0 + 1
            goto L_0x003d
        L_0x004f:
            return r1
        L_0x0050:
            java.util.HashMap r4 = m14645c(r5)
            return r4
        L_0x0055:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
        L_0x005a:
            java.lang.String r0 = m14646d(r5)
            int r1 = r5.mo22997p()
            r2 = 9
            if (r1 != r2) goto L_0x0067
            return r4
        L_0x0067:
            java.io.Serializable r1 = m14644b(r1, r5)
            if (r1 == 0) goto L_0x005a
            r4.put(r0, r1)
            goto L_0x005a
        L_0x0071:
            java.lang.String r4 = m14646d(r5)
            return r4
        L_0x0076:
            int r4 = r5.mo22997p()
            if (r4 != r1) goto L_0x007d
            r0 = 1
        L_0x007d:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            return r4
        L_0x0082:
            long r4 = r5.mo22991j()
            double r4 = java.lang.Double.longBitsToDouble(r4)
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p212pa.C6108b.m14644b(int, ub.r):java.io.Serializable");
    }

    /* renamed from: c */
    public static HashMap<String, Object> m14645c(C6803r rVar) {
        int s = rVar.mo23000s();
        HashMap<String, Object> hashMap = new HashMap<>(s);
        for (int i = 0; i < s; i++) {
            String d = m14646d(rVar);
            Serializable b = m14644b(rVar.mo22997p(), rVar);
            if (b != null) {
                hashMap.put(d, b);
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    public static String m14646d(C6803r rVar) {
        int u = rVar.mo23002u();
        int i = rVar.f21039b;
        rVar.mo22981A(u);
        return new String(rVar.f21038a, i, u);
    }

    /* renamed from: a */
    public final boolean mo22070a(long j, C6803r rVar) {
        if (rVar.mo22997p() != 2 || !"onMetaData".equals(m14646d(rVar)) || rVar.mo22997p() != 8) {
            return false;
        }
        HashMap<String, Object> c = m14645c(rVar);
        Object obj = c.get(InAppMessageBase.DURATION);
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.f19397b = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = c.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f19398c = new long[size];
                this.f19399d = new long[size];
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                        this.f19398c = new long[0];
                        this.f19399d = new long[0];
                    } else {
                        this.f19398c[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f19399d[i] = ((Double) obj5).longValue();
                        i++;
                    }
                }
                this.f19398c = new long[0];
                this.f19399d = new long[0];
            }
        }
        return false;
    }
}
