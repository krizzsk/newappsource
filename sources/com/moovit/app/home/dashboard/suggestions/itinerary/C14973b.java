package com.moovit.app.home.dashboard.suggestions.itinerary;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashSet;
import kotlin.collections.C23825c;
import kotlin.sequences.C24177b;
import mf0.C24362h;
import p474et.C16873e;
import p474et.C16874f;
import p474et.C16876h;
import th0.C25012n;

/* renamed from: com.moovit.app.home.dashboard.suggestions.itinerary.b */
public abstract class C14973b implements C16873e {
    /* renamed from: c */
    public static LinkedHashSet m37836c(C16876h hVar) {
        C24362h.m61211f(hVar, "sharedState");
        C25012n j0 = C24177b.m60549j0(C24177b.m60543d0(C23825c.m58506c0(hVar.f43894c), C14970x255c6522.f38316f), ItinerarySuggestionCardProvider$getPreviousLocations$1.f38317f);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T invoke : j0.f63178a) {
            linkedHashSet.add(j0.f63179b.invoke(invoke));
        }
        return linkedHashSet;
    }

    /* renamed from: a */
    public final C16874f mo45183a() {
        return new C16874f(mo45165d(), false, (float) BitmapDescriptorFactory.HUE_RED, 14);
    }

    /* renamed from: d */
    public abstract String mo45165d();

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b7 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo45172e(android.content.Context r20, q00.C19047a r21, com.moovit.transit.LocationDescriptor r22, float r23, java.util.LinkedHashSet r24) {
        /*
            r19 = this;
            r0 = r21
            java.lang.String r1 = "context"
            r2 = r20
            mf0.C24362h.m61211f(r2, r1)
            java.lang.String r1 = "conf"
            mf0.C24362h.m61211f(r0, r1)
            r00.d r1 = p874vr.C20199a.f51285k1
            java.lang.Object r1 = r0.mo51505b(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            if (r1 == 0) goto L_0x0023
            int r1 = r1.intValue()
            float r1 = (float) r1
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            goto L_0x0024
        L_0x0023:
            r1 = r2
        L_0x0024:
            float r1 = r1.floatValue()
            r3 = 0
            int r1 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x002e
            return r3
        L_0x002e:
            r00.d r1 = p874vr.C20199a.f51287l1
            java.lang.Object r0 = r0.mo51505b(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.String r1 = "threshold"
            mf0.C24362h.m61210e(r0, r1)
            int r0 = r0.intValue()
            java.util.Iterator r1 = r24.iterator()
        L_0x0043:
            boolean r4 = r1.hasNext()
            r5 = 1
            if (r4 == 0) goto L_0x00b8
            java.lang.Object r4 = r1.next()
            r6 = r4
            qz.b r6 = (p762qz.C19206b) r6
            float r7 = (float) r0
            com.moovit.commons.geo.LatLonE6 r8 = r22.mo24310d()
            com.moovit.commons.geo.LatLonE6 r6 = r6.getLocation()
            double r9 = r6.mo46922k()
            double r11 = r8.mo46922k()
            double r9 = r9 - r11
            double r9 = java.lang.Math.abs(r9)
            double r11 = r6.mo46926o()
            double r13 = r8.mo46926o()
            double r11 = r11 - r13
            double r11 = java.lang.Math.abs(r11)
            r13 = 4720647587588210688(0x41831bf848000000, double:4.0075017E7)
            double r9 = r9 * r13
            r15 = 4645040803167600640(0x4076800000000000, double:360.0)
            double r9 = r9 / r15
            double r17 = r8.mo46924m()
            double r17 = java.lang.Math.cos(r17)
            double r17 = r17 * r11
            double r17 = r17 * r13
            double r17 = r17 / r15
            double r11 = (double) r7
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 > 0) goto L_0x00b3
            int r13 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r13 <= 0) goto L_0x0099
            goto L_0x00b3
        L_0x0099:
            double r13 = p977zz.C20936e0.f52683c
            double r9 = r9 * r13
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x00a8
            double r17 = r17 * r13
            int r9 = (r17 > r11 ? 1 : (r17 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x00a8
            goto L_0x00b1
        L_0x00a8:
            float r6 = com.moovit.commons.geo.LatLonE6.m40174c(r8, r6)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x00b1
            goto L_0x00b3
        L_0x00b1:
            r6 = 0
            goto L_0x00b4
        L_0x00b3:
            r6 = 1
        L_0x00b4:
            r6 = r6 ^ r5
            if (r6 == 0) goto L_0x0043
            r2 = r4
        L_0x00b8:
            if (r2 == 0) goto L_0x00bc
            r0 = 1
            goto L_0x00bd
        L_0x00bc:
            r0 = 0
        L_0x00bd:
            if (r0 == 0) goto L_0x00c0
            return r3
        L_0x00c0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.home.dashboard.suggestions.itinerary.C14973b.mo45172e(android.content.Context, q00.a, com.moovit.transit.LocationDescriptor, float, java.util.LinkedHashSet):boolean");
    }
}
