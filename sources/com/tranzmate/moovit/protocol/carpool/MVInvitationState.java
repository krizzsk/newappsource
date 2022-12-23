package com.tranzmate.moovit.protocol.carpool;

public enum MVInvitationState {
    INVITED(0),
    NOT_INTERESTED(1),
    INTERESTED(2),
    REJECTED(3),
    APPROVED(4),
    CANCELED(5),
    TIME_CHANGED_AFTER_APPROVAL(6);
    
    private final int value;

    private MVInvitationState(int i) {
        this.value = i;
    }

    public static MVInvitationState findByValue(int i) {
        switch (i) {
            case 0:
                return INVITED;
            case 1:
                return NOT_INTERESTED;
            case 2:
                return INTERESTED;
            case 3:
                return REJECTED;
            case 4:
                return APPROVED;
            case 5:
                return CANCELED;
            case 6:
                return TIME_CHANGED_AFTER_APPROVAL;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
