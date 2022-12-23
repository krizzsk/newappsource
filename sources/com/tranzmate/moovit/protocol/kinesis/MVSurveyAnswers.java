package com.tranzmate.moovit.protocol.kinesis;

import com.appboy.support.StringUtils;
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
import org.apache.thrift.meta_data.MapMetaData;
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25120f;
import vi0.C25121g;
import vi0.C25122h;
import vi0.C25124j;
import wi0.C25237a;
import wi0.C25238b;
import wi0.C25239c;
import wi0.C25240d;
import xi0.C25276a;

public class MVSurveyAnswers implements TBase<MVSurveyAnswers, _Fields>, Serializable, Cloneable, Comparable<MVSurveyAnswers> {

    /* renamed from: b */
    public static final C25113c f26092b = new C25113c("surveyId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26093c = new C25113c("q2answer", (byte) 13, 2);

    /* renamed from: d */
    public static final HashMap f26094d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26095e;
    private byte __isset_bitfield = 0;
    public Map<String, String> q2answer;
    public int surveyId;

    public enum _Fields implements C25085c {
        SURVEY_ID(1, "surveyId"),
        Q2ANSWER(2, "q2answer");
        
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
                return SURVEY_ID;
            }
            if (i != 2) {
                return null;
            }
            return Q2ANSWER;
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVSurveyAnswers$a */
    public static class C8952a extends C25239c<MVSurveyAnswers> {
        public C8952a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSurveyAnswers mVSurveyAnswers = (MVSurveyAnswers) tBase;
            mVSurveyAnswers.getClass();
            C25113c cVar = MVSurveyAnswers.f26092b;
            gVar.mo61687K();
            gVar.mo61711x(MVSurveyAnswers.f26092b);
            gVar.mo61678B(mVSurveyAnswers.surveyId);
            gVar.mo61712y();
            if (mVSurveyAnswers.q2answer != null) {
                gVar.mo61711x(MVSurveyAnswers.f26093c);
                gVar.mo61682F(new C25120f((byte) 11, (byte) 11, mVSurveyAnswers.q2answer.size()));
                for (Map.Entry next : mVSurveyAnswers.q2answer.entrySet()) {
                    gVar.mo61686J((String) next.getKey());
                    gVar.mo61686J((String) next.getValue());
                }
                gVar.mo61683G();
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSurveyAnswers mVSurveyAnswers = (MVSurveyAnswers) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSurveyAnswers.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 13) {
                        C25120f m = gVar.mo61700m();
                        mVSurveyAnswers.q2answer = new HashMap(m.f63398c * 2);
                        for (int i = 0; i < m.f63398c; i++) {
                            mVSurveyAnswers.q2answer.put(gVar.mo61704q(), gVar.mo61704q());
                        }
                        gVar.mo61701n();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVSurveyAnswers.surveyId = gVar.mo61696i();
                    mVSurveyAnswers.mo27938h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVSurveyAnswers$b */
    public static class C8953b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8952a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVSurveyAnswers$c */
    public static class C8954c extends C25240d<MVSurveyAnswers> {
        public C8954c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSurveyAnswers mVSurveyAnswers = (MVSurveyAnswers) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSurveyAnswers.mo27937g()) {
                bitSet.set(0);
            }
            if (mVSurveyAnswers.mo27936f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVSurveyAnswers.mo27937g()) {
                jVar.mo61678B(mVSurveyAnswers.surveyId);
            }
            if (mVSurveyAnswers.mo27936f()) {
                jVar.mo61678B(mVSurveyAnswers.q2answer.size());
                for (Map.Entry next : mVSurveyAnswers.q2answer.entrySet()) {
                    jVar.mo61686J((String) next.getKey());
                    jVar.mo61686J((String) next.getValue());
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSurveyAnswers mVSurveyAnswers = (MVSurveyAnswers) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVSurveyAnswers.surveyId = jVar.mo61696i();
                mVSurveyAnswers.mo27938h();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVSurveyAnswers.q2answer = new HashMap(i * 2);
                for (int i2 = 0; i2 < i; i2++) {
                    mVSurveyAnswers.q2answer.put(jVar.mo61704q(), jVar.mo61704q());
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVSurveyAnswers$d */
    public static class C8955d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8954c(0);
        }
    }

    static {
        new C17394d0("MVSurveyAnswers");
        HashMap hashMap = new HashMap();
        f26094d = hashMap;
        hashMap.put(C25239c.class, new C8953b());
        hashMap.put(C25240d.class, new C8955d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SURVEY_ID, new FieldMetaData("surveyId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.Q2ANSWER, new FieldMetaData("q2answer", (byte) 3, new MapMetaData(new FieldValueMetaData((byte) 11, false), new FieldValueMetaData((byte) 11, false))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26095e = unmodifiableMap;
        FieldMetaData.m61947a(MVSurveyAnswers.class, unmodifiableMap);
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
        ((C25238b) f26094d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26094d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int i;
        MVSurveyAnswers mVSurveyAnswers = (MVSurveyAnswers) obj;
        if (!getClass().equals(mVSurveyAnswers.getClass())) {
            return getClass().getName().compareTo(mVSurveyAnswers.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo27937g()).compareTo(Boolean.valueOf(mVSurveyAnswers.mo27937g()));
        if (compareTo != 0 || ((mo27937g() && (compareTo = C25082a.m62839c(this.surveyId, mVSurveyAnswers.surveyId)) != 0) || (compareTo = Boolean.valueOf(mo27936f()).compareTo(Boolean.valueOf(mVSurveyAnswers.mo27936f()))) != 0)) {
            return compareTo;
        }
        if (!mo27936f() || (i = C25082a.m62845i(this.q2answer, mVSurveyAnswers.q2answer)) == 0) {
            return 0;
        }
        return i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSurveyAnswers)) {
            return false;
        }
        MVSurveyAnswers mVSurveyAnswers = (MVSurveyAnswers) obj;
        if (this.surveyId != mVSurveyAnswers.surveyId) {
            return false;
        }
        boolean f = mo27936f();
        boolean f2 = mVSurveyAnswers.mo27936f();
        if ((f || f2) && (!f || !f2 || !this.q2answer.equals(mVSurveyAnswers.q2answer))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27936f() {
        return this.q2answer != null;
    }

    /* renamed from: g */
    public final boolean mo27937g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo27938h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSurveyAnswers(", "surveyId:");
        C0016g.m42z(n, this.surveyId, ", ", "q2answer:");
        Map<String, String> map = this.q2answer;
        if (map == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(map);
        }
        n.append(")");
        return n.toString();
    }
}
