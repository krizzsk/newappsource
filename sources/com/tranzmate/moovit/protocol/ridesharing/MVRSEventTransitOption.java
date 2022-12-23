package com.tranzmate.moovit.protocol.ridesharing;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
import com.tranzmate.moovit.protocol.common.MVVehicleType;
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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVRSEventTransitOption implements TBase<MVRSEventTransitOption, _Fields>, Serializable, Cloneable, Comparable<MVRSEventTransitOption> {

    /* renamed from: b */
    public static final C25113c f28087b = new C25113c("eventId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28088c = new C25113c("eventTripTime", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f28089d = new C25113c("vehicleType", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f28090e = new C25113c("transitOptionPrice", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f28091f = new C25113c("stopLocation", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f28092g = new C25113c("stopRideDetails", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f28093h = new C25113c("discountTransitOptionPrice", (byte) 12, 7);

    /* renamed from: i */
    public static final C25113c f28094i = new C25113c("remainingSeats", (byte) 8, 8);

    /* renamed from: j */
    public static final C25113c f28095j = new C25113c("stopRideDetailsTime", (byte) 10, 9);

    /* renamed from: k */
    public static final HashMap f28096k;

    /* renamed from: l */
    public static final Map<_Fields, FieldMetaData> f28097l;
    private byte __isset_bitfield = 0;
    public MVCurrencyAmount discountTransitOptionPrice;
    public int eventId;
    public long eventTripTime;
    private _Fields[] optionals = {_Fields.STOP_LOCATION, _Fields.STOP_RIDE_DETAILS, _Fields.DISCOUNT_TRANSIT_OPTION_PRICE, _Fields.REMAINING_SEATS, _Fields.STOP_RIDE_DETAILS_TIME};
    public int remainingSeats;
    public MVLocationDescriptor stopLocation;
    public String stopRideDetails;
    public long stopRideDetailsTime;
    public MVCurrencyAmount transitOptionPrice;
    public MVVehicleType vehicleType;

    public enum _Fields implements C25085c {
        EVENT_ID(1, "eventId"),
        EVENT_TRIP_TIME(2, "eventTripTime"),
        VEHICLE_TYPE(3, "vehicleType"),
        TRANSIT_OPTION_PRICE(4, "transitOptionPrice"),
        STOP_LOCATION(5, "stopLocation"),
        STOP_RIDE_DETAILS(6, "stopRideDetails"),
        DISCOUNT_TRANSIT_OPTION_PRICE(7, "discountTransitOptionPrice"),
        REMAINING_SEATS(8, "remainingSeats"),
        STOP_RIDE_DETAILS_TIME(9, "stopRideDetailsTime");
        
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
                    return EVENT_ID;
                case 2:
                    return EVENT_TRIP_TIME;
                case 3:
                    return VEHICLE_TYPE;
                case 4:
                    return TRANSIT_OPTION_PRICE;
                case 5:
                    return STOP_LOCATION;
                case 6:
                    return STOP_RIDE_DETAILS;
                case 7:
                    return DISCOUNT_TRANSIT_OPTION_PRICE;
                case 8:
                    return REMAINING_SEATS;
                case 9:
                    return STOP_RIDE_DETAILS_TIME;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventTransitOption$a */
    public static class C10370a extends C25239c<MVRSEventTransitOption> {
        public C10370a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEventTransitOption mVRSEventTransitOption = (MVRSEventTransitOption) tBase;
            mVRSEventTransitOption.mo31335t();
            C25113c cVar = MVRSEventTransitOption.f28087b;
            gVar.mo61687K();
            gVar.mo61711x(MVRSEventTransitOption.f28087b);
            gVar.mo61678B(mVRSEventTransitOption.eventId);
            gVar.mo61712y();
            gVar.mo61711x(MVRSEventTransitOption.f28088c);
            gVar.mo61679C(mVRSEventTransitOption.eventTripTime);
            gVar.mo61712y();
            if (mVRSEventTransitOption.vehicleType != null) {
                gVar.mo61711x(MVRSEventTransitOption.f28089d);
                gVar.mo61678B(mVRSEventTransitOption.vehicleType.getValue());
                gVar.mo61712y();
            }
            if (mVRSEventTransitOption.transitOptionPrice != null) {
                gVar.mo61711x(MVRSEventTransitOption.f28090e);
                mVRSEventTransitOption.transitOptionPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRSEventTransitOption.stopLocation != null && mVRSEventTransitOption.mo31326j()) {
                gVar.mo61711x(MVRSEventTransitOption.f28091f);
                mVRSEventTransitOption.stopLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRSEventTransitOption.stopRideDetails != null && mVRSEventTransitOption.mo31327k()) {
                gVar.mo61711x(MVRSEventTransitOption.f28092g);
                gVar.mo61686J(mVRSEventTransitOption.stopRideDetails);
                gVar.mo61712y();
            }
            if (mVRSEventTransitOption.discountTransitOptionPrice != null && mVRSEventTransitOption.mo31321f()) {
                gVar.mo61711x(MVRSEventTransitOption.f28093h);
                mVRSEventTransitOption.discountTransitOptionPrice.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRSEventTransitOption.mo31325i()) {
                gVar.mo61711x(MVRSEventTransitOption.f28094i);
                gVar.mo61678B(mVRSEventTransitOption.remainingSeats);
                gVar.mo61712y();
            }
            if (mVRSEventTransitOption.mo31328l()) {
                gVar.mo61711x(MVRSEventTransitOption.f28095j);
                gVar.mo61679C(mVRSEventTransitOption.stopRideDetailsTime);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEventTransitOption mVRSEventTransitOption = (MVRSEventTransitOption) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVRSEventTransitOption.mo31335t();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEventTransitOption.eventId = gVar.mo61696i();
                            mVRSEventTransitOption.mo31331p();
                            break;
                        }
                    case 2:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEventTransitOption.eventTripTime = gVar.mo61697j();
                            mVRSEventTransitOption.mo31332q();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEventTransitOption.vehicleType = MVVehicleType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                            mVRSEventTransitOption.transitOptionPrice = mVCurrencyAmount;
                            mVCurrencyAmount.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                            mVRSEventTransitOption.stopLocation = mVLocationDescriptor;
                            mVLocationDescriptor.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEventTransitOption.stopRideDetails = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                            mVRSEventTransitOption.discountTransitOptionPrice = mVCurrencyAmount2;
                            mVCurrencyAmount2.mo25201C1(gVar);
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEventTransitOption.remainingSeats = gVar.mo61696i();
                            mVRSEventTransitOption.mo31333r();
                            break;
                        }
                    case 9:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEventTransitOption.stopRideDetailsTime = gVar.mo61697j();
                            mVRSEventTransitOption.mo31334s();
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventTransitOption$b */
    public static class C10371b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10370a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventTransitOption$c */
    public static class C10372c extends C25240d<MVRSEventTransitOption> {
        public C10372c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEventTransitOption mVRSEventTransitOption = (MVRSEventTransitOption) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRSEventTransitOption.mo31322g()) {
                bitSet.set(0);
            }
            if (mVRSEventTransitOption.mo31323h()) {
                bitSet.set(1);
            }
            if (mVRSEventTransitOption.mo31330o()) {
                bitSet.set(2);
            }
            if (mVRSEventTransitOption.mo31329m()) {
                bitSet.set(3);
            }
            if (mVRSEventTransitOption.mo31326j()) {
                bitSet.set(4);
            }
            if (mVRSEventTransitOption.mo31327k()) {
                bitSet.set(5);
            }
            if (mVRSEventTransitOption.mo31321f()) {
                bitSet.set(6);
            }
            if (mVRSEventTransitOption.mo31325i()) {
                bitSet.set(7);
            }
            if (mVRSEventTransitOption.mo31328l()) {
                bitSet.set(8);
            }
            jVar.mo61738U(bitSet, 9);
            if (mVRSEventTransitOption.mo31322g()) {
                jVar.mo61678B(mVRSEventTransitOption.eventId);
            }
            if (mVRSEventTransitOption.mo31323h()) {
                jVar.mo61679C(mVRSEventTransitOption.eventTripTime);
            }
            if (mVRSEventTransitOption.mo31330o()) {
                jVar.mo61678B(mVRSEventTransitOption.vehicleType.getValue());
            }
            if (mVRSEventTransitOption.mo31329m()) {
                mVRSEventTransitOption.transitOptionPrice.mo25202X0(jVar);
            }
            if (mVRSEventTransitOption.mo31326j()) {
                mVRSEventTransitOption.stopLocation.mo25202X0(jVar);
            }
            if (mVRSEventTransitOption.mo31327k()) {
                jVar.mo61686J(mVRSEventTransitOption.stopRideDetails);
            }
            if (mVRSEventTransitOption.mo31321f()) {
                mVRSEventTransitOption.discountTransitOptionPrice.mo25202X0(jVar);
            }
            if (mVRSEventTransitOption.mo31325i()) {
                jVar.mo61678B(mVRSEventTransitOption.remainingSeats);
            }
            if (mVRSEventTransitOption.mo31328l()) {
                jVar.mo61679C(mVRSEventTransitOption.stopRideDetailsTime);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEventTransitOption mVRSEventTransitOption = (MVRSEventTransitOption) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(9);
            if (T.get(0)) {
                mVRSEventTransitOption.eventId = jVar.mo61696i();
                mVRSEventTransitOption.mo31331p();
            }
            if (T.get(1)) {
                mVRSEventTransitOption.eventTripTime = jVar.mo61697j();
                mVRSEventTransitOption.mo31332q();
            }
            if (T.get(2)) {
                mVRSEventTransitOption.vehicleType = MVVehicleType.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                MVCurrencyAmount mVCurrencyAmount = new MVCurrencyAmount();
                mVRSEventTransitOption.transitOptionPrice = mVCurrencyAmount;
                mVCurrencyAmount.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVRSEventTransitOption.stopLocation = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
            if (T.get(5)) {
                mVRSEventTransitOption.stopRideDetails = jVar.mo61704q();
            }
            if (T.get(6)) {
                MVCurrencyAmount mVCurrencyAmount2 = new MVCurrencyAmount();
                mVRSEventTransitOption.discountTransitOptionPrice = mVCurrencyAmount2;
                mVCurrencyAmount2.mo25201C1(jVar);
            }
            if (T.get(7)) {
                mVRSEventTransitOption.remainingSeats = jVar.mo61696i();
                mVRSEventTransitOption.mo31333r();
            }
            if (T.get(8)) {
                mVRSEventTransitOption.stopRideDetailsTime = jVar.mo61697j();
                mVRSEventTransitOption.mo31334s();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventTransitOption$d */
    public static class C10373d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10372c(0);
        }
    }

    static {
        new C17394d0("MVRSEventTransitOption");
        HashMap hashMap = new HashMap();
        f28096k = hashMap;
        hashMap.put(C25239c.class, new C10371b());
        hashMap.put(C25240d.class, new C10373d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.EVENT_ID, new FieldMetaData("eventId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.EVENT_TRIP_TIME, new FieldMetaData("eventTripTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.VEHICLE_TYPE, new FieldMetaData("vehicleType", (byte) 3, new EnumMetaData(MVVehicleType.class)));
        enumMap.put(_Fields.TRANSIT_OPTION_PRICE, new FieldMetaData("transitOptionPrice", (byte) 3, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.STOP_LOCATION, new FieldMetaData("stopLocation", (byte) 2, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.STOP_RIDE_DETAILS, new FieldMetaData("stopRideDetails", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DISCOUNT_TRANSIT_OPTION_PRICE, new FieldMetaData("discountTransitOptionPrice", (byte) 2, new StructMetaData(MVCurrencyAmount.class)));
        enumMap.put(_Fields.REMAINING_SEATS, new FieldMetaData("remainingSeats", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STOP_RIDE_DETAILS_TIME, new FieldMetaData("stopRideDetailsTime", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28097l = unmodifiableMap;
        FieldMetaData.m61947a(MVRSEventTransitOption.class, unmodifiableMap);
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
        ((C25238b) f28096k.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28096k.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo31318a(MVRSEventTransitOption mVRSEventTransitOption) {
        if (mVRSEventTransitOption == null || this.eventId != mVRSEventTransitOption.eventId || this.eventTripTime != mVRSEventTransitOption.eventTripTime) {
            return false;
        }
        boolean o = mo31330o();
        boolean o2 = mVRSEventTransitOption.mo31330o();
        if ((o || o2) && (!o || !o2 || !this.vehicleType.equals(mVRSEventTransitOption.vehicleType))) {
            return false;
        }
        boolean m = mo31329m();
        boolean m2 = mVRSEventTransitOption.mo31329m();
        if ((m || m2) && (!m || !m2 || !this.transitOptionPrice.mo26102a(mVRSEventTransitOption.transitOptionPrice))) {
            return false;
        }
        boolean j = mo31326j();
        boolean j2 = mVRSEventTransitOption.mo31326j();
        if ((j || j2) && (!j || !j2 || !this.stopLocation.mo26317a(mVRSEventTransitOption.stopLocation))) {
            return false;
        }
        boolean k = mo31327k();
        boolean k2 = mVRSEventTransitOption.mo31327k();
        if ((k || k2) && (!k || !k2 || !this.stopRideDetails.equals(mVRSEventTransitOption.stopRideDetails))) {
            return false;
        }
        boolean f = mo31321f();
        boolean f2 = mVRSEventTransitOption.mo31321f();
        if ((f || f2) && (!f || !f2 || !this.discountTransitOptionPrice.mo26102a(mVRSEventTransitOption.discountTransitOptionPrice))) {
            return false;
        }
        boolean i = mo31325i();
        boolean i2 = mVRSEventTransitOption.mo31325i();
        if ((i || i2) && (!i || !i2 || this.remainingSeats != mVRSEventTransitOption.remainingSeats)) {
            return false;
        }
        boolean l = mo31328l();
        boolean l2 = mVRSEventTransitOption.mo31328l();
        if (!l && !l2) {
            return true;
        }
        if (!l || !l2 || this.stopRideDetailsTime != mVRSEventTransitOption.stopRideDetailsTime) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int d;
        MVRSEventTransitOption mVRSEventTransitOption = (MVRSEventTransitOption) obj;
        if (!getClass().equals(mVRSEventTransitOption.getClass())) {
            return getClass().getName().compareTo(mVRSEventTransitOption.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31322g()).compareTo(Boolean.valueOf(mVRSEventTransitOption.mo31322g()));
        if (compareTo != 0 || ((mo31322g() && (compareTo = C25082a.m62839c(this.eventId, mVRSEventTransitOption.eventId)) != 0) || (compareTo = Boolean.valueOf(mo31323h()).compareTo(Boolean.valueOf(mVRSEventTransitOption.mo31323h()))) != 0 || ((mo31323h() && (compareTo = C25082a.m62840d(this.eventTripTime, mVRSEventTransitOption.eventTripTime)) != 0) || (compareTo = Boolean.valueOf(mo31330o()).compareTo(Boolean.valueOf(mVRSEventTransitOption.mo31330o()))) != 0 || ((mo31330o() && (compareTo = this.vehicleType.compareTo(mVRSEventTransitOption.vehicleType)) != 0) || (compareTo = Boolean.valueOf(mo31329m()).compareTo(Boolean.valueOf(mVRSEventTransitOption.mo31329m()))) != 0 || ((mo31329m() && (compareTo = this.transitOptionPrice.compareTo(mVRSEventTransitOption.transitOptionPrice)) != 0) || (compareTo = Boolean.valueOf(mo31326j()).compareTo(Boolean.valueOf(mVRSEventTransitOption.mo31326j()))) != 0 || ((mo31326j() && (compareTo = this.stopLocation.compareTo(mVRSEventTransitOption.stopLocation)) != 0) || (compareTo = Boolean.valueOf(mo31327k()).compareTo(Boolean.valueOf(mVRSEventTransitOption.mo31327k()))) != 0 || ((mo31327k() && (compareTo = this.stopRideDetails.compareTo(mVRSEventTransitOption.stopRideDetails)) != 0) || (compareTo = Boolean.valueOf(mo31321f()).compareTo(Boolean.valueOf(mVRSEventTransitOption.mo31321f()))) != 0 || ((mo31321f() && (compareTo = this.discountTransitOptionPrice.compareTo(mVRSEventTransitOption.discountTransitOptionPrice)) != 0) || (compareTo = Boolean.valueOf(mo31325i()).compareTo(Boolean.valueOf(mVRSEventTransitOption.mo31325i()))) != 0 || ((mo31325i() && (compareTo = C25082a.m62839c(this.remainingSeats, mVRSEventTransitOption.remainingSeats)) != 0) || (compareTo = Boolean.valueOf(mo31328l()).compareTo(Boolean.valueOf(mVRSEventTransitOption.mo31328l()))) != 0))))))))) {
            return compareTo;
        }
        if (!mo31328l() || (d = C25082a.m62840d(this.stopRideDetailsTime, mVRSEventTransitOption.stopRideDetailsTime)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVRSEventTransitOption)) {
            return mo31318a((MVRSEventTransitOption) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31321f() {
        return this.discountTransitOptionPrice != null;
    }

    /* renamed from: g */
    public final boolean mo31322g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo31323h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31325i() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: j */
    public final boolean mo31326j() {
        return this.stopLocation != null;
    }

    /* renamed from: k */
    public final boolean mo31327k() {
        return this.stopRideDetails != null;
    }

    /* renamed from: l */
    public final boolean mo31328l() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: m */
    public final boolean mo31329m() {
        return this.transitOptionPrice != null;
    }

    /* renamed from: o */
    public final boolean mo31330o() {
        return this.vehicleType != null;
    }

    /* renamed from: p */
    public final void mo31331p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: q */
    public final void mo31332q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: r */
    public final void mo31333r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: s */
    public final void mo31334s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: t */
    public final void mo31335t() throws TException {
        MVCurrencyAmount mVCurrencyAmount = this.transitOptionPrice;
        if (mVCurrencyAmount != null) {
            mVCurrencyAmount.getClass();
        }
        MVLocationDescriptor mVLocationDescriptor = this.stopLocation;
        if (mVLocationDescriptor != null) {
            mVLocationDescriptor.mo26333s();
        }
        MVCurrencyAmount mVCurrencyAmount2 = this.discountTransitOptionPrice;
        if (mVCurrencyAmount2 != null) {
            mVCurrencyAmount2.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRSEventTransitOption(", "eventId:");
        C0016g.m42z(n, this.eventId, ", ", "eventTripTime:");
        C25541a.m63889t(n, this.eventTripTime, ", ", "vehicleType:");
        MVVehicleType mVVehicleType = this.vehicleType;
        if (mVVehicleType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVVehicleType);
        }
        n.append(", ");
        n.append("transitOptionPrice:");
        MVCurrencyAmount mVCurrencyAmount = this.transitOptionPrice;
        if (mVCurrencyAmount == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCurrencyAmount);
        }
        if (mo31326j()) {
            n.append(", ");
            n.append("stopLocation:");
            MVLocationDescriptor mVLocationDescriptor = this.stopLocation;
            if (mVLocationDescriptor == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLocationDescriptor);
            }
        }
        if (mo31327k()) {
            n.append(", ");
            n.append("stopRideDetails:");
            String str = this.stopRideDetails;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo31321f()) {
            n.append(", ");
            n.append("discountTransitOptionPrice:");
            MVCurrencyAmount mVCurrencyAmount2 = this.discountTransitOptionPrice;
            if (mVCurrencyAmount2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVCurrencyAmount2);
            }
        }
        if (mo31325i()) {
            n.append(", ");
            n.append("remainingSeats:");
            n.append(this.remainingSeats);
        }
        if (mo31328l()) {
            n.append(", ");
            n.append("stopRideDetailsTime:");
            n.append(this.stopRideDetailsTime);
        }
        n.append(")");
        return n.toString();
    }
}
