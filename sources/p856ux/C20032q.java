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
import java.util.Iterator;
import s00.C19393f;
import x90.C13242b;

/* renamed from: ux.q */
public final class C20032q implements C13242b {
    /* renamed from: a */
    public final void mo40113a(C13752e eVar) throws BadResponseException, ServerException, IOException {
        Context context = eVar.f33852a;
        SQLiteDatabase readableDatabase = DatabaseHelper.get(context).getReadableDatabase();
        C19393f.f49325q.getClass();
        Iterator it = C19393f.m46695e(readableDatabase).iterator();
        while (it.hasNext()) {
            StringBuilder k = C13555b.m33972k("trip_plan_prefs_");
            k.append(((ServerId) it.next()).mo19751c());
            SharedPreferences sharedPreferences = context.getSharedPreferences(k.toString(), 0);
            if (sharedPreferences != null) {
                sharedPreferences.edit().clear().apply();
            }
        }
    }

    public final String toString() {
        return "Upgrader326To327";
    }
}
