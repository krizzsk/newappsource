package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVBoundingBox;
import com.tranzmate.moovit.protocol.common.MVDayTime;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVParkingMetaData implements TBase<MVParkingMetaData, _Fields>, Serializable, Cloneable, Comparable<MVParkingMetaData> {

    /* renamed from: b */
    public static final C25113c f24735b = new C25113c("id", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24736c = new C25113c("name", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f24737d = new C25113c("minNumberOfPassengers", (byte) 3, 3);

    /* renamed from: e */
    public static final C25113c f24738e = new C25113c("parkingCapacity", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f24739f = new C25113c("availableFrom", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f24740g = new C25113c("availableUntil", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f24741h = new C25113c("boundingBox", (byte) 12, 7);

    /* renamed from: i */
    public static final HashMap f24742i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f24743j;
    private byte __isset_bitfield = 0;
    public MVDayTime availableFrom;
    public MVDayTime availableUntil;
    public MVBoundingBox boundingBox;

    /* renamed from: id */
    public int f24744id;
    public byte minNumberOfPassengers;
    public String name;
    public int parkingCapacity;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        NAME(2, "name"),
        MIN_NUMBER_OF_PASSENGERS(3, "minNumberOfPassengers"),
        PARKING_CAPACITY(4, "parkingCapacity"),
        AVAILABLE_FROM(5, "availableFrom"),
        AVAILABLE_UNTIL(6, "availableUntil"),
        BOUNDING_BOX(7, "boundingBox");
        
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
                    return ID;
                case 2:
                    return NAME;
                case 3:
                    return MIN_NUMBER_OF_PASSENGERS;
                case 4:
                    return PARKING_CAPACITY;
                case 5:
                    return AVAILABLE_FROM;
                case 6:
                    return AVAILABLE_UNTIL;
                case 7:
                    return BOUNDING_BOX;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVParkingMetaData$a */
    public static class C8230a extends C25239c<MVParkingMetaData> {
        public C8230a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVParkingMetaData mVParkingMetaData = (MVParkingMetaData) tBase;
            mVParkingMetaData.mo25667q();
            C25113c cVar = MVParkingMetaData.f24735b;
            gVar.mo61687K();
            gVar.mo61711x(MVParkingMetaData.f24735b);
            gVar.mo61678B(mVParkingMetaData.f24744id);
            gVar.mo61712y();
            if (mVParkingMetaData.name != null) {
                gVar.mo61711x(MVParkingMetaData.f24736c);
                gVar.mo61686J(mVParkingMetaData.name);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVParkingMetaData.f24737d);
            gVar.mo61709v(mVParkingMetaData.minNumberOfPassengers);
            gVar.mo61712y();
            gVar.mo61711x(MVParkingMetaData.f24738e);
            gVar.mo61678B(mVParkingMetaData.parkingCapacity);
            gVar.mo61712y();
            if (mVParkingMetaData.availableFrom != null) {
                gVar.mo61711x(MVParkingMetaData.f24739f);
                mVParkingMetaData.availableFrom.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVParkingMetaData.availableUntil != null) {
                gVar.mo61711x(MVParkingMetaData.f24740g);
                mVParkingMetaData.availableUntil.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVParkingMetaData.boundingBox != null) {
                gVar.mo61711x(MVParkingMetaData.f24741h);
                mVParkingMetaData.boundingBox.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVParkingMetaData mVParkingMetaData = (MVParkingMetaData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVParkingMetaData.mo25667q();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVParkingMetaData.f24744id = gVar.mo61696i();
                            mVParkingMetaData.mo25664m(true);
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVParkingMetaData.name = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 3) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVParkingMetaData.minNumberOfPassengers = gVar.mo61691d();
                            mVParkingMetaData.mo25665o();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVParkingMetaData.parkingCapacity = gVar.mo61696i();
                            mVParkingMetaData.mo25666p();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVDayTime mVDayTime = new MVDayTime();
                            mVParkingMetaData.availableFrom = mVDayTime;
                            mVDayTime.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVDayTime mVDayTime2 = new MVDayTime();
                            mVParkingMetaData.availableUntil = mVDayTime2;
                            mVDayTime2.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVBoundingBox mVBoundingBox = new MVBoundingBox();
                            mVParkingMetaData.boundingBox = mVBoundingBox;
                            mVBoundingBox.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVParkingMetaData$b */
    public static class C8231b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8230a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVParkingMetaData$c */
    public static class C8232c extends C25240d<MVParkingMetaData> {
        public C8232c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVParkingMetaData mVParkingMetaData = (MVParkingMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVParkingMetaData.mo25660i()) {
                bitSet.set(0);
            }
            if (mVParkingMetaData.mo25662k()) {
                bitSet.set(1);
            }
            if (mVParkingMetaData.mo25661j()) {
                bitSet.set(2);
            }
            if (mVParkingMetaData.mo25663l()) {
                bitSet.set(3);
            }
            if (mVParkingMetaData.mo25656f()) {
                bitSet.set(4);
            }
            if (mVParkingMetaData.mo25657g()) {
                bitSet.set(5);
            }
            if (mVParkingMetaData.mo25658h()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVParkingMetaData.mo25660i()) {
                jVar.mo61678B(mVParkingMetaData.f24744id);
            }
            if (mVParkingMetaData.mo25662k()) {
                jVar.mo61686J(mVParkingMetaData.name);
            }
            if (mVParkingMetaData.mo25661j()) {
                jVar.mo61716P(mVParkingMetaData.minNumberOfPassengers);
            }
            if (mVParkingMetaData.mo25663l()) {
                jVar.mo61678B(mVParkingMetaData.parkingCapacity);
            }
            if (mVParkingMetaData.mo25656f()) {
                mVParkingMetaData.availableFrom.mo25202X0(jVar);
            }
            if (mVParkingMetaData.mo25657g()) {
                mVParkingMetaData.availableUntil.mo25202X0(jVar);
            }
            if (mVParkingMetaData.mo25658h()) {
                mVParkingMetaData.boundingBox.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVParkingMetaData mVParkingMetaData = (MVParkingMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVParkingMetaData.f24744id = jVar.mo61696i();
                mVParkingMetaData.mo25664m(true);
            }
            if (T.get(1)) {
                mVParkingMetaData.name = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVParkingMetaData.minNumberOfPassengers = jVar.mo61691d();
                mVParkingMetaData.mo25665o();
            }
            if (T.get(3)) {
                mVParkingMetaData.parkingCapacity = jVar.mo61696i();
                mVParkingMetaData.mo25666p();
            }
            if (T.get(4)) {
                MVDayTime mVDayTime = new MVDayTime();
                mVParkingMetaData.availableFrom = mVDayTime;
                mVDayTime.mo25201C1(jVar);
            }
            if (T.get(5)) {
                MVDayTime mVDayTime2 = new MVDayTime();
                mVParkingMetaData.availableUntil = mVDayTime2;
                mVDayTime2.mo25201C1(jVar);
            }
            if (T.get(6)) {
                MVBoundingBox mVBoundingBox = new MVBoundingBox();
                mVParkingMetaData.boundingBox = mVBoundingBox;
                mVBoundingBox.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVParkingMetaData$d */
    public static class C8233d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8232c(0);
        }
    }

    static {
        new C17394d0("MVParkingMetaData");
        HashMap hashMap = new HashMap();
        f24742i = hashMap;
        hashMap.put(C25239c.class, new C8231b());
        hashMap.put(C25240d.class, new C8233d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MIN_NUMBER_OF_PASSENGERS, new FieldMetaData("minNumberOfPassengers", (byte) 3, new FieldValueMetaData((byte) 3, false)));
        enumMap.put(_Fields.PARKING_CAPACITY, new FieldMetaData("parkingCapacity", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.AVAILABLE_FROM, new FieldMetaData("availableFrom", (byte) 3, new StructMetaData(MVDayTime.class)));
        enumMap.put(_Fields.AVAILABLE_UNTIL, new FieldMetaData("availableUntil", (byte) 3, new StructMetaData(MVDayTime.class)));
        enumMap.put(_Fields.BOUNDING_BOX, new FieldMetaData("boundingBox", (byte) 3, new StructMetaData(MVBoundingBox.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24743j = unmodifiableMap;
        FieldMetaData.m61947a(MVParkingMetaData.class, unmodifiableMap);
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
        ((C25238b) f24742i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24742i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25653a(MVParkingMetaData mVParkingMetaData) {
        if (mVParkingMetaData == null || this.f24744id != mVParkingMetaData.f24744id) {
            return false;
        }
        boolean k = mo25662k();
        boolean k2 = mVParkingMetaData.mo25662k();
        if (((k || k2) && (!k || !k2 || !this.name.equals(mVParkingMetaData.name))) || this.minNumberOfPassengers != mVParkingMetaData.minNumberOfPassengers || this.parkingCapacity != mVParkingMetaData.parkingCapacity) {
            return false;
        }
        boolean f = mo25656f();
        boolean f2 = mVParkingMetaData.mo25656f();
        if ((f || f2) && (!f || !f2 || !this.availableFrom.mo26115a(mVParkingMetaData.availableFrom))) {
            return false;
        }
        boolean g = mo25657g();
        boolean g2 = mVParkingMetaData.mo25657g();
        if ((g || g2) && (!g || !g2 || !this.availableUntil.mo26115a(mVParkingMetaData.availableUntil))) {
            return false;
        }
        boolean h = mo25658h();
        boolean h2 = mVParkingMetaData.mo25658h();
        if (!h && !h2) {
            return true;
        }
        if (!h || !h2 || !this.boundingBox.mo26076a(mVParkingMetaData.boundingBox)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVParkingMetaData mVParkingMetaData = (MVParkingMetaData) obj;
        if (!getClass().equals(mVParkingMetaData.getClass())) {
            return getClass().getName().compareTo(mVParkingMetaData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25660i()).compareTo(Boolean.valueOf(mVParkingMetaData.mo25660i()));
        if (compareTo2 != 0 || ((mo25660i() && (compareTo2 = C25082a.m62839c(this.f24744id, mVParkingMetaData.f24744id)) != 0) || (compareTo2 = Boolean.valueOf(mo25662k()).compareTo(Boolean.valueOf(mVParkingMetaData.mo25662k()))) != 0 || ((mo25662k() && (compareTo2 = this.name.compareTo(mVParkingMetaData.name)) != 0) || (compareTo2 = Boolean.valueOf(mo25661j()).compareTo(Boolean.valueOf(mVParkingMetaData.mo25661j()))) != 0 || ((mo25661j() && (compareTo2 = C25082a.m62837a(this.minNumberOfPassengers, mVParkingMetaData.minNumberOfPassengers)) != 0) || (compareTo2 = Boolean.valueOf(mo25663l()).compareTo(Boolean.valueOf(mVParkingMetaData.mo25663l()))) != 0 || ((mo25663l() && (compareTo2 = C25082a.m62839c(this.parkingCapacity, mVParkingMetaData.parkingCapacity)) != 0) || (compareTo2 = Boolean.valueOf(mo25656f()).compareTo(Boolean.valueOf(mVParkingMetaData.mo25656f()))) != 0 || ((mo25656f() && (compareTo2 = this.availableFrom.compareTo(mVParkingMetaData.availableFrom)) != 0) || (compareTo2 = Boolean.valueOf(mo25657g()).compareTo(Boolean.valueOf(mVParkingMetaData.mo25657g()))) != 0 || ((mo25657g() && (compareTo2 = this.availableUntil.compareTo(mVParkingMetaData.availableUntil)) != 0) || (compareTo2 = Boolean.valueOf(mo25658h()).compareTo(Boolean.valueOf(mVParkingMetaData.mo25658h()))) != 0))))))) {
            return compareTo2;
        }
        if (!mo25658h() || (compareTo = this.boundingBox.compareTo(mVParkingMetaData.boundingBox)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVParkingMetaData)) {
            return mo25653a((MVParkingMetaData) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25656f() {
        return this.availableFrom != null;
    }

    /* renamed from: g */
    public final boolean mo25657g() {
        return this.availableUntil != null;
    }

    /* renamed from: h */
    public final boolean mo25658h() {
        return this.boundingBox != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25660i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo25661j() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: k */
    public final boolean mo25662k() {
        return this.name != null;
    }

    /* renamed from: l */
    public final boolean mo25663l() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: m */
    public final void mo25664m(boolean z) {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: o */
    public final void mo25665o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: p */
    public final void mo25666p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: q */
    public final void mo25667q() throws TException {
        MVDayTime mVDayTime = this.availableFrom;
        if (mVDayTime != null) {
            mVDayTime.getClass();
        }
        MVDayTime mVDayTime2 = this.availableUntil;
        if (mVDayTime2 != null) {
            mVDayTime2.getClass();
        }
        MVBoundingBox mVBoundingBox = this.boundingBox;
        if (mVBoundingBox != null) {
            mVBoundingBox.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVParkingMetaData(", "id:");
        C0016g.m42z(n, this.f24744id, ", ", "name:");
        String str = this.name;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("minNumberOfPassengers:");
        C0016g.m42z(n, this.minNumberOfPassengers, ", ", "parkingCapacity:");
        C0016g.m42z(n, this.parkingCapacity, ", ", "availableFrom:");
        MVDayTime mVDayTime = this.availableFrom;
        if (mVDayTime == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVDayTime);
        }
        n.append(", ");
        n.append("availableUntil:");
        MVDayTime mVDayTime2 = this.availableUntil;
        if (mVDayTime2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVDayTime2);
        }
        n.append(", ");
        n.append("boundingBox:");
        MVBoundingBox mVBoundingBox = this.boundingBox;
        if (mVBoundingBox == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVBoundingBox);
        }
        n.append(")");
        return n.toString();
    }
}
