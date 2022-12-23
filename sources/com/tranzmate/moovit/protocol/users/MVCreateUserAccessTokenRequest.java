package com.tranzmate.moovit.protocol.users;

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
import p531he.C17394d0;
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

public class MVCreateUserAccessTokenRequest implements TBase<MVCreateUserAccessTokenRequest, _Fields>, Serializable, Cloneable, Comparable<MVCreateUserAccessTokenRequest> {

    /* renamed from: b */
    public static final C25113c f30359b = new C25113c("name", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30360c = new C25113c("email", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30361d = new C25113c("password", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f30362e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f30363f;
    public String email;
    public String name;
    public String password;

    public enum _Fields implements C25085c {
        NAME(1, "name"),
        EMAIL(2, "email"),
        PASSWORD(3, "password");
        
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
                return NAME;
            }
            if (i == 2) {
                return EMAIL;
            }
            if (i != 3) {
                return null;
            }
            return PASSWORD;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCreateUserAccessTokenRequest$a */
    public static class C11783a extends C25239c<MVCreateUserAccessTokenRequest> {
        public C11783a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCreateUserAccessTokenRequest mVCreateUserAccessTokenRequest = (MVCreateUserAccessTokenRequest) tBase;
            mVCreateUserAccessTokenRequest.getClass();
            C25113c cVar = MVCreateUserAccessTokenRequest.f30359b;
            gVar.mo61687K();
            if (mVCreateUserAccessTokenRequest.name != null) {
                gVar.mo61711x(MVCreateUserAccessTokenRequest.f30359b);
                gVar.mo61686J(mVCreateUserAccessTokenRequest.name);
                gVar.mo61712y();
            }
            if (mVCreateUserAccessTokenRequest.email != null) {
                gVar.mo61711x(MVCreateUserAccessTokenRequest.f30360c);
                gVar.mo61686J(mVCreateUserAccessTokenRequest.email);
                gVar.mo61712y();
            }
            if (mVCreateUserAccessTokenRequest.password != null) {
                gVar.mo61711x(MVCreateUserAccessTokenRequest.f30361d);
                gVar.mo61686J(mVCreateUserAccessTokenRequest.password);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCreateUserAccessTokenRequest mVCreateUserAccessTokenRequest = (MVCreateUserAccessTokenRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCreateUserAccessTokenRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVCreateUserAccessTokenRequest.password = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVCreateUserAccessTokenRequest.email = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVCreateUserAccessTokenRequest.name = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCreateUserAccessTokenRequest$b */
    public static class C11784b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11783a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCreateUserAccessTokenRequest$c */
    public static class C11785c extends C25240d<MVCreateUserAccessTokenRequest> {
        public C11785c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCreateUserAccessTokenRequest mVCreateUserAccessTokenRequest = (MVCreateUserAccessTokenRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCreateUserAccessTokenRequest.mo35056g()) {
                bitSet.set(0);
            }
            if (mVCreateUserAccessTokenRequest.mo35055f()) {
                bitSet.set(1);
            }
            if (mVCreateUserAccessTokenRequest.mo35057h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVCreateUserAccessTokenRequest.mo35056g()) {
                jVar.mo61686J(mVCreateUserAccessTokenRequest.name);
            }
            if (mVCreateUserAccessTokenRequest.mo35055f()) {
                jVar.mo61686J(mVCreateUserAccessTokenRequest.email);
            }
            if (mVCreateUserAccessTokenRequest.mo35057h()) {
                jVar.mo61686J(mVCreateUserAccessTokenRequest.password);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCreateUserAccessTokenRequest mVCreateUserAccessTokenRequest = (MVCreateUserAccessTokenRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVCreateUserAccessTokenRequest.name = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVCreateUserAccessTokenRequest.email = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVCreateUserAccessTokenRequest.password = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVCreateUserAccessTokenRequest$d */
    public static class C11786d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11785c(0);
        }
    }

    static {
        new C17394d0("MVCreateUserAccessTokenRequest");
        HashMap hashMap = new HashMap();
        f30362e = hashMap;
        hashMap.put(C25239c.class, new C11784b());
        hashMap.put(C25240d.class, new C11786d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.EMAIL, new FieldMetaData("email", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PASSWORD, new FieldMetaData("password", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30363f = unmodifiableMap;
        FieldMetaData.m61947a(MVCreateUserAccessTokenRequest.class, unmodifiableMap);
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
        ((C25238b) f30362e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30362e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCreateUserAccessTokenRequest mVCreateUserAccessTokenRequest = (MVCreateUserAccessTokenRequest) obj;
        if (!getClass().equals(mVCreateUserAccessTokenRequest.getClass())) {
            return getClass().getName().compareTo(mVCreateUserAccessTokenRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35056g()).compareTo(Boolean.valueOf(mVCreateUserAccessTokenRequest.mo35056g()));
        if (compareTo2 != 0 || ((mo35056g() && (compareTo2 = this.name.compareTo(mVCreateUserAccessTokenRequest.name)) != 0) || (compareTo2 = Boolean.valueOf(mo35055f()).compareTo(Boolean.valueOf(mVCreateUserAccessTokenRequest.mo35055f()))) != 0 || ((mo35055f() && (compareTo2 = this.email.compareTo(mVCreateUserAccessTokenRequest.email)) != 0) || (compareTo2 = Boolean.valueOf(mo35057h()).compareTo(Boolean.valueOf(mVCreateUserAccessTokenRequest.mo35057h()))) != 0))) {
            return compareTo2;
        }
        if (!mo35057h() || (compareTo = this.password.compareTo(mVCreateUserAccessTokenRequest.password)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCreateUserAccessTokenRequest)) {
            return false;
        }
        MVCreateUserAccessTokenRequest mVCreateUserAccessTokenRequest = (MVCreateUserAccessTokenRequest) obj;
        boolean g = mo35056g();
        boolean g2 = mVCreateUserAccessTokenRequest.mo35056g();
        if ((g || g2) && (!g || !g2 || !this.name.equals(mVCreateUserAccessTokenRequest.name))) {
            return false;
        }
        boolean f = mo35055f();
        boolean f2 = mVCreateUserAccessTokenRequest.mo35055f();
        if ((f || f2) && (!f || !f2 || !this.email.equals(mVCreateUserAccessTokenRequest.email))) {
            return false;
        }
        boolean h = mo35057h();
        boolean h2 = mVCreateUserAccessTokenRequest.mo35057h();
        if ((h || h2) && (!h || !h2 || !this.password.equals(mVCreateUserAccessTokenRequest.password))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35055f() {
        return this.email != null;
    }

    /* renamed from: g */
    public final boolean mo35056g() {
        return this.name != null;
    }

    /* renamed from: h */
    public final boolean mo35057h() {
        return this.password != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCreateUserAccessTokenRequest(", "name:");
        String str = this.name;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("email:");
        String str2 = this.email;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("password:");
        String str3 = this.password;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(")");
        return n.toString();
    }
}
