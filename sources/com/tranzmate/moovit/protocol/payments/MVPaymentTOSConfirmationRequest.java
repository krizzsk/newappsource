package com.tranzmate.moovit.protocol.payments;

import com.appboy.support.StringUtils;
import com.unity3d.ads.metadata.MediationMetaData;
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

public class MVPaymentTOSConfirmationRequest implements TBase<MVPaymentTOSConfirmationRequest, _Fields>, Serializable, Cloneable, Comparable<MVPaymentTOSConfirmationRequest> {

    /* renamed from: b */
    public static final C25113c f27616b = new C25113c("paymentContext", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f27617c = new C25113c(MediationMetaData.KEY_VERSION, (byte) 8, 2);

    /* renamed from: d */
    public static final HashMap f27618d;

    /* renamed from: e */
    public static final Map<_Fields, FieldMetaData> f27619e;
    private byte __isset_bitfield = 0;
    public String paymentContext;
    public int version;

    public enum _Fields implements C25085c {
        PAYMENT_CONTEXT(1, "paymentContext"),
        VERSION(2, MediationMetaData.KEY_VERSION);
        
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
                return PAYMENT_CONTEXT;
            }
            if (i != 2) {
                return null;
            }
            return VERSION;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentTOSConfirmationRequest$a */
    public static class C10007a extends C25239c<MVPaymentTOSConfirmationRequest> {
        public C10007a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentTOSConfirmationRequest mVPaymentTOSConfirmationRequest = (MVPaymentTOSConfirmationRequest) tBase;
            mVPaymentTOSConfirmationRequest.getClass();
            C25113c cVar = MVPaymentTOSConfirmationRequest.f27616b;
            gVar.mo61687K();
            if (mVPaymentTOSConfirmationRequest.paymentContext != null) {
                gVar.mo61711x(MVPaymentTOSConfirmationRequest.f27616b);
                gVar.mo61686J(mVPaymentTOSConfirmationRequest.paymentContext);
                gVar.mo61712y();
            }
            gVar.mo61711x(MVPaymentTOSConfirmationRequest.f27617c);
            C16530d.m42020n(gVar, mVPaymentTOSConfirmationRequest.version);
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentTOSConfirmationRequest mVPaymentTOSConfirmationRequest = (MVPaymentTOSConfirmationRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    mVPaymentTOSConfirmationRequest.getClass();
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 2) {
                        C25122h.m63098a(gVar, b);
                    } else if (b == 8) {
                        mVPaymentTOSConfirmationRequest.version = gVar.mo61696i();
                        mVPaymentTOSConfirmationRequest.mo30452h();
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVPaymentTOSConfirmationRequest.paymentContext = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentTOSConfirmationRequest$b */
    public static class C10008b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10007a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentTOSConfirmationRequest$c */
    public static class C10009c extends C25240d<MVPaymentTOSConfirmationRequest> {
        public C10009c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVPaymentTOSConfirmationRequest mVPaymentTOSConfirmationRequest = (MVPaymentTOSConfirmationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVPaymentTOSConfirmationRequest.mo30450f()) {
                bitSet.set(0);
            }
            if (mVPaymentTOSConfirmationRequest.mo30451g()) {
                bitSet.set(1);
            }
            jVar.mo61738U(bitSet, 2);
            if (mVPaymentTOSConfirmationRequest.mo30450f()) {
                jVar.mo61686J(mVPaymentTOSConfirmationRequest.paymentContext);
            }
            if (mVPaymentTOSConfirmationRequest.mo30451g()) {
                jVar.mo61678B(mVPaymentTOSConfirmationRequest.version);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVPaymentTOSConfirmationRequest mVPaymentTOSConfirmationRequest = (MVPaymentTOSConfirmationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(2);
            if (T.get(0)) {
                mVPaymentTOSConfirmationRequest.paymentContext = jVar.mo61704q();
            }
            if (T.get(1)) {
                mVPaymentTOSConfirmationRequest.version = jVar.mo61696i();
                mVPaymentTOSConfirmationRequest.mo30452h();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentTOSConfirmationRequest$d */
    public static class C10010d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C10009c(0);
        }
    }

    static {
        new C17394d0("MVPaymentTOSConfirmationRequest");
        HashMap hashMap = new HashMap();
        f27618d = hashMap;
        hashMap.put(C25239c.class, new C10008b());
        hashMap.put(C25240d.class, new C10010d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_CONTEXT, new FieldMetaData("paymentContext", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.VERSION, new FieldMetaData(MediationMetaData.KEY_VERSION, (byte) 3, new FieldValueMetaData((byte) 8, false)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27619e = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentTOSConfirmationRequest.class, unmodifiableMap);
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
        ((C25238b) f27618d.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f27618d.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int c;
        MVPaymentTOSConfirmationRequest mVPaymentTOSConfirmationRequest = (MVPaymentTOSConfirmationRequest) obj;
        if (!getClass().equals(mVPaymentTOSConfirmationRequest.getClass())) {
            return getClass().getName().compareTo(mVPaymentTOSConfirmationRequest.getClass().getName());
        }
        int compareTo = Boolean.valueOf(mo30450f()).compareTo(Boolean.valueOf(mVPaymentTOSConfirmationRequest.mo30450f()));
        if (compareTo != 0 || ((mo30450f() && (compareTo = this.paymentContext.compareTo(mVPaymentTOSConfirmationRequest.paymentContext)) != 0) || (compareTo = Boolean.valueOf(mo30451g()).compareTo(Boolean.valueOf(mVPaymentTOSConfirmationRequest.mo30451g()))) != 0)) {
            return compareTo;
        }
        if (!mo30451g() || (c = C25082a.m62839c(this.version, mVPaymentTOSConfirmationRequest.version)) == 0) {
            return 0;
        }
        return c;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVPaymentTOSConfirmationRequest)) {
            return false;
        }
        MVPaymentTOSConfirmationRequest mVPaymentTOSConfirmationRequest = (MVPaymentTOSConfirmationRequest) obj;
        boolean f = mo30450f();
        boolean f2 = mVPaymentTOSConfirmationRequest.mo30450f();
        if (((f || f2) && (!f || !f2 || !this.paymentContext.equals(mVPaymentTOSConfirmationRequest.paymentContext))) || this.version != mVPaymentTOSConfirmationRequest.version) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo30450f() {
        return this.paymentContext != null;
    }

    /* renamed from: g */
    public final boolean mo30451g() {
        return C13637c.m34053H(this.__isset_bitfield, 0);
    }

    /* renamed from: h */
    public final void mo30452h() {
        this.__isset_bitfield = (byte) C13637c.m34050E(this.__isset_bitfield, 0, true);
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVPaymentTOSConfirmationRequest(", "paymentContext:");
        String str = this.paymentContext;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        n.append(", ");
        n.append("version:");
        return C13437d.m33707l(n, this.version, ")");
    }
}
