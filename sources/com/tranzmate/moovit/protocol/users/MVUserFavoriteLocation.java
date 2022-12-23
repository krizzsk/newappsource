package com.tranzmate.moovit.protocol.users;

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
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVUserFavoriteLocation implements TBase<MVUserFavoriteLocation, _Fields>, Serializable, Cloneable, Comparable<MVUserFavoriteLocation> {

    /* renamed from: b */
    public static final C25113c f30617b = new C25113c("userDefinedName", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f30618c = new C25113c("descriptor", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f30619d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f30620e;
    public MVLocationDescriptor descriptor;
    private _Fields[] optionals = {_Fields.USER_DEFINED_NAME};
    public String userDefinedName;

    public enum _Fields implements C25085c {
        USER_DEFINED_NAME(1, "userDefinedName"),
        DESCRIPTOR(2, "descriptor");
        
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
                return USER_DEFINED_NAME;
            }
            if (i != 2) {
                return null;
            }
            return DESCRIPTOR;
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

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserFavoriteLocation$a */
    public static class C11969a extends C25239c<MVUserFavoriteLocation> {
        public C11969a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserFavoriteLocation mVUserFavoriteLocation = (MVUserFavoriteLocation) tBase;
            MVLocationDescriptor mVLocationDescriptor = mVUserFavoriteLocation.descriptor;
            if (mVLocationDescriptor != null) {
                mVLocationDescriptor.mo26333s();
            }
            C25113c cVar = MVUserFavoriteLocation.f30617b;
            gVar.mo61687K();
            if (mVUserFavoriteLocation.userDefinedName != null && mVUserFavoriteLocation.mo35496g()) {
                gVar.mo61711x(MVUserFavoriteLocation.f30617b);
                gVar.mo61686J(mVUserFavoriteLocation.userDefinedName);
                gVar.mo61712y();
            }
            if (mVUserFavoriteLocation.descriptor != null) {
                gVar.mo61711x(MVUserFavoriteLocation.f30618c);
                mVUserFavoriteLocation.descriptor.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserFavoriteLocation mVUserFavoriteLocation = (MVUserFavoriteLocation) tBase;
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
                        C25122h.m63098a(gVar, b);
                    } else if (b == 12) {
                        MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                        mVUserFavoriteLocation.descriptor = mVLocationDescriptor;
                        mVLocationDescriptor.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVUserFavoriteLocation.userDefinedName = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVLocationDescriptor mVLocationDescriptor2 = mVUserFavoriteLocation.descriptor;
            if (mVLocationDescriptor2 != null) {
                mVLocationDescriptor2.mo26333s();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserFavoriteLocation$b */
    public static class C11970b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11969a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserFavoriteLocation$c */
    public static class C11971c extends C25240d<MVUserFavoriteLocation> {
        public C11971c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVUserFavoriteLocation mVUserFavoriteLocation = (MVUserFavoriteLocation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVUserFavoriteLocation.mo35496g()) {
                bitSet.set(0);
            }
            if (mVUserFavoriteLocation.mo35495f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVUserFavoriteLocation.mo35496g()) {
                jVar.mo61686J(mVUserFavoriteLocation.userDefinedName);
            }
            if (mVUserFavoriteLocation.mo35495f()) {
                mVUserFavoriteLocation.descriptor.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVUserFavoriteLocation mVUserFavoriteLocation = (MVUserFavoriteLocation) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVUserFavoriteLocation.userDefinedName = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVLocationDescriptor mVLocationDescriptor = new MVLocationDescriptor();
                mVUserFavoriteLocation.descriptor = mVLocationDescriptor;
                mVLocationDescriptor.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.users.MVUserFavoriteLocation$d */
    public static class C11972d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C11971c(0);
        }
    }

    static {
        new C17394d0("MVUserFavoriteLocation");
        HashMap hashMap = new HashMap();
        f30619d = hashMap;
        hashMap.put(C25239c.class, new C11970b());
        hashMap.put(C25240d.class, new C11972d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.USER_DEFINED_NAME, new FieldMetaData("userDefinedName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.DESCRIPTOR, new FieldMetaData("descriptor", (byte) 3, new StructMetaData(MVLocationDescriptor.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f30620e = unmodifiableMap;
        FieldMetaData.m61947a(MVUserFavoriteLocation.class, unmodifiableMap);
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
        ((C25238b) f30619d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f30619d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo35492a(MVUserFavoriteLocation mVUserFavoriteLocation) {
        if (mVUserFavoriteLocation == null) {
            return false;
        }
        boolean g = mo35496g();
        boolean g2 = mVUserFavoriteLocation.mo35496g();
        if ((g || g2) && (!g || !g2 || !this.userDefinedName.equals(mVUserFavoriteLocation.userDefinedName))) {
            return false;
        }
        boolean f = mo35495f();
        boolean f2 = mVUserFavoriteLocation.mo35495f();
        if (!f && !f2) {
            return true;
        }
        if (!f || !f2 || !this.descriptor.mo26317a(mVUserFavoriteLocation.descriptor)) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVUserFavoriteLocation mVUserFavoriteLocation = (MVUserFavoriteLocation) obj;
        if (!getClass().equals(mVUserFavoriteLocation.getClass())) {
            return getClass().getName().compareTo(mVUserFavoriteLocation.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo35496g()).compareTo(Boolean.valueOf(mVUserFavoriteLocation.mo35496g()));
        if (compareTo2 != 0 || ((mo35496g() && (compareTo2 = this.userDefinedName.compareTo(mVUserFavoriteLocation.userDefinedName)) != 0) || (compareTo2 = Boolean.valueOf(mo35495f()).compareTo(Boolean.valueOf(mVUserFavoriteLocation.mo35495f()))) != 0)) {
            return compareTo2;
        }
        if (!mo35495f() || (compareTo = this.descriptor.compareTo(mVUserFavoriteLocation.descriptor)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVUserFavoriteLocation)) {
            return mo35492a((MVUserFavoriteLocation) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo35495f() {
        return this.descriptor != null;
    }

    /* renamed from: g */
    public final boolean mo35496g() {
        return this.userDefinedName != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVUserFavoriteLocation(");
        if (mo35496g()) {
            sb.append("userDefinedName:");
            String str = this.userDefinedName;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("descriptor:");
        MVLocationDescriptor mVLocationDescriptor = this.descriptor;
        if (mVLocationDescriptor == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            sb.append(mVLocationDescriptor);
        }
        sb.append(")");
        return sb.toString();
    }
}
