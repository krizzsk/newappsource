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

public class MVRSGetEventByIdRequest implements TBase<MVRSGetEventByIdRequest, _Fields>, Serializable, Cloneable, Comparable<MVRSGetEventByIdRequest> {

    /* renamed from: b */
    public static final C25113c f28098b = new C25113c("superEventId", (byte) 8, 1);

    /* renamed from: c */
    public static final HashMap f28099c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f28100d;
    private byte __isset_bitfield = 0;
    public int superEventId;

    public enum _Fields implements C25085c {
        SUPER_EVENT_ID(1, "superEventId");
        
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
            return SUPER_EVENT_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSGetEventByIdRequest$a */
    public static class C10374a extends C25239c<MVRSGetEventByIdRequest> {
        public C10374a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSGetEventByIdRequest mVRSGetEventByIdRequest = (MVRSGetEventByIdRequest) tBase;
            mVRSGetEventByIdRequest.getClass();
            C25113c cVar = MVRSGetEventByIdRequest.f28098b;
            gVar.mo61687K();
            gVar.mo61711x(MVRSGetEventByIdRequest.f28098b);
            C16530d.m42020n(gVar, mVRSGetEventByIdRequest.superEventId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSGetEventByIdRequest mVRSGetEventByIdRequest = (MVRSGetEventByIdRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVRSGetEventByIdRequest.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 8) {
                    mVRSGetEventByIdRequest.superEventId = gVar.mo61696i();
                    mVRSGetEventByIdRequest.mo31341g();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSGetEventByIdRequest$b */
    public static class C10375b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10374a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSGetEventByIdRequest$c */
    public static class C10376c extends C25240d<MVRSGetEventByIdRequest> {
        public C10376c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVRSGetEventByIdRequest mVRSGetEventByIdRequest = (MVRSGetEventByIdRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVRSGetEventByIdRequest.mo31340f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVRSGetEventByIdRequest.mo31340f()) {
                jVar.mo61678B(mVRSGetEventByIdRequest.superEventId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVRSGetEventByIdRequest mVRSGetEventByIdRequest = (MVRSGetEventByIdRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVRSGetEventByIdRequest.superEventId = jVar.mo61696i();
                mVRSGetEventByIdRequest.mo31341g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVRSGetEventByIdRequest$d */
    public static class C10377d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10376c(0);
        }
    }

    static {
        new C17394d0("MVRSGetEventByIdRequest");
        HashMap hashMap = new HashMap();
        f28099c = hashMap;
        hashMap.put(C25239c.class, new C10375b());
        hashMap.put(C25240d.class, new C10377d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SUPER_EVENT_ID, new FieldMetaData("superEventId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28100d = unmodifiableMap;
        FieldMetaData.m61947a(MVRSGetEventByIdRequest.class, unmodifiableMap);
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
        ((C25238b) f28099c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28099c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVRSGetEventByIdRequest mVRSGetEventByIdRequest = (MVRSGetEventByIdRequest) obj;
        if (!getClass().equals(mVRSGetEventByIdRequest.getClass())) {
            return getClass().getName().compareTo(mVRSGetEventByIdRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31340f()).compareTo(Boolean.valueOf(mVRSGetEventByIdRequest.mo31340f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo31340f() || (c = C25082a.m62839c(this.superEventId, mVRSGetEventByIdRequest.superEventId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVRSGetEventByIdRequest) && this.superEventId == ((MVRSGetEventByIdRequest) obj).superEventId) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31340f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final void mo31341g() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return C13437d.m33707l(C13437d.m33708n("MVRSGetEventByIdRequest(", "superEventId:"), this.superEventId, ")");
    }
}
