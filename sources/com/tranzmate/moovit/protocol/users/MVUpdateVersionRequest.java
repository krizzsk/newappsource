package com.tranzmate.moovit.protocol.users;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVVersion;
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

public class MVUpdateVersionRequest implements TBase<MVUpdateVersionRequest, _Fields>, Serializable, Cloneable, Comparable<MVUpdateVersionRequest> {

    /* renamed from: b */
    public static final C25113c f30582b = new C25113c("newClientVersion", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f30583c = new C25113c("androidId", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30584d = new C25113c("setPrivacyPolicyRequest", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f30585e = new C25113c("pushToken", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f30586f = new C25113c("setAdvertisingInfoRequest", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f30587g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f30588h;
    public String androidId;
    public MVVersion newClientVersion;
    private _Fields[] optionals = {_Fields.SET_PRIVACY_POLICY_REQUEST, _Fields.PUSH_TOKEN, _Fields.SET_ADVERTISING_INFO_REQUEST};
    public MVUpdatePushToken pushToken;
    public MVSetAdvertisingInfoRequest setAdvertisingInfoRequest;
    public MVSetPrivacyPolicyRequest setPrivacyPolicyRequest;

    public enum _Fields implements C25085c {
        NEW_CLIENT_VERSION(1, "newClientVersion"),
        ANDROID_ID(2, "androidId"),
        SET_PRIVACY_POLICY_REQUEST(3, "setPrivacyPolicyRequest"),
        PUSH_TOKEN(4, "pushToken"),
        SET_ADVERTISING_INFO_REQUEST(5, "setAdvertisingInfoRequest");
        
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
                return NEW_CLIENT_VERSION;
            }
            if (i == 2) {
                return ANDROID_ID;
            }
            if (i == 3) {
                return SET_PRIVACY_POLICY_REQUEST;
            }
            if (i == 4) {
                return PUSH_TOKEN;
            }
            if (i != 5) {
                return null;
            }
            return SET_ADVERTISING_INFO_REQUEST;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpdateVersionRequest$a */
    public static class C11937a extends C25239c<MVUpdateVersionRequest> {
        public C11937a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUpdateVersionRequest mVUpdateVersionRequest = (MVUpdateVersionRequest) tBase;
            mVUpdateVersionRequest.mo35435k();
            C25113c cVar = MVUpdateVersionRequest.f30582b;
            gVar.mo61687K();
            if (mVUpdateVersionRequest.newClientVersion != null) {
                gVar.mo61711x(MVUpdateVersionRequest.f30582b);
                mVUpdateVersionRequest.newClientVersion.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVUpdateVersionRequest.androidId != null) {
                gVar.mo61711x(MVUpdateVersionRequest.f30583c);
                gVar.mo61686J(mVUpdateVersionRequest.androidId);
                gVar.mo61712y();
            }
            if (mVUpdateVersionRequest.setPrivacyPolicyRequest != null && mVUpdateVersionRequest.mo35434j()) {
                gVar.mo61711x(MVUpdateVersionRequest.f30584d);
                mVUpdateVersionRequest.setPrivacyPolicyRequest.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVUpdateVersionRequest.pushToken != null && mVUpdateVersionRequest.mo35431h()) {
                gVar.mo61711x(MVUpdateVersionRequest.f30585e);
                mVUpdateVersionRequest.pushToken.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVUpdateVersionRequest.setAdvertisingInfoRequest != null && mVUpdateVersionRequest.mo35433i()) {
                gVar.mo61711x(MVUpdateVersionRequest.f30586f);
                mVUpdateVersionRequest.setAdvertisingInfoRequest.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUpdateVersionRequest mVUpdateVersionRequest = (MVUpdateVersionRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVUpdateVersionRequest.mo35435k();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 12) {
                                    MVSetAdvertisingInfoRequest mVSetAdvertisingInfoRequest = new MVSetAdvertisingInfoRequest();
                                    mVUpdateVersionRequest.setAdvertisingInfoRequest = mVSetAdvertisingInfoRequest;
                                    mVSetAdvertisingInfoRequest.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 12) {
                                MVUpdatePushToken mVUpdatePushToken = new MVUpdatePushToken();
                                mVUpdateVersionRequest.pushToken = mVUpdatePushToken;
                                mVUpdatePushToken.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVSetPrivacyPolicyRequest mVSetPrivacyPolicyRequest = new MVSetPrivacyPolicyRequest();
                            mVUpdateVersionRequest.setPrivacyPolicyRequest = mVSetPrivacyPolicyRequest;
                            mVSetPrivacyPolicyRequest.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVUpdateVersionRequest.androidId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVVersion mVVersion = new MVVersion();
                    mVUpdateVersionRequest.newClientVersion = mVVersion;
                    mVVersion.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpdateVersionRequest$b */
    public static class C11938b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11937a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpdateVersionRequest$c */
    public static class C11939c extends C25240d<MVUpdateVersionRequest> {
        public C11939c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUpdateVersionRequest mVUpdateVersionRequest = (MVUpdateVersionRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUpdateVersionRequest.mo35430g()) {
                bitSet.set(0);
            }
            if (mVUpdateVersionRequest.mo35429f()) {
                bitSet.set(1);
            }
            if (mVUpdateVersionRequest.mo35434j()) {
                bitSet.set(2);
            }
            if (mVUpdateVersionRequest.mo35431h()) {
                bitSet.set(3);
            }
            if (mVUpdateVersionRequest.mo35433i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVUpdateVersionRequest.mo35430g()) {
                mVUpdateVersionRequest.newClientVersion.mo25202X0(jVar);
            }
            if (mVUpdateVersionRequest.mo35429f()) {
                jVar.mo61686J(mVUpdateVersionRequest.androidId);
            }
            if (mVUpdateVersionRequest.mo35434j()) {
                mVUpdateVersionRequest.setPrivacyPolicyRequest.mo25202X0(jVar);
            }
            if (mVUpdateVersionRequest.mo35431h()) {
                mVUpdateVersionRequest.pushToken.mo25202X0(jVar);
            }
            if (mVUpdateVersionRequest.mo35433i()) {
                mVUpdateVersionRequest.setAdvertisingInfoRequest.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUpdateVersionRequest mVUpdateVersionRequest = (MVUpdateVersionRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVVersion mVVersion = new MVVersion();
                mVUpdateVersionRequest.newClientVersion = mVVersion;
                mVVersion.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVUpdateVersionRequest.androidId = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVSetPrivacyPolicyRequest mVSetPrivacyPolicyRequest = new MVSetPrivacyPolicyRequest();
                mVUpdateVersionRequest.setPrivacyPolicyRequest = mVSetPrivacyPolicyRequest;
                mVSetPrivacyPolicyRequest.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVUpdatePushToken mVUpdatePushToken = new MVUpdatePushToken();
                mVUpdateVersionRequest.pushToken = mVUpdatePushToken;
                mVUpdatePushToken.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVSetAdvertisingInfoRequest mVSetAdvertisingInfoRequest = new MVSetAdvertisingInfoRequest();
                mVUpdateVersionRequest.setAdvertisingInfoRequest = mVSetAdvertisingInfoRequest;
                mVSetAdvertisingInfoRequest.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUpdateVersionRequest$d */
    public static class C11940d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11939c(0);
        }
    }

    static {
        new C17394d0("MVUpdateVersionRequest");
        HashMap hashMap = new HashMap();
        f30587g = hashMap;
        hashMap.put(C25239c.class, new C11938b());
        hashMap.put(C25240d.class, new C11940d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NEW_CLIENT_VERSION, new FieldMetaData("newClientVersion", (byte) 3, new StructMetaData(MVVersion.class)));
        enumMap.put(_Fields.ANDROID_ID, new FieldMetaData("androidId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SET_PRIVACY_POLICY_REQUEST, new FieldMetaData("setPrivacyPolicyRequest", (byte) 2, new StructMetaData(MVSetPrivacyPolicyRequest.class)));
        enumMap.put(_Fields.PUSH_TOKEN, new FieldMetaData("pushToken", (byte) 2, new StructMetaData(MVUpdatePushToken.class)));
        enumMap.put(_Fields.SET_ADVERTISING_INFO_REQUEST, new FieldMetaData("setAdvertisingInfoRequest", (byte) 2, new StructMetaData(MVSetAdvertisingInfoRequest.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30588h = unmodifiableMap;
        FieldMetaData.m61947a(MVUpdateVersionRequest.class, unmodifiableMap);
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
        ((C25238b) f30587g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30587g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVUpdateVersionRequest mVUpdateVersionRequest = (MVUpdateVersionRequest) obj;
        if (!getClass().equals(mVUpdateVersionRequest.getClass())) {
            return getClass().getName().compareTo(mVUpdateVersionRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35430g()).compareTo(Boolean.valueOf(mVUpdateVersionRequest.mo35430g()));
        if (compareTo2 != 0 || ((mo35430g() && (compareTo2 = this.newClientVersion.compareTo(mVUpdateVersionRequest.newClientVersion)) != 0) || (compareTo2 = Boolean.valueOf(mo35429f()).compareTo(Boolean.valueOf(mVUpdateVersionRequest.mo35429f()))) != 0 || ((mo35429f() && (compareTo2 = this.androidId.compareTo(mVUpdateVersionRequest.androidId)) != 0) || (compareTo2 = Boolean.valueOf(mo35434j()).compareTo(Boolean.valueOf(mVUpdateVersionRequest.mo35434j()))) != 0 || ((mo35434j() && (compareTo2 = this.setPrivacyPolicyRequest.compareTo(mVUpdateVersionRequest.setPrivacyPolicyRequest)) != 0) || (compareTo2 = Boolean.valueOf(mo35431h()).compareTo(Boolean.valueOf(mVUpdateVersionRequest.mo35431h()))) != 0 || ((mo35431h() && (compareTo2 = this.pushToken.compareTo(mVUpdateVersionRequest.pushToken)) != 0) || (compareTo2 = Boolean.valueOf(mo35433i()).compareTo(Boolean.valueOf(mVUpdateVersionRequest.mo35433i()))) != 0))))) {
            return compareTo2;
        }
        if (!mo35433i() || (compareTo = this.setAdvertisingInfoRequest.compareTo(mVUpdateVersionRequest.setAdvertisingInfoRequest)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVUpdateVersionRequest)) {
            return false;
        }
        MVUpdateVersionRequest mVUpdateVersionRequest = (MVUpdateVersionRequest) obj;
        boolean g = mo35430g();
        boolean g2 = mVUpdateVersionRequest.mo35430g();
        if ((g || g2) && (!g || !g2 || !this.newClientVersion.mo26454a(mVUpdateVersionRequest.newClientVersion))) {
            return false;
        }
        boolean f = mo35429f();
        boolean f2 = mVUpdateVersionRequest.mo35429f();
        if ((f || f2) && (!f || !f2 || !this.androidId.equals(mVUpdateVersionRequest.androidId))) {
            return false;
        }
        boolean j = mo35434j();
        boolean j2 = mVUpdateVersionRequest.mo35434j();
        if ((j || j2) && (!j || !j2 || !this.setPrivacyPolicyRequest.mo35329a(mVUpdateVersionRequest.setPrivacyPolicyRequest))) {
            return false;
        }
        boolean h = mo35431h();
        boolean h2 = mVUpdateVersionRequest.mo35431h();
        if ((h || h2) && (!h || !h2 || !this.pushToken.mo35404a(mVUpdateVersionRequest.pushToken))) {
            return false;
        }
        boolean i = mo35433i();
        boolean i2 = mVUpdateVersionRequest.mo35433i();
        if ((i || i2) && (!i || !i2 || !this.setAdvertisingInfoRequest.mo35300a(mVUpdateVersionRequest.setAdvertisingInfoRequest))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35429f() {
        return this.androidId != null;
    }

    /* renamed from: g */
    public final boolean mo35430g() {
        return this.newClientVersion != null;
    }

    /* renamed from: h */
    public final boolean mo35431h() {
        return this.pushToken != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35433i() {
        return this.setAdvertisingInfoRequest != null;
    }

    /* renamed from: j */
    public final boolean mo35434j() {
        return this.setPrivacyPolicyRequest != null;
    }

    /* renamed from: k */
    public final void mo35435k() throws TException {
        MVVersion mVVersion = this.newClientVersion;
        if (mVVersion != null) {
            mVVersion.getClass();
        }
        MVSetPrivacyPolicyRequest mVSetPrivacyPolicyRequest = this.setPrivacyPolicyRequest;
        if (mVSetPrivacyPolicyRequest != null) {
            mVSetPrivacyPolicyRequest.getClass();
        }
        MVUpdatePushToken mVUpdatePushToken = this.pushToken;
        if (mVUpdatePushToken != null) {
            mVUpdatePushToken.getClass();
        }
        MVSetAdvertisingInfoRequest mVSetAdvertisingInfoRequest = this.setAdvertisingInfoRequest;
        if (mVSetAdvertisingInfoRequest != null) {
            mVSetAdvertisingInfoRequest.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVUpdateVersionRequest(", "newClientVersion:");
        MVVersion mVVersion = this.newClientVersion;
        if (mVVersion == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVVersion);
        }
        n.append(", ");
        n.append("androidId:");
        String str = this.androidId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo35434j()) {
            n.append(", ");
            n.append("setPrivacyPolicyRequest:");
            MVSetPrivacyPolicyRequest mVSetPrivacyPolicyRequest = this.setPrivacyPolicyRequest;
            if (mVSetPrivacyPolicyRequest == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVSetPrivacyPolicyRequest);
            }
        }
        if (mo35431h()) {
            n.append(", ");
            n.append("pushToken:");
            MVUpdatePushToken mVUpdatePushToken = this.pushToken;
            if (mVUpdatePushToken == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVUpdatePushToken);
            }
        }
        if (mo35433i()) {
            n.append(", ");
            n.append("setAdvertisingInfoRequest:");
            MVSetAdvertisingInfoRequest mVSetAdvertisingInfoRequest = this.setAdvertisingInfoRequest;
            if (mVSetAdvertisingInfoRequest == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVSetAdvertisingInfoRequest);
            }
        }
        n.append(")");
        return n.toString();
    }
}
