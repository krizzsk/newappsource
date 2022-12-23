package com.tranzmate.moovit.protocol.stopDetails;

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

public class MVStopImageRequest implements TBase<MVStopImageRequest, _Fields>, Serializable, Cloneable, Comparable<MVStopImageRequest> {

    /* renamed from: b */
    public static final C25113c f28340b = new C25113c("stopId", (byte) 8, 1);

    /* renamed from: c */
    public static final HashMap f28341c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f28342d;
    private byte __isset_bitfield = 0;
    public int stopId;

    public enum _Fields implements C25085c {
        STOP_ID(1, "stopId");
        
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
            if (i != 1) {
                return null;
            }
            return STOP_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVStopImageRequest$a */
    public static class C10543a extends C25239c<MVStopImageRequest> {
        public C10543a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStopImageRequest mVStopImageRequest = (MVStopImageRequest) tBase;
            mVStopImageRequest.getClass();
            C25113c cVar = MVStopImageRequest.f28340b;
            gVar.mo61687K();
            gVar.mo61711x(MVStopImageRequest.f28340b);
            C16530d.m42020n(gVar, mVStopImageRequest.stopId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStopImageRequest mVStopImageRequest = (MVStopImageRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVStopImageRequest.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 8) {
                    mVStopImageRequest.stopId = gVar.mo61696i();
                    mVStopImageRequest.mo31766g();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVStopImageRequest$b */
    public static class C10544b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10543a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVStopImageRequest$c */
    public static class C10545c extends C25240d<MVStopImageRequest> {
        public C10545c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVStopImageRequest mVStopImageRequest = (MVStopImageRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVStopImageRequest.mo31765f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVStopImageRequest.mo31765f()) {
                jVar.mo61678B(mVStopImageRequest.stopId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVStopImageRequest mVStopImageRequest = (MVStopImageRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVStopImageRequest.stopId = jVar.mo61696i();
                mVStopImageRequest.mo31766g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVStopImageRequest$d */
    public static class C10546d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10545c(0);
        }
    }

    static {
        new C17394d0("MVStopImageRequest");
        HashMap hashMap = new HashMap();
        f28341c = hashMap;
        hashMap.put(C25239c.class, new C10544b());
        hashMap.put(C25240d.class, new C10546d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.STOP_ID, new FieldMetaData("stopId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28342d = unmodifiableMap;
        FieldMetaData.m61947a(MVStopImageRequest.class, unmodifiableMap);
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
        ((C25238b) f28341c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28341c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVStopImageRequest mVStopImageRequest = (MVStopImageRequest) obj;
        if (!getClass().equals(mVStopImageRequest.getClass())) {
            return getClass().getName().compareTo(mVStopImageRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31765f()).compareTo(Boolean.valueOf(mVStopImageRequest.mo31765f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo31765f() || (c = C25082a.m62839c(this.stopId, mVStopImageRequest.stopId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVStopImageRequest) && this.stopId == ((MVStopImageRequest) obj).stopId) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31765f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final void mo31766g() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return C13437d.m33707l(C13437d.m33708n("MVStopImageRequest(", "stopId:"), this.stopId, ")");
    }
}
