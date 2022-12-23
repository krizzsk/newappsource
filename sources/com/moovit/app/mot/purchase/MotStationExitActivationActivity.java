package com.moovit.app.mot.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.commons.utils.ApplicationBugException;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0017h;
import p757qu.C19185h;

public class MotStationExitActivationActivity extends MoovitAppActivity {

    /* renamed from: U */
    public ArrayList f39051U;

    /* renamed from: y2 */
    public static Intent m38689y2(Context context, List<MotActivation> list) {
        Intent intent = new Intent(context, MotStationExitActivationActivity.class);
        intent.putParcelableArrayListExtra("activations", C13717b.m34264k(list));
        return intent;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.mot_station_exit_activation_activity);
        if (mo44529n1(R.id.fragments_container) == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
            int i = C19185h.f48779u;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("manualLocation", (Parcelable) null);
            C19185h hVar = new C19185h();
            hVar.setArguments(bundle2);
            K.mo4111f(R.id.fragments_container, hVar, "user_location_exit");
            K.mo4040d();
        }
    }

    /* renamed from: z2 */
    public final List<MotActivation> mo45599z2() {
        if (this.f39051U == null) {
            this.f39051U = getIntent().getParcelableArrayListExtra("activations");
        }
        ArrayList arrayList = this.f39051U;
        if (arrayList != null) {
            return arrayList;
        }
        throw new ApplicationBugException("Did you use MotStationExitActivationActivity.createStartIntent(...)");
    }
}
