package com.moovit.commons.view.window;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.moovit.commons.view.window.C15830a;

public class ScrimInsetsFrameLayout extends FrameLayout implements C15830a.C15831a<ScrimInsetsFrameLayout> {

    /* renamed from: b */
    public final C15830a<ScrimInsetsFrameLayout> f41316b;

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo47376a() {
    }

    /* renamed from: b */
    public final Rect mo47377b() {
        C15830a scrimInsetsLayout = getScrimInsetsLayout();
        scrimInsetsLayout.getClass();
        Rect rect = new Rect();
        Rect rect2 = scrimInsetsLayout.f41320d;
        if (rect2 != null) {
            rect.set(rect2);
        }
        return rect;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        this.f41316b.mo47386a(canvas);
    }

    public final C15830a<ScrimInsetsFrameLayout> getScrimInsetsLayout() {
        return this.f41316b;
    }

    public Rect getSystemWindowInsets() {
        return mo47377b();
    }

    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        this.f41316b.mo47387b(z);
    }

    @SuppressLint({"CustomViewStyleable"})
    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41316b = new C15830a<>(this, context, attributeSet, i);
    }
}
