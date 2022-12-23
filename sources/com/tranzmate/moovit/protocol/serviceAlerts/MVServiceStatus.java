package com.tranzmate.moovit.protocol.serviceAlerts;

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

public class MVServiceStatus implements TBase<MVServiceStatus, _Fields>, Serializable, Cloneable, Comparable<MVServiceStatus> {

    /* renamed from: b */
    public static final C25113c f28293b = new C25113c("category", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f28294c = new C25113c("desc", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f28295d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f28296e;
    public MVServiceStatusCategory category;
    public String desc;

    public enum _Fields implements C25085c {
        CATEGORY(1, "category"),
        DESC(2, "desc");
        
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
                return CATEGORY;
            }
            if (i != 2) {
                return null;
            }
            return DESC;
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

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceStatus$a */
    public static class C10507a extends C25239c<MVServiceStatus> {
        public C10507a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVServiceStatus mVServiceStatus = (MVServiceStatus) tBase;
            mVServiceStatus.getClass();
            C25113c cVar = MVServiceStatus.f28293b;
            gVar.mo61687K();
            if (mVServiceStatus.category != null) {
                gVar.mo61711x(MVServiceStatus.f28293b);
                gVar.mo61678B(mVServiceStatus.category.getValue());
                gVar.mo61712y();
            }
            if (mVServiceStatus.desc != null) {
                gVar.mo61711x(MVServiceStatus.f28294c);
                gVar.mo61686J(mVServiceStatus.desc);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVServiceStatus mVServiceStatus = (MVServiceStatus) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVServiceStatus.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVServiceStatus.desc = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVServiceStatus.category = MVServiceStatusCategory.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceStatus$b */
    public static class C10508b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10507a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceStatus$c */
    public static class C10509c extends C25240d<MVServiceStatus> {
        public C10509c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVServiceStatus mVServiceStatus = (MVServiceStatus) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVServiceStatus.mo31681f()) {
                bitSet.set(0);
            }
            if (mVServiceStatus.mo31682g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVServiceStatus.mo31681f()) {
                jVar.mo61678B(mVServiceStatus.category.getValue());
            }
            if (mVServiceStatus.mo31682g()) {
                jVar.mo61686J(mVServiceStatus.desc);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVServiceStatus mVServiceStatus = (MVServiceStatus) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVServiceStatus.category = MVServiceStatusCategory.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVServiceStatus.desc = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.serviceAlerts.MVServiceStatus$d */
    public static class C10510d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10509c(0);
        }
    }

    static {
        new C17394d0("MVServiceStatus");
        HashMap hashMap = new HashMap();
        f28295d = hashMap;
        hashMap.put(C25239c.class, new C10508b());
        hashMap.put(C25240d.class, new C10510d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CATEGORY, new FieldMetaData("category", (byte) 3, new EnumMetaData(MVServiceStatusCategory.class)));
        enumMap.put(_Fields.DESC, new FieldMetaData("desc", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f28296e = unmodifiableMap;
        FieldMetaData.m61947a(MVServiceStatus.class, unmodifiableMap);
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
        ((C25238b) f28295d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f28295d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo31678a(MVServiceStatus mVServiceStatus) {
        if (mVServiceStatus == null) {
            return false;
        }
        boolean f = mo31681f();
        boolean f2 = mVServiceStatus.mo31681f();
        if ((f || f2) && (!f || !f2 || !this.category.equals(mVServiceStatus.category))) {
            return false;
        }
        boolean g = mo31682g();
        boolean g2 = mVServiceStatus.mo31682g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || !this.desc.equals(mVServiceStatus.desc)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVServiceStatus mVServiceStatus = (MVServiceStatus) obj;
        if (!getClass().equals(mVServiceStatus.getClass())) {
            return getClass().getName().compareTo(mVServiceStatus.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31681f()).compareTo(Boolean.valueOf(mVServiceStatus.mo31681f()));
        if (compareTo2 != 0 || ((mo31681f() && (compareTo2 = this.category.compareTo(mVServiceStatus.category)) != 0) || (compareTo2 = Boolean.valueOf(mo31682g()).compareTo(Boolean.valueOf(mVServiceStatus.mo31682g()))) != 0)) {
            return compareTo2;
        }
        if (!mo31682g() || (compareTo = this.desc.compareTo(mVServiceStatus.desc)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVServiceStatus)) {
            return mo31678a((MVServiceStatus) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31681f() {
        return this.category != null;
    }

    /* renamed from: g */
    public final boolean mo31682g() {
        return this.desc != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVServiceStatus(", "category:");
        MVServiceStatusCategory mVServiceStatusCategory = this.category;
        if (mVServiceStatusCategory == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVServiceStatusCategory);
        }
        n.append(", ");
        n.append("desc:");
        String str = this.desc;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
