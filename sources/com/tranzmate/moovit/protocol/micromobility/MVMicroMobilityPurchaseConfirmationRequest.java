package com.tranzmate.moovit.protocol.micromobility;

import com.appboy.support.StringUtils;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.payments.MVPaymentProvider;
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

public class MVMicroMobilityPurchaseConfirmationRequest implements TBase<MVMicroMobilityPurchaseConfirmationRequest, _Fields>, Serializable, Cloneable, Comparable<MVMicroMobilityPurchaseConfirmationRequest> {

    /* renamed from: b */
    public static final C25113c f26587b = new C25113c("contextId", (byte) 11, 1);

    /* renamed from: c */
    public static final C25113c f26588c = new C25113c("paymentProvider", (byte) 12, 3);

    /* renamed from: d */
    public static final C25113c f26589d = new C25113c("discountContextId", (byte) 11, 4);

    /* renamed from: e */
    public static final C25113c f26590e = new C25113c("currentUserLocation", (byte) 12, 5);

    /* renamed from: f */
    public static final HashMap f26591f;

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26592g;
    public String contextId;
    public MVLatLon currentUserLocation;
    public String discountContextId;
    private _Fields[] optionals = {_Fields.PAYMENT_PROVIDER, _Fields.DISCOUNT_CONTEXT_ID, _Fields.CURRENT_USER_LOCATION};
    public MVPaymentProvider paymentProvider;

    public enum _Fields implements C25085c {
        CONTEXT_ID(1, "contextId"),
        PAYMENT_PROVIDER(3, "paymentProvider"),
        DISCOUNT_CONTEXT_ID(4, "discountContextId"),
        CURRENT_USER_LOCATION(5, "currentUserLocation");
        
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
                return CONTEXT_ID;
            }
            if (i == 3) {
                return PAYMENT_PROVIDER;
            }
            if (i == 4) {
                return DISCOUNT_CONTEXT_ID;
            }
            if (i != 5) {
                return null;
            }
            return CURRENT_USER_LOCATION;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationRequest$a */
    public static class C9256a extends C25239c<MVMicroMobilityPurchaseConfirmationRequest> {
        public C9256a(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseConfirmationRequest mVMicroMobilityPurchaseConfirmationRequest = (MVMicroMobilityPurchaseConfirmationRequest) tBase;
            MVLatLon mVLatLon = mVMicroMobilityPurchaseConfirmationRequest.currentUserLocation;
            C25113c cVar = MVMicroMobilityPurchaseConfirmationRequest.f26587b;
            gVar.mo61687K();
            if (mVMicroMobilityPurchaseConfirmationRequest.contextId != null) {
                gVar.mo61711x(MVMicroMobilityPurchaseConfirmationRequest.f26587b);
                gVar.mo61686J(mVMicroMobilityPurchaseConfirmationRequest.contextId);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseConfirmationRequest.paymentProvider != null && mVMicroMobilityPurchaseConfirmationRequest.mo28786i()) {
                gVar.mo61711x(MVMicroMobilityPurchaseConfirmationRequest.f26588c);
                mVMicroMobilityPurchaseConfirmationRequest.paymentProvider.mo25202X0(gVar);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseConfirmationRequest.discountContextId != null && mVMicroMobilityPurchaseConfirmationRequest.mo28784h()) {
                gVar.mo61711x(MVMicroMobilityPurchaseConfirmationRequest.f26589d);
                gVar.mo61686J(mVMicroMobilityPurchaseConfirmationRequest.discountContextId);
                gVar.mo61712y();
            }
            if (mVMicroMobilityPurchaseConfirmationRequest.currentUserLocation != null && mVMicroMobilityPurchaseConfirmationRequest.mo28783g()) {
                gVar.mo61711x(MVMicroMobilityPurchaseConfirmationRequest.f26590e);
                mVMicroMobilityPurchaseConfirmationRequest.currentUserLocation.mo25202X0(gVar);
                gVar.mo61712y();
            }
            gVar.mo61713z();
            gVar.mo61688L();
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseConfirmationRequest mVMicroMobilityPurchaseConfirmationRequest = (MVMicroMobilityPurchaseConfirmationRequest) tBase;
            gVar.mo61705r();
            while (true) {
                C25113c f = gVar.mo61693f();
                byte b = f.f63356b;
                if (b == 0) {
                    gVar.mo61706s();
                    MVLatLon mVLatLon = mVMicroMobilityPurchaseConfirmationRequest.currentUserLocation;
                    return;
                }
                short s = f.f63357c;
                if (s != 1) {
                    if (s != 3) {
                        if (s != 4) {
                            if (s != 5) {
                                C25122h.m63098a(gVar, b);
                            } else if (b == 12) {
                                MVLatLon mVLatLon2 = new MVLatLon();
                                mVMicroMobilityPurchaseConfirmationRequest.currentUserLocation = mVLatLon2;
                                mVLatLon2.mo25201C1(gVar);
                            } else {
                                C25122h.m63098a(gVar, b);
                            }
                        } else if (b == 11) {
                            mVMicroMobilityPurchaseConfirmationRequest.discountContextId = gVar.mo61704q();
                        } else {
                            C25122h.m63098a(gVar, b);
                        }
                    } else if (b == 12) {
                        MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
                        mVMicroMobilityPurchaseConfirmationRequest.paymentProvider = mVPaymentProvider;
                        mVPaymentProvider.mo25201C1(gVar);
                    } else {
                        C25122h.m63098a(gVar, b);
                    }
                } else if (b == 11) {
                    mVMicroMobilityPurchaseConfirmationRequest.contextId = gVar.mo61704q();
                } else {
                    C25122h.m63098a(gVar, b);
                }
                gVar.mo61694g();
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationRequest$b */
    public static class C9257b implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9256a(0);
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationRequest$c */
    public static class C9258c extends C25240d<MVMicroMobilityPurchaseConfirmationRequest> {
        public C9258c(int i) {
        }

        /* renamed from: a */
        public final void mo25217a(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseConfirmationRequest mVMicroMobilityPurchaseConfirmationRequest = (MVMicroMobilityPurchaseConfirmationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet bitSet = new BitSet();
            if (mVMicroMobilityPurchaseConfirmationRequest.mo28782f()) {
                bitSet.set(0);
            }
            if (mVMicroMobilityPurchaseConfirmationRequest.mo28786i()) {
                bitSet.set(1);
            }
            if (mVMicroMobilityPurchaseConfirmationRequest.mo28784h()) {
                bitSet.set(2);
            }
            if (mVMicroMobilityPurchaseConfirmationRequest.mo28783g()) {
                bitSet.set(3);
            }
            jVar.mo61738U(bitSet, 4);
            if (mVMicroMobilityPurchaseConfirmationRequest.mo28782f()) {
                jVar.mo61686J(mVMicroMobilityPurchaseConfirmationRequest.contextId);
            }
            if (mVMicroMobilityPurchaseConfirmationRequest.mo28786i()) {
                mVMicroMobilityPurchaseConfirmationRequest.paymentProvider.mo25202X0(jVar);
            }
            if (mVMicroMobilityPurchaseConfirmationRequest.mo28784h()) {
                jVar.mo61686J(mVMicroMobilityPurchaseConfirmationRequest.discountContextId);
            }
            if (mVMicroMobilityPurchaseConfirmationRequest.mo28783g()) {
                mVMicroMobilityPurchaseConfirmationRequest.currentUserLocation.mo25202X0(jVar);
            }
        }

        /* renamed from: b */
        public final void mo25218b(C25121g gVar, TBase tBase) throws TException {
            MVMicroMobilityPurchaseConfirmationRequest mVMicroMobilityPurchaseConfirmationRequest = (MVMicroMobilityPurchaseConfirmationRequest) tBase;
            C25124j jVar = (C25124j) gVar;
            BitSet T = jVar.mo61737T(4);
            if (T.get(0)) {
                mVMicroMobilityPurchaseConfirmationRequest.contextId = jVar.mo61704q();
            }
            if (T.get(1)) {
                MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
                mVMicroMobilityPurchaseConfirmationRequest.paymentProvider = mVPaymentProvider;
                mVPaymentProvider.mo25201C1(jVar);
            }
            if (T.get(2)) {
                mVMicroMobilityPurchaseConfirmationRequest.discountContextId = jVar.mo61704q();
            }
            if (T.get(3)) {
                MVLatLon mVLatLon = new MVLatLon();
                mVMicroMobilityPurchaseConfirmationRequest.currentUserLocation = mVLatLon;
                mVLatLon.mo25201C1(jVar);
            }
        }
    }

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationRequest$d */
    public static class C9259d implements C25238b {
        /* renamed from: a */
        public final C25237a mo25219a() {
            return new C9258c(0);
        }
    }

    static {
        new C17394d0("MVMicroMobilityPurchaseConfirmationRequest");
        HashMap hashMap = new HashMap();
        f26591f = hashMap;
        hashMap.put(C25239c.class, new C9257b());
        hashMap.put(C25240d.class, new C9259d());
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONTEXT_ID, new FieldMetaData("contextId", (byte) 3, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.PAYMENT_PROVIDER, new FieldMetaData("paymentProvider", (byte) 2, new StructMetaData(MVPaymentProvider.class)));
        enumMap.put(_Fields.DISCOUNT_CONTEXT_ID, new FieldMetaData("discountContextId", (byte) 2, new FieldValueMetaData((byte) 11, false)));
        enumMap.put(_Fields.CURRENT_USER_LOCATION, new FieldMetaData("currentUserLocation", (byte) 2, new StructMetaData(MVLatLon.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26592g = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityPurchaseConfirmationRequest.class, unmodifiableMap);
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
        ((C25238b) f26591f.get(gVar.mo61736a())).mo25219a().mo25218b(gVar, this);
    }

    /* renamed from: X0 */
    public final void mo25202X0(C25121g gVar) throws TException {
        ((C25238b) f26591f.get(gVar.mo61736a())).mo25219a().mo25217a(gVar, this);
    }

    public final int compareTo(Object obj) {
        int compareTo;
        MVMicroMobilityPurchaseConfirmationRequest mVMicroMobilityPurchaseConfirmationRequest = (MVMicroMobilityPurchaseConfirmationRequest) obj;
        if (!getClass().equals(mVMicroMobilityPurchaseConfirmationRequest.getClass())) {
            return getClass().getName().compareTo(mVMicroMobilityPurchaseConfirmationRequest.getClass().getName());
        }
        int compareTo2 = Boolean.valueOf(mo28782f()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseConfirmationRequest.mo28782f()));
        if (compareTo2 != 0 || ((mo28782f() && (compareTo2 = this.contextId.compareTo(mVMicroMobilityPurchaseConfirmationRequest.contextId)) != 0) || (compareTo2 = Boolean.valueOf(mo28786i()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseConfirmationRequest.mo28786i()))) != 0 || ((mo28786i() && (compareTo2 = this.paymentProvider.compareTo(mVMicroMobilityPurchaseConfirmationRequest.paymentProvider)) != 0) || (compareTo2 = Boolean.valueOf(mo28784h()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseConfirmationRequest.mo28784h()))) != 0 || ((mo28784h() && (compareTo2 = this.discountContextId.compareTo(mVMicroMobilityPurchaseConfirmationRequest.discountContextId)) != 0) || (compareTo2 = Boolean.valueOf(mo28783g()).compareTo(Boolean.valueOf(mVMicroMobilityPurchaseConfirmationRequest.mo28783g()))) != 0)))) {
            return compareTo2;
        }
        if (!mo28783g() || (compareTo = this.currentUserLocation.compareTo(mVMicroMobilityPurchaseConfirmationRequest.currentUserLocation)) == 0) {
            return 0;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MVMicroMobilityPurchaseConfirmationRequest)) {
            return false;
        }
        MVMicroMobilityPurchaseConfirmationRequest mVMicroMobilityPurchaseConfirmationRequest = (MVMicroMobilityPurchaseConfirmationRequest) obj;
        boolean f = mo28782f();
        boolean f2 = mVMicroMobilityPurchaseConfirmationRequest.mo28782f();
        if ((f || f2) && (!f || !f2 || !this.contextId.equals(mVMicroMobilityPurchaseConfirmationRequest.contextId))) {
            return false;
        }
        boolean i = mo28786i();
        boolean i2 = mVMicroMobilityPurchaseConfirmationRequest.mo28786i();
        if ((i || i2) && (!i || !i2 || !this.paymentProvider.mo30299m(mVMicroMobilityPurchaseConfirmationRequest.paymentProvider))) {
            return false;
        }
        boolean h = mo28784h();
        boolean h2 = mVMicroMobilityPurchaseConfirmationRequest.mo28784h();
        if ((h || h2) && (!h || !h2 || !this.discountContextId.equals(mVMicroMobilityPurchaseConfirmationRequest.discountContextId))) {
            return false;
        }
        boolean g = mo28783g();
        boolean g2 = mVMicroMobilityPurchaseConfirmationRequest.mo28783g();
        if ((g || g2) && (!g || !g2 || !this.currentUserLocation.mo26290a(mVMicroMobilityPurchaseConfirmationRequest.currentUserLocation))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo28782f() {
        return this.contextId != null;
    }

    /* renamed from: g */
    public final boolean mo28783g() {
        return this.currentUserLocation != null;
    }

    /* renamed from: h */
    public final boolean mo28784h() {
        return this.discountContextId != null;
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final boolean mo28786i() {
        return this.paymentProvider != null;
    }

    public final String toString() {
        StringBuilder n = C13437d.m33708n("MVMicroMobilityPurchaseConfirmationRequest(", "contextId:");
        String str = this.contextId;
        if (str == null) {
            n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            n.append(str);
        }
        if (mo28786i()) {
            n.append(", ");
            n.append("paymentProvider:");
            MVPaymentProvider mVPaymentProvider = this.paymentProvider;
            if (mVPaymentProvider == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVPaymentProvider);
            }
        }
        if (mo28784h()) {
            n.append(", ");
            n.append("discountContextId:");
            String str2 = this.discountContextId;
            if (str2 == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(str2);
            }
        }
        if (mo28783g()) {
            n.append(", ");
            n.append("currentUserLocation:");
            MVLatLon mVLatLon = this.currentUserLocation;
            if (mVLatLon == null) {
                n.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
            } else {
                n.append(mVLatLon);
            }
        }
        n.append(")");
        return n.toString();
    }
}
