package r60;

import a00.C13382a;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import ba0.C7564a;
import ba0.C7566c;
import ba0.C7568e;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import p543hq.C17474b;
import p977zz.C20964s0;

/* renamed from: r60.c */
public final class C19232c implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public final /* synthetic */ C19229a f48841b;

    public C19232c(C19229a aVar) {
        this.f48841b = aVar;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C19229a aVar = this.f48841b;
        aVar.f48837y.removeTextChangedListener(aVar.f48833u);
        C7564a aVar2 = (C7564a) adapterView.getItemAtPosition(i);
        C19229a aVar3 = this.f48841b;
        aVar3.f48835w.setContentDescription(C13382a.m33667c(aVar3.f48830r, aVar2.f23056e));
        this.f48841b.f48833u = new C7566c(aVar2.f23054c);
        EditText editText = this.f48841b.f48837y;
        String C = C20964s0.m49082C(editText.getText());
        String str = aVar2.f23054c;
        PhoneNumberUtil.PhoneNumberFormat phoneNumberFormat = PhoneNumberUtil.PhoneNumberFormat.NATIONAL;
        editText.setText(C7568e.m17312b(C, str, phoneNumberFormat));
        this.f48841b.f48837y.setHint(C7568e.m17316f(adapterView.getContext(), aVar2.f23054c, phoneNumberFormat));
        C19229a aVar4 = this.f48841b;
        aVar4.f48837y.addTextChangedListener(aVar4.f48833u);
        this.f48841b.mo51647C2();
        C19229a aVar5 = this.f48841b;
        C17474b.C17475a aVar6 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar6.mo49939g(AnalyticsAttributeKey.TYPE, "country_code_selected");
        aVar6.mo49939g(AnalyticsAttributeKey.ID, aVar2.f23053b);
        aVar5.mo46797j2(aVar6.mo49933a());
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
