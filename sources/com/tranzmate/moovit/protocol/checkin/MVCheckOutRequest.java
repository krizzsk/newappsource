package com.tranzmate.moovit.protocol.checkin;

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

public class MVCheckOutRequest implements TBase<MVCheckOutRequest, _Fields>, Serializable, Cloneable, Comparable<MVCheckOutRequest> {

    /* renamed from: b */
    public static final C25113c f24918b = new C25113c("guid", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f24919c = new C25113c("timestamp", (byte) 10, 2);

    /* renamed from: d */
    public static final HashMap f24920d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f24921e;
    private byte __isset_bitfield = 0;
    public String guid;
    public long timestamp;

    public enum _Fields implements C25085c {
        GUID(1, "guid"),
        TIMESTAMP(2, "timestamp");
        
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
                return GUID;
            }
            if (i != 2) {
                return null;
            }
            return TIMESTAMP;
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

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVCheckOutRequest$a */
    public static class C8336a extends C25239c<MVCheckOutRequest> {
        public C8336a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCheckOutRequest mVCheckOutRequest = (MVCheckOutRequest) tBase;
            mVCheckOutRequest.getClass();
            C25113c cVar = MVCheckOutRequest.f24918b;
            gVar.mo61687K();
            if (mVCheckOutRequest.guid != null) {
                gVar.mo61711x(MVCheckOutRequest.f24918b);
                gVar.mo61686J(mVCheckOutRequest.guid);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVCheckOutRequest.f24919c);
            C25541a.m63891v(gVar, mVCheckOutRequest.timestamp);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCheckOutRequest mVCheckOutRequest = (MVCheckOutRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCheckOutRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 10) {
                        mVCheckOutRequest.timestamp = gVar.mo61697j();
                        mVCheckOutRequest.mo25975h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVCheckOutRequest.guid = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVCheckOutRequest$b */
    public static class C8337b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8336a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVCheckOutRequest$c */
    public static class C8338c extends C25240d<MVCheckOutRequest> {
        public C8338c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCheckOutRequest mVCheckOutRequest = (MVCheckOutRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCheckOutRequest.mo25973f()) {
                bitSet.set(0);
            }
            if (mVCheckOutRequest.mo25974g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVCheckOutRequest.mo25973f()) {
                jVar.mo61686J(mVCheckOutRequest.guid);
            }
            if (mVCheckOutRequest.mo25974g()) {
                jVar.mo61679C(mVCheckOutRequest.timestamp);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCheckOutRequest mVCheckOutRequest = (MVCheckOutRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVCheckOutRequest.guid = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVCheckOutRequest.timestamp = jVar.mo61697j();
                mVCheckOutRequest.mo25975h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.checkin.MVCheckOutRequest$d */
    public static class C8339d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8338c(0);
        }
    }

    static {
        new C17394d0("MVCheckOutRequest");
        HashMap hashMap = new HashMap();
        f24920d = hashMap;
        hashMap.put(C25239c.class, new C8337b());
        hashMap.put(C25240d.class, new C8339d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.GUID, new FieldMetaData("guid", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24921e = unmodifiableMap;
        FieldMetaData.m61947a(MVCheckOutRequest.class, unmodifiableMap);
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
        ((C25238b) f24920d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24920d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVCheckOutRequest mVCheckOutRequest = (MVCheckOutRequest) obj;
        if (!getClass().equals(mVCheckOutRequest.getClass())) {
            return getClass().getName().compareTo(mVCheckOutRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo25973f()).compareTo(Boolean.valueOf(mVCheckOutRequest.mo25973f()));
        if (compareTo != 0 || ((mo25973f() && (compareTo = this.guid.compareTo(mVCheckOutRequest.guid)) != 0) || (compareTo = Boolean.valueOf(mo25974g()).compareTo(Boolean.valueOf(mVCheckOutRequest.mo25974g()))) != 0)) {
            return compareTo;
        }
        if (!mo25974g() || (d = C25082a.m62840d(this.timestamp, mVCheckOutRequest.timestamp)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCheckOutRequest)) {
            return false;
        }
        MVCheckOutRequest mVCheckOutRequest = (MVCheckOutRequest) obj;
        boolean f = mo25973f();
        boolean f2 = mVCheckOutRequest.mo25973f();
        if (((f || f2) && (!f || !f2 || !this.guid.equals(mVCheckOutRequest.guid))) || this.timestamp != mVCheckOutRequest.timestamp) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo25973f() {
        return this.guid != null;
    }

    /* renamed from: g */
    public final boolean mo25974g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo25975h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCheckOutRequest(", "guid:");
        String str = this.guid;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("timestamp:");
        return C25541a.m63884o(n, this.timestamp, ")");
    }
}
