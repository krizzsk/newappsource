package com.tranzmate.moovit.protocol.payments;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.apache.thrift.TException;
import org.apache.thrift.TUnion;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.protocol.TProtocolException;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import xi0.C25276a;

public class MVPaymentProvider extends TUnion<MVPaymentProvider, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f27522c = new C17394d0("MVPaymentProvider");

    /* renamed from: d */
    public static final C25113c f27523d = new C25113c("paymentMethodId", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f27524e = new C25113c("googlePayData", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f27525f = new C25113c("applePayData", (byte) 12, 3);

    /* renamed from: g */
    public static final C25113c f27526g = new C25113c("cashData", (byte) 12, 4);

    /* renamed from: h */
    public static final C25113c f27527h = new C25113c("clearanceProviderData", (byte) 12, 5);

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f27528i;

    public enum _Fields implements C25085c {
        PAYMENT_METHOD_ID(1, "paymentMethodId"),
        GOOGLE_PAY_DATA(2, "googlePayData"),
        APPLE_PAY_DATA(3, "applePayData"),
        CASH_DATA(4, "cashData"),
        CLEARANCE_PROVIDER_DATA(5, "clearanceProviderData");
        
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
                return PAYMENT_METHOD_ID;
            }
            if (i == 2) {
                return GOOGLE_PAY_DATA;
            }
            if (i == 3) {
                return APPLE_PAY_DATA;
            }
            if (i == 4) {
                return CASH_DATA;
            }
            if (i != 5) {
                return null;
            }
            return CLEARANCE_PROVIDER_DATA;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentProvider$a */
    public static /* synthetic */ class C9934a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27529a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.tranzmate.moovit.protocol.payments.MVPaymentProvider$_Fields[] r0 = com.tranzmate.moovit.protocol.payments.MVPaymentProvider._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27529a = r0
                com.tranzmate.moovit.protocol.payments.MVPaymentProvider$_Fields r1 = com.tranzmate.moovit.protocol.payments.MVPaymentProvider._Fields.PAYMENT_METHOD_ID     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27529a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.payments.MVPaymentProvider$_Fields r1 = com.tranzmate.moovit.protocol.payments.MVPaymentProvider._Fields.GOOGLE_PAY_DATA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27529a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.payments.MVPaymentProvider$_Fields r1 = com.tranzmate.moovit.protocol.payments.MVPaymentProvider._Fields.APPLE_PAY_DATA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27529a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.payments.MVPaymentProvider$_Fields r1 = com.tranzmate.moovit.protocol.payments.MVPaymentProvider._Fields.CASH_DATA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f27529a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tranzmate.moovit.protocol.payments.MVPaymentProvider$_Fields r1 = com.tranzmate.moovit.protocol.payments.MVPaymentProvider._Fields.CLEARANCE_PROVIDER_DATA     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.payments.MVPaymentProvider.C9934a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.PAYMENT_METHOD_ID, new FieldMetaData("paymentMethodId", (byte) 3, new StructMetaData(MVPaymentMethodId.class)));
        enumMap.put(_Fields.GOOGLE_PAY_DATA, new FieldMetaData("googlePayData", (byte) 3, new StructMetaData(MVGooglePayPaymentData.class)));
        enumMap.put(_Fields.APPLE_PAY_DATA, new FieldMetaData("applePayData", (byte) 3, new StructMetaData(MVApplePayPaymentData.class)));
        enumMap.put(_Fields.CASH_DATA, new FieldMetaData("cashData", (byte) 3, new StructMetaData(MVCashPaymentData.class)));
        enumMap.put(_Fields.CLEARANCE_PROVIDER_DATA, new FieldMetaData("clearanceProviderData", (byte) 3, new StructMetaData(MVClearanceProviderPaymentData.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27528i = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentProvider.class, unmodifiableMap);
    }

    /* renamed from: k */
    public static MVPaymentProvider m24870k(MVCashPaymentData mVCashPaymentData) {
        MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
        mVPaymentProvider.setField_ = _Fields.CASH_DATA;
        mVPaymentProvider.value_ = mVCashPaymentData;
        return mVPaymentProvider;
    }

    /* renamed from: l */
    public static MVPaymentProvider m24871l(MVClearanceProviderPaymentData mVClearanceProviderPaymentData) {
        MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
        mVPaymentProvider.setField_ = _Fields.CLEARANCE_PROVIDER_DATA;
        mVPaymentProvider.value_ = mVClearanceProviderPaymentData;
        return mVPaymentProvider;
    }

    /* renamed from: n */
    public static MVPaymentProvider m24872n(MVGooglePayPaymentData mVGooglePayPaymentData) {
        MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
        mVPaymentProvider.setField_ = _Fields.GOOGLE_PAY_DATA;
        mVPaymentProvider.value_ = mVGooglePayPaymentData;
        return mVPaymentProvider;
    }

    /* renamed from: o */
    public static MVPaymentProvider m24873o(MVPaymentMethodId mVPaymentMethodId) {
        MVPaymentProvider mVPaymentProvider = new MVPaymentProvider();
        mVPaymentMethodId.getClass();
        mVPaymentProvider.setField_ = _Fields.PAYMENT_METHOD_ID;
        mVPaymentProvider.value_ = mVPaymentMethodId;
        return mVPaymentProvider;
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

    /* renamed from: a */
    public final C25085c mo25504a(short s) {
        return _Fields.findByThriftIdOrThrow(s);
    }

    /* renamed from: b */
    public final C25113c mo25505b(C25085c cVar) {
        _Fields _fields = (_Fields) cVar;
        int i = C9934a.f27529a[_fields.ordinal()];
        if (i == 1) {
            return f27523d;
        }
        if (i == 2) {
            return f27524e;
        }
        if (i == 3) {
            return f27525f;
        }
        if (i == 4) {
            return f27526g;
        }
        if (i == 5) {
            return f27527h;
        }
        throw new IllegalArgumentException("Unknown field id " + _fields);
    }

    public final int compareTo(Object obj) {
        MVPaymentProvider mVPaymentProvider = (MVPaymentProvider) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVPaymentProvider.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVPaymentProvider.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MVPaymentProvider) {
            return mo30299m((MVPaymentProvider) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f27522c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            int i = C9934a.f27529a[findByThriftId.ordinal()];
            if (i == 1) {
                byte b = cVar.f63356b;
                if (b == 12) {
                    MVPaymentMethodId mVPaymentMethodId = new MVPaymentMethodId();
                    mVPaymentMethodId.mo25201C1(gVar);
                    return mVPaymentMethodId;
                }
                C25122h.m63098a(gVar, b);
                return null;
            } else if (i == 2) {
                byte b2 = cVar.f63356b;
                if (b2 == 12) {
                    MVGooglePayPaymentData mVGooglePayPaymentData = new MVGooglePayPaymentData();
                    mVGooglePayPaymentData.mo25201C1(gVar);
                    return mVGooglePayPaymentData;
                }
                C25122h.m63098a(gVar, b2);
                return null;
            } else if (i == 3) {
                byte b3 = cVar.f63356b;
                if (b3 == 12) {
                    MVApplePayPaymentData mVApplePayPaymentData = new MVApplePayPaymentData();
                    mVApplePayPaymentData.mo25201C1(gVar);
                    return mVApplePayPaymentData;
                }
                C25122h.m63098a(gVar, b3);
                return null;
            } else if (i == 4) {
                byte b4 = cVar.f63356b;
                if (b4 == 12) {
                    MVCashPaymentData mVCashPaymentData = new MVCashPaymentData();
                    mVCashPaymentData.mo25201C1(gVar);
                    return mVCashPaymentData;
                }
                C25122h.m63098a(gVar, b4);
                return null;
            } else if (i == 5) {
                byte b5 = cVar.f63356b;
                if (b5 == 12) {
                    MVClearanceProviderPaymentData mVClearanceProviderPaymentData = new MVClearanceProviderPaymentData();
                    mVClearanceProviderPaymentData.mo25201C1(gVar);
                    return mVClearanceProviderPaymentData;
                }
                C25122h.m63098a(gVar, b5);
                return null;
            } else {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            C25122h.m63098a(gVar, cVar.f63356b);
            return null;
        }
    }

    /* renamed from: h */
    public final void mo25510h(C25121g gVar) throws TException {
        int i = C9934a.f27529a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVPaymentMethodId) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVGooglePayPaymentData) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVApplePayPaymentData) this.value_).mo25202X0(gVar);
        } else if (i == 4) {
            ((MVCashPaymentData) this.value_).mo25202X0(gVar);
        } else if (i == 5) {
            ((MVClearanceProviderPaymentData) this.value_).mo25202X0(gVar);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }

    public final int hashCode() {
        return 0;
    }

    /* renamed from: i */
    public final Object mo25512i(C25121g gVar, short s) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(s);
        if (findByThriftId != null) {
            int i = C9934a.f27529a[findByThriftId.ordinal()];
            if (i == 1) {
                MVPaymentMethodId mVPaymentMethodId = new MVPaymentMethodId();
                mVPaymentMethodId.mo25201C1(gVar);
                return mVPaymentMethodId;
            } else if (i == 2) {
                MVGooglePayPaymentData mVGooglePayPaymentData = new MVGooglePayPaymentData();
                mVGooglePayPaymentData.mo25201C1(gVar);
                return mVGooglePayPaymentData;
            } else if (i == 3) {
                MVApplePayPaymentData mVApplePayPaymentData = new MVApplePayPaymentData();
                mVApplePayPaymentData.mo25201C1(gVar);
                return mVApplePayPaymentData;
            } else if (i == 4) {
                MVCashPaymentData mVCashPaymentData = new MVCashPaymentData();
                mVCashPaymentData.mo25201C1(gVar);
                return mVCashPaymentData;
            } else if (i == 5) {
                MVClearanceProviderPaymentData mVClearanceProviderPaymentData = new MVClearanceProviderPaymentData();
                mVClearanceProviderPaymentData.mo25201C1(gVar);
                return mVClearanceProviderPaymentData;
            } else {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        int i = C9934a.f27529a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVPaymentMethodId) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVGooglePayPaymentData) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVApplePayPaymentData) this.value_).mo25202X0(gVar);
        } else if (i == 4) {
            ((MVCashPaymentData) this.value_).mo25202X0(gVar);
        } else if (i == 5) {
            ((MVClearanceProviderPaymentData) this.value_).mo25202X0(gVar);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: m */
    public final boolean mo30299m(MVPaymentProvider mVPaymentProvider) {
        if (mVPaymentProvider == null || this.setField_ != mVPaymentProvider.setField_ || !this.value_.equals(mVPaymentProvider.value_)) {
            return false;
        }
        return true;
    }
}
