package p638lr;

import android.os.Parcelable;
import c00.C13717b;
import c00.C13720d;
import c00.C13721e;
import c00.C13722f;
import c70.C13749c;
import com.moovit.app.general.settings.notifications.NotificationSettingsActivity;
import com.moovit.app.general.settings.notifications.UserNotificationSetting;
import com.moovit.app.index.UpdateIndexingDescription;
import com.moovit.app.itinerary.C15053i;
import com.moovit.app.itinerary.view.SingleLegCard;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.surveys.answer.SurveyQuestionAnswer;
import com.moovit.app.wondo.tickets.model.WondoOfferPrice;
import com.moovit.commons.request.BadResponseException;
import com.moovit.database.DbEntityRef;
import com.moovit.image.C16028g;
import com.moovit.image.model.Image;
import com.moovit.inputfields.InputFieldValue;
import com.moovit.itinerary.C16080a;
import com.moovit.itinerary.model.TurnInstruction;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.model.PaymentAccountProfile;
import com.moovit.payment.confirmation.summary.discounts.Discount;
import com.moovit.payment.invoices.model.Invoice;
import com.moovit.payment.invoices.model.InvoicePeriod;
import com.moovit.ticketing.configuration.PurchaseSplitConfiguration;
import com.moovit.ticketing.configuration.TicketingAgencyCapability;
import com.moovit.ticketing.ticket.Ticket;
import com.moovit.ticketing.ticket.TicketAgency;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitAgency;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.Time;
import com.tranzmate.moovit.protocol.common.MVImage;
import com.tranzmate.moovit.protocol.kinesis.MVSelectedAnswer;
import com.tranzmate.moovit.protocol.metroinfo.MVAck;
import com.tranzmate.moovit.protocol.payments.MVProfileSpec;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingFinalizedStatement;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBBillingPaymentStatus;
import com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDetails;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitConfiguration;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketProviderValidation;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketProviderValidationInfo;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyCapabilities;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyConfig;
import com.tranzmate.moovit.protocol.ticketingV2.MVTouchPassValidationInfo;
import com.tranzmate.moovit.protocol.tripplanner.MVCarpoolRideAttributes;
import com.tranzmate.moovit.protocol.tripplanner.MVTaxiLegCustomDeepLinkParameter;
import com.tranzmate.moovit.protocol.wondo.MVWondoOfferPurchaseItem;
import g50.C25730d;
import h60.C17353s0;
import j80.C12776e;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l90.C12850a;
import p066e0.C4454r0;
import p595jw.C17948a;
import p639ls.C18274c;
import p735pt.C18990g;
import p786rz.C19387a;
import p80.C12989a;
import p810sz.C19617r;
import p977zz.C20944i0;
import p977zz.C20952m0;
import q80.C13036y;
import t30.C6579s;

/* renamed from: lr.n */
public final /* synthetic */ class C18267n implements C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f46591b;

    public /* synthetic */ C18267n(int i) {
        this.f46591b = i;
    }

    /* JADX INFO: finally extract failed */
    public final Object convert(Object obj) {
        Invoice.Status status;
        Image image;
        DbEntityRef<TransitAgency> dbEntityRef;
        Image image2;
        String str;
        PurchaseSplitConfiguration purchaseSplitConfiguration;
        HashSet<O> hashSet;
        BigDecimal bigDecimal;
        boolean z = true;
        Map<String, String> map = null;
        switch (this.f46591b) {
            case 0:
                return C16080a.m40969y((TripPlannerTransportType) obj);
            case 1:
                MVAck mVAck = (MVAck) obj;
                return new C18274c(C16028g.m40823a(Integer.valueOf(mVAck.image)), mVAck.title, mVAck.desc);
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                int i = NotificationSettingsActivity.f38057n0;
                return String.format(Locale.ENGLISH, "%1$s:%2$s", new Object[]{((UserNotificationSetting) entry.getKey()).getAnalyticsName(), entry.getValue()});
            case 3:
                LocationDescriptor locationDescriptor = (LocationDescriptor) obj;
                Parcelable.Creator<UpdateIndexingDescription> creator = UpdateIndexingDescription.CREATOR;
                return new UpdateIndexingDescription(true, locationDescriptor.mo24313f(), C18990g.m46099b(locationDescriptor), locationDescriptor.mo24313f(), (String) null);
            case 4:
                return Long.valueOf(((Time) obj).mo24631g());
            case 5:
                int i2 = SingleLegCard.f38664n0;
                return ((WaitToTransitLineLeg) ((C20944i0) obj).f52692a).f42135f.getServerId();
            case 6:
                return ((MotActivation) obj).f38992i;
            case 7:
                SurveyQuestionAnswer surveyQuestionAnswer = (SurveyQuestionAnswer) obj;
                C19617r rVar = C17948a.f46011a;
                int i3 = surveyQuestionAnswer.f39836b.f15142b;
                int i4 = surveyQuestionAnswer.f39837c.f15142b;
                int i5 = surveyQuestionAnswer.f39838d.f15142b;
                String str2 = surveyQuestionAnswer.f39839e;
                MVSelectedAnswer mVSelectedAnswer = new MVSelectedAnswer();
                mVSelectedAnswer.nodeId = i3;
                mVSelectedAnswer.mo27916k();
                mVSelectedAnswer.questionId = i4;
                mVSelectedAnswer.mo27917l();
                mVSelectedAnswer.answerId = i5;
                mVSelectedAnswer.mo27915j();
                mVSelectedAnswer.answerValue = str2;
                return mVSelectedAnswer;
            case 8:
                return Integer.valueOf(((ServerId) obj).f15142b);
            case 9:
                MVWondoOfferPurchaseItem mVWondoOfferPurchaseItem = (MVWondoOfferPurchaseItem) obj;
                return new WondoOfferPrice.Item(mVWondoOfferPurchaseItem.purchaseDescription, C13749c.m34318d(mVWondoOfferPurchaseItem.price));
            case 10:
                return C16028g.m40824b((MVImage) obj);
            case 11:
                return C16080a.m40945a((TurnInstruction) obj);
            case 12:
                return ((MVTaxiLegCustomDeepLinkParameter) obj).key;
            case 13:
                MVCarpoolRideAttributes mVCarpoolRideAttributes = (MVCarpoolRideAttributes) obj;
                C19617r rVar2 = C16080a.f41870a;
                if (C16080a.C16081a.f41872b[mVCarpoolRideAttributes.ordinal()] == 1) {
                    return CarpoolLeg.CarpoolAttribute.INSTANT_BOOKING;
                }
                throw new IllegalArgumentException("Unknown attribute type: " + mVCarpoolRideAttributes);
            case 14:
                return C16080a.m40970z((TripPlannerTransportType) obj);
            case 15:
                return new ServerId(((Integer) obj).intValue());
            case 16:
                int i6 = C6579s.f20395A;
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream((String) obj));
                try {
                    byte[] d = C19387a.m46672d(bufferedInputStream);
                    bufferedInputStream.close();
                    return ByteBuffer.wrap(d);
                } catch (Throwable th) {
                    bufferedInputStream.close();
                    throw th;
                }
            case 17:
                int i7 = C25730d.f64163o;
                return ((PaymentAccountProfile) obj).f64033b.f42828b;
            case 18:
                return ((Discount) obj).f42642b;
            case 19:
                MVPTBBillingFinalizedStatement mVPTBBillingFinalizedStatement = (MVPTBBillingFinalizedStatement) obj;
                C19617r rVar3 = C17353s0.f44739a;
                CurrencyAmount d2 = C13749c.m34318d(mVPTBBillingFinalizedStatement.price);
                String str3 = mVPTBBillingFinalizedStatement.documentUrl;
                InvoicePeriod a = C17353s0.m43387a(mVPTBBillingFinalizedStatement.period);
                MVPTBBillingPaymentStatus mVPTBBillingPaymentStatus = mVPTBBillingFinalizedStatement.status;
                int i8 = C17353s0.C17354a.f44752m[mVPTBBillingPaymentStatus.ordinal()];
                if (i8 == 1) {
                    status = Invoice.Status.NOT_PROCESSED;
                } else if (i8 == 2) {
                    status = Invoice.Status.PENDING_APPROVAL;
                } else if (i8 == 3) {
                    status = Invoice.Status.APPROVED;
                } else if (i8 == 4) {
                    status = Invoice.Status.CANCELLED;
                } else if (i8 == 5) {
                    status = Invoice.Status.REJECTED;
                } else {
                    throw new IllegalStateException("Unknown payment status: " + mVPTBBillingPaymentStatus);
                }
                return new Invoice(d2, str3, a, status, mVPTBBillingFinalizedStatement.calculationTime);
            case 20:
                C19617r rVar4 = C17353s0.f44739a;
                return C17353s0.m43399m((MVProfileSpec) obj, Collections.emptyMap());
            case 21:
                return C13749c.m34331q((InputFieldValue) obj);
            case 22:
                return C12776e.m32578b((MVServiceAlertDetails) obj);
            case 23:
                MVTicketingAgencyConfig mVTicketingAgencyConfig = (MVTicketingAgencyConfig) obj;
                C19617r rVar5 = C13036y.f32248a;
                ServerId serverId = new ServerId(mVTicketingAgencyConfig.providerId);
                String str4 = mVTicketingAgencyConfig.agencyKey;
                String str5 = mVTicketingAgencyConfig.agencyName;
                if (mVTicketingAgencyConfig.mo33140g()) {
                    image = C16028g.m40829g(mVTicketingAgencyConfig.agencyImage);
                } else {
                    image = null;
                }
                if (mVTicketingAgencyConfig.mo33139f()) {
                    dbEntityRef = DbEntityRef.newAgencyRef(new ServerId(mVTicketingAgencyConfig.agencyId));
                } else {
                    dbEntityRef = null;
                }
                if (mVTicketingAgencyConfig.mo33144j()) {
                    image2 = C16028g.m40829g(mVTicketingAgencyConfig.backgroundImage);
                } else {
                    image2 = null;
                }
                TicketAgency ticketAgency = new TicketAgency(str4, str5, image, dbEntityRef, image2);
                String str6 = mVTicketingAgencyConfig.purchasePaymentContext;
                HashSet<O> g = C13720d.m34277g(mVTicketingAgencyConfig.capabilities, new C15053i(7), new C18267n(24));
                C13717b.m34261h(g);
                if (mVTicketingAgencyConfig.mo33149p()) {
                    str = mVTicketingAgencyConfig.sdkConfigFileUrl;
                } else {
                    str = null;
                }
                MVPurchaseSplitConfiguration mVPurchaseSplitConfiguration = mVTicketingAgencyConfig.splitConfig;
                if (mVPurchaseSplitConfiguration == null) {
                    purchaseSplitConfiguration = new PurchaseSplitConfiguration((BigDecimal) null);
                } else {
                    if (mVPurchaseSplitConfiguration.mo32715f()) {
                        long j = mVPurchaseSplitConfiguration.minFareAmount;
                        C20952m0<Integer> m0Var = C13749c.f33838a;
                        bigDecimal = new BigDecimal(j).movePointLeft(2);
                    } else {
                        bigDecimal = null;
                    }
                    purchaseSplitConfiguration = new PurchaseSplitConfiguration(bigDecimal);
                }
                if (mVTicketingAgencyConfig.mo33150q()) {
                    hashSet = C13720d.m34277g(mVTicketingAgencyConfig.serviceAreas, (C13722f) null, new C4454r0(24));
                } else {
                    hashSet = null;
                }
                if (mVTicketingAgencyConfig.mo33146l()) {
                    map = mVTicketingAgencyConfig.properties;
                }
                return new C12989a(serverId, ticketAgency, str6, mVTicketingAgencyConfig.walletPaymentContext, g, str, purchaseSplitConfiguration, hashSet, map);
            case 24:
                C19617r rVar6 = C13036y.f32248a;
                switch (C13036y.C13037a.f32257i[((MVTicketingAgencyCapabilities) obj).ordinal()]) {
                    case 1:
                        return TicketingAgencyCapability.TICKETS;
                    case 2:
                        return TicketingAgencyCapability.STORED_VALUE;
                    case 3:
                        return TicketingAgencyCapability.STORED_VALUE_AUTO_LOAD;
                    case 4:
                        return TicketingAgencyCapability.JOURNEY_TICKETS;
                    case 5:
                        return TicketingAgencyCapability.SPLIT_FARE_PAYMENTS;
                    case 6:
                        return TicketingAgencyCapability.PROVIDER_LEVEL_VALIDATION_INFO;
                    case 7:
                        return TicketingAgencyCapability.OFFLINE_MODE;
                    case 8:
                        return TicketingAgencyCapability.PURCHASE_PAYMENT_ACCOUNT_SENSITIVE;
                    default:
                        return null;
                }
            case 25:
                MVTicketProviderValidation mVTicketProviderValidation = (MVTicketProviderValidation) obj;
                C19617r rVar7 = C13036y.f32248a;
                ServerId serverId2 = new ServerId(mVTicketProviderValidation.providerId);
                MVTicketProviderValidationInfo mVTicketProviderValidationInfo = mVTicketProviderValidation.validationInfo;
                F f = mVTicketProviderValidationInfo.setField_;
                F f2 = MVTicketProviderValidationInfo._Fields.TOUCH_PASS;
                if (f != f2) {
                    z = false;
                }
                if (!z) {
                    throw new BadResponseException("Unsupported provider validation info type!");
                } else if (f == f2) {
                    MVTouchPassValidationInfo mVTouchPassValidationInfo = (MVTouchPassValidationInfo) mVTicketProviderValidationInfo.value_;
                    return new C12850a(serverId2, mVTouchPassValidationInfo.key, mVTouchPassValidationInfo.mediaId, mVTouchPassValidationInfo.cardNumber);
                } else {
                    MVTicketProviderValidationInfo.m28586k((MVTicketProviderValidationInfo._Fields) mVTicketProviderValidationInfo.setField_);
                    throw new RuntimeException("Cannot get field 'touchPass' because union is currently set to touchPass");
                }
            case 26:
                return Collections.unmodifiableList((List) obj);
            case 27:
                return ((Ticket) obj).f23474c;
            default:
                return Long.valueOf(((Time) obj).mo24631g());
        }
    }
}
