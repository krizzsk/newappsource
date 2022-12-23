package com.moovit.app.home.dashboard;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.transit.LocationDescriptor;
import j20.C17707d;

/* renamed from: com.moovit.app.home.dashboard.h */
public final /* synthetic */ class C14943h implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ FavoriteLocationEditorActivity f38240b;

    /* renamed from: c */
    public final /* synthetic */ LocationDescriptor f38241c;

    public /* synthetic */ C14943h(FavoriteLocationEditorActivity favoriteLocationEditorActivity, LocationDescriptor locationDescriptor) {
        this.f38240b = favoriteLocationEditorActivity;
        this.f38241c = locationDescriptor;
    }

    public final void onComplete(Task task) {
        FavoriteLocationEditorActivity favoriteLocationEditorActivity = this.f38240b;
        LocationDescriptor locationDescriptor = this.f38241c;
        int i = FavoriteLocationEditorActivity.f38158s0;
        favoriteLocationEditorActivity.getClass();
        if (!task.isSuccessful()) {
            favoriteLocationEditorActivity.mo45099E2(locationDescriptor);
            return;
        }
        C17707d dVar = (C17707d) task.getResult();
        LocationDescriptor locationDescriptor2 = dVar.f45454e;
        if (locationDescriptor2 != null) {
            favoriteLocationEditorActivity.mo45099E2(locationDescriptor2);
        } else {
            favoriteLocationEditorActivity.mo45099E2(dVar.f45450a);
        }
    }
}
