package com.moovit.view.address;

import a00.C13382a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import ce0.C21100e;
import com.google.android.material.textfield.TextInputLayout;
import e20.C16775g;
import fa0.C12649a;
import fa0.C12650b;
import fa0.C12651c;
import i00.C17522a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p054d0.C4291k0;
import p239rb.C6298j;
import p531he.C17399f0;
import p641lu.C18278c;
import p824tp.C19734l;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p977zz.C20930c;
import p977zz.C20964s0;
import s80.C13068e;

public class AddressInputView extends ConstraintLayout {

    /* renamed from: t */
    public static final /* synthetic */ int f24023t = 0;

    /* renamed from: h */
    public C7937d f24024h;

    /* renamed from: i */
    public final TextInputLayout f24025i;

    /* renamed from: j */
    public final EditText f24026j;

    /* renamed from: k */
    public final EditText f24027k;

    /* renamed from: l */
    public final TextInputLayout f24028l;

    /* renamed from: m */
    public final EditText f24029m;

    /* renamed from: n */
    public final TextInputLayout f24030n;

    /* renamed from: o */
    public final AutoCompleteTextView f24031o;

    /* renamed from: p */
    public final TextInputLayout f24032p;

    /* renamed from: q */
    public final AutoCompleteTextView f24033q;

    /* renamed from: r */
    public final TextInputLayout f24034r;

    /* renamed from: s */
    public final EditText f24035s;

    public enum State {
        US("US", C19734l.us_states_code, C19734l.us_states, 2);
        
        public final String countryCode;
        public final Integer postalCodeInputType;
        public final int stateCodes;
        public final int states;

        private State(String str, int i, int i2, Integer num) {
            C21100e.m49373x(str, "countryCode");
            this.countryCode = str;
            this.stateCodes = i;
            this.states = i2;
            this.postalCodeInputType = num;
        }

        public static State from(String str) {
            if (str == null) {
                return null;
            }
            return (State) C13723g.m34286g(Arrays.asList(values()), new C7940a(str));
        }
    }

    /* renamed from: com.moovit.view.address.AddressInputView$a */
    public class C7934a extends C17522a {
        public C7934a() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            AddressInputView.this.f24025i.setError((CharSequence) null);
            C7937d dVar = AddressInputView.this.f24024h;
            if (dVar != null) {
                ((C4291k0) dVar).mo19811f(true);
            }
        }
    }

    /* renamed from: com.moovit.view.address.AddressInputView$b */
    public class C7935b extends C17522a {
        public C7935b() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            AddressInputView.this.f24028l.setError((CharSequence) null);
            C7937d dVar = AddressInputView.this.f24024h;
            if (dVar != null) {
                ((C4291k0) dVar).mo19811f(true);
            }
        }
    }

    /* renamed from: com.moovit.view.address.AddressInputView$c */
    public class C7936c extends C17522a {
        public C7936c() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            AddressInputView.this.f24034r.setError((CharSequence) null);
            C7937d dVar = AddressInputView.this.f24024h;
            if (dVar != null) {
                ((C4291k0) dVar).mo19811f(true);
            }
        }
    }

    /* renamed from: com.moovit.view.address.AddressInputView$d */
    public interface C7937d {
    }

    /* renamed from: com.moovit.view.address.AddressInputView$e */
    public static class C7938e {

        /* renamed from: a */
        public final String f24040a;

        /* renamed from: b */
        public final String f24041b;

        public C7938e(String str, String str2) {
            Object[] objArr = {str, str2};
            String str3 = C20964s0.f52718a;
            this.f24040a = String.format((Locale) null, "%1$s (%2$s)", objArr);
            C21100e.m49373x(str2, "data");
            this.f24041b = str2;
        }

        public final String toString() {
            return this.f24040a;
        }
    }

    /* renamed from: com.moovit.view.address.AddressInputView$f */
    public static class C7939f extends ArrayAdapter<C7938e> {

        /* renamed from: b */
        public final List<C7938e> f24042b;

        public C7939f(Context context, ArrayList arrayList) {
            super(context, C19742t.spinner_text_item_dropdown, arrayList);
            this.f24042b = arrayList;
        }
    }

    public AddressInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private String getCountryCode() {
        return (String) this.f24031o.getTag();
    }

    private String getStateCode() {
        return (String) this.f24033q.getTag();
    }

    /* renamed from: q */
    public static void m18066q(TextInputLayout textInputLayout, String str, boolean z, boolean z2, boolean z3) {
        if (z || !z2) {
            str = null;
        }
        textInputLayout.setError(str);
        if (!z && z3) {
            textInputLayout.requestFocus();
        }
    }

    private void setStateCode(String str) {
        C7939f fVar;
        int d;
        if (str != null && (fVar = (C7939f) this.f24033q.getAdapter()) != null && (d = C13717b.m34257d(fVar.f24042b, new C16775g(str, 2))) != -1) {
            this.f24033q.setTag(str);
            this.f24033q.setText(fVar.f24042b.get(d).f24040a, false);
        }
    }

    /* renamed from: l */
    public final boolean mo24773l() {
        if (!C20964s0.m49090h(this.f24026j.getText()) || !C20964s0.m49090h(this.f24027k.getText()) || !C20964s0.m49090h(this.f24029m.getText()) || !C20964s0.m49090h(this.f24035s.getText())) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.String[], java.io.Serializable] */
    /* renamed from: r */
    public final void mo24774r() {
        int i;
        Integer num;
        State from = State.from(getCountryCode());
        if (from == null) {
            this.f24033q.setAdapter((ListAdapter) null);
            this.f24033q.setText((CharSequence) null);
            this.f24033q.setTag((Object) null);
            this.f24032p.setVisibility(8);
        } else {
            Context context = getContext();
            ? stringArray = context.getResources().getStringArray(from.states);
            this.f24033q.setAdapter(new C7939f(context, C13720d.m34273c(new C13717b.C13718a(0, stringArray.length), (C13722f) null, new C13068e(stringArray, context.getResources().getStringArray(from.stateCodes), 1))));
            this.f24032p.setVisibility(0);
        }
        if (from == null || (num = from.postalCodeInputType) == null) {
            i = 113;
        } else {
            i = num.intValue();
        }
        this.f24035s.setInputType(i);
    }

    /* renamed from: s */
    public final Address mo24775s(boolean z, boolean z2) {
        boolean z3;
        Context context = getContext();
        TextInputLayout textInputLayout = this.f24025i;
        String string = context.getString(C19746x.payment_street_line_1_error);
        boolean z4 = !C20964s0.m49090h(this.f24026j.getText());
        m18066q(textInputLayout, string, z4, z, z2);
        boolean z5 = z2 & z4;
        TextInputLayout textInputLayout2 = this.f24028l;
        String string2 = context.getString(C19746x.payment_city_error);
        boolean z6 = !C20964s0.m49090h(this.f24029m.getText());
        m18066q(textInputLayout2, string2, z6, z, z5);
        boolean z7 = z4 & z6;
        boolean z8 = z5 & z7;
        TextInputLayout textInputLayout3 = this.f24030n;
        String string3 = context.getString(C19746x.payment_country_error);
        boolean z9 = !C20964s0.m49090h(getCountryCode());
        m18066q(textInputLayout3, string3, z9, z, z8);
        boolean z11 = z7 & z9;
        boolean z12 = z8 & z11;
        TextInputLayout textInputLayout4 = this.f24032p;
        String string4 = context.getString(C19746x.payment_state_error);
        if (this.f24032p.getVisibility() == 8 || !C20964s0.m49090h(getStateCode())) {
            z3 = true;
        } else {
            z3 = false;
        }
        m18066q(textInputLayout4, string4, z3, z, z12);
        boolean z13 = z11 & z3;
        TextInputLayout textInputLayout5 = this.f24034r;
        String string5 = context.getString(C19746x.payment_registration_enter_zip_code_error);
        boolean z14 = !C20964s0.m49090h(this.f24035s.getText());
        m18066q(textInputLayout5, string5, z14, z, z12 & z13);
        if (z13 && z14) {
            return new Address(C20964s0.m49082C(this.f24026j.getText()), C20964s0.m49082C(this.f24027k.getText()), C20964s0.m49082C(this.f24029m.getText()), getCountryCode(), getStateCode(), C20964s0.m49082C(this.f24035s.getText().toString()));
        }
        return null;
    }

    public void setAddress(Address address) {
        this.f24026j.setText(address.f24017b);
        this.f24027k.setText(address.f24018c);
        this.f24029m.setText(address.f24019d);
        setCountryCode(address.f24022g);
        setStateCode(address.f24020e);
        this.f24035s.setText(address.f24021f);
    }

    public void setCompleteEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        this.f24035s.setOnEditorActionListener(onEditorActionListener);
    }

    public void setCompleteImeOptions(int i) {
        this.f24035s.setImeOptions(i);
    }

    public void setCountryCode(String str) {
        C7939f fVar = (C7939f) this.f24031o.getAdapter();
        if (fVar != null) {
            List<C7938e> list = fVar.f24042b;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (list.get(i).f24041b.equals(str)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                this.f24031o.setTag(str);
                this.f24031o.setText(fVar.f24042b.get(i).f24040a, false);
                mo24774r();
            }
        }
    }

    public void setOnInputChangedListener(C7937d dVar) {
        this.f24024h = dVar;
    }

    public AddressInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(C19742t.address_input, this, true);
        TextInputLayout textInputLayout = (TextInputLayout) findViewById(C19740r.street_address);
        this.f24025i = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        C21100e.m49373x(editText, "streetAddressTextInput.getEditText()");
        this.f24026j = editText;
        C13382a.m33668d(editText, true);
        editText.addTextChangedListener(new C7934a());
        EditText editText2 = ((TextInputLayout) findViewById(C19740r.secondary_street_address)).getEditText();
        C21100e.m49373x(editText2, "secondaryStreetAddressTextInput.getEditText()");
        this.f24027k = editText2;
        TextInputLayout textInputLayout2 = (TextInputLayout) findViewById(C19740r.city);
        this.f24028l = textInputLayout2;
        EditText editText3 = textInputLayout2.getEditText();
        C21100e.m49373x(editText3, "cityTextInput.getEditText()");
        this.f24029m = editText3;
        C13382a.m33668d(editText3, true);
        editText3.addTextChangedListener(new C7935b());
        ArrayList c = C13720d.m34273c(Arrays.asList(Locale.getISOCountries()), (C13722f) null, new C17399f0(C20930c.m49020b(context), 3));
        Collections.sort(c, new C6298j(5));
        this.f24030n = (TextInputLayout) findViewById(C19740r.country);
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(C19740r.country_code);
        this.f24031o = autoCompleteTextView;
        autoCompleteTextView.setAdapter(new C7939f(context, c));
        autoCompleteTextView.setOnFocusChangeListener(new C12649a());
        autoCompleteTextView.setOnItemClickListener(new C18278c(this, 1));
        this.f24032p = (TextInputLayout) findViewById(C19740r.state);
        AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) findViewById(C19740r.state_code);
        this.f24033q = autoCompleteTextView2;
        autoCompleteTextView2.setOnFocusChangeListener(new C12650b());
        autoCompleteTextView2.setOnItemClickListener(new C12651c(this));
        TextInputLayout textInputLayout3 = (TextInputLayout) findViewById(C19740r.postal_code_text_input);
        this.f24034r = textInputLayout3;
        EditText editText4 = textInputLayout3.getEditText();
        C21100e.m49373x(editText4, "postalCodeTextInput.getEditText()");
        this.f24035s = editText4;
        C13382a.m33668d(editText4, true);
        editText4.addTextChangedListener(new C7936c());
        setCountryCode(C20930c.m49020b(context).getCountry());
    }
}
