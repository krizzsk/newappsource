package com.moovit.app.intro.onboarding;

import android.os.Bundle;
import com.moovit.app.MoovitAppActivity;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import p828tt.C19762c;
import p828tt.C19764e;
import p828tt.C19767h;
import p828tt.C19768i;
import p828tt.C19769j;
import q00.C19047a;
import q00.C19053d;

public class UserOnboardingActivity extends MoovitAppActivity {

    /* renamed from: U */
    public final ArrayList f38473U = new ArrayList();

    /* renamed from: M1 */
    public final void mo44510M1() {
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        boolean z;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.user_onboarding_activity);
        C19762c.m47215a(this, C19762c.f50246a);
        C19764e eVar = (C19764e) mo44537r1("ONBOARDING_CONFIGURATION");
        boolean z2 = false;
        if (eVar.f50249a.size() > 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f38473U.add(C19769j.class);
        }
        if (eVar.f50250b.size() > 0) {
            z2 = true;
        }
        if (z2) {
            this.f38473U.add(C19768i.class);
        }
        if (((Boolean) ((C19047a) mo44537r1("CONFIGURATION")).mo51505b(C19053d.f48474m)).booleanValue()) {
            this.f38473U.add(C19767h.class);
        }
        if (bundle == null) {
            mo45265y2();
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("ONBOARDING_CONFIGURATION");
        return s1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* renamed from: y2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45265y2() {
        /*
            r8 = this;
            java.util.ArrayList r0 = r8.f38473U
            boolean r0 = r0.isEmpty()
            r1 = 2131362998(0x7f0a04b6, float:1.8345792E38)
            r2 = 0
            if (r0 == 0) goto L_0x000d
            goto L_0x0033
        L_0x000d:
            androidx.fragment.app.Fragment r0 = r8.mo44529n1(r1)
            com.moovit.c r0 = (com.moovit.C15682c) r0
            if (r0 != 0) goto L_0x001f
            java.util.ArrayList r0 = r8.f38473U
            r3 = 0
            java.lang.Object r0 = r0.get(r3)
            java.lang.Class r0 = (java.lang.Class) r0
            goto L_0x003f
        L_0x001f:
            java.util.ArrayList r3 = r8.f38473U
            java.lang.Class r0 = r0.getClass()
            int r0 = r3.indexOf(r0)
            java.util.ArrayList r3 = r8.f38473U
            int r3 = r3.size()
            int r3 = r3 + -1
            if (r0 != r3) goto L_0x0035
        L_0x0033:
            r0 = r2
            goto L_0x003f
        L_0x0035:
            java.util.ArrayList r3 = r8.f38473U
            int r0 = r0 + 1
            java.lang.Object r0 = r3.get(r0)
            java.lang.Class r0 = (java.lang.Class) r0
        L_0x003f:
            if (r0 != 0) goto L_0x005d
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r1 = "activity_to_start_on_finish"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            android.content.Intent r0 = (android.content.Intent) r0
            if (r0 != 0) goto L_0x0053
            android.content.Intent r0 = com.google.android.play.core.appupdate.C14226d.m35335A0(r8)
        L_0x0053:
            com.google.android.play.core.appupdate.C14226d.m35339F0(r0)
            r8.startActivity(r0)
            r8.finish()
            return
        L_0x005d:
            androidx.fragment.app.FragmentManager r3 = r8.getSupportFragmentManager()
            androidx.fragment.app.s r4 = r3.mo3929G()
            r8.getClassLoader()
            java.lang.String r0 = r0.getName()
            androidx.fragment.app.Fragment r0 = r4.mo3992a(r0)
            androidx.fragment.app.a r4 = new androidx.fragment.app.a
            r4.<init>(r3)
            r3 = 2130772037(0x7f010045, float:1.7147181E38)
            r5 = 2130772038(0x7f010046, float:1.7147183E38)
            r6 = 2130772039(0x7f010047, float:1.7147185E38)
            r7 = 2130772040(0x7f010048, float:1.7147187E38)
            r4.mo4112g(r3, r5, r6, r7)
            r4.mo4111f(r1, r0, r2)
            r4.mo4040d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.intro.onboarding.UserOnboardingActivity.mo45265y2():void");
    }
}
