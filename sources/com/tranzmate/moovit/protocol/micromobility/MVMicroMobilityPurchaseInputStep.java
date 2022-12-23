package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
import com.tranzmate.moovit.protocol.payments.MVInputField;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25119e;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVMicroMobilityPurchaseInputStep implements TBase<MVMicroMobilityPurchaseInputStep, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityPurchaseInputStep> {

    /* renamed from: b */
    public static final C25113c f26617b = new C25113c("id", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26618c = new C25113c("logo", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f26619d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26620e = new C25113c("subtitle", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26621f = new C25113c("actionText", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f26622g = new C25113c("inputFields", (byte) 15, 6);

    /* renamed from: h */
    public static final HashMap f26623h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f26624i;
    public String actionText;

    /* renamed from: id */
    public String f26625id;
    public List<MVInputField> inputFields;
    public MVImageReferenceWithParams logo;
    private _Fields[] optionals = {_Fields.LOGO, _Fields.TITLE, _Fields.SUBTITLE};
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        LOGO(2, "logo"),
        TITLE(3, "title"),
        SUBTITLE(4, "subtitle"),
        ACTION_TEXT(5, "actionText"),
        INPUT_FIELDS(6, "inputFields");
        
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
                    return ID;
                case 2:
                    return LOGO;
                case 3:
                    return TITLE;
                case 4:
                    return SUBTITLE;
                case 5:
                    return ACTION_TEXT;
                case 6:
                    return INPUT_FIELDS;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseInputStep$a */
    public static class C9273a extends C25239c<MVMicroMobilityPurchaseInputStep> {
        public C9273a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseInputStep mVMicroMobilityPurchaseInputStep = (MVMicroMobilityPurchaseInputStep) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVMicroMobilityPurchaseInputStep.logo;
            C25113c cVar = MVMicroMobilityPurchaseInputStep.f26617b;
            gVar.mo61687K();
            if (mVMicroMobilityPurchaseInputStep.f26625id != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseInputStep.f26617b);
                gVar.mo61686J(mVMicroMobilityPurchaseInputStep.f26625id);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseInputStep.logo != null && mVMicroMobilityPurchaseInputStep.mo28827i()) {
                gVar.mo61711x(MVMicroMobilityPurchaseInputStep.f26618c);
                mVMicroMobilityPurchaseInputStep.logo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseInputStep.title != null && mVMicroMobilityPurchaseInputStep.mo28829k()) {
                gVar.mo61711x(MVMicroMobilityPurchaseInputStep.f26619d);
                gVar.mo61686J(mVMicroMobilityPurchaseInputStep.title);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseInputStep.subtitle != null && mVMicroMobilityPurchaseInputStep.mo28828j()) {
                gVar.mo61711x(MVMicroMobilityPurchaseInputStep.f26620e);
                gVar.mo61686J(mVMicroMobilityPurchaseInputStep.subtitle);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseInputStep.actionText != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseInputStep.f26621f);
                gVar.mo61686J(mVMicroMobilityPurchaseInputStep.actionText);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseInputStep.inputFields != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseInputStep.f26622g);
                gVar.mo61680D(new C25119e((byte) 12, mVMicroMobilityPurchaseInputStep.inputFields.size()));
                for (MVInputField X0 : mVMicroMobilityPurchaseInputStep.inputFields) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseInputStep mVMicroMobilityPurchaseInputStep = (MVMicroMobilityPurchaseInputStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVMicroMobilityPurchaseInputStep.logo;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityPurchaseInputStep.f26625id = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVMicroMobilityPurchaseInputStep.logo = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityPurchaseInputStep.title = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityPurchaseInputStep.subtitle = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVMicroMobilityPurchaseInputStep.actionText = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVMicroMobilityPurchaseInputStep.inputFields = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVInputField mVInputField = new MVInputField();
                                mVInputField.mo25201C1(gVar);
                                mVMicroMobilityPurchaseInputStep.inputFields.add(mVInputField);
                            }
                            gVar.mo61699l();
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseInputStep$b */
    public static class C9274b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9273a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseInputStep$c */
    public static class C9275c extends C25240d<MVMicroMobilityPurchaseInputStep> {
        public C9275c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseInputStep mVMicroMobilityPurchaseInputStep = (MVMicroMobilityPurchaseInputStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityPurchaseInputStep.mo28824g()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityPurchaseInputStep.mo28827i()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityPurchaseInputStep.mo28829k()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityPurchaseInputStep.mo28828j()) {
                bitSet.set(3);
            }
            if (mVMicroMobilityPurchaseInputStep.mo28823f()) {
                bitSet.set(4);
            }
            if (mVMicroMobilityPurchaseInputStep.mo28825h()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVMicroMobilityPurchaseInputStep.mo28824g()) {
                jVar.mo61686J(mVMicroMobilityPurchaseInputStep.f26625id);
            }
            if (mVMicroMobilityPurchaseInputStep.mo28827i()) {
                mVMicroMobilityPurchaseInputStep.logo.mo25202X0(jVar);
            }
            if (mVMicroMobilityPurchaseInputStep.mo28829k()) {
                jVar.mo61686J(mVMicroMobilityPurchaseInputStep.title);
            }
            if (mVMicroMobilityPurchaseInputStep.mo28828j()) {
                jVar.mo61686J(mVMicroMobilityPurchaseInputStep.subtitle);
            }
            if (mVMicroMobilityPurchaseInputStep.mo28823f()) {
                jVar.mo61686J(mVMicroMobilityPurchaseInputStep.actionText);
            }
            if (mVMicroMobilityPurchaseInputStep.mo28825h()) {
                jVar.mo61678B(mVMicroMobilityPurchaseInputStep.inputFields.size());
                for (MVInputField X0 : mVMicroMobilityPurchaseInputStep.inputFields) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseInputStep mVMicroMobilityPurchaseInputStep = (MVMicroMobilityPurchaseInputStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVMicroMobilityPurchaseInputStep.f26625id = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVMicroMobilityPurchaseInputStep.logo = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVMicroMobilityPurchaseInputStep.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVMicroMobilityPurchaseInputStep.subtitle = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVMicroMobilityPurchaseInputStep.actionText = jVar.mo61704q();
            }
            if (T.get(5)) {
                int i = jVar.mo61696i();
                mVMicroMobilityPurchaseInputStep.inputFields = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVInputField mVInputField = new MVInputField();
                    mVInputField.mo25201C1(jVar);
                    mVMicroMobilityPurchaseInputStep.inputFields.add(mVInputField);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseInputStep$d */
    public static class C9276d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9275c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityPurchaseInputStep");
        HashMap hashMap = new HashMap();
        f26623h = hashMap;
        hashMap.put(C25239c.class, new C9274b());
        hashMap.put(C25240d.class, new C9276d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LOGO, new FieldMetaData("logo", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACTION_TEXT, new FieldMetaData("actionText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INPUT_FIELDS, new FieldMetaData("inputFields", (byte) 3, new ListMetaData(new StructMetaData(MVInputField.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26624i = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityPurchaseInputStep.class, unmodifiableMap);
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
        ((C25238b) f26623h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26623h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVMicroMobilityPurchaseInputStep mVMicroMobilityPurchaseInputStep = (MVMicroMobilityPurchaseInputStep) obj;
        if (!getClass().equals(mVMicroMobilityPurchaseInputStep.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityPurchaseInputStep.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo28824g()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseInputStep.mo28824g()));
        if (compareTo != 0 || ((mo28824g() && (compareTo = this.f26625id.compareTo(mVMicroMobilityPurchaseInputStep.f26625id)) != 0) || (compareTo = Boolean.valueOf(mo28827i()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseInputStep.mo28827i()))) != 0 || ((mo28827i() && (compareTo = this.logo.compareTo(mVMicroMobilityPurchaseInputStep.logo)) != 0) || (compareTo = Boolean.valueOf(mo28829k()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseInputStep.mo28829k()))) != 0 || ((mo28829k() && (compareTo = this.title.compareTo(mVMicroMobilityPurchaseInputStep.title)) != 0) || (compareTo = Boolean.valueOf(mo28828j()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseInputStep.mo28828j()))) != 0 || ((mo28828j() && (compareTo = this.subtitle.compareTo(mVMicroMobilityPurchaseInputStep.subtitle)) != 0) || (compareTo = Boolean.valueOf(mo28823f()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseInputStep.mo28823f()))) != 0 || ((mo28823f() && (compareTo = this.actionText.compareTo(mVMicroMobilityPurchaseInputStep.actionText)) != 0) || (compareTo = Boolean.valueOf(mo28825h()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseInputStep.mo28825h()))) != 0)))))) {
            return compareTo;
        }
        if (!mo28825h() || (h = C25082a.m62844h(this.inputFields, mVMicroMobilityPurchaseInputStep.inputFields)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityPurchaseInputStep)) {
            return false;
        }
        MVMicroMobilityPurchaseInputStep mVMicroMobilityPurchaseInputStep = (MVMicroMobilityPurchaseInputStep) obj;
        boolean g = mo28824g();
        boolean g2 = mVMicroMobilityPurchaseInputStep.mo28824g();
        if ((g || g2) && (!g || !g2 || !this.f26625id.equals(mVMicroMobilityPurchaseInputStep.f26625id))) {
            return false;
        }
        boolean i = mo28827i();
        boolean i2 = mVMicroMobilityPurchaseInputStep.mo28827i();
        if ((i || i2) && (!i || !i2 || !this.logo.mo26245a(mVMicroMobilityPurchaseInputStep.logo))) {
            return false;
        }
        boolean k = mo28829k();
        boolean k2 = mVMicroMobilityPurchaseInputStep.mo28829k();
        if ((k || k2) && (!k || !k2 || !this.title.equals(mVMicroMobilityPurchaseInputStep.title))) {
            return false;
        }
        boolean j = mo28828j();
        boolean j2 = mVMicroMobilityPurchaseInputStep.mo28828j();
        if ((j || j2) && (!j || !j2 || !this.subtitle.equals(mVMicroMobilityPurchaseInputStep.subtitle))) {
            return false;
        }
        boolean f = mo28823f();
        boolean f2 = mVMicroMobilityPurchaseInputStep.mo28823f();
        if ((f || f2) && (!f || !f2 || !this.actionText.equals(mVMicroMobilityPurchaseInputStep.actionText))) {
            return false;
        }
        boolean h = mo28825h();
        boolean h2 = mVMicroMobilityPurchaseInputStep.mo28825h();
        if ((h || h2) && (!h || !h2 || !this.inputFields.equals(mVMicroMobilityPurchaseInputStep.inputFields))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28823f() {
        return this.actionText != null;
    }

    /* renamed from: g */
    public final boolean mo28824g() {
        return this.f26625id != null;
    }

    /* renamed from: h */
    public final boolean mo28825h() {
        return this.inputFields != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28827i() {
        return this.logo != null;
    }

    /* renamed from: j */
    public final boolean mo28828j() {
        return this.subtitle != null;
    }

    /* renamed from: k */
    public final boolean mo28829k() {
        return this.title != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityPurchaseInputStep(", "id:");
        String str = this.f26625id;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo28827i()) {
            n.append(", ");
            n.append("logo:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.logo;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        if (mo28829k()) {
            n.append(", ");
            n.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo28828j()) {
            n.append(", ");
            n.append("subtitle:");
            String str3 = this.subtitle;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(", ");
        n.append("actionText:");
        String str4 = this.actionText;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(", ");
        n.append("inputFields:");
        List<MVInputField> list = this.inputFields;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
