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

public class MVCalculatePriceRequest implements TBase<MVCalculatePriceRequest, _Fields>, Serializable, Cloneable, Comparable<MVCalculatePriceRequest> {

    /* renamed from: b */
    public static final C25113c f24601b = new C25113c("pickup", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f24602c = new C25113c("dropoff", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f24603d = new C25113c("rideTime", (byte) 10, 3);

    /* renamed from: e */
    public static final HashMap f24604e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f24605f;
    private byte __isset_bitfield = 0;
    public MVRideLocationDescriptor dropoff;
    public MVRideLocationDescriptor pickup;
    public long rideTime;

    public enum _Fields implements C25085c {
        PICKUP(1, "pickup"),
        DROPOFF(2, "dropoff"),
        RIDE_TIME(3, "rideTime");
        
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
                return PICKUP;
            }
            if (i == 2) {
                return DROPOFF;
            }
            if (i != 3) {
                return null;
            }
            return RIDE_TIME;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCalculatePriceRequest$a */
    public static class C8137a extends C25239c<MVCalculatePriceRequest> {
        public C8137a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCalculatePriceRequest mVCalculatePriceRequest = (MVCalculatePriceRequest) tBase;
            MVRideLocationDescriptor mVRideLocationDescriptor = mVCalculatePriceRequest.pickup;
            if (mVRideLocationDescriptor != null) {
                mVRideLocationDescriptor.mo25878j();
            }
            MVRideLocationDescriptor mVRideLocationDescriptor2 = mVCalculatePriceRequest.dropoff;
            if (mVRideLocationDescriptor2 != null) {
                mVRideLocationDescriptor2.mo25878j();
            }
            C25113c cVar = MVCalculatePriceRequest.f24601b;
            gVar.mo61687K();
            if (mVCalculatePriceRequest.pickup != null) {
                gVar.mo61711x(MVCalculatePriceRequest.f24601b);
                mVCalculatePriceRequest.pickup.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVCalculatePriceRequest.dropoff != null) {
                gVar.mo61711x(MVCalculatePriceRequest.f24602c);
                mVCalculatePriceRequest.dropoff.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCalculatePriceRequest.f24603d);
            C25541a.m63891v(gVar, mVCalculatePriceRequest.rideTime);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCalculatePriceRequest mVCalculatePriceRequest = (MVCalculatePriceRequest) tBase;
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
                            C25122h.m63098a(gVar, b);
                        } else if (b == 10) {
                            mVCalculatePriceRequest.rideTime = gVar.mo61697j();
                            mVCalculatePriceRequest.mo25398i();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVRideLocationDescriptor mVRideLocationDescriptor = new MVRideLocationDescriptor();
                        mVCalculatePriceRequest.dropoff = mVRideLocationDescriptor;
                        mVRideLocationDescriptor.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVRideLocationDescriptor mVRideLocationDescriptor2 = new MVRideLocationDescriptor();
                    mVCalculatePriceRequest.pickup = mVRideLocationDescriptor2;
                    mVRideLocationDescriptor2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVRideLocationDescriptor mVRideLocationDescriptor3 = mVCalculatePriceRequest.pickup;
            if (mVRideLocationDescriptor3 != null) {
                mVRideLocationDescriptor3.mo25878j();
            }
            MVRideLocationDescriptor mVRideLocationDescriptor4 = mVCalculatePriceRequest.dropoff;
            if (mVRideLocationDescriptor4 != null) {
                mVRideLocationDescriptor4.mo25878j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCalculatePriceRequest$b */
    public static class C8138b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8137a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCalculatePriceRequest$c */
    public static class C8139c extends C25240d<MVCalculatePriceRequest> {
        public C8139c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCalculatePriceRequest mVCalculatePriceRequest = (MVCalculatePriceRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCalculatePriceRequest.mo25395g()) {
                bitSet.set(0);
            }
            if (mVCalculatePriceRequest.mo25394f()) {
                bitSet.set(1);
            }
            if (mVCalculatePriceRequest.mo25396h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVCalculatePriceRequest.mo25395g()) {
                mVCalculatePriceRequest.pickup.mo25202X0(jVar);
            }
            if (mVCalculatePriceRequest.mo25394f()) {
                mVCalculatePriceRequest.dropoff.mo25202X0(jVar);
            }
            if (mVCalculatePriceRequest.mo25396h()) {
                jVar.mo61679C(mVCalculatePriceRequest.rideTime);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCalculatePriceRequest mVCalculatePriceRequest = (MVCalculatePriceRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVRideLocationDescriptor mVRideLocationDescriptor = new MVRideLocationDescriptor();
                mVCalculatePriceRequest.pickup = mVRideLocationDescriptor;
                mVRideLocationDescriptor.mo25201C1(jVar);
            }
            if (T.get(1)) {
                MVRideLocationDescriptor mVRideLocationDescriptor2 = new MVRideLocationDescriptor();
                mVCalculatePriceRequest.dropoff = mVRideLocationDescriptor2;
                mVRideLocationDescriptor2.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVCalculatePriceRequest.rideTime = jVar.mo61697j();
                mVCalculatePriceRequest.mo25398i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVCalculatePriceRequest$d */
    public static class C8140d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8139c(0);
        }
    }

    static {
        new C17394d0("MVCalculatePriceRequest");
        HashMap hashMap = new HashMap();
        f24604e = hashMap;
        hashMap.put(C25239c.class, new C8138b());
        hashMap.put(C25240d.class, new C8140d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PICKUP, new FieldMetaData("pickup", (byte) 3, new StructMetaData(MVRideLocationDescriptor.class)));
        enumMap.put(_Fields.DROPOFF, new FieldMetaData("dropoff", (byte) 3, new StructMetaData(MVRideLocationDescriptor.class)));
        enumMap.put(_Fields.RIDE_TIME, new FieldMetaData("rideTime", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24605f = unmodifiableMap;
        FieldMetaData.m61947a(MVCalculatePriceRequest.class, unmodifiableMap);
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
        ((C25238b) f24604e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24604e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVCalculatePriceRequest mVCalculatePriceRequest = (MVCalculatePriceRequest) obj;
        if (!getClass().equals(mVCalculatePriceRequest.getClass())) {
            return getClass().getName().compareTo(mVCalculatePriceRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25395g()).compareTo(Boolean.valueOf(mVCalculatePriceRequest.mo25395g()));
        if (compareTo != 0 || ((mo25395g() && (compareTo = this.pickup.compareTo(mVCalculatePriceRequest.pickup)) != 0) || (compareTo = Boolean.valueOf(mo25394f()).compareTo(Boolean.valueOf(mVCalculatePriceRequest.mo25394f()))) != 0 || ((mo25394f() && (compareTo = this.dropoff.compareTo(mVCalculatePriceRequest.dropoff)) != 0) || (compareTo = Boolean.valueOf(mo25396h()).compareTo(Boolean.valueOf(mVCalculatePriceRequest.mo25396h()))) != 0))) {
            return compareTo;
        }
        if (!mo25396h() || (d = C25082a.m62840d(this.rideTime, mVCalculatePriceRequest.rideTime)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCalculatePriceRequest)) {
            return false;
        }
        MVCalculatePriceRequest mVCalculatePriceRequest = (MVCalculatePriceRequest) obj;
        boolean g = mo25395g();
        boolean g2 = mVCalculatePriceRequest.mo25395g();
        if ((g || g2) && (!g || !g2 || !this.pickup.mo25870a(mVCalculatePriceRequest.pickup))) {
            return false;
        }
        boolean f = mo25394f();
        boolean f2 = mVCalculatePriceRequest.mo25394f();
        if (((f || f2) && (!f || !f2 || !this.dropoff.mo25870a(mVCalculatePriceRequest.dropoff))) || this.rideTime != mVCalculatePriceRequest.rideTime) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25394f() {
        return this.dropoff != null;
    }

    /* renamed from: g */
    public final boolean mo25395g() {
        return this.pickup != null;
    }

    /* renamed from: h */
    public final boolean mo25396h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo25398i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCalculatePriceRequest(", "pickup:");
        MVRideLocationDescriptor mVRideLocationDescriptor = this.pickup;
        if (mVRideLocationDescriptor == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRideLocationDescriptor);
        }
        n.append(", ");
        n.append("dropoff:");
        MVRideLocationDescriptor mVRideLocationDescriptor2 = this.dropoff;
        if (mVRideLocationDescriptor2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRideLocationDescriptor2);
        }
        n.append(", ");
        n.append("rideTime:");
        return C25541a.m63884o(n, this.rideTime, ")");
    }
}
