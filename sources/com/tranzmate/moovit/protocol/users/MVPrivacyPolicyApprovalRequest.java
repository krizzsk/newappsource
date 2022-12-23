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

public class MVPrivacyPolicyApprovalRequest implements TBase<MVPrivacyPolicyApprovalRequest, _Fields>, Serializable, Cloneable, Comparable<MVPrivacyPolicyApprovalRequest> {

    /* renamed from: b */
    public static final C25113c f30491b = new C25113c("termOfUse", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30492c = new C25113c("privacyPolicy", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f30493d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30494e;
    public String privacyPolicy;
    public String termOfUse;

    public enum _Fields implements C25085c {
        TERM_OF_USE(1, "termOfUse"),
        PRIVACY_POLICY(2, "privacyPolicy");
        
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
                return TERM_OF_USE;
            }
            if (i != 2) {
                return null;
            }
            return PRIVACY_POLICY;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVPrivacyPolicyApprovalRequest$a */
    public static class C11865a extends C25239c<MVPrivacyPolicyApprovalRequest> {
        public C11865a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPrivacyPolicyApprovalRequest mVPrivacyPolicyApprovalRequest = (MVPrivacyPolicyApprovalRequest) tBase;
            mVPrivacyPolicyApprovalRequest.getClass();
            C25113c cVar = MVPrivacyPolicyApprovalRequest.f30491b;
            gVar.mo61687K();
            if (mVPrivacyPolicyApprovalRequest.termOfUse != null) {
                gVar.mo61711x(MVPrivacyPolicyApprovalRequest.f30491b);
                gVar.mo61686J(mVPrivacyPolicyApprovalRequest.termOfUse);
                gVar.mo61712y();
            }
            if (mVPrivacyPolicyApprovalRequest.privacyPolicy != null) {
                gVar.mo61711x(MVPrivacyPolicyApprovalRequest.f30492c);
                gVar.mo61686J(mVPrivacyPolicyApprovalRequest.privacyPolicy);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPrivacyPolicyApprovalRequest mVPrivacyPolicyApprovalRequest = (MVPrivacyPolicyApprovalRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPrivacyPolicyApprovalRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVPrivacyPolicyApprovalRequest.privacyPolicy = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPrivacyPolicyApprovalRequest.termOfUse = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVPrivacyPolicyApprovalRequest$b */
    public static class C11866b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11865a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVPrivacyPolicyApprovalRequest$c */
    public static class C11867c extends C25240d<MVPrivacyPolicyApprovalRequest> {
        public C11867c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPrivacyPolicyApprovalRequest mVPrivacyPolicyApprovalRequest = (MVPrivacyPolicyApprovalRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPrivacyPolicyApprovalRequest.mo35262g()) {
                bitSet.set(0);
            }
            if (mVPrivacyPolicyApprovalRequest.mo35261f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPrivacyPolicyApprovalRequest.mo35262g()) {
                jVar.mo61686J(mVPrivacyPolicyApprovalRequest.termOfUse);
            }
            if (mVPrivacyPolicyApprovalRequest.mo35261f()) {
                jVar.mo61686J(mVPrivacyPolicyApprovalRequest.privacyPolicy);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPrivacyPolicyApprovalRequest mVPrivacyPolicyApprovalRequest = (MVPrivacyPolicyApprovalRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPrivacyPolicyApprovalRequest.termOfUse = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPrivacyPolicyApprovalRequest.privacyPolicy = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVPrivacyPolicyApprovalRequest$d */
    public static class C11868d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11867c(0);
        }
    }

    static {
        new C17394d0("MVPrivacyPolicyApprovalRequest");
        HashMap hashMap = new HashMap();
        f30493d = hashMap;
        hashMap.put(C25239c.class, new C11866b());
        hashMap.put(C25240d.class, new C11868d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TERM_OF_USE, new FieldMetaData("termOfUse", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRIVACY_POLICY, new FieldMetaData("privacyPolicy", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30494e = unmodifiableMap;
        FieldMetaData.m61947a(MVPrivacyPolicyApprovalRequest.class, unmodifiableMap);
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
        ((C25238b) f30493d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30493d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPrivacyPolicyApprovalRequest mVPrivacyPolicyApprovalRequest = (MVPrivacyPolicyApprovalRequest) obj;
        if (!getClass().equals(mVPrivacyPolicyApprovalRequest.getClass())) {
            return getClass().getName().compareTo(mVPrivacyPolicyApprovalRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35262g()).compareTo(Boolean.valueOf(mVPrivacyPolicyApprovalRequest.mo35262g()));
        if (compareTo2 != 0 || ((mo35262g() && (compareTo2 = this.termOfUse.compareTo(mVPrivacyPolicyApprovalRequest.termOfUse)) != 0) || (compareTo2 = Boolean.valueOf(mo35261f()).compareTo(Boolean.valueOf(mVPrivacyPolicyApprovalRequest.mo35261f()))) != 0)) {
            return compareTo2;
        }
        if (!mo35261f() || (compareTo = this.privacyPolicy.compareTo(mVPrivacyPolicyApprovalRequest.privacyPolicy)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPrivacyPolicyApprovalRequest)) {
            return false;
        }
        MVPrivacyPolicyApprovalRequest mVPrivacyPolicyApprovalRequest = (MVPrivacyPolicyApprovalRequest) obj;
        boolean g = mo35262g();
        boolean g2 = mVPrivacyPolicyApprovalRequest.mo35262g();
        if ((g || g2) && (!g || !g2 || !this.termOfUse.equals(mVPrivacyPolicyApprovalRequest.termOfUse))) {
            return false;
        }
        boolean f = mo35261f();
        boolean f2 = mVPrivacyPolicyApprovalRequest.mo35261f();
        if ((f || f2) && (!f || !f2 || !this.privacyPolicy.equals(mVPrivacyPolicyApprovalRequest.privacyPolicy))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35261f() {
        return this.privacyPolicy != null;
    }

    /* renamed from: g */
    public final boolean mo35262g() {
        return this.termOfUse != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPrivacyPolicyApprovalRequest(", "termOfUse:");
        String str = this.termOfUse;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("privacyPolicy:");
        String str2 = this.privacyPolicy;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(")");
        return n.toString();
    }
}
