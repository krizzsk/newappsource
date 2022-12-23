package com.moovit.app.tracking;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.Locale;
import p784rx.C19376b;
import p784rx.C19378d;
import p784rx.C19379e;

public enum TrackingCondition {
    SUBSCRIPTIONS_PROMO(new C19379e(Arrays.asList(new C19378d[]{new C19378d(2, r4), new C19378d(2, r4), new C19378d(2, r4), new C19378d(30, r4)})));
    
    private final C19376b condition;

    private TrackingCondition(C19376b bVar) {
        this.condition = bVar;
    }

    private static SharedPreferences getPrefs(Context context) {
        return context.getSharedPreferences("tracking_condition_store", 0);
    }

    private String getUniqueKey() {
        return name().toLowerCase(Locale.ENGLISH);
    }

    public void clear(Context context) {
        String uniqueKey = getUniqueKey();
        SharedPreferences prefs = getPrefs(context);
        SharedPreferences.Editor edit = prefs.edit();
        for (String next : prefs.getAll().keySet()) {
            if (next.startsWith(uniqueKey)) {
                edit.remove(next);
            }
        }
        edit.apply();
    }

    public boolean isValid(Context context) {
        String uniqueKey = getUniqueKey();
        return this.condition.mo51787d(getPrefs(context), uniqueKey);
    }

    public void mark(Context context) {
        String uniqueKey = getUniqueKey();
        SharedPreferences prefs = getPrefs(context);
        SharedPreferences.Editor edit = prefs.edit();
        this.condition.mo51788e(prefs, edit, uniqueKey);
        edit.apply();
    }
}
