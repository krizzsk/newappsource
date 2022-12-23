package com.google.android.gms.location.places.p987ui;

import android.view.View;

/* renamed from: com.google.android.gms.location.places.ui.zzf */
final class zzf implements View.OnClickListener {
    private final /* synthetic */ SupportPlaceAutocompleteFragment zzdm;

    public zzf(SupportPlaceAutocompleteFragment supportPlaceAutocompleteFragment) {
        this.zzdm = supportPlaceAutocompleteFragment;
    }

    public final void onClick(View view) {
        this.zzdm.setText("");
    }
}
