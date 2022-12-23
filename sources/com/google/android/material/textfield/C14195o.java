package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13403d;
import p380bc.C13577a;
import p583jk.C17884p;
import p742qc.C19099c;

/* renamed from: com.google.android.material.textfield.o */
public final class C14195o {

    /* renamed from: a */
    public final Context f35625a;

    /* renamed from: b */
    public final TextInputLayout f35626b;

    /* renamed from: c */
    public LinearLayout f35627c;

    /* renamed from: d */
    public int f35628d;

    /* renamed from: e */
    public FrameLayout f35629e;

    /* renamed from: f */
    public Animator f35630f;

    /* renamed from: g */
    public final float f35631g;

    /* renamed from: h */
    public int f35632h;

    /* renamed from: i */
    public int f35633i;

    /* renamed from: j */
    public CharSequence f35634j;

    /* renamed from: k */
    public boolean f35635k;

    /* renamed from: l */
    public AppCompatTextView f35636l;

    /* renamed from: m */
    public CharSequence f35637m;

    /* renamed from: n */
    public int f35638n;

    /* renamed from: o */
    public ColorStateList f35639o;

    /* renamed from: p */
    public CharSequence f35640p;

    /* renamed from: q */
    public boolean f35641q;

    /* renamed from: r */
    public AppCompatTextView f35642r;

    /* renamed from: s */
    public int f35643s;

    /* renamed from: t */
    public ColorStateList f35644t;

    /* renamed from: u */
    public Typeface f35645u;

    /* renamed from: com.google.android.material.textfield.o$a */
    public class C14196a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f35646a;

        /* renamed from: b */
        public final /* synthetic */ TextView f35647b;

        /* renamed from: c */
        public final /* synthetic */ int f35648c;

        /* renamed from: d */
        public final /* synthetic */ TextView f35649d;

        public C14196a(int i, TextView textView, int i2, TextView textView2) {
            this.f35646a = i;
            this.f35647b = textView;
            this.f35648c = i2;
            this.f35649d = textView2;
        }

        public final void onAnimationEnd(Animator animator) {
            AppCompatTextView appCompatTextView;
            C14195o oVar = C14195o.this;
            oVar.f35632h = this.f35646a;
            oVar.f35630f = null;
            TextView textView = this.f35647b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f35648c == 1 && (appCompatTextView = C14195o.this.f35636l) != null) {
                    appCompatTextView.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f35649d;
            if (textView2 != null) {
                textView2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                this.f35649d.setAlpha(1.0f);
            }
        }

        public final void onAnimationStart(Animator animator) {
            TextView textView = this.f35649d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C14195o(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f35625a = context;
        this.f35626b = textInputLayout;
        this.f35631g = (float) context.getResources().getDimensionPixelSize(C13403d.design_textinput_caption_translate_y);
    }

    /* renamed from: a */
    public final void mo42619a(TextView textView, int i) {
        boolean z;
        if (this.f35627c == null && this.f35629e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f35625a);
            this.f35627c = linearLayout;
            linearLayout.setOrientation(0);
            this.f35626b.addView(this.f35627c, -1, -2);
            this.f35629e = new FrameLayout(this.f35625a);
            this.f35627c.addView(this.f35629e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f35626b.getEditText() != null) {
                mo42620b();
            }
        }
        if (i == 0 || i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f35629e.setVisibility(0);
            this.f35629e.addView(textView);
        } else {
            this.f35627c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f35627c.setVisibility(0);
        this.f35628d++;
    }

    /* renamed from: b */
    public final void mo42620b() {
        boolean z;
        if (this.f35627c == null || this.f35626b.getEditText() == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            EditText editText = this.f35626b.getEditText();
            boolean e = C19099c.m46251e(this.f35625a);
            LinearLayout linearLayout = this.f35627c;
            int i = C13403d.material_helper_text_font_1_3_padding_horizontal;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            int f = C6333d0.C6338e.m15065f(editText);
            if (e) {
                f = this.f35625a.getResources().getDimensionPixelSize(i);
            }
            int i2 = C13403d.material_helper_text_font_1_3_padding_top;
            int dimensionPixelSize = this.f35625a.getResources().getDimensionPixelSize(C13403d.material_helper_text_default_padding_top);
            if (e) {
                dimensionPixelSize = this.f35625a.getResources().getDimensionPixelSize(i2);
            }
            int e2 = C6333d0.C6338e.m15064e(editText);
            if (e) {
                e2 = this.f35625a.getResources().getDimensionPixelSize(i);
            }
            C6333d0.C6338e.m15070k(linearLayout, f, dimensionPixelSize, e2, 0);
        }
    }

    /* renamed from: c */
    public final void mo42621c() {
        Animator animator = this.f35630f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: d */
    public final void mo42622d(ArrayList arrayList, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        float f;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    f = 1.0f;
                } else {
                    f = BitmapDescriptorFactory.HUE_RED;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{f});
                ofFloat.setDuration(167);
                ofFloat.setInterpolator(C13577a.f33537a);
                arrayList.add(ofFloat);
                if (i3 == i) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f35631g, 0.0f});
                    ofFloat2.setDuration(217);
                    ofFloat2.setInterpolator(C13577a.f33540d);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    /* renamed from: e */
    public final boolean mo42623e() {
        if (this.f35633i != 1 || this.f35636l == null || TextUtils.isEmpty(this.f35634j)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final TextView mo42624f(int i) {
        if (i == 1) {
            return this.f35636l;
        }
        if (i != 2) {
            return null;
        }
        return this.f35642r;
    }

    /* renamed from: g */
    public final int mo42625g() {
        AppCompatTextView appCompatTextView = this.f35636l;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: h */
    public final void mo42626h() {
        this.f35634j = null;
        mo42621c();
        if (this.f35632h == 1) {
            if (!this.f35641q || TextUtils.isEmpty(this.f35640p)) {
                this.f35633i = 0;
            } else {
                this.f35633i = 2;
            }
        }
        mo42629k(this.f35632h, this.f35633i, mo42628j(this.f35636l, ""));
    }

    /* renamed from: i */
    public final void mo42627i(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f35627c;
        if (linearLayout != null) {
            boolean z = true;
            if (!(i == 0 || i == 1)) {
                z = false;
            }
            if (!z || (frameLayout = this.f35629e) == null) {
                linearLayout.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i2 = this.f35628d - 1;
            this.f35628d = i2;
            LinearLayout linearLayout2 = this.f35627c;
            if (i2 == 0) {
                linearLayout2.setVisibility(8);
            }
        }
    }

    /* renamed from: j */
    public final boolean mo42628j(TextView textView, CharSequence charSequence) {
        TextInputLayout textInputLayout = this.f35626b;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (!C6333d0.C6340g.m15076c(textInputLayout) || !this.f35626b.isEnabled() || (this.f35633i == this.f35632h && textView != null && TextUtils.equals(textView.getText(), charSequence))) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final void mo42629k(int i, int i2, boolean z) {
        TextView f;
        TextView f2;
        int i3 = i;
        int i4 = i2;
        boolean z2 = z;
        if (i3 != i4) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f35630f = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i5 = i;
                int i6 = i2;
                mo42622d(arrayList2, this.f35641q, this.f35642r, 2, i5, i6);
                mo42622d(arrayList2, this.f35635k, this.f35636l, 1, i5, i6);
                C17884p.m44345P(animatorSet, arrayList);
                animatorSet.addListener(new C14196a(i2, mo42624f(i), i, mo42624f(i4)));
                animatorSet.start();
            } else if (i3 != i4) {
                if (!(i4 == 0 || (f2 = mo42624f(i4)) == null)) {
                    f2.setVisibility(0);
                    f2.setAlpha(1.0f);
                }
                if (!(i3 == 0 || (f = mo42624f(i)) == null)) {
                    f.setVisibility(4);
                    if (i3 == 1) {
                        f.setText((CharSequence) null);
                    }
                }
                this.f35632h = i4;
            }
            this.f35626b.mo42481r();
            this.f35626b.mo42573v(z2, false);
            this.f35626b.mo42403A();
        }
    }
}
