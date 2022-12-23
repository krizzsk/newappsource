package com.tranzmate.moovit.protocol.surveys;

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

public class MVAnswerNode implements TBase<MVAnswerNode, _Fields>, Serializable, Cloneable, Comparable<MVAnswerNode> {

    /* renamed from: b */
    public static final C25113c f28389b = new C25113c("answerId", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28390c = new C25113c("label", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f28391d = new C25113c("value", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f28392e = new C25113c("imageId", (byte) 8, 4);

    /* renamed from: f */
    public static final C25113c f28393f = new C25113c("nextQuestionNodeId", (byte) 8, 5);

    /* renamed from: g */
    public static final HashMap f28394g;

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f28395h;
    private byte __isset_bitfield = 0;
    public int answerId;
    public int imageId;
    public String label;
    public int nextQuestionNodeId;
    private _Fields[] optionals = {_Fields.NEXT_QUESTION_NODE_ID};
    public String value;

    public enum _Fields implements C25085c {
        ANSWER_ID(1, "answerId"),
        LABEL(2, "label"),
        VALUE(3, "value"),
        IMAGE_ID(4, "imageId"),
        NEXT_QUESTION_NODE_ID(5, "nextQuestionNodeId");
        
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
                return ANSWER_ID;
            }
            if (i == 2) {
                return LABEL;
            }
            if (i == 3) {
                return VALUE;
            }
            if (i == 4) {
                return IMAGE_ID;
            }
            if (i != 5) {
                return null;
            }
            return NEXT_QUESTION_NODE_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVAnswerNode$a */
    public static class C10593a extends C25239c<MVAnswerNode> {
        public C10593a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAnswerNode mVAnswerNode = (MVAnswerNode) tBase;
            mVAnswerNode.getClass();
            C25113c cVar = MVAnswerNode.f28389b;
            gVar.mo61687K();
            gVar.mo61711x(MVAnswerNode.f28389b);
            gVar.mo61678B(mVAnswerNode.answerId);
            gVar.mo61712y();
            if (mVAnswerNode.label != null) {
                gVar.mo61711x(MVAnswerNode.f28390c);
                gVar.mo61686J(mVAnswerNode.label);
                gVar.mo61712y();
            }
            if (mVAnswerNode.value != null) {
                gVar.mo61711x(MVAnswerNode.f28391d);
                gVar.mo61686J(mVAnswerNode.value);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVAnswerNode.f28392e);
            gVar.mo61678B(mVAnswerNode.imageId);
            gVar.mo61712y();
            if (mVAnswerNode.mo31855i()) {
                gVar.mo61711x(MVAnswerNode.f28393f);
                gVar.mo61678B(mVAnswerNode.nextQuestionNodeId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAnswerNode mVAnswerNode = (MVAnswerNode) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVAnswerNode.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                if (s != 5) {
                                    C25122h.m63098a(gVar, b);
                                } else if (b == 8) {
                                    mVAnswerNode.nextQuestionNodeId = gVar.mo61696i();
                                    mVAnswerNode.mo31859m();
                                } else {
                                    C25122h.m63098a(gVar, b);
                                }
                            } else if (b == 8) {
                                mVAnswerNode.imageId = gVar.mo61696i();
                                mVAnswerNode.mo31858l();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVAnswerNode.value = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVAnswerNode.label = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVAnswerNode.answerId = gVar.mo61696i();
                    mVAnswerNode.mo31857k();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVAnswerNode$b */
    public static class C10594b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10593a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVAnswerNode$c */
    public static class C10595c extends C25240d<MVAnswerNode> {
        public C10595c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVAnswerNode mVAnswerNode = (MVAnswerNode) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVAnswerNode.mo31851f()) {
                bitSet.set(0);
            }
            if (mVAnswerNode.mo31853h()) {
                bitSet.set(1);
            }
            if (mVAnswerNode.mo31856j()) {
                bitSet.set(2);
            }
            if (mVAnswerNode.mo31852g()) {
                bitSet.set(3);
            }
            if (mVAnswerNode.mo31855i()) {
                bitSet.set(4);
            }
            jVar.mo61738U(bitSet, 5);
            if (mVAnswerNode.mo31851f()) {
                jVar.mo61678B(mVAnswerNode.answerId);
            }
            if (mVAnswerNode.mo31853h()) {
                jVar.mo61686J(mVAnswerNode.label);
            }
            if (mVAnswerNode.mo31856j()) {
                jVar.mo61686J(mVAnswerNode.value);
            }
            if (mVAnswerNode.mo31852g()) {
                jVar.mo61678B(mVAnswerNode.imageId);
            }
            if (mVAnswerNode.mo31855i()) {
                jVar.mo61678B(mVAnswerNode.nextQuestionNodeId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVAnswerNode mVAnswerNode = (MVAnswerNode) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(5);
            if (T.get(0)) {
                mVAnswerNode.answerId = jVar.mo61696i();
                mVAnswerNode.mo31857k();
            }
            if (T.get(1)) {
                mVAnswerNode.label = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVAnswerNode.value = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVAnswerNode.imageId = jVar.mo61696i();
                mVAnswerNode.mo31858l();
            }
            if (T.get(4)) {
                mVAnswerNode.nextQuestionNodeId = jVar.mo61696i();
                mVAnswerNode.mo31859m();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.surveys.MVAnswerNode$d */
    public static class C10596d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10595c(0);
        }
    }

    static {
        new C17394d0("MVAnswerNode");
        HashMap hashMap = new HashMap();
        f28394g = hashMap;
        hashMap.put(C25239c.class, new C10594b());
        hashMap.put(C25240d.class, new C10596d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ANSWER_ID, new FieldMetaData("answerId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.LABEL, new FieldMetaData("label", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VALUE, new FieldMetaData("value", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IMAGE_ID, new FieldMetaData("imageId", (byte) 3, new FieldValueMetaData((byte) 8, false)));
        enumMap.put(_Fields.NEXT_QUESTION_NODE_ID, new FieldMetaData("nextQuestionNodeId", (byte) 2, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28395h = unmodifiableMap;
        FieldMetaData.m61947a(MVAnswerNode.class, unmodifiableMap);
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
        ((C25238b) f28394g.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28394g.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVAnswerNode mVAnswerNode = (MVAnswerNode) obj;
        if (!getClass().equals(mVAnswerNode.getClass())) {
            return getClass().getName().compareTo(mVAnswerNode.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31851f()).compareTo(Boolean.valueOf(mVAnswerNode.mo31851f()));
        if (compareTo != 0 || ((mo31851f() && (compareTo = C25082a.m62839c(this.answerId, mVAnswerNode.answerId)) != 0) || (compareTo = Boolean.valueOf(mo31853h()).compareTo(Boolean.valueOf(mVAnswerNode.mo31853h()))) != 0 || ((mo31853h() && (compareTo = this.label.compareTo(mVAnswerNode.label)) != 0) || (compareTo = Boolean.valueOf(mo31856j()).compareTo(Boolean.valueOf(mVAnswerNode.mo31856j()))) != 0 || ((mo31856j() && (compareTo = this.value.compareTo(mVAnswerNode.value)) != 0) || (compareTo = Boolean.valueOf(mo31852g()).compareTo(Boolean.valueOf(mVAnswerNode.mo31852g()))) != 0 || ((mo31852g() && (compareTo = C25082a.m62839c(this.imageId, mVAnswerNode.imageId)) != 0) || (compareTo = Boolean.valueOf(mo31855i()).compareTo(Boolean.valueOf(mVAnswerNode.mo31855i()))) != 0))))) {
            return compareTo;
        }
        if (!mo31855i() || (c = C25082a.m62839c(this.nextQuestionNodeId, mVAnswerNode.nextQuestionNodeId)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVAnswerNode)) {
            return false;
        }
        MVAnswerNode mVAnswerNode = (MVAnswerNode) obj;
        if (this.answerId != mVAnswerNode.answerId) {
            return false;
        }
        boolean h = mo31853h();
        boolean h2 = mVAnswerNode.mo31853h();
        if ((h || h2) && (!h || !h2 || !this.label.equals(mVAnswerNode.label))) {
            return false;
        }
        boolean j = mo31856j();
        boolean j2 = mVAnswerNode.mo31856j();
        if (((j || j2) && (!j || !j2 || !this.value.equals(mVAnswerNode.value))) || this.imageId != mVAnswerNode.imageId) {
            return false;
        }
        boolean i = mo31855i();
        boolean i2 = mVAnswerNode.mo31855i();
        if ((i || i2) && (!i || !i2 || this.nextQuestionNodeId != mVAnswerNode.nextQuestionNodeId)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31851f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo31852g() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: h */
    public final boolean mo31853h() {
        return this.label != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo31855i() {
        return C13637c.m34053H(this.__isset_bitfield, 2);
    }

    /* renamed from: j */
    public final boolean mo31856j() {
        return this.value != null;
    }

    /* renamed from: k */
    public final void mo31857k() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    /* renamed from: l */
    public final void mo31858l() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    /* renamed from: m */
    public final void mo31859m() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 2, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVAnswerNode(", "answerId:");
        C0016g.m42z(n, this.answerId, ", ", "label:");
        String str = this.label;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("value:");
        String str2 = this.value;
        if (str2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str2);
        }
        n.append(", ");
        n.append("imageId:");
        n.append(this.imageId);
        if (mo31855i()) {
            n.append(", ");
            n.append("nextQuestionNodeId:");
            n.append(this.nextQuestionNodeId);
        }
        n.append(")");
        return n.toString();
    }
}
