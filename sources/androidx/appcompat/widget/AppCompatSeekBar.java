package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p114i.C5215a;

public class AppCompatSeekBar extends SeekBar {

    /* renamed from: b */
    public final C0457t f1162b;

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5215a.seekBarStyle);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0457t tVar = this.f1162b;
        Drawable drawable = tVar.f1615e;
        if (drawable != null && drawable.isStateful() && drawable.setState(tVar.f1614d.getDrawableState())) {
            tVar.f1614d.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1162b.f1615e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1162b.mo2183d(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0391c1.m972a(getContext(), this);
        C0457t tVar = new C0457t(this);
        this.f1162b = tVar;
        tVar.mo2179a(attributeSet, i);
    }
}
