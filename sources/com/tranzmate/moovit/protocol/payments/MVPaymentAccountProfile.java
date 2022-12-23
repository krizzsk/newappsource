package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
import com.google.android.gms.common.Scopes;
import com.tranzmate.moovit.protocol.common.MVLinkedText;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVPaymentAccountProfile implements TBase<MVPaymentAccountProfile, _Fields>, Serializable, Cloneable, Comparable<MVPaymentAccountProfile> {

    /* renamed from: b */
    public static final C25113c f27440b = new C25113c(Scopes.PROFILE, (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27441c = new C25113c("expirationDate", (byte) 10, 2);

    /* renamed from: d */
    public static final C25113c f27442d = new C25113c(ServerParameters.STATUS, (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f27443e = new C25113c("statusMessage", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f27444f = new C25113c("requiredInfos", (byte) 15, 5);

    /* renamed from: g */
    public static final HashMap f27445g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f27446h;
    private byte __isset_bitfield = 0;
    public long expirationDate;
    private _Fields[] optionals = {_Fields.EXPIRATION_DATE, _Fields.REQUIRED_INFOS};
    public MVProfileSpec profile;
    public List<MVAccountProfileRequiredInfo> requiredInfos;
    public MVVerificationStatus status;
    public MVLinkedText statusMessage;

    public enum _Fields implements C25085c {
        PROFILE(1, Scopes.PROFILE),
        EXPIRATION_DATE(2, "expirationDate"),
        STATUS(3, ServerParameters.STATUS),
        STATUS_MESSAGE(4, "statusMessage"),
        REQUIRED_INFOS(5, "requiredInfos");
        
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
                return PROFILE;
            }
            if (i == 2) {
                return EXPIRATION_DATE;
            }
            if (i == 3) {
                return STATUS;
            }
            if (i == 4) {
                return STATUS_MESSAGE;
            }
            if (i != 5) {
                return null;
            }
            return REQUIRED_INFOS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountProfile$a */
    public static class C9869a extends C25239c<MVPaymentAccountProfile> {
        public C9869a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountProfile mVPaymentAccountProfile = (MVPaymentAccountProfile) tBase;
            MVProfileSpec mVProfileSpec = mVPaymentAccountProfile.profile;
            C25113c cVar = MVPaymentAccountProfile.f27440b;
            gVar.mo61687K();
            if (mVPaymentAccountProfile.profile != null) {
                gVar.mo61711x(MVPaymentAccountProfile.f27440b);
                mVPaymentAccountProfile.profile.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPaymentAccountProfile.mo30156f()) {
                gVar.mo61711x(MVPaymentAccountProfile.f27441c);
                gVar.mo61679C(mVPaymentAccountProfile.expirationDate);
                gVar.mo61712y();
            }
            if (mVPaymentAccountProfile.status != null) {
                gVar.mo61711x(MVPaymentAccountProfile.f27442d);
                gVar.mo61678B(mVPaymentAccountProfile.status.getValue());
                gVar.mo61712y();
            }
            if (mVPaymentAccountProfile.statusMessage != null) {
                gVar.mo61711x(MVPaymentAccountProfile.f27443e);
                mVPaymentAccountProfile.statusMessage.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPaymentAccountProfile.requiredInfos != null && mVPaymentAccountProfile.mo30158h()) {
                gVar.mo61711x(MVPaymentAccountProfile.f27444f);
                gVar.mo61680D(new C25119e((byte) 12, mVPaymentAccountProfile.requiredInfos.size()));
                for (MVAccountProfileRequiredInfo X0 : mVPaymentAccountProfile.requiredInfos) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountProfile mVPaymentAccountProfile = (MVPaymentAccountProfile) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVProfileSpec mVProfileSpec = mVPaymentAccountProfile.profile;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 15) {
                                    C25119e k = gVar.mo61698k();
                                    mVPaymentAccountProfile.requiredInfos = new ArrayList(k.f63395b);
                                    for (int i = 0; i < k.f63395b; i++) {
                                        MVAccountProfileRequiredInfo mVAccountProfileRequiredInfo = new MVAccountProfileRequiredInfo();
                                        mVAccountProfileRequiredInfo.mo25201C1(gVar);
                                        mVPaymentAccountProfile.requiredInfos.add(mVAccountProfileRequiredInfo);
                                    }
                                    gVar.mo61699l();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 12) {
                                MVLinkedText mVLinkedText = new MVLinkedText();
                                mVPaymentAccountProfile.statusMessage = mVLinkedText;
                                mVLinkedText.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVPaymentAccountProfile.status = MVVerificationStatus.findByValue(gVar.mo61696i());
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 10) {
                        mVPaymentAccountProfile.expirationDate = gVar.mo61697j();
                        mVPaymentAccountProfile.mo30162k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVProfileSpec mVProfileSpec2 = new MVProfileSpec();
                    mVPaymentAccountProfile.profile = mVProfileSpec2;
                    mVProfileSpec2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountProfile$b */
    public static class C9870b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9869a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountProfile$c */
    public static class C9871c extends C25240d<MVPaymentAccountProfile> {
        public C9871c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountProfile mVPaymentAccountProfile = (MVPaymentAccountProfile) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentAccountProfile.mo30157g()) {
                bitSet.set(0);
            }
            if (mVPaymentAccountProfile.mo30156f()) {
                bitSet.set(1);
            }
            if (mVPaymentAccountProfile.mo30160i()) {
                bitSet.set(2);
            }
            if (mVPaymentAccountProfile.mo30161j()) {
                bitSet.set(3);
            }
            if (mVPaymentAccountProfile.mo30158h()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVPaymentAccountProfile.mo30157g()) {
                mVPaymentAccountProfile.profile.mo25202X0(jVar);
            }
            if (mVPaymentAccountProfile.mo30156f()) {
                jVar.mo61679C(mVPaymentAccountProfile.expirationDate);
            }
            if (mVPaymentAccountProfile.mo30160i()) {
                jVar.mo61678B(mVPaymentAccountProfile.status.getValue());
            }
            if (mVPaymentAccountProfile.mo30161j()) {
                mVPaymentAccountProfile.statusMessage.mo25202X0(jVar);
            }
            if (mVPaymentAccountProfile.mo30158h()) {
                jVar.mo61678B(mVPaymentAccountProfile.requiredInfos.size());
                for (MVAccountProfileRequiredInfo X0 : mVPaymentAccountProfile.requiredInfos) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccountProfile mVPaymentAccountProfile = (MVPaymentAccountProfile) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVProfileSpec mVProfileSpec = new MVProfileSpec();
                mVPaymentAccountProfile.profile = mVProfileSpec;
                mVProfileSpec.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVPaymentAccountProfile.expirationDate = jVar.mo61697j();
                mVPaymentAccountProfile.mo30162k();
            }
            if (T.get(2)) {
                mVPaymentAccountProfile.status = MVVerificationStatus.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                MVLinkedText mVLinkedText = new MVLinkedText();
                mVPaymentAccountProfile.statusMessage = mVLinkedText;
                mVLinkedText.mo25201C1(jVar);
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVPaymentAccountProfile.requiredInfos = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVAccountProfileRequiredInfo mVAccountProfileRequiredInfo = new MVAccountProfileRequiredInfo();
                    mVAccountProfileRequiredInfo.mo25201C1(jVar);
                    mVPaymentAccountProfile.requiredInfos.add(mVAccountProfileRequiredInfo);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccountProfile$d */
    public static class C9872d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9871c(0);
        }
    }

    static {
        new C17394d0("MVPaymentAccountProfile");
        HashMap hashMap = new HashMap();
        f27445g = hashMap;
        hashMap.put(C25239c.class, new C9870b());
        hashMap.put(C25240d.class, new C9872d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROFILE, new FieldMetaData(Scopes.PROFILE, (byte) 3, new StructMetaData(MVProfileSpec.class)));
        enumMap.put(_Fields.EXPIRATION_DATE, new FieldMetaData("expirationDate", (byte) 2, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.STATUS, new FieldMetaData(ServerParameters.STATUS, (byte) 3, new EnumMetaData(MVVerificationStatus.class)));
        enumMap.put(_Fields.STATUS_MESSAGE, new FieldMetaData("statusMessage", (byte) 3, new StructMetaData(MVLinkedText.class)));
        enumMap.put(_Fields.REQUIRED_INFOS, new FieldMetaData("requiredInfos", (byte) 2, new ListMetaData(new StructMetaData(MVAccountProfileRequiredInfo.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27446h = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentAccountProfile.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
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
        ((C25238b) f27445g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27445g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVPaymentAccountProfile mVPaymentAccountProfile = (MVPaymentAccountProfile) obj;
        if (!getClass().equals(mVPaymentAccountProfile.getClass())) {
            return getClass().getName().compareTo(mVPaymentAccountProfile.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30157g()).compareTo(Boolean.valueOf(mVPaymentAccountProfile.mo30157g()));
        if (compareTo != 0 || ((mo30157g() && (compareTo = this.profile.compareTo(mVPaymentAccountProfile.profile)) != 0) || (compareTo = Boolean.valueOf(mo30156f()).compareTo(Boolean.valueOf(mVPaymentAccountProfile.mo30156f()))) != 0 || ((mo30156f() && (compareTo = C25082a.m62840d(this.expirationDate, mVPaymentAccountProfile.expirationDate)) != 0) || (compareTo = Boolean.valueOf(mo30160i()).compareTo(Boolean.valueOf(mVPaymentAccountProfile.mo30160i()))) != 0 || ((mo30160i() && (compareTo = this.status.compareTo(mVPaymentAccountProfile.status)) != 0) || (compareTo = Boolean.valueOf(mo30161j()).compareTo(Boolean.valueOf(mVPaymentAccountProfile.mo30161j()))) != 0 || ((mo30161j() && (compareTo = this.statusMessage.compareTo(mVPaymentAccountProfile.statusMessage)) != 0) || (compareTo = Boolean.valueOf(mo30158h()).compareTo(Boolean.valueOf(mVPaymentAccountProfile.mo30158h()))) != 0))))) {
            return compareTo;
        }
        if (!mo30158h() || (h = C25082a.m62844h(this.requiredInfos, mVPaymentAccountProfile.requiredInfos)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentAccountProfile)) {
            return false;
        }
        MVPaymentAccountProfile mVPaymentAccountProfile = (MVPaymentAccountProfile) obj;
        boolean g = mo30157g();
        boolean g2 = mVPaymentAccountProfile.mo30157g();
        if ((g || g2) && (!g || !g2 || !this.profile.mo30495a(mVPaymentAccountProfile.profile))) {
            return false;
        }
        boolean f = mo30156f();
        boolean f2 = mVPaymentAccountProfile.mo30156f();
        if ((f || f2) && (!f || !f2 || this.expirationDate != mVPaymentAccountProfile.expirationDate)) {
            return false;
        }
        boolean i = mo30160i();
        boolean i2 = mVPaymentAccountProfile.mo30160i();
        if ((i || i2) && (!i || !i2 || !this.status.equals(mVPaymentAccountProfile.status))) {
            return false;
        }
        boolean j = mo30161j();
        boolean j2 = mVPaymentAccountProfile.mo30161j();
        if ((j || j2) && (!j || !j2 || !this.statusMessage.mo26301a(mVPaymentAccountProfile.statusMessage))) {
            return false;
        }
        boolean h = mo30158h();
        boolean h2 = mVPaymentAccountProfile.mo30158h();
        if ((h || h2) && (!h || !h2 || !this.requiredInfos.equals(mVPaymentAccountProfile.requiredInfos))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30156f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo30157g() {
        return this.profile != null;
    }

    /* renamed from: h */
    public final boolean mo30158h() {
        return this.requiredInfos != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30160i() {
        return this.status != null;
    }

    /* renamed from: j */
    public final boolean mo30161j() {
        return this.statusMessage != null;
    }

    /* renamed from: k */
    public final void mo30162k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentAccountProfile(", "profile:");
        MVProfileSpec mVProfileSpec = this.profile;
        if (mVProfileSpec == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVProfileSpec);
        }
        if (mo30156f()) {
            n.append(", ");
            n.append("expirationDate:");
            n.append(this.expirationDate);
        }
        n.append(", ");
        n.append("status:");
        MVVerificationStatus mVVerificationStatus = this.status;
        if (mVVerificationStatus == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVVerificationStatus);
        }
        n.append(", ");
        n.append("statusMessage:");
        MVLinkedText mVLinkedText = this.statusMessage;
        if (mVLinkedText == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLinkedText);
        }
        if (mo30158h()) {
            n.append(", ");
            n.append("requiredInfos:");
            List<MVAccountProfileRequiredInfo> list = this.requiredInfos;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        n.append(")");
        return n.toString();
    }
}
