package p129j1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface$Builder;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p116i1.C5240d;
import p190o1.C5920m;

/* renamed from: j1.h */
public class C5359h extends C5357f {

    /* renamed from: f */
    public final Class<?> f17665f;

    /* renamed from: g */
    public final Constructor<?> f17666g;

    /* renamed from: h */
    public final Method f17667h;

    /* renamed from: i */
    public final Method f17668i;

    /* renamed from: j */
    public final Method f17669j;

    /* renamed from: k */
    public final Method f17670k;

    /* renamed from: l */
    public final Method f17671l;

    public C5359h() {
        Method method;
        Method method2;
        Method method3;
        Constructor<?> constructor;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = m13439l(cls2);
            method2 = m13440m(cls2);
            method = cls2.getMethod("freeze", new Class[0]);
            method4 = cls2.getMethod("abortCreation", new Class[0]);
            Class<?> cls3 = cls2;
            method5 = mo21141n(cls2);
            cls = cls3;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method5 = null;
            method4 = null;
            constructor = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f17665f = cls;
        this.f17666g = constructor;
        this.f17667h = method3;
        this.f17668i = method2;
        this.f17669j = method;
        this.f17670k = method4;
        this.f17671l = method5;
    }

    /* renamed from: l */
    public static Method m13439l(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* renamed from: m */
    public static Method m13440m(Class cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* renamed from: a */
    public final Typeface mo21135a(Context context, C5240d.C5243c cVar, Resources resources, int i) {
        boolean z;
        Object obj;
        if (this.f17667h != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return super.mo21135a(context, cVar, resources, i);
        }
        try {
            obj = this.f17666g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (C5240d.C5244d dVar : cVar.f17352a) {
            if (!mo21138i(context, obj, dVar.f17353a, dVar.f17357e, dVar.f17354b, dVar.f17355c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.f17356d))) {
                try {
                    this.f17670k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!mo21140k(obj)) {
            return null;
        }
        return mo21139j(obj);
    }

    /* renamed from: b */
    public final Typeface mo21136b(Context context, C5920m[] mVarArr, int i) {
        boolean z;
        Object obj;
        Typeface j;
        boolean z2;
        ParcelFileDescriptor openFileDescriptor;
        if (mVarArr.length < 1) {
            return null;
        }
        if (this.f17667h != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C5920m f = mo21143f(i, mVarArr);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(f.f19009a, "r", (CancellationSignal) null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface$Builder(openFileDescriptor.getFileDescriptor()).setWeight(f.f19011c).setItalic(f.f19012d).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            HashMap hashMap = new HashMap();
            for (C5920m mVar : mVarArr) {
                if (mVar.f19013e == 0) {
                    Uri uri = mVar.f19009a;
                    if (!hashMap.containsKey(uri)) {
                        hashMap.put(uri, C5365m.m13471e(context, uri));
                    }
                }
            }
            Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
            try {
                obj = this.f17666g.newInstance(new Object[0]);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
                obj = null;
            }
            if (obj == null) {
                return null;
            }
            boolean z3 = false;
            for (C5920m mVar2 : mVarArr) {
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(mVar2.f19009a);
                if (byteBuffer != null) {
                    try {
                        z2 = ((Boolean) this.f17668i.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(mVar2.f19010b), null, Integer.valueOf(mVar2.f19011c), Integer.valueOf(mVar2.f19012d ? 1 : 0)})).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        z2 = false;
                    }
                    if (!z2) {
                        try {
                            this.f17670k.invoke(obj, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException unused4) {
                        }
                        return null;
                    }
                    z3 = true;
                }
            }
            if (!z3) {
                try {
                    this.f17670k.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused5) {
                }
                return null;
            } else if (mo21140k(obj) && (j = mo21139j(obj)) != null) {
                return Typeface.create(j, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    /* renamed from: d */
    public final Typeface mo21137d(Context context, Resources resources, int i, String str, int i2) {
        boolean z;
        Object obj;
        if (this.f17667h != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return super.mo21137d(context, resources, i, str, i2);
        }
        try {
            obj = this.f17666g.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!mo21138i(context, obj, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            try {
                this.f17670k.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        } else if (!mo21140k(obj)) {
            return null;
        } else {
            return mo21139j(obj);
        }
    }

    /* renamed from: i */
    public final boolean mo21138i(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f17667h.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: j */
    public Typeface mo21139j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f17665f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f17671l.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: k */
    public final boolean mo21140k(Object obj) {
        try {
            return ((Boolean) this.f17669j.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: n */
    public Method mo21141n(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
