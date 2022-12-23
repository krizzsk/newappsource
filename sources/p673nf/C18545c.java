package p673nf;

import android.content.Context;
import com.google.firebase.perf.p414v1.NetworkRequestMetric;
import p626lf.C18200a;

/* renamed from: nf.c */
public final class C18545c extends C18547e {

    /* renamed from: c */
    public static final C18200a f47225c = C18200a.m44901d();

    /* renamed from: a */
    public final NetworkRequestMetric f47226a;

    /* renamed from: b */
    public final Context f47227b;

    public C18545c(NetworkRequestMetric networkRequestMetric, Context context) {
        this.f47227b = context;
        this.f47226a = networkRequestMetric;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0097  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo50952a() {
        /*
            r9 = this;
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            java.lang.String r0 = r0.mo43537Q()
            r1 = 1
            if (r0 != 0) goto L_0x000b
            r0 = 1
            goto L_0x0013
        L_0x000b:
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
        L_0x0013:
            r2 = 0
            if (r0 == 0) goto L_0x0021
            lf.a r0 = f47225c
            com.google.firebase.perf.v1.NetworkRequestMetric r1 = r9.f47226a
            r1.mo43537Q()
            r0.mo50614f()
            return r2
        L_0x0021:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            java.lang.String r0 = r0.mo43537Q()
            r3 = 0
            if (r0 != 0) goto L_0x002b
            goto L_0x0042
        L_0x002b:
            java.net.URI r0 = java.net.URI.create(r0)     // Catch:{ IllegalArgumentException -> 0x0032, IllegalStateException -> 0x0030 }
            goto L_0x0043
        L_0x0030:
            r0 = move-exception
            goto L_0x0033
        L_0x0032:
            r0 = move-exception
        L_0x0033:
            lf.a r4 = f47225c
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getMessage()
            r5[r2] = r0
            java.lang.String r0 = "getResultUrl throws exception %s"
            r4.mo50615g(r0, r5)
        L_0x0042:
            r0 = r3
        L_0x0043:
            if (r0 != 0) goto L_0x004b
            lf.a r0 = f47225c
            r0.mo50614f()
            return r2
        L_0x004b:
            android.content.Context r4 = r9.f47227b
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r4 = r4.getPackageName()
            java.lang.String r6 = "firebase_performance_whitelisted_domains"
            java.lang.String r7 = "array"
            int r4 = r5.getIdentifier(r6, r7, r4)
            if (r4 != 0) goto L_0x0060
            goto L_0x0086
        L_0x0060:
            lf.a r6 = p626lf.C18200a.m44901d()
            r6.mo50610a()
            java.lang.String[] r6 = com.google.android.play.core.appupdate.C14226d.f35748c
            if (r6 != 0) goto L_0x0071
            java.lang.String[] r4 = r5.getStringArray(r4)
            com.google.android.play.core.appupdate.C14226d.f35748c = r4
        L_0x0071:
            java.lang.String r4 = r0.getHost()
            if (r4 != 0) goto L_0x0078
            goto L_0x0086
        L_0x0078:
            java.lang.String[] r5 = com.google.android.play.core.appupdate.C14226d.f35748c
            int r6 = r5.length
            r7 = 0
        L_0x007c:
            if (r7 >= r6) goto L_0x008b
            r8 = r5[r7]
            boolean r8 = r4.contains(r8)
            if (r8 == 0) goto L_0x0088
        L_0x0086:
            r4 = 1
            goto L_0x008c
        L_0x0088:
            int r7 = r7 + 1
            goto L_0x007c
        L_0x008b:
            r4 = 0
        L_0x008c:
            if (r4 != 0) goto L_0x0097
            lf.a r1 = f47225c
            r0.toString()
            r1.mo50614f()
            return r2
        L_0x0097:
            java.lang.String r4 = r0.getHost()
            if (r4 == 0) goto L_0x00b1
            java.lang.String r5 = r4.trim()
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x00b1
            int r4 = r4.length()
            r5 = 255(0xff, float:3.57E-43)
            if (r4 > r5) goto L_0x00b1
            r4 = 1
            goto L_0x00b2
        L_0x00b1:
            r4 = 0
        L_0x00b2:
            if (r4 != 0) goto L_0x00ba
            lf.a r0 = f47225c
            r0.mo50614f()
            return r2
        L_0x00ba:
            java.lang.String r4 = r0.getScheme()
            if (r4 != 0) goto L_0x00c1
            goto L_0x00d2
        L_0x00c1:
            java.lang.String r5 = "http"
            boolean r5 = r5.equalsIgnoreCase(r4)
            if (r5 != 0) goto L_0x00d4
            java.lang.String r5 = "https"
            boolean r4 = r5.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x00d2
            goto L_0x00d4
        L_0x00d2:
            r4 = 0
            goto L_0x00d5
        L_0x00d4:
            r4 = 1
        L_0x00d5:
            if (r4 != 0) goto L_0x00dd
            lf.a r0 = f47225c
            r0.mo50614f()
            return r2
        L_0x00dd:
            java.lang.String r4 = r0.getUserInfo()
            if (r4 != 0) goto L_0x00e5
            r4 = 1
            goto L_0x00e6
        L_0x00e5:
            r4 = 0
        L_0x00e6:
            if (r4 != 0) goto L_0x00ee
            lf.a r0 = f47225c
            r0.mo50614f()
            return r2
        L_0x00ee:
            int r0 = r0.getPort()
            r4 = -1
            if (r0 == r4) goto L_0x00fa
            if (r0 <= 0) goto L_0x00f8
            goto L_0x00fa
        L_0x00f8:
            r0 = 0
            goto L_0x00fb
        L_0x00fa:
            r0 = 1
        L_0x00fb:
            if (r0 != 0) goto L_0x0103
            lf.a r0 = f47225c
            r0.mo50614f()
            return r2
        L_0x0103:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            boolean r0 = r0.mo43539S()
            if (r0 == 0) goto L_0x0111
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod r3 = r0.mo43529I()
        L_0x0111:
            if (r3 == 0) goto L_0x0119
            com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod r0 = com.google.firebase.perf.p414v1.NetworkRequestMetric.HttpMethod.HTTP_METHOD_UNKNOWN
            if (r3 == r0) goto L_0x0119
            r0 = 1
            goto L_0x011a
        L_0x0119:
            r0 = 0
        L_0x011a:
            if (r0 != 0) goto L_0x012b
            lf.a r0 = f47225c
            com.google.firebase.perf.v1.NetworkRequestMetric r1 = r9.f47226a
            com.google.firebase.perf.v1.NetworkRequestMetric$HttpMethod r1 = r1.mo43529I()
            java.util.Objects.toString(r1)
            r0.mo50614f()
            return r2
        L_0x012b:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            boolean r0 = r0.mo43540T()
            if (r0 == 0) goto L_0x014b
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            int r0 = r0.mo43530J()
            if (r0 <= 0) goto L_0x013d
            r0 = 1
            goto L_0x013e
        L_0x013d:
            r0 = 0
        L_0x013e:
            if (r0 != 0) goto L_0x014b
            lf.a r0 = f47225c
            com.google.firebase.perf.v1.NetworkRequestMetric r1 = r9.f47226a
            r1.mo43530J()
            r0.mo50614f()
            return r2
        L_0x014b:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            boolean r0 = r0.mo43541U()
            r3 = 0
            if (r0 == 0) goto L_0x016f
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            long r5 = r0.mo43532L()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0161
            r0 = 1
            goto L_0x0162
        L_0x0161:
            r0 = 0
        L_0x0162:
            if (r0 != 0) goto L_0x016f
            lf.a r0 = f47225c
            com.google.firebase.perf.v1.NetworkRequestMetric r1 = r9.f47226a
            r1.mo43532L()
            r0.mo50614f()
            return r2
        L_0x016f:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            boolean r0 = r0.mo43542V()
            if (r0 == 0) goto L_0x0191
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            long r5 = r0.mo43533M()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0183
            r0 = 1
            goto L_0x0184
        L_0x0183:
            r0 = 0
        L_0x0184:
            if (r0 != 0) goto L_0x0191
            lf.a r0 = f47225c
            com.google.firebase.perf.v1.NetworkRequestMetric r1 = r9.f47226a
            r1.mo43533M()
            r0.mo50614f()
            return r2
        L_0x0191:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            boolean r0 = r0.mo43538R()
            if (r0 == 0) goto L_0x0216
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            long r5 = r0.mo43528G()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x01a5
            goto L_0x0216
        L_0x01a5:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            boolean r0 = r0.mo43543W()
            if (r0 == 0) goto L_0x01c7
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            long r5 = r0.mo43534N()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x01b9
            r0 = 1
            goto L_0x01ba
        L_0x01b9:
            r0 = 0
        L_0x01ba:
            if (r0 != 0) goto L_0x01c7
            lf.a r0 = f47225c
            com.google.firebase.perf.v1.NetworkRequestMetric r1 = r9.f47226a
            r1.mo43534N()
            r0.mo50614f()
            return r2
        L_0x01c7:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            boolean r0 = r0.mo43545Y()
            if (r0 == 0) goto L_0x01e9
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            long r5 = r0.mo43536P()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x01db
            r0 = 1
            goto L_0x01dc
        L_0x01db:
            r0 = 0
        L_0x01dc:
            if (r0 != 0) goto L_0x01e9
            lf.a r0 = f47225c
            com.google.firebase.perf.v1.NetworkRequestMetric r1 = r9.f47226a
            r1.mo43536P()
            r0.mo50614f()
            return r2
        L_0x01e9:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            boolean r0 = r0.mo43544X()
            if (r0 == 0) goto L_0x020b
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            long r5 = r0.mo43535O()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x01fc
            goto L_0x020b
        L_0x01fc:
            com.google.firebase.perf.v1.NetworkRequestMetric r0 = r9.f47226a
            boolean r0 = r0.mo43540T()
            if (r0 != 0) goto L_0x020a
            lf.a r0 = f47225c
            r0.mo50614f()
            return r2
        L_0x020a:
            return r1
        L_0x020b:
            lf.a r0 = f47225c
            com.google.firebase.perf.v1.NetworkRequestMetric r1 = r9.f47226a
            r1.mo43535O()
            r0.mo50614f()
            return r2
        L_0x0216:
            lf.a r0 = f47225c
            com.google.firebase.perf.v1.NetworkRequestMetric r1 = r9.f47226a
            r1.mo43528G()
            r0.mo50614f()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p673nf.C18545c.mo50952a():boolean");
    }
}
