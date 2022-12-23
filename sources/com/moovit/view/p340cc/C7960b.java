package com.moovit.view.p340cc;

import android.text.Editable;
import com.moovit.view.p340cc.MaskFormatterWatcher;

/* renamed from: com.moovit.view.cc.b */
public final class C7960b extends MaskFormatterWatcher {
    public C7960b(CreditCardInputView creditCardInputView) {
        super(creditCardInputView, MaskFormatterWatcher.AllowanceLevel.ALLOW_ALL);
    }

    /* renamed from: a */
    public final void mo24834a(Editable editable, int i) {
    }

    /* renamed from: b */
    public final int mo24836b() {
        return this.f24086b.getCreditCardConfig().cvvLength;
    }

    /* renamed from: c */
    public final boolean mo24838c(Editable editable) {
        return true;
    }

    /* renamed from: d */
    public final void mo24839d(String str) {
        int length = str.length();
        if (length == mo24836b()) {
            this.f24086b.mo24812q(str, true);
        } else if (length == 3) {
            this.f24086b.mo24812q(str, false);
        } else {
            this.f24086b.mo24812q((String) null, false);
        }
    }

    /* renamed from: e */
    public final void mo24840e(Editable editable) {
    }

    /* renamed from: f */
    public final boolean mo24841f(int i) {
        return false;
    }

    /* renamed from: g */
    public final boolean mo24842g(CharSequence charSequence) {
        return true;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        this.f24086b.mo24818t();
    }
}
