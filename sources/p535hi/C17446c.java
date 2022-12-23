package p535hi;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: hi.c */
public final class C17446c {

    /* renamed from: a */
    public static final Charset f44945a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static void m43496a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m43496a(file2);
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
}
