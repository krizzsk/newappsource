package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appboy.support.ValidationUtils;
import p002a1.C0042d;

public class Placeholder extends View {

    /* renamed from: b */
    public int f3099b = -1;

    /* renamed from: c */
    public View f3100c = null;

    /* renamed from: d */
    public int f3101d = 4;

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3215a(attributeSet);
    }

    /* renamed from: a */
    public final void mo3215a(AttributeSet attributeSet) {
        super.setVisibility(this.f3101d);
        this.f3099b = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0042d.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.ConstraintLayout_placeholder_content) {
                    this.f3099b = obtainStyledAttributes.getResourceId(index, this.f3099b);
                } else if (index == C0042d.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.f3101d = obtainStyledAttributes.getInt(index, this.f3101d);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.f3100c;
    }

    public int getEmptyVisibility() {
        return this.f3101d;
    }

    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(ValidationUtils.APPBOY_STRING_MAX_LENGTH, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) rect.height()) / 2.0f) + (((float) height) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f3099b != i) {
            View view = this.f3100c;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.LayoutParams) this.f3100c.getLayoutParams()).f3042f0 = false;
                this.f3100c = null;
            }
            this.f3099b = i;
            if (i != -1 && (findViewById = ((View) getParent()).findViewById(i)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i) {
        this.f3101d = i;
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo3215a(attributeSet);
    }
}
