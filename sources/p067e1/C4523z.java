package p067e1;

import android.app.Notification$DecoratedCustomViewStyle;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import p055d1.C4326b;
import p055d1.C4329e;
import p055d1.C4331g;

/* renamed from: e1.z */
public final class C4523z extends C4471a0 {
    /* renamed from: a */
    public final RemoteViews mo20039a(RemoteViews remoteViews, boolean z) {
        ArrayList arrayList;
        int min;
        boolean z2;
        int i;
        boolean z3 = true;
        int i2 = 0;
        RemoteViews applyStandardTemplate = applyStandardTemplate(true, C4331g.notification_template_custom_big, false);
        applyStandardTemplate.removeAllViews(C4329e.actions);
        ArrayList<C4514t> arrayList2 = this.mBuilder.f15621b;
        if (arrayList2 == null) {
            arrayList = null;
        } else {
            ArrayList arrayList3 = new ArrayList();
            Iterator<C4514t> it = arrayList2.iterator();
            while (it.hasNext()) {
                C4514t next = it.next();
                if (!next.f15611g) {
                    arrayList3.add(next);
                }
            }
            arrayList = arrayList3;
        }
        if (!z || arrayList == null || (min = Math.min(arrayList.size(), 3)) <= 0) {
            z3 = false;
        } else {
            for (int i3 = 0; i3 < min; i3++) {
                C4514t tVar = (C4514t) arrayList.get(i3);
                if (tVar.f15614j == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String packageName = this.mBuilder.f15620a.getPackageName();
                if (z2) {
                    i = C4331g.notification_action_tombstone;
                } else {
                    i = C4331g.notification_action;
                }
                RemoteViews remoteViews2 = new RemoteViews(packageName, i);
                IconCompat a = tVar.mo20029a();
                if (a != null) {
                    remoteViews2.setImageViewBitmap(C4329e.action_image, createColoredBitmap(a, this.mBuilder.f15620a.getResources().getColor(C4326b.notification_action_color_filter)));
                }
                remoteViews2.setTextViewText(C4329e.action_text, tVar.f15613i);
                if (!z2) {
                    remoteViews2.setOnClickPendingIntent(C4329e.action_container, tVar.f15614j);
                }
                remoteViews2.setContentDescription(C4329e.action_container, tVar.f15613i);
                applyStandardTemplate.addView(C4329e.actions, remoteViews2);
            }
        }
        if (!z3) {
            i2 = 8;
        }
        applyStandardTemplate.setViewVisibility(C4329e.actions, i2);
        applyStandardTemplate.setViewVisibility(C4329e.action_divider, i2);
        buildIntoRemoteViews(applyStandardTemplate, remoteViews);
        return applyStandardTemplate;
    }

    public final void apply(C4508n nVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            ((C4480d0) nVar).f15541b.setStyle(new Notification$DecoratedCustomViewStyle());
        }
    }

    public final String getClassName() {
        return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
    }

    public final RemoteViews makeBigContentView(C4508n nVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        C4522y yVar = this.mBuilder;
        RemoteViews remoteViews = yVar.f15640u;
        if (remoteViews == null) {
            remoteViews = yVar.f15639t;
        }
        if (remoteViews == null) {
            return null;
        }
        return mo20039a(remoteViews, true);
    }

    public final RemoteViews makeContentView(C4508n nVar) {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT < 24 && (remoteViews = this.mBuilder.f15639t) != null) {
            return mo20039a(remoteViews, false);
        }
        return null;
    }

    public final RemoteViews makeHeadsUpContentView(C4508n nVar) {
        RemoteViews remoteViews;
        if (Build.VERSION.SDK_INT >= 24) {
            return null;
        }
        C4522y yVar = this.mBuilder;
        RemoteViews remoteViews2 = yVar.f15641v;
        if (remoteViews2 != null) {
            remoteViews = remoteViews2;
        } else {
            remoteViews = yVar.f15639t;
        }
        if (remoteViews2 == null) {
            return null;
        }
        return mo20039a(remoteViews, true);
    }
}
