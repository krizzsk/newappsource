package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.widget.C0801k;
import androidx.emoji2.text.C0836f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import p055d1.C4329e;
import p114i.C5215a;
import p114i.C5222h;
import p127j.C5344a;
import p141k1.C5450a;
import p163m.C5660a;
import p242s1.C6322b0;
import p242s1.C6333d0;
import p242s1.C6382p0;

public class SwitchCompat extends CompoundButton {

    /* renamed from: S */
    public static final C0370a f1327S = new C0370a();

    /* renamed from: T */
    public static final int[] f1328T = {16842912};

    /* renamed from: A */
    public float f1329A;

    /* renamed from: B */
    public int f1330B;

    /* renamed from: C */
    public int f1331C;

    /* renamed from: D */
    public int f1332D;

    /* renamed from: E */
    public int f1333E;

    /* renamed from: F */
    public int f1334F;

    /* renamed from: G */
    public int f1335G;

    /* renamed from: H */
    public int f1336H;

    /* renamed from: I */
    public boolean f1337I;

    /* renamed from: J */
    public final TextPaint f1338J;

    /* renamed from: K */
    public ColorStateList f1339K;

    /* renamed from: L */
    public StaticLayout f1340L;

    /* renamed from: M */
    public StaticLayout f1341M;

    /* renamed from: N */
    public C5660a f1342N;

    /* renamed from: O */
    public ObjectAnimator f1343O;

    /* renamed from: P */
    public C0414i f1344P;

    /* renamed from: Q */
    public C0372c f1345Q;

    /* renamed from: R */
    public final Rect f1346R;

    /* renamed from: b */
    public Drawable f1347b;

    /* renamed from: c */
    public ColorStateList f1348c;

    /* renamed from: d */
    public PorterDuff.Mode f1349d;

    /* renamed from: e */
    public boolean f1350e;

    /* renamed from: f */
    public boolean f1351f;

    /* renamed from: g */
    public Drawable f1352g;

    /* renamed from: h */
    public ColorStateList f1353h;

    /* renamed from: i */
    public PorterDuff.Mode f1354i;

    /* renamed from: j */
    public boolean f1355j;

    /* renamed from: k */
    public boolean f1356k;

    /* renamed from: l */
    public int f1357l;

    /* renamed from: m */
    public int f1358m;

    /* renamed from: n */
    public int f1359n;

    /* renamed from: o */
    public boolean f1360o;

    /* renamed from: p */
    public CharSequence f1361p;

    /* renamed from: q */
    public CharSequence f1362q;

    /* renamed from: r */
    public CharSequence f1363r;

    /* renamed from: s */
    public CharSequence f1364s;

    /* renamed from: t */
    public boolean f1365t;

    /* renamed from: u */
    public int f1366u;

    /* renamed from: v */
    public int f1367v;

    /* renamed from: w */
    public float f1368w;

    /* renamed from: x */
    public float f1369x;

    /* renamed from: y */
    public VelocityTracker f1370y;

    /* renamed from: z */
    public int f1371z;

    /* renamed from: androidx.appcompat.widget.SwitchCompat$a */
    public class C0370a extends Property<SwitchCompat, Float> {
        public C0370a() {
            super(Float.class, "thumbPos");
        }

        public final Object get(Object obj) {
            return Float.valueOf(((SwitchCompat) obj).f1329A);
        }

        public final void set(Object obj, Object obj2) {
            ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$b */
    public static class C0371b {
        /* renamed from: a */
        public static void m893a(ObjectAnimator objectAnimator, boolean z) {
            objectAnimator.setAutoCancel(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.SwitchCompat$c */
    public static class C0372c extends C0836f.C0841e {

        /* renamed from: a */
        public final WeakReference f1372a;

        public C0372c(SwitchCompat switchCompat) {
            this.f1372a = new WeakReference(switchCompat);
        }

        /* renamed from: a */
        public final void mo1909a() {
            SwitchCompat switchCompat = (SwitchCompat) this.f1372a.get();
            if (switchCompat != null) {
                switchCompat.mo1851d();
            }
        }

        /* renamed from: b */
        public final void mo1910b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f1372a.get();
            if (switchCompat != null) {
                switchCompat.mo1851d();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5215a.switchStyle);
    }

    private C0414i getEmojiTextViewHelper() {
        if (this.f1344P == null) {
            this.f1344P = new C0414i(this);
        }
        return this.f1344P;
    }

    private boolean getTargetCheckedState() {
        return this.f1329A > 0.5f;
    }

    private int getThumbOffset() {
        float f;
        if (C0453r1.m1265a(this)) {
            f = 1.0f - this.f1329A;
        } else {
            f = this.f1329A;
        }
        return (int) ((f * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f1352g;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f1346R;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f1347b;
        if (drawable2 != null) {
            rect = C0418j0.m1108b(drawable2);
        } else {
            rect = C0418j0.f1527c;
        }
        return ((((this.f1330B - this.f1332D) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f1363r = charSequence;
        C0414i emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod e = emojiTextViewHelper.f1518b.f5314a.mo5786e(this.f1342N);
        if (e != null) {
            charSequence = e.getTransformation(charSequence, this);
        }
        this.f1364s = charSequence;
        this.f1341M = null;
        if (this.f1365t) {
            mo1855e();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f1361p = charSequence;
        C0414i emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod e = emojiTextViewHelper.f1518b.f5314a.mo5786e(this.f1342N);
        if (e != null) {
            charSequence = e.getTransformation(charSequence, this);
        }
        this.f1362q = charSequence;
        this.f1340L = null;
        if (this.f1365t) {
            mo1855e();
        }
    }

    /* renamed from: a */
    public final void mo1848a() {
        Drawable drawable = this.f1347b;
        if (drawable == null) {
            return;
        }
        if (this.f1350e || this.f1351f) {
            Drawable mutate = C5450a.m13604g(drawable).mutate();
            this.f1347b = mutate;
            if (this.f1350e) {
                C5450a.C5452b.m13617h(mutate, this.f1348c);
            }
            if (this.f1351f) {
                C5450a.C5452b.m13618i(this.f1347b, this.f1349d);
            }
            if (this.f1347b.isStateful()) {
                this.f1347b.setState(getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public final void mo1849b() {
        Drawable drawable = this.f1352g;
        if (drawable == null) {
            return;
        }
        if (this.f1355j || this.f1356k) {
            Drawable mutate = C5450a.m13604g(drawable).mutate();
            this.f1352g = mutate;
            if (this.f1355j) {
                C5450a.C5452b.m13617h(mutate, this.f1353h);
            }
            if (this.f1356k) {
                C5450a.C5452b.m13618i(this.f1352g, this.f1354i);
            }
            if (this.f1352g.isStateful()) {
                this.f1352g.setState(getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public final StaticLayout mo1850c(CharSequence charSequence) {
        int i;
        TextPaint textPaint = this.f1338J;
        if (charSequence != null) {
            i = (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i = 0;
        }
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, BitmapDescriptorFactory.HUE_RED, true);
    }

    /* renamed from: d */
    public final void mo1851d() {
        setTextOnInternal(this.f1361p);
        setTextOffInternal(this.f1363r);
        requestLayout();
    }

    public final void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f1346R;
        int i3 = this.f1333E;
        int i4 = this.f1334F;
        int i5 = this.f1335G;
        int i6 = this.f1336H;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f1347b;
        if (drawable != null) {
            rect = C0418j0.m1108b(drawable);
        } else {
            rect = C0418j0.f1527c;
        }
        Drawable drawable2 = this.f1352g;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i11 = rect2.top;
                if (i9 > i11) {
                    i = (i9 - i11) + i4;
                } else {
                    i = i4;
                }
                int i12 = rect.right;
                int i13 = rect2.right;
                if (i12 > i13) {
                    i5 -= i12 - i13;
                }
                int i14 = rect.bottom;
                int i15 = rect2.bottom;
                if (i14 > i15) {
                    i2 = i6 - (i14 - i15);
                    this.f1352g.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1352g.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1347b;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i16 = thumbOffset - rect2.left;
            int i17 = thumbOffset + this.f1332D + rect2.right;
            this.f1347b.setBounds(i16, i4, i17, i6);
            Drawable background = getBackground();
            if (background != null) {
                C5450a.C5452b.m13615f(background, i16, i4, i17, i6);
            }
        }
        super.draw(canvas);
    }

    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f1347b;
        if (drawable != null) {
            C5450a.C5452b.m13614e(drawable, f, f2);
        }
        Drawable drawable2 = this.f1352g;
        if (drawable2 != null) {
            C5450a.C5452b.m13614e(drawable2, f, f2);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1347b;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1352g;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void mo1855e() {
        boolean z;
        if (this.f1345Q == null && this.f1344P.f1518b.f5314a.mo5783b()) {
            if (C0836f.f3491j != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C0836f a = C0836f.m2528a();
                int b = a.mo3619b();
                if (b == 3 || b == 0) {
                    C0372c cVar = new C0372c(this);
                    this.f1345Q = cVar;
                    a.mo3624g(cVar);
                }
            }
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C0453r1.m1265a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1330B;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.f1359n;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0453r1.m1265a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1330B;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.f1359n;
        }
        return compoundPaddingRight;
    }

    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return C0801k.m2425g(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f1365t;
    }

    public boolean getSplitTrack() {
        return this.f1360o;
    }

    public int getSwitchMinWidth() {
        return this.f1358m;
    }

    public int getSwitchPadding() {
        return this.f1359n;
    }

    public CharSequence getTextOff() {
        return this.f1363r;
    }

    public CharSequence getTextOn() {
        return this.f1361p;
    }

    public Drawable getThumbDrawable() {
        return this.f1347b;
    }

    public final float getThumbPosition() {
        return this.f1329A;
    }

    public int getThumbTextPadding() {
        return this.f1357l;
    }

    public ColorStateList getThumbTintList() {
        return this.f1348c;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f1349d;
    }

    public Drawable getTrackDrawable() {
        return this.f1352g;
    }

    public ColorStateList getTrackTintList() {
        return this.f1353h;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f1354i;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1347b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1352g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1343O;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1343O.end();
            this.f1343O = null;
        }
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f1328T);
        }
        return onCreateDrawableState;
    }

    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int i;
        super.onDraw(canvas);
        Rect rect = this.f1346R;
        Drawable drawable = this.f1352g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1334F;
        int i3 = this.f1336H;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1347b;
        if (drawable != null) {
            if (!this.f1360o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect b = C0418j0.m1108b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b.left;
                rect.right -= b.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            staticLayout = this.f1340L;
        } else {
            staticLayout = this.f1341M;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1339K;
            if (colorStateList != null) {
                this.f1338J.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1338J.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (staticLayout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (staticLayout.getHeight() / 2)));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.f1361p;
            } else {
                charSequence = this.f1363r;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f1347b != null) {
            Rect rect = this.f1346R;
            Drawable drawable = this.f1352g;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b = C0418j0.m1108b(this.f1347b);
            i5 = Math.max(0, b.left - rect.left);
            i11 = Math.max(0, b.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0453r1.m1265a(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f1330B + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f1330B) + i5 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int i12 = this.f1331C;
            int height = (((getHeight() + paddingTop) - getPaddingBottom()) / 2) - (i12 / 2);
            int i13 = height;
            i8 = i12 + height;
            i9 = i13;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.f1331C + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1331C;
        }
        this.f1333E = i7;
        this.f1334F = i9;
        this.f1336H = i8;
        this.f1335G = i6;
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f1365t) {
            if (this.f1340L == null) {
                this.f1340L = mo1850c(this.f1362q);
            }
            if (this.f1341M == null) {
                this.f1341M = mo1850c(this.f1364s);
            }
        }
        Rect rect = this.f1346R;
        Drawable drawable = this.f1347b;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1347b.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f1347b.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (this.f1365t) {
            i5 = (this.f1357l * 2) + Math.max(this.f1340L.getWidth(), this.f1341M.getWidth());
        } else {
            i5 = 0;
        }
        this.f1332D = Math.max(i5, i4);
        Drawable drawable2 = this.f1352g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.f1352g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.f1347b;
        if (drawable3 != null) {
            Rect b = C0418j0.m1108b(drawable3);
            i8 = Math.max(i8, b.left);
            i9 = Math.max(i9, b.right);
        }
        if (this.f1337I) {
            i6 = Math.max(this.f1358m, (this.f1332D * 2) + i8 + i9);
        } else {
            i6 = this.f1358m;
        }
        int max = Math.max(i7, i3);
        this.f1330B = i6;
        this.f1331C = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.f1361p;
        } else {
            charSequence = this.f1363r;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r0 != 3) goto L_0x0153;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            android.view.VelocityTracker r0 = r10.f1370y
            r0.addMovement(r11)
            int r0 = r11.getActionMasked()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0100
            r3 = 3
            r4 = 0
            r5 = 2
            if (r0 == r2) goto L_0x0093
            if (r0 == r5) goto L_0x0018
            if (r0 == r3) goto L_0x0093
            goto L_0x0153
        L_0x0018:
            int r0 = r10.f1366u
            if (r0 == r2) goto L_0x005f
            if (r0 == r5) goto L_0x0020
            goto L_0x0153
        L_0x0020:
            float r11 = r11.getX()
            int r0 = r10.getThumbScrollRange()
            float r1 = r10.f1368w
            float r1 = r11 - r1
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0033
            float r0 = (float) r0
            float r1 = r1 / r0
            goto L_0x003e
        L_0x0033:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003e
        L_0x003a:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003e:
            boolean r0 = androidx.appcompat.widget.C0453r1.m1265a(r10)
            if (r0 == 0) goto L_0x0045
            float r1 = -r1
        L_0x0045:
            float r0 = r10.f1329A
            float r1 = r1 + r0
            int r5 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x004d
            goto L_0x0055
        L_0x004d:
            int r4 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0054
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0055
        L_0x0054:
            r4 = r1
        L_0x0055:
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x005e
            r10.f1368w = r11
            r10.setThumbPosition(r4)
        L_0x005e:
            return r2
        L_0x005f:
            float r0 = r11.getX()
            float r1 = r11.getY()
            float r3 = r10.f1368w
            float r3 = r0 - r3
            float r3 = java.lang.Math.abs(r3)
            int r4 = r10.f1367v
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x0085
            float r3 = r10.f1369x
            float r3 = r1 - r3
            float r3 = java.lang.Math.abs(r3)
            int r4 = r10.f1367v
            float r4 = (float) r4
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x0153
        L_0x0085:
            r10.f1366u = r5
            android.view.ViewParent r11 = r10.getParent()
            r11.requestDisallowInterceptTouchEvent(r2)
            r10.f1368w = r0
            r10.f1369x = r1
            return r2
        L_0x0093:
            int r0 = r10.f1366u
            if (r0 != r5) goto L_0x00f8
            r10.f1366u = r1
            int r0 = r11.getAction()
            if (r0 != r2) goto L_0x00a7
            boolean r0 = r10.isEnabled()
            if (r0 == 0) goto L_0x00a7
            r0 = 1
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            boolean r5 = r10.isChecked()
            if (r0 == 0) goto L_0x00de
            android.view.VelocityTracker r0 = r10.f1370y
            r6 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r6)
            android.view.VelocityTracker r0 = r10.f1370y
            float r0 = r0.getXVelocity()
            float r6 = java.lang.Math.abs(r0)
            int r7 = r10.f1371z
            float r7 = (float) r7
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d9
            boolean r6 = androidx.appcompat.widget.C0453r1.m1265a(r10)
            if (r6 == 0) goto L_0x00d1
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d7
            goto L_0x00d5
        L_0x00d1:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d7
        L_0x00d5:
            r0 = 1
            goto L_0x00df
        L_0x00d7:
            r0 = 0
            goto L_0x00df
        L_0x00d9:
            boolean r0 = r10.getTargetCheckedState()
            goto L_0x00df
        L_0x00de:
            r0 = r5
        L_0x00df:
            if (r0 == r5) goto L_0x00e4
            r10.playSoundEffect(r1)
        L_0x00e4:
            r10.setChecked(r0)
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r11)
            r0.setAction(r3)
            super.onTouchEvent(r0)
            r0.recycle()
            super.onTouchEvent(r11)
            return r2
        L_0x00f8:
            r10.f1366u = r1
            android.view.VelocityTracker r0 = r10.f1370y
            r0.clear()
            goto L_0x0153
        L_0x0100:
            float r0 = r11.getX()
            float r3 = r11.getY()
            boolean r4 = r10.isEnabled()
            if (r4 == 0) goto L_0x0153
            android.graphics.drawable.Drawable r4 = r10.f1347b
            if (r4 != 0) goto L_0x0113
            goto L_0x014b
        L_0x0113:
            int r4 = r10.getThumbOffset()
            android.graphics.drawable.Drawable r5 = r10.f1347b
            android.graphics.Rect r6 = r10.f1346R
            r5.getPadding(r6)
            int r5 = r10.f1334F
            int r6 = r10.f1367v
            int r5 = r5 - r6
            int r7 = r10.f1333E
            int r7 = r7 + r4
            int r7 = r7 - r6
            int r4 = r10.f1332D
            int r4 = r4 + r7
            android.graphics.Rect r8 = r10.f1346R
            int r9 = r8.left
            int r4 = r4 + r9
            int r8 = r8.right
            int r4 = r4 + r8
            int r4 = r4 + r6
            int r8 = r10.f1336H
            int r8 = r8 + r6
            float r6 = (float) r7
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x014b
            float r4 = (float) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x014b
            float r4 = (float) r5
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x014b
            float r4 = (float) r8
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x014b
            r1 = 1
        L_0x014b:
            if (r1 == 0) goto L_0x0153
            r10.f1366u = r2
            r10.f1368w = r0
            r10.f1369x = r3
        L_0x0153:
            boolean r11 = super.onTouchEvent(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().mo2102c(z);
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.f1361p;
                if (obj == null) {
                    obj = getResources().getString(C5222h.abc_capital_on);
                }
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                new C6322b0(C4329e.tag_state_description, CharSequence.class).mo22469e(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj2 = this.f1363r;
            if (obj2 == null) {
                obj2 = getResources().getString(C5222h.abc_capital_off);
            }
            WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
            new C6322b0(C4329e.tag_state_description, CharSequence.class).mo22469e(this, obj2);
        }
        float f = 1.0f;
        if (getWindowToken() != null) {
            WeakHashMap<View, C6382p0> weakHashMap3 = C6333d0.f19990a;
            if (C6333d0.C6340g.m15076c(this)) {
                if (!isChecked) {
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1327S, new float[]{f});
                this.f1343O = ofFloat;
                ofFloat.setDuration(250);
                C0371b.m893a(this.f1343O, true);
                this.f1343O.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f1343O;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (!isChecked) {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        setThumbPosition(f);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(C0801k.m2426h(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().mo2103d(z);
        setTextOnInternal(this.f1361p);
        setTextOffInternal(this.f1363r);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.f1337I = z;
        invalidate();
    }

    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().mo2100a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.f1365t != z) {
            this.f1365t = z;
            requestLayout();
            if (z) {
                mo1855e();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.f1360o = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f1358m = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f1359n = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1338J.getTypeface() != null && !this.f1338J.getTypeface().equals(typeface)) || (this.f1338J.getTypeface() == null && typeface != null)) {
            this.f1338J.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f1363r;
            if (obj == null) {
                obj = getResources().getString(C5222h.abc_capital_off);
            }
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            new C6322b0(C4329e.tag_state_description, CharSequence.class).mo22469e(this, obj);
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked() && Build.VERSION.SDK_INT >= 30) {
            Object obj = this.f1361p;
            if (obj == null) {
                obj = getResources().getString(C5222h.abc_capital_on);
            }
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            new C6322b0(C4329e.tag_state_description, CharSequence.class).mo22469e(this, obj);
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1347b;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1347b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.f1329A = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C5344a.m13397a(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f1357l = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1348c = colorStateList;
        this.f1350e = true;
        mo1848a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f1349d = mode;
        this.f1351f = true;
        mo1848a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1352g;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1352g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C5344a.m13397a(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1353h = colorStateList;
        this.f1355j = true;
        mo1849b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f1354i = mode;
        this.f1356k = true;
        mo1849b();
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1347b || drawable == this.f1352g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0115, code lost:
        r8 = p090g1.C4732a.getColorStateList(r13, (r8 = r5.getResourceId(r7, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchCompat(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            r12 = this;
            r12.<init>(r13, r14, r15)
            r0 = 0
            r12.f1348c = r0
            r12.f1349d = r0
            r1 = 0
            r12.f1350e = r1
            r12.f1351f = r1
            r12.f1353h = r0
            r12.f1354i = r0
            r12.f1355j = r1
            r12.f1356k = r1
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r12.f1370y = r2
            r2 = 1
            r12.f1337I = r2
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r12.f1346R = r3
            android.content.Context r3 = r12.getContext()
            androidx.appcompat.widget.C0391c1.m972a(r3, r12)
            android.text.TextPaint r3 = new android.text.TextPaint
            r3.<init>(r2)
            r12.f1338J = r3
            android.content.res.Resources r4 = r12.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r3.density = r4
            int[] r7 = p114i.C5224j.SwitchCompat
            androidx.appcompat.widget.h1 r4 = new androidx.appcompat.widget.h1
            android.content.res.TypedArray r9 = r13.obtainStyledAttributes(r14, r7, r15, r1)
            r4.<init>(r13, r9)
            r11 = 0
            r5 = r12
            r6 = r13
            r8 = r14
            r10 = r15
            p242s1.C6333d0.m15028p(r5, r6, r7, r8, r9, r10, r11)
            int r5 = p114i.C5224j.SwitchCompat_android_thumb
            android.graphics.drawable.Drawable r5 = r4.mo2091e(r5)
            r12.f1347b = r5
            if (r5 == 0) goto L_0x005f
            r5.setCallback(r12)
        L_0x005f:
            int r5 = p114i.C5224j.SwitchCompat_track
            android.graphics.drawable.Drawable r5 = r4.mo2091e(r5)
            r12.f1352g = r5
            if (r5 == 0) goto L_0x006c
            r5.setCallback(r12)
        L_0x006c:
            int r5 = p114i.C5224j.SwitchCompat_android_textOn
            java.lang.CharSequence r5 = r4.mo2097k(r5)
            r12.setTextOnInternal(r5)
            int r5 = p114i.C5224j.SwitchCompat_android_textOff
            java.lang.CharSequence r5 = r4.mo2097k(r5)
            r12.setTextOffInternal(r5)
            int r5 = p114i.C5224j.SwitchCompat_showText
            boolean r5 = r4.mo2087a(r5, r2)
            r12.f1365t = r5
            int r5 = p114i.C5224j.SwitchCompat_thumbTextPadding
            int r5 = r4.mo2090d(r5, r1)
            r12.f1357l = r5
            int r5 = p114i.C5224j.SwitchCompat_switchMinWidth
            int r5 = r4.mo2090d(r5, r1)
            r12.f1358m = r5
            int r5 = p114i.C5224j.SwitchCompat_switchPadding
            int r5 = r4.mo2090d(r5, r1)
            r12.f1359n = r5
            int r5 = p114i.C5224j.SwitchCompat_splitTrack
            boolean r5 = r4.mo2087a(r5, r1)
            r12.f1360o = r5
            int r5 = p114i.C5224j.SwitchCompat_thumbTint
            android.content.res.ColorStateList r5 = r4.mo2088b(r5)
            if (r5 == 0) goto L_0x00b2
            r12.f1348c = r5
            r12.f1350e = r2
        L_0x00b2:
            int r5 = p114i.C5224j.SwitchCompat_thumbTintMode
            r6 = -1
            int r5 = r4.mo2094h(r5, r6)
            android.graphics.PorterDuff$Mode r5 = androidx.appcompat.widget.C0418j0.m1109c(r5, r0)
            android.graphics.PorterDuff$Mode r7 = r12.f1349d
            if (r7 == r5) goto L_0x00c5
            r12.f1349d = r5
            r12.f1351f = r2
        L_0x00c5:
            boolean r5 = r12.f1350e
            if (r5 != 0) goto L_0x00cd
            boolean r5 = r12.f1351f
            if (r5 == 0) goto L_0x00d0
        L_0x00cd:
            r12.mo1848a()
        L_0x00d0:
            int r5 = p114i.C5224j.SwitchCompat_trackTint
            android.content.res.ColorStateList r5 = r4.mo2088b(r5)
            if (r5 == 0) goto L_0x00dc
            r12.f1353h = r5
            r12.f1355j = r2
        L_0x00dc:
            int r5 = p114i.C5224j.SwitchCompat_trackTintMode
            int r5 = r4.mo2094h(r5, r6)
            android.graphics.PorterDuff$Mode r5 = androidx.appcompat.widget.C0418j0.m1109c(r5, r0)
            android.graphics.PorterDuff$Mode r7 = r12.f1354i
            if (r7 == r5) goto L_0x00ee
            r12.f1354i = r5
            r12.f1356k = r2
        L_0x00ee:
            boolean r5 = r12.f1355j
            if (r5 != 0) goto L_0x00f6
            boolean r5 = r12.f1356k
            if (r5 == 0) goto L_0x00f9
        L_0x00f6:
            r12.mo1849b()
        L_0x00f9:
            int r5 = p114i.C5224j.SwitchCompat_switchTextAppearance
            int r5 = r4.mo2095i(r5, r1)
            if (r5 == 0) goto L_0x01ba
            int[] r7 = p114i.C5224j.TextAppearance
            android.content.res.TypedArray r5 = r13.obtainStyledAttributes(r5, r7)
            int r7 = p114i.C5224j.TextAppearance_android_textColor
            boolean r8 = r5.hasValue(r7)
            if (r8 == 0) goto L_0x011c
            int r8 = r5.getResourceId(r7, r1)
            if (r8 == 0) goto L_0x011c
            android.content.res.ColorStateList r8 = p090g1.C4732a.getColorStateList(r13, r8)
            if (r8 == 0) goto L_0x011c
            goto L_0x0120
        L_0x011c:
            android.content.res.ColorStateList r8 = r5.getColorStateList(r7)
        L_0x0120:
            if (r8 == 0) goto L_0x0125
            r12.f1339K = r8
            goto L_0x012b
        L_0x0125:
            android.content.res.ColorStateList r7 = r12.getTextColors()
            r12.f1339K = r7
        L_0x012b:
            int r7 = p114i.C5224j.TextAppearance_android_textSize
            int r7 = r5.getDimensionPixelSize(r7, r1)
            if (r7 == 0) goto L_0x0142
            float r7 = (float) r7
            float r8 = r3.getTextSize()
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x0142
            r3.setTextSize(r7)
            r12.requestLayout()
        L_0x0142:
            int r7 = p114i.C5224j.TextAppearance_android_typeface
            int r7 = r5.getInt(r7, r6)
            int r8 = p114i.C5224j.TextAppearance_android_textStyle
            int r6 = r5.getInt(r8, r6)
            r8 = 2
            if (r7 == r2) goto L_0x015e
            if (r7 == r8) goto L_0x015b
            r9 = 3
            if (r7 == r9) goto L_0x0158
            r7 = r0
            goto L_0x0160
        L_0x0158:
            android.graphics.Typeface r7 = android.graphics.Typeface.MONOSPACE
            goto L_0x0160
        L_0x015b:
            android.graphics.Typeface r7 = android.graphics.Typeface.SERIF
            goto L_0x0160
        L_0x015e:
            android.graphics.Typeface r7 = android.graphics.Typeface.SANS_SERIF
        L_0x0160:
            r9 = 0
            if (r6 <= 0) goto L_0x018e
            if (r7 != 0) goto L_0x016a
            android.graphics.Typeface r7 = android.graphics.Typeface.defaultFromStyle(r6)
            goto L_0x016e
        L_0x016a:
            android.graphics.Typeface r7 = android.graphics.Typeface.create(r7, r6)
        L_0x016e:
            r12.setSwitchTypeface(r7)
            if (r7 == 0) goto L_0x0178
            int r7 = r7.getStyle()
            goto L_0x0179
        L_0x0178:
            r7 = 0
        L_0x0179:
            int r7 = ~r7
            r6 = r6 & r7
            r7 = r6 & 1
            if (r7 == 0) goto L_0x0180
            goto L_0x0181
        L_0x0180:
            r2 = 0
        L_0x0181:
            r3.setFakeBoldText(r2)
            r2 = r6 & 2
            if (r2 == 0) goto L_0x018a
            r9 = -1098907648(0xffffffffbe800000, float:-0.25)
        L_0x018a:
            r3.setTextSkewX(r9)
            goto L_0x0197
        L_0x018e:
            r3.setFakeBoldText(r1)
            r3.setTextSkewX(r9)
            r12.setSwitchTypeface(r7)
        L_0x0197:
            int r2 = p114i.C5224j.TextAppearance_textAllCaps
            boolean r1 = r5.getBoolean(r2, r1)
            if (r1 == 0) goto L_0x01ab
            m.a r0 = new m.a
            android.content.Context r1 = r12.getContext()
            r0.<init>(r1)
            r12.f1342N = r0
            goto L_0x01ad
        L_0x01ab:
            r12.f1342N = r0
        L_0x01ad:
            java.lang.CharSequence r0 = r12.f1361p
            r12.setTextOnInternal(r0)
            java.lang.CharSequence r0 = r12.f1363r
            r12.setTextOffInternal(r0)
            r5.recycle()
        L_0x01ba:
            androidx.appcompat.widget.w r0 = new androidx.appcompat.widget.w
            r0.<init>(r12)
            r0.mo2191f(r14, r15)
            r4.mo2099n()
            android.view.ViewConfiguration r13 = android.view.ViewConfiguration.get(r13)
            int r0 = r13.getScaledTouchSlop()
            r12.f1367v = r0
            int r13 = r13.getScaledMinimumFlingVelocity()
            r12.f1371z = r13
            androidx.appcompat.widget.i r13 = r12.getEmojiTextViewHelper()
            r13.mo2101b(r14, r15)
            r12.refreshDrawableState()
            boolean r13 = r12.isChecked()
            r12.setChecked(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
