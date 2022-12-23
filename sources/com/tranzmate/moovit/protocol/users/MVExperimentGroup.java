package com.tranzmate.moovit.protocol.users;

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

public class MVExperimentGroup implements TBase<MVExperimentGroup, _Fields>, Serializable, Cloneable, Comparable<MVExperimentGroup> {

    /* renamed from: b */
    public static final C25113c f30398b = new C25113c("name", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30399c = new C25113c("value", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f30400d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30401e;
    public String name;
    public String value;

    public enum _Fields implements C25085c {
        NAME(1, "name"),
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
                return NAME;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVExperimentGroup$a */
    public static class C11800a extends C25239c<MVExperimentGroup> {
        public C11800a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVExperimentGroup mVExperimentGroup = (MVExperimentGroup) tBase;
            mVExperimentGroup.getClass();
            C25113c cVar = MVExperimentGroup.f30398b;
            gVar.mo61687K();
            if (mVExperimentGroup.name != null) {
                gVar.mo61711x(MVExperimentGroup.f30398b);
                gVar.mo61686J(mVExperimentGroup.name);
                gVar.mo61712y();
            }
            if (mVExperimentGroup.value != null) {
                gVar.mo61711x(MVExperimentGroup.f30399c);
                gVar.mo61686J(mVExperimentGroup.value);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVExperimentGroup mVExperimentGroup = (MVExperimentGroup) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVExperimentGroup.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVExperimentGroup.value = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVExperimentGroup.name = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVExperimentGroup$b */
    public static class C11801b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11800a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVExperimentGroup$c */
    public static class C11802c extends C25240d<MVExperimentGroup> {
        public C11802c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVExperimentGroup mVExperimentGroup = (MVExperimentGroup) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVExperimentGroup.mo35109f()) {
                bitSet.set(0);
            }
            if (mVExperimentGroup.mo35110g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVExperimentGroup.mo35109f()) {
                jVar.mo61686J(mVExperimentGroup.name);
            }
            if (mVExperimentGroup.mo35110g()) {
                jVar.mo61686J(mVExperimentGroup.value);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVExperimentGroup mVExperimentGroup = (MVExperimentGroup) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVExperimentGroup.name = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVExperimentGroup.value = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVExperimentGroup$d */
    public static class C11803d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11802c(0);
        }
    }

    static {
        new C17394d0("MVExperimentGroup");
        HashMap hashMap = new HashMap();
        f30400d = hashMap;
        hashMap.put(C25239c.class, new C11801b());
        hashMap.put(C25240d.class, new C11803d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VALUE, new FieldMetaData("value", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30401e = unmodifiableMap;
        FieldMetaData.m61947a(MVExperimentGroup.class, unmodifiableMap);
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
        ((C25238b) f30400d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30400d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVExperimentGroup mVExperimentGroup = (MVExperimentGroup) obj;
        if (!getClass().equals(mVExperimentGroup.getClass())) {
            return getClass().getName().compareTo(mVExperimentGroup.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35109f()).compareTo(Boolean.valueOf(mVExperimentGroup.mo35109f()));
        if (compareTo2 != 0 || ((mo35109f() && (compareTo2 = this.name.compareTo(mVExperimentGroup.name)) != 0) || (compareTo2 = Boolean.valueOf(mo35110g()).compareTo(Boolean.valueOf(mVExperimentGroup.mo35110g()))) != 0)) {
            return compareTo2;
        }
        if (!mo35110g() || (compareTo = this.value.compareTo(mVExperimentGroup.value)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVExperimentGroup)) {
            return false;
        }
        MVExperimentGroup mVExperimentGroup = (MVExperimentGroup) obj;
        boolean f = mo35109f();
        boolean f2 = mVExperimentGroup.mo35109f();
        if ((f || f2) && (!f || !f2 || !this.name.equals(mVExperimentGroup.name))) {
            return false;
        }
        boolean g = mo35110g();
        boolean g2 = mVExperimentGroup.mo35110g();
        if ((g || g2) && (!g || !g2 || !this.value.equals(mVExperimentGroup.value))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo35109f() {
        return this.name != null;
    }

    /* renamed from: g */
    public final boolean mo35110g() {
        return this.value != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVExperimentGroup(", "name:");
        String str = this.name;
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
