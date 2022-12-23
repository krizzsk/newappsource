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

public class MVTokenizeCreditCardEncryptedResponse implements TBase<MVTokenizeCreditCardEncryptedResponse, _Fields>, Serializable, Cloneable, Comparable<MVTokenizeCreditCardEncryptedResponse> {

    /* renamed from: b */
    public static final C25113c f27744b = new C25113c(FirebaseMessagingService.EXTRA_TOKEN, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27745c = new C25113c("verificationUrl", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27746d = new C25113c("returnUrls", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f27747e = new C25113c("paymentToken", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f27748f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27749g;
    private _Fields[] optionals = {_Fields.VERIFICATION_URL, _Fields.PAYMENT_TOKEN};
    public String paymentToken;
    public MVTokenizeReturnUrls returnUrls;
    public String token;
    public String verificationUrl;

    public enum _Fields implements C25085c {
        TOKEN(1, FirebaseMessagingService.EXTRA_TOKEN),
        VERIFICATION_URL(2, "verificationUrl"),
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
                return VERIFICATION_URL;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeCreditCardEncryptedResponse$a */
    public static class C10097a extends C25239c<MVTokenizeCreditCardEncryptedResponse> {
        public C10097a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeCreditCardEncryptedResponse mVTokenizeCreditCardEncryptedResponse = (MVTokenizeCreditCardEncryptedResponse) tBase;
            MVTokenizeReturnUrls mVTokenizeReturnUrls = mVTokenizeCreditCardEncryptedResponse.returnUrls;
            C25113c cVar = MVTokenizeCreditCardEncryptedResponse.f27744b;
            gVar.mo61687K();
            if (mVTokenizeCreditCardEncryptedResponse.token != null) {
                gVar.mo61711x(MVTokenizeCreditCardEncryptedResponse.f27744b);
                gVar.mo61686J(mVTokenizeCreditCardEncryptedResponse.token);
                gVar.mo61712y();
            }
            if (mVTokenizeCreditCardEncryptedResponse.verificationUrl != null && mVTokenizeCreditCardEncryptedResponse.mo30674i()) {
                gVar.mo61711x(MVTokenizeCreditCardEncryptedResponse.f27745c);
                gVar.mo61686J(mVTokenizeCreditCardEncryptedResponse.verificationUrl);
                gVar.mo61712y();
            }
            if (mVTokenizeCreditCardEncryptedResponse.returnUrls != null) {
                gVar.mo61711x(MVTokenizeCreditCardEncryptedResponse.f27746d);
                mVTokenizeCreditCardEncryptedResponse.returnUrls.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTokenizeCreditCardEncryptedResponse.paymentToken != null && mVTokenizeCreditCardEncryptedResponse.mo30670f()) {
                gVar.mo61711x(MVTokenizeCreditCardEncryptedResponse.f27747e);
                gVar.mo61686J(mVTokenizeCreditCardEncryptedResponse.paymentToken);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeCreditCardEncryptedResponse mVTokenizeCreditCardEncryptedResponse = (MVTokenizeCreditCardEncryptedResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTokenizeReturnUrls mVTokenizeReturnUrls = mVTokenizeCreditCardEncryptedResponse.returnUrls;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVTokenizeCreditCardEncryptedResponse.paymentToken = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVTokenizeReturnUrls mVTokenizeReturnUrls2 = new MVTokenizeReturnUrls();
                            mVTokenizeCreditCardEncryptedResponse.returnUrls = mVTokenizeReturnUrls2;
                            mVTokenizeReturnUrls2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVTokenizeCreditCardEncryptedResponse.verificationUrl = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTokenizeCreditCardEncryptedResponse.token = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeCreditCardEncryptedResponse$b */
    public static class C10098b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10097a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeCreditCardEncryptedResponse$c */
    public static class C10099c extends C25240d<MVTokenizeCreditCardEncryptedResponse> {
        public C10099c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeCreditCardEncryptedResponse mVTokenizeCreditCardEncryptedResponse = (MVTokenizeCreditCardEncryptedResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTokenizeCreditCardEncryptedResponse.mo30672h()) {
                bitSet.set(0);
            }
            if (mVTokenizeCreditCardEncryptedResponse.mo30674i()) {
                bitSet.set(1);
            }
            if (mVTokenizeCreditCardEncryptedResponse.mo30671g()) {
                bitSet.set(2);
            }
            if (mVTokenizeCreditCardEncryptedResponse.mo30670f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTokenizeCreditCardEncryptedResponse.mo30672h()) {
                jVar.mo61686J(mVTokenizeCreditCardEncryptedResponse.token);
            }
            if (mVTokenizeCreditCardEncryptedResponse.mo30674i()) {
                jVar.mo61686J(mVTokenizeCreditCardEncryptedResponse.verificationUrl);
            }
            if (mVTokenizeCreditCardEncryptedResponse.mo30671g()) {
                mVTokenizeCreditCardEncryptedResponse.returnUrls.mo25202X0(jVar);
            }
            if (mVTokenizeCreditCardEncryptedResponse.mo30670f()) {
                jVar.mo61686J(mVTokenizeCreditCardEncryptedResponse.paymentToken);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeCreditCardEncryptedResponse mVTokenizeCreditCardEncryptedResponse = (MVTokenizeCreditCardEncryptedResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTokenizeCreditCardEncryptedResponse.token = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTokenizeCreditCardEncryptedResponse.verificationUrl = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVTokenizeReturnUrls mVTokenizeReturnUrls = new MVTokenizeReturnUrls();
                mVTokenizeCreditCardEncryptedResponse.returnUrls = mVTokenizeReturnUrls;
                mVTokenizeReturnUrls.mo25201C1(jVar);
            }
            if (T.get(3)) {
                mVTokenizeCreditCardEncryptedResponse.paymentToken = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeCreditCardEncryptedResponse$d */
    public static class C10100d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10099c(0);
        }
    }

    static {
        new C17394d0("MVTokenizeCreditCardEncryptedResponse");
        HashMap hashMap = new HashMap();
        f27748f = hashMap;
        hashMap.put(C25239c.class, new C10098b());
        hashMap.put(C25240d.class, new C10100d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TOKEN, new FieldMetaData(FirebaseMessagingService.EXTRA_TOKEN, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VERIFICATION_URL, new FieldMetaData("verificationUrl", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RETURN_URLS, new FieldMetaData("returnUrls", (byte) 3, new StructMetaData(MVTokenizeReturnUrls.class)));
        enumMap.put(_Fields.PAYMENT_TOKEN, new FieldMetaData("paymentToken", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27749g = unmodifiableMap;
        FieldMetaData.m61947a(MVTokenizeCreditCardEncryptedResponse.class, unmodifiableMap);
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
        ((C25238b) f27748f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27748f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTokenizeCreditCardEncryptedResponse mVTokenizeCreditCardEncryptedResponse = (MVTokenizeCreditCardEncryptedResponse) obj;
        if (!getClass().equals(mVTokenizeCreditCardEncryptedResponse.getClass())) {
            return getClass().getName().compareTo(mVTokenizeCreditCardEncryptedResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30672h()).compareTo(Boolean.valueOf(mVTokenizeCreditCardEncryptedResponse.mo30672h()));
        if (compareTo2 != 0 || ((mo30672h() && (compareTo2 = this.token.compareTo(mVTokenizeCreditCardEncryptedResponse.token)) != 0) || (compareTo2 = Boolean.valueOf(mo30674i()).compareTo(Boolean.valueOf(mVTokenizeCreditCardEncryptedResponse.mo30674i()))) != 0 || ((mo30674i() && (compareTo2 = this.verificationUrl.compareTo(mVTokenizeCreditCardEncryptedResponse.verificationUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo30671g()).compareTo(Boolean.valueOf(mVTokenizeCreditCardEncryptedResponse.mo30671g()))) != 0 || ((mo30671g() && (compareTo2 = this.returnUrls.compareTo(mVTokenizeCreditCardEncryptedResponse.returnUrls)) != 0) || (compareTo2 = Boolean.valueOf(mo30670f()).compareTo(Boolean.valueOf(mVTokenizeCreditCardEncryptedResponse.mo30670f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo30670f() || (compareTo = this.paymentToken.compareTo(mVTokenizeCreditCardEncryptedResponse.paymentToken)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTokenizeCreditCardEncryptedResponse)) {
            return false;
        }
        MVTokenizeCreditCardEncryptedResponse mVTokenizeCreditCardEncryptedResponse = (MVTokenizeCreditCardEncryptedResponse) obj;
        boolean h = mo30672h();
        boolean h2 = mVTokenizeCreditCardEncryptedResponse.mo30672h();
        if ((h || h2) && (!h || !h2 || !this.token.equals(mVTokenizeCreditCardEncryptedResponse.token))) {
            return false;
        }
        boolean i = mo30674i();
        boolean i2 = mVTokenizeCreditCardEncryptedResponse.mo30674i();
        if ((i || i2) && (!i || !i2 || !this.verificationUrl.equals(mVTokenizeCreditCardEncryptedResponse.verificationUrl))) {
            return false;
        }
        boolean g = mo30671g();
        boolean g2 = mVTokenizeCreditCardEncryptedResponse.mo30671g();
        if ((g || g2) && (!g || !g2 || !this.returnUrls.mo30695a(mVTokenizeCreditCardEncryptedResponse.returnUrls))) {
            return false;
        }
        boolean f = mo30670f();
        boolean f2 = mVTokenizeCreditCardEncryptedResponse.mo30670f();
        if ((f || f2) && (!f || !f2 || !this.paymentToken.equals(mVTokenizeCreditCardEncryptedResponse.paymentToken))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30670f() {
        return this.paymentToken != null;
    }

    /* renamed from: g */
    public final boolean mo30671g() {
        return this.returnUrls != null;
    }

    /* renamed from: h */
    public final boolean mo30672h() {
        return this.token != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30674i() {
        return this.verificationUrl != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTokenizeCreditCardEncryptedResponse(", "token:");
        String str = this.token;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo30674i()) {
            n.append(", ");
            n.append("verificationUrl:");
            String str2 = this.verificationUrl;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        n.append(", ");
        n.append("returnUrls:");
        MVTokenizeReturnUrls mVTokenizeReturnUrls = this.returnUrls;
        if (mVTokenizeReturnUrls == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTokenizeReturnUrls);
        }
        if (mo30670f()) {
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
