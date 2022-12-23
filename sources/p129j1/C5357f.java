package p129j1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p116i1.C5240d;

/* renamed from: j1.f */
public class C5357f extends C5363l {

    /* renamed from: a */
    public static Class<?> f17656a = null;

    /* renamed from: b */
    public static Constructor<?> f17657b = null;

    /* renamed from: c */
    public static Method f17658c = null;

    /* renamed from: d */
    public static Method f17659d = null;

    /* renamed from: e */
    public static boolean f17660e = false;

    /* renamed from: g */
    public static boolean m13432g(Object obj, String str, int i, boolean z) {
        m13433h();
        try {
            return ((Boolean) f17658c.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: h */
    public static void m13433h() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f17660e) {
            f17660e = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method2 = null;
                cls = null;
                method = null;
            }
            f17657b = constructor;
            f17656a = cls;
            f17658c = method;
            f17659d = method2;
        }
    }

    /* renamed from: a */
    public Typeface mo21135a(Context context, C5240d.C5243c cVar, Resources resources, int i) {
        m13433h();
        try {
            Object newInstance = f17657b.newInstance(new Object[0]);
            C5240d.C5244d[] dVarArr = cVar.f17352a;
            int length = dVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                C5240d.C5244d dVar = dVarArr[i2];
                File d = C5365m.m13470d(context);
                if (d == null) {
                    return null;
                }
                try {
                    if (!C5365m.m13468b(d, resources, dVar.f17358f)) {
                        d.delete();
                        return null;
                    } else if (!m13432g(newInstance, d.getPath(), dVar.f17354b, dVar.f17355c)) {
                        return null;
                    } else {
                        d.delete();
                        i2++;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    d.delete();
                }
            }
            m13433h();
            try {
                Object newInstance2 = Array.newInstance(f17656a, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f17659d.invoke((Object) null, new Object[]{newInstance2});
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f A[SYNTHETIC, Splitter:B:18:0x004f] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface mo21136b(android.content.Context r4, p190o1.C5920m[] r5, int r6) {
        /*
            r3 = this;
            int r0 = r5.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L_0x0006
            return r1
        L_0x0006:
            o1.m r5 = r3.mo21143f(r6, r5)
            android.content.ContentResolver r6 = r4.getContentResolver()
            android.net.Uri r5 = r5.f19009a     // Catch:{ IOException -> 0x0085 }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r5 = r6.openFileDescriptor(r5, r0, r1)     // Catch:{ IOException -> 0x0085 }
            if (r5 != 0) goto L_0x001e
            if (r5 == 0) goto L_0x001d
            r5.close()     // Catch:{ IOException -> 0x0085 }
        L_0x001d:
            return r1
        L_0x001e:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ErrnoException -> 0x004b }
            r6.<init>()     // Catch:{ ErrnoException -> 0x004b }
            java.lang.String r0 = "/proc/self/fd/"
            r6.append(r0)     // Catch:{ ErrnoException -> 0x004b }
            int r0 = r5.getFd()     // Catch:{ ErrnoException -> 0x004b }
            r6.append(r0)     // Catch:{ ErrnoException -> 0x004b }
            java.lang.String r6 = r6.toString()     // Catch:{ ErrnoException -> 0x004b }
            java.lang.String r6 = android.system.Os.readlink(r6)     // Catch:{ ErrnoException -> 0x004b }
            android.system.StructStat r0 = android.system.Os.stat(r6)     // Catch:{ ErrnoException -> 0x004b }
            int r0 = r0.st_mode     // Catch:{ ErrnoException -> 0x004b }
            boolean r0 = android.system.OsConstants.S_ISREG(r0)     // Catch:{ ErrnoException -> 0x004b }
            if (r0 == 0) goto L_0x004c
            java.io.File r0 = new java.io.File     // Catch:{ ErrnoException -> 0x004b }
            r0.<init>(r6)     // Catch:{ ErrnoException -> 0x004b }
            goto L_0x004d
        L_0x0049:
            r4 = move-exception
            goto L_0x007c
        L_0x004b:
        L_0x004c:
            r0 = r1
        L_0x004d:
            if (r0 == 0) goto L_0x005e
            boolean r6 = r0.canRead()     // Catch:{ all -> 0x0049 }
            if (r6 != 0) goto L_0x0056
            goto L_0x005e
        L_0x0056:
            android.graphics.Typeface r4 = android.graphics.Typeface.createFromFile(r0)     // Catch:{ all -> 0x0049 }
            r5.close()     // Catch:{ IOException -> 0x0085 }
            return r4
        L_0x005e:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x0049 }
            java.io.FileDescriptor r0 = r5.getFileDescriptor()     // Catch:{ all -> 0x0049 }
            r6.<init>(r0)     // Catch:{ all -> 0x0049 }
            android.graphics.Typeface r4 = r3.mo21142c(r4, r6)     // Catch:{ all -> 0x0072 }
            r6.close()     // Catch:{ all -> 0x0049 }
            r5.close()     // Catch:{ IOException -> 0x0085 }
            return r4
        L_0x0072:
            r4 = move-exception
            r6.close()     // Catch:{ all -> 0x0077 }
            goto L_0x007b
        L_0x0077:
            r6 = move-exception
            r4.addSuppressed(r6)     // Catch:{ all -> 0x0049 }
        L_0x007b:
            throw r4     // Catch:{ all -> 0x0049 }
        L_0x007c:
            r5.close()     // Catch:{ all -> 0x0080 }
            goto L_0x0084
        L_0x0080:
            r5 = move-exception
            r4.addSuppressed(r5)     // Catch:{ IOException -> 0x0085 }
        L_0x0084:
            throw r4     // Catch:{ IOException -> 0x0085 }
        L_0x0085:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p129j1.C5357f.mo21136b(android.content.Context, o1.m[], int):android.graphics.Typeface");
    }
}
