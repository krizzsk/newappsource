package gi0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.Collections;
import java.util.List;
import p648me.leolin.shortcutbadger.ShortcutBadgeException;

/* renamed from: gi0.a */
public final class C23421a {
    /* renamed from: a */
    public static List<ResolveInfo> m57548a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers != null) {
            return queryBroadcastReceivers;
        }
        return Collections.emptyList();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018 A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m57549b(android.content.Context r2, android.content.Intent r3) throws p648me.leolin.shortcutbadger.ShortcutBadgeException {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L_0x0015
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r3)
            java.lang.String r1 = "me.leolin.shortcutbadger.BADGE_COUNT_UPDATE"
            r0.setAction(r1)
            m57550c(r2, r0)     // Catch:{ ShortcutBadgeException -> 0x0015 }
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0019
            return
        L_0x0019:
            m57550c(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gi0.C23421a.m57549b(android.content.Context, android.content.Intent):void");
    }

    /* renamed from: c */
    public static void m57550c(Context context, Intent intent) throws ShortcutBadgeException {
        List<ResolveInfo> a = m57548a(context, intent);
        if (a.size() != 0) {
            for (ResolveInfo next : a) {
                Intent intent2 = new Intent(intent);
                if (next != null) {
                    intent2.setPackage(next.resolvePackageName);
                    context.sendBroadcast(intent2);
                }
            }
            return;
        }
        StringBuilder k = C13555b.m33972k("unable to resolve intent: ");
        k.append(intent.toString());
        throw new ShortcutBadgeException(k.toString());
    }
}
