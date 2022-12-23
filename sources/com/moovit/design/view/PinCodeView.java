package com.moovit.design.view;

import a00.C13382a;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.commons.utils.UiUtils;
import i00.C17522a;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p883wc.C20289a;
import p977zz.C20964s0;
import w00.C20264e;
import w00.C20265f;
import w00.C20266g;
import w00.C20267h;

public class PinCodeView extends LinearLayout {

    /* renamed from: e */
    public static final int f41369e = C20266g.Widget_Moovit_PinCodeView;

    /* renamed from: b */
    public final StringBuilder f41370b;

    /* renamed from: c */
    public int f41371c;

    /* renamed from: d */
    public C15865b f41372d;

    /* renamed from: com.moovit.design.view.PinCodeView$a */
    public class C15864a extends C17522a implements TextView.OnEditorActionListener, View.OnKeyListener {

        /* renamed from: b */
        public final EditText f41373b;

        /* renamed from: c */
        public final int f41374c;

        public C15864a(EditText editText, int i) {
            this.f41373b = editText;
            this.f41374c = i;
        }

        public final void afterTextChanged(Editable editable) {
            StringBuilder sb = PinCodeView.this.f41370b;
            int i = this.f41374c;
            char c = 0;
            if (editable.length() != 0) {
                c = editable.charAt(0);
            }
            sb.setCharAt(i, c);
            PinCodeView.this.mo47737a(this.f41373b, this.f41374c);
            PinCodeView pinCodeView = PinCodeView.this;
            C15865b bVar = pinCodeView.f41372d;
            if (bVar != null) {
                bVar.mo23549v(pinCodeView.getPinCode(), C20964s0.m49089g(pinCodeView.f41370b));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r1 = r0.f41375d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onEditorAction(android.widget.TextView r1, int r2, android.view.KeyEvent r3) {
            /*
                r0 = this;
                r1 = 4
                if (r2 != r1) goto L_0x0016
                com.moovit.design.view.PinCodeView r1 = com.moovit.design.view.PinCodeView.this
                com.moovit.design.view.PinCodeView$b r2 = r1.f41372d
                if (r2 == 0) goto L_0x0016
                java.lang.String r3 = r1.getPinCode()
                java.lang.StringBuilder r1 = r1.f41370b
                boolean r1 = p977zz.C20964s0.m49089g(r1)
                r2.mo23547j(r3, r1)
            L_0x0016:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.design.view.PinCodeView.C15864a.onEditorAction(android.widget.TextView, int, android.view.KeyEvent):boolean");
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            EditText editText;
            keyEvent.getAction();
            if (i != 67 || keyEvent.getAction() != 0 || !C20964s0.m49090h(this.f41373b.getText())) {
                return false;
            }
            View focusSearch = this.f41373b.focusSearch(17);
            if (focusSearch instanceof EditText) {
                editText = (EditText) focusSearch;
            } else {
                editText = null;
            }
            if (editText == null) {
                return false;
            }
            editText.setText((CharSequence) null);
            editText.requestFocus();
            return false;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            EditText editText;
            boolean z = true;
            if (!(i2 == 0 && i3 == 1)) {
                z = false;
            }
            if (z) {
                View focusSearch = this.f41373b.focusSearch(66);
                if (focusSearch instanceof EditText) {
                    editText = (EditText) focusSearch;
                } else {
                    editText = null;
                }
                if (editText != null) {
                    editText.requestFocus();
                }
            }
        }
    }

    /* renamed from: com.moovit.design.view.PinCodeView$b */
    public interface C15865b {
        /* renamed from: j */
        void mo23547j(String str, boolean z);

        /* renamed from: v */
        void mo23549v(String str, boolean z);
    }

    public PinCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo47737a(EditText editText, int i) {
        C13382a.m33674j(editText, editText.getText(), getContext().getString(C20265f.voiceover_pin_code_hint, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(this.f41371c)}));
    }

    public String getPinCode() {
        return this.f41370b.toString();
    }

    public void setLength(int i) {
        int i2;
        if (this.f41371c != i) {
            this.f41371c = i;
            UiUtils.m40250i(this, C20264e.pin_code_digit_view, 0, i);
            for (int i3 = 0; i3 < i; i3++) {
                TextInputLayout textInputLayout = (TextInputLayout) getChildAt(i3);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textInputLayout.getLayoutParams();
                if (i3 == 0) {
                    marginLayoutParams.leftMargin = 0;
                }
                int i4 = i - 1;
                if (i3 == i4) {
                    marginLayoutParams.rightMargin = 0;
                }
                EditText editText = textInputLayout.getEditText();
                if (i3 == i4) {
                    i2 = 4;
                } else {
                    i2 = 5;
                }
                editText.setImeOptions(i2);
                mo47737a(editText, i3);
                C13382a.m33668d(editText, true);
                C15864a aVar = new C15864a(editText, i3);
                editText.addTextChangedListener(aVar);
                editText.setOnEditorActionListener(aVar);
                editText.setOnKeyListener(aVar);
            }
            this.f41370b.setLength(i);
        }
    }

    public void setListener(C15865b bVar) {
        this.f41372d = bVar;
    }

    public void setPinCode(String str) {
        int length = str.length();
        if (length > this.f41371c) {
            StringBuilder k = C13555b.m33972k("PIN code length is not supported: maxLength: ");
            k.append(this.f41371c);
            k.append(", received=");
            k.append(length);
            throw new IllegalArgumentException(k.toString());
        } else if (C20964s0.m49089g(str)) {
            C15865b bVar = this.f41372d;
            this.f41372d = null;
            for (int i = 0; i < length; i++) {
                ((TextInputLayout) getChildAt(i)).getEditText().setText(Character.toString(str.charAt(i)));
            }
            this.f41372d = bVar;
            if (bVar != null) {
                bVar.mo23549v(getPinCode(), C20964s0.m49089g(this.f41370b));
            }
        } else {
            throw new IllegalArgumentException("PIN code may not contain non-digit characters");
        }
    }

    public PinCodeView(Context context, AttributeSet attributeSet, int i) {
        super(C20289a.m47861a(context, attributeSet, i, f41369e), attributeSet, i);
        this.f41370b = new StringBuilder();
        Context context2 = getContext();
        setOrientation(0);
        setGravity(17);
        setFocusable(false);
        setFocusableInTouchMode(false);
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6338e.m15069j(this, 0);
        TypedArray o = UiUtils.m40256o(context2, attributeSet, C20267h.PinCodeView, i);
        try {
            setLength(o.getInt(C20267h.PinCodeView_pinCodeLength, 4));
        } finally {
            o.recycle();
        }
    }
}
