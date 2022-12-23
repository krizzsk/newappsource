package p129j1;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p190o1.C5920m;
import p241s0.C6313h;

/* renamed from: j1.g */
public final class C5358g extends C5363l {

    /* renamed from: a */
    public static final Class<?> f17661a;

    /* renamed from: b */
    public static final Constructor<?> f17662b;

    /* renamed from: c */
    public static final Method f17663c;

    /* renamed from: d */
    public static final Method f17664d;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method2 = null;
            method = null;
        }
        f17662b = constructor;
        f17661a = cls;
        f17663c = method;
        f17664d = method2;
    }

    /* renamed from: g */
    public static boolean m13436g(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f17663c.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0069 A[LOOP:0: B:9:0x0016->B:40:0x0069, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Typeface mo21135a(android.content.Context r18, p116i1.C5240d.C5243c r19, android.content.res.Resources r20, int r21) {
        /*
            r17 = this;
            r1 = 0
            r2 = 0
            java.lang.reflect.Constructor<?> r0 = f17662b     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000c }
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000c }
            java.lang.Object r0 = r0.newInstance(r3)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000c }
            r3 = r0
            goto L_0x000d
        L_0x000c:
            r3 = r1
        L_0x000d:
            if (r3 != 0) goto L_0x0010
            return r1
        L_0x0010:
            r0 = r19
            i1.d$d[] r4 = r0.f17352a
            int r5 = r4.length
            r6 = 0
        L_0x0016:
            if (r6 >= r5) goto L_0x0071
            r7 = r4[r6]
            int r0 = r7.f17358f
            java.io.File r8 = p129j1.C5365m.m13470d(r18)
            r9 = r20
            if (r8 != 0) goto L_0x0025
            goto L_0x002e
        L_0x0025:
            boolean r0 = p129j1.C5365m.m13468b(r8, r9, r0)     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x0030
            r8.delete()
        L_0x002e:
            r0 = r1
            goto L_0x0059
        L_0x0030:
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0055 }
            r10.<init>(r8)     // Catch:{ IOException -> 0x0055 }
            java.nio.channels.FileChannel r11 = r10.getChannel()     // Catch:{ all -> 0x0049 }
            long r15 = r11.size()     // Catch:{ all -> 0x0049 }
            java.nio.channels.FileChannel$MapMode r12 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0049 }
            r13 = 0
            java.nio.MappedByteBuffer r0 = r11.map(r12, r13, r15)     // Catch:{ all -> 0x0049 }
            r10.close()     // Catch:{ IOException -> 0x0055 }
            goto L_0x0056
        L_0x0049:
            r0 = move-exception
            r11 = r0
            r10.close()     // Catch:{ all -> 0x004f }
            goto L_0x0054
        L_0x004f:
            r0 = move-exception
            r10 = r0
            r11.addSuppressed(r10)     // Catch:{ IOException -> 0x0055 }
        L_0x0054:
            throw r11     // Catch:{ IOException -> 0x0055 }
        L_0x0055:
            r0 = r1
        L_0x0056:
            r8.delete()
        L_0x0059:
            if (r0 != 0) goto L_0x005c
            return r1
        L_0x005c:
            int r8 = r7.f17357e
            int r10 = r7.f17354b
            boolean r7 = r7.f17355c
            boolean r0 = m13436g(r3, r0, r8, r10, r7)
            if (r0 != 0) goto L_0x0069
            return r1
        L_0x0069:
            int r6 = r6 + 1
            goto L_0x0016
        L_0x006c:
            r0 = move-exception
            r8.delete()
            throw r0
        L_0x0071:
            java.lang.Class<?> r0 = f17661a     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0088 }
            r4 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r4)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0088 }
            java.lang.reflect.Array.set(r0, r2, r3)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0088 }
            java.lang.reflect.Method r3 = f17664d     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0088 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0088 }
            r4[r2] = r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0088 }
            java.lang.Object r0 = r3.invoke(r1, r4)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0088 }
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0088 }
            r1 = r0
        L_0x0088:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p129j1.C5358g.mo21135a(android.content.Context, i1.d$c, android.content.res.Resources, int):android.graphics.Typeface");
    }

    /* renamed from: b */
    public final Typeface mo21136b(Context context, C5920m[] mVarArr, int i) {
        Object obj;
        Typeface typeface;
        try {
            obj = f17662b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        C6313h hVar = new C6313h();
        for (C5920m mVar : mVarArr) {
            Uri uri = mVar.f19009a;
            ByteBuffer byteBuffer = (ByteBuffer) hVar.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = C5365m.m13471e(context, uri);
                hVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !m13436g(obj, byteBuffer, mVar.f19010b, mVar.f19011c, mVar.f19012d)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f17661a, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) f17664d.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i);
    }
}
