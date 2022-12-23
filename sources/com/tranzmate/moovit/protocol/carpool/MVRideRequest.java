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

public class MVRideRequest implements TBase<MVRideRequest, _Fields>, Serializable, Cloneable, Comparable<MVRideRequest> {

    /* renamed from: b */
    public static final C25113c f24869b = new C25113c("requestId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f24870c = new C25113c("data", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f24871d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f24872e;
    private byte __isset_bitfield = 0;
    public MVRideRequestMetaData data;
    public int requestId;

    public enum _Fields implements C25085c {
        REQUEST_ID(1, "requestId"),
        DATA(2, "data");
        
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
                return REQUEST_ID;
            }
            if (i != 2) {
                return null;
            }
            return DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRideRequest$a */
    public static class C8311a extends C25239c<MVRideRequest> {
        public C8311a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRideRequest mVRideRequest = (MVRideRequest) tBase;
            MVRideRequestMetaData mVRideRequestMetaData = mVRideRequest.data;
            if (mVRideRequestMetaData != null) {
                mVRideRequestMetaData.mo25913t();
            }
            C25113c cVar = MVRideRequest.f24869b;
            gVar.mo61687K();
            gVar.mo61711x(MVRideRequest.f24869b);
            gVar.mo61678B(mVRideRequest.requestId);
            gVar.mo61712y();
            if (mVRideRequest.data != null) {
                gVar.mo61711x(MVRideRequest.f24870c);
                mVRideRequest.data.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRideRequest mVRideRequest = (MVRideRequest) tBase;
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
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVRideRequestMetaData mVRideRequestMetaData = new MVRideRequestMetaData();
                        mVRideRequest.data = mVRideRequestMetaData;
                        mVRideRequestMetaData.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVRideRequest.requestId = gVar.mo61696i();
                    mVRideRequest.mo25892h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVRideRequestMetaData mVRideRequestMetaData2 = mVRideRequest.data;
            if (mVRideRequestMetaData2 != null) {
                mVRideRequestMetaData2.mo25913t();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRideRequest$b */
    public static class C8312b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8311a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRideRequest$c */
    public static class C8313c extends C25240d<MVRideRequest> {
        public C8313c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRideRequest mVRideRequest = (MVRideRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRideRequest.mo25891g()) {
                bitSet.set(0);
            }
            if (mVRideRequest.mo25890f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVRideRequest.mo25891g()) {
                jVar.mo61678B(mVRideRequest.requestId);
            }
            if (mVRideRequest.mo25890f()) {
                mVRideRequest.data.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRideRequest mVRideRequest = (MVRideRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVRideRequest.requestId = jVar.mo61696i();
                mVRideRequest.mo25892h();
            }
            if (T.get(1)) {
                MVRideRequestMetaData mVRideRequestMetaData = new MVRideRequestMetaData();
                mVRideRequest.data = mVRideRequestMetaData;
                mVRideRequestMetaData.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.carpool.MVRideRequest$d */
    public static class C8314d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8313c(0);
        }
    }

    static {
        new C17394d0("MVRideRequest");
        HashMap hashMap = new HashMap();
        f24871d = hashMap;
        hashMap.put(C25239c.class, new C8312b());
        hashMap.put(C25240d.class, new C8314d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REQUEST_ID, new FieldMetaData("requestId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.DATA, new FieldMetaData("data", (byte) 3, new StructMetaData(MVRideRequestMetaData.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24872e = unmodifiableMap;
        FieldMetaData.m61947a(MVRideRequest.class, unmodifiableMap);
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
        ((C25238b) f24871d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24871d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVRideRequest mVRideRequest = (MVRideRequest) obj;
        if (!getClass().equals(mVRideRequest.getClass())) {
            return getClass().getName().compareTo(mVRideRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo25891g()).compareTo(Boolean.valueOf(mVRideRequest.mo25891g()));
        if (compareTo2 != 0 || ((mo25891g() && (compareTo2 = C25082a.m62839c(this.requestId, mVRideRequest.requestId)) != 0) || (compareTo2 = Boolean.valueOf(mo25890f()).compareTo(Boolean.valueOf(mVRideRequest.mo25890f()))) != 0)) {
            return compareTo2;
        }
        if (!mo25890f() || (compareTo = this.data.compareTo(mVRideRequest.data)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVRideRequest)) {
            return false;
        }
        MVRideRequest mVRideRequest = (MVRideRequest) obj;
        if (this.requestId != mVRideRequest.requestId) {
            return false;
        }
        boolean f = mo25890f();
        boolean f2 = mVRideRequest.mo25890f();
        if ((f || f2) && (!f || !f2 || !this.data.mo25896a(mVRideRequest.data))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25890f() {
        return this.data != null;
    }

    /* renamed from: g */
    public final boolean mo25891g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo25892h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRideRequest(", "requestId:");
        C0016g.m42z(n, this.requestId, ", ", "data:");
        MVRideRequestMetaData mVRideRequestMetaData = this.data;
        if (mVRideRequestMetaData == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVRideRequestMetaData);
        }
        n.append(")");
        return n.toString();
    }
}
