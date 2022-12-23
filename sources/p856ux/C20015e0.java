package p856ux;

import android.content.Context;
import android.content.SharedPreferences;
import c70.C13752e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.io.IOException;
import java.util.Set;
import x90.C13242b;

/* renamed from: ux.e0 */
public final class C20015e0 implements C13242b {
    /* renamed from: a */
    public final void mo40113a(C13752e eVar) throws BadResponseException, ServerException, IOException {
        Context context = eVar.f33852a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("trip_planner_configuration", 0);
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("accessibility_configuration", 0);
        Set<String> stringSet = sharedPreferences.getStringSet("user_preferable_personal_types", (Set) null);
        if (stringSet != null) {
            boolean contains = stringSet.contains("0");
            boolean contains2 = stringSet.contains(DiskLruCache.VERSION_1);
            sharedPreferences.edit().putBoolean("trip_planner_personal_prefs.slow_walking", contains).putBoolean("trip_planner_personal_prefs.isSet", true).remove("user_preferable_personal_types").apply();
            sharedPreferences2.edit().putBoolean("accessibility_prefs.accessible_routes", contains2).putBoolean("accessibility_prefs.isSet", true).apply();
        }
    }

    public final String toString() {
        return "Upgrader522To523";
    }
}
