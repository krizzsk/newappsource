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

public class MVQuestionInstructions implements TBase<MVQuestionInstructions, _Fields>, Serializable, Cloneable, Comparable<MVQuestionInstructions> {

    /* renamed from: b */
    public static final C25113c f27672b = new C25113c("questionId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27673c = new C25113c("image", (byte) 12, 2);

    /* renamed from: d */
    public static final C25113c f27674d = new C25113c("title", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f27675e = new C25113c("instructions", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f27676f = new C25113c("primaryButton", (byte) 12, 5);

    /* renamed from: g */
    public static final C25113c f27677g = new C25113c("secondaryButton", (byte) 12, 6);

    /* renamed from: h */
    public static final HashMap f27678h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f27679i;
    public MVImageReferenceWithParams image;
    public String instructions;
    private _Fields[] optionals = {_Fields.IMAGE, _Fields.TITLE, _Fields.INSTRUCTIONS, _Fields.PRIMARY_BUTTON, _Fields.SECONDARY_BUTTON};
    public MVQuestionButton primaryButton;
    public String questionId;
    public MVQuestionButton secondaryButton;
    public String title;

    public enum _Fields implements C25085c {
        QUESTION_ID(1, "questionId"),
        IMAGE(2, "image"),
        TITLE(3, "title"),
        INSTRUCTIONS(4, "instructions"),
        PRIMARY_BUTTON(5, "primaryButton"),
        SECONDARY_BUTTON(6, "secondaryButton");
        
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
                    return QUESTION_ID;
                case 2:
                    return IMAGE;
                case 3:
                    return TITLE;
                case 4:
                    return INSTRUCTIONS;
                case 5:
                    return PRIMARY_BUTTON;
                case 6:
                    return SECONDARY_BUTTON;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVQuestionInstructions$a */
    public static class C10045a extends C25239c<MVQuestionInstructions> {
        public C10045a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVQuestionInstructions mVQuestionInstructions = (MVQuestionInstructions) tBase;
            mVQuestionInstructions.mo30553l();
            C25113c cVar = MVQuestionInstructions.f27672b;
            gVar.mo61687K();
            if (mVQuestionInstructions.questionId != null) {
                gVar.mo61711x(MVQuestionInstructions.f27672b);
                gVar.mo61686J(mVQuestionInstructions.questionId);
                gVar.mo61712y();
            }
            if (mVQuestionInstructions.image != null && mVQuestionInstructions.mo30546f()) {
                gVar.mo61711x(MVQuestionInstructions.f27673c);
                mVQuestionInstructions.image.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVQuestionInstructions.title != null && mVQuestionInstructions.mo30552k()) {
                gVar.mo61711x(MVQuestionInstructions.f27674d);
                gVar.mo61686J(mVQuestionInstructions.title);
                gVar.mo61712y();
            }
            if (mVQuestionInstructions.instructions != null && mVQuestionInstructions.mo30547g()) {
                gVar.mo61711x(MVQuestionInstructions.f27675e);
                gVar.mo61686J(mVQuestionInstructions.instructions);
                gVar.mo61712y();
            }
            if (mVQuestionInstructions.primaryButton != null && mVQuestionInstructions.mo30548h()) {
                gVar.mo61711x(MVQuestionInstructions.f27676f);
                mVQuestionInstructions.primaryButton.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVQuestionInstructions.secondaryButton != null && mVQuestionInstructions.mo30551j()) {
                gVar.mo61711x(MVQuestionInstructions.f27677g);
                mVQuestionInstructions.secondaryButton.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVQuestionInstructions mVQuestionInstructions = (MVQuestionInstructions) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVQuestionInstructions.mo30553l();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVQuestionInstructions.questionId = gVar.mo61704q();
                            break;
                        }
                    case 2:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                            mVQuestionInstructions.image = mVImageReferenceWithParams;
                            mVImageReferenceWithParams.mo25201C1(gVar);
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVQuestionInstructions.title = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVQuestionInstructions.instructions = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVQuestionButton mVQuestionButton = new MVQuestionButton();
                            mVQuestionInstructions.primaryButton = mVQuestionButton;
                            mVQuestionButton.mo25201C1(gVar);
                            break;
                        }
                    case 6:
                        if (b != 12) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            MVQuestionButton mVQuestionButton2 = new MVQuestionButton();
                            mVQuestionInstructions.secondaryButton = mVQuestionButton2;
                            mVQuestionButton2.mo25201C1(gVar);
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVQuestionInstructions$b */
    public static class C10046b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10045a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVQuestionInstructions$c */
    public static class C10047c extends C25240d<MVQuestionInstructions> {
        public C10047c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVQuestionInstructions mVQuestionInstructions = (MVQuestionInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVQuestionInstructions.mo30550i()) {
                bitSet.set(0);
            }
            if (mVQuestionInstructions.mo30546f()) {
                bitSet.set(1);
            }
            if (mVQuestionInstructions.mo30552k()) {
                bitSet.set(2);
            }
            if (mVQuestionInstructions.mo30547g()) {
                bitSet.set(3);
            }
            if (mVQuestionInstructions.mo30548h()) {
                bitSet.set(4);
            }
            if (mVQuestionInstructions.mo30551j()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVQuestionInstructions.mo30550i()) {
                jVar.mo61686J(mVQuestionInstructions.questionId);
            }
            if (mVQuestionInstructions.mo30546f()) {
                mVQuestionInstructions.image.mo25202X0(jVar);
            }
            if (mVQuestionInstructions.mo30552k()) {
                jVar.mo61686J(mVQuestionInstructions.title);
            }
            if (mVQuestionInstructions.mo30547g()) {
                jVar.mo61686J(mVQuestionInstructions.instructions);
            }
            if (mVQuestionInstructions.mo30548h()) {
                mVQuestionInstructions.primaryButton.mo25202X0(jVar);
            }
            if (mVQuestionInstructions.mo30551j()) {
                mVQuestionInstructions.secondaryButton.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVQuestionInstructions mVQuestionInstructions = (MVQuestionInstructions) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVQuestionInstructions.questionId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVImageReferenceWithParams mVImageReferenceWithParams = new MVImageReferenceWithParams();
                mVQuestionInstructions.image = mVImageReferenceWithParams;
                mVImageReferenceWithParams.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVQuestionInstructions.title = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVQuestionInstructions.instructions = jVar.mo61704q();
            }
            if (T.get(4)) {
                MVQuestionButton mVQuestionButton = new MVQuestionButton();
                mVQuestionInstructions.primaryButton = mVQuestionButton;
                mVQuestionButton.mo25201C1(jVar);
            }
            if (T.get(5)) {
                MVQuestionButton mVQuestionButton2 = new MVQuestionButton();
                mVQuestionInstructions.secondaryButton = mVQuestionButton2;
                mVQuestionButton2.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVQuestionInstructions$d */
    public static class C10048d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10047c(0);
        }
    }

    static {
        new C17394d0("MVQuestionInstructions");
        HashMap hashMap = new HashMap();
        f27678h = hashMap;
        hashMap.put(C25239c.class, new C10046b());
        hashMap.put(C25240d.class, new C10048d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.QUESTION_ID, new FieldMetaData("questionId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IMAGE, new FieldMetaData("image", (byte) 2, new StructMetaData(MVImageReferenceWithParams.class)));
        enumMap.put(_Fields.TITLE, new FieldMetaData("title", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.INSTRUCTIONS, new FieldMetaData("instructions", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PRIMARY_BUTTON, new FieldMetaData("primaryButton", (byte) 2, new StructMetaData(MVQuestionButton.class)));
        enumMap.put(_Fields.SECONDARY_BUTTON, new FieldMetaData("secondaryButton", (byte) 2, new StructMetaData(MVQuestionButton.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27679i = unmodifiableMap;
        FieldMetaData.m61947a(MVQuestionInstructions.class, unmodifiableMap);
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
        ((C25238b) f27678h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27678h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30543a(MVQuestionInstructions mVQuestionInstructions) {
        if (mVQuestionInstructions == null) {
            return false;
        }
        boolean i = mo30550i();
        boolean i2 = mVQuestionInstructions.mo30550i();
        if ((i || i2) && (!i || !i2 || !this.questionId.equals(mVQuestionInstructions.questionId))) {
            return false;
        }
        boolean f = mo30546f();
        boolean f2 = mVQuestionInstructions.mo30546f();
        if ((f || f2) && (!f || !f2 || !this.image.mo26245a(mVQuestionInstructions.image))) {
            return false;
        }
        boolean k = mo30552k();
        boolean k2 = mVQuestionInstructions.mo30552k();
        if ((k || k2) && (!k || !k2 || !this.title.equals(mVQuestionInstructions.title))) {
            return false;
        }
        boolean g = mo30547g();
        boolean g2 = mVQuestionInstructions.mo30547g();
        if ((g || g2) && (!g || !g2 || !this.instructions.equals(mVQuestionInstructions.instructions))) {
            return false;
        }
        boolean h = mo30548h();
        boolean h2 = mVQuestionInstructions.mo30548h();
        if ((h || h2) && (!h || !h2 || !this.primaryButton.mo30535a(mVQuestionInstructions.primaryButton))) {
            return false;
        }
        boolean j = mo30551j();
        boolean j2 = mVQuestionInstructions.mo30551j();
        if (!j && !j2) {
            return true;
        }
        if (!j || !j2 || !this.secondaryButton.mo30535a(mVQuestionInstructions.secondaryButton)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVQuestionInstructions mVQuestionInstructions = (MVQuestionInstructions) obj;
        if (!getClass().equals(mVQuestionInstructions.getClass())) {
            return getClass().getName().compareTo(mVQuestionInstructions.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30550i()).compareTo(Boolean.valueOf(mVQuestionInstructions.mo30550i()));
        if (compareTo2 != 0 || ((mo30550i() && (compareTo2 = this.questionId.compareTo(mVQuestionInstructions.questionId)) != 0) || (compareTo2 = Boolean.valueOf(mo30546f()).compareTo(Boolean.valueOf(mVQuestionInstructions.mo30546f()))) != 0 || ((mo30546f() && (compareTo2 = this.image.compareTo(mVQuestionInstructions.image)) != 0) || (compareTo2 = Boolean.valueOf(mo30552k()).compareTo(Boolean.valueOf(mVQuestionInstructions.mo30552k()))) != 0 || ((mo30552k() && (compareTo2 = this.title.compareTo(mVQuestionInstructions.title)) != 0) || (compareTo2 = Boolean.valueOf(mo30547g()).compareTo(Boolean.valueOf(mVQuestionInstructions.mo30547g()))) != 0 || ((mo30547g() && (compareTo2 = this.instructions.compareTo(mVQuestionInstructions.instructions)) != 0) || (compareTo2 = Boolean.valueOf(mo30548h()).compareTo(Boolean.valueOf(mVQuestionInstructions.mo30548h()))) != 0 || ((mo30548h() && (compareTo2 = this.primaryButton.compareTo(mVQuestionInstructions.primaryButton)) != 0) || (compareTo2 = Boolean.valueOf(mo30551j()).compareTo(Boolean.valueOf(mVQuestionInstructions.mo30551j()))) != 0)))))) {
            return compareTo2;
        }
        if (!mo30551j() || (compareTo = this.secondaryButton.compareTo(mVQuestionInstructions.secondaryButton)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVQuestionInstructions)) {
            return mo30543a((MVQuestionInstructions) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30546f() {
        return this.image != null;
    }

    /* renamed from: g */
    public final boolean mo30547g() {
        return this.instructions != null;
    }

    /* renamed from: h */
    public final boolean mo30548h() {
        return this.primaryButton != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo30550i() {
        return this.questionId != null;
    }

    /* renamed from: j */
    public final boolean mo30551j() {
        return this.secondaryButton != null;
    }

    /* renamed from: k */
    public final boolean mo30552k() {
        return this.title != null;
    }

    /* renamed from: l */
    public final void mo30553l() throws TException {
        MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
        if (mVImageReferenceWithParams != null) {
            mVImageReferenceWithParams.getClass();
        }
        MVQuestionButton mVQuestionButton = this.primaryButton;
        if (mVQuestionButton != null) {
            mVQuestionButton.getClass();
        }
        MVQuestionButton mVQuestionButton2 = this.secondaryButton;
        if (mVQuestionButton2 != null) {
            mVQuestionButton2.getClass();
        }
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVQuestionInstructions(", "questionId:");
        String str = this.questionId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo30546f()) {
            n.append(", ");
            n.append("image:");
            MVImageReferenceWithParams mVImageReferenceWithParams = this.image;
            if (mVImageReferenceWithParams == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVImageReferenceWithParams);
            }
        }
        if (mo30552k()) {
            n.append(", ");
            n.append("title:");
            String str2 = this.title;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo30547g()) {
            n.append(", ");
            n.append("instructions:");
            String str3 = this.instructions;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        if (mo30548h()) {
            n.append(", ");
            n.append("primaryButton:");
            MVQuestionButton mVQuestionButton = this.primaryButton;
            if (mVQuestionButton == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVQuestionButton);
            }
        }
        if (mo30551j()) {
            n.append(", ");
            n.append("secondaryButton:");
            MVQuestionButton mVQuestionButton2 = this.secondaryButton;
            if (mVQuestionButton2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVQuestionButton2);
            }
        }
        n.append(")");
        return n.toString();
    }
}
