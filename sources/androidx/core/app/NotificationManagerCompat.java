package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p001a0.C0016g;
import p031c.C1748a;
import p067e1.C4512r;
import p067e1.C4513s;
import p358af.C13437d;

public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    private static String sEnabledNotificationListeners;
    private static final Object sEnabledNotificationListenersLock = new Object();
    private static final Object sLock = new Object();
    private static C0767c sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;

    /* renamed from: androidx.core.app.NotificationManagerCompat$a */
    public static class C0765a implements C0769d {

        /* renamed from: a */
        public final String f3314a;

        /* renamed from: b */
        public final int f3315b;

        /* renamed from: c */
        public final String f3316c;

        /* renamed from: d */
        public final Notification f3317d;

        public C0765a(int i, Notification notification, String str, String str2) {
            this.f3314a = str;
            this.f3315b = i;
            this.f3316c = str2;
            this.f3317d = notification;
        }

        /* renamed from: a */
        public final void mo3408a(C1748a aVar) throws RemoteException {
            String str = this.f3314a;
            aVar.mo6508D(this.f3315b, this.f3317d, str, this.f3316c);
        }

        public final String toString() {
            StringBuilder n = C13437d.m33708n("NotifyTask[", "packageName:");
            n.append(this.f3314a);
            n.append(", id:");
            n.append(this.f3315b);
            n.append(", tag:");
            return C0016g.m31o(n, this.f3316c, "]");
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$b */
    public static class C0766b {

        /* renamed from: a */
        public final ComponentName f3318a;

        /* renamed from: b */
        public final IBinder f3319b;

        public C0766b(ComponentName componentName, IBinder iBinder) {
            this.f3318a = componentName;
            this.f3319b = iBinder;
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$c */
    public static class C0767c implements Handler.Callback, ServiceConnection {

        /* renamed from: b */
        public final Context f3320b;

        /* renamed from: c */
        public final Handler f3321c;

        /* renamed from: d */
        public final HashMap f3322d = new HashMap();

        /* renamed from: e */
        public Set<String> f3323e = new HashSet();

        /* renamed from: androidx.core.app.NotificationManagerCompat$c$a */
        public static class C0768a {

            /* renamed from: a */
            public final ComponentName f3324a;

            /* renamed from: b */
            public boolean f3325b = false;

            /* renamed from: c */
            public C1748a f3326c;

            /* renamed from: d */
            public ArrayDeque<C0769d> f3327d = new ArrayDeque<>();

            /* renamed from: e */
            public int f3328e = 0;

            public C0768a(ComponentName componentName) {
                this.f3324a = componentName;
            }
        }

        public C0767c(Context context) {
            this.f3320b = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.f3321c = new Handler(handlerThread.getLooper(), this);
        }

        /* renamed from: a */
        public final void mo3410a(C0768a aVar) {
            boolean z;
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Objects.toString(aVar.f3324a);
                aVar.f3327d.size();
            }
            if (!aVar.f3327d.isEmpty()) {
                if (aVar.f3325b) {
                    z = true;
                } else {
                    boolean bindService = this.f3320b.bindService(new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(aVar.f3324a), this, 33);
                    aVar.f3325b = bindService;
                    if (bindService) {
                        aVar.f3328e = 0;
                    } else {
                        Objects.toString(aVar.f3324a);
                        this.f3320b.unbindService(this);
                    }
                    z = aVar.f3325b;
                }
                if (!z || aVar.f3326c == null) {
                    mo3411b(aVar);
                    return;
                }
                while (true) {
                    C0769d peek = aVar.f3327d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            peek.toString();
                        }
                        peek.mo3408a(aVar.f3326c);
                        aVar.f3327d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                            Objects.toString(aVar.f3324a);
                        }
                    } catch (RemoteException unused2) {
                        Objects.toString(aVar.f3324a);
                    }
                }
                if (!aVar.f3327d.isEmpty()) {
                    mo3411b(aVar);
                }
            }
        }

        /* renamed from: b */
        public final void mo3411b(C0768a aVar) {
            if (!this.f3321c.hasMessages(3, aVar.f3324a)) {
                int i = aVar.f3328e + 1;
                aVar.f3328e = i;
                if (i > 6) {
                    aVar.f3327d.size();
                    Objects.toString(aVar.f3324a);
                    aVar.f3327d.clear();
                    return;
                }
                this.f3321c.sendMessageDelayed(this.f3321c.obtainMessage(3, aVar.f3324a), (long) ((1 << (i - 1)) * 1000));
            }
        }

        public final boolean handleMessage(Message message) {
            int i = message.what;
            C1748a aVar = null;
            if (i == 0) {
                C0769d dVar = (C0769d) message.obj;
                Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(this.f3320b);
                if (!enabledListenerPackages.equals(this.f3323e)) {
                    this.f3323e = enabledListenerPackages;
                    List<ResolveInfo> queryIntentServices = this.f3320b.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
                    HashSet hashSet = new HashSet();
                    for (ResolveInfo next : queryIntentServices) {
                        if (enabledListenerPackages.contains(next.serviceInfo.packageName)) {
                            ServiceInfo serviceInfo = next.serviceInfo;
                            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                            if (next.serviceInfo.permission != null) {
                                componentName.toString();
                            } else {
                                hashSet.add(componentName);
                            }
                        }
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ComponentName componentName2 = (ComponentName) it.next();
                        if (!this.f3322d.containsKey(componentName2)) {
                            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                                Objects.toString(componentName2);
                            }
                            this.f3322d.put(componentName2, new C0768a(componentName2));
                        }
                    }
                    Iterator it2 = this.f3322d.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        if (!hashSet.contains(entry.getKey())) {
                            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                                Objects.toString(entry.getKey());
                            }
                            C0768a aVar2 = (C0768a) entry.getValue();
                            if (aVar2.f3325b) {
                                this.f3320b.unbindService(this);
                                aVar2.f3325b = false;
                            }
                            aVar2.f3326c = null;
                            it2.remove();
                        }
                    }
                }
                for (C0768a aVar3 : this.f3322d.values()) {
                    aVar3.f3327d.add(dVar);
                    mo3410a(aVar3);
                }
                return true;
            } else if (i == 1) {
                C0766b bVar = (C0766b) message.obj;
                ComponentName componentName3 = bVar.f3318a;
                IBinder iBinder = bVar.f3319b;
                C0768a aVar4 = (C0768a) this.f3322d.get(componentName3);
                if (aVar4 != null) {
                    int i2 = C1748a.C1749a.f6139b;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof C1748a)) {
                            aVar = new C1748a.C1749a.C1750a(iBinder);
                        } else {
                            aVar = (C1748a) queryLocalInterface;
                        }
                    }
                    aVar4.f3326c = aVar;
                    aVar4.f3328e = 0;
                    mo3410a(aVar4);
                }
                return true;
            } else if (i == 2) {
                C0768a aVar5 = (C0768a) this.f3322d.get((ComponentName) message.obj);
                if (aVar5 != null) {
                    if (aVar5.f3325b) {
                        this.f3320b.unbindService(this);
                        aVar5.f3325b = false;
                    }
                    aVar5.f3326c = null;
                }
                return true;
            } else if (i != 3) {
                return false;
            } else {
                C0768a aVar6 = (C0768a) this.f3322d.get((ComponentName) message.obj);
                if (aVar6 != null) {
                    mo3410a(aVar6);
                }
                return true;
            }
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Objects.toString(componentName);
            }
            this.f3321c.obtainMessage(1, new C0766b(componentName, iBinder)).sendToTarget();
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Objects.toString(componentName);
            }
            this.f3321c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* renamed from: androidx.core.app.NotificationManagerCompat$d */
    public interface C0769d {
        /* renamed from: a */
        void mo3408a(C1748a aVar) throws RemoteException;
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) context.getSystemService("notification");
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string != null) {
                if (!string.equals(sEnabledNotificationListeners)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    sEnabledNotificationListenerPackages = hashSet;
                    sEnabledNotificationListeners = string;
                }
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    private void pushSideChannelQueue(C0769d dVar) {
        synchronized (sLock) {
            if (sSideChannelManager == null) {
                sSideChannelManager = new C0767c(this.mContext.getApplicationContext());
            }
            sSideChannelManager.f3321c.obtainMessage(0, dVar).sendToTarget();
        }
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean(EXTRA_USE_SIDE_CHANNEL)) {
            return false;
        }
        return true;
    }

    public boolean areNotificationsEnabled() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.mNotificationManager.areNotificationsEnabled();
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.mContext.getSystemService("appops");
        ApplicationInfo applicationInfo = this.mContext.getApplicationInfo();
        String packageName = this.mContext.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class cls2 = Integer.TYPE;
            if (((Integer) cls.getMethod(CHECK_OP_NO_THROW, new Class[]{cls2, cls2, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) cls.getDeclaredField(OP_POST_NOTIFICATION).get(Integer.class)).intValue()), Integer.valueOf(i), packageName})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void cancel(int i) {
        cancel((String) null, i);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }

    public void createNotificationChannel(NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannelGroups(list);
        }
    }

    public void createNotificationChannelGroupsCompat(List<C4513s> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C4513s b : list) {
                arrayList.add(b.mo20028b());
            }
            this.mNotificationManager.createNotificationChannelGroups(arrayList);
        }
    }

    public void createNotificationChannels(List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.createNotificationChannels(list);
        }
    }

    public void createNotificationChannelsCompat(List<C4512r> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C4512r a : list) {
                arrayList.add(a.mo20026a());
            }
            this.mNotificationManager.createNotificationChannels(arrayList);
        }
    }

    public void deleteNotificationChannel(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.deleteNotificationChannel(str);
        }
    }

    public void deleteNotificationChannelGroup(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mNotificationManager.deleteNotificationChannelGroup(str);
        }
    }

    public void deleteUnlistedNotificationChannels(Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (NotificationChannel next : this.mNotificationManager.getNotificationChannels()) {
                if (!collection.contains(next.getId()) && (Build.VERSION.SDK_INT < 30 || !collection.contains(next.getParentChannelId()))) {
                    this.mNotificationManager.deleteNotificationChannel(next.getId());
                }
            }
        }
    }

    public int getImportance() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.mNotificationManager.getImportance();
        }
        return IMPORTANCE_UNSPECIFIED;
    }

    public NotificationChannel getNotificationChannel(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.mNotificationManager.getNotificationChannel(str);
        }
        return null;
    }

    public C4512r getNotificationChannelCompat(String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str)) == null) {
            return null;
        }
        return new C4512r(notificationChannel);
    }

    public NotificationChannelGroup getNotificationChannelGroup(String str) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return this.mNotificationManager.getNotificationChannelGroup(str);
        }
        if (i >= 26) {
            for (NotificationChannelGroup next : getNotificationChannelGroups()) {
                if (next.getId().equals(str)) {
                    return next;
                }
            }
        }
        return null;
    }

    public C4513s getNotificationChannelGroupCompat(String str) {
        NotificationChannelGroup notificationChannelGroup;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
            if (notificationChannelGroup2 != null) {
                return new C4513s(notificationChannelGroup2);
            }
            return null;
        } else if (i < 26 || (notificationChannelGroup = getNotificationChannelGroup(str)) == null) {
            return null;
        } else {
            return new C4513s(notificationChannelGroup, getNotificationChannels());
        }
    }

    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.mNotificationManager.getNotificationChannelGroups();
        }
        return Collections.emptyList();
    }

    public List<C4513s> getNotificationChannelGroupsCompat() {
        List<NotificationChannel> list;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
            if (!notificationChannelGroups.isEmpty()) {
                if (i >= 28) {
                    list = Collections.emptyList();
                } else {
                    list = getNotificationChannels();
                }
                ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
                for (NotificationChannelGroup next : notificationChannelGroups) {
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new C4513s(next));
                    } else {
                        arrayList.add(new C4513s(next, list));
                    }
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    public List<NotificationChannel> getNotificationChannels() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.mNotificationManager.getNotificationChannels();
        }
        return Collections.emptyList();
    }

    public List<C4512r> getNotificationChannelsCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> notificationChannels = getNotificationChannels();
            if (!notificationChannels.isEmpty()) {
                ArrayList arrayList = new ArrayList(notificationChannels.size());
                for (NotificationChannel rVar : notificationChannels) {
                    arrayList.add(new C4512r(rVar));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    public void notify(int i, Notification notification) {
        notify((String) null, i, notification);
    }

    public void cancel(String str, int i) {
        this.mNotificationManager.cancel(str, i);
    }

    public void notify(String str, int i, Notification notification) {
        if (useSideChannelForNotification(notification)) {
            pushSideChannelQueue(new C0765a(i, notification, this.mContext.getPackageName(), str));
            this.mNotificationManager.cancel(str, i);
            return;
        }
        this.mNotificationManager.notify(str, i, notification);
    }

    public void createNotificationChannel(C4512r rVar) {
        createNotificationChannel(rVar.mo20026a());
    }

    public void createNotificationChannelGroup(C4513s sVar) {
        createNotificationChannelGroup(sVar.mo20028b());
    }

    public NotificationChannel getNotificationChannel(String str, String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return this.mNotificationManager.getNotificationChannel(str, str2);
        }
        return getNotificationChannel(str);
    }

    public C4512r getNotificationChannelCompat(String str, String str2) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str, str2)) == null) {
            return null;
        }
        return new C4512r(notificationChannel);
    }
}
