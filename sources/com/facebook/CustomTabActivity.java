package com.facebook;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import kotlin.Metadata;
import mf0.C24362h;
import p130j2.C5367a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/facebook/CustomTabActivity;", "Landroid/app/Activity;", "<init>", "()V", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class CustomTabActivity extends Activity {

    /* renamed from: c */
    public static final String f8397c = C24362h.m61216k(".action_customTabRedirect", "CustomTabActivity");

    /* renamed from: d */
    public static final String f8398d = C24362h.m61216k(".action_destroy", "CustomTabActivity");

    /* renamed from: b */
    public CustomTabActivity$onActivityResult$closeReceiver$1 f8399b;

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 0) {
            Intent intent2 = new Intent(f8397c);
            intent2.putExtra(CustomTabMainActivity.f8404g, getIntent().getDataString());
            C5367a.m13473a(this).mo21147c(intent2);
            CustomTabActivity$onActivityResult$closeReceiver$1 customTabActivity$onActivityResult$closeReceiver$1 = new CustomTabActivity$onActivityResult$closeReceiver$1(this);
            C5367a.m13473a(this).mo21146b(customTabActivity$onActivityResult$closeReceiver$1, new IntentFilter(f8398d));
            this.f8399b = customTabActivity$onActivityResult$closeReceiver$1;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CustomTabMainActivity.class);
        intent.setAction(f8397c);
        intent.putExtra(CustomTabMainActivity.f8404g, getIntent().getDataString());
        intent.addFlags(603979776);
        startActivityForResult(intent, 2);
    }

    public final void onDestroy() {
        CustomTabActivity$onActivityResult$closeReceiver$1 customTabActivity$onActivityResult$closeReceiver$1 = this.f8399b;
        if (customTabActivity$onActivityResult$closeReceiver$1 != null) {
            C5367a.m13473a(this).mo21148d(customTabActivity$onActivityResult$closeReceiver$1);
        }
        super.onDestroy();
    }
}
