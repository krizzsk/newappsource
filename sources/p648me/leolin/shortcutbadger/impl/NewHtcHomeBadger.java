package p648me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import ei0.C23314a;
import gi0.C23421a;
import java.util.Collections;
import java.util.List;
import p648me.leolin.shortcutbadger.ShortcutBadgeException;

/* renamed from: me.leolin.shortcutbadger.impl.NewHtcHomeBadger */
public class NewHtcHomeBadger implements C23314a {
    /* renamed from: a */
    public final List<String> mo58444a() {
        return Collections.singletonList("com.htc.launcher");
    }

    /* renamed from: b */
    public final void mo58445b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        boolean z;
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i);
        boolean z2 = true;
        try {
            C23421a.m57550c(context, intent);
            z = true;
        } catch (ShortcutBadgeException unused) {
            z = false;
        }
        try {
            C23421a.m57550c(context, intent2);
        } catch (ShortcutBadgeException unused2) {
            z2 = false;
        }
        if (!z && !z2) {
            StringBuilder k = C13555b.m33972k("unable to resolve intent: ");
            k.append(intent2.toString());
            throw new ShortcutBadgeException(k.toString());
        }
    }
}
