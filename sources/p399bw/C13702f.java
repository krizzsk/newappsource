package p399bw;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.moovit.design.view.list.ListItemView;
import j00.C17682a;

/* renamed from: bw.f */
public final class C13702f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ boolean f33774b;

    /* renamed from: c */
    public final /* synthetic */ View f33775c;

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f33776d;

    /* renamed from: bw.f$a */
    public class C13703a extends C17682a {
        public C13703a() {
        }

        public final void onAnimationEnd(Animator animator) {
            C13702f fVar = C13702f.this;
            if (!fVar.f33774b) {
                fVar.f33776d.removeView(fVar.f33775c);
            }
        }

        public final void onAnimationStart(Animator animator) {
            C13702f fVar = C13702f.this;
            if (fVar.f33774b) {
                fVar.f33775c.setVisibility(0);
            }
        }
    }

    public C13702f(boolean z, ListItemView listItemView, ViewGroup viewGroup) {
        this.f33774b = z;
        this.f33775c = listItemView;
        this.f33776d = viewGroup;
    }

    public final void onGlobalLayout() {
        DecelerateInterpolator decelerateInterpolator;
        int i;
        int i2;
        long j;
        if (this.f33774b) {
            i2 = this.f33775c.getHeight();
            decelerateInterpolator = new DecelerateInterpolator();
            i = 0;
        } else {
            int height = this.f33775c.getHeight();
            decelerateInterpolator = new AccelerateInterpolator();
            i = height;
            i2 = 0;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f33775c, "translationY", new float[]{(float) i2, (float) i});
        ofFloat.addListener(new C13703a());
        ofFloat.setInterpolator(decelerateInterpolator);
        if (this.f33774b) {
            j = 2200;
        } else {
            j = 1500;
        }
        ofFloat.setStartDelay(j);
        ofFloat.setDuration((long) this.f33775c.getContext().getResources().getInteger(17694721));
        ofFloat.start();
    }
}
