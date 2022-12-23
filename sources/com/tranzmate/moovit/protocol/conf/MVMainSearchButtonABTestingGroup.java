package com.tranzmate.moovit.protocol.conf;

public enum MVMainSearchButtonABTestingGroup {
    CONTROL(1),
    TEXT_COPY_A(2),
    TEXT_COPY_B(3),
    TEXT_COPY_C(4),
    TEXT_COPY_D(5),
    TEXT_ANIMATION(6),
    BUTTON_DESIGN(7),
    BUTTON_DESIGN_WITH_TEXT_ANIMATION(8);
    
    private final int value;

    private MVMainSearchButtonABTestingGroup(int i) {
        this.value = i;
    }

    public static MVMainSearchButtonABTestingGroup findByValue(int i) {
        switch (i) {
            case 1:
                return CONTROL;
            case 2:
                return TEXT_COPY_A;
            case 3:
                return TEXT_COPY_B;
            case 4:
                return TEXT_COPY_C;
            case 5:
                return TEXT_COPY_D;
            case 6:
                return TEXT_ANIMATION;
            case 7:
                return BUTTON_DESIGN;
            case 8:
                return BUTTON_DESIGN_WITH_TEXT_ANIMATION;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
