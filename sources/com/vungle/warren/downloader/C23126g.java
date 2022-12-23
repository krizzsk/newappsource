package com.vungle.warren.downloader;

import android.util.Base64;
import ce0.C21105j;
import com.vungle.warren.C23229u;
import com.vungle.warren.VungleLogger;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import p559ii.C17601a;
import p988j$.util.concurrent.ConcurrentHashMap;
import td0.C24927a;

/* renamed from: com.vungle.warren.downloader.g */
public final class C23126g implements C23128i {

    /* renamed from: a */
    public final HashMap<File, Long> f58706a = new HashMap<>();

    /* renamed from: b */
    public final C24927a f58707b;

    /* renamed from: c */
    public final C17601a f58708c;

    /* renamed from: d */
    public final long f58709d;

    /* renamed from: e */
    public final C23229u f58710e;

    /* renamed from: f */
    public final ConcurrentHashMap f58711f = new ConcurrentHashMap();

    /* renamed from: g */
    public final HashSet<File> f58712g = new HashSet<>();

    public C23126g(C24927a aVar, C17601a aVar2, C23229u uVar, long j) {
        this.f58707b = aVar;
        this.f58708c = aVar2;
        this.f58710e = uVar;
        this.f58709d = Math.max(0, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo58180a(java.io.File r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 1
            r1 = 0
            ce0.C21105j.m49397b(r8)     // Catch:{ IOException -> 0x0014 }
            java.io.File r2 = r7.mo58186f(r8)     // Catch:{ IOException -> 0x000f }
            ce0.C21105j.m49397b(r2)     // Catch:{ IOException -> 0x000f }
            monitor-exit(r7)
            return r0
        L_0x000f:
            r2 = move-exception
            r3 = 1
            goto L_0x0016
        L_0x0012:
            r8 = move-exception
            goto L_0x0038
        L_0x0014:
            r2 = move-exception
            r3 = 0
        L_0x0016:
            java.lang.String r4 = "CleverCache#deleteContents; loadAd sequence"
            java.lang.String r5 = "Cannot delete %1$s for file %2$s; Error %3$s occured"
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0012 }
            if (r3 == 0) goto L_0x0022
            java.lang.String r3 = "meta"
            goto L_0x0024
        L_0x0022:
            java.lang.String r3 = "file"
        L_0x0024:
            r6[r1] = r3     // Catch:{ all -> 0x0012 }
            java.lang.String r8 = r8.getPath()     // Catch:{ all -> 0x0012 }
            r6[r0] = r8     // Catch:{ all -> 0x0012 }
            r8 = 2
            r6[r8] = r2     // Catch:{ all -> 0x0012 }
            java.lang.String r8 = java.lang.String.format(r5, r6)     // Catch:{ all -> 0x0012 }
            com.vungle.warren.VungleLogger.m57029b(r4, r8)     // Catch:{ all -> 0x0012 }
            monitor-exit(r7)
            return r1
        L_0x0038:
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.C23126g.mo58180a(java.io.File):boolean");
    }

    /* renamed from: b */
    public final synchronized void mo58181b() {
        C17601a aVar = this.f58708c;
        File a = aVar.mo50073a();
        Serializable serializable = (Serializable) C21105j.m49399d(a);
        if (serializable != null) {
            if (serializable instanceof Collection) {
                ((LinkedHashSet) aVar.f45279d).addAll((Collection) serializable);
            } else {
                C21105j.m49398c(a);
            }
        }
        mo58199s();
        mo58191k();
        mo58198r();
        mo58192l();
    }

    /* renamed from: c */
    public final synchronized File mo58182c(String str) throws IOException {
        File file;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes("UTF-8"));
            file = new File(mo58193m(), Base64.encodeToString(instance.digest(), 10));
            this.f58708c.mo50074b(0, file);
        } catch (UnsupportedEncodingException e) {
            VungleLogger.m57029b("CleverCache#getFile; loadAd sequence", "cannot encode url with charset = UTF-8");
            throw new IOException(e);
        } catch (NoSuchAlgorithmException e2) {
            VungleLogger.m57029b("CleverCache#getFile; loadAd sequence", "cannot get instance of MessageDigest with algorithm SHA-256");
            throw new IOException(e2);
        }
        return file;
    }

    public final synchronized void clear() {
        C17601a aVar = this.f58708c;
        aVar.getClass();
        ArrayList arrayList = new ArrayList((LinkedHashSet) aVar.f45279d);
        int i = 0;
        mo58196p(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file != null) {
                if (!mo58197q(file)) {
                    if (mo58180a(file)) {
                        i++;
                        C17601a aVar2 = this.f58708c;
                        aVar2.getClass();
                        ((LinkedHashSet) aVar2.f45279d).remove(file);
                        this.f58706a.remove(file);
                    }
                }
            }
        }
        if (i > 0) {
            this.f58708c.mo50075c();
            mo58201u();
        }
    }

    /* renamed from: d */
    public final synchronized void mo58184d(File file, long j) {
        this.f58706a.put(file, Long.valueOf(j));
        mo58201u();
    }

    /* renamed from: e */
    public final synchronized void mo58185e(File file, long j) {
        this.f58708c.mo50074b(j, file);
        this.f58708c.mo50075c();
        Objects.toString(file);
        mo58190j();
    }

    /* renamed from: f */
    public final synchronized File mo58186f(File file) {
        File o;
        o = mo58195o();
        return new File(o, file.getName() + ".vng_meta");
    }

    /* renamed from: g */
    public final synchronized void mo58187g(File file) {
        Integer num = (Integer) this.f58711f.get(file);
        if (num == null) {
            this.f58711f.remove(file);
            return;
        }
        if (Integer.valueOf(num.intValue() - 1).intValue() <= 0) {
            this.f58711f.remove(file);
        }
        Objects.toString(file);
    }

    /* renamed from: h */
    public final synchronized void mo58188h(File file) {
        int i;
        Integer num = (Integer) this.f58711f.get(file);
        this.f58708c.mo50074b(0, file);
        this.f58708c.mo50075c();
        if (num != null) {
            if (num.intValue() > 0) {
                i = Integer.valueOf(num.intValue() + 1);
                this.f58711f.put(file, i);
                Objects.toString(file);
            }
        }
        i = 1;
        this.f58711f.put(file, i);
        Objects.toString(file);
    }

    /* renamed from: i */
    public final synchronized boolean mo58189i(File file) {
        if (mo58180a(file)) {
            this.f58706a.remove(file);
            C17601a aVar = this.f58708c;
            aVar.getClass();
            ((LinkedHashSet) aVar.f45279d).remove(file);
            this.f58708c.mo50075c();
            mo58201u();
            this.f58712g.remove(file);
            mo58200t();
            return true;
        }
        this.f58712g.add(file);
        mo58200t();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        return r2;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<java.io.File> mo58190j() {
        /*
            r10 = this;
            monitor-enter(r10)
            r10.mo58192l()     // Catch:{ all -> 0x009e }
            com.vungle.warren.u r0 = r10.f58710e     // Catch:{ all -> 0x009e }
            long r0 = r0.mo58321a()     // Catch:{ all -> 0x009e }
            java.io.File r2 = r10.mo58193m()     // Catch:{ all -> 0x009e }
            long r2 = ce0.C21105j.m49400e(r2)     // Catch:{ all -> 0x009e }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x001c
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x009e }
            monitor-exit(r10)
            return r0
        L_0x001c:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x009e }
            r2.<init>()     // Catch:{ all -> 0x009e }
            ii.a r3 = r10.f58708c     // Catch:{ all -> 0x009e }
            r3.getClass()     // Catch:{ all -> 0x009e }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x009e }
            java.lang.Object r3 = r3.f45279d     // Catch:{ all -> 0x009e }
            java.util.LinkedHashSet r3 = (java.util.LinkedHashSet) r3     // Catch:{ all -> 0x009e }
            r4.<init>(r3)     // Catch:{ all -> 0x009e }
            r10.mo58196p(r4)     // Catch:{ all -> 0x009e }
            java.io.File r3 = r10.mo58193m()     // Catch:{ all -> 0x009e }
            long r5 = ce0.C21105j.m49400e(r3)     // Catch:{ all -> 0x009e }
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x0044
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x009e }
            monitor-exit(r10)
            return r0
        L_0x0044:
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x009e }
        L_0x0048:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x009e }
            if (r4 == 0) goto L_0x008e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x009e }
            java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x009e }
            if (r4 != 0) goto L_0x0057
            goto L_0x0048
        L_0x0057:
            boolean r7 = r10.mo58197q(r4)     // Catch:{ all -> 0x009e }
            if (r7 == 0) goto L_0x005e
            goto L_0x0048
        L_0x005e:
            long r7 = r4.length()     // Catch:{ all -> 0x009e }
            boolean r9 = r10.mo58180a(r4)     // Catch:{ all -> 0x009e }
            if (r9 == 0) goto L_0x0048
            long r5 = r5 - r7
            r2.add(r4)     // Catch:{ all -> 0x009e }
            r4.getName()     // Catch:{ all -> 0x009e }
            ii.a r7 = r10.f58708c     // Catch:{ all -> 0x009e }
            r7.getClass()     // Catch:{ all -> 0x009e }
            java.lang.Object r7 = r7.f45279d     // Catch:{ all -> 0x009e }
            java.util.LinkedHashSet r7 = (java.util.LinkedHashSet) r7     // Catch:{ all -> 0x009e }
            r7.remove(r4)     // Catch:{ all -> 0x009e }
            java.util.HashMap<java.io.File, java.lang.Long> r7 = r10.f58706a     // Catch:{ all -> 0x009e }
            r7.remove(r4)     // Catch:{ all -> 0x009e }
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x0048
            com.vungle.warren.u r0 = r10.f58710e     // Catch:{ all -> 0x009e }
            long r0 = r0.mo58321a()     // Catch:{ all -> 0x009e }
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x0048
        L_0x008e:
            int r0 = r2.size()     // Catch:{ all -> 0x009e }
            if (r0 <= 0) goto L_0x009c
            ii.a r0 = r10.f58708c     // Catch:{ all -> 0x009e }
            r0.mo50075c()     // Catch:{ all -> 0x009e }
            r10.mo58201u()     // Catch:{ all -> 0x009e }
        L_0x009c:
            monitor-exit(r10)
            return r2
        L_0x009e:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.C23126g.mo58190j():java.util.List");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: k */
    public final synchronized void mo58191k() {
        /*
            r12 = this;
            monitor-enter(r12)
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0090 }
            long r2 = r12.f58709d     // Catch:{ all -> 0x0090 }
            long r0 = r0 - r2
            java.io.File r2 = r12.mo58193m()     // Catch:{ all -> 0x0090 }
            java.io.File[] r2 = r2.listFiles()     // Catch:{ all -> 0x0090 }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x0090 }
            java.util.HashMap<java.io.File, java.lang.Long> r4 = r12.f58706a     // Catch:{ all -> 0x0090 }
            java.util.Set r4 = r4.keySet()     // Catch:{ all -> 0x0090 }
            r3.<init>(r4)     // Catch:{ all -> 0x0090 }
            if (r2 == 0) goto L_0x008e
            int r4 = r2.length     // Catch:{ all -> 0x0090 }
            if (r4 <= 0) goto L_0x008e
            int r4 = r2.length     // Catch:{ all -> 0x0090 }
            r5 = 0
        L_0x0022:
            if (r5 >= r4) goto L_0x0070
            r6 = r2[r5]     // Catch:{ all -> 0x0090 }
            monitor-enter(r12)     // Catch:{ all -> 0x0090 }
            java.util.HashMap<java.io.File, java.lang.Long> r7 = r12.f58706a     // Catch:{ all -> 0x006d }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x006d }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x006d }
            if (r7 != 0) goto L_0x0036
            long r7 = r6.lastModified()     // Catch:{ all -> 0x006d }
            goto L_0x003a
        L_0x0036:
            long r7 = r7.longValue()     // Catch:{ all -> 0x006d }
        L_0x003a:
            monitor-exit(r12)     // Catch:{ all -> 0x0090 }
            r3.remove(r6)     // Catch:{ all -> 0x0090 }
            boolean r9 = r12.mo58197q(r6)     // Catch:{ all -> 0x0090 }
            if (r9 == 0) goto L_0x0045
            goto L_0x006a
        L_0x0045:
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0050
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 <= 0) goto L_0x0050
            goto L_0x006a
        L_0x0050:
            boolean r7 = r12.mo58180a(r6)     // Catch:{ all -> 0x0090 }
            if (r7 == 0) goto L_0x0067
            java.util.HashMap<java.io.File, java.lang.Long> r7 = r12.f58706a     // Catch:{ all -> 0x0090 }
            r7.remove(r6)     // Catch:{ all -> 0x0090 }
            ii.a r7 = r12.f58708c     // Catch:{ all -> 0x0090 }
            r7.getClass()     // Catch:{ all -> 0x0090 }
            java.lang.Object r7 = r7.f45279d     // Catch:{ all -> 0x0090 }
            java.util.LinkedHashSet r7 = (java.util.LinkedHashSet) r7     // Catch:{ all -> 0x0090 }
            r7.remove(r6)     // Catch:{ all -> 0x0090 }
        L_0x0067:
            java.util.Objects.toString(r6)     // Catch:{ all -> 0x0090 }
        L_0x006a:
            int r5 = r5 + 1
            goto L_0x0022
        L_0x006d:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0090 }
            throw r0     // Catch:{ all -> 0x0090 }
        L_0x0070:
            java.util.Iterator r0 = r3.iterator()     // Catch:{ all -> 0x0090 }
        L_0x0074:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x0086
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0090 }
            java.io.File r1 = (java.io.File) r1     // Catch:{ all -> 0x0090 }
            java.util.HashMap<java.io.File, java.lang.Long> r2 = r12.f58706a     // Catch:{ all -> 0x0090 }
            r2.remove(r1)     // Catch:{ all -> 0x0090 }
            goto L_0x0074
        L_0x0086:
            ii.a r0 = r12.f58708c     // Catch:{ all -> 0x0090 }
            r0.mo50075c()     // Catch:{ all -> 0x0090 }
            r12.mo58201u()     // Catch:{ all -> 0x0090 }
        L_0x008e:
            monitor-exit(r12)
            return
        L_0x0090:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.warren.downloader.C23126g.mo58191k():void");
    }

    /* renamed from: l */
    public final void mo58192l() {
        Iterator it = new HashSet(this.f58712g).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (!mo58197q(file)) {
                mo58189i(file);
            }
        }
    }

    /* renamed from: m */
    public final synchronized File mo58193m() {
        File file;
        file = new File(mo58194n(), "assets");
        if (!file.isDirectory() && file.exists()) {
            C21105j.m49398c(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: n */
    public final File mo58194n() {
        File file = new File(this.f58707b.mo61483c(), "clever_cache");
        if (!file.isDirectory()) {
            C21105j.m49398c(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: o */
    public final synchronized File mo58195o() {
        File file;
        file = new File(mo58193m(), "meta");
        if (!file.isDirectory()) {
            C21105j.m49398c(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: p */
    public final void mo58196p(ArrayList arrayList) {
        File o = mo58195o();
        File[] listFiles = mo58193m().listFiles();
        if (listFiles != null) {
            ArrayList arrayList2 = new ArrayList(Arrays.asList(listFiles));
            arrayList2.removeAll(arrayList);
            arrayList2.remove(o);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                mo58180a(file);
                Objects.toString(file);
            }
        }
    }

    /* renamed from: q */
    public final boolean mo58197q(File file) {
        Integer num = (Integer) this.f58711f.get(file);
        if (num == null || num.intValue() <= 0) {
            return false;
        }
        Objects.toString(file);
        return true;
    }

    /* renamed from: r */
    public final void mo58198r() {
        Serializable serializable = (Serializable) C21105j.m49399d(new File(mo58194n(), "cache_failed_to_delete"));
        if (serializable instanceof HashSet) {
            try {
                this.f58712g.addAll((HashSet) serializable);
            } catch (ClassCastException e) {
                VungleLogger.m57029b("CleverCache#loadFailedToDelete;", String.format("Error %1$s occurred; old set is not set of File", new Object[]{e}));
                C21105j.m49398c(new File(mo58194n(), "cache_failed_to_delete"));
            }
        }
    }

    /* renamed from: s */
    public final void mo58199s() {
        Serializable serializable = (Serializable) C21105j.m49399d(new File(mo58194n(), "cache_touch_timestamp"));
        if (serializable instanceof HashMap) {
            try {
                this.f58706a.putAll((HashMap) serializable);
            } catch (ClassCastException e) {
                VungleLogger.m57029b("CleverCache#loadTouchTimestamps; loadAd sequence", String.format("Error %1$s occurred; old map is not File -> Long", new Object[]{e}));
                C21105j.m49398c(new File(mo58194n(), "cache_touch_timestamp"));
            }
        }
    }

    /* renamed from: t */
    public final void mo58200t() {
        File file = new File(mo58194n(), "cache_failed_to_delete");
        if (!this.f58712g.isEmpty()) {
            C21105j.m49401f(file, new HashSet(this.f58712g));
        } else if (file.exists()) {
            C21105j.m49398c(file);
        }
    }

    /* renamed from: u */
    public final void mo58201u() {
        C21105j.m49401f(new File(mo58194n(), "cache_touch_timestamp"), new HashMap(this.f58706a));
    }
}
