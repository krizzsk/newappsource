package com.moovit.commons.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import p786rz.C19387a;
import p977zz.C20945j;
import rj0.C24844k;

public final class CompressUtils {

    /* renamed from: a */
    public static final C15760a f41008a = new C15760a();

    public enum CompressionMode {
        UNCOMPRESSED,
        GZIP,
        LZMA
    }

    /* renamed from: com.moovit.commons.utils.CompressUtils$a */
    public class C15760a extends ThreadLocal<byte[]> {
        public final Object initialValue() {
            return new byte[2048];
        }
    }

    /* renamed from: com.moovit.commons.utils.CompressUtils$b */
    public static /* synthetic */ class C15761b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f41009a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.commons.utils.CompressUtils$CompressionMode[] r0 = com.moovit.commons.utils.CompressUtils.CompressionMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f41009a = r0
                com.moovit.commons.utils.CompressUtils$CompressionMode r1 = com.moovit.commons.utils.CompressUtils.CompressionMode.UNCOMPRESSED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f41009a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.commons.utils.CompressUtils$CompressionMode r1 = com.moovit.commons.utils.CompressUtils.CompressionMode.GZIP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f41009a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.commons.utils.CompressUtils$CompressionMode r1 = com.moovit.commons.utils.CompressUtils.CompressionMode.LZMA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.commons.utils.CompressUtils.C15761b.<clinit>():void");
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m40226a(File file, File file2, CompressionMode compressionMode) throws IOException {
        BufferedInputStream bufferedInputStream;
        if (file2.isDirectory() || file2.mkdirs()) {
            File parentFile = file.getParentFile();
            File file3 = new File(parentFile, file.getName() + "_tmp.zip");
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            int i = C15761b.f41009a[compressionMode.ordinal()];
            if (i == 1) {
                bufferedInputStream = new BufferedInputStream(fileInputStream);
            } else if (i == 2) {
                bufferedInputStream = new BufferedInputStream(new GZIPInputStream(fileInputStream));
            } else if (i == 3) {
                bufferedInputStream = new BufferedInputStream(new C24844k(fileInputStream));
            } else {
                throw new IllegalStateException("Unknown compression mode: " + compressionMode);
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            try {
                C19387a.m46670b(bufferedInputStream, bufferedOutputStream, (byte[]) f41008a.get());
                C19387a.m46677i(bufferedOutputStream);
                C19387a.m46677i(bufferedInputStream);
                if (file2.isDirectory() || file2.mkdirs()) {
                    ZipFile zipFile = new ZipFile(file3);
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    HashSet hashSet = new HashSet(zipFile.size());
                    while (entries.hasMoreElements()) {
                        ZipEntry zipEntry = (ZipEntry) entries.nextElement();
                        if (zipEntry.isDirectory()) {
                            File file4 = new File(file2, zipEntry.getName());
                            if (!file4.exists() && !file4.mkdirs()) {
                                StringBuilder k = C13555b.m33972k("Unable to unzip directory: ");
                                k.append(file4.getAbsolutePath());
                                throw new IOException(k.toString());
                            }
                        } else {
                            File file5 = new File(file2, zipEntry.getName());
                            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file5));
                            try {
                                C19387a.m46670b(bufferedInputStream2, bufferedOutputStream2, (byte[]) f41008a.get());
                                C19387a.m46677i(bufferedInputStream2);
                                C19387a.m46677i(bufferedOutputStream2);
                                hashSet.add(file5);
                            } catch (Throwable th) {
                                C19387a.m46677i(bufferedInputStream2);
                                C19387a.m46677i(bufferedOutputStream2);
                                throw th;
                            }
                        }
                    }
                    File[] listFiles = file2.listFiles(new C20945j(hashSet));
                    if (listFiles != null) {
                        Arrays.asList(listFiles);
                    } else {
                        Collections.emptyList();
                    }
                    if (!file3.delete()) {
                        file3.getAbsolutePath();
                        return;
                    }
                    return;
                }
                StringBuilder k2 = C13555b.m33972k("Unable to make target directory: ");
                k2.append(file2.getAbsolutePath());
                throw new IOException(k2.toString());
            } catch (Throwable th2) {
                C19387a.m46677i(bufferedOutputStream);
                C19387a.m46677i(bufferedInputStream);
                throw th2;
            }
        } else {
            StringBuilder k3 = C13555b.m33972k("Unable to make target directory: ");
            k3.append(file2.getAbsolutePath());
            throw new IOException(k3.toString());
        }
    }
}
