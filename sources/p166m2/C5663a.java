package p166m2;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: m2.a */
public final class C5663a {

    /* renamed from: a */
    public static final HashSet f18432a = new HashSet();

    /* renamed from: b */
    public static final boolean f18433b;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r2 < 1) goto L_0x0042;
     */
    static {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            f18432a = r0
            java.lang.String r0 = "java.vm.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 1
            if (r0 == 0) goto L_0x0042
            java.util.StringTokenizer r2 = new java.util.StringTokenizer
            java.lang.String r3 = "."
            r2.<init>(r0, r3)
            boolean r0 = r2.hasMoreTokens()
            r3 = 0
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r2.nextToken()
            goto L_0x0024
        L_0x0023:
            r0 = r3
        L_0x0024:
            boolean r4 = r2.hasMoreTokens()
            if (r4 == 0) goto L_0x002e
            java.lang.String r3 = r2.nextToken()
        L_0x002e:
            if (r0 == 0) goto L_0x0042
            if (r3 == 0) goto L_0x0042
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0042 }
            int r2 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0042 }
            r3 = 2
            if (r0 > r3) goto L_0x0043
            if (r0 != r3) goto L_0x0042
            if (r2 < r1) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r1 = 0
        L_0x0043:
            f18433b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p166m2.C5663a.<clinit>():void");
    }

    /* renamed from: a */
    public static void m13933a(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            file.getPath();
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                file.getPath();
                return;
            }
            for (File file2 : listFiles) {
                file2.getPath();
                file2.length();
                if (!file2.delete()) {
                    file2.getPath();
                } else {
                    file2.getPath();
                }
            }
            if (!file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0028 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0033 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x006c */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0023 A[Catch:{ all -> 0x0055 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0025 A[SYNTHETIC, Splitter:B:20:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0066 A[SYNTHETIC, Splitter:B:43:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0068 A[Catch:{ all -> 0x0055 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m13934b(android.content.Context r6, java.io.File r7, java.io.File r8) throws java.io.IOException, java.lang.IllegalArgumentException, java.lang.IllegalAccessException, java.lang.NoSuchFieldException, java.lang.reflect.InvocationTargetException, java.lang.NoSuchMethodException, java.lang.SecurityException, java.lang.ClassNotFoundException, java.lang.InstantiationException {
        /*
            java.lang.String r0 = "secondary-dexes"
            java.util.HashSet r1 = f18432a
            monitor-enter(r1)
            boolean r2 = r1.contains(r7)     // Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x000d
            monitor-exit(r1)     // Catch:{ all -> 0x006d }
            return
        L_0x000d:
            r1.add(r7)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = "java.vm.version"
            java.lang.System.getProperty(r2)     // Catch:{ all -> 0x006d }
            r2 = 0
            java.lang.ClassLoader r3 = r6.getClassLoader()     // Catch:{ RuntimeException -> 0x001f }
            boolean r4 = r3 instanceof dalvik.system.BaseDexClassLoader     // Catch:{ all -> 0x006d }
            if (r4 == 0) goto L_0x0020
            goto L_0x0021
        L_0x001f:
        L_0x0020:
            r3 = r2
        L_0x0021:
            if (r3 != 0) goto L_0x0025
            monitor-exit(r1)     // Catch:{ all -> 0x006d }
            return
        L_0x0025:
            m13933a(r6)     // Catch:{ all -> 0x0028 }
        L_0x0028:
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x006d }
            java.lang.String r5 = "code_cache"
            r4.<init>(r8, r5)     // Catch:{ all -> 0x006d }
            m13937e(r4)     // Catch:{ IOException -> 0x0033 }
            goto L_0x003f
        L_0x0033:
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x006d }
            java.io.File r8 = r6.getFilesDir()     // Catch:{ all -> 0x006d }
            r4.<init>(r8, r5)     // Catch:{ all -> 0x006d }
            m13937e(r4)     // Catch:{ all -> 0x006d }
        L_0x003f:
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x006d }
            r8.<init>(r4, r0)     // Catch:{ all -> 0x006d }
            m13937e(r8)     // Catch:{ all -> 0x006d }
            androidx.multidex.MultiDexExtractor r0 = new androidx.multidex.MultiDexExtractor     // Catch:{ all -> 0x006d }
            r0.<init>(r7, r8)     // Catch:{ all -> 0x006d }
            r7 = 0
            java.util.ArrayList r7 = r0.mo4386e(r6, r7)     // Catch:{ all -> 0x0055 }
            m13936d(r8, r3, r7)     // Catch:{ IOException -> 0x0057 }
            goto L_0x005f
        L_0x0055:
            r6 = move-exception
            goto L_0x0069
        L_0x0057:
            r7 = 1
            java.util.ArrayList r6 = r0.mo4386e(r6, r7)     // Catch:{ all -> 0x0055 }
            m13936d(r8, r3, r6)     // Catch:{ all -> 0x0055 }
        L_0x005f:
            r0.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0064
        L_0x0063:
            r2 = move-exception
        L_0x0064:
            if (r2 != 0) goto L_0x0068
            monitor-exit(r1)     // Catch:{ all -> 0x006d }
            return
        L_0x0068:
            throw r2     // Catch:{ all -> 0x006d }
        L_0x0069:
            r0.close()     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            throw r6     // Catch:{ all -> 0x006d }
        L_0x006d:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x006d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p166m2.C5663a.m13934b(android.content.Context, java.io.File, java.io.File):void");
    }

    /* renamed from: c */
    public static Field m13935c(Object obj, String str) throws NoSuchFieldException {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        StringBuilder l = C13555b.m33973l("Field ", str, " not found in ");
        l.append(obj.getClass());
        throw new NoSuchFieldException(l.toString());
    }

    /* renamed from: d */
    public static void m13936d(File file, ClassLoader classLoader, ArrayList arrayList) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        IOException[] iOExceptionArr;
        if (!arrayList.isEmpty()) {
            Object obj = m13935c(classLoader, "pathList").get(classLoader);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(arrayList);
            Class[] clsArr = {ArrayList.class, File.class, ArrayList.class};
            Class cls = obj.getClass();
            while (cls != null) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod("makeDexElements", clsArr);
                    if (!declaredMethod.isAccessible()) {
                        declaredMethod.setAccessible(true);
                    }
                    Object[] objArr = (Object[]) declaredMethod.invoke(obj, new Object[]{arrayList3, file, arrayList2});
                    Field c = m13935c(obj, "dexElements");
                    Object[] objArr2 = (Object[]) c.get(obj);
                    Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
                    System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
                    System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
                    c.set(obj, objArr3);
                    if (arrayList2.size() > 0) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            IOException iOException = (IOException) it.next();
                        }
                        Field c2 = m13935c(obj, "dexElementsSuppressedExceptions");
                        IOException[] iOExceptionArr2 = (IOException[]) c2.get(obj);
                        if (iOExceptionArr2 == null) {
                            iOExceptionArr = (IOException[]) arrayList2.toArray(new IOException[arrayList2.size()]);
                        } else {
                            IOException[] iOExceptionArr3 = new IOException[(arrayList2.size() + iOExceptionArr2.length)];
                            arrayList2.toArray(iOExceptionArr3);
                            System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList2.size(), iOExceptionArr2.length);
                            iOExceptionArr = iOExceptionArr3;
                        }
                        c2.set(obj, iOExceptionArr);
                        IOException iOException2 = new IOException("I/O exception during makeDexElement");
                        iOException2.initCause((Throwable) arrayList2.get(0));
                        throw iOException2;
                    }
                    return;
                } catch (NoSuchMethodException unused) {
                    cls = cls.getSuperclass();
                }
            }
            StringBuilder l = C13555b.m33973l("Method ", "makeDexElements", " with parameters ");
            l.append(Arrays.asList(clsArr));
            l.append(" not found in ");
            l.append(obj.getClass());
            throw new NoSuchMethodException(l.toString());
        }
    }

    /* renamed from: e */
    public static void m13937e(File file) throws IOException {
        file.mkdir();
        if (!file.isDirectory()) {
            File parentFile = file.getParentFile();
            if (parentFile == null) {
                file.getPath();
            } else {
                file.getPath();
                parentFile.isDirectory();
                parentFile.isFile();
                parentFile.exists();
                parentFile.canRead();
                parentFile.canWrite();
            }
            StringBuilder k = C13555b.m33972k("Failed to create directory ");
            k.append(file.getPath());
            throw new IOException(k.toString());
        }
    }
}
