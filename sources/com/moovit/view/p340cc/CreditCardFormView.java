package com.moovit.view.p340cc;

import a00.C13382a;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import ce0.C21100e;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.view.address.Address;
import com.moovit.view.address.AddressInputView;
import com.moovit.view.p340cc.CreditCardInputView;
import i00.C17522a;
import java.util.Arrays;
import java.util.List;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p977zz.C20964s0;
import p977zz.C20968u;

/* renamed from: com.moovit.view.cc.CreditCardFormView */
public class CreditCardFormView extends LinearLayout {

    /* renamed from: b */
    public CreditCardFormInput f24044b;

    /* renamed from: c */
    public final C7943a f24045c;

    /* renamed from: d */
    public final List<C7949f> f24046d;

    /* renamed from: e */
    public int f24047e;

    /* renamed from: com.moovit.view.cc.CreditCardFormView$a */
    public static class C7943a extends C7949f {

        /* renamed from: e */
        public Address f24055e = null;

        public C7943a() {
            super(8, C19742t.credit_card_form_billing_address, C19740r.billing_address);
        }

        /* renamed from: b */
        public final void mo24797b(CreditCardFormInput creditCardFormInput, boolean z) {
            creditCardFormInput.f24054h = z ? this.f24055e : null;
        }

        /* renamed from: c */
        public final boolean mo24798c(boolean z) {
            Address s = ((AddressInputView) mo24805a(this.f24060c)).mo24775s(true, z);
            this.f24055e = s;
            if (s != null) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final void mo24799d(ViewGroup viewGroup) {
            int i = C19740r.billing_address_label;
            View findViewById = viewGroup.findViewById(i);
            if (findViewById != null) {
                this.f24061d.put(i, findViewById);
            }
            int i2 = C19740r.billing_address_divider;
            View findViewById2 = viewGroup.findViewById(i2);
            if (findViewById2 != null) {
                this.f24061d.put(i2, findViewById2);
            }
        }

        /* renamed from: e */
        public final void mo24800e(int i) {
            ((AddressInputView) mo24805a(this.f24060c)).setCompleteImeOptions(i);
        }
    }

    /* renamed from: com.moovit.view.cc.CreditCardFormView$b */
    public static class C7944b extends C7949f implements CreditCardInputView.C7954a {

        /* renamed from: e */
        public CreditCardInputView.CreditCardInput f24056e = null;

        public C7944b() {
            super(0, C19742t.credit_card_form_card_details, C19740r.card_details);
        }

        /* renamed from: b */
        public final void mo24797b(CreditCardFormInput creditCardFormInput, boolean z) {
            creditCardFormInput.f24051e = z ? this.f24056e : null;
        }

        /* renamed from: c */
        public final boolean mo24798c(boolean z) {
            boolean z2;
            CreditCardInputView creditCardInputView = (CreditCardInputView) mo24805a(this.f24060c);
            CreditCardInputView.CreditCardInput creditCardInput = creditCardInputView.f24064h;
            if (!creditCardInput.f24075e || !creditCardInput.f24078h || !creditCardInput.f24080j) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                Context context = creditCardInputView.getContext();
                TextInputLayout textInputLayout = creditCardInputView.f24065i;
                String string = context.getString(C19746x.credit_card_details_error);
                boolean z3 = creditCardInputView.f24064h.f24075e;
                if (z3) {
                    string = null;
                }
                textInputLayout.setError(string);
                if (!z3 && z) {
                    textInputLayout.requestFocus();
                }
                boolean z4 = z & z & z3;
                TextInputLayout textInputLayout2 = creditCardInputView.f24067k;
                String string2 = context.getString(C19746x.payment_registration_enter_credit_card_invalid_expiration);
                boolean z5 = creditCardInputView.f24064h.f24078h;
                if (z5) {
                    string2 = null;
                }
                textInputLayout2.setError(string2);
                if (!z5 && z4) {
                    textInputLayout2.requestFocus();
                }
                boolean z6 = z4 & z4 & z5;
                TextInputLayout textInputLayout3 = creditCardInputView.f24069m;
                String string3 = context.getString(C19746x.cvv_error);
                boolean z7 = creditCardInputView.f24064h.f24080j;
                if (z7) {
                    string3 = null;
                }
                textInputLayout3.setError(string3);
                if (!z7 && z6) {
                    textInputLayout3.requestFocus();
                }
                creditCardInput = null;
            }
            this.f24056e = creditCardInput;
            if (creditCardInput != null) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final void mo24799d(ViewGroup viewGroup) {
            ((CreditCardInputView) mo24805a(this.f24060c)).setCreditCardInputListener(this);
        }

        /* renamed from: e */
        public final void mo24800e(int i) {
            ((CreditCardInputView) mo24805a(this.f24060c)).setCompleteImeOptions(i);
        }
    }

    /* renamed from: com.moovit.view.cc.CreditCardFormView$c */
    public static class C7945c extends C7951h {

        /* renamed from: com.moovit.view.cc.CreditCardFormView$c$a */
        public class C7946a extends C17522a {

            /* renamed from: b */
            public final /* synthetic */ TextInputLayout f24057b;

            public C7946a(TextInputLayout textInputLayout) {
                this.f24057b = textInputLayout;
            }

            public final void afterTextChanged(Editable editable) {
                int i;
                View focusSearch;
                if (editable != null) {
                    i = editable.length();
                } else {
                    i = 0;
                }
                if (i >= 9 && (focusSearch = this.f24057b.focusSearch(130)) != null) {
                    focusSearch.requestFocus();
                }
            }
        }

        public C7945c() {
            super(1, C19742t.credit_card_form_card_holder_id, C19740r.card_holder_id);
        }

        /* renamed from: d */
        public final void mo24799d(ViewGroup viewGroup) {
            super.mo24799d(viewGroup);
            TextInputLayout textInputLayout = (TextInputLayout) mo24805a(this.f24060c);
            EditText editText = textInputLayout.getEditText();
            editText.setFilters(new InputFilter[]{new C20968u()});
            editText.addTextChangedListener(new C7946a(textInputLayout));
        }

        /* renamed from: f */
        public final String mo24801f() {
            return mo24805a(this.f24060c).getContext().getString(C19746x.credit_card_holder_id_error);
        }

        /* renamed from: g */
        public final void mo24802g(CreditCardFormInput creditCardFormInput, String str) {
            creditCardFormInput.f24050d = str;
        }

        /* renamed from: i */
        public final void mo24803i() {
            String str;
            TextInputLayout textInputLayout = (TextInputLayout) mo24805a(this.f24060c);
            EditText editText = textInputLayout.getEditText();
            Editable text = editText.getText();
            if (!C20964s0.m49090h(text)) {
                str = C13382a.m33670f(C20964s0.m49082C(text));
            } else {
                str = null;
            }
            editText.setContentDescription(C13382a.m33667c(str, textInputLayout.getContext().getString(C19746x.voiceover_enter_cardholder_id_hint)));
        }
    }

    /* renamed from: com.moovit.view.cc.CreditCardFormView$d */
    public static class C7947d extends C7951h {
        public C7947d() {
            super(0, C19742t.credit_card_form_card_holder_name, C19740r.card_holder_name);
        }

        /* renamed from: f */
        public final String mo24801f() {
            return mo24805a(this.f24060c).getContext().getString(C19746x.credit_card_holder_name_error);
        }

        /* renamed from: g */
        public final void mo24802g(CreditCardFormInput creditCardFormInput, String str) {
            creditCardFormInput.f24049c = str;
        }

        /* renamed from: h */
        public final boolean mo24804h(Editable editable) {
            return C20964s0.m49094l(editable);
        }

        /* renamed from: i */
        public final void mo24803i() {
            TextInputLayout textInputLayout = (TextInputLayout) mo24805a(this.f24060c);
            textInputLayout.getEditText().setContentDescription(C13382a.m33667c(textInputLayout.getEditText().getText(), textInputLayout.getContext().getString(C19746x.voiceover_enter_cardholder_name_hint)));
        }
    }

    /* renamed from: com.moovit.view.cc.CreditCardFormView$e */
    public static class C7948e extends C7951h {
        public C7948e() {
            super(4, C19742t.credit_card_form_country_code, C19740r.country_code);
        }

        /* renamed from: f */
        public final String mo24801f() {
            return mo24805a(this.f24060c).getContext().getString(C19746x.credit_card_country_code_error);
        }

        /* renamed from: g */
        public final void mo24802g(CreditCardFormInput creditCardFormInput, String str) {
            creditCardFormInput.f24053g = str;
        }

        /* renamed from: i */
        public final void mo24803i() {
            TextInputLayout textInputLayout = (TextInputLayout) mo24805a(this.f24060c);
            EditText editText = textInputLayout.getEditText();
            editText.setContentDescription(C13382a.m33667c(editText.getText(), textInputLayout.getContext().getString(C19746x.voiceover_enter_country_code_hint)));
        }
    }

    /* renamed from: com.moovit.view.cc.CreditCardFormView$f */
    public static abstract class C7949f {

        /* renamed from: a */
        public final int f24058a;

        /* renamed from: b */
        public final int f24059b;

        /* renamed from: c */
        public final int f24060c;

        /* renamed from: d */
        public final SparseArray<View> f24061d = new SparseArray<>(1);

        public C7949f(int i, int i2, int i3) {
            this.f24058a = i;
            Integer valueOf = Integer.valueOf(i2);
            C21100e.m49373x(valueOf, "layoutResId");
            this.f24059b = valueOf.intValue();
            this.f24060c = i3;
        }

        /* renamed from: a */
        public final <T extends View> T mo24805a(int i) {
            return (View) this.f24061d.get(i);
        }

        /* renamed from: b */
        public abstract void mo24797b(CreditCardFormInput creditCardFormInput, boolean z);

        /* renamed from: c */
        public abstract boolean mo24798c(boolean z);

        /* renamed from: d */
        public void mo24799d(ViewGroup viewGroup) {
        }

        /* renamed from: e */
        public abstract void mo24800e(int i);
    }

    /* renamed from: com.moovit.view.cc.CreditCardFormView$g */
    public static class C7950g extends C7951h {
        public C7950g() {
            super(2, C19742t.credit_card_form_postal_code, C19740r.postal_code);
        }

        /* renamed from: f */
        public final String mo24801f() {
            return mo24805a(this.f24060c).getContext().getString(C19746x.credit_card_postal_code_error);
        }

        /* renamed from: g */
        public final void mo24802g(CreditCardFormInput creditCardFormInput, String str) {
            creditCardFormInput.f24052f = str;
        }

        /* renamed from: i */
        public final void mo24803i() {
            TextInputLayout textInputLayout = (TextInputLayout) mo24805a(this.f24060c);
            EditText editText = textInputLayout.getEditText();
            editText.setContentDescription(C13382a.m33667c(editText.getText(), textInputLayout.getContext().getString(C19746x.voiceover_enter_postal_code_hint)));
        }
    }

    /* renamed from: com.moovit.view.cc.CreditCardFormView$h */
    public static abstract class C7951h extends C7949f {

        /* renamed from: com.moovit.view.cc.CreditCardFormView$h$a */
        public class C7952a extends C17522a {

            /* renamed from: b */
            public final /* synthetic */ TextInputLayout f24062b;

            public C7952a(TextInputLayout textInputLayout) {
                this.f24062b = textInputLayout;
            }

            public final void afterTextChanged(Editable editable) {
                this.f24062b.setError((CharSequence) null);
                C7951h.this.mo24803i();
            }
        }

        public C7951h(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        /* renamed from: b */
        public final void mo24797b(CreditCardFormInput creditCardFormInput, boolean z) {
            String str;
            TextInputLayout textInputLayout = (TextInputLayout) mo24805a(this.f24060c);
            if (z) {
                str = C20964s0.m49082C(textInputLayout.getEditText().getText());
            } else {
                str = null;
            }
            mo24802g(creditCardFormInput, str);
        }

        /* renamed from: c */
        public final boolean mo24798c(boolean z) {
            String str;
            TextInputLayout textInputLayout = (TextInputLayout) mo24805a(this.f24060c);
            boolean h = mo24804h(textInputLayout.getEditText().getText());
            if (!h) {
                str = mo24801f();
            } else {
                str = null;
            }
            textInputLayout.setError(str);
            if (!h && z) {
                textInputLayout.requestFocus();
            }
            return h;
        }

        /* renamed from: d */
        public void mo24799d(ViewGroup viewGroup) {
            TextInputLayout textInputLayout = (TextInputLayout) mo24805a(this.f24060c);
            EditText editText = textInputLayout.getEditText();
            C13382a.m33668d(editText, true);
            editText.addTextChangedListener(new C7952a(textInputLayout));
            mo24803i();
        }

        /* renamed from: e */
        public final void mo24800e(int i) {
            ((TextInputLayout) mo24805a(this.f24060c)).getEditText().setImeOptions(i);
        }

        /* renamed from: f */
        public abstract String mo24801f();

        /* renamed from: g */
        public abstract void mo24802g(CreditCardFormInput creditCardFormInput, String str);

        /* renamed from: h */
        public boolean mo24804h(Editable editable) {
            return !C20964s0.m49090h(editable);
        }

        /* renamed from: i */
        public abstract void mo24803i();
    }

    public CreditCardFormView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo24787a() {
        boolean z;
        int i;
        C7949f fVar = null;
        for (C7949f next : this.f24046d) {
            next.mo24800e(5);
            int i2 = this.f24047e;
            int i3 = next.f24058a;
            if ((i2 & i3) == i3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            for (int i4 = 0; i4 < next.f24061d.size(); i4++) {
                next.f24061d.valueAt(i4).setVisibility(i);
            }
            if (z) {
                fVar = next;
            }
        }
        if (fVar != null) {
            fVar.mo24800e(6);
        }
    }

    /* renamed from: b */
    public final C7959a mo24788b() {
        CreditCardInputView.CreditCardInput creditCardInput;
        boolean z;
        boolean z2;
        boolean z3 = true;
        boolean z4 = true;
        for (C7949f next : this.f24046d) {
            int i = this.f24047e;
            int i2 = next.f24058a;
            boolean z5 = false;
            if ((i & i2) == i2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                CreditCardFormInput creditCardFormInput = this.f24044b;
                if ((i & i2) == i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && next.mo24798c(z4)) {
                    z5 = true;
                }
                next.mo24797b(creditCardFormInput, z5);
                z3 &= z5;
                z4 &= z3;
            }
        }
        if (!z3) {
            return null;
        }
        CreditCardFormInput creditCardFormInput2 = this.f24044b;
        if (creditCardFormInput2.f24049c == null || (creditCardInput = creditCardFormInput2.f24051e) == null) {
            return null;
        }
        return new C7959a(creditCardInput.f24072b.type, creditCardInput.f24073c, String.valueOf(creditCardInput.f24076f), String.valueOf(creditCardFormInput2.f24051e.f24077g), creditCardFormInput2.f24051e.f24079i, creditCardFormInput2.f24049c, creditCardFormInput2.f24050d, creditCardFormInput2.f24052f, creditCardFormInput2.f24053g, creditCardFormInput2.f24054h);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        this.f24047e = bundle.getInt("requiredFields");
        CreditCardFormInput creditCardFormInput = (CreditCardFormInput) bundle.getParcelable("input");
        if (creditCardFormInput != null) {
            this.f24044b = creditCardFormInput;
        }
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putInt("requiredFields", this.f24047e);
        bundle.putParcelable("input", this.f24044b);
        return bundle;
    }

    public void setCountryCode(String str) {
        C7943a aVar = this.f24045c;
        ((AddressInputView) aVar.mo24805a(aVar.f24060c)).setCountryCode(str);
    }

    public void setRequiredFields(int i) {
        if (this.f24047e != i) {
            this.f24047e = i;
            mo24787a();
        }
    }

    public CreditCardFormView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24044b = new CreditCardFormInput();
        C7947d dVar = new C7947d();
        C7945c cVar = new C7945c();
        C7944b bVar = new C7944b();
        C7950g gVar = new C7950g();
        C7948e eVar = new C7948e();
        C7943a aVar = new C7943a();
        this.f24045c = aVar;
        List<C7949f> asList = Arrays.asList(new C7949f[]{bVar, cVar, dVar, gVar, eVar, aVar});
        this.f24046d = asList;
        this.f24047e = 0;
        setOrientation(1);
        setGravity(17);
        for (C7949f next : asList) {
            next.getClass();
            LayoutInflater.from(getContext()).inflate(next.f24059b, this, true);
            int i2 = next.f24060c;
            View findViewById = findViewById(i2);
            if (findViewById != null) {
                next.f24061d.put(i2, findViewById);
            }
            next.mo24799d(this);
        }
        mo24787a();
    }

    /* renamed from: com.moovit.view.cc.CreditCardFormView$CreditCardFormInput */
    public static class CreditCardFormInput implements Parcelable {
        public static final Parcelable.Creator<CreditCardFormInput> CREATOR = new C7942a();

        /* renamed from: b */
        public boolean f24048b;

        /* renamed from: c */
        public String f24049c;

        /* renamed from: d */
        public String f24050d;

        /* renamed from: e */
        public CreditCardInputView.CreditCardInput f24051e;

        /* renamed from: f */
        public String f24052f;

        /* renamed from: g */
        public String f24053g;

        /* renamed from: h */
        public Address f24054h;

        /* renamed from: com.moovit.view.cc.CreditCardFormView$CreditCardFormInput$a */
        public class C7942a implements Parcelable.Creator<CreditCardFormInput> {
            public final Object createFromParcel(Parcel parcel) {
                return new CreditCardFormInput(parcel);
            }

            public final Object[] newArray(int i) {
                return new CreditCardFormInput[i];
            }
        }

        public CreditCardFormInput() {
            this.f24048b = false;
            this.f24049c = null;
            this.f24050d = null;
            this.f24051e = null;
            this.f24052f = null;
            this.f24053g = null;
            this.f24054h = null;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeByte(this.f24048b ? (byte) 1 : 0);
            parcel.writeString(this.f24049c);
            parcel.writeString(this.f24050d);
            parcel.writeParcelable(this.f24051e, i);
            parcel.writeString(this.f24052f);
            parcel.writeString(this.f24053g);
            parcel.writeParcelable(this.f24054h, i);
        }

        public CreditCardFormInput(Parcel parcel) {
            this.f24048b = parcel.readByte() != 0;
            this.f24049c = parcel.readString();
            this.f24050d = parcel.readString();
            this.f24051e = (CreditCardInputView.CreditCardInput) parcel.readParcelable(CreditCardInputView.CreditCardInput.class.getClassLoader());
            this.f24052f = parcel.readString();
            this.f24053g = parcel.readString();
            this.f24054h = (Address) parcel.readParcelable(Address.class.getClassLoader());
        }
    }
}
