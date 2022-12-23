package p648me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import ei0.C23314a;
import gi0.C23421a;
import java.util.Arrays;
import java.util.List;
import p648me.leolin.shortcutbadger.ShortcutBadgeException;

/* renamed from: me.leolin.shortcutbadger.impl.AdwHomeBadger */
public class AdwHomeBadger implements C23314a {
    /* renamed from: a */
    public final List<String> mo58444a() {
        return Arrays.asList(new String[]{"org.adw.launcher", "org.adwfreak.launcher"});
    }

    /* renamed from: b */
    public final void mo58445b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", componentName.getPackageName());
        intent.putExtra("CNAME", componentName.getClassName());
        intent.putExtra("COUNT", i);
        C23421a.m57550c(context, intent);
    }
}
