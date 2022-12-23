package com.veriff.sdk.internal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface aas {

    /* renamed from: a */
    public static final aas f53501a = new aas() {
        /* renamed from: a */
        public aca mo53788a(File file) throws FileNotFoundException {
            return abr.m50513a(file);
        }

        /* renamed from: b */
        public abz mo53790b(File file) throws FileNotFoundException {
            try {
                return abr.m50517b(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return abr.m50517b(file);
            }
        }

        /* renamed from: c */
        public abz mo53791c(File file) throws FileNotFoundException {
            try {
                return abr.m50520c(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return abr.m50520c(file);
            }
        }

        /* renamed from: d */
        public void mo53792d(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException(C16530d.m42013f("failed to delete ", file));
            }
        }

        /* renamed from: e */
        public boolean mo53793e(File file) {
            return file.exists();
        }

        /* renamed from: f */
        public long mo53794f(File file) {
            return file.length();
        }

        /* renamed from: g */
        public void mo53795g(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        mo53795g(file2);
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

        /* renamed from: a */
        public void mo53789a(File file, File file2) throws IOException {
            mo53792d(file2);
            if (!file.renameTo(file2)) {
                throw new IOException("failed to rename " + file + " to " + file2);
            }
        }
    };

    /* renamed from: a */
    aca mo53788a(File file) throws FileNotFoundException;

    /* renamed from: a */
    void mo53789a(File file, File file2) throws IOException;

    /* renamed from: b */
    abz mo53790b(File file) throws FileNotFoundException;

    /* renamed from: c */
    abz mo53791c(File file) throws FileNotFoundException;

    /* renamed from: d */
    void mo53792d(File file) throws IOException;

    /* renamed from: e */
    boolean mo53793e(File file);

    /* renamed from: f */
    long mo53794f(File file);

    /* renamed from: g */
    void mo53795g(File file) throws IOException;
}
