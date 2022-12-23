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

public class MVWondoConfirmation implements TBase<MVWondoConfirmation, _Fields>, Serializable, Cloneable, Comparable<MVWondoConfirmation> {

    /* renamed from: b */
    public static final C25113c f30700b = new C25113c("imageUrl", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30701c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f30702d = new C25113c("descriptionText", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f30703e = new C25113c("cta", (byte) 12, 4);

    /* renamed from: f */
    public static final C25113c f30704f = new C25113c("secondaryCta", (byte) 12, 5);

    /* renamed from: g */
    public static final HashMap f30705g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f30706h;
    public MVWondoCta cta;
    public String descriptionText;
    public String imageUrl;
    private _Fields[] optionals = {_Fields.SECONDARY_CTA};
    public MVWondoCta secondaryCta;
    public String title;

    public enum _Fields implements C25085c {
        IMAGE_URL(1, "imageUrl"),
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
                return IMAGE_URL;
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

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoConfirmation$a */
    public static class C12025a extends C25239c<MVWondoConfirmation> {
        public C12025a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoConfirmation mVWondoConfirmation = (MVWondoConfirmation) tBase;
            mVWondoConfirmation.mo35648k();
            C25113c cVar = MVWondoConfirmation.f30700b;
            gVar.mo61687K();
            if (mVWondoConfirmation.imageUrl != null) {
                gVar.mo61711x(MVWondoConfirmation.f30700b);
                gVar.mo61686J(mVWondoConfirmation.imageUrl);
                gVar.mo61712y();
            }
            if (mVWondoConfirmation.title != null) {
                gVar.mo61711x(MVWondoConfirmation.f30701c);
                gVar.mo61686J(mVWondoConfirmation.title);
                gVar.mo61712y();
            }
            if (mVWondoConfirmation.descriptionText != null) {
                gVar.mo61711x(MVWondoConfirmation.f30702d);
                gVar.mo61686J(mVWondoConfirmation.descriptionText);
                gVar.mo61712y();
            }
            if (mVWondoConfirmation.cta != null) {
                gVar.mo61711x(MVWondoConfirmation.f30703e);
                mVWondoConfirmation.cta.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVWondoConfirmation.secondaryCta != null && mVWondoConfirmation.mo35646i()) {
                gVar.mo61711x(MVWondoConfirmation.f30704f);
                mVWondoConfirmation.secondaryCta.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoConfirmation mVWondoConfirmation = (MVWondoConfirmation) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVWondoConfirmation.mo35648k();
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
                                    MVWondoCta mVWondoCta = new MVWondoCta();
                                    mVWondoConfirmation.secondaryCta = mVWondoCta;
                                    mVWondoCta.mo25201C1(gVar);
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 12) {
                                MVWondoCta mVWondoCta2 = new MVWondoCta();
                                mVWondoConfirmation.cta = mVWondoCta2;
                                mVWondoCta2.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVWondoConfirmation.descriptionText = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVWondoConfirmation.title = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVWondoConfirmation.imageUrl = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoConfirmation$b */
    public static class C12026b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12025a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoConfirmation$c */
    public static class C12027c extends C25240d<MVWondoConfirmation> {
        public C12027c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVWondoConfirmation mVWondoConfirmation = (MVWondoConfirmation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVWondoConfirmation.mo35644h()) {
                bitSet.set(0);
            }
            if (mVWondoConfirmation.mo35647j()) {
                bitSet.set(1);
            }
            if (mVWondoConfirmation.mo35643g()) {
                bitSet.set(2);
            }
            if (mVWondoConfirmation.mo35642f()) {
                bitSet.set(3);
            }
            if (mVWondoConfirmation.mo35646i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVWondoConfirmation.mo35644h()) {
                jVar.mo61686J(mVWondoConfirmation.imageUrl);
            }
            if (mVWondoConfirmation.mo35647j()) {
                jVar.mo61686J(mVWondoConfirmation.title);
            }
            if (mVWondoConfirmation.mo35643g()) {
                jVar.mo61686J(mVWondoConfirmation.descriptionText);
            }
            if (mVWondoConfirmation.mo35642f()) {
                mVWondoConfirmation.cta.mo25202X0(jVar);
            }
            if (mVWondoConfirmation.mo35646i()) {
                mVWondoConfirmation.secondaryCta.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVWondoConfirmation mVWondoConfirmation = (MVWondoConfirmation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVWondoConfirmation.imageUrl = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVWondoConfirmation.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVWondoConfirmation.descriptionText = jVar.mo61704q();
            }
            if (T.get(3)) {
                MVWondoCta mVWondoCta = new MVWondoCta();
                mVWondoConfirmation.cta = mVWondoCta;
                mVWondoCta.mo25201C1(jVar);
            }
            if (T.get(4)) {
                MVWondoCta mVWondoCta2 = new MVWondoCta();
                mVWondoConfirmation.secondaryCta = mVWondoCta2;
                mVWondoCta2.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.wondo.MVWondoConfirmation$d */
    public static class C12028d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C12027c(0);
        }
    }

    static {
        new C17394d0("MVWondoConfirmation");
        HashMap hashMap = new HashMap();
        f30705g = hashMap;
        hashMap.put(C25239c.class, new C12026b());
        hashMap.put(C25240d.class, new C12028d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IMAGE_URL, new FieldMetaData("imageUrl", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DESCRIPTION_TEXT, new FieldMetaData("descriptionText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CTA, new FieldMetaData("cta", (byte) 3, new StructMetaData(MVWondoCta.class)));
        enumMap.put(_Fields.SECONDARY_CTA, new FieldMetaData("secondaryCta", (byte) 2, new StructMetaData(MVWondoCta.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30706h = unmodifiableMap;
        FieldMetaData.m61947a(MVWondoConfirmation.class, unmodifiableMap);
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
        ((C25238b) f30705g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30705g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo35639a(MVWondoConfirmation mVWondoConfirmation) {
        if (mVWondoConfirmation == null) {
            return false;
        }
        boolean h = mo35644h();
        boolean h2 = mVWondoConfirmation.mo35644h();
        if ((h || h2) && (!h || !h2 || !this.imageUrl.equals(mVWondoConfirmation.imageUrl))) {
            return false;
        }
        boolean j = mo35647j();
        boolean j2 = mVWondoConfirmation.mo35647j();
        if ((j || j2) && (!j || !j2 || !this.title.equals(mVWondoConfirmation.title))) {
            return false;
        }
        boolean g = mo35643g();
        boolean g2 = mVWondoConfirmation.mo35643g();
        if ((g || g2) && (!g || !g2 || !this.descriptionText.equals(mVWondoConfirmation.descriptionText))) {
            return false;
        }
        boolean f = mo35642f();
        boolean f2 = mVWondoConfirmation.mo35642f();
        if ((f || f2) && (!f || !f2 || !this.cta.mo35651a(mVWondoConfirmation.cta))) {
            return false;
        }
        boolean i = mo35646i();
        boolean i2 = mVWondoConfirmation.mo35646i();
        if (!i && !i2) {
            return true;
        }
        if (!i || !i2 || !this.secondaryCta.mo35651a(mVWondoConfirmation.secondaryCta)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVWondoConfirmation mVWondoConfirmation = (MVWondoConfirmation) obj;
        if (!getClass().equals(mVWondoConfirmation.getClass())) {
            return getClass().getName().compareTo(mVWondoConfirmation.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35644h()).compareTo(Boolean.valueOf(mVWondoConfirmation.mo35644h()));
        if (compareTo2 != 0 || ((mo35644h() && (compareTo2 = this.imageUrl.compareTo(mVWondoConfirmation.imageUrl)) != 0) || (compareTo2 = Boolean.valueOf(mo35647j()).compareTo(Boolean.valueOf(mVWondoConfirmation.mo35647j()))) != 0 || ((mo35647j() && (compareTo2 = this.title.compareTo(mVWondoConfirmation.title)) != 0) || (compareTo2 = Boolean.valueOf(mo35643g()).compareTo(Boolean.valueOf(mVWondoConfirmation.mo35643g()))) != 0 || ((mo35643g() && (compareTo2 = this.descriptionText.compareTo(mVWondoConfirmation.descriptionText)) != 0) || (compareTo2 = Boolean.valueOf(mo35642f()).compareTo(Boolean.valueOf(mVWondoConfirmation.mo35642f()))) != 0 || ((mo35642f() && (compareTo2 = this.cta.compareTo(mVWondoConfirmation.cta)) != 0) || (compareTo2 = Boolean.valueOf(mo35646i()).compareTo(Boolean.valueOf(mVWondoConfirmation.mo35646i()))) != 0))))) {
            return compareTo2;
        }
        if (!mo35646i() || (compareTo = this.secondaryCta.compareTo(mVWondoConfirmation.secondaryCta)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVWondoConfirmation)) {
            return mo35639a((MVWondoConfirmation) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35642f() {
        return this.cta != null;
    }

    /* renamed from: g */
    public final boolean mo35643g() {
        return this.descriptionText != null;
    }

    /* renamed from: h */
    public final boolean mo35644h() {
        return this.imageUrl != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo35646i() {
        return this.secondaryCta != null;
    }

    /* renamed from: j */
    public final boolean mo35647j() {
        return this.title != null;
    }

    /* renamed from: k */
    public final void mo35648k() throws TException {
        MVWondoCta mVWondoCta = this.cta;
        if (mVWondoCta != null) {
            mVWondoCta.getClass();
        }
        MVWondoCta mVWondoCta2 = this.secondaryCta;
        if (mVWondoCta2 != null) {
            mVWondoCta2.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVWondoConfirmation(", "imageUrl:");
        String str = this.imageUrl;
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
        MVWondoCta mVWondoCta = this.cta;
        if (mVWondoCta == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVWondoCta);
        }
        if (mo35646i()) {
            n.append(", ");
            n.append("secondaryCta:");
            MVWondoCta mVWondoCta2 = this.secondaryCta;
            if (mVWondoCta2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVWondoCta2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
