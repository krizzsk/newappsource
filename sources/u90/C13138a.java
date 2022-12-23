package u90;

import c00.C13722f;
import com.moovit.util.time.Time;
import java.util.concurrent.TimeUnit;

/* renamed from: u90.a */
public final class C13138a implements C13722f {

    /* renamed from: b */
    public final Time f32633b;

    /* renamed from: c */
    public final Time f32634c;

    /* renamed from: d */
    public final int f32635d;

    public C13138a(Time time) {
        time = time == null ? new Time(System.currentTimeMillis()) : time;
        this.f32633b = time;
        this.f32634c = new Time(TimeUnit.MINUTES.toMillis((long) Integer.MAX_VALUE) + time.mo24631g());
        this.f32635d = 1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0057 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00c1 A[SYNTHETIC] */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo19661o(java.lang.Object r8) {
        /*
            r7 = this;
            com.moovit.transit.TransitPatternTrips r8 = (com.moovit.transit.TransitPatternTrips) r8
            java.util.List<com.moovit.transit.TripId> r0 = r8.f23718c
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 0
        L_0x000a:
            boolean r3 = r0.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x0059
            java.lang.Object r3 = r0.next()
            com.moovit.transit.TripId r3 = (com.moovit.transit.TripId) r3
            com.moovit.transit.Schedule r3 = r8.mo24403b(r3)
            if (r3 == 0) goto L_0x0051
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x0024
            goto L_0x0051
        L_0x0024:
            int r5 = r3.size()
            int r5 = r5 + -1
            com.moovit.util.time.Time r5 = r3.mo24331u(r5)
            com.moovit.util.time.Time r6 = r7.f32633b
            int r5 = r6.compareTo(r5)
            if (r5 < 0) goto L_0x0038
            r5 = 1
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r5 == 0) goto L_0x003c
            goto L_0x0051
        L_0x003c:
            com.moovit.util.time.Time r5 = r7.f32633b
            int r5 = r3.mo24334z(r5)
            if (r5 >= 0) goto L_0x0047
            int r5 = -r5
            int r5 = r5 + -1
        L_0x0047:
            int r3 = r3.size()
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r1, r3)
            goto L_0x0052
        L_0x0051:
            r3 = 0
        L_0x0052:
            int r2 = r2 + r3
            int r3 = r7.f32635d
            if (r2 < r3) goto L_0x000a
            r0 = 1
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r0 == 0) goto L_0x005e
            goto L_0x00c8
        L_0x005e:
            java.util.List<com.moovit.transit.TripId> r0 = r8.f23718c
            java.util.Iterator r0 = r0.iterator()
        L_0x0064:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00c3
            java.lang.Object r2 = r0.next()
            com.moovit.transit.TripId r2 = (com.moovit.transit.TripId) r2
            com.moovit.transit.Schedule r2 = r8.mo24403b(r2)
            if (r2 == 0) goto L_0x00be
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x007d
            goto L_0x00be
        L_0x007d:
            com.moovit.util.time.Time r3 = r2.mo24331u(r1)
            com.moovit.util.time.Time r5 = r7.f32634c
            int r3 = r5.compareTo(r3)
            if (r3 > 0) goto L_0x008b
            r3 = 1
            goto L_0x008c
        L_0x008b:
            r3 = 0
        L_0x008c:
            if (r3 == 0) goto L_0x008f
            goto L_0x00be
        L_0x008f:
            int r3 = r2.size()
            int r3 = r3 - r4
            com.moovit.util.time.Time r3 = r2.mo24331u(r3)
            com.moovit.util.time.Time r5 = r7.f32633b
            int r3 = r5.compareTo(r3)
            if (r3 < 0) goto L_0x00a2
            r3 = 1
            goto L_0x00a3
        L_0x00a2:
            r3 = 0
        L_0x00a3:
            if (r3 == 0) goto L_0x00a6
            goto L_0x00be
        L_0x00a6:
            com.moovit.util.time.Time r3 = r7.f32633b
            com.moovit.util.time.Time r2 = r2.mo24328s(r3)
            if (r2 == 0) goto L_0x00be
            com.moovit.util.time.Time r3 = r7.f32634c
            int r2 = r3.compareTo(r2)
            if (r2 > 0) goto L_0x00b8
            r2 = 1
            goto L_0x00b9
        L_0x00b8:
            r2 = 0
        L_0x00b9:
            if (r2 == 0) goto L_0x00bc
            goto L_0x00be
        L_0x00bc:
            r2 = 1
            goto L_0x00bf
        L_0x00be:
            r2 = 0
        L_0x00bf:
            if (r2 == 0) goto L_0x0064
            r8 = 1
            goto L_0x00c4
        L_0x00c3:
            r8 = 0
        L_0x00c4:
            if (r8 == 0) goto L_0x00c7
            goto L_0x00c8
        L_0x00c7:
            r1 = 1
        L_0x00c8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u90.C13138a.mo19661o(java.lang.Object):boolean");
    }
}
