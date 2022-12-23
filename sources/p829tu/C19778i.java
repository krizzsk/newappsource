package p829tu;

import c70.C13752e;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import java.util.List;
import java.util.concurrent.Callable;
import q00.C19047a;

/* renamed from: tu.i */
public final class C19778i implements Callable<List<ServerId>> {

    /* renamed from: b */
    public final C13752e f50276b;

    /* renamed from: c */
    public final C19047a f50277c;

    /* renamed from: d */
    public final LatLonE6 f50278d;

    public C19778i(C13752e eVar, C19047a aVar, LatLonE6 latLonE6) {
        C21100e.m49373x(eVar, "requestContext");
        this.f50276b = eVar;
        this.f50277c = aVar;
        C21100e.m49373x(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f50278d = latLonE6;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() throws java.lang.Exception {
        /*
            r10 = this;
            c70.e r0 = r10.f50276b
            android.content.Context r0 = r0.f33852a
            q00.a r0 = r10.f50277c
            f00.g$d r1 = p969zr.C20886a.f52627f
            T r1 = r1.f43936b
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L_0x0017
            vr.a$v r1 = p874vr.C20199a.f51245G0
            java.lang.Object r0 = r0.mo51505b(r1)
            r1 = r0
            java.util.List r1 = (java.util.List) r1
        L_0x0017:
            r0 = 0
            if (r1 != 0) goto L_0x001c
            r1 = r0
            goto L_0x0023
        L_0x001c:
            int[] r1 = mf0.C24361g.m61184r0(r1)
            java.util.Arrays.sort(r1)
        L_0x0023:
            r2 = 0
            if (r1 == 0) goto L_0x002c
            int r3 = r1.length
            if (r3 != 0) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r3 = 0
            goto L_0x002d
        L_0x002c:
            r3 = 1
        L_0x002d:
            if (r3 == 0) goto L_0x0035
            java.util.List r0 = java.util.Collections.emptyList()
            goto L_0x00b9
        L_0x0035:
            int r3 = r1.length
            int r3 = r3 + -1
            r3 = r1[r3]
            com.moovit.commons.geo.LatLonE6 r4 = r10.f50278d
            java.util.HashSet r3 = com.moovit.map.items.C16283a.m41527Q(r3, r4)
            tu.g r4 = new tu.g
            r4.<init>(r10, r2)
            java.util.ArrayList r3 = c00.C13720d.m34273c(r3, r0, r4)
            com.google.android.gms.tasks.Task r4 = com.google.android.gms.tasks.Tasks.whenAllSuccess((java.util.Collection<? extends com.google.android.gms.tasks.Task>) r3)
            com.google.android.gms.tasks.Tasks.await(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0059:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007d
            java.lang.Object r5 = r3.next()
            com.google.android.gms.tasks.Task r5 = (com.google.android.gms.tasks.Task) r5
            boolean r6 = r5.isSuccessful()
            if (r6 == 0) goto L_0x0059
            java.lang.Object r6 = r5.getResult()
            if (r6 == 0) goto L_0x0059
            java.lang.Object r5 = r5.getResult()
            com.moovit.map.items.b r5 = (com.moovit.map.items.C16284b) r5
            java.util.List<com.moovit.map.items.MapItem> r5 = r5.f42557m
            r4.addAll(r5)
            goto L_0x0059
        L_0x007d:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r4.size()
            r3.<init>(r5)
            int r5 = r1.length
            r6 = 0
        L_0x0088:
            if (r6 >= r5) goto L_0x00a6
            r7 = r1[r6]
            com.moovit.commons.geo.Geofence r8 = new com.moovit.commons.geo.Geofence
            com.moovit.commons.geo.LatLonE6 r9 = r10.f50278d
            float r7 = (float) r7
            r8.<init>(r9, r7)
            tu.h r7 = new tu.h
            r7.<init>(r8, r2)
            c00.C13723g.m34283d(r4, r3, r7)
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L_0x00a3
            goto L_0x00a6
        L_0x00a3:
            int r6 = r6 + 1
            goto L_0x0088
        L_0x00a6:
            com.moovit.commons.geo.LatLonE6 r1 = r10.f50278d
            aa0.e r1 = aa0.C7530f.m17270c(r1)
            java.util.Collections.sort(r3, r1)
            lr.i r1 = new lr.i
            r2 = 5
            r1.<init>(r2)
            java.util.ArrayList r0 = c00.C13720d.m34273c(r3, r0, r1)
        L_0x00b9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p829tu.C19778i.call():java.lang.Object");
    }
}
