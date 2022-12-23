package p565io.github.g00fy2.versioncompare;

import java.util.ArrayList;
import p565io.github.g00fy2.versioncompare.VersionComparator;

/* renamed from: io.github.g00fy2.versioncompare.a */
public final class C23695a implements Comparable<C23695a> {

    /* renamed from: b */
    public final String f59875b;

    /* renamed from: c */
    public final ArrayList f59876c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f59877d = new ArrayList();

    /* renamed from: e */
    public final String f59878e;

    /* renamed from: f */
    public final VersionComparator.ReleaseType f59879f;

    /* renamed from: g */
    public final long f59880g;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C23695a(java.lang.String r15) {
        /*
            r14 = this;
            r14.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.f59876c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.f59877d = r0
            r14.f59875b = r15
            r0 = 1
            r1 = 0
            r2 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.lang.String r5 = ""
            if (r15 == 0) goto L_0x00ed
            java.lang.String r6 = r15.trim()
            int r7 = r6.length()
            if (r7 <= 0) goto L_0x0035
            char r6 = r6.charAt(r1)
            boolean r6 = java.lang.Character.isDigit(r6)
            if (r6 == 0) goto L_0x0035
            r6 = 1
            goto L_0x0036
        L_0x0035:
            r6 = 0
        L_0x0036:
            if (r6 == 0) goto L_0x00ed
            java.lang.String r6 = "\\s"
            java.lang.String r15 = r15.replaceAll(r6, r5)
            java.lang.String r6 = "\\."
            java.lang.String[] r15 = r15.split(r6)
            r6 = 0
            int r7 = r15.length
            r8 = 0
            r9 = 0
        L_0x0048:
            if (r8 >= r7) goto L_0x00bd
            r10 = r15[r8]
            if (r9 == 0) goto L_0x0057
            java.lang.String r11 = "."
            r6.append(r11)
            r6.append(r10)
            goto L_0x00ba
        L_0x0057:
            int r11 = r10.length()
            if (r11 <= 0) goto L_0x0070
            r12 = 0
        L_0x005e:
            if (r12 >= r11) goto L_0x006e
            char r13 = r10.charAt(r12)
            boolean r13 = java.lang.Character.isDigit(r13)
            if (r13 != 0) goto L_0x006b
            goto L_0x0070
        L_0x006b:
            int r12 = r12 + 1
            goto L_0x005e
        L_0x006e:
            r11 = 1
            goto L_0x0071
        L_0x0070:
            r11 = 0
        L_0x0071:
            if (r11 == 0) goto L_0x0081
            java.util.ArrayList r11 = r14.f59876c
            long r12 = p565io.github.g00fy2.versioncompare.VersionComparator.m58182a(r10)
            java.lang.Long r10 = java.lang.Long.valueOf(r12)
            r11.add(r10)
            goto L_0x00ba
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r10.length()
            if (r11 >= r12) goto L_0x00ba
            char r12 = r10.charAt(r11)
            boolean r12 = java.lang.Character.isDigit(r12)
            if (r12 != 0) goto L_0x00b7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            if (r11 <= 0) goto L_0x00b2
            java.util.ArrayList r9 = r14.f59876c
            java.lang.String r12 = r10.substring(r1, r11)
            long r12 = p565io.github.g00fy2.versioncompare.VersionComparator.m58182a(r12)
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r9.add(r12)
            java.lang.String r9 = r10.substring(r11)
            r6.append(r9)
            goto L_0x00b5
        L_0x00b2:
            r6.append(r10)
        L_0x00b5:
            r9 = 1
            goto L_0x00ba
        L_0x00b7:
            int r11 = r11 + 1
            goto L_0x0082
        L_0x00ba:
            int r8 = r8 + 1
            goto L_0x0048
        L_0x00bd:
            if (r6 == 0) goto L_0x00c3
            java.lang.String r5 = r6.toString()
        L_0x00c3:
            r14.f59878e = r5
            java.util.ArrayList r15 = r14.f59877d
            java.util.ArrayList r5 = r14.f59876c
            r15.addAll(r5)
        L_0x00cc:
            java.util.ArrayList r15 = r14.f59877d
            boolean r15 = r15.isEmpty()
            if (r15 != 0) goto L_0x00ef
            java.util.ArrayList r15 = r14.f59877d
            int r15 = r15.lastIndexOf(r4)
            java.util.ArrayList r5 = r14.f59877d
            int r5 = r5.size()
            int r5 = r5 - r0
            if (r15 != r5) goto L_0x00ef
            java.util.ArrayList r15 = r14.f59877d
            int r5 = r15.lastIndexOf(r4)
            r15.remove(r5)
            goto L_0x00cc
        L_0x00ed:
            r14.f59878e = r5
        L_0x00ef:
            java.lang.String r15 = r14.f59878e
            int r4 = r15.length()
            java.lang.String r5 = "alpha"
            java.lang.String r6 = "beta"
            java.lang.String r7 = "rc"
            if (r4 <= 0) goto L_0x013a
            java.lang.String r15 = r15.toLowerCase()
            boolean r4 = r15.contains(r7)
            if (r4 == 0) goto L_0x010a
            io.github.g00fy2.versioncompare.VersionComparator$ReleaseType r15 = p565io.github.g00fy2.versioncompare.VersionComparator.ReleaseType.RC
            goto L_0x013c
        L_0x010a:
            boolean r4 = r15.contains(r6)
            if (r4 == 0) goto L_0x0113
            io.github.g00fy2.versioncompare.VersionComparator$ReleaseType r15 = p565io.github.g00fy2.versioncompare.VersionComparator.ReleaseType.BETA
            goto L_0x013c
        L_0x0113:
            boolean r4 = r15.contains(r5)
            if (r4 == 0) goto L_0x012f
            int r4 = r15.indexOf(r5)
            java.lang.String r15 = r15.substring(r1, r4)
            java.lang.String r4 = "pre"
            boolean r15 = r15.contains(r4)
            if (r15 == 0) goto L_0x012c
            io.github.g00fy2.versioncompare.VersionComparator$ReleaseType r15 = p565io.github.g00fy2.versioncompare.VersionComparator.ReleaseType.PRE_ALPHA
            goto L_0x013c
        L_0x012c:
            io.github.g00fy2.versioncompare.VersionComparator$ReleaseType r15 = p565io.github.g00fy2.versioncompare.VersionComparator.ReleaseType.ALPHA
            goto L_0x013c
        L_0x012f:
            java.lang.String r4 = "snapshot"
            boolean r15 = r15.contains(r4)
            if (r15 == 0) goto L_0x013a
            io.github.g00fy2.versioncompare.VersionComparator$ReleaseType r15 = p565io.github.g00fy2.versioncompare.VersionComparator.ReleaseType.SNAPSHOT
            goto L_0x013c
        L_0x013a:
            io.github.g00fy2.versioncompare.VersionComparator$ReleaseType r15 = p565io.github.g00fy2.versioncompare.VersionComparator.ReleaseType.STABLE
        L_0x013c:
            r14.f59879f = r15
            java.lang.String r4 = r14.f59878e
            io.github.g00fy2.versioncompare.VersionComparator$ReleaseType r8 = p565io.github.g00fy2.versioncompare.VersionComparator.ReleaseType.STABLE
            if (r15 == r8) goto L_0x01cb
            io.github.g00fy2.versioncompare.VersionComparator$ReleaseType r8 = p565io.github.g00fy2.versioncompare.VersionComparator.ReleaseType.SNAPSHOT
            if (r15 != r8) goto L_0x014a
            goto L_0x01cb
        L_0x014a:
            java.lang.String r8 = r4.toLowerCase()
            int[] r9 = p565io.github.g00fy2.versioncompare.VersionComparator.C23694a.f59874a
            int r15 = r15.ordinal()
            r15 = r9[r15]
            r9 = 2
            if (r15 == r0) goto L_0x0170
            r7 = 4
            if (r15 == r9) goto L_0x016a
            r6 = 3
            if (r15 == r6) goto L_0x0163
            if (r15 == r7) goto L_0x0163
            r15 = 0
            goto L_0x0175
        L_0x0163:
            int r15 = r8.indexOf(r5)
            int r15 = r15 + 5
            goto L_0x0175
        L_0x016a:
            int r15 = r8.indexOf(r6)
            int r15 = r15 + r7
            goto L_0x0175
        L_0x0170:
            int r15 = r8.indexOf(r7)
            int r15 = r15 + r9
        L_0x0175:
            int r5 = r4.length()
            if (r15 >= r5) goto L_0x01cb
            int r5 = r15 + 2
            int r6 = r4.length()
            int r5 = java.lang.Math.min(r5, r6)
            java.lang.String r5 = r4.substring(r15, r5)
            int r6 = r5.length()
            if (r6 <= 0) goto L_0x01a0
            r7 = 0
        L_0x0190:
            if (r7 >= r6) goto L_0x01a0
            char r8 = r5.charAt(r7)
            boolean r8 = java.lang.Character.isDigit(r8)
            if (r8 == 0) goto L_0x019d
            goto L_0x01a1
        L_0x019d:
            int r7 = r7 + 1
            goto L_0x0190
        L_0x01a0:
            r0 = 0
        L_0x01a1:
            if (r0 == 0) goto L_0x01cb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r15
        L_0x01a9:
            int r2 = r4.length()
            if (r1 >= r2) goto L_0x01c3
            char r2 = r4.charAt(r1)
            boolean r3 = java.lang.Character.isDigit(r2)
            if (r3 == 0) goto L_0x01bd
            r0.append(r2)
            goto L_0x01c0
        L_0x01bd:
            if (r1 == r15) goto L_0x01c0
            goto L_0x01c3
        L_0x01c0:
            int r1 = r1 + 1
            goto L_0x01a9
        L_0x01c3:
            java.lang.String r15 = r0.toString()
            long r2 = p565io.github.g00fy2.versioncompare.VersionComparator.m58182a(r15)
        L_0x01cb:
            r14.f59880g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p565io.github.g00fy2.versioncompare.C23695a.<init>(java.lang.String):void");
    }

    /* renamed from: a */
    public final int compareTo(C23695a aVar) {
        long j;
        long j2;
        long j3;
        ArrayList arrayList = this.f59877d;
        ArrayList arrayList2 = aVar.f59877d;
        int size = arrayList.size();
        int size2 = arrayList2.size();
        int max = Math.max(size, size2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= max) {
                break;
            }
            long j4 = 0;
            if (i2 < size) {
                j = ((Long) arrayList.get(i2)).longValue();
            } else {
                j = 0;
            }
            if (i2 < size2) {
                j2 = ((Long) arrayList2.get(i2)).longValue();
            } else {
                j2 = 0;
            }
            if (j > j2) {
                i = 1;
                break;
            }
            if (i2 < size) {
                j3 = ((Long) arrayList.get(i2)).longValue();
            } else {
                j3 = 0;
            }
            if (i2 < size2) {
                j4 = ((Long) arrayList2.get(i2)).longValue();
            }
            if (j3 < j4) {
                i = -1;
                break;
            }
            i2++;
        }
        if (i != 0) {
            return i;
        }
        int compareTo = this.f59879f.compareTo(aVar.f59879f);
        if (compareTo != 0) {
            return compareTo;
        }
        return Long.compare(this.f59880g, aVar.f59880g);
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof C23695a) {
            if (compareTo((C23695a) obj) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return super.equals(obj);
    }

    public final int hashCode() {
        int hashCode = this.f59879f.hashCode();
        long j = this.f59880g;
        return ((hashCode + (this.f59877d.hashCode() * 31)) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return String.valueOf(this.f59875b);
    }
}
