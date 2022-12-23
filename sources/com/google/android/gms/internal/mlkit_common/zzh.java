package com.google.android.gms.internal.mlkit_common;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import com.appboy.support.AppboyFileUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

public final class zzh {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    private static final String[] zzc;
    private static final String[] zzd;

    static {
        String[] strArr = new String[2];
        strArr[0] = "media";
        String str = Build.HARDWARE;
        String str2 = "";
        strArr[1] = true != (str.equals("goldfish") || str.equals("ranchu")) ? str2 : "androidx.test.services.storage.runfiles";
        zzc = strArr;
        String[] strArr2 = new String[3];
        int i = Build.VERSION.SDK_INT;
        strArr2[0] = i <= 25 ? "com.google.android.inputmethod.latin.inputcontent" : str2;
        if (i <= 25) {
            str2 = "com.google.android.inputmethod.latin.dev.inputcontent";
        }
        strArr2[1] = str2;
        strArr2[2] = "com.google.android.apps.docs.storage.legacy";
        zzd = strArr2;
    }

    public static AssetFileDescriptor zza(Context context, Uri uri, String str) throws FileNotFoundException {
        zzg zzg = zzg.zza;
        ContentResolver contentResolver = context.getContentResolver();
        Uri zzc2 = zzc(uri);
        String scheme = zzc2.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(zzc2, "r");
        }
        if ("content".equals(scheme)) {
            if (zzi(context, zzc2, 1, zzg)) {
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(zzc2, "r");
                zzd(openAssetFileDescriptor);
                return openAssetFileDescriptor;
            }
            throw new FileNotFoundException("Can't open content uri.");
        } else if (AppboyFileUtils.FILE_SCHEME.equals(scheme)) {
            AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(zzc2, "r");
            zzd(openAssetFileDescriptor2);
            try {
                zzh(context, openAssetFileDescriptor2.getParcelFileDescriptor(), zzc2, zzg);
                return openAssetFileDescriptor2;
            } catch (FileNotFoundException e) {
                zzf(openAssetFileDescriptor2, e);
                throw e;
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                zzf(openAssetFileDescriptor2, fileNotFoundException);
                throw fileNotFoundException;
            }
        } else {
            throw new FileNotFoundException("Unsupported scheme");
        }
    }

    public static InputStream zzb(Context context, Uri uri) throws FileNotFoundException {
        zzg zzg = zzg.zza;
        ContentResolver contentResolver = context.getContentResolver();
        Uri zzc2 = zzc(uri);
        String scheme = zzc2.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(zzc2);
        }
        if ("content".equals(scheme)) {
            if (zzi(context, zzc2, 1, zzg)) {
                InputStream openInputStream = contentResolver.openInputStream(zzc2);
                zzd(openInputStream);
                return openInputStream;
            }
            throw new FileNotFoundException("Can't open content uri.");
        } else if (AppboyFileUtils.FILE_SCHEME.equals(scheme)) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(zzc2.getPath()).getCanonicalFile()), "r");
                try {
                    zzh(context, openFileDescriptor, zzc2, zzg);
                    return new ParcelFileDescriptor.AutoCloseInputStream(openFileDescriptor);
                } catch (FileNotFoundException e) {
                    zzg(openFileDescriptor, e);
                    throw e;
                } catch (IOException e2) {
                    FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                    fileNotFoundException.initCause(e2);
                    zzg(openFileDescriptor, fileNotFoundException);
                    throw fileNotFoundException;
                }
            } catch (IOException e3) {
                FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
                fileNotFoundException2.initCause(e3);
                throw fileNotFoundException2;
            }
        } else {
            throw new FileNotFoundException("Unsupported scheme");
        }
    }

    private static Uri zzc(Uri uri) {
        return Build.VERSION.SDK_INT < 30 ? Uri.parse(uri.toString()) : uri;
    }

    private static Object zzd(Object obj) throws FileNotFoundException {
        if (obj != null) {
            return obj;
        }
        throw new FileNotFoundException("Content resolver returned null value.");
    }

    private static String zze(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.endsWith("/")) {
            return canonicalPath.concat("/");
        }
        return canonicalPath;
    }

    private static void zzf(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException unused) {
        }
    }

    private static void zzg(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dc A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zzh(android.content.Context r7, android.os.ParcelFileDescriptor r8, android.net.Uri r9, com.google.android.gms.internal.mlkit_common.zzg r10) throws java.io.IOException {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r9 = r9.getPath()
            r0.<init>(r9)
            java.lang.String r9 = r0.getCanonicalPath()
            java.io.FileDescriptor r8 = r8.getFileDescriptor()
            com.google.android.gms.internal.mlkit_common.zzo r8 = com.google.android.gms.internal.mlkit_common.zzo.zza(r8)
            com.google.android.gms.internal.mlkit_common.zzo r0 = com.google.android.gms.internal.mlkit_common.zzo.zzb(r9)
            boolean r1 = r0.zzc
            java.lang.String r2 = "Can't open file: "
            if (r1 == 0) goto L_0x0039
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.String r8 = java.lang.String.valueOf(r9)
            int r9 = r8.length()
            if (r9 == 0) goto L_0x0030
            java.lang.String r8 = r2.concat(r8)
            goto L_0x0035
        L_0x0030:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r2)
        L_0x0035:
            r7.<init>(r8)
            throw r7
        L_0x0039:
            long r3 = r8.zza
            long r5 = r0.zza
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00f3
            long r3 = r8.zzb
            long r0 = r0.zzb
            int r8 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x00f3
            java.lang.String r8 = "/proc/"
            boolean r8 = r9.startsWith(r8)
            if (r8 == 0) goto L_0x0053
            goto L_0x00dd
        L_0x0053:
            java.lang.String r8 = "/data/misc/"
            boolean r8 = r9.startsWith(r8)
            if (r8 != 0) goto L_0x00dd
            boolean unused = r10.zzd
            java.io.File r8 = p090g1.C4732a.getDataDir(r7)
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L_0x0071
            java.lang.String r8 = zze(r8)
            boolean r8 = r9.startsWith(r8)
            if (r8 == 0) goto L_0x0081
            goto L_0x007f
        L_0x0071:
            java.io.File r8 = android.os.Environment.getDataDirectory()
            java.lang.String r8 = zze(r8)
            boolean r8 = r9.startsWith(r8)
            if (r8 == 0) goto L_0x0081
        L_0x007f:
            r0 = 1
            goto L_0x00d6
        L_0x0081:
            android.content.Context r8 = p090g1.C4732a.createDeviceProtectedStorageContext(r7)
            if (r8 == 0) goto L_0x0098
            java.io.File r8 = p090g1.C4732a.getDataDir(r8)
            if (r8 == 0) goto L_0x0098
            java.lang.String r8 = zze(r8)
            boolean r8 = r9.startsWith(r8)
            if (r8 == 0) goto L_0x0098
            goto L_0x007f
        L_0x0098:
            com.google.android.gms.internal.mlkit_common.zzb r8 = new com.google.android.gms.internal.mlkit_common.zzb
            r8.<init>(r7)
            java.io.File[] r8 = zzj(r8)
            int r3 = r8.length
            r4 = 0
        L_0x00a3:
            if (r4 >= r3) goto L_0x00b7
            r5 = r8[r4]
            if (r5 == 0) goto L_0x00b4
            java.lang.String r5 = zze(r5)
            boolean r5 = r9.startsWith(r5)
            if (r5 == 0) goto L_0x00b4
            goto L_0x007f
        L_0x00b4:
            int r4 = r4 + 1
            goto L_0x00a3
        L_0x00b7:
            com.google.android.gms.internal.mlkit_common.zzc r8 = new com.google.android.gms.internal.mlkit_common.zzc
            r8.<init>(r7)
            java.io.File[] r7 = zzj(r8)
            int r8 = r7.length
            r3 = 0
        L_0x00c2:
            if (r3 >= r8) goto L_0x00d6
            r4 = r7[r3]
            if (r4 == 0) goto L_0x00d3
            java.lang.String r4 = zze(r4)
            boolean r4 = r9.startsWith(r4)
            if (r4 == 0) goto L_0x00d3
            goto L_0x007f
        L_0x00d3:
            int r3 = r3 + 1
            goto L_0x00c2
        L_0x00d6:
            boolean r7 = r10.zzc
            if (r0 != r7) goto L_0x00dd
            return
        L_0x00dd:
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            int r8 = r9.length()
            if (r8 == 0) goto L_0x00ea
            java.lang.String r8 = r2.concat(r9)
            goto L_0x00ef
        L_0x00ea:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r2)
        L_0x00ef:
            r7.<init>(r8)
            throw r7
        L_0x00f3:
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException
            java.lang.String r8 = java.lang.String.valueOf(r9)
            int r9 = r8.length()
            if (r9 == 0) goto L_0x0104
            java.lang.String r8 = r2.concat(r8)
            goto L_0x0109
        L_0x0104:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r2)
        L_0x0109:
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_common.zzh.zzh(android.content.Context, android.os.ParcelFileDescriptor, android.net.Uri, com.google.android.gms.internal.mlkit_common.zzg):void");
    }

    private static boolean zzi(Context context, Uri uri, int i, zzg zzg) {
        String authority = uri.getAuthority();
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (resolveContentProvider == null) {
            int lastIndexOf = authority.lastIndexOf(64);
            if (lastIndexOf >= 0) {
                authority = authority.substring(lastIndexOf + 1);
                resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (resolveContentProvider == null) {
                if (!zzg.zzc) {
                    return true;
                }
                return false;
            }
        }
        int zzc2 = zzg.zzc(zzg, context, new zzp(uri, resolveContentProvider, authority)) - 1;
        if (zzc2 == 0) {
            return true;
        }
        if (zzc2 == 1) {
            return false;
        }
        if (context.getPackageName().equals(resolveContentProvider.packageName)) {
            return zzg.zzc;
        }
        if (zzg.zzc) {
            return false;
        }
        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0 && resolveContentProvider.exported) {
            String[] strArr = zzc;
            int length = strArr.length;
            for (int i2 = 0; i2 < 2; i2++) {
                if (strArr[i2].equals(authority)) {
                    return true;
                }
            }
            String[] strArr2 = zzd;
            int length2 = strArr2.length;
            for (int i3 = 0; i3 < 3; i3++) {
                if (strArr2[i3].equals(authority)) {
                    return true;
                }
            }
            String[] strArr3 = zzb;
            for (int i4 = 0; i4 < 6; i4++) {
                String str = strArr3[i4];
                if (str.charAt(str.length() - 1) == '.') {
                    if (resolveContentProvider.packageName.startsWith(str)) {
                        return false;
                    }
                } else if (resolveContentProvider.packageName.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static File[] zzj(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            if (Build.VERSION.SDK_INT < 22) {
                return new File[0];
            }
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
