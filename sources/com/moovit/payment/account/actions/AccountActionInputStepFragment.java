package com.moovit.payment.account.actions;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import bf0.C21049c;
import c00.C13717b;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.moovit.inputfields.C16069a;
import com.moovit.inputfields.InputField;
import com.moovit.inputfields.InputFieldValue;
import com.moovit.inputfields.TextInputFieldView;
import com.moovit.payment.account.actions.model.InputStep;
import java.util.ArrayList;
import java.util.List;
import kotlin.C23812a;
import kotlin.Metadata;
import mf0.C24362h;
import p495fq.C17057b;
import p543hq.C17474b;
import p583jk.C17884p;
import p783rw.C19370b;
import p977zz.C20935e;
import p977zz.C20964s0;
import v40.C25750e;
import v40.C25751f;
import x40.C25767a;
import y40.C25774c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/moovit/payment/account/actions/AccountActionInputStepFragment;", "Lx40/a;", "Lcom/moovit/inputfields/a$a;", "<init>", "()V", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class AccountActionInputStepFragment extends C25767a implements C16069a.C16070a {

    /* renamed from: q */
    public static final /* synthetic */ int f63851q = 0;

    /* renamed from: n */
    public final C21049c f63852n = C23812a.m58432b(new AccountActionInputStepFragment$inputStep$2(this));

    /* renamed from: o */
    public ViewGroup f63853o;

    /* renamed from: p */
    public Button f63854p;

    /* renamed from: H0 */
    public final void mo23440H0() {
        ViewGroup viewGroup = this.f63853o;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (i < childCount) {
                if (C20964s0.m49090h(mo83337p2(i).getValue())) {
                    Button button = this.f63854p;
                    if (button != null) {
                        button.setEnabled(false);
                        return;
                    } else {
                        C24362h.m61217l("actionView");
                        throw null;
                    }
                } else {
                    i++;
                }
            }
            Button button2 = this.f63854p;
            if (button2 != null) {
                button2.setEnabled(true);
            } else {
                C24362h.m61217l("actionView");
                throw null;
            }
        } else {
            C24362h.m61217l("inputFieldViewsContainer");
            throw null;
        }
    }

    /* renamed from: m2 */
    public final String mo83334m2() {
        return mo83338q2().f63881c;
    }

    /* renamed from: n2 */
    public final String mo83335n2() {
        return mo83338q2().f63884f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        return layoutInflater.inflate(C25751f.account_action_input_step_fragment, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C24362h.m61211f(bundle, "outState");
        super.onSaveInstanceState(bundle);
        ViewGroup viewGroup = this.f63853o;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                bundle.putString(C16759e.m42349e("input_field_value#", i), mo83337p2(i).getValue());
            }
            return;
        }
        C24362h.m61217l("inputFieldViewsContainer");
        throw null;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        String str;
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Image image = mo83338q2().f63883e;
        View findViewById = view.findViewById(C25750e.icon);
        C24362h.m61210e(findViewById, "view.findViewById(R.id.icon)");
        ImageView imageView = (ImageView) findViewById;
        C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo10850T(imageView);
        View findViewById2 = view.findViewById(C25750e.input_field_container);
        C24362h.m61210e(findViewById2, "view.findViewById(R.id.input_field_container)");
        ViewGroup viewGroup = (ViewGroup) findViewById2;
        this.f63853o = viewGroup;
        List<InputField> list = mo83338q2().f63887i;
        if (C13717b.m34258e(list)) {
            i = 0;
        } else {
            i = list.size();
        }
        UiUtils.m40250i(viewGroup, C25751f.input_field_text_layout, 0, i);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            C24362h.m61209d(childAt, "null cannot be cast to non-null type com.moovit.inputfields.TextInputFieldView");
            TextInputFieldView textInputFieldView = (TextInputFieldView) childAt;
            InputField inputField = list.get(i2);
            C24362h.m61208c(inputField);
            InputField inputField2 = inputField;
            if (i2 == 0) {
                textInputFieldView.requestFocus();
            }
            if (bundle != null) {
                str = bundle.getString("input_field_value" + i2);
            } else {
                str = null;
            }
            textInputFieldView.mo48264C(inputField2, str);
            textInputFieldView.setInputFieldListener(this);
            if (i2 == i - 1) {
                textInputFieldView.mo48263B(4, new C17057b(this, 3));
            } else {
                textInputFieldView.mo48263B(5, (C20935e<C16069a>) null);
            }
        }
        View findViewById3 = view.findViewById(C25750e.action_view);
        C24362h.m61210e(findViewById3, "view.findViewById(R.id.action_view)");
        Button button = (Button) findViewById3;
        this.f63854p = button;
        button.setOnClickListener(new C19370b(this, 9));
    }

    /* renamed from: p2 */
    public final C16069a mo83337p2(int i) {
        ViewGroup viewGroup = this.f63853o;
        if (viewGroup != null) {
            View childAt = viewGroup.getChildAt(i);
            C24362h.m61209d(childAt, "null cannot be cast to non-null type com.moovit.inputfields.InputFieldView");
            return (C16069a) childAt;
        }
        C24362h.m61217l("inputFieldViewsContainer");
        throw null;
    }

    /* renamed from: q2 */
    public final InputStep mo83338q2() {
        return (InputStep) this.f63852n.getValue();
    }

    /* renamed from: r2 */
    public final void mo83339r2() {
        ViewGroup viewGroup = this.f63853o;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            boolean z = true;
            for (int i = 0; i < childCount; i++) {
                z &= mo83337p2(i).validate();
            }
            if (z) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "continue_clicked");
                aVar.mo49939g(AnalyticsAttributeKey.SELECTED_CAPTION, mo83338q2().f63884f);
                aVar.mo49939g(AnalyticsAttributeKey.SELECTED_TYPE, mo83338q2().f63881c);
                mo46797j2(aVar.mo49933a());
                String str = mo83338q2().f63880b;
                String str2 = mo83338q2().f63881c;
                String str3 = mo83338q2().f63882d;
                ViewGroup viewGroup2 = this.f63853o;
                if (viewGroup2 != null) {
                    int childCount2 = viewGroup2.getChildCount();
                    ArrayList arrayList = new ArrayList(childCount2);
                    for (int i2 = 0; i2 < childCount2; i2++) {
                        InputFieldValue a = mo83337p2(i2).mo48265a();
                        if (a != null) {
                            arrayList.add(a);
                        }
                    }
                    mo83596o2(new C25774c(str, str2, str3, arrayList));
                    return;
                }
                C24362h.m61217l("inputFieldViewsContainer");
                throw null;
            }
            return;
        }
        C24362h.m61217l("inputFieldViewsContainer");
        throw null;
    }
}
