package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.textfield.TextInputLayout;
import p355ac.C13404e;
import p355ac.C13409j;
import p380bc.C13577a;

/* renamed from: com.google.android.material.textfield.a */
public final class C14165a extends C14193m {

    /* renamed from: e */
    public final C14166a f35571e = new C14166a();

    /* renamed from: f */
    public final C14167b f35572f = new C14167b();

    /* renamed from: g */
    public final C14168c f35573g = new C14168c();

    /* renamed from: h */
    public final C14169d f35574h = new C14169d();

    /* renamed from: i */
    public AnimatorSet f35575i;

    /* renamed from: j */
    public ValueAnimator f35576j;

    /* renamed from: com.google.android.material.textfield.a$a */
    public class C14166a implements TextWatcher {
        public C14166a() {
        }

        public final void afterTextChanged(Editable editable) {
            if (C14165a.this.f35621a.getSuffixText() == null) {
                C14165a aVar = C14165a.this;
                aVar.mo42592e(C14165a.m35255d(aVar));
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    public class C14167b implements View.OnFocusChangeListener {
        public C14167b() {
        }

        public final void onFocusChange(View view, boolean z) {
            C14165a aVar = C14165a.this;
            aVar.mo42592e(C14165a.m35255d(aVar));
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    public class C14168c implements TextInputLayout.C14163f {
        public C14168c() {
        }

        /* renamed from: a */
        public final void mo42588a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(C14165a.m35255d(C14165a.this));
            editText.setOnFocusChangeListener(C14165a.this.f35572f);
            C14165a aVar = C14165a.this;
            aVar.f35623c.setOnFocusChangeListener(aVar.f35572f);
            editText.removeTextChangedListener(C14165a.this.f35571e);
            editText.addTextChangedListener(C14165a.this.f35571e);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    public class C14169d implements TextInputLayout.C14164g {

        /* renamed from: com.google.android.material.textfield.a$d$a */
        public class C14170a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ EditText f35581b;

            public C14170a(EditText editText) {
                this.f35581b = editText;
            }

            public final void run() {
                this.f35581b.removeTextChangedListener(C14165a.this.f35571e);
                C14165a.this.mo42592e(true);
            }
        }

        public C14169d() {
        }

        /* renamed from: a */
        public final void mo42589a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.post(new C14170a(editText));
                if (editText.getOnFocusChangeListener() == C14165a.this.f35572f) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                View.OnFocusChangeListener onFocusChangeListener = C14165a.this.f35623c.getOnFocusChangeListener();
                C14165a aVar = C14165a.this;
                if (onFocusChangeListener == aVar.f35572f) {
                    aVar.f35623c.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    public class C14171e implements View.OnClickListener {
        public C14171e() {
        }

        public final void onClick(View view) {
            Editable text = C14165a.this.f35621a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            TextInputLayout textInputLayout = C14165a.this.f35621a;
            C14194n.m35276b(textInputLayout, textInputLayout.f35546s0, textInputLayout.f35550u0);
        }
    }

    public C14165a(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
    }

    /* renamed from: d */
    public static boolean m35255d(C14165a aVar) {
        EditText editText = aVar.f35621a.getEditText();
        if (editText == null || ((!editText.hasFocus() && !aVar.f35623c.hasFocus()) || editText.getText().length() <= 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo42590a() {
        TextInputLayout textInputLayout = this.f35621a;
        int i = this.f35624d;
        if (i == 0) {
            i = C13404e.mtrl_ic_cancel;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f35621a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(C13409j.clear_text_end_icon_content_description));
        this.f35621a.setEndIconCheckable(false);
        this.f35621a.setEndIconOnClickListener(new C14171e());
        this.f35621a.mo42405b(this.f35573g);
        TextInputLayout textInputLayout3 = this.f35621a;
        textInputLayout3.f35548t0.add(this.f35574h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(C13577a.f33540d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C14175e(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
        LinearInterpolator linearInterpolator = C13577a.f33537a;
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(100);
        ofFloat2.addUpdateListener(new C14174d(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f35575i = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f35575i.addListener(new C14172b(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, BitmapDescriptorFactory.HUE_RED});
        ofFloat3.setInterpolator(linearInterpolator);
        ofFloat3.setDuration(100);
        ofFloat3.addUpdateListener(new C14174d(this));
        this.f35576j = ofFloat3;
        ofFloat3.addListener(new C14173c(this));
    }

    /* renamed from: c */
    public final void mo42591c(boolean z) {
        if (this.f35621a.getSuffixText() != null) {
            mo42592e(z);
        }
    }

    /* renamed from: e */
    public final void mo42592e(boolean z) {
        boolean z2;
        if (this.f35621a.mo42468i() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !this.f35575i.isRunning()) {
            this.f35576j.cancel();
            this.f35575i.start();
            if (z2) {
                this.f35575i.end();
            }
        } else if (!z) {
            this.f35575i.cancel();
            this.f35576j.start();
            if (z2) {
                this.f35576j.end();
            }
        }
    }
}
