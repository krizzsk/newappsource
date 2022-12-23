package com.tranzmate.moovit.protocol.payments;

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

public class MVInputFieldValue implements TBase<MVInputFieldValue, _Fields>, Serializable, Cloneable, Comparable<MVInputFieldValue> {

    /* renamed from: b */
    public static final C25113c f27329b = new C25113c("id", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27330c = new C25113c("value", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f27331d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27332e;

    /* renamed from: id */
    public String f27333id;
    public String value;

    public enum _Fields implements C25085c {
        ID(1, "id"),
        VALUE(2, "value");
        
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
                return ID;
            }
            if (i != 2) {
                return null;
            }
            return VALUE;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVInputFieldValue$a */
    public static class C9801a extends C25239c<MVInputFieldValue> {
        public C9801a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVInputFieldValue mVInputFieldValue = (MVInputFieldValue) tBase;
            mVInputFieldValue.getClass();
            C25113c cVar = MVInputFieldValue.f27329b;
            gVar.mo61687K();
            if (mVInputFieldValue.f27333id != null) {
                gVar.mo61711x(MVInputFieldValue.f27329b);
                gVar.mo61686J(mVInputFieldValue.f27333id);
                gVar.mo61712y();
            }
            if (mVInputFieldValue.value != null) {
                gVar.mo61711x(MVInputFieldValue.f27330c);
                gVar.mo61686J(mVInputFieldValue.value);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVInputFieldValue mVInputFieldValue = (MVInputFieldValue) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVInputFieldValue.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVInputFieldValue.value = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVInputFieldValue.f27333id = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVInputFieldValue$b */
    public static class C9802b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9801a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVInputFieldValue$c */
    public static class C9803c extends C25240d<MVInputFieldValue> {
        public C9803c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVInputFieldValue mVInputFieldValue = (MVInputFieldValue) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVInputFieldValue.mo29978f()) {
                bitSet.set(0);
            }
            if (mVInputFieldValue.mo29979g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVInputFieldValue.mo29978f()) {
                jVar.mo61686J(mVInputFieldValue.f27333id);
            }
            if (mVInputFieldValue.mo29979g()) {
                jVar.mo61686J(mVInputFieldValue.value);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVInputFieldValue mVInputFieldValue = (MVInputFieldValue) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVInputFieldValue.f27333id = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVInputFieldValue.value = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVInputFieldValue$d */
    public static class C9804d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9803c(0);
        }
    }

    static {
        new C17394d0("MVInputFieldValue");
        HashMap hashMap = new HashMap();
        f27331d = hashMap;
        hashMap.put(C25239c.class, new C9802b());
        hashMap.put(C25240d.class, new C9804d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.ID, new FieldMetaData("id", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VALUE, new FieldMetaData("value", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27332e = unmodifiableMap;
        FieldMetaData.m61947a(MVInputFieldValue.class, unmodifiableMap);
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
        ((C25238b) f27331d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27331d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVInputFieldValue mVInputFieldValue = (MVInputFieldValue) obj;
        if (!getClass().equals(mVInputFieldValue.getClass())) {
            return getClass().getName().compareTo(mVInputFieldValue.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo29978f()).compareTo(Boolean.valueOf(mVInputFieldValue.mo29978f()));
        if (compareTo2 != 0 || ((mo29978f() && (compareTo2 = this.f27333id.compareTo(mVInputFieldValue.f27333id)) != 0) || (compareTo2 = Boolean.valueOf(mo29979g()).compareTo(Boolean.valueOf(mVInputFieldValue.mo29979g()))) != 0)) {
            return compareTo2;
        }
        if (!mo29979g() || (compareTo = this.value.compareTo(mVInputFieldValue.value)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVInputFieldValue)) {
            return false;
        }
        MVInputFieldValue mVInputFieldValue = (MVInputFieldValue) obj;
        boolean f = mo29978f();
        boolean f2 = mVInputFieldValue.mo29978f();
        if ((f || f2) && (!f || !f2 || !this.f27333id.equals(mVInputFieldValue.f27333id))) {
            return false;
        }
        boolean g = mo29979g();
        boolean g2 = mVInputFieldValue.mo29979g();
        if ((g || g2) && (!g || !g2 || !this.value.equals(mVInputFieldValue.value))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo29978f() {
        return this.f27333id != null;
    }

    /* renamed from: g */
    public final boolean mo29979g() {
        return this.value != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVInputFieldValue(", "id:");
        String str = this.f27333id;
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
        n.append(")");
        return n.toString();
    }
}
