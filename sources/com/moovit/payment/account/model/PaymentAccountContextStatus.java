package com.moovit.payment.account.model;

import p810sz.C19577c;
import p977zz.C20975x0;

public enum PaymentAccountContextStatus {
    INCOMPLETE,
    CONNECTED,
    DISCONNECTED,
    BLACKLIST;
    
    public static final C19577c<PaymentAccountContextStatus> CODER = null;

    /* access modifiers changed from: public */
    static {
        PaymentAccountContextStatus paymentAccountContextStatus;
        PaymentAccountContextStatus paymentAccountContextStatus2;
        PaymentAccountContextStatus paymentAccountContextStatus3;
        PaymentAccountContextStatus paymentAccountContextStatus4;
        CODER = new C19577c<>(PaymentAccountContextStatus.class, paymentAccountContextStatus, paymentAccountContextStatus2, paymentAccountContextStatus3, paymentAccountContextStatus4);
    }

    public static boolean isStatusOf(PaymentAccountContextStatus paymentAccountContextStatus, PaymentAccountContextStatus... paymentAccountContextStatusArr) {
        boolean z;
        if (paymentAccountContextStatus != null) {
            int i = -1;
            if (paymentAccountContextStatusArr != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= paymentAccountContextStatusArr.length) {
                        break;
                    } else if (C20975x0.m49118e(paymentAccountContextStatusArr[i2], paymentAccountContextStatus)) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}
