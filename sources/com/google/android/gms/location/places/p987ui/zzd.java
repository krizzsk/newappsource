package com.google.android.gms.location.places.p987ui;

import android.view.View;

/* renamed from: com.google.android.gms.location.places.ui.zzd */
final class zzd implements View.OnClickListener {
    private final /* synthetic */ PlaceAutocompleteFragment zzdl;

    public zzd(PlaceAutocompleteFragment placeAutocompleteFragment) {
        this.zzdl = placeAutocompleteFragment;
    }

    public final void onClick(View view) {
        this.zzdl.setText("");
    }
}
