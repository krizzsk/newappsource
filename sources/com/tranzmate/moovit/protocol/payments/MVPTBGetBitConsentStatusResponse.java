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
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
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

public class MVPTBGetBitConsentStatusResponse implements TBase<MVPTBGetBitConsentStatusResponse, _Fields>, Serializable, Cloneable, Comparable<MVPTBGetBitConsentStatusResponse> {

    /* renamed from: b */
    public static final C25113c f27386b = new C25113c("isConnected", (byte) 2, 1);

    /* renamed from: c */
    public static final C25113c f27387c = new C25113c("missingSteps", (byte) 12, 2);

    /* renamed from: d */
    public static final HashMap f27388d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27389e;
    private byte __isset_bitfield = 0;
    public boolean isConnected;
    public MVMissingPaymentRegistrationSteps missingSteps;

    public enum _Fields implements C25085c {
        IS_CONNECTED(1, "isConnected"),
        MISSING_STEPS(2, "missingSteps");
        
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
                return IS_CONNECTED;
            }
            if (i != 2) {
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPTBGetBitConsentStatusResponse$a */
    public static class C9837a extends C25239c<MVPTBGetBitConsentStatusResponse> {
        public C9837a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetBitConsentStatusResponse mVPTBGetBitConsentStatusResponse = (MVPTBGetBitConsentStatusResponse) tBase;
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = mVPTBGetBitConsentStatusResponse.missingSteps;
            if (mVMissingPaymentRegistrationSteps != null) {
                mVMissingPaymentRegistrationSteps.mo30045s();
            }
            C25113c cVar = MVPTBGetBitConsentStatusResponse.f27386b;
            gVar.mo61687K();
            gVar.mo61711x(MVPTBGetBitConsentStatusResponse.f27386b);
            gVar.mo61708u(mVPTBGetBitConsentStatusResponse.isConnected);
            gVar.mo61712y();
            if (mVPTBGetBitConsentStatusResponse.missingSteps != null) {
                gVar.mo61711x(MVPTBGetBitConsentStatusResponse.f27387c);
                mVPTBGetBitConsentStatusResponse.missingSteps.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetBitConsentStatusResponse mVPTBGetBitConsentStatusResponse = (MVPTBGetBitConsentStatusResponse) tBase;
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
                        MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = new MVMissingPaymentRegistrationSteps();
                        mVPTBGetBitConsentStatusResponse.missingSteps = mVMissingPaymentRegistrationSteps;
                        mVMissingPaymentRegistrationSteps.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 2) {
                    mVPTBGetBitConsentStatusResponse.isConnected = gVar.mo61690c();
                    mVPTBGetBitConsentStatusResponse.mo30074h();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
            gVar.mo61706s();
            MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps2 = mVPTBGetBitConsentStatusResponse.missingSteps;
            if (mVMissingPaymentRegistrationSteps2 != null) {
                mVMissingPaymentRegistrationSteps2.mo30045s();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPTBGetBitConsentStatusResponse$b */
    public static class C9838b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9837a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPTBGetBitConsentStatusResponse$c */
    public static class C9839c extends C25240d<MVPTBGetBitConsentStatusResponse> {
        public C9839c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetBitConsentStatusResponse mVPTBGetBitConsentStatusResponse = (MVPTBGetBitConsentStatusResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPTBGetBitConsentStatusResponse.mo30072f()) {
                bitSet.set(0);
            }
            if (mVPTBGetBitConsentStatusResponse.mo30073g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPTBGetBitConsentStatusResponse.mo30072f()) {
                jVar.mo61708u(mVPTBGetBitConsentStatusResponse.isConnected);
            }
            if (mVPTBGetBitConsentStatusResponse.mo30073g()) {
                mVPTBGetBitConsentStatusResponse.missingSteps.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPTBGetBitConsentStatusResponse mVPTBGetBitConsentStatusResponse = (MVPTBGetBitConsentStatusResponse) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPTBGetBitConsentStatusResponse.isConnected = jVar.mo61690c();
                mVPTBGetBitConsentStatusResponse.mo30074h();
            }
            if (T.get(1)) {
                MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = new MVMissingPaymentRegistrationSteps();
                mVPTBGetBitConsentStatusResponse.missingSteps = mVMissingPaymentRegistrationSteps;
                mVMissingPaymentRegistrationSteps.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPTBGetBitConsentStatusResponse$d */
    public static class C9840d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9839c(0);
        }
    }

    static {
        new C17394d0("MVPTBGetBitConsentStatusResponse");
        HashMap hashMap = new HashMap();
        f27388d = hashMap;
        hashMap.put(C25239c.class, new C9838b());
        hashMap.put(C25240d.class, new C9840d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.IS_CONNECTED, new FieldMetaData("isConnected", (byte) 3, new FieldValueMetaData((byte) 2, false)));
        enumMap.put(_Fields.MISSING_STEPS, new FieldMetaData("missingSteps", (byte) 3, new StructMetaData(MVMissingPaymentRegistrationSteps.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27389e = unmodifiableMap;
        FieldMetaData.m61947a(MVPTBGetBitConsentStatusResponse.class, unmodifiableMap);
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
        ((C25238b) f27388d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27388d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVPTBGetBitConsentStatusResponse mVPTBGetBitConsentStatusResponse = (MVPTBGetBitConsentStatusResponse) obj;
        if (!getClass().equals(mVPTBGetBitConsentStatusResponse.getClass())) {
            return getClass().getName().compareTo(mVPTBGetBitConsentStatusResponse.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo30072f()).compareTo(Boolean.valueOf(mVPTBGetBitConsentStatusResponse.mo30072f()));
        if (compareTo2 != 0 || ((mo30072f() && (compareTo2 = C25082a.m62848l(this.isConnected, mVPTBGetBitConsentStatusResponse.isConnected)) != 0) || (compareTo2 = Boolean.valueOf(mo30073g()).compareTo(Boolean.valueOf(mVPTBGetBitConsentStatusResponse.mo30073g()))) != 0)) {
            return compareTo2;
        }
        if (!mo30073g() || (compareTo = this.missingSteps.compareTo(mVPTBGetBitConsentStatusResponse.missingSteps)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPTBGetBitConsentStatusResponse)) {
            return false;
        }
        MVPTBGetBitConsentStatusResponse mVPTBGetBitConsentStatusResponse = (MVPTBGetBitConsentStatusResponse) obj;
        if (this.isConnected != mVPTBGetBitConsentStatusResponse.isConnected) {
            return false;
        }
        boolean g = mo30073g();
        boolean g2 = mVPTBGetBitConsentStatusResponse.mo30073g();
        if ((g || g2) && (!g || !g2 || !this.missingSteps.mo30029a(mVPTBGetBitConsentStatusResponse.missingSteps))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30072f() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: g */
    public final boolean mo30073g() {
        return this.missingSteps != null;
    }

    /* renamed from: h */
    public final void mo30074h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPTBGetBitConsentStatusResponse(", "isConnected:");
        C13555b.m33977q(n, this.isConnected, ", ", "missingSteps:");
        MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps = this.missingSteps;
        if (mVMissingPaymentRegistrationSteps == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(mVMissingPaymentRegistrationSteps);
        }
        n.append(")");
        return n.toString();
    }
}
