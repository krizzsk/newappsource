package com.tranzmate.moovit.protocol.wondo;

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
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
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

public class MVWondoOfferDisplayInfo implements TBase<MVWondoOfferDisplayInfo, _Fields>, Serializable, Cloneable, Comparable<MVWondoOfferDisplayInfo> {

    /* renamed from: b */
    public static final C25113c f30730b = new C25113c("iconUrl", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30731c = new C25113c("iconProviderUrl", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30732d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f30733e = new C25113c("shortDescription", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f30734f = new C25113c("longDescription", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f30735g = new C25113c("availabilityDescription", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f30736h = new C25113c("legalUrl", (byte) 11, 7);

    /* renamed from: i */
    public static final C25113c f30737i = new C25113c("isHighlight", (byte) 2, 8);

    /* renamed from: j */
    public static final C25113c f30738j = new C25113c("instructions", (byte) 12, 9);

    /* renamed from: k */
    public static final HashMap f30739k;

    /* renamed from: l */
    public static final Map<_Fields, FieldMetaData> f30740l;
    private byte __isset_bitfield = 0;
    public String availabilityDescription;
    public String iconProviderUrl;
    public String iconUrl;
    public MVWondoOfferInstructions instructions;
    public boolean isHighlight;
    public String legalUrl;
    public String longDescription;
    private _Fields[] optionals = {_Fields.INSTRUCTIONS};
    public String shortDescription;
    public String title;

    public enum _Fields implements C25085c {
        ICON_URL(1, "iconUrl"),
        ICON_PROVIDER_URL(2, "iconProviderUrl"),
        TITLE(3, "title"),
        SHORT_DESCRIPTION(4, "shortDescription"),
        LONG_DESCRIPTION(5, "longDescription"),
        AVAILABILITY_DESCRIPTION(6, "availabilityDescription"),
        LEGAL_URL(7, "legalUrl"),
        IS_HIGHLIGHT(8, "isHighlight"),
        INSTRUCTIONS(9, "instructions");
        
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
                    return ICON_URL;
                case 2:
                    return ICON_PROVIDER_URL;
                case 3:
                    return TITLE;
                case 4:
                    return SHORT_DESCRIPTION;
                case 5:
                    return LONG_DESCRIPTION;
                case 6:
                    return AVAILABILITY_DESCRIPTION;
                case 7:
                    return LEGAL_URL;
                case 8:
                    return IS_HIGHLIGHT;
                case 9:
                    return INSTRUCTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoOfferDisplayInfo$a */
    public static class C12041a extends C25239c<MVWondoOfferDisplayInfo> {
        public C12041a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoOfferDisplayInfo mVWondoOfferDisplayInfo = (MVWondoOfferDisplayInfo) tBase;
            MVWondoOfferInstructions mVWondoOfferInstructions = mVWondoOfferDisplayInfo.instructions;
            C25113c cVar = MVWondoOfferDisplayInfo.f30730b;
            gVar.mo61687K();
            if (mVWondoOfferDisplayInfo.iconUrl != null) {
                gVar.mo61711x(MVWondoOfferDisplayInfo.f30730b);
                gVar.mo61686J(mVWondoOfferDisplayInfo.iconUrl);
                gVar.mo61712y();
            }
            if (mVWondoOfferDisplayInfo.iconProviderUrl != null) {
                gVar.mo61711x(MVWondoOfferDisplayInfo.f30731c);
                gVar.mo61686J(mVWondoOfferDisplayInfo.iconProviderUrl);
                gVar.mo61712y();
            }
            if (mVWondoOfferDisplayInfo.title != null) {
                gVar.mo61711x(MVWondoOfferDisplayInfo.f30732d);
                gVar.mo61686J(mVWondoOfferDisplayInfo.title);
                gVar.mo61712y();
            }
            if (mVWondoOfferDisplayInfo.shortDescription != null) {
                gVar.mo61711x(MVWondoOfferDisplayInfo.f30733e);
                gVar.mo61686J(mVWondoOfferDisplayInfo.shortDescription);
                gVar.mo61712y();
            }
            if (mVWondoOfferDisplayInfo.longDescription != null) {
                gVar.mo61711x(MVWondoOfferDisplayInfo.f30734f);
                gVar.mo61686J(mVWondoOfferDisplayInfo.longDescription);
                gVar.mo61712y();
            }
            if (mVWondoOfferDisplayInfo.availabilityDescription != null) {
                gVar.mo61711x(MVWondoOfferDisplayInfo.f30735g);
                gVar.mo61686J(mVWondoOfferDisplayInfo.availabilityDescription);
                gVar.mo61712y();
            }
            if (mVWondoOfferDisplayInfo.legalUrl != null) {
                gVar.mo61711x(MVWondoOfferDisplayInfo.f30736h);
                gVar.mo61686J(mVWondoOfferDisplayInfo.legalUrl);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVWondoOfferDisplayInfo.f30737i);
            gVar.mo61708u(mVWondoOfferDisplayInfo.isHighlight);
            gVar.mo61712y();
            if (mVWondoOfferDisplayInfo.instructions != null && mVWondoOfferDisplayInfo.mo35690i()) {
                gVar.mo61711x(MVWondoOfferDisplayInfo.f30738j);
                mVWondoOfferDisplayInfo.instructions.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoOfferDisplayInfo mVWondoOfferDisplayInfo = (MVWondoOfferDisplayInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVWondoOfferInstructions mVWondoOfferInstructions = mVWondoOfferDisplayInfo.instructions;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoOfferDisplayInfo.iconUrl = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoOfferDisplayInfo.iconProviderUrl = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoOfferDisplayInfo.title = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoOfferDisplayInfo.shortDescription = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoOfferDisplayInfo.longDescription = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoOfferDisplayInfo.availabilityDescription = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoOfferDisplayInfo.legalUrl = gVar.mo61704q();
                            break;
                        }
                    case 8:
                        if (b != 2) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoOfferDisplayInfo.isHighlight = gVar.mo61690c();
                            mVWondoOfferDisplayInfo.mo35696p();
                            break;
                        }
                    case 9:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVWondoOfferInstructions mVWondoOfferInstructions2 = new MVWondoOfferInstructions();
                            mVWondoOfferDisplayInfo.instructions = mVWondoOfferInstructions2;
                            mVWondoOfferInstructions2.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoOfferDisplayInfo$b */
    public static class C12042b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12041a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoOfferDisplayInfo$c */
    public static class C12043c extends C25240d<MVWondoOfferDisplayInfo> {
        public C12043c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoOfferDisplayInfo mVWondoOfferDisplayInfo = (MVWondoOfferDisplayInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWondoOfferDisplayInfo.mo35688h()) {
                bitSet.set(0);
            }
            if (mVWondoOfferDisplayInfo.mo35687g()) {
                bitSet.set(1);
            }
            if (mVWondoOfferDisplayInfo.mo35695o()) {
                bitSet.set(2);
            }
            if (mVWondoOfferDisplayInfo.mo35694m()) {
                bitSet.set(3);
            }
            if (mVWondoOfferDisplayInfo.mo35693l()) {
                bitSet.set(4);
            }
            if (mVWondoOfferDisplayInfo.mo35686f()) {
                bitSet.set(5);
            }
            if (mVWondoOfferDisplayInfo.mo35692k()) {
                bitSet.set(6);
            }
            if (mVWondoOfferDisplayInfo.mo35691j()) {
                bitSet.set(7);
            }
            if (mVWondoOfferDisplayInfo.mo35690i()) {
                bitSet.set(8);
            }
            jVar.mo61738U(bitSet, 9);
            if (mVWondoOfferDisplayInfo.mo35688h()) {
                jVar.mo61686J(mVWondoOfferDisplayInfo.iconUrl);
            }
            if (mVWondoOfferDisplayInfo.mo35687g()) {
                jVar.mo61686J(mVWondoOfferDisplayInfo.iconProviderUrl);
            }
            if (mVWondoOfferDisplayInfo.mo35695o()) {
                jVar.mo61686J(mVWondoOfferDisplayInfo.title);
            }
            if (mVWondoOfferDisplayInfo.mo35694m()) {
                jVar.mo61686J(mVWondoOfferDisplayInfo.shortDescription);
            }
            if (mVWondoOfferDisplayInfo.mo35693l()) {
                jVar.mo61686J(mVWondoOfferDisplayInfo.longDescription);
            }
            if (mVWondoOfferDisplayInfo.mo35686f()) {
                jVar.mo61686J(mVWondoOfferDisplayInfo.availabilityDescription);
            }
            if (mVWondoOfferDisplayInfo.mo35692k()) {
                jVar.mo61686J(mVWondoOfferDisplayInfo.legalUrl);
            }
            if (mVWondoOfferDisplayInfo.mo35691j()) {
                jVar.mo61708u(mVWondoOfferDisplayInfo.isHighlight);
            }
            if (mVWondoOfferDisplayInfo.mo35690i()) {
                mVWondoOfferDisplayInfo.instructions.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoOfferDisplayInfo mVWondoOfferDisplayInfo = (MVWondoOfferDisplayInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(9);
            if (T.get(0)) {
                mVWondoOfferDisplayInfo.iconUrl = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVWondoOfferDisplayInfo.iconProviderUrl = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVWondoOfferDisplayInfo.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVWondoOfferDisplayInfo.shortDescription = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVWondoOfferDisplayInfo.longDescription = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVWondoOfferDisplayInfo.availabilityDescription = jVar.mo61704q();
            }
            if (T.get(6)) {
                mVWondoOfferDisplayInfo.legalUrl = jVar.mo61704q();
            }
            if (T.get(7)) {
                mVWondoOfferDisplayInfo.isHighlight = jVar.mo61690c();
                mVWondoOfferDisplayInfo.mo35696p();
            }
            if (T.get(8)) {
                MVWondoOfferInstructions mVWondoOfferInstructions = new MVWondoOfferInstructions();
                mVWondoOfferDisplayInfo.instructions = mVWondoOfferInstructions;
                mVWondoOfferInstructions.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoOfferDisplayInfo$d */
    public static class C12044d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12043c(0);
        }
    }

    static {
        new C17394d0("MVWondoOfferDisplayInfo");
        HashMap hashMap = new HashMap();
        f30739k = hashMap;
        hashMap.put(C25239c.class, new C12042b());
        hashMap.put(C25240d.class, new C12044d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ICON_URL, new FieldMetaData("iconUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ICON_PROVIDER_URL, new FieldMetaData("iconProviderUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SHORT_DESCRIPTION, new FieldMetaData("shortDescription", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LONG_DESCRIPTION, new FieldMetaData("longDescription", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.AVAILABILITY_DESCRIPTION, new FieldMetaData("availabilityDescription", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LEGAL_URL, new FieldMetaData("legalUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_HIGHLIGHT, new FieldMetaData("isHighlight", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.INSTRUCTIONS, new FieldMetaData("instructions", (byte) 2, new StructMetaData(MVWondoOfferInstructions.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30740l = unmodifiableMap;
        FieldMetaData.m61947a(MVWondoOfferDisplayInfo.class, unmodifiableMap);
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
        ((C25238b) f30739k.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30739k.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo35683a(MVWondoOfferDisplayInfo mVWondoOfferDisplayInfo) {
        if (mVWondoOfferDisplayInfo == null) {
            return false;
        }
        boolean h = mo35688h();
        boolean h2 = mVWondoOfferDisplayInfo.mo35688h();
        if ((h || h2) && (!h || !h2 || !this.iconUrl.equals(mVWondoOfferDisplayInfo.iconUrl))) {
            return false;
        }
        boolean g = mo35687g();
        boolean g2 = mVWondoOfferDisplayInfo.mo35687g();
        if ((g || g2) && (!g || !g2 || !this.iconProviderUrl.equals(mVWondoOfferDisplayInfo.iconProviderUrl))) {
            return false;
        }
        boolean o = mo35695o();
        boolean o2 = mVWondoOfferDisplayInfo.mo35695o();
        if ((o || o2) && (!o || !o2 || !this.title.equals(mVWondoOfferDisplayInfo.title))) {
            return false;
        }
        boolean m = mo35694m();
        boolean m2 = mVWondoOfferDisplayInfo.mo35694m();
        if ((m || m2) && (!m || !m2 || !this.shortDescription.equals(mVWondoOfferDisplayInfo.shortDescription))) {
            return false;
        }
        boolean l = mo35693l();
        boolean l2 = mVWondoOfferDisplayInfo.mo35693l();
        if ((l || l2) && (!l || !l2 || !this.longDescription.equals(mVWondoOfferDisplayInfo.longDescription))) {
            return false;
        }
        boolean f = mo35686f();
        boolean f2 = mVWondoOfferDisplayInfo.mo35686f();
        if ((f || f2) && (!f || !f2 || !this.availabilityDescription.equals(mVWondoOfferDisplayInfo.availabilityDescription))) {
            return false;
        }
        boolean k = mo35692k();
        boolean k2 = mVWondoOfferDisplayInfo.mo35692k();
        if (((k || k2) && (!k || !k2 || !this.legalUrl.equals(mVWondoOfferDisplayInfo.legalUrl))) || this.isHighlight != mVWondoOfferDisplayInfo.isHighlight) {
            return false;
        }
        boolean i = mo35690i();
        boolean i2 = mVWondoOfferDisplayInfo.mo35690i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || !this.instructions.mo35699a(mVWondoOfferDisplayInfo.instructions)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVWondoOfferDisplayInfo mVWondoOfferDisplayInfo = (MVWondoOfferDisplayInfo) obj;
        if (!getClass().equals(mVWondoOfferDisplayInfo.getClass())) {
            return getClass().getName().compareTo(mVWondoOfferDisplayInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35688h()).compareTo(Boolean.valueOf(mVWondoOfferDisplayInfo.mo35688h()));
        if (compareTo2 != 0 || ((mo35688h() && (compareTo2 = this.iconUrl.compareTo(mVWondoOfferDisplayInfo.iconUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo35687g()).compareTo(Boolean.valueOf(mVWondoOfferDisplayInfo.mo35687g()))) != 0 || ((mo35687g() && (compareTo2 = this.iconProviderUrl.compareTo(mVWondoOfferDisplayInfo.iconProviderUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo35695o()).compareTo(Boolean.valueOf(mVWondoOfferDisplayInfo.mo35695o()))) != 0 || ((mo35695o() && (compareTo2 = this.title.compareTo(mVWondoOfferDisplayInfo.title)) != 0) || (compareTo2 = Boolean.valueOf(mo35694m()).compareTo(Boolean.valueOf(mVWondoOfferDisplayInfo.mo35694m()))) != 0 || ((mo35694m() && (compareTo2 = this.shortDescription.compareTo(mVWondoOfferDisplayInfo.shortDescription)) != 0) || (compareTo2 = Boolean.valueOf(mo35693l()).compareTo(Boolean.valueOf(mVWondoOfferDisplayInfo.mo35693l()))) != 0 || ((mo35693l() && (compareTo2 = this.longDescription.compareTo(mVWondoOfferDisplayInfo.longDescription)) != 0) || (compareTo2 = Boolean.valueOf(mo35686f()).compareTo(Boolean.valueOf(mVWondoOfferDisplayInfo.mo35686f()))) != 0 || ((mo35686f() && (compareTo2 = this.availabilityDescription.compareTo(mVWondoOfferDisplayInfo.availabilityDescription)) != 0) || (compareTo2 = Boolean.valueOf(mo35692k()).compareTo(Boolean.valueOf(mVWondoOfferDisplayInfo.mo35692k()))) != 0 || ((mo35692k() && (compareTo2 = this.legalUrl.compareTo(mVWondoOfferDisplayInfo.legalUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo35691j()).compareTo(Boolean.valueOf(mVWondoOfferDisplayInfo.mo35691j()))) != 0 || ((mo35691j() && (compareTo2 = C25082a.m62848l(this.isHighlight, mVWondoOfferDisplayInfo.isHighlight)) != 0) || (compareTo2 = Boolean.valueOf(mo35690i()).compareTo(Boolean.valueOf(mVWondoOfferDisplayInfo.mo35690i()))) != 0))))))))) {
            return compareTo2;
        }
        if (!mo35690i() || (compareTo = this.instructions.compareTo(mVWondoOfferDisplayInfo.instructions)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVWondoOfferDisplayInfo)) {
            return mo35683a((MVWondoOfferDisplayInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35686f() {
        return this.availabilityDescription != null;
    }

    /* renamed from: g */
    public final boolean mo35687g() {
        return this.iconProviderUrl != null;
    }

    /* renamed from: h */
    public final boolean mo35688h() {
        return this.iconUrl != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35690i() {
        return this.instructions != null;
    }

    /* renamed from: j */
    public final boolean mo35691j() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: k */
    public final boolean mo35692k() {
        return this.legalUrl != null;
    }

    /* renamed from: l */
    public final boolean mo35693l() {
        return this.longDescription != null;
    }

    /* renamed from: m */
    public final boolean mo35694m() {
        return this.shortDescription != null;
    }

    /* renamed from: o */
    public final boolean mo35695o() {
        return this.title != null;
    }

    /* renamed from: p */
    public final void mo35696p() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWondoOfferDisplayInfo(", "iconUrl:");
        String str = this.iconUrl;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("iconProviderUrl:");
        String str2 = this.iconProviderUrl;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("title:");
        String str3 = this.title;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("shortDescription:");
        String str4 = this.shortDescription;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(", ");
        n.append("longDescription:");
        String str5 = this.longDescription;
        if (str5 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str5);
        }
        n.append(", ");
        n.append("availabilityDescription:");
        String str6 = this.availabilityDescription;
        if (str6 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str6);
        }
        n.append(", ");
        n.append("legalUrl:");
        String str7 = this.legalUrl;
        if (str7 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str7);
        }
        n.append(", ");
        n.append("isHighlight:");
        n.append(this.isHighlight);
        if (mo35690i()) {
            n.append(", ");
            n.append("instructions:");
            MVWondoOfferInstructions mVWondoOfferInstructions = this.instructions;
            if (mVWondoOfferInstructions == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVWondoOfferInstructions);
            }
        }
        n.append(")");
        return n.toString();
    }
}
