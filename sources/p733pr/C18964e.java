package p733pr;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.carpool.registration.CarpoolRegistrationActivity;
import com.moovit.commons.utils.UiUtils;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.taxi.MVSourceFeature;
import i00.C17522a;
import p685nr.C18586a;
import p977zz.C20941h;
import p977zz.C20964s0;
import z90.C13346d;

/* renamed from: pr.e */
public class C18964e extends C18586a {

    /* renamed from: p */
    public static final /* synthetic */ int f48283p = 0;

    /* renamed from: b */
    public final C18965a f48284b = new C18965a();

    /* renamed from: c */
    public final C18966b f48285c = new C18966b();

    /* renamed from: d */
    public final C18967c f48286d = new C18967c();

    /* renamed from: e */
    public final C18968d f48287e = new C18968d();

    /* renamed from: f */
    public boolean f48288f;

    /* renamed from: g */
    public final C18969e f48289g = new C18969e();

    /* renamed from: h */
    public View f48290h;

    /* renamed from: i */
    public TextView f48291i;

    /* renamed from: j */
    public String f48292j;

    /* renamed from: k */
    public TextView f48293k;

    /* renamed from: l */
    public Button f48294l;

    /* renamed from: m */
    public ViewGroup f48295m;

    /* renamed from: n */
    public final Handler f48296n = new Handler();

    /* renamed from: o */
    public C18971g f48297o;

    /* renamed from: pr.e$a */
    public class C18965a implements View.OnFocusChangeListener {
        public C18965a() {
        }

        public final void onFocusChange(View view, boolean z) {
            if (z && !C18964e.this.f48288f) {
                UiUtils.m40240H(view.getContext());
                C18964e.this.f48288f = true;
            }
        }
    }

    /* renamed from: pr.e$b */
    public class C18966b extends C17522a {
        public C18966b() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            boolean z;
            C18964e eVar = C18964e.this;
            int i4 = C18964e.f48283p;
            int i5 = 0;
            if (eVar.mo51477K1().length() >= 4) {
                z = true;
            } else {
                z = false;
            }
            eVar.f48290h.setEnabled(z);
            eVar.f48291i.setVisibility(8);
            eVar.mo51479M1(R.attr.colorOnSurface);
            while (i5 < eVar.f48295m.getChildCount()) {
                View childAt = eVar.f48295m.getChildAt(i5);
                if (!(childAt instanceof EditText) || !childAt.hasFocus() || C20964s0.m49090h(((EditText) childAt).getText()) || i5 == eVar.f48295m.getChildCount() - 1) {
                    i5++;
                } else {
                    eVar.f48295m.getChildAt(i5 + 1).requestFocus();
                    return;
                }
            }
        }
    }

    /* renamed from: pr.e$c */
    public class C18967c implements TextView.OnEditorActionListener {
        public C18967c() {
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            C18964e.this.mo51478L1();
            return false;
        }
    }

    /* renamed from: pr.e$d */
    public class C18968d implements View.OnKeyListener {
        public C18968d() {
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            C18964e eVar = C18964e.this;
            EditText editText = (EditText) view;
            int i2 = C18964e.f48283p;
            eVar.getClass();
            if (i != 67 || keyEvent.getAction() != 0 || !C20964s0.m49090h(editText.getText())) {
                return false;
            }
            View focusSearch = editText.focusSearch(17);
            if (focusSearch != null) {
                focusSearch.requestFocus();
            }
            return true;
        }
    }

    /* renamed from: pr.e$e */
    public class C18969e implements View.OnClickListener {
        public C18969e() {
        }

        public final void onClick(View view) {
            C18964e.this.mo51478L1();
        }
    }

    /* renamed from: H1 */
    public final int mo50979H1() {
        return R.string.carpool_registration_activity_title;
    }

    /* renamed from: J1 */
    public final AnalyticsEventKey mo50981J1() {
        return AnalyticsEventKey.STEP_VALIDATE_PHONE;
    }

    /* renamed from: K1 */
    public final String mo51477K1() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f48295m.getChildCount(); i++) {
            View childAt = this.f48295m.getChildAt(i);
            if (childAt instanceof EditText) {
                sb.append(((EditText) childAt).getText().toString());
            }
        }
        return sb.toString();
    }

    /* renamed from: L1 */
    public final void mo51478L1() {
        String K1 = mo51477K1();
        if (K1.length() >= 4) {
            CarpoolRegistrationActivity I1 = mo50980I1();
            I1.mo44540t2(R.string.carpool_registration_verifying_code);
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            I1.mo44527k2("resend_verification_code", new C13346d(I1.mo44548x1(), K1, MVSourceFeature.CAR_POOL), requestOptions, I1.f37818X);
        }
    }

    /* renamed from: M1 */
    public final void mo51479M1(int i) {
        int f = C20941h.m49043f(i, this.f48295m.getContext());
        for (int i2 = 0; i2 < this.f48295m.getChildCount(); i2++) {
            View childAt = this.f48295m.getChildAt(i2);
            if (childAt instanceof EditText) {
                ((EditText) childAt).setTextColor(f);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f48292j = getArguments().getString("phoneNumber");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.carpool_registration_phone_validation_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.continue_button);
        this.f48290h = findViewById;
        findViewById.setOnClickListener(this.f48289g);
        this.f48291i = (TextView) inflate.findViewById(R.id.error);
        this.f48295m = (ViewGroup) inflate.findViewById(R.id.digits);
        for (int i = 0; i < this.f48295m.getChildCount(); i++) {
            View childAt = this.f48295m.getChildAt(i);
            if (childAt instanceof EditText) {
                EditText editText = (EditText) childAt;
                editText.setOnFocusChangeListener(this.f48284b);
                editText.addTextChangedListener(this.f48285c);
                editText.setOnEditorActionListener(this.f48286d);
                editText.setOnKeyListener(this.f48287e);
            }
        }
        this.f48293k = (TextView) inflate.findViewById(R.id.verification_code_resend_countdown);
        Button button = (Button) inflate.findViewById(R.id.resend_code_button);
        this.f48294l = button;
        button.setOnClickListener(new C18970f(this));
        ((TextView) inflate.findViewById(R.id.title)).setText(getString(R.string.carpool_registration_verification_code_subtitle, this.f48292j));
        ((TextView) inflate.findViewById(R.id.edit_text_header)).setText(R.string.carpool_registration_verification_code_hint);
        return inflate;
    }

    public final void onDetach() {
        C18971g gVar = this.f48297o;
        if (gVar != null) {
            this.f48296n.removeCallbacks(gVar);
            this.f48297o = null;
        }
        super.onDetach();
    }

    public final void onResume() {
        super.onResume();
        for (int i = 0; i < this.f48295m.getChildCount(); i++) {
            View childAt = this.f48295m.getChildAt(i);
            if (childAt instanceof EditText) {
                childAt.requestFocus();
                return;
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            this.f48294l.setVisibility(8);
            this.f48293k.setVisibility(0);
            Handler handler = this.f48296n;
            C18971g gVar = new C18971g(this);
            this.f48297o = gVar;
            handler.post(gVar);
        }
    }
}
