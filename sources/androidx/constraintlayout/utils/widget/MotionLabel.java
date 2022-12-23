package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p002a1.C0042d;
import p114i.C5215a;
import p328z0.C7376a;
import p328z0.C7378c;

public class MotionLabel extends View implements C7378c {

    /* renamed from: A */
    public float f2930A;

    /* renamed from: B */
    public float f2931B;

    /* renamed from: C */
    public float f2932C;

    /* renamed from: D */
    public Drawable f2933D;

    /* renamed from: E */
    public Matrix f2934E;

    /* renamed from: F */
    public Bitmap f2935F;

    /* renamed from: G */
    public BitmapShader f2936G;

    /* renamed from: H */
    public Matrix f2937H;

    /* renamed from: I */
    public float f2938I = Float.NaN;

    /* renamed from: J */
    public float f2939J = Float.NaN;

    /* renamed from: K */
    public float f2940K = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: L */
    public float f2941L = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: M */
    public Paint f2942M = new Paint();

    /* renamed from: N */
    public int f2943N = 0;

    /* renamed from: O */
    public Rect f2944O;

    /* renamed from: P */
    public Paint f2945P;

    /* renamed from: Q */
    public float f2946Q;

    /* renamed from: R */
    public float f2947R = Float.NaN;

    /* renamed from: S */
    public float f2948S = Float.NaN;

    /* renamed from: T */
    public float f2949T = Float.NaN;

    /* renamed from: U */
    public float f2950U = Float.NaN;

    /* renamed from: b */
    public TextPaint f2951b = new TextPaint();

    /* renamed from: c */
    public Path f2952c = new Path();

    /* renamed from: d */
    public int f2953d = 65535;

    /* renamed from: e */
    public int f2954e = 65535;

    /* renamed from: f */
    public boolean f2955f = false;

    /* renamed from: g */
    public float f2956g = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: h */
    public float f2957h = Float.NaN;

    /* renamed from: i */
    public ViewOutlineProvider f2958i;

    /* renamed from: j */
    public RectF f2959j;

    /* renamed from: k */
    public float f2960k = 48.0f;

    /* renamed from: l */
    public float f2961l = Float.NaN;

    /* renamed from: m */
    public int f2962m;

    /* renamed from: n */
    public int f2963n;

    /* renamed from: o */
    public float f2964o = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: p */
    public String f2965p = "Hello World";

    /* renamed from: q */
    public boolean f2966q = true;

    /* renamed from: r */
    public Rect f2967r = new Rect();

    /* renamed from: s */
    public int f2968s = 1;

    /* renamed from: t */
    public int f2969t = 1;

    /* renamed from: u */
    public int f2970u = 1;

    /* renamed from: v */
    public int f2971v = 1;

    /* renamed from: w */
    public String f2972w;

    /* renamed from: x */
    public int f2973x = 8388659;

    /* renamed from: y */
    public int f2974y = 0;

    /* renamed from: z */
    public boolean f2975z = false;

    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$a */
    public class C0732a extends ViewOutlineProvider {
        public C0732a() {
        }

        public final void getOutline(View view, Outline outline) {
            int width = MotionLabel.this.getWidth();
            int height = MotionLabel.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * MotionLabel.this.f2956g) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$b */
    public class C0733b extends ViewOutlineProvider {
        public C0733b() {
        }

        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f2957h);
        }
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3101c(context, attributeSet);
    }

    private float getHorizontalOffset() {
        float f;
        float f2;
        if (Float.isNaN(this.f2961l)) {
            f = 1.0f;
        } else {
            f = this.f2960k / this.f2961l;
        }
        TextPaint textPaint = this.f2951b;
        String str = this.f2965p;
        float measureText = textPaint.measureText(str, 0, str.length()) * f;
        if (Float.isNaN(this.f2931B)) {
            f2 = (float) getMeasuredWidth();
        } else {
            f2 = this.f2931B;
        }
        return ((this.f2940K + 1.0f) * (((f2 - ((float) getPaddingLeft())) - ((float) getPaddingRight())) - measureText)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f;
        float f2;
        if (Float.isNaN(this.f2961l)) {
            f = 1.0f;
        } else {
            f = this.f2960k / this.f2961l;
        }
        Paint.FontMetrics fontMetrics = this.f2951b.getFontMetrics();
        if (Float.isNaN(this.f2932C)) {
            f2 = (float) getMeasuredHeight();
        } else {
            f2 = this.f2932C;
        }
        float paddingTop = (f2 - ((float) getPaddingTop())) - ((float) getPaddingBottom());
        float f3 = fontMetrics.descent;
        float f4 = fontMetrics.ascent;
        return (((1.0f - this.f2941L) * (paddingTop - ((f3 - f4) * f))) / 2.0f) - (f * f4);
    }

    /* renamed from: a */
    public final void mo3099a(float f, float f2, float f3, float f4) {
        float f5;
        int i = (int) (f + 0.5f);
        this.f2930A = f - ((float) i);
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f6 = f3 - f;
        this.f2931B = f6;
        float f7 = f4 - f2;
        this.f2932C = f7;
        if (this.f2937H != null) {
            this.f2931B = f6;
            this.f2932C = f7;
            mo3102d();
        }
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        }
        if (this.f2975z) {
            if (this.f2944O == null) {
                this.f2945P = new Paint();
                this.f2944O = new Rect();
                this.f2945P.set(this.f2951b);
                this.f2946Q = this.f2945P.getTextSize();
            }
            this.f2931B = f6;
            this.f2932C = f7;
            Paint paint = this.f2945P;
            String str = this.f2965p;
            paint.getTextBounds(str, 0, str.length(), this.f2944O);
            int width = this.f2944O.width();
            float height = ((float) this.f2944O.height()) * 1.3f;
            float f8 = (f6 - ((float) this.f2969t)) - ((float) this.f2968s);
            float f9 = (f7 - ((float) this.f2971v)) - ((float) this.f2970u);
            float f11 = (float) width;
            if (f11 * f9 > height * f8) {
                this.f2951b.setTextSize((this.f2946Q * f8) / f11);
            } else {
                this.f2951b.setTextSize((this.f2946Q * f9) / height);
            }
            if (this.f2955f || !Float.isNaN(this.f2961l)) {
                if (Float.isNaN(this.f2961l)) {
                    f5 = 1.0f;
                } else {
                    f5 = this.f2960k / this.f2961l;
                }
                mo3100b(f5);
            }
        }
    }

    /* renamed from: b */
    public final void mo3100b(float f) {
        if (this.f2955f || f != 1.0f) {
            this.f2952c.reset();
            String str = this.f2965p;
            int length = str.length();
            this.f2951b.getTextBounds(str, 0, length, this.f2967r);
            this.f2951b.getTextPath(str, 0, length, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f2952c);
            if (f != 1.0f) {
                C7376a.m16986a();
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                this.f2952c.transform(matrix);
            }
            Rect rect = this.f2967r;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = (float) getHeight();
            rectF.right = (float) getWidth();
            this.f2966q = false;
        }
    }

    /* renamed from: c */
    public final void mo3101c(Context context, AttributeSet attributeSet) {
        Typeface typeface;
        Typeface typeface2;
        int i;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C5215a.colorPrimary, typedValue, true);
        TextPaint textPaint = this.f2951b;
        int i2 = typedValue.data;
        this.f2953d = i2;
        textPaint.setColor(i2);
        boolean z = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0042d.MotionLabel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0042d.MotionLabel_android_text) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == C0042d.MotionLabel_android_fontFamily) {
                    this.f2972w = obtainStyledAttributes.getString(index);
                } else if (index == C0042d.MotionLabel_scaleFromTextSize) {
                    this.f2961l = (float) obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f2961l);
                } else if (index == C0042d.MotionLabel_android_textSize) {
                    this.f2960k = (float) obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f2960k);
                } else if (index == C0042d.MotionLabel_android_textStyle) {
                    this.f2962m = obtainStyledAttributes.getInt(index, this.f2962m);
                } else if (index == C0042d.MotionLabel_android_typeface) {
                    this.f2963n = obtainStyledAttributes.getInt(index, this.f2963n);
                } else if (index == C0042d.MotionLabel_android_textColor) {
                    this.f2953d = obtainStyledAttributes.getColor(index, this.f2953d);
                } else if (index == C0042d.MotionLabel_borderRound) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.f2957h);
                    this.f2957h = dimension;
                    setRound(dimension);
                } else if (index == C0042d.MotionLabel_borderRoundPercent) {
                    float f = obtainStyledAttributes.getFloat(index, this.f2956g);
                    this.f2956g = f;
                    setRoundPercent(f);
                } else if (index == C0042d.MotionLabel_android_gravity) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == C0042d.MotionLabel_android_autoSizeTextType) {
                    this.f2974y = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0042d.MotionLabel_textOutlineColor) {
                    this.f2954e = obtainStyledAttributes.getInt(index, this.f2954e);
                    this.f2955f = true;
                } else if (index == C0042d.MotionLabel_textOutlineThickness) {
                    this.f2964o = obtainStyledAttributes.getDimension(index, this.f2964o);
                    this.f2955f = true;
                } else if (index == C0042d.MotionLabel_textBackground) {
                    this.f2933D = obtainStyledAttributes.getDrawable(index);
                    this.f2955f = true;
                } else if (index == C0042d.MotionLabel_textBackgroundPanX) {
                    this.f2947R = obtainStyledAttributes.getFloat(index, this.f2947R);
                } else if (index == C0042d.MotionLabel_textBackgroundPanY) {
                    this.f2948S = obtainStyledAttributes.getFloat(index, this.f2948S);
                } else if (index == C0042d.MotionLabel_textPanX) {
                    this.f2940K = obtainStyledAttributes.getFloat(index, this.f2940K);
                } else if (index == C0042d.MotionLabel_textPanY) {
                    this.f2941L = obtainStyledAttributes.getFloat(index, this.f2941L);
                } else if (index == C0042d.MotionLabel_textBackgroundRotate) {
                    this.f2950U = obtainStyledAttributes.getFloat(index, this.f2950U);
                } else if (index == C0042d.MotionLabel_textBackgroundZoom) {
                    this.f2949T = obtainStyledAttributes.getFloat(index, this.f2949T);
                } else if (index == C0042d.MotionLabel_textureHeight) {
                    this.f2938I = obtainStyledAttributes.getDimension(index, this.f2938I);
                } else if (index == C0042d.MotionLabel_textureWidth) {
                    this.f2939J = obtainStyledAttributes.getDimension(index, this.f2939J);
                } else if (index == C0042d.MotionLabel_textureEffect) {
                    this.f2943N = obtainStyledAttributes.getInt(index, this.f2943N);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f2933D != null) {
            this.f2937H = new Matrix();
            int intrinsicWidth = this.f2933D.getIntrinsicWidth();
            int intrinsicHeight = this.f2933D.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                if (Float.isNaN(this.f2939J)) {
                    intrinsicWidth = RecyclerView.C1119a0.FLAG_IGNORE;
                } else {
                    intrinsicWidth = (int) this.f2939J;
                }
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                if (Float.isNaN(this.f2938I)) {
                    intrinsicHeight = RecyclerView.C1119a0.FLAG_IGNORE;
                } else {
                    intrinsicHeight = (int) this.f2938I;
                }
            }
            if (this.f2943N != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f2935F = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f2935F);
            this.f2933D.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f2933D.setFilterBitmap(true);
            this.f2933D.draw(canvas);
            if (this.f2943N != 0) {
                Bitmap bitmap = this.f2935F;
                System.nanoTime();
                int width = bitmap.getWidth() / 2;
                int height = bitmap.getHeight() / 2;
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
                for (int i4 = 0; i4 < 4 && width >= 32 && height >= 32; i4++) {
                    width /= 2;
                    height /= 2;
                    createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
                }
                this.f2935F = createScaledBitmap;
            }
            Bitmap bitmap2 = this.f2935F;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f2936G = new BitmapShader(bitmap2, tileMode, tileMode);
        }
        this.f2968s = getPaddingLeft();
        this.f2969t = getPaddingRight();
        this.f2970u = getPaddingTop();
        this.f2971v = getPaddingBottom();
        String str = this.f2972w;
        int i5 = this.f2963n;
        int i6 = this.f2962m;
        if (str != null) {
            typeface = Typeface.create(str, i6);
            if (typeface != null) {
                setTypeface(typeface);
                this.f2951b.setColor(this.f2953d);
                this.f2951b.setStrokeWidth(this.f2964o);
                this.f2951b.setStyle(Paint.Style.FILL_AND_STROKE);
                this.f2951b.setFlags(RecyclerView.C1119a0.FLAG_IGNORE);
                setTextSize(this.f2960k);
                this.f2951b.setAntiAlias(true);
            }
        } else {
            typeface = null;
        }
        if (i5 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i5 == 2) {
            typeface = Typeface.SERIF;
        } else if (i5 == 3) {
            typeface = Typeface.MONOSPACE;
        }
        float f2 = BitmapDescriptorFactory.HUE_RED;
        if (i6 > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i6);
            } else {
                typeface2 = Typeface.create(typeface, i6);
            }
            setTypeface(typeface2);
            if (typeface2 != null) {
                i = typeface2.getStyle();
            } else {
                i = 0;
            }
            int i7 = (~i) & i6;
            TextPaint textPaint2 = this.f2951b;
            if ((i7 & 1) != 0) {
                z = true;
            }
            textPaint2.setFakeBoldText(z);
            TextPaint textPaint3 = this.f2951b;
            if ((i7 & 2) != 0) {
                f2 = -0.25f;
            }
            textPaint3.setTextSkewX(f2);
        } else {
            this.f2951b.setFakeBoldText(false);
            this.f2951b.setTextSkewX(BitmapDescriptorFactory.HUE_RED);
            setTypeface(typeface);
        }
        this.f2951b.setColor(this.f2953d);
        this.f2951b.setStrokeWidth(this.f2964o);
        this.f2951b.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f2951b.setFlags(RecyclerView.C1119a0.FLAG_IGNORE);
        setTextSize(this.f2960k);
        this.f2951b.setAntiAlias(true);
    }

    /* renamed from: d */
    public final void mo3102d() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean isNaN = Float.isNaN(this.f2947R);
        float f7 = BitmapDescriptorFactory.HUE_RED;
        if (isNaN) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = this.f2947R;
        }
        if (Float.isNaN(this.f2948S)) {
            f2 = BitmapDescriptorFactory.HUE_RED;
        } else {
            f2 = this.f2948S;
        }
        if (Float.isNaN(this.f2949T)) {
            f3 = 1.0f;
        } else {
            f3 = this.f2949T;
        }
        if (!Float.isNaN(this.f2950U)) {
            f7 = this.f2950U;
        }
        this.f2937H.reset();
        float width = (float) this.f2935F.getWidth();
        float height = (float) this.f2935F.getHeight();
        if (Float.isNaN(this.f2939J)) {
            f4 = this.f2931B;
        } else {
            f4 = this.f2939J;
        }
        if (Float.isNaN(this.f2938I)) {
            f5 = this.f2932C;
        } else {
            f5 = this.f2938I;
        }
        if (width * f5 < height * f4) {
            f6 = f4 / width;
        } else {
            f6 = f5 / height;
        }
        float f8 = f3 * f6;
        this.f2937H.postScale(f8, f8);
        float f9 = width * f8;
        float f11 = f4 - f9;
        float f12 = f8 * height;
        float f13 = f5 - f12;
        if (!Float.isNaN(this.f2938I)) {
            f13 = this.f2938I / 2.0f;
        }
        if (!Float.isNaN(this.f2939J)) {
            f11 = this.f2939J / 2.0f;
        }
        this.f2937H.postTranslate((((f * f11) + f4) - f9) * 0.5f, (((f2 * f13) + f5) - f12) * 0.5f);
        this.f2937H.postRotate(f7, f4 / 2.0f, f5 / 2.0f);
        this.f2936G.setLocalMatrix(this.f2937H);
    }

    public float getRound() {
        return this.f2957h;
    }

    public float getRoundPercent() {
        return this.f2956g;
    }

    public float getScaleFromTextSize() {
        return this.f2961l;
    }

    public float getTextBackgroundPanX() {
        return this.f2947R;
    }

    public float getTextBackgroundPanY() {
        return this.f2948S;
    }

    public float getTextBackgroundRotate() {
        return this.f2950U;
    }

    public float getTextBackgroundZoom() {
        return this.f2949T;
    }

    public int getTextOutlineColor() {
        return this.f2954e;
    }

    public float getTextPanX() {
        return this.f2940K;
    }

    public float getTextPanY() {
        return this.f2941L;
    }

    public float getTextureHeight() {
        return this.f2938I;
    }

    public float getTextureWidth() {
        return this.f2939J;
    }

    public Typeface getTypeface() {
        return this.f2951b.getTypeface();
    }

    public final void layout(int i, int i2, int i3, int i4) {
        float f;
        super.layout(i, i2, i3, i4);
        boolean isNaN = Float.isNaN(this.f2961l);
        if (isNaN) {
            f = 1.0f;
        } else {
            f = this.f2960k / this.f2961l;
        }
        this.f2931B = (float) (i3 - i);
        this.f2932C = (float) (i4 - i2);
        if (this.f2975z) {
            if (this.f2944O == null) {
                this.f2945P = new Paint();
                this.f2944O = new Rect();
                this.f2945P.set(this.f2951b);
                this.f2946Q = this.f2945P.getTextSize();
            }
            Paint paint = this.f2945P;
            String str = this.f2965p;
            paint.getTextBounds(str, 0, str.length(), this.f2944O);
            int width = this.f2944O.width();
            int height = (int) (((float) this.f2944O.height()) * 1.3f);
            float f2 = (this.f2931B - ((float) this.f2969t)) - ((float) this.f2968s);
            float f3 = (this.f2932C - ((float) this.f2971v)) - ((float) this.f2970u);
            if (isNaN) {
                float f4 = (float) width;
                float f5 = (float) height;
                if (f4 * f3 > f5 * f2) {
                    this.f2951b.setTextSize((this.f2946Q * f2) / f4);
                } else {
                    this.f2951b.setTextSize((this.f2946Q * f3) / f5);
                }
            } else {
                float f6 = (float) width;
                float f7 = (float) height;
                if (f6 * f3 > f7 * f2) {
                    f = f2 / f6;
                } else {
                    f = f3 / f7;
                }
            }
        }
        if (this.f2955f || !isNaN) {
            float f8 = (float) i;
            float f9 = (float) i2;
            float f11 = (float) i3;
            float f12 = (float) i4;
            if (this.f2937H != null) {
                this.f2931B = f11 - f8;
                this.f2932C = f12 - f9;
                mo3102d();
            }
            mo3100b(f);
        }
    }

    public final void onDraw(Canvas canvas) {
        float f;
        if (Float.isNaN(this.f2961l)) {
            f = 1.0f;
        } else {
            f = this.f2960k / this.f2961l;
        }
        super.onDraw(canvas);
        if (this.f2955f || f != 1.0f) {
            if (this.f2966q) {
                mo3100b(f);
            }
            if (this.f2934E == null) {
                this.f2934E = new Matrix();
            }
            if (this.f2955f) {
                this.f2942M.set(this.f2951b);
                this.f2934E.reset();
                float horizontalOffset = ((float) this.f2968s) + getHorizontalOffset();
                float verticalOffset = ((float) this.f2970u) + getVerticalOffset();
                this.f2934E.postTranslate(horizontalOffset, verticalOffset);
                this.f2934E.preScale(f, f);
                this.f2952c.transform(this.f2934E);
                if (this.f2936G != null) {
                    this.f2951b.setFilterBitmap(true);
                    this.f2951b.setShader(this.f2936G);
                } else {
                    this.f2951b.setColor(this.f2953d);
                }
                this.f2951b.setStyle(Paint.Style.FILL);
                this.f2951b.setStrokeWidth(this.f2964o);
                canvas.drawPath(this.f2952c, this.f2951b);
                if (this.f2936G != null) {
                    this.f2951b.setShader((Shader) null);
                }
                this.f2951b.setColor(this.f2954e);
                this.f2951b.setStyle(Paint.Style.STROKE);
                this.f2951b.setStrokeWidth(this.f2964o);
                canvas.drawPath(this.f2952c, this.f2951b);
                this.f2934E.reset();
                this.f2934E.postTranslate(-horizontalOffset, -verticalOffset);
                this.f2952c.transform(this.f2934E);
                this.f2951b.set(this.f2942M);
                return;
            }
            float horizontalOffset2 = ((float) this.f2968s) + getHorizontalOffset();
            float verticalOffset2 = ((float) this.f2970u) + getVerticalOffset();
            this.f2934E.reset();
            this.f2934E.preTranslate(horizontalOffset2, verticalOffset2);
            this.f2952c.transform(this.f2934E);
            this.f2951b.setColor(this.f2953d);
            this.f2951b.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f2951b.setStrokeWidth(this.f2964o);
            canvas.drawPath(this.f2952c, this.f2951b);
            this.f2934E.reset();
            this.f2934E.preTranslate(-horizontalOffset2, -verticalOffset2);
            this.f2952c.transform(this.f2934E);
            return;
        }
        float horizontalOffset3 = ((float) this.f2968s) + getHorizontalOffset();
        canvas.drawText(this.f2965p, this.f2930A + horizontalOffset3, ((float) this.f2970u) + getVerticalOffset(), this.f2951b);
    }

    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f2975z = false;
        this.f2968s = getPaddingLeft();
        this.f2969t = getPaddingRight();
        this.f2970u = getPaddingTop();
        this.f2971v = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f2951b;
            String str = this.f2965p;
            textPaint.getTextBounds(str, 0, str.length(), this.f2967r);
            if (mode != 1073741824) {
                size = (int) (((float) this.f2967r.width()) + 0.99999f);
            }
            size += this.f2968s + this.f2969t;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (((float) this.f2951b.getFontMetricsInt((Paint.FontMetricsInt) null)) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f2970u + this.f2971v + fontMetricsInt;
            }
        } else if (this.f2974y != 0) {
            this.f2975z = true;
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i) {
        if ((i & 8388615) == 0) {
            i |= 8388611;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        if (i != this.f2973x) {
            invalidate();
        }
        this.f2973x = i;
        int i2 = i & 112;
        if (i2 == 48) {
            this.f2941L = -1.0f;
        } else if (i2 != 80) {
            this.f2941L = BitmapDescriptorFactory.HUE_RED;
        } else {
            this.f2941L = 1.0f;
        }
        int i3 = i & 8388615;
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 != 8388613) {
                        this.f2940K = BitmapDescriptorFactory.HUE_RED;
                        return;
                    }
                }
            }
            this.f2940K = 1.0f;
            return;
        }
        this.f2940K = -1.0f;
    }

    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f2957h = f;
            float f2 = this.f2956g;
            this.f2956g = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f2957h != f) {
            z = true;
        } else {
            z = false;
        }
        this.f2957h = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.f2952c == null) {
                this.f2952c = new Path();
            }
            if (this.f2959j == null) {
                this.f2959j = new RectF();
            }
            if (this.f2958i == null) {
                C0733b bVar = new C0733b();
                this.f2958i = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2959j.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight());
            this.f2952c.reset();
            Path path = this.f2952c;
            RectF rectF = this.f2959j;
            float f3 = this.f2957h;
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
        if (this.f2956g != f) {
            z = true;
        } else {
            z = false;
        }
        this.f2956g = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.f2952c == null) {
                this.f2952c = new Path();
            }
            if (this.f2959j == null) {
                this.f2959j = new RectF();
            }
            if (this.f2958i == null) {
                C0732a aVar = new C0732a();
                this.f2958i = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2956g) / 2.0f;
            this.f2959j.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) width, (float) height);
            this.f2952c.reset();
            this.f2952c.addRoundRect(this.f2959j, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.f2961l = f;
    }

    public void setText(CharSequence charSequence) {
        this.f2965p = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.f2947R = f;
        mo3102d();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.f2948S = f;
        mo3102d();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.f2950U = f;
        mo3102d();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.f2949T = f;
        mo3102d();
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.f2953d = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.f2954e = i;
        this.f2955f = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.f2964o = f;
        this.f2955f = true;
        if (Float.isNaN(f)) {
            this.f2964o = 1.0f;
            this.f2955f = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.f2940K = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.f2941L = f;
        invalidate();
    }

    public void setTextSize(float f) {
        float f2;
        this.f2960k = f;
        C7376a.m16986a();
        float f3 = this.f2961l;
        TextPaint textPaint = this.f2951b;
        if (!Float.isNaN(f3)) {
            f = this.f2961l;
        }
        textPaint.setTextSize(f);
        if (Float.isNaN(this.f2961l)) {
            f2 = 1.0f;
        } else {
            f2 = this.f2960k / this.f2961l;
        }
        mo3100b(f2);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f) {
        this.f2938I = f;
        mo3102d();
        invalidate();
    }

    public void setTextureWidth(float f) {
        this.f2939J = f;
        mo3102d();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (this.f2951b.getTypeface() != typeface) {
            this.f2951b.setTypeface(typeface);
        }
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo3101c(context, attributeSet);
    }
}
