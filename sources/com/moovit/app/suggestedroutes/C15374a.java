package com.moovit.app.suggestedroutes;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.TextView;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.dialog.C15858a;
import com.tranzmate.R;
import h60.C17327j1;
import p039c7.C1800c;
import p543hq.C17474b;
import p977zz.C20943i;
import p977zz.C20975x0;

/* renamed from: com.moovit.app.suggestedroutes.a */
public class C15374a extends C15676b<MoovitActivity> {

    /* renamed from: l */
    public static final /* synthetic */ int f39822l = 0;

    /* renamed from: h */
    public String f39823h;

    /* renamed from: i */
    public String[] f39824i;

    /* renamed from: j */
    public String f39825j;

    /* renamed from: k */
    public NumberPicker f39826k;

    /* renamed from: com.moovit.app.suggestedroutes.a$a */
    public interface C15375a {
        /* renamed from: C */
        void mo45971C();

        /* renamed from: J */
        void mo45972J();

        /* renamed from: X */
        void mo45973X(String str);
    }

    public C15374a() {
        super(MoovitActivity.class);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        mo46753L1(C15375a.class, new C17327j1(this, 15));
        dismissAllowingStateLoss();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(true);
        Bundle K1 = mo46752K1();
        this.f39823h = K1.getString("tag");
        String[] stringArray = K1.getStringArray(LinksConfiguration.KEY_VALUES);
        this.f39824i = stringArray;
        if (stringArray != null) {
            String string = K1.getString("selectedValue");
            this.f39825j = string;
            if (string == null) {
                this.f39825j = this.f39824i[0];
                return;
            }
            return;
        }
        StringBuilder k = C13555b.m33972k("Must pass values as argument to use ");
        k.append(getClass().getCanonicalName());
        throw new ApplicationBugException(k.toString());
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        return new C15858a(requireContext(), getTheme());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.max_walking_time_picker_fragment, viewGroup, false);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArray(LinksConfiguration.KEY_VALUES, this.f39824i);
        bundle.putString("selectedValue", this.f39825j);
    }

    public final void onStart() {
        super.onStart();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "max_walking_time_dialog_content_shown");
        mo22564R1(aVar.mo49933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        Bundle K1 = mo46752K1();
        UiUtils.m40234B((TextView) view.findViewById(R.id.title), K1.getCharSequence("title"));
        this.f39826k = (NumberPicker) view.findViewById(R.id.picker);
        if (C20943i.m49051d(29)) {
            TextView textView = (TextView) view.findViewById(R.id.text);
            this.f39826k.setTextSize(textView.getTextSize());
            this.f39826k.setTextColor(textView.getCurrentTextColor());
        }
        String[] strArr = this.f39824i;
        String str = this.f39825j;
        if (strArr != null) {
            i = 0;
            while (true) {
                if (i >= strArr.length) {
                    break;
                } else if (C20975x0.m49118e(strArr[i], str)) {
                    break;
                } else {
                    i++;
                }
            }
            this.f39826k.setMinValue(0);
            this.f39826k.setMaxValue(this.f39824i.length - 1);
            this.f39826k.setDisplayedValues(this.f39824i);
            this.f39826k.setValue(i);
            this.f39826k.setWrapSelectorWheel(false);
            CharSequence charSequence = K1.getCharSequence("positiveButton", getText(R.string.action_confirm));
            Button button = (Button) view.findViewById(R.id.positive_button);
            button.setOnClickListener(new C4052r(this, 19));
            UiUtils.m40236D(button, charSequence, 8);
            CharSequence charSequence2 = K1.getCharSequence("negativeButton", getText(R.string.action_cancel));
            Button button2 = (Button) view.findViewById(R.id.negative_button);
            button2.setOnClickListener(new C1800c(this, 22));
            UiUtils.m40236D(button2, charSequence2, 8);
        }
        i = -1;
        this.f39826k.setMinValue(0);
        this.f39826k.setMaxValue(this.f39824i.length - 1);
        this.f39826k.setDisplayedValues(this.f39824i);
        this.f39826k.setValue(i);
        this.f39826k.setWrapSelectorWheel(false);
        CharSequence charSequence3 = K1.getCharSequence("positiveButton", getText(R.string.action_confirm));
        Button button3 = (Button) view.findViewById(R.id.positive_button);
        button3.setOnClickListener(new C4052r(this, 19));
        UiUtils.m40236D(button3, charSequence3, 8);
        CharSequence charSequence22 = K1.getCharSequence("negativeButton", getText(R.string.action_cancel));
        Button button22 = (Button) view.findViewById(R.id.negative_button);
        button22.setOnClickListener(new C1800c(this, 22));
        UiUtils.m40236D(button22, charSequence22, 8);
    }
}
