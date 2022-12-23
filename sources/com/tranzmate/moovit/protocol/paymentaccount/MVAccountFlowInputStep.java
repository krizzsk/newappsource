package com.tranzmate.moovit.protocol.paymentaccount;

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

public class MVAccountFlowInputStep implements TBase<MVAccountFlowInputStep, _Fields>, Serializable, Cloneable, Comparable<MVAccountFlowInputStep> {

    /* renamed from: b */
    public static final C25113c f26912b = new C25113c("handlerIdentifier", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26913c = new C25113c("logo", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f26914d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26915e = new C25113c("subtitle", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f26916f = new C25113c("actionText", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f26917g = new C25113c("inputFields", (byte) 15, 6);

    /* renamed from: h */
    public static final HashMap f26918h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f26919i;
    public String actionText;
    public String handlerIdentifier;
    public List<MVInputField> inputFields;
    public MVImageReferenceWithParams logo;
    private _Fields[] optionals = {_Fields.LOGO, _Fields.TITLE, _Fields.SUBTITLE};
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        HANDLER_IDENTIFIER(1, "handlerIdentifier"),
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
                    return HANDLER_IDENTIFIER;
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

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowInputStep$a */
    public static class C9477a extends C25239c<MVAccountFlowInputStep> {
        public C9477a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowInputStep mVAccountFlowInputStep = (MVAccountFlowInputStep) tBase;
            MVImageReferenceWithParams mVImageReferenceWithParams = mVAccountFlowInputStep.logo;
            C25113c cVar = MVAccountFlowInputStep.f26912b;
            gVar.mo61687K();
            if (mVAccountFlowInputStep.handlerIdentifier != null) {
                gVar.mo61711x(MVAccountFlowInputStep.f26912b);
                gVar.mo61686J(mVAccountFlowInputStep.handlerIdentifier);
                gVar.mo61712y();
            }
            if (mVAccountFlowInputStep.logo != null && mVAccountFlowInputStep.mo29302i()) {
                gVar.mo61711x(MVAccountFlowInputStep.f26913c);
                mVAccountFlowInputStep.logo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVAccountFlowInputStep.title != null && mVAccountFlowInputStep.mo29304k()) {
                gVar.mo61711x(MVAccountFlowInputStep.f26914d);
                gVar.mo61686J(mVAccountFlowInputStep.title);
                gVar.mo61712y();
            }
            if (mVAccountFlowInputStep.subtitle != null && mVAccountFlowInputStep.mo29303j()) {
                gVar.mo61711x(MVAccountFlowInputStep.f26915e);
                gVar.mo61686J(mVAccountFlowInputStep.subtitle);
                gVar.mo61712y();
            }
            if (mVAccountFlowInputStep.actionText != null) {
                gVar.mo61711x(MVAccountFlowInputStep.f26916f);
                gVar.mo61686J(mVAccountFlowInputStep.actionText);
                gVar.mo61712y();
            }
            if (mVAccountFlowInputStep.inputFields != null) {
                gVar.mo61711x(MVAccountFlowInputStep.f26917g);
                gVar.mo61680D(new C25119e((byte) 12, mVAccountFlowInputStep.inputFields.size()));
                for (MVInputField X0 : mVAccountFlowInputStep.inputFields) {
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
            MVAccountFlowInputStep mVAccountFlowInputStep = (MVAccountFlowInputStep) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVImageReferenceWithParams mVImageReferenceWithParams = mVAccountFlowInputStep.logo;
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAccountFlowInputStep.handlerIdentifier = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams2 = new MVImageReferenceWithParams();
                            mVAccountFlowInputStep.logo = mVImageReferenceWithParams2;
                            mVImageReferenceWithParams2.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAccountFlowInputStep.title = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAccountFlowInputStep.subtitle = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVAccountFlowInputStep.actionText = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVAccountFlowInputStep.inputFields = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVInputField mVInputField = new MVInputField();
                                mVInputField.mo25201C1(gVar);
                                mVAccountFlowInputStep.inputFields.add(mVInputField);
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

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowInputStep$b */
    public static class C9478b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9477a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowInputStep$c */
    public static class C9479c extends C25240d<MVAccountFlowInputStep> {
        public C9479c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowInputStep mVAccountFlowInputStep = (MVAccountFlowInputStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAccountFlowInputStep.mo29299g()) {
                bitSet.set(0);
            }
            if (mVAccountFlowInputStep.mo29302i()) {
                bitSet.set(1);
            }
            if (mVAccountFlowInputStep.mo29304k()) {
                bitSet.set(2);
            }
            if (mVAccountFlowInputStep.mo29303j()) {
                bitSet.set(3);
            }
            if (mVAccountFlowInputStep.mo29298f()) {
                bitSet.set(4);
            }
            if (mVAccountFlowInputStep.mo29300h()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVAccountFlowInputStep.mo29299g()) {
                jVar.mo61686J(mVAccountFlowInputStep.handlerIdentifier);
            }
            if (mVAccountFlowInputStep.mo29302i()) {
                mVAccountFlowInputStep.logo.mo25202X0(jVar);
            }
            if (mVAccountFlowInputStep.mo29304k()) {
                jVar.mo61686J(mVAccountFlowInputStep.title);
            }
            if (mVAccountFlowInputStep.mo29303j()) {
                jVar.mo61686J(mVAccountFlowInputStep.subtitle);
            }
            if (mVAccountFlowInputStep.mo29298f()) {
                jVar.mo61686J(mVAccountFlowInputStep.actionText);
            }
            if (mVAccountFlowInputStep.mo29300h()) {
                jVar.mo61678B(mVAccountFlowInputStep.inputFields.size());
                for (MVInputField X0 : mVAccountFlowInputStep.inputFields) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAccountFlowInputStep mVAccountFlowInputStep = (MVAccountFlowInputStep) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVAccountFlowInputStep.handlerIdentifier = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVAccountFlowInputStep.logo = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVAccountFlowInputStep.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVAccountFlowInputStep.subtitle = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVAccountFlowInputStep.actionText = jVar.mo61704q();
            }
            if (T.get(5)) {
                int i = jVar.mo61696i();
                mVAccountFlowInputStep.inputFields = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVInputField mVInputField = new MVInputField();
                    mVInputField.mo25201C1(jVar);
                    mVAccountFlowInputStep.inputFields.add(mVInputField);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowInputStep$d */
    public static class C9480d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9479c(0);
        }
    }

    static {
        new C17394d0("MVAccountFlowInputStep");
        HashMap hashMap = new HashMap();
        f26918h = hashMap;
        hashMap.put(C25239c.class, new C9478b());
        hashMap.put(C25240d.class, new C9480d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.HANDLER_IDENTIFIER, new FieldMetaData("handlerIdentifier", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LOGO, new FieldMetaData("logo", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ACTION_TEXT, new FieldMetaData("actionText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INPUT_FIELDS, new FieldMetaData("inputFields", (byte) 3, new ListMetaData(new StructMetaData(MVInputField.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26919i = unmodifiableMap;
        FieldMetaData.m61947a(MVAccountFlowInputStep.class, unmodifiableMap);
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
        ((C25238b) f26918h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26918h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVAccountFlowInputStep mVAccountFlowInputStep = (MVAccountFlowInputStep) obj;
        if (!getClass().equals(mVAccountFlowInputStep.getClass())) {
            return getClass().getName().compareTo(mVAccountFlowInputStep.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo29299g()).compareTo(Boolean.valueOf(mVAccountFlowInputStep.mo29299g()));
        if (compareTo != 0 || ((mo29299g() && (compareTo = this.handlerIdentifier.compareTo(mVAccountFlowInputStep.handlerIdentifier)) != 0) || (compareTo = Boolean.valueOf(mo29302i()).compareTo(Boolean.valueOf(mVAccountFlowInputStep.mo29302i()))) != 0 || ((mo29302i() && (compareTo = this.logo.compareTo(mVAccountFlowInputStep.logo)) != 0) || (compareTo = Boolean.valueOf(mo29304k()).compareTo(Boolean.valueOf(mVAccountFlowInputStep.mo29304k()))) != 0 || ((mo29304k() && (compareTo = this.title.compareTo(mVAccountFlowInputStep.title)) != 0) || (compareTo = Boolean.valueOf(mo29303j()).compareTo(Boolean.valueOf(mVAccountFlowInputStep.mo29303j()))) != 0 || ((mo29303j() && (compareTo = this.subtitle.compareTo(mVAccountFlowInputStep.subtitle)) != 0) || (compareTo = Boolean.valueOf(mo29298f()).compareTo(Boolean.valueOf(mVAccountFlowInputStep.mo29298f()))) != 0 || ((mo29298f() && (compareTo = this.actionText.compareTo(mVAccountFlowInputStep.actionText)) != 0) || (compareTo = Boolean.valueOf(mo29300h()).compareTo(Boolean.valueOf(mVAccountFlowInputStep.mo29300h()))) != 0)))))) {
            return compareTo;
        }
        if (!mo29300h() || (h = C25082a.m62844h(this.inputFields, mVAccountFlowInputStep.inputFields)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAccountFlowInputStep)) {
            return false;
        }
        MVAccountFlowInputStep mVAccountFlowInputStep = (MVAccountFlowInputStep) obj;
        boolean g = mo29299g();
        boolean g2 = mVAccountFlowInputStep.mo29299g();
        if ((g || g2) && (!g || !g2 || !this.handlerIdentifier.equals(mVAccountFlowInputStep.handlerIdentifier))) {
            return false;
        }
        boolean i = mo29302i();
        boolean i2 = mVAccountFlowInputStep.mo29302i();
        if ((i || i2) && (!i || !i2 || !this.logo.mo26245a(mVAccountFlowInputStep.logo))) {
            return false;
        }
        boolean k = mo29304k();
        boolean k2 = mVAccountFlowInputStep.mo29304k();
        if ((k || k2) && (!k || !k2 || !this.title.equals(mVAccountFlowInputStep.title))) {
            return false;
        }
        boolean j = mo29303j();
        boolean j2 = mVAccountFlowInputStep.mo29303j();
        if ((j || j2) && (!j || !j2 || !this.subtitle.equals(mVAccountFlowInputStep.subtitle))) {
            return false;
        }
        boolean f = mo29298f();
        boolean f2 = mVAccountFlowInputStep.mo29298f();
        if ((f || f2) && (!f || !f2 || !this.actionText.equals(mVAccountFlowInputStep.actionText))) {
            return false;
        }
        boolean h = mo29300h();
        boolean h2 = mVAccountFlowInputStep.mo29300h();
        if ((h || h2) && (!h || !h2 || !this.inputFields.equals(mVAccountFlowInputStep.inputFields))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29298f() {
        return this.actionText != null;
    }

    /* renamed from: g */
    public final boolean mo29299g() {
        return this.handlerIdentifier != null;
    }

    /* renamed from: h */
    public final boolean mo29300h() {
        return this.inputFields != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29302i() {
        return this.logo != null;
    }

    /* renamed from: j */
    public final boolean mo29303j() {
        return this.subtitle != null;
    }

    /* renamed from: k */
    public final boolean mo29304k() {
        return this.title != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAccountFlowInputStep(", "handlerIdentifier:");
        String str = this.handlerIdentifier;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo29302i()) {
            n.append(", ");
            n.append("logo:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.logo;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        if (mo29304k()) {
            n.append(", ");
            n.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo29303j()) {
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
