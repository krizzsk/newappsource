package com.moovit.tripplanner;

import android.content.Context;
import java.util.HashSet;
import p929xy.C20663f;
import v90.C13187a;

/* renamed from: com.moovit.tripplanner.a */
public final class C7864a extends C20663f<C13187a> {

    /* renamed from: com.moovit.tripplanner.a$a */
    public static /* synthetic */ class C7865a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23805a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.tripplanner.TripPlannerTransportType[] r0 = com.moovit.tripplanner.TripPlannerTransportType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23805a = r0
                com.moovit.tripplanner.TripPlannerTransportType r1 = com.moovit.tripplanner.TripPlannerTransportType.BICYCLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f23805a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.tripplanner.TripPlannerTransportType r1 = com.moovit.tripplanner.TripPlannerTransportType.SCOOTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f23805a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.tripplanner.TripPlannerTransportType r1 = com.moovit.tripplanner.TripPlannerTransportType.MOPED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f23805a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.tripplanner.TripPlannerTransportType r1 = com.moovit.tripplanner.TripPlannerTransportType.CAR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f23805a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.tripplanner.TripPlannerTransportType r1 = com.moovit.tripplanner.TripPlannerTransportType.PERSONAL_CAR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.tripplanner.C7864a.C7865a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.add("CONFIGURATION");
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f6 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo22058d(android.content.Context r17, p646lz.C18299a r18) throws java.io.IOException, com.moovit.commons.appdata.AppDataPartLoadFailedException, com.moovit.commons.request.ServerException {
        /*
            r16 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "METRO_CONTEXT"
            java.lang.Object r2 = r1.mo50690c(r2)
            tp.f r2 = (p824tp.C19728f) r2
            java.lang.String r3 = "CONFIGURATION"
            java.lang.Object r1 = r1.mo50690c(r3)
            q00.a r1 = (q00.C19047a) r1
            java.lang.String r3 = "trip_planner_configuration"
            r4 = 0
            android.content.SharedPreferences r3 = r0.getSharedPreferences(r3, r4)
            q00.d$r r5 = q00.C19053d.f48476o
            java.lang.Object r5 = r1.mo51505b(r5)
            r11 = r5
            java.util.List r11 = (java.util.List) r11
            q00.d$q r5 = q00.C19053d.f48475n
            java.lang.Object r5 = r1.mo51505b(r5)
            com.moovit.tripplanner.TripPlannerSortType r5 = (com.moovit.tripplanner.TripPlannerSortType) r5
            com.moovit.tripplanner.TripPlannerSortType r6 = com.moovit.tripplanner.TripPlannerSortType.NO_CLIENT_SORTING
            if (r5 == 0) goto L_0x0036
            boolean r7 = r11.contains(r5)
            if (r7 != 0) goto L_0x0044
        L_0x0036:
            boolean r5 = c00.C13717b.m34258e(r11)
            if (r5 != 0) goto L_0x0043
            java.lang.Object r5 = r11.get(r4)
            java.lang.Enum r5 = (java.lang.Enum) r5
            goto L_0x0044
        L_0x0043:
            r5 = r6
        L_0x0044:
            com.moovit.tripplanner.TripPlannerSortType r5 = (com.moovit.tripplanner.TripPlannerSortType) r5
            f00.g$b r6 = new f00.g$b
            sz.c<com.moovit.tripplanner.TripPlannerSortType> r7 = com.moovit.tripplanner.TripPlannerSortType.CODER
            java.lang.String r8 = "user_preferable_sort_type"
            r6.<init>(r8, r7, r5)
            f00.f r12 = new f00.f
            r12.<init>(r3, r6)
            java.lang.Object r5 = r12.mo49542a()
            com.moovit.tripplanner.TripPlannerSortType r5 = (com.moovit.tripplanner.TripPlannerSortType) r5
            boolean r5 = r11.contains(r5)
            if (r5 != 0) goto L_0x0063
            r12.mo49543b()
        L_0x0063:
            q00.d$t r5 = q00.C19053d.f48478q
            java.lang.Object r5 = r1.mo51505b(r5)
            r7 = r5
            java.util.List r7 = (java.util.List) r7
            q00.d$s r5 = q00.C19053d.f48477p
            java.lang.Object r5 = r1.mo51505b(r5)
            com.moovit.tripplanner.TripPlannerRouteType r5 = (com.moovit.tripplanner.TripPlannerRouteType) r5
            com.moovit.tripplanner.TripPlannerRouteType r6 = com.moovit.tripplanner.TripPlannerRouteType.FASTEST
            if (r5 == 0) goto L_0x007e
            boolean r8 = r7.contains(r5)
            if (r8 != 0) goto L_0x008c
        L_0x007e:
            boolean r5 = c00.C13717b.m34258e(r7)
            if (r5 != 0) goto L_0x008b
            java.lang.Object r5 = r7.get(r4)
            java.lang.Enum r5 = (java.lang.Enum) r5
            goto L_0x008c
        L_0x008b:
            r5 = r6
        L_0x008c:
            com.moovit.tripplanner.TripPlannerRouteType r5 = (com.moovit.tripplanner.TripPlannerRouteType) r5
            f00.g$b r6 = new f00.g$b
            sz.c<com.moovit.tripplanner.TripPlannerRouteType> r8 = com.moovit.tripplanner.TripPlannerRouteType.CODER
            java.lang.String r9 = "user_preferable_route_type"
            r6.<init>(r9, r8, r5)
            f00.f r8 = new f00.f
            r8.<init>(r3, r6)
            java.lang.Object r5 = r8.mo49542a()
            com.moovit.tripplanner.TripPlannerRouteType r5 = (com.moovit.tripplanner.TripPlannerRouteType) r5
            boolean r5 = r7.contains(r5)
            if (r5 != 0) goto L_0x00ab
            r8.mo49543b()
        L_0x00ab:
            java.util.ArrayList r9 = new java.util.ArrayList
            com.moovit.tripplanner.TripPlannerTransportType[] r5 = com.moovit.tripplanner.TripPlannerTransportType.values()
            int r5 = r5.length
            r9.<init>(r5)
            g30.h r2 = r2.f50165a
            java.util.List r2 = r2.mo20299a()
            java.util.Iterator r2 = r2.iterator()
        L_0x00bf:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00ea
            java.lang.Object r5 = r2.next()
            com.moovit.transit.TransitType r5 = (com.moovit.transit.TransitType) r5
            com.moovit.tripplanner.TripPlannerTransportTypeInfo r6 = new com.moovit.tripplanner.TripPlannerTransportTypeInfo
            c00.c r10 = com.moovit.transit.C7841a.f23766a
            com.moovit.network.model.ServerId r10 = r5.f23757b
            int r10 = r10.f15142b
            com.tranzmate.moovit.protocol.common.MVRouteType r10 = com.tranzmate.moovit.protocol.common.MVRouteType.findByValue(r10)
            com.moovit.tripplanner.TripPlannerTransportType r10 = com.moovit.itinerary.C16080a.m40955k(r10)
            int r13 = r5.f23758c
            java.lang.String r13 = r0.getString(r13)
            com.moovit.image.model.Image r5 = r5.f23759d
            r6.<init>(r10, r13, r5)
            r9.add(r6)
            goto L_0x00bf
        L_0x00ea:
            q00.d$a r2 = q00.C19053d.f48479r
            java.lang.Object r2 = r1.mo51505b(r2)
            java.util.Set r2 = (java.util.Set) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x00f6:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x018b
            java.lang.Object r5 = r2.next()
            com.moovit.tripplanner.TripPlannerTransportType r5 = (com.moovit.tripplanner.TripPlannerTransportType) r5
            int[] r6 = com.moovit.tripplanner.C7864a.C7865a.f23805a
            int r10 = r5.ordinal()
            r6 = r6[r10]
            r10 = 1
            if (r6 == r10) goto L_0x016f
            r10 = 2
            if (r6 == r10) goto L_0x015a
            r10 = 3
            if (r6 == r10) goto L_0x0145
            r10 = 4
            if (r6 == r10) goto L_0x0130
            r10 = 5
            if (r6 == r10) goto L_0x011b
            r5 = 0
            goto L_0x0184
        L_0x011b:
            com.moovit.tripplanner.TripPlannerTransportTypeInfo r6 = new com.moovit.tripplanner.TripPlannerTransportTypeInfo
            int r10 = p824tp.C19746x.trip_plan_preference_personal_car
            java.lang.String r10 = r0.getString(r10)
            com.moovit.image.model.ResourceImage r13 = new com.moovit.image.model.ResourceImage
            int r14 = p824tp.C19739q.ic_car_24_on_surface
            java.lang.String[] r15 = new java.lang.String[r4]
            r13.<init>(r14, r15)
            r6.<init>(r5, r10, r13)
            goto L_0x0183
        L_0x0130:
            com.moovit.tripplanner.TripPlannerTransportTypeInfo r6 = new com.moovit.tripplanner.TripPlannerTransportTypeInfo
            int r10 = p824tp.C19746x.trip_plan_preference_car
            java.lang.String r10 = r0.getString(r10)
            com.moovit.image.model.ResourceImage r13 = new com.moovit.image.model.ResourceImage
            int r14 = p824tp.C19739q.ic_car_24_on_surface
            java.lang.String[] r15 = new java.lang.String[r4]
            r13.<init>(r14, r15)
            r6.<init>(r5, r10, r13)
            goto L_0x0183
        L_0x0145:
            com.moovit.tripplanner.TripPlannerTransportTypeInfo r6 = new com.moovit.tripplanner.TripPlannerTransportTypeInfo
            int r10 = p824tp.C19746x.trip_plan_preference_moped
            java.lang.String r10 = r0.getString(r10)
            com.moovit.image.model.ResourceImage r13 = new com.moovit.image.model.ResourceImage
            int r14 = p824tp.C19739q.ic_moped_24_on_surface
            java.lang.String[] r15 = new java.lang.String[r4]
            r13.<init>(r14, r15)
            r6.<init>(r5, r10, r13)
            goto L_0x0183
        L_0x015a:
            com.moovit.tripplanner.TripPlannerTransportTypeInfo r6 = new com.moovit.tripplanner.TripPlannerTransportTypeInfo
            int r10 = p824tp.C19746x.trip_plan_preference_scooter
            java.lang.String r10 = r0.getString(r10)
            com.moovit.image.model.ResourceImage r13 = new com.moovit.image.model.ResourceImage
            int r14 = p824tp.C19739q.ic_scooter_24_on_surface
            java.lang.String[] r15 = new java.lang.String[r4]
            r13.<init>(r14, r15)
            r6.<init>(r5, r10, r13)
            goto L_0x0183
        L_0x016f:
            com.moovit.tripplanner.TripPlannerTransportTypeInfo r6 = new com.moovit.tripplanner.TripPlannerTransportTypeInfo
            int r10 = p824tp.C19746x.trip_plan_preference_bike
            java.lang.String r10 = r0.getString(r10)
            com.moovit.image.model.ResourceImage r13 = new com.moovit.image.model.ResourceImage
            int r14 = p824tp.C19739q.ic_bike_24_on_surface
            java.lang.String[] r15 = new java.lang.String[r4]
            r13.<init>(r14, r15)
            r6.<init>(r5, r10, r13)
        L_0x0183:
            r5 = r6
        L_0x0184:
            if (r5 == 0) goto L_0x00f6
            r9.add(r5)
            goto L_0x00f6
        L_0x018b:
            f00.g$c r0 = new f00.g$c
            sz.c<com.moovit.tripplanner.TripPlannerTransportType> r2 = com.moovit.tripplanner.TripPlannerTransportType.CODER
            java.lang.Class<com.moovit.tripplanner.TripPlannerTransportType> r5 = com.moovit.tripplanner.TripPlannerTransportType.class
            java.util.EnumSet r5 = java.util.EnumSet.allOf(r5)
            r0.<init>(r2, r5)
            f00.f r10 = new f00.f
            r10.<init>(r3, r0)
            q00.d$b r0 = q00.C19053d.f48480s
            java.lang.Object r0 = r1.mo51505b(r0)
            r13 = r0
            java.util.List r13 = (java.util.List) r13
            com.moovit.tripplanner.TripPlannerPersonalPrefs r0 = new com.moovit.tripplanner.TripPlannerPersonalPrefs
            r1 = -1
            r0.<init>(r4, r1)
            com.moovit.tripplanner.TripPlannerPersonalPrefs$c r1 = new com.moovit.tripplanner.TripPlannerPersonalPrefs$c
            r1.<init>(r0)
            f00.f r14 = new f00.f
            r14.<init>(r3, r1)
            v90.a r0 = new v90.a
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.tripplanner.C7864a.mo22058d(android.content.Context, lz.a):java.lang.Object");
    }
}
