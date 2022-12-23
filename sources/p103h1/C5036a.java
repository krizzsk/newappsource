package p103h1;

import android.content.p013pm.SigningInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* renamed from: h1.a */
public final class C5036a {
    /* renamed from: a */
    public static Signature[] m12861a(SigningInfo signingInfo) {
        return signingInfo.getApkContentsSigners();
    }

    /* renamed from: b */
    public static long m12862b(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    /* renamed from: c */
    public static Signature[] m12863c(SigningInfo signingInfo) {
        return signingInfo.getSigningCertificateHistory();
    }

    /* renamed from: d */
    public static boolean m12864d(SigningInfo signingInfo) {
        return signingInfo.hasMultipleSigners();
    }

    /* renamed from: e */
    public static boolean m12865e(PackageManager packageManager, String str, byte[] bArr, int i) {
        return packageManager.hasSigningCertificate(str, bArr, i);
    }
}
