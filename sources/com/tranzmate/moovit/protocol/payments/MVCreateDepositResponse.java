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

public class MVCreateDepositResponse implements TBase<MVCreateDepositResponse, _Fields>, Serializable, Cloneable, Comparable<MVCreateDepositResponse> {

    /* renamed from: b */
    public static final C25113c f27208b = new C25113c(FirebaseMessagingService.EXTRA_TOKEN, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27209c = new C25113c("verificationUrl", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27210d = new C25113c("returnUrls", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f27211e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27212f;
    private _Fields[] optionals = {_Fields.VERIFICATION_URL};
    public MVTokenizeReturnUrls returnUrls;
    public String token;
    public String verificationUrl;

    public enum _Fields implements C25085c {
        TOKEN(1, FirebaseMessagingService.EXTRA_TOKEN),
        VERIFICATION_URL(2, "verificationUrl"),
        RETURN_URLS(3, "returnUrls");
        
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
            if (i != 3) {
                return null;
            }
            return RETURN_URLS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCreateDepositResponse$a */
    public static class C9688a extends C25239c<MVCreateDepositResponse> {
        public C9688a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCreateDepositResponse mVCreateDepositResponse = (MVCreateDepositResponse) tBase;
            MVTokenizeReturnUrls mVTokenizeReturnUrls = mVCreateDepositResponse.returnUrls;
            C25113c cVar = MVCreateDepositResponse.f27208b;
            gVar.mo61687K();
            if (mVCreateDepositResponse.token != null) {
                gVar.mo61711x(MVCreateDepositResponse.f27208b);
                gVar.mo61686J(mVCreateDepositResponse.token);
                gVar.mo61712y();
            }
            if (mVCreateDepositResponse.verificationUrl != null && mVCreateDepositResponse.mo29762h()) {
                gVar.mo61711x(MVCreateDepositResponse.f27209c);
                gVar.mo61686J(mVCreateDepositResponse.verificationUrl);
                gVar.mo61712y();
            }
            if (mVCreateDepositResponse.returnUrls != null) {
                gVar.mo61711x(MVCreateDepositResponse.f27210d);
                mVCreateDepositResponse.returnUrls.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCreateDepositResponse mVCreateDepositResponse = (MVCreateDepositResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTokenizeReturnUrls mVTokenizeReturnUrls = mVCreateDepositResponse.returnUrls;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVTokenizeReturnUrls mVTokenizeReturnUrls2 = new MVTokenizeReturnUrls();
                            mVCreateDepositResponse.returnUrls = mVTokenizeReturnUrls2;
                            mVTokenizeReturnUrls2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVCreateDepositResponse.verificationUrl = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVCreateDepositResponse.token = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCreateDepositResponse$b */
    public static class C9689b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9688a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCreateDepositResponse$c */
    public static class C9690c extends C25240d<MVCreateDepositResponse> {
        public C9690c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCreateDepositResponse mVCreateDepositResponse = (MVCreateDepositResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCreateDepositResponse.mo29761g()) {
                bitSet.set(0);
            }
            if (mVCreateDepositResponse.mo29762h()) {
                bitSet.set(1);
            }
            if (mVCreateDepositResponse.mo29760f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVCreateDepositResponse.mo29761g()) {
                jVar.mo61686J(mVCreateDepositResponse.token);
            }
            if (mVCreateDepositResponse.mo29762h()) {
                jVar.mo61686J(mVCreateDepositResponse.verificationUrl);
            }
            if (mVCreateDepositResponse.mo29760f()) {
                mVCreateDepositResponse.returnUrls.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCreateDepositResponse mVCreateDepositResponse = (MVCreateDepositResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVCreateDepositResponse.token = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVCreateDepositResponse.verificationUrl = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVTokenizeReturnUrls mVTokenizeReturnUrls = new MVTokenizeReturnUrls();
                mVCreateDepositResponse.returnUrls = mVTokenizeReturnUrls;
                mVTokenizeReturnUrls.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCreateDepositResponse$d */
    public static class C9691d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9690c(0);
        }
    }

    static {
        new C17394d0("MVCreateDepositResponse");
        HashMap hashMap = new HashMap();
        f27211e = hashMap;
        hashMap.put(C25239c.class, new C9689b());
        hashMap.put(C25240d.class, new C9691d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TOKEN, new FieldMetaData(FirebaseMessagingService.EXTRA_TOKEN, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VERIFICATION_URL, new FieldMetaData("verificationUrl", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RETURN_URLS, new FieldMetaData("returnUrls", (byte) 3, new StructMetaData(MVTokenizeReturnUrls.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27212f = unmodifiableMap;
        FieldMetaData.m61947a(MVCreateDepositResponse.class, unmodifiableMap);
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
        ((C25238b) f27211e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27211e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCreateDepositResponse mVCreateDepositResponse = (MVCreateDepositResponse) obj;
        if (!getClass().equals(mVCreateDepositResponse.getClass())) {
            return getClass().getName().compareTo(mVCreateDepositResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29761g()).compareTo(Boolean.valueOf(mVCreateDepositResponse.mo29761g()));
        if (compareTo2 != 0 || ((mo29761g() && (compareTo2 = this.token.compareTo(mVCreateDepositResponse.token)) != 0) || (compareTo2 = Boolean.valueOf(mo29762h()).compareTo(Boolean.valueOf(mVCreateDepositResponse.mo29762h()))) != 0 || ((mo29762h() && (compareTo2 = this.verificationUrl.compareTo(mVCreateDepositResponse.verificationUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo29760f()).compareTo(Boolean.valueOf(mVCreateDepositResponse.mo29760f()))) != 0))) {
            return compareTo2;
        }
        if (!mo29760f() || (compareTo = this.returnUrls.compareTo(mVCreateDepositResponse.returnUrls)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCreateDepositResponse)) {
            return false;
        }
        MVCreateDepositResponse mVCreateDepositResponse = (MVCreateDepositResponse) obj;
        boolean g = mo29761g();
        boolean g2 = mVCreateDepositResponse.mo29761g();
        if ((g || g2) && (!g || !g2 || !this.token.equals(mVCreateDepositResponse.token))) {
            return false;
        }
        boolean h = mo29762h();
        boolean h2 = mVCreateDepositResponse.mo29762h();
        if ((h || h2) && (!h || !h2 || !this.verificationUrl.equals(mVCreateDepositResponse.verificationUrl))) {
            return false;
        }
        boolean f = mo29760f();
        boolean f2 = mVCreateDepositResponse.mo29760f();
        if ((f || f2) && (!f || !f2 || !this.returnUrls.mo30695a(mVCreateDepositResponse.returnUrls))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29760f() {
        return this.returnUrls != null;
    }

    /* renamed from: g */
    public final boolean mo29761g() {
        return this.token != null;
    }

    /* renamed from: h */
    public final boolean mo29762h() {
        return this.verificationUrl != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCreateDepositResponse(", "token:");
        String str = this.token;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo29762h()) {
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
        n.append(")");
        return n.toString();
    }
}
