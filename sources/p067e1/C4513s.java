package p067e1;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: e1.s */
public final class C4513s {

    /* renamed from: a */
    public final String f15601a;

    /* renamed from: b */
    public CharSequence f15602b;

    /* renamed from: c */
    public String f15603c;

    /* renamed from: d */
    public List<C4512r> f15604d;

    public C4513s(NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    /* renamed from: a */
    public final ArrayList mo20027a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            NotificationChannel notificationChannel = (NotificationChannel) it.next();
            if (this.f15601a.equals(notificationChannel.getGroup())) {
                arrayList.add(new C4512r(notificationChannel));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final NotificationChannelGroup mo20028b() {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return null;
        }
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(this.f15601a, this.f15602b);
        if (i >= 28) {
            notificationChannelGroup.setDescription(this.f15603c);
        }
        return notificationChannelGroup;
    }

    public C4513s(NotificationChannelGroup notificationChannelGroup, List<NotificationChannel> list) {
        String id = notificationChannelGroup.getId();
        this.f15604d = Collections.emptyList();
        id.getClass();
        this.f15601a = id;
        this.f15602b = notificationChannelGroup.getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            this.f15603c = notificationChannelGroup.getDescription();
        }
        if (i >= 28) {
            notificationChannelGroup.isBlocked();
            this.f15604d = mo20027a(notificationChannelGroup.getChannels());
            return;
        }
        this.f15604d = mo20027a(list);
    }
}
