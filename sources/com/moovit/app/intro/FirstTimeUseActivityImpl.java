package com.moovit.app.intro;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.moovit.MoovitActivity;
import com.moovit.app.intro.getstarted.GetStartedFirstTimeUseActivity;
import com.moovit.commons.utils.UiUtils;
import com.moovit.location.C16202a;
import com.tranzmate.R;
import k00.C17988b;
import p242s1.C6333d0;
import p304x.C7082o;
import p756qt.C19172a;
import p756qt.C19173b;
import p756qt.C19174c;
import p756qt.C19175d;
import p977zz.C20964s0;

public class FirstTimeUseActivityImpl extends GetStartedFirstTimeUseActivity {

    /* renamed from: q0 */
    public static final /* synthetic */ int f38447q0 = 0;

    /* renamed from: G2 */
    public static void m37937G2(FirstTimeUseActivityImpl firstTimeUseActivityImpl, int i) {
        Class<FirstTimeUseTermsAndConditionsActivity> cls = FirstTimeUseTermsAndConditionsActivity.class;
        firstTimeUseActivityImpl.getClass();
        C16202a aVar = C16202a.get(firstTimeUseActivityImpl);
        if (aVar.hasLocationPermissions()) {
            Intent intent = new Intent(firstTimeUseActivityImpl, cls);
            intent.putExtra("type", i);
            firstTimeUseActivityImpl.startActivity(intent);
        } else if (aVar.shouldShowLocationsPermissionRationale(firstTimeUseActivityImpl)) {
            GetStartedFirstTimeUseActivity.m37960B2();
            Intent intent2 = new Intent(firstTimeUseActivityImpl, cls);
            intent2.putExtra("type", i);
            firstTimeUseActivityImpl.startActivity(intent2);
        } else {
            aVar.requestLocationPermissions((MoovitActivity) firstTimeUseActivityImpl, (C16202a.C16205c<MoovitActivity>) new C19172a(firstTimeUseActivityImpl, i));
        }
    }

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
        setContentView((int) R.layout.first_time_use_activity);
        View findViewById = findViewById(R.id.dude);
        Drawable b = C17988b.m44611b(R.drawable.img_launcher_logo, this);
        if (!(findViewById == null || b == null)) {
            UiUtils.m40259r(findViewById, new C19173b(findViewById, 0, b));
        }
        C6333d0.m15030r(findViewById(R.id.title), true);
        TextView textView = (TextView) findViewById(R.id.privacy);
        String string = getString(R.string.onboarding_gdpr_control_preferences_hyperlink);
        textView.setText(getString(R.string.onboarding_gdpr_control_preferences, new Object[]{string}));
        C20964s0.m49105w(textView, string, true, new C7082o(this, 13));
        if (!C16202a.get(this).hasLocationPermissions()) {
            findViewById(R.id.permission_hint).setVisibility(0);
        }
        String string2 = getString(R.string.terms_of_service_link);
        C19174c cVar = new C19174c(this);
        String string3 = getString(R.string.privacy_text);
        C19175d dVar = new C19175d(this);
        String string4 = getString(R.string.terms_and_service, new Object[]{string2, string3});
        SpannableString spannableString = new SpannableString(string4);
        int indexOf = string4.indexOf(string2);
        if (indexOf != -1) {
            spannableString.setSpan(cVar, indexOf, string2.length() + indexOf, 33);
        }
        int indexOf2 = string4.indexOf(string3);
        if (indexOf2 != -1) {
            spannableString.setSpan(dVar, indexOf2, string3.length() + indexOf2, 33);
        }
        TextView x2 = mo44549x2(R.id.legal);
        x2.setText(spannableString);
        x2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
