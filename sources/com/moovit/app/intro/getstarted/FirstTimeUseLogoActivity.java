package com.moovit.app.intro.getstarted;

import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.moovit.location.C16202a;
import com.tranzmate.R;
import p780rt.C19326a;
import p780rt.C19327b;

public abstract class FirstTimeUseLogoActivity extends GetStartedFirstTimeUseActivity {
    /* renamed from: C2 */
    public final View mo45247C2() {
        return findViewById(R.id.submit_button);
    }

    /* renamed from: D2 */
    public final View mo45248D2() {
        return findViewById(R.id.progress_bar);
    }

    /* renamed from: E2 */
    public final void mo45249E2() {
        setContentView((int) R.layout.first_time_use_logo_activity);
        if (!C16202a.get(this).hasLocationPermissions()) {
            findViewById(R.id.permission_hint).setVisibility(0);
        }
        String string = getString(R.string.terms_of_service_link);
        C19326a aVar = new C19326a(this);
        String string2 = getString(R.string.privacy_text);
        C19327b bVar = new C19327b(this);
        String string3 = getString(R.string.terms_and_service, new Object[]{string, string2});
        SpannableString spannableString = new SpannableString(string3);
        int indexOf = string3.indexOf(string);
        if (indexOf != -1) {
            spannableString.setSpan(aVar, indexOf, string.length() + indexOf, 33);
        }
        int indexOf2 = string3.indexOf(string2);
        if (indexOf2 != -1) {
            spannableString.setSpan(bVar, indexOf2, string2.length() + indexOf2, 33);
        }
        TextView x2 = mo44549x2(R.id.legal);
        x2.setText(spannableString);
        x2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
