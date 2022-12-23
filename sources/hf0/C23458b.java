package hf0;

/* renamed from: hf0.b */
public final class C23458b {

    /* renamed from: a */
    public static final C23456a f59232a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: hf0.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<hf0.a> r0 = hf0.C23456a.class
            java.lang.String r1 = "java.specification.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r1 != 0) goto L_0x000d
            goto L_0x0047
        L_0x000d:
            r3 = 6
            r4 = 46
            r5 = 0
            int r3 = kotlin.text.C24179b.m60564L(r1, r4, r5, r5, r3)
            if (r3 >= 0) goto L_0x001e
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0047 }
            int r1 = r1 * r2
            goto L_0x004a
        L_0x001e:
            int r6 = r3 + 1
            r7 = 4
            int r4 = kotlin.text.C24179b.m60564L(r1, r4, r6, r5, r7)
            if (r4 >= 0) goto L_0x002b
            int r4 = r1.length()
        L_0x002b:
            java.lang.String r3 = r1.substring(r5, r3)
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            mf0.C24362h.m61210e(r3, r5)
            java.lang.String r1 = r1.substring(r6, r4)
            mf0.C24362h.m61210e(r1, r5)
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0047 }
            int r3 = r3 * r2
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0047 }
            int r1 = r1 + r3
            goto L_0x004a
        L_0x0047:
            r1 = 65542(0x10006, float:9.1844E-41)
        L_0x004a:
            r3 = 65544(0x10008, float:9.1847E-41)
            java.lang.String r4 = ", base type classloader: "
            java.lang.String r5 = "Instance class was loaded from a different classloader: "
            java.lang.String r6 = "forName(\"kotlin.internal…entations\").newInstance()"
            if (r1 >= r3) goto L_0x0057
            if (r1 >= r2) goto L_0x00d4
        L_0x0057:
            java.lang.Class<jf0.a> r3 = jf0.C23718a.class
            java.lang.Object r3 = r3.newInstance()     // Catch:{ ClassNotFoundException -> 0x0093 }
            mf0.C24362h.m61210e(r3, r6)     // Catch:{ ClassNotFoundException -> 0x0093 }
            hf0.a r3 = (hf0.C23456a) r3     // Catch:{ ClassCastException -> 0x0064 }
            goto L_0x015c
        L_0x0064:
            r7 = move-exception
            java.lang.Class r3 = r3.getClass()     // Catch:{ ClassNotFoundException -> 0x0093 }
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0093 }
            java.lang.ClassLoader r8 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0093 }
            boolean r9 = mf0.C24362h.m61206a(r3, r8)     // Catch:{ ClassNotFoundException -> 0x0093 }
            if (r9 != 0) goto L_0x0092
            java.lang.ClassNotFoundException r9 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x0093 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0093 }
            r10.<init>()     // Catch:{ ClassNotFoundException -> 0x0093 }
            r10.append(r5)     // Catch:{ ClassNotFoundException -> 0x0093 }
            r10.append(r3)     // Catch:{ ClassNotFoundException -> 0x0093 }
            r10.append(r4)     // Catch:{ ClassNotFoundException -> 0x0093 }
            r10.append(r8)     // Catch:{ ClassNotFoundException -> 0x0093 }
            java.lang.String r3 = r10.toString()     // Catch:{ ClassNotFoundException -> 0x0093 }
            r9.<init>(r3, r7)     // Catch:{ ClassNotFoundException -> 0x0093 }
            throw r9     // Catch:{ ClassNotFoundException -> 0x0093 }
        L_0x0092:
            throw r7     // Catch:{ ClassNotFoundException -> 0x0093 }
        L_0x0093:
            java.lang.String r3 = "kotlin.internal.JRE8PlatformImplementations"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x00d3 }
            java.lang.Object r3 = r3.newInstance()     // Catch:{ ClassNotFoundException -> 0x00d3 }
            mf0.C24362h.m61210e(r3, r6)     // Catch:{ ClassNotFoundException -> 0x00d3 }
            hf0.a r3 = (hf0.C23456a) r3     // Catch:{ ClassCastException -> 0x00a4 }
            goto L_0x015c
        L_0x00a4:
            r7 = move-exception
            java.lang.Class r3 = r3.getClass()     // Catch:{ ClassNotFoundException -> 0x00d3 }
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00d3 }
            java.lang.ClassLoader r8 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00d3 }
            boolean r9 = mf0.C24362h.m61206a(r3, r8)     // Catch:{ ClassNotFoundException -> 0x00d3 }
            if (r9 != 0) goto L_0x00d2
            java.lang.ClassNotFoundException r9 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x00d3 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x00d3 }
            r10.<init>()     // Catch:{ ClassNotFoundException -> 0x00d3 }
            r10.append(r5)     // Catch:{ ClassNotFoundException -> 0x00d3 }
            r10.append(r3)     // Catch:{ ClassNotFoundException -> 0x00d3 }
            r10.append(r4)     // Catch:{ ClassNotFoundException -> 0x00d3 }
            r10.append(r8)     // Catch:{ ClassNotFoundException -> 0x00d3 }
            java.lang.String r3 = r10.toString()     // Catch:{ ClassNotFoundException -> 0x00d3 }
            r9.<init>(r3, r7)     // Catch:{ ClassNotFoundException -> 0x00d3 }
            throw r9     // Catch:{ ClassNotFoundException -> 0x00d3 }
        L_0x00d2:
            throw r7     // Catch:{ ClassNotFoundException -> 0x00d3 }
        L_0x00d3:
        L_0x00d4:
            r3 = 65543(0x10007, float:9.1845E-41)
            if (r1 >= r3) goto L_0x00db
            if (r1 >= r2) goto L_0x0157
        L_0x00db:
            java.lang.Class<if0.a> r1 = if0.C23591a.class
            java.lang.Object r1 = r1.newInstance()     // Catch:{ ClassNotFoundException -> 0x0117 }
            mf0.C24362h.m61210e(r1, r6)     // Catch:{ ClassNotFoundException -> 0x0117 }
            r3 = r1
            hf0.a r3 = (hf0.C23456a) r3     // Catch:{ ClassCastException -> 0x00e8 }
            goto L_0x015c
        L_0x00e8:
            r2 = move-exception
            java.lang.Class r1 = r1.getClass()     // Catch:{ ClassNotFoundException -> 0x0117 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0117 }
            java.lang.ClassLoader r3 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0117 }
            boolean r7 = mf0.C24362h.m61206a(r1, r3)     // Catch:{ ClassNotFoundException -> 0x0117 }
            if (r7 != 0) goto L_0x0116
            java.lang.ClassNotFoundException r7 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x0117 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0117 }
            r8.<init>()     // Catch:{ ClassNotFoundException -> 0x0117 }
            r8.append(r5)     // Catch:{ ClassNotFoundException -> 0x0117 }
            r8.append(r1)     // Catch:{ ClassNotFoundException -> 0x0117 }
            r8.append(r4)     // Catch:{ ClassNotFoundException -> 0x0117 }
            r8.append(r3)     // Catch:{ ClassNotFoundException -> 0x0117 }
            java.lang.String r1 = r8.toString()     // Catch:{ ClassNotFoundException -> 0x0117 }
            r7.<init>(r1, r2)     // Catch:{ ClassNotFoundException -> 0x0117 }
            throw r7     // Catch:{ ClassNotFoundException -> 0x0117 }
        L_0x0116:
            throw r2     // Catch:{ ClassNotFoundException -> 0x0117 }
        L_0x0117:
            java.lang.String r1 = "kotlin.internal.JRE7PlatformImplementations"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0157 }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ ClassNotFoundException -> 0x0157 }
            mf0.C24362h.m61210e(r1, r6)     // Catch:{ ClassNotFoundException -> 0x0157 }
            r3 = r1
            hf0.a r3 = (hf0.C23456a) r3     // Catch:{ ClassCastException -> 0x0128 }
            goto L_0x015c
        L_0x0128:
            r2 = move-exception
            java.lang.Class r1 = r1.getClass()     // Catch:{ ClassNotFoundException -> 0x0157 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0157 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0157 }
            boolean r3 = mf0.C24362h.m61206a(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0157 }
            if (r3 != 0) goto L_0x0156
            java.lang.ClassNotFoundException r3 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x0157 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0157 }
            r6.<init>()     // Catch:{ ClassNotFoundException -> 0x0157 }
            r6.append(r5)     // Catch:{ ClassNotFoundException -> 0x0157 }
            r6.append(r1)     // Catch:{ ClassNotFoundException -> 0x0157 }
            r6.append(r4)     // Catch:{ ClassNotFoundException -> 0x0157 }
            r6.append(r0)     // Catch:{ ClassNotFoundException -> 0x0157 }
            java.lang.String r0 = r6.toString()     // Catch:{ ClassNotFoundException -> 0x0157 }
            r3.<init>(r0, r2)     // Catch:{ ClassNotFoundException -> 0x0157 }
            throw r3     // Catch:{ ClassNotFoundException -> 0x0157 }
        L_0x0156:
            throw r2     // Catch:{ ClassNotFoundException -> 0x0157 }
        L_0x0157:
            hf0.a r3 = new hf0.a
            r3.<init>()
        L_0x015c:
            f59232a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hf0.C23458b.<clinit>():void");
    }
}
