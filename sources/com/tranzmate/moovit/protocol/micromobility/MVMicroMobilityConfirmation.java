package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.models.MessageButton;
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

public class MVMicroMobilityConfirmation implements TBase<MVMicroMobilityConfirmation, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityConfirmation> {

    /* renamed from: b */
    public static final C25113c f26515b = new C25113c("image", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f26516c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26517d = new C25113c(MessageButton.TEXT, (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26518e = new C25113c("positiveText", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26519f = new C25113c("negetiveText", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f26520g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f26521h;
    public MVImageReferenceWithParams image;
    public String negetiveText;
    private _Fields[] optionals = {_Fields.IMAGE, _Fields.TITLE, _Fields.TEXT, _Fields.NEGETIVE_TEXT};
    public String positiveText;
    public String text;
    public String title;

    public enum _Fields implements C25085c {
        IMAGE(1, "image"),
        TITLE(2, "title"),
        TEXT(3, MessageButton.TEXT),
        POSITIVE_TEXT(4, "positiveText"),
        NEGETIVE_TEXT(5, "negetiveText");
        
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
                return TEXT;
            }
            if (i == 4) {
                return POSITIVE_TEXT;
            }
            if (i != 5) {
                return null;
            }
            return NEGETIVE_TEXT;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityConfirmation$a */
    public static class C9207a extends C25239c<MVMicroMobilityConfirmation> {
        public C9207a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityConfirmation mVMicroMobilityConfirmation = (MVMicroMobilityConfirmation) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVMicroMobilityConfirmation.image;
            C25113c cVar = MVMicroMobilityConfirmation.f26515b;
            gVar.mo61687K();
            if (mVMicroMobilityConfirmation.image != null && mVMicroMobilityConfirmation.mo28664f()) {
                gVar.mo61711x(MVMicroMobilityConfirmation.f26515b);
                mVMicroMobilityConfirmation.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityConfirmation.title != null && mVMicroMobilityConfirmation.mo28669j()) {
                gVar.mo61711x(MVMicroMobilityConfirmation.f26516c);
                gVar.mo61686J(mVMicroMobilityConfirmation.title);
                gVar.mo61712y();
            }
            if (mVMicroMobilityConfirmation.text != null && mVMicroMobilityConfirmation.mo28668i()) {
                gVar.mo61711x(MVMicroMobilityConfirmation.f26517d);
                gVar.mo61686J(mVMicroMobilityConfirmation.text);
                gVar.mo61712y();
            }
            if (mVMicroMobilityConfirmation.positiveText != null) {
                gVar.mo61711x(MVMicroMobilityConfirmation.f26518e);
                gVar.mo61686J(mVMicroMobilityConfirmation.positiveText);
                gVar.mo61712y();
            }
            if (mVMicroMobilityConfirmation.negetiveText != null && mVMicroMobilityConfirmation.mo28665g()) {
                gVar.mo61711x(MVMicroMobilityConfirmation.f26519f);
                gVar.mo61686J(mVMicroMobilityConfirmation.negetiveText);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityConfirmation mVMicroMobilityConfirmation = (MVMicroMobilityConfirmation) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVMicroMobilityConfirmation.image;
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
                                    mVMicroMobilityConfirmation.negetiveText = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVMicroMobilityConfirmation.positiveText = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVMicroMobilityConfirmation.text = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVMicroMobilityConfirmation.title = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                    mVMicroMobilityConfirmation.image = mVImageReferenceWithParams2;
                    mVImageReferenceWithParams2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityConfirmation$b */
    public static class C9208b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9207a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityConfirmation$c */
    public static class C9209c extends C25240d<MVMicroMobilityConfirmation> {
        public C9209c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityConfirmation mVMicroMobilityConfirmation = (MVMicroMobilityConfirmation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityConfirmation.mo28664f()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityConfirmation.mo28669j()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityConfirmation.mo28668i()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityConfirmation.mo28666h()) {
                bitSet.set(3);
            }
            if (mVMicroMobilityConfirmation.mo28665g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVMicroMobilityConfirmation.mo28664f()) {
                mVMicroMobilityConfirmation.image.mo25202X0(jVar);
            }
            if (mVMicroMobilityConfirmation.mo28669j()) {
                jVar.mo61686J(mVMicroMobilityConfirmation.title);
            }
            if (mVMicroMobilityConfirmation.mo28668i()) {
                jVar.mo61686J(mVMicroMobilityConfirmation.text);
            }
            if (mVMicroMobilityConfirmation.mo28666h()) {
                jVar.mo61686J(mVMicroMobilityConfirmation.positiveText);
            }
            if (mVMicroMobilityConfirmation.mo28665g()) {
                jVar.mo61686J(mVMicroMobilityConfirmation.negetiveText);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityConfirmation mVMicroMobilityConfirmation = (MVMicroMobilityConfirmation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVMicroMobilityConfirmation.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVMicroMobilityConfirmation.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVMicroMobilityConfirmation.text = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVMicroMobilityConfirmation.positiveText = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVMicroMobilityConfirmation.negetiveText = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityConfirmation$d */
    public static class C9210d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9209c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityConfirmation");
        HashMap hashMap = new HashMap();
        f26520g = hashMap;
        hashMap.put(C25239c.class, new C9208b());
        hashMap.put(C25240d.class, new C9210d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TEXT, new FieldMetaData(MessageButton.TEXT, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.POSITIVE_TEXT, new FieldMetaData("positiveText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NEGETIVE_TEXT, new FieldMetaData("negetiveText", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26521h = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityConfirmation.class, unmodifiableMap);
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
        ((C25238b) f26520g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26520g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo28661a(MVMicroMobilityConfirmation mVMicroMobilityConfirmation) {
        if (mVMicroMobilityConfirmation == null) {
            return false;
        }
        boolean f = mo28664f();
        boolean f2 = mVMicroMobilityConfirmation.mo28664f();
        if ((f || f2) && (!f || !f2 || !this.image.mo26245a(mVMicroMobilityConfirmation.image))) {
            return false;
        }
        boolean j = mo28669j();
        boolean j2 = mVMicroMobilityConfirmation.mo28669j();
        if ((j || j2) && (!j || !j2 || !this.title.equals(mVMicroMobilityConfirmation.title))) {
            return false;
        }
        boolean i = mo28668i();
        boolean i2 = mVMicroMobilityConfirmation.mo28668i();
        if ((i || i2) && (!i || !i2 || !this.text.equals(mVMicroMobilityConfirmation.text))) {
            return false;
        }
        boolean h = mo28666h();
        boolean h2 = mVMicroMobilityConfirmation.mo28666h();
        if ((h || h2) && (!h || !h2 || !this.positiveText.equals(mVMicroMobilityConfirmation.positiveText))) {
            return false;
        }
        boolean g = mo28665g();
        boolean g2 = mVMicroMobilityConfirmation.mo28665g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.negetiveText.equals(mVMicroMobilityConfirmation.negetiveText)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityConfirmation mVMicroMobilityConfirmation = (MVMicroMobilityConfirmation) obj;
        if (!getClass().equals(mVMicroMobilityConfirmation.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityConfirmation.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28664f()).compareTo(Boolean.valueOf(mVMicroMobilityConfirmation.mo28664f()));
        if (compareTo2 != 0 || ((mo28664f() && (compareTo2 = this.image.compareTo(mVMicroMobilityConfirmation.image)) != 0) || (compareTo2 = Boolean.valueOf(mo28669j()).compareTo(Boolean.valueOf(mVMicroMobilityConfirmation.mo28669j()))) != 0 || ((mo28669j() && (compareTo2 = this.title.compareTo(mVMicroMobilityConfirmation.title)) != 0) || (compareTo2 = Boolean.valueOf(mo28668i()).compareTo(Boolean.valueOf(mVMicroMobilityConfirmation.mo28668i()))) != 0 || ((mo28668i() && (compareTo2 = this.text.compareTo(mVMicroMobilityConfirmation.text)) != 0) || (compareTo2 = Boolean.valueOf(mo28666h()).compareTo(Boolean.valueOf(mVMicroMobilityConfirmation.mo28666h()))) != 0 || ((mo28666h() && (compareTo2 = this.positiveText.compareTo(mVMicroMobilityConfirmation.positiveText)) != 0) || (compareTo2 = Boolean.valueOf(mo28665g()).compareTo(Boolean.valueOf(mVMicroMobilityConfirmation.mo28665g()))) != 0))))) {
            return compareTo2;
        }
        if (!mo28665g() || (compareTo = this.negetiveText.compareTo(mVMicroMobilityConfirmation.negetiveText)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVMicroMobilityConfirmation)) {
            return mo28661a((MVMicroMobilityConfirmation) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo28664f() {
        return this.image != null;
    }

    /* renamed from: g */
    public final boolean mo28665g() {
        return this.negetiveText != null;
    }

    /* renamed from: h */
    public final boolean mo28666h() {
        return this.positiveText != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28668i() {
        return this.text != null;
    }

    /* renamed from: j */
    public final boolean mo28669j() {
        return this.title != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVMicroMobilityConfirmation(");
        boolean z2 = false;
        if (mo28664f()) {
            sb.append("image:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
            if (mVImageReferenceWithParams == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVImageReferenceWithParams);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo28669j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("title:");
            String str = this.title;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        }
        if (mo28668i()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("text:");
            String str2 = this.text;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("positiveText:");
        String str3 = this.positiveText;
        if (str3 == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(str3);
        }
        if (mo28665g()) {
            sb.append(", ");
            sb.append("negetiveText:");
            String str4 = this.negetiveText;
            if (str4 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str4);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
