package com.google.android.play.core.assetpacks;

import androidx.appcompat.app.C0262r;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* renamed from: com.google.android.play.core.assetpacks.l2 */
public final class C14289l2 {

    /* renamed from: h */
    public static final C0262r f35940h = new C0262r("SliceMetadataManager");

    /* renamed from: a */
    public final byte[] f35941a = new byte[8192];

    /* renamed from: b */
    public final C14243a0 f35942b;

    /* renamed from: c */
    public final String f35943c;

    /* renamed from: d */
    public final int f35944d;

    /* renamed from: e */
    public final long f35945e;

    /* renamed from: f */
    public final String f35946f;

    /* renamed from: g */
    public int f35947g;

    public C14289l2(C14243a0 a0Var, String str, int i, long j, String str2) {
        this.f35942b = a0Var;
        this.f35943c = str;
        this.f35944d = i;
        this.f35945e = j;
        this.f35946f = str2;
        this.f35947g = -1;
    }

    /* renamed from: a */
    public final int mo42855a() throws IOException {
        C14243a0 a0Var = this.f35942b;
        String str = this.f35943c;
        int i = this.f35944d;
        long j = this.f35945e;
        String str2 = this.f35946f;
        a0Var.getClass();
        File file = new File(new File(new File(new File(a0Var.mo42788c(i, j, str), "_slices"), "_metadata"), str2), "checkpoint.dat");
        if (!file.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new zzck("Slice checkpoint file corrupt.");
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* renamed from: b */
    public final C14271h0 mo42856b() throws IOException {
        C14243a0 a0Var = this.f35942b;
        String str = this.f35943c;
        int i = this.f35944d;
        long j = this.f35945e;
        String str2 = this.f35946f;
        a0Var.getClass();
        File file = new File(new File(new File(new File(a0Var.mo42788c(i, j, str), "_slices"), "_metadata"), str2), "checkpoint.dat");
        if (file.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new zzck("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.f35947g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new C14271h0(parseInt, parseInt2, parseLong, parseLong2, property);
                } catch (NumberFormatException e) {
                    throw new zzck("Slice checkpoint file corrupt.", (Exception) e);
                }
            } catch (Throwable unused) {
            }
        } else {
            throw new zzck("Slice checkpoint file does not exist.");
        }
        throw th;
    }

    /* renamed from: c */
    public final File mo42857c() {
        C14243a0 a0Var = this.f35942b;
        String str = this.f35943c;
        int i = this.f35944d;
        long j = this.f35945e;
        String str2 = this.f35946f;
        a0Var.getClass();
        File file = new File(new File(new File(a0Var.mo42788c(i, j, str), "_slices"), "_metadata"), str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, String.format("%s-NAM.dat", new Object[]{Integer.valueOf(this.f35947g)}));
    }

    /* renamed from: d */
    public final void mo42858d(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(mo42857c().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f35947g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo42864j());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* renamed from: e */
    public final void mo42859e(long j, long j2, int i, String str) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", DiskLruCache.VERSION_1);
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f35947g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo42864j());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* renamed from: f */
    public final void mo42860f(int i, byte[] bArr) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f35947g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo42864j());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            C14243a0 a0Var = this.f35942b;
            String str = this.f35943c;
            int i2 = this.f35944d;
            long j = this.f35945e;
            String str2 = this.f35946f;
            a0Var.getClass();
            File file = new File(new File(new File(new File(a0Var.mo42788c(i2, j, str), "_slices"), "_metadata"), str2), "checkpoint_ext.dat");
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
                return;
            } catch (Throwable unused) {
            }
            throw th;
            throw th;
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: g */
    public final void mo42861g(int i) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.f35947g));
        FileOutputStream fileOutputStream = new FileOutputStream(mo42864j());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0059 */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42862h(byte[] r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f35947g
            r1 = 1
            int r0 = r0 + r1
            r11.f35947g = r0
            java.io.File r0 = new java.io.File
            com.google.android.play.core.assetpacks.a0 r2 = r11.f35942b
            java.lang.String r3 = r11.f35943c
            int r4 = r11.f35944d
            long r5 = r11.f35945e
            java.lang.String r7 = r11.f35946f
            r2.getClass()
            java.io.File r8 = new java.io.File
            java.io.File r9 = new java.io.File
            java.io.File r10 = new java.io.File
            java.io.File r2 = r2.mo42788c(r4, r5, r3)
            java.lang.String r3 = "_slices"
            r10.<init>(r2, r3)
            java.lang.String r2 = "_metadata"
            r9.<init>(r10, r2)
            r8.<init>(r9, r7)
            boolean r2 = r8.exists()
            if (r2 != 0) goto L_0x0035
            r8.mkdirs()
        L_0x0035:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r11.f35947g
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "%s-LFH.dat"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            r0.<init>(r8, r1)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x005a }
            r1.<init>(r0)     // Catch:{ IOException -> 0x005a }
            r1.write(r12)     // Catch:{ all -> 0x0055 }
            r1.close()     // Catch:{ IOException -> 0x005a }
            return
        L_0x0055:
            r12 = move-exception
            r1.close()     // Catch:{ all -> 0x0059 }
        L_0x0059:
            throw r12     // Catch:{ IOException -> 0x005a }
        L_0x005a:
            r12 = move-exception
            com.google.android.play.core.assetpacks.zzck r0 = new com.google.android.play.core.assetpacks.zzck
            java.lang.String r1 = "Could not write metadata file."
            r0.<init>((java.lang.String) r1, (java.lang.Exception) r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C14289l2.mo42862h(byte[]):void");
    }

    /* renamed from: i */
    public final void mo42863i(InputStream inputStream, byte[] bArr) throws IOException {
        this.f35947g++;
        FileOutputStream fileOutputStream = new FileOutputStream(mo42857c());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f35941a);
            while (read > 0) {
                fileOutputStream.write(this.f35941a, 0, read);
                read = inputStream.read(this.f35941a);
            }
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* renamed from: j */
    public final File mo42864j() throws IOException {
        C14243a0 a0Var = this.f35942b;
        String str = this.f35943c;
        int i = this.f35944d;
        long j = this.f35945e;
        String str2 = this.f35946f;
        a0Var.getClass();
        File file = new File(new File(new File(new File(a0Var.mo42788c(i, j, str), "_slices"), "_metadata"), str2), "checkpoint.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        return file;
    }
}
