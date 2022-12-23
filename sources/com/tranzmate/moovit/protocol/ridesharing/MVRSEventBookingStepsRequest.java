package com.tranzmate.moovit.protocol.ridesharing;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVDirection;
import com.tranzmate.moovit.protocol.common.MVLatLon;
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

public class MVRSEventBookingStepsRequest implements TBase<MVRSEventBookingStepsRequest, _Fields>, Serializable, Cloneable, Comparable<MVRSEventBookingStepsRequest> {

    /* renamed from: b */
    public static final C25113c f28051b = new C25113c("superEventId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28052c = new C25113c("userLocation", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f28053d = new C25113c("direction", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f28054e = new C25113c("toEventTransition", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f28055f = new C25113c("bucketId", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f28056g = new C25113c("numberOfTickets", (byte) 8, 6);

    /* renamed from: h */
    public static final HashMap f28057h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f28058i;
    private byte __isset_bitfield = 0;
    public int bucketId;
    public MVDirection direction;
    public int numberOfTickets;
    private _Fields[] optionals = {_Fields.TO_EVENT_TRANSITION, _Fields.BUCKET_ID};
    public int superEventId;
    public MVRSEventTransitOption toEventTransition;
    public MVLatLon userLocation;

    public enum _Fields implements C25085c {
        SUPER_EVENT_ID(1, "superEventId"),
        USER_LOCATION(2, "userLocation"),
        DIRECTION(3, "direction"),
        TO_EVENT_TRANSITION(4, "toEventTransition"),
        BUCKET_ID(5, "bucketId"),
        NUMBER_OF_TICKETS(6, "numberOfTickets");
        
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
                    return SUPER_EVENT_ID;
                case 2:
                    return USER_LOCATION;
                case 3:
                    return DIRECTION;
                case 4:
                    return TO_EVENT_TRANSITION;
                case 5:
                    return BUCKET_ID;
                case 6:
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingStepsRequest$a */
    public static class C10342a extends C25239c<MVRSEventBookingStepsRequest> {
        public C10342a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBookingStepsRequest mVRSEventBookingStepsRequest = (MVRSEventBookingStepsRequest) tBase;
            MVLatLon mVLatLon = mVRSEventBookingStepsRequest.userLocation;
            MVRSEventTransitOption mVRSEventTransitOption = mVRSEventBookingStepsRequest.toEventTransition;
            if (mVRSEventTransitOption != null) {
                mVRSEventTransitOption.mo31335t();
            }
            C25113c cVar = MVRSEventBookingStepsRequest.f28051b;
            gVar.mo61687K();
            gVar.mo61711x(MVRSEventBookingStepsRequest.f28051b);
            gVar.mo61678B(mVRSEventBookingStepsRequest.superEventId);
            gVar.mo61712y();
            if (mVRSEventBookingStepsRequest.userLocation != null) {
                gVar.mo61711x(MVRSEventBookingStepsRequest.f28052c);
                mVRSEventBookingStepsRequest.userLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRSEventBookingStepsRequest.direction != null) {
                gVar.mo61711x(MVRSEventBookingStepsRequest.f28053d);
                gVar.mo61678B(mVRSEventBookingStepsRequest.direction.getValue());
                gVar.mo61712y();
            }
            if (mVRSEventBookingStepsRequest.toEventTransition != null && mVRSEventBookingStepsRequest.mo31256j()) {
                gVar.mo61711x(MVRSEventBookingStepsRequest.f28054e);
                mVRSEventBookingStepsRequest.toEventTransition.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRSEventBookingStepsRequest.mo31251f()) {
                gVar.mo61711x(MVRSEventBookingStepsRequest.f28055f);
                gVar.mo61678B(mVRSEventBookingStepsRequest.bucketId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVRSEventBookingStepsRequest.f28056g);
            C16530d.m42020n(gVar, mVRSEventBookingStepsRequest.numberOfTickets);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBookingStepsRequest mVRSEventBookingStepsRequest = (MVRSEventBookingStepsRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVRSEventBookingStepsRequest.userLocation;
                    MVRSEventTransitOption mVRSEventTransitOption = mVRSEventBookingStepsRequest.toEventTransition;
                    if (mVRSEventTransitOption != null) {
                        mVRSEventTransitOption.mo31335t();
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
                            mVRSEventBookingStepsRequest.superEventId = gVar.mo61696i();
                            mVRSEventBookingStepsRequest.mo31260o();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLatLon mVLatLon2 = new MVLatLon();
                            mVRSEventBookingStepsRequest.userLocation = mVLatLon2;
                            mVLatLon2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEventBookingStepsRequest.direction = MVDirection.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 4:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVRSEventTransitOption mVRSEventTransitOption2 = new MVRSEventTransitOption();
                            mVRSEventBookingStepsRequest.toEventTransition = mVRSEventTransitOption2;
                            mVRSEventTransitOption2.mo25201C1(gVar);
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEventBookingStepsRequest.bucketId = gVar.mo61696i();
                            mVRSEventBookingStepsRequest.mo31258l();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEventBookingStepsRequest.numberOfTickets = gVar.mo61696i();
                            mVRSEventBookingStepsRequest.mo31259m();
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingStepsRequest$b */
    public static class C10343b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10342a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingStepsRequest$c */
    public static class C10344c extends C25240d<MVRSEventBookingStepsRequest> {
        public C10344c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBookingStepsRequest mVRSEventBookingStepsRequest = (MVRSEventBookingStepsRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRSEventBookingStepsRequest.mo31255i()) {
                bitSet.set(0);
            }
            if (mVRSEventBookingStepsRequest.mo31257k()) {
                bitSet.set(1);
            }
            if (mVRSEventBookingStepsRequest.mo31252g()) {
                bitSet.set(2);
            }
            if (mVRSEventBookingStepsRequest.mo31256j()) {
                bitSet.set(3);
            }
            if (mVRSEventBookingStepsRequest.mo31251f()) {
                bitSet.set(4);
            }
            if (mVRSEventBookingStepsRequest.mo31253h()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVRSEventBookingStepsRequest.mo31255i()) {
                jVar.mo61678B(mVRSEventBookingStepsRequest.superEventId);
            }
            if (mVRSEventBookingStepsRequest.mo31257k()) {
                mVRSEventBookingStepsRequest.userLocation.mo25202X0(jVar);
            }
            if (mVRSEventBookingStepsRequest.mo31252g()) {
                jVar.mo61678B(mVRSEventBookingStepsRequest.direction.getValue());
            }
            if (mVRSEventBookingStepsRequest.mo31256j()) {
                mVRSEventBookingStepsRequest.toEventTransition.mo25202X0(jVar);
            }
            if (mVRSEventBookingStepsRequest.mo31251f()) {
                jVar.mo61678B(mVRSEventBookingStepsRequest.bucketId);
            }
            if (mVRSEventBookingStepsRequest.mo31253h()) {
                jVar.mo61678B(mVRSEventBookingStepsRequest.numberOfTickets);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEventBookingStepsRequest mVRSEventBookingStepsRequest = (MVRSEventBookingStepsRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVRSEventBookingStepsRequest.superEventId = jVar.mo61696i();
                mVRSEventBookingStepsRequest.mo31260o();
            }
            if (T.get(1)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVRSEventBookingStepsRequest.userLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVRSEventBookingStepsRequest.direction = MVDirection.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                MVRSEventTransitOption mVRSEventTransitOption = new MVRSEventTransitOption();
                mVRSEventBookingStepsRequest.toEventTransition = mVRSEventTransitOption;
                mVRSEventTransitOption.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVRSEventBookingStepsRequest.bucketId = jVar.mo61696i();
                mVRSEventBookingStepsRequest.mo31258l();
            }
            if (T.get(5)) {
                mVRSEventBookingStepsRequest.numberOfTickets = jVar.mo61696i();
                mVRSEventBookingStepsRequest.mo31259m();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventBookingStepsRequest$d */
    public static class C10345d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10344c(0);
        }
    }

    static {
        new C17394d0("MVRSEventBookingStepsRequest");
        HashMap hashMap = new HashMap();
        f28057h = hashMap;
        hashMap.put(C25239c.class, new C10343b());
        hashMap.put(C25240d.class, new C10345d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SUPER_EVENT_ID, new FieldMetaData("superEventId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.USER_LOCATION, new FieldMetaData("userLocation", (byte) 3, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.DIRECTION, new FieldMetaData("direction", (byte) 3, new EnumMetaData(MVDirection.class)));
        enumMap.put(_Fields.TO_EVENT_TRANSITION, new FieldMetaData("toEventTransition", (byte) 2, new StructMetaData(MVRSEventTransitOption.class)));
        enumMap.put(_Fields.BUCKET_ID, new FieldMetaData("bucketId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NUMBER_OF_TICKETS, new FieldMetaData("numberOfTickets", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28058i = unmodifiableMap;
        FieldMetaData.m61947a(MVRSEventBookingStepsRequest.class, unmodifiableMap);
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
        ((C25238b) f28057h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28057h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVRSEventBookingStepsRequest mVRSEventBookingStepsRequest = (MVRSEventBookingStepsRequest) obj;
        if (!getClass().equals(mVRSEventBookingStepsRequest.getClass())) {
            return getClass().getName().compareTo(mVRSEventBookingStepsRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31255i()).compareTo(Boolean.valueOf(mVRSEventBookingStepsRequest.mo31255i()));
        if (compareTo != 0 || ((mo31255i() && (compareTo = C25082a.m62839c(this.superEventId, mVRSEventBookingStepsRequest.superEventId)) != 0) || (compareTo = Boolean.valueOf(mo31257k()).compareTo(Boolean.valueOf(mVRSEventBookingStepsRequest.mo31257k()))) != 0 || ((mo31257k() && (compareTo = this.userLocation.compareTo(mVRSEventBookingStepsRequest.userLocation)) != 0) || (compareTo = Boolean.valueOf(mo31252g()).compareTo(Boolean.valueOf(mVRSEventBookingStepsRequest.mo31252g()))) != 0 || ((mo31252g() && (compareTo = this.direction.compareTo(mVRSEventBookingStepsRequest.direction)) != 0) || (compareTo = Boolean.valueOf(mo31256j()).compareTo(Boolean.valueOf(mVRSEventBookingStepsRequest.mo31256j()))) != 0 || ((mo31256j() && (compareTo = this.toEventTransition.compareTo(mVRSEventBookingStepsRequest.toEventTransition)) != 0) || (compareTo = Boolean.valueOf(mo31251f()).compareTo(Boolean.valueOf(mVRSEventBookingStepsRequest.mo31251f()))) != 0 || ((mo31251f() && (compareTo = C25082a.m62839c(this.bucketId, mVRSEventBookingStepsRequest.bucketId)) != 0) || (compareTo = Boolean.valueOf(mo31253h()).compareTo(Boolean.valueOf(mVRSEventBookingStepsRequest.mo31253h()))) != 0)))))) {
            return compareTo;
        }
        if (!mo31253h() || (c = C25082a.m62839c(this.numberOfTickets, mVRSEventBookingStepsRequest.numberOfTickets)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVRSEventBookingStepsRequest)) {
            return false;
        }
        MVRSEventBookingStepsRequest mVRSEventBookingStepsRequest = (MVRSEventBookingStepsRequest) obj;
        if (this.superEventId != mVRSEventBookingStepsRequest.superEventId) {
            return false;
        }
        boolean k = mo31257k();
        boolean k2 = mVRSEventBookingStepsRequest.mo31257k();
        if ((k || k2) && (!k || !k2 || !this.userLocation.mo26290a(mVRSEventBookingStepsRequest.userLocation))) {
            return false;
        }
        boolean g = mo31252g();
        boolean g2 = mVRSEventBookingStepsRequest.mo31252g();
        if ((g || g2) && (!g || !g2 || !this.direction.equals(mVRSEventBookingStepsRequest.direction))) {
            return false;
        }
        boolean j = mo31256j();
        boolean j2 = mVRSEventBookingStepsRequest.mo31256j();
        if ((j || j2) && (!j || !j2 || !this.toEventTransition.mo31318a(mVRSEventBookingStepsRequest.toEventTransition))) {
            return false;
        }
        boolean f = mo31251f();
        boolean f2 = mVRSEventBookingStepsRequest.mo31251f();
        if (((f || f2) && (!f || !f2 || this.bucketId != mVRSEventBookingStepsRequest.bucketId)) || this.numberOfTickets != mVRSEventBookingStepsRequest.numberOfTickets) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31251f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo31252g() {
        return this.direction != null;
    }

    /* renamed from: h */
    public final boolean mo31253h() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31255i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo31256j() {
        return this.toEventTransition != null;
    }

    /* renamed from: k */
    public final boolean mo31257k() {
        return this.userLocation != null;
    }

    /* renamed from: l */
    public final void mo31258l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo31259m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: o */
    public final void mo31260o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRSEventBookingStepsRequest(", "superEventId:");
        C0016g.m42z(n, this.superEventId, ", ", "userLocation:");
        MVLatLon mVLatLon = this.userLocation;
        if (mVLatLon == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLatLon);
        }
        n.append(", ");
        n.append("direction:");
        MVDirection mVDirection = this.direction;
        if (mVDirection == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVDirection);
        }
        if (mo31256j()) {
            n.append(", ");
            n.append("toEventTransition:");
            MVRSEventTransitOption mVRSEventTransitOption = this.toEventTransition;
            if (mVRSEventTransitOption == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVRSEventTransitOption);
            }
        }
        if (mo31251f()) {
            n.append(", ");
            n.append("bucketId:");
            n.append(this.bucketId);
        }
        n.append(", ");
        n.append("numberOfTickets:");
        return C13437d.m33707l(n, this.numberOfTickets, ")");
    }
}
