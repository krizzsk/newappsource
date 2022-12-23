package com.tranzmate.moovit.protocol.surveys;

import com.appboy.support.StringUtils;
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

public class MVQuestionNode implements TBase<MVQuestionNode, _Fields>, Serializable, Cloneable, Comparable<MVQuestionNode> {

    /* renamed from: b */
    public static final C25113c f28412b = new C25113c("nodeId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28413c = new C25113c("questionId", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f28414d = new C25113c("label", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28415e = new C25113c("answers", (byte) 15, 4);

    /* renamed from: f */
    public static final HashMap f28416f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f28417g;
    private byte __isset_bitfield = 0;
    public List<MVAnswerNode> answers;
    public String label;
    public int nodeId;
    public int questionId;

    public enum _Fields implements C25085c {
        NODE_ID(1, "nodeId"),
        QUESTION_ID(2, "questionId"),
        LABEL(3, "label"),
        ANSWERS(4, "answers");
        
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
                return LABEL;
            }
            if (i != 4) {
                return null;
            }
            return ANSWERS;
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

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVQuestionNode$a */
    public static class C10613a extends C25239c<MVQuestionNode> {
        public C10613a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVQuestionNode mVQuestionNode = (MVQuestionNode) tBase;
            mVQuestionNode.getClass();
            C25113c cVar = MVQuestionNode.f28412b;
            gVar.mo61687K();
            gVar.mo61711x(MVQuestionNode.f28412b);
            gVar.mo61678B(mVQuestionNode.nodeId);
            gVar.mo61712y();
            gVar.mo61711x(MVQuestionNode.f28413c);
            gVar.mo61678B(mVQuestionNode.questionId);
            gVar.mo61712y();
            if (mVQuestionNode.label != null) {
                gVar.mo61711x(MVQuestionNode.f28414d);
                gVar.mo61686J(mVQuestionNode.label);
                gVar.mo61712y();
            }
            if (mVQuestionNode.answers != null) {
                gVar.mo61711x(MVQuestionNode.f28415e);
                gVar.mo61680D(new C25119e((byte) 12, mVQuestionNode.answers.size()));
                for (MVAnswerNode X0 : mVQuestionNode.answers) {
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
            MVQuestionNode mVQuestionNode = (MVQuestionNode) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVQuestionNode.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 15) {
                                C25119e k = gVar.mo61698k();
                                mVQuestionNode.answers = new ArrayList(k.f63395b);
                                for (int i = 0; i < k.f63395b; i++) {
                                    MVAnswerNode mVAnswerNode = new MVAnswerNode();
                                    mVAnswerNode.mo25201C1(gVar);
                                    mVQuestionNode.answers.add(mVAnswerNode);
                                }
                                gVar.mo61699l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVQuestionNode.label = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVQuestionNode.questionId = gVar.mo61696i();
                        mVQuestionNode.mo31905k();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVQuestionNode.nodeId = gVar.mo61696i();
                    mVQuestionNode.mo31904j();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVQuestionNode$b */
    public static class C10614b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10613a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVQuestionNode$c */
    public static class C10615c extends C25240d<MVQuestionNode> {
        public C10615c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVQuestionNode mVQuestionNode = (MVQuestionNode) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVQuestionNode.mo31901h()) {
                bitSet.set(0);
            }
            if (mVQuestionNode.mo31903i()) {
                bitSet.set(1);
            }
            if (mVQuestionNode.mo31900g()) {
                bitSet.set(2);
            }
            if (mVQuestionNode.mo31899f()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVQuestionNode.mo31901h()) {
                jVar.mo61678B(mVQuestionNode.nodeId);
            }
            if (mVQuestionNode.mo31903i()) {
                jVar.mo61678B(mVQuestionNode.questionId);
            }
            if (mVQuestionNode.mo31900g()) {
                jVar.mo61686J(mVQuestionNode.label);
            }
            if (mVQuestionNode.mo31899f()) {
                jVar.mo61678B(mVQuestionNode.answers.size());
                for (MVAnswerNode X0 : mVQuestionNode.answers) {
                    X0.mo25202X0(jVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVQuestionNode mVQuestionNode = (MVQuestionNode) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVQuestionNode.nodeId = jVar.mo61696i();
                mVQuestionNode.mo31904j();
            }
            if (T.get(1)) {
                mVQuestionNode.questionId = jVar.mo61696i();
                mVQuestionNode.mo31905k();
            }
            if (T.get(2)) {
                mVQuestionNode.label = jVar.mo61704q();
            }
            if (T.get(3)) {
                int i = jVar.mo61696i();
                mVQuestionNode.answers = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    MVAnswerNode mVAnswerNode = new MVAnswerNode();
                    mVAnswerNode.mo25201C1(jVar);
                    mVQuestionNode.answers.add(mVAnswerNode);
                }
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVQuestionNode$d */
    public static class C10616d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10615c(0);
        }
    }

    static {
        new C17394d0("MVQuestionNode");
        HashMap hashMap = new HashMap();
        f28416f = hashMap;
        hashMap.put(C25239c.class, new C10614b());
        hashMap.put(C25240d.class, new C10616d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NODE_ID, new FieldMetaData("nodeId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.QUESTION_ID, new FieldMetaData("questionId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LABEL, new FieldMetaData("label", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ANSWERS, new FieldMetaData("answers", (byte) 3, new ListMetaData(new StructMetaData(MVAnswerNode.class))));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28417g = unmodifiableMap;
        FieldMetaData.m61947a(MVQuestionNode.class, unmodifiableMap);
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
        ((C25238b) f28416f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28416f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int h;
        MVQuestionNode mVQuestionNode = (MVQuestionNode) obj;
        if (!getClass().equals(mVQuestionNode.getClass())) {
            return getClass().getName().compareTo(mVQuestionNode.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31901h()).compareTo(Boolean.valueOf(mVQuestionNode.mo31901h()));
        if (compareTo != 0 || ((mo31901h() && (compareTo = C25082a.m62839c(this.nodeId, mVQuestionNode.nodeId)) != 0) || (compareTo = Boolean.valueOf(mo31903i()).compareTo(Boolean.valueOf(mVQuestionNode.mo31903i()))) != 0 || ((mo31903i() && (compareTo = C25082a.m62839c(this.questionId, mVQuestionNode.questionId)) != 0) || (compareTo = Boolean.valueOf(mo31900g()).compareTo(Boolean.valueOf(mVQuestionNode.mo31900g()))) != 0 || ((mo31900g() && (compareTo = this.label.compareTo(mVQuestionNode.label)) != 0) || (compareTo = Boolean.valueOf(mo31899f()).compareTo(Boolean.valueOf(mVQuestionNode.mo31899f()))) != 0)))) {
            return compareTo;
        }
        if (!mo31899f() || (h = C25082a.m62844h(this.answers, mVQuestionNode.answers)) == 0) {
            return 0;
        }
        return h;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVQuestionNode)) {
            return false;
        }
        MVQuestionNode mVQuestionNode = (MVQuestionNode) obj;
        if (this.nodeId != mVQuestionNode.nodeId || this.questionId != mVQuestionNode.questionId) {
            return false;
        }
        boolean g = mo31900g();
        boolean g2 = mVQuestionNode.mo31900g();
        if ((g || g2) && (!g || !g2 || !this.label.equals(mVQuestionNode.label))) {
            return false;
        }
        boolean f = mo31899f();
        boolean f2 = mVQuestionNode.mo31899f();
        if ((f || f2) && (!f || !f2 || !this.answers.equals(mVQuestionNode.answers))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31899f() {
        return this.answers != null;
    }

    /* renamed from: g */
    public final boolean mo31900g() {
        return this.label != null;
    }

    /* renamed from: h */
    public final boolean mo31901h() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31903i() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: j */
    public final void mo31904j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: k */
    public final void mo31905k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVQuestionNode(", "nodeId:");
        C0016g.m42z(n, this.nodeId, ", ", "questionId:");
        C0016g.m42z(n, this.questionId, ", ", "label:");
        String str = this.label;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("answers:");
        List<MVAnswerNode> list = this.answers;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(")");
        return n.toString();
    }
}
