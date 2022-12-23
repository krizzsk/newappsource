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

public class MVCertificatesSpec implements TBase<MVCertificatesSpec, _Fields>, Serializable, Cloneable, Comparable<MVCertificatesSpec> {

    /* renamed from: b */
    public static final C25113c f27157b = new C25113c("certificateKey", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27158c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27159d = new C25113c("subTitle", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27160e = new C25113c("image", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f27161f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27162g;
    public String certificateKey;
    public MVImageReferenceWithParams image;
    private _Fields[] optionals = {_Fields.SUB_TITLE};
    public String subTitle;
    public String title;

    public enum _Fields implements C25085c {
        CERTIFICATE_KEY(1, "certificateKey"),
        TITLE(2, "title"),
        SUB_TITLE(3, "subTitle"),
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
                return CERTIFICATE_KEY;
            }
            if (i == 2) {
                return TITLE;
            }
            if (i == 3) {
                return SUB_TITLE;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCertificatesSpec$a */
    public static class C9644a extends C25239c<MVCertificatesSpec> {
        public C9644a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCertificatesSpec mVCertificatesSpec = (MVCertificatesSpec) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVCertificatesSpec.image;
            C25113c cVar = MVCertificatesSpec.f27157b;
            gVar.mo61687K();
            if (mVCertificatesSpec.certificateKey != null) {
                gVar.mo61711x(MVCertificatesSpec.f27157b);
                gVar.mo61686J(mVCertificatesSpec.certificateKey);
                gVar.mo61712y();
            }
            if (mVCertificatesSpec.title != null) {
                gVar.mo61711x(MVCertificatesSpec.f27158c);
                gVar.mo61686J(mVCertificatesSpec.title);
                gVar.mo61712y();
            }
            if (mVCertificatesSpec.subTitle != null && mVCertificatesSpec.mo29674h()) {
                gVar.mo61711x(MVCertificatesSpec.f27159d);
                gVar.mo61686J(mVCertificatesSpec.subTitle);
                gVar.mo61712y();
            }
            if (mVCertificatesSpec.image != null) {
                gVar.mo61711x(MVCertificatesSpec.f27160e);
                mVCertificatesSpec.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCertificatesSpec mVCertificatesSpec = (MVCertificatesSpec) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVCertificatesSpec.image;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                                mVCertificatesSpec.image = mVImageReferenceWithParams2;
                                mVImageReferenceWithParams2.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVCertificatesSpec.subTitle = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVCertificatesSpec.title = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVCertificatesSpec.certificateKey = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCertificatesSpec$b */
    public static class C9645b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9644a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCertificatesSpec$c */
    public static class C9646c extends C25240d<MVCertificatesSpec> {
        public C9646c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCertificatesSpec mVCertificatesSpec = (MVCertificatesSpec) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCertificatesSpec.mo29672f()) {
                bitSet.set(0);
            }
            if (mVCertificatesSpec.mo29676i()) {
                bitSet.set(1);
            }
            if (mVCertificatesSpec.mo29674h()) {
                bitSet.set(2);
            }
            if (mVCertificatesSpec.mo29673g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVCertificatesSpec.mo29672f()) {
                jVar.mo61686J(mVCertificatesSpec.certificateKey);
            }
            if (mVCertificatesSpec.mo29676i()) {
                jVar.mo61686J(mVCertificatesSpec.title);
            }
            if (mVCertificatesSpec.mo29674h()) {
                jVar.mo61686J(mVCertificatesSpec.subTitle);
            }
            if (mVCertificatesSpec.mo29673g()) {
                mVCertificatesSpec.image.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCertificatesSpec mVCertificatesSpec = (MVCertificatesSpec) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVCertificatesSpec.certificateKey = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVCertificatesSpec.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVCertificatesSpec.subTitle = jVar.mo61704q();
            }
            if (T.get(3)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVCertificatesSpec.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVCertificatesSpec$d */
    public static class C9647d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9646c(0);
        }
    }

    static {
        new C17394d0("MVCertificatesSpec");
        HashMap hashMap = new HashMap();
        f27161f = hashMap;
        hashMap.put(C25239c.class, new C9645b());
        hashMap.put(C25240d.class, new C9647d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CERTIFICATE_KEY, new FieldMetaData("certificateKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUB_TITLE, new FieldMetaData("subTitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27162g = unmodifiableMap;
        FieldMetaData.m61947a(MVCertificatesSpec.class, unmodifiableMap);
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
        ((C25238b) f27161f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27161f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVCertificatesSpec mVCertificatesSpec = (MVCertificatesSpec) obj;
        if (!getClass().equals(mVCertificatesSpec.getClass())) {
            return getClass().getName().compareTo(mVCertificatesSpec.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29672f()).compareTo(Boolean.valueOf(mVCertificatesSpec.mo29672f()));
        if (compareTo2 != 0 || ((mo29672f() && (compareTo2 = this.certificateKey.compareTo(mVCertificatesSpec.certificateKey)) != 0) || (compareTo2 = Boolean.valueOf(mo29676i()).compareTo(Boolean.valueOf(mVCertificatesSpec.mo29676i()))) != 0 || ((mo29676i() && (compareTo2 = this.title.compareTo(mVCertificatesSpec.title)) != 0) || (compareTo2 = Boolean.valueOf(mo29674h()).compareTo(Boolean.valueOf(mVCertificatesSpec.mo29674h()))) != 0 || ((mo29674h() && (compareTo2 = this.subTitle.compareTo(mVCertificatesSpec.subTitle)) != 0) || (compareTo2 = Boolean.valueOf(mo29673g()).compareTo(Boolean.valueOf(mVCertificatesSpec.mo29673g()))) != 0)))) {
            return compareTo2;
        }
        if (!mo29673g() || (compareTo = this.image.compareTo(mVCertificatesSpec.image)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVCertificatesSpec)) {
            return false;
        }
        MVCertificatesSpec mVCertificatesSpec = (MVCertificatesSpec) obj;
        boolean f = mo29672f();
        boolean f2 = mVCertificatesSpec.mo29672f();
        if ((f || f2) && (!f || !f2 || !this.certificateKey.equals(mVCertificatesSpec.certificateKey))) {
            return false;
        }
        boolean i = mo29676i();
        boolean i2 = mVCertificatesSpec.mo29676i();
        if ((i || i2) && (!i || !i2 || !this.title.equals(mVCertificatesSpec.title))) {
            return false;
        }
        boolean h = mo29674h();
        boolean h2 = mVCertificatesSpec.mo29674h();
        if ((h || h2) && (!h || !h2 || !this.subTitle.equals(mVCertificatesSpec.subTitle))) {
            return false;
        }
        boolean g = mo29673g();
        boolean g2 = mVCertificatesSpec.mo29673g();
        if ((g || g2) && (!g || !g2 || !this.image.mo26245a(mVCertificatesSpec.image))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29672f() {
        return this.certificateKey != null;
    }

    /* renamed from: g */
    public final boolean mo29673g() {
        return this.image != null;
    }

    /* renamed from: h */
    public final boolean mo29674h() {
        return this.subTitle != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29676i() {
        return this.title != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVCertificatesSpec(", "certificateKey:");
        String str = this.certificateKey;
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
        if (mo29674h()) {
            n.append(", ");
            n.append("subTitle:");
            String str3 = this.subTitle;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
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
