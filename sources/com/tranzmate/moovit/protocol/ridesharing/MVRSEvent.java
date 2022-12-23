package com.tranzmate.moovit.protocol.ridesharing;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVDirection;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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

public class MVRSEvent implements TBase<MVRSEvent, _Fields>, Serializable, Cloneable, Comparable<MVRSEvent> {

    /* renamed from: b */
    public static final C25113c f28033b = new C25113c("superEvent", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f28034c = new C25113c("eventId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28035d = new C25113c("eventTripTime", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f28036e = new C25113c("vehicleType", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f28037f = new C25113c("direction", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f28038g = new C25113c("image", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f28039h = new C25113c("name", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f28040i = new C25113c("bucketId", (byte) 8, 8);

    /* renamed from: j */
    public static final HashMap f28041j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f28042k;
    private byte __isset_bitfield = 0;
    public int bucketId;
    public MVDirection direction;
    public int eventId;
    public long eventTripTime;
    public MVImageReferenceWithParams image;
    public String name;
    private _Fields[] optionals = {_Fields.IMAGE, _Fields.NAME, _Fields.BUCKET_ID};
    public MVRSSuperEvent superEvent;
    public MVVehicleType vehicleType;

    public enum _Fields implements C25085c {
        SUPER_EVENT(1, "superEvent"),
        EVENT_ID(2, "eventId"),
        EVENT_TRIP_TIME(3, "eventTripTime"),
        VEHICLE_TYPE(4, "vehicleType"),
        DIRECTION(5, "direction"),
        IMAGE(6, "image"),
        NAME(7, "name"),
        BUCKET_ID(8, "bucketId");
        
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
                    return SUPER_EVENT;
                case 2:
                    return EVENT_ID;
                case 3:
                    return EVENT_TRIP_TIME;
                case 4:
                    return VEHICLE_TYPE;
                case 5:
                    return DIRECTION;
                case 6:
                    return IMAGE;
                case 7:
                    return NAME;
                case 8:
                    return BUCKET_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEvent$a */
    public static class C10330a extends C25239c<MVRSEvent> {
        public C10330a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEvent mVRSEvent = (MVRSEvent) tBase;
            mVRSEvent.mo31231r();
            C25113c cVar = MVRSEvent.f28033b;
            gVar.mo61687K();
            if (mVRSEvent.superEvent != null) {
                gVar.mo61711x(MVRSEvent.f28033b);
                mVRSEvent.superEvent.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVRSEvent.f28034c);
            gVar.mo61678B(mVRSEvent.eventId);
            gVar.mo61712y();
            gVar.mo61711x(MVRSEvent.f28035d);
            gVar.mo61679C(mVRSEvent.eventTripTime);
            gVar.mo61712y();
            if (mVRSEvent.vehicleType != null) {
                gVar.mo61711x(MVRSEvent.f28036e);
                gVar.mo61678B(mVRSEvent.vehicleType.getValue());
                gVar.mo61712y();
            }
            if (mVRSEvent.direction != null) {
                gVar.mo61711x(MVRSEvent.f28037f);
                gVar.mo61678B(mVRSEvent.direction.getValue());
                gVar.mo61712y();
            }
            if (mVRSEvent.image != null && mVRSEvent.mo31224j()) {
                gVar.mo61711x(MVRSEvent.f28038g);
                mVRSEvent.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRSEvent.name != null && mVRSEvent.mo31225k()) {
                gVar.mo61711x(MVRSEvent.f28039h);
                gVar.mo61686J(mVRSEvent.name);
                gVar.mo61712y();
            }
            if (mVRSEvent.mo31219f()) {
                gVar.mo61711x(MVRSEvent.f28040i);
                gVar.mo61678B(mVRSEvent.bucketId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEvent mVRSEvent = (MVRSEvent) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVRSEvent.mo31231r();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVRSSuperEvent mVRSSuperEvent = new MVRSSuperEvent();
                            mVRSEvent.superEvent = mVRSSuperEvent;
                            mVRSSuperEvent.mo25201C1(gVar);
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEvent.eventId = gVar.mo61696i();
                            mVRSEvent.mo31229p();
                            break;
                        }
                    case 3:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEvent.eventTripTime = gVar.mo61697j();
                            mVRSEvent.mo31230q();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEvent.vehicleType = MVVehicleType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEvent.direction = MVDirection.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                            mVRSEvent.image = mVImageReferenceWithParams;
                            mVImageReferenceWithParams.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEvent.name = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVRSEvent.bucketId = gVar.mo61696i();
                            mVRSEvent.mo31228o();
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEvent$b */
    public static class C10331b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10330a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEvent$c */
    public static class C10332c extends C25240d<MVRSEvent> {
        public C10332c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEvent mVRSEvent = (MVRSEvent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRSEvent.mo31226l()) {
                bitSet.set(0);
            }
            if (mVRSEvent.mo31221h()) {
                bitSet.set(1);
            }
            if (mVRSEvent.mo31223i()) {
                bitSet.set(2);
            }
            if (mVRSEvent.mo31227m()) {
                bitSet.set(3);
            }
            if (mVRSEvent.mo31220g()) {
                bitSet.set(4);
            }
            if (mVRSEvent.mo31224j()) {
                bitSet.set(5);
            }
            if (mVRSEvent.mo31225k()) {
                bitSet.set(6);
            }
            if (mVRSEvent.mo31219f()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVRSEvent.mo31226l()) {
                mVRSEvent.superEvent.mo25202X0(jVar);
            }
            if (mVRSEvent.mo31221h()) {
                jVar.mo61678B(mVRSEvent.eventId);
            }
            if (mVRSEvent.mo31223i()) {
                jVar.mo61679C(mVRSEvent.eventTripTime);
            }
            if (mVRSEvent.mo31227m()) {
                jVar.mo61678B(mVRSEvent.vehicleType.getValue());
            }
            if (mVRSEvent.mo31220g()) {
                jVar.mo61678B(mVRSEvent.direction.getValue());
            }
            if (mVRSEvent.mo31224j()) {
                mVRSEvent.image.mo25202X0(jVar);
            }
            if (mVRSEvent.mo31225k()) {
                jVar.mo61686J(mVRSEvent.name);
            }
            if (mVRSEvent.mo31219f()) {
                jVar.mo61678B(mVRSEvent.bucketId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEvent mVRSEvent = (MVRSEvent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                MVRSSuperEvent mVRSSuperEvent = new MVRSSuperEvent();
                mVRSEvent.superEvent = mVRSSuperEvent;
                mVRSSuperEvent.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVRSEvent.eventId = jVar.mo61696i();
                mVRSEvent.mo31229p();
            }
            if (T.get(2)) {
                mVRSEvent.eventTripTime = jVar.mo61697j();
                mVRSEvent.mo31230q();
            }
            if (T.get(3)) {
                mVRSEvent.vehicleType = MVVehicleType.findByValue(jVar.mo61696i());
            }
            if (T.get(4)) {
                mVRSEvent.direction = MVDirection.findByValue(jVar.mo61696i());
            }
            if (T.get(5)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVRSEvent.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(6)) {
                mVRSEvent.name = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVRSEvent.bucketId = jVar.mo61696i();
                mVRSEvent.mo31228o();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEvent$d */
    public static class C10333d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10332c(0);
        }
    }

    static {
        new C17394d0("MVRSEvent");
        HashMap hashMap = new HashMap();
        f28041j = hashMap;
        hashMap.put(C25239c.class, new C10331b());
        hashMap.put(C25240d.class, new C10333d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SUPER_EVENT, new FieldMetaData("superEvent", (byte) 3, new StructMetaData(MVRSSuperEvent.class)));
        enumMap.put(_Fields.EVENT_ID, new FieldMetaData("eventId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.EVENT_TRIP_TIME, new FieldMetaData("eventTripTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.VEHICLE_TYPE, new FieldMetaData("vehicleType", (byte) 3, new EnumMetaData(MVVehicleType.class)));
        enumMap.put(_Fields.DIRECTION, new FieldMetaData("direction", (byte) 3, new EnumMetaData(MVDirection.class)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.BUCKET_ID, new FieldMetaData("bucketId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28042k = unmodifiableMap;
        FieldMetaData.m61947a(MVRSEvent.class, unmodifiableMap);
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
        ((C25238b) f28041j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28041j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo31216a(MVRSEvent mVRSEvent) {
        if (mVRSEvent == null) {
            return false;
        }
        boolean l = mo31226l();
        boolean l2 = mVRSEvent.mo31226l();
        if (((l || l2) && (!l || !l2 || !this.superEvent.mo31369a(mVRSEvent.superEvent))) || this.eventId != mVRSEvent.eventId || this.eventTripTime != mVRSEvent.eventTripTime) {
            return false;
        }
        boolean m = mo31227m();
        boolean m2 = mVRSEvent.mo31227m();
        if ((m || m2) && (!m || !m2 || !this.vehicleType.equals(mVRSEvent.vehicleType))) {
            return false;
        }
        boolean g = mo31220g();
        boolean g2 = mVRSEvent.mo31220g();
        if ((g || g2) && (!g || !g2 || !this.direction.equals(mVRSEvent.direction))) {
            return false;
        }
        boolean j = mo31224j();
        boolean j2 = mVRSEvent.mo31224j();
        if ((j || j2) && (!j || !j2 || !this.image.mo26245a(mVRSEvent.image))) {
            return false;
        }
        boolean k = mo31225k();
        boolean k2 = mVRSEvent.mo31225k();
        if ((k || k2) && (!k || !k2 || !this.name.equals(mVRSEvent.name))) {
            return false;
        }
        boolean f = mo31219f();
        boolean f2 = mVRSEvent.mo31219f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || this.bucketId != mVRSEvent.bucketId) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int c;
        MVRSEvent mVRSEvent = (MVRSEvent) obj;
        if (!getClass().equals(mVRSEvent.getClass())) {
            return getClass().getName().compareTo(mVRSEvent.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31226l()).compareTo(Boolean.valueOf(mVRSEvent.mo31226l()));
        if (compareTo != 0 || ((mo31226l() && (compareTo = this.superEvent.compareTo(mVRSEvent.superEvent)) != 0) || (compareTo = Boolean.valueOf(mo31221h()).compareTo(Boolean.valueOf(mVRSEvent.mo31221h()))) != 0 || ((mo31221h() && (compareTo = C25082a.m62839c(this.eventId, mVRSEvent.eventId)) != 0) || (compareTo = Boolean.valueOf(mo31223i()).compareTo(Boolean.valueOf(mVRSEvent.mo31223i()))) != 0 || ((mo31223i() && (compareTo = C25082a.m62840d(this.eventTripTime, mVRSEvent.eventTripTime)) != 0) || (compareTo = Boolean.valueOf(mo31227m()).compareTo(Boolean.valueOf(mVRSEvent.mo31227m()))) != 0 || ((mo31227m() && (compareTo = this.vehicleType.compareTo(mVRSEvent.vehicleType)) != 0) || (compareTo = Boolean.valueOf(mo31220g()).compareTo(Boolean.valueOf(mVRSEvent.mo31220g()))) != 0 || ((mo31220g() && (compareTo = this.direction.compareTo(mVRSEvent.direction)) != 0) || (compareTo = Boolean.valueOf(mo31224j()).compareTo(Boolean.valueOf(mVRSEvent.mo31224j()))) != 0 || ((mo31224j() && (compareTo = this.image.compareTo(mVRSEvent.image)) != 0) || (compareTo = Boolean.valueOf(mo31225k()).compareTo(Boolean.valueOf(mVRSEvent.mo31225k()))) != 0 || ((mo31225k() && (compareTo = this.name.compareTo(mVRSEvent.name)) != 0) || (compareTo = Boolean.valueOf(mo31219f()).compareTo(Boolean.valueOf(mVRSEvent.mo31219f()))) != 0)))))))) {
            return compareTo;
        }
        if (!mo31219f() || (c = C25082a.m62839c(this.bucketId, mVRSEvent.bucketId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVRSEvent)) {
            return mo31216a((MVRSEvent) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31219f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo31220g() {
        return this.direction != null;
    }

    /* renamed from: h */
    public final boolean mo31221h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31223i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo31224j() {
        return this.image != null;
    }

    /* renamed from: k */
    public final boolean mo31225k() {
        return this.name != null;
    }

    /* renamed from: l */
    public final boolean mo31226l() {
        return this.superEvent != null;
    }

    /* renamed from: m */
    public final boolean mo31227m() {
        return this.vehicleType != null;
    }

    /* renamed from: o */
    public final void mo31228o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: p */
    public final void mo31229p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: q */
    public final void mo31230q() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: r */
    public final void mo31231r() throws TException {
        MVRSSuperEvent mVRSSuperEvent = this.superEvent;
        if (mVRSSuperEvent != null) {
            mVRSSuperEvent.mo31384r();
        }
        MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
        if (mVImageReferenceWithParams != null) {
            mVImageReferenceWithParams.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRSEvent(", "superEvent:");
        MVRSSuperEvent mVRSSuperEvent = this.superEvent;
        if (mVRSSuperEvent == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRSSuperEvent);
        }
        n.append(", ");
        n.append("eventId:");
        C0016g.m42z(n, this.eventId, ", ", "eventTripTime:");
        C25541a.m63889t(n, this.eventTripTime, ", ", "vehicleType:");
        MVVehicleType mVVehicleType = this.vehicleType;
        if (mVVehicleType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVVehicleType);
        }
        n.append(", ");
        n.append("direction:");
        MVDirection mVDirection = this.direction;
        if (mVDirection == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVDirection);
        }
        if (mo31224j()) {
            n.append(", ");
            n.append("image:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        if (mo31225k()) {
            n.append(", ");
            n.append("name:");
            String str = this.name;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        if (mo31219f()) {
            n.append(", ");
            n.append("bucketId:");
            n.append(this.bucketId);
        }
        n.append(")");
        return n.toString();
    }
}
