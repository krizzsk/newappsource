package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p114i.C5215a;

public class AppCompatRatingBar extends RatingBar {

    /* renamed from: b */
    public final C0448q f1161b;

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5215a.ratingBarStyle);
    }

    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f1161b.f1611b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C0391c1.m972a(getContext(), this);
        C0448q qVar = new C0448q(this);
        this.f1161b = qVar;
        qVar.mo2179a(attributeSet, i);
    }
}
