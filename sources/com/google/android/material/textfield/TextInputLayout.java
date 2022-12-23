package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0407g;
import androidx.appcompat.widget.C0418j0;
import androidx.core.widget.C0801k;
import androidx.customview.view.AbsSavedState;
import androidx.transition.C1328g;
import androidx.transition.Fade;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.C14047c;
import com.google.android.material.internal.C14050d;
import com.google.android.material.internal.C14083r;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p090g1.C4732a;
import p127j.C5344a;
import p141k1.C5450a;
import p216q1.C6131a;
import p216q1.C6137d;
import p242s1.C6315a;
import p242s1.C6333d0;
import p242s1.C6362h;
import p242s1.C6382p0;
import p255t1.C6531g;
import p355ac.C13401b;
import p355ac.C13402c;
import p355ac.C13403d;
import p355ac.C13405f;
import p355ac.C13409j;
import p355ac.C13410k;
import p358af.C13437d;
import p380bc.C13577a;
import p742qc.C19099c;
import p811tc.C19648g;
import p811tc.C19654k;

public class TextInputLayout extends LinearLayout {

    /* renamed from: W0 */
    public static final int f35477W0 = C13410k.Widget_Design_TextInputLayout;

    /* renamed from: A */
    public ColorStateList f35478A;

    /* renamed from: A0 */
    public View.OnLongClickListener f35479A0;

    /* renamed from: B */
    public CharSequence f35480B;

    /* renamed from: B0 */
    public final CheckableImageButton f35481B0;

    /* renamed from: C */
    public final AppCompatTextView f35482C;

    /* renamed from: C0 */
    public ColorStateList f35483C0;

    /* renamed from: D */
    public boolean f35484D;

    /* renamed from: D0 */
    public PorterDuff.Mode f35485D0;

    /* renamed from: E */
    public CharSequence f35486E;

    /* renamed from: E0 */
    public ColorStateList f35487E0;

    /* renamed from: F */
    public boolean f35488F;

    /* renamed from: F0 */
    public ColorStateList f35489F0;

    /* renamed from: G */
    public C19648g f35490G;

    /* renamed from: G0 */
    public int f35491G0;

    /* renamed from: H */
    public C19648g f35492H;

    /* renamed from: H0 */
    public int f35493H0;

    /* renamed from: I */
    public C19648g f35494I;

    /* renamed from: I0 */
    public int f35495I0;

    /* renamed from: J */
    public C19654k f35496J;

    /* renamed from: J0 */
    public ColorStateList f35497J0;

    /* renamed from: K */
    public boolean f35498K;

    /* renamed from: K0 */
    public int f35499K0;

    /* renamed from: L */
    public final int f35500L;

    /* renamed from: L0 */
    public int f35501L0;

    /* renamed from: M */
    public int f35502M;

    /* renamed from: M0 */
    public int f35503M0;

    /* renamed from: N */
    public int f35504N;

    /* renamed from: N0 */
    public int f35505N0;

    /* renamed from: O */
    public int f35506O;

    /* renamed from: O0 */
    public int f35507O0;

    /* renamed from: P */
    public int f35508P;

    /* renamed from: P0 */
    public boolean f35509P0;

    /* renamed from: Q */
    public int f35510Q;

    /* renamed from: Q0 */
    public final C14047c f35511Q0;

    /* renamed from: R */
    public int f35512R;

    /* renamed from: R0 */
    public boolean f35513R0;

    /* renamed from: S */
    public int f35514S;

    /* renamed from: S0 */
    public boolean f35515S0;

    /* renamed from: T */
    public final Rect f35516T;

    /* renamed from: T0 */
    public ValueAnimator f35517T0;

    /* renamed from: U */
    public final Rect f35518U;

    /* renamed from: U0 */
    public boolean f35519U0;

    /* renamed from: V0 */
    public boolean f35520V0;

    /* renamed from: b */
    public final FrameLayout f35521b;

    /* renamed from: c */
    public final C14205s f35522c;

    /* renamed from: d */
    public final LinearLayout f35523d;

    /* renamed from: e */
    public final FrameLayout f35524e;

    /* renamed from: f */
    public EditText f35525f;

    /* renamed from: g */
    public CharSequence f35526g;

    /* renamed from: h */
    public int f35527h;

    /* renamed from: i */
    public int f35528i;

    /* renamed from: j */
    public int f35529j;

    /* renamed from: k */
    public int f35530k;

    /* renamed from: l */
    public final C14195o f35531l;

    /* renamed from: l0 */
    public final RectF f35532l0;

    /* renamed from: m */
    public boolean f35533m;

    /* renamed from: m0 */
    public Typeface f35534m0;

    /* renamed from: n */
    public int f35535n;

    /* renamed from: n0 */
    public ColorDrawable f35536n0;

    /* renamed from: o */
    public boolean f35537o;

    /* renamed from: o0 */
    public int f35538o0;

    /* renamed from: p */
    public AppCompatTextView f35539p;

    /* renamed from: p0 */
    public final LinkedHashSet<C14163f> f35540p0;

    /* renamed from: q */
    public int f35541q;

    /* renamed from: q0 */
    public int f35542q0;

    /* renamed from: r */
    public int f35543r;

    /* renamed from: r0 */
    public final SparseArray<C14193m> f35544r0;

    /* renamed from: s */
    public CharSequence f35545s;

    /* renamed from: s0 */
    public final CheckableImageButton f35546s0;

    /* renamed from: t */
    public boolean f35547t;

    /* renamed from: t0 */
    public final LinkedHashSet<C14164g> f35548t0;

    /* renamed from: u */
    public AppCompatTextView f35549u;

    /* renamed from: u0 */
    public ColorStateList f35550u0;

    /* renamed from: v */
    public ColorStateList f35551v;

    /* renamed from: v0 */
    public PorterDuff.Mode f35552v0;

    /* renamed from: w */
    public int f35553w;

    /* renamed from: w0 */
    public ColorDrawable f35554w0;

    /* renamed from: x */
    public Fade f35555x;

    /* renamed from: x0 */
    public int f35556x0;

    /* renamed from: y */
    public Fade f35557y;

    /* renamed from: y0 */
    public Drawable f35558y0;

    /* renamed from: z */
    public ColorStateList f35559z;

    /* renamed from: z0 */
    public View.OnLongClickListener f35560z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C14157a();

        /* renamed from: b */
        public CharSequence f35561b;

        /* renamed from: c */
        public boolean f35562c;

        /* renamed from: d */
        public CharSequence f35563d;

        /* renamed from: e */
        public CharSequence f35564e;

        /* renamed from: f */
        public CharSequence f35565f;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$SavedState$a */
        public class C14157a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public final String toString() {
            StringBuilder k = C13555b.m33972k("TextInputLayout.SavedState{");
            k.append(Integer.toHexString(System.identityHashCode(this)));
            k.append(" error=");
            k.append(this.f35561b);
            k.append(" hint=");
            k.append(this.f35563d);
            k.append(" helperText=");
            k.append(this.f35564e);
            k.append(" placeholderText=");
            k.append(this.f35565f);
            k.append("}");
            return k.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f35561b, parcel, i);
            parcel.writeInt(this.f35562c ? 1 : 0);
            TextUtils.writeToParcel(this.f35563d, parcel, i);
            TextUtils.writeToParcel(this.f35564e, parcel, i);
            TextUtils.writeToParcel(this.f35565f, parcel, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f35561b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f35562c = parcel.readInt() != 1 ? false : true;
            this.f35563d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f35564e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f35565f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    public class C14158a implements TextWatcher {
        public C14158a() {
        }

        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.mo42573v(!textInputLayout.f35520V0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f35533m) {
                textInputLayout2.mo42472o(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.f35547t) {
                textInputLayout3.mo42574w(editable.length());
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    public class C14159b implements Runnable {
        public C14159b() {
        }

        public final void run() {
            TextInputLayout.this.f35546s0.performClick();
            TextInputLayout.this.f35546s0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    public class C14160c implements Runnable {
        public C14160c() {
        }

        public final void run() {
            TextInputLayout.this.f35525f.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    public class C14161d implements ValueAnimator.AnimatorUpdateListener {
        public C14161d() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f35511Q0.mo41872q(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    public static class C14162e extends C6315a {

        /* renamed from: a */
        public final TextInputLayout f35570a;

        public C14162e(TextInputLayout textInputLayout) {
            this.f35570a = textInputLayout;
        }

        public void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
            Editable editable;
            boolean z;
            String str;
            C6531g gVar2 = gVar;
            super.onInitializeAccessibilityNodeInfo(view, gVar);
            EditText editText = this.f35570a.getEditText();
            if (editText != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            CharSequence hint = this.f35570a.getHint();
            CharSequence error = this.f35570a.getError();
            CharSequence placeholderText = this.f35570a.getPlaceholderText();
            int counterMaxLength = this.f35570a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f35570a.getCounterOverflowDescription();
            boolean z2 = !TextUtils.isEmpty(editable);
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z4 = !this.f35570a.f35509P0;
            boolean z5 = !TextUtils.isEmpty(error);
            if (z5 || !TextUtils.isEmpty(counterOverflowDescription)) {
                z = true;
            } else {
                z = false;
            }
            if (z3) {
                str = hint.toString();
            } else {
                str = "";
            }
            C14205s sVar = this.f35570a.f35522c;
            if (sVar.f35662c.getVisibility() == 0) {
                gVar2.f20334a.setLabelFor(sVar.f35662c);
                AppCompatTextView appCompatTextView = sVar.f35662c;
                if (Build.VERSION.SDK_INT >= 22) {
                    gVar2.f20334a.setTraversalAfter(appCompatTextView);
                }
            } else {
                CheckableImageButton checkableImageButton = sVar.f35664e;
                if (Build.VERSION.SDK_INT >= 22) {
                    gVar2.f20334a.setTraversalAfter(checkableImageButton);
                } else {
                    gVar.getClass();
                }
            }
            if (z2) {
                gVar2.mo22649n(editable);
            } else if (!TextUtils.isEmpty(str)) {
                gVar2.mo22649n(str);
                if (z4 && placeholderText != null) {
                    gVar2.mo22649n(str + ", " + placeholderText);
                }
            } else if (placeholderText != null) {
                gVar2.mo22649n(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    gVar2.mo22647l(str);
                } else {
                    if (z2) {
                        str = editable + ", " + str;
                    }
                    gVar2.mo22649n(str);
                }
                boolean z6 = true ^ z2;
                if (i >= 26) {
                    gVar2.f20334a.setShowingHintText(z6);
                } else {
                    gVar2.mo22641g(4, z6);
                }
            }
            if (editable == null || editable.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            gVar2.f20334a.setMaxTextLength(counterMaxLength);
            if (z) {
                if (!z5) {
                    error = counterOverflowDescription;
                }
                gVar2.f20334a.setError(error);
            }
            AppCompatTextView appCompatTextView2 = this.f35570a.f35531l.f35642r;
            if (appCompatTextView2 != null) {
                gVar2.f20334a.setLabelFor(appCompatTextView2);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    public interface C14163f {
        /* renamed from: a */
        void mo42588a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    public interface C14164g {
        /* renamed from: a */
        void mo42589a(TextInputLayout textInputLayout, int i);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C13401b.textInputStyle);
    }

    private C14193m getEndIconDelegate() {
        C14193m mVar = this.f35544r0.get(this.f35542q0);
        if (mVar != null) {
            return mVar;
        }
        return this.f35544r0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        boolean z;
        if (this.f35481B0.getVisibility() == 0) {
            return this.f35481B0;
        }
        if (this.f35542q0 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !mo42468i()) {
            return null;
        }
        return this.f35546s0;
    }

    /* renamed from: l */
    public static void m35227l(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m35227l((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: m */
    public static void m35228m(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        boolean a = C6333d0.C6336c.m15040a(checkableImageButton);
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (a || z) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(a);
        checkableImageButton.setPressable(a);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        C6333d0.C6337d.m15059s(checkableImageButton, i);
    }

    private void setEditText(EditText editText) {
        if (this.f35525f == null) {
            if (this.f35542q0 != 3) {
                boolean z = editText instanceof TextInputEditText;
            }
            this.f35525f = editText;
            int i = this.f35527h;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.f35529j);
            }
            int i2 = this.f35528i;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.f35530k);
            }
            mo42469j();
            setTextInputAccessibilityDelegate(new C14162e(this));
            C14047c cVar = this.f35511Q0;
            Typeface typeface = this.f35525f.getTypeface();
            boolean n = cVar.mo41869n(typeface);
            boolean p = cVar.mo41871p(typeface);
            if (n || p) {
                cVar.mo41865j(false);
            }
            C14047c cVar2 = this.f35511Q0;
            float textSize = this.f35525f.getTextSize();
            if (cVar2.f35033m != textSize) {
                cVar2.f35033m = textSize;
                cVar2.mo41865j(false);
            }
            C14047c cVar3 = this.f35511Q0;
            float letterSpacing = this.f35525f.getLetterSpacing();
            if (cVar3.f35022g0 != letterSpacing) {
                cVar3.f35022g0 = letterSpacing;
                cVar3.mo41865j(false);
            }
            int gravity = this.f35525f.getGravity();
            this.f35511Q0.mo41868m((gravity & -113) | 48);
            C14047c cVar4 = this.f35511Q0;
            if (cVar4.f35029k != gravity) {
                cVar4.f35029k = gravity;
                cVar4.mo41865j(false);
            }
            this.f35525f.addTextChangedListener(new C14158a());
            if (this.f35487E0 == null) {
                this.f35487E0 = this.f35525f.getHintTextColors();
            }
            if (this.f35484D) {
                if (TextUtils.isEmpty(this.f35486E)) {
                    CharSequence hint = this.f35525f.getHint();
                    this.f35526g = hint;
                    setHint(hint);
                    this.f35525f.setHint((CharSequence) null);
                }
                this.f35488F = true;
            }
            if (this.f35539p != null) {
                mo42472o(this.f35525f.getText().length());
            }
            mo42481r();
            this.f35531l.mo42620b();
            this.f35522c.bringToFront();
            this.f35523d.bringToFront();
            this.f35524e.bringToFront();
            this.f35481B0.bringToFront();
            Iterator<C14163f> it = this.f35540p0.iterator();
            while (it.hasNext()) {
                it.next().mo42588a(this);
            }
            mo42576y();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            mo42573v(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f35486E)) {
            this.f35486E = charSequence;
            C14047c cVar = this.f35511Q0;
            if (charSequence == null || !TextUtils.equals(cVar.f34989G, charSequence)) {
                cVar.f34989G = charSequence;
                cVar.f34990H = null;
                Bitmap bitmap = cVar.f34993K;
                if (bitmap != null) {
                    bitmap.recycle();
                    cVar.f34993K = null;
                }
                cVar.mo41865j(false);
            }
            if (!this.f35509P0) {
                mo42470k();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f35547t != z) {
            if (z) {
                AppCompatTextView appCompatTextView = this.f35549u;
                if (appCompatTextView != null) {
                    this.f35521b.addView(appCompatTextView);
                    this.f35549u.setVisibility(0);
                }
            } else {
                AppCompatTextView appCompatTextView2 = this.f35549u;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setVisibility(8);
                }
                this.f35549u = null;
            }
            this.f35547t = z;
        }
    }

    /* renamed from: A */
    public final void mo42403A() {
        boolean z;
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.f35490G != null && this.f35502M != 0) {
            boolean z2 = false;
            if (isFocused() || ((editText2 = this.f35525f) != null && editText2.hasFocus())) {
                z = true;
            } else {
                z = false;
            }
            if (isHovered() || ((editText = this.f35525f) != null && editText.isHovered())) {
                z2 = true;
            }
            if (!isEnabled()) {
                this.f35512R = this.f35507O0;
            } else if (this.f35531l.mo42623e()) {
                if (this.f35497J0 != null) {
                    mo42575x(z, z2);
                } else {
                    this.f35512R = this.f35531l.mo42625g();
                }
            } else if (!this.f35537o || (appCompatTextView = this.f35539p) == null) {
                if (z) {
                    this.f35512R = this.f35495I0;
                } else if (z2) {
                    this.f35512R = this.f35493H0;
                } else {
                    this.f35512R = this.f35491G0;
                }
            } else if (this.f35497J0 != null) {
                mo42575x(z, z2);
            } else {
                this.f35512R = appCompatTextView.getCurrentTextColor();
            }
            mo42571t();
            C14194n.m35276b(this, this.f35481B0, this.f35483C0);
            C14205s sVar = this.f35522c;
            C14194n.m35276b(sVar.f35661b, sVar.f35664e, sVar.f35665f);
            C14194n.m35276b(this, this.f35546s0, this.f35550u0);
            C14193m endIconDelegate = getEndIconDelegate();
            endIconDelegate.getClass();
            if (endIconDelegate instanceof C14178h) {
                if (!this.f35531l.mo42623e() || getEndIconDrawable() == null) {
                    C14194n.m35275a(this, this.f35546s0, this.f35550u0, this.f35552v0);
                } else {
                    Drawable mutate = C5450a.m13604g(getEndIconDrawable()).mutate();
                    C5450a.C5452b.m13616g(mutate, this.f35531l.mo42625g());
                    this.f35546s0.setImageDrawable(mutate);
                }
            }
            if (this.f35502M == 2) {
                int i = this.f35506O;
                if (!z || !isEnabled()) {
                    this.f35506O = this.f35508P;
                } else {
                    this.f35506O = this.f35510Q;
                }
                if (this.f35506O != i && mo42413f() && !this.f35509P0) {
                    if (mo42413f()) {
                        ((C14177g) this.f35490G).mo42604w(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                    }
                    mo42470k();
                }
            }
            if (this.f35502M == 1) {
                if (!isEnabled()) {
                    this.f35514S = this.f35501L0;
                } else if (z2 && !z) {
                    this.f35514S = this.f35505N0;
                } else if (z) {
                    this.f35514S = this.f35503M0;
                } else {
                    this.f35514S = this.f35499K0;
                }
            }
            mo42407d();
        }
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f35521b.addView(view, layoutParams2);
            this.f35521b.setLayoutParams(layoutParams);
            mo42572u();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public final void mo42405b(C14163f fVar) {
        this.f35540p0.add(fVar);
        if (this.f35525f != null) {
            fVar.mo42588a(this);
        }
    }

    /* renamed from: c */
    public final void mo42406c(float f) {
        if (this.f35511Q0.f35013c != f) {
            if (this.f35517T0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f35517T0 = valueAnimator;
                valueAnimator.setInterpolator(C13577a.f33538b);
                this.f35517T0.setDuration(167);
                this.f35517T0.addUpdateListener(new C14161d());
            }
            this.f35517T0.setFloatValues(new float[]{this.f35511Q0.f35013c, f});
            this.f35517T0.start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b8  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42407d() {
        /*
            r8 = this;
            tc.g r0 = r8.f35490G
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            tc.g$b r1 = r0.f49837b
            tc.k r1 = r1.f49861a
            tc.k r2 = r8.f35496J
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == r2) goto L_0x004a
            r0.setShapeAppearanceModel(r2)
            int r0 = r8.f35542q0
            if (r0 != r3) goto L_0x004a
            int r0 = r8.f35502M
            if (r0 != r4) goto L_0x004a
            android.util.SparseArray<com.google.android.material.textfield.m> r0 = r8.f35544r0
            java.lang.Object r0 = r0.get(r3)
            com.google.android.material.textfield.h r0 = (com.google.android.material.textfield.C14178h) r0
            android.widget.EditText r1 = r8.f35525f
            android.widget.AutoCompleteTextView r1 = (android.widget.AutoCompleteTextView) r1
            r0.getClass()
            android.text.method.KeyListener r2 = r1.getKeyListener()
            if (r2 == 0) goto L_0x0033
            r2 = 1
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            if (r2 != 0) goto L_0x004a
            com.google.android.material.textfield.TextInputLayout r2 = r0.f35621a
            int r2 = r2.getBoxBackgroundMode()
            if (r2 != r4) goto L_0x004a
            android.graphics.drawable.Drawable r2 = r1.getBackground()
            boolean r2 = r2 instanceof android.graphics.drawable.LayerDrawable
            if (r2 != 0) goto L_0x0047
            goto L_0x004a
        L_0x0047:
            r0.mo42606e(r1)
        L_0x004a:
            int r0 = r8.f35502M
            r1 = -1
            if (r0 != r4) goto L_0x005e
            int r0 = r8.f35506O
            if (r0 <= r1) goto L_0x0059
            int r0 = r8.f35512R
            if (r0 == 0) goto L_0x0059
            r0 = 1
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r0 == 0) goto L_0x005e
            r0 = 1
            goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            if (r0 == 0) goto L_0x0076
            tc.g r0 = r8.f35490G
            int r2 = r8.f35506O
            float r2 = (float) r2
            int r4 = r8.f35512R
            tc.g$b r7 = r0.f49837b
            r7.f49871k = r2
            r0.invalidateSelf()
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r4)
            r0.mo52011s(r2)
        L_0x0076:
            int r0 = r8.f35514S
            int r2 = r8.f35502M
            if (r2 != r6) goto L_0x008c
            int r0 = p355ac.C13401b.colorSurface
            android.content.Context r2 = r8.getContext()
            int r0 = com.google.android.play.core.assetpacks.C14256d1.m35486d(r2, r0, r5)
            int r2 = r8.f35514S
            int r0 = p129j1.C5348a.m13413i(r2, r0)
        L_0x008c:
            r8.f35514S = r0
            tc.g r2 = r8.f35490G
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r2.mo52005n(r0)
            int r0 = r8.f35542q0
            if (r0 != r3) goto L_0x00a4
            android.widget.EditText r0 = r8.f35525f
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L_0x00a4:
            tc.g r0 = r8.f35492H
            if (r0 == 0) goto L_0x00de
            tc.g r2 = r8.f35494I
            if (r2 != 0) goto L_0x00ad
            goto L_0x00de
        L_0x00ad:
            int r2 = r8.f35506O
            if (r2 <= r1) goto L_0x00b6
            int r1 = r8.f35512R
            if (r1 == 0) goto L_0x00b6
            r5 = 1
        L_0x00b6:
            if (r5 == 0) goto L_0x00db
            android.widget.EditText r1 = r8.f35525f
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L_0x00c7
            int r1 = r8.f35491G0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto L_0x00cd
        L_0x00c7:
            int r1 = r8.f35512R
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L_0x00cd:
            r0.mo52005n(r1)
            tc.g r0 = r8.f35494I
            int r1 = r8.f35512R
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.mo52005n(r1)
        L_0x00db:
            r8.invalidate()
        L_0x00de:
            r8.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo42407d():void");
    }

    @TargetApi(26)
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f35525f;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f35526g != null) {
            boolean z = this.f35488F;
            this.f35488F = false;
            CharSequence hint = editText.getHint();
            this.f35525f.setHint(this.f35526g);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
            } finally {
                this.f35525f.setHint(hint);
                this.f35488F = z;
            }
        } else {
            viewStructure.setAutofillId(getAutofillId());
            onProvideAutofillStructure(viewStructure, i);
            onProvideAutofillVirtualStructure(viewStructure, i);
            viewStructure.setChildCount(this.f35521b.getChildCount());
            for (int i2 = 0; i2 < this.f35521b.getChildCount(); i2++) {
                View childAt = this.f35521b.getChildAt(i2);
                ViewStructure newChild = viewStructure.newChild(i2);
                childAt.dispatchProvideAutofillStructure(newChild, i);
                if (childAt == this.f35525f) {
                    newChild.setHint(getHint());
                }
            }
        }
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f35520V0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f35520V0 = false;
    }

    public final void draw(Canvas canvas) {
        C19648g gVar;
        super.draw(canvas);
        if (this.f35484D) {
            this.f35511Q0.mo41860d(canvas);
        }
        if (this.f35494I != null && (gVar = this.f35492H) != null) {
            gVar.draw(canvas);
            if (this.f35525f.isFocused()) {
                Rect bounds = this.f35494I.getBounds();
                Rect bounds2 = this.f35492H.getBounds();
                float f = this.f35511Q0.f35013c;
                int centerX = bounds2.centerX();
                bounds.left = C13577a.m33994b(f, centerX, bounds2.left);
                bounds.right = C13577a.m33994b(f, centerX, bounds2.right);
                this.f35494I.draw(canvas);
            }
        }
    }

    public final void drawableStateChanged() {
        boolean z;
        if (!this.f35519U0) {
            boolean z2 = true;
            this.f35519U0 = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            C14047c cVar = this.f35511Q0;
            if (cVar != null) {
                z = cVar.mo41874s(drawableState) | false;
            } else {
                z = false;
            }
            if (this.f35525f != null) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (!C6333d0.C6340g.m15076c(this) || !isEnabled()) {
                    z2 = false;
                }
                mo42573v(z2, false);
            }
            mo42481r();
            mo42403A();
            if (z) {
                invalidate();
            }
            this.f35519U0 = false;
        }
    }

    /* renamed from: e */
    public final int mo42412e() {
        float e;
        if (!this.f35484D) {
            return 0;
        }
        int i = this.f35502M;
        if (i == 0) {
            e = this.f35511Q0.mo41861e();
        } else if (i != 2) {
            return 0;
        } else {
            e = this.f35511Q0.mo41861e() / 2.0f;
        }
        return (int) e;
    }

    /* renamed from: f */
    public final boolean mo42413f() {
        return this.f35484D && !TextUtils.isEmpty(this.f35486E) && (this.f35490G instanceof C14177g);
    }

    /* renamed from: g */
    public final int mo42414g(int i, boolean z) {
        int compoundPaddingLeft = this.f35525f.getCompoundPaddingLeft() + i;
        if (getPrefixText() == null || z) {
            return compoundPaddingLeft;
        }
        return (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    public int getBaseline() {
        EditText editText = this.f35525f;
        if (editText == null) {
            return super.getBaseline();
        }
        return mo42412e() + getPaddingTop() + editText.getBaseline();
    }

    public C19648g getBoxBackground() {
        int i = this.f35502M;
        if (i == 1 || i == 2) {
            return this.f35490G;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f35514S;
    }

    public int getBoxBackgroundMode() {
        return this.f35502M;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f35504N;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (C14083r.m35068d(this)) {
            return this.f35496J.f49894h.mo51983a(this.f35532l0);
        }
        return this.f35496J.f49893g.mo51983a(this.f35532l0);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (C14083r.m35068d(this)) {
            return this.f35496J.f49893g.mo51983a(this.f35532l0);
        }
        return this.f35496J.f49894h.mo51983a(this.f35532l0);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (C14083r.m35068d(this)) {
            return this.f35496J.f49891e.mo51983a(this.f35532l0);
        }
        return this.f35496J.f49892f.mo51983a(this.f35532l0);
    }

    public float getBoxCornerRadiusTopStart() {
        if (C14083r.m35068d(this)) {
            return this.f35496J.f49892f.mo51983a(this.f35532l0);
        }
        return this.f35496J.f49891e.mo51983a(this.f35532l0);
    }

    public int getBoxStrokeColor() {
        return this.f35495I0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f35497J0;
    }

    public int getBoxStrokeWidth() {
        return this.f35508P;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f35510Q;
    }

    public int getCounterMaxLength() {
        return this.f35535n;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (!this.f35533m || !this.f35537o || (appCompatTextView = this.f35539p) == null) {
            return null;
        }
        return appCompatTextView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f35559z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f35559z;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f35487E0;
    }

    public EditText getEditText() {
        return this.f35525f;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f35546s0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f35546s0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f35542q0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f35546s0;
    }

    public CharSequence getError() {
        C14195o oVar = this.f35531l;
        if (oVar.f35635k) {
            return oVar.f35634j;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f35531l.f35637m;
    }

    public int getErrorCurrentTextColors() {
        return this.f35531l.mo42625g();
    }

    public Drawable getErrorIconDrawable() {
        return this.f35481B0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f35531l.mo42625g();
    }

    public CharSequence getHelperText() {
        C14195o oVar = this.f35531l;
        if (oVar.f35641q) {
            return oVar.f35640p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.f35531l.f35642r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f35484D) {
            return this.f35486E;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f35511Q0.mo41861e();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C14047c cVar = this.f35511Q0;
        return cVar.mo41862f(cVar.f35039p);
    }

    public ColorStateList getHintTextColor() {
        return this.f35489F0;
    }

    public int getMaxEms() {
        return this.f35528i;
    }

    public int getMaxWidth() {
        return this.f35530k;
    }

    public int getMinEms() {
        return this.f35527h;
    }

    public int getMinWidth() {
        return this.f35529j;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f35546s0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f35546s0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f35547t) {
            return this.f35545s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f35553w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f35551v;
    }

    public CharSequence getPrefixText() {
        return this.f35522c.f35663d;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f35522c.f35662c.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f35522c.f35662c;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f35522c.f35664e.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f35522c.f35664e.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.f35480B;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f35482C.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f35482C;
    }

    public Typeface getTypeface() {
        return this.f35534m0;
    }

    /* renamed from: h */
    public final int mo42467h(int i, boolean z) {
        int compoundPaddingRight = i - this.f35525f.getCompoundPaddingRight();
        if (getPrefixText() == null || !z) {
            return compoundPaddingRight;
        }
        return compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    /* renamed from: i */
    public final boolean mo42468i() {
        return this.f35524e.getVisibility() == 0 && this.f35546s0.getVisibility() == 0;
    }

    /* renamed from: j */
    public final void mo42469j() {
        boolean z;
        boolean z2;
        int i = this.f35502M;
        boolean z3 = true;
        if (i == 0) {
            this.f35490G = null;
            this.f35492H = null;
            this.f35494I = null;
        } else if (i == 1) {
            this.f35490G = new C19648g(this.f35496J);
            this.f35492H = new C19648g();
            this.f35494I = new C19648g();
        } else if (i == 2) {
            if (!this.f35484D || (this.f35490G instanceof C14177g)) {
                this.f35490G = new C19648g(this.f35496J);
            } else {
                this.f35490G = new C14177g(this.f35496J);
            }
            this.f35492H = null;
            this.f35494I = null;
        } else {
            throw new IllegalArgumentException(C13437d.m33707l(new StringBuilder(), this.f35502M, " is illegal; only @BoxBackgroundMode constants are supported."));
        }
        EditText editText = this.f35525f;
        if (editText == null || this.f35490G == null || editText.getBackground() != null || this.f35502M == 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            EditText editText2 = this.f35525f;
            C19648g gVar = this.f35490G;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15057q(editText2, gVar);
        }
        mo42403A();
        if (this.f35502M == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.f35504N = getResources().getDimensionPixelSize(C13403d.material_font_2_0_box_collapsed_padding_top);
            } else if (C19099c.m46251e(getContext())) {
                this.f35504N = getResources().getDimensionPixelSize(C13403d.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f35525f != null && this.f35502M == 1) {
            if (getContext().getResources().getConfiguration().fontScale < 2.0f) {
                z3 = false;
            }
            if (z3) {
                EditText editText3 = this.f35525f;
                WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                C6333d0.C6338e.m15070k(editText3, C6333d0.C6338e.m15065f(editText3), getResources().getDimensionPixelSize(C13403d.material_filled_edittext_font_2_0_padding_top), C6333d0.C6338e.m15064e(this.f35525f), getResources().getDimensionPixelSize(C13403d.material_filled_edittext_font_2_0_padding_bottom));
            } else if (C19099c.m46251e(getContext())) {
                EditText editText4 = this.f35525f;
                WeakHashMap<View, C6382p0> weakHashMap3 = C6333d0.f19990a;
                C6333d0.C6338e.m15070k(editText4, C6333d0.C6338e.m15065f(editText4), getResources().getDimensionPixelSize(C13403d.material_filled_edittext_font_1_3_padding_top), C6333d0.C6338e.m15064e(this.f35525f), getResources().getDimensionPixelSize(C13403d.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f35502M != 0) {
            mo42572u();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0085  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42470k() {
        /*
            r13 = this;
            boolean r0 = r13.mo42413f()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.graphics.RectF r0 = r13.f35532l0
            com.google.android.material.internal.c r1 = r13.f35511Q0
            android.widget.EditText r2 = r13.f35525f
            int r2 = r2.getWidth()
            android.widget.EditText r3 = r13.f35525f
            int r3 = r3.getGravity()
            java.lang.CharSequence r4 = r1.f34989G
            boolean r4 = r1.mo41858b(r4)
            r1.f34991I = r4
            r5 = 8388613(0x800005, float:1.175495E-38)
            r6 = 1
            r7 = 17
            r8 = 1073741824(0x40000000, float:2.0)
            r9 = 5
            if (r3 == r7) goto L_0x0053
            r10 = r3 & 7
            if (r10 != r6) goto L_0x002f
            goto L_0x0053
        L_0x002f:
            r10 = r3 & r5
            if (r10 == r5) goto L_0x0045
            r10 = r3 & 5
            if (r10 != r9) goto L_0x0038
            goto L_0x0045
        L_0x0038:
            android.graphics.Rect r10 = r1.f35025i
            if (r4 == 0) goto L_0x0042
            int r10 = r10.right
            float r10 = (float) r10
            float r11 = r1.f35028j0
            goto L_0x0058
        L_0x0042:
            int r10 = r10.left
            goto L_0x004b
        L_0x0045:
            android.graphics.Rect r10 = r1.f35025i
            if (r4 == 0) goto L_0x004d
            int r10 = r10.left
        L_0x004b:
            float r10 = (float) r10
            goto L_0x0059
        L_0x004d:
            int r10 = r10.right
            float r10 = (float) r10
            float r11 = r1.f35028j0
            goto L_0x0058
        L_0x0053:
            float r10 = (float) r2
            float r10 = r10 / r8
            float r11 = r1.f35028j0
            float r11 = r11 / r8
        L_0x0058:
            float r10 = r10 - r11
        L_0x0059:
            r0.left = r10
            android.graphics.Rect r11 = r1.f35025i
            int r12 = r11.top
            float r12 = (float) r12
            r0.top = r12
            if (r3 == r7) goto L_0x0085
            r7 = r3 & 7
            if (r7 != r6) goto L_0x0069
            goto L_0x0085
        L_0x0069:
            r2 = r3 & r5
            if (r2 == r5) goto L_0x007b
            r2 = r3 & 5
            if (r2 != r9) goto L_0x0072
            goto L_0x007b
        L_0x0072:
            if (r4 == 0) goto L_0x0077
            int r2 = r11.right
            goto L_0x0083
        L_0x0077:
            float r2 = r1.f35028j0
            float r2 = r2 + r10
            goto L_0x008b
        L_0x007b:
            if (r4 == 0) goto L_0x0081
            float r2 = r1.f35028j0
            float r2 = r2 + r10
            goto L_0x008b
        L_0x0081:
            int r2 = r11.right
        L_0x0083:
            float r2 = (float) r2
            goto L_0x008b
        L_0x0085:
            float r2 = (float) r2
            float r2 = r2 / r8
            float r3 = r1.f35028j0
            float r3 = r3 / r8
            float r2 = r2 + r3
        L_0x008b:
            r0.right = r2
            float r1 = r1.mo41861e()
            float r1 = r1 + r12
            r0.bottom = r1
            float r1 = r0.left
            int r2 = r13.f35500L
            float r2 = (float) r2
            float r1 = r1 - r2
            r0.left = r1
            float r1 = r0.right
            float r1 = r1 + r2
            r0.right = r1
            int r1 = r13.getPaddingLeft()
            int r1 = -r1
            float r1 = (float) r1
            int r2 = r13.getPaddingTop()
            int r2 = -r2
            float r2 = (float) r2
            float r3 = r0.height()
            float r3 = r3 / r8
            float r2 = r2 - r3
            int r3 = r13.f35506O
            float r3 = (float) r3
            float r2 = r2 + r3
            r0.offset(r1, r2)
            tc.g r1 = r13.f35490G
            com.google.android.material.textfield.g r1 = (com.google.android.material.textfield.C14177g) r1
            r1.getClass()
            float r2 = r0.left
            float r3 = r0.top
            float r4 = r0.right
            float r0 = r0.bottom
            r1.mo42604w(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo42470k():void");
    }

    /* renamed from: n */
    public final void mo42471n(TextView textView, int i) {
        boolean z = true;
        try {
            C0801k.m2424f(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C0801k.m2424f(textView, C13410k.TextAppearance_AppCompat_Caption);
            textView.setTextColor(C4732a.getColor(getContext(), C13402c.design_error));
        }
    }

    /* renamed from: o */
    public final void mo42472o(int i) {
        boolean z;
        int i2;
        boolean z2 = this.f35537o;
        int i3 = this.f35535n;
        String str = null;
        if (i3 == -1) {
            this.f35539p.setText(String.valueOf(i));
            this.f35539p.setContentDescription((CharSequence) null);
            this.f35537o = false;
        } else {
            if (i > i3) {
                z = true;
            } else {
                z = false;
            }
            this.f35537o = z;
            Context context = getContext();
            AppCompatTextView appCompatTextView = this.f35539p;
            int i4 = this.f35535n;
            if (this.f35537o) {
                i2 = C13409j.character_counter_overflowed_content_description;
            } else {
                i2 = C13409j.character_counter_content_description;
            }
            appCompatTextView.setContentDescription(context.getString(i2, new Object[]{Integer.valueOf(i), Integer.valueOf(i4)}));
            if (z2 != this.f35537o) {
                mo42479p();
            }
            C6131a c = C6131a.m14691c();
            AppCompatTextView appCompatTextView2 = this.f35539p;
            String string = getContext().getString(C13409j.character_counter_pattern, new Object[]{Integer.valueOf(i), Integer.valueOf(this.f35535n)});
            C6137d dVar = c.f19491c;
            if (string != null) {
                str = c.mo22099d(string, dVar).toString();
            }
            appCompatTextView2.setText(str);
        }
        if (this.f35525f != null && z2 != this.f35537o) {
            mo42573v(false, false);
            mo42403A();
            mo42481r();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f35511Q0.mo41863h(configuration);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f35525f;
        if (editText != null) {
            Rect rect = this.f35516T;
            C14050d.m35033a(this, editText, rect);
            C19648g gVar = this.f35492H;
            if (gVar != null) {
                int i7 = rect.bottom;
                gVar.setBounds(rect.left, i7 - this.f35508P, rect.right, i7);
            }
            C19648g gVar2 = this.f35494I;
            if (gVar2 != null) {
                int i8 = rect.bottom;
                gVar2.setBounds(rect.left, i8 - this.f35510Q, rect.right, i8);
            }
            if (this.f35484D) {
                C14047c cVar = this.f35511Q0;
                float textSize = this.f35525f.getTextSize();
                if (cVar.f35033m != textSize) {
                    cVar.f35033m = textSize;
                    cVar.mo41865j(false);
                }
                int gravity = this.f35525f.getGravity();
                this.f35511Q0.mo41868m((gravity & -113) | 48);
                C14047c cVar2 = this.f35511Q0;
                if (cVar2.f35029k != gravity) {
                    cVar2.f35029k = gravity;
                    cVar2.mo41865j(false);
                }
                C14047c cVar3 = this.f35511Q0;
                if (this.f35525f != null) {
                    Rect rect2 = this.f35518U;
                    boolean d = C14083r.m35068d(this);
                    rect2.bottom = rect.bottom;
                    int i9 = this.f35502M;
                    if (i9 == 1) {
                        rect2.left = mo42414g(rect.left, d);
                        rect2.top = rect.top + this.f35504N;
                        rect2.right = mo42467h(rect.right, d);
                    } else if (i9 != 2) {
                        rect2.left = mo42414g(rect.left, d);
                        rect2.top = getPaddingTop();
                        rect2.right = mo42467h(rect.right, d);
                    } else {
                        rect2.left = this.f35525f.getPaddingLeft() + rect.left;
                        rect2.top = rect.top - mo42412e();
                        rect2.right = rect.right - this.f35525f.getPaddingRight();
                    }
                    cVar3.getClass();
                    int i11 = rect2.left;
                    int i12 = rect2.top;
                    int i13 = rect2.right;
                    int i14 = rect2.bottom;
                    Rect rect3 = cVar3.f35025i;
                    if (rect3.left == i11 && rect3.top == i12 && rect3.right == i13 && rect3.bottom == i14) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        rect3.set(i11, i12, i13, i14);
                        cVar3.f35001S = true;
                        cVar3.mo41864i();
                    }
                    C14047c cVar4 = this.f35511Q0;
                    if (this.f35525f != null) {
                        Rect rect4 = this.f35518U;
                        TextPaint textPaint = cVar4.f35003U;
                        textPaint.setTextSize(cVar4.f35033m);
                        textPaint.setTypeface(cVar4.f34983A);
                        textPaint.setLetterSpacing(cVar4.f35022g0);
                        float f = -cVar4.f35003U.ascent();
                        rect4.left = this.f35525f.getCompoundPaddingLeft() + rect.left;
                        if (this.f35502M != 1 || this.f35525f.getMinLines() > 1) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            i5 = (int) (((float) rect.centerY()) - (f / 2.0f));
                        } else {
                            i5 = rect.top + this.f35525f.getCompoundPaddingTop();
                        }
                        rect4.top = i5;
                        rect4.right = rect.right - this.f35525f.getCompoundPaddingRight();
                        if (this.f35502M != 1 || this.f35525f.getMinLines() > 1) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (z4) {
                            i6 = (int) (((float) rect4.top) + f);
                        } else {
                            i6 = rect.bottom - this.f35525f.getCompoundPaddingBottom();
                        }
                        rect4.bottom = i6;
                        int i15 = rect4.left;
                        int i16 = rect4.top;
                        int i17 = rect4.right;
                        Rect rect5 = cVar4.f35023h;
                        if (rect5.left == i15 && rect5.top == i16 && rect5.right == i17 && rect5.bottom == i6) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z5) {
                            rect5.set(i15, i16, i17, i6);
                            cVar4.f35001S = true;
                            cVar4.mo41864i();
                        }
                        this.f35511Q0.mo41865j(false);
                        if (mo42413f() && !this.f35509P0) {
                            mo42470k();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        boolean z;
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        if (this.f35525f != null && this.f35525f.getMeasuredHeight() < (max = Math.max(this.f35523d.getMeasuredHeight(), this.f35522c.getMeasuredHeight()))) {
            this.f35525f.setMinimumHeight(max);
            z = true;
        } else {
            z = false;
        }
        boolean q = mo42480q();
        if (z || q) {
            this.f35525f.post(new C14160c());
        }
        if (!(this.f35549u == null || (editText = this.f35525f) == null)) {
            this.f35549u.setGravity(editText.getGravity());
            this.f35549u.setPadding(this.f35525f.getCompoundPaddingLeft(), this.f35525f.getCompoundPaddingTop(), this.f35525f.getCompoundPaddingRight(), this.f35525f.getCompoundPaddingBottom());
        }
        mo42576y();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.f35561b);
        if (savedState.f35562c) {
            this.f35546s0.post(new C14159b());
        }
        setHint(savedState.f35563d);
        setHelperText(savedState.f35564e);
        setPlaceholderText(savedState.f35565f);
        requestLayout();
    }

    public final void onRtlPropertiesChanged(int i) {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        super.onRtlPropertiesChanged(i);
        boolean z2 = false;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = this.f35498K;
        if (z != z3) {
            if (z && !z3) {
                z2 = true;
            }
            float a = this.f35496J.f49891e.mo51983a(this.f35532l0);
            float a2 = this.f35496J.f49892f.mo51983a(this.f35532l0);
            float a3 = this.f35496J.f49894h.mo51983a(this.f35532l0);
            float a4 = this.f35496J.f49893g.mo51983a(this.f35532l0);
            if (z2) {
                f = a;
            } else {
                f = a2;
            }
            if (z2) {
                a = a2;
            }
            if (z2) {
                f2 = a3;
            } else {
                f2 = a4;
            }
            if (z2) {
                a3 = a4;
            }
            boolean d = C14083r.m35068d(this);
            this.f35498K = d;
            if (d) {
                f3 = a;
            } else {
                f3 = f;
            }
            if (!d) {
                f = a;
            }
            if (d) {
                f4 = a3;
            } else {
                f4 = f2;
            }
            if (!d) {
                f2 = a3;
            }
            C19648g gVar = this.f35490G;
            if (gVar != null && gVar.mo52000j() == f3) {
                C19648g gVar2 = this.f35490G;
                if (gVar2.f49837b.f49861a.f49892f.mo51983a(gVar2.mo51997h()) == f) {
                    C19648g gVar3 = this.f35490G;
                    if (gVar3.f49837b.f49861a.f49894h.mo51983a(gVar3.mo51997h()) == f4) {
                        C19648g gVar4 = this.f35490G;
                        if (gVar4.f49837b.f49861a.f49893g.mo51983a(gVar4.mo51997h()) == f2) {
                            return;
                        }
                    }
                }
            }
            C19654k kVar = this.f35496J;
            kVar.getClass();
            C19654k.C19655a aVar = new C19654k.C19655a(kVar);
            aVar.mo52026f(f3);
            aVar.mo52027g(f);
            aVar.mo52024d(f4);
            aVar.mo52025e(f2);
            this.f35496J = new C19654k(aVar);
            mo42407d();
        }
    }

    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f35531l.mo42623e()) {
            savedState.f35561b = getError();
        }
        boolean z2 = true;
        if (this.f35542q0 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !this.f35546s0.isChecked()) {
            z2 = false;
        }
        savedState.f35562c = z2;
        savedState.f35563d = getHint();
        savedState.f35564e = getHelperText();
        savedState.f35565f = getPlaceholderText();
        return savedState;
    }

    /* renamed from: p */
    public final void mo42479p() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.f35539p;
        if (appCompatTextView != null) {
            if (this.f35537o) {
                i = this.f35541q;
            } else {
                i = this.f35543r;
            }
            mo42471n(appCompatTextView, i);
            if (!this.f35537o && (colorStateList2 = this.f35559z) != null) {
                this.f35539p.setTextColor(colorStateList2);
            }
            if (this.f35537o && (colorStateList = this.f35478A) != null) {
                this.f35539p.setTextColor(colorStateList);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0095, code lost:
        if (mo42468i() != false) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0099, code lost:
        if (r10.f35480B != null) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0110  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo42480q() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f35525f
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 1
            if (r0 != 0) goto L_0x001d
            java.lang.CharSequence r0 = r10.getPrefixText()
            if (r0 == 0) goto L_0x0027
            android.widget.TextView r0 = r10.getPrefixTextView()
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0027
        L_0x001d:
            com.google.android.material.textfield.s r0 = r10.f35522c
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            r3 = 0
            r4 = 2
            r5 = 3
            if (r0 == 0) goto L_0x0066
            com.google.android.material.textfield.s r0 = r10.f35522c
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f35525f
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.ColorDrawable r6 = r10.f35536n0
            if (r6 == 0) goto L_0x0042
            int r6 = r10.f35538o0
            if (r6 == r0) goto L_0x004e
        L_0x0042:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.f35536n0 = r6
            r10.f35538o0 = r0
            r6.setBounds(r1, r1, r0, r2)
        L_0x004e:
            android.widget.EditText r0 = r10.f35525f
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C0801k.C0803b.m2430a(r0)
            r6 = r0[r1]
            android.graphics.drawable.ColorDrawable r7 = r10.f35536n0
            if (r6 == r7) goto L_0x007f
            android.widget.EditText r6 = r10.f35525f
            r8 = r0[r2]
            r9 = r0[r4]
            r0 = r0[r5]
            androidx.core.widget.C0801k.C0803b.m2434e(r6, r7, r8, r9, r0)
            goto L_0x007d
        L_0x0066:
            android.graphics.drawable.ColorDrawable r0 = r10.f35536n0
            if (r0 == 0) goto L_0x007f
            android.widget.EditText r0 = r10.f35525f
            android.graphics.drawable.Drawable[] r0 = androidx.core.widget.C0801k.C0803b.m2430a(r0)
            android.widget.EditText r6 = r10.f35525f
            r7 = r0[r2]
            r8 = r0[r4]
            r0 = r0[r5]
            androidx.core.widget.C0801k.C0803b.m2434e(r6, r3, r7, r8, r0)
            r10.f35536n0 = r3
        L_0x007d:
            r0 = 1
            goto L_0x0080
        L_0x007f:
            r0 = 0
        L_0x0080:
            com.google.android.material.internal.CheckableImageButton r6 = r10.f35481B0
            int r6 = r6.getVisibility()
            if (r6 == 0) goto L_0x009b
            int r6 = r10.f35542q0
            if (r6 == 0) goto L_0x008e
            r6 = 1
            goto L_0x008f
        L_0x008e:
            r6 = 0
        L_0x008f:
            if (r6 == 0) goto L_0x0097
            boolean r6 = r10.mo42468i()
            if (r6 != 0) goto L_0x009b
        L_0x0097:
            java.lang.CharSequence r6 = r10.f35480B
            if (r6 == 0) goto L_0x00a5
        L_0x009b:
            android.widget.LinearLayout r6 = r10.f35523d
            int r6 = r6.getMeasuredWidth()
            if (r6 <= 0) goto L_0x00a5
            r6 = 1
            goto L_0x00a6
        L_0x00a5:
            r6 = 0
        L_0x00a6:
            if (r6 == 0) goto L_0x0110
            androidx.appcompat.widget.AppCompatTextView r3 = r10.f35482C
            int r3 = r3.getMeasuredWidth()
            android.widget.EditText r6 = r10.f35525f
            int r6 = r6.getPaddingRight()
            int r3 = r3 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x00cb
            int r7 = r6.getMeasuredWidth()
            int r7 = r7 + r3
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r3 = p242s1.C6362h.m15167c(r3)
            int r3 = r3 + r7
        L_0x00cb:
            android.widget.EditText r6 = r10.f35525f
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C0801k.C0803b.m2430a(r6)
            android.graphics.drawable.ColorDrawable r7 = r10.f35554w0
            if (r7 == 0) goto L_0x00ec
            int r8 = r10.f35556x0
            if (r8 == r3) goto L_0x00ec
            r10.f35556x0 = r3
            r7.setBounds(r1, r1, r3, r2)
            android.widget.EditText r0 = r10.f35525f
            r1 = r6[r1]
            r3 = r6[r2]
            android.graphics.drawable.ColorDrawable r4 = r10.f35554w0
            r5 = r6[r5]
            androidx.core.widget.C0801k.C0803b.m2434e(r0, r1, r3, r4, r5)
            goto L_0x0131
        L_0x00ec:
            if (r7 != 0) goto L_0x00fa
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.f35554w0 = r7
            r10.f35556x0 = r3
            r7.setBounds(r1, r1, r3, r2)
        L_0x00fa:
            r3 = r6[r4]
            android.graphics.drawable.ColorDrawable r4 = r10.f35554w0
            if (r3 == r4) goto L_0x010e
            r10.f35558y0 = r3
            android.widget.EditText r0 = r10.f35525f
            r1 = r6[r1]
            r3 = r6[r2]
            r5 = r6[r5]
            androidx.core.widget.C0801k.C0803b.m2434e(r0, r1, r3, r4, r5)
            goto L_0x0131
        L_0x010e:
            r2 = r0
            goto L_0x0131
        L_0x0110:
            android.graphics.drawable.ColorDrawable r6 = r10.f35554w0
            if (r6 == 0) goto L_0x0132
            android.widget.EditText r6 = r10.f35525f
            android.graphics.drawable.Drawable[] r6 = androidx.core.widget.C0801k.C0803b.m2430a(r6)
            r4 = r6[r4]
            android.graphics.drawable.ColorDrawable r7 = r10.f35554w0
            if (r4 != r7) goto L_0x012e
            android.widget.EditText r0 = r10.f35525f
            r1 = r6[r1]
            r4 = r6[r2]
            android.graphics.drawable.Drawable r7 = r10.f35558y0
            r5 = r6[r5]
            androidx.core.widget.C0801k.C0803b.m2434e(r0, r1, r4, r7, r5)
            goto L_0x012f
        L_0x012e:
            r2 = r0
        L_0x012f:
            r10.f35554w0 = r3
        L_0x0131:
            r0 = r2
        L_0x0132:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo42480q():boolean");
    }

    /* renamed from: r */
    public final void mo42481r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.f35525f;
        if (editText != null && this.f35502M == 0 && (background = editText.getBackground()) != null) {
            int[] iArr = C0418j0.f1525a;
            Drawable mutate = background.mutate();
            if (this.f35531l.mo42623e()) {
                mutate.setColorFilter(C0407g.m1026c(this.f35531l.mo42625g(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f35537o || (appCompatTextView = this.f35539p) == null) {
                C5450a.m13598a(mutate);
                this.f35525f.refreshDrawableState();
            } else {
                mutate.setColorFilter(C0407g.m1026c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0049  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42482s() {
        /*
            r5 = this;
            android.widget.FrameLayout r0 = r5.f35524e
            com.google.android.material.internal.CheckableImageButton r1 = r5.f35546s0
            int r1 = r1.getVisibility()
            r2 = 1
            r3 = 8
            r4 = 0
            if (r1 != 0) goto L_0x001d
            com.google.android.material.internal.CheckableImageButton r1 = r5.f35481B0
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0018
            r1 = 1
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            if (r1 != 0) goto L_0x001d
            r1 = 0
            goto L_0x001f
        L_0x001d:
            r1 = 8
        L_0x001f:
            r0.setVisibility(r1)
            java.lang.CharSequence r0 = r5.f35480B
            if (r0 == 0) goto L_0x002c
            boolean r0 = r5.f35509P0
            if (r0 != 0) goto L_0x002c
            r0 = 0
            goto L_0x002e
        L_0x002c:
            r0 = 8
        L_0x002e:
            boolean r1 = r5.mo42468i()
            if (r1 != 0) goto L_0x0045
            com.google.android.material.internal.CheckableImageButton r1 = r5.f35481B0
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x003e
            r1 = 1
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            if (r1 != 0) goto L_0x0045
            if (r0 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r2 = 0
        L_0x0045:
            android.widget.LinearLayout r0 = r5.f35523d
            if (r2 == 0) goto L_0x004a
            r3 = 0
        L_0x004a:
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo42482s():void");
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f35514S != i) {
            this.f35514S = i;
            this.f35499K0 = i;
            this.f35503M0 = i;
            this.f35505N0 = i;
            mo42407d();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C4732a.getColor(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f35499K0 = defaultColor;
        this.f35514S = defaultColor;
        this.f35501L0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f35503M0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f35505N0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        mo42407d();
    }

    public void setBoxBackgroundMode(int i) {
        if (i != this.f35502M) {
            this.f35502M = i;
            if (this.f35525f != null) {
                mo42469j();
            }
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f35504N = i;
    }

    public void setBoxStrokeColor(int i) {
        if (this.f35495I0 != i) {
            this.f35495I0 = i;
            mo42403A();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f35491G0 = colorStateList.getDefaultColor();
            this.f35507O0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f35493H0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f35495I0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f35495I0 != colorStateList.getDefaultColor()) {
            this.f35495I0 = colorStateList.getDefaultColor();
        }
        mo42403A();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f35497J0 != colorStateList) {
            this.f35497J0 = colorStateList;
            mo42403A();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f35508P = i;
        mo42403A();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f35510Q = i;
        mo42403A();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        int i;
        if (this.f35533m != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
                this.f35539p = appCompatTextView;
                appCompatTextView.setId(C13405f.textinput_counter);
                Typeface typeface = this.f35534m0;
                if (typeface != null) {
                    this.f35539p.setTypeface(typeface);
                }
                this.f35539p.setMaxLines(1);
                this.f35531l.mo42619a(this.f35539p, 2);
                C6362h.m15172h((ViewGroup.MarginLayoutParams) this.f35539p.getLayoutParams(), getResources().getDimensionPixelOffset(C13403d.mtrl_textinput_counter_margin_start));
                mo42479p();
                if (this.f35539p != null) {
                    EditText editText = this.f35525f;
                    if (editText == null) {
                        i = 0;
                    } else {
                        i = editText.getText().length();
                    }
                    mo42472o(i);
                }
            } else {
                this.f35531l.mo42627i(this.f35539p, 2);
                this.f35539p = null;
            }
            this.f35533m = z;
        }
    }

    public void setCounterMaxLength(int i) {
        int i2;
        if (this.f35535n != i) {
            if (i > 0) {
                this.f35535n = i;
            } else {
                this.f35535n = -1;
            }
            if (this.f35533m && this.f35539p != null) {
                EditText editText = this.f35525f;
                if (editText == null) {
                    i2 = 0;
                } else {
                    i2 = editText.getText().length();
                }
                mo42472o(i2);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f35541q != i) {
            this.f35541q = i;
            mo42479p();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f35478A != colorStateList) {
            this.f35478A = colorStateList;
            mo42479p();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f35543r != i) {
            this.f35543r = i;
            mo42479p();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f35559z != colorStateList) {
            this.f35559z = colorStateList;
            mo42479p();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f35487E0 = colorStateList;
        this.f35489F0 = colorStateList;
        if (this.f35525f != null) {
            mo42573v(false, false);
        }
    }

    public void setEnabled(boolean z) {
        m35227l(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f35546s0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f35546s0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C5344a.m13397a(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        boolean z;
        int i2 = this.f35542q0;
        if (i2 != i) {
            this.f35542q0 = i;
            Iterator<C14164g> it = this.f35548t0.iterator();
            while (it.hasNext()) {
                it.next().mo42589a(this, i2);
            }
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            setEndIconVisible(z);
            if (getEndIconDelegate().mo42605b(this.f35502M)) {
                getEndIconDelegate().mo42590a();
                C14194n.m35275a(this, this.f35546s0, this.f35550u0, this.f35552v0);
                return;
            }
            StringBuilder k = C13555b.m33972k("The current box background mode ");
            k.append(this.f35502M);
            k.append(" is not supported by the end icon mode ");
            k.append(i);
            throw new IllegalStateException(k.toString());
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f35546s0;
        View.OnLongClickListener onLongClickListener = this.f35560z0;
        checkableImageButton.setOnClickListener(onClickListener);
        m35228m(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f35560z0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f35546s0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m35228m(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f35550u0 != colorStateList) {
            this.f35550u0 = colorStateList;
            C14194n.m35275a(this, this.f35546s0, colorStateList, this.f35552v0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f35552v0 != mode) {
            this.f35552v0 = mode;
            C14194n.m35275a(this, this.f35546s0, this.f35550u0, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        int i;
        if (mo42468i() != z) {
            CheckableImageButton checkableImageButton = this.f35546s0;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            mo42482s();
            mo42576y();
            mo42480q();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f35531l.f35635k) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C14195o oVar = this.f35531l;
            oVar.mo42621c();
            oVar.f35634j = charSequence;
            oVar.f35636l.setText(charSequence);
            int i = oVar.f35632h;
            if (i != 1) {
                oVar.f35633i = 1;
            }
            oVar.mo42629k(i, oVar.f35633i, oVar.mo42628j(oVar.f35636l, charSequence));
            return;
        }
        this.f35531l.mo42626h();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C14195o oVar = this.f35531l;
        oVar.f35637m = charSequence;
        AppCompatTextView appCompatTextView = oVar.f35636l;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        C14195o oVar = this.f35531l;
        if (oVar.f35635k != z) {
            oVar.mo42621c();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(oVar.f35625a, (AttributeSet) null);
                oVar.f35636l = appCompatTextView;
                appCompatTextView.setId(C13405f.textinput_error);
                oVar.f35636l.setTextAlignment(5);
                Typeface typeface = oVar.f35645u;
                if (typeface != null) {
                    oVar.f35636l.setTypeface(typeface);
                }
                int i = oVar.f35638n;
                oVar.f35638n = i;
                AppCompatTextView appCompatTextView2 = oVar.f35636l;
                if (appCompatTextView2 != null) {
                    oVar.f35626b.mo42471n(appCompatTextView2, i);
                }
                ColorStateList colorStateList = oVar.f35639o;
                oVar.f35639o = colorStateList;
                AppCompatTextView appCompatTextView3 = oVar.f35636l;
                if (!(appCompatTextView3 == null || colorStateList == null)) {
                    appCompatTextView3.setTextColor(colorStateList);
                }
                CharSequence charSequence = oVar.f35637m;
                oVar.f35637m = charSequence;
                AppCompatTextView appCompatTextView4 = oVar.f35636l;
                if (appCompatTextView4 != null) {
                    appCompatTextView4.setContentDescription(charSequence);
                }
                oVar.f35636l.setVisibility(4);
                AppCompatTextView appCompatTextView5 = oVar.f35636l;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6340g.m15079f(appCompatTextView5, 1);
                oVar.mo42619a(oVar.f35636l, 0);
            } else {
                oVar.mo42626h();
                oVar.mo42627i(oVar.f35636l, 0);
                oVar.f35636l = null;
                oVar.f35626b.mo42481r();
                oVar.f35626b.mo42403A();
            }
            oVar.f35635k = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C5344a.m13397a(getContext(), i) : null);
        C14194n.m35276b(this, this.f35481B0, this.f35483C0);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f35481B0;
        View.OnLongClickListener onLongClickListener = this.f35479A0;
        checkableImageButton.setOnClickListener(onClickListener);
        m35228m(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f35479A0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f35481B0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m35228m(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.f35483C0 != colorStateList) {
            this.f35483C0 = colorStateList;
            C14194n.m35275a(this, this.f35481B0, colorStateList, this.f35485D0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.f35485D0 != mode) {
            this.f35485D0 = mode;
            C14194n.m35275a(this, this.f35481B0, this.f35483C0, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C14195o oVar = this.f35531l;
        oVar.f35638n = i;
        AppCompatTextView appCompatTextView = oVar.f35636l;
        if (appCompatTextView != null) {
            oVar.f35626b.mo42471n(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C14195o oVar = this.f35531l;
        oVar.f35639o = colorStateList;
        AppCompatTextView appCompatTextView = oVar.f35636l;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f35513R0 != z) {
            this.f35513R0 = z;
            mo42573v(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.f35531l.f35641q) {
                setHelperTextEnabled(true);
            }
            C14195o oVar = this.f35531l;
            oVar.mo42621c();
            oVar.f35640p = charSequence;
            oVar.f35642r.setText(charSequence);
            int i = oVar.f35632h;
            if (i != 2) {
                oVar.f35633i = 2;
            }
            oVar.mo42629k(i, oVar.f35633i, oVar.mo42628j(oVar.f35642r, charSequence));
        } else if (this.f35531l.f35641q) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C14195o oVar = this.f35531l;
        oVar.f35644t = colorStateList;
        AppCompatTextView appCompatTextView = oVar.f35642r;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        C14195o oVar = this.f35531l;
        if (oVar.f35641q != z) {
            oVar.mo42621c();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(oVar.f35625a, (AttributeSet) null);
                oVar.f35642r = appCompatTextView;
                appCompatTextView.setId(C13405f.textinput_helper_text);
                oVar.f35642r.setTextAlignment(5);
                Typeface typeface = oVar.f35645u;
                if (typeface != null) {
                    oVar.f35642r.setTypeface(typeface);
                }
                oVar.f35642r.setVisibility(4);
                AppCompatTextView appCompatTextView2 = oVar.f35642r;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6340g.m15079f(appCompatTextView2, 1);
                int i = oVar.f35643s;
                oVar.f35643s = i;
                AppCompatTextView appCompatTextView3 = oVar.f35642r;
                if (appCompatTextView3 != null) {
                    C0801k.m2424f(appCompatTextView3, i);
                }
                ColorStateList colorStateList = oVar.f35644t;
                oVar.f35644t = colorStateList;
                AppCompatTextView appCompatTextView4 = oVar.f35642r;
                if (!(appCompatTextView4 == null || colorStateList == null)) {
                    appCompatTextView4.setTextColor(colorStateList);
                }
                oVar.mo42619a(oVar.f35642r, 1);
                oVar.f35642r.setAccessibilityDelegate(new C14197p(oVar));
            } else {
                oVar.mo42621c();
                int i2 = oVar.f35632h;
                if (i2 == 2) {
                    oVar.f35633i = 0;
                }
                oVar.mo42629k(i2, oVar.f35633i, oVar.mo42628j(oVar.f35642r, ""));
                oVar.mo42627i(oVar.f35642r, 1);
                oVar.f35642r = null;
                oVar.f35626b.mo42481r();
                oVar.f35626b.mo42403A();
            }
            oVar.f35641q = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        C14195o oVar = this.f35531l;
        oVar.f35643s = i;
        AppCompatTextView appCompatTextView = oVar.f35642r;
        if (appCompatTextView != null) {
            C0801k.m2424f(appCompatTextView, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f35484D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f35515S0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f35484D) {
            this.f35484D = z;
            if (!z) {
                this.f35488F = false;
                if (!TextUtils.isEmpty(this.f35486E) && TextUtils.isEmpty(this.f35525f.getHint())) {
                    this.f35525f.setHint(this.f35486E);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f35525f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f35486E)) {
                        setHint(hint);
                    }
                    this.f35525f.setHint((CharSequence) null);
                }
                this.f35488F = true;
            }
            if (this.f35525f != null) {
                mo42572u();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f35511Q0.mo41866k(i);
        this.f35489F0 = this.f35511Q0.f35039p;
        if (this.f35525f != null) {
            mo42573v(false, false);
            mo42572u();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f35489F0 != colorStateList) {
            if (this.f35487E0 == null) {
                this.f35511Q0.mo41867l(colorStateList);
            }
            this.f35489F0 = colorStateList;
            if (this.f35525f != null) {
                mo42573v(false, false);
            }
        }
    }

    public void setMaxEms(int i) {
        this.f35528i = i;
        EditText editText = this.f35525f;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.f35530k = i;
        EditText editText = this.f35525f;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f35527h = i;
        EditText editText = this.f35525f;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.f35529j = i;
        EditText editText = this.f35525f;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C5344a.m13397a(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f35542q0 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f35550u0 = colorStateList;
        C14194n.m35275a(this, this.f35546s0, colorStateList, this.f35552v0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f35552v0 = mode;
        C14194n.m35275a(this, this.f35546s0, this.f35550u0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f35549u == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null);
            this.f35549u = appCompatTextView;
            appCompatTextView.setId(C13405f.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.f35549u;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15059s(appCompatTextView2, 2);
            Fade fade = new Fade();
            fade.f4944d = 87;
            LinearInterpolator linearInterpolator = C13577a.f33537a;
            fade.f4945e = linearInterpolator;
            this.f35555x = fade;
            fade.f4943c = 67;
            Fade fade2 = new Fade();
            fade2.f4944d = 87;
            fade2.f4945e = linearInterpolator;
            this.f35557y = fade2;
            setPlaceholderTextAppearance(this.f35553w);
            setPlaceholderTextColor(this.f35551v);
        }
        int i = 0;
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f35547t) {
                setPlaceholderTextEnabled(true);
            }
            this.f35545s = charSequence;
        }
        EditText editText = this.f35525f;
        if (editText != null) {
            i = editText.getText().length();
        }
        mo42574w(i);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f35553w = i;
        AppCompatTextView appCompatTextView = this.f35549u;
        if (appCompatTextView != null) {
            C0801k.m2424f(appCompatTextView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f35551v != colorStateList) {
            this.f35551v = colorStateList;
            AppCompatTextView appCompatTextView = this.f35549u;
            if (appCompatTextView != null && colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        C14205s sVar = this.f35522c;
        sVar.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        sVar.f35663d = charSequence2;
        sVar.f35662c.setText(charSequence);
        sVar.mo42638d();
    }

    public void setPrefixTextAppearance(int i) {
        C0801k.m2424f(this.f35522c.f35662c, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f35522c.f35662c.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f35522c.f35664e.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C5344a.m13397a(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C14205s sVar = this.f35522c;
        CheckableImageButton checkableImageButton = sVar.f35664e;
        View.OnLongClickListener onLongClickListener = sVar.f35667h;
        checkableImageButton.setOnClickListener(onClickListener);
        C14194n.m35277c(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C14205s sVar = this.f35522c;
        sVar.f35667h = onLongClickListener;
        CheckableImageButton checkableImageButton = sVar.f35664e;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        C14194n.m35277c(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C14205s sVar = this.f35522c;
        if (sVar.f35665f != colorStateList) {
            sVar.f35665f = colorStateList;
            C14194n.m35275a(sVar.f35661b, sVar.f35664e, colorStateList, sVar.f35666g);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C14205s sVar = this.f35522c;
        if (sVar.f35666g != mode) {
            sVar.f35666g = mode;
            C14194n.m35275a(sVar.f35661b, sVar.f35664e, sVar.f35665f, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f35522c.mo42636b(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f35480B = charSequence2;
        this.f35482C.setText(charSequence);
        mo42577z();
    }

    public void setSuffixTextAppearance(int i) {
        C0801k.m2424f(this.f35482C, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f35482C.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C14162e eVar) {
        EditText editText = this.f35525f;
        if (editText != null) {
            C6333d0.m15029q(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f35534m0) {
            this.f35534m0 = typeface;
            C14047c cVar = this.f35511Q0;
            boolean n = cVar.mo41869n(typeface);
            boolean p = cVar.mo41871p(typeface);
            if (n || p) {
                cVar.mo41865j(false);
            }
            C14195o oVar = this.f35531l;
            if (typeface != oVar.f35645u) {
                oVar.f35645u = typeface;
                AppCompatTextView appCompatTextView = oVar.f35636l;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = oVar.f35642r;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.f35539p;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42571t() {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.getErrorIconDrawable()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            com.google.android.material.textfield.o r0 = r4.f35531l
            boolean r3 = r0.f35635k
            if (r3 == 0) goto L_0x0016
            boolean r0 = r0.mo42623e()
            if (r0 == 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            com.google.android.material.internal.CheckableImageButton r3 = r4.f35481B0
            if (r0 == 0) goto L_0x001d
            r0 = 0
            goto L_0x001f
        L_0x001d:
            r0 = 8
        L_0x001f:
            r3.setVisibility(r0)
            r4.mo42482s()
            r4.mo42576y()
            int r0 = r4.f35542q0
            if (r0 == 0) goto L_0x002d
            goto L_0x002e
        L_0x002d:
            r1 = 0
        L_0x002e:
            if (r1 != 0) goto L_0x0033
            r4.mo42480q()
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.mo42571t():void");
    }

    /* renamed from: u */
    public final void mo42572u() {
        if (this.f35502M != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f35521b.getLayoutParams();
            int e = mo42412e();
            if (e != layoutParams.topMargin) {
                layoutParams.topMargin = e;
                this.f35521b.requestLayout();
            }
        }
    }

    /* renamed from: v */
    public final void mo42573v(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        int i;
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        ColorStateList colorStateList2;
        int i2;
        boolean isEnabled = isEnabled();
        EditText editText = this.f35525f;
        if (editText == null || TextUtils.isEmpty(editText.getText())) {
            z3 = false;
        } else {
            z3 = true;
        }
        EditText editText2 = this.f35525f;
        if (editText2 == null || !editText2.hasFocus()) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean e = this.f35531l.mo42623e();
        ColorStateList colorStateList3 = this.f35487E0;
        if (colorStateList3 != null) {
            this.f35511Q0.mo41867l(colorStateList3);
            C14047c cVar = this.f35511Q0;
            ColorStateList colorStateList4 = this.f35487E0;
            if (cVar.f35037o != colorStateList4) {
                cVar.f35037o = colorStateList4;
                cVar.mo41865j(false);
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList5 = this.f35487E0;
            if (colorStateList5 != null) {
                i2 = colorStateList5.getColorForState(new int[]{-16842910}, this.f35507O0);
            } else {
                i2 = this.f35507O0;
            }
            this.f35511Q0.mo41867l(ColorStateList.valueOf(i2));
            C14047c cVar2 = this.f35511Q0;
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            if (cVar2.f35037o != valueOf) {
                cVar2.f35037o = valueOf;
                cVar2.mo41865j(false);
            }
        } else if (e) {
            C14047c cVar3 = this.f35511Q0;
            AppCompatTextView appCompatTextView2 = this.f35531l.f35636l;
            if (appCompatTextView2 != null) {
                colorStateList2 = appCompatTextView2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            cVar3.mo41867l(colorStateList2);
        } else if (this.f35537o && (appCompatTextView = this.f35539p) != null) {
            this.f35511Q0.mo41867l(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.f35489F0) != null) {
            this.f35511Q0.mo41867l(colorStateList);
        }
        if (z3 || !this.f35513R0 || (isEnabled() && z4)) {
            if (z2 || this.f35509P0) {
                ValueAnimator valueAnimator = this.f35517T0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f35517T0.cancel();
                }
                if (!z || !this.f35515S0) {
                    this.f35511Q0.mo41872q(1.0f);
                } else {
                    mo42406c(1.0f);
                }
                this.f35509P0 = false;
                if (mo42413f()) {
                    mo42470k();
                }
                EditText editText3 = this.f35525f;
                if (editText3 == null) {
                    i = 0;
                } else {
                    i = editText3.getText().length();
                }
                mo42574w(i);
                C14205s sVar = this.f35522c;
                sVar.f35668i = false;
                sVar.mo42638d();
                mo42577z();
            }
        } else if (z2 || !this.f35509P0) {
            ValueAnimator valueAnimator2 = this.f35517T0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f35517T0.cancel();
            }
            if (!z || !this.f35515S0) {
                this.f35511Q0.mo41872q(BitmapDescriptorFactory.HUE_RED);
            } else {
                mo42406c(BitmapDescriptorFactory.HUE_RED);
            }
            if (mo42413f() && (!((C14177g) this.f35490G).f35588z.isEmpty()) && mo42413f()) {
                ((C14177g) this.f35490G).mo42604w(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            this.f35509P0 = true;
            AppCompatTextView appCompatTextView3 = this.f35549u;
            if (appCompatTextView3 != null && this.f35547t) {
                appCompatTextView3.setText((CharSequence) null);
                C1328g.m3633a(this.f35521b, this.f35557y);
                this.f35549u.setVisibility(4);
            }
            C14205s sVar2 = this.f35522c;
            sVar2.f35668i = true;
            sVar2.mo42638d();
            mo42577z();
        }
    }

    /* renamed from: w */
    public final void mo42574w(int i) {
        if (i != 0 || this.f35509P0) {
            AppCompatTextView appCompatTextView = this.f35549u;
            if (appCompatTextView != null && this.f35547t) {
                appCompatTextView.setText((CharSequence) null);
                C1328g.m3633a(this.f35521b, this.f35557y);
                this.f35549u.setVisibility(4);
            }
        } else if (this.f35549u != null && this.f35547t && !TextUtils.isEmpty(this.f35545s)) {
            this.f35549u.setText(this.f35545s);
            C1328g.m3633a(this.f35521b, this.f35555x);
            this.f35549u.setVisibility(0);
            this.f35549u.bringToFront();
            announceForAccessibility(this.f35545s);
        }
    }

    /* renamed from: x */
    public final void mo42575x(boolean z, boolean z2) {
        int defaultColor = this.f35497J0.getDefaultColor();
        int colorForState = this.f35497J0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f35497J0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f35512R = colorForState2;
        } else if (z2) {
            this.f35512R = colorForState;
        } else {
            this.f35512R = defaultColor;
        }
    }

    /* renamed from: y */
    public final void mo42576y() {
        boolean z;
        if (this.f35525f != null) {
            int i = 0;
            if (!mo42468i()) {
                if (this.f35481B0.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    EditText editText = this.f35525f;
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    i = C6333d0.C6338e.m15064e(editText);
                }
            }
            AppCompatTextView appCompatTextView = this.f35482C;
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C13403d.material_input_text_to_prefix_suffix_padding);
            int paddingTop = this.f35525f.getPaddingTop();
            int paddingBottom = this.f35525f.getPaddingBottom();
            WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
            C6333d0.C6338e.m15070k(appCompatTextView, dimensionPixelSize, paddingTop, i, paddingBottom);
        }
    }

    /* renamed from: z */
    public final void mo42577z() {
        int i;
        int visibility = this.f35482C.getVisibility();
        boolean z = false;
        if (this.f35480B == null || this.f35509P0) {
            i = 8;
        } else {
            i = 0;
        }
        if (visibility != i) {
            C14193m endIconDelegate = getEndIconDelegate();
            if (i == 0) {
                z = true;
            }
            endIconDelegate.mo42591c(z);
        }
        mo42482s();
        this.f35482C.setVisibility(i);
        mo42480q();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r27, android.util.AttributeSet r28, int r29) {
        /*
            r26 = this;
            r0 = r26
            r7 = r28
            r8 = r29
            int r9 = f35477W0
            r1 = r27
            android.content.Context r1 = p883wc.C20289a.m47861a(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = -1
            r0.f35527h = r10
            r0.f35528i = r10
            r0.f35529j = r10
            r0.f35530k = r10
            com.google.android.material.textfield.o r1 = new com.google.android.material.textfield.o
            r1.<init>(r0)
            r0.f35531l = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f35516T = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.f35518U = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.f35532l0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f35540p0 = r1
            r11 = 0
            r0.f35542q0 = r11
            android.util.SparseArray r12 = new android.util.SparseArray
            r12.<init>()
            r0.f35544r0 = r12
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f35548t0 = r1
            com.google.android.material.internal.c r1 = new com.google.android.material.internal.c
            r1.<init>(r0)
            r0.f35511Q0 = r1
            android.content.Context r13 = r26.getContext()
            r14 = 1
            r0.setOrientation(r14)
            r0.setWillNotDraw(r11)
            r0.setAddStatesFromChildren(r14)
            android.widget.FrameLayout r15 = new android.widget.FrameLayout
            r15.<init>(r13)
            r0.f35521b = r15
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            r6.<init>(r13)
            r0.f35524e = r6
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            r5.<init>(r13)
            r0.f35523d = r5
            androidx.appcompat.widget.AppCompatTextView r4 = new androidx.appcompat.widget.AppCompatTextView
            r3 = 0
            r4.<init>(r13, r3)
            r0.f35482C = r4
            r2 = 8
            r5.setVisibility(r2)
            r6.setVisibility(r2)
            r4.setVisibility(r2)
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r13)
            int r3 = p355ac.C13407h.design_text_input_end_icon
            android.view.View r16 = r2.inflate(r3, r5, r11)
            r10 = r16
            com.google.android.material.internal.CheckableImageButton r10 = (com.google.android.material.internal.CheckableImageButton) r10
            r0.f35481B0 = r10
            android.view.View r2 = r2.inflate(r3, r6, r11)
            r3 = r2
            com.google.android.material.internal.CheckableImageButton r3 = (com.google.android.material.internal.CheckableImageButton) r3
            r0.f35546s0 = r3
            r15.setAddStatesFromChildren(r14)
            r5.setOrientation(r11)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r14 = -2
            r11 = 8388613(0x800005, float:1.175495E-38)
            r17 = r3
            r3 = -1
            r2.<init>(r14, r3, r11)
            r5.setLayoutParams(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r14, r3)
            r6.setLayoutParams(r2)
            android.view.animation.LinearInterpolator r2 = p380bc.C13577a.f33537a
            r1.f35005W = r2
            r3 = 0
            r1.mo41865j(r3)
            r1.f35004V = r2
            r1.mo41865j(r3)
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.mo41868m(r2)
            int[] r11 = p355ac.C13411l.TextInputLayout
            r1 = 5
            int[] r2 = new int[r1]
            int r1 = p355ac.C13411l.TextInputLayout_counterTextAppearance
            r2[r3] = r1
            int r3 = p355ac.C13411l.TextInputLayout_counterOverflowTextAppearance
            r16 = 1
            r2[r16] = r3
            int r14 = p355ac.C13411l.TextInputLayout_errorTextAppearance
            r18 = r15
            r15 = 2
            r2[r15] = r14
            int r15 = p355ac.C13411l.TextInputLayout_helperTextTextAppearance
            r19 = r12
            r12 = 3
            r2[r12] = r15
            r20 = 4
            int r12 = p355ac.C13411l.TextInputLayout_hintTextAppearance
            r2[r20] = r12
            r21 = r1
            r1 = r13
            r20 = r2
            r2 = r28
            r23 = r3
            r27 = r15
            r22 = r17
            r15 = 0
            r3 = r11
            r11 = r4
            r4 = r29
            r24 = r5
            r5 = r9
            r25 = r6
            r6 = r20
            androidx.appcompat.widget.h1 r1 = com.google.android.material.internal.C14077m.m35061e(r1, r2, r3, r4, r5, r6)
            com.google.android.material.textfield.s r2 = new com.google.android.material.textfield.s
            r2.<init>(r0, r1)
            r0.f35522c = r2
            int r3 = p355ac.C13411l.TextInputLayout_hintEnabled
            r4 = 1
            boolean r3 = r1.mo2087a(r3, r4)
            r0.f35484D = r3
            int r3 = p355ac.C13411l.TextInputLayout_android_hint
            java.lang.CharSequence r3 = r1.mo2097k(r3)
            r0.setHint((java.lang.CharSequence) r3)
            int r3 = p355ac.C13411l.TextInputLayout_hintAnimationEnabled
            boolean r3 = r1.mo2087a(r3, r4)
            r0.f35515S0 = r3
            int r3 = p355ac.C13411l.TextInputLayout_expandedHintEnabled
            boolean r3 = r1.mo2087a(r3, r4)
            r0.f35513R0 = r3
            int r3 = p355ac.C13411l.TextInputLayout_android_minEms
            boolean r4 = r1.mo2098l(r3)
            if (r4 == 0) goto L_0x014e
            r4 = -1
            int r3 = r1.mo2094h(r3, r4)
            r0.setMinEms(r3)
            goto L_0x015e
        L_0x014e:
            r4 = -1
            int r3 = p355ac.C13411l.TextInputLayout_android_minWidth
            boolean r5 = r1.mo2098l(r3)
            if (r5 == 0) goto L_0x015e
            int r3 = r1.mo2090d(r3, r4)
            r0.setMinWidth(r3)
        L_0x015e:
            int r3 = p355ac.C13411l.TextInputLayout_android_maxEms
            boolean r5 = r1.mo2098l(r3)
            if (r5 == 0) goto L_0x016e
            int r3 = r1.mo2094h(r3, r4)
            r0.setMaxEms(r3)
            goto L_0x017d
        L_0x016e:
            int r3 = p355ac.C13411l.TextInputLayout_android_maxWidth
            boolean r5 = r1.mo2098l(r3)
            if (r5 == 0) goto L_0x017d
            int r3 = r1.mo2090d(r3, r4)
            r0.setMaxWidth(r3)
        L_0x017d:
            tc.k$a r3 = p811tc.C19654k.m47124c(r13, r7, r8, r9)
            tc.k r4 = new tc.k
            r4.<init>(r3)
            r0.f35496J = r4
            android.content.res.Resources r3 = r13.getResources()
            int r4 = p355ac.C13403d.mtrl_textinput_box_label_cutout_padding
            int r3 = r3.getDimensionPixelOffset(r4)
            r0.f35500L = r3
            int r3 = p355ac.C13411l.TextInputLayout_boxCollapsedPaddingTop
            r4 = 0
            int r3 = r1.mo2089c(r3, r4)
            r0.f35504N = r3
            int r3 = p355ac.C13411l.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r4 = r13.getResources()
            int r5 = p355ac.C13403d.mtrl_textinput_box_stroke_width_default
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.mo2090d(r3, r4)
            r0.f35508P = r3
            int r3 = p355ac.C13411l.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r4 = r13.getResources()
            int r5 = p355ac.C13403d.mtrl_textinput_box_stroke_width_focused
            int r4 = r4.getDimensionPixelSize(r5)
            int r3 = r1.mo2090d(r3, r4)
            r0.f35510Q = r3
            int r3 = r0.f35508P
            r0.f35506O = r3
            int r3 = p355ac.C13411l.TextInputLayout_boxCornerRadiusTopStart
            android.content.res.TypedArray r4 = r1.f1515b
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r4.getDimension(r3, r5)
            int r4 = p355ac.C13411l.TextInputLayout_boxCornerRadiusTopEnd
            android.content.res.TypedArray r6 = r1.f1515b
            float r4 = r6.getDimension(r4, r5)
            int r6 = p355ac.C13411l.TextInputLayout_boxCornerRadiusBottomEnd
            android.content.res.TypedArray r7 = r1.f1515b
            float r6 = r7.getDimension(r6, r5)
            int r7 = p355ac.C13411l.TextInputLayout_boxCornerRadiusBottomStart
            android.content.res.TypedArray r8 = r1.f1515b
            float r5 = r8.getDimension(r7, r5)
            tc.k r7 = r0.f35496J
            r7.getClass()
            tc.k$a r8 = new tc.k$a
            r8.<init>(r7)
            r7 = 0
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x01f9
            r8.mo52026f(r3)
        L_0x01f9:
            int r3 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0200
            r8.mo52027g(r4)
        L_0x0200:
            int r3 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0207
            r8.mo52025e(r6)
        L_0x0207:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x020e
            r8.mo52024d(r5)
        L_0x020e:
            tc.k r3 = new tc.k
            r3.<init>(r8)
            r0.f35496J = r3
            int r3 = p355ac.C13411l.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r3 = p742qc.C19099c.m46248b(r13, r1, r3)
            if (r3 == 0) goto L_0x0278
            int r4 = r3.getDefaultColor()
            r0.f35499K0 = r4
            r0.f35514S = r4
            boolean r4 = r3.isStateful()
            r5 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r4 == 0) goto L_0x0253
            r4 = 1
            int[] r6 = new int[r4]
            r4 = 0
            r6[r4] = r5
            r4 = -1
            int r5 = r3.getColorForState(r6, r4)
            r0.f35501L0 = r5
            r5 = 2
            int[] r6 = new int[r5]
            r6 = {16842908, 16842910} // fill-array
            int r6 = r3.getColorForState(r6, r4)
            r0.f35503M0 = r6
            int[] r6 = new int[r5]
            r6 = {16843623, 16842910} // fill-array
            int r3 = r3.getColorForState(r6, r4)
            r0.f35505N0 = r3
            goto L_0x0283
        L_0x0253:
            r4 = -1
            int r3 = r0.f35499K0
            r0.f35503M0 = r3
            int r3 = p355ac.C13402c.mtrl_filled_background_color
            android.content.res.ColorStateList r3 = p090g1.C4732a.getColorStateList(r13, r3)
            r6 = 1
            int[] r7 = new int[r6]
            r8 = 0
            r7[r8] = r5
            int r5 = r3.getColorForState(r7, r4)
            r0.f35501L0 = r5
            int[] r5 = new int[r6]
            r6 = 16843623(0x1010367, float:2.3696E-38)
            r5[r8] = r6
            int r3 = r3.getColorForState(r5, r4)
            r0.f35505N0 = r3
            goto L_0x0283
        L_0x0278:
            r8 = 0
            r0.f35514S = r8
            r0.f35499K0 = r8
            r0.f35501L0 = r8
            r0.f35503M0 = r8
            r0.f35505N0 = r8
        L_0x0283:
            int r3 = p355ac.C13411l.TextInputLayout_android_textColorHint
            boolean r4 = r1.mo2098l(r3)
            if (r4 == 0) goto L_0x0293
            android.content.res.ColorStateList r3 = r1.mo2088b(r3)
            r0.f35489F0 = r3
            r0.f35487E0 = r3
        L_0x0293:
            int r3 = p355ac.C13411l.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r4 = p742qc.C19099c.m46248b(r13, r1, r3)
            android.content.res.TypedArray r5 = r1.f1515b
            r6 = 0
            int r3 = r5.getColor(r3, r6)
            r0.f35495I0 = r3
            int r3 = p355ac.C13402c.mtrl_textinput_default_box_stroke_color
            int r3 = p090g1.C4732a.getColor(r13, r3)
            r0.f35491G0 = r3
            int r3 = p355ac.C13402c.mtrl_textinput_disabled_color
            int r3 = p090g1.C4732a.getColor(r13, r3)
            r0.f35507O0 = r3
            int r3 = p355ac.C13402c.mtrl_textinput_hovered_box_stroke_color
            int r3 = p090g1.C4732a.getColor(r13, r3)
            r0.f35493H0 = r3
            if (r4 == 0) goto L_0x02bf
            r0.setBoxStrokeColorStateList(r4)
        L_0x02bf:
            int r3 = p355ac.C13411l.TextInputLayout_boxStrokeErrorColor
            boolean r4 = r1.mo2098l(r3)
            if (r4 == 0) goto L_0x02ce
            android.content.res.ColorStateList r3 = p742qc.C19099c.m46248b(r13, r1, r3)
            r0.setBoxStrokeErrorColor(r3)
        L_0x02ce:
            r3 = -1
            int r4 = r1.mo2095i(r12, r3)
            if (r4 == r3) goto L_0x02de
            r3 = 0
            int r4 = r1.mo2095i(r12, r3)
            r0.setHintTextAppearance(r4)
            goto L_0x02df
        L_0x02de:
            r3 = 0
        L_0x02df:
            int r4 = r1.mo2095i(r14, r3)
            int r5 = p355ac.C13411l.TextInputLayout_errorContentDescription
            java.lang.CharSequence r5 = r1.mo2097k(r5)
            int r6 = p355ac.C13411l.TextInputLayout_errorEnabled
            boolean r6 = r1.mo2087a(r6, r3)
            int r7 = p355ac.C13405f.text_input_error_icon
            r10.setId(r7)
            boolean r7 = p742qc.C19099c.m46251e(r13)
            if (r7 == 0) goto L_0x0303
            android.view.ViewGroup$LayoutParams r7 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r7 = (android.view.ViewGroup.MarginLayoutParams) r7
            p242s1.C6362h.m15172h(r7, r3)
        L_0x0303:
            int r3 = p355ac.C13411l.TextInputLayout_errorIconTint
            boolean r7 = r1.mo2098l(r3)
            if (r7 == 0) goto L_0x0311
            android.content.res.ColorStateList r3 = p742qc.C19099c.m46248b(r13, r1, r3)
            r0.f35483C0 = r3
        L_0x0311:
            int r3 = p355ac.C13411l.TextInputLayout_errorIconTintMode
            boolean r7 = r1.mo2098l(r3)
            if (r7 == 0) goto L_0x0324
            r7 = -1
            int r3 = r1.mo2094h(r3, r7)
            android.graphics.PorterDuff$Mode r3 = com.google.android.material.internal.C14083r.m35069e(r3, r15)
            r0.f35485D0 = r3
        L_0x0324:
            int r3 = p355ac.C13411l.TextInputLayout_errorIconDrawable
            boolean r7 = r1.mo2098l(r3)
            if (r7 == 0) goto L_0x0333
            android.graphics.drawable.Drawable r3 = r1.mo2091e(r3)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r3)
        L_0x0333:
            android.content.res.Resources r3 = r26.getResources()
            int r7 = p355ac.C13409j.error_icon_content_description
            java.lang.CharSequence r3 = r3.getText(r7)
            r10.setContentDescription(r3)
            java.util.WeakHashMap<android.view.View, s1.p0> r3 = p242s1.C6333d0.f19990a
            r3 = 2
            p242s1.C6333d0.C6337d.m15059s(r10, r3)
            r3 = 0
            r10.setClickable(r3)
            r10.setPressable(r3)
            r10.setFocusable(r3)
            r7 = r27
            int r7 = r1.mo2095i(r7, r3)
            int r8 = p355ac.C13411l.TextInputLayout_helperTextEnabled
            boolean r8 = r1.mo2087a(r8, r3)
            int r9 = p355ac.C13411l.TextInputLayout_helperText
            java.lang.CharSequence r9 = r1.mo2097k(r9)
            int r12 = p355ac.C13411l.TextInputLayout_placeholderTextAppearance
            int r12 = r1.mo2095i(r12, r3)
            int r14 = p355ac.C13411l.TextInputLayout_placeholderText
            java.lang.CharSequence r14 = r1.mo2097k(r14)
            int r15 = p355ac.C13411l.TextInputLayout_suffixTextAppearance
            int r15 = r1.mo2095i(r15, r3)
            int r3 = p355ac.C13411l.TextInputLayout_suffixText
            java.lang.CharSequence r3 = r1.mo2097k(r3)
            r28 = r3
            int r3 = p355ac.C13411l.TextInputLayout_counterEnabled
            r29 = r9
            r9 = 0
            boolean r3 = r1.mo2087a(r3, r9)
            int r9 = p355ac.C13411l.TextInputLayout_counterMaxLength
            r17 = r3
            r3 = -1
            int r9 = r1.mo2094h(r9, r3)
            r0.setCounterMaxLength(r9)
            r3 = r21
            r9 = 0
            int r3 = r1.mo2095i(r3, r9)
            r0.f35543r = r3
            r3 = r23
            int r3 = r1.mo2095i(r3, r9)
            r0.f35541q = r3
            int r3 = p355ac.C13411l.TextInputLayout_boxBackgroundMode
            int r3 = r1.mo2094h(r3, r9)
            r0.setBoxBackgroundMode(r3)
            boolean r3 = p742qc.C19099c.m46251e(r13)
            if (r3 == 0) goto L_0x03ba
            android.view.ViewGroup$LayoutParams r3 = r22.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            p242s1.C6362h.m15172h(r3, r9)
        L_0x03ba:
            int r3 = p355ac.C13411l.TextInputLayout_endIconDrawable
            int r3 = r1.mo2095i(r3, r9)
            com.google.android.material.textfield.f r9 = new com.google.android.material.textfield.f
            r9.<init>(r0, r3)
            r20 = r6
            r6 = r19
            r19 = r8
            r8 = -1
            r6.append(r8, r9)
            com.google.android.material.textfield.q r8 = new com.google.android.material.textfield.q
            r8.<init>(r0)
            r9 = 0
            r6.append(r9, r8)
            com.google.android.material.textfield.r r8 = new com.google.android.material.textfield.r
            if (r3 != 0) goto L_0x03e5
            r21 = r2
            int r2 = p355ac.C13411l.TextInputLayout_passwordToggleDrawable
            int r2 = r1.mo2095i(r2, r9)
            goto L_0x03e8
        L_0x03e5:
            r21 = r2
            r2 = r3
        L_0x03e8:
            r8.<init>(r0, r2)
            r2 = 1
            r6.append(r2, r8)
            com.google.android.material.textfield.a r2 = new com.google.android.material.textfield.a
            r2.<init>(r0, r3)
            r8 = 2
            r6.append(r8, r2)
            com.google.android.material.textfield.h r2 = new com.google.android.material.textfield.h
            r2.<init>(r0, r3)
            r3 = 3
            r6.append(r3, r2)
            int r2 = p355ac.C13411l.TextInputLayout_passwordToggleEnabled
            boolean r3 = r1.mo2098l(r2)
            if (r3 != 0) goto L_0x042b
            int r3 = p355ac.C13411l.TextInputLayout_endIconTint
            boolean r6 = r1.mo2098l(r3)
            if (r6 == 0) goto L_0x0417
            android.content.res.ColorStateList r3 = p742qc.C19099c.m46248b(r13, r1, r3)
            r0.f35550u0 = r3
        L_0x0417:
            int r3 = p355ac.C13411l.TextInputLayout_endIconTintMode
            boolean r6 = r1.mo2098l(r3)
            if (r6 == 0) goto L_0x042b
            r6 = -1
            int r3 = r1.mo2094h(r3, r6)
            r6 = 0
            android.graphics.PorterDuff$Mode r3 = com.google.android.material.internal.C14083r.m35069e(r3, r6)
            r0.f35552v0 = r3
        L_0x042b:
            int r3 = p355ac.C13411l.TextInputLayout_endIconMode
            boolean r6 = r1.mo2098l(r3)
            if (r6 == 0) goto L_0x0455
            r6 = 0
            int r2 = r1.mo2094h(r3, r6)
            r0.setEndIconMode(r2)
            int r2 = p355ac.C13411l.TextInputLayout_endIconContentDescription
            boolean r3 = r1.mo2098l(r2)
            if (r3 == 0) goto L_0x044a
            java.lang.CharSequence r2 = r1.mo2097k(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x044a:
            int r2 = p355ac.C13411l.TextInputLayout_endIconCheckable
            r3 = 1
            boolean r2 = r1.mo2087a(r2, r3)
            r0.setEndIconCheckable(r2)
            goto L_0x048e
        L_0x0455:
            boolean r3 = r1.mo2098l(r2)
            if (r3 == 0) goto L_0x048e
            int r3 = p355ac.C13411l.TextInputLayout_passwordToggleTint
            boolean r6 = r1.mo2098l(r3)
            if (r6 == 0) goto L_0x0469
            android.content.res.ColorStateList r3 = p742qc.C19099c.m46248b(r13, r1, r3)
            r0.f35550u0 = r3
        L_0x0469:
            int r3 = p355ac.C13411l.TextInputLayout_passwordToggleTintMode
            boolean r6 = r1.mo2098l(r3)
            if (r6 == 0) goto L_0x047d
            r6 = -1
            int r3 = r1.mo2094h(r3, r6)
            r6 = 0
            android.graphics.PorterDuff$Mode r3 = com.google.android.material.internal.C14083r.m35069e(r3, r6)
            r0.f35552v0 = r3
        L_0x047d:
            r3 = 0
            boolean r2 = r1.mo2087a(r2, r3)
            r0.setEndIconMode(r2)
            int r2 = p355ac.C13411l.TextInputLayout_passwordToggleContentDescription
            java.lang.CharSequence r2 = r1.mo2097k(r2)
            r0.setEndIconContentDescription((java.lang.CharSequence) r2)
        L_0x048e:
            int r2 = p355ac.C13405f.textinput_suffix_text
            r11.setId(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 80
            r6 = -2
            r2.<init>(r6, r6, r3)
            r11.setLayoutParams(r2)
            r2 = 1
            p242s1.C6333d0.C6340g.m15079f(r11, r2)
            r0.setErrorContentDescription(r5)
            int r2 = r0.f35541q
            r0.setCounterOverflowTextAppearance(r2)
            r0.setHelperTextTextAppearance(r7)
            r0.setErrorTextAppearance(r4)
            int r2 = r0.f35543r
            r0.setCounterTextAppearance(r2)
            r0.setPlaceholderText(r14)
            r0.setPlaceholderTextAppearance(r12)
            r0.setSuffixTextAppearance(r15)
            int r2 = p355ac.C13411l.TextInputLayout_errorTextColor
            boolean r3 = r1.mo2098l(r2)
            if (r3 == 0) goto L_0x04cd
            android.content.res.ColorStateList r2 = r1.mo2088b(r2)
            r0.setErrorTextColor(r2)
        L_0x04cd:
            int r2 = p355ac.C13411l.TextInputLayout_helperTextTextColor
            boolean r3 = r1.mo2098l(r2)
            if (r3 == 0) goto L_0x04dc
            android.content.res.ColorStateList r2 = r1.mo2088b(r2)
            r0.setHelperTextColor(r2)
        L_0x04dc:
            int r2 = p355ac.C13411l.TextInputLayout_hintTextColor
            boolean r3 = r1.mo2098l(r2)
            if (r3 == 0) goto L_0x04eb
            android.content.res.ColorStateList r2 = r1.mo2088b(r2)
            r0.setHintTextColor(r2)
        L_0x04eb:
            int r2 = p355ac.C13411l.TextInputLayout_counterTextColor
            boolean r3 = r1.mo2098l(r2)
            if (r3 == 0) goto L_0x04fa
            android.content.res.ColorStateList r2 = r1.mo2088b(r2)
            r0.setCounterTextColor(r2)
        L_0x04fa:
            int r2 = p355ac.C13411l.TextInputLayout_counterOverflowTextColor
            boolean r3 = r1.mo2098l(r2)
            if (r3 == 0) goto L_0x0509
            android.content.res.ColorStateList r2 = r1.mo2088b(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x0509:
            int r2 = p355ac.C13411l.TextInputLayout_placeholderTextColor
            boolean r3 = r1.mo2098l(r2)
            if (r3 == 0) goto L_0x0518
            android.content.res.ColorStateList r2 = r1.mo2088b(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x0518:
            int r2 = p355ac.C13411l.TextInputLayout_suffixTextColor
            boolean r3 = r1.mo2098l(r2)
            if (r3 == 0) goto L_0x0527
            android.content.res.ColorStateList r2 = r1.mo2088b(r2)
            r0.setSuffixTextColor(r2)
        L_0x0527:
            int r2 = p355ac.C13411l.TextInputLayout_android_enabled
            r3 = 1
            boolean r2 = r1.mo2087a(r2, r3)
            r0.setEnabled(r2)
            r1.mo2099n()
            r1 = 2
            p242s1.C6333d0.C6337d.m15059s(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L_0x0543
            if (r1 < r2) goto L_0x0543
            p242s1.C6333d0.C6346l.m15131l(r0, r3)
        L_0x0543:
            r2 = r22
            r1 = r25
            r1.addView(r2)
            r2 = r24
            r2.addView(r11)
            r2.addView(r10)
            r2.addView(r1)
            r1 = r18
            r3 = r21
            r1.addView(r3)
            r1.addView(r2)
            r0.addView(r1)
            r1 = r19
            r0.setHelperTextEnabled(r1)
            r1 = r20
            r0.setErrorEnabled(r1)
            r1 = r17
            r0.setCounterEnabled(r1)
            r1 = r29
            r0.setHelperText(r1)
            r1 = r28
            r0.setSuffixText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f35546s0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f35546s0.setImageDrawable(drawable);
        if (drawable != null) {
            C14194n.m35275a(this, this.f35546s0, this.f35550u0, this.f35552v0);
            C14194n.m35276b(this, this.f35546s0, this.f35550u0);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        C14205s sVar = this.f35522c;
        if (sVar.f35664e.getContentDescription() != charSequence) {
            sVar.f35664e.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f35522c.mo42635a(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f35481B0.setImageDrawable(drawable);
        mo42571t();
        C14194n.m35275a(this, this.f35481B0, this.f35483C0, this.f35485D0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f35546s0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f35546s0.setImageDrawable(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}
