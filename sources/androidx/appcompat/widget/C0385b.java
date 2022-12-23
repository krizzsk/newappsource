package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.appcompat.widget.b */
public final class C0385b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f1440a;

    public C0385b(ActionBarContainer actionBarContainer) {
        this.f1440a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f1440a;
        if (actionBarContainer.f1024i) {
            Drawable drawable = actionBarContainer.f1023h;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f1021f;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        ActionBarContainer actionBarContainer2 = this.f1440a;
        Drawable drawable3 = actionBarContainer2.f1022g;
        if (drawable3 != null && actionBarContainer2.f1025j) {
            drawable3.draw(canvas);
        }
    }

    public final int getOpacity() {
        return 0;
    }

    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f1440a;
        if (!actionBarContainer.f1024i) {
            Drawable drawable = actionBarContainer.f1021f;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        } else if (actionBarContainer.f1023h != null) {
            actionBarContainer.f1021f.getOutline(outline);
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
