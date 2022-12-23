package z80;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.view.list.ListItemView;
import com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitActivity;
import com.moovit.util.CurrencyAmount;
import com.moovit.view.p340cc.C7959a;
import i00.C17522a;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import p041ca.C1832r;
import p543hq.C17474b;
import p597jy.C17979a;
import p714ow.C18848b;
import p761qy.C19201a;
import p808sx.C19568d;
import p976zy.C20921b;
import p977zz.C20959q;
import p977zz.C20964s0;

/* renamed from: z80.a */
public class C13338a extends C15682c<PurchaseSplitActivity> {

    /* renamed from: x */
    public static final /* synthetic */ int f33117x = 0;

    /* renamed from: n */
    public final C13339a f33118n = new C13339a();

    /* renamed from: o */
    public final C13340b f33119o = new C13340b();

    /* renamed from: p */
    public final NumberFormat f33120p = NumberFormat.getInstance();

    /* renamed from: q */
    public CurrencyAmount f33121q;

    /* renamed from: r */
    public TextInputLayout f33122r;

    /* renamed from: s */
    public EditText f33123s;

    /* renamed from: t */
    public TextInputLayout f33124t;

    /* renamed from: u */
    public EditText f33125u;

    /* renamed from: v */
    public String f33126v;

    /* renamed from: w */
    public Button f33127w;

    /* renamed from: z80.a$a */
    public class C13339a extends C17522a {
        public C13339a() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (C13338a.this.f33123s.isFocused()) {
                C13338a aVar = C13338a.this;
                C13338a.m33613m2(aVar, aVar.f33122r, aVar.f33124t);
            }
        }
    }

    /* renamed from: z80.a$b */
    public class C13340b extends C17522a {
        public C13340b() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (C13338a.this.f33125u.isFocused()) {
                C13338a aVar = C13338a.this;
                C13338a.m33613m2(aVar, aVar.f33124t, aVar.f33122r);
            }
        }
    }

    public C13338a() {
        super(PurchaseSplitActivity.class);
    }

    /* renamed from: m2 */
    public static void m33613m2(C13338a aVar, TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        BigDecimal bigDecimal;
        boolean z;
        aVar.getClass();
        String C = C20964s0.m49082C(textInputLayout.getEditText().getText());
        if (C20964s0.m49090h(C)) {
            bigDecimal = BigDecimal.ZERO;
        } else {
            bigDecimal = new BigDecimal(C);
        }
        boolean z2 = true;
        if (bigDecimal.compareTo(aVar.f33121q.f23845c) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            textInputLayout.setError(aVar.f33126v);
            textInputLayout2.setError((CharSequence) null);
            if (!(aVar.f33122r.getError() == null && aVar.f33124t.getError() == null)) {
                z2 = false;
            }
            aVar.f33127w.setEnabled(z2);
            return;
        }
        textInputLayout2.getEditText().setText(aVar.f33120p.format(aVar.f33121q.f23845c.subtract(bigDecimal)));
        textInputLayout.setError((CharSequence) null);
        textInputLayout2.setError((CharSequence) null);
        if (!(aVar.f33122r.getError() == null && aVar.f33124t.getError() == null)) {
            z2 = false;
        }
        aVar.f33127w.setEnabled(z2);
    }

    /* renamed from: n2 */
    public final void mo40232n2(boolean z) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "split_payment_change_credit_card_clicked");
        aVar.mo49941i(AnalyticsAttributeKey.IS_PRIMARY_CREDIT_CARD, z);
        mo46797j2(aVar.mo49933a());
        mo46786U1(PurchaseSplitActivity.class, new C20921b(z));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f33121q = (CurrencyAmount) mo46782Q1().getParcelable("totalPrice");
        this.f33126v = getString(C12873i.payment_stored_value_custom_error, 0, this.f33121q.f23845c);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C12870f.split_purchase_amount_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        ((PurchaseSplitActivity) this.f40822c).setTitle(C12873i.payment_split_payment_header);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "split_payment");
        mo46797j2(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Class<PurchaseSplitActivity> cls = PurchaseSplitActivity.class;
        C7959a aVar = (C7959a) mo46779N1(cls, new C18848b(6));
        C7959a aVar2 = (C7959a) mo46779N1(cls, new C1832r(1));
        if (aVar != null && aVar2 != null) {
            BigDecimal divide = this.f33121q.f23845c.divide(new BigDecimal(2), RoundingMode.CEILING);
            BigDecimal subtract = this.f33121q.f23845c.subtract(divide);
            ((ListItemView) view.findViewById(C12869e.total)).setAccessoryText((CharSequence) this.f33121q.toString());
            ListItemView listItemView = (ListItemView) view.findViewById(C12869e.first_payment_method_item_view);
            listItemView.setIcon(aVar.f24092a.iconResId);
            int i = C12873i.format_last_digits;
            listItemView.setSubtitle((CharSequence) getString(i, aVar.mo24845a()));
            listItemView.setOnClickListener(new C17979a(this, 14));
            this.f33122r = (TextInputLayout) view.findViewById(C12869e.first_amount);
            EditText editText = (EditText) view.findViewById(C12869e.first_amount_edit_text);
            this.f33123s = editText;
            editText.addTextChangedListener(this.f33118n);
            this.f33123s.setFilters(new InputFilter[]{new C20959q()});
            this.f33123s.setText(this.f33120p.format(divide));
            EditText editText2 = this.f33123s;
            editText2.setSelection(editText2.getText().length());
            ListItemView listItemView2 = (ListItemView) view.findViewById(C12869e.second_payment_method_item_view);
            listItemView2.setIcon(aVar2.f24092a.iconResId);
            listItemView2.setSubtitle((CharSequence) getString(i, aVar2.mo24845a()));
            listItemView2.setOnClickListener(new C19568d(this, 11));
            this.f33124t = (TextInputLayout) view.findViewById(C12869e.second_amount);
            EditText editText3 = (EditText) view.findViewById(C12869e.second_amount_edit_text);
            this.f33125u = editText3;
            editText3.addTextChangedListener(this.f33119o);
            this.f33125u.setFilters(new InputFilter[]{new C20959q()});
            this.f33125u.setText(this.f33120p.format(subtract));
            EditText editText4 = this.f33125u;
            editText4.setSelection(editText4.getText().length());
            Button button = (Button) view.findViewById(C12869e.continue_button);
            this.f33127w = button;
            button.setOnClickListener(new C19201a(this, 12));
        }
    }
}
