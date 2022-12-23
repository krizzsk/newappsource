package com.moovit.transit;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import ce0.C21100e;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.request.BadResponseException;
import com.moovit.database.DbEntityRef;
import com.moovit.network.model.LongServerId;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitPattern;
import com.moovit.transit.TransitPatternShape;
import e00.C16760a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p241s0.C6302b;
import p435de.C16596f;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p924xt.C20603k;

public class TransitPatternTrips implements Parcelable {
    public static final Parcelable.Creator<TransitPatternTrips> CREATOR = new C7823a();

    /* renamed from: m */
    public static final C7824b f23715m = new C7824b();

    /* renamed from: n */
    public static final C7825c f23716n = new C7825c(TransitPatternTrips.class);

    /* renamed from: b */
    public final TransitPattern f23717b;

    /* renamed from: c */
    public final List<TripId> f23718c;

    /* renamed from: d */
    public final List<Schedule> f23719d;

    /* renamed from: e */
    public final List<DbEntityRef<Shape>> f23720e;

    /* renamed from: f */
    public final Set<DbEntityRef<Shape>> f23721f;

    /* renamed from: g */
    public final List<TransitPatternShape> f23722g;

    /* renamed from: h */
    public final Set<TransitPatternShape> f23723h;

    /* renamed from: i */
    public final Map<TripId, Integer> f23724i;

    /* renamed from: j */
    public final SparseArray<Schedule> f23725j;

    /* renamed from: k */
    public final Map<ServerId, Schedule> f23726k;

    /* renamed from: l */
    public final BoxE6 f23727l;

    /* renamed from: com.moovit.transit.TransitPatternTrips$a */
    public class C7823a implements Parcelable.Creator<TransitPatternTrips> {
        public final Object createFromParcel(Parcel parcel) {
            return (TransitPatternTrips) C19612n.m46981v(parcel, TransitPatternTrips.f23716n);
        }

        public final Object[] newArray(int i) {
            return new TransitPatternTrips[i];
        }
    }

    /* renamed from: com.moovit.transit.TransitPatternTrips$b */
    public class C7824b extends C19621u<TransitPatternTrips> {
        public C7824b() {
            super(4);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TransitPatternTrips transitPatternTrips = (TransitPatternTrips) obj;
            TransitPattern transitPattern = transitPatternTrips.f23717b;
            TransitPattern.C7819b bVar = TransitPattern.f23706f;
            qVar.getClass();
            qVar.mo51939l(0);
            bVar.mo19622a(transitPattern, qVar);
            qVar.mo51965h(transitPatternTrips.f23718c, TripId.f23763d);
            qVar.mo51965h(transitPatternTrips.f23719d, Schedule.f23658d);
            qVar.mo51965h(transitPatternTrips.f23720e, DbEntityRef.SHAPE_REF_CODER);
            qVar.mo51965h(transitPatternTrips.f23721f, DbEntityRef.SHAPE_REF_CODER);
            List<TransitPatternShape> list = transitPatternTrips.f23722g;
            TransitPatternShape.C7822b bVar2 = TransitPatternShape.f23712d;
            qVar.mo51965h(list, bVar2);
            qVar.mo51965h(transitPatternTrips.f23723h, bVar2);
        }
    }

    /* renamed from: com.moovit.transit.TransitPatternTrips$c */
    public class C7825c extends C19620t<TransitPatternTrips> {
        public C7825c(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public static ArrayList m17839c(ArrayList arrayList, ArrayList arrayList2) {
            int size = arrayList.size();
            ArrayList arrayList3 = new ArrayList(arrayList.size());
            for (int i = 0; i < size; i++) {
                arrayList3.add(new TripId(new LongServerId((long) ((ServerId) arrayList.get(i)).f15142b), ((Schedule) arrayList2.get(i)).mo24331u(0).mo24631g()));
            }
            return arrayList3;
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 4;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.util.HashSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.HashSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.util.HashSet} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: java.util.ArrayList} */
        /* JADX WARNING: type inference failed for: r9v1, types: [java.util.Set] */
        /* JADX WARNING: type inference failed for: r9v2, types: [java.util.Set] */
        /* JADX WARNING: type inference failed for: r11v3, types: [java.util.Set] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo19624b(p810sz.C19615p r13, int r14) throws java.io.IOException {
            /*
                r12 = this;
                r0 = 0
                r1 = 1
                r2 = 0
                r3 = -1
                if (r14 == r1) goto L_0x019e
                r1 = 2
                if (r14 == r1) goto L_0x0138
                r1 = 3
                if (r14 == r1) goto L_0x00ef
                r1 = 4
                if (r14 == r1) goto L_0x008d
                com.moovit.transit.TransitPattern$c r14 = com.moovit.transit.TransitPattern.f23707g
                r13.getClass()
                java.lang.Object r14 = r14.read(r13)
                r5 = r14
                com.moovit.transit.TransitPattern r5 = (com.moovit.transit.TransitPattern) r5
                int r14 = r13.mo51924l()
                if (r14 != r3) goto L_0x0022
                goto L_0x0038
            L_0x0022:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r14)
            L_0x0027:
                if (r0 >= r14) goto L_0x0038
                int r1 = r13.mo51924l()
                com.moovit.network.model.ServerId r3 = new com.moovit.network.model.ServerId
                r3.<init>(r1)
                r2.add(r3)
                int r0 = r0 + 1
                goto L_0x0027
            L_0x0038:
                com.moovit.transit.Schedule$c r14 = com.moovit.transit.Schedule.f23659e
                java.util.ArrayList r7 = r13.mo51959g(r14)
                com.moovit.commons.geo.Polylon$f r14 = com.moovit.commons.geo.Polylon.f40988k
                java.util.ArrayList r13 = r13.mo51959g(r14)
                com.moovit.network.model.ServerId r14 = new com.moovit.network.model.ServerId
                com.moovit.network.model.ServerId r0 = r5.f23708b
                int r0 = r0.f15142b
                int r0 = -r0
                r14.<init>(r0)
                java.util.ArrayList r8 = new java.util.ArrayList
                int r0 = r13.size()
                r8.<init>(r0)
                java.util.Iterator r13 = r13.iterator()
            L_0x005b:
                boolean r0 = r13.hasNext()
                if (r0 == 0) goto L_0x0074
                java.lang.Object r0 = r13.next()
                com.moovit.commons.geo.Polyline r0 = (com.moovit.commons.geo.Polyline) r0
                com.moovit.transit.Shape r1 = new com.moovit.transit.Shape
                r1.<init>(r14, r0)
                com.moovit.database.DbEntityRef r0 = com.moovit.database.DbEntityRef.newShapeRef((com.moovit.transit.Shape) r1)
                r8.add(r0)
                goto L_0x005b
            L_0x0074:
                java.util.HashSet r9 = new java.util.HashSet
                r9.<init>(r8)
                com.moovit.transit.TransitPatternTrips r13 = new com.moovit.transit.TransitPatternTrips
                java.util.ArrayList r6 = m17839c(r2, r7)
                java.util.List r10 = java.util.Collections.emptyList()
                java.util.Set r11 = java.util.Collections.emptySet()
                r4 = r13
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                goto L_0x0241
            L_0x008d:
                com.moovit.transit.TransitPattern$c r14 = com.moovit.transit.TransitPattern.f23707g
                r13.getClass()
                java.lang.Object r14 = r14.read(r13)
                r5 = r14
                com.moovit.transit.TransitPattern r5 = (com.moovit.transit.TransitPattern) r5
                com.moovit.transit.TripId$b r14 = com.moovit.transit.TripId.f23763d
                java.util.ArrayList r6 = r13.mo51959g(r14)
                com.moovit.transit.Schedule$c r14 = com.moovit.transit.Schedule.f23659e
                java.util.ArrayList r7 = r13.mo51959g(r14)
                sz.i<com.moovit.database.DbEntityRef<com.moovit.transit.Shape>> r14 = com.moovit.database.DbEntityRef.SHAPE_REF_CODER
                java.util.ArrayList r8 = r13.mo51959g(r14)
                sz.i<com.moovit.database.DbEntityRef<com.moovit.transit.Shape>> r14 = com.moovit.database.DbEntityRef.SHAPE_REF_CODER
                int r1 = r13.mo51924l()
                if (r1 != r3) goto L_0x00b5
                r9 = r2
                goto L_0x00c8
            L_0x00b5:
                java.util.HashSet r4 = new java.util.HashSet
                r4.<init>(r1)
                r9 = 0
            L_0x00bb:
                if (r9 >= r1) goto L_0x00c7
                java.lang.Object r10 = r14.read(r13)
                r4.add(r10)
                int r9 = r9 + 1
                goto L_0x00bb
            L_0x00c7:
                r9 = r4
            L_0x00c8:
                com.moovit.transit.TransitPatternShape$b r14 = com.moovit.transit.TransitPatternShape.f23712d
                java.util.ArrayList r10 = r13.mo51959g(r14)
                int r1 = r13.mo51924l()
                if (r1 != r3) goto L_0x00d6
            L_0x00d4:
                r11 = r2
                goto L_0x00e7
            L_0x00d6:
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>(r1)
            L_0x00db:
                if (r0 >= r1) goto L_0x00d4
                java.lang.Object r3 = r14.read(r13)
                r2.add(r3)
                int r0 = r0 + 1
                goto L_0x00db
            L_0x00e7:
                com.moovit.transit.TransitPatternTrips r13 = new com.moovit.transit.TransitPatternTrips
                r4 = r13
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                goto L_0x0241
            L_0x00ef:
                com.moovit.transit.TransitPattern$c r14 = com.moovit.transit.TransitPattern.f23707g
                r13.getClass()
                java.lang.Object r14 = r14.read(r13)
                r5 = r14
                com.moovit.transit.TransitPattern r5 = (com.moovit.transit.TransitPattern) r5
                com.moovit.transit.TripId$b r14 = com.moovit.transit.TripId.f23763d
                java.util.ArrayList r6 = r13.mo51959g(r14)
                com.moovit.transit.Schedule$c r14 = com.moovit.transit.Schedule.f23659e
                java.util.ArrayList r7 = r13.mo51959g(r14)
                sz.i<com.moovit.database.DbEntityRef<com.moovit.transit.Shape>> r14 = com.moovit.database.DbEntityRef.SHAPE_REF_CODER
                java.util.ArrayList r8 = r13.mo51959g(r14)
                sz.i<com.moovit.database.DbEntityRef<com.moovit.transit.Shape>> r14 = com.moovit.database.DbEntityRef.SHAPE_REF_CODER
                int r1 = r13.mo51924l()
                if (r1 != r3) goto L_0x0117
            L_0x0115:
                r9 = r2
                goto L_0x0128
            L_0x0117:
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>(r1)
            L_0x011c:
                if (r0 >= r1) goto L_0x0115
                java.lang.Object r3 = r14.read(r13)
                r2.add(r3)
                int r0 = r0 + 1
                goto L_0x011c
            L_0x0128:
                com.moovit.transit.TransitPatternTrips r13 = new com.moovit.transit.TransitPatternTrips
                java.util.List r10 = java.util.Collections.emptyList()
                java.util.Set r11 = java.util.Collections.emptySet()
                r4 = r13
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                goto L_0x0241
            L_0x0138:
                com.moovit.transit.TransitPattern$c r14 = com.moovit.transit.TransitPattern.f23707g
                r13.getClass()
                java.lang.Object r14 = r14.read(r13)
                r5 = r14
                com.moovit.transit.TransitPattern r5 = (com.moovit.transit.TransitPattern) r5
                int r14 = r13.mo51924l()
                if (r14 != r3) goto L_0x014c
                r1 = r2
                goto L_0x0163
            L_0x014c:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r14)
                r4 = 0
            L_0x0152:
                if (r4 >= r14) goto L_0x0163
                int r6 = r13.mo51924l()
                com.moovit.network.model.ServerId r7 = new com.moovit.network.model.ServerId
                r7.<init>(r6)
                r1.add(r7)
                int r4 = r4 + 1
                goto L_0x0152
            L_0x0163:
                com.moovit.transit.Schedule$c r14 = com.moovit.transit.Schedule.f23659e
                java.util.ArrayList r7 = r13.mo51959g(r14)
                sz.i<com.moovit.database.DbEntityRef<com.moovit.transit.Shape>> r14 = com.moovit.database.DbEntityRef.SHAPE_REF_CODER
                java.util.ArrayList r8 = r13.mo51959g(r14)
                sz.i<com.moovit.database.DbEntityRef<com.moovit.transit.Shape>> r14 = com.moovit.database.DbEntityRef.SHAPE_REF_CODER
                int r4 = r13.mo51924l()
                if (r4 != r3) goto L_0x0179
            L_0x0177:
                r9 = r2
                goto L_0x018a
            L_0x0179:
                java.util.HashSet r2 = new java.util.HashSet
                r2.<init>(r4)
            L_0x017e:
                if (r0 >= r4) goto L_0x0177
                java.lang.Object r3 = r14.read(r13)
                r2.add(r3)
                int r0 = r0 + 1
                goto L_0x017e
            L_0x018a:
                com.moovit.transit.TransitPatternTrips r13 = new com.moovit.transit.TransitPatternTrips
                java.util.ArrayList r6 = m17839c(r1, r7)
                java.util.List r10 = java.util.Collections.emptyList()
                java.util.Set r11 = java.util.Collections.emptySet()
                r4 = r13
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
                goto L_0x0241
            L_0x019e:
                com.moovit.transit.TransitPattern$c r14 = com.moovit.transit.TransitPattern.f23707g
                r13.getClass()
                java.lang.Object r14 = r14.read(r13)
                r5 = r14
                com.moovit.transit.TransitPattern r5 = (com.moovit.transit.TransitPattern) r5
                int r14 = r13.mo51924l()
                if (r14 != r3) goto L_0x01b1
                goto L_0x01c7
            L_0x01b1:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>(r14)
            L_0x01b6:
                if (r0 >= r14) goto L_0x01c7
                int r1 = r13.mo51924l()
                com.moovit.network.model.ServerId r3 = new com.moovit.network.model.ServerId
                r3.<init>(r1)
                r2.add(r3)
                int r0 = r0 + 1
                goto L_0x01b6
            L_0x01c7:
                com.moovit.transit.Schedule$c r14 = com.moovit.transit.Schedule.f23659e
                java.util.ArrayList r7 = r13.mo51959g(r14)
                com.moovit.commons.geo.Polylon$f r14 = com.moovit.commons.geo.Polylon.f40988k
                java.util.ArrayList r14 = r13.mo51959g(r14)
                com.moovit.network.model.ServerId r0 = new com.moovit.network.model.ServerId
                com.moovit.network.model.ServerId r1 = r5.f23708b
                int r1 = r1.f15142b
                int r1 = -r1
                r0.<init>(r1)
                java.util.ArrayList r8 = new java.util.ArrayList
                int r1 = r14.size()
                r8.<init>(r1)
                java.util.Iterator r14 = r14.iterator()
            L_0x01ea:
                boolean r1 = r14.hasNext()
                if (r1 == 0) goto L_0x0203
                java.lang.Object r1 = r14.next()
                com.moovit.commons.geo.Polyline r1 = (com.moovit.commons.geo.Polyline) r1
                com.moovit.transit.Shape r3 = new com.moovit.transit.Shape
                r3.<init>(r0, r1)
                com.moovit.database.DbEntityRef r1 = com.moovit.database.DbEntityRef.newShapeRef((com.moovit.transit.Shape) r3)
                r8.add(r1)
                goto L_0x01ea
            L_0x0203:
                com.moovit.commons.geo.Polylon$f r14 = com.moovit.commons.geo.Polylon.f40988k
                java.util.ArrayList r13 = r13.mo51959g(r14)
                java.util.HashSet r9 = new java.util.HashSet
                int r14 = r13.size()
                r9.<init>(r14)
                java.util.Iterator r13 = r13.iterator()
            L_0x0216:
                boolean r14 = r13.hasNext()
                if (r14 == 0) goto L_0x022f
                java.lang.Object r14 = r13.next()
                com.moovit.commons.geo.Polyline r14 = (com.moovit.commons.geo.Polyline) r14
                com.moovit.transit.Shape r1 = new com.moovit.transit.Shape
                r1.<init>(r0, r14)
                com.moovit.database.DbEntityRef r14 = com.moovit.database.DbEntityRef.newShapeRef((com.moovit.transit.Shape) r1)
                r8.add(r14)
                goto L_0x0216
            L_0x022f:
                com.moovit.transit.TransitPatternTrips r13 = new com.moovit.transit.TransitPatternTrips
                java.util.ArrayList r6 = m17839c(r2, r7)
                java.util.List r10 = java.util.Collections.emptyList()
                java.util.Set r11 = java.util.Collections.emptySet()
                r4 = r13
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            L_0x0241:
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.transit.TransitPatternTrips.C7825c.mo19624b(sz.p, int):java.lang.Object");
        }
    }

    public TransitPatternTrips(TransitPattern transitPattern, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Set set, List list, Set set2) {
        BoxE6 boxE6;
        C21100e.m49373x(transitPattern, "pattern");
        this.f23717b = transitPattern;
        C21100e.m49373x(arrayList, "tripIds");
        this.f23718c = Collections.unmodifiableList(arrayList);
        C21100e.m49373x(arrayList2, "schedules");
        this.f23719d = Collections.unmodifiableList(arrayList2);
        C21100e.m49373x(arrayList3, "tripShapes");
        this.f23720e = Collections.unmodifiableList(arrayList3);
        C21100e.m49373x(set, "patternShapes");
        this.f23721f = Collections.unmodifiableSet(set);
        C21100e.m49373x(list, "tripTransitPatternShapes");
        this.f23722g = Collections.unmodifiableList(list);
        C21100e.m49373x(set2, "patternTransitPatternShapes");
        this.f23723h = Collections.unmodifiableSet(set2);
        if (arrayList.size() != arrayList2.size()) {
            C16596f a = C16596f.m42113a();
            StringBuilder k = C13555b.m33972k("pattern id=");
            k.append(transitPattern.f23708b);
            k.append(", trip ids size=");
            k.append(arrayList.size());
            k.append(", schedules size=");
            k.append(arrayList2.size());
            a.mo49363b(k.toString());
            throw new BadResponseException("trip ids & schedules must be with the same size");
        } else if (arrayList.size() == arrayList3.size()) {
            int f = transitPattern.mo24389f();
            boolean z = false;
            int i = 0;
            while (i < list.size()) {
                TransitPatternShape transitPatternShape = (TransitPatternShape) list.get(i);
                if (transitPatternShape.f23713b.size() == f - 1) {
                    i++;
                } else {
                    C16596f a2 = C16596f.m42113a();
                    StringBuilder k2 = C13555b.m33972k("pattern id=");
                    k2.append(transitPattern.f23708b);
                    k2.append(", trip id=");
                    k2.append(arrayList.get(i));
                    k2.append(", pattern shape size=");
                    k2.append(transitPatternShape.f23713b.size());
                    a2.mo49363b(k2.toString());
                    throw new BadResponseException("pattern & shape must be with the same size");
                }
            }
            int i2 = 0;
            while (i2 < arrayList2.size()) {
                Schedule schedule = (Schedule) arrayList2.get(i2);
                if (f == schedule.size()) {
                    i2++;
                } else {
                    C16596f a3 = C16596f.m42113a();
                    StringBuilder k3 = C13555b.m33972k("pattern id=");
                    k3.append(transitPattern.f23708b);
                    k3.append(", trip id=");
                    k3.append(arrayList.get(i2));
                    k3.append(", schedule size=");
                    k3.append(schedule.size());
                    a3.mo49363b(k3.toString());
                    throw new BadResponseException("pattern & schedule must be with the same size");
                }
            }
            int size = arrayList.size();
            C16760a aVar = new C16760a(new C6302b(size), -1);
            for (int i3 = 0; i3 < size; i3++) {
                aVar.put((TripId) arrayList.get(i3), Integer.valueOf(i3));
            }
            this.f23724i = Collections.unmodifiableMap(aVar);
            ArrayList arrayList4 = new ArrayList();
            SparseArray<Schedule> sparseArray = new SparseArray<>(transitPattern.mo24389f());
            C6302b bVar = new C6302b(transitPattern.mo24389f());
            List<DbEntityRef<TransitStop>> list2 = transitPattern.f23709c;
            int i4 = 0;
            while (true) {
                boxE6 = null;
                if (i4 >= list2.size()) {
                    break;
                }
                ServerId serverId = list2.get(i4).getServerId();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((Schedule) it.next()).mo24331u(i4));
                }
                Schedule schedule2 = new Schedule(arrayList4);
                sparseArray.append(i4, schedule2);
                Schedule schedule3 = (Schedule) bVar.getOrDefault(serverId, null);
                if (schedule3 != null) {
                    schedule2 = Schedule.m17781C(Arrays.asList(new Schedule[]{schedule3, schedule2}));
                }
                bVar.put(serverId, schedule2);
                arrayList4.clear();
                i4++;
            }
            this.f23725j = sparseArray;
            this.f23726k = Collections.unmodifiableMap(bVar);
            if (set.isEmpty() || !DbEntityRef.areFullyResolved(set)) {
                C20603k kVar = new C20603k(6);
                Iterator it2 = set2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!kVar.mo19661o(it2.next())) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    boxE6 = BoxE6.m40165d(set2);
                }
            } else {
                boxE6 = BoxE6.m40165d(DbEntityRef.getEntities(set));
            }
            this.f23727l = boxE6;
        } else {
            C16596f a4 = C16596f.m42113a();
            StringBuilder k4 = C13555b.m33972k("pattern id=");
            k4.append(transitPattern.f23708b);
            k4.append(", trip ids size=");
            k4.append(arrayList.size());
            k4.append(", shapes size=");
            k4.append(arrayList3.size());
            a4.mo49363b(k4.toString());
            throw new BadResponseException("trip ids & shapes must be with the same size");
        }
    }

    /* renamed from: b */
    public final Schedule mo24403b(TripId tripId) {
        int intValue = this.f23724i.get(tripId).intValue();
        if (intValue == -1) {
            return null;
        }
        return this.f23719d.get(intValue);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TransitPatternTrips)) {
            return false;
        }
        TransitPatternTrips transitPatternTrips = (TransitPatternTrips) obj;
        if (!this.f23717b.equals(transitPatternTrips.f23717b) || !this.f23718c.equals(transitPatternTrips.f23718c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f23717b.hashCode(), this.f23718c.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23715m);
    }
}
