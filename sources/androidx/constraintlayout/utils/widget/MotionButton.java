package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p002a1.C0042d;

public class MotionButton extends AppCompatButton {

    /* renamed from: b */
    public float f2923b = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: c */
    public float f2924c = Float.NaN;

    /* renamed from: d */
    public Path f2925d;

    /* renamed from: e */
    public ViewOutlineProvider f2926e;

    /* renamed from: f */
    public RectF f2927f;

    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$a */
    public class C0730a extends ViewOutlineProvider {
        public C0730a() {
        }

        public final void getOutline(View view, Outline outline) {
            int width = MotionButton.this.getWidth();
            int height = MotionButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * MotionButton.this.f2923b) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.MotionButton$b */
    public class C0731b extends ViewOutlineProvider {
        public C0731b() {
        }

        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f2924c);
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3091a(attributeSet);
    }

    /* renamed from: a */
    public final void mo3091a(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0042d.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == C0042d.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f2924c;
    }

    public float getRoundPercent() {
        return this.f2923b;
    }

    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f2924c = f;
            float f2 = this.f2923b;
            this.f2923b = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f2924c != f) {
            z = true;
        } else {
            z = false;
        }
        this.f2924c = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.f2925d == null) {
                this.f2925d = new Path();
            }
            if (this.f2927f == null) {
                this.f2927f = new RectF();
            }
            if (this.f2926e == null) {
                C0731b bVar = new C0731b();
                this.f2926e = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2927f.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight());
            this.f2925d.reset();
            Path path = this.f2925d;
            RectF rectF = this.f2927f;
            float f3 = this.f2924c;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z;
        if (this.f2923b != f) {
            z = true;
        } else {
            z = false;
        }
        this.f2923b = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.f2925d == null) {
                this.f2925d = new Path();
            }
            if (this.f2927f == null) {
                this.f2927f = new RectF();
            }
            if (this.f2926e == null) {
                C0730a aVar = new C0730a();
                this.f2926e = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2923b) / 2.0f;
            this.f2927f.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) width, (float) height);
            this.f2925d.reset();
            this.f2925d.addRoundRect(this.f2927f, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo3091a(attributeSet);
    }
}
