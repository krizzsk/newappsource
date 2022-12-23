package com.usebutton.sdk.internal.recipients;

public class RecipientRegistry {
    public static final String ENHANCEMENT_BUTTON_AUTH_CHALLENGE_V1 = "btn_auth_challenge_v1";
    public static final String ENHANCEMENT_BUTTON_AUTH_CHALLENGE_V2 = "btn_auth_challenge_v2";
    public static final String ENHANCEMENT_BUTTON_AUTOFILL_V1 = "autofill_v1";
    public static final String ENHANCEMENT_BUTTON_AUTOFILL_V1_1 = "autofill_v1.1";
    public static final String ENHANCEMENT_BUTTON_LIST_GROUPED_V1 = "btn_inventory_grouped_picker_v1";
    public static final String ENHANCEMENT_BUTTON_LIST_PICKER_V1 = "btn_inventory_list_picker_v1";
    public static final String ENHANCEMENT_BUTTON_PRODUCT_V1 = "btn_product_detail_v1";
    public static final String ENHANCEMENT_BUTTON_RIDE_INVENTORY_V1 = "button_inventory_ride_v1";

    public static String[] getEnhancements() {
        return new String[]{ENHANCEMENT_BUTTON_RIDE_INVENTORY_V1, ENHANCEMENT_BUTTON_LIST_PICKER_V1, ENHANCEMENT_BUTTON_LIST_GROUPED_V1, ENHANCEMENT_BUTTON_PRODUCT_V1, ENHANCEMENT_BUTTON_AUTH_CHALLENGE_V1, ENHANCEMENT_BUTTON_AUTH_CHALLENGE_V2, ENHANCEMENT_BUTTON_AUTOFILL_V1, ENHANCEMENT_BUTTON_AUTOFILL_V1_1};
    }
}
