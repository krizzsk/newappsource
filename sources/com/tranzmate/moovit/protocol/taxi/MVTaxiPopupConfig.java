package com.tranzmate.moovit.protocol.taxi;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
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

public class MVTaxiPopupConfig implements TBase<MVTaxiPopupConfig, _Fields>, Serializable, Cloneable, Comparable<MVTaxiPopupConfig> {

    /* renamed from: b */
    public static final C25113c f28622b = new C25113c("icon", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f28623c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28624d = new C25113c("subtitle", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28625e = new C25113c("cta", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f28626f = new C25113c("promoCode", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f28627g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f28628h;
    public String cta;
    public MVImageReferenceWithParams icon;
    private _Fields[] optionals = {_Fields.PROMO_CODE};
    public String promoCode;
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        ICON(1, "icon"),
        TITLE(2, "title"),
        SUBTITLE(3, "subtitle"),
        CTA(4, "cta"),
        PROMO_CODE(5, "promoCode");
        
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
                return ICON;
            }
            if (i == 2) {
                return TITLE;
            }
            if (i == 3) {
                return SUBTITLE;
            }
            if (i == 4) {
                return CTA;
            }
            if (i != 5) {
                return null;
            }
            return PROMO_CODE;
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

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiPopupConfig$a */
    public static class C10740a extends C25239c<MVTaxiPopupConfig> {
        public C10740a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiPopupConfig mVTaxiPopupConfig = (MVTaxiPopupConfig) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVTaxiPopupConfig.icon;
            C25113c cVar = MVTaxiPopupConfig.f28622b;
            gVar.mo61687K();
            if (mVTaxiPopupConfig.icon != null) {
                gVar.mo61711x(MVTaxiPopupConfig.f28622b);
                mVTaxiPopupConfig.icon.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTaxiPopupConfig.title != null) {
                gVar.mo61711x(MVTaxiPopupConfig.f28623c);
                gVar.mo61686J(mVTaxiPopupConfig.title);
                gVar.mo61712y();
            }
            if (mVTaxiPopupConfig.subtitle != null) {
                gVar.mo61711x(MVTaxiPopupConfig.f28624d);
                gVar.mo61686J(mVTaxiPopupConfig.subtitle);
                gVar.mo61712y();
            }
            if (mVTaxiPopupConfig.cta != null) {
                gVar.mo61711x(MVTaxiPopupConfig.f28625e);
                gVar.mo61686J(mVTaxiPopupConfig.cta);
                gVar.mo61712y();
            }
            if (mVTaxiPopupConfig.promoCode != null && mVTaxiPopupConfig.mo32238h()) {
                gVar.mo61711x(MVTaxiPopupConfig.f28626f);
                gVar.mo61686J(mVTaxiPopupConfig.promoCode);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiPopupConfig mVTaxiPopupConfig = (MVTaxiPopupConfig) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVTaxiPopupConfig.icon;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 11) {
                                    mVTaxiPopupConfig.promoCode = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVTaxiPopupConfig.cta = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVTaxiPopupConfig.subtitle = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVTaxiPopupConfig.title = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                    mVTaxiPopupConfig.icon = mVImageReferenceWithParams2;
                    mVImageReferenceWithParams2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiPopupConfig$b */
    public static class C10741b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10740a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiPopupConfig$c */
    public static class C10742c extends C25240d<MVTaxiPopupConfig> {
        public C10742c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiPopupConfig mVTaxiPopupConfig = (MVTaxiPopupConfig) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTaxiPopupConfig.mo32237g()) {
                bitSet.set(0);
            }
            if (mVTaxiPopupConfig.mo32241j()) {
                bitSet.set(1);
            }
            if (mVTaxiPopupConfig.mo32240i()) {
                bitSet.set(2);
            }
            if (mVTaxiPopupConfig.mo32236f()) {
                bitSet.set(3);
            }
            if (mVTaxiPopupConfig.mo32238h()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVTaxiPopupConfig.mo32237g()) {
                mVTaxiPopupConfig.icon.mo25202X0(jVar);
            }
            if (mVTaxiPopupConfig.mo32241j()) {
                jVar.mo61686J(mVTaxiPopupConfig.title);
            }
            if (mVTaxiPopupConfig.mo32240i()) {
                jVar.mo61686J(mVTaxiPopupConfig.subtitle);
            }
            if (mVTaxiPopupConfig.mo32236f()) {
                jVar.mo61686J(mVTaxiPopupConfig.cta);
            }
            if (mVTaxiPopupConfig.mo32238h()) {
                jVar.mo61686J(mVTaxiPopupConfig.promoCode);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiPopupConfig mVTaxiPopupConfig = (MVTaxiPopupConfig) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVTaxiPopupConfig.icon = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVTaxiPopupConfig.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVTaxiPopupConfig.subtitle = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVTaxiPopupConfig.cta = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVTaxiPopupConfig.promoCode = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.taxi.MVTaxiPopupConfig$d */
    public static class C10743d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10742c(0);
        }
    }

    static {
        new C17394d0("MVTaxiPopupConfig");
        HashMap hashMap = new HashMap();
        f28627g = hashMap;
        hashMap.put(C25239c.class, new C10741b());
        hashMap.put(C25240d.class, new C10743d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ICON, new FieldMetaData("icon", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CTA, new FieldMetaData("cta", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PROMO_CODE, new FieldMetaData("promoCode", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28628h = unmodifiableMap;
        FieldMetaData.m61947a(MVTaxiPopupConfig.class, unmodifiableMap);
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
        ((C25238b) f28627g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28627g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo32233a(MVTaxiPopupConfig mVTaxiPopupConfig) {
        if (mVTaxiPopupConfig == null) {
            return false;
        }
        boolean g = mo32237g();
        boolean g2 = mVTaxiPopupConfig.mo32237g();
        if ((g || g2) && (!g || !g2 || !this.icon.mo26245a(mVTaxiPopupConfig.icon))) {
            return false;
        }
        boolean j = mo32241j();
        boolean j2 = mVTaxiPopupConfig.mo32241j();
        if ((j || j2) && (!j || !j2 || !this.title.equals(mVTaxiPopupConfig.title))) {
            return false;
        }
        boolean i = mo32240i();
        boolean i2 = mVTaxiPopupConfig.mo32240i();
        if ((i || i2) && (!i || !i2 || !this.subtitle.equals(mVTaxiPopupConfig.subtitle))) {
            return false;
        }
        boolean f = mo32236f();
        boolean f2 = mVTaxiPopupConfig.mo32236f();
        if ((f || f2) && (!f || !f2 || !this.cta.equals(mVTaxiPopupConfig.cta))) {
            return false;
        }
        boolean h = mo32238h();
        boolean h2 = mVTaxiPopupConfig.mo32238h();
        if (!h && !h2) {
            return true;
        }
        if (!h || !h2 || !this.promoCode.equals(mVTaxiPopupConfig.promoCode)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTaxiPopupConfig mVTaxiPopupConfig = (MVTaxiPopupConfig) obj;
        if (!getClass().equals(mVTaxiPopupConfig.getClass())) {
            return getClass().getName().compareTo(mVTaxiPopupConfig.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo32237g()).compareTo(Boolean.valueOf(mVTaxiPopupConfig.mo32237g()));
        if (compareTo2 != 0 || ((mo32237g() && (compareTo2 = this.icon.compareTo(mVTaxiPopupConfig.icon)) != 0) || (compareTo2 = Boolean.valueOf(mo32241j()).compareTo(Boolean.valueOf(mVTaxiPopupConfig.mo32241j()))) != 0 || ((mo32241j() && (compareTo2 = this.title.compareTo(mVTaxiPopupConfig.title)) != 0) || (compareTo2 = Boolean.valueOf(mo32240i()).compareTo(Boolean.valueOf(mVTaxiPopupConfig.mo32240i()))) != 0 || ((mo32240i() && (compareTo2 = this.subtitle.compareTo(mVTaxiPopupConfig.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo32236f()).compareTo(Boolean.valueOf(mVTaxiPopupConfig.mo32236f()))) != 0 || ((mo32236f() && (compareTo2 = this.cta.compareTo(mVTaxiPopupConfig.cta)) != 0) || (compareTo2 = Boolean.valueOf(mo32238h()).compareTo(Boolean.valueOf(mVTaxiPopupConfig.mo32238h()))) != 0))))) {
            return compareTo2;
        }
        if (!mo32238h() || (compareTo = this.promoCode.compareTo(mVTaxiPopupConfig.promoCode)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTaxiPopupConfig)) {
            return mo32233a((MVTaxiPopupConfig) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo32236f() {
        return this.cta != null;
    }

    /* renamed from: g */
    public final boolean mo32237g() {
        return this.icon != null;
    }

    /* renamed from: h */
    public final boolean mo32238h() {
        return this.promoCode != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo32240i() {
        return this.subtitle != null;
    }

    /* renamed from: j */
    public final boolean mo32241j() {
        return this.title != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTaxiPopupConfig(", "icon:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.icon;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        n.append(", ");
        n.append("title:");
        String str = this.title;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("subtitle:");
        String str2 = this.subtitle;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("cta:");
        String str3 = this.cta;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        if (mo32238h()) {
            n.append(", ");
            n.append("promoCode:");
            String str4 = this.promoCode;
            if (str4 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str4);
            }
        }
        n.append(")");
        return n.toString();
    }
}
