package fi0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import ei0.C23314a;
import java.util.Arrays;
import java.util.List;
import p648me.leolin.shortcutbadger.ShortcutBadgeException;

/* renamed from: fi0.g */
public final class C23395g implements C23314a {
    /* renamed from: a */
    public final List<String> mo58444a() {
        return Arrays.asList(new String[]{"com.vivo.launcher"});
    }

    /* renamed from: b */
    public final void mo58445b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i);
        context.sendBroadcast(intent);
    }
}
