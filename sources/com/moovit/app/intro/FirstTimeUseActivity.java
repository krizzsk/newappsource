package com.moovit.app.intro;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.C14688a;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.intro.onboarding.OnboardingType;
import com.moovit.appdata.UserContextLoader;
import com.tranzmate.R;
import f00.C16919g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p543hq.C17474b;
import p716oy.C18860a;
import p828tt.C19762c;
import p977zz.C20944i0;
import p977zz.C20977y0;

public abstract class FirstTimeUseActivity extends MoovitAppActivity {

    /* renamed from: l0 */
    public static final C16919g.C16924e f38440l0 = new C16919g.C16924e("finishedIntroVersion", 0);

    /* renamed from: m0 */
    public static final C16919g.C16925f f38441m0 = new C16919g.C16925f("latestIntroFinishedTimeStamp", 0);

    /* renamed from: U */
    public final C15019a f38442U = new C15019a();

    /* renamed from: X */
    public Intent f38443X;

    /* renamed from: Y */
    public C14688a f38444Y;

    /* renamed from: Z */
    public final ArrayList f38445Z = new ArrayList();

    /* renamed from: com.moovit.app.intro.FirstTimeUseActivity$a */
    public class C15019a implements C14688a.C14690b {
        public C15019a() {
        }

        /* renamed from: a */
        public final void mo20300a() {
            boolean z = false;
            if (FirstTimeUseActivity.f38440l0.mo19759a(FirstTimeUseActivity.this.getSharedPreferences("intro", 0)).intValue() >= 2) {
                z = true;
            }
            if (z) {
                FirstTimeUseActivity.this.mo45246z2();
            }
        }

        /* renamed from: c */
        public final void mo20301c(Object obj, String str) {
            boolean z = false;
            if (FirstTimeUseActivity.f38440l0.mo19759a(FirstTimeUseActivity.this.getSharedPreferences("intro", 0)).intValue() >= 2) {
                z = true;
            }
            if (z) {
                FirstTimeUseActivity.this.mo19442O1(obj, str);
            } else {
                FirstTimeUseActivity.this.f38445Z.add(new C20944i0(str, obj));
            }
        }

        /* renamed from: d */
        public final void mo20302d(Object obj, String str) {
        }
    }

    /* renamed from: A2 */
    public abstract void mo45243A2();

    /* renamed from: M1 */
    public final void mo44510M1() {
    }

    /* renamed from: O1 */
    public final void mo19442O1(Object obj, String str) {
        super.mo19442O1(obj, str);
        if (!isFinishing()) {
            C20977y0.m49124c(this);
        }
    }

    /* renamed from: T1 */
    public final void mo19422T1() {
        super.mo19422T1();
        this.f38444Y.mo44596d();
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        Intent intent2 = (Intent) intent.getParcelableExtra("activityToLaunchWhenFinished");
        if (intent2 != null) {
            this.f38443X = intent2;
        }
    }

    /* renamed from: e1 */
    public final C17474b.C17475a mo44521e1() {
        C17474b.C17475a e1 = super.mo44521e1();
        e1.mo49935c(AnalyticsAttributeKey.INTRO_STEPS_SEEN, -1);
        return e1;
    }

    /* renamed from: e2 */
    public void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        Intent intent = (Intent) getIntent().getParcelableExtra("activityToLaunchWhenFinished");
        this.f38443X = intent;
        if (intent == null && bundle != null) {
            this.f38443X = (Intent) bundle.getParcelable("activityToLaunchWhenFinished");
        }
        this.f38445Z.clear();
        C14688a aVar = new C14688a(super.mo19438s1(), this.f38442U);
        this.f38444Y = aVar;
        aVar.mo44597e();
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putParcelable("activityToLaunchWhenFinished", this.f38443X);
    }

    public final void onRestart() {
        super.onRestart();
        if (UserContextLoader.m40004l(this)) {
            mo45246z2();
        }
    }

    /* renamed from: s1 */
    public Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).clear();
        return s1;
    }

    /* renamed from: w1 */
    public final Intent mo44546w1() {
        Intent intent = this.f38443X;
        if (intent == null) {
            intent = C14226d.m35335A0(this);
        }
        Intent intent2 = new Intent(intent);
        intent2.setFlags(0);
        return intent2;
    }

    /* renamed from: y2 */
    public void mo45245y2(boolean z) {
        SharedPreferences sharedPreferences = getSharedPreferences("intro", 0);
        f38440l0.mo49545d(sharedPreferences, 2);
        f38441m0.mo49545d(sharedPreferences, Long.valueOf(System.currentTimeMillis()));
        C16919g.C16924e eVar = C19762c.f50246a;
        if (C18860a.m45884a().f48026n != OnboardingType.NONE) {
            C19762c.f50246a.mo49545d(getSharedPreferences("on_boarding", 0), 0);
        }
        if (C18860a.m45884a().f48020h) {
            C19762c.f50247b.mo49545d(getSharedPreferences("on_boarding", 0), 0);
        }
        if (this.f38444Y.mo44593a()) {
            mo45246z2();
        } else if (z) {
            this.f38445Z.clear();
            mo45243A2();
            this.f38444Y.mo44597e();
        } else if (!this.f38445Z.isEmpty()) {
            Iterator it = this.f38445Z.iterator();
            while (it.hasNext()) {
                C20944i0 i0Var = (C20944i0) it.next();
                mo19442O1(i0Var.f52693b, (String) i0Var.f52692a);
            }
        } else {
            mo45243A2();
        }
    }

    /* renamed from: z2 */
    public final void mo45246z2() {
        startActivity(this.f38443X);
        finish();
        overridePendingTransition(R.anim.onboarding_fade_in, R.anim.onboarding_fade_out);
    }
}
