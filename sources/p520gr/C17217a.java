package p520gr;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.C15780a;
import com.moovit.request.RequestOptions;
import com.tranzmate.R;
import i00.C17522a;
import p543hq.C17474b;
import p977zz.C20941h;
import p977zz.C20964s0;

/* renamed from: gr.a */
public class C17217a extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public Button f44509h;

    /* renamed from: i */
    public EditText f44510i;

    /* renamed from: j */
    public View f44511j;

    /* renamed from: k */
    public ProgressBar f44512k;

    /* renamed from: l */
    public TextView f44513l;

    /* renamed from: m */
    public TextView f44514m;

    /* renamed from: n */
    public TextView f44515n;

    /* renamed from: o */
    public boolean f44516o;

    /* renamed from: gr.a$a */
    public class C17218a implements DialogInterface.OnShowListener {

        /* renamed from: gr.a$a$a */
        public class C17219a implements View.OnClickListener {
            public C17219a() {
            }

            public final void onClick(View view) {
                C17217a aVar = C17217a.this;
                if (aVar.f44516o) {
                    aVar.dismiss();
                    return;
                }
                String obj = aVar.f44510i.getText().toString();
                if (!C20964s0.m49090h(obj)) {
                    A a = aVar.f40792c;
                    C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                    aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "validate_clicked");
                    a.mo44545v2(aVar2.mo49933a());
                    aVar.f44512k.setVisibility(0);
                    aVar.f44513l.setVisibility(8);
                    aVar.f44514m.setVisibility(8);
                    aVar.f44515n.setVisibility(8);
                    View view2 = aVar.f44511j;
                    view2.setBackgroundColor(C20941h.m49043f(R.attr.colorDivider, view2.getContext()));
                    aVar.f44509h.setEnabled(false);
                    C17222c cVar = new C17222c(aVar.f40792c.mo44548x1(), obj);
                    A a2 = aVar.f40792c;
                    a2.getClass();
                    RequestOptions requestOptions = new RequestOptions();
                    requestOptions.f42909f = true;
                    a2.mo44527k2("SendCouponCodeRequest", cVar, requestOptions, new C17221b(aVar));
                }
            }
        }

        public C17218a() {
        }

        public final void onShow(DialogInterface dialogInterface) {
            int i;
            boolean z;
            C17217a.this.f44509h = ((AlertDialog) dialogInterface).getButton(-1);
            C17217a.this.f44509h.setOnClickListener(new C17219a());
            C17217a aVar = C17217a.this;
            Button button = aVar.f44509h;
            if (aVar.f44516o) {
                i = R.string.action_done;
            } else {
                i = R.string.action_validate;
            }
            button.setText(i);
            C17217a aVar2 = C17217a.this;
            Button button2 = aVar2.f44509h;
            if (aVar2.f44510i.length() >= 3) {
                z = true;
            } else {
                z = false;
            }
            button2.setEnabled(z);
        }
    }

    /* renamed from: gr.a$b */
    public class C17220b extends C17522a {
        public C17220b() {
        }

        public final void afterTextChanged(Editable editable) {
            boolean z;
            C17217a.this.f44513l.setVisibility(8);
            C17217a.this.f44514m.setVisibility(8);
            C17217a.this.f44515n.setVisibility(8);
            View view = C17217a.this.f44511j;
            view.setBackgroundColor(C20941h.m49043f(R.attr.colorDivider, view.getContext()));
            Button button = C17217a.this.f44509h;
            if (button != null) {
                if (editable.length() >= 3) {
                    z = true;
                } else {
                    z = false;
                }
                button.setEnabled(z);
            }
        }
    }

    public C17217a() {
        super(MoovitActivity.class);
    }

    /* renamed from: S1 */
    public static void m43213S1(C17217a aVar, String str) {
        int f = C20941h.m49043f(R.attr.colorError, aVar.requireContext());
        aVar.f44511j.setBackgroundColor(f);
        C15780a.m40272e(aVar.f44513l, R.drawable.ic_failed_16_error);
        aVar.f44513l.setTextColor(f);
        aVar.f44513l.setText(str);
    }

    /* renamed from: T1 */
    public static void m43214T1(C17217a aVar, boolean z) {
        aVar.getClass();
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.VALIDATE_COUPON_STATUS);
        aVar2.mo49941i(AnalyticsAttributeKey.SERVER_RESPONSE, z);
        aVar2.mo49939g(AnalyticsAttributeKey.REFERRAL_CODE, aVar.f44510i.getText().toString());
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "manual");
        aVar.f40792c.mo44545v2(aVar2.mo49933a());
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_fragment_coupon_code, (ViewGroup) null);
        this.f44510i = (EditText) inflate.findViewById(R.id.coupon_code_edit_text);
        this.f44511j = inflate.findViewById(R.id.divider);
        this.f44512k = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        this.f44513l = (TextView) inflate.findViewById(R.id.result_title);
        this.f44514m = (TextView) inflate.findViewById(R.id.result_description);
        this.f44515n = (TextView) inflate.findViewById(R.id.validity_description);
        if (bundle != null) {
            this.f44516o = bundle.getBoolean("couponSucceed", false);
        }
        AlertDialog create = new AlertDialog.Builder(getContext()).setTitle(R.string.carpool_passenger_promo_code_message_title).setView(inflate).setPositiveButton(R.string.action_validate, (DialogInterface.OnClickListener) null).create();
        create.setOnShowListener(new C17218a());
        this.f44510i.addTextChangedListener(new C17220b());
        if (create.getWindow() != null) {
            create.getWindow().setSoftInputMode(4);
        }
        return create;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("couponSucceed", this.f44516o);
        super.onSaveInstanceState(bundle);
    }
}
