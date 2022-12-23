package com.tranzmate.moovit.protocol.linearrivals;

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

public class MVTripArrivalAttribute implements TBase<MVTripArrivalAttribute, _Fields>, Serializable, Cloneable, Comparable<MVTripArrivalAttribute> {

    /* renamed from: b */
    public static final C25113c f26181b = new C25113c("type", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f26182c = new C25113c("data", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f26183d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f26184e;
    public String data;
    public MVTripArrivalAttributeType type;

    public enum _Fields implements C25085c {
        TYPE(1, "type"),
        DATA(2, "data");
        
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
                return TYPE;
            }
            if (i != 2) {
                return null;
            }
            return DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVTripArrivalAttribute$a */
    public static class C9012a extends C25239c<MVTripArrivalAttribute> {
        public C9012a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripArrivalAttribute mVTripArrivalAttribute = (MVTripArrivalAttribute) tBase;
            mVTripArrivalAttribute.getClass();
            C25113c cVar = MVTripArrivalAttribute.f26181b;
            gVar.mo61687K();
            if (mVTripArrivalAttribute.type != null) {
                gVar.mo61711x(MVTripArrivalAttribute.f26181b);
                gVar.mo61678B(mVTripArrivalAttribute.type.getValue());
                gVar.mo61712y();
            }
            if (mVTripArrivalAttribute.data != null) {
                gVar.mo61711x(MVTripArrivalAttribute.f26182c);
                gVar.mo61686J(mVTripArrivalAttribute.data);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripArrivalAttribute mVTripArrivalAttribute = (MVTripArrivalAttribute) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVTripArrivalAttribute.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVTripArrivalAttribute.data = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVTripArrivalAttribute.type = MVTripArrivalAttributeType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVTripArrivalAttribute$b */
    public static class C9013b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9012a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVTripArrivalAttribute$c */
    public static class C9014c extends C25240d<MVTripArrivalAttribute> {
        public C9014c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVTripArrivalAttribute mVTripArrivalAttribute = (MVTripArrivalAttribute) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVTripArrivalAttribute.mo28111g()) {
                bitSet.set(0);
            }
            if (mVTripArrivalAttribute.mo28110f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVTripArrivalAttribute.mo28111g()) {
                jVar.mo61678B(mVTripArrivalAttribute.type.getValue());
            }
            if (mVTripArrivalAttribute.mo28110f()) {
                jVar.mo61686J(mVTripArrivalAttribute.data);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVTripArrivalAttribute mVTripArrivalAttribute = (MVTripArrivalAttribute) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVTripArrivalAttribute.type = MVTripArrivalAttributeType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVTripArrivalAttribute.data = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.linearrivals.MVTripArrivalAttribute$d */
    public static class C9015d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9014c(0);
        }
    }

    static {
        new C17394d0("MVTripArrivalAttribute");
        HashMap hashMap = new HashMap();
        f26183d = hashMap;
        hashMap.put(C25239c.class, new C9013b());
        hashMap.put(C25240d.class, new C9015d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVTripArrivalAttributeType.class)));
        enumMap.put(_Fields.DATA, new FieldMetaData("data", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26184e = unmodifiableMap;
        FieldMetaData.m61947a(MVTripArrivalAttribute.class, unmodifiableMap);
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
        ((C25238b) f26183d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26183d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVTripArrivalAttribute mVTripArrivalAttribute = (MVTripArrivalAttribute) obj;
        if (!getClass().equals(mVTripArrivalAttribute.getClass())) {
            return getClass().getName().compareTo(mVTripArrivalAttribute.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28111g()).compareTo(Boolean.valueOf(mVTripArrivalAttribute.mo28111g()));
        if (compareTo2 != 0 || ((mo28111g() && (compareTo2 = this.type.compareTo(mVTripArrivalAttribute.type)) != 0) || (compareTo2 = Boolean.valueOf(mo28110f()).compareTo(Boolean.valueOf(mVTripArrivalAttribute.mo28110f()))) != 0)) {
            return compareTo2;
        }
        if (!mo28110f() || (compareTo = this.data.compareTo(mVTripArrivalAttribute.data)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVTripArrivalAttribute)) {
            return false;
        }
        MVTripArrivalAttribute mVTripArrivalAttribute = (MVTripArrivalAttribute) obj;
        boolean g = mo28111g();
        boolean g2 = mVTripArrivalAttribute.mo28111g();
        if ((g || g2) && (!g || !g2 || !this.type.equals(mVTripArrivalAttribute.type))) {
            return false;
        }
        boolean f = mo28110f();
        boolean f2 = mVTripArrivalAttribute.mo28110f();
        if ((f || f2) && (!f || !f2 || !this.data.equals(mVTripArrivalAttribute.data))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28110f() {
        return this.data != null;
    }

    /* renamed from: g */
    public final boolean mo28111g() {
        return this.type != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVTripArrivalAttribute(", "type:");
        MVTripArrivalAttributeType mVTripArrivalAttributeType = this.type;
        if (mVTripArrivalAttributeType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVTripArrivalAttributeType);
        }
        n.append(", ");
        n.append("data:");
        String str = this.data;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
