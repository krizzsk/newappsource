package com.masabi.justride.sdk.p415ui.base.activities;

import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import p001a0.C0017h;
import p605ki.C18061o;
import p605ki.C18063q;

/* renamed from: com.masabi.justride.sdk.ui.base.activities.BaseContainerActivity */
public abstract class BaseContainerActivity extends BaseActivity {

    /* renamed from: x */
    public Fragment f37190x;

    /* renamed from: d1 */
    public abstract String mo44387d1();

    /* renamed from: e1 */
    public abstract String mo44388e1();

    /* renamed from: f1 */
    public abstract Fragment mo44389f1(Bundle bundle);

    public void onCreate(Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        setContentView(C18063q.activity_container);
        Toolbar toolbar = (Toolbar) findViewById(C18061o.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.parseColor(mo44388e1()));
        toolbar.setBackgroundColor(Color.parseColor(mo44387d1()));
        if (this.f37190x == null) {
            if (bundle != null) {
                fragment = getSupportFragmentManager().mo3927E(bundle, "CURRENT_FRAGMENT");
            } else {
                fragment = null;
            }
            if (fragment == null) {
                if (bundle == null) {
                    bundle = getIntent().getExtras();
                }
                this.f37190x = mo44389f1(bundle);
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
                int i = C18061o.fragmentContainerView;
                Fragment fragment2 = this.f37190x;
                K.mo4111f(i, fragment2, fragment2.getClass().getName());
                K.mo4043i();
                return;
            }
            this.f37190x = fragment;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f37190x != null) {
            getSupportFragmentManager().mo3942W(bundle, "CURRENT_FRAGMENT", this.f37190x);
        }
    }
}
