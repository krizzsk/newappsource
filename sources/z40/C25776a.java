package z40;

import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import com.facebook.appevents.C2342l;
import com.moovit.commons.request.BadResponseException;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.payment.account.actions.model.AccountFlowPaymentInfo;
import com.moovit.payment.account.actions.model.HtmlStep;
import com.moovit.payment.account.actions.model.InputStep;
import com.moovit.payment.account.actions.model.OptionSelectionStep;
import com.moovit.payment.account.actions.model.PaymentStep;
import com.moovit.payment.account.actions.model.PresentationType;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.common.MVOptionSelectionPresentationType;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowHtmlSectionContent;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowHtmlStep;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowInputStep;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowOptionSelectionStep;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowPaymentInfo;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowPaymentStep;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStep;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepContent;
import java.util.ArrayList;
import je0.C23715f;
import kotlin.NoWhenBranchMatchedException;
import mf0.C24362h;
import p638lr.C18262i;
import p826tr.C19752b;

/* renamed from: z40.a */
public final class C25776a {

    /* renamed from: z40.a$a */
    public /* synthetic */ class C25777a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f64302a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                com.tranzmate.moovit.protocol.common.MVOptionSelectionPresentationType[] r0 = com.tranzmate.moovit.protocol.common.MVOptionSelectionPresentationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.tranzmate.moovit.protocol.common.MVOptionSelectionPresentationType r1 = com.tranzmate.moovit.protocol.common.MVOptionSelectionPresentationType.Indicators     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.tranzmate.moovit.protocol.common.MVOptionSelectionPresentationType r1 = com.tranzmate.moovit.protocol.common.MVOptionSelectionPresentationType.Cards     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f64302a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z40.C25776a.C25777a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C23715f m64332a(MVAccountFlowStep mVAccountFlowStep) {
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        String str2;
        String str3;
        CurrencyAmount currencyAmount;
        String str4;
        Image image;
        String str5;
        String str6;
        String str7;
        String str8;
        PresentationType presentationType;
        String str9 = mVAccountFlowStep.contextId;
        String str10 = mVAccountFlowStep.analyticKey;
        MVAccountFlowStepContent mVAccountFlowStepContent = mVAccountFlowStep.stepContent;
        F f = mVAccountFlowStepContent.setField_;
        F f2 = MVAccountFlowStepContent._Fields.SELECTION_STEP;
        boolean z4 = false;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C24362h.m61210e(str9, "contextId");
            C24362h.m61210e(str10, "analyticKey");
            if (mVAccountFlowStepContent.setField_ == f2) {
                MVAccountFlowOptionSelectionStep mVAccountFlowOptionSelectionStep = (MVAccountFlowOptionSelectionStep) mVAccountFlowStepContent.value_;
                C24362h.m61210e(mVAccountFlowOptionSelectionStep, "selectionStep");
                if (mVAccountFlowOptionSelectionStep.mo29350k()) {
                    str7 = mVAccountFlowOptionSelectionStep.title;
                } else {
                    str7 = null;
                }
                if (mVAccountFlowOptionSelectionStep.mo29345g()) {
                    str8 = mVAccountFlowOptionSelectionStep.instructions;
                } else {
                    str8 = null;
                }
                String str11 = mVAccountFlowOptionSelectionStep.type;
                C24362h.m61210e(str11, "getType()");
                ArrayList<O> c = C13720d.m34273c(mVAccountFlowOptionSelectionStep.options, (C13722f) null, new C19752b(14));
                String str12 = mVAccountFlowOptionSelectionStep.buttonText;
                C24362h.m61210e(str12, "getButtonText()");
                int i = mVAccountFlowOptionSelectionStep.selectedIndex;
                MVOptionSelectionPresentationType mVOptionSelectionPresentationType = mVAccountFlowOptionSelectionStep.presentationType;
                C24362h.m61210e(mVOptionSelectionPresentationType, "getPresentationType()");
                int i2 = C25777a.f64302a[mVOptionSelectionPresentationType.ordinal()];
                if (i2 == 1) {
                    presentationType = PresentationType.INDICATORS;
                } else if (i2 == 2) {
                    presentationType = PresentationType.CARDS;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return new OptionSelectionStep(str9, str10, str11, c, str7, str8, str12, i, presentationType);
            }
            StringBuilder k = C13555b.m33972k("Cannot get field 'selectionStep' because union is currently set to ");
            k.append(MVAccountFlowStepContent.m23681k((MVAccountFlowStepContent._Fields) mVAccountFlowStepContent.setField_).f63355a);
            throw new RuntimeException(k.toString());
        }
        F f3 = MVAccountFlowStepContent._Fields.INPUT_STEP;
        if (f == f3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            C24362h.m61210e(str9, "contextId");
            C24362h.m61210e(str10, "analyticKey");
            if (mVAccountFlowStepContent.setField_ == f3) {
                MVAccountFlowInputStep mVAccountFlowInputStep = (MVAccountFlowInputStep) mVAccountFlowStepContent.value_;
                C24362h.m61210e(mVAccountFlowInputStep, "inputStep");
                if (mVAccountFlowInputStep.mo29302i()) {
                    image = C16028g.m40829g(mVAccountFlowInputStep.logo);
                } else {
                    image = null;
                }
                if (mVAccountFlowInputStep.mo29304k()) {
                    str5 = mVAccountFlowInputStep.title;
                } else {
                    str5 = null;
                }
                if (mVAccountFlowInputStep.mo29303j()) {
                    str6 = mVAccountFlowInputStep.subtitle;
                } else {
                    str6 = null;
                }
                String str13 = mVAccountFlowInputStep.handlerIdentifier;
                C24362h.m61210e(str13, "getHandlerIdentifier()");
                String str14 = mVAccountFlowInputStep.actionText;
                C24362h.m61210e(str14, "getActionText()");
                return new InputStep(str9, str10, str13, image, str5, str6, str14, C13720d.m34273c(mVAccountFlowInputStep.inputFields, (C13722f) null, new C18262i(19)));
            }
            StringBuilder k2 = C13555b.m33972k("Cannot get field 'inputStep' because union is currently set to ");
            k2.append(MVAccountFlowStepContent.m23681k((MVAccountFlowStepContent._Fields) mVAccountFlowStepContent.setField_).f63355a);
            throw new RuntimeException(k2.toString());
        }
        F f4 = MVAccountFlowStepContent._Fields.HTML_STEP;
        if (f == f4) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            C24362h.m61210e(str9, "contextId");
            C24362h.m61210e(str10, "analyticKey");
            if (mVAccountFlowStepContent.setField_ == f4) {
                MVAccountFlowHtmlStep mVAccountFlowHtmlStep = (MVAccountFlowHtmlStep) mVAccountFlowStepContent.value_;
                C24362h.m61210e(mVAccountFlowHtmlStep, "htmlStep");
                if (mVAccountFlowHtmlStep.mo29287i()) {
                    str4 = mVAccountFlowHtmlStep.title;
                } else {
                    str4 = null;
                }
                MVAccountFlowHtmlSectionContent mVAccountFlowHtmlSectionContent = mVAccountFlowHtmlStep.content;
                String str15 = mVAccountFlowHtmlStep.identifier;
                C24362h.m61210e(str15, "getIdentifier()");
                String str16 = mVAccountFlowHtmlSectionContent.html;
                C24362h.m61210e(str16, "content.html");
                String str17 = mVAccountFlowHtmlStep.confirmButtonCaption;
                C24362h.m61210e(str17, "getConfirmButtonCaption()");
                return new HtmlStep(str9, str10, str15, str4, str16, str17);
            }
            StringBuilder k3 = C13555b.m33972k("Cannot get field 'htmlStep' because union is currently set to ");
            k3.append(MVAccountFlowStepContent.m23681k((MVAccountFlowStepContent._Fields) mVAccountFlowStepContent.setField_).f63355a);
            throw new RuntimeException(k3.toString());
        }
        F f5 = MVAccountFlowStepContent._Fields.PAYMENT_STEP;
        if (f == f5) {
            z4 = true;
        }
        if (z4) {
            C24362h.m61210e(str9, "contextId");
            C24362h.m61210e(str10, "analyticKey");
            if (mVAccountFlowStepContent.setField_ == f5) {
                MVAccountFlowPaymentStep mVAccountFlowPaymentStep = (MVAccountFlowPaymentStep) mVAccountFlowStepContent.value_;
                C24362h.m61210e(mVAccountFlowPaymentStep, "paymentStep");
                if (mVAccountFlowPaymentStep.mo29375h()) {
                    str = mVAccountFlowPaymentStep.header;
                } else {
                    str = null;
                }
                ArrayList<O> c2 = C13720d.m34273c(mVAccountFlowPaymentStep.products, (C13722f) null, new C2342l(18));
                if (mVAccountFlowPaymentStep.mo29374g()) {
                    str2 = mVAccountFlowPaymentStep.disclaimerHtml;
                } else {
                    str2 = null;
                }
                MVAccountFlowPaymentInfo mVAccountFlowPaymentInfo = mVAccountFlowPaymentStep.paymentInfo;
                C24362h.m61210e(mVAccountFlowPaymentInfo, "getPaymentInfo()");
                if (mVAccountFlowPaymentInfo.mo29365f()) {
                    str3 = mVAccountFlowPaymentInfo.discountContextId;
                } else {
                    str3 = null;
                }
                String str18 = mVAccountFlowPaymentInfo.paymentContext;
                C24362h.m61210e(str18, "getPaymentContext()");
                String str19 = mVAccountFlowPaymentInfo.paymentDescription;
                C24362h.m61210e(str19, "getPaymentDescription()");
                AccountFlowPaymentInfo accountFlowPaymentInfo = new AccountFlowPaymentInfo(str18, str19, str3);
                if (mVAccountFlowPaymentStep.mo29380l()) {
                    currencyAmount = C13749c.m34318d(mVAccountFlowPaymentStep.totalPrice);
                } else {
                    currencyAmount = null;
                }
                String str20 = mVAccountFlowPaymentStep.identifier;
                C24362h.m61210e(str20, "getIdentifier()");
                String str21 = mVAccountFlowPaymentStep.confirmButtonCaption;
                C24362h.m61210e(str21, "getConfirmButtonCaption()");
                return new PaymentStep(str9, str10, str20, str, c2, str2, str21, accountFlowPaymentInfo, currencyAmount);
            }
            StringBuilder k4 = C13555b.m33972k("Cannot get field 'paymentStep' because union is currently set to ");
            k4.append(MVAccountFlowStepContent.m23681k((MVAccountFlowStepContent._Fields) mVAccountFlowStepContent.setField_).f63355a);
            throw new RuntimeException(k4.toString());
        }
        throw new BadResponseException("Unsupported step result");
    }
}
