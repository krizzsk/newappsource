package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
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
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVTokenizeExternalPaymentMethodResponse implements TBase<MVTokenizeExternalPaymentMethodResponse, _Fields>, Serializable, Cloneable, Comparable<MVTokenizeExternalPaymentMethodResponse> {

    /* renamed from: b */
    public static final C25113c f27756b = new C25113c(FirebaseMessagingService.EXTRA_TOKEN, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27757c = new C25113c("redirectUrl", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27758d = new C25113c("returnUrls", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f27759e = new C25113c("paymentToken", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f27760f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27761g;
    private _Fields[] optionals = {_Fields.PAYMENT_TOKEN};
    public String paymentToken;
    public String redirectUrl;
    public MVTokenizeReturnUrls returnUrls;
    public String token;

    public enum _Fields implements C25085c {
        TOKEN(1, FirebaseMessagingService.EXTRA_TOKEN),
        REDIRECT_URL(2, "redirectUrl"),
        RETURN_URLS(3, "returnUrls"),
        PAYMENT_TOKEN(4, "paymentToken");
        
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
                return TOKEN;
            }
            if (i == 2) {
                return REDIRECT_URL;
            }
            if (i == 3) {
                return RETURN_URLS;
            }
            if (i != 4) {
                return null;
            }
            return PAYMENT_TOKEN;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeExternalPaymentMethodResponse$a */
    public static class C10105a extends C25239c<MVTokenizeExternalPaymentMethodResponse> {
        public C10105a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeExternalPaymentMethodResponse mVTokenizeExternalPaymentMethodResponse = (MVTokenizeExternalPaymentMethodResponse) tBase;
            MVTokenizeReturnUrls mVTokenizeReturnUrls = mVTokenizeExternalPaymentMethodResponse.returnUrls;
            C25113c cVar = MVTokenizeExternalPaymentMethodResponse.f27756b;
            gVar.mo61687K();
            if (mVTokenizeExternalPaymentMethodResponse.token != null) {
                gVar.mo61711x(MVTokenizeExternalPaymentMethodResponse.f27756b);
                gVar.mo61686J(mVTokenizeExternalPaymentMethodResponse.token);
                gVar.mo61712y();
            }
            if (mVTokenizeExternalPaymentMethodResponse.redirectUrl != null) {
                gVar.mo61711x(MVTokenizeExternalPaymentMethodResponse.f27757c);
                gVar.mo61686J(mVTokenizeExternalPaymentMethodResponse.redirectUrl);
                gVar.mo61712y();
            }
            if (mVTokenizeExternalPaymentMethodResponse.returnUrls != null) {
                gVar.mo61711x(MVTokenizeExternalPaymentMethodResponse.f27758d);
                mVTokenizeExternalPaymentMethodResponse.returnUrls.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTokenizeExternalPaymentMethodResponse.paymentToken != null && mVTokenizeExternalPaymentMethodResponse.mo30688f()) {
                gVar.mo61711x(MVTokenizeExternalPaymentMethodResponse.f27759e);
                gVar.mo61686J(mVTokenizeExternalPaymentMethodResponse.paymentToken);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeExternalPaymentMethodResponse mVTokenizeExternalPaymentMethodResponse = (MVTokenizeExternalPaymentMethodResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTokenizeReturnUrls mVTokenizeReturnUrls = mVTokenizeExternalPaymentMethodResponse.returnUrls;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVTokenizeExternalPaymentMethodResponse.paymentToken = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVTokenizeReturnUrls mVTokenizeReturnUrls2 = new MVTokenizeReturnUrls();
                            mVTokenizeExternalPaymentMethodResponse.returnUrls = mVTokenizeReturnUrls2;
                            mVTokenizeReturnUrls2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVTokenizeExternalPaymentMethodResponse.redirectUrl = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTokenizeExternalPaymentMethodResponse.token = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeExternalPaymentMethodResponse$b */
    public static class C10106b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10105a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeExternalPaymentMethodResponse$c */
    public static class C10107c extends C25240d<MVTokenizeExternalPaymentMethodResponse> {
        public C10107c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeExternalPaymentMethodResponse mVTokenizeExternalPaymentMethodResponse = (MVTokenizeExternalPaymentMethodResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTokenizeExternalPaymentMethodResponse.mo30692i()) {
                bitSet.set(0);
            }
            if (mVTokenizeExternalPaymentMethodResponse.mo30689g()) {
                bitSet.set(1);
            }
            if (mVTokenizeExternalPaymentMethodResponse.mo30690h()) {
                bitSet.set(2);
            }
            if (mVTokenizeExternalPaymentMethodResponse.mo30688f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTokenizeExternalPaymentMethodResponse.mo30692i()) {
                jVar.mo61686J(mVTokenizeExternalPaymentMethodResponse.token);
            }
            if (mVTokenizeExternalPaymentMethodResponse.mo30689g()) {
                jVar.mo61686J(mVTokenizeExternalPaymentMethodResponse.redirectUrl);
            }
            if (mVTokenizeExternalPaymentMethodResponse.mo30690h()) {
                mVTokenizeExternalPaymentMethodResponse.returnUrls.mo25202X0(jVar);
            }
            if (mVTokenizeExternalPaymentMethodResponse.mo30688f()) {
                jVar.mo61686J(mVTokenizeExternalPaymentMethodResponse.paymentToken);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeExternalPaymentMethodResponse mVTokenizeExternalPaymentMethodResponse = (MVTokenizeExternalPaymentMethodResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTokenizeExternalPaymentMethodResponse.token = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTokenizeExternalPaymentMethodResponse.redirectUrl = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVTokenizeReturnUrls mVTokenizeReturnUrls = new MVTokenizeReturnUrls();
                mVTokenizeExternalPaymentMethodResponse.returnUrls = mVTokenizeReturnUrls;
                mVTokenizeReturnUrls.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVTokenizeExternalPaymentMethodResponse.paymentToken = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeExternalPaymentMethodResponse$d */
    public static class C10108d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10107c(0);
        }
    }

    static {
        new C17394d0("MVTokenizeExternalPaymentMethodResponse");
        HashMap hashMap = new HashMap();
        f27760f = hashMap;
        hashMap.put(C25239c.class, new C10106b());
        hashMap.put(C25240d.class, new C10108d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TOKEN, new FieldMetaData(FirebaseMessagingService.EXTRA_TOKEN, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.REDIRECT_URL, new FieldMetaData("redirectUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RETURN_URLS, new FieldMetaData("returnUrls", (byte) 3, new StructMetaData(MVTokenizeReturnUrls.class)));
        enumMap.put(_Fields.PAYMENT_TOKEN, new FieldMetaData("paymentToken", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27761g = unmodifiableMap;
        FieldMetaData.m61947a(MVTokenizeExternalPaymentMethodResponse.class, unmodifiableMap);
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
        ((C25238b) f27760f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27760f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTokenizeExternalPaymentMethodResponse mVTokenizeExternalPaymentMethodResponse = (MVTokenizeExternalPaymentMethodResponse) obj;
        if (!getClass().equals(mVTokenizeExternalPaymentMethodResponse.getClass())) {
            return getClass().getName().compareTo(mVTokenizeExternalPaymentMethodResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30692i()).compareTo(Boolean.valueOf(mVTokenizeExternalPaymentMethodResponse.mo30692i()));
        if (compareTo2 != 0 || ((mo30692i() && (compareTo2 = this.token.compareTo(mVTokenizeExternalPaymentMethodResponse.token)) != 0) || (compareTo2 = Boolean.valueOf(mo30689g()).compareTo(Boolean.valueOf(mVTokenizeExternalPaymentMethodResponse.mo30689g()))) != 0 || ((mo30689g() && (compareTo2 = this.redirectUrl.compareTo(mVTokenizeExternalPaymentMethodResponse.redirectUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo30690h()).compareTo(Boolean.valueOf(mVTokenizeExternalPaymentMethodResponse.mo30690h()))) != 0 || ((mo30690h() && (compareTo2 = this.returnUrls.compareTo(mVTokenizeExternalPaymentMethodResponse.returnUrls)) != 0) || (compareTo2 = Boolean.valueOf(mo30688f()).compareTo(Boolean.valueOf(mVTokenizeExternalPaymentMethodResponse.mo30688f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo30688f() || (compareTo = this.paymentToken.compareTo(mVTokenizeExternalPaymentMethodResponse.paymentToken)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTokenizeExternalPaymentMethodResponse)) {
            return false;
        }
        MVTokenizeExternalPaymentMethodResponse mVTokenizeExternalPaymentMethodResponse = (MVTokenizeExternalPaymentMethodResponse) obj;
        boolean i = mo30692i();
        boolean i2 = mVTokenizeExternalPaymentMethodResponse.mo30692i();
        if ((i || i2) && (!i || !i2 || !this.token.equals(mVTokenizeExternalPaymentMethodResponse.token))) {
            return false;
        }
        boolean g = mo30689g();
        boolean g2 = mVTokenizeExternalPaymentMethodResponse.mo30689g();
        if ((g || g2) && (!g || !g2 || !this.redirectUrl.equals(mVTokenizeExternalPaymentMethodResponse.redirectUrl))) {
            return false;
        }
        boolean h = mo30690h();
        boolean h2 = mVTokenizeExternalPaymentMethodResponse.mo30690h();
        if ((h || h2) && (!h || !h2 || !this.returnUrls.mo30695a(mVTokenizeExternalPaymentMethodResponse.returnUrls))) {
            return false;
        }
        boolean f = mo30688f();
        boolean f2 = mVTokenizeExternalPaymentMethodResponse.mo30688f();
        if ((f || f2) && (!f || !f2 || !this.paymentToken.equals(mVTokenizeExternalPaymentMethodResponse.paymentToken))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30688f() {
        return this.paymentToken != null;
    }

    /* renamed from: g */
    public final boolean mo30689g() {
        return this.redirectUrl != null;
    }

    /* renamed from: h */
    public final boolean mo30690h() {
        return this.returnUrls != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30692i() {
        return this.token != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTokenizeExternalPaymentMethodResponse(", "token:");
        String str = this.token;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("redirectUrl:");
        String str2 = this.redirectUrl;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("returnUrls:");
        MVTokenizeReturnUrls mVTokenizeReturnUrls = this.returnUrls;
        if (mVTokenizeReturnUrls == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTokenizeReturnUrls);
        }
        if (mo30688f()) {
            n.append(", ");
            n.append("paymentToken:");
            String str3 = this.paymentToken;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(")");
        return n.toString();
    }
}
