package com.google.android.gms.internal.base;

import android.graphics.drawable.Drawable;

final class zaj extends Drawable.ConstantState {
    public int zaa;
    public int zab;

    public zaj(zaj zaj) {
        if (zaj != null) {
            this.zaa = zaj.zaa;
            this.zab = zaj.zab;
        }
    }

    public final int getChangingConfigurations() {
        return this.zaa;
    }

    public final Drawable newDrawable() {
        return new zak(this);
    }
}
