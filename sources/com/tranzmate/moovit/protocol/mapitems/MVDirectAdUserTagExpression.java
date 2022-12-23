package com.tranzmate.moovit.protocol.mapitems;

import com.appboy.support.StringUtils;
import com.appsflyer.ServerParameters;
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

public class MVDirectAdUserTagExpression implements TBase<MVDirectAdUserTagExpression, _Fields>, Serializable, Cloneable, Comparable<MVDirectAdUserTagExpression> {

    /* renamed from: b */
    public static final C25113c f26269b = new C25113c("userTagKey", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26270c = new C25113c("userTagValues", (byte) 15, 2);

    /* renamed from: d */
    public static final C25113c f26271d = new C25113c(ServerParameters.OPERATOR, (byte) 8, 3);

    /* renamed from: e */
    public static final HashMap f26272e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f26273f;
    public MVDirectAdOperator operator;
    public String userTagKey;
    public List<String> userTagValues;

    public enum _Fields implements C25085c {
        USER_TAG_KEY(1, "userTagKey"),
        USER_TAG_VALUES(2, "userTagValues"),
        OPERATOR(3, ServerParameters.OPERATOR);
        
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
                return USER_TAG_KEY;
            }
            if (i == 2) {
                return USER_TAG_VALUES;
            }
            if (i != 3) {
                return null;
            }
            return OPERATOR;
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

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDirectAdUserTagExpression$a */
    public static class C9077a extends C25239c<MVDirectAdUserTagExpression> {
        public C9077a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDirectAdUserTagExpression mVDirectAdUserTagExpression = (MVDirectAdUserTagExpression) tBase;
            mVDirectAdUserTagExpression.getClass();
            C25113c cVar = MVDirectAdUserTagExpression.f26269b;
            gVar.mo61687K();
            if (mVDirectAdUserTagExpression.userTagKey != null) {
                gVar.mo61711x(MVDirectAdUserTagExpression.f26269b);
                gVar.mo61686J(mVDirectAdUserTagExpression.userTagKey);
                gVar.mo61712y();
            }
            if (mVDirectAdUserTagExpression.userTagValues != null) {
                gVar.mo61711x(MVDirectAdUserTagExpression.f26270c);
                gVar.mo61680D(new C25119e((byte) 11, mVDirectAdUserTagExpression.userTagValues.size()));
                for (String J : mVDirectAdUserTagExpression.userTagValues) {
                    gVar.mo61686J(J);
                }
                gVar.mo61681E();
                gVar.mo61712y();
            }
            if (mVDirectAdUserTagExpression.operator != null) {
                gVar.mo61711x(MVDirectAdUserTagExpression.f26271d);
                gVar.mo61678B(mVDirectAdUserTagExpression.operator.getValue());
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDirectAdUserTagExpression mVDirectAdUserTagExpression = (MVDirectAdUserTagExpression) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVDirectAdUserTagExpression.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 8) {
                            mVDirectAdUserTagExpression.operator = MVDirectAdOperator.findByValue(gVar.mo61696i());
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 15) {
                        C25119e k = gVar.mo61698k();
                        mVDirectAdUserTagExpression.userTagValues = new ArrayList(k.f63395b);
                        for (int i = 0; i < k.f63395b; i++) {
                            mVDirectAdUserTagExpression.userTagValues.add(gVar.mo61704q());
                        }
                        gVar.mo61699l();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVDirectAdUserTagExpression.userTagKey = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDirectAdUserTagExpression$b */
    public static class C9078b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9077a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDirectAdUserTagExpression$c */
    public static class C9079c extends C25240d<MVDirectAdUserTagExpression> {
        public C9079c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVDirectAdUserTagExpression mVDirectAdUserTagExpression = (MVDirectAdUserTagExpression) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVDirectAdUserTagExpression.mo28259g()) {
                bitSet.set(0);
            }
            if (mVDirectAdUserTagExpression.mo28260h()) {
                bitSet.set(1);
            }
            if (mVDirectAdUserTagExpression.mo28258f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVDirectAdUserTagExpression.mo28259g()) {
                jVar.mo61686J(mVDirectAdUserTagExpression.userTagKey);
            }
            if (mVDirectAdUserTagExpression.mo28260h()) {
                jVar.mo61678B(mVDirectAdUserTagExpression.userTagValues.size());
                for (String J : mVDirectAdUserTagExpression.userTagValues) {
                    jVar.mo61686J(J);
                }
            }
            if (mVDirectAdUserTagExpression.mo28258f()) {
                jVar.mo61678B(mVDirectAdUserTagExpression.operator.getValue());
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVDirectAdUserTagExpression mVDirectAdUserTagExpression = (MVDirectAdUserTagExpression) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVDirectAdUserTagExpression.userTagKey = jVar.mo61704q();
            }
            if (T.get(1)) {
                int i = jVar.mo61696i();
                mVDirectAdUserTagExpression.userTagValues = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    mVDirectAdUserTagExpression.userTagValues.add(jVar.mo61704q());
                }
            }
            if (T.get(2)) {
                mVDirectAdUserTagExpression.operator = MVDirectAdOperator.findByValue(jVar.mo61696i());
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.mapitems.MVDirectAdUserTagExpression$d */
    public static class C9080d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9079c(0);
        }
    }

    static {
        new C17394d0("MVDirectAdUserTagExpression");
        HashMap hashMap = new HashMap();
        f26272e = hashMap;
        hashMap.put(C25239c.class, new C9078b());
        hashMap.put(C25240d.class, new C9080d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.USER_TAG_KEY, new FieldMetaData("userTagKey", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.USER_TAG_VALUES, new FieldMetaData("userTagValues", (byte) 3, new ListMetaData(new FieldValueMetaData((byte) 11, false))));
        enumMap.put(_Fields.OPERATOR, new FieldMetaData(ServerParameters.OPERATOR, (byte) 3, new EnumMetaData(MVDirectAdOperator.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26273f = unmodifiableMap;
        FieldMetaData.m61947a(MVDirectAdUserTagExpression.class, unmodifiableMap);
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
        ((C25238b) f26272e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26272e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVDirectAdUserTagExpression mVDirectAdUserTagExpression = (MVDirectAdUserTagExpression) obj;
        if (!getClass().equals(mVDirectAdUserTagExpression.getClass())) {
            return getClass().getName().compareTo(mVDirectAdUserTagExpression.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28259g()).compareTo(Boolean.valueOf(mVDirectAdUserTagExpression.mo28259g()));
        if (compareTo2 != 0 || ((mo28259g() && (compareTo2 = this.userTagKey.compareTo(mVDirectAdUserTagExpression.userTagKey)) != 0) || (compareTo2 = Boolean.valueOf(mo28260h()).compareTo(Boolean.valueOf(mVDirectAdUserTagExpression.mo28260h()))) != 0 || ((mo28260h() && (compareTo2 = C25082a.m62844h(this.userTagValues, mVDirectAdUserTagExpression.userTagValues)) != 0) || (compareTo2 = Boolean.valueOf(mo28258f()).compareTo(Boolean.valueOf(mVDirectAdUserTagExpression.mo28258f()))) != 0))) {
            return compareTo2;
        }
        if (!mo28258f() || (compareTo = this.operator.compareTo(mVDirectAdUserTagExpression.operator)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVDirectAdUserTagExpression)) {
            return false;
        }
        MVDirectAdUserTagExpression mVDirectAdUserTagExpression = (MVDirectAdUserTagExpression) obj;
        boolean g = mo28259g();
        boolean g2 = mVDirectAdUserTagExpression.mo28259g();
        if ((g || g2) && (!g || !g2 || !this.userTagKey.equals(mVDirectAdUserTagExpression.userTagKey))) {
            return false;
        }
        boolean h = mo28260h();
        boolean h2 = mVDirectAdUserTagExpression.mo28260h();
        if ((h || h2) && (!h || !h2 || !this.userTagValues.equals(mVDirectAdUserTagExpression.userTagValues))) {
            return false;
        }
        boolean f = mo28258f();
        boolean f2 = mVDirectAdUserTagExpression.mo28258f();
        if ((f || f2) && (!f || !f2 || !this.operator.equals(mVDirectAdUserTagExpression.operator))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28258f() {
        return this.operator != null;
    }

    /* renamed from: g */
    public final boolean mo28259g() {
        return this.userTagKey != null;
    }

    /* renamed from: h */
    public final boolean mo28260h() {
        return this.userTagValues != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVDirectAdUserTagExpression(", "userTagKey:");
        String str = this.userTagKey;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("userTagValues:");
        List<String> list = this.userTagValues;
        if (list == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(list);
        }
        n.append(", ");
        n.append("operator:");
        MVDirectAdOperator mVDirectAdOperator = this.operator;
        if (mVDirectAdOperator == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVDirectAdOperator);
        }
        n.append(")");
        return n.toString();
    }
}
