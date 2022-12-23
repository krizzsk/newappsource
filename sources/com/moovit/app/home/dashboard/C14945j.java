package com.moovit.app.home.dashboard;

import android.text.Editable;
import android.view.View;
import com.moovit.transit.LocationDescriptor;
import i00.C17522a;

/* renamed from: com.moovit.app.home.dashboard.j */
public final class C14945j extends C17522a {

    /* renamed from: b */
    public final /* synthetic */ FavoriteLocationEditorActivity f38245b;

    public C14945j(FavoriteLocationEditorActivity favoriteLocationEditorActivity) {
        this.f38245b = favoriteLocationEditorActivity;
    }

    public final void afterTextChanged(Editable editable) {
        boolean z;
        FavoriteLocationEditorActivity favoriteLocationEditorActivity = this.f38245b;
        int i = FavoriteLocationEditorActivity.f38158s0;
        View view = favoriteLocationEditorActivity.f38166o0;
        if (((LocationDescriptor) favoriteLocationEditorActivity.f38165n0.getTag()) != null) {
            z = true;
        } else {
            z = false;
        }
        view.setEnabled(z);
    }
}
