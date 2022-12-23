package com.tranzmate.moovit.protocol.presentation;

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
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
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

public class MVTokenConditional implements TBase<MVTokenConditional, _Fields>, Serializable, Cloneable, Comparable<MVTokenConditional> {

    /* renamed from: b */
    public static final C25113c f27798b = new C25113c("condition", (byte) 12, 1);

    /* renamed from: c */
    public static final C25113c f27799c = new C25113c("ifGreater", (byte) 8, 2);

    /* renamed from: d */
    public static final C25113c f27800d = new C25113c("ifLess", (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f27801e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f27802f;
    public MVConditional condition;
    public MVLineTemplateToken ifGreater;
    public MVLineTemplateToken ifLess;

    public enum _Fields implements C25085c {
        CONDITION(1, "condition"),
        IF_GREATER(2, "ifGreater"),
        IF_LESS(3, "ifLess");
        
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
                return CONDITION;
            }
            if (i == 2) {
                return IF_GREATER;
            }
            if (i != 3) {
                return null;
            }
            return IF_LESS;
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

    /* renamed from: com.tranzmate.moovit.protocol.presentation.MVTokenConditional$a */
    public static class C10141a extends C25239c<MVTokenConditional> {
        public C10141a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTokenConditional mVTokenConditional = (MVTokenConditional) tBase;
            MVConditional mVConditional = mVTokenConditional.condition;
            C25113c cVar = MVTokenConditional.f27798b;
            gVar.mo61687K();
            if (mVTokenConditional.condition != null) {
                gVar.mo61711x(MVTokenConditional.f27798b);
                mVTokenConditional.condition.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVTokenConditional.ifGreater != null) {
                gVar.mo61711x(MVTokenConditional.f27799c);
                gVar.mo61678B(mVTokenConditional.ifGreater.getValue());
                gVar.mo61712y();
            }
            if (mVTokenConditional.ifLess != null) {
                gVar.mo61711x(MVTokenConditional.f27800d);
                gVar.mo61678B(mVTokenConditional.ifLess.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTokenConditional mVTokenConditional = (MVTokenConditional) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVConditional mVConditional = mVTokenConditional.condition;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVTokenConditional.ifLess = MVLineTemplateToken.findByValue(gVar.mo61696i());
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 8) {
                        mVTokenConditional.ifGreater = MVLineTemplateToken.findByValue(gVar.mo61696i());
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 12) {
                    MVConditional mVConditional2 = new MVConditional();
                    mVTokenConditional.condition = mVConditional2;
                    mVConditional2.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.presentation.MVTokenConditional$b */
    public static class C10142b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10141a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.presentation.MVTokenConditional$c */
    public static class C10143c extends C25240d<MVTokenConditional> {
        public C10143c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTokenConditional mVTokenConditional = (MVTokenConditional) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTokenConditional.mo30771f()) {
                bitSet.set(0);
            }
            if (mVTokenConditional.mo30772g()) {
                bitSet.set(1);
            }
            if (mVTokenConditional.mo30773h()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVTokenConditional.mo30771f()) {
                mVTokenConditional.condition.mo25202X0(jVar);
            }
            if (mVTokenConditional.mo30772g()) {
                jVar.mo61678B(mVTokenConditional.ifGreater.getValue());
            }
            if (mVTokenConditional.mo30773h()) {
                jVar.mo61678B(mVTokenConditional.ifLess.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTokenConditional mVTokenConditional = (MVTokenConditional) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                MVConditional mVConditional = new MVConditional();
                mVTokenConditional.condition = mVConditional;
                mVConditional.mo25201C1(jVar);
            }
            if (T.get(1)) {
                mVTokenConditional.ifGreater = MVLineTemplateToken.findByValue(jVar.mo61696i());
            }
            if (T.get(2)) {
                mVTokenConditional.ifLess = MVLineTemplateToken.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.presentation.MVTokenConditional$d */
    public static class C10144d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10143c(0);
        }
    }

    static {
        Class<MVLineTemplateToken> cls = MVLineTemplateToken.class;
        new C17394d0("MVTokenConditional");
        HashMap hashMap = new HashMap();
        f27801e = hashMap;
        hashMap.put(C25239c.class, new C10142b());
        hashMap.put(C25240d.class, new C10144d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONDITION, new FieldMetaData("condition", (byte) 3, new StructMetaData(MVConditional.class)));
        enumMap.put(_Fields.IF_GREATER, new FieldMetaData("ifGreater", (byte) 3, new EnumMetaData(cls)));
        enumMap.put(_Fields.IF_LESS, new FieldMetaData("ifLess", (byte) 3, new EnumMetaData(cls)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27802f = unmodifiableMap;
        FieldMetaData.m61947a(MVTokenConditional.class, unmodifiableMap);
    }

    public MVTokenConditional() {
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
        ((C25238b) f27801e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27801e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30768a(MVTokenConditional mVTokenConditional) {
        if (mVTokenConditional == null) {
            return false;
        }
        boolean f = mo30771f();
        boolean f2 = mVTokenConditional.mo30771f();
        if ((f || f2) && (!f || !f2 || !this.condition.mo30732a(mVTokenConditional.condition))) {
            return false;
        }
        boolean g = mo30772g();
        boolean g2 = mVTokenConditional.mo30772g();
        if ((g || g2) && (!g || !g2 || !this.ifGreater.equals(mVTokenConditional.ifGreater))) {
            return false;
        }
        boolean h = mo30773h();
        boolean h2 = mVTokenConditional.mo30773h();
        if (!h && !h2) {
            return true;
        }
        if (!h || !h2 || !this.ifLess.equals(mVTokenConditional.ifLess)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTokenConditional mVTokenConditional = (MVTokenConditional) obj;
        if (!getClass().equals(mVTokenConditional.getClass())) {
            return getClass().getName().compareTo(mVTokenConditional.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30771f()).compareTo(Boolean.valueOf(mVTokenConditional.mo30771f()));
        if (compareTo2 != 0 || ((mo30771f() && (compareTo2 = this.condition.compareTo(mVTokenConditional.condition)) != 0) || (compareTo2 = Boolean.valueOf(mo30772g()).compareTo(Boolean.valueOf(mVTokenConditional.mo30772g()))) != 0 || ((mo30772g() && (compareTo2 = this.ifGreater.compareTo(mVTokenConditional.ifGreater)) != 0) || (compareTo2 = Boolean.valueOf(mo30773h()).compareTo(Boolean.valueOf(mVTokenConditional.mo30773h()))) != 0))) {
            return compareTo2;
        }
        if (!mo30773h() || (compareTo = this.ifLess.compareTo(mVTokenConditional.ifLess)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVTokenConditional)) {
            return mo30768a((MVTokenConditional) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30771f() {
        return this.condition != null;
    }

    /* renamed from: g */
    public final boolean mo30772g() {
        return this.ifGreater != null;
    }

    /* renamed from: h */
    public final boolean mo30773h() {
        return this.ifLess != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTokenConditional(", "condition:");
        MVConditional mVConditional = this.condition;
        if (mVConditional == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVConditional);
        }
        n.append(", ");
        n.append("ifGreater:");
        MVLineTemplateToken mVLineTemplateToken = this.ifGreater;
        if (mVLineTemplateToken == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLineTemplateToken);
        }
        n.append(", ");
        n.append("ifLess:");
        MVLineTemplateToken mVLineTemplateToken2 = this.ifLess;
        if (mVLineTemplateToken2 == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLineTemplateToken2);
        }
        n.append(")");
        return n.toString();
    }

    public MVTokenConditional(MVConditional mVConditional, MVLineTemplateToken mVLineTemplateToken, MVLineTemplateToken mVLineTemplateToken2) {
        this();
        this.condition = mVConditional;
        this.ifGreater = mVLineTemplateToken;
        this.ifLess = mVLineTemplateToken2;
    }
}
