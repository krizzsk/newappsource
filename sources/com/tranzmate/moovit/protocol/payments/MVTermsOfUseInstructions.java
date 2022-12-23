package com.tranzmate.moovit.protocol.payments;

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

public class MVTermsOfUseInstructions implements TBase<MVTermsOfUseInstructions, _Fields>, Serializable, Cloneable, Comparable<MVTermsOfUseInstructions> {

    /* renamed from: b */
    public static final C25113c f27712b = new C25113c("temsTitle", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27713c = new C25113c("termsSubtitle", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27714d = new C25113c("terms", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f27715e = new C25113c("image", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f27716f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27717g;
    public MVImageReferenceWithParams image;
    public String temsTitle;
    public MVTOS terms;
    public String termsSubtitle;

    public enum _Fields implements C25085c {
        TEMS_TITLE(1, "temsTitle"),
        TERMS_SUBTITLE(2, "termsSubtitle"),
        TERMS(3, "terms"),
        IMAGE(4, "image");
        
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
                return TEMS_TITLE;
            }
            if (i == 2) {
                return TERMS_SUBTITLE;
            }
            if (i == 3) {
                return TERMS;
            }
            if (i != 4) {
                return null;
            }
            return IMAGE;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTermsOfUseInstructions$a */
    public static class C10077a extends C25239c<MVTermsOfUseInstructions> {
        public C10077a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTermsOfUseInstructions mVTermsOfUseInstructions = (MVTermsOfUseInstructions) tBase;
            MVTOS mvtos = mVTermsOfUseInstructions.terms;
            C25113c cVar = MVTermsOfUseInstructions.f27712b;
            gVar.mo61687K();
            if (mVTermsOfUseInstructions.temsTitle != null) {
                gVar.mo61711x(MVTermsOfUseInstructions.f27712b);
                gVar.mo61686J(mVTermsOfUseInstructions.temsTitle);
                gVar.mo61712y();
            }
            if (mVTermsOfUseInstructions.termsSubtitle != null) {
                gVar.mo61711x(MVTermsOfUseInstructions.f27713c);
                gVar.mo61686J(mVTermsOfUseInstructions.termsSubtitle);
                gVar.mo61712y();
            }
            if (mVTermsOfUseInstructions.terms != null) {
                gVar.mo61711x(MVTermsOfUseInstructions.f27714d);
                mVTermsOfUseInstructions.terms.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTermsOfUseInstructions.image != null) {
                gVar.mo61711x(MVTermsOfUseInstructions.f27715e);
                mVTermsOfUseInstructions.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTermsOfUseInstructions mVTermsOfUseInstructions = (MVTermsOfUseInstructions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVTOS mvtos = mVTermsOfUseInstructions.terms;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                                mVTermsOfUseInstructions.image = mVImageReferenceWithParams;
                                mVImageReferenceWithParams.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVTOS mvtos2 = new MVTOS();
                            mVTermsOfUseInstructions.terms = mvtos2;
                            mvtos2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVTermsOfUseInstructions.termsSubtitle = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTermsOfUseInstructions.temsTitle = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTermsOfUseInstructions$b */
    public static class C10078b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10077a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTermsOfUseInstructions$c */
    public static class C10079c extends C25240d<MVTermsOfUseInstructions> {
        public C10079c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTermsOfUseInstructions mVTermsOfUseInstructions = (MVTermsOfUseInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTermsOfUseInstructions.mo30623g()) {
                bitSet.set(0);
            }
            if (mVTermsOfUseInstructions.mo30626i()) {
                bitSet.set(1);
            }
            if (mVTermsOfUseInstructions.mo30624h()) {
                bitSet.set(2);
            }
            if (mVTermsOfUseInstructions.mo30622f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTermsOfUseInstructions.mo30623g()) {
                jVar.mo61686J(mVTermsOfUseInstructions.temsTitle);
            }
            if (mVTermsOfUseInstructions.mo30626i()) {
                jVar.mo61686J(mVTermsOfUseInstructions.termsSubtitle);
            }
            if (mVTermsOfUseInstructions.mo30624h()) {
                mVTermsOfUseInstructions.terms.mo25202X0(jVar);
            }
            if (mVTermsOfUseInstructions.mo30622f()) {
                mVTermsOfUseInstructions.image.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTermsOfUseInstructions mVTermsOfUseInstructions = (MVTermsOfUseInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTermsOfUseInstructions.temsTitle = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTermsOfUseInstructions.termsSubtitle = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVTOS mvtos = new MVTOS();
                mVTermsOfUseInstructions.terms = mvtos;
                mvtos.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVTermsOfUseInstructions.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTermsOfUseInstructions$d */
    public static class C10080d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10079c(0);
        }
    }

    static {
        new C17394d0("MVTermsOfUseInstructions");
        HashMap hashMap = new HashMap();
        f27716f = hashMap;
        hashMap.put(C25239c.class, new C10078b());
        hashMap.put(C25240d.class, new C10080d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TEMS_TITLE, new FieldMetaData("temsTitle", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TERMS_SUBTITLE, new FieldMetaData("termsSubtitle", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TERMS, new FieldMetaData("terms", (byte) 3, new StructMetaData(MVTOS.class)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27717g = unmodifiableMap;
        FieldMetaData.m61947a(MVTermsOfUseInstructions.class, unmodifiableMap);
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
        ((C25238b) f27716f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27716f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30619a(MVTermsOfUseInstructions mVTermsOfUseInstructions) {
        if (mVTermsOfUseInstructions == null) {
            return false;
        }
        boolean g = mo30623g();
        boolean g2 = mVTermsOfUseInstructions.mo30623g();
        if ((g || g2) && (!g || !g2 || !this.temsTitle.equals(mVTermsOfUseInstructions.temsTitle))) {
            return false;
        }
        boolean i = mo30626i();
        boolean i2 = mVTermsOfUseInstructions.mo30626i();
        if ((i || i2) && (!i || !i2 || !this.termsSubtitle.equals(mVTermsOfUseInstructions.termsSubtitle))) {
            return false;
        }
        boolean h = mo30624h();
        boolean h2 = mVTermsOfUseInstructions.mo30624h();
        if ((h || h2) && (!h || !h2 || !this.terms.mo30602a(mVTermsOfUseInstructions.terms))) {
            return false;
        }
        boolean f = mo30622f();
        boolean f2 = mVTermsOfUseInstructions.mo30622f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.image.mo26245a(mVTermsOfUseInstructions.image)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTermsOfUseInstructions mVTermsOfUseInstructions = (MVTermsOfUseInstructions) obj;
        if (!getClass().equals(mVTermsOfUseInstructions.getClass())) {
            return getClass().getName().compareTo(mVTermsOfUseInstructions.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30623g()).compareTo(Boolean.valueOf(mVTermsOfUseInstructions.mo30623g()));
        if (compareTo2 != 0 || ((mo30623g() && (compareTo2 = this.temsTitle.compareTo(mVTermsOfUseInstructions.temsTitle)) != 0) || (compareTo2 = Boolean.valueOf(mo30626i()).compareTo(Boolean.valueOf(mVTermsOfUseInstructions.mo30626i()))) != 0 || ((mo30626i() && (compareTo2 = this.termsSubtitle.compareTo(mVTermsOfUseInstructions.termsSubtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo30624h()).compareTo(Boolean.valueOf(mVTermsOfUseInstructions.mo30624h()))) != 0 || ((mo30624h() && (compareTo2 = this.terms.compareTo(mVTermsOfUseInstructions.terms)) != 0) || (compareTo2 = Boolean.valueOf(mo30622f()).compareTo(Boolean.valueOf(mVTermsOfUseInstructions.mo30622f()))) != 0)))) {
            return compareTo2;
        }
        if (!mo30622f() || (compareTo = this.image.compareTo(mVTermsOfUseInstructions.image)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTermsOfUseInstructions)) {
            return mo30619a((MVTermsOfUseInstructions) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30622f() {
        return this.image != null;
    }

    /* renamed from: g */
    public final boolean mo30623g() {
        return this.temsTitle != null;
    }

    /* renamed from: h */
    public final boolean mo30624h() {
        return this.terms != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30626i() {
        return this.termsSubtitle != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTermsOfUseInstructions(", "temsTitle:");
        String str = this.temsTitle;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("termsSubtitle:");
        String str2 = this.termsSubtitle;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("terms:");
        MVTOS mvtos = this.terms;
        if (mvtos == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mvtos);
        }
        n.append(", ");
        n.append("image:");
        MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
        if (mVImageReferenceWithParams == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVImageReferenceWithParams);
        }
        n.append(")");
        return n.toString();
    }
}
