package com.moovit.payment.account.actions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import bf0.C21049c;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.moovit.payment.account.actions.model.HtmlStep;
import kotlin.C23812a;
import kotlin.Metadata;
import mf0.C24362h;
import p480ez.C16910b;
import v40.C25750e;
import v40.C25751f;
import x40.C25767a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/moovit/payment/account/actions/AccountActionHtmlStepFragment;", "Lx40/a;", "<init>", "()V", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class AccountActionHtmlStepFragment extends C25767a {

    /* renamed from: o */
    public static final /* synthetic */ int f63849o = 0;

    /* renamed from: n */
    public final C21049c f63850n = C23812a.m58432b(new AccountActionHtmlStepFragment$htmlStep$2(this));

    /* renamed from: m2 */
    public final String mo83334m2() {
        return mo83336p2().f63875c;
    }

    /* renamed from: n2 */
    public final String mo83335n2() {
        return mo83336p2().f63877e;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        return layoutInflater.inflate(C25751f.account_action_html_step_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C25750e.web_view);
        C24362h.m61210e(findViewById, "view.findViewById(R.id.web_view)");
        ((WebView) findViewById).loadDataWithBaseURL((String) null, mo83336p2().f63878f, "text/html", (String) null, (String) null);
        View findViewById2 = view.findViewById(C25750e.action_view);
        C24362h.m61210e(findViewById2, "view.findViewById(R.id.action_view)");
        Button button = (Button) findViewById2;
        button.setText(mo83336p2().f63879g);
        button.setOnClickListener(new C16910b(this, 6));
    }

    /* renamed from: p2 */
    public final HtmlStep mo83336p2() {
        return (HtmlStep) this.f63850n.getValue();
    }
}
