package p030bo.app;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: bo.app.f */
public final class C1571f {

    /* renamed from: a */
    public static final Charset f5674a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static void m4152a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m4152a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException(C16530d.m42013f("failed to delete file: ", file2));
                }
            }
            return;
        }
        throw new IOException(C16530d.m42013f("not a readable directory: ", file));
    }

    /* renamed from: a */
    public static void m4151a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
