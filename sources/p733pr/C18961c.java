package p733pr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.MoovitActivity;
import com.tranzmate.R;
import i00.C17522a;
import p259t5.C6593c;
import p472er.C16865g;
import p685nr.C18586a;

/* renamed from: pr.c */
public abstract class C18961c extends C18586a {

    /* renamed from: j */
    public static final /* synthetic */ int f48272j = 0;

    /* renamed from: b */
    public final C18959a f48273b = new C18959a();

    /* renamed from: c */
    public final C18962a f48274c = new C18962a();

    /* renamed from: d */
    public final C18960b f48275d = new C18960b(this, 0);

    /* renamed from: e */
    public final C6593c f48276e = new C6593c(this, 8);

    /* renamed from: f */
    public View f48277f;

    /* renamed from: g */
    public TextInputLayout f48278g;

    /* renamed from: h */
    public EditText f48279h;

    /* renamed from: i */
    public TextView f48280i;

    /* renamed from: pr.c$a */
    public class C18962a extends C17522a {
        public C18962a() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C18961c.this.mo51476P1(charSequence);
        }
    }

    /* renamed from: H1 */
    public final int mo50979H1() {
        return R.string.carpool_registration_activity_title;
    }

    /* renamed from: K1 */
    public String mo51471K1() {
        return null;
    }

    /* renamed from: L1 */
    public abstract String mo51472L1();

    /* renamed from: M1 */
    public String mo51473M1() {
        return null;
    }

    /* renamed from: N1 */
    public abstract String mo51474N1();

    /* renamed from: O1 */
    public void mo51475O1() {
    }

    /* renamed from: P1 */
    public void mo51476P1(CharSequence charSequence) {
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.carpool_registration_phone_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.continue_button);
        this.f48277f = findViewById;
        findViewById.setOnClickListener(this.f48276e);
        this.f48278g = (TextInputLayout) inflate.findViewById(R.id.text_input);
        EditText editText = (EditText) inflate.findViewById(R.id.edit_text);
        this.f48279h = editText;
        editText.setOnFocusChangeListener(this.f48273b);
        this.f48279h.addTextChangedListener(this.f48274c);
        this.f48279h.setOnEditorActionListener(this.f48275d);
        ((TextView) inflate.findViewById(R.id.title)).setText(mo51474N1());
        this.f48278g.setHint((CharSequence) mo51472L1());
        this.f48278g.setHelperText(mo51471K1());
        this.f48278g.setPlaceholderText(mo51473M1());
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.extra_views_container);
        this.f48280i = (TextView) inflate.findViewById(R.id.eula_link);
        C16865g.m42682e((MoovitActivity) requireActivity(), this.f48280i);
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        this.f48279h.requestFocus();
    }
}
