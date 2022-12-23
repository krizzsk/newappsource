package ce0;

import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: ce0.j */
public final class C21105j {

    /* renamed from: a */
    public static final List<Class<?>> f52950a = Arrays.asList(new Class[]{LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class});

    /* renamed from: ce0.j$a */
    public class C21106a {
    }

    static {
        new C21106a();
    }

    /* renamed from: a */
    public static void m49396a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static void m49397b(File file) throws IOException {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File b : listFiles) {
                        m49397b(b);
                    }
                } else {
                    return;
                }
            }
            if (!file.delete()) {
                throw new FileNotFoundException(C16530d.m42013f("Failed to delete file: ", file));
            }
        }
    }

    /* renamed from: c */
    public static void m49398c(File file) {
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Files.delete(file.toPath());
            } else if (!file.delete()) {
                file.getName();
            }
        } catch (IOException unused) {
            file.getName();
        }
    }

    /* renamed from: d */
    public static <T> T m49399d(File file) {
        C21117r rVar;
        FileInputStream fileInputStream;
        C21117r rVar2 = null;
        if (!file.exists()) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                rVar = new C21117r(fileInputStream, f52950a);
            } catch (IOException | ClassNotFoundException | Exception unused) {
                rVar = null;
                m49396a(rVar);
                m49396a(fileInputStream);
                try {
                    m49397b(file);
                } catch (IOException unused2) {
                }
                return null;
            } catch (Throwable th) {
                th = th;
                m49396a(rVar2);
                m49396a(fileInputStream);
                throw th;
            }
            try {
                T readObject = rVar.readObject();
                m49396a(rVar);
                m49396a(fileInputStream);
                return readObject;
            } catch (IOException | ClassNotFoundException | Exception unused3) {
                m49396a(rVar);
                m49396a(fileInputStream);
                m49397b(file);
                return null;
            } catch (Throwable th2) {
                th = th2;
                rVar2 = rVar;
                m49396a(rVar2);
                m49396a(fileInputStream);
                throw th;
            }
        } catch (IOException | ClassNotFoundException | Exception unused4) {
            fileInputStream = null;
            rVar = null;
            m49396a(rVar);
            m49396a(fileInputStream);
            m49397b(file);
            return null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
            m49396a(rVar2);
            m49396a(fileInputStream);
            throw th;
        }
    }

    /* renamed from: e */
    public static long m49400e(File file) {
        long j = 0;
        if (file == null || !file.exists()) {
            return 0;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length > 0) {
            for (File e : listFiles) {
                j += m49400e(e);
            }
        }
        return j;
    }

    /* renamed from: f */
    public static void m49401f(File file, Serializable serializable) {
        FileOutputStream fileOutputStream;
        if (file.exists()) {
            m49398c(file);
        }
        if (serializable != null) {
            ObjectOutputStream objectOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream);
                    try {
                        objectOutputStream2.writeObject(serializable);
                        objectOutputStream2.reset();
                        m49396a(objectOutputStream2);
                    } catch (IOException unused) {
                        objectOutputStream = objectOutputStream2;
                        m49396a(objectOutputStream);
                        m49396a(fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        objectOutputStream = objectOutputStream2;
                        m49396a(objectOutputStream);
                        m49396a(fileOutputStream);
                        throw th;
                    }
                } catch (IOException unused2) {
                    m49396a(objectOutputStream);
                    m49396a(fileOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    m49396a(objectOutputStream);
                    m49396a(fileOutputStream);
                    throw th;
                }
            } catch (IOException unused3) {
                fileOutputStream = null;
                m49396a(objectOutputStream);
                m49396a(fileOutputStream);
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
                m49396a(objectOutputStream);
                m49396a(fileOutputStream);
                throw th;
            }
            m49396a(fileOutputStream);
        }
    }
}
