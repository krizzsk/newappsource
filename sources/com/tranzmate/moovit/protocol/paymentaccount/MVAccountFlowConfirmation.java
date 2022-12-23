package com.tranzmate.moovit.protocol.paymentaccount;

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

public class MVAccountFlowConfirmation implements TBase<MVAccountFlowConfirmation, _Fields>, Serializable, Cloneable, Comparable<MVAccountFlowConfirmation> {

    /* renamed from: b */
    public static final C25113c f26890b = new C25113c("image", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f26891c = new C25113c("title", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f26892d = new C25113c(MessageButton.TEXT, (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26893e = new C25113c("positiveText", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26894f = new C25113c("negetiveText", (byte) 11, 5);

    /* renamed from: g */
    public static final HashMap f26895g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f26896h;
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

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowConfirmation$a */
    public static class C9457a extends C25239c<MVAccountFlowConfirmation> {
        public C9457a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowConfirmation mVAccountFlowConfirmation = (MVAccountFlowConfirmation) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVAccountFlowConfirmation.image;
            C25113c cVar = MVAccountFlowConfirmation.f26890b;
            gVar.mo61687K();
            if (mVAccountFlowConfirmation.image != null && mVAccountFlowConfirmation.mo29260f()) {
                gVar.mo61711x(MVAccountFlowConfirmation.f26890b);
                mVAccountFlowConfirmation.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVAccountFlowConfirmation.title != null && mVAccountFlowConfirmation.mo29265j()) {
                gVar.mo61711x(MVAccountFlowConfirmation.f26891c);
                gVar.mo61686J(mVAccountFlowConfirmation.title);
                gVar.mo61712y();
            }
            if (mVAccountFlowConfirmation.text != null && mVAccountFlowConfirmation.mo29264i()) {
                gVar.mo61711x(MVAccountFlowConfirmation.f26892d);
                gVar.mo61686J(mVAccountFlowConfirmation.text);
                gVar.mo61712y();
            }
            if (mVAccountFlowConfirmation.positiveText != null) {
                gVar.mo61711x(MVAccountFlowConfirmation.f26893e);
                gVar.mo61686J(mVAccountFlowConfirmation.positiveText);
                gVar.mo61712y();
            }
            if (mVAccountFlowConfirmation.negetiveText != null && mVAccountFlowConfirmation.mo29261g()) {
                gVar.mo61711x(MVAccountFlowConfirmation.f26894f);
                gVar.mo61686J(mVAccountFlowConfirmation.negetiveText);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowConfirmation mVAccountFlowConfirmation = (MVAccountFlowConfirmation) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVAccountFlowConfirmation.image;
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
                                    mVAccountFlowConfirmation.negetiveText = gVar.mo61704q();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 11) {
                                mVAccountFlowConfirmation.positiveText = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVAccountFlowConfirmation.text = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVAccountFlowConfirmation.title = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                    mVAccountFlowConfirmation.image = mVImageReferenceWithParams2;
                    mVImageReferenceWithParams2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowConfirmation$b */
    public static class C9458b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9457a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowConfirmation$c */
    public static class C9459c extends C25240d<MVAccountFlowConfirmation> {
        public C9459c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowConfirmation mVAccountFlowConfirmation = (MVAccountFlowConfirmation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAccountFlowConfirmation.mo29260f()) {
                bitSet.set(0);
            }
            if (mVAccountFlowConfirmation.mo29265j()) {
                bitSet.set(1);
            }
            if (mVAccountFlowConfirmation.mo29264i()) {
                bitSet.set(2);
            }
            if (mVAccountFlowConfirmation.mo29262h()) {
                bitSet.set(3);
            }
            if (mVAccountFlowConfirmation.mo29261g()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVAccountFlowConfirmation.mo29260f()) {
                mVAccountFlowConfirmation.image.mo25202X0(jVar);
            }
            if (mVAccountFlowConfirmation.mo29265j()) {
                jVar.mo61686J(mVAccountFlowConfirmation.title);
            }
            if (mVAccountFlowConfirmation.mo29264i()) {
                jVar.mo61686J(mVAccountFlowConfirmation.text);
            }
            if (mVAccountFlowConfirmation.mo29262h()) {
                jVar.mo61686J(mVAccountFlowConfirmation.positiveText);
            }
            if (mVAccountFlowConfirmation.mo29261g()) {
                jVar.mo61686J(mVAccountFlowConfirmation.negetiveText);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowConfirmation mVAccountFlowConfirmation = (MVAccountFlowConfirmation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVAccountFlowConfirmation.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVAccountFlowConfirmation.title = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVAccountFlowConfirmation.text = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVAccountFlowConfirmation.positiveText = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVAccountFlowConfirmation.negetiveText = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowConfirmation$d */
    public static class C9460d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9459c(0);
        }
    }

    static {
        new C17394d0("MVAccountFlowConfirmation");
        HashMap hashMap = new HashMap();
        f26895g = hashMap;
        hashMap.put(C25239c.class, new C9458b());
        hashMap.put(C25240d.class, new C9460d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TEXT, new FieldMetaData(MessageButton.TEXT, (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.POSITIVE_TEXT, new FieldMetaData("positiveText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NEGETIVE_TEXT, new FieldMetaData("negetiveText", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26896h = unmodifiableMap;
        FieldMetaData.m61947a(MVAccountFlowConfirmation.class, unmodifiableMap);
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
        ((C25238b) f26895g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26895g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29257a(MVAccountFlowConfirmation mVAccountFlowConfirmation) {
        if (mVAccountFlowConfirmation == null) {
            return false;
        }
        boolean f = mo29260f();
        boolean f2 = mVAccountFlowConfirmation.mo29260f();
        if ((f || f2) && (!f || !f2 || !this.image.mo26245a(mVAccountFlowConfirmation.image))) {
            return false;
        }
        boolean j = mo29265j();
        boolean j2 = mVAccountFlowConfirmation.mo29265j();
        if ((j || j2) && (!j || !j2 || !this.title.equals(mVAccountFlowConfirmation.title))) {
            return false;
        }
        boolean i = mo29264i();
        boolean i2 = mVAccountFlowConfirmation.mo29264i();
        if ((i || i2) && (!i || !i2 || !this.text.equals(mVAccountFlowConfirmation.text))) {
            return false;
        }
        boolean h = mo29262h();
        boolean h2 = mVAccountFlowConfirmation.mo29262h();
        if ((h || h2) && (!h || !h2 || !this.positiveText.equals(mVAccountFlowConfirmation.positiveText))) {
            return false;
        }
        boolean g = mo29261g();
        boolean g2 = mVAccountFlowConfirmation.mo29261g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.negetiveText.equals(mVAccountFlowConfirmation.negetiveText)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVAccountFlowConfirmation mVAccountFlowConfirmation = (MVAccountFlowConfirmation) obj;
        if (!getClass().equals(mVAccountFlowConfirmation.getClass())) {
            return getClass().getName().compareTo(mVAccountFlowConfirmation.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29260f()).compareTo(Boolean.valueOf(mVAccountFlowConfirmation.mo29260f()));
        if (compareTo2 != 0 || ((mo29260f() && (compareTo2 = this.image.compareTo(mVAccountFlowConfirmation.image)) != 0) || (compareTo2 = Boolean.valueOf(mo29265j()).compareTo(Boolean.valueOf(mVAccountFlowConfirmation.mo29265j()))) != 0 || ((mo29265j() && (compareTo2 = this.title.compareTo(mVAccountFlowConfirmation.title)) != 0) || (compareTo2 = Boolean.valueOf(mo29264i()).compareTo(Boolean.valueOf(mVAccountFlowConfirmation.mo29264i()))) != 0 || ((mo29264i() && (compareTo2 = this.text.compareTo(mVAccountFlowConfirmation.text)) != 0) || (compareTo2 = Boolean.valueOf(mo29262h()).compareTo(Boolean.valueOf(mVAccountFlowConfirmation.mo29262h()))) != 0 || ((mo29262h() && (compareTo2 = this.positiveText.compareTo(mVAccountFlowConfirmation.positiveText)) != 0) || (compareTo2 = Boolean.valueOf(mo29261g()).compareTo(Boolean.valueOf(mVAccountFlowConfirmation.mo29261g()))) != 0))))) {
            return compareTo2;
        }
        if (!mo29261g() || (compareTo = this.negetiveText.compareTo(mVAccountFlowConfirmation.negetiveText)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVAccountFlowConfirmation)) {
            return mo29257a((MVAccountFlowConfirmation) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29260f() {
        return this.image != null;
    }

    /* renamed from: g */
    public final boolean mo29261g() {
        return this.negetiveText != null;
    }

    /* renamed from: h */
    public final boolean mo29262h() {
        return this.positiveText != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29264i() {
        return this.text != null;
    }

    /* renamed from: j */
    public final boolean mo29265j() {
        return this.title != null;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVAccountFlowConfirmation(");
        boolean z2 = false;
        if (mo29260f()) {
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
        if (mo29265j()) {
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
        if (mo29264i()) {
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
        if (mo29261g()) {
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
