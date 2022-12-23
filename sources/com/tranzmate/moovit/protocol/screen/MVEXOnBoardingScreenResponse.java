package com.tranzmate.moovit.protocol.screen;

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

public class MVEXOnBoardingScreenResponse implements TBase<MVEXOnBoardingScreenResponse, _Fields>, Serializable, Cloneable, Comparable<MVEXOnBoardingScreenResponse> {

    /* renamed from: b */
    public static final C25113c f28149b = new C25113c("image", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f28150c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28151d = new C25113c("descriptionText", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28152e = new C25113c("cta", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f28153f = new C25113c("secondaryCta", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f28154g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f28155h;
    public MVEXOnBoardingScreenCta cta;
    public String descriptionText;
    public String image;
    private _Fields[] optionals = {_Fields.SECONDARY_CTA};
    public MVEXOnBoardingScreenCta secondaryCta;
    public String title;

    public enum _Fields implements C25085c {
        IMAGE(1, "image"),
        TITLE(2, "title"),
        DESCRIPTION_TEXT(3, "descriptionText"),
        CTA(4, "cta"),
        SECONDARY_CTA(5, "secondaryCta");
        
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
                return IMAGE;
            }
            if (i == 2) {
                return TITLE;
            }
            if (i == 3) {
                return DESCRIPTION_TEXT;
            }
            if (i == 4) {
                return CTA;
            }
            if (i != 5) {
                return null;
            }
            return SECONDARY_CTA;
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

    /* renamed from: com.tranzmate.moovit.protocol.screen.MVEXOnBoardingScreenResponse$a */
    public static class C10407a extends C25239c<MVEXOnBoardingScreenResponse> {
        public C10407a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEXOnBoardingScreenResponse mVEXOnBoardingScreenResponse = (MVEXOnBoardingScreenResponse) tBase;
            MVEXOnBoardingScreenCta mVEXOnBoardingScreenCta = mVEXOnBoardingScreenResponse.cta;
            C25113c cVar = MVEXOnBoardingScreenResponse.f28149b;
            gVar.mo61687K();
            if (mVEXOnBoardingScreenResponse.image != null) {
                gVar.mo61711x(MVEXOnBoardingScreenResponse.f28149b);
                gVar.mo61686J(mVEXOnBoardingScreenResponse.image);
                gVar.mo61712y();
            }
            if (mVEXOnBoardingScreenResponse.title != null) {
                gVar.mo61711x(MVEXOnBoardingScreenResponse.f28150c);
                gVar.mo61686J(mVEXOnBoardingScreenResponse.title);
                gVar.mo61712y();
            }
            if (mVEXOnBoardingScreenResponse.descriptionText != null) {
                gVar.mo61711x(MVEXOnBoardingScreenResponse.f28151d);
                gVar.mo61686J(mVEXOnBoardingScreenResponse.descriptionText);
                gVar.mo61712y();
            }
            if (mVEXOnBoardingScreenResponse.cta != null) {
                gVar.mo61711x(MVEXOnBoardingScreenResponse.f28152e);
                mVEXOnBoardingScreenResponse.cta.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVEXOnBoardingScreenResponse.secondaryCta != null && mVEXOnBoardingScreenResponse.mo31430i()) {
                gVar.mo61711x(MVEXOnBoardingScreenResponse.f28153f);
                mVEXOnBoardingScreenResponse.secondaryCta.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEXOnBoardingScreenResponse mVEXOnBoardingScreenResponse = (MVEXOnBoardingScreenResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVEXOnBoardingScreenCta mVEXOnBoardingScreenCta = mVEXOnBoardingScreenResponse.cta;
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
                                    MVEXOnBoardingScreenCta mVEXOnBoardingScreenCta2 = new MVEXOnBoardingScreenCta();
                                    mVEXOnBoardingScreenResponse.secondaryCta = mVEXOnBoardingScreenCta2;
                                    mVEXOnBoardingScreenCta2.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 12) {
                                MVEXOnBoardingScreenCta mVEXOnBoardingScreenCta3 = new MVEXOnBoardingScreenCta();
                                mVEXOnBoardingScreenResponse.cta = mVEXOnBoardingScreenCta3;
                                mVEXOnBoardingScreenCta3.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVEXOnBoardingScreenResponse.descriptionText = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVEXOnBoardingScreenResponse.title = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVEXOnBoardingScreenResponse.image = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.screen.MVEXOnBoardingScreenResponse$b */
    public static class C10408b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10407a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.screen.MVEXOnBoardingScreenResponse$c */
    public static class C10409c extends C25240d<MVEXOnBoardingScreenResponse> {
        public C10409c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEXOnBoardingScreenResponse mVEXOnBoardingScreenResponse = (MVEXOnBoardingScreenResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVEXOnBoardingScreenResponse.mo31428h()) {
                bitSet.set(0);
            }
            if (mVEXOnBoardingScreenResponse.mo31431j()) {
                bitSet.set(1);
            }
            if (mVEXOnBoardingScreenResponse.mo31427g()) {
                bitSet.set(2);
            }
            if (mVEXOnBoardingScreenResponse.mo31426f()) {
                bitSet.set(3);
            }
            if (mVEXOnBoardingScreenResponse.mo31430i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVEXOnBoardingScreenResponse.mo31428h()) {
                jVar.mo61686J(mVEXOnBoardingScreenResponse.image);
            }
            if (mVEXOnBoardingScreenResponse.mo31431j()) {
                jVar.mo61686J(mVEXOnBoardingScreenResponse.title);
            }
            if (mVEXOnBoardingScreenResponse.mo31427g()) {
                jVar.mo61686J(mVEXOnBoardingScreenResponse.descriptionText);
            }
            if (mVEXOnBoardingScreenResponse.mo31426f()) {
                mVEXOnBoardingScreenResponse.cta.mo25202X0(jVar);
            }
            if (mVEXOnBoardingScreenResponse.mo31430i()) {
                mVEXOnBoardingScreenResponse.secondaryCta.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEXOnBoardingScreenResponse mVEXOnBoardingScreenResponse = (MVEXOnBoardingScreenResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVEXOnBoardingScreenResponse.image = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVEXOnBoardingScreenResponse.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVEXOnBoardingScreenResponse.descriptionText = jVar.mo61704q();
            }
            if (T.get(3)) {
                MVEXOnBoardingScreenCta mVEXOnBoardingScreenCta = new MVEXOnBoardingScreenCta();
                mVEXOnBoardingScreenResponse.cta = mVEXOnBoardingScreenCta;
                mVEXOnBoardingScreenCta.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVEXOnBoardingScreenCta mVEXOnBoardingScreenCta2 = new MVEXOnBoardingScreenCta();
                mVEXOnBoardingScreenResponse.secondaryCta = mVEXOnBoardingScreenCta2;
                mVEXOnBoardingScreenCta2.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.screen.MVEXOnBoardingScreenResponse$d */
    public static class C10410d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10409c(0);
        }
    }

    static {
        new C17394d0("MVEXOnBoardingScreenResponse");
        HashMap hashMap = new HashMap();
        f28154g = hashMap;
        hashMap.put(C25239c.class, new C10408b());
        hashMap.put(C25240d.class, new C10410d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DESCRIPTION_TEXT, new FieldMetaData("descriptionText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CTA, new FieldMetaData("cta", (byte) 3, new StructMetaData(MVEXOnBoardingScreenCta.class)));
        enumMap.put(_Fields.SECONDARY_CTA, new FieldMetaData("secondaryCta", (byte) 2, new StructMetaData(MVEXOnBoardingScreenCta.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28155h = unmodifiableMap;
        FieldMetaData.m61947a(MVEXOnBoardingScreenResponse.class, unmodifiableMap);
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
        ((C25238b) f28154g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28154g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVEXOnBoardingScreenResponse mVEXOnBoardingScreenResponse = (MVEXOnBoardingScreenResponse) obj;
        if (!getClass().equals(mVEXOnBoardingScreenResponse.getClass())) {
            return getClass().getName().compareTo(mVEXOnBoardingScreenResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31428h()).compareTo(Boolean.valueOf(mVEXOnBoardingScreenResponse.mo31428h()));
        if (compareTo2 != 0 || ((mo31428h() && (compareTo2 = this.image.compareTo(mVEXOnBoardingScreenResponse.image)) != 0) || (compareTo2 = Boolean.valueOf(mo31431j()).compareTo(Boolean.valueOf(mVEXOnBoardingScreenResponse.mo31431j()))) != 0 || ((mo31431j() && (compareTo2 = this.title.compareTo(mVEXOnBoardingScreenResponse.title)) != 0) || (compareTo2 = Boolean.valueOf(mo31427g()).compareTo(Boolean.valueOf(mVEXOnBoardingScreenResponse.mo31427g()))) != 0 || ((mo31427g() && (compareTo2 = this.descriptionText.compareTo(mVEXOnBoardingScreenResponse.descriptionText)) != 0) || (compareTo2 = Boolean.valueOf(mo31426f()).compareTo(Boolean.valueOf(mVEXOnBoardingScreenResponse.mo31426f()))) != 0 || ((mo31426f() && (compareTo2 = this.cta.compareTo(mVEXOnBoardingScreenResponse.cta)) != 0) || (compareTo2 = Boolean.valueOf(mo31430i()).compareTo(Boolean.valueOf(mVEXOnBoardingScreenResponse.mo31430i()))) != 0))))) {
            return compareTo2;
        }
        if (!mo31430i() || (compareTo = this.secondaryCta.compareTo(mVEXOnBoardingScreenResponse.secondaryCta)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVEXOnBoardingScreenResponse)) {
            return false;
        }
        MVEXOnBoardingScreenResponse mVEXOnBoardingScreenResponse = (MVEXOnBoardingScreenResponse) obj;
        boolean h = mo31428h();
        boolean h2 = mVEXOnBoardingScreenResponse.mo31428h();
        if ((h || h2) && (!h || !h2 || !this.image.equals(mVEXOnBoardingScreenResponse.image))) {
            return false;
        }
        boolean j = mo31431j();
        boolean j2 = mVEXOnBoardingScreenResponse.mo31431j();
        if ((j || j2) && (!j || !j2 || !this.title.equals(mVEXOnBoardingScreenResponse.title))) {
            return false;
        }
        boolean g = mo31427g();
        boolean g2 = mVEXOnBoardingScreenResponse.mo31427g();
        if ((g || g2) && (!g || !g2 || !this.descriptionText.equals(mVEXOnBoardingScreenResponse.descriptionText))) {
            return false;
        }
        boolean f = mo31426f();
        boolean f2 = mVEXOnBoardingScreenResponse.mo31426f();
        if ((f || f2) && (!f || !f2 || !this.cta.mo31416a(mVEXOnBoardingScreenResponse.cta))) {
            return false;
        }
        boolean i = mo31430i();
        boolean i2 = mVEXOnBoardingScreenResponse.mo31430i();
        if ((i || i2) && (!i || !i2 || !this.secondaryCta.mo31416a(mVEXOnBoardingScreenResponse.secondaryCta))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31426f() {
        return this.cta != null;
    }

    /* renamed from: g */
    public final boolean mo31427g() {
        return this.descriptionText != null;
    }

    /* renamed from: h */
    public final boolean mo31428h() {
        return this.image != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31430i() {
        return this.secondaryCta != null;
    }

    /* renamed from: j */
    public final boolean mo31431j() {
        return this.title != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVEXOnBoardingScreenResponse(", "image:");
        String str = this.image;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("title:");
        String str2 = this.title;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("descriptionText:");
        String str3 = this.descriptionText;
        if (str3 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str3);
        }
        n.append(", ");
        n.append("cta:");
        MVEXOnBoardingScreenCta mVEXOnBoardingScreenCta = this.cta;
        if (mVEXOnBoardingScreenCta == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVEXOnBoardingScreenCta);
        }
        if (mo31430i()) {
            n.append(", ");
            n.append("secondaryCta:");
            MVEXOnBoardingScreenCta mVEXOnBoardingScreenCta2 = this.secondaryCta;
            if (mVEXOnBoardingScreenCta2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVEXOnBoardingScreenCta2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
