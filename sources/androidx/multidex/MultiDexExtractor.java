package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import com.braze.support.WebContentUtils;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import p166m2.C5665c;
import p988j$.util.Spliterator;

public final class MultiDexExtractor implements Closeable {

    /* renamed from: b */
    public final File f4085b;

    /* renamed from: c */
    public final long f4086c;

    /* renamed from: d */
    public final File f4087d;

    /* renamed from: e */
    public final RandomAccessFile f4088e;

    /* renamed from: f */
    public final FileChannel f4089f;

    /* renamed from: g */
    public final FileLock f4090g;

    public static class ExtractedDex extends File {
        public long crc = -1;

        public ExtractedDex(File file, String str) {
            super(file, str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        r3 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0040 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0041 A[ExcHandler: Error | RuntimeException (e java.lang.Throwable), Splitter:B:1:0x0023] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MultiDexExtractor(java.io.File r3, java.io.File r4) throws java.io.IOException {
        /*
            r2 = this;
            r2.<init>()
            r3.getPath()
            r4.getPath()
            r2.f4085b = r3
            r2.f4087d = r4
            long r0 = m2936c(r3)
            r2.f4086c = r0
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "MultiDex.lock"
            r3.<init>(r4, r0)
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile
            java.lang.String r0 = "rw"
            r4.<init>(r3, r0)
            r2.f4088e = r4
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch:{ IOException -> 0x0045, RuntimeException -> 0x0043, Error -> 0x0041 }
            r2.f4089f = r4     // Catch:{ IOException -> 0x0045, RuntimeException -> 0x0043, Error -> 0x0041 }
            r3.getPath()     // Catch:{ IOException -> 0x003a, RuntimeException -> 0x0038, Error -> 0x0036 }
            java.nio.channels.FileLock r4 = r4.lock()     // Catch:{ IOException -> 0x003a, RuntimeException -> 0x0038, Error -> 0x0036 }
            r2.f4090g = r4     // Catch:{ IOException -> 0x003a, RuntimeException -> 0x0038, Error -> 0x0036 }
            r3.getPath()     // Catch:{ IOException -> 0x0045, RuntimeException -> 0x0043, Error -> 0x0041 }
            return
        L_0x0036:
            r3 = move-exception
            goto L_0x003b
        L_0x0038:
            r3 = move-exception
            goto L_0x003b
        L_0x003a:
            r3 = move-exception
        L_0x003b:
            java.nio.channels.FileChannel r4 = r2.f4089f     // Catch:{ IOException -> 0x0045, RuntimeException -> 0x0043, Error -> 0x0041 }
            r4.close()     // Catch:{ IOException -> 0x0040, RuntimeException -> 0x0043, Error -> 0x0041 }
        L_0x0040:
            throw r3     // Catch:{ IOException -> 0x0045, RuntimeException -> 0x0043, Error -> 0x0041 }
        L_0x0041:
            r3 = move-exception
            goto L_0x0046
        L_0x0043:
            r3 = move-exception
            goto L_0x0046
        L_0x0045:
            r3 = move-exception
        L_0x0046:
            java.io.RandomAccessFile r4 = r2.f4088e
            r4.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.MultiDexExtractor.<init>(java.io.File, java.io.File):void");
    }

    /* renamed from: a */
    public static void m2935a(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(C25541a.m63881k("tmp-", str), WebContentUtils.ZIP_EXTENSION, file.getParentFile());
        createTempFile.getPath();
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[Spliterator.SUBSIZED];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                file.getPath();
                if (createTempFile.renameTo(file)) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } catch (Throwable th) {
            try {
                inputStream.close();
            } catch (IOException unused2) {
            }
            createTempFile.delete();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public static long m2936c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            C5665c.C5666a a = C5665c.m13938a(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = a.f18435b;
            randomAccessFile.seek(a.f18434a);
            int min = (int) Math.min(16384, j);
            byte[] bArr = new byte[Spliterator.SUBSIZED];
            int read = randomAccessFile.read(bArr, 0, min);
            while (true) {
                if (read == -1) {
                    break;
                }
                crc32.update(bArr, 0, read);
                j -= (long) read;
                if (j == 0) {
                    break;
                }
                read = randomAccessFile.read(bArr, 0, (int) Math.min(16384, j));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            if (value == -1) {
                return value - 1;
            }
            return value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    /* renamed from: j */
    public static void m2937j(Context context, long j, long j2, ArrayList arrayList) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong("timestamp", j);
        edit.putLong("crc", j2);
        edit.putInt("dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i = 2;
        while (it.hasNext()) {
            ExtractedDex extractedDex = (ExtractedDex) it.next();
            edit.putLong(C16759e.m42350f("", "dex.crc.", i), extractedDex.crc);
            edit.putLong("" + "dex.time." + i, extractedDex.lastModified());
            i++;
        }
        edit.commit();
    }

    public final void close() throws IOException {
        this.f4090g.release();
        this.f4089f.close();
        this.f4088e.close();
    }

    /* renamed from: e */
    public final ArrayList mo4386e(Context context, boolean z) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2;
        this.f4085b.getPath();
        if (this.f4090g.isValid()) {
            if (!z) {
                File file = this.f4085b;
                long j = this.f4086c;
                SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
                long j2 = sharedPreferences.getLong("timestamp", -1);
                long lastModified = file.lastModified();
                if (lastModified == -1) {
                    lastModified--;
                }
                if (j2 == lastModified && sharedPreferences.getLong("crc", -1) == j) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    try {
                        arrayList = mo4387f(context);
                    } catch (IOException unused) {
                        arrayList2 = mo4388i();
                        long lastModified2 = this.f4085b.lastModified();
                        if (lastModified2 == -1) {
                            lastModified2--;
                        }
                        m2937j(context, lastModified2, this.f4086c, arrayList2);
                    }
                    arrayList.size();
                    return arrayList;
                }
            }
            arrayList2 = mo4388i();
            long lastModified3 = this.f4085b.lastModified();
            if (lastModified3 == -1) {
                lastModified3--;
            }
            m2937j(context, lastModified3, this.f4086c, arrayList2);
            arrayList = arrayList2;
            arrayList.size();
            return arrayList;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    /* renamed from: f */
    public final ArrayList mo4387f(Context context) throws IOException {
        MultiDexExtractor multiDexExtractor = this;
        String str = multiDexExtractor.f4085b.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            ExtractedDex extractedDex = new ExtractedDex(multiDexExtractor.f4087d, C25541a.m63878h(str, i2, WebContentUtils.ZIP_EXTENSION));
            if (extractedDex.isFile()) {
                extractedDex.crc = m2936c(extractedDex);
                long j = sharedPreferences.getLong(C16759e.m42350f("", "dex.crc.", i2), -1);
                long j2 = sharedPreferences.getLong(C16759e.m42350f("", "dex.time.", i2), -1);
                long lastModified = extractedDex.lastModified();
                if (j2 == lastModified) {
                    String str2 = str;
                    if (j == extractedDex.crc) {
                        arrayList.add(extractedDex);
                        i2++;
                        multiDexExtractor = this;
                        str = str2;
                    }
                }
                throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"" + "" + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + extractedDex.crc);
            }
            StringBuilder k = C13555b.m33972k("Missing extracted secondary dex file '");
            k.append(extractedDex.getPath());
            k.append("'");
            throw new IOException(k.toString());
        }
        return arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r7.getAbsolutePath();
        r8 = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0091 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList mo4388i() throws java.io.IOException {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r10.f4085b
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = ".classes"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = r10.f4087d
            m2.b r2 = new m2.b
            r2.<init>()
            java.io.File[] r1 = r1.listFiles(r2)
            r2 = 0
            if (r1 != 0) goto L_0x002b
            java.io.File r1 = r10.f4087d
            r1.getPath()
            goto L_0x0047
        L_0x002b:
            int r3 = r1.length
            r4 = 0
        L_0x002d:
            if (r4 >= r3) goto L_0x0047
            r5 = r1[r4]
            r5.getPath()
            r5.length()
            boolean r6 = r5.delete()
            if (r6 != 0) goto L_0x0041
            r5.getPath()
            goto L_0x0044
        L_0x0041:
            r5.getPath()
        L_0x0044:
            int r4 = r4 + 1
            goto L_0x002d
        L_0x0047:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile
            java.io.File r4 = r10.f4085b
            r3.<init>(r4)
            r4 = 2
            java.lang.String r5 = "classes2.dex"
            java.util.zip.ZipEntry r5 = r3.getEntry(r5)     // Catch:{ all -> 0x00f5 }
        L_0x005a:
            if (r5 == 0) goto L_0x00f1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r6.<init>()     // Catch:{ all -> 0x00f5 }
            r6.append(r0)     // Catch:{ all -> 0x00f5 }
            r6.append(r4)     // Catch:{ all -> 0x00f5 }
            java.lang.String r7 = ".zip"
            r6.append(r7)     // Catch:{ all -> 0x00f5 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00f5 }
            androidx.multidex.MultiDexExtractor$ExtractedDex r7 = new androidx.multidex.MultiDexExtractor$ExtractedDex     // Catch:{ all -> 0x00f5 }
            java.io.File r8 = r10.f4087d     // Catch:{ all -> 0x00f5 }
            r7.<init>(r8, r6)     // Catch:{ all -> 0x00f5 }
            r1.add(r7)     // Catch:{ all -> 0x00f5 }
            r7.toString()     // Catch:{ all -> 0x00f5 }
            r6 = 0
            r8 = 0
        L_0x007f:
            r9 = 3
            if (r6 >= r9) goto L_0x00aa
            if (r8 != 0) goto L_0x00aa
            int r6 = r6 + 1
            m2935a(r3, r5, r7, r0)     // Catch:{ all -> 0x00f5 }
            long r8 = m2936c(r7)     // Catch:{ IOException -> 0x0091 }
            r7.crc = r8     // Catch:{ IOException -> 0x0091 }
            r8 = 1
            goto L_0x0095
        L_0x0091:
            r7.getAbsolutePath()     // Catch:{ all -> 0x00f5 }
            r8 = 0
        L_0x0095:
            r7.getAbsolutePath()     // Catch:{ all -> 0x00f5 }
            r7.length()     // Catch:{ all -> 0x00f5 }
            if (r8 != 0) goto L_0x007f
            r7.delete()     // Catch:{ all -> 0x00f5 }
            boolean r9 = r7.exists()     // Catch:{ all -> 0x00f5 }
            if (r9 == 0) goto L_0x007f
            r7.getPath()     // Catch:{ all -> 0x00f5 }
            goto L_0x007f
        L_0x00aa:
            if (r8 == 0) goto L_0x00c9
            int r4 = r4 + 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r5.<init>()     // Catch:{ all -> 0x00f5 }
            java.lang.String r6 = "classes"
            r5.append(r6)     // Catch:{ all -> 0x00f5 }
            r5.append(r4)     // Catch:{ all -> 0x00f5 }
            java.lang.String r6 = ".dex"
            r5.append(r6)     // Catch:{ all -> 0x00f5 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00f5 }
            java.util.zip.ZipEntry r5 = r3.getEntry(r5)     // Catch:{ all -> 0x00f5 }
            goto L_0x005a
        L_0x00c9:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00f5 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f5 }
            r1.<init>()     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = "Could not create zip file "
            r1.append(r2)     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = r7.getAbsolutePath()     // Catch:{ all -> 0x00f5 }
            r1.append(r2)     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = " for secondary dex ("
            r1.append(r2)     // Catch:{ all -> 0x00f5 }
            r1.append(r4)     // Catch:{ all -> 0x00f5 }
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f5 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f5 }
            throw r0     // Catch:{ all -> 0x00f5 }
        L_0x00f1:
            r3.close()     // Catch:{ IOException -> 0x00f4 }
        L_0x00f4:
            return r1
        L_0x00f5:
            r0 = move-exception
            r3.close()     // Catch:{ IOException -> 0x00f9 }
        L_0x00f9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.MultiDexExtractor.mo4388i():java.util.ArrayList");
    }
}
