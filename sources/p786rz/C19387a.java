package p786rz;

import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/* renamed from: rz.a */
public final class C19387a {
    /* renamed from: a */
    public static boolean m46669a(BufferedInputStream bufferedInputStream) throws IOException {
        if (bufferedInputStream.markSupported()) {
            bufferedInputStream.mark(1);
            if (bufferedInputStream.read() == -1) {
                return true;
            }
            bufferedInputStream.reset();
            return false;
        }
        throw new IllegalArgumentException("InputStream must support marking");
    }

    /* renamed from: b */
    public static int m46670b(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        if (bArr.length != 0) {
            int i = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return i;
                }
                outputStream.write(bArr, 0, read);
                i += read;
            }
        } else {
            throw new IllegalArgumentException("Cannot use a 0 length buffer");
        }
    }

    /* renamed from: c */
    public static void m46671c(InputStream inputStream, OutputStream outputStream) throws IOException {
        m46670b(inputStream, outputStream, new byte[8192]);
    }

    /* renamed from: d */
    public static byte[] m46672d(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr, i, bArr.length - i);
            if (read > 0) {
                i += read;
                if (i == bArr.length) {
                    byte[] bArr2 = new byte[(bArr.length * 2)];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            } else {
                byte[] bArr3 = new byte[i];
                System.arraycopy(bArr, 0, bArr3, 0, i);
                return bArr3;
            }
        }
    }

    /* renamed from: e */
    public static char[] m46673e(InputStreamReader inputStreamReader) throws IOException {
        char[] cArr = new char[8192];
        int i = 0;
        while (true) {
            int read = inputStreamReader.read(cArr, i, cArr.length - i);
            if (read > 0) {
                i += read;
                if (i == cArr.length) {
                    char[] cArr2 = new char[(cArr.length * 2)];
                    System.arraycopy(cArr, 0, cArr2, 0, i);
                    cArr = cArr2;
                }
            } else {
                char[] cArr3 = new char[i];
                System.arraycopy(cArr, 0, cArr3, 0, i);
                return cArr3;
            }
        }
    }

    /* renamed from: f */
    public static boolean m46674f(File file) {
        if (!file.exists()) {
            return true;
        }
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                if (file2.isDirectory()) {
                    if (!m46676h(file2)) {
                        return false;
                    }
                } else if (!file2.delete()) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalArgumentException(file.getAbsolutePath() + " is not a directory");
    }

    /* renamed from: g */
    public static void m46675g(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (!file2.isFile() || file2.delete()) {
                    i++;
                } else {
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException(file.getAbsolutePath() + " is not a directory");
    }

    /* renamed from: h */
    public static boolean m46676h(File file) {
        return m46674f(file) && file.delete();
    }

    /* renamed from: i */
    public static void m46677i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
