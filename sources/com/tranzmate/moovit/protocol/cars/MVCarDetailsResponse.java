package com.tranzmate.moovit.protocol.cars;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
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

public class MVCarDetailsResponse implements TBase<MVCarDetailsResponse, _Fields>, Serializable, Cloneable, Comparable<MVCarDetailsResponse> {

    /* renamed from: b */
    public static final C25113c f24902b = new C25113c(ServerParameters.OPERATOR, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f24903c = new C25113c(ServerParameters.MODEL, (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f24904d = new C25113c("licencePlate", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f24905e = new C25113c("fuelType", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f24906f = new C25113c("transmission", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f24907g = new C25113c("seatCount", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f24908h = new C25113c("externalCarId", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f24909i = new C25113c("address", (byte) 11, 8);

    /* renamed from: j */
    public static final C25113c f24910j = new C25113c("pricingUse", (byte) 11, 9);

    /* renamed from: k */
    public static final C25113c f24911k = new C25113c("pricingParking", (byte) 11, 10);

    /* renamed from: l */
    public static final C25113c f24912l = new C25113c("fuelLevel", (byte) 3, 11);

    /* renamed from: m */
    public static final C25113c f24913m = new C25113c("interiorRating", (byte) 3, 12);

    /* renamed from: n */
    public static final C25113c f24914n = new C25113c("pricingUseRate", (byte) 4, 13);

    /* renamed from: o */
    public static final C25113c f24915o = new C25113c("pricingParkingRate", (byte) 4, 14);

    /* renamed from: p */
    public static final HashMap f24916p;

    /* renamed from: q */
    public static final Map<_Fields, FieldMetaData> f24917q;
    private byte __isset_bitfield = 0;
    public String address;
    public String externalCarId;
    public byte fuelLevel;
    public String fuelType;
    public byte interiorRating;
    public String licencePlate;
    public String model;
    public String operator;
    private _Fields[] optionals = {_Fields.ADDRESS, _Fields.INTERIOR_RATING};
    public String pricingParking;
    public double pricingParkingRate;
    public String pricingUse;
    public double pricingUseRate;
    public int seatCount;
    public String transmission;

    public enum _Fields implements C25085c {
        OPERATOR(1, ServerParameters.OPERATOR),
        MODEL(2, ServerParameters.MODEL),
        LICENCE_PLATE(3, "licencePlate"),
        FUEL_TYPE(4, "fuelType"),
        TRANSMISSION(5, "transmission"),
        SEAT_COUNT(6, "seatCount"),
        EXTERNAL_CAR_ID(7, "externalCarId"),
        ADDRESS(8, "address"),
        PRICING_USE(9, "pricingUse"),
        PRICING_PARKING(10, "pricingParking"),
        FUEL_LEVEL(11, "fuelLevel"),
        INTERIOR_RATING(12, "interiorRating"),
        PRICING_USE_RATE(13, "pricingUseRate"),
        PRICING_PARKING_RATE(14, "pricingParkingRate");
        
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
                    return OPERATOR;
                case 2:
                    return MODEL;
                case 3:
                    return LICENCE_PLATE;
                case 4:
                    return FUEL_TYPE;
                case 5:
                    return TRANSMISSION;
                case 6:
                    return SEAT_COUNT;
                case 7:
                    return EXTERNAL_CAR_ID;
                case 8:
                    return ADDRESS;
                case 9:
                    return PRICING_USE;
                case 10:
                    return PRICING_PARKING;
                case 11:
                    return FUEL_LEVEL;
                case 12:
                    return INTERIOR_RATING;
                case 13:
                    return PRICING_USE_RATE;
                case 14:
                    return PRICING_PARKING_RATE;
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

    /* renamed from: com.tranzmate.moovit.protocol.cars.MVCarDetailsResponse$a */
    public static class C8332a extends C25239c<MVCarDetailsResponse> {
        public C8332a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarDetailsResponse mVCarDetailsResponse = (MVCarDetailsResponse) tBase;
            mVCarDetailsResponse.getClass();
            C25113c cVar = MVCarDetailsResponse.f24902b;
            gVar.mo61687K();
            if (mVCarDetailsResponse.operator != null) {
                gVar.mo61711x(MVCarDetailsResponse.f24902b);
                gVar.mo61686J(mVCarDetailsResponse.operator);
                gVar.mo61712y();
            }
            if (mVCarDetailsResponse.model != null) {
                gVar.mo61711x(MVCarDetailsResponse.f24903c);
                gVar.mo61686J(mVCarDetailsResponse.model);
                gVar.mo61712y();
            }
            if (mVCarDetailsResponse.licencePlate != null) {
                gVar.mo61711x(MVCarDetailsResponse.f24904d);
                gVar.mo61686J(mVCarDetailsResponse.licencePlate);
                gVar.mo61712y();
            }
            if (mVCarDetailsResponse.fuelType != null) {
                gVar.mo61711x(MVCarDetailsResponse.f24905e);
                gVar.mo61686J(mVCarDetailsResponse.fuelType);
                gVar.mo61712y();
            }
            if (mVCarDetailsResponse.transmission != null) {
                gVar.mo61711x(MVCarDetailsResponse.f24906f);
                gVar.mo61686J(mVCarDetailsResponse.transmission);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCarDetailsResponse.f24907g);
            gVar.mo61678B(mVCarDetailsResponse.seatCount);
            gVar.mo61712y();
            if (mVCarDetailsResponse.externalCarId != null) {
                gVar.mo61711x(MVCarDetailsResponse.f24908h);
                gVar.mo61686J(mVCarDetailsResponse.externalCarId);
                gVar.mo61712y();
            }
            if (mVCarDetailsResponse.address != null && mVCarDetailsResponse.mo25950f()) {
                gVar.mo61711x(MVCarDetailsResponse.f24909i);
                gVar.mo61686J(mVCarDetailsResponse.address);
                gVar.mo61712y();
            }
            if (mVCarDetailsResponse.pricingUse != null) {
                gVar.mo61711x(MVCarDetailsResponse.f24910j);
                gVar.mo61686J(mVCarDetailsResponse.pricingUse);
                gVar.mo61712y();
            }
            if (mVCarDetailsResponse.pricingParking != null) {
                gVar.mo61711x(MVCarDetailsResponse.f24911k);
                gVar.mo61686J(mVCarDetailsResponse.pricingParking);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCarDetailsResponse.f24912l);
            gVar.mo61709v(mVCarDetailsResponse.fuelLevel);
            gVar.mo61712y();
            if (mVCarDetailsResponse.mo25955j()) {
                gVar.mo61711x(MVCarDetailsResponse.f24913m);
                gVar.mo61709v(mVCarDetailsResponse.interiorRating);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCarDetailsResponse.f24914n);
            gVar.mo61710w(mVCarDetailsResponse.pricingUseRate);
            gVar.mo61712y();
            gVar.mo61711x(MVCarDetailsResponse.f24915o);
            gVar.mo61710w(mVCarDetailsResponse.pricingParkingRate);
            gVar.mo61712y();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarDetailsResponse mVCarDetailsResponse = (MVCarDetailsResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCarDetailsResponse.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarDetailsResponse.operator = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarDetailsResponse.model = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarDetailsResponse.licencePlate = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarDetailsResponse.fuelType = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarDetailsResponse.transmission = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarDetailsResponse.seatCount = gVar.mo61696i();
                            mVCarDetailsResponse.mo25947A();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarDetailsResponse.externalCarId = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarDetailsResponse.address = gVar.mo61704q();
                            break;
                        }
                    case 9:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarDetailsResponse.pricingUse = gVar.mo61704q();
                            break;
                        }
                    case 10:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarDetailsResponse.pricingParking = gVar.mo61704q();
                            break;
                        }
                    case 11:
                        if (b != 3) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarDetailsResponse.fuelLevel = gVar.mo61691d();
                            mVCarDetailsResponse.mo25966u();
                            break;
                        }
                    case 12:
                        if (b != 3) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarDetailsResponse.interiorRating = gVar.mo61691d();
                            mVCarDetailsResponse.mo25967v();
                            break;
                        }
                    case 13:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarDetailsResponse.pricingUseRate = gVar.mo61692e();
                            mVCarDetailsResponse.mo25969y();
                            break;
                        }
                    case 14:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVCarDetailsResponse.pricingParkingRate = gVar.mo61692e();
                            mVCarDetailsResponse.mo25968w();
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

    /* renamed from: com.tranzmate.moovit.protocol.cars.MVCarDetailsResponse$b */
    public static class C8333b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8332a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.cars.MVCarDetailsResponse$c */
    public static class C8334c extends C25240d<MVCarDetailsResponse> {
        public C8334c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarDetailsResponse mVCarDetailsResponse = (MVCarDetailsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCarDetailsResponse.mo25958m()) {
                bitSet.set(0);
            }
            if (mVCarDetailsResponse.mo25957l()) {
                bitSet.set(1);
            }
            if (mVCarDetailsResponse.mo25956k()) {
                bitSet.set(2);
            }
            if (mVCarDetailsResponse.mo25954i()) {
                bitSet.set(3);
            }
            if (mVCarDetailsResponse.mo25964t()) {
                bitSet.set(4);
            }
            if (mVCarDetailsResponse.mo25963s()) {
                bitSet.set(5);
            }
            if (mVCarDetailsResponse.mo25951g()) {
                bitSet.set(6);
            }
            if (mVCarDetailsResponse.mo25950f()) {
                bitSet.set(7);
            }
            if (mVCarDetailsResponse.mo25961q()) {
                bitSet.set(8);
            }
            if (mVCarDetailsResponse.mo25959o()) {
                bitSet.set(9);
            }
            if (mVCarDetailsResponse.mo25952h()) {
                bitSet.set(10);
            }
            if (mVCarDetailsResponse.mo25955j()) {
                bitSet.set(11);
            }
            if (mVCarDetailsResponse.mo25962r()) {
                bitSet.set(12);
            }
            if (mVCarDetailsResponse.mo25960p()) {
                bitSet.set(13);
            }
            jVar.mo61738U(bitSet, 14);
            if (mVCarDetailsResponse.mo25958m()) {
                jVar.mo61686J(mVCarDetailsResponse.operator);
            }
            if (mVCarDetailsResponse.mo25957l()) {
                jVar.mo61686J(mVCarDetailsResponse.model);
            }
            if (mVCarDetailsResponse.mo25956k()) {
                jVar.mo61686J(mVCarDetailsResponse.licencePlate);
            }
            if (mVCarDetailsResponse.mo25954i()) {
                jVar.mo61686J(mVCarDetailsResponse.fuelType);
            }
            if (mVCarDetailsResponse.mo25964t()) {
                jVar.mo61686J(mVCarDetailsResponse.transmission);
            }
            if (mVCarDetailsResponse.mo25963s()) {
                jVar.mo61678B(mVCarDetailsResponse.seatCount);
            }
            if (mVCarDetailsResponse.mo25951g()) {
                jVar.mo61686J(mVCarDetailsResponse.externalCarId);
            }
            if (mVCarDetailsResponse.mo25950f()) {
                jVar.mo61686J(mVCarDetailsResponse.address);
            }
            if (mVCarDetailsResponse.mo25961q()) {
                jVar.mo61686J(mVCarDetailsResponse.pricingUse);
            }
            if (mVCarDetailsResponse.mo25959o()) {
                jVar.mo61686J(mVCarDetailsResponse.pricingParking);
            }
            if (mVCarDetailsResponse.mo25952h()) {
                jVar.mo61716P(mVCarDetailsResponse.fuelLevel);
            }
            if (mVCarDetailsResponse.mo25955j()) {
                jVar.mo61716P(mVCarDetailsResponse.interiorRating);
            }
            if (mVCarDetailsResponse.mo25962r()) {
                jVar.mo61710w(mVCarDetailsResponse.pricingUseRate);
            }
            if (mVCarDetailsResponse.mo25960p()) {
                jVar.mo61710w(mVCarDetailsResponse.pricingParkingRate);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarDetailsResponse mVCarDetailsResponse = (MVCarDetailsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(14);
            if (T.get(0)) {
                mVCarDetailsResponse.operator = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVCarDetailsResponse.model = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVCarDetailsResponse.licencePlate = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVCarDetailsResponse.fuelType = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVCarDetailsResponse.transmission = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVCarDetailsResponse.seatCount = jVar.mo61696i();
                mVCarDetailsResponse.mo25947A();
            }
            if (T.get(6)) {
                mVCarDetailsResponse.externalCarId = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVCarDetailsResponse.address = jVar.mo61704q();
            }
            if (T.get(8)) {
                mVCarDetailsResponse.pricingUse = jVar.mo61704q();
            }
            if (T.get(9)) {
                mVCarDetailsResponse.pricingParking = jVar.mo61704q();
            }
            if (T.get(10)) {
                mVCarDetailsResponse.fuelLevel = jVar.mo61691d();
                mVCarDetailsResponse.mo25966u();
            }
            if (T.get(11)) {
                mVCarDetailsResponse.interiorRating = jVar.mo61691d();
                mVCarDetailsResponse.mo25967v();
            }
            if (T.get(12)) {
                mVCarDetailsResponse.pricingUseRate = jVar.mo61692e();
                mVCarDetailsResponse.mo25969y();
            }
            if (T.get(13)) {
                mVCarDetailsResponse.pricingParkingRate = jVar.mo61692e();
                mVCarDetailsResponse.mo25968w();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.cars.MVCarDetailsResponse$d */
    public static class C8335d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8334c(0);
        }
    }

    static {
        new C17394d0("MVCarDetailsResponse");
        HashMap hashMap = new HashMap();
        f24916p = hashMap;
        hashMap.put(C25239c.class, new C8333b());
        hashMap.put(C25240d.class, new C8335d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.OPERATOR, new FieldMetaData(ServerParameters.OPERATOR, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.MODEL, new FieldMetaData(ServerParameters.MODEL, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LICENCE_PLATE, new FieldMetaData("licencePlate", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FUEL_TYPE, new FieldMetaData("fuelType", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TRANSMISSION, new FieldMetaData("transmission", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SEAT_COUNT, new FieldMetaData("seatCount", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.EXTERNAL_CAR_ID, new FieldMetaData("externalCarId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ADDRESS, new FieldMetaData("address", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRICING_USE, new FieldMetaData("pricingUse", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRICING_PARKING, new FieldMetaData("pricingParking", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.FUEL_LEVEL, new FieldMetaData("fuelLevel", (byte) 3, new FieldValueMetaData((byte) 3, false)));
        enumMap.put(_Fields.INTERIOR_RATING, new FieldMetaData("interiorRating", (byte) 2, new FieldValueMetaData((byte) 3, false)));
        enumMap.put(_Fields.PRICING_USE_RATE, new FieldMetaData("pricingUseRate", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.PRICING_PARKING_RATE, new FieldMetaData("pricingParkingRate", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24917q = unmodifiableMap;
        FieldMetaData.m61947a(MVCarDetailsResponse.class, unmodifiableMap);
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

    /* renamed from: A */
    public final void mo25947A() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: C1 */
    public final void mo25201C1(C25121g gVar) throws TException {
        ((C25238b) f24916p.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24916p.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int b;
        MVCarDetailsResponse mVCarDetailsResponse = (MVCarDetailsResponse) obj;
        if (!getClass().equals(mVCarDetailsResponse.getClass())) {
            return getClass().getName().compareTo(mVCarDetailsResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25958m()).compareTo(Boolean.valueOf(mVCarDetailsResponse.mo25958m()));
        if (compareTo != 0 || ((mo25958m() && (compareTo = this.operator.compareTo(mVCarDetailsResponse.operator)) != 0) || (compareTo = Boolean.valueOf(mo25957l()).compareTo(Boolean.valueOf(mVCarDetailsResponse.mo25957l()))) != 0 || ((mo25957l() && (compareTo = this.model.compareTo(mVCarDetailsResponse.model)) != 0) || (compareTo = Boolean.valueOf(mo25956k()).compareTo(Boolean.valueOf(mVCarDetailsResponse.mo25956k()))) != 0 || ((mo25956k() && (compareTo = this.licencePlate.compareTo(mVCarDetailsResponse.licencePlate)) != 0) || (compareTo = Boolean.valueOf(mo25954i()).compareTo(Boolean.valueOf(mVCarDetailsResponse.mo25954i()))) != 0 || ((mo25954i() && (compareTo = this.fuelType.compareTo(mVCarDetailsResponse.fuelType)) != 0) || (compareTo = Boolean.valueOf(mo25964t()).compareTo(Boolean.valueOf(mVCarDetailsResponse.mo25964t()))) != 0 || ((mo25964t() && (compareTo = this.transmission.compareTo(mVCarDetailsResponse.transmission)) != 0) || (compareTo = Boolean.valueOf(mo25963s()).compareTo(Boolean.valueOf(mVCarDetailsResponse.mo25963s()))) != 0 || ((mo25963s() && (compareTo = C25082a.m62839c(this.seatCount, mVCarDetailsResponse.seatCount)) != 0) || (compareTo = Boolean.valueOf(mo25951g()).compareTo(Boolean.valueOf(mVCarDetailsResponse.mo25951g()))) != 0 || ((mo25951g() && (compareTo = this.externalCarId.compareTo(mVCarDetailsResponse.externalCarId)) != 0) || (compareTo = Boolean.valueOf(mo25950f()).compareTo(Boolean.valueOf(mVCarDetailsResponse.mo25950f()))) != 0 || ((mo25950f() && (compareTo = this.address.compareTo(mVCarDetailsResponse.address)) != 0) || (compareTo = Boolean.valueOf(mo25961q()).compareTo(Boolean.valueOf(mVCarDetailsResponse.mo25961q()))) != 0 || ((mo25961q() && (compareTo = this.pricingUse.compareTo(mVCarDetailsResponse.pricingUse)) != 0) || (compareTo = Boolean.valueOf(mo25959o()).compareTo(Boolean.valueOf(mVCarDetailsResponse.mo25959o()))) != 0 || ((mo25959o() && (compareTo = this.pricingParking.compareTo(mVCarDetailsResponse.pricingParking)) != 0) || (compareTo = Boolean.valueOf(mo25952h()).compareTo(Boolean.valueOf(mVCarDetailsResponse.mo25952h()))) != 0 || ((mo25952h() && (compareTo = C25082a.m62837a(this.fuelLevel, mVCarDetailsResponse.fuelLevel)) != 0) || (compareTo = Boolean.valueOf(mo25955j()).compareTo(Boolean.valueOf(mVCarDetailsResponse.mo25955j()))) != 0 || ((mo25955j() && (compareTo = C25082a.m62837a(this.interiorRating, mVCarDetailsResponse.interiorRating)) != 0) || (compareTo = Boolean.valueOf(mo25962r()).compareTo(Boolean.valueOf(mVCarDetailsResponse.mo25962r()))) != 0 || ((mo25962r() && (compareTo = C25082a.m62838b(this.pricingUseRate, mVCarDetailsResponse.pricingUseRate)) != 0) || (compareTo = Boolean.valueOf(mo25960p()).compareTo(Boolean.valueOf(mVCarDetailsResponse.mo25960p()))) != 0)))))))))))))) {
            return compareTo;
        }
        if (!mo25960p() || (b = C25082a.m62838b(this.pricingParkingRate, mVCarDetailsResponse.pricingParkingRate)) == 0) {
            return 0;
        }
        return b;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCarDetailsResponse)) {
            return false;
        }
        MVCarDetailsResponse mVCarDetailsResponse = (MVCarDetailsResponse) obj;
        boolean m = mo25958m();
        boolean m2 = mVCarDetailsResponse.mo25958m();
        if ((m || m2) && (!m || !m2 || !this.operator.equals(mVCarDetailsResponse.operator))) {
            return false;
        }
        boolean l = mo25957l();
        boolean l2 = mVCarDetailsResponse.mo25957l();
        if ((l || l2) && (!l || !l2 || !this.model.equals(mVCarDetailsResponse.model))) {
            return false;
        }
        boolean k = mo25956k();
        boolean k2 = mVCarDetailsResponse.mo25956k();
        if ((k || k2) && (!k || !k2 || !this.licencePlate.equals(mVCarDetailsResponse.licencePlate))) {
            return false;
        }
        boolean i = mo25954i();
        boolean i2 = mVCarDetailsResponse.mo25954i();
        if ((i || i2) && (!i || !i2 || !this.fuelType.equals(mVCarDetailsResponse.fuelType))) {
            return false;
        }
        boolean t = mo25964t();
        boolean t2 = mVCarDetailsResponse.mo25964t();
        if (((t || t2) && (!t || !t2 || !this.transmission.equals(mVCarDetailsResponse.transmission))) || this.seatCount != mVCarDetailsResponse.seatCount) {
            return false;
        }
        boolean g = mo25951g();
        boolean g2 = mVCarDetailsResponse.mo25951g();
        if ((g || g2) && (!g || !g2 || !this.externalCarId.equals(mVCarDetailsResponse.externalCarId))) {
            return false;
        }
        boolean f = mo25950f();
        boolean f2 = mVCarDetailsResponse.mo25950f();
        if ((f || f2) && (!f || !f2 || !this.address.equals(mVCarDetailsResponse.address))) {
            return false;
        }
        boolean q = mo25961q();
        boolean q2 = mVCarDetailsResponse.mo25961q();
        if ((q || q2) && (!q || !q2 || !this.pricingUse.equals(mVCarDetailsResponse.pricingUse))) {
            return false;
        }
        boolean o = mo25959o();
        boolean o2 = mVCarDetailsResponse.mo25959o();
        if (((o || o2) && (!o || !o2 || !this.pricingParking.equals(mVCarDetailsResponse.pricingParking))) || this.fuelLevel != mVCarDetailsResponse.fuelLevel) {
            return false;
        }
        boolean j = mo25955j();
        boolean j2 = mVCarDetailsResponse.mo25955j();
        if (((!j && !j2) || (j && j2 && this.interiorRating == mVCarDetailsResponse.interiorRating)) && this.pricingUseRate == mVCarDetailsResponse.pricingUseRate && this.pricingParkingRate == mVCarDetailsResponse.pricingParkingRate) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25950f() {
        return this.address != null;
    }

    /* renamed from: g */
    public final boolean mo25951g() {
        return this.externalCarId != null;
    }

    /* renamed from: h */
    public final boolean mo25952h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25954i() {
        return this.fuelType != null;
    }

    /* renamed from: j */
    public final boolean mo25955j() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: k */
    public final boolean mo25956k() {
        return this.licencePlate != null;
    }

    /* renamed from: l */
    public final boolean mo25957l() {
        return this.model != null;
    }

    /* renamed from: m */
    public final boolean mo25958m() {
        return this.operator != null;
    }

    /* renamed from: o */
    public final boolean mo25959o() {
        return this.pricingParking != null;
    }

    /* renamed from: p */
    public final boolean mo25960p() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: q */
    public final boolean mo25961q() {
        return this.pricingUse != null;
    }

    /* renamed from: r */
    public final boolean mo25962r() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: s */
    public final boolean mo25963s() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: t */
    public final boolean mo25964t() {
        return this.transmission != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCarDetailsResponse(", "operator:");
        String str = this.operator;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("model:");
        String str2 = this.model;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("licencePlate:");
        String str3 = this.licencePlate;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("fuelType:");
        String str4 = this.fuelType;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(", ");
        n.append("transmission:");
        String str5 = this.transmission;
        if (str5 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str5);
        }
        n.append(", ");
        n.append("seatCount:");
        C0016g.m42z(n, this.seatCount, ", ", "externalCarId:");
        String str6 = this.externalCarId;
        if (str6 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str6);
        }
        if (mo25950f()) {
            n.append(", ");
            n.append("address:");
            String str7 = this.address;
            if (str7 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str7);
            }
        }
        n.append(", ");
        n.append("pricingUse:");
        String str8 = this.pricingUse;
        if (str8 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str8);
        }
        n.append(", ");
        n.append("pricingParking:");
        String str9 = this.pricingParking;
        if (str9 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str9);
        }
        n.append(", ");
        n.append("fuelLevel:");
        n.append(this.fuelLevel);
        if (mo25955j()) {
            n.append(", ");
            n.append("interiorRating:");
            n.append(this.interiorRating);
        }
        n.append(", ");
        n.append("pricingUseRate:");
        C16759e.m42355k(n, this.pricingUseRate, ", ", "pricingParkingRate:");
        n.append(this.pricingParkingRate);
        n.append(")");
        return n.toString();
    }

    /* renamed from: u */
    public final void mo25966u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: v */
    public final void mo25967v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: w */
    public final void mo25968w() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: y */
    public final void mo25969y() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }
}
