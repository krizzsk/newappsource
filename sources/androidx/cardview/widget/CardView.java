package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p215q0.C6127a;
import p215q0.C6128b;
import p215q0.C6129c;
import p215q0.C6130d;
import p228r0.C6228a;
import p228r0.C6229b;
import p626lf.C18201b;

public class CardView extends FrameLayout {

    /* renamed from: g */
    public static final int[] f2285g = {16842801};

    /* renamed from: h */
    public static final C18201b f2286h = new C18201b();

    /* renamed from: b */
    public boolean f2287b;

    /* renamed from: c */
    public boolean f2288c;

    /* renamed from: d */
    public final Rect f2289d;

    /* renamed from: e */
    public final Rect f2290e;

    /* renamed from: f */
    public final C0664a f2291f;

    /* renamed from: androidx.cardview.widget.CardView$a */
    public class C0664a implements C6228a {

        /* renamed from: a */
        public Drawable f2292a;

        public C0664a() {
        }

        /* renamed from: a */
        public final void mo2676a(int i, int i2, int i3, int i4) {
            CardView.this.f2290e.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f2289d;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6127a.cardViewStyle);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C6229b) this.f2291f.f2292a).f19673h;
    }

    public float getCardElevation() {
        return CardView.this.getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f2289d.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f2289d.left;
    }

    public int getContentPaddingRight() {
        return this.f2289d.right;
    }

    public int getContentPaddingTop() {
        return this.f2289d.top;
    }

    public float getMaxCardElevation() {
        return ((C6229b) this.f2291f.f2292a).f19670e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f2288c;
    }

    public float getRadius() {
        return ((C6229b) this.f2291f.f2292a).f19666a;
    }

    public boolean getUseCompatPadding() {
        return this.f2287b;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        C0664a aVar = this.f2291f;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C6229b bVar = (C6229b) aVar.f2292a;
        bVar.mo22221b(valueOf);
        bVar.invalidateSelf();
    }

    public void setCardElevation(float f) {
        CardView.this.setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        f2286h.mo50618x(this.f2291f, f);
    }

    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f2288c) {
            this.f2288c = z;
            C18201b bVar = f2286h;
            C0664a aVar = this.f2291f;
            bVar.mo50618x(aVar, ((C6229b) aVar.f2292a).f19670e);
        }
    }

    public void setRadius(float f) {
        C6229b bVar = (C6229b) this.f2291f.f2292a;
        if (f != bVar.f19666a) {
            bVar.f19666a = f;
            bVar.mo22222c((Rect) null);
            bVar.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f2287b != z) {
            this.f2287b = z;
            C18201b bVar = f2286h;
            C0664a aVar = this.f2291f;
            bVar.mo50618x(aVar, ((C6229b) aVar.f2292a).f19670e);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ColorStateList colorStateList;
        int i2;
        Rect rect = new Rect();
        this.f2289d = rect;
        this.f2290e = new Rect();
        C0664a aVar = new C0664a();
        this.f2291f = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6130d.CardView, i, C6129c.CardView);
        int i3 = C6130d.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i3)) {
            colorStateList = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f2285g);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(C6128b.cardview_light_background);
            } else {
                i2 = getResources().getColor(C6128b.cardview_dark_background);
            }
            colorStateList = ColorStateList.valueOf(i2);
        }
        float dimension = obtainStyledAttributes.getDimension(C6130d.CardView_cardCornerRadius, BitmapDescriptorFactory.HUE_RED);
        float dimension2 = obtainStyledAttributes.getDimension(C6130d.CardView_cardElevation, BitmapDescriptorFactory.HUE_RED);
        float dimension3 = obtainStyledAttributes.getDimension(C6130d.CardView_cardMaxElevation, BitmapDescriptorFactory.HUE_RED);
        this.f2287b = obtainStyledAttributes.getBoolean(C6130d.CardView_cardUseCompatPadding, false);
        this.f2288c = obtainStyledAttributes.getBoolean(C6130d.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C6130d.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(C6130d.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(C6130d.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(C6130d.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(C6130d.CardView_contentPaddingBottom, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(C6130d.CardView_android_minWidth, 0);
        obtainStyledAttributes.getDimensionPixelSize(C6130d.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        C18201b bVar = f2286h;
        C6229b bVar2 = new C6229b(dimension, colorStateList);
        aVar.f2292a = bVar2;
        setBackgroundDrawable(bVar2);
        setClipToOutline(true);
        setElevation(dimension2);
        bVar.mo50618x(aVar, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        C6229b bVar = (C6229b) this.f2291f.f2292a;
        bVar.mo22221b(colorStateList);
        bVar.invalidateSelf();
    }
}
