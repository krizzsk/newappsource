package p022b3;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p241s0.C6302b;

/* renamed from: b3.b */
public abstract class C1462b {

    /* renamed from: a */
    public final C6302b<String, Method> f5325a;

    /* renamed from: b */
    public final C6302b<String, Method> f5326b;

    /* renamed from: c */
    public final C6302b<String, Class> f5327c;

    public C1462b(C6302b<String, Method> bVar, C6302b<String, Method> bVar2, C6302b<String, Class> bVar3) {
        this.f5325a = bVar;
        this.f5326b = bVar2;
        this.f5327c = bVar3;
    }

    /* renamed from: a */
    public abstract C1463c mo5792a();

    /* renamed from: b */
    public final Class mo5793b(Class<? extends C1464d> cls) throws ClassNotFoundException {
        Class orDefault = this.f5327c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f5327c.put(cls.getName(), cls2);
        return cls2;
    }

    /* renamed from: c */
    public final Method mo5794c(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<C1462b> cls = C1462b.class;
        Method orDefault = this.f5325a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f5325a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: d */
    public final Method mo5795d(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method orDefault = this.f5326b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class b = mo5793b(cls);
        System.currentTimeMillis();
        Method declaredMethod = b.getDeclaredMethod("write", new Class[]{cls, C1462b.class});
        this.f5326b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    public abstract boolean mo5796e();

    /* renamed from: f */
    public abstract byte[] mo5797f();

    /* renamed from: g */
    public abstract CharSequence mo5798g();

    /* renamed from: h */
    public abstract boolean mo5799h(int i);

    /* renamed from: i */
    public abstract int mo5800i();

    /* renamed from: j */
    public final int mo5801j(int i, int i2) {
        if (!mo5799h(i2)) {
            return i;
        }
        return mo5800i();
    }

    /* renamed from: k */
    public abstract <T extends Parcelable> T mo5802k();

    /* renamed from: l */
    public final <T extends Parcelable> T mo5803l(T t, int i) {
        if (!mo5799h(i)) {
            return t;
        }
        return mo5802k();
    }

    /* renamed from: m */
    public abstract String mo5804m();

    /* renamed from: n */
    public final <T extends C1464d> T mo5805n() {
        String m = mo5804m();
        if (m == null) {
            return null;
        }
        C1463c a = mo5792a();
        try {
            return (C1464d) mo5794c(m).invoke((Object) null, new Object[]{a});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* renamed from: o */
    public abstract void mo5806o(int i);

    /* renamed from: p */
    public abstract void mo5807p(boolean z);

    /* renamed from: q */
    public abstract void mo5808q(byte[] bArr);

    /* renamed from: r */
    public abstract void mo5809r(CharSequence charSequence);

    /* renamed from: s */
    public abstract void mo5810s(int i);

    /* renamed from: t */
    public final void mo5811t(int i, int i2) {
        mo5806o(i2);
        mo5810s(i);
    }

    /* renamed from: u */
    public abstract void mo5812u(Parcelable parcelable);

    /* renamed from: v */
    public abstract void mo5813v(String str);

    /* renamed from: w */
    public final void mo5814w(C1464d dVar) {
        if (dVar == null) {
            mo5813v((String) null);
            return;
        }
        try {
            mo5813v(mo5793b(dVar.getClass()).getName());
            C1463c a = mo5792a();
            try {
                mo5795d(dVar.getClass()).invoke((Object) null, new Object[]{dVar, a});
                a.mo5815x();
            } catch (IllegalAccessException e) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e2.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(dVar.getClass().getSimpleName() + " does not have a Parcelizer", e5);
        }
    }
}
