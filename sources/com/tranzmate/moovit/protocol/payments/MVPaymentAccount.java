package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
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

public class MVPaymentAccount implements TBase<MVPaymentAccount, _Fields>, Serializable, Cloneable, Comparable<MVPaymentAccount> {

    /* renamed from: b */
    public static final C25113c f27393b = new C25113c("accountId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27394c = new C25113c("userPaymentContexts", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f27395d = new C25113c("personalInfo", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f27396e = new C25113c("paymentMethods", (byte) 15, 4);

    /* renamed from: f */
    public static final C25113c f27397f = new C25113c("profiles", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f27398g = new C25113c("badge", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f27399h = new C25113c("certificates", (byte) 15, 7);

    /* renamed from: i */
    public static final C25113c f27400i = new C25113c("settings", (byte) 12, 8);

    /* renamed from: j */
    public static final C25113c f27401j = new C25113c("accountProducts", (byte) 15, 9);

    /* renamed from: k */
    public static final HashMap f27402k;

    /* renamed from: l */
    public static final Map<_Fields, FieldMetaData> f27403l;
    public String accountId;
    public List<MVPaymentAccountProduct> accountProducts;
    public MVPaymentAccountBadgeType badge;
    public List<MVPaymentAccountCertificate> certificates;
    private _Fields[] optionals = {_Fields.BADGE};
    public List<MVPaymentMethodInfo> paymentMethods;
    public MVPaymentAccountPersonalInfo personalInfo;
    public List<MVPaymentAccountProfile> profiles;
    public MVPaymentAccountSettings settings;
    public List<MVPaymentAccountContext> userPaymentContexts;

    public enum _Fields implements C25085c {
        ACCOUNT_ID(1, "accountId"),
        USER_PAYMENT_CONTEXTS(2, "userPaymentContexts"),
        PERSONAL_INFO(3, "personalInfo"),
        PAYMENT_METHODS(4, "paymentMethods"),
        PROFILES(5, "profiles"),
        BADGE(6, "badge"),
        CERTIFICATES(7, "certificates"),
        SETTINGS(8, "settings"),
        ACCOUNT_PRODUCTS(9, "accountProducts");
        
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
            switch (i) {
                case 1:
                    return ACCOUNT_ID;
                case 2:
                    return USER_PAYMENT_CONTEXTS;
                case 3:
                    return PERSONAL_INFO;
                case 4:
                    return PAYMENT_METHODS;
                case 5:
                    return PROFILES;
                case 6:
                    return BADGE;
                case 7:
                    return CERTIFICATES;
                case 8:
                    return SETTINGS;
                case 9:
                    return ACCOUNT_PRODUCTS;
                default:
                    return null;
            }
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccount$a */
    public static class C9845a extends C25239c<MVPaymentAccount> {
        public C9845a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccount mVPaymentAccount = (MVPaymentAccount) tBase;
            mVPaymentAccount.getClass();
            C25113c cVar = MVPaymentAccount.f27393b;
            gVar.mo61687K();
            if (mVPaymentAccount.accountId != null) {
                gVar.mo61711x(MVPaymentAccount.f27393b);
                gVar.mo61686J(mVPaymentAccount.accountId);
                gVar.mo61712y();
            }
            if (mVPaymentAccount.userPaymentContexts != null) {
                gVar.mo61711x(MVPaymentAccount.f27394c);
                gVar.mo61680D(new C25119e((byte) 12, mVPaymentAccount.userPaymentContexts.size()));
                for (MVPaymentAccountContext X0 : mVPaymentAccount.userPaymentContexts) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPaymentAccount.personalInfo != null) {
                gVar.mo61711x(MVPaymentAccount.f27395d);
                mVPaymentAccount.personalInfo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPaymentAccount.paymentMethods != null) {
                gVar.mo61711x(MVPaymentAccount.f27396e);
                gVar.mo61680D(new C25119e((byte) 12, mVPaymentAccount.paymentMethods.size()));
                for (MVPaymentMethodInfo X02 : mVPaymentAccount.paymentMethods) {
                    X02.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPaymentAccount.profiles != null) {
                gVar.mo61711x(MVPaymentAccount.f27397f);
                gVar.mo61680D(new C25119e((byte) 12, mVPaymentAccount.profiles.size()));
                for (MVPaymentAccountProfile X03 : mVPaymentAccount.profiles) {
                    X03.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPaymentAccount.badge != null && mVPaymentAccount.mo30090h()) {
                gVar.mo61711x(MVPaymentAccount.f27398g);
                gVar.mo61678B(mVPaymentAccount.badge.getValue());
                gVar.mo61712y();
            }
            if (mVPaymentAccount.certificates != null) {
                gVar.mo61711x(MVPaymentAccount.f27399h);
                gVar.mo61680D(new C25119e((byte) 12, mVPaymentAccount.certificates.size()));
                for (MVPaymentAccountCertificate X04 : mVPaymentAccount.certificates) {
                    X04.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVPaymentAccount.settings != null) {
                gVar.mo61711x(MVPaymentAccount.f27400i);
                mVPaymentAccount.settings.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVPaymentAccount.accountProducts != null) {
                gVar.mo61711x(MVPaymentAccount.f27401j);
                gVar.mo61680D(new C25119e((byte) 12, mVPaymentAccount.accountProducts.size()));
                for (MVPaymentAccountProduct X05 : mVPaymentAccount.accountProducts) {
                    X05.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccount mVPaymentAccount = (MVPaymentAccount) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentAccount.getClass();
                    return;
                }
                int i = 0;
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccount.accountId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVPaymentAccount.userPaymentContexts = new ArrayList(k.f63395b);
                            while (i < k.f63395b) {
                                MVPaymentAccountContext mVPaymentAccountContext = new MVPaymentAccountContext();
                                mVPaymentAccountContext.mo25201C1(gVar);
                                mVPaymentAccount.userPaymentContexts.add(mVPaymentAccountContext);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 3:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPaymentAccountPersonalInfo mVPaymentAccountPersonalInfo = new MVPaymentAccountPersonalInfo();
                            mVPaymentAccount.personalInfo = mVPaymentAccountPersonalInfo;
                            mVPaymentAccountPersonalInfo.mo25201C1(gVar);
                            break;
                        }
                    case 4:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k2 = gVar.mo61698k();
                            mVPaymentAccount.paymentMethods = new ArrayList(k2.f63395b);
                            while (i < k2.f63395b) {
                                MVPaymentMethodInfo mVPaymentMethodInfo = new MVPaymentMethodInfo();
                                mVPaymentMethodInfo.mo25201C1(gVar);
                                mVPaymentAccount.paymentMethods.add(mVPaymentMethodInfo);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k3 = gVar.mo61698k();
                            mVPaymentAccount.profiles = new ArrayList(k3.f63395b);
                            while (i < k3.f63395b) {
                                MVPaymentAccountProfile mVPaymentAccountProfile = new MVPaymentAccountProfile();
                                mVPaymentAccountProfile.mo25201C1(gVar);
                                mVPaymentAccount.profiles.add(mVPaymentAccountProfile);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVPaymentAccount.badge = MVPaymentAccountBadgeType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 7:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k4 = gVar.mo61698k();
                            mVPaymentAccount.certificates = new ArrayList(k4.f63395b);
                            while (i < k4.f63395b) {
                                MVPaymentAccountCertificate mVPaymentAccountCertificate = new MVPaymentAccountCertificate();
                                mVPaymentAccountCertificate.mo25201C1(gVar);
                                mVPaymentAccount.certificates.add(mVPaymentAccountCertificate);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 8:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVPaymentAccountSettings mVPaymentAccountSettings = new MVPaymentAccountSettings();
                            mVPaymentAccount.settings = mVPaymentAccountSettings;
                            mVPaymentAccountSettings.mo25201C1(gVar);
                            break;
                        }
                    case 9:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k5 = gVar.mo61698k();
                            mVPaymentAccount.accountProducts = new ArrayList(k5.f63395b);
                            while (i < k5.f63395b) {
                                MVPaymentAccountProduct mVPaymentAccountProduct = new MVPaymentAccountProduct();
                                mVPaymentAccountProduct.mo25201C1(gVar);
                                mVPaymentAccount.accountProducts.add(mVPaymentAccountProduct);
                                i++;
                            }
                            gVar.mo61699l();
                            break;
                        }
                    default:
                        C25122h.m63098a(gVar, b);
                        break;
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccount$b */
    public static class C9846b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9845a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccount$c */
    public static class C9847c extends C25240d<MVPaymentAccount> {
        public C9847c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccount mVPaymentAccount = (MVPaymentAccount) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentAccount.mo30088f()) {
                bitSet.set(0);
            }
            if (mVPaymentAccount.mo30097o()) {
                bitSet.set(1);
            }
            if (mVPaymentAccount.mo30094k()) {
                bitSet.set(2);
            }
            if (mVPaymentAccount.mo30093j()) {
                bitSet.set(3);
            }
            if (mVPaymentAccount.mo30095l()) {
                bitSet.set(4);
            }
            if (mVPaymentAccount.mo30090h()) {
                bitSet.set(5);
            }
            if (mVPaymentAccount.mo30092i()) {
                bitSet.set(6);
            }
            if (mVPaymentAccount.mo30096m()) {
                bitSet.set(7);
            }
            if (mVPaymentAccount.mo30089g()) {
                bitSet.set(8);
            }
            jVar.mo61738U(bitSet, 9);
            if (mVPaymentAccount.mo30088f()) {
                jVar.mo61686J(mVPaymentAccount.accountId);
            }
            if (mVPaymentAccount.mo30097o()) {
                jVar.mo61678B(mVPaymentAccount.userPaymentContexts.size());
                for (MVPaymentAccountContext X0 : mVPaymentAccount.userPaymentContexts) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVPaymentAccount.mo30094k()) {
                mVPaymentAccount.personalInfo.mo25202X0(jVar);
            }
            if (mVPaymentAccount.mo30093j()) {
                jVar.mo61678B(mVPaymentAccount.paymentMethods.size());
                for (MVPaymentMethodInfo X02 : mVPaymentAccount.paymentMethods) {
                    X02.mo25202X0(jVar);
                }
            }
            if (mVPaymentAccount.mo30095l()) {
                jVar.mo61678B(mVPaymentAccount.profiles.size());
                for (MVPaymentAccountProfile X03 : mVPaymentAccount.profiles) {
                    X03.mo25202X0(jVar);
                }
            }
            if (mVPaymentAccount.mo30090h()) {
                jVar.mo61678B(mVPaymentAccount.badge.getValue());
            }
            if (mVPaymentAccount.mo30092i()) {
                jVar.mo61678B(mVPaymentAccount.certificates.size());
                for (MVPaymentAccountCertificate X04 : mVPaymentAccount.certificates) {
                    X04.mo25202X0(jVar);
                }
            }
            if (mVPaymentAccount.mo30096m()) {
                mVPaymentAccount.settings.mo25202X0(jVar);
            }
            if (mVPaymentAccount.mo30089g()) {
                jVar.mo61678B(mVPaymentAccount.accountProducts.size());
                for (MVPaymentAccountProduct X05 : mVPaymentAccount.accountProducts) {
                    X05.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentAccount mVPaymentAccount = (MVPaymentAccount) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(9);
            if (T.get(0)) {
                mVPaymentAccount.accountId = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVPaymentAccount.userPaymentContexts = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVPaymentAccountContext mVPaymentAccountContext = new MVPaymentAccountContext();
                    mVPaymentAccountContext.mo25201C1(jVar);
                    mVPaymentAccount.userPaymentContexts.add(mVPaymentAccountContext);
                }
            }
            if (T.get(2)) {
                MVPaymentAccountPersonalInfo mVPaymentAccountPersonalInfo = new MVPaymentAccountPersonalInfo();
                mVPaymentAccount.personalInfo = mVPaymentAccountPersonalInfo;
                mVPaymentAccountPersonalInfo.mo25201C1(jVar);
            }
            if (T.get(3)) {
                int i3 = jVar.mo61696i();
                mVPaymentAccount.paymentMethods = new ArrayList(i3);
                for (int i4 = 0; i4 < i3; i4++) {
                    MVPaymentMethodInfo mVPaymentMethodInfo = new MVPaymentMethodInfo();
                    mVPaymentMethodInfo.mo25201C1(jVar);
                    mVPaymentAccount.paymentMethods.add(mVPaymentMethodInfo);
                }
            }
            if (T.get(4)) {
                int i5 = jVar.mo61696i();
                mVPaymentAccount.profiles = new ArrayList(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    MVPaymentAccountProfile mVPaymentAccountProfile = new MVPaymentAccountProfile();
                    mVPaymentAccountProfile.mo25201C1(jVar);
                    mVPaymentAccount.profiles.add(mVPaymentAccountProfile);
                }
            }
            if (T.get(5)) {
                mVPaymentAccount.badge = MVPaymentAccountBadgeType.findByValue(jVar.mo61696i());
            }
            if (T.get(6)) {
                int i7 = jVar.mo61696i();
                mVPaymentAccount.certificates = new ArrayList(i7);
                for (int i8 = 0; i8 < i7; i8++) {
                    MVPaymentAccountCertificate mVPaymentAccountCertificate = new MVPaymentAccountCertificate();
                    mVPaymentAccountCertificate.mo25201C1(jVar);
                    mVPaymentAccount.certificates.add(mVPaymentAccountCertificate);
                }
            }
            if (T.get(7)) {
                MVPaymentAccountSettings mVPaymentAccountSettings = new MVPaymentAccountSettings();
                mVPaymentAccount.settings = mVPaymentAccountSettings;
                mVPaymentAccountSettings.mo25201C1(jVar);
            }
            if (T.get(8)) {
                int i9 = jVar.mo61696i();
                mVPaymentAccount.accountProducts = new ArrayList(i9);
                for (int i11 = 0; i11 < i9; i11++) {
                    MVPaymentAccountProduct mVPaymentAccountProduct = new MVPaymentAccountProduct();
                    mVPaymentAccountProduct.mo25201C1(jVar);
                    mVPaymentAccount.accountProducts.add(mVPaymentAccountProduct);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentAccount$d */
    public static class C9848d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9847c(0);
        }
    }

    static {
        new C17394d0("MVPaymentAccount");
        HashMap hashMap = new HashMap();
        f27402k = hashMap;
        hashMap.put(C25239c.class, new C9846b());
        hashMap.put(C25240d.class, new C9848d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ACCOUNT_ID, new FieldMetaData("accountId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.USER_PAYMENT_CONTEXTS, new FieldMetaData("userPaymentContexts", (byte) 3, new ListMetaData(new StructMetaData(MVPaymentAccountContext.class))));
        enumMap.put(_Fields.PERSONAL_INFO, new FieldMetaData("personalInfo", (byte) 3, new StructMetaData(MVPaymentAccountPersonalInfo.class)));
        enumMap.put(_Fields.PAYMENT_METHODS, new FieldMetaData("paymentMethods", (byte) 3, new ListMetaData(new StructMetaData(MVPaymentMethodInfo.class))));
        enumMap.put(_Fields.PROFILES, new FieldMetaData("profiles", (byte) 3, new ListMetaData(new StructMetaData(MVPaymentAccountProfile.class))));
        enumMap.put(_Fields.BADGE, new FieldMetaData("badge", (byte) 2, new EnumMetaData(MVPaymentAccountBadgeType.class)));
        enumMap.put(_Fields.CERTIFICATES, new FieldMetaData("certificates", (byte) 3, new ListMetaData(new StructMetaData(MVPaymentAccountCertificate.class))));
        enumMap.put(_Fields.SETTINGS, new FieldMetaData("settings", (byte) 3, new StructMetaData(MVPaymentAccountSettings.class)));
        enumMap.put(_Fields.ACCOUNT_PRODUCTS, new FieldMetaData("accountProducts", (byte) 3, new ListMetaData(new StructMetaData(MVPaymentAccountProduct.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27403l = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentAccount.class, unmodifiableMap);
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
        ((C25238b) f27402k.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27402k.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30085a(MVPaymentAccount mVPaymentAccount) {
        if (mVPaymentAccount == null) {
            return false;
        }
        boolean f = mo30088f();
        boolean f2 = mVPaymentAccount.mo30088f();
        if ((f || f2) && (!f || !f2 || !this.accountId.equals(mVPaymentAccount.accountId))) {
            return false;
        }
        boolean o = mo30097o();
        boolean o2 = mVPaymentAccount.mo30097o();
        if ((o || o2) && (!o || !o2 || !this.userPaymentContexts.equals(mVPaymentAccount.userPaymentContexts))) {
            return false;
        }
        boolean k = mo30094k();
        boolean k2 = mVPaymentAccount.mo30094k();
        if ((k || k2) && (!k || !k2 || !this.personalInfo.mo30128a(mVPaymentAccount.personalInfo))) {
            return false;
        }
        boolean j = mo30093j();
        boolean j2 = mVPaymentAccount.mo30093j();
        if ((j || j2) && (!j || !j2 || !this.paymentMethods.equals(mVPaymentAccount.paymentMethods))) {
            return false;
        }
        boolean l = mo30095l();
        boolean l2 = mVPaymentAccount.mo30095l();
        if ((l || l2) && (!l || !l2 || !this.profiles.equals(mVPaymentAccount.profiles))) {
            return false;
        }
        boolean h = mo30090h();
        boolean h2 = mVPaymentAccount.mo30090h();
        if ((h || h2) && (!h || !h2 || !this.badge.equals(mVPaymentAccount.badge))) {
            return false;
        }
        boolean i = mo30092i();
        boolean i2 = mVPaymentAccount.mo30092i();
        if ((i || i2) && (!i || !i2 || !this.certificates.equals(mVPaymentAccount.certificates))) {
            return false;
        }
        boolean m = mo30096m();
        boolean m2 = mVPaymentAccount.mo30096m();
        if ((m || m2) && (!m || !m2 || !this.settings.mo30171a(mVPaymentAccount.settings))) {
            return false;
        }
        boolean g = mo30089g();
        boolean g2 = mVPaymentAccount.mo30089g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.accountProducts.equals(mVPaymentAccount.accountProducts)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int h;
        MVPaymentAccount mVPaymentAccount = (MVPaymentAccount) obj;
        if (!getClass().equals(mVPaymentAccount.getClass())) {
            return getClass().getName().compareTo(mVPaymentAccount.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30088f()).compareTo(Boolean.valueOf(mVPaymentAccount.mo30088f()));
        if (compareTo != 0 || ((mo30088f() && (compareTo = this.accountId.compareTo(mVPaymentAccount.accountId)) != 0) || (compareTo = Boolean.valueOf(mo30097o()).compareTo(Boolean.valueOf(mVPaymentAccount.mo30097o()))) != 0 || ((mo30097o() && (compareTo = C25082a.m62844h(this.userPaymentContexts, mVPaymentAccount.userPaymentContexts)) != 0) || (compareTo = Boolean.valueOf(mo30094k()).compareTo(Boolean.valueOf(mVPaymentAccount.mo30094k()))) != 0 || ((mo30094k() && (compareTo = this.personalInfo.compareTo(mVPaymentAccount.personalInfo)) != 0) || (compareTo = Boolean.valueOf(mo30093j()).compareTo(Boolean.valueOf(mVPaymentAccount.mo30093j()))) != 0 || ((mo30093j() && (compareTo = C25082a.m62844h(this.paymentMethods, mVPaymentAccount.paymentMethods)) != 0) || (compareTo = Boolean.valueOf(mo30095l()).compareTo(Boolean.valueOf(mVPaymentAccount.mo30095l()))) != 0 || ((mo30095l() && (compareTo = C25082a.m62844h(this.profiles, mVPaymentAccount.profiles)) != 0) || (compareTo = Boolean.valueOf(mo30090h()).compareTo(Boolean.valueOf(mVPaymentAccount.mo30090h()))) != 0 || ((mo30090h() && (compareTo = this.badge.compareTo(mVPaymentAccount.badge)) != 0) || (compareTo = Boolean.valueOf(mo30092i()).compareTo(Boolean.valueOf(mVPaymentAccount.mo30092i()))) != 0 || ((mo30092i() && (compareTo = C25082a.m62844h(this.certificates, mVPaymentAccount.certificates)) != 0) || (compareTo = Boolean.valueOf(mo30096m()).compareTo(Boolean.valueOf(mVPaymentAccount.mo30096m()))) != 0 || ((mo30096m() && (compareTo = this.settings.compareTo(mVPaymentAccount.settings)) != 0) || (compareTo = Boolean.valueOf(mo30089g()).compareTo(Boolean.valueOf(mVPaymentAccount.mo30089g()))) != 0))))))))) {
            return compareTo;
        }
        if (!mo30089g() || (h = C25082a.m62844h(this.accountProducts, mVPaymentAccount.accountProducts)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVPaymentAccount)) {
            return mo30085a((MVPaymentAccount) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30088f() {
        return this.accountId != null;
    }

    /* renamed from: g */
    public final boolean mo30089g() {
        return this.accountProducts != null;
    }

    /* renamed from: h */
    public final boolean mo30090h() {
        return this.badge != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30092i() {
        return this.certificates != null;
    }

    /* renamed from: j */
    public final boolean mo30093j() {
        return this.paymentMethods != null;
    }

    /* renamed from: k */
    public final boolean mo30094k() {
        return this.personalInfo != null;
    }

    /* renamed from: l */
    public final boolean mo30095l() {
        return this.profiles != null;
    }

    /* renamed from: m */
    public final boolean mo30096m() {
        return this.settings != null;
    }

    /* renamed from: o */
    public final boolean mo30097o() {
        return this.userPaymentContexts != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentAccount(", "accountId:");
        String str = this.accountId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("userPaymentContexts:");
        List<MVPaymentAccountContext> list = this.userPaymentContexts;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("personalInfo:");
        MVPaymentAccountPersonalInfo mVPaymentAccountPersonalInfo = this.personalInfo;
        if (mVPaymentAccountPersonalInfo == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPaymentAccountPersonalInfo);
        }
        n.append(", ");
        n.append("paymentMethods:");
        List<MVPaymentMethodInfo> list2 = this.paymentMethods;
        if (list2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list2);
        }
        n.append(", ");
        n.append("profiles:");
        List<MVPaymentAccountProfile> list3 = this.profiles;
        if (list3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list3);
        }
        if (mo30090h()) {
            n.append(", ");
            n.append("badge:");
            MVPaymentAccountBadgeType mVPaymentAccountBadgeType = this.badge;
            if (mVPaymentAccountBadgeType == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPaymentAccountBadgeType);
            }
        }
        n.append(", ");
        n.append("certificates:");
        List<MVPaymentAccountCertificate> list4 = this.certificates;
        if (list4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list4);
        }
        n.append(", ");
        n.append("settings:");
        MVPaymentAccountSettings mVPaymentAccountSettings = this.settings;
        if (mVPaymentAccountSettings == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVPaymentAccountSettings);
        }
        n.append(", ");
        n.append("accountProducts:");
        List<MVPaymentAccountProduct> list5 = this.accountProducts;
        if (list5 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list5);
        }
        n.append(")");
        return n.toString();
    }
}
