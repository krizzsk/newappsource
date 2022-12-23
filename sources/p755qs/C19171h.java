package p755qs;

import aa0.C7524a;
import android.content.Intent;
import android.content.SharedPreferences;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import com.moovit.app.ads.consent.PrivacyPersonalizedAdsConsentActivity;
import com.moovit.app.general.settings.privacy.C14894a;
import f00.C16919g;
import java.util.concurrent.TimeUnit;
import p646lz.C18299a;
import p824tp.C19722a0;
import p825tq.C19749a;
import p874vr.C20199a;
import p977zz.C20944i0;
import q00.C19047a;
import y90.C13272f;

/* renamed from: qs.h */
public final class C19171h implements C7524a<C20944i0<Boolean, Boolean>> {
    /* renamed from: a */
    public final Object mo23790a(MoovitActivity moovitActivity) throws Exception {
        C18299a aVar = ((MoovitApplication) moovitActivity.getApplication()).f37321e;
        boolean z = false;
        C19722a0 a0Var = (C19722a0) aVar.mo50695h("USER_CONTEXT", false);
        C19047a aVar2 = (C19047a) aVar.mo50695h("CONFIGURATION", false);
        boolean z2 = !C14894a.m37560b(moovitActivity).mo45017g();
        C19749a aVar3 = C19749a.f50225d;
        if (aVar3 != null) {
            SharedPreferences sharedPreferences = aVar3.f50226a.getSharedPreferences("personalized_ads_consent", 0);
            if (!(aVar2 == null || !((Boolean) aVar2.mo51505b(C20199a.f51261W0)).booleanValue() || a0Var == null)) {
                C13272f fVar = a0Var.f50160a;
                if (fVar.f32927c.equals(fVar.f32929e) && C14894a.m37560b(aVar3.f50226a).mo45015e() == null) {
                    if (System.currentTimeMillis() - C19749a.f50223b.mo19759a(sharedPreferences).longValue() > TimeUnit.DAYS.toMillis((long) ((Integer) aVar2.mo51505b(C20199a.f51263Y0)).intValue())) {
                        C19749a.f50224c.mo49545d(sharedPreferences, 0);
                    }
                    if (C19749a.f50224c.mo19759a(sharedPreferences).intValue() < ((Integer) aVar2.mo51505b(C20199a.f51262X0)).intValue()) {
                        z = true;
                    }
                }
            }
            if (z2 || z) {
                return new C20944i0(Boolean.valueOf(z2), Boolean.valueOf(z));
            }
            return null;
        }
        throw new IllegalStateException("you must call initialize first");
    }

    /* renamed from: b */
    public final void mo23791b(MoovitActivity moovitActivity, Object obj) {
        C20944i0 i0Var = (C20944i0) obj;
        Boolean bool = Boolean.TRUE;
        boolean equals = bool.equals(i0Var.f52692a);
        if (bool.equals(i0Var.f52693b)) {
            C19749a aVar = C19749a.f50225d;
            if (aVar != null) {
                SharedPreferences sharedPreferences = aVar.f50226a.getSharedPreferences("personalized_ads_consent", 0);
                C19749a.f50223b.mo49545d(sharedPreferences, Long.valueOf(System.currentTimeMillis()));
                C16919g.C16924e eVar = C19749a.f50224c;
                eVar.mo49545d(sharedPreferences, Integer.valueOf(eVar.mo19759a(sharedPreferences).intValue() + 1));
                int i = PrivacyPersonalizedAdsConsentActivity.f37502Z;
                Intent intent = new Intent(moovitActivity, PrivacyPersonalizedAdsConsentActivity.class);
                intent.putExtra("isPrivacyUpdateNeeded", equals);
                moovitActivity.startActivity(intent);
                return;
            }
            throw new IllegalStateException("you must call initialize first");
        } else if (equals) {
            new C19170g().show(moovitActivity.getSupportFragmentManager(), (String) null);
        }
    }
}
