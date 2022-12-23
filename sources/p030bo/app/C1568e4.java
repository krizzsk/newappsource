package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p001a0.C0017h;

/* renamed from: bo.app.e4 */
public class C1568e4 implements C1526a4 {

    /* renamed from: c */
    public static final String f5668c = AppboyLogger.getBrazeLogTag(C1568e4.class);

    /* renamed from: a */
    public boolean f5669a = false;

    /* renamed from: b */
    public final SharedPreferences f5670b;

    public C1568e4(Context context, String str, String str2) {
        StringBuilder k = C13555b.m33972k("com.appboy.storage.appboy_event_storage");
        k.append(StringUtils.getCacheFileSuffix(context, str, str2));
        this.f5670b = context.getSharedPreferences(k.toString(), 0);
    }

    /* renamed from: a */
    public void mo5895a(C1594h2 h2Var) {
        if (this.f5669a) {
            String str = f5668c;
            AppboyLogger.m5459w(str, "Storage provider is closed. Not adding event: " + h2Var);
            return;
        }
        SharedPreferences.Editor edit = this.f5670b.edit();
        String str2 = f5668c;
        StringBuilder k = C13555b.m33972k("Adding event to storage with uid ");
        k.append(h2Var.mo6146r());
        AppboyLogger.m5451d(str2, k.toString(), false);
        edit.putString(h2Var.mo6146r(), h2Var.mo6145o());
        edit.apply();
    }

    public void close() {
        AppboyLogger.m5459w(f5668c, "Setting this provider to closed.");
        this.f5669a = true;
    }

    /* renamed from: a */
    public Collection<C1594h2> mo5894a() {
        if (this.f5669a) {
            AppboyLogger.m5459w(f5668c, "Storage provider is closed. Not getting all events.");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : this.f5670b.getAll().entrySet()) {
            String str = (String) next.getKey();
            String str2 = (String) next.getValue();
            try {
                arrayList.add(C1687s2.m4704b(str2, str));
            } catch (Exception e) {
                AppboyLogger.m5452e(f5668c, C0017h.m56M("Could not create AppboyEvent from [serialized event string=", str2, ", unique identifier=", str, "] ... Deleting!"), e);
                mo6051a(str);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo5896a(List<C1594h2> list) {
        if (this.f5669a) {
            String str = f5668c;
            AppboyLogger.m5459w(str, "Storage provider is closed. Not deleting events: " + list);
            return;
        }
        SharedPreferences.Editor edit = this.f5670b.edit();
        for (C1594h2 r : list) {
            String r2 = r.mo6146r();
            String str2 = f5668c;
            AppboyLogger.m5451d(str2, "Deleting event from storage with uid " + r2, false);
            edit.remove(r2);
        }
        edit.apply();
    }

    /* renamed from: a */
    public void mo6051a(String str) {
        SharedPreferences.Editor edit = this.f5670b.edit();
        edit.remove(str);
        edit.apply();
    }
}
