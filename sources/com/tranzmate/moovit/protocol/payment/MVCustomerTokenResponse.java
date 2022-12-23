package com.tranzmate.moovit.protocol.payment;

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
import org.apache.thrift.meta_data.EnumMetaData;
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

public class MVCustomerTokenResponse implements TBase<MVCustomerTokenResponse, _Fields>, Serializable, Cloneable, Comparable<MVCustomerTokenResponse> {

    /* renamed from: b */
    public static final C25113c f26879b = new C25113c("customerToken", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26880c = new C25113c("zoozVersion", (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f26881d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26882e;
    public String customerToken;
    private _Fields[] optionals = {_Fields.ZOOZ_VERSION};
    public MVZoozVersion zoozVersion;

    public enum _Fields implements C25085c {
        CUSTOMER_TOKEN(1, "customerToken"),
        ZOOZ_VERSION(2, "zoozVersion");
        
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
                return CUSTOMER_TOKEN;
            }
            if (i != 2) {
                return null;
            }
            return ZOOZ_VERSION;
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

    /* renamed from: com.tranzmate.moovit.protocol.payment.MVCustomerTokenResponse$a */
    public static class C9449a extends C25239c<MVCustomerTokenResponse> {
        public C9449a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCustomerTokenResponse mVCustomerTokenResponse = (MVCustomerTokenResponse) tBase;
            mVCustomerTokenResponse.getClass();
            C25113c cVar = MVCustomerTokenResponse.f26879b;
            gVar.mo61687K();
            if (mVCustomerTokenResponse.customerToken != null) {
                gVar.mo61711x(MVCustomerTokenResponse.f26879b);
                gVar.mo61686J(mVCustomerTokenResponse.customerToken);
                gVar.mo61712y();
            }
            if (mVCustomerTokenResponse.zoozVersion != null && mVCustomerTokenResponse.mo29241g()) {
                gVar.mo61711x(MVCustomerTokenResponse.f26880c);
                gVar.mo61678B(mVCustomerTokenResponse.zoozVersion.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCustomerTokenResponse mVCustomerTokenResponse = (MVCustomerTokenResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCustomerTokenResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVCustomerTokenResponse.zoozVersion = MVZoozVersion.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVCustomerTokenResponse.customerToken = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payment.MVCustomerTokenResponse$b */
    public static class C9450b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9449a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payment.MVCustomerTokenResponse$c */
    public static class C9451c extends C25240d<MVCustomerTokenResponse> {
        public C9451c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCustomerTokenResponse mVCustomerTokenResponse = (MVCustomerTokenResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCustomerTokenResponse.mo29240f()) {
                bitSet.set(0);
            }
            if (mVCustomerTokenResponse.mo29241g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVCustomerTokenResponse.mo29240f()) {
                jVar.mo61686J(mVCustomerTokenResponse.customerToken);
            }
            if (mVCustomerTokenResponse.mo29241g()) {
                jVar.mo61678B(mVCustomerTokenResponse.zoozVersion.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCustomerTokenResponse mVCustomerTokenResponse = (MVCustomerTokenResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVCustomerTokenResponse.customerToken = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVCustomerTokenResponse.zoozVersion = MVZoozVersion.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payment.MVCustomerTokenResponse$d */
    public static class C9452d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9451c(0);
        }
    }

    static {
        new C17394d0("MVCustomerTokenResponse");
        HashMap hashMap = new HashMap();
        f26881d = hashMap;
        hashMap.put(C25239c.class, new C9450b());
        hashMap.put(C25240d.class, new C9452d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CUSTOMER_TOKEN, new FieldMetaData("customerToken", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ZOOZ_VERSION, new FieldMetaData("zoozVersion", (byte) 2, new EnumMetaData(MVZoozVersion.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26882e = unmodifiableMap;
        FieldMetaData.m61947a(MVCustomerTokenResponse.class, unmodifiableMap);
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
        ((C25238b) f26881d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26881d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCustomerTokenResponse mVCustomerTokenResponse = (MVCustomerTokenResponse) obj;
        if (!getClass().equals(mVCustomerTokenResponse.getClass())) {
            return getClass().getName().compareTo(mVCustomerTokenResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29240f()).compareTo(Boolean.valueOf(mVCustomerTokenResponse.mo29240f()));
        if (compareTo2 != 0 || ((mo29240f() && (compareTo2 = this.customerToken.compareTo(mVCustomerTokenResponse.customerToken)) != 0) || (compareTo2 = Boolean.valueOf(mo29241g()).compareTo(Boolean.valueOf(mVCustomerTokenResponse.mo29241g()))) != 0)) {
            return compareTo2;
        }
        if (!mo29241g() || (compareTo = this.zoozVersion.compareTo(mVCustomerTokenResponse.zoozVersion)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCustomerTokenResponse)) {
            return false;
        }
        MVCustomerTokenResponse mVCustomerTokenResponse = (MVCustomerTokenResponse) obj;
        boolean f = mo29240f();
        boolean f2 = mVCustomerTokenResponse.mo29240f();
        if ((f || f2) && (!f || !f2 || !this.customerToken.equals(mVCustomerTokenResponse.customerToken))) {
            return false;
        }
        boolean g = mo29241g();
        boolean g2 = mVCustomerTokenResponse.mo29241g();
        if ((g || g2) && (!g || !g2 || !this.zoozVersion.equals(mVCustomerTokenResponse.zoozVersion))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29240f() {
        return this.customerToken != null;
    }

    /* renamed from: g */
    public final boolean mo29241g() {
        return this.zoozVersion != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCustomerTokenResponse(", "customerToken:");
        String str = this.customerToken;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo29241g()) {
            n.append(", ");
            n.append("zoozVersion:");
            MVZoozVersion mVZoozVersion = this.zoozVersion;
            if (mVZoozVersion == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVZoozVersion);
            }
        }
        n.append(")");
        return n.toString();
    }
}
