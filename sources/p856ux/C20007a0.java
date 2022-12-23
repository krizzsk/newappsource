package p856ux;

import android.content.Context;
import android.content.SharedPreferences;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p389bl.C13641g;
import p567iq.C17635b;
import p786rz.C19387a;
import p810sz.C19575a;
import p810sz.C19576b;
import p834tz.C19803b;
import p898wr.C20400b;
import p977zz.C20944i0;
import s00.C19393f;
import u00.C19848o;
import x90.C13242b;

/* renamed from: ux.a0 */
public final class C20007a0 implements C13242b {
    /* renamed from: a */
    public final void mo40113a(C13752e eVar) throws BadResponseException, ServerException, IOException {
        Pattern pattern;
        String[] strArr;
        ArrayList arrayList;
        C13752e eVar2 = eVar;
        Context context = eVar2.f33852a;
        int i = 0;
        context.getSharedPreferences("alert_dismissal", 0).edit().clear().apply();
        context.getSharedPreferences("trip_plan_prefs_1", 0).edit().remove("timeType").remove("daysOfWeek").apply();
        SharedPreferences sharedPreferences = context.getSharedPreferences("events_tracker_store", 0);
        HashSet hashSet = new HashSet();
        Map<String, ?> all = sharedPreferences.getAll();
        if (!C13717b.m34259f(all)) {
            for (Map.Entry next : all.entrySet()) {
                if (Boolean.TRUE.equals(next.getValue())) {
                    hashSet.add((String) next.getKey());
                }
            }
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            edit.putInt((String) it.next(), 1);
        }
        edit.apply();
        Context context2 = eVar2.f33852a;
        File file = new File(new File(context2.getFilesDir(), "stores"), "smart_lines_tracking");
        if (file.exists()) {
            C19387a.m46676h(file);
        }
        if (UserContextLoader.m40004l(context2)) {
            Pattern compile = Pattern.compile("favorite_lines_([0-9]+)\\.dat");
            String[] list = context2.getFilesDir().list();
            ServerId.C4255c cVar = ServerId.f15141f;
            C19575a a = C19575a.m46957a(new C19803b(cVar, cVar), false);
            ServerId.C4254b bVar = ServerId.f15140e;
            C19576b a2 = C19576b.m46958a(bVar);
            C19576b a3 = C19576b.m46958a(bVar);
            SQLiteDatabase readableDatabase = DatabaseHelper.get(context2).getReadableDatabase();
            C19393f fVar = C19393f.f49325q;
            int length = list.length;
            while (i < length) {
                String str = list[i];
                Matcher matcher = compile.matcher(str);
                if (!matcher.matches() || (arrayList = (ArrayList) C13641g.m34133v(context2, str, a)) == null) {
                    pattern = compile;
                    strArr = list;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C20944i0 i0Var = (C20944i0) it2.next();
                        Pattern pattern2 = compile;
                        if (!arrayList2.contains(i0Var.f52692a)) {
                            arrayList2.add((ServerId) i0Var.f52692a);
                        }
                        if (!arrayList3.contains(i0Var.f52693b)) {
                            arrayList3.add((ServerId) i0Var.f52693b);
                        }
                        compile = pattern2;
                    }
                    pattern = compile;
                    String group = matcher.group(1);
                    ServerId serverId = new ServerId(Integer.parseInt(group));
                    ArrayList arrayList4 = new ArrayList();
                    fVar.getClass();
                    strArr = list;
                    long c = C19393f.m46693c(readableDatabase, serverId);
                    if (c > 0) {
                        C19848o e = ((C20400b) C17635b.m43779f(context2).mo52084b(serverId, c)).mo51803e();
                        arrayList4 = C13720d.m34273c(e.mo52149h(context2, e.mo52150i(context2, new HashSet(arrayList2))), (C13722f) null, new C20046z());
                    }
                    C13641g.m34136y(context2, str, arrayList4, a2);
                    C13641g.m34136y(context2, "favorite_stops_" + group + ".dat", arrayList3, a3);
                }
                i++;
                compile = pattern;
                list = strArr;
            }
        }
    }

    public final String toString() {
        return "Upgrader4xTo5x";
    }
}
