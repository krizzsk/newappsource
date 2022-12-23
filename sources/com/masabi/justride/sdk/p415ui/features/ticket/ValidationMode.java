package com.masabi.justride.sdk.p415ui.features.ticket;

import android.content.res.Resources;
import p605ki.C18059m;

/* renamed from: com.masabi.justride.sdk.ui.features.ticket.ValidationMode */
public enum ValidationMode {
    BARCODE(C18059m.com_masabi_justride_sdk_barcode_height),
    VISUAL_VALIDATOR(C18059m.com_masabi_justride_sdk_visual_validator_height),
    UNDEFINED(r1.heightResourceId);
    
    private final int heightResourceId;

    private ValidationMode(int i) {
        this.heightResourceId = i;
    }

    public int getHeightPixels(Resources resources) {
        return resources.getDimensionPixelSize(this.heightResourceId);
    }
}
