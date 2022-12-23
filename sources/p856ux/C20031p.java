package p856ux;

import android.content.Context;
import android.content.SharedPreferences;
import c70.C13752e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import s00.C19393f;
import x90.C13242b;

/* renamed from: ux.p */
public final class C20031p implements C13242b {
    /* renamed from: a */
    public final void mo40113a(C13752e eVar) throws BadResponseException, ServerException, IOException {
        Context context = eVar.f33852a;
        C19393f fVar = C19393f.f49325q;
        SQLiteDatabase readableDatabase = DatabaseHelper.get(context).getReadableDatabase();
        fVar.getClass();
        ArrayList e = C19393f.m46695e(readableDatabase);
        Collections.emptySet();
        Iterator it = e.iterator();
        while (it.hasNext()) {
            StringBuilder k = C13555b.m33972k("trip_plan_prefs_");
            k.append(((ServerId) it.next()).mo19751c());
            SharedPreferences sharedPreferences = context.getSharedPreferences(k.toString(), 0);
            Set emptySet = Collections.emptySet();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putStringSet("disabledTransitTypes", emptySet);
            edit.apply();
            Short sh = -1;
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putInt("tripPlanSearchType", sh.shortValue());
            edit2.apply();
        }
    }

    public final String toString() {
        return "Upgrader259To260";
    }
}
