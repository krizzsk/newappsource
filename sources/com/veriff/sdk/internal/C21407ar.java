package com.veriff.sdk.internal;

import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.veriff.sdk.internal.ar */
abstract class C21407ar<T> {
    /* renamed from: a */
    public static <T> C21407ar<T> m51005a(final Class<?> cls) {
        try {
            final Constructor<?> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            return new C21407ar<T>() {
                /* renamed from: a */
                public T mo54208a() throws IllegalAccessException, InvocationTargetException, InstantiationException {
                    return declaredConstructor.newInstance((Object[]) null);
                }

                public String toString() {
                    return cls.getName();
                }
            };
        } catch (NoSuchMethodException unused) {
            try {
                Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                Field declaredField = cls2.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                final Object obj = declaredField.get((Object) null);
                final Method method = cls2.getMethod("allocateInstance", new Class[]{Class.class});
                return new C21407ar<T>() {
                    /* renamed from: a */
                    public T mo54208a() throws InvocationTargetException, IllegalAccessException {
                        return method.invoke(obj, new Object[]{cls});
                    }

                    public String toString() {
                        return cls.getName();
                    }
                };
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                    declaredMethod.setAccessible(true);
                    final int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                    final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                    declaredMethod2.setAccessible(true);
                    return new C21407ar<T>() {
                        /* renamed from: a */
                        public T mo54208a() throws InvocationTargetException, IllegalAccessException {
                            return declaredMethod2.invoke((Object) null, new Object[]{cls, Integer.valueOf(intValue)});
                        }

                        public String toString() {
                            return cls.getName();
                        }
                    };
                } catch (IllegalAccessException unused4) {
                    throw new AssertionError();
                } catch (InvocationTargetException e) {
                    throw C21472bo.m51287a(e);
                } catch (NoSuchMethodException unused5) {
                    try {
                        final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                        declaredMethod3.setAccessible(true);
                        return new C21407ar<T>() {
                            /* renamed from: a */
                            public T mo54208a() throws InvocationTargetException, IllegalAccessException {
                                return declaredMethod3.invoke((Object) null, new Object[]{cls, Object.class});
                            }

                            public String toString() {
                                return cls.getName();
                            }
                        };
                    } catch (Exception unused6) {
                        throw new IllegalArgumentException(C25541a.m63876f(cls, C13555b.m33972k("cannot construct instances of ")));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public abstract T mo54208a() throws InvocationTargetException, IllegalAccessException, InstantiationException;
}
