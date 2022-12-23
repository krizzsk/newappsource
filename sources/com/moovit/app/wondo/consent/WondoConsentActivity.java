package com.moovit.app.wondo.consent;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.app.MoovitAppActivity;
import com.tranzmate.R;
import java.util.ArrayList;
import p090g1.C4732a;
import p471eq.C16850a;
import p740py.C19040a;
import p761qy.C19201a;
import p761qy.C19202b;
import p761qy.C19203c;
import p761qy.C19204d;
import p824tp.C19731i;

public class WondoConsentActivity extends MoovitAppActivity {

    /* renamed from: U */
    public static final /* synthetic */ int f40676U = 0;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.wondo_consent_activity);
        ((Button) findViewById(R.id.confirm_button)).setOnClickListener(new C19201a(this, 0));
        ((Button) findViewById(R.id.skip_button)).setOnClickListener(new C16850a(this, 28));
        String string = getString(R.string.wondo_consent_legal_terms_of_service);
        C19202b bVar = new C19202b(this, string);
        String string2 = getString(R.string.wondo_consent_legal_privacy_policy);
        C19203c cVar = new C19203c(this, string2);
        String string3 = getString(R.string.wondo_consent_legal_message, new Object[]{string, string2});
        SpannableString spannableString = new SpannableString(string3);
        int indexOf = string3.indexOf(string);
        if (indexOf != -1) {
            spannableString.setSpan(bVar, indexOf, string.length() + indexOf, 33);
        }
        int indexOf2 = string3.indexOf(string2);
        if (indexOf2 != -1) {
            spannableString.setSpan(cVar, indexOf2, string2.length() + indexOf2, 33);
        }
        TextView x2 = mo44549x2(R.id.legal);
        x2.setText(spannableString);
        x2.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: y2 */
    public final void mo46672y2(boolean z) {
        C19731i.m47197a(this).f50172b.mo42913b(new C19040a(this, z), true);
        C19204d.m46353c(this);
        ArrayList arrayList = new ArrayList();
        Intent A0 = C14226d.m35335A0(this);
        C14226d.m35339F0(A0);
        arrayList.add(A0);
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C4732a.startActivities(this, intentArr, (Bundle) null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
