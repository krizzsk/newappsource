package com.moovit.app.tod.pincode;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.C1021l0;
import androidx.lifecycle.Lifecycle;
import bf0.C21049c;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.appbar.MaterialToolbar;
import com.moovit.C15676b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsEventLifecycleSender;
import com.moovit.app.tod.TodRideActivity;
import com.moovit.app.tod.model.TodPassengerPinCodeActionInfo;
import com.moovit.design.view.PinCodeView;
import com.tranzmate.R;
import java.util.IdentityHashMap;
import kotlin.C23812a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import mf0.C24362h;
import mf0.C24365j;
import p073e7.C4584b;
import p478ex.C16888a;
import p501fw.C17102a;
import p543hq.C17474b;
import p573ix.C17677a;
import p609km.C18097c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo59060d2 = {"Lcom/moovit/app/tod/pincode/TodAutonomousRidePinCodeDialogFragment;", "Lcom/moovit/b;", "Lcom/moovit/app/tod/TodRideActivity;", "Lcom/moovit/design/view/PinCodeView$b;", "<init>", "()V", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TodAutonomousRidePinCodeDialogFragment extends C15676b<TodRideActivity> implements PinCodeView.C15865b {

    /* renamed from: m */
    public static final /* synthetic */ int f40368m = 0;

    /* renamed from: h */
    public final C1021l0 f40369h;

    /* renamed from: i */
    public TextView f40370i;

    /* renamed from: j */
    public TextView f40371j;

    /* renamed from: k */
    public PinCodeView f40372k;

    /* renamed from: l */
    public Button f40373l;

    public TodAutonomousRidePinCodeDialogFragment() {
        super(TodRideActivity.class);
        C21049c a = C23812a.m58431a(LazyThreadSafetyMode.NONE, new C15532x8834e6b1(new C15531x8834e6b0(this)));
        this.f40369h = C18097c.m44768b(this, C24365j.m61219a(C17677a.class), new C15533x8834e6b2(a), new C15534x8834e6b3(a), new C15535x8834e6b4(this, a));
        setStyle(0, 2131952795);
    }

    /* renamed from: S1 */
    public final C17677a mo46414S1() {
        return (C17677a) this.f40369h.getValue();
    }

    /* renamed from: j */
    public final void mo23547j(String str, boolean z) {
        C24362h.m61211f(str, "pinCode");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        C24362h.m61210e(requireArguments, "requireArguments()");
        C17677a S1 = mo46414S1();
        S1.f45426b.mo4295e(requireArguments.getString("actionId"), "actionId");
        mo46414S1().f45427c.setValue((TodPassengerPinCodeActionInfo) requireArguments.getParcelable("pinCodeActionInfo"));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.tod_autonomous_ride_pin_code_dialog_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ((MaterialToolbar) view.findViewById(R.id.toolbar)).setNavigationOnClickListener(new C17102a(this, 5));
        View findViewById = view.findViewById(R.id.title);
        C24362h.m61210e(findViewById, "view.findViewById(R.id.title)");
        this.f40370i = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.instructions);
        C24362h.m61210e(findViewById2, "view.findViewById(R.id.instructions)");
        this.f40371j = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.pin_code);
        C24362h.m61210e(findViewById3, "view.findViewById(R.id.pin_code)");
        PinCodeView pinCodeView = (PinCodeView) findViewById3;
        this.f40372k = pinCodeView;
        pinCodeView.setListener(this);
        PinCodeView pinCodeView2 = this.f40372k;
        if (pinCodeView2 != null) {
            pinCodeView2.requestFocus();
            View findViewById4 = view.findViewById(R.id.action_button);
            C24362h.m61210e(findViewById4, "view.findViewById(R.id.action_button)");
            Button button = (Button) findViewById4;
            this.f40373l = button;
            button.setOnClickListener(new C4584b(this, 24));
            mo46414S1().f45427c.observe(getViewLifecycleOwner(), new C16888a(new TodAutonomousRidePinCodeDialogFragment$onViewCreated$3(this), 1));
            Lifecycle.State state = Lifecycle.State.RESUMED;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_verification_code_popup_impression");
            C17474b a = aVar.mo49933a();
            IdentityHashMap identityHashMap = AnalyticsEventLifecycleSender.f37408f;
            AnalyticsEventLifecycleSender.m37028a(this, new AnalyticsEventLifecycleSender.C14713b((C15676b<?>) this), state, a);
            return;
        }
        C24362h.m61217l("pinCodeView");
        throw null;
    }

    /* renamed from: v */
    public final void mo23549v(String str, boolean z) {
        Integer num;
        boolean z2;
        C24362h.m61211f(str, "pinCode");
        TodPassengerPinCodeActionInfo value = mo46414S1().f45427c.getValue();
        if (value != null) {
            num = Integer.valueOf(value.f40259b);
        } else {
            num = null;
        }
        Button button = this.f40373l;
        if (button != null) {
            if (z) {
                int length = str.length();
                if (num != null && length == num.intValue()) {
                    z2 = true;
                    button.setEnabled(z2);
                    return;
                }
            }
            z2 = false;
            button.setEnabled(z2);
            return;
        }
        C24362h.m61217l("actionButton");
        throw null;
    }
}
