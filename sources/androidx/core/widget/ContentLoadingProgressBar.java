package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.activity.C0194b;
import androidx.activity.C0199g;
import p054d0.C4268a1;
import p304x.C7073m;

public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: b */
    public long f3354b = -1;

    /* renamed from: c */
    public boolean f3355c = false;

    /* renamed from: d */
    public boolean f3356d = false;

    /* renamed from: e */
    public boolean f3357e = false;

    /* renamed from: f */
    public final C4268a1 f3358f = new C4268a1(this, 3);

    /* renamed from: g */
    public final C7073m f3359g = new C7073m(this, 2);

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo3435a() {
        post(new C0199g(this, 3));
    }

    /* renamed from: b */
    public final void mo3436b() {
        post(new C0194b(this, 3));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f3358f);
        removeCallbacks(this.f3359g);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3358f);
        removeCallbacks(this.f3359g);
    }
}
