package h60;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.tranzmate.moovit.protocol.payments.MVCompleteQuestionStepRequest;
import v40.C25754i;

/* renamed from: h60.i */
public final class C17322i extends C13778r<C17322i, C17325j, MVCompleteQuestionStepRequest> {

    /* renamed from: w */
    public final String f44710w;

    /* renamed from: x */
    public final String f44711x;

    /* renamed from: y */
    public final String f44712y;

    public C17322i(C13752e eVar, String str, String str2, String str3) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_complete_question_step, C17325j.class);
        C21100e.m49373x(str, "paymentContext");
        this.f44710w = str;
        C21100e.m49373x(str2, "questionId");
        this.f44711x = str2;
        C21100e.m49373x(str3, "selectedButtonId");
        this.f44712y = str3;
        RO mVCompleteQuestionStepRequest = new MVCompleteQuestionStepRequest();
        mVCompleteQuestionStepRequest.paymentContext = str;
        mVCompleteQuestionStepRequest.questionId = str2;
        mVCompleteQuestionStepRequest.selectedButtonId = str3;
        this.f33922v = mVCompleteQuestionStepRequest;
    }
}
