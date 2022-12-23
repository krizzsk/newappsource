package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
import com.tranzmate.moovit.protocol.ridesharing.MVRSEvent;
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

public class MVRideRequestMetaData implements TBase<MVRideRequestMetaData, _Fields>, Serializable, Cloneable, Comparable<MVRideRequestMetaData> {

    /* renamed from: b */
    public static final C25113c f24873b = new C25113c("pickUpLocation", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24874c = new C25113c("dropOffLocation", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f24875d = new C25113c("pickUpFromTime", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f24876e = new C25113c("pickUpUntilTime", (byte) 10, 4);

    /* renamed from: f */
    public static final C25113c f24877f = new C25113c("totalAllowedWalkingTimeMinutes", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f24878g = new C25113c("maxPriceAllowed", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f24879h = new C25113c(ServerParameters.STATUS, (byte) 8, 7);

    /* renamed from: i */
    public static final C25113c f24880i = new C25113c("event", (byte) 12, 8);

    /* renamed from: j */
    public static final C25113c f24881j = new C25113c("numberOfTickets", (byte) 8, 9);

    /* renamed from: k */
    public static final HashMap f24882k;

    /* renamed from: l */
    public static final Map<_Fields, FieldMetaData> f24883l;
    private byte __isset_bitfield = 0;
    public MVLocationDescriptor dropOffLocation;
    public MVRSEvent event;
    public MVCarPoolPrice maxPriceAllowed;
    public int numberOfTickets;
    private _Fields[] optionals = {_Fields.EVENT, _Fields.NUMBER_OF_TICKETS};
    public long pickUpFromTime;
    public MVLocationDescriptor pickUpLocation;
    public long pickUpUntilTime;
    public MVRideRequestStatus status;
    public int totalAllowedWalkingTimeMinutes;

    public enum _Fields implements C25085c {
        PICK_UP_LOCATION(1, "pickUpLocation"),
        DROP_OFF_LOCATION(2, "dropOffLocation"),
        PICK_UP_FROM_TIME(3, "pickUpFromTime"),
        PICK_UP_UNTIL_TIME(4, "pickUpUntilTime"),
        TOTAL_ALLOWED_WALKING_TIME_MINUTES(5, "totalAllowedWalkingTimeMinutes"),
        MAX_PRICE_ALLOWED(6, "maxPriceAllowed"),
        STATUS(7, ServerParameters.STATUS),
        EVENT(8, "event"),
        NUMBER_OF_TICKETS(9, "numberOfTickets");
        
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
                    return PICK_UP_LOCATION;
                case 2:
                    return DROP_OFF_LOCATION;
                case 3:
                    return PICK_UP_FROM_TIME;
                case 4:
                    return PICK_UP_UNTIL_TIME;
                case 5:
                    return TOTAL_ALLOWED_WALKING_TIME_MINUTES;
                case 6:
                    return MAX_PRICE_ALLOWED;
                case 7:
                    return STATUS;
                case 8:
                    return EVENT;
                case 9:
                    return NUMBER_OF_TICKETS;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRideRequestMetaData$a */
    public static class C8315a extends C25239c<MVRideRequestMetaData> {
        public C8315a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRideRequestMetaData mVRideRequestMetaData = (MVRideRequestMetaData) tBase;
            mVRideRequestMetaData.mo25913t();
            C25113c cVar = MVRideRequestMetaData.f24873b;
            gVar.mo61687K();
            if (mVRideRequestMetaData.pickUpLocation != null) {
                gVar.mo61711x(MVRideRequestMetaData.f24873b);
                mVRideRequestMetaData.pickUpLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRideRequestMetaData.dropOffLocation != null) {
                gVar.mo61711x(MVRideRequestMetaData.f24874c);
                mVRideRequestMetaData.dropOffLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVRideRequestMetaData.f24875d);
            gVar.mo61679C(mVRideRequestMetaData.pickUpFromTime);
            gVar.mo61712y();
            gVar.mo61711x(MVRideRequestMetaData.f24876e);
            gVar.mo61679C(mVRideRequestMetaData.pickUpUntilTime);
            gVar.mo61712y();
            gVar.mo61711x(MVRideRequestMetaData.f24877f);
            gVar.mo61678B(mVRideRequestMetaData.totalAllowedWalkingTimeMinutes);
            gVar.mo61712y();
            if (mVRideRequestMetaData.maxPriceAllowed != null) {
                gVar.mo61711x(MVRideRequestMetaData.f24878g);
                mVRideRequestMetaData.maxPriceAllowed.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRideRequestMetaData.status != null) {
                gVar.mo61711x(MVRideRequestMetaData.f24879h);
                gVar.mo61678B(mVRideRequestMetaData.status.getValue());
                gVar.mo61712y();
            }
            if (mVRideRequestMetaData.event != null && mVRideRequestMetaData.mo25900g()) {
                gVar.mo61711x(MVRideRequestMetaData.f24880i);
                mVRideRequestMetaData.event.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRideRequestMetaData.mo25903i()) {
                gVar.mo61711x(MVRideRequestMetaData.f24881j);
                gVar.mo61678B(mVRideRequestMetaData.numberOfTickets);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRideRequestMetaData mVRideRequestMetaData = (MVRideRequestMetaData) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVRideRequestMetaData.mo25913t();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                            mVRideRequestMetaData.pickUpLocation = mVLocationDescriptor;
                            mVLocationDescriptor.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                            mVRideRequestMetaData.dropOffLocation = mVLocationDescriptor2;
                            mVLocationDescriptor2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRideRequestMetaData.pickUpFromTime = gVar.mo61697j();
                            mVRideRequestMetaData.mo25910q();
                            break;
                        }
                    case 4:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRideRequestMetaData.pickUpUntilTime = gVar.mo61697j();
                            mVRideRequestMetaData.mo25911r();
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRideRequestMetaData.totalAllowedWalkingTimeMinutes = gVar.mo61696i();
                            mVRideRequestMetaData.mo25912s();
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVCarPoolPrice mVCarPoolPrice = new MVCarPoolPrice();
                            mVRideRequestMetaData.maxPriceAllowed = mVCarPoolPrice;
                            mVCarPoolPrice.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRideRequestMetaData.status = MVRideRequestStatus.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 8:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVRSEvent mVRSEvent = new MVRSEvent();
                            mVRideRequestMetaData.event = mVRSEvent;
                            mVRSEvent.mo25201C1(gVar);
                            break;
                        }
                    case 9:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRideRequestMetaData.numberOfTickets = gVar.mo61696i();
                            mVRideRequestMetaData.mo25909p();
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRideRequestMetaData$b */
    public static class C8316b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8315a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRideRequestMetaData$c */
    public static class C8317c extends C25240d<MVRideRequestMetaData> {
        public C8317c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRideRequestMetaData mVRideRequestMetaData = (MVRideRequestMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRideRequestMetaData.mo25905k()) {
                bitSet.set(0);
            }
            if (mVRideRequestMetaData.mo25899f()) {
                bitSet.set(1);
            }
            if (mVRideRequestMetaData.mo25904j()) {
                bitSet.set(2);
            }
            if (mVRideRequestMetaData.mo25906l()) {
                bitSet.set(3);
            }
            if (mVRideRequestMetaData.mo25908o()) {
                bitSet.set(4);
            }
            if (mVRideRequestMetaData.mo25901h()) {
                bitSet.set(5);
            }
            if (mVRideRequestMetaData.mo25907m()) {
                bitSet.set(6);
            }
            if (mVRideRequestMetaData.mo25900g()) {
                bitSet.set(7);
            }
            if (mVRideRequestMetaData.mo25903i()) {
                bitSet.set(8);
            }
            jVar.mo61738U(bitSet, 9);
            if (mVRideRequestMetaData.mo25905k()) {
                mVRideRequestMetaData.pickUpLocation.mo25202X0(jVar);
            }
            if (mVRideRequestMetaData.mo25899f()) {
                mVRideRequestMetaData.dropOffLocation.mo25202X0(jVar);
            }
            if (mVRideRequestMetaData.mo25904j()) {
                jVar.mo61679C(mVRideRequestMetaData.pickUpFromTime);
            }
            if (mVRideRequestMetaData.mo25906l()) {
                jVar.mo61679C(mVRideRequestMetaData.pickUpUntilTime);
            }
            if (mVRideRequestMetaData.mo25908o()) {
                jVar.mo61678B(mVRideRequestMetaData.totalAllowedWalkingTimeMinutes);
            }
            if (mVRideRequestMetaData.mo25901h()) {
                mVRideRequestMetaData.maxPriceAllowed.mo25202X0(jVar);
            }
            if (mVRideRequestMetaData.mo25907m()) {
                jVar.mo61678B(mVRideRequestMetaData.status.getValue());
            }
            if (mVRideRequestMetaData.mo25900g()) {
                mVRideRequestMetaData.event.mo25202X0(jVar);
            }
            if (mVRideRequestMetaData.mo25903i()) {
                jVar.mo61678B(mVRideRequestMetaData.numberOfTickets);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRideRequestMetaData mVRideRequestMetaData = (MVRideRequestMetaData) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(9);
            if (T.get(0)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVRideRequestMetaData.pickUpLocation = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVLocationDescriptor mVLocationDescriptor2 = new MVLocationDescriptor();
                mVRideRequestMetaData.dropOffLocation = mVLocationDescriptor2;
                mVLocationDescriptor2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVRideRequestMetaData.pickUpFromTime = jVar.mo61697j();
                mVRideRequestMetaData.mo25910q();
            }
            if (T.get(3)) {
                mVRideRequestMetaData.pickUpUntilTime = jVar.mo61697j();
                mVRideRequestMetaData.mo25911r();
            }
            if (T.get(4)) {
                mVRideRequestMetaData.totalAllowedWalkingTimeMinutes = jVar.mo61696i();
                mVRideRequestMetaData.mo25912s();
            }
            if (T.get(5)) {
                MVCarPoolPrice mVCarPoolPrice = new MVCarPoolPrice();
                mVRideRequestMetaData.maxPriceAllowed = mVCarPoolPrice;
                mVCarPoolPrice.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVRideRequestMetaData.status = MVRideRequestStatus.findByValue(jVar.mo61696i());
            }
            if (T.get(7)) {
                MVRSEvent mVRSEvent = new MVRSEvent();
                mVRideRequestMetaData.event = mVRSEvent;
                mVRSEvent.mo25201C1(jVar);
            }
            if (T.get(8)) {
                mVRideRequestMetaData.numberOfTickets = jVar.mo61696i();
                mVRideRequestMetaData.mo25909p();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRideRequestMetaData$d */
    public static class C8318d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8317c(0);
        }
    }

    static {
        new C17394d0("MVRideRequestMetaData");
        HashMap hashMap = new HashMap();
        f24882k = hashMap;
        hashMap.put(C25239c.class, new C8316b());
        hashMap.put(C25240d.class, new C8318d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PICK_UP_LOCATION, new FieldMetaData("pickUpLocation", (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.DROP_OFF_LOCATION, new FieldMetaData("dropOffLocation", (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        enumMap.put(_Fields.PICK_UP_FROM_TIME, new FieldMetaData("pickUpFromTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.PICK_UP_UNTIL_TIME, new FieldMetaData("pickUpUntilTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.TOTAL_ALLOWED_WALKING_TIME_MINUTES, new FieldMetaData("totalAllowedWalkingTimeMinutes", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.MAX_PRICE_ALLOWED, new FieldMetaData("maxPriceAllowed", (byte) 3, new StructMetaData(MVCarPoolPrice.class)));
        enumMap.put(_Fields.STATUS, new FieldMetaData(ServerParameters.STATUS, (byte) 3, new EnumMetaData(MVRideRequestStatus.class)));
        enumMap.put(_Fields.EVENT, new FieldMetaData("event", (byte) 2, new StructMetaData(MVRSEvent.class)));
        enumMap.put(_Fields.NUMBER_OF_TICKETS, new FieldMetaData("numberOfTickets", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24883l = unmodifiableMap;
        FieldMetaData.m61947a(MVRideRequestMetaData.class, unmodifiableMap);
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
        ((C25238b) f24882k.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24882k.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo25896a(MVRideRequestMetaData mVRideRequestMetaData) {
        if (mVRideRequestMetaData == null) {
            return false;
        }
        boolean k = mo25905k();
        boolean k2 = mVRideRequestMetaData.mo25905k();
        if ((k || k2) && (!k || !k2 || !this.pickUpLocation.mo26317a(mVRideRequestMetaData.pickUpLocation))) {
            return false;
        }
        boolean f = mo25899f();
        boolean f2 = mVRideRequestMetaData.mo25899f();
        if (((f || f2) && (!f || !f2 || !this.dropOffLocation.mo26317a(mVRideRequestMetaData.dropOffLocation))) || this.pickUpFromTime != mVRideRequestMetaData.pickUpFromTime || this.pickUpUntilTime != mVRideRequestMetaData.pickUpUntilTime || this.totalAllowedWalkingTimeMinutes != mVRideRequestMetaData.totalAllowedWalkingTimeMinutes) {
            return false;
        }
        boolean h = mo25901h();
        boolean h2 = mVRideRequestMetaData.mo25901h();
        if ((h || h2) && (!h || !h2 || !this.maxPriceAllowed.mo25461a(mVRideRequestMetaData.maxPriceAllowed))) {
            return false;
        }
        boolean m = mo25907m();
        boolean m2 = mVRideRequestMetaData.mo25907m();
        if ((m || m2) && (!m || !m2 || !this.status.equals(mVRideRequestMetaData.status))) {
            return false;
        }
        boolean g = mo25900g();
        boolean g2 = mVRideRequestMetaData.mo25900g();
        if ((g || g2) && (!g || !g2 || !this.event.mo31216a(mVRideRequestMetaData.event))) {
            return false;
        }
        boolean i = mo25903i();
        boolean i2 = mVRideRequestMetaData.mo25903i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || this.numberOfTickets != mVRideRequestMetaData.numberOfTickets) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int c;
        MVRideRequestMetaData mVRideRequestMetaData = (MVRideRequestMetaData) obj;
        if (!getClass().equals(mVRideRequestMetaData.getClass())) {
            return getClass().getName().compareTo(mVRideRequestMetaData.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25905k()).compareTo(Boolean.valueOf(mVRideRequestMetaData.mo25905k()));
        if (compareTo != 0 || ((mo25905k() && (compareTo = this.pickUpLocation.compareTo(mVRideRequestMetaData.pickUpLocation)) != 0) || (compareTo = Boolean.valueOf(mo25899f()).compareTo(Boolean.valueOf(mVRideRequestMetaData.mo25899f()))) != 0 || ((mo25899f() && (compareTo = this.dropOffLocation.compareTo(mVRideRequestMetaData.dropOffLocation)) != 0) || (compareTo = Boolean.valueOf(mo25904j()).compareTo(Boolean.valueOf(mVRideRequestMetaData.mo25904j()))) != 0 || ((mo25904j() && (compareTo = C25082a.m62840d(this.pickUpFromTime, mVRideRequestMetaData.pickUpFromTime)) != 0) || (compareTo = Boolean.valueOf(mo25906l()).compareTo(Boolean.valueOf(mVRideRequestMetaData.mo25906l()))) != 0 || ((mo25906l() && (compareTo = C25082a.m62840d(this.pickUpUntilTime, mVRideRequestMetaData.pickUpUntilTime)) != 0) || (compareTo = Boolean.valueOf(mo25908o()).compareTo(Boolean.valueOf(mVRideRequestMetaData.mo25908o()))) != 0 || ((mo25908o() && (compareTo = C25082a.m62839c(this.totalAllowedWalkingTimeMinutes, mVRideRequestMetaData.totalAllowedWalkingTimeMinutes)) != 0) || (compareTo = Boolean.valueOf(mo25901h()).compareTo(Boolean.valueOf(mVRideRequestMetaData.mo25901h()))) != 0 || ((mo25901h() && (compareTo = this.maxPriceAllowed.compareTo(mVRideRequestMetaData.maxPriceAllowed)) != 0) || (compareTo = Boolean.valueOf(mo25907m()).compareTo(Boolean.valueOf(mVRideRequestMetaData.mo25907m()))) != 0 || ((mo25907m() && (compareTo = this.status.compareTo(mVRideRequestMetaData.status)) != 0) || (compareTo = Boolean.valueOf(mo25900g()).compareTo(Boolean.valueOf(mVRideRequestMetaData.mo25900g()))) != 0 || ((mo25900g() && (compareTo = this.event.compareTo(mVRideRequestMetaData.event)) != 0) || (compareTo = Boolean.valueOf(mo25903i()).compareTo(Boolean.valueOf(mVRideRequestMetaData.mo25903i()))) != 0))))))))) {
            return compareTo;
        }
        if (!mo25903i() || (c = C25082a.m62839c(this.numberOfTickets, mVRideRequestMetaData.numberOfTickets)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVRideRequestMetaData)) {
            return mo25896a((MVRideRequestMetaData) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo25899f() {
        return this.dropOffLocation != null;
    }

    /* renamed from: g */
    public final boolean mo25900g() {
        return this.event != null;
    }

    /* renamed from: h */
    public final boolean mo25901h() {
        return this.maxPriceAllowed != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25903i() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: j */
    public final boolean mo25904j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo25905k() {
        return this.pickUpLocation != null;
    }

    /* renamed from: l */
    public final boolean mo25906l() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: m */
    public final boolean mo25907m() {
        return this.status != null;
    }

    /* renamed from: o */
    public final boolean mo25908o() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: p */
    public final void mo25909p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: q */
    public final void mo25910q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: r */
    public final void mo25911r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: s */
    public final void mo25912s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: t */
    public final void mo25913t() throws TException {
        MVLocationDescriptor mVLocationDescriptor = this.pickUpLocation;
        if (mVLocationDescriptor != null) {
            mVLocationDescriptor.mo26333s();
        }
        MVLocationDescriptor mVLocationDescriptor2 = this.dropOffLocation;
        if (mVLocationDescriptor2 != null) {
            mVLocationDescriptor2.mo26333s();
        }
        MVCarPoolPrice mVCarPoolPrice = this.maxPriceAllowed;
        if (mVCarPoolPrice != null) {
            mVCarPoolPrice.getClass();
        }
        MVRSEvent mVRSEvent = this.event;
        if (mVRSEvent != null) {
            mVRSEvent.mo31231r();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRideRequestMetaData(", "pickUpLocation:");
        MVLocationDescriptor mVLocationDescriptor = this.pickUpLocation;
        if (mVLocationDescriptor == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationDescriptor);
        }
        n.append(", ");
        n.append("dropOffLocation:");
        MVLocationDescriptor mVLocationDescriptor2 = this.dropOffLocation;
        if (mVLocationDescriptor2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationDescriptor2);
        }
        n.append(", ");
        n.append("pickUpFromTime:");
        C25541a.m63889t(n, this.pickUpFromTime, ", ", "pickUpUntilTime:");
        C25541a.m63889t(n, this.pickUpUntilTime, ", ", "totalAllowedWalkingTimeMinutes:");
        C0016g.m42z(n, this.totalAllowedWalkingTimeMinutes, ", ", "maxPriceAllowed:");
        MVCarPoolPrice mVCarPoolPrice = this.maxPriceAllowed;
        if (mVCarPoolPrice == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVCarPoolPrice);
        }
        n.append(", ");
        n.append("status:");
        MVRideRequestStatus mVRideRequestStatus = this.status;
        if (mVRideRequestStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRideRequestStatus);
        }
        if (mo25900g()) {
            n.append(", ");
            n.append("event:");
            MVRSEvent mVRSEvent = this.event;
            if (mVRSEvent == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVRSEvent);
            }
        }
        if (mo25903i()) {
            n.append(", ");
            n.append("numberOfTickets:");
            n.append(this.numberOfTickets);
        }
        n.append(")");
        return n.toString();
    }
}
