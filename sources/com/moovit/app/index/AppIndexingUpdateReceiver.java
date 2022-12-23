package com.moovit.app.index;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.JobIntentService;
import com.moovit.appdata.UserContextLoader;

public class AppIndexingUpdateReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (UserContextLoader.m40004l(context)) {
            if (intent != null) {
                str = intent.getAction();
            } else {
                str = null;
            }
            if ("com.google.firebase.appindexing.UPDATE_INDEX".equals(str)) {
                int i = AppIndexingUpdateService.f38434l;
                Intent intent2 = new Intent();
                intent2.setAction("UPDATE_APP_INDEXING_FROM_STORE");
                JobIntentService.m2303a(context, AppIndexingUpdateService.class, 1974, intent2);
            }
        }
    }
}
