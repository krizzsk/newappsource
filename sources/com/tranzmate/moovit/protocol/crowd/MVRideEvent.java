package com.tranzmate.moovit.protocol.crowd;

import com.appboy.support.StringUtils;
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

public class MVRideEvent implements TBase<MVRideEvent, _Fields>, Serializable, Cloneable, Comparable<MVRideEvent> {

    /* renamed from: b */
    public static final C25113c f25403b = new C25113c("rideId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25404c = new C25113c("rideEventType", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f25405d = new C25113c("timestamp", (byte) 10, 3);

    /* renamed from: e */
    public static final C25113c f25406e = new C25113c("latLon", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f25407f = new C25113c("metadata", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f25408g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f25409h;
    private byte __isset_bitfield = 0;
    public MVLatLon latLon;
    public String metadata;
    private _Fields[] optionals = {_Fields.RIDE_ID, _Fields.LAT_LON, _Fields.METADATA};
    public MVRideEventType rideEventType;
    public int rideId;
    public long timestamp;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        RIDE_EVENT_TYPE(2, "rideEventType"),
        TIMESTAMP(3, "timestamp"),
        LAT_LON(4, "latLon"),
        METADATA(5, "metadata");
        
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
                return RIDE_ID;
            }
            if (i == 2) {
                return RIDE_EVENT_TYPE;
            }
            if (i == 3) {
                return TIMESTAMP;
            }
            if (i == 4) {
                return LAT_LON;
            }
            if (i != 5) {
                return null;
            }
            return METADATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVRideEvent$a */
    public static class C8590a extends C25239c<MVRideEvent> {
        public C8590a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRideEvent mVRideEvent = (MVRideEvent) tBase;
            MVLatLon mVLatLon = mVRideEvent.latLon;
            C25113c cVar = MVRideEvent.f25403b;
            gVar.mo61687K();
            if (mVRideEvent.mo26864i()) {
                gVar.mo61711x(MVRideEvent.f25403b);
                gVar.mo61678B(mVRideEvent.rideId);
                gVar.mo61712y();
            }
            if (mVRideEvent.rideEventType != null) {
                gVar.mo61711x(MVRideEvent.f25404c);
                gVar.mo61678B(mVRideEvent.rideEventType.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVRideEvent.f25405d);
            gVar.mo61679C(mVRideEvent.timestamp);
            gVar.mo61712y();
            if (mVRideEvent.latLon != null && mVRideEvent.mo26860f()) {
                gVar.mo61711x(MVRideEvent.f25406e);
                mVRideEvent.latLon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVRideEvent.metadata != null && mVRideEvent.mo26861g()) {
                gVar.mo61711x(MVRideEvent.f25407f);
                gVar.mo61686J(mVRideEvent.metadata);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRideEvent mVRideEvent = (MVRideEvent) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVRideEvent.latLon;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 11) {
                                    mVRideEvent.metadata = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 12) {
                                MVLatLon mVLatLon2 = new MVLatLon();
                                mVRideEvent.latLon = mVLatLon2;
                                mVLatLon2.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 10) {
                            mVRideEvent.timestamp = gVar.mo61697j();
                            mVRideEvent.mo26867l();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVRideEvent.rideEventType = MVRideEventType.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVRideEvent.rideId = gVar.mo61696i();
                    mVRideEvent.mo26866k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVRideEvent$b */
    public static class C8591b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8590a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVRideEvent$c */
    public static class C8592c extends C25240d<MVRideEvent> {
        public C8592c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRideEvent mVRideEvent = (MVRideEvent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRideEvent.mo26864i()) {
                bitSet.set(0);
            }
            if (mVRideEvent.mo26862h()) {
                bitSet.set(1);
            }
            if (mVRideEvent.mo26865j()) {
                bitSet.set(2);
            }
            if (mVRideEvent.mo26860f()) {
                bitSet.set(3);
            }
            if (mVRideEvent.mo26861g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVRideEvent.mo26864i()) {
                jVar.mo61678B(mVRideEvent.rideId);
            }
            if (mVRideEvent.mo26862h()) {
                jVar.mo61678B(mVRideEvent.rideEventType.getValue());
            }
            if (mVRideEvent.mo26865j()) {
                jVar.mo61679C(mVRideEvent.timestamp);
            }
            if (mVRideEvent.mo26860f()) {
                mVRideEvent.latLon.mo25202X0(jVar);
            }
            if (mVRideEvent.mo26861g()) {
                jVar.mo61686J(mVRideEvent.metadata);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRideEvent mVRideEvent = (MVRideEvent) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVRideEvent.rideId = jVar.mo61696i();
                mVRideEvent.mo26866k();
            }
            if (T.get(1)) {
                mVRideEvent.rideEventType = MVRideEventType.findByValue(jVar.mo61696i());
            }
            if (T.get(2)) {
                mVRideEvent.timestamp = jVar.mo61697j();
                mVRideEvent.mo26867l();
            }
            if (T.get(3)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVRideEvent.latLon = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
            if (T.get(4)) {
                mVRideEvent.metadata = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.crowd.MVRideEvent$d */
    public static class C8593d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8592c(0);
        }
    }

    static {
        new C17394d0("MVRideEvent");
        HashMap hashMap = new HashMap();
        f25408g = hashMap;
        hashMap.put(C25239c.class, new C8591b());
        hashMap.put(C25240d.class, new C8593d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.RIDE_EVENT_TYPE, new FieldMetaData("rideEventType", (byte) 3, new EnumMetaData(MVRideEventType.class)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.LAT_LON, new FieldMetaData("latLon", (byte) 2, new StructMetaData(MVLatLon.class)));
        enumMap.put(_Fields.METADATA, new FieldMetaData("metadata", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25409h = unmodifiableMap;
        FieldMetaData.m61947a(MVRideEvent.class, unmodifiableMap);
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
        ((C25238b) f25408g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25408g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVRideEvent mVRideEvent = (MVRideEvent) obj;
        if (!getClass().equals(mVRideEvent.getClass())) {
            return getClass().getName().compareTo(mVRideEvent.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo26864i()).compareTo(Boolean.valueOf(mVRideEvent.mo26864i()));
        if (compareTo2 != 0 || ((mo26864i() && (compareTo2 = C25082a.m62839c(this.rideId, mVRideEvent.rideId)) != 0) || (compareTo2 = Boolean.valueOf(mo26862h()).compareTo(Boolean.valueOf(mVRideEvent.mo26862h()))) != 0 || ((mo26862h() && (compareTo2 = this.rideEventType.compareTo(mVRideEvent.rideEventType)) != 0) || (compareTo2 = Boolean.valueOf(mo26865j()).compareTo(Boolean.valueOf(mVRideEvent.mo26865j()))) != 0 || ((mo26865j() && (compareTo2 = C25082a.m62840d(this.timestamp, mVRideEvent.timestamp)) != 0) || (compareTo2 = Boolean.valueOf(mo26860f()).compareTo(Boolean.valueOf(mVRideEvent.mo26860f()))) != 0 || ((mo26860f() && (compareTo2 = this.latLon.compareTo(mVRideEvent.latLon)) != 0) || (compareTo2 = Boolean.valueOf(mo26861g()).compareTo(Boolean.valueOf(mVRideEvent.mo26861g()))) != 0))))) {
            return compareTo2;
        }
        if (!mo26861g() || (compareTo = this.metadata.compareTo(mVRideEvent.metadata)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVRideEvent)) {
            return false;
        }
        MVRideEvent mVRideEvent = (MVRideEvent) obj;
        boolean i = mo26864i();
        boolean i2 = mVRideEvent.mo26864i();
        if ((i || i2) && (!i || !i2 || this.rideId != mVRideEvent.rideId)) {
            return false;
        }
        boolean h = mo26862h();
        boolean h2 = mVRideEvent.mo26862h();
        if (((h || h2) && (!h || !h2 || !this.rideEventType.equals(mVRideEvent.rideEventType))) || this.timestamp != mVRideEvent.timestamp) {
            return false;
        }
        boolean f = mo26860f();
        boolean f2 = mVRideEvent.mo26860f();
        if ((f || f2) && (!f || !f2 || !this.latLon.mo26290a(mVRideEvent.latLon))) {
            return false;
        }
        boolean g = mo26861g();
        boolean g2 = mVRideEvent.mo26861g();
        if ((g || g2) && (!g || !g2 || !this.metadata.equals(mVRideEvent.metadata))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo26860f() {
        return this.latLon != null;
    }

    /* renamed from: g */
    public final boolean mo26861g() {
        return this.metadata != null;
    }

    /* renamed from: h */
    public final boolean mo26862h() {
        return this.rideEventType != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26864i() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: j */
    public final boolean mo26865j() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: k */
    public final void mo26866k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo26867l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVRideEvent(");
        if (mo26864i()) {
            sb.append("rideId:");
            sb.append(this.rideId);
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("rideEventType:");
        MVRideEventType mVRideEventType = this.rideEventType;
        if (mVRideEventType == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVRideEventType);
        }
        sb.append(", ");
        sb.append("timestamp:");
        sb.append(this.timestamp);
        if (mo26860f()) {
            sb.append(", ");
            sb.append("latLon:");
            MVLatLon mVLatLon = this.latLon;
            if (mVLatLon == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVLatLon);
            }
        }
        if (mo26861g()) {
            sb.append(", ");
            sb.append("metadata:");
            String str = this.metadata;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
