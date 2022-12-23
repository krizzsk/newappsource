package com.moovit.view.p340cc;

import a00.C13382a;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import ce0.C21100e;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.commons.utils.UiUtils;
import com.moovit.view.p340cc.CreditCardFormView;
import p583jk.C17884p;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p977zz.C20964s0;
import p977zz.C20968u;
import p977zz.C20975x0;
import r10.C19220d;
import r10.C19221e;
import y10.C20689d;

/* renamed from: com.moovit.view.cc.CreditCardInputView */
public class CreditCardInputView extends ConstraintLayout {

    /* renamed from: h */
    public CreditCardInput f24064h;

    /* renamed from: i */
    public final TextInputLayout f24065i;

    /* renamed from: j */
    public final EditText f24066j;

    /* renamed from: k */
    public final TextInputLayout f24067k;

    /* renamed from: l */
    public final EditText f24068l;

    /* renamed from: m */
    public final TextInputLayout f24069m;

    /* renamed from: n */
    public final EditText f24070n;

    /* renamed from: o */
    public C7954a f24071o;

    /* renamed from: com.moovit.view.cc.CreditCardInputView$a */
    public interface C7954a {
    }

    public CreditCardInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public final void mo24806c(Character ch) {
        boolean z;
        View view;
        View focusedChild = getFocusedChild();
        if (focusedChild instanceof EditText) {
            EditText editText = (EditText) focusedChild;
            if (ch == null || editText.getSelectionStart() != editText.length()) {
                z = false;
            } else {
                z = true;
            }
            int indexOfChild = indexOfChild(getFocusedChild()) + 1;
            int childCount = getChildCount();
            if (indexOfChild < 0 || indexOfChild >= childCount) {
                view = null;
            } else {
                view = getChildAt(indexOfChild);
                view.requestFocus();
            }
            if ((view instanceof EditText) && z) {
                StringBuilder sb = new StringBuilder(1);
                sb.append(ch);
                ((EditText) view).getText().insert(0, sb);
            }
        }
    }

    public CreditCardConfig getCreditCardConfig() {
        return this.f24064h.f24072b;
    }

    /* renamed from: l */
    public final void mo24808l() {
        boolean z;
        View focusSearch;
        C7954a aVar = this.f24071o;
        if (aVar != null) {
            CreditCardInput creditCardInput = this.f24064h;
            if (!creditCardInput.f24075e || !creditCardInput.f24078h || !creditCardInput.f24080j) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                creditCardInput = null;
            }
            CreditCardFormView.C7944b bVar = (CreditCardFormView.C7944b) aVar;
            if (creditCardInput != null && (focusSearch = ((CreditCardInputView) bVar.mo24805a(bVar.f24060c)).focusSearch(130)) != null) {
                focusSearch.requestFocus();
            }
        }
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (editorInfo != null) {
            editorInfo.imeOptions = 5;
        }
        return super.onCreateInputConnection(editorInfo);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        CreditCardInput creditCardInput = (CreditCardInput) bundle.getParcelable("input");
        if (creditCardInput != null) {
            this.f24064h = creditCardInput;
        }
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putParcelable("input", this.f24064h);
        return bundle;
    }

    /* renamed from: q */
    public final void mo24812q(String str, boolean z) {
        boolean z2;
        if (!C20975x0.m49118e(this.f24064h.f24079i, C20964s0.m49106x(str)) || z != this.f24064h.f24080j) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f24064h.f24079i = C20964s0.m49106x(str);
        this.f24064h.f24080j = z;
        this.f24069m.setError((CharSequence) null);
        if (z2) {
            mo24808l();
        }
    }

    /* renamed from: r */
    public final void mo24813r(int i, int i2, boolean z) {
        boolean z2;
        CreditCardInput creditCardInput = this.f24064h;
        if (i == creditCardInput.f24076f && i2 == creditCardInput.f24077g && z == creditCardInput.f24078h) {
            z2 = false;
        } else {
            z2 = true;
        }
        creditCardInput.f24076f = i;
        creditCardInput.f24077g = i2;
        creditCardInput.f24078h = z;
        this.f24067k.setError((CharSequence) null);
        if (z2) {
            mo24808l();
        }
        if (z) {
            this.f24069m.requestFocus();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        if ((r5 % 10) == 0) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        if (r10 == false) goto L_0x006c;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24814s(java.lang.String r10, boolean r11) {
        /*
            r9 = this;
            java.lang.String r10 = p977zz.C20964s0.m49106x(r10)
            com.moovit.view.cc.CreditCardInputView$CreditCardInput r0 = r9.f24064h
            java.lang.String r0 = r0.f24073c
            boolean r0 = p977zz.C20975x0.m49118e(r0, r10)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0019
            com.moovit.view.cc.CreditCardInputView$CreditCardInput r0 = r9.f24064h
            boolean r0 = r0.f24074d
            if (r11 == r0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            com.moovit.view.cc.CreditCardInputView$CreditCardInput r3 = r9.f24064h
            r3.f24073c = r10
            r3.f24074d = r11
            if (r11 == 0) goto L_0x006c
            com.moovit.view.cc.CreditCardConfig r4 = r3.f24072b
            s0.b r5 = com.moovit.view.p340cc.C7963e.f24109a
            com.moovit.view.cc.CreditCardConfig r5 = com.moovit.view.p340cc.CreditCardConfig.UNKNOWN
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x002f
            goto L_0x0066
        L_0x002f:
            int r5 = r10.length()
            int r6 = r4.minCardLength
            if (r6 > r5) goto L_0x0068
            int r4 = r4.maxCardLength
            if (r5 <= r4) goto L_0x003c
            goto L_0x0068
        L_0x003c:
            int r4 = r10.length()
            int r4 = r4 - r1
            r5 = 0
            r6 = 0
        L_0x0043:
            if (r4 < 0) goto L_0x0062
            char r7 = r10.charAt(r4)
            boolean r8 = java.lang.Character.isDigit(r7)
            if (r8 != 0) goto L_0x0050
            goto L_0x0068
        L_0x0050:
            int r7 = r7 + -48
            if (r6 == 0) goto L_0x0056
            int r7 = r7 * 2
        L_0x0056:
            int r8 = r7 / 10
            int r8 = r8 + r5
            int r7 = r7 % 10
            int r5 = r7 + r8
            r6 = r6 ^ 1
            int r4 = r4 + -1
            goto L_0x0043
        L_0x0062:
            int r5 = r5 % 10
            if (r5 != 0) goto L_0x0068
        L_0x0066:
            r10 = 1
            goto L_0x0069
        L_0x0068:
            r10 = 0
        L_0x0069:
            if (r10 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r1 = 0
        L_0x006d:
            r3.f24075e = r1
            com.google.android.material.textfield.TextInputLayout r10 = r9.f24065i
            r1 = 0
            r10.setError(r1)
            if (r0 == 0) goto L_0x007a
            r9.mo24808l()
        L_0x007a:
            if (r11 == 0) goto L_0x0081
            com.google.android.material.textfield.TextInputLayout r10 = r9.f24067k
            r10.requestFocus()
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.view.p340cc.CreditCardInputView.mo24814s(java.lang.String, boolean):void");
    }

    public void setCompleteImeOptions(int i) {
        this.f24070n.setImeOptions(i);
    }

    public void setCreditCardConfig(CreditCardConfig creditCardConfig) {
        CreditCardInput creditCardInput = this.f24064h;
        if (creditCardConfig != creditCardInput.f24072b) {
            C21100e.m49373x(creditCardConfig, "creditCardConfig");
            creditCardInput.f24072b = creditCardConfig;
            if (creditCardConfig != CreditCardConfig.UNKNOWN) {
                this.f24066j.setFilters(new InputFilter[]{new InputFilter.LengthFilter(creditCardConfig.maxCardLength), new C20968u()});
                this.f24070n.setFilters(new InputFilter[]{new InputFilter.LengthFilter(creditCardConfig.cvvLength), new C20968u()});
            } else {
                this.f24066j.setFilters(new InputFilter[]{new InputFilter.LengthFilter(19), new C20968u()});
                this.f24070n.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4), new C20968u()});
            }
            mo24821w();
        }
    }

    public void setCreditCardInputListener(C7954a aVar) {
        this.f24071o = aVar;
    }

    /* renamed from: t */
    public final void mo24818t() {
        String str;
        Editable text = this.f24070n.getText();
        if (!C20964s0.m49090h(text)) {
            str = C13382a.m33670f(C20964s0.m49082C(text));
        } else {
            str = null;
        }
        C13382a.m33674j(this.f24070n, str, getContext().getString(C19746x.voiceover_enter_credit_card_cvv));
    }

    /* renamed from: u */
    public final void mo24819u() {
        EditText editText = this.f24068l;
        C13382a.m33674j(editText, editText.getText(), getContext().getString(C19746x.voiceover_enter_credit_card_expiration));
    }

    /* renamed from: v */
    public final void mo24820v() {
        String str;
        Editable text = this.f24066j.getText();
        if (!C20964s0.m49090h(text)) {
            str = C13382a.m33670f(C20964s0.m49082C(text));
        } else {
            str = null;
        }
        C13382a.m33674j(this.f24066j, str, getContext().getString(C19746x.voiceover_enter_credit_card_number));
    }

    /* renamed from: w */
    public final void mo24821w() {
        C19221e Y = C17884p.m44354Y(this.f24065i);
        Integer valueOf = Integer.valueOf(this.f24064h.f24072b.type.iconResId);
        int h = UiUtils.m40249h(getResources(), 24.0f);
        ((C19220d) ((C19220d) Y.mo10871m().mo10854X(valueOf)).mo22737v(h, h)).mo10848R(new C20689d(this.f24065i, UiUtils.Edge.LEFT));
    }

    public CreditCardInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24064h = new CreditCardInput();
        LayoutInflater.from(context).inflate(C19742t.credit_card_input, this, true);
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(C19740r.card_number);
        this.f24065i = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        C21100e.m49373x(editText, "cardNumberView.getEditText()");
        this.f24066j = editText;
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(19), new C20968u()});
        editText.addTextChangedListener(new C7962d(this));
        C13382a.m33668d(editText, true);
        mo24820v();
        C7961c cVar = new C7961c(this);
        TextInputLayout textInputLayout2 = (TextInputLayout) findViewById(C19740r.card_expiration);
        this.f24067k = textInputLayout2;
        EditText editText2 = textInputLayout2.getEditText();
        C21100e.m49373x(editText2, "cardExpirationDateView.getEditText()");
        this.f24068l = editText2;
        editText2.setFilters(new InputFilter[]{new C20968u()});
        editText2.addTextChangedListener(cVar);
        textInputLayout2.setOnKeyListener(cVar);
        C13382a.m33668d(editText2, true);
        mo24819u();
        C7960b bVar = new C7960b(this);
        TextInputLayout textInputLayout3 = (TextInputLayout) findViewById(C19740r.card_cvv);
        this.f24069m = textInputLayout3;
        EditText editText3 = textInputLayout3.getEditText();
        C21100e.m49373x(editText3, "cardCvvNumberView.getEditText()");
        this.f24070n = editText3;
        editText3.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4), new C20968u()});
        editText3.addTextChangedListener(bVar);
        textInputLayout3.setOnKeyListener(bVar);
        C13382a.m33668d(editText3, true);
        mo24818t();
        if (context instanceof Activity) {
            ((Activity) context).getWindow().setFlags(8192, 8192);
        }
        mo24821w();
    }

    /* renamed from: com.moovit.view.cc.CreditCardInputView$CreditCardInput */
    public static class CreditCardInput implements Parcelable {
        public static final Parcelable.Creator<CreditCardInput> CREATOR = new C7953a();

        /* renamed from: b */
        public CreditCardConfig f24072b;

        /* renamed from: c */
        public String f24073c;

        /* renamed from: d */
        public boolean f24074d;

        /* renamed from: e */
        public boolean f24075e;

        /* renamed from: f */
        public int f24076f;

        /* renamed from: g */
        public int f24077g;

        /* renamed from: h */
        public boolean f24078h;

        /* renamed from: i */
        public String f24079i;

        /* renamed from: j */
        public boolean f24080j;

        /* renamed from: com.moovit.view.cc.CreditCardInputView$CreditCardInput$a */
        public class C7953a implements Parcelable.Creator<CreditCardInput> {
            public final Object createFromParcel(Parcel parcel) {
                return new CreditCardInput(parcel);
            }

            public final Object[] newArray(int i) {
                return new CreditCardInput[i];
            }
        }

        public CreditCardInput() {
            this.f24072b = CreditCardConfig.UNKNOWN;
            this.f24073c = "";
            this.f24074d = false;
            this.f24076f = -1;
            this.f24077g = -1;
            this.f24078h = false;
            this.f24079i = "";
            this.f24080j = false;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f24073c);
            parcel.writeByte(this.f24074d ? (byte) 1 : 0);
            parcel.writeInt(this.f24076f);
            parcel.writeInt(this.f24077g);
            parcel.writeByte(this.f24078h ? (byte) 1 : 0);
            parcel.writeString(this.f24079i);
            parcel.writeByte(this.f24080j ? (byte) 1 : 0);
        }

        public CreditCardInput(Parcel parcel) {
            CreditCardConfig creditCardConfig = (CreditCardConfig) parcel.readParcelable(CreditCardConfig.class.getClassLoader());
            C21100e.m49373x(creditCardConfig, "config");
            this.f24072b = creditCardConfig;
            this.f24073c = C20964s0.m49106x(parcel.readString());
            boolean z = true;
            this.f24074d = parcel.readByte() != 0;
            this.f24076f = parcel.readInt();
            this.f24077g = parcel.readInt();
            this.f24078h = parcel.readByte() != 0;
            this.f24079i = C20964s0.m49106x(parcel.readString());
            this.f24080j = parcel.readByte() == 0 ? false : z;
        }
    }
}
