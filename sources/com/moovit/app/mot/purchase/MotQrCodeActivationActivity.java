package com.moovit.app.mot.purchase;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import c70.C13753f;
import ce0.C21100e;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.mot.purchase.model.MotQrCodeActivationFare;
import com.moovit.app.mot.purchase.model.MotQrCodeScanResult;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.design.view.AlertMessageView;
import com.moovit.network.model.ServerId;
import com.moovit.request.UserRequestError;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001a0.C0017h;
import p259t5.C6592b;
import p736pu.C19002j;
import p736pu.C19003k;
import p805su.C19539a;
import p805su.C19550h;
import p805su.C19554k;
import p878vv.C20237d;
import p906wz.C20436g;

public class MotQrCodeActivationActivity extends MoovitAppActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f39026X = 0;

    /* renamed from: U */
    public MotQrCodeScanResult f39027U = null;

    /* renamed from: com.moovit.app.mot.purchase.MotQrCodeActivationActivity$a */
    public static class C15156a implements FragmentManager.C0897m {

        /* renamed from: a */
        public final FragmentManager f39028a;

        /* renamed from: b */
        public int f39029b = 0;

        public C15156a(FragmentManager fragmentManager) {
            C21100e.m49373x(fragmentManager, "fm");
            this.f39028a = fragmentManager;
        }

        public final void onBackStackChanged() {
            C19539a aVar;
            int D = this.f39028a.mo3926D();
            if (D < this.f39029b && (aVar = (C19539a) this.f39028a.mo3983z(R.id.fragments_container)) != null) {
                aVar.mo51897o2();
            }
            this.f39029b = D;
        }
    }

    /* renamed from: U1 */
    public final void mo44512U1(List<C20436g<?, ?>> list) {
        this.f39027U = ((C19003k) C13717b.m34256c(list)).f48354m;
    }

    /* renamed from: W1 */
    public final void mo44514W1(CollectionHashMap.ArrayListHashMap arrayListHashMap, Map map) {
        super.mo44514W1(arrayListHashMap, map);
        AlertMessageView alertMessageView = (AlertMessageView) findViewById(R.id.error_view);
        Exception exc = (Exception) C13717b.m34256c(map.values());
        if (alertMessageView != null && (exc instanceof UserRequestError)) {
            UserRequestError userRequestError = (UserRequestError) exc;
            alertMessageView.setTitle((CharSequence) userRequestError.mo49162d());
            alertMessageView.setSubtitle((CharSequence) userRequestError.mo49161c());
            alertMessageView.setPositiveButtonClickListener(new C6592b(this, 19));
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.mot_qr_code_activation_activity);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.mo3948b(new C15156a(supportFragmentManager));
        if (supportFragmentManager.mo3983z(R.id.fragments_container) == null) {
            mo45585z2(new C19554k(), "suggestions", false);
        }
    }

    /* renamed from: f1 */
    public final C13753f<?> mo44522f1() {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("qrCode");
        long longExtra = intent.getLongExtra("scanTime", System.currentTimeMillis());
        LatLonE6 latLonE6 = (LatLonE6) intent.getParcelableExtra("scanLocation");
        if (stringExtra == null || latLonE6 == null) {
            throw new ApplicationBugException("Did you use MotQrCodeActivationActivity.createStartIntent(...)");
        }
        C19002j jVar = new C19002j(mo44548x1(), stringExtra, longExtra, latLonE6);
        return new C13753f<>(C20237d.class.getName() + jVar.f48351w + jVar.f48353y, jVar);
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("MOT_SUPPORT_VALIDATOR");
        return s1;
    }

    /* renamed from: y2 */
    public final void mo45584y2(MotQrCodeActivationFare motQrCodeActivationFare, ServerId serverId, ServerId serverId2, boolean z) {
        MotQrCodeScanResult motQrCodeScanResult = this.f39027U;
        C21100e.m49373x(motQrCodeScanResult, "scanResult");
        String str = motQrCodeScanResult.f39062b;
        int i = C19550h.f49679y;
        Bundle bundle = new Bundle();
        bundle.putString("activationContext", str);
        bundle.putParcelable("activationFare", motQrCodeActivationFare);
        if (serverId != null) {
            bundle.putParcelable("lineId", serverId);
        }
        if (serverId2 != null) {
            bundle.putParcelable("destinationStopId", serverId2);
        }
        C19550h hVar = new C19550h();
        hVar.setArguments(bundle);
        mo45585z2(hVar, "fare_summery", !z);
    }

    /* renamed from: z2 */
    public final void mo45585z2(C19539a aVar, String str, boolean z) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
        if (supportFragmentManager.mo3983z(R.id.fragments_container) != null) {
            K.mo4112g(R.anim.slide_fragment_enter, R.anim.slide_fragment_exit, R.anim.slide_fragment_pop_enter, R.anim.slide_fragment_pop_exit);
        }
        K.mo4111f(R.id.fragments_container, aVar, str);
        if (z) {
            K.mo4110c(str);
        }
        K.mo4040d();
    }
}
