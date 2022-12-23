package z40;

import c70.C13746a;
import c70.C13780t;
import com.appsflyer.internal.referrer.Payload;
import com.moovit.commons.request.BadResponseException;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStep;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepCompletedResponse;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowWizardCompleted;
import com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps;
import h60.C17353s0;
import je0.C23715f;
import mf0.C24362h;
import org.apache.thrift.TBase;
import y40.C25772a;

/* renamed from: z40.e */
public final class C25781e extends C13780t<C25780d, C25781e, MVAccountFlowStepCompletedResponse> {

    /* renamed from: m */
    public C23715f f64304m;

    /* renamed from: n */
    public PaymentRegistrationInstructions f64305n;

    /* renamed from: o */
    public C25772a f64306o;

    public C25781e() {
        super(MVAccountFlowStepCompletedResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) {
        boolean z;
        boolean z2;
        String str;
        MVAccountFlowStepCompletedResponse mVAccountFlowStepCompletedResponse = (MVAccountFlowStepCompletedResponse) tBase;
        C24362h.m61211f((C25780d) aVar, "request");
        C24362h.m61211f(mVAccountFlowStepCompletedResponse, Payload.RESPONSE);
        F f = mVAccountFlowStepCompletedResponse.setField_;
        F f2 = MVAccountFlowStepCompletedResponse._Fields.NEXT_STEP;
        boolean z3 = true;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            F f3 = MVAccountFlowStepCompletedResponse._Fields.MISSING_STEPS;
            if (f == f3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                F f4 = MVAccountFlowStepCompletedResponse._Fields.WIZARD_COMPLETED;
                if (f != f4) {
                    z3 = false;
                }
                if (!z3) {
                    throw new BadResponseException("Unsupported step result");
                } else if (f == f4) {
                    MVAccountFlowWizardCompleted mVAccountFlowWizardCompleted = (MVAccountFlowWizardCompleted) mVAccountFlowStepCompletedResponse.value_;
                    C24362h.m61210e(mVAccountFlowWizardCompleted, "wizardCompleted");
                    String str2 = null;
                    if (mVAccountFlowWizardCompleted.mo29433g()) {
                        str = mVAccountFlowWizardCompleted.toastMessage;
                    } else {
                        str = null;
                    }
                    if (mVAccountFlowWizardCompleted.mo29432f()) {
                        str2 = mVAccountFlowWizardCompleted.deeplink;
                    }
                    this.f64306o = new C25772a(str, str2);
                } else {
                    StringBuilder k = C13555b.m33972k("Cannot get field 'wizardCompleted' because union is currently set to ");
                    k.append(MVAccountFlowStepCompletedResponse.m23673k((MVAccountFlowStepCompletedResponse._Fields) mVAccountFlowStepCompletedResponse.setField_).f63355a);
                    throw new RuntimeException(k.toString());
                }
            } else if (f == f3) {
                this.f64305n = C17353s0.m43400n((MVMissingPaymentRegistrationSteps) mVAccountFlowStepCompletedResponse.value_);
            } else {
                StringBuilder k2 = C13555b.m33972k("Cannot get field 'missingSteps' because union is currently set to ");
                k2.append(MVAccountFlowStepCompletedResponse.m23673k((MVAccountFlowStepCompletedResponse._Fields) mVAccountFlowStepCompletedResponse.setField_).f63355a);
                throw new RuntimeException(k2.toString());
            }
        } else if (f == f2) {
            MVAccountFlowStep mVAccountFlowStep = (MVAccountFlowStep) mVAccountFlowStepCompletedResponse.value_;
            C24362h.m61210e(mVAccountFlowStep, "nextStep");
            this.f64304m = C25776a.m64332a(mVAccountFlowStep);
        } else {
            StringBuilder k3 = C13555b.m33972k("Cannot get field 'nextStep' because union is currently set to ");
            k3.append(MVAccountFlowStepCompletedResponse.m23673k((MVAccountFlowStepCompletedResponse._Fields) mVAccountFlowStepCompletedResponse.setField_).f63355a);
            throw new RuntimeException(k3.toString());
        }
    }
}
