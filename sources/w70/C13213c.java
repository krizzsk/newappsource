package w70;

import android.content.Context;
import android.content.SharedPreferences;
import ce0.C21100e;
import e70.C4591d;

/* renamed from: w70.c */
public final class C13213c implements C13216f {
    /* renamed from: a */
    public final void mo40086a(Context context) {
        C4591d.m11903a(context).getClass();
        if (C4591d.m11904b()) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("moovit_sdk_upload_data_task", 0);
            C21100e.m49373x(sharedPreferences, "prefs");
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong("first_time_scheduled", valueOf.longValue());
            edit.apply();
        }
        context.deleteFile("moovit_sdk_async_message_store");
    }
}
