package ei0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.moovit.database.sqlite.SQLiteDatabase;
import fi0.C23389a;
import fi0.C23390b;
import fi0.C23391c;
import fi0.C23392d;
import fi0.C23393e;
import fi0.C23395g;
import fi0.C23396h;
import fi0.C23397i;
import java.util.Iterator;
import java.util.LinkedList;
import p648me.leolin.shortcutbadger.ShortcutBadgeException;
import p648me.leolin.shortcutbadger.impl.AdwHomeBadger;
import p648me.leolin.shortcutbadger.impl.ApexHomeBadger;
import p648me.leolin.shortcutbadger.impl.DefaultBadger;
import p648me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import p648me.leolin.shortcutbadger.impl.NovaHomeBadger;
import p648me.leolin.shortcutbadger.impl.SonyHomeBadger;

/* renamed from: ei0.b */
public final class C23315b {

    /* renamed from: a */
    public static final LinkedList f59112a;

    /* renamed from: b */
    public static C23314a f59113b;

    /* renamed from: c */
    public static ComponentName f59114c;

    static {
        LinkedList linkedList = new LinkedList();
        f59112a = linkedList;
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(DefaultBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(C23389a.class);
        linkedList.add(C23391c.class);
        linkedList.add(C23392d.class);
        linkedList.add(C23393e.class);
        linkedList.add(C23397i.class);
        linkedList.add(C23395g.class);
        linkedList.add(C23396h.class);
        linkedList.add(C23390b.class);
    }

    /* renamed from: a */
    public static void m57413a(int i, Context context) throws ShortcutBadgeException {
        boolean z;
        if (f59113b == null) {
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                context.getPackageName();
                z = false;
            } else {
                f59114c = launchIntentForPackage.getComponent();
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, SQLiteDatabase.OPEN_FULLMUTEX)) {
                    String str = resolveInfo.activityInfo.packageName;
                    Iterator it = f59112a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C23314a aVar = null;
                        try {
                            aVar = (C23314a) ((Class) it.next()).newInstance();
                        } catch (Exception unused) {
                        }
                        if (aVar != null && aVar.mo58444a().contains(str)) {
                            f59113b = aVar;
                            break;
                        }
                    }
                    if (f59113b != null) {
                        break;
                    }
                }
                if (f59113b == null) {
                    String str2 = Build.MANUFACTURER;
                    if (str2.equalsIgnoreCase("ZUK")) {
                        f59113b = new C23397i();
                    } else if (str2.equalsIgnoreCase("OPPO")) {
                        f59113b = new C23392d();
                    } else if (str2.equalsIgnoreCase("VIVO")) {
                        f59113b = new C23395g();
                    } else if (str2.equalsIgnoreCase("ZTE")) {
                        f59113b = new C23396h();
                    } else {
                        f59113b = new DefaultBadger();
                    }
                }
                z = true;
            }
            if (!z) {
                throw new ShortcutBadgeException("No default launcher available");
            }
        }
        try {
            f59113b.mo58445b(context, f59114c, i);
        } catch (Exception e) {
            throw new ShortcutBadgeException("Unable to execute badge", e);
        }
    }
}
