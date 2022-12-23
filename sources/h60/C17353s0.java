package h60;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13749c;
import com.facebook.appevents.C2342l;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.utils.LinkedText;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.balance.BalancePaymentMethod;
import com.moovit.payment.account.balance.BalancePreview;
import com.moovit.payment.account.bank.BankPaymentMethod;
import com.moovit.payment.account.bank.BankPreview;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.account.deposit.DepositInstructions;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethod;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethodPreview;
import com.moovit.payment.account.model.PaymentAccountContextStatus;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.account.paymentmethod.PaymentMethodId;
import com.moovit.payment.account.paymentmethod.PaymentMethodStatus;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.payment.clearance.ClearanceProviderType;
import com.moovit.payment.clearance.model.ClearanceProviderInstructions;
import com.moovit.payment.clearance.model.CreditCardFields;
import com.moovit.payment.confirmation.options.PaymentOptions;
import com.moovit.payment.confirmation.summary.PaymentSummaryInfo;
import com.moovit.payment.confirmation.summary.discounts.DiscountInfo;
import com.moovit.payment.gateway.PaymentGatewayInstructions;
import com.moovit.payment.gateway.cash.CashGateway;
import com.moovit.payment.gateway.clearanceprovider.ClearanceProviderGateway;
import com.moovit.payment.gateway.googlepay.GooglePayGateway;
import com.moovit.payment.invoices.model.InvoicePeriod;
import com.moovit.payment.registration.AccountAuthType;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.moovit.payment.registration.alternative.AlternativeWebAuthProvider;
import com.moovit.payment.registration.steps.email.EmailInstructions;
import com.moovit.payment.registration.steps.external.ExternalAccountInstructions;
import com.moovit.payment.registration.steps.input.InputFieldsInstructions;
import com.moovit.payment.registration.steps.input.InputInstructions;
import com.moovit.payment.registration.steps.mot.payment.MotPangoInstructions;
import com.moovit.payment.registration.steps.mot.payment.MotPaymentMethodInstructions;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import com.moovit.payment.registration.steps.phone.PhoneAlternativeAuthInstructions;
import com.moovit.payment.registration.steps.phone.PhoneInstructions;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import com.moovit.payment.registration.steps.profile.ProfilesInstructions;
import com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus;
import com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateData;
import com.moovit.payment.registration.steps.question.QuestionButton;
import com.moovit.payment.registration.steps.question.QuestionInstructions;
import com.moovit.payment.registration.steps.reconnect.ReconnectInstructions;
import com.moovit.payment.registration.steps.terms.TermsOfUseInstructions;
import com.moovit.util.CurrencyAmount;
import com.moovit.view.p340cc.CreditCardPreview;
import com.moovit.view.p340cc.CreditCardType;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.common.MVLinkedTextLink;
import com.tranzmate.moovit.protocol.payment.MVCardDetails;
import com.tranzmate.moovit.protocol.payments.MVAlternateAuthProvider;
import com.tranzmate.moovit.protocol.payments.MVAlternateWebAuthProvider;
import com.tranzmate.moovit.protocol.payments.MVBalanceInfo;
import com.tranzmate.moovit.protocol.payments.MVBankTransferInfo;
import com.tranzmate.moovit.protocol.payments.MVCardInfo;
import com.tranzmate.moovit.protocol.payments.MVCardType;
import com.tranzmate.moovit.protocol.payments.MVCashInstructions;
import com.tranzmate.moovit.protocol.payments.MVClearanceProvider;
import com.tranzmate.moovit.protocol.payments.MVClearanceProviderType;
import com.tranzmate.moovit.protocol.payments.MVCreditCardInstructions;
import com.tranzmate.moovit.protocol.payments.MVDepositInstructions;
import com.tranzmate.moovit.protocol.payments.MVEmailVerificationInstructions;
import com.tranzmate.moovit.protocol.payments.MVExternalPaymentMethodInfo;
import com.tranzmate.moovit.protocol.payments.MVGooglePayInstructions;
import com.tranzmate.moovit.protocol.payments.MVInputFieldsInstructions;
import com.tranzmate.moovit.protocol.payments.MVLoginAccountInfo;
import com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps;
import com.tranzmate.moovit.protocol.payments.MVMotPaymentMethodInstructions;
import com.tranzmate.moovit.protocol.payments.MVPaymentAccountContextStatus;
import com.tranzmate.moovit.protocol.payments.MVPaymentDiscounts;
import com.tranzmate.moovit.protocol.payments.MVPaymentMethod;
import com.tranzmate.moovit.protocol.payments.MVPaymentMethodId;
import com.tranzmate.moovit.protocol.payments.MVPaymentMethodInfo;
import com.tranzmate.moovit.protocol.payments.MVPaymentMethodStatus;
import com.tranzmate.moovit.protocol.payments.MVPaymentMethods;
import com.tranzmate.moovit.protocol.payments.MVPaymentOptions;
import com.tranzmate.moovit.protocol.payments.MVPaymentProperties;
import com.tranzmate.moovit.protocol.payments.MVPaymentRequestProperties;
import com.tranzmate.moovit.protocol.payments.MVPaymentSummary;
import com.tranzmate.moovit.protocol.payments.MVPhoneAlternateAuthInstructions;
import com.tranzmate.moovit.protocol.payments.MVPhoneInstructions;
import com.tranzmate.moovit.protocol.payments.MVProfileSpec;
import com.tranzmate.moovit.protocol.payments.MVProfilesInstructions;
import com.tranzmate.moovit.protocol.payments.MVPurchasePaymentMethods;
import com.tranzmate.moovit.protocol.payments.MVQuestionButton;
import com.tranzmate.moovit.protocol.payments.MVQuestionInstructions;
import com.tranzmate.moovit.protocol.payments.MVReconnectInstructions;
import com.tranzmate.moovit.protocol.payments.MVSingleUsePaymentMethods;
import com.tranzmate.moovit.protocol.payments.MVSpecialCreditCardFields;
import com.tranzmate.moovit.protocol.payments.MVTOS;
import com.tranzmate.moovit.protocol.payments.MVTermsOfUseInstructions;
import com.tranzmate.moovit.protocol.payments.MVTokenizeReturnUrls;
import com.tranzmate.moovit.protocol.payments.MVVerificationStatus;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingStatementPeriod;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingUpcomingStatement;
import f60.C16947a;
import i60.C17559a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p009a8.C0112l;
import p397bu.C13689g;
import p638lr.C18262i;
import p638lr.C18267n;
import p810sz.C19617r;
import p826tr.C19752b;
import p875vs.C20228e;
import p900wt.C20415e;
import p977zz.C20944i0;
import p977zz.C20952m0;
import p977zz.C20964s0;
import w50.C20277a;

/* renamed from: h60.s0 */
public final class C17353s0 {

    /* renamed from: a */
    public static final C19617r f44739a;

    /* renamed from: h60.s0$a */
    public static /* synthetic */ class C17354a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44740a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f44741b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f44742c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f44743d;

        /* renamed from: e */
        public static final /* synthetic */ int[] f44744e;

        /* renamed from: f */
        public static final /* synthetic */ int[] f44745f;

        /* renamed from: g */
        public static final /* synthetic */ int[] f44746g;

        /* renamed from: h */
        public static final /* synthetic */ int[] f44747h;

        /* renamed from: i */
        public static final /* synthetic */ int[] f44748i;

        /* renamed from: j */
        public static final /* synthetic */ int[] f44749j;

        /* renamed from: k */
        public static final /* synthetic */ int[] f44750k;

        /* renamed from: l */
        public static final /* synthetic */ int[] f44751l;

        /* renamed from: m */
        public static final /* synthetic */ int[] f44752m;

        /* renamed from: n */
        public static final /* synthetic */ int[] f44753n;

        /* renamed from: o */
        public static final /* synthetic */ int[] f44754o;

        /* renamed from: p */
        public static final /* synthetic */ int[] f44755p;

        /* JADX WARNING: Can't wrap try/catch for region: R(155:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|(2:19|20)|21|(2:23|24)|25|(2:27|28)|29|31|32|33|34|35|36|37|38|(2:39|40)|41|43|44|(2:45|46)|47|49|50|51|52|53|54|55|56|(2:57|58)|59|61|62|(2:63|64)|65|67|68|69|70|71|73|74|75|76|77|78|(2:79|80)|81|(2:83|84)|85|87|88|(2:89|90)|91|93|94|95|96|97|98|99|100|(2:101|102)|103|(2:105|106)|107|(2:109|110)|111|(2:113|114)|115|(2:117|118)|119|(2:121|122)|123|(2:125|126)|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|(2:163|164)|165|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|(2:191|192)|193|195|196|197|198|199|200|201|202|(3:203|204|206)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(157:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|(2:19|20)|21|(2:23|24)|25|(2:27|28)|29|31|32|33|34|35|36|37|38|(2:39|40)|41|43|44|(2:45|46)|47|49|50|51|52|53|54|55|56|(2:57|58)|59|61|62|(2:63|64)|65|67|68|69|70|71|73|74|75|76|77|78|(2:79|80)|81|(2:83|84)|85|87|88|89|90|91|93|94|95|96|97|98|99|100|(2:101|102)|103|(2:105|106)|107|(2:109|110)|111|(2:113|114)|115|(2:117|118)|119|(2:121|122)|123|125|126|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|(2:163|164)|165|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|(2:191|192)|193|195|196|197|198|199|200|201|202|(3:203|204|206)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(158:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|(2:19|20)|21|(2:23|24)|25|(2:27|28)|29|31|32|33|34|35|36|37|38|(2:39|40)|41|43|44|(2:45|46)|47|49|50|51|52|53|54|55|56|(2:57|58)|59|61|62|(2:63|64)|65|67|68|69|70|71|73|74|75|76|77|78|(2:79|80)|81|(2:83|84)|85|87|88|89|90|91|93|94|95|96|97|98|99|100|(2:101|102)|103|(2:105|106)|107|(2:109|110)|111|(2:113|114)|115|(2:117|118)|119|121|122|123|125|126|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|(2:163|164)|165|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|(2:191|192)|193|195|196|197|198|199|200|201|202|(3:203|204|206)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(159:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|(2:19|20)|21|(2:23|24)|25|(2:27|28)|29|31|32|33|34|35|36|37|38|(2:39|40)|41|43|44|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|61|62|(2:63|64)|65|67|68|69|70|71|73|74|75|76|77|78|(2:79|80)|81|(2:83|84)|85|87|88|89|90|91|93|94|95|96|97|98|99|100|(2:101|102)|103|(2:105|106)|107|(2:109|110)|111|(2:113|114)|115|(2:117|118)|119|121|122|123|125|126|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|(2:163|164)|165|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|(2:191|192)|193|195|196|197|198|199|200|201|202|(3:203|204|206)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(161:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|(2:19|20)|21|(2:23|24)|25|(2:27|28)|29|31|32|33|34|35|36|37|38|(2:39|40)|41|43|44|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|61|62|(2:63|64)|65|67|68|69|70|71|73|74|75|76|77|78|(2:79|80)|81|83|84|85|87|88|89|90|91|93|94|95|96|97|98|99|100|(2:101|102)|103|(2:105|106)|107|(2:109|110)|111|(2:113|114)|115|117|118|119|121|122|123|125|126|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|(2:163|164)|165|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|(2:191|192)|193|195|196|197|198|199|200|201|202|(3:203|204|206)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(162:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|(2:19|20)|21|(2:23|24)|25|27|28|29|31|32|33|34|35|36|37|38|(2:39|40)|41|43|44|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|61|62|(2:63|64)|65|67|68|69|70|71|73|74|75|76|77|78|(2:79|80)|81|83|84|85|87|88|89|90|91|93|94|95|96|97|98|99|100|(2:101|102)|103|(2:105|106)|107|(2:109|110)|111|(2:113|114)|115|117|118|119|121|122|123|125|126|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|(2:163|164)|165|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|(2:191|192)|193|195|196|197|198|199|200|201|202|(3:203|204|206)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(163:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|(2:19|20)|21|(2:23|24)|25|27|28|29|31|32|33|34|35|36|37|38|(2:39|40)|41|43|44|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|61|62|(2:63|64)|65|67|68|69|70|71|73|74|75|76|77|78|(2:79|80)|81|83|84|85|87|88|89|90|91|93|94|95|96|97|98|99|100|(2:101|102)|103|(2:105|106)|107|(2:109|110)|111|113|114|115|117|118|119|121|122|123|125|126|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|(2:163|164)|165|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|(2:191|192)|193|195|196|197|198|199|200|201|202|(3:203|204|206)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(164:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|(2:19|20)|21|23|24|25|27|28|29|31|32|33|34|35|36|37|38|(2:39|40)|41|43|44|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|61|62|(2:63|64)|65|67|68|69|70|71|73|74|75|76|77|78|(2:79|80)|81|83|84|85|87|88|89|90|91|93|94|95|96|97|98|99|100|(2:101|102)|103|(2:105|106)|107|(2:109|110)|111|113|114|115|117|118|119|121|122|123|125|126|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|(2:163|164)|165|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|(2:191|192)|193|195|196|197|198|199|200|201|202|(3:203|204|206)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(165:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|(2:19|20)|21|23|24|25|27|28|29|31|32|33|34|35|36|37|38|(2:39|40)|41|43|44|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|61|62|(2:63|64)|65|67|68|69|70|71|73|74|75|76|77|78|79|80|81|83|84|85|87|88|89|90|91|93|94|95|96|97|98|99|100|(2:101|102)|103|(2:105|106)|107|(2:109|110)|111|113|114|115|117|118|119|121|122|123|125|126|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|(2:163|164)|165|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|(2:191|192)|193|195|196|197|198|199|200|201|202|(3:203|204|206)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(168:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|19|20|21|23|24|25|27|28|29|31|32|33|34|35|36|37|38|(2:39|40)|41|43|44|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|61|62|(2:63|64)|65|67|68|69|70|71|73|74|75|76|77|78|79|80|81|83|84|85|87|88|89|90|91|93|94|95|96|97|98|99|100|(2:101|102)|103|(2:105|106)|107|109|110|111|113|114|115|117|118|119|121|122|123|125|126|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|(2:163|164)|165|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|191|192|193|195|196|197|198|199|200|201|202|(3:203|204|206)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(170:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|(2:15|16)|17|19|20|21|23|24|25|27|28|29|31|32|33|34|35|36|37|38|(2:39|40)|41|43|44|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|61|62|(2:63|64)|65|67|68|69|70|71|73|74|75|76|77|78|79|80|81|83|84|85|87|88|89|90|91|93|94|95|96|97|98|99|100|(2:101|102)|103|105|106|107|109|110|111|113|114|115|117|118|119|121|122|123|125|126|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|191|192|193|195|196|197|198|199|200|201|202|(3:203|204|206)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(171:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|31|32|33|34|35|36|37|38|(2:39|40)|41|43|44|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|61|62|(2:63|64)|65|67|68|69|70|71|73|74|75|76|77|78|79|80|81|83|84|85|87|88|89|90|91|93|94|95|96|97|98|99|100|(2:101|102)|103|105|106|107|109|110|111|113|114|115|117|118|119|121|122|123|125|126|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|191|192|193|195|196|197|198|199|200|201|202|(3:203|204|206)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(172:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|31|32|33|34|35|36|37|38|(2:39|40)|41|43|44|(2:45|46)|47|49|50|51|52|53|54|55|56|57|58|59|61|62|(2:63|64)|65|67|68|69|70|71|73|74|75|76|77|78|79|80|81|83|84|85|87|88|89|90|91|93|94|95|96|97|98|99|100|101|102|103|105|106|107|109|110|111|113|114|115|117|118|119|121|122|123|125|126|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|191|192|193|195|196|197|198|199|200|201|202|(3:203|204|206)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(173:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|31|32|33|34|35|36|37|38|(2:39|40)|41|43|44|45|46|47|49|50|51|52|53|54|55|56|57|58|59|61|62|(2:63|64)|65|67|68|69|70|71|73|74|75|76|77|78|79|80|81|83|84|85|87|88|89|90|91|93|94|95|96|97|98|99|100|101|102|103|105|106|107|109|110|111|113|114|115|117|118|119|121|122|123|125|126|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|191|192|193|195|196|197|198|199|200|201|202|(3:203|204|206)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(174:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|31|32|33|34|35|36|37|38|(2:39|40)|41|43|44|45|46|47|49|50|51|52|53|54|55|56|57|58|59|61|62|(2:63|64)|65|67|68|69|70|71|73|74|75|76|77|78|79|80|81|83|84|85|87|88|89|90|91|93|94|95|96|97|98|99|100|101|102|103|105|106|107|109|110|111|113|114|115|117|118|119|121|122|123|125|126|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|191|192|193|195|196|197|198|199|200|201|202|(3:203|204|206)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(175:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|31|32|33|34|35|36|37|38|(2:39|40)|41|43|44|45|46|47|49|50|51|52|53|54|55|56|57|58|59|61|62|(2:63|64)|65|67|68|69|70|71|73|74|75|76|77|78|79|80|81|83|84|85|87|88|89|90|91|93|94|95|96|97|98|99|100|101|102|103|105|106|107|109|110|111|113|114|115|117|118|119|121|122|123|125|126|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|191|192|193|195|196|197|198|199|200|201|202|(3:203|204|206)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(176:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|31|32|33|34|35|36|37|38|39|40|41|43|44|45|46|47|49|50|51|52|53|54|55|56|57|58|59|61|62|(2:63|64)|65|67|68|69|70|71|73|74|75|76|77|78|79|80|81|83|84|85|87|88|89|90|91|93|94|95|96|97|98|99|100|101|102|103|105|106|107|109|110|111|113|114|115|117|118|119|121|122|123|125|126|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|167|168|169|170|171|172|173|174|175|176|(2:177|178)|179|181|182|183|184|185|186|187|188|189|190|191|192|193|195|196|197|198|199|200|201|202|(3:203|204|206)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(178:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|31|32|33|34|35|36|37|38|39|40|41|43|44|45|46|47|49|50|51|52|53|54|55|56|57|58|59|61|62|(2:63|64)|65|67|68|69|70|71|73|74|75|76|77|78|79|80|81|83|84|85|87|88|89|90|91|93|94|95|96|97|98|99|100|101|102|103|105|106|107|109|110|111|113|114|115|117|118|119|121|122|123|125|126|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|167|168|169|170|171|172|173|174|175|176|177|178|179|181|182|183|184|185|186|187|188|189|190|191|192|193|195|196|197|198|199|200|201|202|(3:203|204|206)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(181:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|19|20|21|23|24|25|27|28|29|31|32|33|34|35|36|37|38|39|40|41|43|44|45|46|47|49|50|51|52|53|54|55|56|57|58|59|61|62|63|64|65|67|68|69|70|71|73|74|75|76|77|78|79|80|81|83|84|85|87|88|89|90|91|93|94|95|96|97|98|99|100|101|102|103|105|106|107|109|110|111|113|114|115|117|118|119|121|122|123|125|126|127|129|130|131|132|133|134|135|136|137|138|139|140|141|142|143|144|145|146|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|167|168|169|170|171|172|173|174|175|176|177|178|179|181|182|183|184|185|186|187|188|189|190|191|192|193|195|196|197|198|199|200|201|202|203|204|206) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:101:0x01b7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x0218 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:133:0x0222 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:135:0x022c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:137:0x0236 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:139:0x0240 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x024a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x0254 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x025e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:147:0x0268 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:149:0x0272 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:151:0x027c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:153:0x0288 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:155:0x0294 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:157:0x02a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:159:0x02ac */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:161:0x02b8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:163:0x02c4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:169:0x02e1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:171:0x02eb */
        /* JADX WARNING: Missing exception handler attribute for start block: B:173:0x02f5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:175:0x02ff */
        /* JADX WARNING: Missing exception handler attribute for start block: B:177:0x0309 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:183:0x0324 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:185:0x032e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:187:0x0338 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:189:0x0342 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:191:0x034c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:197:0x0367 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:199:0x0371 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:201:0x037b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:203:0x0385 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00d9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00e3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00ed */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0108 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0123 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x013e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0148 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x0152 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x017e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:95:0x0199 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:97:0x01a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:99:0x01ad */
        static {
            /*
                com.tranzmate.moovit.protocol.payments.MVPaymentSummarySecondaryAction[] r0 = com.tranzmate.moovit.protocol.payments.MVPaymentSummarySecondaryAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44755p = r0
                r1 = 1
                com.tranzmate.moovit.protocol.payments.MVPaymentSummarySecondaryAction r2 = com.tranzmate.moovit.protocol.payments.MVPaymentSummarySecondaryAction.ADD_VOUCHER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBPaymentMethodType[] r0 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBPaymentMethodType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44754o = r0
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBPaymentMethodType r2 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBPaymentMethodType.PANGO     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                r0 = 2
                int[] r2 = f44754o     // Catch:{ NoSuchFieldError -> 0x002e }
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBPaymentMethodType r3 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBPaymentMethodType.BIT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                com.tranzmate.moovit.protocol.payments.MVPaymentAccountContextStatus[] r2 = com.tranzmate.moovit.protocol.payments.MVPaymentAccountContextStatus.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f44753n = r2
                com.tranzmate.moovit.protocol.payments.MVPaymentAccountContextStatus r3 = com.tranzmate.moovit.protocol.payments.MVPaymentAccountContextStatus.INCOMPLETE     // Catch:{ NoSuchFieldError -> 0x003f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x003f }
            L_0x003f:
                int[] r2 = f44753n     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.tranzmate.moovit.protocol.payments.MVPaymentAccountContextStatus r3 = com.tranzmate.moovit.protocol.payments.MVPaymentAccountContextStatus.CONNECTED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r2 = 3
                int[] r3 = f44753n     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.tranzmate.moovit.protocol.payments.MVPaymentAccountContextStatus r4 = com.tranzmate.moovit.protocol.payments.MVPaymentAccountContextStatus.DISCONNECTED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r3 = 4
                int[] r4 = f44753n     // Catch:{ NoSuchFieldError -> 0x005f }
                com.tranzmate.moovit.protocol.payments.MVPaymentAccountContextStatus r5 = com.tranzmate.moovit.protocol.payments.MVPaymentAccountContextStatus.BLACKLIST     // Catch:{ NoSuchFieldError -> 0x005f }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x005f }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x005f }
            L_0x005f:
                r4 = 5
                int[] r5 = f44753n     // Catch:{ NoSuchFieldError -> 0x006a }
                com.tranzmate.moovit.protocol.payments.MVPaymentAccountContextStatus r6 = com.tranzmate.moovit.protocol.payments.MVPaymentAccountContextStatus.BLOCK     // Catch:{ NoSuchFieldError -> 0x006a }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingPaymentStatus[] r5 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingPaymentStatus.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f44752m = r5
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingPaymentStatus r6 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingPaymentStatus.Notprocessed     // Catch:{ NoSuchFieldError -> 0x007b }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r5 = f44752m     // Catch:{ NoSuchFieldError -> 0x0085 }
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingPaymentStatus r6 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingPaymentStatus.PendingApproval     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r5 = f44752m     // Catch:{ NoSuchFieldError -> 0x008f }
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingPaymentStatus r6 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingPaymentStatus.Approved     // Catch:{ NoSuchFieldError -> 0x008f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r5 = f44752m     // Catch:{ NoSuchFieldError -> 0x0099 }
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingPaymentStatus r6 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingPaymentStatus.Cancelled     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r5 = f44752m     // Catch:{ NoSuchFieldError -> 0x00a3 }
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingPaymentStatus r6 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingPaymentStatus.Rejected     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingStatementPeriod[] r5 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingStatementPeriod.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f44751l = r5
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingStatementPeriod r6 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingStatementPeriod.DAY     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r5 = f44751l     // Catch:{ NoSuchFieldError -> 0x00be }
                com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingStatementPeriod r6 = com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingStatementPeriod.MONTH     // Catch:{ NoSuchFieldError -> 0x00be }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                com.tranzmate.moovit.protocol.payments.MVVerificationStatus[] r5 = com.tranzmate.moovit.protocol.payments.MVVerificationStatus.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f44750k = r5
                com.tranzmate.moovit.protocol.payments.MVVerificationStatus r6 = com.tranzmate.moovit.protocol.payments.MVVerificationStatus.PENDING     // Catch:{ NoSuchFieldError -> 0x00cf }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cf }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x00cf }
            L_0x00cf:
                int[] r5 = f44750k     // Catch:{ NoSuchFieldError -> 0x00d9 }
                com.tranzmate.moovit.protocol.payments.MVVerificationStatus r6 = com.tranzmate.moovit.protocol.payments.MVVerificationStatus.EXPIRED     // Catch:{ NoSuchFieldError -> 0x00d9 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d9 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x00d9 }
            L_0x00d9:
                int[] r5 = f44750k     // Catch:{ NoSuchFieldError -> 0x00e3 }
                com.tranzmate.moovit.protocol.payments.MVVerificationStatus r6 = com.tranzmate.moovit.protocol.payments.MVVerificationStatus.NOTVALID     // Catch:{ NoSuchFieldError -> 0x00e3 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e3 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x00e3 }
            L_0x00e3:
                int[] r5 = f44750k     // Catch:{ NoSuchFieldError -> 0x00ed }
                com.tranzmate.moovit.protocol.payments.MVVerificationStatus r6 = com.tranzmate.moovit.protocol.payments.MVVerificationStatus.NOTUPLOADED     // Catch:{ NoSuchFieldError -> 0x00ed }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ed }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x00ed }
            L_0x00ed:
                int[] r5 = f44750k     // Catch:{ NoSuchFieldError -> 0x00f7 }
                com.tranzmate.moovit.protocol.payments.MVVerificationStatus r6 = com.tranzmate.moovit.protocol.payments.MVVerificationStatus.VALIDATED     // Catch:{ NoSuchFieldError -> 0x00f7 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f7 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x00f7 }
            L_0x00f7:
                com.tranzmate.moovit.protocol.payments.MVIdentificationType[] r5 = com.tranzmate.moovit.protocol.payments.MVIdentificationType.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f44749j = r5
                com.tranzmate.moovit.protocol.payments.MVIdentificationType r6 = com.tranzmate.moovit.protocol.payments.MVIdentificationType.LOCAL_ID     // Catch:{ NoSuchFieldError -> 0x0108 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0108 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0108 }
            L_0x0108:
                int[] r5 = f44749j     // Catch:{ NoSuchFieldError -> 0x0112 }
                com.tranzmate.moovit.protocol.payments.MVIdentificationType r6 = com.tranzmate.moovit.protocol.payments.MVIdentificationType.LOCAL_PASSPORT     // Catch:{ NoSuchFieldError -> 0x0112 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0112 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0112 }
            L_0x0112:
                com.moovit.payment.registration.steps.id.PaymentAccountId$IdType[] r5 = com.moovit.payment.registration.steps.p420id.PaymentAccountId.IdType.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f44748i = r5
                com.moovit.payment.registration.steps.id.PaymentAccountId$IdType r6 = com.moovit.payment.registration.steps.p420id.PaymentAccountId.IdType.SSN     // Catch:{ NoSuchFieldError -> 0x0123 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0123 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0123 }
            L_0x0123:
                int[] r5 = f44748i     // Catch:{ NoSuchFieldError -> 0x012d }
                com.moovit.payment.registration.steps.id.PaymentAccountId$IdType r6 = com.moovit.payment.registration.steps.p420id.PaymentAccountId.IdType.PASSPORT     // Catch:{ NoSuchFieldError -> 0x012d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x012d }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x012d }
            L_0x012d:
                com.tranzmate.moovit.protocol.payments.MVPaymentAccountBadgeType[] r5 = com.tranzmate.moovit.protocol.payments.MVPaymentAccountBadgeType.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f44747h = r5
                com.tranzmate.moovit.protocol.payments.MVPaymentAccountBadgeType r6 = com.tranzmate.moovit.protocol.payments.MVPaymentAccountBadgeType.INFO     // Catch:{ NoSuchFieldError -> 0x013e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x013e }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x013e }
            L_0x013e:
                int[] r5 = f44747h     // Catch:{ NoSuchFieldError -> 0x0148 }
                com.tranzmate.moovit.protocol.payments.MVPaymentAccountBadgeType r6 = com.tranzmate.moovit.protocol.payments.MVPaymentAccountBadgeType.POSITIVE     // Catch:{ NoSuchFieldError -> 0x0148 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0148 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0148 }
            L_0x0148:
                int[] r5 = f44747h     // Catch:{ NoSuchFieldError -> 0x0152 }
                com.tranzmate.moovit.protocol.payments.MVPaymentAccountBadgeType r6 = com.tranzmate.moovit.protocol.payments.MVPaymentAccountBadgeType.ALERT     // Catch:{ NoSuchFieldError -> 0x0152 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0152 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0152 }
            L_0x0152:
                int[] r5 = f44747h     // Catch:{ NoSuchFieldError -> 0x015c }
                com.tranzmate.moovit.protocol.payments.MVPaymentAccountBadgeType r6 = com.tranzmate.moovit.protocol.payments.MVPaymentAccountBadgeType.CRITICAL     // Catch:{ NoSuchFieldError -> 0x015c }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x015c }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x015c }
            L_0x015c:
                com.tranzmate.moovit.protocol.payments.MVPaymentAccountProductType[] r5 = com.tranzmate.moovit.protocol.payments.MVPaymentAccountProductType.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f44746g = r5
                com.tranzmate.moovit.protocol.payments.MVPaymentAccountProductType r6 = com.tranzmate.moovit.protocol.payments.MVPaymentAccountProductType.SUBSCRIPTION     // Catch:{ NoSuchFieldError -> 0x016d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x016d }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x016d }
            L_0x016d:
                com.tranzmate.moovit.protocol.payments.MVPaymentMethodStatus[] r5 = com.tranzmate.moovit.protocol.payments.MVPaymentMethodStatus.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f44745f = r5
                com.tranzmate.moovit.protocol.payments.MVPaymentMethodStatus r6 = com.tranzmate.moovit.protocol.payments.MVPaymentMethodStatus.f27507OK     // Catch:{ NoSuchFieldError -> 0x017e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x017e }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x017e }
            L_0x017e:
                int[] r5 = f44745f     // Catch:{ NoSuchFieldError -> 0x0188 }
                com.tranzmate.moovit.protocol.payments.MVPaymentMethodStatus r6 = com.tranzmate.moovit.protocol.payments.MVPaymentMethodStatus.EXPIRED     // Catch:{ NoSuchFieldError -> 0x0188 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0188 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0188 }
            L_0x0188:
                com.moovit.view.cc.CreditCardType[] r5 = com.moovit.view.p340cc.CreditCardType.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f44744e = r5
                com.moovit.view.cc.CreditCardType r6 = com.moovit.view.p340cc.CreditCardType.VISA     // Catch:{ NoSuchFieldError -> 0x0199 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0199 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0199 }
            L_0x0199:
                int[] r5 = f44744e     // Catch:{ NoSuchFieldError -> 0x01a3 }
                com.moovit.view.cc.CreditCardType r6 = com.moovit.view.p340cc.CreditCardType.MASTERCARD     // Catch:{ NoSuchFieldError -> 0x01a3 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x01a3 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x01a3 }
            L_0x01a3:
                int[] r5 = f44744e     // Catch:{ NoSuchFieldError -> 0x01ad }
                com.moovit.view.cc.CreditCardType r6 = com.moovit.view.p340cc.CreditCardType.AMERICAN_EXPRESS     // Catch:{ NoSuchFieldError -> 0x01ad }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ad }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x01ad }
            L_0x01ad:
                int[] r5 = f44744e     // Catch:{ NoSuchFieldError -> 0x01b7 }
                com.moovit.view.cc.CreditCardType r6 = com.moovit.view.p340cc.CreditCardType.DINERS_CLUB     // Catch:{ NoSuchFieldError -> 0x01b7 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x01b7 }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x01b7 }
            L_0x01b7:
                int[] r5 = f44744e     // Catch:{ NoSuchFieldError -> 0x01c1 }
                com.moovit.view.cc.CreditCardType r6 = com.moovit.view.p340cc.CreditCardType.DISCOVER     // Catch:{ NoSuchFieldError -> 0x01c1 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x01c1 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x01c1 }
            L_0x01c1:
                r5 = 6
                int[] r6 = f44744e     // Catch:{ NoSuchFieldError -> 0x01cc }
                com.moovit.view.cc.CreditCardType r7 = com.moovit.view.p340cc.CreditCardType.JCB     // Catch:{ NoSuchFieldError -> 0x01cc }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x01cc }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x01cc }
            L_0x01cc:
                r6 = 7
                int[] r7 = f44744e     // Catch:{ NoSuchFieldError -> 0x01d7 }
                com.moovit.view.cc.CreditCardType r8 = com.moovit.view.p340cc.CreditCardType.MAESTRO     // Catch:{ NoSuchFieldError -> 0x01d7 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x01d7 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x01d7 }
            L_0x01d7:
                r7 = 8
                int[] r8 = f44744e     // Catch:{ NoSuchFieldError -> 0x01e3 }
                com.moovit.view.cc.CreditCardType r9 = com.moovit.view.p340cc.CreditCardType.UNIONPAY     // Catch:{ NoSuchFieldError -> 0x01e3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x01e3 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x01e3 }
            L_0x01e3:
                r8 = 9
                int[] r9 = f44744e     // Catch:{ NoSuchFieldError -> 0x01ef }
                com.moovit.view.cc.CreditCardType r10 = com.moovit.view.p340cc.CreditCardType.BANCONTACT     // Catch:{ NoSuchFieldError -> 0x01ef }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x01ef }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x01ef }
            L_0x01ef:
                r9 = 10
                int[] r10 = f44744e     // Catch:{ NoSuchFieldError -> 0x01fb }
                com.moovit.view.cc.CreditCardType r11 = com.moovit.view.p340cc.CreditCardType.ISRACARD     // Catch:{ NoSuchFieldError -> 0x01fb }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x01fb }
                r10[r11] = r9     // Catch:{ NoSuchFieldError -> 0x01fb }
            L_0x01fb:
                r10 = 11
                int[] r11 = f44744e     // Catch:{ NoSuchFieldError -> 0x0207 }
                com.moovit.view.cc.CreditCardType r12 = com.moovit.view.p340cc.CreditCardType.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0207 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x0207 }
                r11[r12] = r10     // Catch:{ NoSuchFieldError -> 0x0207 }
            L_0x0207:
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep[] r11 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.values()
                int r11 = r11.length
                int[] r11 = new int[r11]
                f44743d = r11
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r12 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.TERMS_OF_USE     // Catch:{ NoSuchFieldError -> 0x0218 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x0218 }
                r11[r12] = r1     // Catch:{ NoSuchFieldError -> 0x0218 }
            L_0x0218:
                int[] r11 = f44743d     // Catch:{ NoSuchFieldError -> 0x0222 }
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r12 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.PHONE     // Catch:{ NoSuchFieldError -> 0x0222 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x0222 }
                r11[r12] = r0     // Catch:{ NoSuchFieldError -> 0x0222 }
            L_0x0222:
                int[] r11 = f44743d     // Catch:{ NoSuchFieldError -> 0x022c }
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r12 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.NAME     // Catch:{ NoSuchFieldError -> 0x022c }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x022c }
                r11[r12] = r2     // Catch:{ NoSuchFieldError -> 0x022c }
            L_0x022c:
                int[] r11 = f44743d     // Catch:{ NoSuchFieldError -> 0x0236 }
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r12 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.EMAIL     // Catch:{ NoSuchFieldError -> 0x0236 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x0236 }
                r11[r12] = r3     // Catch:{ NoSuchFieldError -> 0x0236 }
            L_0x0236:
                int[] r11 = f44743d     // Catch:{ NoSuchFieldError -> 0x0240 }
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r12 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.BIRTH_DATE     // Catch:{ NoSuchFieldError -> 0x0240 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x0240 }
                r11[r12] = r4     // Catch:{ NoSuchFieldError -> 0x0240 }
            L_0x0240:
                int[] r11 = f44743d     // Catch:{ NoSuchFieldError -> 0x024a }
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r12 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.ID     // Catch:{ NoSuchFieldError -> 0x024a }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x024a }
                r11[r12] = r5     // Catch:{ NoSuchFieldError -> 0x024a }
            L_0x024a:
                int[] r11 = f44743d     // Catch:{ NoSuchFieldError -> 0x0254 }
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r12 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.ID_VERFICATION     // Catch:{ NoSuchFieldError -> 0x0254 }
                int r12 = r12.ordinal()     // Catch:{ NoSuchFieldError -> 0x0254 }
                r11[r12] = r6     // Catch:{ NoSuchFieldError -> 0x0254 }
            L_0x0254:
                int[] r6 = f44743d     // Catch:{ NoSuchFieldError -> 0x025e }
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r11 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.CREDIT_CARD     // Catch:{ NoSuchFieldError -> 0x025e }
                int r11 = r11.ordinal()     // Catch:{ NoSuchFieldError -> 0x025e }
                r6[r11] = r7     // Catch:{ NoSuchFieldError -> 0x025e }
            L_0x025e:
                int[] r6 = f44743d     // Catch:{ NoSuchFieldError -> 0x0268 }
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r7 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.MOT_PAYMENT_METHOD     // Catch:{ NoSuchFieldError -> 0x0268 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0268 }
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0268 }
            L_0x0268:
                int[] r6 = f44743d     // Catch:{ NoSuchFieldError -> 0x0272 }
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r7 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.MOT_PROFILE     // Catch:{ NoSuchFieldError -> 0x0272 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0272 }
                r6[r7] = r9     // Catch:{ NoSuchFieldError -> 0x0272 }
            L_0x0272:
                int[] r6 = f44743d     // Catch:{ NoSuchFieldError -> 0x027c }
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r7 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.EXTERNAL_ACCOUNT     // Catch:{ NoSuchFieldError -> 0x027c }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x027c }
                r6[r7] = r10     // Catch:{ NoSuchFieldError -> 0x027c }
            L_0x027c:
                int[] r6 = f44743d     // Catch:{ NoSuchFieldError -> 0x0288 }
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r7 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.RECONNECT     // Catch:{ NoSuchFieldError -> 0x0288 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0288 }
                r8 = 12
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0288 }
            L_0x0288:
                int[] r6 = f44743d     // Catch:{ NoSuchFieldError -> 0x0294 }
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r7 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.VERIFF     // Catch:{ NoSuchFieldError -> 0x0294 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0294 }
                r8 = 13
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x0294 }
            L_0x0294:
                int[] r6 = f44743d     // Catch:{ NoSuchFieldError -> 0x02a0 }
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r7 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.ADDRESS     // Catch:{ NoSuchFieldError -> 0x02a0 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x02a0 }
                r8 = 14
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x02a0 }
            L_0x02a0:
                int[] r6 = f44743d     // Catch:{ NoSuchFieldError -> 0x02ac }
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r7 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.EMAIL_VERIFICATION     // Catch:{ NoSuchFieldError -> 0x02ac }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ac }
                r8 = 15
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x02ac }
            L_0x02ac:
                int[] r6 = f44743d     // Catch:{ NoSuchFieldError -> 0x02b8 }
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r7 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.WEB     // Catch:{ NoSuchFieldError -> 0x02b8 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x02b8 }
                r8 = 16
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x02b8 }
            L_0x02b8:
                int[] r6 = f44743d     // Catch:{ NoSuchFieldError -> 0x02c4 }
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r7 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.MARKETING_OPT_IN     // Catch:{ NoSuchFieldError -> 0x02c4 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x02c4 }
                r8 = 17
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x02c4 }
            L_0x02c4:
                int[] r6 = f44743d     // Catch:{ NoSuchFieldError -> 0x02d0 }
                com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r7 = com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep.INPUT     // Catch:{ NoSuchFieldError -> 0x02d0 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x02d0 }
                r8 = 18
                r6[r7] = r8     // Catch:{ NoSuchFieldError -> 0x02d0 }
            L_0x02d0:
                com.moovit.payment.clearance.ClearanceProviderType[] r6 = com.moovit.payment.clearance.ClearanceProviderType.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f44742c = r6
                com.moovit.payment.clearance.ClearanceProviderType r7 = com.moovit.payment.clearance.ClearanceProviderType.SPREEDLY     // Catch:{ NoSuchFieldError -> 0x02e1 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x02e1 }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x02e1 }
            L_0x02e1:
                int[] r6 = f44742c     // Catch:{ NoSuchFieldError -> 0x02eb }
                com.moovit.payment.clearance.ClearanceProviderType r7 = com.moovit.payment.clearance.ClearanceProviderType.STRIPE     // Catch:{ NoSuchFieldError -> 0x02eb }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x02eb }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x02eb }
            L_0x02eb:
                int[] r6 = f44742c     // Catch:{ NoSuchFieldError -> 0x02f5 }
                com.moovit.payment.clearance.ClearanceProviderType r7 = com.moovit.payment.clearance.ClearanceProviderType.CUBIC     // Catch:{ NoSuchFieldError -> 0x02f5 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x02f5 }
                r6[r7] = r2     // Catch:{ NoSuchFieldError -> 0x02f5 }
            L_0x02f5:
                int[] r6 = f44742c     // Catch:{ NoSuchFieldError -> 0x02ff }
                com.moovit.payment.clearance.ClearanceProviderType r7 = com.moovit.payment.clearance.ClearanceProviderType.ICEPAY     // Catch:{ NoSuchFieldError -> 0x02ff }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x02ff }
                r6[r7] = r3     // Catch:{ NoSuchFieldError -> 0x02ff }
            L_0x02ff:
                int[] r6 = f44742c     // Catch:{ NoSuchFieldError -> 0x0309 }
                com.moovit.payment.clearance.ClearanceProviderType r7 = com.moovit.payment.clearance.ClearanceProviderType.WUNDER     // Catch:{ NoSuchFieldError -> 0x0309 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0309 }
                r6[r7] = r4     // Catch:{ NoSuchFieldError -> 0x0309 }
            L_0x0309:
                int[] r6 = f44742c     // Catch:{ NoSuchFieldError -> 0x0313 }
                com.moovit.payment.clearance.ClearanceProviderType r7 = com.moovit.payment.clearance.ClearanceProviderType.BUCKAROO     // Catch:{ NoSuchFieldError -> 0x0313 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0313 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0313 }
            L_0x0313:
                com.tranzmate.moovit.protocol.payments.MVClearanceProviderType[] r6 = com.tranzmate.moovit.protocol.payments.MVClearanceProviderType.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                f44741b = r6
                com.tranzmate.moovit.protocol.payments.MVClearanceProviderType r7 = com.tranzmate.moovit.protocol.payments.MVClearanceProviderType.SPREEDLY     // Catch:{ NoSuchFieldError -> 0x0324 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0324 }
                r6[r7] = r1     // Catch:{ NoSuchFieldError -> 0x0324 }
            L_0x0324:
                int[] r6 = f44741b     // Catch:{ NoSuchFieldError -> 0x032e }
                com.tranzmate.moovit.protocol.payments.MVClearanceProviderType r7 = com.tranzmate.moovit.protocol.payments.MVClearanceProviderType.STRIPE     // Catch:{ NoSuchFieldError -> 0x032e }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x032e }
                r6[r7] = r0     // Catch:{ NoSuchFieldError -> 0x032e }
            L_0x032e:
                int[] r6 = f44741b     // Catch:{ NoSuchFieldError -> 0x0338 }
                com.tranzmate.moovit.protocol.payments.MVClearanceProviderType r7 = com.tranzmate.moovit.protocol.payments.MVClearanceProviderType.CUBIC     // Catch:{ NoSuchFieldError -> 0x0338 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0338 }
                r6[r7] = r2     // Catch:{ NoSuchFieldError -> 0x0338 }
            L_0x0338:
                int[] r6 = f44741b     // Catch:{ NoSuchFieldError -> 0x0342 }
                com.tranzmate.moovit.protocol.payments.MVClearanceProviderType r7 = com.tranzmate.moovit.protocol.payments.MVClearanceProviderType.ICEPAY     // Catch:{ NoSuchFieldError -> 0x0342 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0342 }
                r6[r7] = r3     // Catch:{ NoSuchFieldError -> 0x0342 }
            L_0x0342:
                int[] r6 = f44741b     // Catch:{ NoSuchFieldError -> 0x034c }
                com.tranzmate.moovit.protocol.payments.MVClearanceProviderType r7 = com.tranzmate.moovit.protocol.payments.MVClearanceProviderType.WUNDER     // Catch:{ NoSuchFieldError -> 0x034c }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x034c }
                r6[r7] = r4     // Catch:{ NoSuchFieldError -> 0x034c }
            L_0x034c:
                int[] r6 = f44741b     // Catch:{ NoSuchFieldError -> 0x0356 }
                com.tranzmate.moovit.protocol.payments.MVClearanceProviderType r7 = com.tranzmate.moovit.protocol.payments.MVClearanceProviderType.BUCKAROO     // Catch:{ NoSuchFieldError -> 0x0356 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0356 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0356 }
            L_0x0356:
                com.tranzmate.moovit.protocol.payments.MVTokenizeStatus[] r5 = com.tranzmate.moovit.protocol.payments.MVTokenizeStatus.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f44740a = r5
                com.tranzmate.moovit.protocol.payments.MVTokenizeStatus r6 = com.tranzmate.moovit.protocol.payments.MVTokenizeStatus.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0367 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0367 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0367 }
            L_0x0367:
                int[] r1 = f44740a     // Catch:{ NoSuchFieldError -> 0x0371 }
                com.tranzmate.moovit.protocol.payments.MVTokenizeStatus r5 = com.tranzmate.moovit.protocol.payments.MVTokenizeStatus.REJECTED     // Catch:{ NoSuchFieldError -> 0x0371 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0371 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0371 }
            L_0x0371:
                int[] r0 = f44740a     // Catch:{ NoSuchFieldError -> 0x037b }
                com.tranzmate.moovit.protocol.payments.MVTokenizeStatus r1 = com.tranzmate.moovit.protocol.payments.MVTokenizeStatus.FAILED     // Catch:{ NoSuchFieldError -> 0x037b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x037b }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x037b }
            L_0x037b:
                int[] r0 = f44740a     // Catch:{ NoSuchFieldError -> 0x0385 }
                com.tranzmate.moovit.protocol.payments.MVTokenizeStatus r1 = com.tranzmate.moovit.protocol.payments.MVTokenizeStatus.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0385 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0385 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0385 }
            L_0x0385:
                int[] r0 = f44740a     // Catch:{ NoSuchFieldError -> 0x038f }
                com.tranzmate.moovit.protocol.payments.MVTokenizeStatus r1 = com.tranzmate.moovit.protocol.payments.MVTokenizeStatus.NOT_PROCESSED     // Catch:{ NoSuchFieldError -> 0x038f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x038f }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x038f }
            L_0x038f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h60.C17353s0.C17354a.<clinit>():void");
        }
    }

    static {
        C19617r.C19618a aVar = new C19617r.C19618a();
        CreditCardPaymentMethod.C25638b bVar = CreditCardPaymentMethod.f63942f;
        aVar.mo51969a(1, CreditCardPaymentMethod.class, bVar, bVar);
        BalancePaymentMethod.C25628b bVar2 = BalancePaymentMethod.f63925f;
        aVar.mo51969a(2, BalancePaymentMethod.class, bVar2, bVar2);
        BankPaymentMethod.C25632b bVar3 = BankPaymentMethod.f63931f;
        aVar.mo51969a(3, BankPaymentMethod.class, bVar3, bVar3);
        ExternalPaymentMethod.C25669b bVar4 = ExternalPaymentMethod.f64006f;
        aVar.mo51969a(4, ExternalPaymentMethod.class, bVar4, bVar4);
        f44739a = aVar.mo51970b();
    }

    /* renamed from: a */
    public static InvoicePeriod m43387a(MVPTBBillingStatementPeriod mVPTBBillingStatementPeriod) {
        int i = C17354a.f44751l[mVPTBBillingStatementPeriod.ordinal()];
        if (i == 1) {
            return InvoicePeriod.DAY;
        }
        if (i == 2) {
            return InvoicePeriod.MONTH;
        }
        throw new IllegalStateException("Unknown statement period: " + mVPTBBillingStatementPeriod);
    }

    /* renamed from: b */
    public static ClearanceProviderType m43388b(MVClearanceProviderType mVClearanceProviderType) {
        switch (C17354a.f44741b[mVClearanceProviderType.ordinal()]) {
            case 1:
                return ClearanceProviderType.SPREEDLY;
            case 2:
                return ClearanceProviderType.STRIPE;
            case 3:
                return ClearanceProviderType.CUBIC;
            case 4:
                return ClearanceProviderType.ICEPAY;
            case 5:
                return ClearanceProviderType.WUNDER;
            case 6:
                return ClearanceProviderType.BUCKAROO;
            default:
                throw new IllegalStateException("Unknown clearance provider type: " + mVClearanceProviderType);
        }
    }

    /* renamed from: c */
    public static CreditCardInstructions m43389c(String str, MVCreditCardInstructions mVCreditCardInstructions) {
        Map<String, String> map;
        CreditCardFields creditCardFields;
        MVClearanceProvider mVClearanceProvider = mVCreditCardInstructions.clearanceProvider;
        String str2 = mVClearanceProvider.serverKey;
        ClearanceProviderType b = m43388b(mVClearanceProvider.type);
        if (mVClearanceProvider.mo29698f()) {
            map = mVClearanceProvider.properties;
        } else {
            map = Collections.emptyMap();
        }
        ClearanceProviderInstructions clearanceProviderInstructions = new ClearanceProviderInstructions(str2, b, map);
        if (mVCreditCardInstructions.mo29770g()) {
            MVSpecialCreditCardFields mVSpecialCreditCardFields = mVCreditCardInstructions.extraRequiredFields;
            creditCardFields = new CreditCardFields(mVSpecialCreditCardFields.cardHolderId, mVSpecialCreditCardFields.postalCode, mVSpecialCreditCardFields.countryCode, mVSpecialCreditCardFields.billingAddress);
        } else {
            creditCardFields = null;
        }
        return new CreditCardInstructions(str, clearanceProviderInstructions, creditCardFields);
    }

    /* renamed from: d */
    public static CreditCardType m43390d(String str) {
        if (C20964s0.m49090h(str)) {
            return CreditCardType.UNKNOWN;
        }
        for (CreditCardType creditCardType : CreditCardType.values()) {
            if (creditCardType.name().equalsIgnoreCase(str)) {
                return creditCardType;
            }
        }
        return CreditCardType.UNKNOWN;
    }

    /* renamed from: e */
    public static DepositInstructions m43391e(MVDepositInstructions mVDepositInstructions) {
        String str = mVDepositInstructions.paymentContext;
        return new DepositInstructions(str, C13749c.m34318d(mVDepositInstructions.depositAmount), C13720d.m34273c(mVDepositInstructions.depositPaymentMethods, (C13722f) null, new C2342l(20)), m43389c(str, mVDepositInstructions.creditCardInstructions), mVDepositInstructions.isCvvRequired);
    }

    /* renamed from: f */
    public static InputFieldsInstructions m43392f(String str, MVInputFieldsInstructions mVInputFieldsInstructions) {
        C20944i0 i0Var;
        String str2 = mVInputFieldsInstructions.f27345id;
        Image g = C16028g.m40829g(mVInputFieldsInstructions.logo);
        String str3 = mVInputFieldsInstructions.title;
        String str4 = mVInputFieldsInstructions.subtitle;
        C20944i0 i0Var2 = null;
        ArrayList<O> c = C13720d.m34273c(mVInputFieldsInstructions.inputFields, (C13722f) null, new C20228e(21));
        if (mVInputFieldsInstructions.mo29990i()) {
            MVLinkedTextLink mVLinkedTextLink = mVInputFieldsInstructions.inlineLink;
            C20952m0<Integer> m0Var = C13749c.f33838a;
            i0Var = new C20944i0(mVLinkedTextLink.text, mVLinkedTextLink.action);
        } else {
            i0Var = null;
        }
        if (mVInputFieldsInstructions.mo29987g()) {
            MVLinkedTextLink mVLinkedTextLink2 = mVInputFieldsInstructions.footerLink;
            C20952m0<Integer> m0Var2 = C13749c.f33838a;
            i0Var2 = new C20944i0(mVLinkedTextLink2.text, mVLinkedTextLink2.action);
        }
        return new InputFieldsInstructions(str, str2, g, str3, str4, c, i0Var, i0Var2, mVInputFieldsInstructions.actionButtonText);
    }

    /* renamed from: g */
    public static PaymentCertificateStatus m43393g(MVVerificationStatus mVVerificationStatus) {
        int i = C17354a.f44750k[mVVerificationStatus.ordinal()];
        if (i == 1) {
            return PaymentCertificateStatus.PENDING;
        }
        if (i == 2) {
            return PaymentCertificateStatus.EXPIRED;
        }
        if (i == 3) {
            return PaymentCertificateStatus.NOT_VALID;
        }
        if (i == 4) {
            return PaymentCertificateStatus.NOT_UPLOADED;
        }
        if (i == 5) {
            return PaymentCertificateStatus.APPROVED;
        }
        throw new IllegalStateException("Unknown status: " + mVVerificationStatus);
    }

    /* renamed from: h */
    public static C17559a m43394h(AccountAuthType accountAuthType, MVLoginAccountInfo mVLoginAccountInfo) {
        PaymentRegistrationInstructions paymentRegistrationInstructions;
        String str = mVLoginAccountInfo.accountId;
        boolean z = mVLoginAccountInfo.isMigratedUser;
        if (mVLoginAccountInfo.mo30010h()) {
            paymentRegistrationInstructions = m43400n(mVLoginAccountInfo.missingSteps);
        } else {
            paymentRegistrationInstructions = null;
        }
        return new C17559a(accountAuthType, str, z, paymentRegistrationInstructions);
    }

    /* renamed from: i */
    public static PaymentAccountContextStatus m43395i(MVPaymentAccountContextStatus mVPaymentAccountContextStatus) {
        int i = C17354a.f44753n[mVPaymentAccountContextStatus.ordinal()];
        if (i == 1) {
            return PaymentAccountContextStatus.INCOMPLETE;
        }
        if (i == 2) {
            return PaymentAccountContextStatus.CONNECTED;
        }
        if (i == 3) {
            return PaymentAccountContextStatus.DISCONNECTED;
        }
        if (i == 4 || i == 5) {
            return PaymentAccountContextStatus.BLACKLIST;
        }
        throw new IllegalStateException("Unknown payment account context status: " + mVPaymentAccountContextStatus);
    }

    /* renamed from: j */
    public static PaymentMethod m43396j(MVPaymentMethodInfo mVPaymentMethodInfo) {
        PaymentMethodStatus paymentMethodStatus;
        boolean z;
        boolean z2;
        boolean z3;
        Image image;
        String str;
        CreditCardType creditCardType;
        String str2;
        MVPaymentMethodId mVPaymentMethodId = mVPaymentMethodInfo.paymentMethodId;
        PaymentMethodId paymentMethodId = new PaymentMethodId(m43388b(mVPaymentMethodId.provider), mVPaymentMethodId.paymentMethodId);
        boolean z4 = mVPaymentMethodInfo.isDefault;
        String str3 = null;
        boolean z5 = true;
        if (mVPaymentMethodInfo.mo30258i()) {
            MVPaymentMethodStatus mVPaymentMethodStatus = mVPaymentMethodInfo.paymentMethodStatus;
            int i = C17354a.f44745f[mVPaymentMethodStatus.ordinal()];
            if (i == 1) {
                paymentMethodStatus = PaymentMethodStatus.f64058OK;
            } else if (i == 2) {
                paymentMethodStatus = PaymentMethodStatus.EXPIRED;
            } else {
                throw new IllegalStateException("Unknown payment method status: " + mVPaymentMethodStatus);
            }
        } else {
            paymentMethodStatus = null;
        }
        MVPaymentMethod mVPaymentMethod = mVPaymentMethodInfo.paymentMethod;
        F f = mVPaymentMethod.setField_;
        F f2 = MVPaymentMethod._Fields.CARD_PREVIEW;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            F f3 = MVPaymentMethod._Fields.BALANCE;
            if (f == f3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                F f4 = MVPaymentMethod._Fields.BANK_TRANSFER_INFO;
                if (f == f4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    F f5 = MVPaymentMethod._Fields.EXTERNAL_PAYMENT_METHOD;
                    if (f != f5) {
                        z5 = false;
                    }
                    if (!z5) {
                        throw new IllegalStateException("Unknown payment method type!");
                    } else if (f == f5) {
                        MVExternalPaymentMethodInfo mVExternalPaymentMethodInfo = (MVExternalPaymentMethodInfo) mVPaymentMethod.value_;
                        if (mVExternalPaymentMethodInfo.mo29841f()) {
                            image = C16028g.m40829g(mVExternalPaymentMethodInfo.image);
                        } else {
                            image = null;
                        }
                        if (mVExternalPaymentMethodInfo.mo29845i()) {
                            str = mVExternalPaymentMethodInfo.title;
                        } else {
                            str = null;
                        }
                        if (mVExternalPaymentMethodInfo.mo29843h()) {
                            str3 = mVExternalPaymentMethodInfo.subtitle;
                        }
                        return new ExternalPaymentMethod(paymentMethodId, z4, paymentMethodStatus, new ExternalPaymentMethodPreview(image, str, str3));
                    } else {
                        StringBuilder k = C13555b.m33972k("Cannot get field 'externalPaymentMethod' because union is currently set to ");
                        k.append(MVPaymentMethod.m24780k((MVPaymentMethod._Fields) mVPaymentMethod.setField_).f63355a);
                        throw new RuntimeException(k.toString());
                    }
                } else if (f == f4) {
                    MVBankTransferInfo mVBankTransferInfo = (MVBankTransferInfo) mVPaymentMethod.value_;
                    String str4 = mVBankTransferInfo.bankName;
                    Image g = C16028g.m40829g(mVBankTransferInfo.image);
                    if (mVBankTransferInfo.mo29633f()) {
                        str3 = mVBankTransferInfo.accountNumberLastDigits;
                    }
                    return new BankPaymentMethod(paymentMethodId, z4, paymentMethodStatus, new BankPreview(g, str4, str3));
                } else {
                    StringBuilder k2 = C13555b.m33972k("Cannot get field 'bankTransferInfo' because union is currently set to ");
                    k2.append(MVPaymentMethod.m24780k((MVPaymentMethod._Fields) mVPaymentMethod.setField_).f63355a);
                    throw new RuntimeException(k2.toString());
                }
            } else if (f == f3) {
                MVBalanceInfo mVBalanceInfo = (MVBalanceInfo) mVPaymentMethod.value_;
                return new BalancePaymentMethod(paymentMethodId, z4, paymentMethodStatus, new BalancePreview(C16028g.m40829g(mVBalanceInfo.icon), mVBalanceInfo.caption, C13749c.m34318d(mVBalanceInfo.balance)));
            } else {
                StringBuilder k3 = C13555b.m33972k("Cannot get field 'balance' because union is currently set to ");
                k3.append(MVPaymentMethod.m24780k((MVPaymentMethod._Fields) mVPaymentMethod.setField_).f63355a);
                throw new RuntimeException(k3.toString());
            }
        } else if (f == f2) {
            MVCardInfo mVCardInfo = (MVCardInfo) mVPaymentMethod.value_;
            if (mVCardInfo.mo29649g()) {
                creditCardType = m43390d(mVCardInfo.cardType.name());
            } else {
                creditCardType = CreditCardType.UNKNOWN;
            }
            String str5 = mVCardInfo.lastDigits;
            if (mVCardInfo.mo29648f()) {
                str2 = mVCardInfo.cardMonthExpiration;
            } else {
                str2 = null;
            }
            if (mVCardInfo.mo29650h()) {
                str3 = mVCardInfo.cardYearExpiration;
            }
            return new CreditCardPaymentMethod(paymentMethodId, z4, paymentMethodStatus, new CreditCardPreview(creditCardType, str5, str2, str3));
        } else {
            StringBuilder k4 = C13555b.m33972k("Cannot get field 'cardPreview' because union is currently set to ");
            k4.append(MVPaymentMethod.m24780k((MVPaymentMethod._Fields) mVPaymentMethod.setField_).f63355a);
            throw new RuntimeException(k4.toString());
        }
    }

    /* renamed from: k */
    public static PaymentSummaryInfo m43397k(MVPaymentSummary mVPaymentSummary) {
        CreditCardInstructions creditCardInstructions;
        PaymentRegistrationInstructions paymentRegistrationInstructions;
        MVPaymentDiscounts mVPaymentDiscounts;
        DiscountInfo discountInfo;
        List list;
        Image image;
        String str;
        String str2;
        MVPaymentMethods mVPaymentMethods = mVPaymentSummary.allowedPaymentMethods;
        MVPurchasePaymentMethods mVPurchasePaymentMethods = mVPaymentMethods.storedPaymentMethods;
        String str3 = mVPurchasePaymentMethods.paymentContext;
        ArrayList arrayList = new ArrayList();
        LinkedText linkedText = null;
        C13720d.m34276f(mVPaymentMethods.storedPaymentMethods.paymentMethods, (C13722f) null, new C18262i(21), arrayList);
        MVSingleUsePaymentMethods mVSingleUsePaymentMethods = mVPaymentMethods.singleUsePaymentMethods;
        if (mVSingleUsePaymentMethods.mo30584i()) {
            MVGooglePayInstructions mVGooglePayInstructions = mVSingleUsePaymentMethods.googlePayInstructions;
            arrayList.add(new GooglePayGateway(mVGooglePayInstructions.isReadyToPayRequest, mVGooglePayInstructions.paymentDataRequest));
        }
        if (mVSingleUsePaymentMethods.mo30582h()) {
            arrayList.add(new ClearanceProviderGateway(m43389c(str3, mVSingleUsePaymentMethods.clearanceProviderInstructions.creditCardInstructions)));
        }
        if (mVSingleUsePaymentMethods.mo30581g()) {
            MVCashInstructions mVCashInstructions = mVSingleUsePaymentMethods.cashInstructions;
            if (mVCashInstructions.mo29659f()) {
                image = C16028g.m40829g(mVCashInstructions.image);
            } else {
                image = null;
            }
            if (mVCashInstructions.mo29661h()) {
                str = mVCashInstructions.title;
            } else {
                str = null;
            }
            if (mVCashInstructions.mo29660g()) {
                str2 = mVCashInstructions.subtitle;
            } else {
                str2 = null;
            }
            arrayList.add(new CashGateway(image, str, str2));
        }
        if (mVPurchasePaymentMethods.mo30529f()) {
            creditCardInstructions = m43389c(mVPurchasePaymentMethods.paymentContext, mVPurchasePaymentMethods.creditCardInstructions);
        } else {
            creditCardInstructions = null;
        }
        if (mVPaymentSummary.mo30439j()) {
            paymentRegistrationInstructions = m43400n(mVPaymentSummary.missingSteps);
        } else {
            paymentRegistrationInstructions = null;
        }
        if (mVPaymentSummary.mo30440k()) {
            mVPaymentDiscounts = mVPaymentSummary.paymentDiscounts;
        } else {
            mVPaymentDiscounts = null;
        }
        if (mVPaymentDiscounts != null) {
            discountInfo = new DiscountInfo(mVPaymentDiscounts.discountContextId, C13720d.m34273c(mVPaymentDiscounts.discounts, (C13722f) null, new C20415e(14)));
        } else {
            discountInfo = null;
        }
        if (mVPaymentSummary.mo30441l()) {
            list = C13720d.m34273c(mVPaymentSummary.secondaryActions, (C13722f) null, new C19752b(17));
        } else {
            list = Collections.emptyList();
        }
        List list2 = list;
        if (mVPaymentSummary.mo30442m()) {
            linkedText = C13749c.m34323i(mVPaymentSummary.termsOfService.termsOfService);
        }
        return new PaymentSummaryInfo(new PaymentGatewayInstructions(arrayList, creditCardInstructions, paymentRegistrationInstructions), discountInfo, C13749c.m34318d(mVPaymentSummary.fullPrice), C13749c.m34318d(mVPaymentSummary.finalPrice), mVPaymentSummary.isPaymentProviderRequired, list2, linkedText);
    }

    /* renamed from: l */
    public static PhoneAlternativeAuthInstructions m43398l(MVPhoneAlternateAuthInstructions mVPhoneAlternateAuthInstructions) {
        boolean z;
        AlternativeWebAuthProvider alternativeWebAuthProvider;
        String str = mVPhoneAlternateAuthInstructions.actionText;
        MVAlternateAuthProvider mVAlternateAuthProvider = mVPhoneAlternateAuthInstructions.alternateAuthProvider;
        F f = mVAlternateAuthProvider.setField_;
        F f2 = MVAlternateAuthProvider._Fields.WEB_AUTH;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            alternativeWebAuthProvider = null;
        } else if (f == f2) {
            MVAlternateWebAuthProvider mVAlternateWebAuthProvider = (MVAlternateWebAuthProvider) mVAlternateAuthProvider.value_;
            alternativeWebAuthProvider = new AlternativeWebAuthProvider(mVAlternateWebAuthProvider.url, mVAlternateWebAuthProvider.redirectResultUrl);
        } else {
            MVAlternateAuthProvider.m23788k((MVAlternateAuthProvider._Fields) mVAlternateAuthProvider.setField_);
            throw new RuntimeException("Cannot get field 'webAuth' because union is currently set to webAuth");
        }
        return new PhoneAlternativeAuthInstructions(str, alternativeWebAuthProvider);
    }

    /* renamed from: m */
    public static PaymentProfile m43399m(MVProfileSpec mVProfileSpec, Map<String, C20944i0<PaymentCertificateStatus, ProfileCertificateData>> map) {
        List list;
        String str;
        ServerId serverId = new ServerId(mVProfileSpec.profileId);
        String str2 = mVProfileSpec.mainProfileName;
        String str3 = mVProfileSpec.profileName;
        String str4 = mVProfileSpec.profileDescription;
        boolean z = mVProfileSpec.isDefaultProfile;
        if (mVProfileSpec.mo30509q()) {
            list = C13720d.m34273c(mVProfileSpec.requiredInfos, (C13722f) null, new C13689g(map, 1));
        } else {
            list = Collections.emptyList();
        }
        List list2 = list;
        if (mVProfileSpec.mo30505l()) {
            str = mVProfileSpec.profileDiscountDescription;
        } else {
            str = null;
        }
        return new PaymentProfile(serverId, str2, str3, str4, z, list2, str);
    }

    /* renamed from: n */
    public static PaymentRegistrationInstructions m43400n(MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps) {
        CreditCardInstructions creditCardInstructions;
        MotPaymentMethodInstructions motPaymentMethodInstructions;
        TermsOfUseInstructions termsOfUseInstructions;
        ProfilesInstructions profilesInstructions;
        ExternalAccountInstructions externalAccountInstructions;
        ReconnectInstructions reconnectInstructions;
        PhoneInstructions phoneInstructions;
        EmailInstructions emailInstructions;
        EmailInstructions emailInstructions2;
        QuestionInstructions questionInstructions;
        InputInstructions inputInstructions;
        Image image;
        String str;
        String str2;
        QuestionButton questionButton;
        QuestionButton questionButton2;
        PhoneAlternativeAuthInstructions phoneAlternativeAuthInstructions;
        PhoneAlternativeAuthInstructions phoneAlternativeAuthInstructions2;
        Image image2;
        MotPangoInstructions motPangoInstructions;
        MVMissingPaymentRegistrationSteps mVMissingPaymentRegistrationSteps2 = mVMissingPaymentRegistrationSteps;
        String str3 = mVMissingPaymentRegistrationSteps2.paymentContext;
        ArrayList<O> c = C13720d.m34273c(mVMissingPaymentRegistrationSteps2.missingSteps, (C13722f) null, new C18262i(20));
        if (mVMissingPaymentRegistrationSteps.mo30032f()) {
            creditCardInstructions = m43389c(str3, mVMissingPaymentRegistrationSteps2.creditCardInstructions);
        } else {
            creditCardInstructions = null;
        }
        if (mVMissingPaymentRegistrationSteps.mo30038k()) {
            MVMotPaymentMethodInstructions mVMotPaymentMethodInstructions = mVMissingPaymentRegistrationSteps2.motPaymentMethodInstruction;
            CreditCardInstructions c2 = m43389c(str3, mVMotPaymentMethodInstructions.creditCardInstructions);
            if (mVMotPaymentMethodInstructions.mo30065h()) {
                MVCardDetails mVCardDetails = mVMotPaymentMethodInstructions.pangoInstructions.creditCard;
                motPangoInstructions = new MotPangoInstructions(new CreditCardPreview(m43390d(mVCardDetails.cardType), mVCardDetails.cardLastFourDigits, mVCardDetails.cardMonthExpiration, mVCardDetails.cardYearExpiration));
            } else {
                motPangoInstructions = null;
            }
            motPaymentMethodInstructions = new MotPaymentMethodInstructions(c2, motPangoInstructions);
        } else {
            motPaymentMethodInstructions = null;
        }
        if (mVMissingPaymentRegistrationSteps.mo30044r()) {
            MVTermsOfUseInstructions mVTermsOfUseInstructions = mVMissingPaymentRegistrationSteps2.termsOfUseInstructions;
            if (mVTermsOfUseInstructions.mo30622f()) {
                image2 = C16028g.m40829g(mVTermsOfUseInstructions.image);
            } else {
                image2 = null;
            }
            String str4 = mVTermsOfUseInstructions.temsTitle;
            String str5 = mVTermsOfUseInstructions.termsSubtitle;
            MVTOS mvtos = mVTermsOfUseInstructions.terms;
            termsOfUseInstructions = new TermsOfUseInstructions(image2, str4, str5, new LinkedText(mvtos.text, C13720d.m34273c(mvtos.links, (C13722f) null, new C0112l(17))), mVTermsOfUseInstructions.terms.version);
        } else {
            termsOfUseInstructions = null;
        }
        if (mVMissingPaymentRegistrationSteps.mo30041o()) {
            MVProfilesInstructions mVProfilesInstructions = mVMissingPaymentRegistrationSteps2.profilesInstructions;
            ArrayList<O> c3 = C13720d.m34273c(mVProfilesInstructions.profiles, (C13722f) null, new C18267n(20));
            if (!c3.isEmpty()) {
                profilesInstructions = new ProfilesInstructions(c3, mVProfilesInstructions.maxProfilesSelection);
            } else {
                throw new BadResponseException("Payment profiles may not be empty!");
            }
        } else {
            profilesInstructions = null;
        }
        if (mVMissingPaymentRegistrationSteps.mo30034h()) {
            externalAccountInstructions = new ExternalAccountInstructions(m43392f(str3, mVMissingPaymentRegistrationSteps2.externalAccountInstructions.inputInstructions));
        } else {
            externalAccountInstructions = null;
        }
        if (mVMissingPaymentRegistrationSteps.mo30043q()) {
            MVReconnectInstructions mVReconnectInstructions = mVMissingPaymentRegistrationSteps2.reconnectInstructions;
            reconnectInstructions = new ReconnectInstructions(C16028g.m40829g(mVReconnectInstructions.image), mVReconnectInstructions.title, mVReconnectInstructions.subtitle);
        } else {
            reconnectInstructions = null;
        }
        if (mVMissingPaymentRegistrationSteps.mo30040m()) {
            MVPhoneInstructions mVPhoneInstructions = mVMissingPaymentRegistrationSteps2.phoneInstructions;
            if (mVPhoneInstructions.mo30474f()) {
                phoneAlternativeAuthInstructions = m43398l(mVPhoneInstructions.alternateAuthInstructions);
            } else {
                phoneAlternativeAuthInstructions = null;
            }
            if (mVPhoneInstructions.mo30475g()) {
                phoneAlternativeAuthInstructions2 = m43398l(mVPhoneInstructions.secondaryAuthInstructions);
            } else {
                phoneAlternativeAuthInstructions2 = null;
            }
            phoneInstructions = new PhoneInstructions(phoneAlternativeAuthInstructions, phoneAlternativeAuthInstructions2);
        } else {
            phoneInstructions = null;
        }
        if (mVMissingPaymentRegistrationSteps.mo30033g()) {
            MVEmailVerificationInstructions mVEmailVerificationInstructions = mVMissingPaymentRegistrationSteps2.emailInstructions;
            emailInstructions = new EmailInstructions(mVEmailVerificationInstructions.title, mVEmailVerificationInstructions.subtitle);
        } else {
            emailInstructions = null;
        }
        if (mVMissingPaymentRegistrationSteps.mo30042p()) {
            MVQuestionInstructions mVQuestionInstructions = mVMissingPaymentRegistrationSteps2.questionInstructions;
            String str6 = mVQuestionInstructions.questionId;
            if (mVQuestionInstructions.mo30546f()) {
                image = C16028g.m40829g(mVQuestionInstructions.image);
            } else {
                image = null;
            }
            if (mVQuestionInstructions.mo30552k()) {
                str = mVQuestionInstructions.title;
            } else {
                str = null;
            }
            if (mVQuestionInstructions.mo30547g()) {
                str2 = mVQuestionInstructions.instructions;
            } else {
                str2 = null;
            }
            if (mVQuestionInstructions.mo30548h()) {
                MVQuestionButton mVQuestionButton = mVQuestionInstructions.primaryButton;
                emailInstructions2 = emailInstructions;
                questionButton = new QuestionButton(mVQuestionButton.f27670id, mVQuestionButton.text);
            } else {
                emailInstructions2 = emailInstructions;
                questionButton = null;
            }
            if (mVQuestionInstructions.mo30551j()) {
                MVQuestionButton mVQuestionButton2 = mVQuestionInstructions.secondaryButton;
                questionButton2 = new QuestionButton(mVQuestionButton2.f27670id, mVQuestionButton2.text);
            } else {
                questionButton2 = null;
            }
            questionInstructions = new QuestionInstructions(str6, image, str, str2, questionButton, questionButton2);
        } else {
            emailInstructions2 = emailInstructions;
            questionInstructions = null;
        }
        if (mVMissingPaymentRegistrationSteps.mo30036i()) {
            inputInstructions = new InputInstructions(m43392f(str3, mVMissingPaymentRegistrationSteps2.inputInstructions.inputInstructions));
        } else {
            inputInstructions = null;
        }
        PaymentRegistrationInstructions paymentRegistrationInstructions = new PaymentRegistrationInstructions(str3, c, creditCardInstructions, motPaymentMethodInstructions, termsOfUseInstructions, profilesInstructions, externalAccountInstructions, reconnectInstructions, phoneInstructions, emailInstructions2, questionInstructions, inputInstructions);
        List<PaymentRegistrationStep> list = paymentRegistrationInstructions.f42759c;
        if (list.contains(PaymentRegistrationStep.CREDIT_CARD) && paymentRegistrationInstructions.f42760d == null) {
            throw new BadResponseException("CreditCardInstructions may not be null!");
        } else if (list.contains(PaymentRegistrationStep.MOT_PAYMENT_METHOD) && paymentRegistrationInstructions.f42761e == null) {
            throw new BadResponseException("MotPaymentMethodInstructions may not be null!");
        } else if (list.contains(PaymentRegistrationStep.TERMS_OF_USE) && paymentRegistrationInstructions.f42762f == null) {
            throw new BadResponseException("TermsOfUseInstructions may not be null!");
        } else if (list.contains(PaymentRegistrationStep.PROFILE) && paymentRegistrationInstructions.f42763g == null) {
            throw new BadResponseException("ProfilesInstructions may not be null!");
        } else if (list.contains(PaymentRegistrationStep.EXTERNAL_ACCOUNT) && paymentRegistrationInstructions.f42764h == null) {
            throw new BadResponseException("ExternalAccountInstructions may not be null!");
        } else if (list.contains(PaymentRegistrationStep.RECONNECT) && paymentRegistrationInstructions.f42765i == null) {
            throw new BadResponseException("ReconnectInstructions may not be null!");
        } else if (list.contains(PaymentRegistrationStep.PHONE) && paymentRegistrationInstructions.f42766j == null) {
            throw new BadResponseException("PhoneInstructions may not be null!");
        } else if (!list.contains(PaymentRegistrationStep.INPUT) || paymentRegistrationInstructions.f42769m != null) {
            return paymentRegistrationInstructions;
        } else {
            throw new BadResponseException("InputInstructions may not be null!");
        }
    }

    /* renamed from: o */
    public static C16947a m43401o(MVPTBBillingUpcomingStatement mVPTBBillingUpcomingStatement) {
        CurrencyAmount currencyAmount;
        CurrencyAmount d = C13749c.m34318d(mVPTBBillingUpcomingStatement.price);
        if (mVPTBBillingUpcomingStatement.mo30878g()) {
            currencyAmount = C13749c.m34318d(mVPTBBillingUpcomingStatement.fullPrice);
        } else {
            currencyAmount = d;
        }
        return new C16947a(d, currencyAmount, m43387a(mVPTBBillingUpcomingStatement.period), mVPTBBillingUpcomingStatement.calculationTime);
    }

    /* renamed from: p */
    public static WebInstruction m43402p(MVTokenizeReturnUrls mVTokenizeReturnUrls) {
        return new WebInstruction(mVTokenizeReturnUrls.returnSuccessUrl, mVTokenizeReturnUrls.returnFailUrl, mVTokenizeReturnUrls.returnRejectUrl, mVTokenizeReturnUrls.returnCancelUrl);
    }

    /* renamed from: q */
    public static MVClearanceProviderType m43403q(ClearanceProviderType clearanceProviderType) {
        switch (C17354a.f44742c[clearanceProviderType.ordinal()]) {
            case 1:
                return MVClearanceProviderType.SPREEDLY;
            case 2:
                return MVClearanceProviderType.STRIPE;
            case 3:
                return MVClearanceProviderType.CUBIC;
            case 4:
                return MVClearanceProviderType.ICEPAY;
            case 5:
                return MVClearanceProviderType.WUNDER;
            case 6:
                return MVClearanceProviderType.BUCKAROO;
            default:
                throw new IllegalStateException("Unknown clearance provider type: " + clearanceProviderType);
        }
    }

    /* renamed from: r */
    public static MVCardType m43404r(CreditCardType creditCardType) {
        switch (C17354a.f44744e[creditCardType.ordinal()]) {
            case 1:
                return MVCardType.VISA;
            case 2:
                return MVCardType.MASTERCARD;
            case 3:
                return MVCardType.AMERICAN_EXPRESS;
            case 4:
                return MVCardType.DINERS_CLUB;
            case 5:
                return MVCardType.DISCOVER;
            case 6:
                return MVCardType.JCB;
            case 7:
                return MVCardType.MAESTRO;
            case 8:
                return MVCardType.UNIONPAY;
            case 9:
                return MVCardType.BANCONTACT;
            default:
                return MVCardType.UNKNOWN;
        }
    }

    /* renamed from: s */
    public static MVPaymentMethodId m43405s(PaymentMethodId paymentMethodId) {
        if (paymentMethodId == null) {
            return null;
        }
        MVClearanceProviderType q = m43403q(paymentMethodId.f64056b);
        String str = paymentMethodId.f64057c;
        MVPaymentMethodId mVPaymentMethodId = new MVPaymentMethodId();
        mVPaymentMethodId.provider = q;
        mVPaymentMethodId.paymentMethodId = str;
        return mVPaymentMethodId;
    }

    /* renamed from: t */
    public static MVPaymentProperties m43406t(ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions, boolean z) {
        MVCurrencyAmount p = C13749c.m34330p(clearanceProviderPaymentInstructions.f42588f);
        String str = clearanceProviderPaymentInstructions.f42585c;
        String str2 = clearanceProviderPaymentInstructions.f42584b;
        Map<String, String> map = clearanceProviderPaymentInstructions.f42586d;
        MVPaymentProperties mVPaymentProperties = new MVPaymentProperties();
        mVPaymentProperties.price = p;
        mVPaymentProperties.paymentDescription = str;
        mVPaymentProperties.saveForLater = z;
        mVPaymentProperties.mo30293k();
        mVPaymentProperties.paymentContext = str2;
        if (!map.isEmpty()) {
            mVPaymentProperties.properties = map;
        }
        return mVPaymentProperties;
    }

    /* renamed from: u */
    public static MVPaymentRequestProperties m43407u(C20277a aVar) {
        String str = aVar.f51412a;
        MVPaymentRequestProperties mVPaymentRequestProperties = new MVPaymentRequestProperties();
        mVPaymentRequestProperties.paymentContext = str;
        CurrencyAmount currencyAmount = aVar.f51413b;
        if (currencyAmount != null) {
            mVPaymentRequestProperties.itemPrice = C13749c.m34330p(currencyAmount);
        }
        String str2 = aVar.f51414c;
        if (str2 != null) {
            mVPaymentRequestProperties.discountContextId = str2;
        }
        PaymentOptions paymentOptions = aVar.f51415d;
        if (paymentOptions != null) {
            MVPaymentOptions mVPaymentOptions = new MVPaymentOptions();
            mVPaymentOptions.itemQuantity = paymentOptions.f42620b;
            mVPaymentOptions.mo30280g();
            mVPaymentRequestProperties.paymentOptions = mVPaymentOptions;
        }
        Map<String, String> map = aVar.f51416e;
        if (!C13717b.m34259f(map)) {
            mVPaymentRequestProperties.properties = map;
        }
        return mVPaymentRequestProperties;
    }
}
