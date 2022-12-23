package com.tranzmate.moovit.protocol.kinesis;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.surveys.MVEndReason;
import com.tranzmate.moovit.protocol.surveys.MVSurveyType;
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

public class MVQuestionnaireResult implements TBase<MVQuestionnaireResult, _Fields>, Serializable, Cloneable, Comparable<MVQuestionnaireResult> {

    /* renamed from: b */
    public static final C25113c f26002b = new C25113c("timestamp", (byte) 10, 1);

    /* renamed from: c */
    public static final C25113c f26003c = new C25113c("questionnaireId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f26004d = new C25113c("questionnaireVersion", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f26005e = new C25113c("surveyType", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f26006f = new C25113c("endReason", (byte) 8, 5);

    /* renamed from: g */
    public static final C25113c f26007g = new C25113c("surveyContext", (byte) 11, 6);

    /* renamed from: h */
    public static final C25113c f26008h = new C25113c("answers", (byte) 15, 7);

    /* renamed from: i */
    public static final HashMap f26009i;

    /* renamed from: j */
    public static final Map<_Fields, FieldMetaData> f26010j;
    private byte __isset_bitfield = 0;
    public List<MVSelectedAnswer> answers;
    public MVEndReason endReason;
    private _Fields[] optionals = {_Fields.QUESTIONNAIRE_VERSION};
    public int questionnaireId;
    public String questionnaireVersion;
    public String surveyContext;
    public MVSurveyType surveyType;
    public long timestamp;

    public enum _Fields implements C25085c {
        TIMESTAMP(1, "timestamp"),
        QUESTIONNAIRE_ID(2, "questionnaireId"),
        QUESTIONNAIRE_VERSION(3, "questionnaireVersion"),
        SURVEY_TYPE(4, "surveyType"),
        END_REASON(5, "endReason"),
        SURVEY_CONTEXT(6, "surveyContext"),
        ANSWERS(7, "answers");
        
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
                    return TIMESTAMP;
                case 2:
                    return QUESTIONNAIRE_ID;
                case 3:
                    return QUESTIONNAIRE_VERSION;
                case 4:
                    return SURVEY_TYPE;
                case 5:
                    return END_REASON;
                case 6:
                    return SURVEY_CONTEXT;
                case 7:
                    return ANSWERS;
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVQuestionnaireResult$a */
    public static class C8939a extends C25239c<MVQuestionnaireResult> {
        public C8939a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVQuestionnaireResult mVQuestionnaireResult = (MVQuestionnaireResult) tBase;
            mVQuestionnaireResult.getClass();
            C25113c cVar = MVQuestionnaireResult.f26002b;
            gVar.mo61687K();
            gVar.mo61711x(MVQuestionnaireResult.f26002b);
            gVar.mo61679C(mVQuestionnaireResult.timestamp);
            gVar.mo61712y();
            gVar.mo61711x(MVQuestionnaireResult.f26003c);
            gVar.mo61678B(mVQuestionnaireResult.questionnaireId);
            gVar.mo61712y();
            if (mVQuestionnaireResult.questionnaireVersion != null && mVQuestionnaireResult.mo27900i()) {
                gVar.mo61711x(MVQuestionnaireResult.f26004d);
                gVar.mo61686J(mVQuestionnaireResult.questionnaireVersion);
                gVar.mo61712y();
            }
            if (mVQuestionnaireResult.surveyType != null) {
                gVar.mo61711x(MVQuestionnaireResult.f26005e);
                gVar.mo61678B(mVQuestionnaireResult.surveyType.getValue());
                gVar.mo61712y();
            }
            if (mVQuestionnaireResult.endReason != null) {
                gVar.mo61711x(MVQuestionnaireResult.f26006f);
                gVar.mo61678B(mVQuestionnaireResult.endReason.getValue());
                gVar.mo61712y();
            }
            if (mVQuestionnaireResult.surveyContext != null) {
                gVar.mo61711x(MVQuestionnaireResult.f26007g);
                gVar.mo61686J(mVQuestionnaireResult.surveyContext);
                gVar.mo61712y();
            }
            if (mVQuestionnaireResult.answers != null) {
                gVar.mo61711x(MVQuestionnaireResult.f26008h);
                gVar.mo61680D(new C25119e((byte) 12, mVQuestionnaireResult.answers.size()));
                for (MVSelectedAnswer X0 : mVQuestionnaireResult.answers) {
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
            MVQuestionnaireResult mVQuestionnaireResult = (MVQuestionnaireResult) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVQuestionnaireResult.getClass();
                    return;
                }
                switch (f.f63357c) {
                    case 1:
                        if (b != 10) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVQuestionnaireResult.timestamp = gVar.mo61697j();
                            mVQuestionnaireResult.mo27905o();
                            break;
                        }
                    case 2:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVQuestionnaireResult.questionnaireId = gVar.mo61696i();
                            mVQuestionnaireResult.mo27904m();
                            break;
                        }
                    case 3:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVQuestionnaireResult.questionnaireVersion = gVar.mo61704q();
                            break;
                        }
                    case 4:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVQuestionnaireResult.surveyType = MVSurveyType.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 5:
                        if (b != 8) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVQuestionnaireResult.endReason = MVEndReason.findByValue(gVar.mo61696i());
                            break;
                        }
                    case 6:
                        if (b != 11) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            mVQuestionnaireResult.surveyContext = gVar.mo61704q();
                            break;
                        }
                    case 7:
                        if (b != 15) {
                            C25122h.m63098a(gVar, b);
                            break;
                        } else {
                            C25119e k = gVar.mo61698k();
                            mVQuestionnaireResult.answers = new ArrayList(k.f63395b);
                            for (int i = 0; i < k.f63395b; i++) {
                                MVSelectedAnswer mVSelectedAnswer = new MVSelectedAnswer();
                                mVSelectedAnswer.mo25201C1(gVar);
                                mVQuestionnaireResult.answers.add(mVSelectedAnswer);
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVQuestionnaireResult$b */
    public static class C8940b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8939a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVQuestionnaireResult$c */
    public static class C8941c extends C25240d<MVQuestionnaireResult> {
        public C8941c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVQuestionnaireResult mVQuestionnaireResult = (MVQuestionnaireResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVQuestionnaireResult.mo27903l()) {
                bitSet.set(0);
            }
            if (mVQuestionnaireResult.mo27898h()) {
                bitSet.set(1);
            }
            if (mVQuestionnaireResult.mo27900i()) {
                bitSet.set(2);
            }
            if (mVQuestionnaireResult.mo27902k()) {
                bitSet.set(3);
            }
            if (mVQuestionnaireResult.mo27897g()) {
                bitSet.set(4);
            }
            if (mVQuestionnaireResult.mo27901j()) {
                bitSet.set(5);
            }
            if (mVQuestionnaireResult.mo27896f()) {
                bitSet.set(6);
            }
            jVar.mo61738U(bitSet, 7);
            if (mVQuestionnaireResult.mo27903l()) {
                jVar.mo61679C(mVQuestionnaireResult.timestamp);
            }
            if (mVQuestionnaireResult.mo27898h()) {
                jVar.mo61678B(mVQuestionnaireResult.questionnaireId);
            }
            if (mVQuestionnaireResult.mo27900i()) {
                jVar.mo61686J(mVQuestionnaireResult.questionnaireVersion);
            }
            if (mVQuestionnaireResult.mo27902k()) {
                jVar.mo61678B(mVQuestionnaireResult.surveyType.getValue());
            }
            if (mVQuestionnaireResult.mo27897g()) {
                jVar.mo61678B(mVQuestionnaireResult.endReason.getValue());
            }
            if (mVQuestionnaireResult.mo27901j()) {
                jVar.mo61686J(mVQuestionnaireResult.surveyContext);
            }
            if (mVQuestionnaireResult.mo27896f()) {
                jVar.mo61678B(mVQuestionnaireResult.answers.size());
                for (MVSelectedAnswer X0 : mVQuestionnaireResult.answers) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVQuestionnaireResult mVQuestionnaireResult = (MVQuestionnaireResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(7);
            if (T.get(0)) {
                mVQuestionnaireResult.timestamp = jVar.mo61697j();
                mVQuestionnaireResult.mo27905o();
            }
            if (T.get(1)) {
                mVQuestionnaireResult.questionnaireId = jVar.mo61696i();
                mVQuestionnaireResult.mo27904m();
            }
            if (T.get(2)) {
                mVQuestionnaireResult.questionnaireVersion = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVQuestionnaireResult.surveyType = MVSurveyType.findByValue(jVar.mo61696i());
            }
            if (T.get(4)) {
                mVQuestionnaireResult.endReason = MVEndReason.findByValue(jVar.mo61696i());
            }
            if (T.get(5)) {
                mVQuestionnaireResult.surveyContext = jVar.mo61704q();
            }
            if (T.get(6)) {
                int i = jVar.mo61696i();
                mVQuestionnaireResult.answers = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVSelectedAnswer mVSelectedAnswer = new MVSelectedAnswer();
                    mVSelectedAnswer.mo25201C1(jVar);
                    mVQuestionnaireResult.answers.add(mVSelectedAnswer);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVQuestionnaireResult$d */
    public static class C8942d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8941c(0);
        }
    }

    static {
        new C17394d0("MVQuestionnaireResult");
        HashMap hashMap = new HashMap();
        f26009i = hashMap;
        hashMap.put(C25239c.class, new C8940b());
        hashMap.put(C25240d.class, new C8942d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TIMESTAMP, new FieldMetaData("timestamp", (byte) 3, new FieldValueMetaData((byte) 10, "DateTime")));
        enumMap.put(_Fields.QUESTIONNAIRE_ID, new FieldMetaData("questionnaireId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.QUESTIONNAIRE_VERSION, new FieldMetaData("questionnaireVersion", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.SURVEY_TYPE, new FieldMetaData("surveyType", (byte) 3, new EnumMetaData(MVSurveyType.class)));
        enumMap.put(_Fields.END_REASON, new FieldMetaData("endReason", (byte) 3, new EnumMetaData(MVEndReason.class)));
        enumMap.put(_Fields.SURVEY_CONTEXT, new FieldMetaData("surveyContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ANSWERS, new FieldMetaData("answers", (byte) 3, new ListMetaData(new StructMetaData(MVSelectedAnswer.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26010j = unmodifiableMap;
        FieldMetaData.m61947a(MVQuestionnaireResult.class, unmodifiableMap);
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
        ((C25238b) f26009i.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26009i.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVQuestionnaireResult mVQuestionnaireResult = (MVQuestionnaireResult) obj;
        if (!getClass().equals(mVQuestionnaireResult.getClass())) {
            return getClass().getName().compareTo(mVQuestionnaireResult.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27903l()).compareTo(Boolean.valueOf(mVQuestionnaireResult.mo27903l()));
        if (compareTo != 0 || ((mo27903l() && (compareTo = C25082a.m62840d(this.timestamp, mVQuestionnaireResult.timestamp)) != 0) || (compareTo = Boolean.valueOf(mo27898h()).compareTo(Boolean.valueOf(mVQuestionnaireResult.mo27898h()))) != 0 || ((mo27898h() && (compareTo = C25082a.m62839c(this.questionnaireId, mVQuestionnaireResult.questionnaireId)) != 0) || (compareTo = Boolean.valueOf(mo27900i()).compareTo(Boolean.valueOf(mVQuestionnaireResult.mo27900i()))) != 0 || ((mo27900i() && (compareTo = this.questionnaireVersion.compareTo(mVQuestionnaireResult.questionnaireVersion)) != 0) || (compareTo = Boolean.valueOf(mo27902k()).compareTo(Boolean.valueOf(mVQuestionnaireResult.mo27902k()))) != 0 || ((mo27902k() && (compareTo = this.surveyType.compareTo(mVQuestionnaireResult.surveyType)) != 0) || (compareTo = Boolean.valueOf(mo27897g()).compareTo(Boolean.valueOf(mVQuestionnaireResult.mo27897g()))) != 0 || ((mo27897g() && (compareTo = this.endReason.compareTo(mVQuestionnaireResult.endReason)) != 0) || (compareTo = Boolean.valueOf(mo27901j()).compareTo(Boolean.valueOf(mVQuestionnaireResult.mo27901j()))) != 0 || ((mo27901j() && (compareTo = this.surveyContext.compareTo(mVQuestionnaireResult.surveyContext)) != 0) || (compareTo = Boolean.valueOf(mo27896f()).compareTo(Boolean.valueOf(mVQuestionnaireResult.mo27896f()))) != 0))))))) {
            return compareTo;
        }
        if (!mo27896f() || (h = C25082a.m62844h(this.answers, mVQuestionnaireResult.answers)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVQuestionnaireResult)) {
            return false;
        }
        MVQuestionnaireResult mVQuestionnaireResult = (MVQuestionnaireResult) obj;
        if (this.timestamp != mVQuestionnaireResult.timestamp || this.questionnaireId != mVQuestionnaireResult.questionnaireId) {
            return false;
        }
        boolean i = mo27900i();
        boolean i2 = mVQuestionnaireResult.mo27900i();
        if ((i || i2) && (!i || !i2 || !this.questionnaireVersion.equals(mVQuestionnaireResult.questionnaireVersion))) {
            return false;
        }
        boolean k = mo27902k();
        boolean k2 = mVQuestionnaireResult.mo27902k();
        if ((k || k2) && (!k || !k2 || !this.surveyType.equals(mVQuestionnaireResult.surveyType))) {
            return false;
        }
        boolean g = mo27897g();
        boolean g2 = mVQuestionnaireResult.mo27897g();
        if ((g || g2) && (!g || !g2 || !this.endReason.equals(mVQuestionnaireResult.endReason))) {
            return false;
        }
        boolean j = mo27901j();
        boolean j2 = mVQuestionnaireResult.mo27901j();
        if ((j || j2) && (!j || !j2 || !this.surveyContext.equals(mVQuestionnaireResult.surveyContext))) {
            return false;
        }
        boolean f = mo27896f();
        boolean f2 = mVQuestionnaireResult.mo27896f();
        if ((f || f2) && (!f || !f2 || !this.answers.equals(mVQuestionnaireResult.answers))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27896f() {
        return this.answers != null;
    }

    /* renamed from: g */
    public final boolean mo27897g() {
        return this.endReason != null;
    }

    /* renamed from: h */
    public final boolean mo27898h() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27900i() {
        return this.questionnaireVersion != null;
    }

    /* renamed from: j */
    public final boolean mo27901j() {
        return this.surveyContext != null;
    }

    /* renamed from: k */
    public final boolean mo27902k() {
        return this.surveyType != null;
    }

    /* renamed from: l */
    public final boolean mo27903l() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: m */
    public final void mo27904m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: o */
    public final void mo27905o() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVQuestionnaireResult(", "timestamp:");
        C25541a.m63889t(n, this.timestamp, ", ", "questionnaireId:");
        n.append(this.questionnaireId);
        if (mo27900i()) {
            n.append(", ");
            n.append("questionnaireVersion:");
            String str = this.questionnaireVersion;
            if (str == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str);
            }
        }
        n.append(", ");
        n.append("surveyType:");
        MVSurveyType mVSurveyType = this.surveyType;
        if (mVSurveyType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVSurveyType);
        }
        n.append(", ");
        n.append("endReason:");
        MVEndReason mVEndReason = this.endReason;
        if (mVEndReason == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVEndReason);
        }
        n.append(", ");
        n.append("surveyContext:");
        String str2 = this.surveyContext;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("answers:");
        List<MVSelectedAnswer> list = this.answers;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
