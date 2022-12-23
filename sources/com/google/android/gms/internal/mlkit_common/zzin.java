package com.google.android.gms.internal.mlkit_common;

public enum zzin implements zzbg {
    TYPE_UNKNOWN(0),
    CUSTOM(1),
    AUTOML_IMAGE_LABELING(2),
    BASE_TRANSLATE(3),
    CUSTOM_OBJECT_DETECTION(4),
    CUSTOM_IMAGE_LABELING(5),
    BASE_ENTITY_EXTRACTION(6),
    BASE_DIGITAL_INK(7),
    TOXICITY_DETECTION(8);
    
    private final int zzk;

    private zzin(int i) {
        this.zzk = i;
    }

    public final int zza() {
        return this.zzk;
    }
}
