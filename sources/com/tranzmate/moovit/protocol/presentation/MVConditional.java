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
import org.apache.thrift.meta_data.FieldValueMetaData;
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

public class MVConditional implements TBase<MVConditional, _Fields>, Serializable, Cloneable, Comparable<MVConditional> {

    /* renamed from: b */
    public static final C25113c f27780b = new C25113c("condition", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f27781c = new C25113c("conditionLength", (byte) 3, 2);

    /* renamed from: d */
    public static final HashMap f27782d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27783e;
    private byte __isset_bitfield;
    public MVLineTemplateToken condition;
    public byte conditionLength;

    public enum _Fields implements C25085c {
        CONDITION(1, "condition"),
        CONDITION_LENGTH(2, "conditionLength");
        
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
            if (i != 2) {
                return null;
            }
            return CONDITION_LENGTH;
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

    /* renamed from: com.tranzmate.moovit.protocol.presentation.MVConditional$a */
    public static class C10129a extends C25239c<MVConditional> {
        public C10129a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVConditional mVConditional = (MVConditional) tBase;
            mVConditional.getClass();
            C25113c cVar = MVConditional.f27780b;
            gVar.mo61687K();
            if (mVConditional.condition != null) {
                gVar.mo61711x(MVConditional.f27780b);
                gVar.mo61678B(mVConditional.condition.getValue());
                gVar.mo61712y();
            }
            gVar.mo61711x(MVConditional.f27781c);
            gVar.mo61709v(mVConditional.conditionLength);
            gVar.mo61712y();
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVConditional mVConditional = (MVConditional) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVConditional.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 3) {
                        mVConditional.conditionLength = gVar.mo61691d();
                        mVConditional.mo30737h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVConditional.condition = MVLineTemplateToken.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.presentation.MVConditional$b */
    public static class C10130b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10129a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.presentation.MVConditional$c */
    public static class C10131c extends C25240d<MVConditional> {
        public C10131c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVConditional mVConditional = (MVConditional) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVConditional.mo30735f()) {
                bitSet.set(0);
            }
            if (mVConditional.mo30736g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVConditional.mo30735f()) {
                jVar.mo61678B(mVConditional.condition.getValue());
            }
            if (mVConditional.mo30736g()) {
                jVar.mo61716P(mVConditional.conditionLength);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVConditional mVConditional = (MVConditional) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVConditional.condition = MVLineTemplateToken.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVConditional.conditionLength = jVar.mo61691d();
                mVConditional.mo30737h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.presentation.MVConditional$d */
    public static class C10132d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10131c(0);
        }
    }

    static {
        new C17394d0("MVConditional");
        HashMap hashMap = new HashMap();
        f27782d = hashMap;
        hashMap.put(C25239c.class, new C10130b());
        hashMap.put(C25240d.class, new C10132d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONDITION, new FieldMetaData("condition", (byte) 3, new EnumMetaData(MVLineTemplateToken.class)));
        enumMap.put(_Fields.CONDITION_LENGTH, new FieldMetaData("conditionLength", (byte) 3, new FieldValueMetaData((byte) 3, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27783e = unmodifiableMap;
        FieldMetaData.m61947a(MVConditional.class, unmodifiableMap);
    }

    public MVConditional() {
        this.__isset_bitfield = 0;
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
        ((C25238b) f27782d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27782d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo30732a(MVConditional mVConditional) {
        if (mVConditional == null) {
            return false;
        }
        boolean f = mo30735f();
        boolean f2 = mVConditional.mo30735f();
        if (((f || f2) && (!f || !f2 || !this.condition.equals(mVConditional.condition))) || this.conditionLength != mVConditional.conditionLength) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int a;
        MVConditional mVConditional = (MVConditional) obj;
        if (!getClass().equals(mVConditional.getClass())) {
            return getClass().getName().compareTo(mVConditional.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30735f()).compareTo(Boolean.valueOf(mVConditional.mo30735f()));
        if (compareTo != 0 || ((mo30735f() && (compareTo = this.condition.compareTo(mVConditional.condition)) != 0) || (compareTo = Boolean.valueOf(mo30736g()).compareTo(Boolean.valueOf(mVConditional.mo30736g()))) != 0)) {
            return compareTo;
        }
        if (!mo30736g() || (a = C25082a.m62837a(this.conditionLength, mVConditional.conditionLength)) == 0) {
            return 0;
        }
        return a;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVConditional)) {
            return mo30732a((MVConditional) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo30735f() {
        return this.condition != null;
    }

    /* renamed from: g */
    public final boolean mo30736g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo30737h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVConditional(", "condition:");
        MVLineTemplateToken mVLineTemplateToken = this.condition;
        if (mVLineTemplateToken == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLineTemplateToken);
        }
        n.append(", ");
        n.append("conditionLength:");
        return C13437d.m33707l(n, this.conditionLength, ")");
    }

    public MVConditional(MVLineTemplateToken mVLineTemplateToken, byte b) {
        this();
        this.condition = mVLineTemplateToken;
        this.conditionLength = b;
        mo30737h();
    }
}
