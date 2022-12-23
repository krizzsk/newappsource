package com.github.clans.fab;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.widget.TextView;

public class Label extends TextView {

    /* renamed from: t */
    public static final PorterDuffXfermode f13209t = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);

    /* renamed from: b */
    public int f13210b;

    /* renamed from: c */
    public int f13211c;

    /* renamed from: d */
    public int f13212d;

    /* renamed from: e */
    public int f13213e;

    /* renamed from: f */
    public Drawable f13214f;

    /* renamed from: g */
    public boolean f13215g = true;

    /* renamed from: h */
    public int f13216h;

    /* renamed from: i */
    public int f13217i;

    /* renamed from: j */
    public int f13218j;

    /* renamed from: k */
    public int f13219k;

    /* renamed from: l */
    public int f13220l;

    /* renamed from: m */
    public int f13221m;

    /* renamed from: n */
    public FloatingActionButton f13222n;

    /* renamed from: o */
    public Animation f13223o;

    /* renamed from: p */
    public Animation f13224p;

    /* renamed from: q */
    public boolean f13225q;

    /* renamed from: r */
    public boolean f13226r = true;

    /* renamed from: s */
    public GestureDetector f13227s = new GestureDetector(getContext(), new C3802a());

    /* renamed from: com.github.clans.fab.Label$a */
    public class C3802a extends GestureDetector.SimpleOnGestureListener {
        public C3802a() {
        }

        public final boolean onDown(MotionEvent motionEvent) {
            Label.this.mo15654c();
            FloatingActionButton floatingActionButton = Label.this.f13222n;
            if (floatingActionButton != null) {
                floatingActionButton.mo15555h();
            }
            return super.onDown(motionEvent);
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            Label.this.mo15655d();
            FloatingActionButton floatingActionButton = Label.this.f13222n;
            if (floatingActionButton != null) {
                floatingActionButton.mo15556i();
            }
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* renamed from: com.github.clans.fab.Label$b */
    public class C3803b extends Drawable {

        /* renamed from: a */
        public Paint f13229a = new Paint(1);

        /* renamed from: b */
        public Paint f13230b = new Paint(1);

        public C3803b() {
            Label.this.setLayerType(1, (Paint) null);
            this.f13229a.setStyle(Paint.Style.FILL);
            this.f13229a.setColor(Label.this.f13218j);
            this.f13230b.setXfermode(Label.f13209t);
            if (!Label.this.isInEditMode()) {
                this.f13229a.setShadowLayer((float) Label.this.f13210b, (float) Label.this.f13211c, (float) Label.this.f13212d, Label.this.f13213e);
            }
        }

        public final void draw(Canvas canvas) {
            Label label = Label.this;
            int i = label.f13210b;
            Label label2 = Label.this;
            int i2 = label2.f13210b;
            Label label3 = Label.this;
            RectF rectF = new RectF((float) (Math.abs(label.f13211c) + i), (float) (Math.abs(label2.f13212d) + i2), (float) label3.f13216h, (float) label3.f13217i);
            int i3 = Label.this.f13221m;
            canvas.drawRoundRect(rectF, (float) i3, (float) i3, this.f13229a);
            int i4 = Label.this.f13221m;
            canvas.drawRoundRect(rectF, (float) i4, (float) i4, this.f13230b);
        }

        public final int getOpacity() {
            return 0;
        }

        public final void setAlpha(int i) {
        }

        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public Label(ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
    }

    @TargetApi(21)
    private void setBackgroundCompat(Drawable drawable) {
        setBackground(drawable);
    }

    private void setShadow(FloatingActionButton floatingActionButton) {
        this.f13213e = floatingActionButton.getShadowColor();
        this.f13210b = floatingActionButton.getShadowRadius();
        this.f13211c = floatingActionButton.getShadowXOffset();
        this.f13212d = floatingActionButton.getShadowYOffset();
        this.f13215g = floatingActionButton.mo15535f();
    }

    @TargetApi(21)
    /* renamed from: a */
    public final RippleDrawable mo15652a() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, mo15653b(this.f13219k));
        stateListDrawable.addState(new int[0], mo15653b(this.f13218j));
        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.f13220l}), stateListDrawable, (Drawable) null);
        setOutlineProvider(new C3810g());
        setClipToOutline(true);
        this.f13214f = rippleDrawable;
        return rippleDrawable;
    }

    /* renamed from: b */
    public final ShapeDrawable mo15653b(int i) {
        float f = (float) this.f13221m;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(i);
        return shapeDrawable;
    }

    @TargetApi(21)
    /* renamed from: c */
    public final void mo15654c() {
        if (this.f13225q) {
            this.f13214f = getBackground();
        }
        Drawable drawable = this.f13214f;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[]{16842919});
        } else if (drawable instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            rippleDrawable.setState(new int[]{16842910, 16842919});
            rippleDrawable.setHotspot((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2));
            rippleDrawable.setVisible(true, true);
        }
    }

    @TargetApi(21)
    /* renamed from: d */
    public final void mo15655d() {
        if (this.f13225q) {
            this.f13214f = getBackground();
        }
        Drawable drawable = this.f13214f;
        if (drawable instanceof StateListDrawable) {
            ((StateListDrawable) drawable).setState(new int[0]);
        } else if (drawable instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) drawable;
            rippleDrawable.setState(new int[0]);
            rippleDrawable.setHotspot((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2));
            rippleDrawable.setVisible(true, true);
        }
    }

    /* renamed from: e */
    public final void mo15656e() {
        LayerDrawable layerDrawable;
        if (this.f13215g) {
            layerDrawable = new LayerDrawable(new Drawable[]{new C3803b(), mo15652a()});
            LayerDrawable layerDrawable2 = layerDrawable;
            layerDrawable2.setLayerInset(1, Math.abs(this.f13211c) + this.f13210b, Math.abs(this.f13212d) + this.f13210b, Math.abs(this.f13211c) + this.f13210b, Math.abs(this.f13212d) + this.f13210b);
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{mo15652a()});
        }
        setBackgroundCompat(layerDrawable);
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.f13216h == 0) {
            this.f13216h = getMeasuredWidth();
        }
        int measuredWidth = getMeasuredWidth();
        int i4 = 0;
        if (this.f13215g) {
            i3 = Math.abs(this.f13211c) + this.f13210b;
        } else {
            i3 = 0;
        }
        int i5 = i3 + measuredWidth;
        if (this.f13217i == 0) {
            this.f13217i = getMeasuredHeight();
        }
        int measuredHeight = getMeasuredHeight();
        if (this.f13215g) {
            i4 = Math.abs(this.f13212d) + this.f13210b;
        }
        setMeasuredDimension(i5, measuredHeight + i4);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        FloatingActionButton floatingActionButton = this.f13222n;
        if (floatingActionButton == null || floatingActionButton.getOnClickListener() == null || !this.f13222n.isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 1) {
            mo15655d();
            this.f13222n.mo15556i();
        } else if (action == 3) {
            mo15655d();
            this.f13222n.mo15556i();
        }
        this.f13227s.onTouchEvent(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    public void setCornerRadius(int i) {
        this.f13221m = i;
    }

    public void setFab(FloatingActionButton floatingActionButton) {
        this.f13222n = floatingActionButton;
        setShadow(floatingActionButton);
    }

    public void setHandleVisibilityChanges(boolean z) {
        this.f13226r = z;
    }

    public void setHideAnimation(Animation animation) {
        this.f13224p = animation;
    }

    public void setShowAnimation(Animation animation) {
        this.f13223o = animation;
    }

    public void setShowShadow(boolean z) {
        this.f13215g = z;
    }

    public void setUsingStyle(boolean z) {
        this.f13225q = z;
    }

    public Label(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Label(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
