package p804st;

import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.moovit.C15682c;
import com.moovit.app.intro.login.FirstTimeLoginActivity;
import com.tranzmate.R;
import i00.C17522a;
import p297w5.C6994a;
import p977zz.C20964s0;

/* renamed from: st.b */
public class C19526b extends C15682c<FirstTimeLoginActivity> {

    /* renamed from: n */
    public static final /* synthetic */ int f49630n = 0;

    /* renamed from: st.b$a */
    public class C19527a extends C17522a {

        /* renamed from: b */
        public final /* synthetic */ Button f49631b;

        public C19527a(Button button) {
            this.f49631b = button;
        }

        public final void afterTextChanged(Editable editable) {
            if (C20964s0.m49095m(editable)) {
                this.f49631b.setTag(editable.toString());
                this.f49631b.setEnabled(true);
                return;
            }
            this.f49631b.setEnabled(false);
        }
    }

    public C19526b() {
        super(FirstTimeLoginActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.first_time_login_phone_input, viewGroup, false);
        Button button = (Button) inflate.findViewById(R.id.accept_button);
        button.setOnClickListener(new C6994a(this, 12));
        ((EditText) inflate.findViewById(R.id.phone_number)).addTextChangedListener(new C19527a(button));
        String string = getString(R.string.login_onboarding_phone_input_button);
        String string2 = getString(R.string.terms_of_service_link);
        C19528c cVar = new C19528c(this);
        String string3 = getString(R.string.privacy_text);
        C19529d dVar = new C19529d(this);
        String string4 = getString(R.string.login_onboarding_phone_input_legal, string, string2, string3);
        SpannableString spannableString = new SpannableString(string4);
        int indexOf = string4.indexOf(string2);
        if (indexOf != -1) {
            spannableString.setSpan(cVar, indexOf, string2.length() + indexOf, 33);
        }
        int indexOf2 = string4.indexOf(string3);
        if (indexOf2 != -1) {
            spannableString.setSpan(dVar, indexOf2, string3.length() + indexOf2, 33);
        }
        TextView textView = (TextView) inflate.findViewById(R.id.legal);
        textView.setText(spannableString);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        return inflate;
    }
}
