package com.tranzmate.moovit.protocol.sync;

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

public class MVMetroRevisionResponse implements TBase<MVMetroRevisionResponse, _Fields>, Serializable, Cloneable, Comparable<MVMetroRevisionResponse> {

    /* renamed from: b */
    public static final C25113c f28485b = new C25113c("revisionNumber", (byte) 10, 1);

    /* renamed from: c */
    public static final HashMap f28486c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f28487d;
    private byte __isset_bitfield = 0;
    public long revisionNumber;

    public enum _Fields implements C25085c {
        REVISION_NUMBER(1, "revisionNumber");
        
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
            return REVISION_NUMBER;
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

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVMetroRevisionResponse$a */
    public static class C10655a extends C25239c<MVMetroRevisionResponse> {
        public C10655a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMetroRevisionResponse mVMetroRevisionResponse = (MVMetroRevisionResponse) tBase;
            mVMetroRevisionResponse.getClass();
            C25113c cVar = MVMetroRevisionResponse.f28485b;
            gVar.mo61687K();
            gVar.mo61711x(MVMetroRevisionResponse.f28485b);
            C25541a.m63891v(gVar, mVMetroRevisionResponse.revisionNumber);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMetroRevisionResponse mVMetroRevisionResponse = (MVMetroRevisionResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMetroRevisionResponse.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 10) {
                    mVMetroRevisionResponse.revisionNumber = gVar.mo61697j();
                    mVMetroRevisionResponse.mo32019g();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVMetroRevisionResponse$b */
    public static class C10656b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10655a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVMetroRevisionResponse$c */
    public static class C10657c extends C25240d<MVMetroRevisionResponse> {
        public C10657c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMetroRevisionResponse mVMetroRevisionResponse = (MVMetroRevisionResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMetroRevisionResponse.mo32018f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVMetroRevisionResponse.mo32018f()) {
                jVar.mo61679C(mVMetroRevisionResponse.revisionNumber);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMetroRevisionResponse mVMetroRevisionResponse = (MVMetroRevisionResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVMetroRevisionResponse.revisionNumber = jVar.mo61697j();
                mVMetroRevisionResponse.mo32019g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.sync.MVMetroRevisionResponse$d */
    public static class C10658d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10657c(0);
        }
    }

    static {
        new C17394d0("MVMetroRevisionResponse");
        HashMap hashMap = new HashMap();
        f28486c = hashMap;
        hashMap.put(C25239c.class, new C10656b());
        hashMap.put(C25240d.class, new C10658d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.REVISION_NUMBER, new FieldMetaData("revisionNumber", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28487d = unmodifiableMap;
        FieldMetaData.m61947a(MVMetroRevisionResponse.class, unmodifiableMap);
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
        ((C25238b) f28486c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28486c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVMetroRevisionResponse mVMetroRevisionResponse = (MVMetroRevisionResponse) obj;
        if (!getClass().equals(mVMetroRevisionResponse.getClass())) {
            return getClass().getName().compareTo(mVMetroRevisionResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo32018f()).compareTo(Boolean.valueOf(mVMetroRevisionResponse.mo32018f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo32018f() || (d = C25082a.m62840d(this.revisionNumber, mVMetroRevisionResponse.revisionNumber)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMetroRevisionResponse) && this.revisionNumber == ((MVMetroRevisionResponse) obj).revisionNumber) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32018f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final void mo32019g() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return C25541a.m63884o(C13437d.m33708n("MVMetroRevisionResponse(", "revisionNumber:"), this.revisionNumber, ")");
    }
}
