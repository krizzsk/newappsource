package com.tranzmate.moovit.protocol.surveys;

public enum MVEndReason {
    Finished(1),
    Cancelled(2),
    NotRelevant(3),
    NotificationDismissed(4);
    
    private final int value;

    private MVEndReason(int i) {
        this.value = i;
    }

    public static MVEndReason findByValue(int i) {
        if (i == 1) {
            return Finished;
        }
        if (i == 2) {
            return Cancelled;
        }
        if (i == 3) {
            return NotRelevant;
        }
        if (i != 4) {
            return null;
        }
        return NotificationDismissed;
    }

    public int getValue() {
        return this.value;
    }
}
