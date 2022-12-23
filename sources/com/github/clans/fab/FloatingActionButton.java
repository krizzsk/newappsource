package com.github.clans.fab;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public class FloatingActionButton extends ImageButton {

    /* renamed from: m0 */
    public static final PorterDuffXfermode f13078m0 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);

    /* renamed from: A */
    public float f13079A;

    /* renamed from: B */
    public boolean f13080B;

    /* renamed from: C */
    public RectF f13081C;

    /* renamed from: D */
    public Paint f13082D;

    /* renamed from: E */
    public Paint f13083E;

    /* renamed from: F */
    public boolean f13084F;

    /* renamed from: G */
    public long f13085G;

    /* renamed from: H */
    public float f13086H;

    /* renamed from: I */
    public long f13087I;

    /* renamed from: J */
    public double f13088J;

    /* renamed from: K */
    public boolean f13089K;

    /* renamed from: L */
    public int f13090L;

    /* renamed from: M */
    public float f13091M;

    /* renamed from: N */
    public float f13092N;

    /* renamed from: O */
    public float f13093O;

    /* renamed from: P */
    public int f13094P;

    /* renamed from: Q */
    public boolean f13095Q;

    /* renamed from: R */
    public boolean f13096R;

    /* renamed from: S */
    public boolean f13097S;

    /* renamed from: T */
    public int f13098T;

    /* renamed from: U */
    public boolean f13099U;

    /* renamed from: b */
    public int f13100b;

    /* renamed from: c */
    public boolean f13101c;

    /* renamed from: d */
    public int f13102d;

    /* renamed from: e */
    public int f13103e;

    /* renamed from: f */
    public int f13104f;

    /* renamed from: g */
    public int f13105g;

    /* renamed from: h */
    public int f13106h;

    /* renamed from: i */
    public int f13107i;

    /* renamed from: j */
    public int f13108j;

    /* renamed from: k */
    public int f13109k;

    /* renamed from: l */
    public Drawable f13110l;

    /* renamed from: l0 */
    public GestureDetector f13111l0;

    /* renamed from: m */
    public int f13112m;

    /* renamed from: n */
    public Animation f13113n;

    /* renamed from: o */
    public Animation f13114o;

    /* renamed from: p */
    public String f13115p;

    /* renamed from: q */
    public View.OnClickListener f13116q;

    /* renamed from: r */
    public RippleDrawable f13117r;

    /* renamed from: s */
    public boolean f13118s;

    /* renamed from: t */
    public boolean f13119t;

    /* renamed from: u */
    public boolean f13120u;

    /* renamed from: v */
    public int f13121v;

    /* renamed from: w */
    public int f13122w;

    /* renamed from: x */
    public int f13123x;

    /* renamed from: y */
    public boolean f13124y;

    /* renamed from: z */
    public float f13125z;

    public static class ProgressSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<ProgressSavedState> CREATOR = new C3794a();

        /* renamed from: b */
        public float f13126b;

        /* renamed from: c */
        public float f13127c;

        /* renamed from: d */
        public float f13128d;

        /* renamed from: e */
        public int f13129e;

        /* renamed from: f */
        public int f13130f;

        /* renamed from: g */
        public int f13131g;

        /* renamed from: h */
        public int f13132h;

        /* renamed from: i */
        public boolean f13133i;

        /* renamed from: j */
        public boolean f13134j;

        /* renamed from: k */
        public boolean f13135k;

        /* renamed from: l */
        public boolean f13136l;

        /* renamed from: m */
        public boolean f13137m;

        /* renamed from: n */
        public boolean f13138n;

        /* renamed from: o */
        public boolean f13139o;

        /* renamed from: com.github.clans.fab.FloatingActionButton$ProgressSavedState$a */
        public static class C3794a implements Parcelable.Creator<ProgressSavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new ProgressSavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new ProgressSavedState[i];
            }
        }

        public ProgressSavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f13126b);
            parcel.writeFloat(this.f13127c);
            parcel.writeInt(this.f13133i ? 1 : 0);
            parcel.writeFloat(this.f13128d);
            parcel.writeInt(this.f13129e);
            parcel.writeInt(this.f13130f);
            parcel.writeInt(this.f13131g);
            parcel.writeInt(this.f13132h);
            parcel.writeInt(this.f13134j ? 1 : 0);
            parcel.writeInt(this.f13135k ? 1 : 0);
            parcel.writeInt(this.f13136l ? 1 : 0);
            parcel.writeInt(this.f13137m ? 1 : 0);
            parcel.writeInt(this.f13138n ? 1 : 0);
            parcel.writeInt(this.f13139o ? 1 : 0);
        }

        public ProgressSavedState(Parcel parcel) {
            super(parcel);
            this.f13126b = parcel.readFloat();
            this.f13127c = parcel.readFloat();
            boolean z = true;
            this.f13133i = parcel.readInt() != 0;
            this.f13128d = parcel.readFloat();
            this.f13129e = parcel.readInt();
            this.f13130f = parcel.readInt();
            this.f13131g = parcel.readInt();
            this.f13132h = parcel.readInt();
            this.f13134j = parcel.readInt() != 0;
            this.f13135k = parcel.readInt() != 0;
            this.f13136l = parcel.readInt() != 0;
            this.f13137m = parcel.readInt() != 0;
            this.f13138n = parcel.readInt() != 0;
            this.f13139o = parcel.readInt() == 0 ? false : z;
        }
    }

    /* renamed from: com.github.clans.fab.FloatingActionButton$a */
    public class C3795a extends GestureDetector.SimpleOnGestureListener {
        public C3795a() {
        }

        public final boolean onDown(MotionEvent motionEvent) {
            Label label = (Label) FloatingActionButton.this.getTag(C3814k.fab_label);
            if (label != null) {
                label.mo15654c();
            }
            FloatingActionButton.this.mo15555h();
            return super.onDown(motionEvent);
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            Label label = (Label) FloatingActionButton.this.getTag(C3814k.fab_label);
            if (label != null) {
                label.mo15655d();
            }
            FloatingActionButton.this.mo15556i();
            return super.onSingleTapUp(motionEvent);
        }
    }

    /* renamed from: com.github.clans.fab.FloatingActionButton$b */
    public class C3796b implements View.OnClickListener {
        public C3796b() {
        }

        public final void onClick(View view) {
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            View.OnClickListener onClickListener = floatingActionButton.f13116q;
            if (onClickListener != null) {
                onClickListener.onClick(floatingActionButton);
            }
        }
    }

    /* renamed from: com.github.clans.fab.FloatingActionButton$c */
    public class C3797c extends ShapeDrawable {

        /* renamed from: a */
        public int f13142a;

        /* renamed from: b */
        public int f13143b;

        public C3797c(OvalShape ovalShape) {
            super(ovalShape);
            int i;
            int i2 = 0;
            if (FloatingActionButton.this.mo15535f()) {
                i = Math.abs(FloatingActionButton.this.f13104f) + FloatingActionButton.this.f13103e;
            } else {
                i = 0;
            }
            this.f13142a = i;
            if (FloatingActionButton.this.mo15535f()) {
                i2 = Math.abs(FloatingActionButton.this.f13105g) + FloatingActionButton.this.f13103e;
            }
            this.f13143b = i2;
            if (FloatingActionButton.this.f13120u) {
                int i3 = this.f13142a;
                int i4 = FloatingActionButton.this.f13121v;
                this.f13142a = i3 + i4;
                this.f13143b = i2 + i4;
            }
        }

        public final void draw(Canvas canvas) {
            int i = this.f13142a;
            int i2 = this.f13143b;
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            PorterDuffXfermode porterDuffXfermode = FloatingActionButton.f13078m0;
            setBounds(i, i2, floatingActionButton.mo15532c() - this.f13142a, FloatingActionButton.this.mo15531b() - this.f13143b);
            super.draw(canvas);
        }
    }

    /* renamed from: com.github.clans.fab.FloatingActionButton$d */
    public class C3798d extends Drawable {

        /* renamed from: a */
        public Paint f13145a = new Paint(1);

        /* renamed from: b */
        public Paint f13146b = new Paint(1);

        /* renamed from: c */
        public float f13147c;

        public C3798d() {
            FloatingActionButton.this.setLayerType(1, (Paint) null);
            this.f13145a.setStyle(Paint.Style.FILL);
            this.f13145a.setColor(FloatingActionButton.this.f13106h);
            this.f13146b.setXfermode(FloatingActionButton.f13078m0);
            if (!FloatingActionButton.this.isInEditMode()) {
                this.f13145a.setShadowLayer((float) FloatingActionButton.this.f13103e, (float) FloatingActionButton.this.f13104f, (float) FloatingActionButton.this.f13105g, FloatingActionButton.this.f13102d);
            }
            float a = (float) (FloatingActionButton.this.getCircleSize() / 2);
            this.f13147c = a;
            if (FloatingActionButton.this.f13120u && FloatingActionButton.this.f13099U) {
                this.f13147c = a + ((float) FloatingActionButton.this.f13121v);
            }
        }

        public final void draw(Canvas canvas) {
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            PorterDuffXfermode porterDuffXfermode = FloatingActionButton.f13078m0;
            canvas.drawCircle((float) (floatingActionButton.getMeasuredWidth() / 2), (float) (FloatingActionButton.this.getMeasuredHeight() / 2), this.f13147c, this.f13145a);
            canvas.drawCircle((float) (FloatingActionButton.this.getMeasuredWidth() / 2), (float) (FloatingActionButton.this.getMeasuredHeight() / 2), this.f13147c, this.f13146b);
        }

        public final int getOpacity() {
            return 0;
        }

        public final void setAlpha(int i) {
        }

        public final void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: private */
    public int getCircleSize() {
        return getResources().getDimensionPixelSize(this.f13100b == 0 ? C3812i.fab_size_normal : C3812i.fab_size_mini);
    }

    private int getShadowX() {
        return Math.abs(this.f13104f) + this.f13103e;
    }

    private int getShadowY() {
        return Math.abs(this.f13105g) + this.f13103e;
    }

    @TargetApi(16)
    private void setBackgroundCompat(Drawable drawable) {
        setBackground(drawable);
    }

    /* renamed from: b */
    public final int mo15531b() {
        int i;
        int circleSize = getCircleSize();
        if (mo15535f()) {
            i = getShadowY() * 2;
        } else {
            i = 0;
        }
        int i2 = circleSize + i;
        if (this.f13120u) {
            return i2 + (this.f13121v * 2);
        }
        return i2;
    }

    /* renamed from: c */
    public final int mo15532c() {
        int i;
        int circleSize = getCircleSize();
        if (mo15535f()) {
            i = getShadowX() * 2;
        } else {
            i = 0;
        }
        int i2 = circleSize + i;
        if (this.f13120u) {
            return i2 + (this.f13121v * 2);
        }
        return i2;
    }

    /* renamed from: d */
    public final C3797c mo15533d(int i) {
        C3797c cVar = new C3797c(new OvalShape());
        cVar.getPaint().setColor(i);
        return cVar;
    }

    @TargetApi(21)
    /* renamed from: e */
    public final RippleDrawable mo15534e() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, mo15533d(this.f13108j));
        stateListDrawable.addState(new int[]{16842919}, mo15533d(this.f13107i));
        stateListDrawable.addState(new int[0], mo15533d(this.f13106h));
        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.f13109k}), stateListDrawable, (Drawable) null);
        setOutlineProvider(new C3804a());
        setClipToOutline(true);
        this.f13117r = rippleDrawable;
        return rippleDrawable;
    }

    /* renamed from: f */
    public final boolean mo15535f() {
        return !this.f13118s && this.f13101c;
    }

    /* renamed from: g */
    public final void mo15536g(boolean z) {
        boolean z2;
        if (getVisibility() == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (z) {
                this.f13113n.cancel();
                startAnimation(this.f13114o);
            }
            super.setVisibility(4);
        }
    }

    public int getButtonSize() {
        return this.f13100b;
    }

    public int getColorDisabled() {
        return this.f13108j;
    }

    public int getColorNormal() {
        return this.f13106h;
    }

    public int getColorPressed() {
        return this.f13107i;
    }

    public int getColorRipple() {
        return this.f13109k;
    }

    public Animation getHideAnimation() {
        return this.f13114o;
    }

    public Drawable getIconDrawable() {
        Drawable drawable = this.f13110l;
        if (drawable != null) {
            return drawable;
        }
        return new ColorDrawable(0);
    }

    public String getLabelText() {
        return this.f13115p;
    }

    public Label getLabelView() {
        return (Label) getTag(C3814k.fab_label);
    }

    public int getLabelVisibility() {
        Label labelView = getLabelView();
        if (labelView != null) {
            return labelView.getVisibility();
        }
        return -1;
    }

    public synchronized int getMax() {
        return this.f13098T;
    }

    public View.OnClickListener getOnClickListener() {
        return this.f13116q;
    }

    public synchronized int getProgress() {
        return this.f13084F ? 0 : this.f13094P;
    }

    public int getShadowColor() {
        return this.f13102d;
    }

    public int getShadowRadius() {
        return this.f13103e;
    }

    public int getShadowXOffset() {
        return this.f13104f;
    }

    public int getShadowYOffset() {
        return this.f13105g;
    }

    public Animation getShowAnimation() {
        return this.f13113n;
    }

    @TargetApi(21)
    /* renamed from: h */
    public final void mo15555h() {
        RippleDrawable rippleDrawable = this.f13117r;
        if (rippleDrawable instanceof StateListDrawable) {
            ((StateListDrawable) rippleDrawable).setState(new int[]{16842910, 16842919});
            return;
        }
        rippleDrawable.setState(new int[]{16842910, 16842919});
        rippleDrawable.setHotspot((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2));
        rippleDrawable.setVisible(true, true);
    }

    @TargetApi(21)
    /* renamed from: i */
    public final void mo15556i() {
        RippleDrawable rippleDrawable = this.f13117r;
        if (rippleDrawable instanceof StateListDrawable) {
            ((StateListDrawable) rippleDrawable).setState(new int[]{16842910});
            return;
        }
        rippleDrawable.setState(new int[]{16842910});
        rippleDrawable.setHotspot((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2));
        rippleDrawable.setVisible(true, true);
    }

    /* renamed from: j */
    public final void mo15557j() {
        if (!this.f13080B) {
            if (this.f13125z == -1.0f) {
                this.f13125z = getX();
            }
            if (this.f13079A == -1.0f) {
                this.f13079A = getY();
            }
            this.f13080B = true;
        }
    }

    /* renamed from: k */
    public final synchronized void mo15558k(int i, boolean z) {
        float f;
        if (!this.f13084F) {
            this.f13094P = i;
            this.f13095Q = z;
            if (!this.f13080B) {
                this.f13097S = true;
                return;
            }
            this.f13120u = true;
            this.f13124y = true;
            mo15559l();
            mo15557j();
            mo15561n();
            if (i < 0) {
                i = 0;
            } else {
                int i2 = this.f13098T;
                if (i > i2) {
                    i = i2;
                }
            }
            float f2 = (float) i;
            if (f2 != this.f13093O) {
                int i3 = this.f13098T;
                if (i3 > 0) {
                    f = (f2 / ((float) i3)) * 360.0f;
                } else {
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                this.f13093O = f;
                this.f13085G = SystemClock.uptimeMillis();
                if (!z) {
                    this.f13092N = this.f13093O;
                }
                invalidate();
            }
        }
    }

    /* renamed from: l */
    public final void mo15559l() {
        int i;
        int i2 = 0;
        if (mo15535f()) {
            i = getShadowX();
        } else {
            i = 0;
        }
        if (mo15535f()) {
            i2 = getShadowY();
        }
        int i3 = this.f13121v;
        this.f13081C = new RectF((float) ((i3 / 2) + i), (float) ((i3 / 2) + i2), (float) ((mo15532c() - i) - (this.f13121v / 2)), (float) ((mo15531b() - i2) - (this.f13121v / 2)));
    }

    /* renamed from: m */
    public final void mo15560m(boolean z) {
        boolean z2;
        if (getVisibility() == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                this.f13114o.cancel();
                startAnimation(this.f13113n);
            }
            super.setVisibility(0);
        }
    }

    /* renamed from: n */
    public final void mo15561n() {
        LayerDrawable layerDrawable;
        int i;
        int i2;
        int i3 = 0;
        if (mo15535f()) {
            layerDrawable = new LayerDrawable(new Drawable[]{new C3798d(), mo15534e(), getIconDrawable()});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{mo15534e(), getIconDrawable()});
        }
        int i4 = -1;
        if (getIconDrawable() != null) {
            i4 = Math.max(getIconDrawable().getIntrinsicWidth(), getIconDrawable().getIntrinsicHeight());
        }
        int circleSize = getCircleSize();
        if (i4 <= 0) {
            i4 = this.f13112m;
        }
        int i5 = (circleSize - i4) / 2;
        if (mo15535f()) {
            i = Math.abs(this.f13104f) + this.f13103e;
        } else {
            i = 0;
        }
        if (mo15535f()) {
            i3 = this.f13103e + Math.abs(this.f13105g);
        }
        if (this.f13120u) {
            int i6 = this.f13121v;
            i += i6;
            i3 += i6;
        }
        if (mo15535f()) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        int i7 = i + i5;
        int i8 = i3 + i5;
        layerDrawable.setLayerInset(i2, i7, i8, i7, i8);
        setBackgroundCompat(layerDrawable);
    }

    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f13120u) {
            if (this.f13099U) {
                canvas.drawArc(this.f13081C, 360.0f, 360.0f, false, this.f13082D);
            }
            boolean z = false;
            boolean z2 = true;
            if (this.f13084F) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.f13085G;
                float f3 = (((float) uptimeMillis) * this.f13086H) / 1000.0f;
                long j = this.f13087I;
                if (j >= 200) {
                    double d = this.f13088J + ((double) uptimeMillis);
                    this.f13088J = d;
                    if (d > 500.0d) {
                        this.f13088J = d - 500.0d;
                        this.f13087I = 0;
                        this.f13089K = !this.f13089K;
                    }
                    float cos = (((float) Math.cos(((this.f13088J / 500.0d) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                    float f4 = (float) (270 - this.f13090L);
                    if (this.f13089K) {
                        this.f13091M = cos * f4;
                    } else {
                        float f5 = (1.0f - cos) * f4;
                        this.f13092N = (this.f13091M - f5) + this.f13092N;
                        this.f13091M = f5;
                    }
                } else {
                    this.f13087I = j + uptimeMillis;
                }
                float f6 = this.f13092N + f3;
                this.f13092N = f6;
                if (f6 > 360.0f) {
                    this.f13092N = f6 - 360.0f;
                }
                this.f13085G = SystemClock.uptimeMillis();
                float f7 = this.f13092N - 90.0f;
                float f8 = ((float) this.f13090L) + this.f13091M;
                if (isInEditMode()) {
                    f2 = BitmapDescriptorFactory.HUE_RED;
                    f = 135.0f;
                } else {
                    f2 = f7;
                    f = f8;
                }
                canvas.drawArc(this.f13081C, f2, f, false, this.f13083E);
            } else {
                if (this.f13092N != this.f13093O) {
                    float uptimeMillis2 = (((float) (SystemClock.uptimeMillis() - this.f13085G)) / 1000.0f) * this.f13086H;
                    float f9 = this.f13092N;
                    float f11 = this.f13093O;
                    if (f9 > f11) {
                        this.f13092N = Math.max(f9 - uptimeMillis2, f11);
                    } else {
                        this.f13092N = Math.min(f9 + uptimeMillis2, f11);
                    }
                    this.f13085G = SystemClock.uptimeMillis();
                    z = true;
                }
                canvas.drawArc(this.f13081C, -90.0f, this.f13092N, false, this.f13083E);
                z2 = z;
            }
            if (z2) {
                invalidate();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(mo15532c(), mo15531b());
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ProgressSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ProgressSavedState progressSavedState = (ProgressSavedState) parcelable;
        super.onRestoreInstanceState(progressSavedState.getSuperState());
        this.f13092N = progressSavedState.f13126b;
        this.f13093O = progressSavedState.f13127c;
        this.f13086H = progressSavedState.f13128d;
        this.f13121v = progressSavedState.f13130f;
        this.f13122w = progressSavedState.f13131g;
        this.f13123x = progressSavedState.f13132h;
        this.f13096R = progressSavedState.f13136l;
        this.f13097S = progressSavedState.f13137m;
        this.f13094P = progressSavedState.f13129e;
        this.f13095Q = progressSavedState.f13138n;
        this.f13099U = progressSavedState.f13139o;
        this.f13085G = SystemClock.uptimeMillis();
    }

    public final Parcelable onSaveInstanceState() {
        boolean z;
        ProgressSavedState progressSavedState = new ProgressSavedState(super.onSaveInstanceState());
        progressSavedState.f13126b = this.f13092N;
        progressSavedState.f13127c = this.f13093O;
        progressSavedState.f13128d = this.f13086H;
        progressSavedState.f13130f = this.f13121v;
        progressSavedState.f13131g = this.f13122w;
        progressSavedState.f13132h = this.f13123x;
        boolean z2 = this.f13084F;
        progressSavedState.f13136l = z2;
        if (!this.f13120u || this.f13094P <= 0 || z2) {
            z = false;
        } else {
            z = true;
        }
        progressSavedState.f13137m = z;
        progressSavedState.f13129e = this.f13094P;
        progressSavedState.f13138n = this.f13095Q;
        progressSavedState.f13139o = this.f13099U;
        return progressSavedState;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        mo15557j();
        if (this.f13096R) {
            setIndeterminate(true);
            this.f13096R = false;
        } else if (this.f13097S) {
            mo15558k(this.f13094P, this.f13095Q);
            this.f13097S = false;
        } else if (this.f13124y) {
            if (this.f13120u) {
                if (this.f13125z > getX()) {
                    f2 = getX() + ((float) this.f13121v);
                } else {
                    f2 = getX() - ((float) this.f13121v);
                }
                if (this.f13079A > getY()) {
                    f = getY() + ((float) this.f13121v);
                } else {
                    f = getY() - ((float) this.f13121v);
                }
            } else {
                f2 = this.f13125z;
                f = this.f13079A;
            }
            setX(f2);
            setY(f);
            this.f13124y = false;
        }
        super.onSizeChanged(i, i2, i3, i4);
        mo15559l();
        this.f13082D.setColor(this.f13123x);
        this.f13082D.setStyle(Paint.Style.STROKE);
        this.f13082D.setStrokeWidth((float) this.f13121v);
        this.f13083E.setColor(this.f13122w);
        this.f13083E.setStyle(Paint.Style.STROKE);
        this.f13083E.setStrokeWidth((float) this.f13121v);
        mo15561n();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f13116q != null && isEnabled()) {
            Label label = (Label) getTag(C3814k.fab_label);
            if (label == null) {
                return super.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 1) {
                label.mo15655d();
                mo15556i();
            } else if (action == 3) {
                label.mo15655d();
                mo15556i();
            }
            this.f13111l0.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setButtonSize(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Use @FabSize constants only!");
        } else if (this.f13100b != i) {
            this.f13100b = i;
            mo15561n();
        }
    }

    public void setColorDisabled(int i) {
        if (i != this.f13108j) {
            this.f13108j = i;
            mo15561n();
        }
    }

    public void setColorDisabledResId(int i) {
        setColorDisabled(getResources().getColor(i));
    }

    public void setColorNormal(int i) {
        if (this.f13106h != i) {
            this.f13106h = i;
            mo15561n();
        }
    }

    public void setColorNormalResId(int i) {
        setColorNormal(getResources().getColor(i));
    }

    public void setColorPressed(int i) {
        if (i != this.f13107i) {
            this.f13107i = i;
            mo15561n();
        }
    }

    public void setColorPressedResId(int i) {
        setColorPressed(getResources().getColor(i));
    }

    public void setColorRipple(int i) {
        if (i != this.f13109k) {
            this.f13109k = i;
            mo15561n();
        }
    }

    public void setColorRippleResId(int i) {
        setColorRipple(getResources().getColor(i));
    }

    public void setElevation(float f) {
        if (f > BitmapDescriptorFactory.HUE_RED) {
            super.setElevation(f);
            if (!isInEditMode()) {
                this.f13118s = true;
                this.f13101c = false;
            }
            mo15561n();
        }
    }

    @TargetApi(21)
    public void setElevationCompat(float f) {
        this.f13102d = 637534208;
        float f2 = f / 2.0f;
        this.f13103e = Math.round(f2);
        this.f13104f = 0;
        if (this.f13100b == 0) {
            f2 = f;
        }
        this.f13105g = Math.round(f2);
        super.setElevation(f);
        this.f13119t = true;
        this.f13101c = false;
        mo15561n();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        Label label = (Label) getTag(C3814k.fab_label);
        if (label != null) {
            label.setEnabled(z);
        }
    }

    public void setHideAnimation(Animation animation) {
        this.f13114o = animation;
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.f13110l != drawable) {
            this.f13110l = drawable;
            mo15561n();
        }
    }

    public void setImageResource(int i) {
        Drawable drawable = getResources().getDrawable(i);
        if (this.f13110l != drawable) {
            this.f13110l = drawable;
            mo15561n();
        }
    }

    public synchronized void setIndeterminate(boolean z) {
        if (!z) {
            this.f13092N = BitmapDescriptorFactory.HUE_RED;
        }
        this.f13120u = z;
        this.f13124y = true;
        this.f13084F = z;
        this.f13085G = SystemClock.uptimeMillis();
        mo15559l();
        mo15561n();
    }

    public void setLabelText(String str) {
        this.f13115p = str;
        Label labelView = getLabelView();
        if (labelView != null) {
            labelView.setText(str);
        }
    }

    public void setLabelTextColor(int i) {
        getLabelView().setTextColor(i);
    }

    public void setLabelVisibility(int i) {
        boolean z;
        Label labelView = getLabelView();
        if (labelView != null) {
            labelView.setVisibility(i);
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            labelView.setHandleVisibilityChanges(z);
        }
    }

    @TargetApi(21)
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.f13119t) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin += getShadowX();
            marginLayoutParams.topMargin += getShadowY();
            marginLayoutParams.rightMargin += getShadowX();
            marginLayoutParams.bottomMargin += getShadowY();
        }
        super.setLayoutParams(layoutParams);
    }

    public synchronized void setMax(int i) {
        this.f13098T = i;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f13116q = onClickListener;
        View view = (View) getTag(C3814k.fab_label);
        if (view != null) {
            view.setOnClickListener(new C3796b());
        }
    }

    public void setShadowColor(int i) {
        if (this.f13102d != i) {
            this.f13102d = i;
            mo15561n();
        }
    }

    public void setShadowColorResource(int i) {
        int color = getResources().getColor(i);
        if (this.f13102d != color) {
            this.f13102d = color;
            mo15561n();
        }
    }

    public void setShadowRadius(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        if (this.f13103e != dimensionPixelSize) {
            this.f13103e = dimensionPixelSize;
            requestLayout();
            mo15561n();
        }
    }

    public void setShadowXOffset(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        if (this.f13104f != dimensionPixelSize) {
            this.f13104f = dimensionPixelSize;
            requestLayout();
            mo15561n();
        }
    }

    public void setShadowYOffset(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        if (this.f13105g != dimensionPixelSize) {
            this.f13105g = dimensionPixelSize;
            requestLayout();
            mo15561n();
        }
    }

    public void setShowAnimation(Animation animation) {
        this.f13113n = animation;
    }

    public synchronized void setShowProgressBackground(boolean z) {
        this.f13099U = z;
    }

    public void setShowShadow(boolean z) {
        if (this.f13101c != z) {
            this.f13101c = z;
            mo15561n();
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        Label label = (Label) getTag(C3814k.fab_label);
        if (label != null) {
            label.setVisibility(i);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13103e = C3816m.m10117a(getContext(), 4.0f);
        this.f13104f = C3816m.m10117a(getContext(), 1.0f);
        this.f13105g = C3816m.m10117a(getContext(), 3.0f);
        this.f13112m = C3816m.m10117a(getContext(), 24.0f);
        this.f13121v = C3816m.m10117a(getContext(), 6.0f);
        this.f13125z = -1.0f;
        this.f13079A = -1.0f;
        this.f13081C = new RectF();
        this.f13082D = new Paint(1);
        this.f13083E = new Paint(1);
        this.f13086H = 195.0f;
        this.f13087I = 0;
        this.f13089K = true;
        this.f13090L = 16;
        this.f13098T = 100;
        this.f13111l0 = new GestureDetector(getContext(), new C3795a());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3815l.FloatingActionButton, i, 0);
        this.f13106h = obtainStyledAttributes.getColor(C3815l.FloatingActionButton_fab_colorNormal, -2473162);
        this.f13107i = obtainStyledAttributes.getColor(C3815l.FloatingActionButton_fab_colorPressed, -1617853);
        this.f13108j = obtainStyledAttributes.getColor(C3815l.FloatingActionButton_fab_colorDisabled, -5592406);
        this.f13109k = obtainStyledAttributes.getColor(C3815l.FloatingActionButton_fab_colorRipple, -1711276033);
        this.f13101c = obtainStyledAttributes.getBoolean(C3815l.FloatingActionButton_fab_showShadow, true);
        this.f13102d = obtainStyledAttributes.getColor(C3815l.FloatingActionButton_fab_shadowColor, 1711276032);
        this.f13103e = obtainStyledAttributes.getDimensionPixelSize(C3815l.FloatingActionButton_fab_shadowRadius, this.f13103e);
        this.f13104f = obtainStyledAttributes.getDimensionPixelSize(C3815l.FloatingActionButton_fab_shadowXOffset, this.f13104f);
        this.f13105g = obtainStyledAttributes.getDimensionPixelSize(C3815l.FloatingActionButton_fab_shadowYOffset, this.f13105g);
        this.f13100b = obtainStyledAttributes.getInt(C3815l.FloatingActionButton_fab_size, 0);
        this.f13115p = obtainStyledAttributes.getString(C3815l.FloatingActionButton_fab_label);
        this.f13096R = obtainStyledAttributes.getBoolean(C3815l.FloatingActionButton_fab_progress_indeterminate, false);
        this.f13122w = obtainStyledAttributes.getColor(C3815l.FloatingActionButton_fab_progress_color, -16738680);
        this.f13123x = obtainStyledAttributes.getColor(C3815l.FloatingActionButton_fab_progress_backgroundColor, 1291845632);
        this.f13098T = obtainStyledAttributes.getInt(C3815l.FloatingActionButton_fab_progress_max, this.f13098T);
        this.f13099U = obtainStyledAttributes.getBoolean(C3815l.FloatingActionButton_fab_progress_showBackground, true);
        int i2 = C3815l.FloatingActionButton_fab_progress;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.f13094P = obtainStyledAttributes.getInt(i2, 0);
            this.f13097S = true;
        }
        int i3 = C3815l.FloatingActionButton_fab_elevationCompat;
        if (obtainStyledAttributes.hasValue(i3)) {
            float dimensionPixelOffset = (float) obtainStyledAttributes.getDimensionPixelOffset(i3, 0);
            if (isInEditMode()) {
                setElevation(dimensionPixelOffset);
            } else {
                setElevationCompat(dimensionPixelOffset);
            }
        }
        this.f13113n = AnimationUtils.loadAnimation(getContext(), obtainStyledAttributes.getResourceId(C3815l.FloatingActionButton_fab_showAnimation, C3811h.fab_scale_up));
        this.f13114o = AnimationUtils.loadAnimation(getContext(), obtainStyledAttributes.getResourceId(C3815l.FloatingActionButton_fab_hideAnimation, C3811h.fab_scale_down));
        obtainStyledAttributes.recycle();
        if (isInEditMode()) {
            if (this.f13096R) {
                setIndeterminate(true);
            } else if (this.f13097S) {
                mo15557j();
                mo15558k(this.f13094P, false);
            }
        }
        setClickable(true);
    }

    public void setLabelTextColor(ColorStateList colorStateList) {
        getLabelView().setTextColor(colorStateList);
    }

    public void setShadowRadius(float f) {
        this.f13103e = C3816m.m10117a(getContext(), f);
        requestLayout();
        mo15561n();
    }

    public void setShadowXOffset(float f) {
        this.f13104f = C3816m.m10117a(getContext(), f);
        requestLayout();
        mo15561n();
    }

    public void setShadowYOffset(float f) {
        this.f13105g = C3816m.m10117a(getContext(), f);
        requestLayout();
        mo15561n();
    }
}
