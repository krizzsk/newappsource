package p782rv;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import p471eq.C16850a;
import p543hq.C17474b;
import p977zz.C20964s0;

/* renamed from: rv.q */
public class C19366q extends C19332a {

    /* renamed from: u */
    public static final /* synthetic */ int f49273u = 0;

    /* renamed from: n */
    public final C19367a f49274n = new C19367a();

    /* renamed from: o */
    public final C19368b f49275o = new C19368b();

    /* renamed from: p */
    public MaterialButtonToggleGroup f49276p;

    /* renamed from: q */
    public final C19364o f49277q = new C19364o(this);

    /* renamed from: r */
    public MaterialButtonToggleGroup f49278r;

    /* renamed from: s */
    public final C19365p f49279s = new C19365p(this);

    /* renamed from: t */
    public Button f49280t;

    /* renamed from: rv.q$a */
    public class C19367a extends ClickableSpan {
        public C19367a() {
        }

        public final void onClick(View view) {
            C19366q qVar = C19366q.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "wondo_privacy_communications_clicked");
            aVar.mo49939g(AnalyticsAttributeKey.URI, C19366q.this.getString(R.string.wondo_privacy_url));
            qVar.mo46797j2(aVar.mo49933a());
            C19366q.this.startActivity(WebViewActivity.m18168y2(view.getContext(), C19366q.this.getString(R.string.wondo_privacy_url), C19366q.this.getString(R.string.wondo_consent_legal_privacy_policy)));
        }
    }

    /* renamed from: rv.q$b */
    public class C19368b extends ClickableSpan {
        public C19368b() {
        }

        public final void onClick(View view) {
            C19366q qVar = C19366q.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "wondo_privacy_mobility_clicked");
            aVar.mo49939g(AnalyticsAttributeKey.URI, C19366q.this.getString(R.string.wondo_privacy_url));
            qVar.mo46797j2(aVar.mo49933a());
            C19366q.this.startActivity(WebViewActivity.m18168y2(view.getContext(), C19366q.this.getString(R.string.wondo_privacy_url), C19366q.this.getString(R.string.wondo_consent_legal_privacy_policy)));
        }
    }

    /* renamed from: n2 */
    public final AnalyticsEventKey mo51743n2() {
        return AnalyticsEventKey.STEP_SETTINGS;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ride_sharing_registration_step_wondo_settings_fragment, viewGroup, false);
        String string = getString(R.string.wondo_consent_legal_privacy_policy);
        TextView textView = (TextView) inflate.findViewById(R.id.legal_communications_text);
        textView.setText(getString(R.string.ride_sharing_registration_gdpr_setting_2, string));
        C20964s0.m49104v(textView, string, this.f49274n, new Object[0]);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) inflate.findViewById(R.id.legal_promotions_group);
        this.f49276p = materialButtonToggleGroup;
        materialButtonToggleGroup.f34453d.add(this.f49277q);
        TextView textView2 = (TextView) inflate.findViewById(R.id.legal_mobility_preferences_text);
        textView2.setText(getString(R.string.ride_sharing_registration_gdpr_setting_3, string));
        C20964s0.m49104v(textView2, string, this.f49275o, new Object[0]);
        MaterialButtonToggleGroup materialButtonToggleGroup2 = (MaterialButtonToggleGroup) inflate.findViewById(R.id.legal_data_research_group);
        this.f49278r = materialButtonToggleGroup2;
        materialButtonToggleGroup2.f34453d.add(this.f49279s);
        Button button = (Button) inflate.findViewById(R.id.continue_button);
        this.f49280t = button;
        button.setOnClickListener(new C16850a(this, 19));
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f49276p;
        materialButtonToggleGroup.f34453d.remove(this.f49277q);
        MaterialButtonToggleGroup materialButtonToggleGroup2 = this.f49278r;
        materialButtonToggleGroup2.f34453d.remove(this.f49279s);
    }

    /* renamed from: r2 */
    public final void mo51773r2(int i) {
        String str;
        boolean z;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
        if (i == R.id.legal_promotions_no_button) {
            str = "wondo_communications_no_clicked";
        } else if (i == R.id.legal_promotions_yes_button) {
            str = "wondo_communications_yes_clicked";
        } else if (i == R.id.legal_data_research_no_button) {
            str = "wondo_mobility_no_clicked";
        } else if (i == R.id.legal_data_research_yes_button) {
            str = "wondo_mobility_yes_clicked";
        } else {
            str = "unknown";
        }
        aVar.mo49939g(analyticsAttributeKey, str);
        mo46797j2(aVar.mo49933a());
        if (getView() != null) {
            Button button = this.f49280t;
            if (this.f49276p.getCheckedButtonId() == -1 || this.f49278r.getCheckedButtonId() == -1) {
                z = false;
            } else {
                z = true;
            }
            button.setEnabled(z);
        }
    }
}
