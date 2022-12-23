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
import p001a0.C0016g;
import p358af.C13437d;
import p389bl.C13637c;
import p531he.C17394d0;
import ui0.C25082a;
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

public class MVSelectedAnswer implements TBase<MVSelectedAnswer, _Fields>, Serializable, Cloneable, Comparable<MVSelectedAnswer> {

    /* renamed from: b */
    public static final C25113c f26011b = new C25113c("nodeId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26012c = new C25113c("questionId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f26013d = new C25113c("answerId", (byte) 8, 3);

    /* renamed from: e */
    public static final C25113c f26014e = new C25113c("answerValue", (byte) 11, 4);

    /* renamed from: f */
    public static final HashMap f26015f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26016g;
    private byte __isset_bitfield = 0;
    public int answerId;
    public String answerValue;
    public int nodeId;
    public int questionId;

    public enum _Fields implements C25085c {
        NODE_ID(1, "nodeId"),
        QUESTION_ID(2, "questionId"),
        ANSWER_ID(3, "answerId"),
        ANSWER_VALUE(4, "answerValue");
        
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
                return NODE_ID;
            }
            if (i == 2) {
                return QUESTION_ID;
            }
            if (i == 3) {
                return ANSWER_ID;
            }
            if (i != 4) {
                return null;
            }
            return ANSWER_VALUE;
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

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVSelectedAnswer$a */
    public static class C8943a extends C25239c<MVSelectedAnswer> {
        public C8943a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSelectedAnswer mVSelectedAnswer = (MVSelectedAnswer) tBase;
            mVSelectedAnswer.getClass();
            C25113c cVar = MVSelectedAnswer.f26011b;
            gVar.mo61687K();
            gVar.mo61711x(MVSelectedAnswer.f26011b);
            gVar.mo61678B(mVSelectedAnswer.nodeId);
            gVar.mo61712y();
            gVar.mo61711x(MVSelectedAnswer.f26012c);
            gVar.mo61678B(mVSelectedAnswer.questionId);
            gVar.mo61712y();
            gVar.mo61711x(MVSelectedAnswer.f26013d);
            gVar.mo61678B(mVSelectedAnswer.answerId);
            gVar.mo61712y();
            if (mVSelectedAnswer.answerValue != null) {
                gVar.mo61711x(MVSelectedAnswer.f26014e);
                gVar.mo61686J(mVSelectedAnswer.answerValue);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSelectedAnswer mVSelectedAnswer = (MVSelectedAnswer) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVSelectedAnswer.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 11) {
                                mVSelectedAnswer.answerValue = gVar.mo61704q();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 8) {
                            mVSelectedAnswer.answerId = gVar.mo61696i();
                            mVSelectedAnswer.mo27915j();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVSelectedAnswer.questionId = gVar.mo61696i();
                        mVSelectedAnswer.mo27917l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVSelectedAnswer.nodeId = gVar.mo61696i();
                    mVSelectedAnswer.mo27916k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVSelectedAnswer$b */
    public static class C8944b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8943a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVSelectedAnswer$c */
    public static class C8945c extends C25240d<MVSelectedAnswer> {
        public C8945c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVSelectedAnswer mVSelectedAnswer = (MVSelectedAnswer) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVSelectedAnswer.mo27912h()) {
                bitSet.set(0);
            }
            if (mVSelectedAnswer.mo27914i()) {
                bitSet.set(1);
            }
            if (mVSelectedAnswer.mo27910f()) {
                bitSet.set(2);
            }
            if (mVSelectedAnswer.mo27911g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVSelectedAnswer.mo27912h()) {
                jVar.mo61678B(mVSelectedAnswer.nodeId);
            }
            if (mVSelectedAnswer.mo27914i()) {
                jVar.mo61678B(mVSelectedAnswer.questionId);
            }
            if (mVSelectedAnswer.mo27910f()) {
                jVar.mo61678B(mVSelectedAnswer.answerId);
            }
            if (mVSelectedAnswer.mo27911g()) {
                jVar.mo61686J(mVSelectedAnswer.answerValue);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVSelectedAnswer mVSelectedAnswer = (MVSelectedAnswer) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVSelectedAnswer.nodeId = jVar.mo61696i();
                mVSelectedAnswer.mo27916k();
            }
            if (T.get(1)) {
                mVSelectedAnswer.questionId = jVar.mo61696i();
                mVSelectedAnswer.mo27917l();
            }
            if (T.get(2)) {
                mVSelectedAnswer.answerId = jVar.mo61696i();
                mVSelectedAnswer.mo27915j();
            }
            if (T.get(3)) {
                mVSelectedAnswer.answerValue = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.kinesis.MVSelectedAnswer$d */
    public static class C8946d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8945c(0);
        }
    }

    static {
        new C17394d0("MVSelectedAnswer");
        HashMap hashMap = new HashMap();
        f26015f = hashMap;
        hashMap.put(C25239c.class, new C8944b());
        hashMap.put(C25240d.class, new C8946d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NODE_ID, new FieldMetaData("nodeId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.QUESTION_ID, new FieldMetaData("questionId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ANSWER_ID, new FieldMetaData("answerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.ANSWER_VALUE, new FieldMetaData("answerValue", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26016g = unmodifiableMap;
        FieldMetaData.m61947a(MVSelectedAnswer.class, unmodifiableMap);
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
        ((C25238b) f26015f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26015f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVSelectedAnswer mVSelectedAnswer = (MVSelectedAnswer) obj;
        if (!getClass().equals(mVSelectedAnswer.getClass())) {
            return getClass().getName().compareTo(mVSelectedAnswer.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27912h()).compareTo(Boolean.valueOf(mVSelectedAnswer.mo27912h()));
        if (compareTo2 != 0 || ((mo27912h() && (compareTo2 = C25082a.m62839c(this.nodeId, mVSelectedAnswer.nodeId)) != 0) || (compareTo2 = Boolean.valueOf(mo27914i()).compareTo(Boolean.valueOf(mVSelectedAnswer.mo27914i()))) != 0 || ((mo27914i() && (compareTo2 = C25082a.m62839c(this.questionId, mVSelectedAnswer.questionId)) != 0) || (compareTo2 = Boolean.valueOf(mo27910f()).compareTo(Boolean.valueOf(mVSelectedAnswer.mo27910f()))) != 0 || ((mo27910f() && (compareTo2 = C25082a.m62839c(this.answerId, mVSelectedAnswer.answerId)) != 0) || (compareTo2 = Boolean.valueOf(mo27911g()).compareTo(Boolean.valueOf(mVSelectedAnswer.mo27911g()))) != 0)))) {
            return compareTo2;
        }
        if (!mo27911g() || (compareTo = this.answerValue.compareTo(mVSelectedAnswer.answerValue)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVSelectedAnswer)) {
            return false;
        }
        MVSelectedAnswer mVSelectedAnswer = (MVSelectedAnswer) obj;
        if (this.nodeId != mVSelectedAnswer.nodeId || this.questionId != mVSelectedAnswer.questionId || this.answerId != mVSelectedAnswer.answerId) {
            return false;
        }
        boolean g = mo27911g();
        boolean g2 = mVSelectedAnswer.mo27911g();
        if ((g || g2) && (!g || !g2 || !this.answerValue.equals(mVSelectedAnswer.answerValue))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27910f() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: g */
    public final boolean mo27911g() {
        return this.answerValue != null;
    }

    /* renamed from: h */
    public final boolean mo27912h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo27914i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final void mo27915j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    /* renamed from: k */
    public final void mo27916k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo27917l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVSelectedAnswer(", "nodeId:");
        C0016g.m42z(n, this.nodeId, ", ", "questionId:");
        C0016g.m42z(n, this.questionId, ", ", "answerId:");
        C0016g.m42z(n, this.answerId, ", ", "answerValue:");
        String str = this.answerValue;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
