package p371as;

import android.animation.Animator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.app.editing.EditStopOverviewActivity;
import com.tranzmate.R;
import j00.C17682a;
import k00.C17988b;

/* renamed from: as.c */
public final class C13510c extends C17682a {

    /* renamed from: a */
    public final /* synthetic */ EditStopOverviewActivity f33426a;

    public C13510c(EditStopOverviewActivity editStopOverviewActivity) {
        this.f33426a = editStopOverviewActivity;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f33426a.f37941x0.getMenuIconView().setImageDrawable(C17988b.m44611b(R.drawable.ic_edit_24_on_primary, this.f33426a.f37941x0.getContext()));
        this.f33426a.f37941x0.getMenuIconView().animate().alpha(1.0f).rotation(BitmapDescriptorFactory.HUE_RED).setDuration(100);
    }
}
