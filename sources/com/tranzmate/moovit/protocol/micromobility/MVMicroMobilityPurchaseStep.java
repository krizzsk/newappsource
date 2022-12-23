package com.tranzmate.moovit.protocol.micromobility;

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

public class MVMicroMobilityPurchaseStep extends TUnion<MVMicroMobilityPurchaseStep, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f26688c = new C17394d0("MVMicroMobilityPurchaseStep");

    /* renamed from: d */
    public static final C25113c f26689d = new C25113c("confirmation", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f26690e = new C25113c("qrCode", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f26691f = new C25113c("pinCode", (byte) 12, 3);

    /* renamed from: g */
    public static final C25113c f26692g = new C25113c("optionSelection", (byte) 12, 4);

    /* renamed from: h */
    public static final C25113c f26693h = new C25113c("inputs", (byte) 12, 5);

    /* renamed from: i */
    public static final Map<_Fields, FieldMetaData> f26694i;

    public enum _Fields implements C25085c {
        CONFIRMATION(1, "confirmation"),
        QR_CODE(2, "qrCode"),
        PIN_CODE(3, "pinCode"),
        OPTION_SELECTION(4, "optionSelection"),
        INPUTS(5, "inputs");
        
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
                return CONFIRMATION;
            }
            if (i == 2) {
                return QR_CODE;
            }
            if (i == 3) {
                return PIN_CODE;
            }
            if (i == 4) {
                return OPTION_SELECTION;
            }
            if (i != 5) {
                return null;
            }
            return INPUTS;
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

    /* renamed from: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStep$a */
    public static /* synthetic */ class C9322a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26695a;

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
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStep$_Fields[] r0 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStep._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26695a = r0
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStep$_Fields r1 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStep._Fields.CONFIRMATION     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26695a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStep$_Fields r1 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStep._Fields.QR_CODE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26695a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStep$_Fields r1 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStep._Fields.PIN_CODE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26695a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStep$_Fields r1 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStep._Fields.OPTION_SELECTION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26695a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStep$_Fields r1 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStep._Fields.INPUTS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseStep.C9322a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.CONFIRMATION, new FieldMetaData("confirmation", (byte) 3, new StructMetaData(MVMicroMobilityPurchaseConfirmationStep.class)));
        enumMap.put(_Fields.QR_CODE, new FieldMetaData("qrCode", (byte) 3, new StructMetaData(MVMicroMobilityPurchaseQrCodeStep.class)));
        enumMap.put(_Fields.PIN_CODE, new FieldMetaData("pinCode", (byte) 3, new StructMetaData(MVMicroMobilityPurchasePinCodeStep.class)));
        enumMap.put(_Fields.OPTION_SELECTION, new FieldMetaData("optionSelection", (byte) 3, new StructMetaData(MVMicroMobilityPurchaseOptionSelectionStep.class)));
        enumMap.put(_Fields.INPUTS, new FieldMetaData("inputs", (byte) 3, new StructMetaData(MVMicroMobilityPurchaseInputStep.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26694i = unmodifiableMap;
        FieldMetaData.m61947a(MVMicroMobilityPurchaseStep.class, unmodifiableMap);
    }

    /* renamed from: l */
    public static C25113c m23025l(_Fields _fields) {
        int i = C9322a.f26695a[_fields.ordinal()];
        if (i == 1) {
            return f26689d;
        }
        if (i == 2) {
            return f26690e;
        }
        if (i == 3) {
            return f26691f;
        }
        if (i == 4) {
            return f26692g;
        }
        if (i == 5) {
            return f26693h;
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
        return m23025l((_Fields) cVar);
    }

    public final int compareTo(Object obj) {
        MVMicroMobilityPurchaseStep mVMicroMobilityPurchaseStep = (MVMicroMobilityPurchaseStep) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVMicroMobilityPurchaseStep.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVMicroMobilityPurchaseStep.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MVMicroMobilityPurchaseStep) {
            return mo28928k((MVMicroMobilityPurchaseStep) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f26688c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            int i = C9322a.f26695a[findByThriftId.ordinal()];
            if (i == 1) {
                byte b = cVar.f63356b;
                if (b == 12) {
                    MVMicroMobilityPurchaseConfirmationStep mVMicroMobilityPurchaseConfirmationStep = new MVMicroMobilityPurchaseConfirmationStep();
                    mVMicroMobilityPurchaseConfirmationStep.mo25201C1(gVar);
                    return mVMicroMobilityPurchaseConfirmationStep;
                }
                C25122h.m63098a(gVar, b);
                return null;
            } else if (i == 2) {
                byte b2 = cVar.f63356b;
                if (b2 == 12) {
                    MVMicroMobilityPurchaseQrCodeStep mVMicroMobilityPurchaseQrCodeStep = new MVMicroMobilityPurchaseQrCodeStep();
                    mVMicroMobilityPurchaseQrCodeStep.mo25201C1(gVar);
                    return mVMicroMobilityPurchaseQrCodeStep;
                }
                C25122h.m63098a(gVar, b2);
                return null;
            } else if (i == 3) {
                byte b3 = cVar.f63356b;
                if (b3 == 12) {
                    MVMicroMobilityPurchasePinCodeStep mVMicroMobilityPurchasePinCodeStep = new MVMicroMobilityPurchasePinCodeStep();
                    mVMicroMobilityPurchasePinCodeStep.mo25201C1(gVar);
                    return mVMicroMobilityPurchasePinCodeStep;
                }
                C25122h.m63098a(gVar, b3);
                return null;
            } else if (i == 4) {
                byte b4 = cVar.f63356b;
                if (b4 == 12) {
                    MVMicroMobilityPurchaseOptionSelectionStep mVMicroMobilityPurchaseOptionSelectionStep = new MVMicroMobilityPurchaseOptionSelectionStep();
                    mVMicroMobilityPurchaseOptionSelectionStep.mo25201C1(gVar);
                    return mVMicroMobilityPurchaseOptionSelectionStep;
                }
                C25122h.m63098a(gVar, b4);
                return null;
            } else if (i == 5) {
                byte b5 = cVar.f63356b;
                if (b5 == 12) {
                    MVMicroMobilityPurchaseInputStep mVMicroMobilityPurchaseInputStep = new MVMicroMobilityPurchaseInputStep();
                    mVMicroMobilityPurchaseInputStep.mo25201C1(gVar);
                    return mVMicroMobilityPurchaseInputStep;
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
        int i = C9322a.f26695a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVMicroMobilityPurchaseConfirmationStep) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVMicroMobilityPurchaseQrCodeStep) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVMicroMobilityPurchasePinCodeStep) this.value_).mo25202X0(gVar);
        } else if (i == 4) {
            ((MVMicroMobilityPurchaseOptionSelectionStep) this.value_).mo25202X0(gVar);
        } else if (i == 5) {
            ((MVMicroMobilityPurchaseInputStep) this.value_).mo25202X0(gVar);
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
            int i = C9322a.f26695a[findByThriftId.ordinal()];
            if (i == 1) {
                MVMicroMobilityPurchaseConfirmationStep mVMicroMobilityPurchaseConfirmationStep = new MVMicroMobilityPurchaseConfirmationStep();
                mVMicroMobilityPurchaseConfirmationStep.mo25201C1(gVar);
                return mVMicroMobilityPurchaseConfirmationStep;
            } else if (i == 2) {
                MVMicroMobilityPurchaseQrCodeStep mVMicroMobilityPurchaseQrCodeStep = new MVMicroMobilityPurchaseQrCodeStep();
                mVMicroMobilityPurchaseQrCodeStep.mo25201C1(gVar);
                return mVMicroMobilityPurchaseQrCodeStep;
            } else if (i == 3) {
                MVMicroMobilityPurchasePinCodeStep mVMicroMobilityPurchasePinCodeStep = new MVMicroMobilityPurchasePinCodeStep();
                mVMicroMobilityPurchasePinCodeStep.mo25201C1(gVar);
                return mVMicroMobilityPurchasePinCodeStep;
            } else if (i == 4) {
                MVMicroMobilityPurchaseOptionSelectionStep mVMicroMobilityPurchaseOptionSelectionStep = new MVMicroMobilityPurchaseOptionSelectionStep();
                mVMicroMobilityPurchaseOptionSelectionStep.mo25201C1(gVar);
                return mVMicroMobilityPurchaseOptionSelectionStep;
            } else if (i == 5) {
                MVMicroMobilityPurchaseInputStep mVMicroMobilityPurchaseInputStep = new MVMicroMobilityPurchaseInputStep();
                mVMicroMobilityPurchaseInputStep.mo25201C1(gVar);
                return mVMicroMobilityPurchaseInputStep;
            } else {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        int i = C9322a.f26695a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVMicroMobilityPurchaseConfirmationStep) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVMicroMobilityPurchaseQrCodeStep) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVMicroMobilityPurchasePinCodeStep) this.value_).mo25202X0(gVar);
        } else if (i == 4) {
            ((MVMicroMobilityPurchaseOptionSelectionStep) this.value_).mo25202X0(gVar);
        } else if (i == 5) {
            ((MVMicroMobilityPurchaseInputStep) this.value_).mo25202X0(gVar);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }

    /* renamed from: k */
    public final boolean mo28928k(MVMicroMobilityPurchaseStep mVMicroMobilityPurchaseStep) {
        if (mVMicroMobilityPurchaseStep == null || this.setField_ != mVMicroMobilityPurchaseStep.setField_ || !this.value_.equals(mVMicroMobilityPurchaseStep.value_)) {
            return false;
        }
        return true;
    }
}
