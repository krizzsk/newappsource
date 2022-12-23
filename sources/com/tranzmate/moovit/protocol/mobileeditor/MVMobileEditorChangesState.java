package com.tranzmate.moovit.protocol.mobileeditor;

public enum MVMobileEditorChangesState {
    NONE(0),
    PENDING(1),
    APPROVED(2),
    LOADED(3);
    
    private final int value;

    private MVMobileEditorChangesState(int i) {
        this.value = i;
    }

    public static MVMobileEditorChangesState findByValue(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return PENDING;
        }
        if (i == 2) {
            return APPROVED;
        }
        if (i != 3) {
            return null;
        }
        return LOADED;
    }

    public int getValue() {
        return this.value;
    }
}
