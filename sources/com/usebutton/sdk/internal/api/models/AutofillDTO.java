package com.usebutton.sdk.internal.api.models;

import org.json.JSONObject;

public class AutofillDTO {
    private static final String DISABLE_CC_AUTOFILL = "cc_disabled";
    private static final String DISABLE_SYSTEM_AUTOFILL = "disable_system_autofill";
    private final boolean disableCreditCardAutofill;
    private final boolean disableSystemAutofill;

    private AutofillDTO(boolean z, boolean z2) {
        this.disableSystemAutofill = z;
        this.disableCreditCardAutofill = z2;
    }

    public static AutofillDTO fromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new AutofillDTO(jSONObject.optBoolean(DISABLE_SYSTEM_AUTOFILL, false), jSONObject.optBoolean(DISABLE_CC_AUTOFILL, false));
    }

    public boolean shouldDisableCreditCardAutofill() {
        return this.disableCreditCardAutofill;
    }

    public boolean shouldDisableSystemAutofill() {
        return this.disableSystemAutofill;
    }
}
