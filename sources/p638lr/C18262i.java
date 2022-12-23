package p638lr;

import c00.C13721e;
import com.veriff.sdk.camera.core.ImageCapture;
import com.veriff.sdk.camera.core.impl.CameraCaptureResult;
import p227r.C6227a;
import p269u2.C6678b;

/* renamed from: lr.i */
public final /* synthetic */ class C18262i implements C13721e, C6227a {

    /* renamed from: b */
    public final /* synthetic */ int f46586b;

    public /* synthetic */ C18262i(int i) {
        this.f46586b = i;
    }

    public Object apply(Object obj) {
        switch (this.f46586b) {
            case 0:
                return Boolean.valueOf(((C6678b) obj).inTransaction());
            default:
                return ImageCapture.lambda$triggerAePrecapture$18((CameraCaptureResult) obj);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: com.moovit.micromobility.MicroMobilityConfirmationInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: com.moovit.micromobility.MicroMobilityConfirmationInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: com.moovit.micromobility.MicroMobilityConfirmationInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: com.moovit.micromobility.MicroMobilityConfirmationInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: com.moovit.micromobility.MicroMobilityConfirmationInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: com.moovit.micromobility.MicroMobilityConfirmationInfo} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: com.moovit.micromobility.MicroMobilityConfirmationInfo} */
    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r7v8, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object convert(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.f46586b
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            switch(r1) {
                case 0: goto L_0x032d;
                case 1: goto L_0x0326;
                case 2: goto L_0x0316;
                case 3: goto L_0x030f;
                case 4: goto L_0x0301;
                case 5: goto L_0x02fa;
                case 6: goto L_0x028f;
                case 7: goto L_0x0286;
                case 8: goto L_0x027f;
                case 9: goto L_0x0270;
                case 10: goto L_0x0267;
                case 11: goto L_0x025c;
                case 12: goto L_0x01f7;
                case 13: goto L_0x01bc;
                case 14: goto L_0x01b3;
                case 15: goto L_0x01aa;
                case 16: goto L_0x019c;
                case 17: goto L_0x0193;
                case 18: goto L_0x010f;
                case 19: goto L_0x0106;
                case 20: goto L_0x00a8;
                case 21: goto L_0x009a;
                case 22: goto L_0x0091;
                case 23: goto L_0x0088;
                case 24: goto L_0x007d;
                case 25: goto L_0x006f;
                case 26: goto L_0x0040;
                case 27: goto L_0x0031;
                case 28: goto L_0x000f;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0336
        L_0x000f:
            r1 = r21
            com.tranzmate.moovit.protocol.gtfs.MVPlatformLines r1 = (com.tranzmate.moovit.protocol.gtfs.MVPlatformLines) r1
            c00.c r2 = com.moovit.transit.C7841a.f23766a
            java.lang.String r2 = r1.name
            java.util.List<java.lang.Integer> r1 = r1.lineIds
            tt.a r3 = new tt.a
            r4 = 22
            r3.<init>(r4)
            c00.n<com.moovit.network.model.ServerId, com.moovit.database.DbEntityRef<com.moovit.transit.TransitLine>> r4 = com.moovit.database.DbEntityRef.LINE_ID_TO_LINE_REF_CONVERTER
            c00.c r5 = new c00.c
            r5.<init>(r4, r3)
            java.util.ArrayList r1 = c00.C13720d.m34273c(r1, r7, r5)
            com.moovit.transit.TransitStopPlatform r3 = new com.moovit.transit.TransitStopPlatform
            r3.<init>(r2, r1)
            return r3
        L_0x0031:
            r7 = r21
            java.lang.String r7 = (java.lang.String) r7
            com.moovit.ticketing.purchase.filter.PurchaseFilter r1 = new com.moovit.ticketing.purchase.filter.PurchaseFilter
            r6 = 0
            r8 = 0
            r9 = 0
            r4 = r1
            r5 = r7
            r4.<init>(r5, r6, r7, r8, r9)
            return r1
        L_0x0040:
            r1 = r21
            com.tranzmate.moovit.protocol.ticketingV2.MVTransaction r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVTransaction) r1
            sz.r r2 = q80.C13036y.f32248a
            boolean r2 = r1.mo33214g()
            if (r2 == 0) goto L_0x0054
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r2 = r1.image
            com.moovit.image.model.Image r2 = com.moovit.image.C16028g.m40829g(r2)
            r9 = r2
            goto L_0x0055
        L_0x0054:
            r9 = r7
        L_0x0055:
            java.lang.String r10 = r1.name
            long r11 = r1.time
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r2 = r1.amount
            com.moovit.util.CurrencyAmount r13 = c70.C13749c.m34318d(r2)
            boolean r2 = r1.mo33217i()
            if (r2 == 0) goto L_0x0067
            java.lang.String r7 = r1.receiptUrl
        L_0x0067:
            r14 = r7
            com.moovit.ticketing.purchase.history.Transaction r1 = new com.moovit.ticketing.purchase.history.Transaction
            r8 = r1
            r8.<init>(r9, r10, r11, r13, r14)
            return r1
        L_0x006f:
            r1 = r21
            com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyConfig r1 = (com.tranzmate.moovit.protocol.ticketingV2.MVTicketingAgencyConfig) r1
            sz.r r2 = q80.C13036y.f32248a
            int r1 = r1.providerId
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r2.<init>(r1)
            return r2
        L_0x007d:
            r1 = r21
            com.google.android.gms.tasks.Task r1 = (com.google.android.gms.tasks.Task) r1
            java.lang.Object r1 = r1.getResult()
            com.moovit.ticketing.ticket.Ticket r1 = (com.moovit.ticketing.ticket.Ticket) r1
            return r1
        L_0x0088:
            r1 = r21
            com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDigest r1 = (com.tranzmate.moovit.protocol.serviceAlerts.MVServiceAlertDigest) r1
            j80.c r1 = j80.C12776e.m32581e(r1)
            return r1
        L_0x0091:
            r1 = r21
            com.moovit.transit.TransitStop r1 = (com.moovit.transit.TransitStop) r1
            com.moovit.transit.LocationDescriptor r1 = com.moovit.transit.LocationDescriptor.m17769c(r1)
            return r1
        L_0x009a:
            r1 = r21
            com.tranzmate.moovit.protocol.payments.MVPaymentMethodInfo r1 = (com.tranzmate.moovit.protocol.payments.MVPaymentMethodInfo) r1
            com.moovit.payment.gateway.paymentmethod.PaymentMethodGateway r2 = new com.moovit.payment.gateway.paymentmethod.PaymentMethodGateway
            com.moovit.payment.account.paymentmethod.PaymentMethod r1 = h60.C17353s0.m43396j(r1)
            r2.<init>((com.moovit.payment.account.paymentmethod.PaymentMethod) r1)
            return r2
        L_0x00a8:
            r1 = r21
            com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep r1 = (com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationStep) r1
            sz.r r2 = h60.C17353s0.f44739a
            int[] r2 = h60.C17353s0.C17354a.f44743d
            int r3 = r1.ordinal()
            r2 = r2[r3]
            switch(r2) {
                case 1: goto L_0x0103;
                case 2: goto L_0x0100;
                case 3: goto L_0x00fd;
                case 4: goto L_0x00fa;
                case 5: goto L_0x00f7;
                case 6: goto L_0x00f4;
                case 7: goto L_0x00f1;
                case 8: goto L_0x00ee;
                case 9: goto L_0x00eb;
                case 10: goto L_0x00e8;
                case 11: goto L_0x00e5;
                case 12: goto L_0x00e2;
                case 13: goto L_0x00df;
                case 14: goto L_0x00dc;
                case 15: goto L_0x00d9;
                case 16: goto L_0x00d6;
                case 17: goto L_0x00d3;
                case 18: goto L_0x00d0;
                default: goto L_0x00b9;
            }
        L_0x00b9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unknown registration step: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x00d0:
            com.moovit.payment.registration.steps.cc.PaymentRegistrationStep r1 = com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep.INPUT
            goto L_0x0105
        L_0x00d3:
            com.moovit.payment.registration.steps.cc.PaymentRegistrationStep r1 = com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep.QUESTION
            goto L_0x0105
        L_0x00d6:
            com.moovit.payment.registration.steps.cc.PaymentRegistrationStep r1 = com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep.WEB
            goto L_0x0105
        L_0x00d9:
            com.moovit.payment.registration.steps.cc.PaymentRegistrationStep r1 = com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep.EMAIL_VERIFICATION
            goto L_0x0105
        L_0x00dc:
            com.moovit.payment.registration.steps.cc.PaymentRegistrationStep r1 = com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep.ADDRESS
            goto L_0x0105
        L_0x00df:
            com.moovit.payment.registration.steps.cc.PaymentRegistrationStep r1 = com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep.VERIFF
            goto L_0x0105
        L_0x00e2:
            com.moovit.payment.registration.steps.cc.PaymentRegistrationStep r1 = com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep.RECONNECT
            goto L_0x0105
        L_0x00e5:
            com.moovit.payment.registration.steps.cc.PaymentRegistrationStep r1 = com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep.EXTERNAL_ACCOUNT
            goto L_0x0105
        L_0x00e8:
            com.moovit.payment.registration.steps.cc.PaymentRegistrationStep r1 = com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep.PROFILE
            goto L_0x0105
        L_0x00eb:
            com.moovit.payment.registration.steps.cc.PaymentRegistrationStep r1 = com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep.MOT_PAYMENT_METHOD
            goto L_0x0105
        L_0x00ee:
            com.moovit.payment.registration.steps.cc.PaymentRegistrationStep r1 = com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep.CREDIT_CARD
            goto L_0x0105
        L_0x00f1:
            com.moovit.payment.registration.steps.cc.PaymentRegistrationStep r1 = com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep.ID_VERIFICATION
            goto L_0x0105
        L_0x00f4:
            com.moovit.payment.registration.steps.cc.PaymentRegistrationStep r1 = com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep.ID
            goto L_0x0105
        L_0x00f7:
            com.moovit.payment.registration.steps.cc.PaymentRegistrationStep r1 = com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep.BIRTH_DATE
            goto L_0x0105
        L_0x00fa:
            com.moovit.payment.registration.steps.cc.PaymentRegistrationStep r1 = com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep.EMAIL
            goto L_0x0105
        L_0x00fd:
            com.moovit.payment.registration.steps.cc.PaymentRegistrationStep r1 = com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep.NAME
            goto L_0x0105
        L_0x0100:
            com.moovit.payment.registration.steps.cc.PaymentRegistrationStep r1 = com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep.PHONE
            goto L_0x0105
        L_0x0103:
            com.moovit.payment.registration.steps.cc.PaymentRegistrationStep r1 = com.moovit.payment.registration.steps.p419cc.PaymentRegistrationStep.TERMS_OF_USE
        L_0x0105:
            return r1
        L_0x0106:
            r1 = r21
            com.tranzmate.moovit.protocol.payments.MVInputField r1 = (com.tranzmate.moovit.protocol.payments.MVInputField) r1
            com.moovit.inputfields.InputField r1 = c70.C13749c.m34321g(r1)
            return r1
        L_0x010f:
            r1 = r21
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityAction r1 = (com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityAction) r1
            java.lang.String r6 = r1.actionId
            java.lang.String r8 = r1.actionCtaText
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoType r9 = r1.requiredInfoType
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoData r10 = r1.requiredInfoData
            int[] r11 = t30.C6569j.C6570a.f20385c
            int r9 = r9.ordinal()
            r9 = r11[r9]
            if (r9 == r5) goto L_0x016c
            if (r9 == r4) goto L_0x0166
            if (r9 == r3) goto L_0x0139
            if (r9 != r2) goto L_0x0131
            com.moovit.micromobility.action.requiredinfo.MicroMobilityRatingRequiredInfo r2 = new com.moovit.micromobility.action.requiredinfo.MicroMobilityRatingRequiredInfo
            r2.<init>()
            goto L_0x0171
        L_0x0131:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "failed to decode micro-mobility action required info"
            r1.<init>(r2)
            throw r1
        L_0x0139:
            if (r10 == 0) goto L_0x0155
            F r2 = r10.setField_
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoData$_Fields r3 = com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoData._Fields.QR_CODE
            if (r2 != r3) goto L_0x0146
            java.lang.Object r2 = r10.value_
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityQrCodeActionInfo r2 = (com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityQrCodeActionInfo) r2
            goto L_0x0156
        L_0x0146:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            F r2 = r10.setField_
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoData$_Fields r2 = (com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoData._Fields) r2
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityActionRequiredInfoData.m22620k(r2)
            java.lang.String r2 = "Cannot get field 'qrCode' because union is currently set to qrCode"
            r1.<init>(r2)
            throw r1
        L_0x0155:
            r2 = r7
        L_0x0156:
            if (r2 == 0) goto L_0x015d
            java.lang.String r3 = r2.title
            java.lang.String r2 = r2.instructions
            goto L_0x015f
        L_0x015d:
            r2 = r7
            r3 = r2
        L_0x015f:
            com.moovit.micromobility.action.requiredinfo.MicroMobilityQrCodeRequiredInfo r4 = new com.moovit.micromobility.action.requiredinfo.MicroMobilityQrCodeRequiredInfo
            r4.<init>(r3, r2)
            r2 = r4
            goto L_0x0171
        L_0x0166:
            com.moovit.micromobility.action.requiredinfo.MicroMobilityPhotoRequiredInfo r2 = new com.moovit.micromobility.action.requiredinfo.MicroMobilityPhotoRequiredInfo
            r2.<init>()
            goto L_0x0171
        L_0x016c:
            com.moovit.micromobility.action.requiredinfo.MicroMobilityNoRequiredInfo r2 = new com.moovit.micromobility.action.requiredinfo.MicroMobilityNoRequiredInfo
            r2.<init>()
        L_0x0171:
            boolean r3 = r1.mo28591h()
            if (r3 == 0) goto L_0x018d
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityConfirmation r1 = r1.confirmationDialog
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r3 = r1.image
            com.moovit.image.model.Image r10 = com.moovit.image.C16028g.m40829g(r3)
            java.lang.String r11 = r1.title
            java.lang.String r12 = r1.text
            java.lang.String r13 = r1.positiveText
            java.lang.String r14 = r1.negetiveText
            com.moovit.micromobility.MicroMobilityConfirmationInfo r7 = new com.moovit.micromobility.MicroMobilityConfirmationInfo
            r9 = r7
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x018d:
            com.moovit.micromobility.action.MicroMobilityAction r1 = new com.moovit.micromobility.action.MicroMobilityAction
            r1.<init>(r6, r8, r2, r7)
            return r1
        L_0x0193:
            r1 = r21
            com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRide r1 = (com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityRide) r1
            com.moovit.micromobility.ride.MicroMobilityRide r1 = t30.C6569j.m15501b(r1)
            return r1
        L_0x019c:
            r1 = r21
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r2.<init>(r1)
            return r2
        L_0x01aa:
            r1 = r21
            com.tranzmate.moovit.protocol.common.MVAccessory r1 = (com.tranzmate.moovit.protocol.common.MVAccessory) r1
            com.moovit.util.StyledText r1 = c70.C13749c.m34328n(r1)
            return r1
        L_0x01b3:
            r1 = r21
            com.moovit.tripplanner.TripPlannerTransportType r1 = (com.moovit.tripplanner.TripPlannerTransportType) r1
            com.tranzmate.moovit.protocol.common.MVRouteType r1 = com.moovit.itinerary.C16080a.m40969y(r1)
            return r1
        L_0x01bc:
            r1 = r21
            com.tranzmate.moovit.protocol.users.MVCountry r1 = (com.tranzmate.moovit.protocol.users.MVCountry) r1
            zz.m0<java.lang.Integer> r2 = c70.C13749c.f33838a
            short r2 = r1.f30349id
            com.moovit.network.model.ServerId r9 = new com.moovit.network.model.ServerId
            r9.<init>(r2)
            java.lang.String r10 = r1.name
            int r2 = r1.flag
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            com.moovit.image.model.Image r11 = com.moovit.image.C16028g.m40823a(r2)
            java.util.List<com.tranzmate.moovit.protocol.users.MVMetroArea> r2 = r1.metroAreas
            hq.e r3 = new hq.e
            r4 = 17
            r3.<init>(r4)
            java.util.ArrayList r12 = c00.C13720d.m34273c(r2, r7, r3)
            boolean r2 = r1.mo35030h()
            if (r2 == 0) goto L_0x01eb
            java.util.List<java.lang.String> r1 = r1.keywords
            goto L_0x01ef
        L_0x01eb:
            java.util.List r1 = java.util.Collections.emptyList()
        L_0x01ef:
            r13 = r1
            com.moovit.metro.selection.Country r1 = new com.moovit.metro.selection.Country
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13)
            return r1
        L_0x01f7:
            r1 = r21
            com.tranzmate.moovit.protocol.wondo.MVWondoReward r1 = (com.tranzmate.moovit.protocol.wondo.MVWondoReward) r1
            int r7 = r1.f30777id
            com.moovit.network.model.ServerId r8 = new com.moovit.network.model.ServerId
            r8.<init>(r7)
            com.tranzmate.moovit.protocol.wondo.MVWondoRewardStatus r7 = r1.status
            int[] r9 = p881vy.C20255i.C20256a.f51362a
            int r10 = r7.ordinal()
            r9 = r9[r10]
            if (r9 == r5) goto L_0x0234
            if (r9 == r4) goto L_0x0231
            if (r9 == r3) goto L_0x022e
            if (r9 != r2) goto L_0x0217
            com.moovit.app.wondo.tickets.model.WondoRewardStatus r2 = com.moovit.app.wondo.tickets.model.WondoRewardStatus.TEST_CODE
            goto L_0x0236
        L_0x0217:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unknown wondo reward status: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x022e:
            com.moovit.app.wondo.tickets.model.WondoRewardStatus r2 = com.moovit.app.wondo.tickets.model.WondoRewardStatus.CANCELLED
            goto L_0x0236
        L_0x0231:
            com.moovit.app.wondo.tickets.model.WondoRewardStatus r2 = com.moovit.app.wondo.tickets.model.WondoRewardStatus.REDEEMED
            goto L_0x0236
        L_0x0234:
            com.moovit.app.wondo.tickets.model.WondoRewardStatus r2 = com.moovit.app.wondo.tickets.model.WondoRewardStatus.AVAILABLE
        L_0x0236:
            com.tranzmate.moovit.protocol.wondo.MVWondoRewardDisplayInfo r3 = r1.displayInfo
            java.lang.String r4 = r3.iconUrl
            java.lang.String[] r5 = new java.lang.String[r6]
            com.moovit.image.model.UriImage r10 = com.moovit.image.model.UriImage.m40912c(r4, r5)
            java.lang.String r11 = r3.header
            java.lang.String r12 = r3.descriptionText
            java.lang.String r13 = r3.quantityText
            java.lang.String r14 = r3.expirationText
            java.lang.String r3 = r3.legalUrl
            android.net.Uri r15 = android.net.Uri.parse(r3)
            com.moovit.app.wondo.tickets.model.WondoRewardDisplayInfo r3 = new com.moovit.app.wondo.tickets.model.WondoRewardDisplayInfo
            r9 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15)
            java.util.List<java.lang.String> r1 = r1.providers
            com.moovit.app.wondo.tickets.model.WondoReward r4 = new com.moovit.app.wondo.tickets.model.WondoReward
            r4.<init>(r8, r2, r3, r1)
            return r4
        L_0x025c:
            r1 = r21
            com.moovit.network.model.ServerId r1 = (com.moovit.network.model.ServerId) r1
            int r1 = r1.f15142b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            return r1
        L_0x0267:
            r1 = r21
            java.lang.String r1 = (java.lang.String) r1
            com.moovit.commons.geo.Polylon r1 = com.moovit.commons.geo.Polylon.m40195m(r1)
            return r1
        L_0x0270:
            r1 = r21
            com.moovit.commons.geo.Polygon r1 = (com.moovit.commons.geo.Polygon) r1
            com.moovit.app.taxi.providers.TaxiPolygon r2 = new com.moovit.app.taxi.providers.TaxiPolygon
            com.moovit.app.taxi.providers.TaxiPolygonSettings r3 = new com.moovit.app.taxi.providers.TaxiPolygonSettings
            r3.<init>(r7)
            r2.<init>(r1, r3)
            return r2
        L_0x027f:
            r1 = r21
            gw.a r1 = (p525gw.C17246a) r1
            java.lang.String r1 = r1.f44573a
            return r1
        L_0x0286:
            r1 = r21
            com.tranzmate.moovit.protocol.common.MVTextOrImage r1 = (com.tranzmate.moovit.protocol.common.MVTextOrImage) r1
            x00.a r1 = c70.C13749c.m34319e(r1)
            return r1
        L_0x028f:
            r1 = r21
            com.tranzmate.moovit.protocol.ridesharing.MVRSEventTransitOption r1 = (com.tranzmate.moovit.protocol.ridesharing.MVRSEventTransitOption) r1
            int r2 = r1.eventId
            com.moovit.network.model.ServerId r9 = new com.moovit.network.model.ServerId
            r9.<init>(r2)
            long r10 = r1.eventTripTime
            com.tranzmate.moovit.protocol.common.MVVehicleType r2 = r1.vehicleType
            com.moovit.ridesharing.model.EventVehicleType r12 = d70.C16536a.m42034f(r2)
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r2 = r1.transitOptionPrice
            com.moovit.util.CurrencyAmount r13 = c70.C13749c.m34318d(r2)
            boolean r2 = r1.mo31321f()
            if (r2 == 0) goto L_0x02b6
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r2 = r1.discountTransitOptionPrice
            com.moovit.util.CurrencyAmount r2 = c70.C13749c.m34318d(r2)
            r14 = r2
            goto L_0x02b7
        L_0x02b6:
            r14 = r13
        L_0x02b7:
            boolean r2 = r1.mo31325i()
            if (r2 == 0) goto L_0x02c5
            int r2 = r1.remainingSeats
            int r2 = java.lang.Math.max(r6, r2)
            r15 = r2
            goto L_0x02cb
        L_0x02c5:
            r2 = 2147483647(0x7fffffff, float:NaN)
            r15 = 2147483647(0x7fffffff, float:NaN)
        L_0x02cb:
            boolean r2 = r1.mo31326j()
            if (r2 == 0) goto L_0x02da
            com.tranzmate.moovit.protocol.common.MVLocationDescriptor r2 = r1.stopLocation
            com.moovit.transit.LocationDescriptor r2 = c70.C13749c.m34324j(r2, r7)
            r16 = r2
            goto L_0x02dc
        L_0x02da:
            r16 = r7
        L_0x02dc:
            boolean r2 = r1.mo31328l()
            if (r2 == 0) goto L_0x02e5
            long r2 = r1.stopRideDetailsTime
            goto L_0x02e7
        L_0x02e5:
            r2 = -1
        L_0x02e7:
            r17 = r2
            boolean r2 = r1.mo31327k()
            if (r2 == 0) goto L_0x02f1
            java.lang.String r7 = r1.stopRideDetails
        L_0x02f1:
            r19 = r7
            com.moovit.ridesharing.model.EventBookingOption r1 = new com.moovit.ridesharing.model.EventBookingOption
            r8 = r1
            r8.<init>(r9, r10, r12, r13, r14, r15, r16, r17, r19)
            return r1
        L_0x02fa:
            r1 = r21
            com.moovit.map.items.MapItem r1 = (com.moovit.map.items.MapItem) r1
            com.moovit.network.model.ServerId r1 = r1.f42550c
            return r1
        L_0x0301:
            r1 = r21
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r2.<init>(r1)
            return r2
        L_0x030f:
            r1 = r21
            com.moovit.app.mot.model.MotActivation r1 = (com.moovit.app.mot.model.MotActivation) r1
            com.moovit.image.model.Image r1 = r1.f38991h
            return r1
        L_0x0316:
            r1 = r21
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg r1 = (com.moovit.itinerary.model.leg.WaitToTransitLineLeg) r1
            int r2 = com.moovit.app.itinerary.view.SingleLegCard.f38664n0
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg$DeparturesInfo r2 = r1.f42138i
            com.moovit.transit.Schedule r2 = r2.f42142b
            zz.i0 r3 = new zz.i0
            r3.<init>(r1, r2)
            return r3
        L_0x0326:
            r1 = r21
            com.moovit.transit.TransitType r1 = (com.moovit.transit.TransitType) r1
            com.moovit.network.model.ServerId r1 = r1.f23757b
            return r1
        L_0x032d:
            r1 = r21
            com.moovit.tripplanner.TripPlannerTransportType r1 = (com.moovit.tripplanner.TripPlannerTransportType) r1
            com.tranzmate.moovit.protocol.common.MVRouteType r1 = com.moovit.itinerary.C16080a.m40969y(r1)
            return r1
        L_0x0336:
            r1 = r21
            com.tranzmate.moovit.protocol.linearrivals.MVLineArrivalShapeSegment r1 = (com.tranzmate.moovit.protocol.linearrivals.MVLineArrivalShapeSegment) r1
            int r1 = r1.tripShapeId
            com.moovit.network.model.ServerId r2 = new com.moovit.network.model.ServerId
            r2.<init>(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p638lr.C18262i.convert(java.lang.Object):java.lang.Object");
    }
}
