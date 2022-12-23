package com.moovit.image;

import ce0.C21100e;
import com.moovit.commons.utils.Color;

public final class ColorAdjustment {

    /* renamed from: a */
    public final Mode f41699a;

    /* renamed from: b */
    public final Color f41700b;

    public enum Mode {
        AUTO,
        AUTO_BRIGHTNESS,
        NONE,
        TINT
    }

    public ColorAdjustment(Mode mode, Color color) {
        C21100e.m49373x(mode, "mode");
        this.f41699a = mode;
        this.f41700b = color;
    }
}
