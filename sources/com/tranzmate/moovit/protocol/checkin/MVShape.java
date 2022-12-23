package com.tranzmate.moovit.protocol.checkin;

import com.appboy.support.StringUtils;
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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
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

public class MVShape implements TBase<MVShape, _Fields>, Serializable, Cloneable, Comparable<MVShape> {

    /* renamed from: b */
    public static final C25113c f24958b = new C25113c("shapeId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24959c = new C25113c("totalDistanceToDestinationMeters", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f24960d = new C25113c("totalTimeToDestinationSecs", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f24961e = new C25113c("encodedPolyline", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f24962f = new C25113c("geofences", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f24963g = new C25113c("shapeStopIds", (byte) 15, 6);

    /* renamed from: h */
    public static final C25113c f24964h = new C25113c("pathReliability", (byte) 8, 7);

    /* renamed from: i */
    public static final HashMap f24965i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f24966j;
    private byte __isset_bitfield = 0;
    public String encodedPolyline;
    public List<MVNavigationGeofence> geofences;
    public MVPathReliability pathReliability;
    public int shapeId;
    public List<Integer> shapeStopIds;
    public int totalDistanceToDestinationMeters;
    public int totalTimeToDestinationSecs;

    public enum _Fields implements C25085c {
        SHAPE_ID(1, "shapeId"),
        TOTAL_DISTANCE_TO_DESTINATION_METERS(2, "totalDistanceToDestinationMeters"),
        TOTAL_TIME_TO_DESTINATION_SECS(3, "totalTimeToDestinationSecs"),
        ENCODED_POLYLINE(4, "encodedPolyline"),
        GEOFENCES(5, "geofences"),
        SHAPE_STOP_IDS(6, "shapeStopIds"),
        PATH_RELIABILITY(7, "pathReliability");
        
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
            switch (i) {
                case 1:
                    return SHAPE_ID;
                case 2:
                    return TOTAL_DISTANCE_TO_DESTINATION_METERS;
                case 3:
                    return TOTAL_TIME_TO_DESTINATION_SECS;
                case 4:
                    return ENCODED_POLYLINE;
                case 5:
                    return GEOFENCES;
                case 6:
                    return SHAPE_STOP_IDS;
                case 7:
                    return PATH_RELIABILITY;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVShape$a */
    public static class C8360a extends C25239c<MVShape> {
        public C8360a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVShape mVShape = (MVShape) tBase;
            mVShape.getClass();
            C25113c cVar = MVShape.f24958b;
            gVar.mo61687K();
            gVar.mo61711x(MVShape.f24958b);
            gVar.mo61678B(mVShape.shapeId);
            gVar.mo61712y();
            gVar.mo61711x(MVShape.f24959c);
            gVar.mo61678B(mVShape.totalDistanceToDestinationMeters);
            gVar.mo61712y();
            gVar.mo61711x(MVShape.f24960d);
            gVar.mo61678B(mVShape.totalTimeToDestinationSecs);
            gVar.mo61712y();
            if (mVShape.encodedPolyline != null) {
                gVar.mo61711x(MVShape.f24961e);
                gVar.mo61686J(mVShape.encodedPolyline);
                gVar.mo61712y();
            }
            if (mVShape.geofences != null) {
                gVar.mo61711x(MVShape.f24962f);
                gVar.mo61680D(new C25119e((byte) 12, mVShape.geofences.size()));
                for (MVNavigationGeofence X0 : mVShape.geofences) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVShape.shapeStopIds != null) {
                gVar.mo61711x(MVShape.f24963g);
                gVar.mo61680D(new C25119e((byte) 8, mVShape.shapeStopIds.size()));
                for (Integer intValue : mVShape.shapeStopIds) {
                    gVar.mo61678B(intValue.intValue());
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVShape.pathReliability != null) {
                gVar.mo61711x(MVShape.f24964h);
                gVar.mo61678B(mVShape.pathReliability.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVShape mVShape = (MVShape) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVShape.getClass();
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVShape.shapeId = gVar.mo61696i();
                            mVShape.mo26059m();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVShape.totalDistanceToDestinationMeters = gVar.mo61696i();
                            mVShape.mo26060o();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVShape.totalTimeToDestinationSecs = gVar.mo61696i();
                            mVShape.mo26061p();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVShape.encodedPolyline = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVShape.geofences = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVNavigationGeofence mVNavigationGeofence = new MVNavigationGeofence();
                                mVNavigationGeofence.mo25201C1(gVar);
                                mVShape.geofences.add(mVNavigationGeofence);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVShape.shapeStopIds = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                i = C13437d.m33701f(gVar.mo61696i(), mVShape.shapeStopIds, i, 1);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVShape.pathReliability = MVPathReliability.findByValue(gVar.mo61696i());
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVShape$b */
    public static class C8361b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8360a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVShape$c */
    public static class C8362c extends C25240d<MVShape> {
        public C8362c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVShape mVShape = (MVShape) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVShape.mo26055i()) {
                bitSet.set(0);
            }
            if (mVShape.mo26057k()) {
                bitSet.set(1);
            }
            if (mVShape.mo26058l()) {
                bitSet.set(2);
            }
            if (mVShape.mo26051f()) {
                bitSet.set(3);
            }
            if (mVShape.mo26052g()) {
                bitSet.set(4);
            }
            if (mVShape.mo26056j()) {
                bitSet.set(5);
            }
            if (mVShape.mo26053h()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVShape.mo26055i()) {
                jVar.mo61678B(mVShape.shapeId);
            }
            if (mVShape.mo26057k()) {
                jVar.mo61678B(mVShape.totalDistanceToDestinationMeters);
            }
            if (mVShape.mo26058l()) {
                jVar.mo61678B(mVShape.totalTimeToDestinationSecs);
            }
            if (mVShape.mo26051f()) {
                jVar.mo61686J(mVShape.encodedPolyline);
            }
            if (mVShape.mo26052g()) {
                jVar.mo61678B(mVShape.geofences.size());
                for (MVNavigationGeofence X0 : mVShape.geofences) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVShape.mo26056j()) {
                jVar.mo61678B(mVShape.shapeStopIds.size());
                for (Integer intValue : mVShape.shapeStopIds) {
                    jVar.mo61678B(intValue.intValue());
                }
            }
            if (mVShape.mo26053h()) {
                jVar.mo61678B(mVShape.pathReliability.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVShape mVShape = (MVShape) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVShape.shapeId = jVar.mo61696i();
                mVShape.mo26059m();
            }
            if (T.get(1)) {
                mVShape.totalDistanceToDestinationMeters = jVar.mo61696i();
                mVShape.mo26060o();
            }
            if (T.get(2)) {
                mVShape.totalTimeToDestinationSecs = jVar.mo61696i();
                mVShape.mo26061p();
            }
            if (T.get(3)) {
                mVShape.encodedPolyline = jVar.mo61704q();
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVShape.geofences = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVNavigationGeofence mVNavigationGeofence = new MVNavigationGeofence();
                    mVNavigationGeofence.mo25201C1(jVar);
                    mVShape.geofences.add(mVNavigationGeofence);
                }
            }
            if (T.get(5)) {
                int i3 = jVar.mo61696i();
                mVShape.shapeStopIds = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4 = C13437d.m33701f(jVar.mo61696i(), mVShape.shapeStopIds, i4, 1)) {
                }
            }
            if (T.get(6)) {
                mVShape.pathReliability = MVPathReliability.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVShape$d */
    public static class C8363d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8362c(0);
        }
    }

    static {
        new C17394d0("MVShape");
        HashMap hashMap = new HashMap();
        f24965i = hashMap;
        hashMap.put(C25239c.class, new C8361b());
        hashMap.put(C25240d.class, new C8363d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SHAPE_ID, new FieldMetaData("shapeId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TOTAL_DISTANCE_TO_DESTINATION_METERS, new FieldMetaData("totalDistanceToDestinationMeters", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.TOTAL_TIME_TO_DESTINATION_SECS, new FieldMetaData("totalTimeToDestinationSecs", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ENCODED_POLYLINE, new FieldMetaData("encodedPolyline", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.GEOFENCES, new FieldMetaData("geofences", (byte) 3, new ListMetaData(new StructMetaData(MVNavigationGeofence.class))));
        enumMap.put(_Fields.SHAPE_STOP_IDS, new FieldMetaData("shapeStopIds", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 8, false))));
        enumMap.put(_Fields.PATH_RELIABILITY, new FieldMetaData("pathReliability", (byte) 3, new EnumMetaData(MVPathReliability.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24966j = unmodifiableMap;
        FieldMetaData.m61947a(MVShape.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
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
        ((C25238b) f24965i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24965i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVShape mVShape = (MVShape) obj;
        if (!getClass().equals(mVShape.getClass())) {
            return getClass().getName().compareTo(mVShape.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26055i()).compareTo(Boolean.valueOf(mVShape.mo26055i()));
        if (compareTo2 != 0 || ((mo26055i() && (compareTo2 = C25082a.m62839c(this.shapeId, mVShape.shapeId)) != 0) || (compareTo2 = Boolean.valueOf(mo26057k()).compareTo(Boolean.valueOf(mVShape.mo26057k()))) != 0 || ((mo26057k() && (compareTo2 = C25082a.m62839c(this.totalDistanceToDestinationMeters, mVShape.totalDistanceToDestinationMeters)) != 0) || (compareTo2 = Boolean.valueOf(mo26058l()).compareTo(Boolean.valueOf(mVShape.mo26058l()))) != 0 || ((mo26058l() && (compareTo2 = C25082a.m62839c(this.totalTimeToDestinationSecs, mVShape.totalTimeToDestinationSecs)) != 0) || (compareTo2 = Boolean.valueOf(mo26051f()).compareTo(Boolean.valueOf(mVShape.mo26051f()))) != 0 || ((mo26051f() && (compareTo2 = this.encodedPolyline.compareTo(mVShape.encodedPolyline)) != 0) || (compareTo2 = Boolean.valueOf(mo26052g()).compareTo(Boolean.valueOf(mVShape.mo26052g()))) != 0 || ((mo26052g() && (compareTo2 = C25082a.m62844h(this.geofences, mVShape.geofences)) != 0) || (compareTo2 = Boolean.valueOf(mo26056j()).compareTo(Boolean.valueOf(mVShape.mo26056j()))) != 0 || ((mo26056j() && (compareTo2 = C25082a.m62844h(this.shapeStopIds, mVShape.shapeStopIds)) != 0) || (compareTo2 = Boolean.valueOf(mo26053h()).compareTo(Boolean.valueOf(mVShape.mo26053h()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo26053h() || (compareTo = this.pathReliability.compareTo(mVShape.pathReliability)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVShape)) {
            return false;
        }
        MVShape mVShape = (MVShape) obj;
        if (this.shapeId != mVShape.shapeId || this.totalDistanceToDestinationMeters != mVShape.totalDistanceToDestinationMeters || this.totalTimeToDestinationSecs != mVShape.totalTimeToDestinationSecs) {
            return false;
        }
        boolean f = mo26051f();
        boolean f2 = mVShape.mo26051f();
        if ((f || f2) && (!f || !f2 || !this.encodedPolyline.equals(mVShape.encodedPolyline))) {
            return false;
        }
        boolean g = mo26052g();
        boolean g2 = mVShape.mo26052g();
        if ((g || g2) && (!g || !g2 || !this.geofences.equals(mVShape.geofences))) {
            return false;
        }
        boolean j = mo26056j();
        boolean j2 = mVShape.mo26056j();
        if ((j || j2) && (!j || !j2 || !this.shapeStopIds.equals(mVShape.shapeStopIds))) {
            return false;
        }
        boolean h = mo26053h();
        boolean h2 = mVShape.mo26053h();
        if ((h || h2) && (!h || !h2 || !this.pathReliability.equals(mVShape.pathReliability))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26051f() {
        return this.encodedPolyline != null;
    }

    /* renamed from: g */
    public final boolean mo26052g() {
        return this.geofences != null;
    }

    /* renamed from: h */
    public final boolean mo26053h() {
        return this.pathReliability != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26055i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo26056j() {
        return this.shapeStopIds != null;
    }

    /* renamed from: k */
    public final boolean mo26057k() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: l */
    public final boolean mo26058l() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: m */
    public final void mo26059m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: o */
    public final void mo26060o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: p */
    public final void mo26061p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVShape(", "shapeId:");
        C0016g.m42z(n, this.shapeId, ", ", "totalDistanceToDestinationMeters:");
        C0016g.m42z(n, this.totalDistanceToDestinationMeters, ", ", "totalTimeToDestinationSecs:");
        C0016g.m42z(n, this.totalTimeToDestinationSecs, ", ", "encodedPolyline:");
        String str = this.encodedPolyline;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("geofences:");
        List<MVNavigationGeofence> list = this.geofences;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("shapeStopIds:");
        List<Integer> list2 = this.shapeStopIds;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(", ");
        n.append("pathReliability:");
        MVPathReliability mVPathReliability = this.pathReliability;
        if (mVPathReliability == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPathReliability);
        }
        n.append(")");
        return n.toString();
    }
}
