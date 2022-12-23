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

public class MVAddCreditCardWebUrlResponse implements TBase<MVAddCreditCardWebUrlResponse, _Fields>, Serializable, Cloneable, Comparable<MVAddCreditCardWebUrlResponse> {

    /* renamed from: b */
    public static final C25113c f27030b = new C25113c("webViewUrl", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27031c = new C25113c("completeUrl", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27032d = new C25113c("errorUrl", (byte) 11, 3);

    /* renamed from: e */
    public static final HashMap f27033e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27034f;
    public String completeUrl;
    public String errorUrl;
    public String webViewUrl;

    public enum _Fields implements C25085c {
        WEB_VIEW_URL(1, "webViewUrl"),
        COMPLETE_URL(2, "completeUrl"),
        ERROR_URL(3, "errorUrl");
        
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
                return WEB_VIEW_URL;
            }
            if (i == 2) {
                return COMPLETE_URL;
            }
            if (i != 3) {
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAddCreditCardWebUrlResponse$a */
    public static class C9553a extends C25239c<MVAddCreditCardWebUrlResponse> {
        public C9553a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAddCreditCardWebUrlResponse mVAddCreditCardWebUrlResponse = (MVAddCreditCardWebUrlResponse) tBase;
            mVAddCreditCardWebUrlResponse.getClass();
            C25113c cVar = MVAddCreditCardWebUrlResponse.f27030b;
            gVar.mo61687K();
            if (mVAddCreditCardWebUrlResponse.webViewUrl != null) {
                gVar.mo61711x(MVAddCreditCardWebUrlResponse.f27030b);
                gVar.mo61686J(mVAddCreditCardWebUrlResponse.webViewUrl);
                gVar.mo61712y();
            }
            if (mVAddCreditCardWebUrlResponse.completeUrl != null) {
                gVar.mo61711x(MVAddCreditCardWebUrlResponse.f27031c);
                gVar.mo61686J(mVAddCreditCardWebUrlResponse.completeUrl);
                gVar.mo61712y();
            }
            if (mVAddCreditCardWebUrlResponse.errorUrl != null) {
                gVar.mo61711x(MVAddCreditCardWebUrlResponse.f27032d);
                gVar.mo61686J(mVAddCreditCardWebUrlResponse.errorUrl);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAddCreditCardWebUrlResponse mVAddCreditCardWebUrlResponse = (MVAddCreditCardWebUrlResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAddCreditCardWebUrlResponse.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 11) {
                            mVAddCreditCardWebUrlResponse.errorUrl = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVAddCreditCardWebUrlResponse.completeUrl = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVAddCreditCardWebUrlResponse.webViewUrl = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAddCreditCardWebUrlResponse$b */
    public static class C9554b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9553a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAddCreditCardWebUrlResponse$c */
    public static class C9555c extends C25240d<MVAddCreditCardWebUrlResponse> {
        public C9555c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAddCreditCardWebUrlResponse mVAddCreditCardWebUrlResponse = (MVAddCreditCardWebUrlResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAddCreditCardWebUrlResponse.mo29465h()) {
                bitSet.set(0);
            }
            if (mVAddCreditCardWebUrlResponse.mo29463f()) {
                bitSet.set(1);
            }
            if (mVAddCreditCardWebUrlResponse.mo29464g()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVAddCreditCardWebUrlResponse.mo29465h()) {
                jVar.mo61686J(mVAddCreditCardWebUrlResponse.webViewUrl);
            }
            if (mVAddCreditCardWebUrlResponse.mo29463f()) {
                jVar.mo61686J(mVAddCreditCardWebUrlResponse.completeUrl);
            }
            if (mVAddCreditCardWebUrlResponse.mo29464g()) {
                jVar.mo61686J(mVAddCreditCardWebUrlResponse.errorUrl);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAddCreditCardWebUrlResponse mVAddCreditCardWebUrlResponse = (MVAddCreditCardWebUrlResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVAddCreditCardWebUrlResponse.webViewUrl = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVAddCreditCardWebUrlResponse.completeUrl = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVAddCreditCardWebUrlResponse.errorUrl = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVAddCreditCardWebUrlResponse$d */
    public static class C9556d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9555c(0);
        }
    }

    static {
        new C17394d0("MVAddCreditCardWebUrlResponse");
        HashMap hashMap = new HashMap();
        f27033e = hashMap;
        hashMap.put(C25239c.class, new C9554b());
        hashMap.put(C25240d.class, new C9556d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.WEB_VIEW_URL, new FieldMetaData("webViewUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.COMPLETE_URL, new FieldMetaData("completeUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ERROR_URL, new FieldMetaData("errorUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27034f = unmodifiableMap;
        FieldMetaData.m61947a(MVAddCreditCardWebUrlResponse.class, unmodifiableMap);
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
        ((C25238b) f27033e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27033e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAddCreditCardWebUrlResponse mVAddCreditCardWebUrlResponse = (MVAddCreditCardWebUrlResponse) obj;
        if (!getClass().equals(mVAddCreditCardWebUrlResponse.getClass())) {
            return getClass().getName().compareTo(mVAddCreditCardWebUrlResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29465h()).compareTo(Boolean.valueOf(mVAddCreditCardWebUrlResponse.mo29465h()));
        if (compareTo2 != 0 || ((mo29465h() && (compareTo2 = this.webViewUrl.compareTo(mVAddCreditCardWebUrlResponse.webViewUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo29463f()).compareTo(Boolean.valueOf(mVAddCreditCardWebUrlResponse.mo29463f()))) != 0 || ((mo29463f() && (compareTo2 = this.completeUrl.compareTo(mVAddCreditCardWebUrlResponse.completeUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo29464g()).compareTo(Boolean.valueOf(mVAddCreditCardWebUrlResponse.mo29464g()))) != 0))) {
            return compareTo2;
        }
        if (!mo29464g() || (compareTo = this.errorUrl.compareTo(mVAddCreditCardWebUrlResponse.errorUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAddCreditCardWebUrlResponse)) {
            return false;
        }
        MVAddCreditCardWebUrlResponse mVAddCreditCardWebUrlResponse = (MVAddCreditCardWebUrlResponse) obj;
        boolean h = mo29465h();
        boolean h2 = mVAddCreditCardWebUrlResponse.mo29465h();
        if ((h || h2) && (!h || !h2 || !this.webViewUrl.equals(mVAddCreditCardWebUrlResponse.webViewUrl))) {
            return false;
        }
        boolean f = mo29463f();
        boolean f2 = mVAddCreditCardWebUrlResponse.mo29463f();
        if ((f || f2) && (!f || !f2 || !this.completeUrl.equals(mVAddCreditCardWebUrlResponse.completeUrl))) {
            return false;
        }
        boolean g = mo29464g();
        boolean g2 = mVAddCreditCardWebUrlResponse.mo29464g();
        if ((g || g2) && (!g || !g2 || !this.errorUrl.equals(mVAddCreditCardWebUrlResponse.errorUrl))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29463f() {
        return this.completeUrl != null;
    }

    /* renamed from: g */
    public final boolean mo29464g() {
        return this.errorUrl != null;
    }

    /* renamed from: h */
    public final boolean mo29465h() {
        return this.webViewUrl != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAddCreditCardWebUrlResponse(", "webViewUrl:");
        String str = this.webViewUrl;
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
