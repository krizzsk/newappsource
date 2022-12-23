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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
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

public class MVProfileSpec implements TBase<MVProfileSpec, _Fields>, Serializable, Cloneable, Comparable<MVProfileSpec> {

    /* renamed from: b */
    public static final C25113c f27644b = new C25113c("profileId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27645c = new C25113c("mainProfileName", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27646d = new C25113c("profileName", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27647e = new C25113c("profileDescription", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f27648f = new C25113c("requiredInfos", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f27649g = new C25113c("metroId", (byte) 8, 6);

    /* renamed from: h */
    public static final C25113c f27650h = new C25113c("profileDiscountDescription", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f27651i = new C25113c("isDefaultProfile", (byte) 2, 8);

    /* renamed from: j */
    public static final C25113c f27652j = new C25113c("priceFactor", (byte) 4, 9);

    /* renamed from: k */
    public static final C25113c f27653k = new C25113c("profileExternalId", (byte) 11, 10);

    /* renamed from: l */
    public static final C25113c f27654l = new C25113c("iconImageId", (byte) 8, 11);

    /* renamed from: m */
    public static final HashMap f27655m;

    /* renamed from: n */
    public static final Map<_Fields, FieldMetaData> f27656n;
    private byte __isset_bitfield = 0;
    public int iconImageId;
    public boolean isDefaultProfile;
    public String mainProfileName;
    public int metroId;
    private _Fields[] optionals = {_Fields.REQUIRED_INFOS, _Fields.PROFILE_DISCOUNT_DESCRIPTION};
    public double priceFactor;
    public String profileDescription;
    public String profileDiscountDescription;
    public String profileExternalId;
    public int profileId;
    public String profileName;
    public List<MVProfileRequiredInfo> requiredInfos;

    public enum _Fields implements C25085c {
        PROFILE_ID(1, "profileId"),
        MAIN_PROFILE_NAME(2, "mainProfileName"),
        PROFILE_NAME(3, "profileName"),
        PROFILE_DESCRIPTION(4, "profileDescription"),
        REQUIRED_INFOS(5, "requiredInfos"),
        METRO_ID(6, "metroId"),
        PROFILE_DISCOUNT_DESCRIPTION(7, "profileDiscountDescription"),
        IS_DEFAULT_PROFILE(8, "isDefaultProfile"),
        PRICE_FACTOR(9, "priceFactor"),
        PROFILE_EXTERNAL_ID(10, "profileExternalId"),
        ICON_IMAGE_ID(11, "iconImageId");
        
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
                    return PROFILE_ID;
                case 2:
                    return MAIN_PROFILE_NAME;
                case 3:
                    return PROFILE_NAME;
                case 4:
                    return PROFILE_DESCRIPTION;
                case 5:
                    return REQUIRED_INFOS;
                case 6:
                    return METRO_ID;
                case 7:
                    return PROFILE_DISCOUNT_DESCRIPTION;
                case 8:
                    return IS_DEFAULT_PROFILE;
                case 9:
                    return PRICE_FACTOR;
                case 10:
                    return PROFILE_EXTERNAL_ID;
                case 11:
                    return ICON_IMAGE_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVProfileSpec$a */
    public static class C10029a extends C25239c<MVProfileSpec> {
        public C10029a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVProfileSpec mVProfileSpec = (MVProfileSpec) tBase;
            mVProfileSpec.getClass();
            C25113c cVar = MVProfileSpec.f27644b;
            gVar.mo61687K();
            gVar.mo61711x(MVProfileSpec.f27644b);
            gVar.mo61678B(mVProfileSpec.profileId);
            gVar.mo61712y();
            if (mVProfileSpec.mainProfileName != null) {
                gVar.mo61711x(MVProfileSpec.f27645c);
                gVar.mo61686J(mVProfileSpec.mainProfileName);
                gVar.mo61712y();
            }
            if (mVProfileSpec.profileName != null) {
                gVar.mo61711x(MVProfileSpec.f27646d);
                gVar.mo61686J(mVProfileSpec.profileName);
                gVar.mo61712y();
            }
            if (mVProfileSpec.profileDescription != null) {
                gVar.mo61711x(MVProfileSpec.f27647e);
                gVar.mo61686J(mVProfileSpec.profileDescription);
                gVar.mo61712y();
            }
            if (mVProfileSpec.requiredInfos != null && mVProfileSpec.mo30509q()) {
                gVar.mo61711x(MVProfileSpec.f27648f);
                gVar.mo61680D(new C25119e((byte) 12, mVProfileSpec.requiredInfos.size()));
                for (MVProfileRequiredInfo X0 : mVProfileSpec.requiredInfos) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61711x(MVProfileSpec.f27649g);
            gVar.mo61678B(mVProfileSpec.metroId);
            gVar.mo61712y();
            if (mVProfileSpec.profileDiscountDescription != null && mVProfileSpec.mo30505l()) {
                gVar.mo61711x(MVProfileSpec.f27650h);
                gVar.mo61686J(mVProfileSpec.profileDiscountDescription);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVProfileSpec.f27651i);
            gVar.mo61708u(mVProfileSpec.isDefaultProfile);
            gVar.mo61712y();
            gVar.mo61711x(MVProfileSpec.f27652j);
            gVar.mo61710w(mVProfileSpec.priceFactor);
            gVar.mo61712y();
            if (mVProfileSpec.profileExternalId != null) {
                gVar.mo61711x(MVProfileSpec.f27653k);
                gVar.mo61686J(mVProfileSpec.profileExternalId);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVProfileSpec.f27654l);
            C16530d.m42020n(gVar, mVProfileSpec.iconImageId);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVProfileSpec mVProfileSpec = (MVProfileSpec) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVProfileSpec.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfileSpec.profileId = gVar.mo61696i();
                            mVProfileSpec.mo30515v();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfileSpec.mainProfileName = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfileSpec.profileName = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfileSpec.profileDescription = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVProfileSpec.requiredInfos = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVProfileRequiredInfo mVProfileRequiredInfo = new MVProfileRequiredInfo();
                                mVProfileRequiredInfo.mo25201C1(gVar);
                                mVProfileSpec.requiredInfos.add(mVProfileRequiredInfo);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfileSpec.metroId = gVar.mo61696i();
                            mVProfileSpec.mo30512t();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfileSpec.profileDiscountDescription = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfileSpec.isDefaultProfile = gVar.mo61690c();
                            mVProfileSpec.mo30511s();
                            break;
                        }
                    case 9:
                        if (b != 4) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfileSpec.priceFactor = gVar.mo61692e();
                            mVProfileSpec.mo30514u();
                            break;
                        }
                    case 10:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfileSpec.profileExternalId = gVar.mo61704q();
                            break;
                        }
                    case 11:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVProfileSpec.iconImageId = gVar.mo61696i();
                            mVProfileSpec.mo30510r();
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVProfileSpec$b */
    public static class C10030b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10029a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVProfileSpec$c */
    public static class C10031c extends C25240d<MVProfileSpec> {
        public C10031c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVProfileSpec mVProfileSpec = (MVProfileSpec) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVProfileSpec.mo30507o()) {
                bitSet.set(0);
            }
            if (mVProfileSpec.mo30500h()) {
                bitSet.set(1);
            }
            if (mVProfileSpec.mo30508p()) {
                bitSet.set(2);
            }
            if (mVProfileSpec.mo30504k()) {
                bitSet.set(3);
            }
            if (mVProfileSpec.mo30509q()) {
                bitSet.set(4);
            }
            if (mVProfileSpec.mo30502i()) {
                bitSet.set(5);
            }
            if (mVProfileSpec.mo30505l()) {
                bitSet.set(6);
            }
            if (mVProfileSpec.mo30499g()) {
                bitSet.set(7);
            }
            if (mVProfileSpec.mo30503j()) {
                bitSet.set(8);
            }
            if (mVProfileSpec.mo30506m()) {
                bitSet.set(9);
            }
            if (mVProfileSpec.mo30498f()) {
                bitSet.set(10);
            }
            jVar.mo61738U(bitSet, 11);
            if (mVProfileSpec.mo30507o()) {
                jVar.mo61678B(mVProfileSpec.profileId);
            }
            if (mVProfileSpec.mo30500h()) {
                jVar.mo61686J(mVProfileSpec.mainProfileName);
            }
            if (mVProfileSpec.mo30508p()) {
                jVar.mo61686J(mVProfileSpec.profileName);
            }
            if (mVProfileSpec.mo30504k()) {
                jVar.mo61686J(mVProfileSpec.profileDescription);
            }
            if (mVProfileSpec.mo30509q()) {
                jVar.mo61678B(mVProfileSpec.requiredInfos.size());
                for (MVProfileRequiredInfo X0 : mVProfileSpec.requiredInfos) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVProfileSpec.mo30502i()) {
                jVar.mo61678B(mVProfileSpec.metroId);
            }
            if (mVProfileSpec.mo30505l()) {
                jVar.mo61686J(mVProfileSpec.profileDiscountDescription);
            }
            if (mVProfileSpec.mo30499g()) {
                jVar.mo61708u(mVProfileSpec.isDefaultProfile);
            }
            if (mVProfileSpec.mo30503j()) {
                jVar.mo61710w(mVProfileSpec.priceFactor);
            }
            if (mVProfileSpec.mo30506m()) {
                jVar.mo61686J(mVProfileSpec.profileExternalId);
            }
            if (mVProfileSpec.mo30498f()) {
                jVar.mo61678B(mVProfileSpec.iconImageId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVProfileSpec mVProfileSpec = (MVProfileSpec) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(11);
            if (T.get(0)) {
                mVProfileSpec.profileId = jVar.mo61696i();
                mVProfileSpec.mo30515v();
            }
            if (T.get(1)) {
                mVProfileSpec.mainProfileName = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVProfileSpec.profileName = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVProfileSpec.profileDescription = jVar.mo61704q();
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVProfileSpec.requiredInfos = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVProfileRequiredInfo mVProfileRequiredInfo = new MVProfileRequiredInfo();
                    mVProfileRequiredInfo.mo25201C1(jVar);
                    mVProfileSpec.requiredInfos.add(mVProfileRequiredInfo);
                }
            }
            if (T.get(5)) {
                mVProfileSpec.metroId = jVar.mo61696i();
                mVProfileSpec.mo30512t();
            }
            if (T.get(6)) {
                mVProfileSpec.profileDiscountDescription = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVProfileSpec.isDefaultProfile = jVar.mo61690c();
                mVProfileSpec.mo30511s();
            }
            if (T.get(8)) {
                mVProfileSpec.priceFactor = jVar.mo61692e();
                mVProfileSpec.mo30514u();
            }
            if (T.get(9)) {
                mVProfileSpec.profileExternalId = jVar.mo61704q();
            }
            if (T.get(10)) {
                mVProfileSpec.iconImageId = jVar.mo61696i();
                mVProfileSpec.mo30510r();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVProfileSpec$d */
    public static class C10032d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10031c(0);
        }
    }

    static {
        new C17394d0("MVProfileSpec");
        HashMap hashMap = new HashMap();
        f27655m = hashMap;
        hashMap.put(C25239c.class, new C10030b());
        hashMap.put(C25240d.class, new C10032d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PROFILE_ID, new FieldMetaData("profileId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.MAIN_PROFILE_NAME, new FieldMetaData("mainProfileName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PROFILE_NAME, new FieldMetaData("profileName", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PROFILE_DESCRIPTION, new FieldMetaData("profileDescription", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.REQUIRED_INFOS, new FieldMetaData("requiredInfos", (byte) 2, new ListMetaData(new StructMetaData(MVProfileRequiredInfo.class))));
        enumMap.put(_Fields.METRO_ID, new FieldMetaData("metroId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.PROFILE_DISCOUNT_DESCRIPTION, new FieldMetaData("profileDiscountDescription", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_DEFAULT_PROFILE, new FieldMetaData("isDefaultProfile", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.PRICE_FACTOR, new FieldMetaData("priceFactor", (byte) 3, new FieldValueMetaData((byte) 4, false)));
        enumMap.put(_Fields.PROFILE_EXTERNAL_ID, new FieldMetaData("profileExternalId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ICON_IMAGE_ID, new FieldMetaData("iconImageId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27656n = unmodifiableMap;
        FieldMetaData.m61947a(MVProfileSpec.class, unmodifiableMap);
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
        ((C25238b) f27655m.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27655m.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30495a(MVProfileSpec mVProfileSpec) {
        if (mVProfileSpec == null || this.profileId != mVProfileSpec.profileId) {
            return false;
        }
        boolean h = mo30500h();
        boolean h2 = mVProfileSpec.mo30500h();
        if ((h || h2) && (!h || !h2 || !this.mainProfileName.equals(mVProfileSpec.mainProfileName))) {
            return false;
        }
        boolean p = mo30508p();
        boolean p2 = mVProfileSpec.mo30508p();
        if ((p || p2) && (!p || !p2 || !this.profileName.equals(mVProfileSpec.profileName))) {
            return false;
        }
        boolean k = mo30504k();
        boolean k2 = mVProfileSpec.mo30504k();
        if ((k || k2) && (!k || !k2 || !this.profileDescription.equals(mVProfileSpec.profileDescription))) {
            return false;
        }
        boolean q = mo30509q();
        boolean q2 = mVProfileSpec.mo30509q();
        if (((q || q2) && (!q || !q2 || !this.requiredInfos.equals(mVProfileSpec.requiredInfos))) || this.metroId != mVProfileSpec.metroId) {
            return false;
        }
        boolean l = mo30505l();
        boolean l2 = mVProfileSpec.mo30505l();
        if (((l || l2) && (!l || !l2 || !this.profileDiscountDescription.equals(mVProfileSpec.profileDiscountDescription))) || this.isDefaultProfile != mVProfileSpec.isDefaultProfile || this.priceFactor != mVProfileSpec.priceFactor) {
            return false;
        }
        boolean m = mo30506m();
        boolean m2 = mVProfileSpec.mo30506m();
        if (((m || m2) && (!m || !m2 || !this.profileExternalId.equals(mVProfileSpec.profileExternalId))) || this.iconImageId != mVProfileSpec.iconImageId) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int c;
        MVProfileSpec mVProfileSpec = (MVProfileSpec) obj;
        if (!getClass().equals(mVProfileSpec.getClass())) {
            return getClass().getName().compareTo(mVProfileSpec.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30507o()).compareTo(Boolean.valueOf(mVProfileSpec.mo30507o()));
        if (compareTo != 0 || ((mo30507o() && (compareTo = C25082a.m62839c(this.profileId, mVProfileSpec.profileId)) != 0) || (compareTo = Boolean.valueOf(mo30500h()).compareTo(Boolean.valueOf(mVProfileSpec.mo30500h()))) != 0 || ((mo30500h() && (compareTo = this.mainProfileName.compareTo(mVProfileSpec.mainProfileName)) != 0) || (compareTo = Boolean.valueOf(mo30508p()).compareTo(Boolean.valueOf(mVProfileSpec.mo30508p()))) != 0 || ((mo30508p() && (compareTo = this.profileName.compareTo(mVProfileSpec.profileName)) != 0) || (compareTo = Boolean.valueOf(mo30504k()).compareTo(Boolean.valueOf(mVProfileSpec.mo30504k()))) != 0 || ((mo30504k() && (compareTo = this.profileDescription.compareTo(mVProfileSpec.profileDescription)) != 0) || (compareTo = Boolean.valueOf(mo30509q()).compareTo(Boolean.valueOf(mVProfileSpec.mo30509q()))) != 0 || ((mo30509q() && (compareTo = C25082a.m62844h(this.requiredInfos, mVProfileSpec.requiredInfos)) != 0) || (compareTo = Boolean.valueOf(mo30502i()).compareTo(Boolean.valueOf(mVProfileSpec.mo30502i()))) != 0 || ((mo30502i() && (compareTo = C25082a.m62839c(this.metroId, mVProfileSpec.metroId)) != 0) || (compareTo = Boolean.valueOf(mo30505l()).compareTo(Boolean.valueOf(mVProfileSpec.mo30505l()))) != 0 || ((mo30505l() && (compareTo = this.profileDiscountDescription.compareTo(mVProfileSpec.profileDiscountDescription)) != 0) || (compareTo = Boolean.valueOf(mo30499g()).compareTo(Boolean.valueOf(mVProfileSpec.mo30499g()))) != 0 || ((mo30499g() && (compareTo = C25082a.m62848l(this.isDefaultProfile, mVProfileSpec.isDefaultProfile)) != 0) || (compareTo = Boolean.valueOf(mo30503j()).compareTo(Boolean.valueOf(mVProfileSpec.mo30503j()))) != 0 || ((mo30503j() && (compareTo = C25082a.m62838b(this.priceFactor, mVProfileSpec.priceFactor)) != 0) || (compareTo = Boolean.valueOf(mo30506m()).compareTo(Boolean.valueOf(mVProfileSpec.mo30506m()))) != 0 || ((mo30506m() && (compareTo = this.profileExternalId.compareTo(mVProfileSpec.profileExternalId)) != 0) || (compareTo = Boolean.valueOf(mo30498f()).compareTo(Boolean.valueOf(mVProfileSpec.mo30498f()))) != 0))))))))))) {
            return compareTo;
        }
        if (!mo30498f() || (c = C25082a.m62839c(this.iconImageId, mVProfileSpec.iconImageId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVProfileSpec)) {
            return mo30495a((MVProfileSpec) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30498f() {
        return C13637c.m34053H(this.__isset_bitfield, 4);
    }

    /* renamed from: g */
    public final boolean mo30499g() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: h */
    public final boolean mo30500h() {
        return this.mainProfileName != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30502i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final boolean mo30503j() {
        return C13637c.m34053H(this.__isset_bitfield, 3);
    }

    /* renamed from: k */
    public final boolean mo30504k() {
        return this.profileDescription != null;
    }

    /* renamed from: l */
    public final boolean mo30505l() {
        return this.profileDiscountDescription != null;
    }

    /* renamed from: m */
    public final boolean mo30506m() {
        return this.profileExternalId != null;
    }

    /* renamed from: o */
    public final boolean mo30507o() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: p */
    public final boolean mo30508p() {
        return this.profileName != null;
    }

    /* renamed from: q */
    public final boolean mo30509q() {
        return this.requiredInfos != null;
    }

    /* renamed from: r */
    public final void mo30510r() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 4, true);
    }

    /* renamed from: s */
    public final void mo30511s() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: t */
    public final void mo30512t() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVProfileSpec(", "profileId:");
        C0016g.m42z(n, this.profileId, ", ", "mainProfileName:");
        String str = this.mainProfileName;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("profileName:");
        String str2 = this.profileName;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("profileDescription:");
        String str3 = this.profileDescription;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        if (mo30509q()) {
            n.append(", ");
            n.append("requiredInfos:");
            List<MVProfileRequiredInfo> list = this.requiredInfos;
            if (list == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(list);
            }
        }
        n.append(", ");
        n.append("metroId:");
        n.append(this.metroId);
        if (mo30505l()) {
            n.append(", ");
            n.append("profileDiscountDescription:");
            String str4 = this.profileDiscountDescription;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        n.append(", ");
        n.append("isDefaultProfile:");
        C13555b.m33977q(n, this.isDefaultProfile, ", ", "priceFactor:");
        C16759e.m42355k(n, this.priceFactor, ", ", "profileExternalId:");
        String str5 = this.profileExternalId;
        if (str5 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str5);
        }
        n.append(", ");
        n.append("iconImageId:");
        return C13437d.m33707l(n, this.iconImageId, ")");
    }

    /* renamed from: u */
    public final void mo30514u() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 3, true);
    }

    /* renamed from: v */
    public final void mo30515v() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }
}
