package com.moovit.util.time;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import com.moovit.commons.request.BadResponseException;
import com.moovit.network.model.ServerId;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitFrequency;
import com.tranzmate.moovit.protocol.linearrivals.MVArrivalTimesConf;
import com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel;
import com.tranzmate.moovit.protocol.linearrivals.MVCongestionStatusSource;
import com.tranzmate.moovit.protocol.linearrivals.MVLineArrivals;
import com.tranzmate.moovit.protocol.linearrivals.MVStopRealTimeInformation;
import i30.C5268d;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;
import p066e0.C4454r0;
import p543hq.C17478e;
import p638lr.C18262i;
import p736pu.C18993b;
import p824tp.C19728f;
import p828tt.C19759a;
import p952yy.C20786b;
import p952yy.C20787c;
import p977zz.C20950l0;

/* renamed from: com.moovit.util.time.a */
public final class C7923a {

    /* renamed from: com.moovit.util.time.a$a */
    public static /* synthetic */ class C7924a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23931a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f23932b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f23933c;

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x009d */
        static {
            /*
                com.tranzmate.moovit.protocol.linearrivals.MVArrivalStatus2[] r0 = com.tranzmate.moovit.protocol.linearrivals.MVArrivalStatus2.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23933c = r0
                r1 = 1
                com.tranzmate.moovit.protocol.linearrivals.MVArrivalStatus2 r2 = com.tranzmate.moovit.protocol.linearrivals.MVArrivalStatus2.ON_TIME     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f23933c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.linearrivals.MVArrivalStatus2 r3 = com.tranzmate.moovit.protocol.linearrivals.MVArrivalStatus2.DELAYED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f23933c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.linearrivals.MVArrivalStatus2 r4 = com.tranzmate.moovit.protocol.linearrivals.MVArrivalStatus2.AHEAD_OF_TIME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f23933c     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.linearrivals.MVArrivalStatus2 r5 = com.tranzmate.moovit.protocol.linearrivals.MVArrivalStatus2.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.tranzmate.moovit.protocol.linearrivals.MVCongestionStatusSource[] r4 = com.tranzmate.moovit.protocol.linearrivals.MVCongestionStatusSource.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f23932b = r4
                com.tranzmate.moovit.protocol.linearrivals.MVCongestionStatusSource r5 = com.tranzmate.moovit.protocol.linearrivals.MVCongestionStatusSource.SENSOR     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = f23932b     // Catch:{ NoSuchFieldError -> 0x004e }
                com.tranzmate.moovit.protocol.linearrivals.MVCongestionStatusSource r5 = com.tranzmate.moovit.protocol.linearrivals.MVCongestionStatusSource.USER     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r4 = f23932b     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.tranzmate.moovit.protocol.linearrivals.MVCongestionStatusSource r5 = com.tranzmate.moovit.protocol.linearrivals.MVCongestionStatusSource.PREDICTION     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel[] r4 = com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f23931a = r4
                com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel r5 = com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel.EMPTY     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r1 = f23931a     // Catch:{ NoSuchFieldError -> 0x0073 }
                com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel r4 = com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel.FEW     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f23931a     // Catch:{ NoSuchFieldError -> 0x007d }
                com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel r1 = com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel.LOW     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r0 = f23931a     // Catch:{ NoSuchFieldError -> 0x0087 }
                com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel r1 = com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel.MED     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = f23931a     // Catch:{ NoSuchFieldError -> 0x0092 }
                com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel r1 = com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel.HIGH     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = f23931a     // Catch:{ NoSuchFieldError -> 0x009d }
                com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel r1 = com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel.FULL     // Catch:{ NoSuchFieldError -> 0x009d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                int[] r0 = f23931a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel r1 = com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel.PACKED     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.util.time.C7923a.C7924a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static long m18001a(long j) {
        return j + ((long) TimeZone.getDefault().getOffset(j));
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01eb  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0166  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.moovit.transit.Schedule m18002b(java.util.Calendar r38, java.util.List<com.tranzmate.moovit.protocol.linearrivals.MVArrival> r39, boolean r40, boolean r41, int r42, i30.C5268d r43) {
        /*
            r1 = r38
            r2 = r43
            java.util.ArrayList r3 = new java.util.ArrayList
            int r0 = r39.size()
            r3.<init>(r0)
            java.util.Iterator r4 = r39.iterator()
        L_0x0011:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0208
            java.lang.Object r0 = r4.next()
            r6 = r0
            com.tranzmate.moovit.protocol.linearrivals.MVArrival r6 = (com.tranzmate.moovit.protocol.linearrivals.MVArrival) r6
            int r0 = r6.relativeStaticTimeSpanSeconds
            long r8 = m18012l(r0, r1)
            boolean r0 = r6.mo27980m()
            if (r0 == 0) goto L_0x0031
            int r0 = r6.relativeRealTimeSpanSeconds
            long r10 = m18012l(r0, r1)
            goto L_0x0033
        L_0x0031:
            r10 = -1
        L_0x0033:
            int r0 = r6.patternStopsSize
            int r7 = r6.stopIndex
            int r0 = r0 + -1
            if (r7 >= r0) goto L_0x003d
            r0 = 5
            goto L_0x003e
        L_0x003d:
            r0 = 4
        L_0x003e:
            if (r7 <= 0) goto L_0x0042
            r0 = r0 | 2
        L_0x0042:
            r13 = r0
            long r14 = r6.tripId
            com.moovit.network.model.LongServerId r7 = new com.moovit.network.model.LongServerId
            r7.<init>(r14)
            int r0 = r6.patternId
            com.moovit.network.model.ServerId r14 = new com.moovit.network.model.ServerId
            r14.<init>(r0)
            com.moovit.database.DbEntityRef r14 = com.moovit.database.DbEntityRef.newTransitPatternRef((com.moovit.network.model.ServerId) r14)
            com.moovit.network.model.ServerId r0 = r14.getServerId()
            com.moovit.util.ServerIdMap<com.moovit.transit.TransitPattern> r15 = r2.f17407d
            java.lang.Object r0 = r15.get(r0)
            com.moovit.transit.TransitPattern r0 = (com.moovit.transit.TransitPattern) r0
            if (r0 == 0) goto L_0x0066
            r14.resolveTo(r0)
        L_0x0066:
            int r15 = r6.stopIndex
            r16 = 0
            if (r41 == 0) goto L_0x00ab
            boolean r0 = r6.mo27974h()
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r6.mo27974h()
            if (r0 != 0) goto L_0x0079
            goto L_0x0091
        L_0x0079:
            int r0 = r6.frequencyId
            com.moovit.network.model.ServerId r5 = new com.moovit.network.model.ServerId
            r5.<init>(r0)
            com.moovit.util.ServerIdMap<com.moovit.transit.TransitFrequency> r0 = r2.f17411h
            java.lang.Object r0 = r0.get(r5)
            com.moovit.transit.TransitFrequency r0 = (com.moovit.transit.TransitFrequency) r0
            if (r0 != 0) goto L_0x008b
            goto L_0x0091
        L_0x008b:
            boolean r5 = r6.mo27973g()
            if (r5 != 0) goto L_0x0096
        L_0x0091:
            r23 = r4
            r0 = r16
            goto L_0x00a9
        L_0x0096:
            int r5 = r6.relativeStaticTimeSpanSeconds
            int r12 = r6.durationInSeconds
            int r5 = r5 - r12
            r23 = r4
            long r4 = m18012l(r5, r1)
            java.util.TimeZone r12 = r38.getTimeZone()
            com.moovit.util.time.TimeFrequency r0 = m18006f(r12, r0, r4)
        L_0x00a9:
            r4 = r0
            goto L_0x00af
        L_0x00ab:
            r23 = r4
            r4 = r16
        L_0x00af:
            boolean r0 = r6.mo27982p()
            r5 = 1
            if (r0 == 0) goto L_0x00ee
            com.tranzmate.moovit.protocol.linearrivals.MVArrivalStatus2 r0 = r6.status
            int[] r12 = com.moovit.util.time.C7923a.C7924a.f23933c
            int r18 = r0.ordinal()
            r12 = r12[r18]
            if (r12 == r5) goto L_0x00eb
            r5 = 2
            if (r12 == r5) goto L_0x00e8
            r5 = 3
            if (r12 == r5) goto L_0x00e5
            r5 = 4
            if (r12 != r5) goto L_0x00ce
            com.moovit.util.time.Time$Status r0 = com.moovit.util.time.Time.Status.CANCELED
            goto L_0x00f0
        L_0x00ce:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown arrival data status: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x00e5:
            com.moovit.util.time.Time$Status r0 = com.moovit.util.time.Time.Status.AHEAD_OF_TIME
            goto L_0x00f0
        L_0x00e8:
            com.moovit.util.time.Time$Status r0 = com.moovit.util.time.Time.Status.DELAY
            goto L_0x00f0
        L_0x00eb:
            com.moovit.util.time.Time$Status r0 = com.moovit.util.time.Time.Status.ON_TIME
            goto L_0x00f0
        L_0x00ee:
            com.moovit.util.time.Time$Status r0 = com.moovit.util.time.Time.Status.UNKNOWN
        L_0x00f0:
            r19 = r0
            java.lang.String r5 = r6.platformName
            boolean r12 = r6.isLastArrival
            boolean r0 = r6.mo27988u()
            if (r0 == 0) goto L_0x0158
            com.tranzmate.moovit.protocol.linearrivals.MVVehicleLocation r0 = r6.vehicleLocation
            java.lang.String r1 = r0.vehicleId     // Catch:{ Exception -> 0x0145 }
            r30 = r3
            long r2 = r0.vehicleSampleTimeUtc     // Catch:{ Exception -> 0x0143 }
            r17 = r7
            com.tranzmate.moovit.protocol.common.MVLatLon r7 = r0.latlon     // Catch:{ Exception -> 0x013f }
            com.moovit.commons.geo.LatLonE6 r28 = c70.C13749c.m34322h(r7)     // Catch:{ Exception -> 0x013f }
            boolean r7 = r0.mo28120g()     // Catch:{ Exception -> 0x013f }
            if (r7 == 0) goto L_0x012d
            com.tranzmate.moovit.protocol.linearrivals.MVVehicleProgress r0 = r0.progress     // Catch:{ Exception -> 0x013f }
            int r7 = r0.nextStopIndex     // Catch:{ Exception -> 0x013f }
            if (r7 >= 0) goto L_0x0119
            goto L_0x012d
        L_0x0119:
            byte r0 = r0.progress     // Catch:{ Exception -> 0x013f }
            r18 = r5
            r5 = 1
            if (r0 < r5) goto L_0x012f
            r5 = 100
            if (r0 <= r5) goto L_0x0125
            goto L_0x012f
        L_0x0125:
            com.moovit.util.time.TimeVehicleLocation$VehicleProgress r5 = new com.moovit.util.time.TimeVehicleLocation$VehicleProgress     // Catch:{ Exception -> 0x013d }
            r5.<init>(r7, r0)     // Catch:{ Exception -> 0x013d }
            r29 = r5
            goto L_0x0131
        L_0x012d:
            r18 = r5
        L_0x012f:
            r29 = r16
        L_0x0131:
            com.moovit.util.time.TimeVehicleLocation r0 = new com.moovit.util.time.TimeVehicleLocation     // Catch:{ Exception -> 0x013d }
            r24 = r0
            r25 = r1
            r26 = r2
            r24.<init>(r25, r26, r28, r29)     // Catch:{ Exception -> 0x013d }
            goto L_0x0155
        L_0x013d:
            r0 = move-exception
            goto L_0x014c
        L_0x013f:
            r0 = move-exception
            r18 = r5
            goto L_0x014c
        L_0x0143:
            r0 = move-exception
            goto L_0x0148
        L_0x0145:
            r0 = move-exception
            r30 = r3
        L_0x0148:
            r18 = r5
            r17 = r7
        L_0x014c:
            de.f r1 = p435de.C16596f.m42113a()
            r1.mo49364c(r0)
            r0 = r16
        L_0x0155:
            r21 = r0
            goto L_0x0160
        L_0x0158:
            r30 = r3
            r18 = r5
            r17 = r7
            r21 = r16
        L_0x0160:
            boolean r0 = r6.mo27986t()
            if (r0 == 0) goto L_0x01ba
            com.tranzmate.moovit.protocol.linearrivals.MVArrivalAttributes r0 = r6.vehicleAttributes
            long r1 = r0.reportTimeUtc
            boolean r3 = r0.mo27997g()
            if (r3 == 0) goto L_0x0179
            com.tranzmate.moovit.protocol.linearrivals.MVCongestionLevel r3 = r0.level
            com.moovit.util.time.CongestionLevel r3 = m18003c(r3)
            r34 = r3
            goto L_0x017b
        L_0x0179:
            r34 = r16
        L_0x017b:
            boolean r3 = r0.mo28001j()
            if (r3 == 0) goto L_0x018a
            com.tranzmate.moovit.protocol.linearrivals.MVCongestionStatusSource r3 = r0.source
            com.moovit.util.time.CongestionSource r3 = m18004d(r3)
            r35 = r3
            goto L_0x018c
        L_0x018a:
            r35 = r16
        L_0x018c:
            boolean r3 = r0.mo27996f()
            if (r3 == 0) goto L_0x019b
            boolean r3 = r0.isAccessible
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r36 = r3
            goto L_0x019d
        L_0x019b:
            r36 = r16
        L_0x019d:
            boolean r3 = r0.mo27998h()
            if (r3 == 0) goto L_0x01ac
            boolean r0 = r0.nfcPaymentSupport
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r37 = r0
            goto L_0x01ae
        L_0x01ac:
            r37 = r16
        L_0x01ae:
            com.moovit.util.time.TimeVehicleAttributes r0 = new com.moovit.util.time.TimeVehicleAttributes
            r31 = r0
            r32 = r1
            r31.<init>(r32, r34, r35, r36, r37)
            r22 = r0
            goto L_0x01bc
        L_0x01ba:
            r22 = r16
        L_0x01bc:
            if (r40 == 0) goto L_0x01d6
            boolean r0 = r6.mo27985s()
            if (r0 == 0) goto L_0x01ce
            int r0 = r6.tripShapeId
            com.moovit.network.model.ServerId r1 = new com.moovit.network.model.ServerId
            r1.<init>(r0)
            r16 = r1
            goto L_0x01d6
        L_0x01ce:
            com.moovit.commons.request.BadResponseException r0 = new com.moovit.commons.request.BadResponseException
            java.lang.String r1 = "Shape segments are not included when requested."
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01d6:
            com.moovit.util.time.Time r0 = new com.moovit.util.time.Time
            r1 = r17
            r7 = r0
            r2 = r12
            r12 = r13
            r13 = r1
            r17 = r4
            r20 = r2
            r7.<init>(r8, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            int r1 = r0.f23903d
            r1 = r42 & r1
            if (r1 == 0) goto L_0x01ed
            r5 = 1
            goto L_0x01ee
        L_0x01ed:
            r5 = 0
        L_0x01ee:
            if (r5 != 0) goto L_0x01fa
            r1 = r38
            r2 = r43
            r4 = r23
            r3 = r30
            goto L_0x0011
        L_0x01fa:
            r1 = r30
            r1.add(r0)
            r2 = r43
            r3 = r1
            r4 = r23
            r1 = r38
            goto L_0x0011
        L_0x0208:
            r1 = r3
            com.moovit.transit.Schedule r0 = new com.moovit.transit.Schedule
            r2 = 0
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.util.time.C7923a.m18002b(java.util.Calendar, java.util.List, boolean, boolean, int, i30.d):com.moovit.transit.Schedule");
    }

    /* renamed from: c */
    public static CongestionLevel m18003c(MVCongestionLevel mVCongestionLevel) {
        switch (C7924a.f23931a[mVCongestionLevel.ordinal()]) {
            case 1:
                return CongestionLevel.EMPTY;
            case 2:
                return CongestionLevel.FEW;
            case 3:
                return CongestionLevel.LOW;
            case 4:
                return CongestionLevel.MED;
            case 5:
                return CongestionLevel.HIGH;
            case 6:
                return CongestionLevel.FULL;
            case 7:
                return CongestionLevel.PACKED;
            default:
                throw new IllegalStateException("Unknown congestion level: " + mVCongestionLevel);
        }
    }

    /* renamed from: d */
    public static CongestionSource m18004d(MVCongestionStatusSource mVCongestionStatusSource) {
        int i = C7924a.f23932b[mVCongestionStatusSource.ordinal()];
        if (i == 1) {
            return CongestionSource.SENSOR;
        }
        if (i == 2) {
            return CongestionSource.USER;
        }
        if (i == 3) {
            return CongestionSource.PREDICTION;
        }
        throw new IllegalStateException("Unknown congestion source: " + mVCongestionStatusSource);
    }

    /* renamed from: e */
    public static StopRealTimeInformation m18005e(MVStopRealTimeInformation mVStopRealTimeInformation) {
        return new StopRealTimeInformation(C13720d.m34274d(C13720d.m34273c(mVStopRealTimeInformation.congestionStatus, (C13722f) null, new C4454r0(27)), new C17478e(23), new C19759a(23)));
    }

    /* renamed from: f */
    public static TimeFrequency m18006f(TimeZone timeZone, TransitFrequency transitFrequency, long j) {
        Calendar instance = Calendar.getInstance(timeZone);
        instance.setTimeInMillis(j);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        TimeFrequency j2 = m18010j(instance, transitFrequency, j);
        if (j2 != null) {
            return j2;
        }
        instance.add(5, -1);
        return m18010j(instance, transitFrequency, j);
    }

    /* renamed from: g */
    public static C20787c m18007g(ServerId serverId, Calendar calendar, MVLineArrivals mVLineArrivals, C20786b bVar, boolean z, StopRealTimeInformation stopRealTimeInformation, C5268d dVar) {
        HashMap<OK, OV> hashMap;
        MVLineArrivals mVLineArrivals2 = mVLineArrivals;
        C20786b bVar2 = bVar;
        int i = bVar2.f52448b;
        ServerId serverId2 = new ServerId(mVLineArrivals2.lineId);
        boolean z2 = bVar2.f52454h;
        Schedule b = m18002b(calendar, mVLineArrivals2.arrivals, z2, z, i, dVar);
        if (!z2 || C13717b.m34258e(mVLineArrivals2.arrivals)) {
            hashMap = null;
        } else if (mVLineArrivals.mo28041h()) {
            hashMap = C13720d.m34274d(mVLineArrivals2.shapeSegments, new C18262i(29), new C18993b(dVar, 1));
        } else {
            throw new BadResponseException("Shape segments are not included when requested.");
        }
        return new C20787c(serverId2, serverId, b, stopRealTimeInformation, hashMap);
    }

    /* renamed from: h */
    public static MVArrivalTimesConf m18008h(C20786b bVar) {
        boolean z = bVar.f52450d;
        boolean z2 = bVar.f52451e;
        boolean z3 = bVar.f52449c;
        boolean z4 = bVar.f52454h;
        boolean z5 = bVar.f52455i;
        MVArrivalTimesConf mVArrivalTimesConf = new MVArrivalTimesConf();
        mVArrivalTimesConf.intrestingInLastArrivals = z;
        mVArrivalTimesConf.mo28023r();
        mVArrivalTimesConf.includeOnlyLastArrivals = z2;
        mVArrivalTimesConf.mo28020o();
        mVArrivalTimesConf.includeStaticSchedule = z3;
        mVArrivalTimesConf.mo28022q();
        mVArrivalTimesConf.includeShapeSegments = z4;
        mVArrivalTimesConf.mo28021p();
        mVArrivalTimesConf.forceAllArrivalsRetrieval = z5;
        mVArrivalTimesConf.mo28018l();
        Time time = bVar.f52447a;
        if (time != null) {
            mVArrivalTimesConf.fromTime = time.mo24631g();
            mVArrivalTimesConf.mo28019m();
        }
        return mVArrivalTimesConf;
    }

    /* renamed from: i */
    public static long m18009i(long j) {
        return j - ((long) TimeZone.getDefault().getOffset(j));
    }

    /* renamed from: j */
    public static TimeFrequency m18010j(Calendar calendar, TransitFrequency transitFrequency, long j) {
        List<C20950l0<Integer>> list = transitFrequency.f23680c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C20950l0 l0Var = list.get(i);
            long l = m18012l(((Integer) l0Var.f52695a).intValue(), calendar);
            long l2 = m18012l(((Integer) l0Var.f52696b).intValue(), calendar);
            if (l <= j && j <= l2) {
                return new TimeFrequency(new C20950l0(Long.valueOf(l), Long.valueOf(l2)), transitFrequency.f23681d.get(i));
            }
        }
        return null;
    }

    /* renamed from: k */
    public static Calendar m18011k(C19728f fVar, int i) {
        Calendar instance = Calendar.getInstance(fVar.f50165a.f16131f);
        instance.set(1970, 0, 1, 0, 0, 0);
        instance.set(14, 0);
        instance.add(5, i);
        return instance;
    }

    /* renamed from: l */
    public static long m18012l(int i, Calendar calendar) {
        calendar.add(13, i);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(13, -i);
        return timeInMillis;
    }
}
