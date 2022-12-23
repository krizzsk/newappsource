package com.tranzmate.moovit.protocol.carpool;

import com.appboy.support.StringUtils;
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

public class MVPassengerFutureRide implements TBase<MVPassengerFutureRide, _Fields>, Serializable, Cloneable, Comparable<MVPassengerFutureRide> {

    /* renamed from: b */
    public static final C25113c f24769b = new C25113c("ride", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24770c = new C25113c("driverId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f24771d = new C25113c("invitationState", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f24772e = new C25113c("isCanceled", (byte) 2, 4);

    /* renamed from: f */
    public static final C25113c f24773f = new C25113c("stops", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f24774g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f24775h;
    private byte __isset_bitfield = 0;
    public String driverId;
    public MVInvitationState invitationState;
    public boolean isCanceled;
    public MVRide ride;
    public MVPassengerStops stops;

    public enum _Fields implements C25085c {
        RIDE(1, "ride"),
        DRIVER_ID(2, "driverId"),
        INVITATION_STATE(3, "invitationState"),
        IS_CANCELED(4, "isCanceled"),
        STOPS(5, "stops");
        
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
                return RIDE;
            }
            if (i == 2) {
                return DRIVER_ID;
            }
            if (i == 3) {
                return INVITATION_STATE;
            }
            if (i == 4) {
                return IS_CANCELED;
            }
            if (i != 5) {
                return null;
            }
            return STOPS;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerFutureRide$a */
    public static class C8250a extends C25239c<MVPassengerFutureRide> {
        public C8250a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerFutureRide mVPassengerFutureRide = (MVPassengerFutureRide) tBase;
            MVRide mVRide = mVPassengerFutureRide.ride;
            if (mVRide != null) {
                mVRide.mo25867y();
            }
            MVPassengerStops mVPassengerStops = mVPassengerFutureRide.stops;
            if (mVPassengerStops != null) {
                mVPassengerStops.mo25808j();
            }
            C25113c cVar = MVPassengerFutureRide.f24769b;
            gVar.mo61687K();
            if (mVPassengerFutureRide.ride != null) {
                gVar.mo61711x(MVPassengerFutureRide.f24769b);
                mVPassengerFutureRide.ride.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPassengerFutureRide.driverId != null) {
                gVar.mo61711x(MVPassengerFutureRide.f24770c);
                gVar.mo61686J(mVPassengerFutureRide.driverId);
                gVar.mo61712y();
            }
            if (mVPassengerFutureRide.invitationState != null) {
                gVar.mo61711x(MVPassengerFutureRide.f24771d);
                gVar.mo61678B(mVPassengerFutureRide.invitationState.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPassengerFutureRide.f24772e);
            gVar.mo61708u(mVPassengerFutureRide.isCanceled);
            gVar.mo61712y();
            if (mVPassengerFutureRide.stops != null) {
                gVar.mo61711x(MVPassengerFutureRide.f24773f);
                mVPassengerFutureRide.stops.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerFutureRide mVPassengerFutureRide = (MVPassengerFutureRide) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 12) {
                                    MVPassengerStops mVPassengerStops = new MVPassengerStops();
                                    mVPassengerFutureRide.stops = mVPassengerStops;
                                    mVPassengerStops.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 2) {
                                mVPassengerFutureRide.isCanceled = gVar.mo61690c();
                                mVPassengerFutureRide.mo25721k();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVPassengerFutureRide.invitationState = MVInvitationState.findByValue(gVar.mo61696i());
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVPassengerFutureRide.driverId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVRide mVRide = new MVRide();
                    mVPassengerFutureRide.ride = mVRide;
                    mVRide.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVRide mVRide2 = mVPassengerFutureRide.ride;
            if (mVRide2 != null) {
                mVRide2.mo25867y();
            }
            MVPassengerStops mVPassengerStops2 = mVPassengerFutureRide.stops;
            if (mVPassengerStops2 != null) {
                mVPassengerStops2.mo25808j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerFutureRide$b */
    public static class C8251b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8250a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerFutureRide$c */
    public static class C8252c extends C25240d<MVPassengerFutureRide> {
        public C8252c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPassengerFutureRide mVPassengerFutureRide = (MVPassengerFutureRide) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPassengerFutureRide.mo25719i()) {
                bitSet.set(0);
            }
            if (mVPassengerFutureRide.mo25715f()) {
                bitSet.set(1);
            }
            if (mVPassengerFutureRide.mo25716g()) {
                bitSet.set(2);
            }
            if (mVPassengerFutureRide.mo25717h()) {
                bitSet.set(3);
            }
            if (mVPassengerFutureRide.mo25720j()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVPassengerFutureRide.mo25719i()) {
                mVPassengerFutureRide.ride.mo25202X0(jVar);
            }
            if (mVPassengerFutureRide.mo25715f()) {
                jVar.mo61686J(mVPassengerFutureRide.driverId);
            }
            if (mVPassengerFutureRide.mo25716g()) {
                jVar.mo61678B(mVPassengerFutureRide.invitationState.getValue());
            }
            if (mVPassengerFutureRide.mo25717h()) {
                jVar.mo61708u(mVPassengerFutureRide.isCanceled);
            }
            if (mVPassengerFutureRide.mo25720j()) {
                mVPassengerFutureRide.stops.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPassengerFutureRide mVPassengerFutureRide = (MVPassengerFutureRide) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVRide mVRide = new MVRide();
                mVPassengerFutureRide.ride = mVRide;
                mVRide.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVPassengerFutureRide.driverId = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVPassengerFutureRide.invitationState = MVInvitationState.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                mVPassengerFutureRide.isCanceled = jVar.mo61690c();
                mVPassengerFutureRide.mo25721k();
            }
            if (T.get(4)) {
                MVPassengerStops mVPassengerStops = new MVPassengerStops();
                mVPassengerFutureRide.stops = mVPassengerStops;
                mVPassengerStops.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVPassengerFutureRide$d */
    public static class C8253d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8252c(0);
        }
    }

    static {
        new C17394d0("MVPassengerFutureRide");
        HashMap hashMap = new HashMap();
        f24774g = hashMap;
        hashMap.put(C25239c.class, new C8251b());
        hashMap.put(C25240d.class, new C8253d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE, new FieldMetaData("ride", (byte) 3, new StructMetaData(MVRide.class)));
        enumMap.put(_Fields.DRIVER_ID, new FieldMetaData("driverId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INVITATION_STATE, new FieldMetaData("invitationState", (byte) 3, new EnumMetaData(MVInvitationState.class)));
        enumMap.put(_Fields.IS_CANCELED, new FieldMetaData("isCanceled", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.STOPS, new FieldMetaData("stops", (byte) 3, new StructMetaData(MVPassengerStops.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24775h = unmodifiableMap;
        FieldMetaData.m61947a(MVPassengerFutureRide.class, unmodifiableMap);
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
        ((C25238b) f24774g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24774g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPassengerFutureRide mVPassengerFutureRide = (MVPassengerFutureRide) obj;
        if (!getClass().equals(mVPassengerFutureRide.getClass())) {
            return getClass().getName().compareTo(mVPassengerFutureRide.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25719i()).compareTo(Boolean.valueOf(mVPassengerFutureRide.mo25719i()));
        if (compareTo2 != 0 || ((mo25719i() && (compareTo2 = this.ride.compareTo(mVPassengerFutureRide.ride)) != 0) || (compareTo2 = Boolean.valueOf(mo25715f()).compareTo(Boolean.valueOf(mVPassengerFutureRide.mo25715f()))) != 0 || ((mo25715f() && (compareTo2 = this.driverId.compareTo(mVPassengerFutureRide.driverId)) != 0) || (compareTo2 = Boolean.valueOf(mo25716g()).compareTo(Boolean.valueOf(mVPassengerFutureRide.mo25716g()))) != 0 || ((mo25716g() && (compareTo2 = this.invitationState.compareTo(mVPassengerFutureRide.invitationState)) != 0) || (compareTo2 = Boolean.valueOf(mo25717h()).compareTo(Boolean.valueOf(mVPassengerFutureRide.mo25717h()))) != 0 || ((mo25717h() && (compareTo2 = C25082a.m62848l(this.isCanceled, mVPassengerFutureRide.isCanceled)) != 0) || (compareTo2 = Boolean.valueOf(mo25720j()).compareTo(Boolean.valueOf(mVPassengerFutureRide.mo25720j()))) != 0))))) {
            return compareTo2;
        }
        if (!mo25720j() || (compareTo = this.stops.compareTo(mVPassengerFutureRide.stops)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPassengerFutureRide)) {
            return false;
        }
        MVPassengerFutureRide mVPassengerFutureRide = (MVPassengerFutureRide) obj;
        boolean i = mo25719i();
        boolean i2 = mVPassengerFutureRide.mo25719i();
        if ((i || i2) && (!i || !i2 || !this.ride.mo25845a(mVPassengerFutureRide.ride))) {
            return false;
        }
        boolean f = mo25715f();
        boolean f2 = mVPassengerFutureRide.mo25715f();
        if ((f || f2) && (!f || !f2 || !this.driverId.equals(mVPassengerFutureRide.driverId))) {
            return false;
        }
        boolean g = mo25716g();
        boolean g2 = mVPassengerFutureRide.mo25716g();
        if (((g || g2) && (!g || !g2 || !this.invitationState.equals(mVPassengerFutureRide.invitationState))) || this.isCanceled != mVPassengerFutureRide.isCanceled) {
            return false;
        }
        boolean j = mo25720j();
        boolean j2 = mVPassengerFutureRide.mo25720j();
        if ((j || j2) && (!j || !j2 || !this.stops.mo25800a(mVPassengerFutureRide.stops))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25715f() {
        return this.driverId != null;
    }

    /* renamed from: g */
    public final boolean mo25716g() {
        return this.invitationState != null;
    }

    /* renamed from: h */
    public final boolean mo25717h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo25719i() {
        return this.ride != null;
    }

    /* renamed from: j */
    public final boolean mo25720j() {
        return this.stops != null;
    }

    /* renamed from: k */
    public final void mo25721k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPassengerFutureRide(", "ride:");
        MVRide mVRide = this.ride;
        if (mVRide == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRide);
        }
        n.append(", ");
        n.append("driverId:");
        String str = this.driverId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("invitationState:");
        MVInvitationState mVInvitationState = this.invitationState;
        if (mVInvitationState == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVInvitationState);
        }
        n.append(", ");
        n.append("isCanceled:");
        C13555b.m33977q(n, this.isCanceled, ", ", "stops:");
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
