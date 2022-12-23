package p434dd;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import p506gd.C17174e;

/* renamed from: dd.o */
public final class C16569o {

    /* renamed from: a */
    public final C17174e f43228a;

    /* renamed from: b */
    public final Context f43229b;

    /* renamed from: c */
    public final C16567n f43230c;

    /* renamed from: d */
    public PackageInfo f43231d;

    public C16569o(Context context, C17174e eVar) {
        C16567n nVar = new C16567n();
        this.f43228a = eVar;
        this.f43229b = context;
        this.f43230c = nVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0073, code lost:
        if (r6.f43226a.getName().equals("manifest") == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        r7 = r6.f43226a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
        r6 = r6.f43226a.getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        if (r7 == null) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r7 = java.lang.Integer.parseInt(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        if (r6 != null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
        r6 = (long) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
        r6 = (((long) r7) & 4294967295L) | (((long) java.lang.Integer.parseInt(r6)) << 32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ba, code lost:
        throw new org.xmlpull.p982v1.XmlPullParserException(java.lang.String.format("Couldn't parse versionCodeMajor to int: %s", new java.lang.Object[]{r13.getMessage()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bb, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        throw new org.xmlpull.p982v1.XmlPullParserException(java.lang.String.format("Couldn't parse versionCode to int: %s", new java.lang.Object[]{r13.getMessage()}));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d7, code lost:
        throw new org.xmlpull.p982v1.XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49346a(java.io.File[] r13) throws java.io.IOException, org.xmlpull.p982v1.XmlPullParserException {
        /*
            r12 = this;
            android.content.pm.PackageInfo r0 = r12.mo49348c()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x000f
            long r0 = r0.getLongVersionCode()
            goto L_0x0012
        L_0x000f:
            int r0 = r0.versionCode
            long r0 = (long) r0
        L_0x0012:
            java.lang.Class<android.content.res.AssetManager> r2 = android.content.res.AssetManager.class
            r3 = 0
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ Exception -> 0x00e9 }
            java.lang.reflect.Constructor r5 = r2.getDeclaredConstructor(r5)     // Catch:{ Exception -> 0x00e9 }
            boolean r6 = r5.isAccessible()     // Catch:{ Exception -> 0x00e9 }
            if (r6 != 0) goto L_0x0025
            r5.setAccessible(r4)     // Catch:{ Exception -> 0x00e9 }
        L_0x0025:
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x00e9 }
            java.lang.Object r2 = r5.newInstance(r6)     // Catch:{ Exception -> 0x00e9 }
            android.content.res.AssetManager r2 = (android.content.res.AssetManager) r2
            int r5 = r13.length
        L_0x002e:
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x00e8
            dd.n r6 = r12.f43230c
            r7 = r13[r5]
            r6.getClass()
            java.lang.Class<java.lang.Integer> r8 = java.lang.Integer.class
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            java.lang.String r7 = r7.getPath()
            java.lang.String r10 = "addAssetPath"
            java.lang.Object r7 = p172m9.C5720b.m14045M(r2, r10, r8, r9, r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.String r8 = "AndroidManifest.xml"
            android.content.res.XmlResourceParser r7 = r2.openXmlResourceParser(r7, r8)
            r6.f43226a = r7
            dd.n r6 = r12.f43230c
            android.content.res.XmlResourceParser r7 = r6.f43226a
            if (r7 == 0) goto L_0x00e0
        L_0x005b:
            android.content.res.XmlResourceParser r7 = r6.f43226a
            int r7 = r7.next()
            r8 = 2
            if (r7 == r8) goto L_0x0067
            if (r7 == r4) goto L_0x00d8
            goto L_0x005b
        L_0x0067:
            android.content.res.XmlResourceParser r7 = r6.f43226a
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "manifest"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00d8
            android.content.res.XmlResourceParser r7 = r6.f43226a
            java.lang.String r8 = "http://schemas.android.com/apk/res/android"
            java.lang.String r9 = "versionCode"
            java.lang.String r7 = r7.getAttributeValue(r8, r9)
            android.content.res.XmlResourceParser r6 = r6.f43226a
            java.lang.String r9 = "versionCodeMajor"
            java.lang.String r6 = r6.getAttributeValue(r8, r9)
            if (r7 == 0) goto L_0x00d0
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x00bb }
            if (r6 != 0) goto L_0x0091
            long r6 = (long) r7
            goto L_0x00a1
        L_0x0091:
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x00a6 }
            long r8 = (long) r6
            r6 = 32
            long r8 = r8 << r6
            long r6 = (long) r7
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r10
            long r6 = r6 | r8
        L_0x00a1:
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x002e
            return r3
        L_0x00a6:
            r13 = move-exception
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r13 = r13.getMessage()
            r1[r3] = r13
            java.lang.String r13 = "Couldn't parse versionCodeMajor to int: %s"
            java.lang.String r13 = java.lang.String.format(r13, r1)
            r0.<init>(r13)
            throw r0
        L_0x00bb:
            r13 = move-exception
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r13 = r13.getMessage()
            r1[r3] = r13
            java.lang.String r13 = "Couldn't parse versionCode to int: %s"
            java.lang.String r13 = java.lang.String.format(r13, r1)
            r0.<init>(r13)
            throw r0
        L_0x00d0:
            org.xmlpull.v1.XmlPullParserException r13 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r0 = "Manifest entry doesn't contain 'versionCode' attribute."
            r13.<init>(r0)
            throw r13
        L_0x00d8:
            org.xmlpull.v1.XmlPullParserException r13 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r0 = "Couldn't find manifest entry at top-level."
            r13.<init>(r0)
            throw r13
        L_0x00e0:
            org.xmlpull.v1.XmlPullParserException r13 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r0 = "Manifest file needs to be loaded before parsing."
            r13.<init>(r0)
            throw r13
        L_0x00e8:
            return r4
        L_0x00e9:
            r13 = move-exception
            com.google.android.play.core.internal.zzbx r0 = new com.google.android.play.core.internal.zzbx
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = r2.getName()
            r1[r3] = r2
            java.lang.String r2 = "Failed to invoke default constructor on class %s"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r1, r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p434dd.C16569o.mo49346a(java.io.File[]):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0086, code lost:
        new java.lang.StringBuilder(java.lang.String.valueOf(r3).length() + 32);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo49347b(java.io.File[] r10) {
        /*
            r9 = this;
            android.content.pm.PackageInfo r0 = r9.mo49348c()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x003b
            android.content.pm.Signature[] r3 = r0.signatures
            if (r3 != 0) goto L_0x000d
            goto L_0x003b
        L_0x000d:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.content.pm.Signature[] r0 = r0.signatures
            int r4 = r0.length
            r5 = 0
        L_0x0016:
            if (r5 >= r4) goto L_0x003a
            r6 = r0[r5]
            java.lang.String r7 = "X509"
            java.security.cert.CertificateFactory r7 = java.security.cert.CertificateFactory.getInstance(r7)     // Catch:{ CertificateException -> 0x0030 }
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch:{ CertificateException -> 0x0030 }
            byte[] r6 = r6.toByteArray()     // Catch:{ CertificateException -> 0x0030 }
            r8.<init>(r6)     // Catch:{ CertificateException -> 0x0030 }
            java.security.cert.Certificate r6 = r7.generateCertificate(r8)     // Catch:{ CertificateException -> 0x0030 }
            java.security.cert.X509Certificate r6 = (java.security.cert.X509Certificate) r6     // Catch:{ CertificateException -> 0x0030 }
            goto L_0x0032
        L_0x0030:
            r6 = r2
        L_0x0032:
            if (r6 == 0) goto L_0x0037
            r3.add(r6)
        L_0x0037:
            int r5 = r5 + 1
            goto L_0x0016
        L_0x003a:
            r2 = r3
        L_0x003b:
            if (r2 == 0) goto L_0x00a8
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0044
            goto L_0x00a8
        L_0x0044:
            int r0 = r10.length
        L_0x0045:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x00a6
            r3 = r10[r0]
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ Exception -> 0x00a5 }
            java.security.cert.X509Certificate[][] r4 = com.google.android.play.core.internal.C14345a.m35624a(r3)     // Catch:{ Exception -> 0x0096 }
            if (r4 == 0) goto L_0x0086
            int r5 = r4.length     // Catch:{ Exception -> 0x00a5 }
            if (r5 == 0) goto L_0x0086
            r5 = r4[r1]     // Catch:{ Exception -> 0x00a5 }
            int r5 = r5.length     // Catch:{ Exception -> 0x00a5 }
            if (r5 != 0) goto L_0x005e
            goto L_0x0086
        L_0x005e:
            boolean r3 = r2.isEmpty()     // Catch:{ Exception -> 0x00a5 }
            if (r3 == 0) goto L_0x0065
            goto L_0x00a5
        L_0x0065:
            java.util.Iterator r3 = r2.iterator()     // Catch:{ Exception -> 0x00a5 }
        L_0x0069:
            boolean r5 = r3.hasNext()     // Catch:{ Exception -> 0x00a5 }
            if (r5 == 0) goto L_0x0045
            java.lang.Object r5 = r3.next()     // Catch:{ Exception -> 0x00a5 }
            java.security.cert.X509Certificate r5 = (java.security.cert.X509Certificate) r5     // Catch:{ Exception -> 0x00a5 }
            int r6 = r4.length     // Catch:{ Exception -> 0x00a5 }
            r7 = 0
        L_0x0077:
            if (r7 >= r6) goto L_0x00a5
            r8 = r4[r7]     // Catch:{ Exception -> 0x00a5 }
            r8 = r8[r1]     // Catch:{ Exception -> 0x00a5 }
            boolean r8 = r8.equals(r5)     // Catch:{ Exception -> 0x00a5 }
            if (r8 != 0) goto L_0x0069
            int r7 = r7 + 1
            goto L_0x0077
        L_0x0086:
            java.lang.String r10 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x00a5 }
            int r10 = r10.length()     // Catch:{ Exception -> 0x00a5 }
            int r10 = r10 + 32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a5 }
            r0.<init>(r10)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00a5
        L_0x0096:
            java.lang.String r10 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x00a5 }
            int r10 = r10.length()     // Catch:{ Exception -> 0x00a5 }
            int r10 = r10 + 32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a5 }
            r0.<init>(r10)     // Catch:{ Exception -> 0x00a5 }
        L_0x00a5:
            return r1
        L_0x00a6:
            r10 = 1
            return r10
        L_0x00a8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p434dd.C16569o.mo49347b(java.io.File[]):boolean");
    }

    /* renamed from: c */
    public final PackageInfo mo49348c() {
        if (this.f43231d == null) {
            try {
                this.f43231d = this.f43229b.getPackageManager().getPackageInfo(this.f43229b.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.f43231d;
    }
}
