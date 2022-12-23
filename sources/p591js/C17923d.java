package p591js;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.ViewAnimator;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import p241s0.C6302b;
import p401bz.C13713g;
import p543hq.C17474b;
import p567iq.C17635b;

/* renamed from: js.d */
public class C17923d extends C15676b<MoovitActivity> {

    /* renamed from: i */
    public static final /* synthetic */ int f45983i = 0;

    /* renamed from: h */
    public final HashSet f45984h = new HashSet(6);

    public C17923d() {
        super(MoovitActivity.class);
        setStyle(2, 2131952796);
    }

    /* renamed from: R1 */
    public final void mo22564R1(C17474b bVar) {
        C17635b.m43779f(this.f40792c).f50173c.mo22850h(AnalyticsFlowKey.POPUP, bVar);
    }

    /* renamed from: S1 */
    public final void mo50466S1(String str) {
        String str2;
        this.f45984h.size();
        Context context = getContext();
        if (context != null) {
            C6302b bVar = new C6302b();
            bVar.put("end_reason", str);
            Iterator it = this.f45984h.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (intValue == R.string.reinstall_survey_option_1) {
                    str2 = "option_1";
                } else if (intValue == R.string.reinstall_survey_option_2) {
                    str2 = "option_2";
                } else if (intValue == R.string.reinstall_survey_option_3) {
                    str2 = "option_3";
                } else if (intValue == R.string.reinstall_survey_option_4) {
                    str2 = "option_4";
                } else if (intValue == R.string.reinstall_survey_option_5) {
                    str2 = "option_5";
                } else if (intValue == R.string.reinstall_survey_option_6) {
                    str2 = "option_6";
                } else if (intValue == R.string.reinstall_survey_option_other) {
                    str2 = InneractiveMediationNameConsts.OTHER;
                } else {
                    StringBuilder k = C13555b.m33972k("Unknown option: ");
                    k.append(Integer.toHexString(intValue));
                    throw new IllegalStateException(k.toString());
                }
                bVar.put(str2, "checked");
            }
            C17635b.m43779f(context).f50172b.mo42913b(new C13713g(context, 7, bVar), true);
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        View view = getView();
        boolean z = false;
        if (view != null && ((ViewAnimator) view.findViewById(R.id.content_animator)).getDisplayedChild() == 0) {
            z = true;
        }
        if (z) {
            mo50466S1("cancelled");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ScrollView scrollView = (ScrollView) layoutInflater.inflate(R.layout.reinstall_popup_survey, viewGroup, false);
        ViewAnimator viewAnimator = (ViewAnimator) scrollView.findViewById(R.id.icon_animator);
        ViewAnimator viewAnimator2 = (ViewAnimator) scrollView.findViewById(R.id.content_animator);
        ViewGroup viewGroup2 = (ViewGroup) viewAnimator2.findViewById(R.id.options);
        RadioGroup radioGroup = (RadioGroup) viewGroup2.findViewById(R.id.survey_options);
        Button button = (Button) viewGroup2.findViewById(R.id.submit);
        ArrayList arrayList = new ArrayList(Arrays.asList(new Integer[]{Integer.valueOf(R.string.reinstall_survey_option_1), Integer.valueOf(R.string.reinstall_survey_option_2), Integer.valueOf(R.string.reinstall_survey_option_3), Integer.valueOf(R.string.reinstall_survey_option_4), Integer.valueOf(R.string.reinstall_survey_option_5), Integer.valueOf(R.string.reinstall_survey_option_6)}));
        Collections.shuffle(arrayList);
        arrayList.add(Integer.valueOf(R.string.reinstall_survey_option_other));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            RadioButton radioButton = (RadioButton) layoutInflater.inflate(R.layout.reinstall_popup_survey_option, viewGroup2, false);
            radioButton.setText(intValue);
            radioButton.setChecked(false);
            radioButton.setOnCheckedChangeListener(new C17921b(this, intValue, button));
            radioGroup.addView(radioButton);
        }
        button.setOnClickListener(new C17922c(this, scrollView, viewAnimator2, viewAnimator));
        return scrollView;
    }

    public final void onStart() {
        super.onStart();
        A a = this.f40792c;
        C17635b.m43779f(a).f50173c.mo22849g(a, AnalyticsFlowKey.POPUP);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.OPEN_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_user_reinstall_type");
        mo22564R1(aVar.mo49933a());
    }

    public final void onStop() {
        super.onStop();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CLOSE_POPUP);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "popup_user_reinstall_type");
        mo22564R1(aVar.mo49933a());
        A a = this.f40792c;
        C17635b.m43779f(a).f50173c.mo22847b(a, AnalyticsFlowKey.POPUP, true);
    }
}
