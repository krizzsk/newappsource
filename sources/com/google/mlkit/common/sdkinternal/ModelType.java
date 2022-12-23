package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public enum ModelType {
    UNKNOWN,
    BASE,
    TRANSLATE,
    ENTITY_EXTRACTION,
    CUSTOM,
    DIGITAL_INK,
    TOXICITY_DETECTION
}
