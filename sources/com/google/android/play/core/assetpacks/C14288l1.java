package com.google.android.play.core.assetpacks;

import androidx.appcompat.app.C0262r;
import p356ad.C13413b;

/* renamed from: com.google.android.play.core.assetpacks.l1 */
public final class C14288l1 {

    /* renamed from: e */
    public static final C0262r f35935e = new C0262r("ExtractorTaskFinder");

    /* renamed from: a */
    public final C14276i1 f35936a;

    /* renamed from: b */
    public final C14243a0 f35937b;

    /* renamed from: c */
    public final C14279j0 f35938c;

    /* renamed from: d */
    public final C13413b f35939d;

    public C14288l1(C14276i1 i1Var, C14243a0 a0Var, C14279j0 j0Var, C13413b bVar) {
        this.f35936a = i1Var;
        this.f35937b = a0Var;
        this.f35938c = j0Var;
        this.f35939d = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: com.google.android.play.core.assetpacks.v1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: com.google.android.play.core.assetpacks.v1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: com.google.android.play.core.assetpacks.t1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: com.google.android.play.core.assetpacks.t1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: com.google.android.play.core.assetpacks.o2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: com.google.android.play.core.assetpacks.o2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: com.google.android.play.core.assetpacks.g2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: com.google.android.play.core.assetpacks.g2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: com.google.android.play.core.assetpacks.o2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: com.google.android.play.core.assetpacks.t1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v31, resolved type: com.google.android.play.core.assetpacks.v1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v32, resolved type: com.google.android.play.core.assetpacks.g2} */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b7, code lost:
        if (r0 == null) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        f35935e.mo974a("Found final move task for session %s with pack %s.", java.lang.Integer.valueOf(r7.f35862a), r7.f35864c.f35834a);
        r14 = r7.f35862a;
        r8 = r7.f35864c;
        r10 = new com.google.android.play.core.assetpacks.C14328v1(r8.f35835b, r8.f35834a, r14, r7.f35863b, r8.f35836c);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x025d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x037d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0350 A[LOOP:10: B:102:0x0350->B:167:0x0350, LOOP_END, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0276 A[Catch:{ IOException -> 0x010d, all -> 0x0415 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.play.core.assetpacks.C14284k1 mo42853a() {
        /*
            r40 = this;
            r1 = r40
            com.google.android.play.core.assetpacks.i1 r0 = r1.f35936a     // Catch:{ all -> 0x0415 }
            java.util.concurrent.locks.ReentrantLock r0 = r0.f35910f     // Catch:{ all -> 0x0415 }
            r0.lock()     // Catch:{ all -> 0x0415 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0415 }
            r2.<init>()     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.i1 r0 = r1.f35936a     // Catch:{ all -> 0x0415 }
            java.util.HashMap r0 = r0.f35909e     // Catch:{ all -> 0x0415 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0415 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0415 }
        L_0x001a:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0415 }
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.f1 r3 = (com.google.android.play.core.assetpacks.C14264f1) r3     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r4 = r3.f35864c     // Catch:{ all -> 0x0415 }
            int r4 = r4.f35837d     // Catch:{ all -> 0x0415 }
            boolean r4 = p584jl.C17885a.m44415N0(r4)     // Catch:{ all -> 0x0415 }
            if (r4 == 0) goto L_0x001a
            r2.add(r3)     // Catch:{ all -> 0x0415 }
            goto L_0x001a
        L_0x0034:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x003f
            com.google.android.play.core.assetpacks.i1 r0 = r1.f35936a
            r3 = 0
            goto L_0x040b
        L_0x003f:
            ad.b r0 = r1.f35939d     // Catch:{ all -> 0x0415 }
            boolean r0 = r0.mo40276a()     // Catch:{ all -> 0x0415 }
            r4 = 2
            r5 = 1
            r6 = 0
            if (r0 == 0) goto L_0x00b9
            com.google.android.play.core.assetpacks.a0 r0 = r1.f35937b     // Catch:{ all -> 0x0415 }
            java.util.HashMap r0 = r0.mo42797n()     // Catch:{ all -> 0x0415 }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ all -> 0x0415 }
        L_0x0054:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0415 }
            if (r8 == 0) goto L_0x00b6
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.f1 r8 = (com.google.android.play.core.assetpacks.C14264f1) r8     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r9 = r8.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r9 = r9.f35834a     // Catch:{ all -> 0x0415 }
            java.lang.Object r9 = r0.get(r9)     // Catch:{ all -> 0x0415 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0415 }
            if (r9 == 0) goto L_0x0054
            com.google.android.play.core.assetpacks.e1 r10 = r8.f35864c     // Catch:{ all -> 0x0415 }
            long r10 = r10.f35835b     // Catch:{ all -> 0x0415 }
            long r12 = r9.longValue()     // Catch:{ all -> 0x0415 }
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x0054
            androidx.appcompat.app.r r0 = f35935e     // Catch:{ all -> 0x0415 }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x0415 }
            int r9 = r8.f35862a     // Catch:{ all -> 0x0415 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0415 }
            r7[r6] = r9     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r9 = r8.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r9 = r9.f35834a     // Catch:{ all -> 0x0415 }
            r7[r5] = r9     // Catch:{ all -> 0x0415 }
            java.lang.String r9 = "Found promote pack task for session %s with pack %s."
            r0.mo974a(r9, r7)     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.g2 r0 = new com.google.android.play.core.assetpacks.g2     // Catch:{ all -> 0x0415 }
            int r11 = r8.f35862a     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r7 = r8.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r12 = r7.f35834a     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.a0 r7 = r1.f35937b     // Catch:{ all -> 0x0415 }
            r7.getClass()     // Catch:{ all -> 0x0415 }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x0415 }
            java.io.File r7 = r7.mo42789d()     // Catch:{ all -> 0x0415 }
            r9.<init>(r7, r12)     // Catch:{ all -> 0x0415 }
            long r9 = com.google.android.play.core.assetpacks.C14243a0.m35457b(r9, r5)     // Catch:{ all -> 0x0415 }
            int r13 = (int) r9     // Catch:{ all -> 0x0415 }
            int r14 = r8.f35863b     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r7 = r8.f35864c     // Catch:{ all -> 0x0415 }
            long r7 = r7.f35835b     // Catch:{ all -> 0x0415 }
            r10 = r0
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0415 }
            goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            if (r0 != 0) goto L_0x040f
        L_0x00b9:
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0415 }
        L_0x00bd:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x0415 }
            if (r7 == 0) goto L_0x012c
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.f1 r7 = (com.google.android.play.core.assetpacks.C14264f1) r7     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.a0 r8 = r1.f35937b     // Catch:{ IOException -> 0x010d }
            com.google.android.play.core.assetpacks.e1 r9 = r7.f35864c     // Catch:{ IOException -> 0x010d }
            java.lang.String r10 = r9.f35834a     // Catch:{ IOException -> 0x010d }
            int r11 = r7.f35863b     // Catch:{ IOException -> 0x010d }
            long r12 = r9.f35835b     // Catch:{ IOException -> 0x010d }
            int r8 = r8.mo42791h(r11, r12, r10)     // Catch:{ IOException -> 0x010d }
            com.google.android.play.core.assetpacks.e1 r9 = r7.f35864c     // Catch:{ IOException -> 0x010d }
            java.util.List r9 = r9.f35839f     // Catch:{ IOException -> 0x010d }
            int r9 = r9.size()     // Catch:{ IOException -> 0x010d }
            if (r8 != r9) goto L_0x00bd
            androidx.appcompat.app.r r0 = f35935e     // Catch:{ all -> 0x0415 }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x0415 }
            int r9 = r7.f35862a     // Catch:{ all -> 0x0415 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0415 }
            r8[r6] = r9     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r9 = r7.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r9 = r9.f35834a     // Catch:{ all -> 0x0415 }
            r8[r5] = r9     // Catch:{ all -> 0x0415 }
            java.lang.String r9 = "Found final move task for session %s with pack %s."
            r0.mo974a(r9, r8)     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.v1 r0 = new com.google.android.play.core.assetpacks.v1     // Catch:{ all -> 0x0415 }
            int r14 = r7.f35862a     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r8 = r7.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r13 = r8.f35834a     // Catch:{ all -> 0x0415 }
            int r15 = r7.f35863b     // Catch:{ all -> 0x0415 }
            long r11 = r8.f35835b     // Catch:{ all -> 0x0415 }
            java.lang.String r7 = r8.f35836c     // Catch:{ all -> 0x0415 }
            r10 = r0
            r16 = r7
            r10.<init>(r11, r13, r14, r15, r16)     // Catch:{ all -> 0x0415 }
            goto L_0x012d
        L_0x010d:
            r0 = move-exception
            com.google.android.play.core.assetpacks.zzck r2 = new com.google.android.play.core.assetpacks.zzck     // Catch:{ all -> 0x0415 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x0415 }
            int r4 = r7.f35862a     // Catch:{ all -> 0x0415 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0415 }
            r3[r6] = r4     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r4 = r7.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r4 = r4.f35834a     // Catch:{ all -> 0x0415 }
            r3[r5] = r4     // Catch:{ all -> 0x0415 }
            java.lang.String r4 = "Failed to check number of completed merges for session %s, pack %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x0415 }
            int r4 = r7.f35862a     // Catch:{ all -> 0x0415 }
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x0415 }
            throw r2     // Catch:{ all -> 0x0415 }
        L_0x012c:
            r0 = 0
        L_0x012d:
            if (r0 != 0) goto L_0x040f
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0415 }
        L_0x0133:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x0415 }
            r8 = 3
            if (r7 == 0) goto L_0x01ae
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.f1 r7 = (com.google.android.play.core.assetpacks.C14264f1) r7     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r9 = r7.f35864c     // Catch:{ all -> 0x0415 }
            int r10 = r9.f35837d     // Catch:{ all -> 0x0415 }
            boolean r10 = p584jl.C17885a.m44415N0(r10)     // Catch:{ all -> 0x0415 }
            if (r10 == 0) goto L_0x0133
            java.util.List r9 = r9.f35839f     // Catch:{ all -> 0x0415 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0415 }
        L_0x0150:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0415 }
            if (r10 == 0) goto L_0x0133
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.g1 r10 = (com.google.android.play.core.assetpacks.C14268g1) r10     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.a0 r11 = r1.f35937b     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r12 = r7.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r14 = r12.f35834a     // Catch:{ all -> 0x0415 }
            int r15 = r7.f35863b     // Catch:{ all -> 0x0415 }
            long r12 = r12.f35835b     // Catch:{ all -> 0x0415 }
            java.lang.String r3 = r10.f35873a     // Catch:{ all -> 0x0415 }
            r16 = r15
            r15 = r3
            java.io.File r3 = r11.mo42795l(r12, r14, r15, r16)     // Catch:{ all -> 0x0415 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x0415 }
            if (r3 == 0) goto L_0x0150
            androidx.appcompat.app.r r0 = f35935e     // Catch:{ all -> 0x0415 }
            java.lang.Object[] r3 = new java.lang.Object[r8]     // Catch:{ all -> 0x0415 }
            int r9 = r7.f35862a     // Catch:{ all -> 0x0415 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0415 }
            r3[r6] = r9     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r9 = r7.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r9 = r9.f35834a     // Catch:{ all -> 0x0415 }
            r3[r5] = r9     // Catch:{ all -> 0x0415 }
            java.lang.String r9 = r10.f35873a     // Catch:{ all -> 0x0415 }
            r3[r4] = r9     // Catch:{ all -> 0x0415 }
            java.lang.String r9 = "Found merge task for session %s with pack %s and slice %s."
            r0.mo974a(r9, r3)     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.t1 r0 = new com.google.android.play.core.assetpacks.t1     // Catch:{ all -> 0x0415 }
            int r3 = r7.f35862a     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r9 = r7.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r11 = r9.f35834a     // Catch:{ all -> 0x0415 }
            int r7 = r7.f35863b     // Catch:{ all -> 0x0415 }
            long r12 = r9.f35835b     // Catch:{ all -> 0x0415 }
            java.lang.String r9 = r10.f35873a     // Catch:{ all -> 0x0415 }
            r17 = r0
            r18 = r12
            r20 = r11
            r21 = r3
            r22 = r7
            r23 = r9
            r17.<init>(r18, r20, r21, r22, r23)     // Catch:{ all -> 0x0415 }
            goto L_0x01af
        L_0x01ae:
            r0 = 0
        L_0x01af:
            if (r0 != 0) goto L_0x040f
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0415 }
        L_0x01b5:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0415 }
            if (r3 == 0) goto L_0x0239
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.f1 r3 = (com.google.android.play.core.assetpacks.C14264f1) r3     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r7 = r3.f35864c     // Catch:{ all -> 0x0415 }
            int r9 = r7.f35837d     // Catch:{ all -> 0x0415 }
            boolean r9 = p584jl.C17885a.m44415N0(r9)     // Catch:{ all -> 0x0415 }
            if (r9 == 0) goto L_0x01b5
            java.util.List r7 = r7.f35839f     // Catch:{ all -> 0x0415 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0415 }
        L_0x01d1:
            boolean r9 = r7.hasNext()     // Catch:{ all -> 0x0415 }
            if (r9 == 0) goto L_0x01b5
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.g1 r9 = (com.google.android.play.core.assetpacks.C14268g1) r9     // Catch:{ all -> 0x0415 }
            boolean r10 = r1.mo42854b(r3, r9)     // Catch:{ all -> 0x0415 }
            if (r10 == 0) goto L_0x01d1
            com.google.android.play.core.assetpacks.a0 r11 = r1.f35937b     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r10 = r3.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r14 = r10.f35834a     // Catch:{ all -> 0x0415 }
            int r15 = r3.f35863b     // Catch:{ all -> 0x0415 }
            long r12 = r10.f35835b     // Catch:{ all -> 0x0415 }
            java.lang.String r10 = r9.f35873a     // Catch:{ all -> 0x0415 }
            r16 = r15
            r15 = r10
            java.io.File r10 = r11.mo42794k(r12, r14, r15, r16)     // Catch:{ all -> 0x0415 }
            boolean r10 = r10.exists()     // Catch:{ all -> 0x0415 }
            if (r10 == 0) goto L_0x01d1
            androidx.appcompat.app.r r0 = f35935e     // Catch:{ all -> 0x0415 }
            java.lang.Object[] r7 = new java.lang.Object[r8]     // Catch:{ all -> 0x0415 }
            int r10 = r3.f35862a     // Catch:{ all -> 0x0415 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0415 }
            r7[r6] = r10     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r10 = r3.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r10 = r10.f35834a     // Catch:{ all -> 0x0415 }
            r7[r5] = r10     // Catch:{ all -> 0x0415 }
            java.lang.String r10 = r9.f35873a     // Catch:{ all -> 0x0415 }
            r7[r4] = r10     // Catch:{ all -> 0x0415 }
            java.lang.String r10 = "Found verify task for session %s with pack %s and slice %s."
            r0.mo974a(r10, r7)     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.o2 r0 = new com.google.android.play.core.assetpacks.o2     // Catch:{ all -> 0x0415 }
            int r7 = r3.f35862a     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r10 = r3.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r11 = r10.f35834a     // Catch:{ all -> 0x0415 }
            int r3 = r3.f35863b     // Catch:{ all -> 0x0415 }
            long r12 = r10.f35835b     // Catch:{ all -> 0x0415 }
            java.lang.String r10 = r9.f35873a     // Catch:{ all -> 0x0415 }
            java.lang.String r9 = r9.f35874b     // Catch:{ all -> 0x0415 }
            r17 = r0
            r18 = r7
            r19 = r11
            r20 = r3
            r21 = r12
            r23 = r10
            r24 = r9
            r17.<init>(r18, r19, r20, r21, r23, r24)     // Catch:{ all -> 0x0415 }
            goto L_0x023a
        L_0x0239:
            r0 = 0
        L_0x023a:
            if (r0 != 0) goto L_0x040f
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x0415 }
        L_0x0240:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x032d
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x0415 }
            r9 = r0
            com.google.android.play.core.assetpacks.f1 r9 = (com.google.android.play.core.assetpacks.C14264f1) r9     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r0 = r9.f35864c     // Catch:{ all -> 0x0415 }
            int r10 = r0.f35837d     // Catch:{ all -> 0x0415 }
            boolean r10 = p584jl.C17885a.m44415N0(r10)     // Catch:{ all -> 0x0415 }
            if (r10 == 0) goto L_0x0240
            java.util.List r0 = r0.f35839f     // Catch:{ all -> 0x0415 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x0415 }
        L_0x025d:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0415 }
            if (r0 == 0) goto L_0x0240
            java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x0415 }
            r11 = r0
            com.google.android.play.core.assetpacks.g1 r11 = (com.google.android.play.core.assetpacks.C14268g1) r11     // Catch:{ all -> 0x0415 }
            int r0 = r11.f35878f     // Catch:{ all -> 0x0415 }
            if (r0 == r5) goto L_0x0273
            if (r0 != r4) goto L_0x0271
            goto L_0x0273
        L_0x0271:
            r0 = 0
            goto L_0x0274
        L_0x0273:
            r0 = 1
        L_0x0274:
            if (r0 != 0) goto L_0x025d
            com.google.android.play.core.assetpacks.l2 r0 = new com.google.android.play.core.assetpacks.l2     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.a0 r12 = r1.f35937b     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r13 = r9.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r14 = r13.f35834a     // Catch:{ all -> 0x0415 }
            int r15 = r9.f35863b     // Catch:{ all -> 0x0415 }
            long r7 = r13.f35835b     // Catch:{ all -> 0x0415 }
            java.lang.String r13 = r11.f35873a     // Catch:{ all -> 0x0415 }
            r17 = r0
            r18 = r12
            r19 = r14
            r20 = r15
            r21 = r7
            r23 = r13
            r17.<init>(r18, r19, r20, r21, r23)     // Catch:{ all -> 0x0415 }
            int r0 = r0.mo42855a()     // Catch:{ IOException -> 0x0298 }
            goto L_0x02a6
        L_0x0298:
            r0 = move-exception
            r7 = r0
            androidx.appcompat.app.r r0 = f35935e     // Catch:{ all -> 0x0415 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0415 }
            r8[r6] = r7     // Catch:{ all -> 0x0415 }
            java.lang.String r7 = "Slice checkpoint corrupt, restarting extraction. %s"
            r0.mo975b(r7, r8)     // Catch:{ all -> 0x0415 }
            r0 = 0
        L_0x02a6:
            r7 = -1
            if (r0 == r7) goto L_0x0327
            java.util.List r7 = r11.f35876d     // Catch:{ all -> 0x0415 }
            java.lang.Object r7 = r7.get(r0)     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.c1 r7 = (com.google.android.play.core.assetpacks.C14252c1) r7     // Catch:{ all -> 0x0415 }
            boolean r7 = r7.f35814a     // Catch:{ all -> 0x0415 }
            if (r7 == 0) goto L_0x0327
            androidx.appcompat.app.r r3 = f35935e     // Catch:{ all -> 0x0415 }
            r7 = 5
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x0415 }
            int r8 = r11.f35877e     // Catch:{ all -> 0x0415 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0415 }
            r7[r6] = r8     // Catch:{ all -> 0x0415 }
            int r8 = r9.f35862a     // Catch:{ all -> 0x0415 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0415 }
            r7[r5] = r8     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r8 = r9.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r8 = r8.f35834a     // Catch:{ all -> 0x0415 }
            r7[r4] = r8     // Catch:{ all -> 0x0415 }
            java.lang.String r8 = r11.f35873a     // Catch:{ all -> 0x0415 }
            r10 = 3
            r7[r10] = r8     // Catch:{ all -> 0x0415 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0415 }
            r10 = 4
            r7[r10] = r8     // Catch:{ all -> 0x0415 }
            java.lang.String r8 = "Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s."
            r3.mo974a(r8, r7)     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.j0 r3 = r1.f35938c     // Catch:{ all -> 0x0415 }
            int r7 = r9.f35862a     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r8 = r9.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r8 = r8.f35834a     // Catch:{ all -> 0x0415 }
            java.lang.String r10 = r11.f35873a     // Catch:{ all -> 0x0415 }
            android.os.ParcelFileDescriptor$AutoCloseInputStream r39 = r3.mo42847a(r7, r0, r8, r10)     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.o0 r3 = new com.google.android.play.core.assetpacks.o0     // Catch:{ all -> 0x0415 }
            int r7 = r9.f35862a     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r8 = r9.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r10 = r8.f35834a     // Catch:{ all -> 0x0415 }
            int r12 = r9.f35863b     // Catch:{ all -> 0x0415 }
            long r13 = r8.f35835b     // Catch:{ all -> 0x0415 }
            java.lang.String r8 = r8.f35836c     // Catch:{ all -> 0x0415 }
            java.lang.String r15 = r11.f35873a     // Catch:{ all -> 0x0415 }
            int r6 = r11.f35877e     // Catch:{ all -> 0x0415 }
            java.util.List r11 = r11.f35876d     // Catch:{ all -> 0x0415 }
            int r35 = r11.size()     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r9 = r9.f35864c     // Catch:{ all -> 0x0415 }
            long r4 = r9.f35838e     // Catch:{ all -> 0x0415 }
            int r9 = r9.f35837d     // Catch:{ all -> 0x0415 }
            r25 = r3
            r26 = r7
            r27 = r10
            r28 = r12
            r29 = r13
            r31 = r8
            r32 = r15
            r33 = r6
            r34 = r0
            r36 = r4
            r38 = r9
            r25.<init>(r26, r27, r28, r29, r31, r32, r33, r34, r35, r36, r38, r39)     // Catch:{ all -> 0x0415 }
            goto L_0x032e
        L_0x0327:
            r4 = 2
            r5 = 1
            r6 = 0
            r8 = 3
            goto L_0x025d
        L_0x032d:
            r3 = 0
        L_0x032e:
            if (r3 != 0) goto L_0x0409
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0415 }
        L_0x0334:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0415 }
            if (r2 == 0) goto L_0x03fc
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.f1 r2 = (com.google.android.play.core.assetpacks.C14264f1) r2     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r3 = r2.f35864c     // Catch:{ all -> 0x0415 }
            int r4 = r3.f35837d     // Catch:{ all -> 0x0415 }
            boolean r4 = p584jl.C17885a.m44415N0(r4)     // Catch:{ all -> 0x0415 }
            if (r4 == 0) goto L_0x0334
            java.util.List r3 = r3.f35839f     // Catch:{ all -> 0x0415 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0415 }
        L_0x0350:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0415 }
            if (r4 == 0) goto L_0x0334
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.g1 r4 = (com.google.android.play.core.assetpacks.C14268g1) r4     // Catch:{ all -> 0x0415 }
            int r5 = r4.f35878f     // Catch:{ all -> 0x0415 }
            r6 = 1
            if (r5 == r6) goto L_0x0367
            r6 = 2
            if (r5 != r6) goto L_0x0365
            goto L_0x0367
        L_0x0365:
            r5 = 0
            goto L_0x0368
        L_0x0367:
            r5 = 1
        L_0x0368:
            if (r5 == 0) goto L_0x0350
            java.util.List r5 = r4.f35876d     // Catch:{ all -> 0x0415 }
            r6 = 0
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.c1 r5 = (com.google.android.play.core.assetpacks.C14252c1) r5     // Catch:{ all -> 0x0415 }
            boolean r5 = r5.f35814a     // Catch:{ all -> 0x0415 }
            if (r5 == 0) goto L_0x0350
            boolean r5 = r1.mo42854b(r2, r4)     // Catch:{ all -> 0x0415 }
            if (r5 != 0) goto L_0x0350
            androidx.appcompat.app.r r0 = f35935e     // Catch:{ all -> 0x0415 }
            r5 = 4
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ all -> 0x0415 }
            int r5 = r4.f35878f     // Catch:{ all -> 0x0415 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0415 }
            r6 = 0
            r3[r6] = r5     // Catch:{ all -> 0x0415 }
            int r5 = r2.f35862a     // Catch:{ all -> 0x0415 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0415 }
            r6 = 1
            r3[r6] = r5     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r5 = r2.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r5 = r5.f35834a     // Catch:{ all -> 0x0415 }
            r6 = 2
            r3[r6] = r5     // Catch:{ all -> 0x0415 }
            java.lang.String r5 = r4.f35873a     // Catch:{ all -> 0x0415 }
            r7 = 3
            r3[r7] = r5     // Catch:{ all -> 0x0415 }
            java.lang.String r5 = "Found patch slice task using patch format %s for session %s, pack %s, slice %s."
            r0.mo974a(r5, r3)     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.j0 r0 = r1.f35938c     // Catch:{ all -> 0x0415 }
            int r3 = r2.f35862a     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r5 = r2.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r5 = r5.f35834a     // Catch:{ all -> 0x0415 }
            java.lang.String r6 = r4.f35873a     // Catch:{ all -> 0x0415 }
            r8 = 0
            android.os.ParcelFileDescriptor$AutoCloseInputStream r32 = r0.mo42847a(r3, r8, r5, r6)     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e2 r0 = new com.google.android.play.core.assetpacks.e2     // Catch:{ all -> 0x0415 }
            int r3 = r2.f35862a     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r5 = r2.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r5 = r5.f35834a     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.a0 r6 = r1.f35937b     // Catch:{ all -> 0x0415 }
            r6.getClass()     // Catch:{ all -> 0x0415 }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0415 }
            java.io.File r6 = r6.mo42789d()     // Catch:{ all -> 0x0415 }
            r7.<init>(r6, r5)     // Catch:{ all -> 0x0415 }
            r9 = 1
            long r6 = com.google.android.play.core.assetpacks.C14243a0.m35457b(r7, r9)     // Catch:{ all -> 0x0415 }
            int r7 = (int) r6     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.a0 r6 = r1.f35937b     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r8 = r2.f35864c     // Catch:{ all -> 0x0415 }
            java.lang.String r8 = r8.f35834a     // Catch:{ all -> 0x0415 }
            long r23 = r6.mo42792i(r8)     // Catch:{ all -> 0x0415 }
            int r6 = r2.f35863b     // Catch:{ all -> 0x0415 }
            com.google.android.play.core.assetpacks.e1 r2 = r2.f35864c     // Catch:{ all -> 0x0415 }
            long r8 = r2.f35835b     // Catch:{ all -> 0x0415 }
            int r2 = r4.f35878f     // Catch:{ all -> 0x0415 }
            java.lang.String r10 = r4.f35873a     // Catch:{ all -> 0x0415 }
            long r11 = r4.f35875c     // Catch:{ all -> 0x0415 }
            r19 = r0
            r20 = r3
            r21 = r5
            r22 = r7
            r25 = r6
            r26 = r8
            r28 = r2
            r29 = r10
            r30 = r11
            r19.<init>(r20, r21, r22, r23, r25, r26, r28, r29, r30, r32)     // Catch:{ all -> 0x0415 }
            goto L_0x03fd
        L_0x03fc:
            r0 = 0
        L_0x03fd:
            if (r0 == 0) goto L_0x0402
            com.google.android.play.core.assetpacks.i1 r2 = r1.f35936a
            goto L_0x0411
        L_0x0402:
            com.google.android.play.core.assetpacks.i1 r0 = r1.f35936a
            r0.mo42839a()
            r2 = 0
            return r2
        L_0x0409:
            com.google.android.play.core.assetpacks.i1 r0 = r1.f35936a
        L_0x040b:
            r0.mo42839a()
            return r3
        L_0x040f:
            com.google.android.play.core.assetpacks.i1 r2 = r1.f35936a
        L_0x0411:
            r2.mo42839a()
            return r0
        L_0x0415:
            r0 = move-exception
            com.google.android.play.core.assetpacks.i1 r2 = r1.f35936a
            r2.mo42839a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C14288l1.mo42853a():com.google.android.play.core.assetpacks.k1");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x006b */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo42854b(com.google.android.play.core.assetpacks.C14264f1 r9, com.google.android.play.core.assetpacks.C14268g1 r10) {
        /*
            r8 = this;
            com.google.android.play.core.assetpacks.l2 r0 = new com.google.android.play.core.assetpacks.l2
            com.google.android.play.core.assetpacks.a0 r0 = r8.f35937b
            com.google.android.play.core.assetpacks.e1 r1 = r9.f35864c
            java.lang.String r2 = r1.f35834a
            int r9 = r9.f35863b
            long r3 = r1.f35835b
            java.lang.String r10 = r10.f35873a
            r0.getClass()
            java.io.File r1 = new java.io.File
            java.io.File r5 = new java.io.File
            java.io.File r6 = new java.io.File
            java.io.File r7 = new java.io.File
            java.io.File r9 = r0.mo42788c(r9, r3, r2)
            java.lang.String r0 = "_slices"
            r7.<init>(r9, r0)
            java.lang.String r9 = "_metadata"
            r6.<init>(r7, r9)
            r5.<init>(r6, r10)
            java.lang.String r9 = "checkpoint.dat"
            r1.<init>(r5, r9)
            boolean r9 = r1.exists()
            r10 = 0
            r0 = 1
            if (r9 != 0) goto L_0x0038
            goto L_0x0078
        L_0x0038:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006c }
            r9.<init>(r1)     // Catch:{ IOException -> 0x006c }
            java.util.Properties r1 = new java.util.Properties     // Catch:{ all -> 0x0067 }
            r1.<init>()     // Catch:{ all -> 0x0067 }
            r1.load(r9)     // Catch:{ all -> 0x0067 }
            r9.close()     // Catch:{ IOException -> 0x006c }
            java.lang.String r9 = "fileStatus"
            java.lang.String r2 = r1.getProperty(r9)
            if (r2 != 0) goto L_0x005a
            androidx.appcompat.app.r r9 = com.google.android.play.core.assetpacks.C14289l2.f35940h
            java.lang.Object[] r0 = new java.lang.Object[r10]
            java.lang.String r1 = "Slice checkpoint file corrupt while checking if extraction finished."
            r9.mo975b(r1, r0)
            goto L_0x0078
        L_0x005a:
            java.lang.String r9 = r1.getProperty(r9)
            int r9 = java.lang.Integer.parseInt(r9)
            r1 = 4
            if (r9 != r1) goto L_0x0078
            r10 = 1
            goto L_0x0078
        L_0x0067:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x006b }
        L_0x006b:
            throw r1     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            r9 = move-exception
            androidx.appcompat.app.r r1 = com.google.android.play.core.assetpacks.C14289l2.f35940h
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r10] = r9
            java.lang.String r9 = "Could not read checkpoint while checking if extraction finished. %s"
            r1.mo975b(r9, r0)
        L_0x0078:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C14288l1.mo42854b(com.google.android.play.core.assetpacks.f1, com.google.android.play.core.assetpacks.g1):boolean");
    }
}
