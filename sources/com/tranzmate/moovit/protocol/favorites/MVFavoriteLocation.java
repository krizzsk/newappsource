package com.tranzmate.moovit.protocol.favorites;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLocationDescriptor;
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

public class MVFavoriteLocation implements TBase<MVFavoriteLocation, _Fields>, Serializable, Cloneable, Comparable<MVFavoriteLocation> {

    /* renamed from: b */
    public static final C25113c f25653b = new C25113c("type", (byte) 8, 1);

    /* renamed from: c */
    public static final C25113c f25654c = new C25113c("name", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f25655d = new C25113c("address", (byte) 12, 3);

    /* renamed from: e */
    public static final HashMap f25656e;

    /* renamed from: f */
    public static final Map<_Fields, FieldMetaData> f25657f;
    public MVLocationDescriptor address;
    public String name;
    public MVFavoriteLocationType type;

    public enum _Fields implements C25085c {
        TYPE(1, "type"),
        NAME(2, "name"),
        ADDRESS(3, "address");
        
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
            if (i == 2) {
                return NAME;
            }
            if (i != 3) {
                return null;
            }
            return ADDRESS;
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

    /* renamed from: com.tranzmate.moovit.protocol.favorites.MVFavoriteLocation$a */
    public static class C8751a extends C25239c<MVFavoriteLocation> {
        public C8751a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVFavoriteLocation mVFavoriteLocation = (MVFavoriteLocation) tBase;
            MVLocationDescriptor mVLocationDescriptor = mVFavoriteLocation.address;
            if (mVLocationDescriptor != null) {
                mVLocationDescriptor.mo26333s();
            }
            C25113c cVar = MVFavoriteLocation.f25653b;
            gVar.mo61687K();
            if (mVFavoriteLocation.type != null) {
                gVar.mo61711x(MVFavoriteLocation.f25653b);
                gVar.mo61678B(mVFavoriteLocation.type.getValue());
                gVar.mo61712y();
            }
            if (mVFavoriteLocation.name != null) {
                gVar.mo61711x(MVFavoriteLocation.f25654c);
                gVar.mo61686J(mVFavoriteLocation.name);
                gVar.mo61712y();
            }
            if (mVFavoriteLocation.address != null) {
                gVar.mo61711x(MVFavoriteLocation.f25655d);
                mVFavoriteLocation.address.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVFavoriteLocation mVFavoriteLocation = (MVFavoriteLocation) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            C25122h.m63098a(gVar, b);
                        } else if (b == 12) {
                            MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                            mVFavoriteLocation.address = mVLocationDescriptor;
                            mVLocationDescriptor.mo25201C1(gVar);
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVFavoriteLocation.name = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 8) {
                    mVFavoriteLocation.type = MVFavoriteLocationType.findByValue(gVar.mo61696i());
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVLocationDescriptor mVLocationDescriptor2 = mVFavoriteLocation.address;
            if (mVLocationDescriptor2 != null) {
                mVLocationDescriptor2.mo26333s();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.favorites.MVFavoriteLocation$b */
    public static class C8752b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8751a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.favorites.MVFavoriteLocation$c */
    public static class C8753c extends C25240d<MVFavoriteLocation> {
        public C8753c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVFavoriteLocation mVFavoriteLocation = (MVFavoriteLocation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVFavoriteLocation.mo27268h()) {
                bitSet.set(0);
            }
            if (mVFavoriteLocation.mo27267g()) {
                bitSet.set(1);
            }
            if (mVFavoriteLocation.mo27266f()) {
                bitSet.set(2);
            }
            jVar.mo61738U(bitSet, 3);
            if (mVFavoriteLocation.mo27268h()) {
                jVar.mo61678B(mVFavoriteLocation.type.getValue());
            }
            if (mVFavoriteLocation.mo27267g()) {
                jVar.mo61686J(mVFavoriteLocation.name);
            }
            if (mVFavoriteLocation.mo27266f()) {
                mVFavoriteLocation.address.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVFavoriteLocation mVFavoriteLocation = (MVFavoriteLocation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(3);
            if (T.get(0)) {
                mVFavoriteLocation.type = MVFavoriteLocationType.findByValue(jVar.mo61696i());
            }
            if (T.get(1)) {
                mVFavoriteLocation.name = jVar.mo61704q();
            }
            if (T.get(2)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVFavoriteLocation.address = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.favorites.MVFavoriteLocation$d */
    public static class C8754d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8753c(0);
        }
    }

    static {
        new C17394d0("MVFavoriteLocation");
        HashMap hashMap = new HashMap();
        f25656e = hashMap;
        hashMap.put(C25239c.class, new C8752b());
        hashMap.put(C25240d.class, new C8754d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.TYPE, new FieldMetaData("type", (byte) 3, new EnumMetaData(MVFavoriteLocationType.class)));
        enumMap.put(_Fields.NAME, new FieldMetaData("name", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.ADDRESS, new FieldMetaData("address", (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f25657f = unmodifiableMap;
        FieldMetaData.m61947a(MVFavoriteLocation.class, unmodifiableMap);
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
        ((C25238b) f25656e.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f25656e.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVFavoriteLocation mVFavoriteLocation = (MVFavoriteLocation) obj;
        if (!getClass().equals(mVFavoriteLocation.getClass())) {
            return getClass().getName().compareTo(mVFavoriteLocation.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo27268h()).compareTo(Boolean.valueOf(mVFavoriteLocation.mo27268h()));
        if (compareTo2 != 0 || ((mo27268h() && (compareTo2 = this.type.compareTo(mVFavoriteLocation.type)) != 0) || (compareTo2 = Boolean.valueOf(mo27267g()).compareTo(Boolean.valueOf(mVFavoriteLocation.mo27267g()))) != 0 || ((mo27267g() && (compareTo2 = this.name.compareTo(mVFavoriteLocation.name)) != 0) || (compareTo2 = Boolean.valueOf(mo27266f()).compareTo(Boolean.valueOf(mVFavoriteLocation.mo27266f()))) != 0))) {
            return compareTo2;
        }
        if (!mo27266f() || (compareTo = this.address.compareTo(mVFavoriteLocation.address)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVFavoriteLocation)) {
            return false;
        }
        MVFavoriteLocation mVFavoriteLocation = (MVFavoriteLocation) obj;
        boolean h = mo27268h();
        boolean h2 = mVFavoriteLocation.mo27268h();
        if ((h || h2) && (!h || !h2 || !this.type.equals(mVFavoriteLocation.type))) {
            return false;
        }
        boolean g = mo27267g();
        boolean g2 = mVFavoriteLocation.mo27267g();
        if ((g || g2) && (!g || !g2 || !this.name.equals(mVFavoriteLocation.name))) {
            return false;
        }
        boolean f = mo27266f();
        boolean f2 = mVFavoriteLocation.mo27266f();
        if ((f || f2) && (!f || !f2 || !this.address.mo26317a(mVFavoriteLocation.address))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo27266f() {
        return this.address != null;
    }

    /* renamed from: g */
    public final boolean mo27267g() {
        return this.name != null;
    }

    /* renamed from: h */
    public final boolean mo27268h() {
        return this.type != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVFavoriteLocation(", "type:");
        MVFavoriteLocationType mVFavoriteLocationType = this.type;
        if (mVFavoriteLocationType == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVFavoriteLocationType);
        }
        n.append(", ");
        n.append("name:");
        String str = this.name;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("address:");
        MVLocationDescriptor mVLocationDescriptor = this.address;
        if (mVLocationDescriptor == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVLocationDescriptor);
        }
        n.append(")");
        return n.toString();
    }
}
