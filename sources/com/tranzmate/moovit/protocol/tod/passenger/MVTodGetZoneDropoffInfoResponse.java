package com.tranzmate.moovit.protocol.tod.passenger;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVTodGetZoneDropoffInfoResponse implements TBase<MVTodGetZoneDropoffInfoResponse, _Fields>, Serializable, Cloneable, Comparable<MVTodGetZoneDropoffInfoResponse> {

    /* renamed from: b */
    public static final C25113c f29396b = new C25113c("dropoffShapes", (byte) 15, 1);

    /* renamed from: c */
    public static final C25113c f29397c = new C25113c("restrictions", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f29398d = new C25113c("dropoffExplanationURL", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f29399e = new C25113c("dropOffStops", (byte) 15, 4);

    /* renamed from: f */
    public static final HashMap f29400f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f29401g;
    public List<MVLocationDescriptor> dropOffStops;
    public String dropoffExplanationURL;
    public List<MVTodZoneShape> dropoffShapes;
    private _Fields[] optionals = {_Fields.DROPOFF_EXPLANATION_URL};
    public MVTodZoneDropOffRestrictions restrictions;

    public enum _Fields implements C25085c {
        DROPOFF_SHAPES(1, "dropoffShapes"),
        RESTRICTIONS(2, "restrictions"),
        DROPOFF_EXPLANATION_URL(3, "dropoffExplanationURL"),
        DROP_OFF_STOPS(4, "dropOffStops");
        
        private static final Map<String, _Fields> byName = null;
        private final String _fieldName;
        private final short _thriftId;

        /* access modifiers changed from: public */
        static {
            byName = new HashMap();
            Iterator<E> it = EnumSet.allOf(_Fields.class).iterator();
            while (it.hasNext()) {
                _Fields _fields = (_Fields) it.next();
                byName.put(_fields.getFieldName(), _fields);
            }
        }

        private _Fields(short s, String str) {
            this._thriftId = s;
            this._fieldName = str;
        }

        public static _Fields findByName(String str) {
            return byName.get(str);
        }

        public static _Fields findByThriftId(int i) {
            if (i == 1) {
                return DROPOFF_SHAPES;
            }
            if (i == 2) {
                return RESTRICTIONS;
            }
            if (i == 3) {
                return DROPOFF_EXPLANATION_URL;
            }
            if (i != 4) {
                return null;
            }
            return DROP_OFF_STOPS;
        }

        public static _Fields findByThriftIdOrThrow(int i) {
            _Fields findByThriftId = findByThriftId(i);
            if (findByThriftId != null) {
                return findByThriftId;
            }
            throw new IllegalArgumentException(C25541a.m63878h("Field ", i, " doesn't exist!"));
        }

        public String getFieldName() {
            return this._fieldName;
        }

        public short getThriftFieldId() {
            return this._thriftId;
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZoneDropoffInfoResponse$a */
    public static class C11229a extends C25239c<MVTodGetZoneDropoffInfoResponse> {
        public C11229a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodGetZoneDropoffInfoResponse mVTodGetZoneDropoffInfoResponse = (MVTodGetZoneDropoffInfoResponse) tBase;
            MVTodZoneDropOffRestrictions mVTodZoneDropOffRestrictions = mVTodGetZoneDropoffInfoResponse.restrictions;
            C25113c cVar = MVTodGetZoneDropoffInfoResponse.f29396b;
            gVar.mo61687K();
            if (mVTodGetZoneDropoffInfoResponse.dropoffShapes != null) {
                gVar.mo61711x(MVTodGetZoneDropoffInfoResponse.f29396b);
                gVar.mo61680D(new C25119e((byte) 12, mVTodGetZoneDropoffInfoResponse.dropoffShapes.size()));
                for (MVTodZoneShape X0 : mVTodGetZoneDropoffInfoResponse.dropoffShapes) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVTodGetZoneDropoffInfoResponse.restrictions != null) {
                gVar.mo61711x(MVTodGetZoneDropoffInfoResponse.f29397c);
                mVTodGetZoneDropoffInfoResponse.restrictions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTodGetZoneDropoffInfoResponse.dropoffExplanationURL != null && mVTodGetZoneDropoffInfoResponse.mo33431g()) {
                gVar.mo61711x(MVTodGetZoneDropoffInfoResponse.f29398d);
                gVar.mo61686J(mVTodGetZoneDropoffInfoResponse.dropoffExplanationURL);
                gVar.mo61712y();
            }
            if (mVTodGetZoneDropoffInfoResponse.dropOffStops != null) {
                gVar.mo61711x(MVTodGetZoneDropoffInfoResponse.f29399e);
                gVar.mo61680D(new C25119e((byte) 12, mVTodGetZoneDropoffInfoResponse.dropOffStops.size()));
                for (MVLocationDescriptor X02 : mVTodGetZoneDropoffInfoResponse.dropOffStops) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodGetZoneDropoffInfoResponse mVTodGetZoneDropoffInfoResponse = (MVTodGetZoneDropoffInfoResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTodZoneDropOffRestrictions mVTodZoneDropOffRestrictions = mVTodGetZoneDropoffInfoResponse.restrictions;
                    return;
                }
                short s = f.f63357c;
                int i = 0;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 15) {
                                C25119e k = gVar.mo61698k();
                                mVTodGetZoneDropoffInfoResponse.dropOffStops = new ArrayList(k.f63395b);
                                while (i < k.f63395b) {
                                    MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                                    mVLocationDescriptor.mo25201C1(gVar);
                                    mVTodGetZoneDropoffInfoResponse.dropOffStops.add(mVLocationDescriptor);
                                    i++;
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVTodGetZoneDropoffInfoResponse.dropoffExplanationURL = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVTodZoneDropOffRestrictions mVTodZoneDropOffRestrictions2 = new MVTodZoneDropOffRestrictions();
                        mVTodGetZoneDropoffInfoResponse.restrictions = mVTodZoneDropOffRestrictions2;
                        mVTodZoneDropOffRestrictions2.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 15) {
                    C25119e k2 = gVar.mo61698k();
                    mVTodGetZoneDropoffInfoResponse.dropoffShapes = new ArrayList(k2.f63395b);
                    while (i < k2.f63395b) {
                        MVTodZoneShape mVTodZoneShape = new MVTodZoneShape();
                        mVTodZoneShape.mo25201C1(gVar);
                        mVTodGetZoneDropoffInfoResponse.dropoffShapes.add(mVTodZoneShape);
                        i++;
                    }
                    gVar.mo61699l();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZoneDropoffInfoResponse$b */
    public static class C11230b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11229a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZoneDropoffInfoResponse$c */
    public static class C11231c extends C25240d<MVTodGetZoneDropoffInfoResponse> {
        public C11231c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTodGetZoneDropoffInfoResponse mVTodGetZoneDropoffInfoResponse = (MVTodGetZoneDropoffInfoResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTodGetZoneDropoffInfoResponse.mo33432h()) {
                bitSet.set(0);
            }
            if (mVTodGetZoneDropoffInfoResponse.mo33434i()) {
                bitSet.set(1);
            }
            if (mVTodGetZoneDropoffInfoResponse.mo33431g()) {
                bitSet.set(2);
            }
            if (mVTodGetZoneDropoffInfoResponse.mo33430f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTodGetZoneDropoffInfoResponse.mo33432h()) {
                jVar.mo61678B(mVTodGetZoneDropoffInfoResponse.dropoffShapes.size());
                for (MVTodZoneShape X0 : mVTodGetZoneDropoffInfoResponse.dropoffShapes) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVTodGetZoneDropoffInfoResponse.mo33434i()) {
                mVTodGetZoneDropoffInfoResponse.restrictions.mo25202X0(jVar);
            }
            if (mVTodGetZoneDropoffInfoResponse.mo33431g()) {
                jVar.mo61686J(mVTodGetZoneDropoffInfoResponse.dropoffExplanationURL);
            }
            if (mVTodGetZoneDropoffInfoResponse.mo33430f()) {
                jVar.mo61678B(mVTodGetZoneDropoffInfoResponse.dropOffStops.size());
                for (MVLocationDescriptor X02 : mVTodGetZoneDropoffInfoResponse.dropOffStops) {
                    X02.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTodGetZoneDropoffInfoResponse mVTodGetZoneDropoffInfoResponse = (MVTodGetZoneDropoffInfoResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                int i = jVar.mo61696i();
                mVTodGetZoneDropoffInfoResponse.dropoffShapes = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVTodZoneShape mVTodZoneShape = new MVTodZoneShape();
                    mVTodZoneShape.mo25201C1(jVar);
                    mVTodGetZoneDropoffInfoResponse.dropoffShapes.add(mVTodZoneShape);
                }
            }
            if (T.get(1)) {
                MVTodZoneDropOffRestrictions mVTodZoneDropOffRestrictions = new MVTodZoneDropOffRestrictions();
                mVTodGetZoneDropoffInfoResponse.restrictions = mVTodZoneDropOffRestrictions;
                mVTodZoneDropOffRestrictions.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVTodGetZoneDropoffInfoResponse.dropoffExplanationURL = jVar.mo61704q();
            }
            if (T.get(3)) {
                int i3 = jVar.mo61696i();
                mVTodGetZoneDropoffInfoResponse.dropOffStops = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                    mVLocationDescriptor.mo25201C1(jVar);
                    mVTodGetZoneDropoffInfoResponse.dropOffStops.add(mVLocationDescriptor);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZoneDropoffInfoResponse$d */
    public static class C11232d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11231c(0);
        }
    }

    static {
        new C17394d0("MVTodGetZoneDropoffInfoResponse");
        HashMap hashMap = new HashMap();
        f29400f = hashMap;
        hashMap.put(C25239c.class, new C11230b());
        hashMap.put(C25240d.class, new C11232d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DROPOFF_SHAPES, new FieldMetaData("dropoffShapes", (byte) 3, new ListMetaData(new StructMetaData(MVTodZoneShape.class))));
        enumMap.put(_Fields.RESTRICTIONS, new FieldMetaData("restrictions", (byte) 3, new StructMetaData(MVTodZoneDropOffRestrictions.class)));
        enumMap.put(_Fields.DROPOFF_EXPLANATION_URL, new FieldMetaData("dropoffExplanationURL", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DROP_OFF_STOPS, new FieldMetaData("dropOffStops", (byte) 3, new ListMetaData(new StructMetaData(MVLocationDescriptor.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f29401g = unmodifiableMap;
        FieldMetaData.m61947a(MVTodGetZoneDropoffInfoResponse.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            mo25201C1(new C25112b(new C25276a((InputStream) objectInputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            mo25202X0(new C25112b(new C25276a((OutputStream) objectOutputStream)));
        } catch (TException e) {
            throw new IOException(e);
        }
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f29400f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f29400f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVTodGetZoneDropoffInfoResponse mVTodGetZoneDropoffInfoResponse = (MVTodGetZoneDropoffInfoResponse) obj;
        if (!getClass().equals(mVTodGetZoneDropoffInfoResponse.getClass())) {
            return getClass().getName().compareTo(mVTodGetZoneDropoffInfoResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo33432h()).compareTo(Boolean.valueOf(mVTodGetZoneDropoffInfoResponse.mo33432h()));
        if (compareTo != 0 || ((mo33432h() && (compareTo = C25082a.m62844h(this.dropoffShapes, mVTodGetZoneDropoffInfoResponse.dropoffShapes)) != 0) || (compareTo = Boolean.valueOf(mo33434i()).compareTo(Boolean.valueOf(mVTodGetZoneDropoffInfoResponse.mo33434i()))) != 0 || ((mo33434i() && (compareTo = this.restrictions.compareTo(mVTodGetZoneDropoffInfoResponse.restrictions)) != 0) || (compareTo = Boolean.valueOf(mo33431g()).compareTo(Boolean.valueOf(mVTodGetZoneDropoffInfoResponse.mo33431g()))) != 0 || ((mo33431g() && (compareTo = this.dropoffExplanationURL.compareTo(mVTodGetZoneDropoffInfoResponse.dropoffExplanationURL)) != 0) || (compareTo = Boolean.valueOf(mo33430f()).compareTo(Boolean.valueOf(mVTodGetZoneDropoffInfoResponse.mo33430f()))) != 0)))) {
            return compareTo;
        }
        if (!mo33430f() || (h = C25082a.m62844h(this.dropOffStops, mVTodGetZoneDropoffInfoResponse.dropOffStops)) == 0) {
            return 0;
        }
        return h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZoneDropoffInfoResponse
            r2 = 1
            if (r1 == 0) goto L_0x0089
            com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZoneDropoffInfoResponse r5 = (com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZoneDropoffInfoResponse) r5
            boolean r1 = r4.mo33432h()
            boolean r3 = r5.mo33432h()
            if (r1 != 0) goto L_0x0017
            if (r3 == 0) goto L_0x0029
        L_0x0017:
            if (r1 == 0) goto L_0x0089
            if (r3 != 0) goto L_0x001d
            goto L_0x0089
        L_0x001d:
            java.util.List<com.tranzmate.moovit.protocol.tod.passenger.MVTodZoneShape> r1 = r4.dropoffShapes
            java.util.List<com.tranzmate.moovit.protocol.tod.passenger.MVTodZoneShape> r3 = r5.dropoffShapes
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0029
            goto L_0x0089
        L_0x0029:
            boolean r1 = r4.mo33434i()
            boolean r3 = r5.mo33434i()
            if (r1 != 0) goto L_0x0035
            if (r3 == 0) goto L_0x0050
        L_0x0035:
            if (r1 == 0) goto L_0x0089
            if (r3 != 0) goto L_0x003a
            goto L_0x0089
        L_0x003a:
            com.tranzmate.moovit.protocol.tod.passenger.MVTodZoneDropOffRestrictions r1 = r4.restrictions
            com.tranzmate.moovit.protocol.tod.passenger.MVTodZoneDropOffRestrictions r3 = r5.restrictions
            if (r3 != 0) goto L_0x0045
            r1.getClass()
        L_0x0043:
            r1 = 0
            goto L_0x004d
        L_0x0045:
            int r1 = r1.minDistanceToPickup
            int r3 = r3.minDistanceToPickup
            if (r1 == r3) goto L_0x004c
            goto L_0x0043
        L_0x004c:
            r1 = 1
        L_0x004d:
            if (r1 != 0) goto L_0x0050
            goto L_0x0089
        L_0x0050:
            boolean r1 = r4.mo33431g()
            boolean r3 = r5.mo33431g()
            if (r1 != 0) goto L_0x005c
            if (r3 == 0) goto L_0x006c
        L_0x005c:
            if (r1 == 0) goto L_0x0089
            if (r3 != 0) goto L_0x0061
            goto L_0x0089
        L_0x0061:
            java.lang.String r1 = r4.dropoffExplanationURL
            java.lang.String r3 = r5.dropoffExplanationURL
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x006c
            goto L_0x0089
        L_0x006c:
            boolean r1 = r4.mo33430f()
            boolean r3 = r5.mo33430f()
            if (r1 != 0) goto L_0x0078
            if (r3 == 0) goto L_0x0088
        L_0x0078:
            if (r1 == 0) goto L_0x0089
            if (r3 != 0) goto L_0x007d
            goto L_0x0089
        L_0x007d:
            java.util.List<com.tranzmate.moovit.protocol.common.MVLocationDescriptor> r1 = r4.dropOffStops
            java.util.List<com.tranzmate.moovit.protocol.common.MVLocationDescriptor> r5 = r5.dropOffStops
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L_0x0088
            goto L_0x0089
        L_0x0088:
            r0 = 1
        L_0x0089:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.tod.passenger.MVTodGetZoneDropoffInfoResponse.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo33430f() {
        return this.dropOffStops != null;
    }

    /* renamed from: g */
    public final boolean mo33431g() {
        return this.dropoffExplanationURL != null;
    }

    /* renamed from: h */
    public final boolean mo33432h() {
        return this.dropoffShapes != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo33434i() {
        return this.restrictions != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTodGetZoneDropoffInfoResponse(", "dropoffShapes:");
        List<MVTodZoneShape> list = this.dropoffShapes;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("restrictions:");
        MVTodZoneDropOffRestrictions mVTodZoneDropOffRestrictions = this.restrictions;
        if (mVTodZoneDropOffRestrictions == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTodZoneDropOffRestrictions);
        }
        if (mo33431g()) {
            n.append(", ");
            n.append("dropoffExplanationURL:");
            String str = this.dropoffExplanationURL;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(", ");
        n.append("dropOffStops:");
        List<MVLocationDescriptor> list2 = this.dropOffStops;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(")");
        return n.toString();
    }
}
