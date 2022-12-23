package oi0;

import java.io.File;
import java.io.IOException;

/* renamed from: oi0.a */
public interface C24628a {

    /* renamed from: a */
    public static final C24629a f62316a = new C24629a();

    /* renamed from: oi0.a$a */
    public class C24629a implements C24628a {
        /* renamed from: a */
        public final void mo60856a(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException(C16530d.m42013f("failed to delete ", file));
            }
        }

        /* renamed from: b */
        public final void mo60857b(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        mo60857b(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        throw new IOException(C16530d.m42013f("failed to delete ", file2));
                    }
                }
                return;
            }
            throw new IOException(C16530d.m42013f("not a readable directory: ", file));
        }

        /* renamed from: c */
        public final void mo60858c(File file, File file2) throws IOException {
            mo60856a(file2);
            if (!file.renameTo(file2)) {
                throw new IOException("failed to rename " + file + " to " + file2);
            }
        }
    }
}
