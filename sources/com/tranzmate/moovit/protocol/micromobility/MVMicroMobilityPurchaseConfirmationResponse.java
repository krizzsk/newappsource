package com.tranzmate.moovit.protocol.micromobility;

import com.tranzmate.moovit.protocol.payments.MVDepositInstructions;
import com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps;
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
import p358af.C13437d;
import p531he.C17394d0;
import ui0.C25082a;
import ui0.C25085c;
import vi0.C25112b;
import vi0.C25113c;
import vi0.C25121g;
import vi0.C25122h;
import xi0.C25276a;

public class MVMicroMobilityPurchaseConfirmationResponse extends TUnion<MVMicroMobilityPurchaseConfirmationResponse, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f26593c = new C17394d0("MVMicroMobilityPurchaseConfirmationResponse");

    /* renamed from: d */
    public static final C25113c f26594d = new C25113c("result", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f26595e = new C25113c("missingSteps", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f26596f = new C25113c("depositInstructions", (byte) 12, 3);

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26597g;

    public enum _Fields implements C25085c {
        RESULT(1, "result"),
        MISSING_STEPS(2, "missingSteps"),
        DEPOSIT_INSTRUCTIONS(3, "depositInstructions");
        
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
                return RESULT;
            }
            if (i == 2) {
                return MISSING_STEPS;
            }
            if (i != 3) {
                return null;
            }
            return DEPOSIT_INSTRUCTIONS;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationResponse$a */
    public static /* synthetic */ class C9260a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26598a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationResponse$_Fields[] r0 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationResponse._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26598a = r0
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationResponse$_Fields r1 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationResponse._Fields.RESULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26598a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationResponse$_Fields r1 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationResponse._Fields.MISSING_STEPS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26598a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationResponse$_Fields r1 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationResponse._Fields.DEPOSIT_INSTRUCTIONS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationResponse.C9260a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.RESULT, new FieldMetaData("result", (byte) 3, new StructMetaData(MVMicroMobilityPurchaseConfirmationResult.class)));
        enumMap.put(_Fields.MISSING_STEPS, new FieldMetaData("missingSteps", (byte) 3, new StructMetaData(MVMissingPaymentRegistrationSteps.class)));
        enumMap.put(_Fields.DEPOSIT_INSTRUCTIONS, new FieldMetaData("depositInstructions", (byte) 3, new StructMetaData(MVDepositInstructions.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26597g = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityPurchaseConfirmationResponse.class, unmodifiableMap);
    }

    /* renamed from: k */
    public static C25113c m22837k(_Fields _fields) {
        int i = C9260a.f26598a[_fields.ordinal()];
        if (i == 1) {
            return f26594d;
        }
        if (i == 2) {
            return f26595e;
        }
        if (i == 3) {
            return f26596f;
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
        return m22837k((_Fields) cVar);
    }

    public final int compareTo(Object obj) {
        MVMicroMobilityPurchaseConfirmationResponse mVMicroMobilityPurchaseConfirmationResponse = (MVMicroMobilityPurchaseConfirmationResponse) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVMicroMobilityPurchaseConfirmationResponse.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVMicroMobilityPurchaseConfirmationResponse.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVMicroMobilityPurchaseConfirmationResponse mVMicroMobilityPurchaseConfirmationResponse;
        if (!(obj instanceof MVMicroMobilityPurchaseConfirmationResponse) || (mVMicroMobilityPurchaseConfirmationResponse = (MVMicroMobilityPurchaseConfirmationResponse) obj) == null || this.setField_ != mVMicroMobilityPurchaseConfirmationResponse.setField_ || !this.value_.equals(mVMicroMobilityPurchaseConfirmationResponse.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f26593c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            int i = C9260a.f26598a[findByThriftId.ordinal()];
            if (i == 1) {
                byte b = cVar.f63356b;
                if (b == 12) {
                    MVMicroMobilityPurchaseConfirmationResult mVMicroMobilityPurchaseConfirmationResult = new MVMicroMobilityPurchaseConfirmationResult();
                    mVMicroMobilityPurchaseConfirmationResult.mo25201C1(gVar);
                    return mVMicroMobilityPurchaseConfirmationResult;
                }
                C25122h.m63098a(gVar, b);
                return null;
            } else if (i == 2) {
                byte b2 = cVar.f63356b;
                if (b2 == 12) {
                    return C13437d.m33702g(gVar);
                }
                C25122h.m63098a(gVar, b2);
                return null;
            } else if (i == 3) {
                byte b3 = cVar.f63356b;
                if (b3 == 12) {
                    MVDepositInstructions mVDepositInstructions = new MVDepositInstructions();
                    mVDepositInstructions.mo25201C1(gVar);
                    return mVDepositInstructions;
                }
                C25122h.m63098a(gVar, b3);
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
        int i = C9260a.f26598a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVMicroMobilityPurchaseConfirmationResult) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVMissingPaymentRegistrationSteps) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVDepositInstructions) this.value_).mo25202X0(gVar);
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
            int i = C9260a.f26598a[findByThriftId.ordinal()];
            if (i == 1) {
                MVMicroMobilityPurchaseConfirmationResult mVMicroMobilityPurchaseConfirmationResult = new MVMicroMobilityPurchaseConfirmationResult();
                mVMicroMobilityPurchaseConfirmationResult.mo25201C1(gVar);
                return mVMicroMobilityPurchaseConfirmationResult;
            } else if (i == 2) {
                return C13437d.m33702g(gVar);
            } else {
                if (i == 3) {
                    MVDepositInstructions mVDepositInstructions = new MVDepositInstructions();
                    mVDepositInstructions.mo25201C1(gVar);
                    return mVDepositInstructions;
                }
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        int i = C9260a.f26598a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVMicroMobilityPurchaseConfirmationResult) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVMissingPaymentRegistrationSteps) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVDepositInstructions) this.value_).mo25202X0(gVar);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }
}
