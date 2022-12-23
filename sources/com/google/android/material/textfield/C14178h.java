package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.C14076l;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.play.core.assetpacks.C14256d1;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p255t1.C6527c;
import p255t1.C6528d;
import p255t1.C6531g;
import p355ac.C13401b;
import p355ac.C13403d;
import p355ac.C13404e;
import p355ac.C13409j;
import p380bc.C13577a;
import p742qc.C19098b;
import p811tc.C19648g;
import p811tc.C19654k;

/* renamed from: com.google.android.material.textfield.h */
public final class C14178h extends C14193m {

    /* renamed from: e */
    public final C14179a f35589e = new C14179a();

    /* renamed from: f */
    public final C14181b f35590f = new C14181b();

    /* renamed from: g */
    public final C14182c f35591g = new C14182c(this.f35621a);

    /* renamed from: h */
    public final C14183d f35592h = new C14183d();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: i */
    public final C14184e f35593i = new C14184e();

    /* renamed from: j */
    public final C14186f f35594j = new C14186f();

    /* renamed from: k */
    public final C14187g f35595k = new C14187g();

    /* renamed from: l */
    public boolean f35596l = false;

    /* renamed from: m */
    public boolean f35597m = false;

    /* renamed from: n */
    public long f35598n = Long.MAX_VALUE;

    /* renamed from: o */
    public StateListDrawable f35599o;

    /* renamed from: p */
    public C19648g f35600p;

    /* renamed from: q */
    public AccessibilityManager f35601q;

    /* renamed from: r */
    public ValueAnimator f35602r;

    /* renamed from: s */
    public ValueAnimator f35603s;

    /* renamed from: com.google.android.material.textfield.h$a */
    public class C14179a extends C14076l {

        /* renamed from: com.google.android.material.textfield.h$a$a */
        public class C14180a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ AutoCompleteTextView f35605b;

            public C14180a(AutoCompleteTextView autoCompleteTextView) {
                this.f35605b = autoCompleteTextView;
            }

            public final void run() {
                boolean isPopupShowing = this.f35605b.isPopupShowing();
                C14178h.this.mo42608g(isPopupShowing);
                C14178h.this.f35596l = isPopupShowing;
            }
        }

        public C14179a() {
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            EditText editText = C14178h.this.f35621a.getEditText();
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                if (C14178h.this.f35601q.isTouchExplorationEnabled()) {
                    if (autoCompleteTextView.getKeyListener() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && !C14178h.this.f35623c.hasFocus()) {
                        autoCompleteTextView.dismissDropDown();
                    }
                }
                autoCompleteTextView.post(new C14180a(autoCompleteTextView));
                return;
            }
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    }

    /* renamed from: com.google.android.material.textfield.h$b */
    public class C14181b implements View.OnFocusChangeListener {
        public C14181b() {
        }

        public final void onFocusChange(View view, boolean z) {
            C14178h.this.f35621a.setEndIconActivated(z);
            if (!z) {
                C14178h.this.mo42608g(false);
                C14178h.this.f35596l = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.h$c */
    public class C14182c extends TextInputLayout.C14162e {
        public C14182c(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
            boolean z;
            super.onInitializeAccessibilityNodeInfo(view, gVar);
            if (C14178h.this.f35621a.getEditText().getKeyListener() != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                gVar.mo22644i(Spinner.class.getName());
            }
            if (gVar.mo22640f()) {
                gVar.mo22647l((CharSequence) null);
            }
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            boolean z;
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            EditText editText = C14178h.this.f35621a.getEditText();
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                if (accessibilityEvent.getEventType() == 1 && C14178h.this.f35601q.isEnabled()) {
                    if (C14178h.this.f35621a.getEditText().getKeyListener() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        C14178h.m35264d(C14178h.this, autoCompleteTextView);
                        C14178h hVar = C14178h.this;
                        hVar.f35596l = true;
                        hVar.f35598n = System.currentTimeMillis();
                        return;
                    }
                    return;
                }
                return;
            }
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    }

    /* renamed from: com.google.android.material.textfield.h$d */
    public class C14183d implements TextInputLayout.C14163f {
        public C14183d() {
        }

        /* renamed from: a */
        public final void mo42588a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            if (editText instanceof AutoCompleteTextView) {
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
                C14178h hVar = C14178h.this;
                int boxBackgroundMode = hVar.f35621a.getBoxBackgroundMode();
                if (boxBackgroundMode == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(hVar.f35600p);
                } else if (boxBackgroundMode == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(hVar.f35599o);
                }
                C14178h.this.mo42606e(autoCompleteTextView);
                C14178h hVar2 = C14178h.this;
                hVar2.getClass();
                autoCompleteTextView.setOnTouchListener(new C14192l(hVar2, autoCompleteTextView));
                autoCompleteTextView.setOnFocusChangeListener(hVar2.f35590f);
                autoCompleteTextView.setOnDismissListener(new C14189i(hVar2));
                boolean z = false;
                autoCompleteTextView.setThreshold(0);
                autoCompleteTextView.removeTextChangedListener(C14178h.this.f35589e);
                autoCompleteTextView.addTextChangedListener(C14178h.this.f35589e);
                textInputLayout.setEndIconCheckable(true);
                textInputLayout.setErrorIconDrawable((Drawable) null);
                if (autoCompleteTextView.getKeyListener() != null) {
                    z = true;
                }
                if (!z && C14178h.this.f35601q.isTouchExplorationEnabled()) {
                    CheckableImageButton checkableImageButton = C14178h.this.f35623c;
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    C6333d0.C6337d.m15059s(checkableImageButton, 2);
                }
                textInputLayout.setTextInputAccessibilityDelegate(C14178h.this.f35591g);
                textInputLayout.setEndIconVisible(true);
                return;
            }
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    }

    /* renamed from: com.google.android.material.textfield.h$e */
    public class C14184e implements TextInputLayout.C14164g {

        /* renamed from: com.google.android.material.textfield.h$e$a */
        public class C14185a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ AutoCompleteTextView f35611b;

            public C14185a(AutoCompleteTextView autoCompleteTextView) {
                this.f35611b = autoCompleteTextView;
            }

            public final void run() {
                this.f35611b.removeTextChangedListener(C14178h.this.f35589e);
            }
        }

        public C14184e() {
        }

        /* renamed from: a */
        public final void mo42589a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.post(new C14185a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == C14178h.this.f35590f) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
            }
            if (i == 3) {
                textInputLayout.removeOnAttachStateChangeListener(C14178h.this.f35594j);
                C14178h hVar = C14178h.this;
                AccessibilityManager accessibilityManager = hVar.f35601q;
                if (accessibilityManager != null) {
                    C6527c.m15448b(accessibilityManager, hVar.f35595k);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.h$f */
    public class C14186f implements View.OnAttachStateChangeListener {
        public C14186f() {
        }

        public final void onViewAttachedToWindow(View view) {
            TextInputLayout textInputLayout;
            C14178h hVar = C14178h.this;
            if (hVar.f35601q != null && (textInputLayout = hVar.f35621a) != null) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (C6333d0.C6340g.m15075b(textInputLayout)) {
                    C6527c.m15447a(hVar.f35601q, hVar.f35595k);
                }
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            C14178h hVar = C14178h.this;
            AccessibilityManager accessibilityManager = hVar.f35601q;
            if (accessibilityManager != null) {
                C6527c.m15448b(accessibilityManager, hVar.f35595k);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.h$g */
    public class C14187g implements C6528d {
        public C14187g() {
        }
    }

    /* renamed from: com.google.android.material.textfield.h$h */
    public class C14188h implements View.OnClickListener {
        public C14188h() {
        }

        public final void onClick(View view) {
            C14178h.m35264d(C14178h.this, (AutoCompleteTextView) C14178h.this.f35621a.getEditText());
        }
    }

    public C14178h(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
    }

    /* renamed from: d */
    public static void m35264d(C14178h hVar, AutoCompleteTextView autoCompleteTextView) {
        boolean z;
        if (autoCompleteTextView == null) {
            hVar.getClass();
            return;
        }
        hVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() - hVar.f35598n;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            hVar.f35596l = false;
        }
        if (!hVar.f35596l) {
            hVar.mo42608g(!hVar.f35597m);
            if (hVar.f35597m) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        hVar.f35596l = false;
    }

    /* renamed from: a */
    public final void mo42590a() {
        TextInputLayout textInputLayout;
        float dimensionPixelOffset = (float) this.f35622b.getResources().getDimensionPixelOffset(C13403d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f35622b.getResources().getDimensionPixelOffset(C13403d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f35622b.getResources().getDimensionPixelOffset(C13403d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C19648g f = mo42607f(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C19648g f2 = mo42607f(BitmapDescriptorFactory.HUE_RED, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f35600p = f;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f35599o = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, f);
        this.f35599o.addState(new int[0], f2);
        int i = this.f35624d;
        if (i == 0) {
            i = C13404e.mtrl_dropdown_arrow;
        }
        this.f35621a.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f35621a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(C13409j.exposed_dropdown_menu_content_description));
        this.f35621a.setEndIconOnClickListener(new C14188h());
        this.f35621a.mo42405b(this.f35592h);
        TextInputLayout textInputLayout3 = this.f35621a;
        textInputLayout3.f35548t0.add(this.f35593i);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
        LinearInterpolator linearInterpolator = C13577a.f33537a;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration((long) 67);
        ofFloat.addUpdateListener(new C14191k(this));
        this.f35603s = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, BitmapDescriptorFactory.HUE_RED});
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration((long) 50);
        ofFloat2.addUpdateListener(new C14191k(this));
        this.f35602r = ofFloat2;
        ofFloat2.addListener(new C14190j(this));
        this.f35601q = (AccessibilityManager) this.f35622b.getSystemService("accessibility");
        this.f35621a.addOnAttachStateChangeListener(this.f35594j);
        if (this.f35601q != null && (textInputLayout = this.f35621a) != null) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6340g.m15075b(textInputLayout)) {
                C6527c.m15447a(this.f35601q, this.f35595k);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo42605b(int i) {
        return i != 0;
    }

    /* renamed from: e */
    public final void mo42606e(AutoCompleteTextView autoCompleteTextView) {
        boolean z;
        if (autoCompleteTextView.getKeyListener() != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int boxBackgroundMode = this.f35621a.getBoxBackgroundMode();
            C19648g boxBackground = this.f35621a.getBoxBackground();
            int c = C14256d1.m35485c(C13401b.colorControlHighlight, autoCompleteTextView);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                int c2 = C14256d1.m35485c(C13401b.colorSurface, autoCompleteTextView);
                C19648g gVar = new C19648g(boxBackground.f49837b.f49861a);
                int i = C14256d1.m35491i(0.1f, c, c2);
                gVar.mo52005n(new ColorStateList(iArr, new int[]{i, 0}));
                gVar.setTint(c2);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{i, c2});
                C19648g gVar2 = new C19648g(boxBackground.f49837b.f49861a);
                gVar2.setTint(-1);
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar, gVar2), boxBackground});
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6337d.m15057q(autoCompleteTextView, layerDrawable);
            } else if (boxBackgroundMode == 1) {
                int boxBackgroundColor = this.f35621a.getBoxBackgroundColor();
                RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, new int[]{C14256d1.m35491i(0.1f, c, boxBackgroundColor), boxBackgroundColor}), boxBackground, boxBackground);
                WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                C6333d0.C6337d.m15057q(autoCompleteTextView, rippleDrawable);
            }
        }
    }

    /* renamed from: f */
    public final C19648g mo42607f(float f, float f2, float f3, int i) {
        C19654k.C19655a aVar = new C19654k.C19655a();
        aVar.mo52026f(f);
        aVar.mo52027g(f);
        aVar.mo52024d(f2);
        aVar.mo52025e(f2);
        C19654k kVar = new C19654k(aVar);
        Context context = this.f35622b;
        Paint paint = C19648g.f49836y;
        int b = C19098b.m46246b(context, C13401b.colorSurface, C19648g.class.getSimpleName());
        C19648g gVar = new C19648g();
        gVar.mo52001k(context);
        gVar.mo52005n(ColorStateList.valueOf(b));
        gVar.mo52003m(f3);
        gVar.setShapeAppearanceModel(kVar);
        C19648g.C19650b bVar = gVar.f49837b;
        if (bVar.f49868h == null) {
            bVar.f49868h = new Rect();
        }
        gVar.f49837b.f49868h.set(0, i, 0, i);
        gVar.invalidateSelf();
        return gVar;
    }

    /* renamed from: g */
    public final void mo42608g(boolean z) {
        if (this.f35597m != z) {
            this.f35597m = z;
            this.f35603s.cancel();
            this.f35602r.start();
        }
    }
}
