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

public class MVPaymentMethod extends TUnion<MVPaymentMethod, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f27482c = new C17394d0("MVPaymentMethod");

    /* renamed from: d */
    public static final C25113c f27483d = new C25113c("cardPreview", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f27484e = new C25113c("balance", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f27485f = new C25113c("bankTransferInfo", (byte) 12, 3);

    /* renamed from: g */
    public static final C25113c f27486g = new C25113c("externalPaymentMethod", (byte) 12, 4);

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f27487h;

    public enum _Fields implements C25085c {
        CARD_PREVIEW(1, "cardPreview"),
        BALANCE(2, "balance"),
        BANK_TRANSFER_INFO(3, "bankTransferInfo"),
        EXTERNAL_PAYMENT_METHOD(4, "externalPaymentMethod");
        
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
                return CARD_PREVIEW;
            }
            if (i == 2) {
                return BALANCE;
            }
            if (i == 3) {
                return BANK_TRANSFER_INFO;
            }
            if (i != 4) {
                return null;
            }
            return EXTERNAL_PAYMENT_METHOD;
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

    /* renamed from: com.tranzmate.moovit.protocol.payments.MVPaymentMethod$a */
    public static /* synthetic */ class C9905a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27488a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tranzmate.moovit.protocol.payments.MVPaymentMethod$_Fields[] r0 = com.tranzmate.moovit.protocol.payments.MVPaymentMethod._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27488a = r0
                com.tranzmate.moovit.protocol.payments.MVPaymentMethod$_Fields r1 = com.tranzmate.moovit.protocol.payments.MVPaymentMethod._Fields.CARD_PREVIEW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27488a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.payments.MVPaymentMethod$_Fields r1 = com.tranzmate.moovit.protocol.payments.MVPaymentMethod._Fields.BALANCE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27488a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.payments.MVPaymentMethod$_Fields r1 = com.tranzmate.moovit.protocol.payments.MVPaymentMethod._Fields.BANK_TRANSFER_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27488a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.payments.MVPaymentMethod$_Fields r1 = com.tranzmate.moovit.protocol.payments.MVPaymentMethod._Fields.EXTERNAL_PAYMENT_METHOD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.payments.MVPaymentMethod.C9905a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CARD_PREVIEW, new FieldMetaData("cardPreview", (byte) 3, new StructMetaData(MVCardInfo.class)));
        enumMap.put(_Fields.BALANCE, new FieldMetaData("balance", (byte) 3, new StructMetaData(MVBalanceInfo.class)));
        enumMap.put(_Fields.BANK_TRANSFER_INFO, new FieldMetaData("bankTransferInfo", (byte) 3, new StructMetaData(MVBankTransferInfo.class)));
        enumMap.put(_Fields.EXTERNAL_PAYMENT_METHOD, new FieldMetaData("externalPaymentMethod", (byte) 3, new StructMetaData(MVExternalPaymentMethodInfo.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27487h = unmodifiableMap;
        FieldMetaData.m61947a(MVPaymentMethod.class, unmodifiableMap);
    }

    /* renamed from: k */
    public static C25113c m24780k(_Fields _fields) {
        int i = C9905a.f27488a[_fields.ordinal()];
        if (i == 1) {
            return f27483d;
        }
        if (i == 2) {
            return f27484e;
        }
        if (i == 3) {
            return f27485f;
        }
        if (i == 4) {
            return f27486g;
        }
        throw new IllegalArgumentException("Unknown field id " + _fields);
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
    public final /* bridge */ /* synthetic */ C25113c mo25505b(C25085c cVar) {
        return m24780k((_Fields) cVar);
    }

    public final int compareTo(Object obj) {
        MVPaymentMethod mVPaymentMethod = (MVPaymentMethod) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVPaymentMethod.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVPaymentMethod.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVPaymentMethod mVPaymentMethod;
        if (!(obj instanceof MVPaymentMethod) || (mVPaymentMethod = (MVPaymentMethod) obj) == null || this.setField_ != mVPaymentMethod.setField_ || !this.value_.equals(mVPaymentMethod.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f27482c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            int i = C9905a.f27488a[findByThriftId.ordinal()];
            if (i == 1) {
                byte b = cVar.f63356b;
                if (b == 12) {
                    MVCardInfo mVCardInfo = new MVCardInfo();
                    mVCardInfo.mo25201C1(gVar);
                    return mVCardInfo;
                }
                C25122h.m63098a(gVar, b);
                return null;
            } else if (i == 2) {
                byte b2 = cVar.f63356b;
                if (b2 == 12) {
                    MVBalanceInfo mVBalanceInfo = new MVBalanceInfo();
                    mVBalanceInfo.mo25201C1(gVar);
                    return mVBalanceInfo;
                }
                C25122h.m63098a(gVar, b2);
                return null;
            } else if (i == 3) {
                byte b3 = cVar.f63356b;
                if (b3 == 12) {
                    MVBankTransferInfo mVBankTransferInfo = new MVBankTransferInfo();
                    mVBankTransferInfo.mo25201C1(gVar);
                    return mVBankTransferInfo;
                }
                C25122h.m63098a(gVar, b3);
                return null;
            } else if (i == 4) {
                byte b4 = cVar.f63356b;
                if (b4 == 12) {
                    MVExternalPaymentMethodInfo mVExternalPaymentMethodInfo = new MVExternalPaymentMethodInfo();
                    mVExternalPaymentMethodInfo.mo25201C1(gVar);
                    return mVExternalPaymentMethodInfo;
                }
                C25122h.m63098a(gVar, b4);
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
        int i = C9905a.f27488a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVCardInfo) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVBalanceInfo) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVBankTransferInfo) this.value_).mo25202X0(gVar);
        } else if (i == 4) {
            ((MVExternalPaymentMethodInfo) this.value_).mo25202X0(gVar);
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
            int i = C9905a.f27488a[findByThriftId.ordinal()];
            if (i == 1) {
                MVCardInfo mVCardInfo = new MVCardInfo();
                mVCardInfo.mo25201C1(gVar);
                return mVCardInfo;
            } else if (i == 2) {
                MVBalanceInfo mVBalanceInfo = new MVBalanceInfo();
                mVBalanceInfo.mo25201C1(gVar);
                return mVBalanceInfo;
            } else if (i == 3) {
                MVBankTransferInfo mVBankTransferInfo = new MVBankTransferInfo();
                mVBankTransferInfo.mo25201C1(gVar);
                return mVBankTransferInfo;
            } else if (i == 4) {
                MVExternalPaymentMethodInfo mVExternalPaymentMethodInfo = new MVExternalPaymentMethodInfo();
                mVExternalPaymentMethodInfo.mo25201C1(gVar);
                return mVExternalPaymentMethodInfo;
            } else {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        int i = C9905a.f27488a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVCardInfo) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVBalanceInfo) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVBankTransferInfo) this.value_).mo25202X0(gVar);
        } else if (i == 4) {
            ((MVExternalPaymentMethodInfo) this.value_).mo25202X0(gVar);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }
}
