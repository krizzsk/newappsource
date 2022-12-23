package com.moovit.util;

import p810sz.C19577c;
import p824tp.C19735m;

public enum ColorScheme {
    PRIMARY(C19735m.colorPrimary),
    SECONDARY(C19735m.colorSecondary),
    TERTIARY(C19735m.colorTertiary),
    GOOD(C19735m.colorGood),
    PROBLEM(C19735m.colorProblem),
    CRITICAL(C19735m.colorCritical),
    INFO(C19735m.colorInfo),
    ON_SURFACE(C19735m.colorOnSurface),
    ON_SURFACE_EMPHASIS_HIGH(C19735m.colorOnSurfaceEmphasisHigh),
    ON_SURFACE_EMPHASIS_MEDIUM(C19735m.colorOnSurfaceEmphasisMedium),
    ON_SURFACE_EMPHASIS_LOW(C19735m.colorOnSurfaceEmphasisLow),
    SURFACE_GOOD(C19735m.colorSurfaceGood),
    SURFACE_PROBLEM(C19735m.colorSurfaceProblem),
    SURFACE_CRITICAL(C19735m.colorSurfaceCritical),
    SURFACE_INFO(C19735m.colorSurfaceInfo);
    
    public static final C19577c<ColorScheme> CODER = null;
    private final int colorAttrId;

    /* access modifiers changed from: public */
    static {
        ColorScheme colorScheme;
        ColorScheme colorScheme2;
        ColorScheme colorScheme3;
        ColorScheme colorScheme4;
        ColorScheme colorScheme5;
        ColorScheme colorScheme6;
        ColorScheme colorScheme7;
        ColorScheme colorScheme8;
        ColorScheme colorScheme9;
        ColorScheme colorScheme10;
        ColorScheme colorScheme11;
        ColorScheme colorScheme12;
        ColorScheme colorScheme13;
        ColorScheme colorScheme14;
        ColorScheme colorScheme15;
        CODER = new C19577c<>(ColorScheme.class, colorScheme, colorScheme2, colorScheme3, colorScheme4, colorScheme5, colorScheme6, colorScheme7, colorScheme8, colorScheme9, colorScheme10, colorScheme11, colorScheme12, colorScheme13, colorScheme15, colorScheme14);
    }

    private ColorScheme(int i) {
        this.colorAttrId = i;
    }

    public int getColorAttrId() {
        return this.colorAttrId;
    }
}
