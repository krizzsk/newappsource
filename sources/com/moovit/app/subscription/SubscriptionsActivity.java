package com.moovit.app.subscription;

import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1026n0;
import com.moovit.MoovitApplication;
import com.moovit.app.MoovitAppActivity;
import com.tranzmate.R;
import p304x.C7121y;
import p923xs.C20581k;

public class SubscriptionsActivity extends MoovitAppActivity {

    /* renamed from: Y */
    public static final /* synthetic */ int f39776Y = 0;

    /* renamed from: U */
    public ProgressBar f39777U;

    /* renamed from: X */
    public C15364b f39778X;

    /* renamed from: V0 */
    public final void mo19423V0(Bundle bundle, String str) {
        if ("error_dialog".equals(str)) {
            finish();
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.subscriptions_activity);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo793o(true);
            supportActionBar.mo791m(true);
        }
        this.f39777U = (ProgressBar) findViewById(R.id.progress_bar);
        C15364b bVar = (C15364b) new C1026n0(this).mo4313a(C15364b.class);
        this.f39778X = bVar;
        MoovitSubscriptionsManager.m39315c((MoovitApplication) bVar.f3907b).f39763e.observe(this, new C20581k(this, 2));
        MoovitSubscriptionsManager.m39315c((MoovitApplication) this.f39778X.f3907b).f39764f.observe(this, new C7121y(this, 1));
    }

    /* renamed from: y2 */
    public final void mo45942y2(Fragment fragment) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C0909a aVar = new C0909a(supportFragmentManager);
        aVar.mo4111f(R.id.container, fragment, (String) null);
        aVar.mo4040d();
    }
}
