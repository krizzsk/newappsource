package com.umo.ads.p344g;

import ac0.C7557a;
import android.content.Context;
import bf0.C21049c;
import ce0.C21100e;
import com.braze.support.WebContentUtils;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerType;
import com.cubic.umo.p045ad.types.AKPlaceholderMapping;
import com.cubic.umo.p045ad.types.AKPlaceholders;
import com.umo.ads.p351v.zza;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p061d7.C4402a;
import p584jl.C17885a;
import wb0.C13233c;
import zb0.C13364a;

/* renamed from: com.umo.ads.g.zzl */
public final class zzl {

    /* renamed from: a */
    public final AKPlaceholders f30791a;

    /* renamed from: b */
    public final String f30792b;

    /* renamed from: c */
    public final File f30793c;

    /* renamed from: d */
    public final String f30794d;

    /* renamed from: e */
    public String f30795e;

    /* renamed from: f */
    public String f30796f;

    /* renamed from: g */
    public final String f30797g;

    /* renamed from: h */
    public File f30798h;

    /* renamed from: i */
    public final int f30799i;

    /* renamed from: j */
    public final int f30800j;

    /* renamed from: k */
    public final String f30801k;

    /* renamed from: l */
    public final String f30802l;

    /* renamed from: com.umo.ads.g.zzl$a */
    public /* synthetic */ class C12082a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f30803a;

        static {
            int[] iArr = new int[UMOAdKitBannerType.values().length];
            iArr[UMOAdKitBannerType.ADAPTIVE_GWxAH.ordinal()] = 1;
            iArr[UMOAdKitBannerType.SMART_SWxH.ordinal()] = 2;
            f30803a = iArr;
            int[] iArr2 = new int[C17885a.m44417O0(3).length];
            iArr2[1] = 1;
            iArr2[2] = 2;
        }
    }

    /* renamed from: com.umo.ads.g.zzl$b */
    public static final class C12083b {

        /* renamed from: a */
        public final ZipEntry f30804a;

        /* renamed from: b */
        public final File f30805b;

        public C12083b(ZipEntry zipEntry, File file) {
            C24362h.m61211f(zipEntry, "entry");
            this.f30804a = zipEntry;
            this.f30805b = file;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12083b)) {
                return false;
            }
            C12083b bVar = (C12083b) obj;
            return C24362h.m61206a(this.f30804a, bVar.f30804a) && C24362h.m61206a(this.f30805b, bVar.f30805b);
        }

        public final int hashCode() {
            return this.f30805b.hashCode() + (this.f30804a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder J0 = C21100e.m49315J0("ZipIO(entry=");
            J0.append(this.f30804a);
            J0.append(", output=");
            J0.append(this.f30805b);
            J0.append(')');
            return J0.toString();
        }
    }

    /* renamed from: com.umo.ads.g.zzl$zzc */
    public static final class zzc extends Lambda implements C24236l<ZipEntry, C12083b> {
        public final /* synthetic */ File zza;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public zzc(File file) {
            super(1);
            this.zza = file;
        }

        public final Object invoke(Object obj) {
            ZipEntry zipEntry = (ZipEntry) obj;
            return new C12083b(zipEntry, new File(this.zza.getAbsolutePath() + File.separator + zipEntry.getName()));
        }
    }

    /* renamed from: com.umo.ads.g.zzl$zzd */
    public static final class zzd extends Lambda implements C24236l<C12083b, C12083b> {

        /* renamed from: f */
        public static final zzd f30806f = new zzd();

        public zzd() {
            super(1);
        }

        public final Object invoke(Object obj) {
            C12083b bVar = (C12083b) obj;
            C24362h.m61211f(bVar, "it");
            File parentFile = bVar.f30805b.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
            return bVar;
        }
    }

    /* renamed from: com.umo.ads.g.zzl$zze */
    public static final class zze extends Lambda implements C24236l<C12083b, Boolean> {

        /* renamed from: f */
        public static final zze f30807f = new zze();

        public zze() {
            super(1);
        }

        public final Object invoke(Object obj) {
            C12083b bVar = (C12083b) obj;
            C24362h.m61211f(bVar, "it");
            return Boolean.valueOf(!bVar.f30804a.isDirectory());
        }
    }

    public zzl(AKPlaceholders aKPlaceholders) {
        String str;
        this.f30791a = aKPlaceholders;
        if (aKPlaceholders == null) {
            str = null;
        } else {
            str = aKPlaceholders.getPackagePath();
        }
        this.f30792b = str;
        this.f30793c = C13233c.m33333b().getCacheDir();
        this.f30794d = "umo_ad_kit_assets";
        this.f30795e = "";
        this.f30796f = "";
        this.f30797g = WebContentUtils.ZIP_EXTENSION;
        this.f30799i = 30;
        this.f30800j = 30;
        this.f30801k = "GENERIC";
        this.f30802l = "UMOAK_PREFS_PLACEHOLDERS_VERSION";
    }

    /* renamed from: b */
    public static String m32037b(UMOAdKitBannerType uMOAdKitBannerType) {
        String str;
        int i = C12082a.f30803a[uMOAdKitBannerType.ordinal()];
        if (i != 1 && i != 2) {
            return uMOAdKitBannerType.name();
        }
        int M0 = C17885a.m44413M0(C13364a.m33640c());
        if (M0 == 1) {
            str = "_PORTRAIT";
        } else if (M0 != 2) {
            str = "";
        } else {
            str = "_LANDSCAPE";
        }
        return C24362h.m61216k(str, uMOAdKitBannerType.name());
    }

    /* renamed from: d */
    public static final void m32038d(zzl zzl) {
        zzl.getClass();
        File file = new File(zzl.mo35778a());
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    /* renamed from: e */
    public static final void m32039e(zzl zzl, String str) {
        String str2;
        if (!C12954d.m32800c(str)) {
            str2 = zzl.f30797g;
        } else {
            str2 = C24362h.m61216k(str, ".");
        }
        zzl.f30798h = new File(zzl.mo35778a(), C13555b.m33971j(new Object[]{zzl.f30796f, str2}, 2, "%s%s", "format(format, *args)"));
    }

    /* renamed from: f */
    public static void m32040f(File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            int i = 0;
            int length = listFiles.length;
            while (i < length) {
                File file2 = listFiles[i];
                i++;
                C24362h.m61210e(file2, "child");
                m32040f(file2);
            }
        }
        C7557a.f23040a.mo6666c(C24362h.m61216k(file.getAbsolutePath(), "PLACEHOLDER: Deleting File: "));
        file.delete();
    }

    /* renamed from: g */
    public static boolean m32041g(String str) {
        boolean exists = new File(str).exists();
        Logger logger = C7557a.f23040a;
        logger.mo6666c("Placeholder File Exists: " + exists + " (" + str + ')');
        return exists;
    }

    /* renamed from: h */
    public static int m32042h(String str) {
        if (str == null) {
            return 0;
        }
        Context b = C13233c.m33333b();
        return b.getResources().getIdentifier(str, "drawable", b.getPackageName());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        p584jl.C17885a.m44462t(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0085, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        p584jl.C17885a.m44462t(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0089, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0092, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0093, code lost:
        p584jl.C17885a.m44462t(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0096, code lost:
        throw r0;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m32043j(java.io.File r5) {
        /*
            java.io.File r0 = r5.getParentFile()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.io.File r0 = new java.io.File
            java.io.File r1 = r5.getParentFile()
            mf0.C24362h.m61208c(r1)
            java.lang.String r1 = r1.getAbsolutePath()
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0020
            r0.mkdirs()
        L_0x0020:
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile
            r1.<init>(r5)
            java.util.Enumeration r5 = r1.entries()     // Catch:{ all -> 0x0090 }
            java.lang.String r2 = "zip\n                .entries()"
            mf0.C24362h.m61210e(r5, r2)     // Catch:{ all -> 0x0090 }
            cf0.k r2 = new cf0.k     // Catch:{ all -> 0x0090 }
            r2.<init>(r5)     // Catch:{ all -> 0x0090 }
            th0.h r5 = kotlin.sequences.SequencesKt__SequencesKt.m60537X(r2)     // Catch:{ all -> 0x0090 }
            com.umo.ads.g.zzl$zzc r2 = new com.umo.ads.g.zzl$zzc     // Catch:{ all -> 0x0090 }
            r2.<init>(r0)     // Catch:{ all -> 0x0090 }
            th0.n r5 = kotlin.sequences.C24177b.m60549j0(r5, r2)     // Catch:{ all -> 0x0090 }
            com.umo.ads.g.zzl$zzd r0 = com.umo.ads.p344g.zzl.zzd.f30806f     // Catch:{ all -> 0x0090 }
            th0.n r5 = kotlin.sequences.C24177b.m60549j0(r5, r0)     // Catch:{ all -> 0x0090 }
            com.umo.ads.g.zzl$zze r0 = com.umo.ads.p344g.zzl.zze.f30807f     // Catch:{ all -> 0x0090 }
            th0.e r5 = kotlin.sequences.C24177b.m60543d0(r5, r0)     // Catch:{ all -> 0x0090 }
            th0.e$a r0 = new th0.e$a     // Catch:{ all -> 0x0090 }
            r0.<init>(r5)     // Catch:{ all -> 0x0090 }
        L_0x0051:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x0090 }
            r2 = 0
            if (r5 == 0) goto L_0x008a
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x0090 }
            com.umo.ads.g.zzl$b r5 = (com.umo.ads.p344g.zzl.C12083b) r5     // Catch:{ all -> 0x0090 }
            java.util.zip.ZipEntry r3 = r5.f30804a     // Catch:{ all -> 0x0090 }
            java.io.File r5 = r5.f30805b     // Catch:{ all -> 0x0090 }
            java.io.InputStream r3 = r1.getInputStream(r3)     // Catch:{ all -> 0x0090 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0083 }
            r4.<init>(r5)     // Catch:{ all -> 0x0083 }
            java.lang.String r5 = "input"
            mf0.C24362h.m61210e(r3, r5)     // Catch:{ all -> 0x007c }
            p583jk.C17884p.m44377q(r3, r4)     // Catch:{ all -> 0x007c }
            bf0.d r5 = bf0.C21050d.f52856a     // Catch:{ all -> 0x007c }
            p584jl.C17885a.m44462t(r4, r2)     // Catch:{ all -> 0x0083 }
            p584jl.C17885a.m44462t(r3, r2)     // Catch:{ all -> 0x0090 }
            goto L_0x0051
        L_0x007c:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x007e }
        L_0x007e:
            r0 = move-exception
            p584jl.C17885a.m44462t(r4, r5)     // Catch:{ all -> 0x0083 }
            throw r0     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            p584jl.C17885a.m44462t(r3, r5)     // Catch:{ all -> 0x0090 }
            throw r0     // Catch:{ all -> 0x0090 }
        L_0x008a:
            bf0.d r5 = bf0.C21050d.f52856a     // Catch:{ all -> 0x0090 }
            p584jl.C17885a.m44462t(r1, r2)
            return
        L_0x0090:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            p584jl.C17885a.m44462t(r1, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umo.ads.p344g.zzl.m32043j(java.io.File):void");
    }

    /* renamed from: a */
    public final String mo35778a() {
        return this.f30793c.getAbsolutePath() + File.separator + this.f30794d;
    }

    /* renamed from: c */
    public final void mo35779c() {
        String str;
        String str2;
        Logger logger = C7557a.f23040a;
        StringBuilder J0 = C21100e.m49315J0("PLACEHOLDER: Saving Placeholder Package Version in Local Cache: ");
        AKPlaceholders aKPlaceholders = this.f30791a;
        if (aKPlaceholders == null) {
            str = null;
        } else {
            str = aKPlaceholders.getVersion();
        }
        J0.append(str);
        J0.append('.');
        logger.mo6672i(J0.toString());
        C21049c cVar = zza.f30891a;
        String str3 = this.f30802l;
        AKPlaceholders aKPlaceholders2 = this.f30791a;
        if (aKPlaceholders2 == null || (str2 = aKPlaceholders2.getVersion()) == null) {
            str2 = "";
        }
        zza.m32115b(str3, str2);
    }

    /* renamed from: i */
    public final Pair<String, String> mo35780i(UMOAdKitBannerType uMOAdKitBannerType) {
        Map<String, String> map;
        C4402a aVar = C13233c.f32844c;
        if (aVar == null || (map = aVar.f15462h) == null) {
            return new Pair<>("", "");
        }
        return new Pair<>(map.get(m32037b(uMOAdKitBannerType)), map.get(this.f30801k));
    }

    /* renamed from: k */
    public final String mo35781k(String str) {
        List<AKPlaceholderMapping> mappings;
        AKPlaceholders aKPlaceholders = this.f30791a;
        if (aKPlaceholders == null || (mappings = aKPlaceholders.getMappings()) == null) {
            return null;
        }
        for (AKPlaceholderMapping next : mappings) {
            if (C24362h.m61206a(str, next.getBannerType()) && C12954d.m32800c(next.getPlaceholder())) {
                String placeholder = next.getPlaceholder();
                C24362h.m61208c(placeholder);
                return placeholder;
            }
        }
        return null;
    }

    /* renamed from: l */
    public final boolean mo35782l(File file) {
        try {
            Logger logger = C7557a.f23040a;
            logger.mo6666c("PLACEHOLDER: Unzipping Package (" + file.getAbsolutePath() + ")...");
            m32043j(file);
            Logger logger2 = C7557a.f23040a;
            logger2.mo6672i("PLACEHOLDER: Unzipping Package Successful (" + file.getAbsolutePath() + ')');
            mo35779c();
            return true;
        } catch (ZipException e) {
            Logger logger3 = C7557a.f23040a;
            StringBuilder J0 = C21100e.m49315J0("PLACEHOLDER: ZipException while Unzipping Package (Exception: ");
            J0.append(e.getLocalizedMessage());
            J0.append(')');
            logger3.mo6667d(J0.toString());
            return false;
        } catch (IOException e2) {
            Logger logger4 = C7557a.f23040a;
            StringBuilder J02 = C21100e.m49315J0("PLACEHOLDER: IOException while Unzipping Package (Exception: ");
            J02.append(e2.getLocalizedMessage());
            J02.append(')');
            logger4.mo6667d(J02.toString());
            return false;
        }
    }

    /* renamed from: m */
    public final String mo35783m(String str) {
        if (!C12954d.m32800c(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(mo35778a());
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(this.f30796f);
        sb.append(sb2.toString());
        sb.append(str2);
        sb.append(str);
        String sb3 = sb.toString();
        if (m32041g(sb3)) {
            return sb3;
        }
        return null;
    }
}
