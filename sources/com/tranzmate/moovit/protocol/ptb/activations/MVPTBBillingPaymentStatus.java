package com.tranzmate.moovit.protocol.ptb.activations;

public enum MVPTBBillingPaymentStatus {
    Notprocessed(1),
    PendingApproval(2),
    Approved(3),
    Cancelled(4),
    Rejected(5);
    
    private final int value;

    private MVPTBBillingPaymentStatus(int i) {
        this.value = i;
    }

    public static MVPTBBillingPaymentStatus findByValue(int i) {
        if (i == 1) {
            return Notprocessed;
        }
        if (i == 2) {
            return PendingApproval;
        }
        if (i == 3) {
            return Approved;
        }
        if (i == 4) {
            return Cancelled;
        }
        if (i != 5) {
            return null;
        }
        return Rejected;
    }

    public int getValue() {
        return this.value;
    }
}
