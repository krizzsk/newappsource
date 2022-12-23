package p098g9;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: g9.a */
public final class C4847a implements C4849b {

    /* renamed from: g9.a$a */
    public static class C4848a {

        /* renamed from: a */
        public ZipFile f16275a;

        /* renamed from: b */
        public ZipEntry f16276b;

        public C4848a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f16275a = zipFile;
            this.f16276b = zipEntry;
        }
    }

    /* renamed from: a */
    public static void m12168a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static C4848a m12169b(Context context, String[] strArr, String str, C4853f fVar) {
        String[] strArr2 = strArr;
        String[] d = m12171d(context);
        int length = d.length;
        char c = 0;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            String str2 = d[i];
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i2 = i3;
                }
            }
            if (zipFile == null) {
                String str3 = str;
                C4853f fVar2 = fVar;
            } else {
                int i4 = 0;
                while (true) {
                    int i5 = i4 + 1;
                    if (i4 < 5) {
                        int length2 = strArr2.length;
                        int i6 = 0;
                        while (i6 < length2) {
                            String str4 = strArr2[i6];
                            StringBuilder k = C13555b.m33972k("lib");
                            k.append(File.separatorChar);
                            k.append(str4);
                            k.append(File.separatorChar);
                            k.append(str);
                            String sb = k.toString();
                            Object[] objArr = new Object[2];
                            objArr[c] = sb;
                            objArr[1] = str2;
                            fVar.mo20339c("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(sb);
                            if (entry != null) {
                                return new C4848a(zipFile, entry);
                            }
                            i6++;
                            c = 0;
                        }
                        String str5 = str;
                        C4853f fVar3 = fVar;
                        c = 0;
                        i4 = i5;
                    } else {
                        String str6 = str;
                        C4853f fVar4 = fVar;
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i++;
            c = 0;
        }
    }

    /* renamed from: c */
    public static String[] m12170c(Context context, String str) {
        StringBuilder k = C13555b.m33972k("lib");
        k.append(File.separatorChar);
        k.append("([^\\");
        k.append(File.separatorChar);
        k.append("]*)");
        k.append(File.separatorChar);
        k.append(str);
        Pattern compile = Pattern.compile(k.toString());
        HashSet hashSet = new HashSet();
        for (String file : m12171d(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(file), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(((ZipEntry) entries.nextElement()).getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    /* renamed from: d */
    public static String[] m12171d(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}
