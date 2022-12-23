package com.moovit.app.intro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.MoovitAppApplication;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.location.C16202a;
import com.moovit.metro.selection.MetroArea;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.Set;
import p039c7.C1800c;
import p073e7.C4583a;
import p073e7.C4584b;
import p297w5.C6996c;
import p435de.C16596f;
import p543hq.C17474b;
import p756qt.C19176e;
import p824tp.C19722a0;
import p858uz.C20061g;
import p880vx.C20244b;

public class UserCreationFailureActivity extends MoovitAppActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f38450X = 0;

    /* renamed from: U */
    public String f38451U = null;

    /* renamed from: com.moovit.app.intro.UserCreationFailureActivity$a */
    public static /* synthetic */ class C15020a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38452a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.appdata.UserContextLoader$FailureReason[] r0 = com.moovit.appdata.UserContextLoader.FailureReason.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38452a = r0
                com.moovit.appdata.UserContextLoader$FailureReason r1 = com.moovit.appdata.UserContextLoader.FailureReason.LOCATION_PERMISSION_MISSING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38452a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.appdata.UserContextLoader$FailureReason r1 = com.moovit.appdata.UserContextLoader.FailureReason.LOCATION_NOT_DETECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38452a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.appdata.UserContextLoader$FailureReason r1 = com.moovit.appdata.UserContextLoader.FailureReason.UNSUPPORTED_METRO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f38452a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.appdata.UserContextLoader$FailureReason r1 = com.moovit.appdata.UserContextLoader.FailureReason.NETWORK_ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.intro.UserCreationFailureActivity.C15020a.<clinit>():void");
        }
    }

    /* renamed from: A2 */
    public final void mo45251A2() {
        mo44545v2(new C17474b(AnalyticsEventKey.USER_CREATION_FAILURE_SELECT_METRO_CLICKED));
    }

    /* renamed from: M1 */
    public final void mo44510M1() {
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        Object g = MoovitAppApplication.m37038x().f37321e.mo50694g("USER_CONTEXT");
        if (!(g instanceof UserContextLoader.FailureReason)) {
            setContentView((int) R.layout.creation_user_error_generic_layout);
            findViewById(R.id.generic_error_layout).findViewById(R.id.primary_button).setOnClickListener(new C4051q(this, 15));
            this.f38451U = "general_error";
            return;
        }
        int i = C15020a.f38452a[((UserContextLoader.FailureReason) g).ordinal()];
        if (i == 1) {
            mo45253z2("location_permission_missing");
            setContentView((int) R.layout.location_permission_missing_layout);
            View findViewById = findViewById(R.id.missing_location_permissions);
            findViewById.findViewById(R.id.primary_button).setOnClickListener(new C4052r(this, 9));
            findViewById.findViewById(R.id.secondary_button).setOnClickListener(new C1800c(this, 8));
        } else if (i == 2) {
            C16202a.get(this).requestLocationSettings().addOnSuccessListener((Activity) this, new C19176e(this, 0));
        } else if (i == 3) {
            this.f38451U = "unsupported_metro";
            setContentView((int) R.layout.unsupported_metro_layout);
            findViewById(R.id.unsupported_metro).findViewById(R.id.button).setOnClickListener(new C4583a(this, 12));
        } else if (i == 4) {
            this.f38451U = "network_error";
            setContentView((int) R.layout.creation_user_network_error_layout);
            View findViewById2 = findViewById(R.id.no_internet_connection);
            findViewById2.findViewById(R.id.primary_button).setOnClickListener(new C6996c(this, 15));
            findViewById2.findViewById(R.id.secondary_button).setOnClickListener(new C4584b(this, 15));
        } else {
            throw new IllegalStateException("Unrecognized user creation failure reason: " + g);
        }
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        super.mo24881f2();
        String str = this.f38451U;
        if (str != null) {
            mo45253z2(str);
        }
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareLowAccuracyRareUpdates();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        MetroArea metroArea;
        if (i != 1042) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && (metroArea = (MetroArea) intent.getParcelableExtra("selected_metro")) != null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.USER_CREATION_FAILURE_METRO_SELECTED);
            aVar.mo49935c(AnalyticsAttributeKey.SELECTED_METRO_ID, metroArea.f14802b.f15142b);
            mo44545v2(aVar.mo49933a());
            MoovitAppApplication x = MoovitAppApplication.m37038x();
            Intent y2 = mo45252y2();
            C19722a0 a0Var = (C19722a0) x.getSystemService("user_context");
            if (a0Var == null) {
                ((C20244b) x.f37321e.mo50693f("USER_CONTEXT")).f51350c = metroArea.f14802b;
                x.f37321e.mo50689b("USER_CONTEXT");
                x.mo44574v(this, y2);
                return;
            }
            if (!a0Var.f50160a.f32927c.equals(metroArea.f14802b)) {
                C16596f a = C16596f.m42113a();
                StringBuilder k = C13555b.m33972k("User metro id: ");
                k.append(a0Var.f50160a.f32927c);
                a.mo49363b(k.toString());
                a.mo49363b("Chosen metro id: " + metroArea.f14802b);
                a.mo49364c(new ApplicationBugException("User has already been created on different metro area!"));
            }
            x.mo44574v(this, y2);
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).clear();
        return s1;
    }

    /* renamed from: y2 */
    public final Intent mo45252y2() {
        Intent intent = (Intent) getIntent().getParcelableExtra("activity_to_start_on_success");
        if (intent == null) {
            return C14226d.m35335A0(this);
        }
        return intent;
    }

    /* renamed from: z2 */
    public final void mo45253z2(String str) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.USER_CREATION_FAILURE);
        aVar.mo49939g(AnalyticsAttributeKey.USER_CREATION_FAILURE_REASON, str);
        mo44545v2(aVar.mo49933a());
    }
}
