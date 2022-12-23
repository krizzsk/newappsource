package com.google.android.material.textfield;

import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.internal.C14076l;
import com.google.android.material.textfield.TextInputLayout;
import p355ac.C13404e;
import p355ac.C13409j;

/* renamed from: com.google.android.material.textfield.r */
public final class C14199r extends C14193m {

    /* renamed from: e */
    public final C14200a f35652e = new C14200a();

    /* renamed from: f */
    public final C14201b f35653f = new C14201b();

    /* renamed from: g */
    public final C14202c f35654g = new C14202c();

    /* renamed from: com.google.android.material.textfield.r$a */
    public class C14200a extends C14076l {
        public C14200a() {
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C14199r rVar = C14199r.this;
            rVar.f35623c.setChecked(!C14199r.m35290d(rVar));
        }
    }

    /* renamed from: com.google.android.material.textfield.r$b */
    public class C14201b implements TextInputLayout.C14163f {
        public C14201b() {
        }

        /* renamed from: a */
        public final void mo42588a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            C14199r rVar = C14199r.this;
            rVar.f35623c.setChecked(!C14199r.m35290d(rVar));
            editText.removeTextChangedListener(C14199r.this.f35652e);
            editText.addTextChangedListener(C14199r.this.f35652e);
        }
    }

    /* renamed from: com.google.android.material.textfield.r$c */
    public class C14202c implements TextInputLayout.C14164g {

        /* renamed from: com.google.android.material.textfield.r$c$a */
        public class C14203a implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ EditText f35658b;

            public C14203a(EditText editText) {
                this.f35658b = editText;
            }

            public final void run() {
                this.f35658b.removeTextChangedListener(C14199r.this.f35652e);
            }
        }

        public C14202c() {
        }

        /* renamed from: a */
        public final void mo42589a(TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new C14203a(editText));
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.r$d */
    public class C14204d implements View.OnClickListener {
        public C14204d() {
        }

        public final void onClick(View view) {
            EditText editText = C14199r.this.f35621a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (C14199r.m35290d(C14199r.this)) {
                    editText.setTransformationMethod((TransformationMethod) null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                TextInputLayout textInputLayout = C14199r.this.f35621a;
                C14194n.m35276b(textInputLayout, textInputLayout.f35546s0, textInputLayout.f35550u0);
            }
        }
    }

    public C14199r(TextInputLayout textInputLayout, int i) {
        super(textInputLayout, i);
    }

    /* renamed from: d */
    public static boolean m35290d(C14199r rVar) {
        EditText editText = rVar.f35621a.getEditText();
        if (editText == null || !(editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo42590a() {
        TextInputLayout textInputLayout = this.f35621a;
        int i = this.f35624d;
        if (i == 0) {
            i = C13404e.design_password_eye;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f35621a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(C13409j.password_toggle_content_description));
        boolean z = true;
        this.f35621a.setEndIconVisible(true);
        this.f35621a.setEndIconCheckable(true);
        this.f35621a.setEndIconOnClickListener(new C14204d());
        this.f35621a.mo42405b(this.f35653f);
        TextInputLayout textInputLayout3 = this.f35621a;
        textInputLayout3.f35548t0.add(this.f35654g);
        EditText editText = this.f35621a.getEditText();
        if (editText == null || !(editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            z = false;
        }
        if (z) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
