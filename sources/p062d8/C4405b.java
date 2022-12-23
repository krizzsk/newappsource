package p062d8;

import android.content.SharedPreferences;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.cloudbridge.SettingsAPIFields;
import com.facebook.internal.C2436x;
import java.util.HashMap;
import p009a8.C0115o;

/* renamed from: d8.b */
public final class C4405b {

    /* renamed from: a */
    public static final C4405b f15466a = new C4405b();

    /* renamed from: b */
    public static final String f15467b = C4405b.class.getCanonicalName();

    /* renamed from: c */
    public static boolean f15468c;

    /* renamed from: a */
    public static void m11580a(HashMap hashMap) {
        SharedPreferences sharedPreferences = C0115o.m210a().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences != null) {
            SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
            Object obj = hashMap.get(settingsAPIFields.getRawValue());
            SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
            Object obj2 = hashMap.get(settingsAPIFields2.getRawValue());
            SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
            Object obj3 = hashMap.get(settingsAPIFields3.getRawValue());
            if (obj != null && obj2 != null && obj3 != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(settingsAPIFields.getRawValue(), obj.toString());
                edit.putString(settingsAPIFields2.getRawValue(), obj2.toString());
                edit.putString(settingsAPIFields3.getRawValue(), obj3.toString());
                edit.apply();
                C2436x.C2437a aVar = C2436x.f8729d;
                C2436x.C2437a.m6390b(LoggingBehavior.APP_EVENTS, f15467b.toString(), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
            }
        }
    }
}
