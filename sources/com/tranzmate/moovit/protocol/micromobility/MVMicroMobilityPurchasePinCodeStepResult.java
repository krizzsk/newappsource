package com.tranzmate.moovit.protocol.micromobility;

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

public class MVMicroMobilityPurchasePinCodeStepResult implements TBase<MVMicroMobilityPurchasePinCodeStepResult, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityPurchasePinCodeStepResult> {

    /* renamed from: b */
    public static final C25113c f26677b = new C25113c("digitCode", (byte) 11, 1);

    /* renamed from: c */
    public static final HashMap f26678c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f26679d;
    public String digitCode;

    public enum _Fields implements C25085c {
        DIGIT_CODE(1, "digitCode");
        
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
            if (i != 1) {
                return null;
            }
            return DIGIT_CODE;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchasePinCodeStepResult$a */
    public static class C9310a extends C25239c<MVMicroMobilityPurchasePinCodeStepResult> {
        public C9310a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchasePinCodeStepResult mVMicroMobilityPurchasePinCodeStepResult = (MVMicroMobilityPurchasePinCodeStepResult) tBase;
            mVMicroMobilityPurchasePinCodeStepResult.getClass();
            C25113c cVar = MVMicroMobilityPurchasePinCodeStepResult.f26677b;
            gVar.mo61687K();
            if (mVMicroMobilityPurchasePinCodeStepResult.digitCode != null) {
                gVar.mo61711x(MVMicroMobilityPurchasePinCodeStepResult.f26677b);
                gVar.mo61686J(mVMicroMobilityPurchasePinCodeStepResult.digitCode);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchasePinCodeStepResult mVMicroMobilityPurchasePinCodeStepResult = (MVMicroMobilityPurchasePinCodeStepResult) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVMicroMobilityPurchasePinCodeStepResult.getClass();
                    return;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 11) {
                    mVMicroMobilityPurchasePinCodeStepResult.digitCode = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchasePinCodeStepResult$b */
    public static class C9311b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9310a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchasePinCodeStepResult$c */
    public static class C9312c extends C25240d<MVMicroMobilityPurchasePinCodeStepResult> {
        public C9312c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchasePinCodeStepResult mVMicroMobilityPurchasePinCodeStepResult = (MVMicroMobilityPurchasePinCodeStepResult) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityPurchasePinCodeStepResult.mo28907f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVMicroMobilityPurchasePinCodeStepResult.mo28907f()) {
                jVar.mo61686J(mVMicroMobilityPurchasePinCodeStepResult.digitCode);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchasePinCodeStepResult mVMicroMobilityPurchasePinCodeStepResult = (MVMicroMobilityPurchasePinCodeStepResult) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                mVMicroMobilityPurchasePinCodeStepResult.digitCode = jVar.mo61704q();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchasePinCodeStepResult$d */
    public static class C9313d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9312c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityPurchasePinCodeStepResult");
        HashMap hashMap = new HashMap();
        f26678c = hashMap;
        hashMap.put(C25239c.class, new C9311b());
        hashMap.put(C25240d.class, new C9313d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.DIGIT_CODE, new FieldMetaData("digitCode", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26679d = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityPurchasePinCodeStepResult.class, unmodifiableMap);
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
        ((C25238b) f26678c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26678c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityPurchasePinCodeStepResult mVMicroMobilityPurchasePinCodeStepResult = (MVMicroMobilityPurchasePinCodeStepResult) obj;
        if (!getClass().equals(mVMicroMobilityPurchasePinCodeStepResult.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityPurchasePinCodeStepResult.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28907f()).compareTo(Boolean.valueOf(mVMicroMobilityPurchasePinCodeStepResult.mo28907f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo28907f() || (compareTo = this.digitCode.compareTo(mVMicroMobilityPurchasePinCodeStepResult.digitCode)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityPurchasePinCodeStepResult)) {
            return false;
        }
        MVMicroMobilityPurchasePinCodeStepResult mVMicroMobilityPurchasePinCodeStepResult = (MVMicroMobilityPurchasePinCodeStepResult) obj;
        boolean f = mo28907f();
        boolean f2 = mVMicroMobilityPurchasePinCodeStepResult.mo28907f();
        if ((f || f2) && (!f || !f2 || !this.digitCode.equals(mVMicroMobilityPurchasePinCodeStepResult.digitCode))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28907f() {
        return this.digitCode != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityPurchasePinCodeStepResult(", "digitCode:");
        String str = this.digitCode;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(")");
        return n.toString();
    }
}
