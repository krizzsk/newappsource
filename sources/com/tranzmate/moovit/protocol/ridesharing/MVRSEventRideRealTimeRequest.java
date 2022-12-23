package com.tranzmate.moovit.protocol.ridesharing;

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

public class MVRSEventRideRealTimeRequest implements TBase<MVRSEventRideRealTimeRequest, _Fields>, Serializable, Cloneable, Comparable<MVRSEventRideRealTimeRequest> {

    /* renamed from: b */
    public static final C25113c f28071b = new C25113c("rideId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28072c = new C25113c("stopSeq", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f28073d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28074e;
    private byte __isset_bitfield = 0;
    public int rideId;
    public int stopSeq;

    public enum _Fields implements C25085c {
        RIDE_ID(1, "rideId"),
        STOP_SEQ(2, "stopSeq");
        
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
            if (i != 2) {
                return null;
            }
            return STOP_SEQ;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeRequest$a */
    public static class C10354a extends C25239c<MVRSEventRideRealTimeRequest> {
        public C10354a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEventRideRealTimeRequest mVRSEventRideRealTimeRequest = (MVRSEventRideRealTimeRequest) tBase;
            mVRSEventRideRealTimeRequest.getClass();
            C25113c cVar = MVRSEventRideRealTimeRequest.f28071b;
            gVar.mo61687K();
            gVar.mo61711x(MVRSEventRideRealTimeRequest.f28071b);
            gVar.mo61678B(mVRSEventRideRealTimeRequest.rideId);
            gVar.mo61712y();
            gVar.mo61711x(MVRSEventRideRealTimeRequest.f28072c);
            C16530d.m42020n(gVar, mVRSEventRideRealTimeRequest.stopSeq);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEventRideRealTimeRequest mVRSEventRideRealTimeRequest = (MVRSEventRideRealTimeRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVRSEventRideRealTimeRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVRSEventRideRealTimeRequest.stopSeq = gVar.mo61696i();
                        mVRSEventRideRealTimeRequest.mo31291i();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVRSEventRideRealTimeRequest.rideId = gVar.mo61696i();
                    mVRSEventRideRealTimeRequest.mo31289h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeRequest$b */
    public static class C10355b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10354a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeRequest$c */
    public static class C10356c extends C25240d<MVRSEventRideRealTimeRequest> {
        public C10356c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSEventRideRealTimeRequest mVRSEventRideRealTimeRequest = (MVRSEventRideRealTimeRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRSEventRideRealTimeRequest.mo31287f()) {
                bitSet.set(0);
            }
            if (mVRSEventRideRealTimeRequest.mo31288g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVRSEventRideRealTimeRequest.mo31287f()) {
                jVar.mo61678B(mVRSEventRideRealTimeRequest.rideId);
            }
            if (mVRSEventRideRealTimeRequest.mo31288g()) {
                jVar.mo61678B(mVRSEventRideRealTimeRequest.stopSeq);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSEventRideRealTimeRequest mVRSEventRideRealTimeRequest = (MVRSEventRideRealTimeRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVRSEventRideRealTimeRequest.rideId = jVar.mo61696i();
                mVRSEventRideRealTimeRequest.mo31289h();
            }
            if (T.get(1)) {
                mVRSEventRideRealTimeRequest.stopSeq = jVar.mo61696i();
                mVRSEventRideRealTimeRequest.mo31291i();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSEventRideRealTimeRequest$d */
    public static class C10357d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10356c(0);
        }
    }

    static {
        new C17394d0("MVRSEventRideRealTimeRequest");
        HashMap hashMap = new HashMap();
        f28073d = hashMap;
        hashMap.put(C25239c.class, new C10355b());
        hashMap.put(C25240d.class, new C10357d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RIDE_ID, new FieldMetaData("rideId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.STOP_SEQ, new FieldMetaData("stopSeq", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28074e = unmodifiableMap;
        FieldMetaData.m61947a(MVRSEventRideRealTimeRequest.class, unmodifiableMap);
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
        ((C25238b) f28073d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28073d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVRSEventRideRealTimeRequest mVRSEventRideRealTimeRequest = (MVRSEventRideRealTimeRequest) obj;
        if (!getClass().equals(mVRSEventRideRealTimeRequest.getClass())) {
            return getClass().getName().compareTo(mVRSEventRideRealTimeRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31287f()).compareTo(Boolean.valueOf(mVRSEventRideRealTimeRequest.mo31287f()));
        if (compareTo != 0 || ((mo31287f() && (compareTo = C25082a.m62839c(this.rideId, mVRSEventRideRealTimeRequest.rideId)) != 0) || (compareTo = Boolean.valueOf(mo31288g()).compareTo(Boolean.valueOf(mVRSEventRideRealTimeRequest.mo31288g()))) != 0)) {
            return compareTo;
        }
        if (!mo31288g() || (c = C25082a.m62839c(this.stopSeq, mVRSEventRideRealTimeRequest.stopSeq)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVRSEventRideRealTimeRequest)) {
            return false;
        }
        MVRSEventRideRealTimeRequest mVRSEventRideRealTimeRequest = (MVRSEventRideRealTimeRequest) obj;
        if (this.rideId == mVRSEventRideRealTimeRequest.rideId && this.stopSeq == mVRSEventRideRealTimeRequest.stopSeq) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31287f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo31288g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final void mo31289h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo31291i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVRSEventRideRealTimeRequest(", "rideId:");
        C0016g.m42z(n, this.rideId, ", ", "stopSeq:");
        return C13437d.m33707l(n, this.stopSeq, ")");
    }
}
