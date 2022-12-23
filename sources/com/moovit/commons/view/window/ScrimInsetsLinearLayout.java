package com.moovit.commons.view.window;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.moovit.commons.view.window.C15830a;

public class ScrimInsetsLinearLayout extends LinearLayout implements C15830a.C15831a<ScrimInsetsLinearLayout> {

    /* renamed from: b */
    public final C15830a<ScrimInsetsLinearLayout> f41317b;

    public ScrimInsetsLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo47376a() {
    }

    /* renamed from: b */
    public final Rect mo47382b() {
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
        this.f41317b.mo47386a(canvas);
    }

    public final C15830a<ScrimInsetsLinearLayout> getScrimInsetsLayout() {
        return this.f41317b;
    }

    public Rect getSystemWindowInsets() {
        return mo47382b();
    }

    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        this.f41317b.mo47387b(z);
    }

    @SuppressLint({"CustomViewStyleable"})
    public ScrimInsetsLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41317b = new C15830a<>(this, context, attributeSet, i);
    }
}
