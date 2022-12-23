package com.tranzmate.moovit.protocol.ridesharing;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
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

public class MVRSEventRideRealTimeResponse implements TBase<MVRSEventRideRealTimeResponse, _Fields>, Serializable, Cloneable, Comparable<MVRSEventRideRealTimeResponse> {

    /* renamed from: b */
    public static final C25113c f28075b = new C25113c(ServerParameters.STATUS, (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28076c = new C25113c("etaInSeconds", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28077d = new C25113c("vehicleLocation", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f28078e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f28079f;
    private byte __isset_bitfield = 0;
    public int etaInSeconds;
    private _Fields[] optionals = {_Fields.ETA_IN_SECONDS, _Fields.VEHICLE_LOCATION};
    public MVRSEventRideRealTimeStatus status;
    public MVLatLon vehicleLocation;

    public enum _Fields implements C25085c {
        STATUS(1, ServerParameters.STATUS),
        ETA_IN_SECONDS(2, "etaInSeconds"),
        VEHICLE_LOCATION(3, "vehicleLocation");
        
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
                return STATUS;
            }
            if (i == 2) {
                return ETA_IN_SECONDS;
            }
            if (i != 3) {
                return null;
            }
            return VEHICLE_LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeResponse$a */
    public static class C10358a extends C25239c<MVRSEventRideRealTimeResponse> {
        public C10358a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEventRideRealTimeResponse mVRSEventRideRealTimeResponse = (MVRSEventRideRealTimeResponse) tBase;
            MVLatLon mVLatLon = mVRSEventRideRealTimeResponse.vehicleLocation;
            C25113c cVar = MVRSEventRideRealTimeResponse.f28075b;
            gVar.mo61687K();
            if (mVRSEventRideRealTimeResponse.status != null) {
                gVar.mo61711x(MVRSEventRideRealTimeResponse.f28075b);
                gVar.mo61678B(mVRSEventRideRealTimeResponse.status.getValue());
                gVar.mo61712y();
            }
            if (mVRSEventRideRealTimeResponse.mo31296f()) {
                gVar.mo61711x(MVRSEventRideRealTimeResponse.f28076c);
                gVar.mo61678B(mVRSEventRideRealTimeResponse.etaInSeconds);
                gVar.mo61712y();
            }
            if (mVRSEventRideRealTimeResponse.vehicleLocation != null && mVRSEventRideRealTimeResponse.mo31298h()) {
                gVar.mo61711x(MVRSEventRideRealTimeResponse.f28077d);
                mVRSEventRideRealTimeResponse.vehicleLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEventRideRealTimeResponse mVRSEventRideRealTimeResponse = (MVRSEventRideRealTimeResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVRSEventRideRealTimeResponse.vehicleLocation;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVLatLon mVLatLon2 = new MVLatLon();
                            mVRSEventRideRealTimeResponse.vehicleLocation = mVLatLon2;
                            mVLatLon2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVRSEventRideRealTimeResponse.etaInSeconds = gVar.mo61696i();
                        mVRSEventRideRealTimeResponse.mo31300i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVRSEventRideRealTimeResponse.status = MVRSEventRideRealTimeStatus.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeResponse$b */
    public static class C10359b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10358a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeResponse$c */
    public static class C10360c extends C25240d<MVRSEventRideRealTimeResponse> {
        public C10360c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEventRideRealTimeResponse mVRSEventRideRealTimeResponse = (MVRSEventRideRealTimeResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRSEventRideRealTimeResponse.mo31297g()) {
                bitSet.set(0);
            }
            if (mVRSEventRideRealTimeResponse.mo31296f()) {
                bitSet.set(1);
            }
            if (mVRSEventRideRealTimeResponse.mo31298h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVRSEventRideRealTimeResponse.mo31297g()) {
                jVar.mo61678B(mVRSEventRideRealTimeResponse.status.getValue());
            }
            if (mVRSEventRideRealTimeResponse.mo31296f()) {
                jVar.mo61678B(mVRSEventRideRealTimeResponse.etaInSeconds);
            }
            if (mVRSEventRideRealTimeResponse.mo31298h()) {
                mVRSEventRideRealTimeResponse.vehicleLocation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEventRideRealTimeResponse mVRSEventRideRealTimeResponse = (MVRSEventRideRealTimeResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVRSEventRideRealTimeResponse.status = MVRSEventRideRealTimeStatus.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVRSEventRideRealTimeResponse.etaInSeconds = jVar.mo61696i();
                mVRSEventRideRealTimeResponse.mo31300i();
            }
            if (T.get(2)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVRSEventRideRealTimeResponse.vehicleLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeResponse$d */
    public static class C10361d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10360c(0);
        }
    }

    static {
        new C17394d0("MVRSEventRideRealTimeResponse");
        HashMap hashMap = new HashMap();
        f28078e = hashMap;
        hashMap.put(C25239c.class, new C10359b());
        hashMap.put(C25240d.class, new C10361d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STATUS, new FieldMetaData(ServerParameters.STATUS, (byte) 3, new EnumMetaData(MVRSEventRideRealTimeStatus.class)));
        enumMap.put(_Fields.ETA_IN_SECONDS, new FieldMetaData("etaInSeconds", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.VEHICLE_LOCATION, new FieldMetaData("vehicleLocation", (byte) 2, new StructMetaData(MVLatLon.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28079f = unmodifiableMap;
        FieldMetaData.m61947a(MVRSEventRideRealTimeResponse.class, unmodifiableMap);
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
        ((C25238b) f28078e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28078e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVRSEventRideRealTimeResponse mVRSEventRideRealTimeResponse = (MVRSEventRideRealTimeResponse) obj;
        if (!getClass().equals(mVRSEventRideRealTimeResponse.getClass())) {
            return getClass().getName().compareTo(mVRSEventRideRealTimeResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31297g()).compareTo(Boolean.valueOf(mVRSEventRideRealTimeResponse.mo31297g()));
        if (compareTo2 != 0 || ((mo31297g() && (compareTo2 = this.status.compareTo(mVRSEventRideRealTimeResponse.status)) != 0) || (compareTo2 = Boolean.valueOf(mo31296f()).compareTo(Boolean.valueOf(mVRSEventRideRealTimeResponse.mo31296f()))) != 0 || ((mo31296f() && (compareTo2 = C25082a.m62839c(this.etaInSeconds, mVRSEventRideRealTimeResponse.etaInSeconds)) != 0) || (compareTo2 = Boolean.valueOf(mo31298h()).compareTo(Boolean.valueOf(mVRSEventRideRealTimeResponse.mo31298h()))) != 0))) {
            return compareTo2;
        }
        if (!mo31298h() || (compareTo = this.vehicleLocation.compareTo(mVRSEventRideRealTimeResponse.vehicleLocation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVRSEventRideRealTimeResponse)) {
            return false;
        }
        MVRSEventRideRealTimeResponse mVRSEventRideRealTimeResponse = (MVRSEventRideRealTimeResponse) obj;
        boolean g = mo31297g();
        boolean g2 = mVRSEventRideRealTimeResponse.mo31297g();
        if ((g || g2) && (!g || !g2 || !this.status.equals(mVRSEventRideRealTimeResponse.status))) {
            return false;
        }
        boolean f = mo31296f();
        boolean f2 = mVRSEventRideRealTimeResponse.mo31296f();
        if ((f || f2) && (!f || !f2 || this.etaInSeconds != mVRSEventRideRealTimeResponse.etaInSeconds)) {
            return false;
        }
        boolean h = mo31298h();
        boolean h2 = mVRSEventRideRealTimeResponse.mo31298h();
        if ((h || h2) && (!h || !h2 || !this.vehicleLocation.mo26290a(mVRSEventRideRealTimeResponse.vehicleLocation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31296f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo31297g() {
        return this.status != null;
    }

    /* renamed from: h */
    public final boolean mo31298h() {
        return this.vehicleLocation != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo31300i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRSEventRideRealTimeResponse(", "status:");
        MVRSEventRideRealTimeStatus mVRSEventRideRealTimeStatus = this.status;
        if (mVRSEventRideRealTimeStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRSEventRideRealTimeStatus);
        }
        if (mo31296f()) {
            n.append(", ");
            n.append("etaInSeconds:");
            n.append(this.etaInSeconds);
        }
        if (mo31298h()) {
            n.append(", ");
            n.append("vehicleLocation:");
            MVLatLon mVLatLon = this.vehicleLocation;
            if (mVLatLon == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLatLon);
            }
        }
        n.append(")");
        return n.toString();
    }
}
