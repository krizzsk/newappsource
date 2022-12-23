package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import ce0.C21100e;
import ci0.C21211f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.chip.C13945a;
import com.google.android.material.internal.C14051e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import p090g1.C4732a;
import p127j.C5344a;
import p141k1.C5450a;
import p141k1.C5456d;
import p216q1.C6131a;
import p242s1.C6315a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p255t1.C6531g;
import p306x1.C7141a;
import p355ac.C13401b;
import p355ac.C13405f;
import p355ac.C13409j;
import p355ac.C13410k;
import p380bc.C13583g;
import p742qc.C19100d;
import p763rc.C19252b;
import p811tc.C19654k;
import p811tc.C19666o;

public class Chip extends AppCompatCheckBox implements C13945a.C13946a, C19666o, C14051e<Chip> {

    /* renamed from: A */
    public static final int[] f34503A = {16842913};

    /* renamed from: B */
    public static final int[] f34504B = {16842911};

    /* renamed from: y */
    public static final int f34505y = C13410k.Widget_MaterialComponents_Chip_Action;

    /* renamed from: z */
    public static final Rect f34506z = new Rect();

    /* renamed from: f */
    public C13945a f34507f;

    /* renamed from: g */
    public InsetDrawable f34508g;

    /* renamed from: h */
    public RippleDrawable f34509h;

    /* renamed from: i */
    public View.OnClickListener f34510i;

    /* renamed from: j */
    public CompoundButton.OnCheckedChangeListener f34511j;

    /* renamed from: k */
    public C14051e.C14052a<Chip> f34512k;

    /* renamed from: l */
    public boolean f34513l;

    /* renamed from: m */
    public boolean f34514m;

    /* renamed from: n */
    public boolean f34515n;

    /* renamed from: o */
    public boolean f34516o;

    /* renamed from: p */
    public boolean f34517p;

    /* renamed from: q */
    public int f34518q;

    /* renamed from: r */
    public int f34519r;

    /* renamed from: s */
    public CharSequence f34520s;

    /* renamed from: t */
    public final C13939c f34521t;

    /* renamed from: u */
    public boolean f34522u;

    /* renamed from: v */
    public final Rect f34523v;

    /* renamed from: w */
    public final RectF f34524w;

    /* renamed from: x */
    public final C13937a f34525x;

    /* renamed from: com.google.android.material.chip.Chip$a */
    public class C13937a extends C21211f {
        public C13937a() {
        }

        /* renamed from: s */
        public final void mo41361s(int i) {
        }

        /* renamed from: t */
        public final void mo41362t(Typeface typeface, boolean z) {
            CharSequence charSequence;
            Chip chip = Chip.this;
            C13945a aVar = chip.f34507f;
            if (aVar.f34579S0) {
                charSequence = aVar.f34554G;
            } else {
                charSequence = chip.getText();
            }
            chip.setText(charSequence);
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    public class C13938b implements CompoundButton.OnCheckedChangeListener {
        public C13938b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
            if (r1.f34977a.mo41853a(r0) != false) goto L_0x0020;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
            if (r2.mo41857e(r0, r2.f34982e) != false) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onCheckedChanged(android.widget.CompoundButton r5, boolean r6) {
            /*
                r4 = this;
                com.google.android.material.chip.Chip r0 = com.google.android.material.chip.Chip.this
                com.google.android.material.internal.e$a<com.google.android.material.chip.Chip> r1 = r0.f34512k
                if (r1 == 0) goto L_0x0025
                com.google.android.material.internal.a r1 = (com.google.android.material.internal.C14044a) r1
                r1.getClass()
                if (r6 == 0) goto L_0x0016
                com.google.android.material.internal.b r2 = r1.f34977a
                boolean r0 = r2.mo41853a(r0)
                if (r0 == 0) goto L_0x0025
                goto L_0x0020
            L_0x0016:
                com.google.android.material.internal.b r2 = r1.f34977a
                boolean r3 = r2.f34982e
                boolean r0 = r2.mo41857e(r0, r3)
                if (r0 == 0) goto L_0x0025
            L_0x0020:
                com.google.android.material.internal.b r0 = r1.f34977a
                r0.mo41856d()
            L_0x0025:
                com.google.android.material.chip.Chip r0 = com.google.android.material.chip.Chip.this
                android.widget.CompoundButton$OnCheckedChangeListener r0 = r0.f34511j
                if (r0 == 0) goto L_0x002e
                r0.onCheckedChanged(r5, r6)
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.C13938b.onCheckedChanged(android.widget.CompoundButton, boolean):void");
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    public class C13939c extends C7141a {
        public C13939c(Chip chip) {
            super(chip);
        }

        /* renamed from: e */
        public final int mo23402e(float f, float f2) {
            Chip chip = Chip.this;
            int i = Chip.f34505y;
            if (!chip.mo41222e() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) {
                return 0;
            }
            return 1;
        }

        /* renamed from: f */
        public final void mo23403f(ArrayList arrayList) {
            boolean z = false;
            arrayList.add(0);
            Chip chip = Chip.this;
            int i = Chip.f34505y;
            if (chip.mo41222e()) {
                Chip chip2 = Chip.this;
                C13945a aVar = chip2.f34507f;
                if (aVar != null && aVar.f34566M) {
                    z = true;
                }
                if (z && chip2.f34510i != null) {
                    arrayList.add(1);
                }
            }
        }

        /* renamed from: j */
        public final boolean mo23407j(int i, int i2, Bundle bundle) {
            boolean z = false;
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    Chip chip = Chip.this;
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.f34510i;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    if (chip.f34522u) {
                        chip.f34521t.mo23412o(1, 1);
                    }
                }
            }
            return z;
        }

        /* renamed from: k */
        public final void mo23408k(C6531g gVar) {
            boolean z;
            C13945a aVar = Chip.this.f34507f;
            if (aVar == null || !aVar.f34578S) {
                z = false;
            } else {
                z = true;
            }
            gVar.f20334a.setCheckable(z);
            gVar.f20334a.setClickable(Chip.this.isClickable());
            gVar.mo22644i(Chip.this.getAccessibilityClassName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                gVar.mo22649n(text);
            } else {
                gVar.mo22646k(text);
            }
        }

        /* renamed from: l */
        public final void mo23409l(int i, C6531g gVar) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    gVar.mo22646k(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C13409j.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    gVar.mo22646k(context.getString(i2, objArr).trim());
                }
                gVar.mo22642h(Chip.this.getCloseIconTouchBoundsInt());
                gVar.mo22635b(C6531g.C6532a.f20339g);
                gVar.f20334a.setEnabled(Chip.this.isEnabled());
                return;
            }
            gVar.mo22646k(charSequence);
            gVar.mo22642h(Chip.f34506z);
        }

        /* renamed from: m */
        public final void mo23410m(int i, boolean z) {
            if (i == 1) {
                Chip chip = Chip.this;
                chip.f34516o = z;
                chip.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.chipStyle);
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f34524w.setEmpty();
        if (mo41222e() && this.f34510i != null) {
            C13945a aVar = this.f34507f;
            RectF rectF = this.f34524w;
            Rect bounds = aVar.getBounds();
            rectF.setEmpty();
            if (aVar.mo41422b0()) {
                float f = aVar.f34594s0 + aVar.f34593r0 + aVar.f34574Q + aVar.f34592q0 + aVar.f34591p0;
                if (C5450a.m13599b(aVar) == 0) {
                    float f2 = (float) bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = (float) bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return this.f34524w;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f34523v.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f34523v;
    }

    private C19100d getTextAppearance() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34602z0.f35102f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f34515n != z) {
            this.f34515n = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f34514m != z) {
            this.f34514m = z;
            refreshDrawableState();
        }
    }

    /* renamed from: a */
    public final void mo41218a() {
        mo41219d(this.f34519r);
        requestLayout();
        invalidateOutline();
    }

    /* renamed from: d */
    public final void mo41219d(int i) {
        int i2;
        int i3;
        this.f34519r = i;
        if (!this.f34517p) {
            InsetDrawable insetDrawable = this.f34508g;
            if (insetDrawable == null) {
                mo41224g();
            } else if (insetDrawable != null) {
                this.f34508g = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                mo41224g();
            }
        } else {
            int max = Math.max(0, i - ((int) this.f34507f.f34544B));
            int max2 = Math.max(0, i - this.f34507f.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                if (max2 > 0) {
                    i2 = max2 / 2;
                } else {
                    i2 = 0;
                }
                if (max > 0) {
                    i3 = max / 2;
                } else {
                    i3 = 0;
                }
                if (this.f34508g != null) {
                    Rect rect = new Rect();
                    this.f34508g.getPadding(rect);
                    if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                        mo41224g();
                        return;
                    }
                }
                if (getMinHeight() != i) {
                    setMinHeight(i);
                }
                if (getMinWidth() != i) {
                    setMinWidth(i);
                }
                this.f34508g = new InsetDrawable(this.f34507f, i2, i3, i2, i3);
                mo41224g();
                return;
            }
            InsetDrawable insetDrawable2 = this.f34508g;
            if (insetDrawable2 == null) {
                mo41224g();
            } else if (insetDrawable2 != null) {
                this.f34508g = null;
                setMinWidth(0);
                setMinHeight((int) getChipMinHeight());
                mo41224g();
            }
        }
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.f34522u) {
            return super.dispatchHoverEvent(motionEvent);
        }
        if (this.f34521t.mo23401d(motionEvent) || super.dispatchHoverEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f34522u) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C13939c cVar = this.f34521t;
        cVar.getClass();
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i3 = 0;
                                while (i < repeatCount && cVar.mo23405h(i2, (Rect) null)) {
                                    i++;
                                    i3 = 1;
                                }
                                i = i3;
                                break;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i4 = cVar.f22190i;
                    if (i4 != Integer.MIN_VALUE) {
                        cVar.mo23407j(i4, 16, (Bundle) null);
                    }
                    i = 1;
                }
            } else if (keyEvent.hasNoModifiers()) {
                i = cVar.mo23405h(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                i = cVar.mo23405h(1, (Rect) null);
            }
        }
        if (i == 0 || this.f34521t.f22190i == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C13945a aVar = this.f34507f;
        boolean z = false;
        if (aVar != null && C13945a.m34774C(aVar.f34568N)) {
            C13945a aVar2 = this.f34507f;
            int isEnabled = isEnabled();
            if (this.f34516o) {
                isEnabled++;
            }
            if (this.f34515n) {
                isEnabled++;
            }
            if (this.f34514m) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f34516o) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f34515n) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f34514m) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(aVar2.f34569N0, iArr)) {
                aVar2.f34569N0 = iArr;
                if (aVar2.mo41422b0()) {
                    z = aVar2.mo41399E(aVar2.getState(), iArr);
                }
            }
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final boolean mo41222e() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            Drawable drawable = aVar.f34568N;
            if (drawable == null) {
                drawable = null;
            } else if (drawable instanceof C5456d) {
                drawable = ((C5456d) drawable).mo21301a();
            }
            if (drawable != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final void mo41223f() {
        boolean z;
        if (mo41222e()) {
            C13945a aVar = this.f34507f;
            if (aVar == null || !aVar.f34566M) {
                z = false;
            } else {
                z = true;
            }
            if (z && this.f34510i != null) {
                C6333d0.m15029q(this, this.f34521t);
                this.f34522u = true;
                return;
            }
        }
        C6333d0.m15029q(this, (C6315a) null);
        this.f34522u = false;
    }

    /* renamed from: g */
    public final void mo41224g() {
        this.f34509h = new RippleDrawable(C19252b.m46506c(this.f34507f.f34552F), getBackgroundDrawable(), (Drawable) null);
        C13945a aVar = this.f34507f;
        if (aVar.f34571O0) {
            aVar.f34571O0 = false;
            aVar.f34573P0 = null;
            aVar.onStateChange(aVar.getState());
        }
        RippleDrawable rippleDrawable = this.f34509h;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15057q(this, rippleDrawable);
        mo41257h();
    }

    public CharSequence getAccessibilityClassName() {
        boolean z;
        if (!TextUtils.isEmpty(this.f34520s)) {
            return this.f34520s;
        }
        C13945a aVar = this.f34507f;
        if (aVar == null || !aVar.f34578S) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            ViewParent parent = getParent();
            if (!(parent instanceof ChipGroup) || !((ChipGroup) parent).f34533i.f34981d) {
                return "android.widget.CompoundButton";
            }
            return "android.widget.RadioButton";
        } else if (isClickable()) {
            return "android.widget.Button";
        } else {
            return "android.view.View";
        }
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f34508g;
        if (insetDrawable == null) {
            return this.f34507f;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34582U;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34584X;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34542A;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C13945a aVar = this.f34507f;
        return aVar != null ? Math.max(BitmapDescriptorFactory.HUE_RED, aVar.mo41397A()) : BitmapDescriptorFactory.HUE_RED;
    }

    public Drawable getChipDrawable() {
        return this.f34507f;
    }

    public float getChipEndPadding() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34594s0;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        C13945a aVar = this.f34507f;
        if (aVar == null || (drawable = aVar.f34558I) == null) {
            return null;
        }
        if (drawable instanceof C5456d) {
            drawable = ((C5456d) drawable).mo21301a();
        }
        return drawable;
    }

    public float getChipIconSize() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34562K;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getChipIconTint() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34560J;
        }
        return null;
    }

    public float getChipMinHeight() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34544B;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public float getChipStartPadding() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34587l0;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getChipStrokeColor() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34548D;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34550E;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        C13945a aVar = this.f34507f;
        if (aVar == null || (drawable = aVar.f34568N) == null) {
            return null;
        }
        if (drawable instanceof C5456d) {
            drawable = ((C5456d) drawable).mo21301a();
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34576R;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34593r0;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public float getCloseIconSize() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34574Q;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public float getCloseIconStartPadding() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34592q0;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getCloseIconTint() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34572P;
        }
        return null;
    }

    public TextUtils.TruncateAt getEllipsize() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34577R0;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        if (this.f34522u) {
            C13939c cVar = this.f34521t;
            if (cVar.f22190i == 1 || cVar.f22189h == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C13583g getHideMotionSpec() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34586Z;
        }
        return null;
    }

    public float getIconEndPadding() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34589n0;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public float getIconStartPadding() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34588m0;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getRippleColor() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34552F;
        }
        return null;
    }

    public C19654k getShapeAppearanceModel() {
        return this.f34507f.f49837b.f49861a;
    }

    public C13583g getShowMotionSpec() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34585Y;
        }
        return null;
    }

    public float getTextEndPadding() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34591p0;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public float getTextStartPadding() {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            return aVar.f34590o0;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: h */
    public final void mo41257h() {
        C13945a aVar;
        if (!TextUtils.isEmpty(getText()) && (aVar = this.f34507f) != null) {
            int z = (int) (aVar.mo41444z() + aVar.f34594s0 + aVar.f34591p0);
            C13945a aVar2 = this.f34507f;
            int y = (int) (aVar2.mo41443y() + aVar2.f34587l0 + aVar2.f34590o0);
            if (this.f34508g != null) {
                Rect rect = new Rect();
                this.f34508g.getPadding(rect);
                y += rect.left;
                z += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6338e.m15070k(this, y, paddingTop, z, paddingBottom);
        }
    }

    /* renamed from: i */
    public final void mo41258i() {
        TextPaint paint = getPaint();
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C19100d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo51531e(getContext(), paint, this.f34525x);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C21100e.m49299B0(this, this.f34507f);
    }

    public final int[] onCreateDrawableState(int i) {
        boolean z;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f34503A);
        }
        C13945a aVar = this.f34507f;
        if (aVar == null || !aVar.f34578S) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            View.mergeDrawableStates(onCreateDrawableState, f34504B);
        }
        return onCreateDrawableState;
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.f34522u) {
            C13939c cVar = this.f34521t;
            int i2 = cVar.f22190i;
            if (i2 != Integer.MIN_VALUE) {
                cVar.mo23398a(i2);
            }
            if (z) {
                cVar.mo23405h(i, rect);
            }
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        C13945a aVar = this.f34507f;
        int i2 = 0;
        if (aVar == null || !aVar.f34578S) {
            z = false;
        } else {
            z = true;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            int i3 = -1;
            if (chipGroup.f34934d) {
                i = 0;
                while (true) {
                    if (i2 >= chipGroup.getChildCount()) {
                        break;
                    }
                    if (chipGroup.getChildAt(i2) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i2)) == this) {
                            break;
                        }
                        i++;
                    }
                    i2++;
                }
            }
            i = -1;
            Object tag = getTag(C13405f.row_index_key);
            if (tag instanceof Integer) {
                i3 = ((Integer) tag).intValue();
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) C6531g.C6534c.m15467a(i3, 1, i, 1, isChecked()).f20353a);
        }
    }

    @TargetApi(24)
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f34518q != i) {
            this.f34518q = i;
            mo41257h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0059 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0049
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0044
            goto L_0x0050
        L_0x0021:
            boolean r0 = r5.f34514m
            if (r0 == 0) goto L_0x0050
            if (r1 != 0) goto L_0x004e
            r5.setCloseIconPressed(r2)
            goto L_0x004e
        L_0x002b:
            boolean r0 = r5.f34514m
            if (r0 == 0) goto L_0x0044
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.f34510i
            if (r0 == 0) goto L_0x0039
            r0.onClick(r5)
        L_0x0039:
            boolean r0 = r5.f34522u
            if (r0 == 0) goto L_0x0042
            com.google.android.material.chip.Chip$c r0 = r5.f34521t
            r0.mo23412o(r3, r3)
        L_0x0042:
            r0 = 1
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            r5.setCloseIconPressed(r2)
            goto L_0x0051
        L_0x0049:
            if (r1 == 0) goto L_0x0050
            r5.setCloseIconPressed(r3)
        L_0x004e:
            r0 = 1
            goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            if (r0 != 0) goto L_0x0059
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x005a
        L_0x0059:
            r2 = 1
        L_0x005a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f34520s = charSequence;
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f34509h) {
            super.setBackground(drawable);
        }
    }

    public void setBackgroundColor(int i) {
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f34509h) {
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundResource(int i) {
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41400F(z);
        }
    }

    public void setCheckableResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41400F(aVar.f34595t0.getResources().getBoolean(i));
        }
    }

    public void setChecked(boolean z) {
        C13945a aVar = this.f34507f;
        if (aVar == null) {
            this.f34513l = z;
        } else if (aVar.f34578S) {
            super.setChecked(z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41401G(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41401G(C5344a.m13397a(aVar.f34595t0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41402H(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41402H(C4732a.getColorStateList(aVar.f34595t0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41403I(aVar.f34595t0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C13945a aVar = this.f34507f;
        if (aVar != null && aVar.f34542A != colorStateList) {
            aVar.f34542A = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateList;
        C13945a aVar = this.f34507f;
        if (aVar != null && aVar.f34542A != (colorStateList = C4732a.getColorStateList(aVar.f34595t0, i))) {
            aVar.f34542A = colorStateList;
            aVar.onStateChange(aVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41404J(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41404J(aVar.f34595t0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C13945a aVar) {
        C13945a aVar2 = this.f34507f;
        if (aVar2 != aVar) {
            if (aVar2 != null) {
                aVar2.f34575Q0 = new WeakReference<>((Object) null);
            }
            this.f34507f = aVar;
            aVar.f34579S0 = false;
            aVar.f34575Q0 = new WeakReference<>(this);
            mo41219d(this.f34519r);
        }
    }

    public void setChipEndPadding(float f) {
        C13945a aVar = this.f34507f;
        if (aVar != null && aVar.f34594s0 != f) {
            aVar.f34594s0 = f;
            aVar.invalidateSelf();
            aVar.mo41398D();
        }
    }

    public void setChipEndPaddingResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            float dimension = aVar.f34595t0.getResources().getDimension(i);
            if (aVar.f34594s0 != dimension) {
                aVar.f34594s0 = dimension;
                aVar.invalidateSelf();
                aVar.mo41398D();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41405K(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41405K(C5344a.m13397a(aVar.f34595t0, i));
        }
    }

    public void setChipIconSize(float f) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41406L(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41406L(aVar.f34595t0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41407M(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41407M(C4732a.getColorStateList(aVar.f34595t0, i));
        }
    }

    public void setChipIconVisible(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41408N(aVar.f34595t0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        C13945a aVar = this.f34507f;
        if (aVar != null && aVar.f34544B != f) {
            aVar.f34544B = f;
            aVar.invalidateSelf();
            aVar.mo41398D();
        }
    }

    public void setChipMinHeightResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            float dimension = aVar.f34595t0.getResources().getDimension(i);
            if (aVar.f34544B != dimension) {
                aVar.f34544B = dimension;
                aVar.invalidateSelf();
                aVar.mo41398D();
            }
        }
    }

    public void setChipStartPadding(float f) {
        C13945a aVar = this.f34507f;
        if (aVar != null && aVar.f34587l0 != f) {
            aVar.f34587l0 = f;
            aVar.invalidateSelf();
            aVar.mo41398D();
        }
    }

    public void setChipStartPaddingResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            float dimension = aVar.f34595t0.getResources().getDimension(i);
            if (aVar.f34587l0 != dimension) {
                aVar.f34587l0 = dimension;
                aVar.invalidateSelf();
                aVar.mo41398D();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41409O(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41409O(C4732a.getColorStateList(aVar.f34595t0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41410P(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41410P(aVar.f34595t0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41411Q(drawable);
        }
        mo41223f();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C13945a aVar = this.f34507f;
        if (aVar != null && aVar.f34576R != charSequence) {
            C6131a c = C6131a.m14691c();
            aVar.f34576R = c.mo22099d(charSequence, c.f19491c);
            aVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41412R(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41412R(aVar.f34595t0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41411Q(C5344a.m13397a(aVar.f34595t0, i));
        }
        mo41223f();
    }

    public void setCloseIconSize(float f) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41413S(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41413S(aVar.f34595t0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41414T(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41414T(aVar.f34595t0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41415U(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41415U(C4732a.getColorStateList(aVar.f34595t0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo52003m(f);
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f34507f != null) {
            if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C13945a aVar = this.f34507f;
                if (aVar != null) {
                    aVar.f34577R0 = truncateAt;
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f34517p = z;
        mo41219d(this.f34519r);
    }

    public void setGravity(int i) {
        if (i == 8388627) {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C13583g gVar) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.f34586Z = gVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.f34586Z = C13583g.m33997b(i, aVar.f34595t0);
        }
    }

    public void setIconEndPadding(float f) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41417W(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41417W(aVar.f34595t0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41418X(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41418X(aVar.f34595t0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(C14051e.C14052a<Chip> aVar) {
        this.f34512k = aVar;
    }

    public void setLayoutDirection(int i) {
        if (this.f34507f != null) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.f34581T0 = i;
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f34511j = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f34510i = onClickListener;
        mo41223f();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41419Y(colorStateList);
        }
        if (!this.f34507f.f34571O0) {
            mo41224g();
        }
    }

    public void setRippleColorResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41419Y(C4732a.getColorStateList(aVar.f34595t0, i));
            if (!this.f34507f.f34571O0) {
                mo41224g();
            }
        }
    }

    public void setShapeAppearanceModel(C19654k kVar) {
        this.f34507f.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C13583g gVar) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.f34585Y = gVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.f34585Y = C13583g.m33997b(i, aVar.f34595t0);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (aVar.f34579S0) {
                charSequence2 = null;
            } else {
                charSequence2 = charSequence;
            }
            super.setText(charSequence2, bufferType);
            C13945a aVar2 = this.f34507f;
            if (aVar2 != null && !TextUtils.equals(aVar2.f34554G, charSequence)) {
                aVar2.f34554G = charSequence;
                aVar2.f34602z0.f35100d = true;
                aVar2.invalidateSelf();
                aVar2.mo41398D();
            }
        }
    }

    public void setTextAppearance(C19100d dVar) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.f34602z0.mo41883b(dVar, aVar.f34595t0);
        }
        mo41258i();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C13945a aVar = this.f34507f;
        if (aVar != null && aVar.f34591p0 != f) {
            aVar.f34591p0 = f;
            aVar.invalidateSelf();
            aVar.mo41398D();
        }
    }

    public void setTextEndPaddingResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            float dimension = aVar.f34595t0.getResources().getDimension(i);
            if (aVar.f34591p0 != dimension) {
                aVar.f34591p0 = dimension;
                aVar.invalidateSelf();
                aVar.mo41398D();
            }
        }
    }

    public void setTextStartPadding(float f) {
        C13945a aVar = this.f34507f;
        if (aVar != null && aVar.f34590o0 != f) {
            aVar.f34590o0 = f;
            aVar.invalidateSelf();
            aVar.mo41398D();
        }
    }

    public void setTextStartPaddingResource(int i) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            float dimension = aVar.f34595t0.getResources().getDimension(i);
            if (aVar.f34590o0 != dimension) {
                aVar.f34590o0 = dimension;
                aVar.invalidateSelf();
                aVar.mo41398D();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Chip(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r7 = r19
            r8 = r20
            int r9 = f34505y
            r1 = r18
            android.content.Context r1 = p883wc.C20289a.m47861a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f34523v = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f34524w = r1
            com.google.android.material.chip.Chip$a r1 = new com.google.android.material.chip.Chip$a
            r1.<init>()
            r0.f34525x = r1
            android.content.Context r10 = r17.getContext()
            r11 = 8388627(0x800013, float:1.175497E-38)
            r12 = 1
            if (r7 != 0) goto L_0x0031
            goto L_0x007f
        L_0x0031:
            java.lang.String r1 = "http://schemas.android.com/apk/res/android"
            java.lang.String r2 = "background"
            r7.getAttributeValue(r1, r2)
            java.lang.String r2 = "drawableLeft"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03c4
            java.lang.String r2 = "drawableStart"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03bc
            java.lang.String r2 = "drawableEnd"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            java.lang.String r3 = "Please set end drawable using R.attr#closeIcon."
            if (r2 != 0) goto L_0x03b6
            java.lang.String r2 = "drawableRight"
            java.lang.String r2 = r7.getAttributeValue(r1, r2)
            if (r2 != 0) goto L_0x03b0
            java.lang.String r2 = "singleLine"
            boolean r2 = r7.getAttributeBooleanValue(r1, r2, r12)
            if (r2 == 0) goto L_0x03a8
            java.lang.String r2 = "lines"
            int r2 = r7.getAttributeIntValue(r1, r2, r12)
            if (r2 != r12) goto L_0x03a8
            java.lang.String r2 = "minLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r12)
            if (r2 != r12) goto L_0x03a8
            java.lang.String r2 = "maxLines"
            int r2 = r7.getAttributeIntValue(r1, r2, r12)
            if (r2 != r12) goto L_0x03a8
            java.lang.String r2 = "gravity"
            r7.getAttributeIntValue(r1, r2, r11)
        L_0x007f:
            com.google.android.material.chip.a r13 = new com.google.android.material.chip.a
            r13.<init>(r10, r7, r8)
            android.content.Context r1 = r13.f34595t0
            int[] r14 = p355ac.C13411l.Chip
            r15 = 0
            int[] r6 = new int[r15]
            r2 = r19
            r3 = r14
            r4 = r20
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.C14077m.m35060d(r1, r2, r3, r4, r5, r6)
            int r6 = p355ac.C13411l.Chip_shapeAppearance
            boolean r2 = r1.hasValue(r6)
            r13.f34583U0 = r2
            android.content.Context r2 = r13.f34595t0
            int r3 = p355ac.C13411l.Chip_chipSurfaceColor
            android.content.res.ColorStateList r2 = p742qc.C19099c.m46247a(r2, r1, r3)
            android.content.res.ColorStateList r3 = r13.f34601z
            if (r3 == r2) goto L_0x00b2
            r13.f34601z = r2
            int[] r2 = r13.getState()
            r13.onStateChange(r2)
        L_0x00b2:
            android.content.Context r2 = r13.f34595t0
            int r3 = p355ac.C13411l.Chip_chipBackgroundColor
            android.content.res.ColorStateList r2 = p742qc.C19099c.m46247a(r2, r1, r3)
            android.content.res.ColorStateList r3 = r13.f34542A
            if (r3 == r2) goto L_0x00c7
            r13.f34542A = r2
            int[] r2 = r13.getState()
            r13.onStateChange(r2)
        L_0x00c7:
            int r2 = p355ac.C13411l.Chip_chipMinHeight
            r3 = 0
            float r2 = r1.getDimension(r2, r3)
            float r4 = r13.f34544B
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00dc
            r13.f34544B = r2
            r13.invalidateSelf()
            r13.mo41398D()
        L_0x00dc:
            int r2 = p355ac.C13411l.Chip_chipCornerRadius
            boolean r4 = r1.hasValue(r2)
            if (r4 == 0) goto L_0x00eb
            float r2 = r1.getDimension(r2, r3)
            r13.mo41404J(r2)
        L_0x00eb:
            android.content.Context r2 = r13.f34595t0
            int r4 = p355ac.C13411l.Chip_chipStrokeColor
            android.content.res.ColorStateList r2 = p742qc.C19099c.m46247a(r2, r1, r4)
            r13.mo41409O(r2)
            int r2 = p355ac.C13411l.Chip_chipStrokeWidth
            float r2 = r1.getDimension(r2, r3)
            r13.mo41410P(r2)
            android.content.Context r2 = r13.f34595t0
            int r4 = p355ac.C13411l.Chip_rippleColor
            android.content.res.ColorStateList r2 = p742qc.C19099c.m46247a(r2, r1, r4)
            r13.mo41419Y(r2)
            int r2 = p355ac.C13411l.Chip_android_text
            java.lang.CharSequence r2 = r1.getText(r2)
            if (r2 != 0) goto L_0x0114
            java.lang.String r2 = ""
        L_0x0114:
            java.lang.CharSequence r4 = r13.f34554G
            boolean r4 = android.text.TextUtils.equals(r4, r2)
            if (r4 != 0) goto L_0x0128
            r13.f34554G = r2
            com.google.android.material.internal.j r2 = r13.f34602z0
            r2.f35100d = r12
            r13.invalidateSelf()
            r13.mo41398D()
        L_0x0128:
            android.content.Context r2 = r13.f34595t0
            int r4 = p355ac.C13411l.Chip_android_textAppearance
            boolean r5 = r1.hasValue(r4)
            if (r5 == 0) goto L_0x013e
            int r4 = r1.getResourceId(r4, r15)
            if (r4 == 0) goto L_0x013e
            qc.d r5 = new qc.d
            r5.<init>(r2, r4)
            goto L_0x013f
        L_0x013e:
            r5 = 0
        L_0x013f:
            int r2 = p355ac.C13411l.Chip_android_textSize
            float r4 = r5.f48552k
            float r2 = r1.getDimension(r2, r4)
            r5.f48552k = r2
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r4 >= r2) goto L_0x0159
            android.content.Context r2 = r13.f34595t0
            int r11 = p355ac.C13411l.Chip_android_textColor
            android.content.res.ColorStateList r2 = p742qc.C19099c.m46247a(r2, r1, r11)
            r5.f48551j = r2
        L_0x0159:
            com.google.android.material.internal.j r2 = r13.f34602z0
            android.content.Context r11 = r13.f34595t0
            r2.mo41883b(r5, r11)
            int r2 = p355ac.C13411l.Chip_android_ellipsize
            int r2 = r1.getInt(r2, r15)
            if (r2 == r12) goto L_0x0179
            r5 = 2
            if (r2 == r5) goto L_0x0174
            r5 = 3
            if (r2 == r5) goto L_0x016f
            goto L_0x017d
        L_0x016f:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r13.f34577R0 = r2
            goto L_0x017d
        L_0x0174:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.MIDDLE
            r13.f34577R0 = r2
            goto L_0x017d
        L_0x0179:
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.START
            r13.f34577R0 = r2
        L_0x017d:
            int r2 = p355ac.C13411l.Chip_chipIconVisible
            boolean r2 = r1.getBoolean(r2, r15)
            r13.mo41408N(r2)
            java.lang.String r2 = "http://schemas.android.com/apk/res-auto"
            if (r7 == 0) goto L_0x01a3
            java.lang.String r5 = "chipIconEnabled"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 == 0) goto L_0x01a3
            java.lang.String r5 = "chipIconVisible"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 != 0) goto L_0x01a3
            int r5 = p355ac.C13411l.Chip_chipIconEnabled
            boolean r5 = r1.getBoolean(r5, r15)
            r13.mo41408N(r5)
        L_0x01a3:
            android.content.Context r5 = r13.f34595t0
            int r11 = p355ac.C13411l.Chip_chipIcon
            android.graphics.drawable.Drawable r5 = p742qc.C19099c.m46250d(r5, r1, r11)
            r13.mo41405K(r5)
            int r5 = p355ac.C13411l.Chip_chipIconTint
            boolean r11 = r1.hasValue(r5)
            if (r11 == 0) goto L_0x01bf
            android.content.Context r11 = r13.f34595t0
            android.content.res.ColorStateList r5 = p742qc.C19099c.m46247a(r11, r1, r5)
            r13.mo41407M(r5)
        L_0x01bf:
            int r5 = p355ac.C13411l.Chip_chipIconSize
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r5 = r1.getDimension(r5, r11)
            r13.mo41406L(r5)
            int r5 = p355ac.C13411l.Chip_closeIconVisible
            boolean r5 = r1.getBoolean(r5, r15)
            r13.mo41416V(r5)
            if (r7 == 0) goto L_0x01ee
            java.lang.String r5 = "closeIconEnabled"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 == 0) goto L_0x01ee
            java.lang.String r5 = "closeIconVisible"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 != 0) goto L_0x01ee
            int r5 = p355ac.C13411l.Chip_closeIconEnabled
            boolean r5 = r1.getBoolean(r5, r15)
            r13.mo41416V(r5)
        L_0x01ee:
            android.content.Context r5 = r13.f34595t0
            int r11 = p355ac.C13411l.Chip_closeIcon
            android.graphics.drawable.Drawable r5 = p742qc.C19099c.m46250d(r5, r1, r11)
            r13.mo41411Q(r5)
            android.content.Context r5 = r13.f34595t0
            int r11 = p355ac.C13411l.Chip_closeIconTint
            android.content.res.ColorStateList r5 = p742qc.C19099c.m46247a(r5, r1, r11)
            r13.mo41415U(r5)
            int r5 = p355ac.C13411l.Chip_closeIconSize
            float r5 = r1.getDimension(r5, r3)
            r13.mo41413S(r5)
            int r5 = p355ac.C13411l.Chip_android_checkable
            boolean r5 = r1.getBoolean(r5, r15)
            r13.mo41400F(r5)
            int r5 = p355ac.C13411l.Chip_checkedIconVisible
            boolean r5 = r1.getBoolean(r5, r15)
            r13.mo41403I(r5)
            if (r7 == 0) goto L_0x023a
            java.lang.String r5 = "checkedIconEnabled"
            java.lang.String r5 = r7.getAttributeValue(r2, r5)
            if (r5 == 0) goto L_0x023a
            java.lang.String r5 = "checkedIconVisible"
            java.lang.String r2 = r7.getAttributeValue(r2, r5)
            if (r2 != 0) goto L_0x023a
            int r2 = p355ac.C13411l.Chip_checkedIconEnabled
            boolean r2 = r1.getBoolean(r2, r15)
            r13.mo41403I(r2)
        L_0x023a:
            android.content.Context r2 = r13.f34595t0
            int r5 = p355ac.C13411l.Chip_checkedIcon
            android.graphics.drawable.Drawable r2 = p742qc.C19099c.m46250d(r2, r1, r5)
            r13.mo41401G(r2)
            int r2 = p355ac.C13411l.Chip_checkedIconTint
            boolean r5 = r1.hasValue(r2)
            if (r5 == 0) goto L_0x0256
            android.content.Context r5 = r13.f34595t0
            android.content.res.ColorStateList r2 = p742qc.C19099c.m46247a(r5, r1, r2)
            r13.mo41402H(r2)
        L_0x0256:
            android.content.Context r2 = r13.f34595t0
            int r5 = p355ac.C13411l.Chip_showMotionSpec
            bc.g r2 = p380bc.C13583g.m33996a(r2, r1, r5)
            r13.f34585Y = r2
            android.content.Context r2 = r13.f34595t0
            int r5 = p355ac.C13411l.Chip_hideMotionSpec
            bc.g r2 = p380bc.C13583g.m33996a(r2, r1, r5)
            r13.f34586Z = r2
            int r2 = p355ac.C13411l.Chip_chipStartPadding
            float r2 = r1.getDimension(r2, r3)
            float r5 = r13.f34587l0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x027e
            r13.f34587l0 = r2
            r13.invalidateSelf()
            r13.mo41398D()
        L_0x027e:
            int r2 = p355ac.C13411l.Chip_iconStartPadding
            float r2 = r1.getDimension(r2, r3)
            r13.mo41418X(r2)
            int r2 = p355ac.C13411l.Chip_iconEndPadding
            float r2 = r1.getDimension(r2, r3)
            r13.mo41417W(r2)
            int r2 = p355ac.C13411l.Chip_textStartPadding
            float r2 = r1.getDimension(r2, r3)
            float r5 = r13.f34590o0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x02a4
            r13.f34590o0 = r2
            r13.invalidateSelf()
            r13.mo41398D()
        L_0x02a4:
            int r2 = p355ac.C13411l.Chip_textEndPadding
            float r2 = r1.getDimension(r2, r3)
            float r5 = r13.f34591p0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x02b8
            r13.f34591p0 = r2
            r13.invalidateSelf()
            r13.mo41398D()
        L_0x02b8:
            int r2 = p355ac.C13411l.Chip_closeIconStartPadding
            float r2 = r1.getDimension(r2, r3)
            r13.mo41414T(r2)
            int r2 = p355ac.C13411l.Chip_closeIconEndPadding
            float r2 = r1.getDimension(r2, r3)
            r13.mo41412R(r2)
            int r2 = p355ac.C13411l.Chip_chipEndPadding
            float r2 = r1.getDimension(r2, r3)
            float r3 = r13.f34594s0
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 == 0) goto L_0x02de
            r13.f34594s0 = r2
            r13.invalidateSelf()
            r13.mo41398D()
        L_0x02de:
            int r2 = p355ac.C13411l.Chip_android_maxWidth
            r3 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r1.getDimensionPixelSize(r2, r3)
            r13.f34581T0 = r2
            r1.recycle()
            int[] r11 = new int[r15]
            r1 = r10
            r5 = 23
            r2 = r19
            r3 = r14
            r12 = r4
            r4 = r20
            r5 = r9
            r16 = r6
            r6 = r11
            android.content.res.TypedArray r1 = com.google.android.material.internal.C14077m.m35060d(r1, r2, r3, r4, r5, r6)
            int r2 = p355ac.C13411l.Chip_ensureMinTouchTargetSize
            boolean r2 = r1.getBoolean(r2, r15)
            r0.f34517p = r2
            android.content.Context r2 = r17.getContext()
            r3 = 48
            float r2 = com.google.android.material.internal.C14083r.m35066b(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            float r2 = (float) r2
            int r3 = p355ac.C13411l.Chip_chipMinTouchTargetSize
            float r2 = r1.getDimension(r3, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r0.f34519r = r2
            r1.recycle()
            r0.setChipDrawable(r13)
            java.util.WeakHashMap<android.view.View, s1.p0> r1 = p242s1.C6333d0.f19990a
            float r1 = p242s1.C6333d0.C6342i.m15092i(r17)
            r13.mo52003m(r1)
            int[] r6 = new int[r15]
            r1 = r10
            r2 = r19
            r3 = r14
            android.content.res.TypedArray r1 = com.google.android.material.internal.C14077m.m35060d(r1, r2, r3, r4, r5, r6)
            r2 = 23
            if (r12 >= r2) goto L_0x034b
            int r2 = p355ac.C13411l.Chip_android_textColor
            android.content.res.ColorStateList r2 = p742qc.C19099c.m46247a(r10, r1, r2)
            r0.setTextColor(r2)
        L_0x034b:
            r2 = r16
            boolean r2 = r1.hasValue(r2)
            r1.recycle()
            com.google.android.material.chip.Chip$c r1 = new com.google.android.material.chip.Chip$c
            r1.<init>(r0)
            r0.f34521t = r1
            r17.mo41223f()
            if (r2 != 0) goto L_0x0368
            gc.a r1 = new gc.a
            r1.<init>(r0)
            r0.setOutlineProvider(r1)
        L_0x0368:
            boolean r1 = r0.f34513l
            r0.setChecked(r1)
            java.lang.CharSequence r1 = r13.f34554G
            r0.setText(r1)
            android.text.TextUtils$TruncateAt r1 = r13.f34577R0
            r0.setEllipsize(r1)
            r17.mo41258i()
            com.google.android.material.chip.a r1 = r0.f34507f
            boolean r1 = r1.f34579S0
            if (r1 != 0) goto L_0x0387
            r1 = 1
            r0.setLines(r1)
            r0.setHorizontallyScrolling(r1)
        L_0x0387:
            r1 = 8388627(0x800013, float:1.175497E-38)
            r0.setGravity(r1)
            r17.mo41257h()
            boolean r1 = r0.f34517p
            if (r1 == 0) goto L_0x0399
            int r1 = r0.f34519r
            r0.setMinHeight(r1)
        L_0x0399:
            int r1 = p242s1.C6333d0.C6338e.m15063d(r17)
            r0.f34518q = r1
            com.google.android.material.chip.Chip$b r1 = new com.google.android.material.chip.Chip$b
            r1.<init>()
            super.setOnCheckedChangeListener(r1)
            return
        L_0x03a8:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Chip does not support multi-line text"
            r1.<init>(r2)
            throw r1
        L_0x03b0:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r3)
            throw r1
        L_0x03b6:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r3)
            throw r1
        L_0x03bc:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set start drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        L_0x03c4:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Please set left drawable using R.attr#chipIcon."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41416V(z);
        }
        mo41223f();
    }

    public void setCheckedIconVisible(boolean z) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41403I(z);
        }
    }

    public void setChipIconVisible(boolean z) {
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.mo41408N(z);
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.f34602z0.mo41883b(new C19100d(aVar.f34595t0, i), aVar.f34595t0);
        }
        mo41258i();
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C13945a aVar = this.f34507f;
        if (aVar != null) {
            aVar.f34602z0.mo41883b(new C19100d(aVar.f34595t0, i), aVar.f34595t0);
        }
        mo41258i();
    }
}
