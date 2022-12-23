package com.tranzmate.moovit.protocol.paymentaccount;

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

public class MVAccountFlowStepCompletedResponse extends TUnion<MVAccountFlowStepCompletedResponse, _Fields> {

    /* renamed from: c */
    public static final C17394d0 f26989c = new C17394d0("MVAccountFlowStepCompletedResponse");

    /* renamed from: d */
    public static final C25113c f26990d = new C25113c("nextStep", (byte) 12, 1);

    /* renamed from: e */
    public static final C25113c f26991e = new C25113c("missingSteps", (byte) 12, 2);

    /* renamed from: f */
    public static final C25113c f26992f = new C25113c("wizardCompleted", (byte) 12, 3);

    /* renamed from: g */
    public static final Map<_Fields, FieldMetaData> f26993g;

    public enum _Fields implements C25085c {
        NEXT_STEP(1, "nextStep"),
        MISSING_STEPS(2, "missingSteps"),
        WIZARD_COMPLETED(3, "wizardCompleted");
        
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
                return NEXT_STEP;
            }
            if (i == 2) {
                return MISSING_STEPS;
            }
            if (i != 3) {
                return null;
            }
            return WIZARD_COMPLETED;
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

    /* renamed from: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepCompletedResponse$a */
    public static /* synthetic */ class C9530a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26994a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepCompletedResponse$_Fields[] r0 = com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepCompletedResponse._Fields.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26994a = r0
                com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepCompletedResponse$_Fields r1 = com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepCompletedResponse._Fields.NEXT_STEP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26994a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepCompletedResponse$_Fields r1 = com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepCompletedResponse._Fields.MISSING_STEPS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26994a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepCompletedResponse$_Fields r1 = com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepCompletedResponse._Fields.WIZARD_COMPLETED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepCompletedResponse.C9530a.<clinit>():void");
        }
    }

    static {
        EnumMap enumMap = new EnumMap(_Fields.class);
        enumMap.put(_Fields.NEXT_STEP, new FieldMetaData("nextStep", (byte) 3, new StructMetaData(MVAccountFlowStep.class)));
        enumMap.put(_Fields.MISSING_STEPS, new FieldMetaData("missingSteps", (byte) 3, new StructMetaData(MVMissingPaymentRegistrationSteps.class)));
        enumMap.put(_Fields.WIZARD_COMPLETED, new FieldMetaData("wizardCompleted", (byte) 3, new StructMetaData(MVAccountFlowWizardCompleted.class)));
        Map<_Fields, FieldMetaData> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        f26993g = unmodifiableMap;
        FieldMetaData.m61947a(MVAccountFlowStepCompletedResponse.class, unmodifiableMap);
    }

    /* renamed from: k */
    public static C25113c m23673k(_Fields _fields) {
        int i = C9530a.f26994a[_fields.ordinal()];
        if (i == 1) {
            return f26990d;
        }
        if (i == 2) {
            return f26991e;
        }
        if (i == 3) {
            return f26992f;
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
        return m23673k((_Fields) cVar);
    }

    public final int compareTo(Object obj) {
        MVAccountFlowStepCompletedResponse mVAccountFlowStepCompletedResponse = (MVAccountFlowStepCompletedResponse) obj;
        int compareTo = ((Comparable) this.setField_).compareTo((Comparable) mVAccountFlowStepCompletedResponse.setField_);
        if (compareTo == 0) {
            return C25082a.m62842f(this.value_, mVAccountFlowStepCompletedResponse.value_);
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        MVAccountFlowStepCompletedResponse mVAccountFlowStepCompletedResponse;
        if (!(obj instanceof MVAccountFlowStepCompletedResponse) || (mVAccountFlowStepCompletedResponse = (MVAccountFlowStepCompletedResponse) obj) == null || this.setField_ != mVAccountFlowStepCompletedResponse.setField_ || !this.value_.equals(mVAccountFlowStepCompletedResponse.value_)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final C17394d0 mo25508f() {
        return f26989c;
    }

    /* renamed from: g */
    public final Object mo25509g(C25121g gVar, C25113c cVar) throws TException {
        _Fields findByThriftId = _Fields.findByThriftId(cVar.f63357c);
        if (findByThriftId != null) {
            int i = C9530a.f26994a[findByThriftId.ordinal()];
            if (i == 1) {
                byte b = cVar.f63356b;
                if (b == 12) {
                    MVAccountFlowStep mVAccountFlowStep = new MVAccountFlowStep();
                    mVAccountFlowStep.mo25201C1(gVar);
                    return mVAccountFlowStep;
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
                    MVAccountFlowWizardCompleted mVAccountFlowWizardCompleted = new MVAccountFlowWizardCompleted();
                    mVAccountFlowWizardCompleted.mo25201C1(gVar);
                    return mVAccountFlowWizardCompleted;
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
        int i = C9530a.f26994a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVAccountFlowStep) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVMissingPaymentRegistrationSteps) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVAccountFlowWizardCompleted) this.value_).mo25202X0(gVar);
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
            int i = C9530a.f26994a[findByThriftId.ordinal()];
            if (i == 1) {
                MVAccountFlowStep mVAccountFlowStep = new MVAccountFlowStep();
                mVAccountFlowStep.mo25201C1(gVar);
                return mVAccountFlowStep;
            } else if (i == 2) {
                return C13437d.m33702g(gVar);
            } else {
                if (i == 3) {
                    MVAccountFlowWizardCompleted mVAccountFlowWizardCompleted = new MVAccountFlowWizardCompleted();
                    mVAccountFlowWizardCompleted.mo25201C1(gVar);
                    return mVAccountFlowWizardCompleted;
                }
                throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
            }
        } else {
            throw new TProtocolException(C16759e.m42349e("Couldn't find a field with field id ", s));
        }
    }

    /* renamed from: j */
    public final void mo25513j(C25121g gVar) throws TException {
        int i = C9530a.f26994a[((_Fields) this.setField_).ordinal()];
        if (i == 1) {
            ((MVAccountFlowStep) this.value_).mo25202X0(gVar);
        } else if (i == 2) {
            ((MVMissingPaymentRegistrationSteps) this.value_).mo25202X0(gVar);
        } else if (i == 3) {
            ((MVAccountFlowWizardCompleted) this.value_).mo25202X0(gVar);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot write union with unknown field ");
            k.append(this.setField_);
            throw new IllegalStateException(k.toString());
        }
    }
}
