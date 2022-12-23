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
import org.apache.thrift.meta_data.MapMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25120f;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVExternalWebAccountResponse implements TBase<MVExternalWebAccountResponse, _Fields>, Serializable, Cloneable, Comparable<MVExternalWebAccountResponse> {

    /* renamed from: b */
    public static final C25113c f27260b = new C25113c("accountUrl", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27261c = new C25113c("additionalHeaders", (byte) 13, 2);

    /* renamed from: d */
    public static final HashMap f27262d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27263e;
    public String accountUrl;
    public Map<String, String> additionalHeaders;

    public enum _Fields implements C25085c {
        ACCOUNT_URL(1, "accountUrl"),
        ADDITIONAL_HEADERS(2, "additionalHeaders");
        
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
                return ACCOUNT_URL;
            }
            if (i != 2) {
                return null;
            }
            return ADDITIONAL_HEADERS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVExternalWebAccountResponse$a */
    public static class C9740a extends C25239c<MVExternalWebAccountResponse> {
        public C9740a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVExternalWebAccountResponse mVExternalWebAccountResponse = (MVExternalWebAccountResponse) tBase;
            mVExternalWebAccountResponse.getClass();
            C25113c cVar = MVExternalWebAccountResponse.f27260b;
            gVar.mo61687K();
            if (mVExternalWebAccountResponse.accountUrl != null) {
                gVar.mo61711x(MVExternalWebAccountResponse.f27260b);
                gVar.mo61686J(mVExternalWebAccountResponse.accountUrl);
                gVar.mo61712y();
            }
            if (mVExternalWebAccountResponse.additionalHeaders != null) {
                gVar.mo61711x(MVExternalWebAccountResponse.f27261c);
                gVar.mo61682F(new C25120f((byte) 11, (byte) 11, mVExternalWebAccountResponse.additionalHeaders.size()));
                for (Map.Entry next : mVExternalWebAccountResponse.additionalHeaders.entrySet()) {
                    gVar.mo61686J((String) next.getKey());
                    gVar.mo61686J((String) next.getValue());
                }
                gVar.mo61683G();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVExternalWebAccountResponse mVExternalWebAccountResponse = (MVExternalWebAccountResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVExternalWebAccountResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 13) {
                        C25120f m = gVar.mo61700m();
                        mVExternalWebAccountResponse.additionalHeaders = new HashMap(m.f63398c * 2);
                        for (int i = 0; i < m.f63398c; i++) {
                            mVExternalWebAccountResponse.additionalHeaders.put(gVar.mo61704q(), gVar.mo61704q());
                        }
                        gVar.mo61701n();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVExternalWebAccountResponse.accountUrl = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVExternalWebAccountResponse$b */
    public static class C9741b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9740a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVExternalWebAccountResponse$c */
    public static class C9742c extends C25240d<MVExternalWebAccountResponse> {
        public C9742c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVExternalWebAccountResponse mVExternalWebAccountResponse = (MVExternalWebAccountResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVExternalWebAccountResponse.mo29858f()) {
                bitSet.set(0);
            }
            if (mVExternalWebAccountResponse.mo29859g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVExternalWebAccountResponse.mo29858f()) {
                jVar.mo61686J(mVExternalWebAccountResponse.accountUrl);
            }
            if (mVExternalWebAccountResponse.mo29859g()) {
                jVar.mo61678B(mVExternalWebAccountResponse.additionalHeaders.size());
                for (Map.Entry next : mVExternalWebAccountResponse.additionalHeaders.entrySet()) {
                    jVar.mo61686J((String) next.getKey());
                    jVar.mo61686J((String) next.getValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVExternalWebAccountResponse mVExternalWebAccountResponse = (MVExternalWebAccountResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVExternalWebAccountResponse.accountUrl = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVExternalWebAccountResponse.additionalHeaders = new HashMap(i * 2);
                for (int i2 = 0; i2 < i; i2++) {
                    mVExternalWebAccountResponse.additionalHeaders.put(jVar.mo61704q(), jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVExternalWebAccountResponse$d */
    public static class C9743d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9742c(0);
        }
    }

    static {
        new C17394d0("MVExternalWebAccountResponse");
        HashMap hashMap = new HashMap();
        f27262d = hashMap;
        hashMap.put(C25239c.class, new C9741b());
        hashMap.put(C25240d.class, new C9743d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ACCOUNT_URL, new FieldMetaData("accountUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ADDITIONAL_HEADERS, new FieldMetaData("additionalHeaders", (byte) 3, new MapMetaData(new FieldValueMetaData((byte) 11, false), new FieldValueMetaData((byte) 11, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27263e = unmodifiableMap;
        FieldMetaData.m61947a(MVExternalWebAccountResponse.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
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
        ((C25238b) f27262d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27262d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int i;
        MVExternalWebAccountResponse mVExternalWebAccountResponse = (MVExternalWebAccountResponse) obj;
        if (!getClass().equals(mVExternalWebAccountResponse.getClass())) {
            return getClass().getName().compareTo(mVExternalWebAccountResponse.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29858f()).compareTo(Boolean.valueOf(mVExternalWebAccountResponse.mo29858f()));
        if (compareTo != 0 || ((mo29858f() && (compareTo = this.accountUrl.compareTo(mVExternalWebAccountResponse.accountUrl)) != 0) || (compareTo = Boolean.valueOf(mo29859g()).compareTo(Boolean.valueOf(mVExternalWebAccountResponse.mo29859g()))) != 0)) {
            return compareTo;
        }
        if (!mo29859g() || (i = C25082a.m62845i(this.additionalHeaders, mVExternalWebAccountResponse.additionalHeaders)) == 0) {
            return 0;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVExternalWebAccountResponse)) {
            return false;
        }
        MVExternalWebAccountResponse mVExternalWebAccountResponse = (MVExternalWebAccountResponse) obj;
        boolean f = mo29858f();
        boolean f2 = mVExternalWebAccountResponse.mo29858f();
        if ((f || f2) && (!f || !f2 || !this.accountUrl.equals(mVExternalWebAccountResponse.accountUrl))) {
            return false;
        }
        boolean g = mo29859g();
        boolean g2 = mVExternalWebAccountResponse.mo29859g();
        if ((g || g2) && (!g || !g2 || !this.additionalHeaders.equals(mVExternalWebAccountResponse.additionalHeaders))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29858f() {
        return this.accountUrl != null;
    }

    /* renamed from: g */
    public final boolean mo29859g() {
        return this.additionalHeaders != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVExternalWebAccountResponse(", "accountUrl:");
        String str = this.accountUrl;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("additionalHeaders:");
        Map<String, String> map = this.additionalHeaders;
        if (map == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(map);
        }
        n.append(")");
        return n.toString();
    }
}
