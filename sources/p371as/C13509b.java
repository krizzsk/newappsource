package p371as;

import android.animation.Animator;
import com.moovit.app.editing.EditStopOverviewActivity;
import com.tranzmate.R;
import j00.C17682a;
import k00.C17988b;

/* renamed from: as.b */
public final class C13509b extends C17682a {

    /* renamed from: a */
    public final /* synthetic */ EditStopOverviewActivity f33425a;

    public C13509b(EditStopOverviewActivity editStopOverviewActivity) {
        this.f33425a = editStopOverviewActivity;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f33425a.f37941x0.getMenuIconView().setImageDrawable(C17988b.m44611b(R.drawable.fab_add, this.f33425a.f37941x0.getContext()));
        this.f33425a.f37941x0.getMenuIconView().animate().alpha(1.0f).rotation(-135.0f).setDuration(100);
    }
}
