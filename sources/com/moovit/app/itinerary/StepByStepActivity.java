package com.moovit.app.itinerary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.actions.QuickAction;
import com.moovit.app.ads.AdSource;
import com.moovit.itinerary.model.Itinerary;
import com.tranzmate.R;
import e20.C16783l;
import java.util.List;
import p001a0.C0016g;
import p543hq.C17474b;
import p874vr.C20199a;
import q00.C19047a;

public class StepByStepActivity extends ItineraryStepsBaseActivity {
    /* renamed from: R2 */
    public static Intent m38046R2(Context context, Itinerary itinerary, int i, boolean z, String str) {
        Intent intent = new Intent(context, StepByStepActivity.class);
        intent.putExtra("scheduled_itinerary_key", itinerary);
        intent.putExtra("scheduled_itinerary_leg_index_key", i);
        intent.putExtra("is_itinerary_initial_state_key", z);
        intent.putExtra("activity_title_key", str);
        return intent;
    }

    /* renamed from: B2 */
    public final boolean mo45276B2() {
        return false;
    }

    /* renamed from: C2 */
    public final void mo45277C2() {
    }

    /* renamed from: D2 */
    public final AdSource mo45278D2() {
        return AdSource.ITINERARY_PREVIEW_SCREEN_BANNER;
    }

    /* renamed from: E2 */
    public final int mo45279E2() {
        return R.layout.step_by_step_activity;
    }

    /* renamed from: F2 */
    public final C19047a.C19049b<List<QuickAction>> mo45280F2() {
        return C20199a.f51250L0;
    }

    /* renamed from: G2 */
    public final boolean mo45281G2() {
        return false;
    }

    /* renamed from: I2 */
    public final void mo45283I2(int i) {
        int i2;
        super.mo45283I2(i);
        View view = this.f38509s0;
        if (this.f38501Z.size() > 1) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        view.setVisibility(i2);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo799u(C16783l.m42486r(this, this.f38499X) + getString(R.string.string_list_delimiter_dot) + this.f38499X.mo48290c().mo48334e2().mo24313f());
        }
    }

    /* renamed from: N2 */
    public final boolean mo45288N2() {
        return true;
    }

    /* renamed from: O2 */
    public final boolean mo45289O2() {
        return true;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        String stringExtra = getIntent().getStringExtra("activity_title_key");
        if (stringExtra != null) {
            setTitle(stringExtra);
        }
    }

    /* renamed from: f2 */
    public final void mo24881f2() {
        String str;
        super.mo24881f2();
        int i = this.f38507q0;
        if (i == -1) {
            i = this.f38502l0.getCurrentLogicalItem();
        }
        if (i == 0) {
            str = "start_step";
        } else {
            str = C0016g.m20c(this.f38499X.mo48295u0().get(i - 1).getType());
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.ITINERARY_LOADED);
        aVar.mo49935c(AnalyticsAttributeKey.ITINERARY_STEP_INDEX, i);
        aVar.mo49939g(AnalyticsAttributeKey.ITINERARY_STEP_TYPE, str);
        aVar.mo49935c(AnalyticsAttributeKey.NUMBER_OF_STEPS, this.f38499X.mo48295u0().size() + 1);
        aVar.mo49939g(AnalyticsAttributeKey.ITINERARY_GUID, this.f38499X.f41894b);
        aVar.mo49935c(AnalyticsAttributeKey.LEGS_WITH_ALTERNATIVES, C16783l.m42471c(this.f38499X));
        mo44545v2(aVar.mo49933a());
    }
}
