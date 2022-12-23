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

public class MVTokenizeReturnUrls implements TBase<MVTokenizeReturnUrls, _Fields>, Serializable, Cloneable, Comparable<MVTokenizeReturnUrls> {

    /* renamed from: b */
    public static final C25113c f27762b = new C25113c("returnSuccessUrl", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27763c = new C25113c("returnFailUrl", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27764d = new C25113c("returnRejectUrl", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27765e = new C25113c("returnCancelUrl", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f27766f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27767g;
    public String returnCancelUrl;
    public String returnFailUrl;
    public String returnRejectUrl;
    public String returnSuccessUrl;

    public enum _Fields implements C25085c {
        RETURN_SUCCESS_URL(1, "returnSuccessUrl"),
        RETURN_FAIL_URL(2, "returnFailUrl"),
        RETURN_REJECT_URL(3, "returnRejectUrl"),
        RETURN_CANCEL_URL(4, "returnCancelUrl");
        
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
                return RETURN_SUCCESS_URL;
            }
            if (i == 2) {
                return RETURN_FAIL_URL;
            }
            if (i == 3) {
                return RETURN_REJECT_URL;
            }
            if (i != 4) {
                return null;
            }
            return RETURN_CANCEL_URL;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeReturnUrls$a */
    public static class C10109a extends C25239c<MVTokenizeReturnUrls> {
        public C10109a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeReturnUrls mVTokenizeReturnUrls = (MVTokenizeReturnUrls) tBase;
            mVTokenizeReturnUrls.getClass();
            C25113c cVar = MVTokenizeReturnUrls.f27762b;
            gVar.mo61687K();
            if (mVTokenizeReturnUrls.returnSuccessUrl != null) {
                gVar.mo61711x(MVTokenizeReturnUrls.f27762b);
                gVar.mo61686J(mVTokenizeReturnUrls.returnSuccessUrl);
                gVar.mo61712y();
            }
            if (mVTokenizeReturnUrls.returnFailUrl != null) {
                gVar.mo61711x(MVTokenizeReturnUrls.f27763c);
                gVar.mo61686J(mVTokenizeReturnUrls.returnFailUrl);
                gVar.mo61712y();
            }
            if (mVTokenizeReturnUrls.returnRejectUrl != null) {
                gVar.mo61711x(MVTokenizeReturnUrls.f27764d);
                gVar.mo61686J(mVTokenizeReturnUrls.returnRejectUrl);
                gVar.mo61712y();
            }
            if (mVTokenizeReturnUrls.returnCancelUrl != null) {
                gVar.mo61711x(MVTokenizeReturnUrls.f27765e);
                gVar.mo61686J(mVTokenizeReturnUrls.returnCancelUrl);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeReturnUrls mVTokenizeReturnUrls = (MVTokenizeReturnUrls) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTokenizeReturnUrls.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVTokenizeReturnUrls.returnCancelUrl = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVTokenizeReturnUrls.returnRejectUrl = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVTokenizeReturnUrls.returnFailUrl = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTokenizeReturnUrls.returnSuccessUrl = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeReturnUrls$b */
    public static class C10110b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10109a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeReturnUrls$c */
    public static class C10111c extends C25240d<MVTokenizeReturnUrls> {
        public C10111c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeReturnUrls mVTokenizeReturnUrls = (MVTokenizeReturnUrls) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTokenizeReturnUrls.mo30702i()) {
                bitSet.set(0);
            }
            if (mVTokenizeReturnUrls.mo30699g()) {
                bitSet.set(1);
            }
            if (mVTokenizeReturnUrls.mo30700h()) {
                bitSet.set(2);
            }
            if (mVTokenizeReturnUrls.mo30698f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTokenizeReturnUrls.mo30702i()) {
                jVar.mo61686J(mVTokenizeReturnUrls.returnSuccessUrl);
            }
            if (mVTokenizeReturnUrls.mo30699g()) {
                jVar.mo61686J(mVTokenizeReturnUrls.returnFailUrl);
            }
            if (mVTokenizeReturnUrls.mo30700h()) {
                jVar.mo61686J(mVTokenizeReturnUrls.returnRejectUrl);
            }
            if (mVTokenizeReturnUrls.mo30698f()) {
                jVar.mo61686J(mVTokenizeReturnUrls.returnCancelUrl);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTokenizeReturnUrls mVTokenizeReturnUrls = (MVTokenizeReturnUrls) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTokenizeReturnUrls.returnSuccessUrl = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTokenizeReturnUrls.returnFailUrl = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVTokenizeReturnUrls.returnRejectUrl = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVTokenizeReturnUrls.returnCancelUrl = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTokenizeReturnUrls$d */
    public static class C10112d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10111c(0);
        }
    }

    static {
        new C17394d0("MVTokenizeReturnUrls");
        HashMap hashMap = new HashMap();
        f27766f = hashMap;
        hashMap.put(C25239c.class, new C10110b());
        hashMap.put(C25240d.class, new C10112d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RETURN_SUCCESS_URL, new FieldMetaData("returnSuccessUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RETURN_FAIL_URL, new FieldMetaData("returnFailUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RETURN_REJECT_URL, new FieldMetaData("returnRejectUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.RETURN_CANCEL_URL, new FieldMetaData("returnCancelUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27767g = unmodifiableMap;
        FieldMetaData.m61947a(MVTokenizeReturnUrls.class, unmodifiableMap);
    }

    public MVTokenizeReturnUrls() {
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
        ((C25238b) f27766f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27766f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30695a(MVTokenizeReturnUrls mVTokenizeReturnUrls) {
        if (mVTokenizeReturnUrls == null) {
            return false;
        }
        boolean i = mo30702i();
        boolean i2 = mVTokenizeReturnUrls.mo30702i();
        if ((i || i2) && (!i || !i2 || !this.returnSuccessUrl.equals(mVTokenizeReturnUrls.returnSuccessUrl))) {
            return false;
        }
        boolean g = mo30699g();
        boolean g2 = mVTokenizeReturnUrls.mo30699g();
        if ((g || g2) && (!g || !g2 || !this.returnFailUrl.equals(mVTokenizeReturnUrls.returnFailUrl))) {
            return false;
        }
        boolean h = mo30700h();
        boolean h2 = mVTokenizeReturnUrls.mo30700h();
        if ((h || h2) && (!h || !h2 || !this.returnRejectUrl.equals(mVTokenizeReturnUrls.returnRejectUrl))) {
            return false;
        }
        boolean f = mo30698f();
        boolean f2 = mVTokenizeReturnUrls.mo30698f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.returnCancelUrl.equals(mVTokenizeReturnUrls.returnCancelUrl)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTokenizeReturnUrls mVTokenizeReturnUrls = (MVTokenizeReturnUrls) obj;
        if (!getClass().equals(mVTokenizeReturnUrls.getClass())) {
            return getClass().getName().compareTo(mVTokenizeReturnUrls.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30702i()).compareTo(Boolean.valueOf(mVTokenizeReturnUrls.mo30702i()));
        if (compareTo2 != 0 || ((mo30702i() && (compareTo2 = this.returnSuccessUrl.compareTo(mVTokenizeReturnUrls.returnSuccessUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo30699g()).compareTo(Boolean.valueOf(mVTokenizeReturnUrls.mo30699g()))) != 0 || ((mo30699g() && (compareTo2 = this.returnFailUrl.compareTo(mVTokenizeReturnUrls.returnFailUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo30700h()).compareTo(Boolean.valueOf(mVTokenizeReturnUrls.mo30700h()))) != 0 || ((mo30700h() && (compareTo2 = this.returnRejectUrl.compareTo(mVTokenizeReturnUrls.returnRejectUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo30698f()).compareTo(Boolean.valueOf(mVTokenizeReturnUrls.mo30698f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo30698f() || (compareTo = this.returnCancelUrl.compareTo(mVTokenizeReturnUrls.returnCancelUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTokenizeReturnUrls)) {
            return mo30695a((MVTokenizeReturnUrls) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30698f() {
        return this.returnCancelUrl != null;
    }

    /* renamed from: g */
    public final boolean mo30699g() {
        return this.returnFailUrl != null;
    }

    /* renamed from: h */
    public final boolean mo30700h() {
        return this.returnRejectUrl != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30702i() {
        return this.returnSuccessUrl != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTokenizeReturnUrls(", "returnSuccessUrl:");
        String str = this.returnSuccessUrl;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("returnFailUrl:");
        String str2 = this.returnFailUrl;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("returnRejectUrl:");
        String str3 = this.returnRejectUrl;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("returnCancelUrl:");
        String str4 = this.returnCancelUrl;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(")");
        return n.toString();
    }

    public MVTokenizeReturnUrls(String str, String str2, String str3, String str4) {
        this();
        this.returnSuccessUrl = str;
        this.returnFailUrl = str2;
        this.returnRejectUrl = str3;
        this.returnCancelUrl = str4;
    }
}
