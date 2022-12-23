package p371as;

import android.animation.Animator;
import com.moovit.app.editing.EditStopOverviewActivity;
import j00.C17682a;

/* renamed from: as.f */
public final class C13513f extends C17682a {

    /* renamed from: a */
    public final /* synthetic */ EditStopOverviewActivity f33429a;

    public C13513f(EditStopOverviewActivity editStopOverviewActivity) {
        this.f33429a = editStopOverviewActivity;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f33429a.f37942y0.setClickable(false);
        this.f33429a.f37942y0.setVisibility(4);
    }
}
