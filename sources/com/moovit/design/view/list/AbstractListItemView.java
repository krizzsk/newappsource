package com.moovit.design.view.list;

import a00.C13382a;
import a00.C13385b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.C0794g;
import androidx.core.widget.C0801k;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.textview.MaterialTextView;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import k00.C17988b;
import p090g1.C4732a;
import p583jk.C17884p;
import p584jl.C17885a;
import p883wc.C20289a;
import p977zz.C20941h;
import w00.C20261b;
import w00.C20266g;
import w00.C20267h;
import y00.C20683b;

public abstract class AbstractListItemView<TV extends TextView, SV extends TextView, IV extends ImageView> extends ListItemLayout implements Checkable {

    /* renamed from: m0 */
    public static final int f41401m0 = C20266g.Widget_Moovit_ListItem;

    /* renamed from: n0 */
    public static final ImageView.ScaleType[] f41402n0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: o0 */
    public static final int[] f41403o0 = {16842911};

    /* renamed from: p0 */
    public static final int[] f41404p0 = {16842912};

    /* renamed from: A */
    public final int f41405A;

    /* renamed from: B */
    public final int f41406B;

    /* renamed from: C */
    public final boolean f41407C;

    /* renamed from: D */
    public final ImageView.ScaleType f41408D;

    /* renamed from: E */
    public final C20683b f41409E;

    /* renamed from: F */
    public int f41410F;

    /* renamed from: G */
    public final C20683b f41411G;

    /* renamed from: H */
    public int f41412H;

    /* renamed from: I */
    public final C20683b f41413I;

    /* renamed from: J */
    public int f41414J;

    /* renamed from: K */
    public View f41415K;

    /* renamed from: L */
    public ColorStateList f41416L;

    /* renamed from: M */
    public PorterDuff.Mode f41417M;

    /* renamed from: N */
    public int f41418N;

    /* renamed from: O */
    public ColorStateList f41419O;

    /* renamed from: P */
    public CharSequence f41420P;

    /* renamed from: Q */
    public C15871b f41421Q;

    /* renamed from: R */
    public boolean f41422R;

    /* renamed from: S */
    public boolean f41423S;

    /* renamed from: T */
    public boolean f41424T;

    /* renamed from: U */
    public boolean f41425U;

    /* renamed from: l0 */
    public StringBuilder f41426l0;

    /* renamed from: p */
    public TV f41427p;

    /* renamed from: q */
    public int f41428q;

    /* renamed from: r */
    public ColorStateList f41429r;

    /* renamed from: s */
    public final int f41430s;

    /* renamed from: t */
    public SV f41431t;

    /* renamed from: u */
    public int f41432u;

    /* renamed from: v */
    public ColorStateList f41433v;

    /* renamed from: w */
    public final int f41434w;

    /* renamed from: x */
    public IV f41435x;

    /* renamed from: y */
    public PorterDuff.Mode f41436y;

    /* renamed from: z */
    public ColorStateList f41437z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C15869a();

        /* renamed from: b */
        public boolean f41438b;

        /* renamed from: c */
        public boolean f41439c;

        /* renamed from: com.moovit.design.view.list.AbstractListItemView$SavedState$a */
        public class C15869a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f41438b ? 1 : 0);
            parcel.writeInt(this.f41439c ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z = false;
            this.f41438b = parcel.readInt() == 1;
            this.f41439c = parcel.readInt() == 1 ? true : z;
        }
    }

    /* renamed from: com.moovit.design.view.list.AbstractListItemView$a */
    public static /* synthetic */ class C15870a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41440a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.commons.utils.UiUtils$Edge[] r0 = com.moovit.commons.utils.UiUtils.Edge.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41440a = r0
                com.moovit.commons.utils.UiUtils$Edge r1 = com.moovit.commons.utils.UiUtils.Edge.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f41440a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.commons.utils.UiUtils$Edge r1 = com.moovit.commons.utils.UiUtils.Edge.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.design.view.list.AbstractListItemView.C15870a.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.design.view.list.AbstractListItemView$b */
    public interface C15871b {
        /* renamed from: a */
        void mo23219a(AbstractListItemView<?, ?, ?> abstractListItemView, boolean z);
    }

    public AbstractListItemView() {
        throw null;
    }

    public AbstractListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C20261b.listItemStyle);
    }

    private String getA11yClassName() {
        if (this.f41422R) {
            return CompoundButton.class.getName();
        }
        if (isClickable()) {
            return Button.class.getName();
        }
        return ViewGroup.class.getName();
    }

    /* renamed from: o */
    public static void m40438o(Canvas canvas, ImageView imageView, Drawable drawable, UiUtils.Edge edge, boolean z, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int width = imageView.getWidth();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth > 0 && intrinsicWidth < width) {
            int height = imageView.getHeight();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > 0 && intrinsicHeight < height) {
                int i8 = C15870a.f41440a[edge.ordinal()];
                if (i8 == 1) {
                    if (z) {
                        i6 = ((height / 2) + imageView.getTop()) - (intrinsicHeight / 2);
                        i5 = imageView.getLeft() - intrinsicWidth;
                    } else {
                        int top = imageView.getTop() - (intrinsicHeight / 2);
                        i5 = imageView.getLeft() - (intrinsicWidth / 2);
                        i6 = top;
                    }
                    i3 = i5 + i;
                } else if (i8 == 2) {
                    if (z) {
                        i4 = ((height / 2) + imageView.getTop()) - (intrinsicHeight / 2);
                        i7 = imageView.getRight();
                    } else {
                        i4 = imageView.getTop() - (intrinsicHeight / 2);
                        i7 = imageView.getRight() - (intrinsicWidth / 2);
                    }
                    i3 = i7 - i;
                } else {
                    return;
                }
                int i9 = i4 + i2;
                drawable.setBounds(i3, i9, intrinsicWidth + i3, intrinsicHeight + i9);
                drawable.draw(canvas);
            }
        }
    }

    /* renamed from: a */
    public final View mo47778a() {
        return this.f41415K;
    }

    /* renamed from: b */
    public final View mo47779b() {
        return this.f41435x;
    }

    /* renamed from: c */
    public final View mo47780c() {
        return this.f41431t;
    }

    /* renamed from: d */
    public final View mo47781d() {
        return this.f41427p;
    }

    public final void dispatchSetPressed(boolean z) {
    }

    public final void draw(Canvas canvas) {
        UiUtils.Edge edge;
        UiUtils.Edge edge2;
        UiUtils.Edge edge3;
        super.draw(canvas);
        IV iv = this.f41435x;
        if (iv != null && iv.getVisibility() == 0) {
            Drawable drawable = this.f41409E.f52253b;
            if (drawable != null) {
                IV iv2 = this.f41435x;
                if (C15780a.m40269b(iv2)) {
                    edge3 = UiUtils.Edge.RIGHT;
                } else {
                    edge3 = UiUtils.Edge.LEFT;
                }
                m40438o(canvas, iv2, drawable, edge3, true, this.f41410F, 0);
            }
            Drawable drawable2 = this.f41411G.f52253b;
            if (drawable2 != null) {
                IV iv3 = this.f41435x;
                if (C15780a.m40269b(iv3)) {
                    edge2 = UiUtils.Edge.RIGHT;
                } else {
                    edge2 = UiUtils.Edge.LEFT;
                }
                int i = this.f41412H;
                m40438o(canvas, iv3, drawable2, edge2, false, i, i);
            }
            Drawable drawable3 = this.f41413I.f52253b;
            if (drawable3 != null) {
                IV iv4 = this.f41435x;
                if (C15780a.m40269b(iv4)) {
                    edge = UiUtils.Edge.LEFT;
                } else {
                    edge = UiUtils.Edge.RIGHT;
                }
                int i2 = this.f41414J;
                m40438o(canvas, iv4, drawable3, edge, false, i2, i2);
            }
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f41409E.mo52833a();
        this.f41411G.mo52833a();
        this.f41413I.mo52833a();
    }

    public View getAccessoryView() {
        return this.f41415K;
    }

    public Drawable getIcon() {
        IV iv = this.f41435x;
        if (iv == null) {
            return null;
        }
        return iv.getDrawable();
    }

    public IV getIconView() {
        return mo47806q();
    }

    public CharSequence getSubtitle() {
        SV sv = this.f41431t;
        if (sv == null) {
            return null;
        }
        return sv.getText();
    }

    public SV getSubtitleView() {
        return mo47807r();
    }

    public CharSequence getText() {
        return getTitle();
    }

    public TV getTextView() {
        return getTitleView();
    }

    public CharSequence getTitle() {
        TV tv = this.f41427p;
        if (tv == null) {
            return null;
        }
        return tv.getText();
    }

    public TV getTitleView() {
        return mo47808s();
    }

    public final boolean isChecked() {
        return this.f41423S;
    }

    /* renamed from: j */
    public final boolean mo47795j() {
        C20683b bVar;
        C20683b bVar2;
        C20683b bVar3;
        if (super.mo47795j() || (((bVar = this.f41409E) != null && bVar.f52253b != null) || (((bVar2 = this.f41411G) != null && bVar2.f52253b != null) || ((bVar3 = this.f41413I) != null && bVar3.f52253b != null)))) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public abstract AppCompatImageView mo47796l(int i, Context context);

    /* renamed from: m */
    public abstract TextView mo47797m(int i, Context context);

    /* renamed from: n */
    public abstract TextView mo47798n(int i, Context context);

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.f41422R) {
            View.mergeDrawableStates(onCreateDrawableState, f41403o0);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f41404p0);
        }
        return onCreateDrawableState;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f41415K == null) {
            this.f41415K = super.mo47778a();
        }
        mo47804p();
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(this.f41422R);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getMeasuredWidth(), View.resolveSize(getMeasuredHeight(), i2));
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 32768) {
            mo47883t();
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckable(savedState.f41438b);
        if (this.f41422R) {
            setChecked(savedState.f41439c);
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f41438b = this.f41422R;
        savedState.f41439c = this.f41423S;
        return savedState;
    }

    /* renamed from: p */
    public final void mo47804p() {
        if (this.f41424T) {
            boolean isChecked = isChecked();
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Checkable) {
                    ((Checkable) childAt).setChecked(isChecked);
                }
            }
        }
    }

    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        if (!this.f41422R) {
            return false;
        }
        toggle();
        return true;
    }

    /* renamed from: q */
    public final IV mo47806q() {
        IV iv = this.f41435x;
        if (iv != null) {
            return iv;
        }
        AppCompatImageView l = mo47796l(C20261b.listItemIconStyle, getContext());
        l.setLayoutParams(new ViewGroup.LayoutParams(this.f41405A, this.f41406B));
        l.setAdjustViewBounds(this.f41407C);
        ColorStateList colorStateList = this.f41437z;
        if (colorStateList != null) {
            C0794g.m2404a(l, colorStateList);
        }
        PorterDuff.Mode mode = this.f41436y;
        if (mode != null) {
            C0794g.m2405b(l, mode);
        }
        ImageView.ScaleType scaleType = this.f41408D;
        if (scaleType != null) {
            l.setScaleType(scaleType);
        }
        setIconView(l);
        return this.f41435x;
    }

    /* renamed from: r */
    public final SV mo47807r() {
        SV sv = this.f41431t;
        if (sv != null) {
            return sv;
        }
        SV m = mo47797m(C20261b.listItemSubtitleStyle, getContext());
        int i = this.f41432u;
        if (i != 0) {
            C0801k.m2424f(m, i);
        }
        int i2 = this.f41434w;
        if (i2 > 0) {
            m.setMaxLines(i2);
        }
        ColorStateList colorStateList = this.f41433v;
        if (colorStateList != null) {
            m.setTextColor(colorStateList);
        }
        setSubtitleView(m);
        return m;
    }

    /* renamed from: s */
    public final TV mo47808s() {
        TV tv = this.f41427p;
        if (tv != null) {
            return tv;
        }
        TV n = mo47798n(C20261b.listItemTitleStyle, getContext());
        int i = this.f41428q;
        if (i != 0) {
            C0801k.m2424f(n, i);
        }
        int i2 = this.f41430s;
        if (i2 > 0) {
            n.setMaxLines(i2);
        }
        ColorStateList colorStateList = this.f41429r;
        if (colorStateList != null) {
            n.setTextColor(colorStateList);
        }
        setTitleView(n);
        return n;
    }

    public void setAccessoryContentDescription(CharSequence charSequence) {
        this.f41420P = charSequence;
        View view = this.f41415K;
        if (view != null) {
            view.setContentDescription(charSequence);
            mo47883t();
        }
    }

    public void setAccessoryDrawable(Drawable drawable) {
        ImageView imageView;
        if (drawable == null) {
            View view = this.f41415K;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.f41415K;
        if (view2 instanceof Button) {
            C17885a.m44465u0((Button) view2, drawable, 2);
            this.f41415K.setVisibility(0);
            return;
        }
        if (view2 instanceof ImageView) {
            imageView = (ImageView) view2;
            view2.setVisibility(0);
        } else {
            imageView = new AppCompatImageView(getContext(), (AttributeSet) null, C20261b.listItemAccessoryIconStyle);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            ColorStateList colorStateList = this.f41416L;
            if (colorStateList != null) {
                C0794g.m2404a(imageView, colorStateList);
            }
            PorterDuff.Mode mode = this.f41417M;
            if (mode != null) {
                C0794g.m2405b(imageView, mode);
            }
            setAccessoryView((View) imageView);
        }
        imageView.setImageDrawable(drawable);
    }

    public void setAccessoryResourceTextColor(int i) {
        ColorStateList colorStateList = C4732a.getColorStateList(getContext(), i);
        if (colorStateList != null) {
            setAccessoryTextColor(colorStateList);
        }
    }

    public void setAccessoryText(CharSequence charSequence) {
        TextView textView;
        if (charSequence == null) {
            View view = this.f41415K;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.f41415K;
        if (view2 instanceof TextView) {
            textView = (TextView) view2;
            textView.setVisibility(0);
        } else {
            textView = new MaterialTextView(getContext(), (AttributeSet) null, C20261b.listItemAccessoryTextStyle);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            textView.setImportantForAccessibility(2);
            int i = this.f41418N;
            if (i != 0) {
                C0801k.m2424f(textView, i);
            }
            ColorStateList colorStateList = this.f41419O;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            setAccessoryView((View) textView);
        }
        textView.setText(charSequence);
        textView.setContentDescription(charSequence);
        View view3 = this.f41415K;
        C13382a.C13383a aVar = C13382a.f33219a;
        if (view3 != null) {
            view3.setAccessibilityDelegate(new C13385b());
        }
        mo47883t();
    }

    public void setAccessoryTextAppearance(int i) {
        if (this.f41418N != i) {
            this.f41418N = i;
            View view = this.f41415K;
            if (view instanceof TextView) {
                C0801k.m2424f((TextView) view, i);
            }
        }
    }

    public void setAccessoryTextColor(ColorStateList colorStateList) {
        if (this.f41419O != colorStateList) {
            this.f41419O = colorStateList;
            View view = this.f41415K;
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(colorStateList);
            }
        }
    }

    public void setAccessoryThemeTextAppearance(int i) {
        setAccessoryTextAppearance(C20941h.m49047j(i, getContext()));
    }

    public void setAccessoryThemeTextColor(int i) {
        ColorStateList g = C20941h.m49044g(i, getContext());
        if (g != null) {
            setAccessoryTextColor(g);
        }
    }

    public void setAccessoryTintColor(int i) {
        setAccessoryTintList(ColorStateList.valueOf(i));
    }

    public void setAccessoryTintColorRes(int i) {
        setAccessoryTintList(C4732a.getColorStateList(getContext(), i));
    }

    public void setAccessoryTintList(ColorStateList colorStateList) {
        if (this.f41416L != colorStateList) {
            this.f41416L = colorStateList;
            View view = this.f41415K;
            if (view instanceof ImageView) {
                C0794g.m2404a((ImageView) view, colorStateList);
            }
        }
    }

    public void setAccessoryTintMode(PorterDuff.Mode mode) {
        if (this.f41417M != mode) {
            this.f41417M = mode;
            View view = this.f41415K;
            if (view instanceof ImageView) {
                C0794g.m2405b((ImageView) view, mode);
            }
        }
    }

    public void setAccessoryTintThemeColor(int i) {
        setAccessoryTintList(C20941h.m49044g(i, getContext()));
    }

    public void setAccessoryView(View view) {
        View view2 = this.f41415K;
        if (view2 != view) {
            if (view2 != null) {
                removeView(view2);
            }
            this.f41415K = view;
            if (view != null) {
                addView(view);
                CharSequence charSequence = this.f41420P;
                if (charSequence != null) {
                    view.setContentDescription(charSequence);
                }
            }
            mo47883t();
        }
    }

    public void setCheckable(boolean z) {
        if (this.f41422R != z) {
            this.f41422R = z;
            drawableStateChanged();
        }
    }

    public void setChecked(boolean z) {
        if (!this.f41422R) {
            throw new IllegalStateException("You must set this view as checkable first! Try calling setCheckable(true) and try again");
        } else if (this.f41423S != z) {
            this.f41423S = z;
            refreshDrawableState();
            mo47804p();
            if (!this.f41425U) {
                this.f41425U = true;
                C15871b bVar = this.f41421Q;
                if (bVar != null) {
                    bVar.mo23219a(this, this.f41423S);
                }
                this.f41425U = false;
            }
        }
    }

    public void setContentDescription(CharSequence charSequence) {
        this.f41426l0 = null;
        super.setContentDescription(charSequence);
    }

    public void setDuplicateCheckedState(boolean z) {
        if (this.f41424T != z) {
            this.f41424T = z;
            mo47804p();
        }
    }

    public void setIcon(Bitmap bitmap) {
        if (bitmap == null) {
            IV iv = this.f41435x;
            if (iv != null) {
                removeView(iv);
                this.f41435x = null;
                return;
            }
            return;
        }
        getIconView().setImageBitmap(bitmap);
    }

    public void setIconStartDecorationDrawable(Drawable drawable) {
        if (this.f41409E.mo52834b(drawable)) {
            mo47894k();
            invalidate();
        }
    }

    public void setIconStartDecorationMargins(int i) {
        if (i != this.f41410F) {
            this.f41410F = i;
            mo47894k();
            invalidate();
        }
    }

    public void setIconStartDecorationTintColor(int i) {
        C20683b bVar = this.f41409E;
        bVar.getClass();
        if (bVar.mo52836d(ColorStateList.valueOf(i))) {
            mo47894k();
            invalidate();
        }
    }

    public void setIconStartDecorationTintColorRes(int i) {
        if (this.f41409E.mo52835c(i)) {
            mo47894k();
            invalidate();
        }
    }

    public void setIconStartDecorationTintList(ColorStateList colorStateList) {
        if (this.f41409E.mo52836d(colorStateList)) {
            mo47894k();
            invalidate();
        }
    }

    public void setIconStartDecorationTintMode(PorterDuff.Mode mode) {
        if (this.f41409E.mo52837e(mode)) {
            mo47894k();
            invalidate();
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f41437z != colorStateList) {
            this.f41437z = colorStateList;
            IV iv = this.f41435x;
            if (iv != null) {
                C0794g.m2404a(iv, colorStateList);
            }
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f41436y != mode) {
            this.f41436y = mode;
            IV iv = this.f41435x;
            if (iv != null) {
                C0794g.m2405b(iv, mode);
            }
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C4732a.getColorStateList(getContext(), i));
    }

    public void setIconTintTheme(int i) {
        setIconTint(C20941h.m49044g(i, getContext()));
    }

    public void setIconTopEndDecorationDrawable(Drawable drawable) {
        if (this.f41413I.mo52834b(drawable)) {
            mo47894k();
            invalidate();
        }
    }

    public void setIconTopEndDecorationMargins(int i) {
        if (i != this.f41414J) {
            this.f41414J = i;
            mo47894k();
            invalidate();
        }
    }

    public void setIconTopEndDecorationTintColor(int i) {
        C20683b bVar = this.f41413I;
        bVar.getClass();
        if (bVar.mo52836d(ColorStateList.valueOf(i))) {
            mo47894k();
            invalidate();
        }
    }

    public void setIconTopEndDecorationTintColorRes(int i) {
        if (this.f41413I.mo52835c(i)) {
            mo47894k();
            invalidate();
        }
    }

    public void setIconTopEndDecorationTintList(ColorStateList colorStateList) {
        if (this.f41413I.mo52836d(colorStateList)) {
            mo47894k();
            invalidate();
        }
    }

    public void setIconTopEndDecorationTintMode(PorterDuff.Mode mode) {
        if (this.f41413I.mo52837e(mode)) {
            mo47894k();
            invalidate();
        }
    }

    public void setIconTopStartDecorationDrawable(Drawable drawable) {
        if (this.f41411G.mo52834b(drawable)) {
            mo47894k();
            invalidate();
        }
    }

    public void setIconTopStartDecorationMargins(int i) {
        if (i != this.f41412H) {
            this.f41412H = i;
            mo47894k();
            invalidate();
        }
    }

    public void setIconTopStartDecorationTintColor(int i) {
        C20683b bVar = this.f41411G;
        bVar.getClass();
        if (bVar.mo52836d(ColorStateList.valueOf(i))) {
            mo47894k();
            invalidate();
        }
    }

    public void setIconTopStartDecorationTintColorRes(int i) {
        if (this.f41411G.mo52835c(i)) {
            mo47894k();
            invalidate();
        }
    }

    public void setIconTopStartDecorationTintList(ColorStateList colorStateList) {
        if (this.f41411G.mo52836d(colorStateList)) {
            mo47894k();
            invalidate();
        }
    }

    public void setIconTopStartDecorationTintMode(PorterDuff.Mode mode) {
        if (this.f41409E.mo52837e(mode)) {
            mo47894k();
            invalidate();
        }
    }

    public void setIconView(IV iv) {
        IV iv2 = this.f41435x;
        if (iv2 != iv) {
            if (iv2 != null) {
                removeView(iv2);
            }
            this.f41435x = iv;
            if (iv != null) {
                addView(iv);
            }
        }
    }

    public void setOnCheckedChangeListener(C15871b bVar) {
        setCheckable(true);
        this.f41421Q = bVar;
    }

    public void setSubtitle(int i) {
        if (i == 0) {
            SV sv = this.f41431t;
            if (sv != null) {
                removeView(sv);
                this.f41431t = null;
                return;
            }
            return;
        }
        getSubtitleView().setText(i);
        mo47883t();
    }

    public void setSubtitleResourceTextColor(int i) {
        ColorStateList colorStateList = C4732a.getColorStateList(getContext(), i);
        if (colorStateList != null) {
            setSubtitleTextColor(colorStateList);
        }
    }

    public void setSubtitleTextAppearance(int i) {
        if (this.f41432u != i) {
            this.f41432u = i;
            SV sv = this.f41431t;
            if (sv != null) {
                C0801k.m2424f(sv, i);
            }
        }
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        if (this.f41433v != colorStateList) {
            this.f41433v = colorStateList;
            SV sv = this.f41431t;
            if (sv != null) {
                sv.setTextColor(colorStateList);
            }
        }
    }

    public void setSubtitleThemeTextAppearance(int i) {
        setSubtitleTextAppearance(C20941h.m49047j(i, getContext()));
    }

    public void setSubtitleThemeTextColor(int i) {
        ColorStateList g = C20941h.m49044g(i, getContext());
        if (g != null) {
            setSubtitleTextColor(g);
        }
    }

    public void setSubtitleView(SV sv) {
        SV sv2 = this.f41431t;
        if (sv2 != sv) {
            if (sv2 != null) {
                removeView(sv2);
            }
            this.f41431t = sv;
            if (sv != null) {
                addView(sv);
            }
        }
    }

    public void setText(int i) {
        setTitle(i);
    }

    public void setTitle(int i) {
        if (i == 0) {
            TV tv = this.f41427p;
            if (tv != null) {
                removeView(tv);
                this.f41427p = null;
                return;
            }
            return;
        }
        getTitleView().setText(i);
        mo47883t();
    }

    public void setTitleResourceTextColor(int i) {
        ColorStateList colorStateList = C4732a.getColorStateList(getContext(), i);
        if (colorStateList != null) {
            setTitleTextColor(colorStateList);
        }
    }

    public void setTitleTextAppearance(int i) {
        if (this.f41428q != i) {
            this.f41428q = i;
            TV tv = this.f41427p;
            if (tv != null) {
                C0801k.m2424f(tv, i);
            }
        }
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        if (this.f41429r != colorStateList) {
            this.f41429r = colorStateList;
            TV tv = this.f41427p;
            if (tv != null) {
                tv.setTextColor(colorStateList);
            }
        }
    }

    public void setTitleThemeTextAppearance(int i) {
        setTitleTextAppearance(C20941h.m49047j(i, getContext()));
    }

    public void setTitleThemeTextColor(int i) {
        ColorStateList g = C20941h.m49044g(i, getContext());
        if (g != null) {
            setTitleTextColor(g);
        }
    }

    public void setTitleView(TV tv) {
        TV tv2 = this.f41427p;
        if (tv2 != tv) {
            if (tv2 != null) {
                removeView(tv2);
            }
            this.f41427p = tv;
            if (tv != null) {
                addView(tv);
            }
        }
    }

    public void setupViews(int i) {
        if ((i & 1) != 0) {
            mo47808s();
        }
        if ((i & 2) != 0) {
            mo47807r();
        }
        if ((i & 4) != 0) {
            mo47806q();
        }
    }

    /* renamed from: t */
    public final void mo47883t() {
        StringBuilder sb = this.f41426l0;
        if (sb != null) {
            sb.setLength(0);
            C13382a.m33666b(this.f41426l0, getTitle());
            C13382a.m33666b(this.f41426l0, getSubtitle());
            View accessoryView = getAccessoryView();
            if (accessoryView != null) {
                if (accessoryView.isClickable()) {
                    accessoryView.setImportantForAccessibility(1);
                } else {
                    accessoryView.setImportantForAccessibility(2);
                    C13382a.m33666b(this.f41426l0, accessoryView.getContentDescription());
                }
            }
            super.setContentDescription(this.f41426l0);
        }
    }

    public final void toggle() {
        setChecked(!this.f41423S);
    }

    public AbstractListItemView(Context context, AttributeSet attributeSet, int i) {
        super(C20289a.m47861a(context, attributeSet, i, f41401m0), attributeSet, i);
        this.f41425U = false;
        this.f41426l0 = new StringBuilder();
        Context context2 = getContext();
        TypedArray o = UiUtils.m40256o(context2, attributeSet, C20267h.ListItemView, i);
        try {
            this.f41428q = o.getResourceId(C20267h.ListItemView_titleTextAppearance, 0);
            this.f41429r = C20941h.m49039b(context2, o, C20267h.ListItemView_titleTextColor);
            this.f41430s = o.getInt(C20267h.ListItemView_titleMaxLines, 0);
            this.f41432u = o.getResourceId(C20267h.ListItemView_subtitleTextAppearance, 0);
            this.f41433v = C20941h.m49039b(context2, o, C20267h.ListItemView_subtitleTextColor);
            this.f41434w = o.getInt(C20267h.ListItemView_subtitleMaxLines, 0);
            this.f41437z = C20941h.m49039b(context2, o, C20267h.ListItemView_iconTint);
            this.f41436y = UiUtils.m40257p(o.getInt(C20267h.ListItemView_iconTintMode, -1), (PorterDuff.Mode) null);
            int i2 = o.getInt(C20267h.ListItemView_iconScaleType, -1);
            this.f41408D = i2 > -1 ? f41402n0[i2] : null;
            this.f41405A = o.getLayoutDimension(C20267h.ListItemView_iconLayoutWidth, -2);
            this.f41406B = o.getLayoutDimension(C20267h.ListItemView_iconLayoutHeight, -2);
            this.f41407C = o.getBoolean(C20267h.ListItemView_iconAdjustViewBounds, false);
            this.f41409E = new C20683b(this, o, C20267h.ListItemView_iconStartDecorationDrawable, C20267h.ListItemView_iconStartDecorationTint, C20267h.ListItemView_iconStartDecorationTintMode);
            this.f41410F = C20941h.m49041d(context2, o, C20267h.ListItemView_iconStartDecorationMargins, 0);
            this.f41411G = new C20683b(this, o, C20267h.ListItemView_iconTopStartDecorationDrawable, C20267h.ListItemView_iconTopStartDecorationTint, C20267h.ListItemView_iconTopStartDecorationTintMode);
            this.f41412H = C20941h.m49041d(context2, o, C20267h.ListItemView_iconTopStartDecorationMargins, 0);
            this.f41413I = new C20683b(this, o, C20267h.ListItemView_iconTopEndDecorationDrawable, C20267h.ListItemView_iconTopEndDecorationTint, C20267h.ListItemView_iconTopEndDecorationTintMode);
            this.f41414J = C20941h.m49041d(context2, o, C20267h.ListItemView_iconTopEndDecorationMargins, 0);
            this.f41418N = o.getResourceId(C20267h.ListItemView_accessoryTextAppearance, 0);
            this.f41419O = C20941h.m49039b(context2, o, C20267h.ListItemView_accessoryTextColor);
            this.f41416L = C20941h.m49039b(context2, o, C20267h.ListItemView_accessoryTint);
            this.f41417M = UiUtils.m40257p(o.getInt(C20267h.ListItemView_accessoryTintMode, -1), (PorterDuff.Mode) null);
            this.f41420P = o.getText(C20267h.ListItemView_accessoryContentDescription);
            this.f41422R = o.getBoolean(C20267h.ListItemView_android_checkable, false);
            this.f41423S = o.getBoolean(C20267h.ListItemView_android_checked, false);
            this.f41424T = o.getBoolean(C20267h.ListItemView_duplicateCheckedState, false);
            setupViews(o.getInt(C20267h.ListItemView_autoCreate, 0));
            CharSequence text = o.getText(C20267h.ListItemView_title);
            if (text != null) {
                setTitle(text);
            }
            CharSequence text2 = o.getText(C20267h.ListItemView_android_text);
            if (text2 != null) {
                setText(text2);
            }
            CharSequence text3 = o.getText(C20267h.ListItemView_android_subtitle);
            if (text3 != null) {
                setSubtitle(text3);
            }
            Drawable e = C20941h.m49042e(context2, o, C20267h.ListItemView_android_icon);
            if (e != null) {
                setIcon(e);
            }
            int resourceId = o.getResourceId(C20267h.ListItemView_accessoryLayout, 0);
            if (resourceId != 0) {
                setAccessoryView(resourceId);
            }
            int resourceId2 = o.getResourceId(C20267h.ListItemView_accessoryDrawable, 0);
            if (resourceId2 != 0) {
                setAccessoryDrawable(resourceId2);
            }
            CharSequence text4 = o.getText(C20267h.ListItemView_accessoryText);
            if (text4 != null) {
                setAccessoryText(text4);
            }
            mo47894k();
        } finally {
            o.recycle();
        }
    }

    public void setText(CharSequence charSequence) {
        setTitle(charSequence);
    }

    public void setIconStartDecorationDrawable(int i) {
        setIconStartDecorationDrawable(C17988b.m44611b(i, getContext()));
    }

    public void setIconTopEndDecorationDrawable(int i) {
        setIconTopEndDecorationDrawable(C17988b.m44611b(i, getContext()));
    }

    public void setIconTopStartDecorationDrawable(int i) {
        setIconTopStartDecorationDrawable(C17988b.m44611b(i, getContext()));
    }

    public void setAccessoryTextColor(int i) {
        setAccessoryTextColor(ColorStateList.valueOf(i));
    }

    public void setIconTint(int i) {
        setIconTint(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setIcon(Drawable drawable) {
        if (drawable == null) {
            IV iv = this.f41435x;
            if (iv != null) {
                removeView(iv);
                this.f41435x = null;
                return;
            }
            return;
        }
        getIconView().setImageDrawable(drawable);
    }

    public void setSubtitle(CharSequence charSequence) {
        if (charSequence == null) {
            SV sv = this.f41431t;
            if (sv != null) {
                removeView(sv);
                this.f41431t = null;
                return;
            }
            return;
        }
        getSubtitleView().setText(charSequence);
        mo47883t();
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            TV tv = this.f41427p;
            if (tv != null) {
                removeView(tv);
                this.f41427p = null;
                return;
            }
            return;
        }
        getTitleView().setText(charSequence);
        mo47883t();
    }

    public void setAccessoryView(int i) {
        setAccessoryView(i == 0 ? null : LayoutInflater.from(getContext()).inflate(i, this, false));
    }

    public void setIcon(Image image) {
        if (image == null) {
            IV iv = this.f41435x;
            if (iv != null) {
                removeView(iv);
                this.f41435x = null;
                return;
            }
            return;
        }
        ImageView iconView = getIconView();
        C17884p.m44354Y(iconView).mo51642v(image).mo51628o0(image).mo10850T(iconView);
    }

    public void setAccessoryDrawable(int i) {
        setAccessoryDrawable(C17988b.m44611b(i, getContext()));
    }

    public void setIcon(int i) {
        setIcon(C17988b.m44611b(i, getContext()));
    }

    public void setAccessoryText(int i) {
        setAccessoryText(i == 0 ? null : getContext().getText(i));
    }
}
