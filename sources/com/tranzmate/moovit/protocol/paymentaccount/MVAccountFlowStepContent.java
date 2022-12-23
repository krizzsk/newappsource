package com.tranzmate.moovit.protocol.paymentaccount;

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

public class MVAccountFlowStepContent extends TUnion<MVAccountFlowStepContent, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f26995c = new C17394d0("MVAccountFlowStepContent");

    /* renamed from: d */
    public static final C25113c f26996d = new C25113c("selectionStep", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f26997e = new C25113c("inputStep", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f26998f = new C25113c("htmlStep", (byte) 12, 3);

    /* renamed from: g */
    public static final C25113c f26999g = new C25113c("paymentStep", (byte) 12, 4);

    /* renamed from: h */
    public static final Map<_Fields, FieldMetaData> f27000h;

    public enum _Fields implements C25085c {
        SELECTION_STEP(1, "selectionStep"),
        INPUT_STEP(2, "inputStep"),
        HTML_STEP(3, "htmlStep"),
        PAYMENT_STEP(4, "paymentStep");
        
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
                return SELECTION_STEP;
            }
            if (i == 2) {
                return INPUT_STEP;
            }
            if (i == 3) {
                return HTML_STEP;
            }
            if (i != 4) {
                return null;
            }
            return PAYMENT_STEP;
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

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepContent$a */
    public static /* synthetic */ class C9531a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27001a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepContent$_Fields[] r0 = com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepContent._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27001a = r0
                com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepContent$_Fields r1 = com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepContent._Fields.SELECTION_STEP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27001a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepContent$_Fields r1 = com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepContent._Fields.INPUT_STEP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27001a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepContent$_Fields r1 = com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepContent._Fields.HTML_STEP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27001a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepContent$_Fields r1 = com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepContent._Fields.PAYMENT_STEP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepContent.C9531a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.SELECTION_STEP, new FieldMetaData("selectionStep", (byte) 3, new StructMetaData(MVAccountFlowOptionSelectionStep.class)));
        enumMap.put(_Fields.INPUT_STEP, new FieldMetaData("inputStep", (byte) 3, new StructMetaData(MVAccountFlowInputStep.class)));
        enumMap.put(_Fields.HTML_STEP, new FieldMetaData("htmlStep", (byte) 3, new StructMetaData(MVAccountFlowHtmlStep.class)));
        enumMap.put(_Fields.PAYMENT_STEP, new FieldMetaData("paymentStep", (byte) 3, new StructMetaData(MVAccountFlowPaymentStep.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f27000h = unmodifiableMap;
        FieldMetaData.m61947a(MVAccountFlowStepContent.class, unmodifiableMap);
    }

    /* renamed from: k */
    public static C25113c m23681k(_Fields _fields) {
        int i = C9531a.f27001a[_fields.ordinal()];
        if (i == 1) {
            return f26996d;
        }
        if (i == 2) {
            return f26997e;
        }
        if (i == 3) {
            return f26998f;
        }
        if (i == 4) {
            return f26999g;
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
        return m23681k((_Fields) cVar);
    }

    public final int compareTo(Object obj) {
        MVAccountFlowStepContent mVAccountFlowStepContent = (MVAccountFlowStepContent) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVAccountFlowStepContent.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVAccountFlowStepContent.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVAccountFlowStepContent mVAccountFlowStepContent;
        if (!(obj instanceof MVAccountFlowStepContent) || (mVAccountFlowStepContent = (MVAccountFlowStepContent) obj) == null || this.setField_ != mVAccountFlowStepContent.setField_ || !this.value_.equals(mVAccountFlowStepContent.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f26995c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            int i = C9531a.f27001a[findByThriftId.ordinal()];
            if (i == 1) {
                byte b = cVar.f63356b;
                if (b == 12) {
                    MVAccountFlowOptionSelectionStep mVAccountFlowOptionSelectionStep = new MVAccountFlowOptionSelectionStep();
                    mVAccountFlowOptionSelectionStep.mo25201C1(gVar);
                    return mVAccountFlowOptionSelectionStep;
                }
                C25122h.m63098a(gVar, b);
                return null;
            } else if (i == 2) {
                byte b2 = cVar.f63356b;
                if (b2 == 12) {
                    MVAccountFlowInputStep mVAccountFlowInputStep = new MVAccountFlowInputStep();
                    mVAccountFlowInputStep.mo25201C1(gVar);
                    return mVAccountFlowInputStep;
                }
                C25122h.m63098a(gVar, b2);
                return null;
            } else if (i == 3) {
                byte b3 = cVar.f63356b;
                if (b3 == 12) {
                    MVAccountFlowHtmlStep mVAccountFlowHtmlStep = new MVAccountFlowHtmlStep();
                    mVAccountFlowHtmlStep.mo25201C1(gVar);
                    return mVAccountFlowHtmlStep;
                }
                C25122h.m63098a(gVar, b3);
                return null;
            } else if (i == 4) {
                byte b4 = cVar.f63356b;
                if (b4 == 12) {
                    MVAccountFlowPaymentStep mVAccountFlowPaymentStep = new MVAccountFlowPaymentStep();
                    mVAccountFlowPaymentStep.mo25201C1(gVar);
                    return mVAccountFlowPaymentStep;
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
        int i = C9531a.f27001a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVAccountFlowOptionSelectionStep) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVAccountFlowInputStep) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVAccountFlowHtmlStep) this.value_).mo25202X0(gVar);
        } else if (i == 4) {
            ((MVAccountFlowPaymentStep) this.value_).mo25202X0(gVar);
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
            int i = C9531a.f27001a[findByThriftId.ordinal()];
            if (i == 1) {
                MVAccountFlowOptionSelectionStep mVAccountFlowOptionSelectionStep = new MVAccountFlowOptionSelectionStep();
                mVAccountFlowOptionSelectionStep.mo25201C1(gVar);
                return mVAccountFlowOptionSelectionStep;
            } else if (i == 2) {
                MVAccountFlowInputStep mVAccountFlowInputStep = new MVAccountFlowInputStep();
                mVAccountFlowInputStep.mo25201C1(gVar);
                return mVAccountFlowInputStep;
            } else if (i == 3) {
                MVAccountFlowHtmlStep mVAccountFlowHtmlStep = new MVAccountFlowHtmlStep();
                mVAccountFlowHtmlStep.mo25201C1(gVar);
                return mVAccountFlowHtmlStep;
            } else if (i == 4) {
                MVAccountFlowPaymentStep mVAccountFlowPaymentStep = new MVAccountFlowPaymentStep();
                mVAccountFlowPaymentStep.mo25201C1(gVar);
                return mVAccountFlowPaymentStep;
            } else {
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        int i = C9531a.f27001a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVAccountFlowOptionSelectionStep) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVAccountFlowInputStep) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVAccountFlowHtmlStep) this.value_).mo25202X0(gVar);
        } else if (i == 4) {
            ((MVAccountFlowPaymentStep) this.value_).mo25202X0(gVar);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }
}
