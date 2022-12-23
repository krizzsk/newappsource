package com.tranzmate.moovit.protocol.stopDetails;

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

public class MVGetStopImageUploadUrlResponse implements TBase<MVGetStopImageUploadUrlResponse, _Fields>, Serializable, Cloneable, Comparable<MVGetStopImageUploadUrlResponse> {

    /* renamed from: b */
    public static final C25113c f28328b = new C25113c("url", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28329c = new C25113c("expiration", (byte) 10, 2);

    /* renamed from: d */
    public static final HashMap f28330d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28331e;
    private byte __isset_bitfield = 0;
    public long expiration;
    public String url;

    public enum _Fields implements C25085c {
        URL(1, "url"),
        EXPIRATION(2, "expiration");
        
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
                return URL;
            }
            if (i != 2) {
                return null;
            }
            return EXPIRATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVGetStopImageUploadUrlResponse$a */
    public static class C10535a extends C25239c<MVGetStopImageUploadUrlResponse> {
        public C10535a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetStopImageUploadUrlResponse mVGetStopImageUploadUrlResponse = (MVGetStopImageUploadUrlResponse) tBase;
            mVGetStopImageUploadUrlResponse.getClass();
            C25113c cVar = MVGetStopImageUploadUrlResponse.f28328b;
            gVar.mo61687K();
            if (mVGetStopImageUploadUrlResponse.url != null) {
                gVar.mo61711x(MVGetStopImageUploadUrlResponse.f28328b);
                gVar.mo61686J(mVGetStopImageUploadUrlResponse.url);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVGetStopImageUploadUrlResponse.f28329c);
            C25541a.m63891v(gVar, mVGetStopImageUploadUrlResponse.expiration);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetStopImageUploadUrlResponse mVGetStopImageUploadUrlResponse = (MVGetStopImageUploadUrlResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVGetStopImageUploadUrlResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 10) {
                        mVGetStopImageUploadUrlResponse.expiration = gVar.mo61697j();
                        mVGetStopImageUploadUrlResponse.mo31744h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVGetStopImageUploadUrlResponse.url = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVGetStopImageUploadUrlResponse$b */
    public static class C10536b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10535a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVGetStopImageUploadUrlResponse$c */
    public static class C10537c extends C25240d<MVGetStopImageUploadUrlResponse> {
        public C10537c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetStopImageUploadUrlResponse mVGetStopImageUploadUrlResponse = (MVGetStopImageUploadUrlResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetStopImageUploadUrlResponse.mo31743g()) {
                bitSet.set(0);
            }
            if (mVGetStopImageUploadUrlResponse.mo31742f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVGetStopImageUploadUrlResponse.mo31743g()) {
                jVar.mo61686J(mVGetStopImageUploadUrlResponse.url);
            }
            if (mVGetStopImageUploadUrlResponse.mo31742f()) {
                jVar.mo61679C(mVGetStopImageUploadUrlResponse.expiration);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetStopImageUploadUrlResponse mVGetStopImageUploadUrlResponse = (MVGetStopImageUploadUrlResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVGetStopImageUploadUrlResponse.url = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVGetStopImageUploadUrlResponse.expiration = jVar.mo61697j();
                mVGetStopImageUploadUrlResponse.mo31744h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.stopDetails.MVGetStopImageUploadUrlResponse$d */
    public static class C10538d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10537c(0);
        }
    }

    static {
        new C17394d0("MVGetStopImageUploadUrlResponse");
        HashMap hashMap = new HashMap();
        f28330d = hashMap;
        hashMap.put(C25239c.class, new C10536b());
        hashMap.put(C25240d.class, new C10538d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.URL, new FieldMetaData("url", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.EXPIRATION, new FieldMetaData("expiration", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28331e = unmodifiableMap;
        FieldMetaData.m61947a(MVGetStopImageUploadUrlResponse.class, unmodifiableMap);
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
        ((C25238b) f28330d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28330d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVGetStopImageUploadUrlResponse mVGetStopImageUploadUrlResponse = (MVGetStopImageUploadUrlResponse) obj;
        if (!getClass().equals(mVGetStopImageUploadUrlResponse.getClass())) {
            return getClass().getName().compareTo(mVGetStopImageUploadUrlResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31743g()).compareTo(Boolean.valueOf(mVGetStopImageUploadUrlResponse.mo31743g()));
        if (compareTo != 0 || ((mo31743g() && (compareTo = this.url.compareTo(mVGetStopImageUploadUrlResponse.url)) != 0) || (compareTo = Boolean.valueOf(mo31742f()).compareTo(Boolean.valueOf(mVGetStopImageUploadUrlResponse.mo31742f()))) != 0)) {
            return compareTo;
        }
        if (!mo31742f() || (d = C25082a.m62840d(this.expiration, mVGetStopImageUploadUrlResponse.expiration)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetStopImageUploadUrlResponse)) {
            return false;
        }
        MVGetStopImageUploadUrlResponse mVGetStopImageUploadUrlResponse = (MVGetStopImageUploadUrlResponse) obj;
        boolean g = mo31743g();
        boolean g2 = mVGetStopImageUploadUrlResponse.mo31743g();
        if (((g || g2) && (!g || !g2 || !this.url.equals(mVGetStopImageUploadUrlResponse.url))) || this.expiration != mVGetStopImageUploadUrlResponse.expiration) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31742f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo31743g() {
        return this.url != null;
    }

    /* renamed from: h */
    public final void mo31744h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetStopImageUploadUrlResponse(", "url:");
        String str = this.url;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("expiration:");
        return C25541a.m63884o(n, this.expiration, ")");
    }
}
