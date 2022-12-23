package com.tranzmate.moovit.protocol.ridesharing;

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
import p001a0.C0017h;
import p358af.C13437d;
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

public class MVEmployeeRegistrationSteps implements TBase<MVEmployeeRegistrationSteps, _Fields>, Serializable, Cloneable, Comparable<MVEmployeeRegistrationSteps> {

    /* renamed from: b */
    public static final C25113c f27988b = new C25113c("phoneVerification", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f27989c = new C25113c("freeformInformation", (byte) 2, 2);

    /* renamed from: d */
    public static final HashMap f27990d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27991e;
    private byte __isset_bitfield = 0;
    public boolean freeformInformation;
    public boolean phoneVerification;

    public enum _Fields implements C25085c {
        PHONE_VERIFICATION(1, "phoneVerification"),
        FREEFORM_INFORMATION(2, "freeformInformation");
        
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
                return PHONE_VERIFICATION;
            }
            if (i != 2) {
                return null;
            }
            return FREEFORM_INFORMATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVEmployeeRegistrationSteps$a */
    public static class C10286a extends C25239c<MVEmployeeRegistrationSteps> {
        public C10286a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEmployeeRegistrationSteps mVEmployeeRegistrationSteps = (MVEmployeeRegistrationSteps) tBase;
            mVEmployeeRegistrationSteps.getClass();
            C25113c cVar = MVEmployeeRegistrationSteps.f27988b;
            gVar.mo61687K();
            gVar.mo61711x(MVEmployeeRegistrationSteps.f27988b);
            gVar.mo61708u(mVEmployeeRegistrationSteps.phoneVerification);
            gVar.mo61712y();
            gVar.mo61711x(MVEmployeeRegistrationSteps.f27989c);
            C0017h.m62S(gVar, mVEmployeeRegistrationSteps.freeformInformation);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEmployeeRegistrationSteps mVEmployeeRegistrationSteps = (MVEmployeeRegistrationSteps) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVEmployeeRegistrationSteps.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 2) {
                        mVEmployeeRegistrationSteps.freeformInformation = gVar.mo61690c();
                        mVEmployeeRegistrationSteps.mo31128h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVEmployeeRegistrationSteps.phoneVerification = gVar.mo61690c();
                    mVEmployeeRegistrationSteps.mo31130i();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVEmployeeRegistrationSteps$b */
    public static class C10287b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10286a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVEmployeeRegistrationSteps$c */
    public static class C10288c extends C25240d<MVEmployeeRegistrationSteps> {
        public C10288c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVEmployeeRegistrationSteps mVEmployeeRegistrationSteps = (MVEmployeeRegistrationSteps) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVEmployeeRegistrationSteps.mo31127g()) {
                bitSet.set(0);
            }
            if (mVEmployeeRegistrationSteps.mo31126f()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVEmployeeRegistrationSteps.mo31127g()) {
                jVar.mo61708u(mVEmployeeRegistrationSteps.phoneVerification);
            }
            if (mVEmployeeRegistrationSteps.mo31126f()) {
                jVar.mo61708u(mVEmployeeRegistrationSteps.freeformInformation);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVEmployeeRegistrationSteps mVEmployeeRegistrationSteps = (MVEmployeeRegistrationSteps) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVEmployeeRegistrationSteps.phoneVerification = jVar.mo61690c();
                mVEmployeeRegistrationSteps.mo31130i();
            }
            if (T.get(1)) {
                mVEmployeeRegistrationSteps.freeformInformation = jVar.mo61690c();
                mVEmployeeRegistrationSteps.mo31128h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.ridesharing.MVEmployeeRegistrationSteps$d */
    public static class C10289d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10288c(0);
        }
    }

    static {
        new C17394d0("MVEmployeeRegistrationSteps");
        HashMap hashMap = new HashMap();
        f27990d = hashMap;
        hashMap.put(C25239c.class, new C10287b());
        hashMap.put(C25240d.class, new C10289d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PHONE_VERIFICATION, new FieldMetaData("phoneVerification", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.FREEFORM_INFORMATION, new FieldMetaData("freeformInformation", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27991e = unmodifiableMap;
        FieldMetaData.m61947a(MVEmployeeRegistrationSteps.class, unmodifiableMap);
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
        ((C25238b) f27990d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27990d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int l;
        MVEmployeeRegistrationSteps mVEmployeeRegistrationSteps = (MVEmployeeRegistrationSteps) obj;
        if (!getClass().equals(mVEmployeeRegistrationSteps.getClass())) {
            return getClass().getName().compareTo(mVEmployeeRegistrationSteps.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo31127g()).compareTo(Boolean.valueOf(mVEmployeeRegistrationSteps.mo31127g()));
        if (compareTo != 0 || ((mo31127g() && (compareTo = C25082a.m62848l(this.phoneVerification, mVEmployeeRegistrationSteps.phoneVerification)) != 0) || (compareTo = Boolean.valueOf(mo31126f()).compareTo(Boolean.valueOf(mVEmployeeRegistrationSteps.mo31126f()))) != 0)) {
            return compareTo;
        }
        if (!mo31126f() || (l = C25082a.m62848l(this.freeformInformation, mVEmployeeRegistrationSteps.freeformInformation)) == 0) {
            return 0;
        }
        return l;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVEmployeeRegistrationSteps)) {
            return false;
        }
        MVEmployeeRegistrationSteps mVEmployeeRegistrationSteps = (MVEmployeeRegistrationSteps) obj;
        if (this.phoneVerification == mVEmployeeRegistrationSteps.phoneVerification && this.freeformInformation == mVEmployeeRegistrationSteps.freeformInformation) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo31126f() {
        return C13637c.m34053H(this.__isset_bitfield, 1);
    }

    /* renamed from: g */
    public final boolean mo31127g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo31128h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 1, true);
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final void mo31130i() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVEmployeeRegistrationSteps(", "phoneVerification:");
        C13555b.m33977q(n, this.phoneVerification, ", ", "freeformInformation:");
        return C25541a.m63885p(n, this.freeformInformation, ")");
    }
}
