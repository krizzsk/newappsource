package com.moovit.commons.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class RemoveAndFinishTaskActivity extends Activity {

    /* renamed from: b */
    public static final /* synthetic */ int f41032b = 0;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
        overridePendingTransition(0, 0);
    }

    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        finish();
        overridePendingTransition(0, 0);
    }
}
