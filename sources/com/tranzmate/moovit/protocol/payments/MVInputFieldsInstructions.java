package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams;
import com.tranzmate.moovit.protocol.common.MVLinkedTextLink;
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

public class MVInputFieldsInstructions implements TBase<MVInputFieldsInstructions, _Fields>, Serializable, Cloneable, Comparable<MVInputFieldsInstructions> {

    /* renamed from: b */
    public static final C25113c f27335b = new C25113c("id", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27336c = new C25113c("logo", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27337d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27338e = new C25113c("subtitle", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f27339f = new C25113c("inputFields", (byte) 15, 5);

    /* renamed from: g */
    public static final C25113c f27340g = new C25113c("inlineLink", (byte) 12, 6);

    /* renamed from: h */
    public static final C25113c f27341h = new C25113c("footerLink", (byte) 12, 7);

    /* renamed from: i */
    public static final C25113c f27342i = new C25113c("actionButtonText", (byte) 11, 8);

    /* renamed from: j */
    public static final HashMap f27343j;

    /* renamed from: k */
    public static final Map<_Fields, FieldMetaData> f27344k;
    public String actionButtonText;
    public MVLinkedTextLink footerLink;

    /* renamed from: id */
    public String f27345id;
    public MVLinkedTextLink inlineLink;
    public List<MVInputField> inputFields;
    public MVImageReferenceWithParams logo;
    private _Fields[] optionals = {_Fields.LOGO, _Fields.TITLE, _Fields.SUBTITLE, _Fields.INLINE_LINK, _Fields.FOOTER_LINK};
    public String subtitle;
    public String title;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        LOGO(2, "logo"),
        TITLE(3, "title"),
        SUBTITLE(4, "subtitle"),
        INPUT_FIELDS(5, "inputFields"),
        INLINE_LINK(6, "inlineLink"),
        FOOTER_LINK(7, "footerLink"),
        ACTION_BUTTON_TEXT(8, "actionButtonText");
        
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
                    return INPUT_FIELDS;
                case 6:
                    return INLINE_LINK;
                case 7:
                    return FOOTER_LINK;
                case 8:
                    return ACTION_BUTTON_TEXT;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVInputFieldsInstructions$a */
    public static class C9805a extends C25239c<MVInputFieldsInstructions> {
        public C9805a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVInputFieldsInstructions mVInputFieldsInstructions = (MVInputFieldsInstructions) tBase;
            mVInputFieldsInstructions.mo29995o();
            C25113c cVar = MVInputFieldsInstructions.f27335b;
            gVar.mo61687K();
            if (mVInputFieldsInstructions.f27345id != null) {
                gVar.mo61711x(MVInputFieldsInstructions.f27335b);
                gVar.mo61686J(mVInputFieldsInstructions.f27345id);
                gVar.mo61712y();
            }
            if (mVInputFieldsInstructions.logo != null && mVInputFieldsInstructions.mo29992k()) {
                gVar.mo61711x(MVInputFieldsInstructions.f27336c);
                mVInputFieldsInstructions.logo.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVInputFieldsInstructions.title != null && mVInputFieldsInstructions.mo29994m()) {
                gVar.mo61711x(MVInputFieldsInstructions.f27337d);
                gVar.mo61686J(mVInputFieldsInstructions.title);
                gVar.mo61712y();
            }
            if (mVInputFieldsInstructions.subtitle != null && mVInputFieldsInstructions.mo29993l()) {
                gVar.mo61711x(MVInputFieldsInstructions.f27338e);
                gVar.mo61686J(mVInputFieldsInstructions.subtitle);
                gVar.mo61712y();
            }
            if (mVInputFieldsInstructions.inputFields != null) {
                gVar.mo61711x(MVInputFieldsInstructions.f27339f);
                gVar.mo61680D(new C25119e((byte) 12, mVInputFieldsInstructions.inputFields.size()));
                for (MVInputField X0 : mVInputFieldsInstructions.inputFields) {
                    X0.mo25202X0(gVar);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVInputFieldsInstructions.inlineLink != null && mVInputFieldsInstructions.mo29990i()) {
                gVar.mo61711x(MVInputFieldsInstructions.f27340g);
                mVInputFieldsInstructions.inlineLink.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVInputFieldsInstructions.footerLink != null && mVInputFieldsInstructions.mo29987g()) {
                gVar.mo61711x(MVInputFieldsInstructions.f27341h);
                mVInputFieldsInstructions.footerLink.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVInputFieldsInstructions.actionButtonText != null) {
                gVar.mo61711x(MVInputFieldsInstructions.f27342i);
                gVar.mo61686J(mVInputFieldsInstructions.actionButtonText);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVInputFieldsInstructions mVInputFieldsInstructions = (MVInputFieldsInstructions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVInputFieldsInstructions.mo29995o();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVInputFieldsInstructions.f27345id = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                            mVInputFieldsInstructions.logo = mVImageReferenceWithParams;
                            mVImageReferenceWithParams.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVInputFieldsInstructions.title = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVInputFieldsInstructions.subtitle = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVInputFieldsInstructions.inputFields = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVInputField mVInputField = new MVInputField();
                                mVInputField.mo25201C1(gVar);
                                mVInputFieldsInstructions.inputFields.add(mVInputField);
                            }
                            gVar.mo61699l();
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLinkedTextLink mVLinkedTextLink = new MVLinkedTextLink();
                            mVInputFieldsInstructions.inlineLink = mVLinkedTextLink;
                            mVLinkedTextLink.mo25201C1(gVar);
                            break;
                        }
                    case 7:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVLinkedTextLink mVLinkedTextLink2 = new MVLinkedTextLink();
                            mVInputFieldsInstructions.footerLink = mVLinkedTextLink2;
                            mVLinkedTextLink2.mo25201C1(gVar);
                            break;
                        }
                    case 8:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVInputFieldsInstructions.actionButtonText = gVar.mo61704q();
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVInputFieldsInstructions$b */
    public static class C9806b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9805a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVInputFieldsInstructions$c */
    public static class C9807c extends C25240d<MVInputFieldsInstructions> {
        public C9807c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVInputFieldsInstructions mVInputFieldsInstructions = (MVInputFieldsInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVInputFieldsInstructions.mo29988h()) {
                bitSet.set(0);
            }
            if (mVInputFieldsInstructions.mo29992k()) {
                bitSet.set(1);
            }
            if (mVInputFieldsInstructions.mo29994m()) {
                bitSet.set(2);
            }
            if (mVInputFieldsInstructions.mo29993l()) {
                bitSet.set(3);
            }
            if (mVInputFieldsInstructions.mo29991j()) {
                bitSet.set(4);
            }
            if (mVInputFieldsInstructions.mo29990i()) {
                bitSet.set(5);
            }
            if (mVInputFieldsInstructions.mo29987g()) {
                bitSet.set(6);
            }
            if (mVInputFieldsInstructions.mo29986f()) {
                bitSet.set(7);
            }
            jVar.mo61738U(bitSet, 8);
            if (mVInputFieldsInstructions.mo29988h()) {
                jVar.mo61686J(mVInputFieldsInstructions.f27345id);
            }
            if (mVInputFieldsInstructions.mo29992k()) {
                mVInputFieldsInstructions.logo.mo25202X0(jVar);
            }
            if (mVInputFieldsInstructions.mo29994m()) {
                jVar.mo61686J(mVInputFieldsInstructions.title);
            }
            if (mVInputFieldsInstructions.mo29993l()) {
                jVar.mo61686J(mVInputFieldsInstructions.subtitle);
            }
            if (mVInputFieldsInstructions.mo29991j()) {
                jVar.mo61678B(mVInputFieldsInstructions.inputFields.size());
                for (MVInputField X0 : mVInputFieldsInstructions.inputFields) {
                    X0.mo25202X0(jVar);
                }
            }
            if (mVInputFieldsInstructions.mo29990i()) {
                mVInputFieldsInstructions.inlineLink.mo25202X0(jVar);
            }
            if (mVInputFieldsInstructions.mo29987g()) {
                mVInputFieldsInstructions.footerLink.mo25202X0(jVar);
            }
            if (mVInputFieldsInstructions.mo29986f()) {
                jVar.mo61686J(mVInputFieldsInstructions.actionButtonText);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVInputFieldsInstructions mVInputFieldsInstructions = (MVInputFieldsInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(8);
            if (T.get(0)) {
                mVInputFieldsInstructions.f27345id = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVInputFieldsInstructions.logo = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVInputFieldsInstructions.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVInputFieldsInstructions.subtitle = jVar.mo61704q();
            }
            if (T.get(4)) {
                int i = jVar.mo61696i();
                mVInputFieldsInstructions.inputFields = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVInputField mVInputField = new MVInputField();
                    mVInputField.mo25201C1(jVar);
                    mVInputFieldsInstructions.inputFields.add(mVInputField);
                }
            }
            if (T.get(5)) {
                MVLinkedTextLink mVLinkedTextLink = new MVLinkedTextLink();
                mVInputFieldsInstructions.inlineLink = mVLinkedTextLink;
                mVLinkedTextLink.mo25201C1(jVar);
            }
            if (T.get(6)) {
                MVLinkedTextLink mVLinkedTextLink2 = new MVLinkedTextLink();
                mVInputFieldsInstructions.footerLink = mVLinkedTextLink2;
                mVLinkedTextLink2.mo25201C1(jVar);
            }
            if (T.get(7)) {
                mVInputFieldsInstructions.actionButtonText = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVInputFieldsInstructions$d */
    public static class C9808d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9807c(0);
        }
    }

    static {
        new C17394d0("MVInputFieldsInstructions");
        HashMap hashMap = new HashMap();
        f27343j = hashMap;
        hashMap.put(C25239c.class, new C9806b());
        hashMap.put(C25240d.class, new C9808d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.LOGO, new FieldMetaData("logo", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SUBTITLE, new FieldMetaData("subtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INPUT_FIELDS, new FieldMetaData("inputFields", (byte) 3, new ListMetaData(new StructMetaData(MVInputField.class))));
        enumMap.put(_Fields.INLINE_LINK, new FieldMetaData("inlineLink", (byte) 2, new StructMetaData(MVLinkedTextLink.class)));
        enumMap.put(_Fields.FOOTER_LINK, new FieldMetaData("footerLink", (byte) 2, new StructMetaData(MVLinkedTextLink.class)));
        enumMap.put(_Fields.ACTION_BUTTON_TEXT, new FieldMetaData("actionButtonText", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27344k = unmodifiableMap;
        FieldMetaData.m61947a(MVInputFieldsInstructions.class, unmodifiableMap);
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
        ((C25238b) f27343j.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27343j.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo29983a(MVInputFieldsInstructions mVInputFieldsInstructions) {
        if (mVInputFieldsInstructions == null) {
            return false;
        }
        boolean h = mo29988h();
        boolean h2 = mVInputFieldsInstructions.mo29988h();
        if ((h || h2) && (!h || !h2 || !this.f27345id.equals(mVInputFieldsInstructions.f27345id))) {
            return false;
        }
        boolean k = mo29992k();
        boolean k2 = mVInputFieldsInstructions.mo29992k();
        if ((k || k2) && (!k || !k2 || !this.logo.mo26245a(mVInputFieldsInstructions.logo))) {
            return false;
        }
        boolean m = mo29994m();
        boolean m2 = mVInputFieldsInstructions.mo29994m();
        if ((m || m2) && (!m || !m2 || !this.title.equals(mVInputFieldsInstructions.title))) {
            return false;
        }
        boolean l = mo29993l();
        boolean l2 = mVInputFieldsInstructions.mo29993l();
        if ((l || l2) && (!l || !l2 || !this.subtitle.equals(mVInputFieldsInstructions.subtitle))) {
            return false;
        }
        boolean j = mo29991j();
        boolean j2 = mVInputFieldsInstructions.mo29991j();
        if ((j || j2) && (!j || !j2 || !this.inputFields.equals(mVInputFieldsInstructions.inputFields))) {
            return false;
        }
        boolean i = mo29990i();
        boolean i2 = mVInputFieldsInstructions.mo29990i();
        if ((i || i2) && (!i || !i2 || !this.inlineLink.mo26309a(mVInputFieldsInstructions.inlineLink))) {
            return false;
        }
        boolean g = mo29987g();
        boolean g2 = mVInputFieldsInstructions.mo29987g();
        if ((g || g2) && (!g || !g2 || !this.footerLink.mo26309a(mVInputFieldsInstructions.footerLink))) {
            return false;
        }
        boolean f = mo29986f();
        boolean f2 = mVInputFieldsInstructions.mo29986f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.actionButtonText.equals(mVInputFieldsInstructions.actionButtonText)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVInputFieldsInstructions mVInputFieldsInstructions = (MVInputFieldsInstructions) obj;
        if (!getClass().equals(mVInputFieldsInstructions.getClass())) {
            return getClass().getName().compareTo(mVInputFieldsInstructions.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29988h()).compareTo(Boolean.valueOf(mVInputFieldsInstructions.mo29988h()));
        if (compareTo2 != 0 || ((mo29988h() && (compareTo2 = this.f27345id.compareTo(mVInputFieldsInstructions.f27345id)) != 0) || (compareTo2 = Boolean.valueOf(mo29992k()).compareTo(Boolean.valueOf(mVInputFieldsInstructions.mo29992k()))) != 0 || ((mo29992k() && (compareTo2 = this.logo.compareTo(mVInputFieldsInstructions.logo)) != 0) || (compareTo2 = Boolean.valueOf(mo29994m()).compareTo(Boolean.valueOf(mVInputFieldsInstructions.mo29994m()))) != 0 || ((mo29994m() && (compareTo2 = this.title.compareTo(mVInputFieldsInstructions.title)) != 0) || (compareTo2 = Boolean.valueOf(mo29993l()).compareTo(Boolean.valueOf(mVInputFieldsInstructions.mo29993l()))) != 0 || ((mo29993l() && (compareTo2 = this.subtitle.compareTo(mVInputFieldsInstructions.subtitle)) != 0) || (compareTo2 = Boolean.valueOf(mo29991j()).compareTo(Boolean.valueOf(mVInputFieldsInstructions.mo29991j()))) != 0 || ((mo29991j() && (compareTo2 = C25082a.m62844h(this.inputFields, mVInputFieldsInstructions.inputFields)) != 0) || (compareTo2 = Boolean.valueOf(mo29990i()).compareTo(Boolean.valueOf(mVInputFieldsInstructions.mo29990i()))) != 0 || ((mo29990i() && (compareTo2 = this.inlineLink.compareTo(mVInputFieldsInstructions.inlineLink)) != 0) || (compareTo2 = Boolean.valueOf(mo29987g()).compareTo(Boolean.valueOf(mVInputFieldsInstructions.mo29987g()))) != 0 || ((mo29987g() && (compareTo2 = this.footerLink.compareTo(mVInputFieldsInstructions.footerLink)) != 0) || (compareTo2 = Boolean.valueOf(mo29986f()).compareTo(Boolean.valueOf(mVInputFieldsInstructions.mo29986f()))) != 0)))))))) {
            return compareTo2;
        }
        if (!mo29986f() || (compareTo = this.actionButtonText.compareTo(mVInputFieldsInstructions.actionButtonText)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVInputFieldsInstructions)) {
            return mo29983a((MVInputFieldsInstructions) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo29986f() {
        return this.actionButtonText != null;
    }

    /* renamed from: g */
    public final boolean mo29987g() {
        return this.footerLink != null;
    }

    /* renamed from: h */
    public final boolean mo29988h() {
        return this.f27345id != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo29990i() {
        return this.inlineLink != null;
    }

    /* renamed from: j */
    public final boolean mo29991j() {
        return this.inputFields != null;
    }

    /* renamed from: k */
    public final boolean mo29992k() {
        return this.logo != null;
    }

    /* renamed from: l */
    public final boolean mo29993l() {
        return this.subtitle != null;
    }

    /* renamed from: m */
    public final boolean mo29994m() {
        return this.title != null;
    }

    /* renamed from: o */
    public final void mo29995o() throws TException {
        MVImageReferenceWithParams mVImageReferenceWithParams = this.logo;
        if (mVImageReferenceWithParams != null) {
            mVImageReferenceWithParams.getClass();
        }
        MVLinkedTextLink mVLinkedTextLink = this.inlineLink;
        if (mVLinkedTextLink != null) {
            mVLinkedTextLink.getClass();
        }
        MVLinkedTextLink mVLinkedTextLink2 = this.footerLink;
        if (mVLinkedTextLink2 != null) {
            mVLinkedTextLink2.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVInputFieldsInstructions(", "id:");
        String str = this.f27345id;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo29992k()) {
            n.append(", ");
            n.append("logo:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.logo;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        if (mo29994m()) {
            n.append(", ");
            n.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo29993l()) {
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
        n.append("inputFields:");
        List<MVInputField> list = this.inputFields;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        if (mo29990i()) {
            n.append(", ");
            n.append("inlineLink:");
            MVLinkedTextLink mVLinkedTextLink = this.inlineLink;
            if (mVLinkedTextLink == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLinkedTextLink);
            }
        }
        if (mo29987g()) {
            n.append(", ");
            n.append("footerLink:");
            MVLinkedTextLink mVLinkedTextLink2 = this.footerLink;
            if (mVLinkedTextLink2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLinkedTextLink2);
            }
        }
        n.append(", ");
        n.append("actionButtonText:");
        String str4 = this.actionButtonText;
        if (str4 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str4);
        }
        n.append(")");
        return n.toString();
    }
}
