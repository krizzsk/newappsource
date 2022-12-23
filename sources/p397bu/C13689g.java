package p397bu;

import c00.C13721e;

/* renamed from: bu.g */
public final /* synthetic */ class C13689g implements C13721e {

    /* renamed from: b */
    public final /* synthetic */ int f33741b;

    /* renamed from: c */
    public final /* synthetic */ Object f33742c;

    public /* synthetic */ C13689g(Object obj, int i) {
        this.f33741b = i;
        this.f33742c = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v5, types: [com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object convert(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.f33741b
            switch(r0) {
                case 0: goto L_0x00e3;
                case 1: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0104
        L_0x0007:
            java.lang.Object r0 = r13.f33742c
            java.util.Map r0 = (java.util.Map) r0
            com.tranzmate.moovit.protocol.payments.MVProfileRequiredInfo r14 = (com.tranzmate.moovit.protocol.payments.MVProfileRequiredInfo) r14
            sz.r r1 = h60.C17353s0.f44739a
            F r1 = r14.setField_
            com.tranzmate.moovit.protocol.payments.MVProfileRequiredInfo$_Fields r2 = com.tranzmate.moovit.protocol.payments.MVProfileRequiredInfo._Fields.CERTIFICATE_SPEC
            r3 = 0
            if (r1 != r2) goto L_0x0018
            r4 = 1
            goto L_0x0019
        L_0x0018:
            r4 = 0
        L_0x0019:
            r5 = 0
            if (r4 == 0) goto L_0x0067
            if (r1 != r2) goto L_0x004a
            java.lang.Object r14 = r14.value_
            com.tranzmate.moovit.protocol.payments.MVCertificatesSpec r14 = (com.tranzmate.moovit.protocol.payments.MVCertificatesSpec) r14
            java.lang.String r7 = r14.certificateKey
            java.lang.String r9 = r14.title
            java.lang.String r10 = r14.subTitle
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r14 = r14.image
            com.moovit.image.model.Image r11 = com.moovit.image.C16028g.m40829g(r14)
            java.lang.Object r14 = r0.get(r7)
            zz.i0 r14 = (p977zz.C20944i0) r14
            if (r14 == 0) goto L_0x003b
            F r14 = r14.f52692a
            r5 = r14
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r5 = (com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus) r5
        L_0x003b:
            if (r5 != 0) goto L_0x0041
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r14 = com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus.NONE
            r8 = r14
            goto L_0x0042
        L_0x0041:
            r8 = r5
        L_0x0042:
            com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationPhotoSpec r14 = new com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationPhotoSpec
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            goto L_0x00bd
        L_0x004a:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot get field 'certificateSpec' because union is currently set to "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            F r14 = r14.setField_
            com.tranzmate.moovit.protocol.payments.MVProfileRequiredInfo$_Fields r14 = (com.tranzmate.moovit.protocol.payments.MVProfileRequiredInfo._Fields) r14
            vi0.c r14 = com.tranzmate.moovit.protocol.payments.MVProfileRequiredInfo.m25133k(r14)
            java.lang.String r14 = r14.f63355a
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L_0x0067:
            com.tranzmate.moovit.protocol.payments.MVProfileRequiredInfo$_Fields r2 = com.tranzmate.moovit.protocol.payments.MVProfileRequiredInfo._Fields.TEXT_INFO_SPEC
            if (r1 != r2) goto L_0x006c
            r3 = 1
        L_0x006c:
            if (r3 == 0) goto L_0x00db
            if (r1 != r2) goto L_0x00be
            java.lang.Object r14 = r14.value_
            com.tranzmate.moovit.protocol.payments.MVTextInfoSpec r14 = (com.tranzmate.moovit.protocol.payments.MVTextInfoSpec) r14
            java.lang.String r8 = r14.title
            java.lang.String r9 = r14.subTitle
            com.tranzmate.moovit.protocol.common.MVImageReferenceWithParams r1 = r14.image
            com.moovit.image.model.Image r10 = com.moovit.image.C16028g.m40829g(r1)
            com.tranzmate.moovit.protocol.payments.MVInputField r14 = r14.inputField
            com.moovit.inputfields.InputField r11 = c70.C13749c.m34321g(r14)
            java.lang.String r14 = r11.f41829b
            java.lang.Object r14 = r0.get(r14)
            zz.i0 r14 = (p977zz.C20944i0) r14
            if (r14 == 0) goto L_0x0093
            F r0 = r14.f52692a
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r0 = (com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus) r0
            goto L_0x0094
        L_0x0093:
            r0 = r5
        L_0x0094:
            if (r0 != 0) goto L_0x0098
            com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus r0 = com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus.NONE
        L_0x0098:
            r7 = r0
            if (r14 == 0) goto L_0x00af
            S r14 = r14.f52693b
            if (r14 != 0) goto L_0x00a0
            goto L_0x00af
        L_0x00a0:
            boolean r0 = r14 instanceof com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateTextData
            if (r0 == 0) goto L_0x00a7
            com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateTextData r14 = (com.moovit.payment.registration.steps.profile.certificate.ProfileCertificateTextData) r14
            goto L_0x00b0
        L_0x00a7:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "ProfileCertificateData in this decode method must be of type ProfileCertificateTextData"
            r14.<init>(r0)
            throw r14
        L_0x00af:
            r14 = r5
        L_0x00b0:
            if (r14 == 0) goto L_0x00b6
            com.moovit.inputfields.InputFieldValue r14 = r14.f42848c
            java.lang.String r5 = r14.f41838c
        L_0x00b6:
            r12 = r5
            com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationTextSpec r14 = new com.moovit.payment.registration.steps.profile.certificate.ProfileCertificationTextSpec
            r6 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x00bd:
            return r14
        L_0x00be:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cannot get field 'textInfoSpec' because union is currently set to "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            F r14 = r14.setField_
            com.tranzmate.moovit.protocol.payments.MVProfileRequiredInfo$_Fields r14 = (com.tranzmate.moovit.protocol.payments.MVProfileRequiredInfo._Fields) r14
            vi0.c r14 = com.tranzmate.moovit.protocol.payments.MVProfileRequiredInfo.m25133k(r14)
            java.lang.String r14 = r14.f63355a
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L_0x00db:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unknown MVProfileRequiredInfo type"
            r14.<init>(r0)
            throw r14
        L_0x00e3:
            java.lang.Object r0 = r13.f33742c
            java.util.Map r0 = (java.util.Map) r0
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg r14 = (com.moovit.itinerary.model.leg.WaitToTransitLineLeg) r14
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitLine> r1 = r14.f42135f
            com.moovit.network.model.ServerId r1 = r1.getServerId()
            java.lang.Object r0 = r0.get(r1)
            yy.c r0 = (p952yy.C20787c) r0
            if (r0 == 0) goto L_0x00fa
            com.moovit.transit.Schedule r0 = r0.f52458c
            goto L_0x00fe
        L_0x00fa:
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg$DeparturesInfo r0 = r14.f42138i
            com.moovit.transit.Schedule r0 = r0.f42142b
        L_0x00fe:
            zz.i0 r1 = new zz.i0
            r1.<init>(r14, r0)
            return r1
        L_0x0104:
            java.lang.Object r0 = r13.f33742c
            f00.g$c r0 = (f00.C16919g.C16922c) r0
            java.lang.Enum r14 = (java.lang.Enum) r14
            sz.c<E> r0 = r0.f43938c
            short r14 = r0.mo51917b(r14)
            java.lang.String r14 = java.lang.Short.toString(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p397bu.C13689g.convert(java.lang.Object):java.lang.Object");
    }
}
