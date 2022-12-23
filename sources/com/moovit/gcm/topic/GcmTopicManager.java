package com.moovit.gcm.topic;

import android.content.Context;
import androidx.work.C1388b;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import c00.C13723g;
import com.google.android.gms.common.GoogleApiAvailability;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.network.model.ServerId;
import f10.C16935f;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import l10.C18167a;
import p081f3.C4648b;
import p081f3.C4658i;
import p092g3.C4763k;
import p435de.C16596f;
import p824tp.C19746x;
import p977zz.C20964s0;

public class GcmTopicManager extends Worker {

    /* renamed from: b */
    public static final String f41617b;

    /* renamed from: c */
    public static final String f41618c;

    /* renamed from: d */
    public static final String f41619d;

    /* renamed from: e */
    public static final String f41620e;

    static {
        String name = GcmTopicManager.class.getName();
        f41617b = C25541a.m63881k(C25541a.m63881k(name, ".action"), ".metro_subscription");
        String k = C25541a.m63881k(name, ".extra");
        f41618c = C25541a.m63881k(k, ".action");
        f41619d = C25541a.m63881k(k, ".metro_id");
        f41620e = C25541a.m63881k(k, ".user_percentage_bucket");
    }

    public GcmTopicManager(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* renamed from: a */
    public static void m40721a(Context context, ServerId serverId, int i) {
        int i2;
        HashMap hashMap = new HashMap();
        String str = f41618c;
        String str2 = f41617b;
        hashMap.put(str, str2);
        hashMap.put(f41619d, serverId.mo19751c());
        hashMap.put(f41620e, Integer.valueOf(i));
        C1388b bVar = new C1388b(hashMap);
        C1388b.m3716c(bVar);
        if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
            if (C16935f.m42760c(context)) {
                i2 = 0;
            } else {
                i2 = 20;
            }
            C4648b.C4649a aVar = new C4648b.C4649a();
            aVar.f15887c = NetworkType.CONNECTED;
            C4648b bVar2 = new C4648b(aVar);
            C4763k.m12079g(context).mo20186b(str2, ExistingWorkPolicy.REPLACE, (C4658i) ((C4658i.C4659a) ((C4658i.C4659a) ((C4658i.C4659a) ((C4658i.C4659a) new C4658i.C4659a(GcmTopicManager.class).mo20189a(str2)).mo20192f(bVar2)).mo20194h(bVar)).mo20193g((long) i2, TimeUnit.SECONDS)).mo20190b());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r1 = p435de.C16596f.m42113a();
        r1.mo49363b("Topic: " + r6);
        r1.mo49364c(new com.moovit.commons.utils.ApplicationBugException("GCM topic subscribe failed", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo48130b(java.lang.String r6) {
        /*
            r5 = this;
            com.google.firebase.messaging.FirebaseMessaging r0 = com.google.firebase.messaging.FirebaseMessaging.getInstance()     // Catch:{ Exception -> 0x0030 }
            r0.subscribeToTopic(r6)     // Catch:{ Exception -> 0x0030 }
            android.content.Context r0 = r5.getApplicationContext()     // Catch:{ Exception -> 0x0030 }
            f00.g$i r1 = f10.C16935f.f43949a     // Catch:{ Exception -> 0x0030 }
            java.lang.Class<f10.f> r1 = f10.C16935f.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x0030 }
            android.content.SharedPreferences r0 = f10.C16935f.m42758a(r0)     // Catch:{ all -> 0x002d }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x002d }
            f00.g$j r3 = f10.C16935f.f43951c     // Catch:{ all -> 0x002d }
            java.lang.Object r4 = r3.mo19759a(r0)     // Catch:{ all -> 0x002d }
            java.util.Collection r4 = (java.util.Collection) r4     // Catch:{ all -> 0x002d }
            r2.<init>(r4)     // Catch:{ all -> 0x002d }
            boolean r4 = r2.add(r6)     // Catch:{ all -> 0x002d }
            if (r4 == 0) goto L_0x002a
            r3.mo49545d(r0, r2)     // Catch:{ all -> 0x002d }
        L_0x002a:
            monitor-exit(r1)     // Catch:{ Exception -> 0x0030 }
            r6 = 1
            return r6
        L_0x002d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x0030 }
            throw r0     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            de.f r1 = p435de.C16596f.m42113a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Topic: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.mo49363b(r6)
            com.moovit.commons.utils.ApplicationBugException r6 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r2 = "GCM topic subscribe failed"
            r6.<init>(r2, r0)
            r1.mo49364c(r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.gcm.topic.GcmTopicManager.mo48130b(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r1 = p435de.C16596f.m42113a();
        r1.mo49363b("Topic: " + r6);
        r1.mo49364c(new com.moovit.commons.utils.ApplicationBugException("GCM topic unsubscribe failed", r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        return false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo48131d(java.lang.String r6) {
        /*
            r5 = this;
            com.google.firebase.messaging.FirebaseMessaging r0 = com.google.firebase.messaging.FirebaseMessaging.getInstance()     // Catch:{ Exception -> 0x0030 }
            r0.unsubscribeFromTopic(r6)     // Catch:{ Exception -> 0x0030 }
            android.content.Context r0 = r5.getApplicationContext()     // Catch:{ Exception -> 0x0030 }
            f00.g$i r1 = f10.C16935f.f43949a     // Catch:{ Exception -> 0x0030 }
            java.lang.Class<f10.f> r1 = f10.C16935f.class
            monitor-enter(r1)     // Catch:{ Exception -> 0x0030 }
            android.content.SharedPreferences r0 = f10.C16935f.m42758a(r0)     // Catch:{ all -> 0x002d }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x002d }
            f00.g$j r3 = f10.C16935f.f43951c     // Catch:{ all -> 0x002d }
            java.lang.Object r4 = r3.mo19759a(r0)     // Catch:{ all -> 0x002d }
            java.util.Collection r4 = (java.util.Collection) r4     // Catch:{ all -> 0x002d }
            r2.<init>(r4)     // Catch:{ all -> 0x002d }
            boolean r4 = r2.remove(r6)     // Catch:{ all -> 0x002d }
            if (r4 == 0) goto L_0x002a
            r3.mo49545d(r0, r2)     // Catch:{ all -> 0x002d }
        L_0x002a:
            monitor-exit(r1)     // Catch:{ Exception -> 0x0030 }
            r6 = 1
            return r6
        L_0x002d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x0030 }
            throw r0     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            de.f r1 = p435de.C16596f.m42113a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Topic: "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.mo49363b(r6)
            com.moovit.commons.utils.ApplicationBugException r6 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r2 = "GCM topic unsubscribe failed"
            r6.<init>(r2, r0)
            r1.mo49364c(r6)
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.gcm.topic.GcmTopicManager.mo48131d(java.lang.String):boolean");
    }

    public final ListenableWorker.C1379a doWork() {
        int i;
        Set unmodifiableSet;
        boolean booleanValue;
        if (C20964s0.m49090h(C16935f.m42759b(getApplicationContext()))) {
            return new ListenableWorker.C1379a.C1381b();
        }
        C1388b inputData = getInputData();
        if (!f41617b.equals(inputData.mo5691b(f41618c))) {
            return new ListenableWorker.C1379a.C1380a();
        }
        Class<C16935f> cls = C16935f.class;
        String b = inputData.mo5691b(f41619d);
        if (b == null) {
            C16596f.m42113a().mo49364c(new ApplicationBugException("GCM topic manager trying to perform metro subscription task without metro id"));
            return new ListenableWorker.C1379a.C1380a();
        }
        Object obj = inputData.f5152a.get(f41620e);
        if (obj instanceof Integer) {
            i = ((Integer) obj).intValue();
        } else {
            i = -1;
        }
        if (i == -1) {
            C16596f.m42113a().mo49364c(new ApplicationBugException("Trying to perform metro subscription task without user percentage bucket"));
            return new ListenableWorker.C1379a.C1380a();
        }
        Context applicationContext = getApplicationContext();
        ServerId b2 = ServerId.m11392b(b);
        synchronized (cls) {
            unmodifiableSet = Collections.unmodifiableSet((Set) C16935f.f43951c.mo19759a(C16935f.m42758a(applicationContext)));
        }
        Set set = (Set) C13723g.m34283d(unmodifiableSet, new HashSet(), C18167a.f46401b);
        synchronized (cls) {
            booleanValue = C16935f.f43952d.mo19759a(C16935f.m42758a(applicationContext)).booleanValue();
        }
        Locale locale = Locale.ENGLISH;
        String format = String.format(locale, "/topics/android-metro-%s-percentage-%d-system", new Object[]{b2.mo19751c(), Integer.valueOf(i)});
        String format2 = String.format(locale, "/topics/android-metro-%s-info-lang-%s", new Object[]{b2.mo19751c(), applicationContext.getString(C19746x.lang_id)});
        HashSet hashSet = new HashSet(set);
        hashSet.remove(format);
        hashSet.remove(format2);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (!mo48131d((String) it.next())) {
                return new ListenableWorker.C1379a.C1381b();
            }
        }
        if (!set.contains(format) && !mo48130b(format)) {
            return new ListenableWorker.C1379a.C1381b();
        }
        if (booleanValue && !set.contains(format2) && !mo48130b(format2)) {
            return new ListenableWorker.C1379a.C1381b();
        }
        if (booleanValue || !set.contains(format2) || mo48131d(format2)) {
            return new ListenableWorker.C1379a.C1382c();
        }
        return new ListenableWorker.C1379a.C1381b();
    }
}
