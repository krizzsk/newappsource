package com.tranzmate.moovit.protocol.mapitems;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.carpool.MVPassengerStops;
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

public class MVCarPoolRideMetaData implements TBase<MVCarPoolRideMetaData, _Fields>, Serializable, Cloneable, Comparable<MVCarPoolRideMetaData> {

    /* renamed from: b */
    public static final C25113c f26215b = new C25113c("rideId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26216c = new C25113c("driverName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26217d = new C25113c("driverImgUrl", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26218e = new C25113c("destinationName", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26219f = new C25113c("departureTime", (byte) 10, 5);

    /* renamed from: g */
    public static final C25113c f26220g = new C25113c("stops", (byte) 12, 6);

    /* renamed from: h */
    public static final HashMap f26221h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f26222i;
    private byte __isset_bitfield = 0;
    public long departureTime;
    public String destinationName;
    public String driverImgUrl;
    public String driverName;
    public int rideId;
    public MVPassengerStops stops;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        DRIVER_NAME(2, "driverName"),
        DRIVER_IMG_URL(3, "driverImgUrl"),
        DESTINATION_NAME(4, "destinationName"),
        DEPARTURE_TIME(5, "departureTime"),
        STOPS(6, "stops");
        
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
                    return RIDE_ID;
                case 2:
                    return DRIVER_NAME;
                case 3:
                    return DRIVER_IMG_URL;
                case 4:
                    return DESTINATION_NAME;
                case 5:
                    return DEPARTURE_TIME;
                case 6:
                    return STOPS;
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCarPoolRideMetaData$a */
    public static class C9040a extends C25239c<MVCarPoolRideMetaData> {
        public C9040a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolRideMetaData mVCarPoolRideMetaData = (MVCarPoolRideMetaData) tBase;
            MVPassengerStops mVPassengerStops = mVCarPoolRideMetaData.stops;
            if (mVPassengerStops != null) {
                mVPassengerStops.mo25808j();
            }
            C25113c cVar = MVCarPoolRideMetaData.f26215b;
            gVar.mo61687K();
            gVar.mo61711x(MVCarPoolRideMetaData.f26215b);
            gVar.mo61678B(mVCarPoolRideMetaData.rideId);
            gVar.mo61712y();
            if (mVCarPoolRideMetaData.driverName != null) {
                gVar.mo61711x(MVCarPoolRideMetaData.f26216c);
                gVar.mo61686J(mVCarPoolRideMetaData.driverName);
                gVar.mo61712y();
            }
            if (mVCarPoolRideMetaData.driverImgUrl != null) {
                gVar.mo61711x(MVCarPoolRideMetaData.f26217d);
                gVar.mo61686J(mVCarPoolRideMetaData.driverImgUrl);
                gVar.mo61712y();
            }
            if (mVCarPoolRideMetaData.destinationName != null) {
                gVar.mo61711x(MVCarPoolRideMetaData.f26218e);
                gVar.mo61686J(mVCarPoolRideMetaData.destinationName);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCarPoolRideMetaData.f26219f);
            gVar.mo61679C(mVCarPoolRideMetaData.departureTime);
            gVar.mo61712y();
            if (mVCarPoolRideMetaData.stops != null) {
                gVar.mo61711x(MVCarPoolRideMetaData.f26220g);
                mVCarPoolRideMetaData.stops.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolRideMetaData mVCarPoolRideMetaData = (MVCarPoolRideMetaData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVPassengerStops mVPassengerStops = mVCarPoolRideMetaData.stops;
                    if (mVPassengerStops != null) {
                        mVPassengerStops.mo25808j();
                        return;
                    }
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarPoolRideMetaData.rideId = gVar.mo61696i();
                            mVCarPoolRideMetaData.mo28181m();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarPoolRideMetaData.driverName = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarPoolRideMetaData.driverImgUrl = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarPoolRideMetaData.destinationName = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarPoolRideMetaData.departureTime = gVar.mo61697j();
                            mVCarPoolRideMetaData.mo28180l();
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPassengerStops mVPassengerStops2 = new MVPassengerStops();
                            mVCarPoolRideMetaData.stops = mVPassengerStops2;
                            mVPassengerStops2.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCarPoolRideMetaData$b */
    public static class C9041b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9040a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCarPoolRideMetaData$c */
    public static class C9042c extends C25240d<MVCarPoolRideMetaData> {
        public C9042c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolRideMetaData mVCarPoolRideMetaData = (MVCarPoolRideMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCarPoolRideMetaData.mo28178j()) {
                bitSet.set(0);
            }
            if (mVCarPoolRideMetaData.mo28177i()) {
                bitSet.set(1);
            }
            if (mVCarPoolRideMetaData.mo28175h()) {
                bitSet.set(2);
            }
            if (mVCarPoolRideMetaData.mo28174g()) {
                bitSet.set(3);
            }
            if (mVCarPoolRideMetaData.mo28173f()) {
                bitSet.set(4);
            }
            if (mVCarPoolRideMetaData.mo28179k()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVCarPoolRideMetaData.mo28178j()) {
                jVar.mo61678B(mVCarPoolRideMetaData.rideId);
            }
            if (mVCarPoolRideMetaData.mo28177i()) {
                jVar.mo61686J(mVCarPoolRideMetaData.driverName);
            }
            if (mVCarPoolRideMetaData.mo28175h()) {
                jVar.mo61686J(mVCarPoolRideMetaData.driverImgUrl);
            }
            if (mVCarPoolRideMetaData.mo28174g()) {
                jVar.mo61686J(mVCarPoolRideMetaData.destinationName);
            }
            if (mVCarPoolRideMetaData.mo28173f()) {
                jVar.mo61679C(mVCarPoolRideMetaData.departureTime);
            }
            if (mVCarPoolRideMetaData.mo28179k()) {
                mVCarPoolRideMetaData.stops.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolRideMetaData mVCarPoolRideMetaData = (MVCarPoolRideMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVCarPoolRideMetaData.rideId = jVar.mo61696i();
                mVCarPoolRideMetaData.mo28181m();
            }
            if (T.get(1)) {
                mVCarPoolRideMetaData.driverName = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVCarPoolRideMetaData.driverImgUrl = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVCarPoolRideMetaData.destinationName = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVCarPoolRideMetaData.departureTime = jVar.mo61697j();
                mVCarPoolRideMetaData.mo28180l();
            }
            if (T.get(5)) {
                MVPassengerStops mVPassengerStops = new MVPassengerStops();
                mVCarPoolRideMetaData.stops = mVPassengerStops;
                mVPassengerStops.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVCarPoolRideMetaData$d */
    public static class C9043d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9042c(0);
        }
    }

    static {
        new C17394d0("MVCarPoolRideMetaData");
        HashMap hashMap = new HashMap();
        f26221h = hashMap;
        hashMap.put(C25239c.class, new C9041b());
        hashMap.put(C25240d.class, new C9043d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DRIVER_NAME, new FieldMetaData("driverName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DRIVER_IMG_URL, new FieldMetaData("driverImgUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DESTINATION_NAME, new FieldMetaData("destinationName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DEPARTURE_TIME, new FieldMetaData("departureTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.STOPS, new FieldMetaData("stops", (byte) 3, new StructMetaData(MVPassengerStops.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26222i = unmodifiableMap;
        FieldMetaData.m61947a(MVCarPoolRideMetaData.class, unmodifiableMap);
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
        ((C25238b) f26221h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26221h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCarPoolRideMetaData mVCarPoolRideMetaData = (MVCarPoolRideMetaData) obj;
        if (!getClass().equals(mVCarPoolRideMetaData.getClass())) {
            return getClass().getName().compareTo(mVCarPoolRideMetaData.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28178j()).compareTo(Boolean.valueOf(mVCarPoolRideMetaData.mo28178j()));
        if (compareTo2 != 0 || ((mo28178j() && (compareTo2 = C25082a.m62839c(this.rideId, mVCarPoolRideMetaData.rideId)) != 0) || (compareTo2 = Boolean.valueOf(mo28177i()).compareTo(Boolean.valueOf(mVCarPoolRideMetaData.mo28177i()))) != 0 || ((mo28177i() && (compareTo2 = this.driverName.compareTo(mVCarPoolRideMetaData.driverName)) != 0) || (compareTo2 = Boolean.valueOf(mo28175h()).compareTo(Boolean.valueOf(mVCarPoolRideMetaData.mo28175h()))) != 0 || ((mo28175h() && (compareTo2 = this.driverImgUrl.compareTo(mVCarPoolRideMetaData.driverImgUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo28174g()).compareTo(Boolean.valueOf(mVCarPoolRideMetaData.mo28174g()))) != 0 || ((mo28174g() && (compareTo2 = this.destinationName.compareTo(mVCarPoolRideMetaData.destinationName)) != 0) || (compareTo2 = Boolean.valueOf(mo28173f()).compareTo(Boolean.valueOf(mVCarPoolRideMetaData.mo28173f()))) != 0 || ((mo28173f() && (compareTo2 = C25082a.m62840d(this.departureTime, mVCarPoolRideMetaData.departureTime)) != 0) || (compareTo2 = Boolean.valueOf(mo28179k()).compareTo(Boolean.valueOf(mVCarPoolRideMetaData.mo28179k()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo28179k() || (compareTo = this.stops.compareTo(mVCarPoolRideMetaData.stops)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCarPoolRideMetaData)) {
            return false;
        }
        MVCarPoolRideMetaData mVCarPoolRideMetaData = (MVCarPoolRideMetaData) obj;
        if (this.rideId != mVCarPoolRideMetaData.rideId) {
            return false;
        }
        boolean i = mo28177i();
        boolean i2 = mVCarPoolRideMetaData.mo28177i();
        if ((i || i2) && (!i || !i2 || !this.driverName.equals(mVCarPoolRideMetaData.driverName))) {
            return false;
        }
        boolean h = mo28175h();
        boolean h2 = mVCarPoolRideMetaData.mo28175h();
        if ((h || h2) && (!h || !h2 || !this.driverImgUrl.equals(mVCarPoolRideMetaData.driverImgUrl))) {
            return false;
        }
        boolean g = mo28174g();
        boolean g2 = mVCarPoolRideMetaData.mo28174g();
        if (((g || g2) && (!g || !g2 || !this.destinationName.equals(mVCarPoolRideMetaData.destinationName))) || this.departureTime != mVCarPoolRideMetaData.departureTime) {
            return false;
        }
        boolean k = mo28179k();
        boolean k2 = mVCarPoolRideMetaData.mo28179k();
        if ((k || k2) && (!k || !k2 || !this.stops.mo25800a(mVCarPoolRideMetaData.stops))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28173f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo28174g() {
        return this.destinationName != null;
    }

    /* renamed from: h */
    public final boolean mo28175h() {
        return this.driverImgUrl != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28177i() {
        return this.driverName != null;
    }

    /* renamed from: j */
    public final boolean mo28178j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo28179k() {
        return this.stops != null;
    }

    /* renamed from: l */
    public final void mo28180l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo28181m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCarPoolRideMetaData(", "rideId:");
        C0016g.m42z(n, this.rideId, ", ", "driverName:");
        String str = this.driverName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("driverImgUrl:");
        String str2 = this.driverImgUrl;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("destinationName:");
        String str3 = this.destinationName;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("departureTime:");
        C25541a.m63889t(n, this.departureTime, ", ", "stops:");
        MVPassengerStops mVPassengerStops = this.stops;
        if (mVPassengerStops == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPassengerStops);
        }
        n.append(")");
        return n.toString();
    }
}
