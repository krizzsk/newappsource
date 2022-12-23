package p909xe;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p988j$.time.ZoneOffset;
import p988j$.time.format.DateTimeFormatter;
import p988j$.util.DateRetargetClass;

/* renamed from: xe.g */
public final class C20470g {

    /* renamed from: a */
    public final SharedPreferences f51839a;

    public C20470g(Context context, String str) {
        this.f51839a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    /* renamed from: a */
    public final synchronized void mo52660a() {
        long j = this.f51839a.getLong("fire-count", 0);
        String str = null;
        String str2 = "";
        for (Map.Entry next : this.f51839a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String str3 : (Set) next.getValue()) {
                    if (str == null || str.compareTo(str3) > 0) {
                        str2 = (String) next.getKey();
                        str = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f51839a.getStringSet(str2, new HashSet()));
        hashSet.remove(str);
        this.f51839a.edit().putStringSet(str2, hashSet).putLong("fire-count", j - 1).commit();
    }

    /* renamed from: b */
    public final synchronized void mo52661b() {
        SharedPreferences.Editor edit = this.f51839a.edit();
        for (Map.Entry next : this.f51839a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                edit.remove((String) next.getKey());
            }
        }
        edit.remove("fire-count");
        edit.commit();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: c */
    public final synchronized java.util.ArrayList mo52662c() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x005c }
            r0.<init>()     // Catch:{ all -> 0x005c }
            android.content.SharedPreferences r1 = r5.f51839a     // Catch:{ all -> 0x005c }
            java.util.Map r1 = r1.getAll()     // Catch:{ all -> 0x005c }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x005c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x005c }
        L_0x0014:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x005c }
            if (r2 == 0) goto L_0x0042
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x005c }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x005c }
            java.lang.Object r3 = r2.getValue()     // Catch:{ all -> 0x005c }
            boolean r3 = r3 instanceof java.util.Set     // Catch:{ all -> 0x005c }
            if (r3 == 0) goto L_0x0014
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x005c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x005c }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x005c }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x005c }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x005c }
            r4.<init>(r2)     // Catch:{ all -> 0x005c }
            xe.a r2 = new xe.a     // Catch:{ all -> 0x005c }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x005c }
            r0.add(r2)     // Catch:{ all -> 0x005c }
            goto L_0x0014
        L_0x0042:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x005c }
            monitor-enter(r5)     // Catch:{ all -> 0x005c }
            android.content.SharedPreferences r3 = r5.f51839a     // Catch:{ all -> 0x0059 }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = "fire-global"
            android.content.SharedPreferences$Editor r1 = r3.putLong(r4, r1)     // Catch:{ all -> 0x0059 }
            r1.commit()     // Catch:{ all -> 0x0059 }
            monitor-exit(r5)     // Catch:{ all -> 0x005c }
            monitor-exit(r5)
            return r0
        L_0x0059:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p909xe.C20470g.mo52662c():java.util.ArrayList");
    }

    /* renamed from: d */
    public final synchronized String mo52663d(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return DateRetargetClass.toInstant(new Date(j)).atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    /* renamed from: e */
    public final synchronized String mo52664e(String str) {
        for (Map.Entry next : this.f51839a.getAll().entrySet()) {
            if (next.getValue() instanceof Set) {
                for (String equals : (Set) next.getValue()) {
                    if (str.equals(equals)) {
                        return (String) next.getKey();
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo52665f(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = r4.mo52664e(r5)     // Catch:{ all -> 0x003f }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r4)
            return
        L_0x0009:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences r2 = r4.f51839a     // Catch:{ all -> 0x003f }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x003f }
            r3.<init>()     // Catch:{ all -> 0x003f }
            java.util.Set r2 = r2.getStringSet(r0, r3)     // Catch:{ all -> 0x003f }
            r1.<init>(r2)     // Catch:{ all -> 0x003f }
            r1.remove(r5)     // Catch:{ all -> 0x003f }
            boolean r5 = r1.isEmpty()     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0030
            android.content.SharedPreferences r5 = r4.f51839a     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.remove(r0)     // Catch:{ all -> 0x003f }
            r5.commit()     // Catch:{ all -> 0x003f }
            goto L_0x003d
        L_0x0030:
            android.content.SharedPreferences r5 = r4.f51839a     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.edit()     // Catch:{ all -> 0x003f }
            android.content.SharedPreferences$Editor r5 = r5.putStringSet(r0, r1)     // Catch:{ all -> 0x003f }
            r5.commit()     // Catch:{ all -> 0x003f }
        L_0x003d:
            monitor-exit(r4)
            return
        L_0x003f:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p909xe.C20470g.mo52665f(java.lang.String):void");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: g */
    public final synchronized boolean mo52666g(long r6) {
        /*
            r5 = this;
            java.lang.String r0 = "fire-global"
            monitor-enter(r5)
            android.content.SharedPreferences r1 = r5.f51839a     // Catch:{ all -> 0x0048 }
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x0048 }
            r2 = 1
            if (r1 == 0) goto L_0x0039
            android.content.SharedPreferences r1 = r5.f51839a     // Catch:{ all -> 0x0048 }
            r3 = -1
            long r3 = r1.getLong(r0, r3)     // Catch:{ all -> 0x0048 }
            monitor-enter(r5)     // Catch:{ all -> 0x0048 }
            java.lang.String r1 = r5.mo52663d(r3)     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = r5.mo52663d(r6)     // Catch:{ all -> 0x0036 }
            boolean r1 = r1.equals(r3)     // Catch:{ all -> 0x0036 }
            monitor-exit(r5)     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0033
            android.content.SharedPreferences r1 = r5.f51839a     // Catch:{ all -> 0x0048 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0048 }
            android.content.SharedPreferences$Editor r6 = r1.putLong(r0, r6)     // Catch:{ all -> 0x0048 }
            r6.commit()     // Catch:{ all -> 0x0048 }
            monitor-exit(r5)
            return r2
        L_0x0033:
            r6 = 0
            monitor-exit(r5)
            return r6
        L_0x0036:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0048 }
            throw r6     // Catch:{ all -> 0x0048 }
        L_0x0039:
            android.content.SharedPreferences r1 = r5.f51839a     // Catch:{ all -> 0x0048 }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x0048 }
            android.content.SharedPreferences$Editor r6 = r1.putLong(r0, r6)     // Catch:{ all -> 0x0048 }
            r6.commit()     // Catch:{ all -> 0x0048 }
            monitor-exit(r5)
            return r2
        L_0x0048:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p909xe.C20470g.mo52666g(long):boolean");
    }

    /* renamed from: h */
    public final synchronized void mo52667h(long j, String str) {
        String d = mo52663d(j);
        if (!this.f51839a.getString("last-used-date", "").equals(d)) {
            long j2 = this.f51839a.getLong("fire-count", 0);
            if (j2 + 1 == 30) {
                mo52660a();
                j2 = this.f51839a.getLong("fire-count", 0);
            }
            HashSet hashSet = new HashSet(this.f51839a.getStringSet(str, new HashSet()));
            hashSet.add(d);
            this.f51839a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", d).commit();
        }
    }
}
