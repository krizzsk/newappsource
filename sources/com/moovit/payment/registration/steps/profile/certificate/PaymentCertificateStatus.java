package com.moovit.payment.registration.steps.profile.certificate;

import p810sz.C19577c;

public enum PaymentCertificateStatus {
    NONE,
    APPROVED,
    PENDING,
    NOT_VALID,
    EXPIRED,
    NOT_UPLOADED;
    
    public static final C19577c<PaymentCertificateStatus> CODER = null;

    /* access modifiers changed from: public */
    static {
        PaymentCertificateStatus paymentCertificateStatus;
        PaymentCertificateStatus paymentCertificateStatus2;
        PaymentCertificateStatus paymentCertificateStatus3;
        PaymentCertificateStatus paymentCertificateStatus4;
        PaymentCertificateStatus paymentCertificateStatus5;
        PaymentCertificateStatus paymentCertificateStatus6;
        CODER = new C19577c<>(PaymentCertificateStatus.class, paymentCertificateStatus, paymentCertificateStatus3, paymentCertificateStatus5, paymentCertificateStatus4, paymentCertificateStatus6, paymentCertificateStatus2);
    }

    public boolean isAtLeast(PaymentCertificateStatus paymentCertificateStatus) {
        return compareTo(paymentCertificateStatus) >= 0;
    }
}
