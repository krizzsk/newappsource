package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.support.AppboyLogger;
import com.appboy.support.DateTimeUtils;
import com.appboy.support.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: bo.app.l6 */
public class C1631l6 implements C1606i6 {

    /* renamed from: c */
    public static final String f5820c = AppboyLogger.getBrazeLogTag(C1631l6.class);

    /* renamed from: a */
    public final SharedPreferences f5821a;

    /* renamed from: b */
    public final Map<String, Long> f5822b = mo6214a();

    public C1631l6(Context context, String str, String str2) {
        StringBuilder k = C13555b.m33972k("com.appboy.storage.triggers.re_eligibility");
        k.append(StringUtils.getCacheFileSuffix(context, str, str2));
        this.f5821a = context.getSharedPreferences(k.toString(), 0);
    }

    /* renamed from: a */
    public void mo6151a(List<C1710v4> list) {
        HashSet hashSet = new HashSet();
        for (C1710v4 id : list) {
            hashSet.add(id.getId());
        }
        HashSet hashSet2 = new HashSet(this.f5822b.keySet());
        SharedPreferences.Editor edit = this.f5821a.edit();
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!hashSet.contains(str)) {
                String str2 = f5820c;
                AppboyLogger.m5448d(str2, "Deleting outdated triggered action id " + str + " from stored re-eligibility list. In-memory re-eligibility list is unchanged.");
                edit.remove(str);
            } else {
                String str3 = f5820c;
                AppboyLogger.m5448d(str3, "Retaining triggered action " + str + " in re-eligibility list.");
            }
        }
        edit.apply();
    }

    /* renamed from: a */
    public boolean mo6156a(C1710v4 v4Var) {
        C1667p5 t = v4Var.mo6417f().mo6340t();
        if (t.mo6299p()) {
            String str = f5820c;
            StringBuilder k = C13555b.m33972k("Triggered action id ");
            k.append(v4Var.getId());
            k.append(" always eligible via configuration. Returning true for eligibility status");
            AppboyLogger.m5448d(str, k.toString());
            return true;
        } else if (!this.f5822b.containsKey(v4Var.getId())) {
            String str2 = f5820c;
            StringBuilder k2 = C13555b.m33972k("Triggered action id ");
            k2.append(v4Var.getId());
            k2.append(" always eligible via never having been triggered. Returning true for eligibility status");
            AppboyLogger.m5448d(str2, k2.toString());
            return true;
        } else if (t.mo6301s()) {
            String str3 = f5820c;
            StringBuilder k3 = C13555b.m33972k("Triggered action id ");
            k3.append(v4Var.getId());
            k3.append(" no longer eligible due to having been triggered in the past and is only eligible once.");
            AppboyLogger.m5448d(str3, k3.toString());
            return false;
        } else {
            long longValue = this.f5822b.get(v4Var.getId()).longValue();
            if (DateTimeUtils.nowInSeconds() + ((long) v4Var.mo6417f().mo6337g()) >= ((long) t.mo6300q().intValue()) + longValue) {
                String str4 = f5820c;
                StringBuilder k4 = C13555b.m33972k("Trigger action is re-eligible for display since ");
                k4.append(DateTimeUtils.nowInSeconds() - longValue);
                k4.append(" seconds have passed since the last time it was triggered (minimum interval: ");
                k4.append(t.mo6300q());
                k4.append(").");
                AppboyLogger.m5448d(str4, k4.toString());
                return true;
            }
            String str5 = f5820c;
            StringBuilder k5 = C13555b.m33972k("Trigger action is not re-eligible for display since only ");
            k5.append(DateTimeUtils.nowInSeconds() - longValue);
            k5.append(" seconds have passed since the last time it was triggered (minimum interval: ");
            k5.append(t.mo6300q());
            k5.append(").");
            AppboyLogger.m5448d(str5, k5.toString());
            return false;
        }
    }

    /* renamed from: a */
    public void mo6155a(C1710v4 v4Var, long j) {
        String str = f5820c;
        StringBuilder k = C13555b.m33972k("Updating re-eligibility for action Id ");
        k.append(v4Var.getId());
        k.append(" to time ");
        k.append(j);
        k.append(".");
        AppboyLogger.m5448d(str, k.toString());
        this.f5822b.put(v4Var.getId(), Long.valueOf(j));
        SharedPreferences.Editor edit = this.f5821a.edit();
        edit.putLong(v4Var.getId(), j);
        edit.apply();
    }

    /* renamed from: a */
    public final Map<String, Long> mo6214a() {
        Set<String> keySet;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map<String, ?> all = this.f5821a.getAll();
        if (!(all == null || all.size() == 0 || (keySet = all.keySet()) == null || keySet.size() == 0)) {
            try {
                for (String next : keySet) {
                    long j = this.f5821a.getLong(next, 0);
                    String str = f5820c;
                    AppboyLogger.m5448d(str, "Retrieving triggered action id " + next + " eligibility information from local storage.");
                    concurrentHashMap.put(next, Long.valueOf(j));
                }
            } catch (Exception e) {
                AppboyLogger.m5452e(f5820c, "Encountered unexpected exception while parsing stored re-eligibility information.", e);
            }
        }
        return concurrentHashMap;
    }
}
