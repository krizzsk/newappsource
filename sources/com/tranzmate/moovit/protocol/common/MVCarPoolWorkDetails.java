package com.tranzmate.moovit.protocol.common;

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

public class MVCarPoolWorkDetails implements TBase<MVCarPoolWorkDetails, _Fields>, Serializable, Cloneable, Comparable<MVCarPoolWorkDetails> {

    /* renamed from: b */
    public static final C25113c f24979b = new C25113c("workName", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f24980c = new C25113c("workEmail", (byte) 11, 2);

    /* renamed from: d */
    public static final C25113c f24981d = new C25113c("employeeId", (byte) 11, 3);

    /* renamed from: e */
    public static final C25113c f24982e = new C25113c("isApprovedByCompany", (byte) 2, 4);

    /* renamed from: f */
    public static final HashMap f24983f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f24984g;
    private byte __isset_bitfield = 0;
    public String employeeId;
    public boolean isApprovedByCompany;
    private _Fields[] optionals = {_Fields.WORK_NAME, _Fields.WORK_EMAIL, _Fields.EMPLOYEE_ID, _Fields.IS_APPROVED_BY_COMPANY};
    public String workEmail;
    public String workName;

    public enum _Fields implements C25085c {
        WORK_NAME(1, "workName"),
        WORK_EMAIL(2, "workEmail"),
        EMPLOYEE_ID(3, "employeeId"),
        IS_APPROVED_BY_COMPANY(4, "isApprovedByCompany");
        
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
                return WORK_NAME;
            }
            if (i == 2) {
                return WORK_EMAIL;
            }
            if (i == 3) {
                return EMPLOYEE_ID;
            }
            if (i != 4) {
                return null;
            }
            return IS_APPROVED_BY_COMPANY;
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

    /* renamed from: com.tranzmate.moovit.protocol.common.MVCarPoolWorkDetails$a */
    public static class C8372a extends C25239c<MVCarPoolWorkDetails> {
        public C8372a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolWorkDetails mVCarPoolWorkDetails = (MVCarPoolWorkDetails) tBase;
            mVCarPoolWorkDetails.getClass();
            C25113c cVar = MVCarPoolWorkDetails.f24979b;
            gVar.mo61687K();
            if (mVCarPoolWorkDetails.workName != null && mVCarPoolWorkDetails.mo26097i()) {
                gVar.mo61711x(MVCarPoolWorkDetails.f24979b);
                gVar.mo61686J(mVCarPoolWorkDetails.workName);
                gVar.mo61712y();
            }
            if (mVCarPoolWorkDetails.workEmail != null && mVCarPoolWorkDetails.mo26095h()) {
                gVar.mo61711x(MVCarPoolWorkDetails.f24980c);
                gVar.mo61686J(mVCarPoolWorkDetails.workEmail);
                gVar.mo61712y();
            }
            if (mVCarPoolWorkDetails.employeeId != null && mVCarPoolWorkDetails.mo26093f()) {
                gVar.mo61711x(MVCarPoolWorkDetails.f24981d);
                gVar.mo61686J(mVCarPoolWorkDetails.employeeId);
                gVar.mo61712y();
            }
            if (mVCarPoolWorkDetails.mo26094g()) {
                gVar.mo61711x(MVCarPoolWorkDetails.f24982e);
                gVar.mo61708u(mVCarPoolWorkDetails.isApprovedByCompany);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolWorkDetails mVCarPoolWorkDetails = (MVCarPoolWorkDetails) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVCarPoolWorkDetails.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            if (s != 4) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 2) {
                                mVCarPoolWorkDetails.isApprovedByCompany = gVar.mo61690c();
                                mVCarPoolWorkDetails.mo26098j();
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVCarPoolWorkDetails.employeeId = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 11) {
                        mVCarPoolWorkDetails.workEmail = gVar.mo61704q();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVCarPoolWorkDetails.workName = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVCarPoolWorkDetails$b */
    public static class C8373b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8372a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVCarPoolWorkDetails$c */
    public static class C8374c extends C25240d<MVCarPoolWorkDetails> {
        public C8374c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolWorkDetails mVCarPoolWorkDetails = (MVCarPoolWorkDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVCarPoolWorkDetails.mo26097i()) {
                bitSet.set(0);
            }
            if (mVCarPoolWorkDetails.mo26095h()) {
                bitSet.set(1);
            }
            if (mVCarPoolWorkDetails.mo26093f()) {
                bitSet.set(2);
            }
            if (mVCarPoolWorkDetails.mo26094g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVCarPoolWorkDetails.mo26097i()) {
                jVar.mo61686J(mVCarPoolWorkDetails.workName);
            }
            if (mVCarPoolWorkDetails.mo26095h()) {
                jVar.mo61686J(mVCarPoolWorkDetails.workEmail);
            }
            if (mVCarPoolWorkDetails.mo26093f()) {
                jVar.mo61686J(mVCarPoolWorkDetails.employeeId);
            }
            if (mVCarPoolWorkDetails.mo26094g()) {
                jVar.mo61708u(mVCarPoolWorkDetails.isApprovedByCompany);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVCarPoolWorkDetails mVCarPoolWorkDetails = (MVCarPoolWorkDetails) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVCarPoolWorkDetails.workName = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVCarPoolWorkDetails.workEmail = jVar.mo61704q();
            }
            if (T.get(2)) {
                mVCarPoolWorkDetails.employeeId = jVar.mo61704q();
            }
            if (T.get(3)) {
                mVCarPoolWorkDetails.isApprovedByCompany = jVar.mo61690c();
                mVCarPoolWorkDetails.mo26098j();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.common.MVCarPoolWorkDetails$d */
    public static class C8375d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C8374c(0);
        }
    }

    static {
        new C17394d0("MVCarPoolWorkDetails");
        HashMap hashMap = new HashMap();
        f24983f = hashMap;
        hashMap.put(C25239c.class, new C8373b());
        hashMap.put(C25240d.class, new C8375d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.WORK_NAME, new FieldMetaData("workName", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.WORK_EMAIL, new FieldMetaData("workEmail", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.EMPLOYEE_ID, new FieldMetaData("employeeId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.IS_APPROVED_BY_COMPANY, new FieldMetaData("isApprovedByCompany", (byte) 2, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f24984g = unmodifiableMap;
        FieldMetaData.m61947a(MVCarPoolWorkDetails.class, unmodifiableMap);
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
        ((C25238b) f24983f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f24983f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    /* renamed from: a */
    public final boolean mo26090a(MVCarPoolWorkDetails mVCarPoolWorkDetails) {
        if (mVCarPoolWorkDetails == null) {
            return false;
        }
        boolean i = mo26097i();
        boolean i2 = mVCarPoolWorkDetails.mo26097i();
        if ((i || i2) && (!i || !i2 || !this.workName.equals(mVCarPoolWorkDetails.workName))) {
            return false;
        }
        boolean h = mo26095h();
        boolean h2 = mVCarPoolWorkDetails.mo26095h();
        if ((h || h2) && (!h || !h2 || !this.workEmail.equals(mVCarPoolWorkDetails.workEmail))) {
            return false;
        }
        boolean f = mo26093f();
        boolean f2 = mVCarPoolWorkDetails.mo26093f();
        if ((f || f2) && (!f || !f2 || !this.employeeId.equals(mVCarPoolWorkDetails.employeeId))) {
            return false;
        }
        boolean g = mo26094g();
        boolean g2 = mVCarPoolWorkDetails.mo26094g();
        if (!g && !g2) {
            return true;
        }
        if (!g || !g2 || this.isApprovedByCompany != mVCarPoolWorkDetails.isApprovedByCompany) {
            return false;
        }
        return true;
    }

    public final int compareTo(Object obj) {
        int l;
        MVCarPoolWorkDetails mVCarPoolWorkDetails = (MVCarPoolWorkDetails) obj;
        if (!getClass().equals(mVCarPoolWorkDetails.getClass())) {
            return getClass().getName().compareTo(mVCarPoolWorkDetails.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo26097i()).compareTo(Boolean.valueOf(mVCarPoolWorkDetails.mo26097i()));
        if (compareTo != 0 || ((mo26097i() && (compareTo = this.workName.compareTo(mVCarPoolWorkDetails.workName)) != 0) || (compareTo = Boolean.valueOf(mo26095h()).compareTo(Boolean.valueOf(mVCarPoolWorkDetails.mo26095h()))) != 0 || ((mo26095h() && (compareTo = this.workEmail.compareTo(mVCarPoolWorkDetails.workEmail)) != 0) || (compareTo = Boolean.valueOf(mo26093f()).compareTo(Boolean.valueOf(mVCarPoolWorkDetails.mo26093f()))) != 0 || ((mo26093f() && (compareTo = this.employeeId.compareTo(mVCarPoolWorkDetails.employeeId)) != 0) || (compareTo = Boolean.valueOf(mo26094g()).compareTo(Boolean.valueOf(mVCarPoolWorkDetails.mo26094g()))) != 0)))) {
            return compareTo;
        }
        if (!mo26094g() || (l = C25082a.m62848l(this.isApprovedByCompany, mVCarPoolWorkDetails.isApprovedByCompany)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof MVCarPoolWorkDetails)) {
            return mo26090a((MVCarPoolWorkDetails) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo26093f() {
        return this.employeeId != null;
    }

    /* renamed from: g */
    public final boolean mo26094g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final boolean mo26095h() {
        return this.workEmail != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo26097i() {
        return this.workName != null;
    }

    /* renamed from: j */
    public final void mo26098j() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("MVCarPoolWorkDetails(");
        boolean z2 = false;
        if (mo26097i()) {
            sb.append("workName:");
            String str = this.workName;
            if (str == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (mo26095h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("workEmail:");
            String str2 = this.workEmail;
            if (str2 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (mo26093f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("employeeId:");
            String str3 = this.employeeId;
            if (str3 == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(str3);
            }
        } else {
            z2 = z;
        }
        if (mo26094g()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("isApprovedByCompany:");
            sb.append(this.isApprovedByCompany);
        }
        sb.append(")");
        return sb.toString();
    }
}
