package f90;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.textfield.TextInputLayout;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueOtherAmount;
import com.moovit.util.CurrencyAmount;
import i00.C17522a;
import java.math.BigDecimal;
import m80.C12869e;
import m80.C12870f;
import m80.C12873i;
import m80.C12874j;
import p453dw.C16740o;
import p543hq.C17474b;
import p739px.C19037a;
import p977zz.C20959q;
import p977zz.C20964s0;

/* renamed from: f90.g */
public class C12647g extends C15676b<MoovitActivity> {

    /* renamed from: m */
    public static final /* synthetic */ int f31262m = 0;

    /* renamed from: h */
    public final C12648a f31263h = new C12648a();

    /* renamed from: i */
    public PurchaseStoredValueOtherAmount f31264i;

    /* renamed from: j */
    public Button f31265j;

    /* renamed from: k */
    public TextInputLayout f31266k;

    /* renamed from: l */
    public String f31267l;

    /* renamed from: f90.g$a */
    public class C12648a extends C17522a {
        public C12648a() {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            String str;
            C12647g gVar = C12647g.this;
            String charSequence2 = charSequence.toString();
            int i4 = C12647g.f31262m;
            gVar.getClass();
            boolean z = false;
            if (!C20964s0.m49090h(charSequence2)) {
                CurrencyAmount currencyAmount = new CurrencyAmount(gVar.f31264i.f23439b.f23844b, new BigDecimal(charSequence2));
                PurchaseStoredValueOtherAmount purchaseStoredValueOtherAmount = gVar.f31264i;
                purchaseStoredValueOtherAmount.getClass();
                if (currencyAmount.f23845c.compareTo(purchaseStoredValueOtherAmount.f23439b.f23845c) >= 0 && currencyAmount.f23845c.compareTo(purchaseStoredValueOtherAmount.f23440c.f23845c) <= 0) {
                    z = true;
                }
            }
            C12647g gVar2 = C12647g.this;
            boolean z2 = !z;
            TextInputLayout textInputLayout = gVar2.f31266k;
            if (z2) {
                str = gVar2.f31267l;
            } else {
                str = null;
            }
            textInputLayout.setError(str);
            C12647g.this.f31265j.setEnabled(z);
        }
    }

    public C12647g() {
        super(MoovitActivity.class);
        setStyle(0, C12874j.ThemeOverlay_Moovit_Dialog_FullScreen);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PurchaseStoredValueOtherAmount purchaseStoredValueOtherAmount = (PurchaseStoredValueOtherAmount) mo46752K1().getParcelable("otherAmount");
        this.f31264i = purchaseStoredValueOtherAmount;
        this.f31267l = getString(C12873i.payment_stored_value_custom_error, purchaseStoredValueOtherAmount.f23439b, purchaseStoredValueOtherAmount.f23440c);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C12870f.purchase_stored_value_other_amount_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "stored_value_custom_amount_impression");
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(C12869e.range_text)).setText(getString(C12873i.payment_stored_value_custom_explanation, this.f31264i.f23439b.toString(), this.f31264i.f23440c.toString()));
        this.f31266k = (TextInputLayout) view.findViewById(C12869e.other_amount);
        EditText editText = (EditText) view.findViewById(C12869e.other_amount_edit_text);
        editText.addTextChangedListener(this.f31263h);
        editText.setFilters(new InputFilter[]{new C20959q()});
        Button button = (Button) view.findViewById(C12869e.continue_button);
        this.f31265j = button;
        button.setOnClickListener(new C19037a(this, 16));
        this.f31265j.setEnabled(false);
        Toolbar toolbar = (Toolbar) view.findViewById(C12869e.tool_bar);
        toolbar.setNavigationOnClickListener(new C16740o(this, 24));
        toolbar.setNavigationContentDescription(C12873i.close);
    }
}
