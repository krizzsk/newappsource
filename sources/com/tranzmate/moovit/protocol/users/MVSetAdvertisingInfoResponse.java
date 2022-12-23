package com.tranzmate.moovit.protocol.users;

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

public class MVSetAdvertisingInfoResponse implements TBase<MVSetAdvertisingInfoResponse, _Fields>, Serializable, Cloneable, Comparable<MVSetAdvertisingInfoResponse> {

    /* renamed from: b */
    public static final C25113c f30523b = new C25113c("isReinstall", (byte) 2, 1);

    /* renamed from: c */
    public static final HashMap f30524c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f30525d;
    private byte __isset_bitfield = 0;
    public boolean isReinstall;
    private _Fields[] optionals = {_Fields.IS_REINSTALL};

    public enum _Fields implements C25085c {
        IS_REINSTALL(1, "isReinstall");
        
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
            return IS_REINSTALL;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetAdvertisingInfoResponse$a */
    public static class C11885a extends C25239c<MVSetAdvertisingInfoResponse> {
        public C11885a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetAdvertisingInfoResponse mVSetAdvertisingInfoResponse = (MVSetAdvertisingInfoResponse) tBase;
            mVSetAdvertisingInfoResponse.getClass();
            C25113c cVar = MVSetAdvertisingInfoResponse.f30523b;
            gVar.mo61687K();
            if (mVSetAdvertisingInfoResponse.mo35313f()) {
                gVar.mo61711x(MVSetAdvertisingInfoResponse.f30523b);
                gVar.mo61708u(mVSetAdvertisingInfoResponse.isReinstall);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetAdvertisingInfoResponse mVSetAdvertisingInfoResponse = (MVSetAdvertisingInfoResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSetAdvertisingInfoResponse.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 2) {
                    mVSetAdvertisingInfoResponse.isReinstall = gVar.mo61690c();
                    mVSetAdvertisingInfoResponse.mo35314g();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetAdvertisingInfoResponse$b */
    public static class C11886b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11885a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetAdvertisingInfoResponse$c */
    public static class C11887c extends C25240d<MVSetAdvertisingInfoResponse> {
        public C11887c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSetAdvertisingInfoResponse mVSetAdvertisingInfoResponse = (MVSetAdvertisingInfoResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSetAdvertisingInfoResponse.mo35313f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVSetAdvertisingInfoResponse.mo35313f()) {
                jVar.mo61708u(mVSetAdvertisingInfoResponse.isReinstall);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSetAdvertisingInfoResponse mVSetAdvertisingInfoResponse = (MVSetAdvertisingInfoResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVSetAdvertisingInfoResponse.isReinstall = jVar.mo61690c();
                mVSetAdvertisingInfoResponse.mo35314g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVSetAdvertisingInfoResponse$d */
    public static class C11888d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11887c(0);
        }
    }

    static {
        new C17394d0("MVSetAdvertisingInfoResponse");
        HashMap hashMap = new HashMap();
        f30524c = hashMap;
        hashMap.put(C25239c.class, new C11886b());
        hashMap.put(C25240d.class, new C11888d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IS_REINSTALL, new FieldMetaData("isReinstall", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30525d = unmodifiableMap;
        FieldMetaData.m61947a(MVSetAdvertisingInfoResponse.class, unmodifiableMap);
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
        ((C25238b) f30524c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30524c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVSetAdvertisingInfoResponse mVSetAdvertisingInfoResponse = (MVSetAdvertisingInfoResponse) obj;
        if (!getClass().equals(mVSetAdvertisingInfoResponse.getClass())) {
            return getClass().getName().compareTo(mVSetAdvertisingInfoResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo35313f()).compareTo(Boolean.valueOf(mVSetAdvertisingInfoResponse.mo35313f()));
        if (compareTo != 0) {
            return compareTo;
        }
        if (!mo35313f() || (l = C25082a.m62848l(this.isReinstall, mVSetAdvertisingInfoResponse.isReinstall)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSetAdvertisingInfoResponse)) {
            return false;
        }
        MVSetAdvertisingInfoResponse mVSetAdvertisingInfoResponse = (MVSetAdvertisingInfoResponse) obj;
        boolean f = mo35313f();
        boolean f2 = mVSetAdvertisingInfoResponse.mo35313f();
        if ((f || f2) && (!f || !f2 || this.isReinstall != mVSetAdvertisingInfoResponse.isReinstall)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35313f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final void mo35314g() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVSetAdvertisingInfoResponse(");
        if (mo35313f()) {
            sb.append("isReinstall:");
            sb.append(this.isReinstall);
        }
        sb.append(")");
        return sb.toString();
    }
}
