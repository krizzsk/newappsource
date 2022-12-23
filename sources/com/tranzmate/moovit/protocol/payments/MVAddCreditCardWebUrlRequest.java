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

public class MVAddCreditCardWebUrlRequest implements TBase<MVAddCreditCardWebUrlRequest, _Fields>, Serializable, Cloneable, Comparable<MVAddCreditCardWebUrlRequest> {

    /* renamed from: b */
    public static final C25113c f27024b = new C25113c("clearanceProvider", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27025c = new C25113c("merchantIdentifier", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27026d = new C25113c("completeUrl", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27027e = new C25113c("errorUrl", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f27028f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27029g;
    public MVClearanceProviderType clearanceProvider;
    public String completeUrl;
    public String errorUrl;
    public String merchantIdentifier;

    public enum _Fields implements C25085c {
        CLEARANCE_PROVIDER(1, "clearanceProvider"),
        MERCHANT_IDENTIFIER(2, "merchantIdentifier"),
        COMPLETE_URL(3, "completeUrl"),
        ERROR_URL(4, "errorUrl");
        
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
                return CLEARANCE_PROVIDER;
            }
            if (i == 2) {
                return MERCHANT_IDENTIFIER;
            }
            if (i == 3) {
                return COMPLETE_URL;
            }
            if (i != 4) {
                return null;
            }
            return ERROR_URL;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAddCreditCardWebUrlRequest$a */
    public static class C9549a extends C25239c<MVAddCreditCardWebUrlRequest> {
        public C9549a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAddCreditCardWebUrlRequest mVAddCreditCardWebUrlRequest = (MVAddCreditCardWebUrlRequest) tBase;
            mVAddCreditCardWebUrlRequest.getClass();
            C25113c cVar = MVAddCreditCardWebUrlRequest.f27024b;
            gVar.mo61687K();
            if (mVAddCreditCardWebUrlRequest.clearanceProvider != null) {
                gVar.mo61711x(MVAddCreditCardWebUrlRequest.f27024b);
                gVar.mo61678B(mVAddCreditCardWebUrlRequest.clearanceProvider.getValue());
                gVar.mo61712y();
            }
            if (mVAddCreditCardWebUrlRequest.merchantIdentifier != null) {
                gVar.mo61711x(MVAddCreditCardWebUrlRequest.f27025c);
                gVar.mo61686J(mVAddCreditCardWebUrlRequest.merchantIdentifier);
                gVar.mo61712y();
            }
            if (mVAddCreditCardWebUrlRequest.completeUrl != null) {
                gVar.mo61711x(MVAddCreditCardWebUrlRequest.f27026d);
                gVar.mo61686J(mVAddCreditCardWebUrlRequest.completeUrl);
                gVar.mo61712y();
            }
            if (mVAddCreditCardWebUrlRequest.errorUrl != null) {
                gVar.mo61711x(MVAddCreditCardWebUrlRequest.f27027e);
                gVar.mo61686J(mVAddCreditCardWebUrlRequest.errorUrl);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAddCreditCardWebUrlRequest mVAddCreditCardWebUrlRequest = (MVAddCreditCardWebUrlRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAddCreditCardWebUrlRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVAddCreditCardWebUrlRequest.errorUrl = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVAddCreditCardWebUrlRequest.completeUrl = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVAddCreditCardWebUrlRequest.merchantIdentifier = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVAddCreditCardWebUrlRequest.clearanceProvider = MVClearanceProviderType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAddCreditCardWebUrlRequest$b */
    public static class C9550b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9549a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAddCreditCardWebUrlRequest$c */
    public static class C9551c extends C25240d<MVAddCreditCardWebUrlRequest> {
        public C9551c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAddCreditCardWebUrlRequest mVAddCreditCardWebUrlRequest = (MVAddCreditCardWebUrlRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAddCreditCardWebUrlRequest.mo29454f()) {
                bitSet.set(0);
            }
            if (mVAddCreditCardWebUrlRequest.mo29458i()) {
                bitSet.set(1);
            }
            if (mVAddCreditCardWebUrlRequest.mo29455g()) {
                bitSet.set(2);
            }
            if (mVAddCreditCardWebUrlRequest.mo29456h()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVAddCreditCardWebUrlRequest.mo29454f()) {
                jVar.mo61678B(mVAddCreditCardWebUrlRequest.clearanceProvider.getValue());
            }
            if (mVAddCreditCardWebUrlRequest.mo29458i()) {
                jVar.mo61686J(mVAddCreditCardWebUrlRequest.merchantIdentifier);
            }
            if (mVAddCreditCardWebUrlRequest.mo29455g()) {
                jVar.mo61686J(mVAddCreditCardWebUrlRequest.completeUrl);
            }
            if (mVAddCreditCardWebUrlRequest.mo29456h()) {
                jVar.mo61686J(mVAddCreditCardWebUrlRequest.errorUrl);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAddCreditCardWebUrlRequest mVAddCreditCardWebUrlRequest = (MVAddCreditCardWebUrlRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVAddCreditCardWebUrlRequest.clearanceProvider = MVClearanceProviderType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVAddCreditCardWebUrlRequest.merchantIdentifier = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVAddCreditCardWebUrlRequest.completeUrl = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVAddCreditCardWebUrlRequest.errorUrl = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAddCreditCardWebUrlRequest$d */
    public static class C9552d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9551c(0);
        }
    }

    static {
        new C17394d0("MVAddCreditCardWebUrlRequest");
        HashMap hashMap = new HashMap();
        f27028f = hashMap;
        hashMap.put(C25239c.class, new C9550b());
        hashMap.put(C25240d.class, new C9552d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CLEARANCE_PROVIDER, new FieldMetaData("clearanceProvider", (byte) 3, new EnumMetaData(MVClearanceProviderType.class)));
        enumMap.put(_Fields.MERCHANT_IDENTIFIER, new FieldMetaData("merchantIdentifier", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.COMPLETE_URL, new FieldMetaData("completeUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ERROR_URL, new FieldMetaData("errorUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27029g = unmodifiableMap;
        FieldMetaData.m61947a(MVAddCreditCardWebUrlRequest.class, unmodifiableMap);
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
        ((C25238b) f27028f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27028f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAddCreditCardWebUrlRequest mVAddCreditCardWebUrlRequest = (MVAddCreditCardWebUrlRequest) obj;
        if (!getClass().equals(mVAddCreditCardWebUrlRequest.getClass())) {
            return getClass().getName().compareTo(mVAddCreditCardWebUrlRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29454f()).compareTo(Boolean.valueOf(mVAddCreditCardWebUrlRequest.mo29454f()));
        if (compareTo2 != 0 || ((mo29454f() && (compareTo2 = this.clearanceProvider.compareTo(mVAddCreditCardWebUrlRequest.clearanceProvider)) != 0) || (compareTo2 = Boolean.valueOf(mo29458i()).compareTo(Boolean.valueOf(mVAddCreditCardWebUrlRequest.mo29458i()))) != 0 || ((mo29458i() && (compareTo2 = this.merchantIdentifier.compareTo(mVAddCreditCardWebUrlRequest.merchantIdentifier)) != 0) || (compareTo2 = Boolean.valueOf(mo29455g()).compareTo(Boolean.valueOf(mVAddCreditCardWebUrlRequest.mo29455g()))) != 0 || ((mo29455g() && (compareTo2 = this.completeUrl.compareTo(mVAddCreditCardWebUrlRequest.completeUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo29456h()).compareTo(Boolean.valueOf(mVAddCreditCardWebUrlRequest.mo29456h()))) != 0)))) {
            return compareTo2;
        }
        if (!mo29456h() || (compareTo = this.errorUrl.compareTo(mVAddCreditCardWebUrlRequest.errorUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAddCreditCardWebUrlRequest)) {
            return false;
        }
        MVAddCreditCardWebUrlRequest mVAddCreditCardWebUrlRequest = (MVAddCreditCardWebUrlRequest) obj;
        boolean f = mo29454f();
        boolean f2 = mVAddCreditCardWebUrlRequest.mo29454f();
        if ((f || f2) && (!f || !f2 || !this.clearanceProvider.equals(mVAddCreditCardWebUrlRequest.clearanceProvider))) {
            return false;
        }
        boolean i = mo29458i();
        boolean i2 = mVAddCreditCardWebUrlRequest.mo29458i();
        if ((i || i2) && (!i || !i2 || !this.merchantIdentifier.equals(mVAddCreditCardWebUrlRequest.merchantIdentifier))) {
            return false;
        }
        boolean g = mo29455g();
        boolean g2 = mVAddCreditCardWebUrlRequest.mo29455g();
        if ((g || g2) && (!g || !g2 || !this.completeUrl.equals(mVAddCreditCardWebUrlRequest.completeUrl))) {
            return false;
        }
        boolean h = mo29456h();
        boolean h2 = mVAddCreditCardWebUrlRequest.mo29456h();
        if ((h || h2) && (!h || !h2 || !this.errorUrl.equals(mVAddCreditCardWebUrlRequest.errorUrl))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29454f() {
        return this.clearanceProvider != null;
    }

    /* renamed from: g */
    public final boolean mo29455g() {
        return this.completeUrl != null;
    }

    /* renamed from: h */
    public final boolean mo29456h() {
        return this.errorUrl != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29458i() {
        return this.merchantIdentifier != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAddCreditCardWebUrlRequest(", "clearanceProvider:");
        MVClearanceProviderType mVClearanceProviderType = this.clearanceProvider;
        if (mVClearanceProviderType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVClearanceProviderType);
        }
        n.append(", ");
        n.append("merchantIdentifier:");
        String str = this.merchantIdentifier;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("completeUrl:");
        String str2 = this.completeUrl;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("errorUrl:");
        String str3 = this.errorUrl;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(")");
        return n.toString();
    }
}
