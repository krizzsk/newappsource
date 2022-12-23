package com.tranzmate.moovit.protocol.payments;

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

public class MVMissingPaymentRegistrationStepsResponse implements TBase<MVMissingPaymentRegistrationStepsResponse, _Fields>, Serializable, Cloneable, Comparable<MVMissingPaymentRegistrationStepsResponse> {

    /* renamed from: b */
    public static final C25113c f27378b = new C25113c("missingSteps", (byte) 12, 1);

    /* renamed from: c */
    public static final HashMap f27379c;

    /* renamed from: d */
    public static final Map<_Fields, FieldMetaData> f27380d;
    public MVMissingPaymentRegistrationSteps missingSteps;
    private _Fields[] optionals = {_Fields.MISSING_STEPS};

    public enum _Fields implements C25085c {
        MISSING_STEPS(1, "missingSteps");
        
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
            return MISSING_STEPS;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationStepsResponse$a */
    public static class C9829a extends C25239c<MVMissingPaymentRegistrationStepsResponse> {
        public C9829a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMissingPaymentRegistrationStepsResponse mVMissingPaymentRegistrationStepsResponse = (MVMissingPaymentRegistrationStepsResponse) tBase;
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = mVMissingPaymentRegistrationStepsResponse.missingSteps;
            if (mVMissingPaymentRegistrationSteps != null) {
                mVMissingPaymentRegistrationSteps.mo30045s();
            }
            C25113c cVar = MVMissingPaymentRegistrationStepsResponse.f27378b;
            gVar.mo61687K();
            if (mVMissingPaymentRegistrationStepsResponse.missingSteps != null && mVMissingPaymentRegistrationStepsResponse.mo30056f()) {
                gVar.mo61711x(MVMissingPaymentRegistrationStepsResponse.f27378b);
                mVMissingPaymentRegistrationStepsResponse.missingSteps.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMissingPaymentRegistrationStepsResponse mVMissingPaymentRegistrationStepsResponse = (MVMissingPaymentRegistrationStepsResponse) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    break;
                }
                if (f.f63357c != 1) {
                    C25122h.m63098a(gVar, b);
                } else if (b == 12) {
                    MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = new MVMissingPaymentRegistrationSteps();
                    mVMissingPaymentRegistrationStepsResponse.missingSteps = mVMissingPaymentRegistrationSteps;
                    mVMissingPaymentRegistrationSteps.mo25201C1(gVar);
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps2 = mVMissingPaymentRegistrationStepsResponse.missingSteps;
            if (mVMissingPaymentRegistrationSteps2 != null) {
                mVMissingPaymentRegistrationSteps2.mo30045s();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationStepsResponse$b */
    public static class C9830b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9829a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationStepsResponse$c */
    public static class C9831c extends C25240d<MVMissingPaymentRegistrationStepsResponse> {
        public C9831c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMissingPaymentRegistrationStepsResponse mVMissingPaymentRegistrationStepsResponse = (MVMissingPaymentRegistrationStepsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMissingPaymentRegistrationStepsResponse.mo30056f()) {
                bitSet.set(0);
            }
            jVar.mo61738U(bitSet, 1);
            if (mVMissingPaymentRegistrationStepsResponse.mo30056f()) {
                mVMissingPaymentRegistrationStepsResponse.missingSteps.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMissingPaymentRegistrationStepsResponse mVMissingPaymentRegistrationStepsResponse = (MVMissingPaymentRegistrationStepsResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            if (jVar.mo61737T(1).get(0)) {
                MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = new MVMissingPaymentRegistrationSteps();
                mVMissingPaymentRegistrationStepsResponse.missingSteps = mVMissingPaymentRegistrationSteps;
                mVMissingPaymentRegistrationSteps.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationStepsResponse$d */
    public static class C9832d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9831c(0);
        }
    }

    static {
        new C17394d0("MVMissingPaymentRegistrationStepsResponse");
        HashMap hashMap = new HashMap();
        f27379c = hashMap;
        hashMap.put(C25239c.class, new C9830b());
        hashMap.put(C25240d.class, new C9832d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.MISSING_STEPS, new FieldMetaData("missingSteps", (byte) 2, new StructMetaData(MVMissingPaymentRegistrationSteps.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27380d = unmodifiableMap;
        FieldMetaData.m61947a(MVMissingPaymentRegistrationStepsResponse.class, unmodifiableMap);
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
        ((C25238b) f27379c.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27379c.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMissingPaymentRegistrationStepsResponse mVMissingPaymentRegistrationStepsResponse = (MVMissingPaymentRegistrationStepsResponse) obj;
        if (!getClass().equals(mVMissingPaymentRegistrationStepsResponse.getClass())) {
            return getClass().getName().compareTo(mVMissingPaymentRegistrationStepsResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30056f()).compareTo(Boolean.valueOf(mVMissingPaymentRegistrationStepsResponse.mo30056f()));
        if (compareTo2 != 0) {
            return compareTo2;
        }
        if (!mo30056f() || (compareTo = this.missingSteps.compareTo(mVMissingPaymentRegistrationStepsResponse.missingSteps)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMissingPaymentRegistrationStepsResponse)) {
            return false;
        }
        MVMissingPaymentRegistrationStepsResponse mVMissingPaymentRegistrationStepsResponse = (MVMissingPaymentRegistrationStepsResponse) obj;
        boolean f = mo30056f();
        boolean f2 = mVMissingPaymentRegistrationStepsResponse.mo30056f();
        if ((f || f2) && (!f || !f2 || !this.missingSteps.mo30029a(mVMissingPaymentRegistrationStepsResponse.missingSteps))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30056f() {
        return this.missingSteps != null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MVMissingPaymentRegistrationStepsResponse(");
        if (mo30056f()) {
            sb.append("missingSteps:");
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = this.missingSteps;
            if (mVMissingPaymentRegistrationSteps == null) {
                sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                sb.append(mVMissingPaymentRegistrationSteps);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
