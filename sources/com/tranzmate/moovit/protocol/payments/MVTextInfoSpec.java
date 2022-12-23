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

public class MVTextInfoSpec implements TBase<MVTextInfoSpec, _Fields>, Serializable, Cloneable, Comparable<MVTextInfoSpec> {

    /* renamed from: b */
    public static final C25113c f27718b = new C25113c("title", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27719c = new C25113c("subTitle", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f27720d = new C25113c("image", (byte) 12, 3);

    /* renamed from: e */
    public static final C25113c f27721e = new C25113c("inputField", (byte) 12, 4);

    /* renamed from: f */
    public static final HashMap f27722f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f27723g;
    public MVImageReferenceWithParams image;
    public MVInputField inputField;
    private _Fields[] optionals = {_Fields.SUB_TITLE};
    public String subTitle;
    public String title;

    public enum _Fields implements C25085c {
        TITLE(1, "title"),
        SUB_TITLE(2, "subTitle"),
        IMAGE(3, "image"),
        INPUT_FIELD(4, "inputField");
        
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
                return TITLE;
            }
            if (i == 2) {
                return SUB_TITLE;
            }
            if (i == 3) {
                return IMAGE;
            }
            if (i != 4) {
                return null;
            }
            return INPUT_FIELD;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTextInfoSpec$a */
    public static class C10081a extends C25239c<MVTextInfoSpec> {
        public C10081a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTextInfoSpec mVTextInfoSpec = (MVTextInfoSpec) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVTextInfoSpec.image;
            C25113c cVar = MVTextInfoSpec.f27718b;
            gVar.mo61687K();
            if (mVTextInfoSpec.title != null) {
                gVar.mo61711x(MVTextInfoSpec.f27718b);
                gVar.mo61686J(mVTextInfoSpec.title);
                gVar.mo61712y();
            }
            if (mVTextInfoSpec.subTitle != null && mVTextInfoSpec.mo30633h()) {
                gVar.mo61711x(MVTextInfoSpec.f27719c);
                gVar.mo61686J(mVTextInfoSpec.subTitle);
                gVar.mo61712y();
            }
            if (mVTextInfoSpec.image != null) {
                gVar.mo61711x(MVTextInfoSpec.f27720d);
                mVTextInfoSpec.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTextInfoSpec.inputField != null) {
                gVar.mo61711x(MVTextInfoSpec.f27721e);
                mVTextInfoSpec.inputField.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTextInfoSpec mVTextInfoSpec = (MVTextInfoSpec) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVTextInfoSpec.image;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVInputField mVInputField = new MVInputField();
                                mVTextInfoSpec.inputField = mVInputField;
                                mVInputField.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 12) {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVTextInfoSpec.image = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVTextInfoSpec.subTitle = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTextInfoSpec.title = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTextInfoSpec$b */
    public static class C10082b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10081a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTextInfoSpec$c */
    public static class C10083c extends C25240d<MVTextInfoSpec> {
        public C10083c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTextInfoSpec mVTextInfoSpec = (MVTextInfoSpec) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTextInfoSpec.mo30635i()) {
                bitSet.set(0);
            }
            if (mVTextInfoSpec.mo30633h()) {
                bitSet.set(1);
            }
            if (mVTextInfoSpec.mo30631f()) {
                bitSet.set(2);
            }
            if (mVTextInfoSpec.mo30632g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVTextInfoSpec.mo30635i()) {
                jVar.mo61686J(mVTextInfoSpec.title);
            }
            if (mVTextInfoSpec.mo30633h()) {
                jVar.mo61686J(mVTextInfoSpec.subTitle);
            }
            if (mVTextInfoSpec.mo30631f()) {
                mVTextInfoSpec.image.mo25202X0(jVar);
            }
            if (mVTextInfoSpec.mo30632g()) {
                mVTextInfoSpec.inputField.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTextInfoSpec mVTextInfoSpec = (MVTextInfoSpec) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVTextInfoSpec.title = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTextInfoSpec.subTitle = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVTextInfoSpec.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(3)) {
                MVInputField mVInputField = new MVInputField();
                mVTextInfoSpec.inputField = mVInputField;
                mVInputField.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVTextInfoSpec$d */
    public static class C10084d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10083c(0);
        }
    }

    static {
        new C17394d0("MVTextInfoSpec");
        HashMap hashMap = new HashMap();
        f27722f = hashMap;
        hashMap.put(C25239c.class, new C10082b());
        hashMap.put(C25240d.class, new C10084d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUB_TITLE, new FieldMetaData("subTitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 3, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.INPUT_FIELD, new FieldMetaData("inputField", (byte) 3, new StructMetaData(MVInputField.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27723g = unmodifiableMap;
        FieldMetaData.m61947a(MVTextInfoSpec.class, unmodifiableMap);
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
        ((C25238b) f27722f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27722f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTextInfoSpec mVTextInfoSpec = (MVTextInfoSpec) obj;
        if (!getClass().equals(mVTextInfoSpec.getClass())) {
            return getClass().getName().compareTo(mVTextInfoSpec.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30635i()).compareTo(Boolean.valueOf(mVTextInfoSpec.mo30635i()));
        if (compareTo2 != 0 || ((mo30635i() && (compareTo2 = this.title.compareTo(mVTextInfoSpec.title)) != 0) || (compareTo2 = Boolean.valueOf(mo30633h()).compareTo(Boolean.valueOf(mVTextInfoSpec.mo30633h()))) != 0 || ((mo30633h() && (compareTo2 = this.subTitle.compareTo(mVTextInfoSpec.subTitle)) != 0) || (compareTo2 = Boolean.valueOf(mo30631f()).compareTo(Boolean.valueOf(mVTextInfoSpec.mo30631f()))) != 0 || ((mo30631f() && (compareTo2 = this.image.compareTo(mVTextInfoSpec.image)) != 0) || (compareTo2 = Boolean.valueOf(mo30632g()).compareTo(Boolean.valueOf(mVTextInfoSpec.mo30632g()))) != 0)))) {
            return compareTo2;
        }
        if (!mo30632g() || (compareTo = this.inputField.compareTo(mVTextInfoSpec.inputField)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTextInfoSpec)) {
            return false;
        }
        MVTextInfoSpec mVTextInfoSpec = (MVTextInfoSpec) obj;
        boolean i = mo30635i();
        boolean i2 = mVTextInfoSpec.mo30635i();
        if ((i || i2) && (!i || !i2 || !this.title.equals(mVTextInfoSpec.title))) {
            return false;
        }
        boolean h = mo30633h();
        boolean h2 = mVTextInfoSpec.mo30633h();
        if ((h || h2) && (!h || !h2 || !this.subTitle.equals(mVTextInfoSpec.subTitle))) {
            return false;
        }
        boolean f = mo30631f();
        boolean f2 = mVTextInfoSpec.mo30631f();
        if ((f || f2) && (!f || !f2 || !this.image.mo26245a(mVTextInfoSpec.image))) {
            return false;
        }
        boolean g = mo30632g();
        boolean g2 = mVTextInfoSpec.mo30632g();
        if ((g || g2) && (!g || !g2 || !this.inputField.mo29961a(mVTextInfoSpec.inputField))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30631f() {
        return this.image != null;
    }

    /* renamed from: g */
    public final boolean mo30632g() {
        return this.inputField != null;
    }

    /* renamed from: h */
    public final boolean mo30633h() {
        return this.subTitle != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30635i() {
        return this.title != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTextInfoSpec(", "title:");
        String str = this.title;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo30633h()) {
            n.append(", ");
            n.append("subTitle:");
            String str2 = this.subTitle;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
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
        n.append(", ");
        n.append("inputField:");
        MVInputField mVInputField = this.inputField;
        if (mVInputField == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVInputField);
        }
        n.append(")");
        return n.toString();
    }
}
