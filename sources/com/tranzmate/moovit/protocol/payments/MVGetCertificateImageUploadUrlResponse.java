package com.tranzmate.moovit.protocol.payments;

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

public class MVGetCertificateImageUploadUrlResponse implements TBase<MVGetCertificateImageUploadUrlResponse, _Fields>, Serializable, Cloneable, Comparable<MVGetCertificateImageUploadUrlResponse> {

    /* renamed from: b */
    public static final C25113c f27286b = new C25113c("url", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27287c = new C25113c("expiration", (byte) 10, 2);

    /* renamed from: d */
    public static final HashMap f27288d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27289e;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetCertificateImageUploadUrlResponse$a */
    public static class C9761a extends C25239c<MVGetCertificateImageUploadUrlResponse> {
        public C9761a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetCertificateImageUploadUrlResponse mVGetCertificateImageUploadUrlResponse = (MVGetCertificateImageUploadUrlResponse) tBase;
            mVGetCertificateImageUploadUrlResponse.getClass();
            C25113c cVar = MVGetCertificateImageUploadUrlResponse.f27286b;
            gVar.mo61687K();
            if (mVGetCertificateImageUploadUrlResponse.url != null) {
                gVar.mo61711x(MVGetCertificateImageUploadUrlResponse.f27286b);
                gVar.mo61686J(mVGetCertificateImageUploadUrlResponse.url);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVGetCertificateImageUploadUrlResponse.f27287c);
            C25541a.m63891v(gVar, mVGetCertificateImageUploadUrlResponse.expiration);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetCertificateImageUploadUrlResponse mVGetCertificateImageUploadUrlResponse = (MVGetCertificateImageUploadUrlResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVGetCertificateImageUploadUrlResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 10) {
                        mVGetCertificateImageUploadUrlResponse.expiration = gVar.mo61697j();
                        mVGetCertificateImageUploadUrlResponse.mo29903h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVGetCertificateImageUploadUrlResponse.url = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetCertificateImageUploadUrlResponse$b */
    public static class C9762b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9761a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetCertificateImageUploadUrlResponse$c */
    public static class C9763c extends C25240d<MVGetCertificateImageUploadUrlResponse> {
        public C9763c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVGetCertificateImageUploadUrlResponse mVGetCertificateImageUploadUrlResponse = (MVGetCertificateImageUploadUrlResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVGetCertificateImageUploadUrlResponse.mo29902g()) {
                bitSet.set(0);
            }
            if (mVGetCertificateImageUploadUrlResponse.mo29901f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVGetCertificateImageUploadUrlResponse.mo29902g()) {
                jVar.mo61686J(mVGetCertificateImageUploadUrlResponse.url);
            }
            if (mVGetCertificateImageUploadUrlResponse.mo29901f()) {
                jVar.mo61679C(mVGetCertificateImageUploadUrlResponse.expiration);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVGetCertificateImageUploadUrlResponse mVGetCertificateImageUploadUrlResponse = (MVGetCertificateImageUploadUrlResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVGetCertificateImageUploadUrlResponse.url = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVGetCertificateImageUploadUrlResponse.expiration = jVar.mo61697j();
                mVGetCertificateImageUploadUrlResponse.mo29903h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVGetCertificateImageUploadUrlResponse$d */
    public static class C9764d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9763c(0);
        }
    }

    static {
        new C17394d0("MVGetCertificateImageUploadUrlResponse");
        HashMap hashMap = new HashMap();
        f27288d = hashMap;
        hashMap.put(C25239c.class, new C9762b());
        hashMap.put(C25240d.class, new C9764d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.URL, new FieldMetaData("url", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.EXPIRATION, new FieldMetaData("expiration", (byte) 3, new FieldValueMetaData((byte) 10, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27289e = unmodifiableMap;
        FieldMetaData.m61947a(MVGetCertificateImageUploadUrlResponse.class, unmodifiableMap);
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
        ((C25238b) f27288d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27288d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int d;
        MVGetCertificateImageUploadUrlResponse mVGetCertificateImageUploadUrlResponse = (MVGetCertificateImageUploadUrlResponse) obj;
        if (!getClass().equals(mVGetCertificateImageUploadUrlResponse.getClass())) {
            return getClass().getName().compareTo(mVGetCertificateImageUploadUrlResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29902g()).compareTo(Boolean.valueOf(mVGetCertificateImageUploadUrlResponse.mo29902g()));
        if (compareTo != 0 || ((mo29902g() && (compareTo = this.url.compareTo(mVGetCertificateImageUploadUrlResponse.url)) != 0) || (compareTo = Boolean.valueOf(mo29901f()).compareTo(Boolean.valueOf(mVGetCertificateImageUploadUrlResponse.mo29901f()))) != 0)) {
            return compareTo;
        }
        if (!mo29901f() || (d = C25082a.m62840d(this.expiration, mVGetCertificateImageUploadUrlResponse.expiration)) == 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVGetCertificateImageUploadUrlResponse)) {
            return false;
        }
        MVGetCertificateImageUploadUrlResponse mVGetCertificateImageUploadUrlResponse = (MVGetCertificateImageUploadUrlResponse) obj;
        boolean g = mo29902g();
        boolean g2 = mVGetCertificateImageUploadUrlResponse.mo29902g();
        if (((g || g2) && (!g || !g2 || !this.url.equals(mVGetCertificateImageUploadUrlResponse.url))) || this.expiration != mVGetCertificateImageUploadUrlResponse.expiration) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29901f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo29902g() {
        return this.url != null;
    }

    /* renamed from: h */
    public final void mo29903h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVGetCertificateImageUploadUrlResponse(", "url:");
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
