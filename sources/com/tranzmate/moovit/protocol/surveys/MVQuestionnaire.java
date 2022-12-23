package com.tranzmate.moovit.protocol.surveys;

import com.appboy.support.StringUtils;
import com.unity3d.ads.metadata.MediationMetaData;
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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
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

public class MVQuestionnaire implements TBase<MVQuestionnaire, _Fields>, Serializable, Cloneable, Comparable<MVQuestionnaire> {

    /* renamed from: b */
    public static final C25113c f28418b = new C25113c("id", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28419c = new C25113c(MediationMetaData.KEY_VERSION, (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28420d = new C25113c("type", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f28421e = new C25113c("notificationTitle", (byte) 11, 4);

    /* renamed from: f */
    public static final C25113c f28422f = new C25113c("notificationSubtitle", (byte) 11, 5);

    /* renamed from: g */
    public static final C25113c f28423g = new C25113c("questions", (byte) 15, 6);

    /* renamed from: h */
    public static final HashMap f28424h;

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f28425i;
    private byte __isset_bitfield = 0;

    /* renamed from: id */
    public int f28426id;
    public String notificationSubtitle;
    public String notificationTitle;
    private _Fields[] optionals = {_Fields.NOTIFICATION_SUBTITLE};
    public List<MVQuestionNode> questions;
    public MVSurveyType type;
    public String version;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        VERSION(2, MediationMetaData.KEY_VERSION),
        TYPE(3, "type"),
        NOTIFICATION_TITLE(4, "notificationTitle"),
        NOTIFICATION_SUBTITLE(5, "notificationSubtitle"),
        QUESTIONS(6, "questions");
        
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
                    return VERSION;
                case 3:
                    return TYPE;
                case 4:
                    return NOTIFICATION_TITLE;
                case 5:
                    return NOTIFICATION_SUBTITLE;
                case 6:
                    return QUESTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVQuestionnaire$a */
    public static class C10617a extends C25239c<MVQuestionnaire> {
        public C10617a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVQuestionnaire mVQuestionnaire = (MVQuestionnaire) tBase;
            mVQuestionnaire.getClass();
            C25113c cVar = MVQuestionnaire.f28418b;
            gVar.mo61687K();
            gVar.mo61711x(MVQuestionnaire.f28418b);
            gVar.mo61678B(mVQuestionnaire.f28426id);
            gVar.mo61712y();
            if (mVQuestionnaire.version != null) {
                gVar.mo61711x(MVQuestionnaire.f28419c);
                gVar.mo61686J(mVQuestionnaire.version);
                gVar.mo61712y();
            }
            if (mVQuestionnaire.type != null) {
                gVar.mo61711x(MVQuestionnaire.f28420d);
                gVar.mo61678B(mVQuestionnaire.type.getValue());
                gVar.mo61712y();
            }
            if (mVQuestionnaire.notificationTitle != null) {
                gVar.mo61711x(MVQuestionnaire.f28421e);
                gVar.mo61686J(mVQuestionnaire.notificationTitle);
                gVar.mo61712y();
            }
            if (mVQuestionnaire.notificationSubtitle != null && mVQuestionnaire.mo31911g()) {
                gVar.mo61711x(MVQuestionnaire.f28422f);
                gVar.mo61686J(mVQuestionnaire.notificationSubtitle);
                gVar.mo61712y();
            }
            if (mVQuestionnaire.questions != null) {
                gVar.mo61711x(MVQuestionnaire.f28423g);
                gVar.mo61680D(new C25119e((byte) 12, mVQuestionnaire.questions.size()));
                for (MVQuestionNode X0 : mVQuestionnaire.questions) {
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
            MVQuestionnaire mVQuestionnaire = (MVQuestionnaire) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVQuestionnaire.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVQuestionnaire.f28426id = gVar.mo61696i();
                            mVQuestionnaire.mo31917l(true);
                            break;
                        }
                    case 2:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVQuestionnaire.version = gVar.mo61704q();
                            break;
                        }
                    case 3:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVQuestionnaire.type = MVSurveyType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 4:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVQuestionnaire.notificationTitle = gVar.mo61704q();
                            break;
                        }
                    case 5:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVQuestionnaire.notificationSubtitle = gVar.mo61704q();
                            break;
                        }
                    case 6:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVQuestionnaire.questions = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVQuestionNode mVQuestionNode = new MVQuestionNode();
                                mVQuestionNode.mo25201C1(gVar);
                                mVQuestionnaire.questions.add(mVQuestionNode);
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

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVQuestionnaire$b */
    public static class C10618b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10617a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVQuestionnaire$c */
    public static class C10619c extends C25240d<MVQuestionnaire> {
        public C10619c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVQuestionnaire mVQuestionnaire = (MVQuestionnaire) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVQuestionnaire.mo31910f()) {
                bitSet.set(0);
            }
            if (mVQuestionnaire.mo31916k()) {
                bitSet.set(1);
            }
            if (mVQuestionnaire.mo31915j()) {
                bitSet.set(2);
            }
            if (mVQuestionnaire.mo31912h()) {
                bitSet.set(3);
            }
            if (mVQuestionnaire.mo31911g()) {
                bitSet.set(4);
            }
            if (mVQuestionnaire.mo31914i()) {
                bitSet.set(5);
            }
            jVar.mo61738U(bitSet, 6);
            if (mVQuestionnaire.mo31910f()) {
                jVar.mo61678B(mVQuestionnaire.f28426id);
            }
            if (mVQuestionnaire.mo31916k()) {
                jVar.mo61686J(mVQuestionnaire.version);
            }
            if (mVQuestionnaire.mo31915j()) {
                jVar.mo61678B(mVQuestionnaire.type.getValue());
            }
            if (mVQuestionnaire.mo31912h()) {
                jVar.mo61686J(mVQuestionnaire.notificationTitle);
            }
            if (mVQuestionnaire.mo31911g()) {
                jVar.mo61686J(mVQuestionnaire.notificationSubtitle);
            }
            if (mVQuestionnaire.mo31914i()) {
                jVar.mo61678B(mVQuestionnaire.questions.size());
                for (MVQuestionNode X0 : mVQuestionnaire.questions) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVQuestionnaire mVQuestionnaire = (MVQuestionnaire) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(6);
            if (T.get(0)) {
                mVQuestionnaire.f28426id = jVar.mo61696i();
                mVQuestionnaire.mo31917l(true);
            }
            if (T.get(1)) {
                mVQuestionnaire.version = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVQuestionnaire.type = MVSurveyType.findByValue(jVar.mo61696i());
            }
            if (T.get(3)) {
                mVQuestionnaire.notificationTitle = jVar.mo61704q();
            }
            if (T.get(4)) {
                mVQuestionnaire.notificationSubtitle = jVar.mo61704q();
            }
            if (T.get(5)) {
                int i = jVar.mo61696i();
                mVQuestionnaire.questions = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVQuestionNode mVQuestionNode = new MVQuestionNode();
                    mVQuestionNode.mo25201C1(jVar);
                    mVQuestionnaire.questions.add(mVQuestionNode);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVQuestionnaire$d */
    public static class C10620d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10619c(0);
        }
    }

    static {
        new C17394d0("MVQuestionnaire");
        HashMap hashMap = new HashMap();
        f28424h = hashMap;
        hashMap.put(C25239c.class, new C10618b());
        hashMap.put(C25240d.class, new C10620d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.VERSION, new FieldMetaData(MediationMetaData.KEY_VERSION, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVSurveyType.class)));
        enumMap.put(_Fields.NOTIFICATION_TITLE, new FieldMetaData("notificationTitle", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.NOTIFICATION_SUBTITLE, new FieldMetaData("notificationSubtitle", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.QUESTIONS, new FieldMetaData("questions", (byte) 3, new ListMetaData(new StructMetaData(MVQuestionNode.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28425i = unmodifiableMap;
        FieldMetaData.m61947a(MVQuestionnaire.class, unmodifiableMap);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.__isset_bitfield = 0;
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
        ((C25238b) f28424h.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28424h.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVQuestionnaire mVQuestionnaire = (MVQuestionnaire) obj;
        if (!getClass().equals(mVQuestionnaire.getClass())) {
            return getClass().getName().compareTo(mVQuestionnaire.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31910f()).compareTo(Boolean.valueOf(mVQuestionnaire.mo31910f()));
        if (compareTo != 0 || ((mo31910f() && (compareTo = C25082a.m62839c(this.f28426id, mVQuestionnaire.f28426id)) != 0) || (compareTo = Boolean.valueOf(mo31916k()).compareTo(Boolean.valueOf(mVQuestionnaire.mo31916k()))) != 0 || ((mo31916k() && (compareTo = this.version.compareTo(mVQuestionnaire.version)) != 0) || (compareTo = Boolean.valueOf(mo31915j()).compareTo(Boolean.valueOf(mVQuestionnaire.mo31915j()))) != 0 || ((mo31915j() && (compareTo = this.type.compareTo(mVQuestionnaire.type)) != 0) || (compareTo = Boolean.valueOf(mo31912h()).compareTo(Boolean.valueOf(mVQuestionnaire.mo31912h()))) != 0 || ((mo31912h() && (compareTo = this.notificationTitle.compareTo(mVQuestionnaire.notificationTitle)) != 0) || (compareTo = Boolean.valueOf(mo31911g()).compareTo(Boolean.valueOf(mVQuestionnaire.mo31911g()))) != 0 || ((mo31911g() && (compareTo = this.notificationSubtitle.compareTo(mVQuestionnaire.notificationSubtitle)) != 0) || (compareTo = Boolean.valueOf(mo31914i()).compareTo(Boolean.valueOf(mVQuestionnaire.mo31914i()))) != 0)))))) {
            return compareTo;
        }
        if (!mo31914i() || (h = C25082a.m62844h(this.questions, mVQuestionnaire.questions)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVQuestionnaire)) {
            return false;
        }
        MVQuestionnaire mVQuestionnaire = (MVQuestionnaire) obj;
        if (this.f28426id != mVQuestionnaire.f28426id) {
            return false;
        }
        boolean k = mo31916k();
        boolean k2 = mVQuestionnaire.mo31916k();
        if ((k || k2) && (!k || !k2 || !this.version.equals(mVQuestionnaire.version))) {
            return false;
        }
        boolean j = mo31915j();
        boolean j2 = mVQuestionnaire.mo31915j();
        if ((j || j2) && (!j || !j2 || !this.type.equals(mVQuestionnaire.type))) {
            return false;
        }
        boolean h = mo31912h();
        boolean h2 = mVQuestionnaire.mo31912h();
        if ((h || h2) && (!h || !h2 || !this.notificationTitle.equals(mVQuestionnaire.notificationTitle))) {
            return false;
        }
        boolean g = mo31911g();
        boolean g2 = mVQuestionnaire.mo31911g();
        if ((g || g2) && (!g || !g2 || !this.notificationSubtitle.equals(mVQuestionnaire.notificationSubtitle))) {
            return false;
        }
        boolean i = mo31914i();
        boolean i2 = mVQuestionnaire.mo31914i();
        if ((i || i2) && (!i || !i2 || !this.questions.equals(mVQuestionnaire.questions))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31910f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo31911g() {
        return this.notificationSubtitle != null;
    }

    /* renamed from: h */
    public final boolean mo31912h() {
        return this.notificationTitle != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31914i() {
        return this.questions != null;
    }

    /* renamed from: j */
    public final boolean mo31915j() {
        return this.type != null;
    }

    /* renamed from: k */
    public final boolean mo31916k() {
        return this.version != null;
    }

    /* renamed from: l */
    public final void mo31917l(boolean z) {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVQuestionnaire(", "id:");
        C0016g.m42z(n, this.f28426id, ", ", "version:");
        String str = this.version;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("type:");
        MVSurveyType mVSurveyType = this.type;
        if (mVSurveyType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSurveyType);
        }
        n.append(", ");
        n.append("notificationTitle:");
        String str2 = this.notificationTitle;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        if (mo31911g()) {
            n.append(", ");
            n.append("notificationSubtitle:");
            String str3 = this.notificationSubtitle;
            if (str3 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str3);
            }
        }
        n.append(", ");
        n.append("questions:");
        List<MVQuestionNode> list = this.questions;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
