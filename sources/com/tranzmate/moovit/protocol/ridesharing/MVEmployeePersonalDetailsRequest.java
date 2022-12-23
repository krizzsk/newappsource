package com.tranzmate.moovit.protocol.ridesharing;

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

public class MVEmployeePersonalDetailsRequest implements TBase<MVEmployeePersonalDetailsRequest, _Fields>, Serializable, Cloneable, Comparable<MVEmployeePersonalDetailsRequest> {

    /* renamed from: b */
    public static final C25113c f27984b = new C25113c("email", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27985c = new C25113c("employeeId", (byte) 11, 2);

    /* renamed from: d */
    public static final HashMap f27986d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27987e;
    public String email;
    public String employeeId;
    private _Fields[] optionals = {_Fields.EMAIL, _Fields.EMPLOYEE_ID};

    public enum _Fields implements C25085c {
        EMAIL(1, "email"),
        EMPLOYEE_ID(2, "employeeId");
        
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
                return EMAIL;
            }
            if (i != 2) {
                return null;
            }
            return EMPLOYEE_ID;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVEmployeePersonalDetailsRequest$a */
    public static class C10282a extends C25239c<MVEmployeePersonalDetailsRequest> {
        public C10282a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEmployeePersonalDetailsRequest mVEmployeePersonalDetailsRequest = (MVEmployeePersonalDetailsRequest) tBase;
            mVEmployeePersonalDetailsRequest.getClass();
            C25113c cVar = MVEmployeePersonalDetailsRequest.f27984b;
            gVar.mo61687K();
            if (mVEmployeePersonalDetailsRequest.email != null && mVEmployeePersonalDetailsRequest.mo31119f()) {
                gVar.mo61711x(MVEmployeePersonalDetailsRequest.f27984b);
                gVar.mo61686J(mVEmployeePersonalDetailsRequest.email);
                gVar.mo61712y();
            }
            if (mVEmployeePersonalDetailsRequest.employeeId != null && mVEmployeePersonalDetailsRequest.mo31120g()) {
                gVar.mo61711x(MVEmployeePersonalDetailsRequest.f27985c);
                gVar.mo61686J(mVEmployeePersonalDetailsRequest.employeeId);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEmployeePersonalDetailsRequest mVEmployeePersonalDetailsRequest = (MVEmployeePersonalDetailsRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVEmployeePersonalDetailsRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 11) {
                        mVEmployeePersonalDetailsRequest.employeeId = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVEmployeePersonalDetailsRequest.email = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVEmployeePersonalDetailsRequest$b */
    public static class C10283b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10282a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVEmployeePersonalDetailsRequest$c */
    public static class C10284c extends C25240d<MVEmployeePersonalDetailsRequest> {
        public C10284c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEmployeePersonalDetailsRequest mVEmployeePersonalDetailsRequest = (MVEmployeePersonalDetailsRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVEmployeePersonalDetailsRequest.mo31119f()) {
                bitSet.set(0);
            }
            if (mVEmployeePersonalDetailsRequest.mo31120g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVEmployeePersonalDetailsRequest.mo31119f()) {
                jVar.mo61686J(mVEmployeePersonalDetailsRequest.email);
            }
            if (mVEmployeePersonalDetailsRequest.mo31120g()) {
                jVar.mo61686J(mVEmployeePersonalDetailsRequest.employeeId);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEmployeePersonalDetailsRequest mVEmployeePersonalDetailsRequest = (MVEmployeePersonalDetailsRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVEmployeePersonalDetailsRequest.email = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVEmployeePersonalDetailsRequest.employeeId = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVEmployeePersonalDetailsRequest$d */
    public static class C10285d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10284c(0);
        }
    }

    static {
        new C17394d0("MVEmployeePersonalDetailsRequest");
        HashMap hashMap = new HashMap();
        f27986d = hashMap;
        hashMap.put(C25239c.class, new C10283b());
        hashMap.put(C25240d.class, new C10285d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.EMAIL, new FieldMetaData("email", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.EMPLOYEE_ID, new FieldMetaData("employeeId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27987e = unmodifiableMap;
        FieldMetaData.m61947a(MVEmployeePersonalDetailsRequest.class, unmodifiableMap);
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
        ((C25238b) f27986d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27986d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVEmployeePersonalDetailsRequest mVEmployeePersonalDetailsRequest = (MVEmployeePersonalDetailsRequest) obj;
        if (!getClass().equals(mVEmployeePersonalDetailsRequest.getClass())) {
            return getClass().getName().compareTo(mVEmployeePersonalDetailsRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo31119f()).compareTo(Boolean.valueOf(mVEmployeePersonalDetailsRequest.mo31119f()));
        if (compareTo2 != 0 || ((mo31119f() && (compareTo2 = this.email.compareTo(mVEmployeePersonalDetailsRequest.email)) != 0) || (compareTo2 = Boolean.valueOf(mo31120g()).compareTo(Boolean.valueOf(mVEmployeePersonalDetailsRequest.mo31120g()))) != 0)) {
            return compareTo2;
        }
        if (!mo31120g() || (compareTo = this.employeeId.compareTo(mVEmployeePersonalDetailsRequest.employeeId)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVEmployeePersonalDetailsRequest)) {
            return false;
        }
        MVEmployeePersonalDetailsRequest mVEmployeePersonalDetailsRequest = (MVEmployeePersonalDetailsRequest) obj;
        boolean f = mo31119f();
        boolean f2 = mVEmployeePersonalDetailsRequest.mo31119f();
        if ((f || f2) && (!f || !f2 || !this.email.equals(mVEmployeePersonalDetailsRequest.email))) {
            return false;
        }
        boolean g = mo31120g();
        boolean g2 = mVEmployeePersonalDetailsRequest.mo31120g();
        if ((g || g2) && (!g || !g2 || !this.employeeId.equals(mVEmployeePersonalDetailsRequest.employeeId))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo31119f() {
        return this.email != null;
    }

    /* renamed from: g */
    public final boolean mo31120g() {
        return this.employeeId != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVEmployeePersonalDetailsRequest(");
        if (mo31119f()) {
            sb.append("email:");
            String str = this.email;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo31120g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("employeeId:");
            String str2 = this.employeeId;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
