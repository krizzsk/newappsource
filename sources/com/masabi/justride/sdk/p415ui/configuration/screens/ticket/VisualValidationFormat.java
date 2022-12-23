package com.masabi.justride.sdk.p415ui.configuration.screens.ticket;

/* renamed from: com.masabi.justride.sdk.ui.configuration.screens.ticket.VisualValidationFormat */
public enum VisualValidationFormat {
    DATE_STANDARD_2_DIGIT_YEAR("dd/MM/yy"),
    DATE_STANDARD_4_DIGIT_YEAR("dd/MM/yyyy"),
    DATE_US_2_DIGIT_YEAR("MM/dd/yy"),
    DATE_US_4_DIGIT_YEAR("MM/dd/yyyy"),
    EMPTY(""),
    TIME_12_HOUR("h:mm:ss a"),
    TIME_24_HOUR("HH:mm:ss");
    
    private final String pattern;

    private VisualValidationFormat(String str) {
        this.pattern = str;
    }

    public String getPattern() {
        return this.pattern;
    }
}
