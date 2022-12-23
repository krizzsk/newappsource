package com.tranzmate.moovit.protocol.wondo;

import com.appboy.models.InAppMessageImmersiveBase;
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

public class MVWondoRewardDisplayInfo implements TBase<MVWondoRewardDisplayInfo, _Fields>, Serializable, Cloneable, Comparable<MVWondoRewardDisplayInfo> {

    /* renamed from: b */
    public static final C25113c f30779b = new C25113c("iconUrl", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30780c = new C25113c(InAppMessageImmersiveBase.HEADER, (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30781d = new C25113c("descriptionText", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f30782e = new C25113c("quantityText", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f30783f = new C25113c("expirationText", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f30784g = new C25113c("legalUrl", (byte) 11, 6);

    /* renamed from: h */
    public static final HashMap f30785h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f30786i;
    public String descriptionText;
    public String expirationText;
    public String header;
    public String iconUrl;
    public String legalUrl;
    private _Fields[] optionals = {_Fields.DESCRIPTION_TEXT};
    public String quantityText;

    public enum _Fields implements C25085c {
        ICON_URL(1, "iconUrl"),
        HEADER(2, InAppMessageImmersiveBase.HEADER),
        DESCRIPTION_TEXT(3, "descriptionText"),
        QUANTITY_TEXT(4, "quantityText"),
        EXPIRATION_TEXT(5, "expirationText"),
        LEGAL_URL(6, "legalUrl");
        
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
                    return HEADER;
                case 3:
                    return DESCRIPTION_TEXT;
                case 4:
                    return QUANTITY_TEXT;
                case 5:
                    return EXPIRATION_TEXT;
                case 6:
                    return LEGAL_URL;
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoRewardDisplayInfo$a */
    public static class C12071a extends C25239c<MVWondoRewardDisplayInfo> {
        public C12071a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoRewardDisplayInfo mVWondoRewardDisplayInfo = (MVWondoRewardDisplayInfo) tBase;
            mVWondoRewardDisplayInfo.getClass();
            C25113c cVar = MVWondoRewardDisplayInfo.f30779b;
            gVar.mo61687K();
            if (mVWondoRewardDisplayInfo.iconUrl != null) {
                gVar.mo61711x(MVWondoRewardDisplayInfo.f30779b);
                gVar.mo61686J(mVWondoRewardDisplayInfo.iconUrl);
                gVar.mo61712y();
            }
            if (mVWondoRewardDisplayInfo.header != null) {
                gVar.mo61711x(MVWondoRewardDisplayInfo.f30780c);
                gVar.mo61686J(mVWondoRewardDisplayInfo.header);
                gVar.mo61712y();
            }
            if (mVWondoRewardDisplayInfo.descriptionText != null && mVWondoRewardDisplayInfo.mo35759f()) {
                gVar.mo61711x(MVWondoRewardDisplayInfo.f30781d);
                gVar.mo61686J(mVWondoRewardDisplayInfo.descriptionText);
                gVar.mo61712y();
            }
            if (mVWondoRewardDisplayInfo.quantityText != null) {
                gVar.mo61711x(MVWondoRewardDisplayInfo.f30782e);
                gVar.mo61686J(mVWondoRewardDisplayInfo.quantityText);
                gVar.mo61712y();
            }
            if (mVWondoRewardDisplayInfo.expirationText != null) {
                gVar.mo61711x(MVWondoRewardDisplayInfo.f30783f);
                gVar.mo61686J(mVWondoRewardDisplayInfo.expirationText);
                gVar.mo61712y();
            }
            if (mVWondoRewardDisplayInfo.legalUrl != null) {
                gVar.mo61711x(MVWondoRewardDisplayInfo.f30784g);
                gVar.mo61686J(mVWondoRewardDisplayInfo.legalUrl);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoRewardDisplayInfo mVWondoRewardDisplayInfo = (MVWondoRewardDisplayInfo) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVWondoRewardDisplayInfo.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoRewardDisplayInfo.iconUrl = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoRewardDisplayInfo.header = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoRewardDisplayInfo.descriptionText = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoRewardDisplayInfo.quantityText = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoRewardDisplayInfo.expirationText = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVWondoRewardDisplayInfo.legalUrl = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoRewardDisplayInfo$b */
    public static class C12072b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12071a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoRewardDisplayInfo$c */
    public static class C12073c extends C25240d<MVWondoRewardDisplayInfo> {
        public C12073c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoRewardDisplayInfo mVWondoRewardDisplayInfo = (MVWondoRewardDisplayInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWondoRewardDisplayInfo.mo35763i()) {
                bitSet.set(0);
            }
            if (mVWondoRewardDisplayInfo.mo35761h()) {
                bitSet.set(1);
            }
            if (mVWondoRewardDisplayInfo.mo35759f()) {
                bitSet.set(2);
            }
            if (mVWondoRewardDisplayInfo.mo35765k()) {
                bitSet.set(3);
            }
            if (mVWondoRewardDisplayInfo.mo35760g()) {
                bitSet.set(4);
            }
            if (mVWondoRewardDisplayInfo.mo35764j()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVWondoRewardDisplayInfo.mo35763i()) {
                jVar.mo61686J(mVWondoRewardDisplayInfo.iconUrl);
            }
            if (mVWondoRewardDisplayInfo.mo35761h()) {
                jVar.mo61686J(mVWondoRewardDisplayInfo.header);
            }
            if (mVWondoRewardDisplayInfo.mo35759f()) {
                jVar.mo61686J(mVWondoRewardDisplayInfo.descriptionText);
            }
            if (mVWondoRewardDisplayInfo.mo35765k()) {
                jVar.mo61686J(mVWondoRewardDisplayInfo.quantityText);
            }
            if (mVWondoRewardDisplayInfo.mo35760g()) {
                jVar.mo61686J(mVWondoRewardDisplayInfo.expirationText);
            }
            if (mVWondoRewardDisplayInfo.mo35764j()) {
                jVar.mo61686J(mVWondoRewardDisplayInfo.legalUrl);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoRewardDisplayInfo mVWondoRewardDisplayInfo = (MVWondoRewardDisplayInfo) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVWondoRewardDisplayInfo.iconUrl = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVWondoRewardDisplayInfo.header = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVWondoRewardDisplayInfo.descriptionText = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVWondoRewardDisplayInfo.quantityText = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVWondoRewardDisplayInfo.expirationText = jVar.mo61704q();
            }
            if (T.get(5)) {
                mVWondoRewardDisplayInfo.legalUrl = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoRewardDisplayInfo$d */
    public static class C12074d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12073c(0);
        }
    }

    static {
        new C17394d0("MVWondoRewardDisplayInfo");
        HashMap hashMap = new HashMap();
        f30785h = hashMap;
        hashMap.put(C25239c.class, new C12072b());
        hashMap.put(C25240d.class, new C12074d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ICON_URL, new FieldMetaData("iconUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.HEADER, new FieldMetaData(InAppMessageImmersiveBase.HEADER, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DESCRIPTION_TEXT, new FieldMetaData("descriptionText", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.QUANTITY_TEXT, new FieldMetaData("quantityText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.EXPIRATION_TEXT, new FieldMetaData("expirationText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LEGAL_URL, new FieldMetaData("legalUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30786i = unmodifiableMap;
        FieldMetaData.m61947a(MVWondoRewardDisplayInfo.class, unmodifiableMap);
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
        ((C25238b) f30785h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30785h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo35756a(MVWondoRewardDisplayInfo mVWondoRewardDisplayInfo) {
        if (mVWondoRewardDisplayInfo == null) {
            return false;
        }
        boolean i = mo35763i();
        boolean i2 = mVWondoRewardDisplayInfo.mo35763i();
        if ((i || i2) && (!i || !i2 || !this.iconUrl.equals(mVWondoRewardDisplayInfo.iconUrl))) {
            return false;
        }
        boolean h = mo35761h();
        boolean h2 = mVWondoRewardDisplayInfo.mo35761h();
        if ((h || h2) && (!h || !h2 || !this.header.equals(mVWondoRewardDisplayInfo.header))) {
            return false;
        }
        boolean f = mo35759f();
        boolean f2 = mVWondoRewardDisplayInfo.mo35759f();
        if ((f || f2) && (!f || !f2 || !this.descriptionText.equals(mVWondoRewardDisplayInfo.descriptionText))) {
            return false;
        }
        boolean k = mo35765k();
        boolean k2 = mVWondoRewardDisplayInfo.mo35765k();
        if ((k || k2) && (!k || !k2 || !this.quantityText.equals(mVWondoRewardDisplayInfo.quantityText))) {
            return false;
        }
        boolean g = mo35760g();
        boolean g2 = mVWondoRewardDisplayInfo.mo35760g();
        if ((g || g2) && (!g || !g2 || !this.expirationText.equals(mVWondoRewardDisplayInfo.expirationText))) {
            return false;
        }
        boolean j = mo35764j();
        boolean j2 = mVWondoRewardDisplayInfo.mo35764j();
        if (!j && !j2) {
            return true;
        }
        if (!j || !j2 || !this.legalUrl.equals(mVWondoRewardDisplayInfo.legalUrl)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVWondoRewardDisplayInfo mVWondoRewardDisplayInfo = (MVWondoRewardDisplayInfo) obj;
        if (!getClass().equals(mVWondoRewardDisplayInfo.getClass())) {
            return getClass().getName().compareTo(mVWondoRewardDisplayInfo.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35763i()).compareTo(Boolean.valueOf(mVWondoRewardDisplayInfo.mo35763i()));
        if (compareTo2 != 0 || ((mo35763i() && (compareTo2 = this.iconUrl.compareTo(mVWondoRewardDisplayInfo.iconUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo35761h()).compareTo(Boolean.valueOf(mVWondoRewardDisplayInfo.mo35761h()))) != 0 || ((mo35761h() && (compareTo2 = this.header.compareTo(mVWondoRewardDisplayInfo.header)) != 0) || (compareTo2 = Boolean.valueOf(mo35759f()).compareTo(Boolean.valueOf(mVWondoRewardDisplayInfo.mo35759f()))) != 0 || ((mo35759f() && (compareTo2 = this.descriptionText.compareTo(mVWondoRewardDisplayInfo.descriptionText)) != 0) || (compareTo2 = Boolean.valueOf(mo35765k()).compareTo(Boolean.valueOf(mVWondoRewardDisplayInfo.mo35765k()))) != 0 || ((mo35765k() && (compareTo2 = this.quantityText.compareTo(mVWondoRewardDisplayInfo.quantityText)) != 0) || (compareTo2 = Boolean.valueOf(mo35760g()).compareTo(Boolean.valueOf(mVWondoRewardDisplayInfo.mo35760g()))) != 0 || ((mo35760g() && (compareTo2 = this.expirationText.compareTo(mVWondoRewardDisplayInfo.expirationText)) != 0) || (compareTo2 = Boolean.valueOf(mo35764j()).compareTo(Boolean.valueOf(mVWondoRewardDisplayInfo.mo35764j()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo35764j() || (compareTo = this.legalUrl.compareTo(mVWondoRewardDisplayInfo.legalUrl)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVWondoRewardDisplayInfo)) {
            return mo35756a((MVWondoRewardDisplayInfo) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35759f() {
        return this.descriptionText != null;
    }

    /* renamed from: g */
    public final boolean mo35760g() {
        return this.expirationText != null;
    }

    /* renamed from: h */
    public final boolean mo35761h() {
        return this.header != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35763i() {
        return this.iconUrl != null;
    }

    /* renamed from: j */
    public final boolean mo35764j() {
        return this.legalUrl != null;
    }

    /* renamed from: k */
    public final boolean mo35765k() {
        return this.quantityText != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWondoRewardDisplayInfo(", "iconUrl:");
        String str = this.iconUrl;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("header:");
        String str2 = this.header;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo35759f()) {
            n.append(", ");
            n.append("descriptionText:");
            String str3 = this.descriptionText;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(", ");
        n.append("quantityText:");
        String str4 = this.quantityText;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(", ");
        n.append("expirationText:");
        String str5 = this.expirationText;
        if (str5 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str5);
        }
        n.append(", ");
        n.append("legalUrl:");
        String str6 = this.legalUrl;
        if (str6 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str6);
        }
        n.append(")");
        return n.toString();
    }
}
