package com.tranzmate.moovit.protocol.tripplanner;

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

public class MVTaxiLegCustomDeepLinkParameter implements TBase<MVTaxiLegCustomDeepLinkParameter, _Fields>, Serializable, Cloneable, Comparable<MVTaxiLegCustomDeepLinkParameter> {

    /* renamed from: b */
    public static final C25113c f30068b = new C25113c(LinksConfiguration.KEY_KEY, (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30069c = new C25113c("value", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f30070d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30071e;
    public String key;
    public String value;

    public enum _Fields implements C25085c {
        KEY(1, LinksConfiguration.KEY_KEY),
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
                return KEY;
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

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTaxiLegCustomDeepLinkParameter$a */
    public static class C11631a extends C25239c<MVTaxiLegCustomDeepLinkParameter> {
        public C11631a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiLegCustomDeepLinkParameter mVTaxiLegCustomDeepLinkParameter = (MVTaxiLegCustomDeepLinkParameter) tBase;
            mVTaxiLegCustomDeepLinkParameter.getClass();
            C25113c cVar = MVTaxiLegCustomDeepLinkParameter.f30068b;
            gVar.mo61687K();
            if (mVTaxiLegCustomDeepLinkParameter.key != null) {
                gVar.mo61711x(MVTaxiLegCustomDeepLinkParameter.f30068b);
                gVar.mo61686J(mVTaxiLegCustomDeepLinkParameter.key);
                gVar.mo61712y();
            }
            if (mVTaxiLegCustomDeepLinkParameter.value != null) {
                gVar.mo61711x(MVTaxiLegCustomDeepLinkParameter.f30069c);
                gVar.mo61686J(mVTaxiLegCustomDeepLinkParameter.value);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiLegCustomDeepLinkParameter mVTaxiLegCustomDeepLinkParameter = (MVTaxiLegCustomDeepLinkParameter) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTaxiLegCustomDeepLinkParameter.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVTaxiLegCustomDeepLinkParameter.value = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVTaxiLegCustomDeepLinkParameter.key = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTaxiLegCustomDeepLinkParameter$b */
    public static class C11632b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11631a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTaxiLegCustomDeepLinkParameter$c */
    public static class C11633c extends C25240d<MVTaxiLegCustomDeepLinkParameter> {
        public C11633c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTaxiLegCustomDeepLinkParameter mVTaxiLegCustomDeepLinkParameter = (MVTaxiLegCustomDeepLinkParameter) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTaxiLegCustomDeepLinkParameter.mo34568f()) {
                bitSet.set(0);
            }
            if (mVTaxiLegCustomDeepLinkParameter.mo34569g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTaxiLegCustomDeepLinkParameter.mo34568f()) {
                jVar.mo61686J(mVTaxiLegCustomDeepLinkParameter.key);
            }
            if (mVTaxiLegCustomDeepLinkParameter.mo34569g()) {
                jVar.mo61686J(mVTaxiLegCustomDeepLinkParameter.value);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTaxiLegCustomDeepLinkParameter mVTaxiLegCustomDeepLinkParameter = (MVTaxiLegCustomDeepLinkParameter) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTaxiLegCustomDeepLinkParameter.key = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVTaxiLegCustomDeepLinkParameter.value = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.tripplanner.MVTaxiLegCustomDeepLinkParameter$d */
    public static class C11634d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11633c(0);
        }
    }

    static {
        new C17394d0("MVTaxiLegCustomDeepLinkParameter");
        HashMap hashMap = new HashMap();
        f30070d = hashMap;
        hashMap.put(C25239c.class, new C11632b());
        hashMap.put(C25240d.class, new C11634d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.KEY, new FieldMetaData(LinksConfiguration.KEY_KEY, (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VALUE, new FieldMetaData("value", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30071e = unmodifiableMap;
        FieldMetaData.m61947a(MVTaxiLegCustomDeepLinkParameter.class, unmodifiableMap);
    }

    public MVTaxiLegCustomDeepLinkParameter() {
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
        ((C25238b) f30070d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30070d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTaxiLegCustomDeepLinkParameter mVTaxiLegCustomDeepLinkParameter = (MVTaxiLegCustomDeepLinkParameter) obj;
        if (!getClass().equals(mVTaxiLegCustomDeepLinkParameter.getClass())) {
            return getClass().getName().compareTo(mVTaxiLegCustomDeepLinkParameter.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo34568f()).compareTo(Boolean.valueOf(mVTaxiLegCustomDeepLinkParameter.mo34568f()));
        if (compareTo2 != 0 || ((mo34568f() && (compareTo2 = this.key.compareTo(mVTaxiLegCustomDeepLinkParameter.key)) != 0) || (compareTo2 = Boolean.valueOf(mo34569g()).compareTo(Boolean.valueOf(mVTaxiLegCustomDeepLinkParameter.mo34569g()))) != 0)) {
            return compareTo2;
        }
        if (!mo34569g() || (compareTo = this.value.compareTo(mVTaxiLegCustomDeepLinkParameter.value)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTaxiLegCustomDeepLinkParameter)) {
            return false;
        }
        MVTaxiLegCustomDeepLinkParameter mVTaxiLegCustomDeepLinkParameter = (MVTaxiLegCustomDeepLinkParameter) obj;
        boolean f = mo34568f();
        boolean f2 = mVTaxiLegCustomDeepLinkParameter.mo34568f();
        if ((f || f2) && (!f || !f2 || !this.key.equals(mVTaxiLegCustomDeepLinkParameter.key))) {
            return false;
        }
        boolean g = mo34569g();
        boolean g2 = mVTaxiLegCustomDeepLinkParameter.mo34569g();
        if ((g || g2) && (!g || !g2 || !this.value.equals(mVTaxiLegCustomDeepLinkParameter.value))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo34568f() {
        return this.key != null;
    }

    /* renamed from: g */
    public final boolean mo34569g() {
        return this.value != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTaxiLegCustomDeepLinkParameter(", "key:");
        String str = this.key;
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

    public MVTaxiLegCustomDeepLinkParameter(String str, String str2) {
        this();
        this.key = str;
        this.value = str2;
    }
}
