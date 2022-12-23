package com.moovit.navigation;

import android.location.Location;
import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import com.moovit.app.navigation.itinerary.ItineraryNavigable;
import com.moovit.commons.geo.Geofence;
import com.moovit.commons.geo.LatLonE6;
import com.tranzmate.moovit.protocol.checkin.MVShape;
import com.tranzmate.moovit.protocol.common.MVGeofence;
import i30.C5268d;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p001a0.C0016g;
import p543hq.C17478e;

/* renamed from: com.moovit.navigation.c */
public final class C4229c {

    /* renamed from: com.moovit.navigation.c$a */
    public static /* synthetic */ class C4230a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15094a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f15095b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006e */
        static {
            /*
                com.tranzmate.moovit.protocol.checkin.MVPathReliability[] r0 = com.tranzmate.moovit.protocol.checkin.MVPathReliability.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f15095b = r0
                r1 = 1
                com.tranzmate.moovit.protocol.checkin.MVPathReliability r2 = com.tranzmate.moovit.protocol.checkin.MVPathReliability.RELIABLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f15095b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.checkin.MVPathReliability r3 = com.tranzmate.moovit.protocol.checkin.MVPathReliability.NOT_RELIABLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f15095b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.checkin.MVPathReliability r4 = com.tranzmate.moovit.protocol.checkin.MVPathReliability.IRRELEVANT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.tranzmate.moovit.protocol.navigation.MVNavigationLegType[] r3 = com.tranzmate.moovit.protocol.navigation.MVNavigationLegType.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f15094a = r3
                com.tranzmate.moovit.protocol.navigation.MVNavigationLegType r4 = com.tranzmate.moovit.protocol.navigation.MVNavigationLegType.TAXI     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f15094a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.tranzmate.moovit.protocol.navigation.MVNavigationLegType r3 = com.tranzmate.moovit.protocol.navigation.MVNavigationLegType.TRANSIT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f15094a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.tranzmate.moovit.protocol.navigation.MVNavigationLegType r1 = com.tranzmate.moovit.protocol.navigation.MVNavigationLegType.WAIT     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f15094a     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.tranzmate.moovit.protocol.navigation.MVNavigationLegType r1 = com.tranzmate.moovit.protocol.navigation.MVNavigationLegType.WALK     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f15094a     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.tranzmate.moovit.protocol.navigation.MVNavigationLegType r1 = com.tranzmate.moovit.protocol.navigation.MVNavigationLegType.BICYCLE     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r0 = f15094a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.tranzmate.moovit.protocol.navigation.MVNavigationLegType r1 = com.tranzmate.moovit.protocol.navigation.MVNavigationLegType.DOCKLESS     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f15094a     // Catch:{ NoSuchFieldError -> 0x0079 }
                com.tranzmate.moovit.protocol.navigation.MVNavigationLegType r1 = com.tranzmate.moovit.protocol.navigation.MVNavigationLegType.PERSONAL_CAR     // Catch:{ NoSuchFieldError -> 0x0079 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0079 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0079 }
            L_0x0079:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.navigation.C4229c.C4230a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static void m11337a(int i, int i2, ItineraryNavigable itineraryNavigable, String str) throws BadNavigableException {
        if (i2 < i) {
            StringBuilder l = C13555b.m33973l("Decreasing ", str, " in navigable ");
            l.append(itineraryNavigable.f39150k);
            throw new BadNavigableException(l.toString());
        }
    }

    /* renamed from: b */
    public static void m11338b(int i, int i2, ItineraryNavigable itineraryNavigable, String str) throws BadNavigableException {
        if (i2 > i) {
            StringBuilder l = C13555b.m33973l("Increasing ", str, " in navigable ");
            l.append(itineraryNavigable.f39150k);
            throw new BadNavigableException(l.toString());
        }
    }

    /* renamed from: c */
    public static Geofence m11339c(MVGeofence mVGeofence) {
        return new Geofence(LatLonE6.m40177j(C13749c.m34322h(mVGeofence.center).mo46929u((Location) null)), (float) mVGeofence.radiusMeters);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: com.moovit.commons.geo.Polylon} */
    /* JADX WARNING: type inference failed for: r17v0, types: [com.moovit.commons.geo.Polyline] */
    /* JADX WARNING: type inference failed for: r17v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0175  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.moovit.navigation.NavigationLeg m11340d(com.moovit.navigation.NavigationLeg.Type r37, int r38, java.util.List<com.tranzmate.moovit.protocol.checkin.MVShape> r39, com.moovit.network.model.ServerId r40, com.moovit.network.model.ServerId r41, i30.C5268d r42) {
        /*
            r0 = r41
            boolean r1 = c00.C13717b.m34258e(r39)
            if (r1 != 0) goto L_0x021d
            r1 = 0
            if (r0 == 0) goto L_0x0030
            r2 = r42
            com.moovit.transit.TransitLine r2 = r2.mo21063b(r0)
            if (r2 == 0) goto L_0x0014
            goto L_0x0031
        L_0x0014:
            com.moovit.commons.request.BadResponseException r1 = new com.moovit.commons.request.BadResponseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Missing transit line ("
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = ")"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>((java.lang.String) r0)
            throw r1
        L_0x0030:
            r2 = r1
        L_0x0031:
            int r0 = r39.size()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            r4 = 0
            r12 = 0
        L_0x003c:
            if (r12 >= r0) goto L_0x0213
            r13 = r39
            java.lang.Object r5 = r13.get(r12)
            r14 = r5
            com.tranzmate.moovit.protocol.checkin.MVShape r14 = (com.tranzmate.moovit.protocol.checkin.MVShape) r14
            int r5 = r14.shapeId
            com.moovit.network.model.ServerId r15 = new com.moovit.network.model.ServerId
            r15.<init>(r5)
            java.lang.String r5 = r14.encodedPolyline
            if (r5 != 0) goto L_0x0055
            r17 = r1
            goto L_0x005b
        L_0x0055:
            com.moovit.commons.geo.Polylon r5 = com.moovit.commons.geo.Polylon.m40195m(r5)
            r17 = r5
        L_0x005b:
            java.util.List<java.lang.Integer> r5 = r14.shapeStopIds
            e0.r0 r6 = new e0.r0
            r7 = 17
            r6.<init>(r7)
            java.util.ArrayList r19 = c00.C13720d.m34273c(r5, r1, r6)
            java.util.List<com.tranzmate.moovit.protocol.checkin.MVNavigationGeofence> r11 = r14.geofences
            int r10 = r11.size()
            android.util.SparseIntArray r5 = new android.util.SparseIntArray
            r5.<init>(r10)
            r6 = 0
        L_0x0074:
            if (r6 >= r10) goto L_0x0084
            java.lang.Object r7 = r11.get(r6)
            com.tranzmate.moovit.protocol.checkin.MVNavigationGeofence r7 = (com.tranzmate.moovit.protocol.checkin.MVNavigationGeofence) r7
            int r7 = r7.geofenceId
            r5.put(r7, r6)
            int r6 = r6 + 1
            goto L_0x0074
        L_0x0084:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r5 = 0
        L_0x008a:
            int r6 = r11.size()
            r8 = 1
            if (r5 >= r6) goto L_0x00a8
            java.lang.Object r6 = r11.get(r5)
            com.tranzmate.moovit.protocol.checkin.MVNavigationGeofence r6 = (com.tranzmate.moovit.protocol.checkin.MVNavigationGeofence) r6
            com.tranzmate.moovit.protocol.checkin.MVGeofenceMetadata r6 = r6.metadata
            byte r6 = r6.flags
            r6 = r6 & r8
            if (r6 == 0) goto L_0x00a5
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r9.add(r6)
        L_0x00a5:
            int r5 = r5 + 1
            goto L_0x008a
        L_0x00a8:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r10)
            boolean r5 = r9.isEmpty()
            r6 = -1
            if (r5 == 0) goto L_0x00b6
            r5 = -1
            goto L_0x00c0
        L_0x00b6:
            java.lang.Object r5 = r9.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
        L_0x00c0:
            if (r5 != r6) goto L_0x00c4
            r1 = -1
            goto L_0x00d0
        L_0x00c4:
            java.lang.Object r16 = r11.get(r5)
            r1 = r16
            com.tranzmate.moovit.protocol.checkin.MVNavigationGeofence r1 = (com.tranzmate.moovit.protocol.checkin.MVNavigationGeofence) r1
            com.tranzmate.moovit.protocol.checkin.MVGeofenceMetadata r1 = r1.metadata
            short r1 = r1.stopIndex
        L_0x00d0:
            r8 = 0
            r16 = -1
        L_0x00d3:
            if (r4 >= r10) goto L_0x01b9
            java.lang.Object r18 = r11.get(r4)
            r6 = r18
            com.tranzmate.moovit.protocol.checkin.MVNavigationGeofence r6 = (com.tranzmate.moovit.protocol.checkin.MVNavigationGeofence) r6
            if (r4 != r5) goto L_0x0104
            int r18 = r9.size()
            r23 = r0
            r20 = -1
            int r0 = r18 + -1
            if (r8 >= r0) goto L_0x0108
            int r8 = r8 + 1
            java.lang.Object r0 = r9.get(r8)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Object r1 = r11.get(r0)
            com.tranzmate.moovit.protocol.checkin.MVNavigationGeofence r1 = (com.tranzmate.moovit.protocol.checkin.MVNavigationGeofence) r1
            com.tranzmate.moovit.protocol.checkin.MVGeofenceMetadata r1 = r1.metadata
            short r1 = r1.stopIndex
            r18 = r5
            goto L_0x010b
        L_0x0104:
            r23 = r0
            r20 = -1
        L_0x0108:
            r0 = r5
            r18 = r16
        L_0x010b:
            r16 = r8
            int r5 = r6.geofenceId
            com.moovit.network.model.ServerId r8 = new com.moovit.network.model.ServerId
            r8.<init>(r5)
            com.tranzmate.moovit.protocol.common.MVGeofence r5 = r6.geofence
            com.moovit.commons.geo.Geofence r21 = m11339c(r5)
            com.tranzmate.moovit.protocol.checkin.MVGeofenceMetadata r5 = r6.metadata
            byte r6 = r5.flags
            r22 = r6 & 2
            if (r22 == 0) goto L_0x0126
            r22 = r7
            r7 = 1
            goto L_0x0129
        L_0x0126:
            r22 = r7
            r7 = 0
        L_0x0129:
            r24 = r6 & 4
            r34 = r9
            if (r24 == 0) goto L_0x0131
            r9 = 1
            goto L_0x0132
        L_0x0131:
            r9 = 0
        L_0x0132:
            r24 = r6 & 8
            r35 = r10
            if (r24 == 0) goto L_0x013a
            r10 = 1
            goto L_0x013b
        L_0x013a:
            r10 = 0
        L_0x013b:
            r24 = r6 & 16
            r36 = r11
            if (r24 == 0) goto L_0x0143
            r11 = 1
            goto L_0x0144
        L_0x0143:
            r11 = 0
        L_0x0144:
            com.moovit.navigation.ArrivalState r25 = com.moovit.navigation.ArrivalState.getFromBooleanStates(r7, r9, r10, r11)
            r7 = r6 & 1
            if (r7 == 0) goto L_0x014f
            r26 = 1
            goto L_0x0151
        L_0x014f:
            r26 = 0
        L_0x0151:
            int r7 = r5.distanceToDestinationMeters
            int r9 = r5.timeToDestinationSecs
            r6 = r6 & 32
            if (r6 == 0) goto L_0x015c
            r29 = 1
            goto L_0x015e
        L_0x015c:
            r29 = 0
        L_0x015e:
            byte r5 = r5.expirationFromEtaMinutes
            int r5 = r5 * 60
            if (r7 >= 0) goto L_0x0167
            r27 = 0
            goto L_0x0169
        L_0x0167:
            r27 = r7
        L_0x0169:
            if (r9 >= 0) goto L_0x016e
            r28 = 0
            goto L_0x0170
        L_0x016e:
            r28 = r9
        L_0x0170:
            if (r5 >= 0) goto L_0x0175
            r33 = 0
            goto L_0x0177
        L_0x0175:
            r33 = r5
        L_0x0177:
            com.moovit.navigation.GeofenceMetadata r11 = new com.moovit.navigation.GeofenceMetadata
            r24 = r11
            r30 = r1
            r31 = r0
            r32 = r18
            r24.<init>(r25, r26, r27, r28, r29, r30, r31, r32, r33)
            com.moovit.navigation.NavigationGeofence r10 = new com.moovit.navigation.NavigationGeofence
            r5 = r10
            r6 = r21
            r9 = r22
            r7 = r8
            r21 = r0
            r0 = 1
            r8 = r38
            r0 = r9
            r22 = r34
            r9 = r12
            r25 = r1
            r1 = r10
            r24 = r35
            r10 = r4
            r26 = r36
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.add(r1)
            int r4 = r4 + 1
            r7 = r0
            r8 = r16
            r16 = r18
            r5 = r21
            r9 = r22
            r0 = r23
            r10 = r24
            r1 = r25
            r11 = r26
            r6 = -1
            goto L_0x00d3
        L_0x01b9:
            r23 = r0
            r0 = r7
            com.moovit.navigation.GeofencePath r1 = new com.moovit.navigation.GeofencePath
            r1.<init>(r0)
            int r0 = r14.totalDistanceToDestinationMeters
            int r4 = r14.totalTimeToDestinationSecs
            com.tranzmate.moovit.protocol.checkin.MVPathReliability r5 = r14.pathReliability
            int[] r6 = com.moovit.navigation.C4229c.C4230a.f15095b
            int r7 = r5.ordinal()
            r6 = r6[r7]
            r7 = 1
            if (r6 == r7) goto L_0x01f5
            r7 = 2
            if (r6 == r7) goto L_0x01f2
            r7 = 3
            if (r6 != r7) goto L_0x01db
            com.moovit.navigation.NavigationPath$ShapeReliability r5 = com.moovit.navigation.NavigationPath.ShapeReliability.IRRELEVANT
            goto L_0x01f7
        L_0x01db:
            com.moovit.commons.utils.ApplicationBugException r0 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown shape reliability: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01f2:
            com.moovit.navigation.NavigationPath$ShapeReliability r5 = com.moovit.navigation.NavigationPath.ShapeReliability.UNRELIABLE
            goto L_0x01f7
        L_0x01f5:
            com.moovit.navigation.NavigationPath$ShapeReliability r5 = com.moovit.navigation.NavigationPath.ShapeReliability.RELIABLE
        L_0x01f7:
            r18 = r5
            com.moovit.navigation.NavigationPath r5 = new com.moovit.navigation.NavigationPath
            r6 = r15
            r15 = r5
            r16 = r6
            r20 = r1
            r21 = r0
            r22 = r4
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r3.add(r5)
            int r12 = r12 + 1
            r0 = r23
            r1 = 0
            r4 = 0
            goto L_0x003c
        L_0x0213:
            com.moovit.navigation.NavigationLeg r0 = new com.moovit.navigation.NavigationLeg
            r1 = r37
            r4 = r40
            r0.<init>(r1, r3, r4, r2)
            return r0
        L_0x021d:
            com.moovit.commons.request.BadResponseException r0 = new com.moovit.commons.request.BadResponseException
            java.lang.String r1 = "shapes may not be null or empty!"
            r0.<init>((java.lang.String) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.navigation.C4229c.m11340d(com.moovit.navigation.NavigationLeg$Type, int, java.util.List, com.moovit.network.model.ServerId, com.moovit.network.model.ServerId, i30.d):com.moovit.navigation.NavigationLeg");
    }

    /* renamed from: e */
    public static Collection m11341e(C5268d dVar, List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.addAll(C13720d.m34273c(((MVShape) it.next()).shapeStopIds, (C13722f) null, new C17478e(15)));
        }
        HashMap hashMap = new HashMap(dVar.f17404a);
        hashMap.keySet().retainAll(hashSet);
        return hashMap.values();
    }

    /* renamed from: f */
    public static void m11342f(ItineraryNavigable itineraryNavigable) throws BadNavigableException {
        for (NavigationLeg navigationLeg : itineraryNavigable.f39152m) {
            Iterator<NavigationPath> it = navigationLeg.f15055c.iterator();
            while (true) {
                if (it.hasNext()) {
                    NavigationPath next = it.next();
                    int size = next.f15065e.size();
                    int i = next.f15069i;
                    int i2 = next.f15070j;
                    Iterator<T> it2 = Collections.unmodifiableList(next.f15068h.f15035b).iterator();
                    int i3 = Integer.MIN_VALUE;
                    int i4 = Integer.MIN_VALUE;
                    int i5 = Integer.MIN_VALUE;
                    while (true) {
                        if (it2.hasNext()) {
                            GeofenceMetadata geofenceMetadata = ((NavigationGeofence) it2.next()).f15051g;
                            int i6 = geofenceMetadata.f15026d;
                            m11338b(i, i6, itineraryNavigable, "distance to destination");
                            int i7 = geofenceMetadata.f15027e;
                            m11338b(i2, i7, itineraryNavigable, "time to destination");
                            int i8 = geofenceMetadata.f15029g;
                            m11337a(i3, i8, itineraryNavigable, "nextStopIndex");
                            int i9 = geofenceMetadata.f15030h;
                            m11337a(i4, i9, itineraryNavigable, "nextStopGeofenceIndex");
                            int i11 = geofenceMetadata.f15031i;
                            m11337a(i5, i11, itineraryNavigable, "prevStopGeofenceIndex");
                            if (i8 < size) {
                                i5 = i11;
                                i4 = i9;
                                i3 = i8;
                                i2 = i7;
                                i = i6;
                            } else {
                                StringBuilder s = C0016g.m35s("nextStopIndex (", i8, " out of range [0-", size, ") in navigable ");
                                s.append(itineraryNavigable.f39150k);
                                throw new BadNavigableException(s.toString());
                            }
                        }
                    }
                }
            }
        }
    }
}
