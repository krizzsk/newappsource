package p782rv;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import ba0.C7564a;
import ba0.C7566c;
import ba0.C7568e;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.tranzmate.R;
import p543hq.C17474b;
import p977zz.C20964s0;

/* renamed from: rv.h */
public final class C19349h implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public final /* synthetic */ C19342g f49232b;

    public C19349h(C19342g gVar) {
        this.f49232b = gVar;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C19342g gVar = this.f49232b;
        gVar.f49222w.removeTextChangedListener(gVar.f49218s);
        C7564a aVar = (C7564a) adapterView.getItemAtPosition(i);
        this.f49232b.f49218s = new C7566c(aVar.f23054c);
        Context context = adapterView.getContext();
        String str = aVar.f23054c;
        PhoneNumberUtil.PhoneNumberFormat phoneNumberFormat = PhoneNumberUtil.PhoneNumberFormat.NATIONAL;
        String f = C7568e.m17316f(context, str, phoneNumberFormat);
        EditText editText = this.f49232b.f49222w;
        editText.setText(C7568e.m17312b(C20964s0.m49082C(editText.getText()), aVar.f23054c, phoneNumberFormat));
        this.f49232b.f49222w.setHint(f);
        C19342g gVar2 = this.f49232b;
        gVar2.f49223x.setText(C20964s0.m49102t(" ", gVar2.getString(R.string.ride_sharing_registration_invalid_phone_number_message), f));
        C19342g gVar3 = this.f49232b;
        gVar3.f49222w.addTextChangedListener(gVar3.f49218s);
        C19342g gVar4 = this.f49232b;
        C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "phone_prefix_clicked");
        gVar4.mo46797j2(aVar2.mo49933a());
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
