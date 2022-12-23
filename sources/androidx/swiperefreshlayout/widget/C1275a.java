package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p307x2.C7152a;

/* renamed from: androidx.swiperefreshlayout.widget.a */
public final class C1275a extends ImageView {

    /* renamed from: b */
    public Animation.AnimationListener f4824b;

    /* renamed from: c */
    public int f4825c;

    public C1275a(Context context) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(C7152a.SwipeRefreshLayout);
        this.f4825c = obtainStyledAttributes.getColor(C7152a.f22222xaa980688, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6342i.m15102s(this, f * 4.0f);
        shapeDrawable.getPaint().setColor(this.f4825c);
        C6333d0.C6337d.m15057q(this, shapeDrawable);
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f4824b;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f4824b;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.f4825c = i;
        }
    }
}
