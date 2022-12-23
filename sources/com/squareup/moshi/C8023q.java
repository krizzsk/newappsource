package com.squareup.moshi;

import com.appboy.support.ValidationUtils;
import com.squareup.moshi.C8011k;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nb0.C12943g;
import nb0.C12947k;
import ob0.C12977b;

/* renamed from: com.squareup.moshi.q */
public final class C8023q {

    /* renamed from: a */
    public static final C8026c f24293a = new C8026c();

    /* renamed from: b */
    public static final C8027d f24294b = new C8027d();

    /* renamed from: c */
    public static final C8028e f24295c = new C8028e();

    /* renamed from: d */
    public static final C8029f f24296d = new C8029f();

    /* renamed from: e */
    public static final C8030g f24297e = new C8030g();

    /* renamed from: f */
    public static final C8031h f24298f = new C8031h();

    /* renamed from: g */
    public static final C8032i f24299g = new C8032i();

    /* renamed from: h */
    public static final C8033j f24300h = new C8033j();

    /* renamed from: i */
    public static final C8034k f24301i = new C8034k();

    /* renamed from: j */
    public static final C8024a f24302j = new C8024a();

    /* renamed from: com.squareup.moshi.q$a */
    public class C8024a extends C8011k<String> {
        /* renamed from: a */
        public final Object mo11093a(JsonReader jsonReader) throws IOException {
            return jsonReader.mo24985C();
        }

        /* renamed from: e */
        public final void mo11094e(C12947k kVar, Object obj) throws IOException {
            kVar.mo25068K((String) obj);
        }

        public final String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* renamed from: com.squareup.moshi.q$b */
    public static /* synthetic */ class C8025b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24303a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.squareup.moshi.JsonReader$Token[] r0 = com.squareup.moshi.JsonReader.Token.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24303a = r0
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f24303a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f24303a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f24303a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f24303a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f24303a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C8023q.C8025b.<clinit>():void");
        }
    }

    /* renamed from: com.squareup.moshi.q$c */
    public class C8026c implements C8011k.C8012a {
        /* JADX WARNING: Code restructure failed: missing block: B:100:0x014b, code lost:
            throw null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:101:0x014c, code lost:
            r10 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:103:0x0163, code lost:
            throw new java.lang.RuntimeException("Failed to instantiate the generated JsonAdapter for " + r9, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:104:0x0164, code lost:
            r10 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:106:0x017b, code lost:
            throw new java.lang.RuntimeException("Failed to access the generated JsonAdapter for " + r9, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:107:0x017c, code lost:
            r10 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:109:0x017f, code lost:
            if ((r9 instanceof java.lang.reflect.ParameterizedType) != false) goto L_0x01b0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:113:0x01af, code lost:
            throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter constructor for '" + r9 + "'. Suspiciously, the type was not parameterized but the target class '" + r0.getCanonicalName() + "' is generic. Consider using Types#newParameterizedType() to define these missing type variables.", r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:115:0x01c6, code lost:
            throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter constructor for " + r9, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:116:0x01c7, code lost:
            r10 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:118:0x01de, code lost:
            throw new java.lang.RuntimeException("Failed to find the generated JsonAdapter class for " + r9, r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:96:0x0144, code lost:
            r10 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:97:0x0145, code lost:
            r0 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:98:0x0147, code lost:
            r9 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x0148, code lost:
            ob0.C12977b.m32857j(r9);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x012d */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x014c A[ExcHandler: InstantiationException (r10v25 'e' java.lang.InstantiationException A[CUSTOM_DECLARE]), Splitter:B:80:0x00e8] */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x0164 A[ExcHandler: IllegalAccessException (r10v24 'e' java.lang.IllegalAccessException A[CUSTOM_DECLARE]), Splitter:B:80:0x00e8] */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x0188  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x01b0  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x01c7 A[ExcHandler: ClassNotFoundException (r10v21 'e' java.lang.ClassNotFoundException A[CUSTOM_DECLARE]), Splitter:B:80:0x00e8] */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0147 A[ExcHandler: InvocationTargetException (r9v14 'e' java.lang.reflect.InvocationTargetException A[CUSTOM_DECLARE]), Splitter:B:80:0x00e8] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:89:0x0111=Splitter:B:89:0x0111, B:93:0x012d=Splitter:B:93:0x012d} */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.squareup.moshi.C8011k<?> mo25038a(java.lang.reflect.Type r9, java.util.Set<? extends java.lang.annotation.Annotation> r10, com.squareup.moshi.C8017o r11) {
            /*
                r8 = this;
                boolean r10 = r10.isEmpty()
                r0 = 0
                if (r10 != 0) goto L_0x0008
                return r0
            L_0x0008:
                java.lang.Class r10 = java.lang.Boolean.TYPE
                if (r9 != r10) goto L_0x000f
                com.squareup.moshi.q$d r9 = com.squareup.moshi.C8023q.f24294b
                return r9
            L_0x000f:
                java.lang.Class r10 = java.lang.Byte.TYPE
                if (r9 != r10) goto L_0x0016
                com.squareup.moshi.q$e r9 = com.squareup.moshi.C8023q.f24295c
                return r9
            L_0x0016:
                java.lang.Class r10 = java.lang.Character.TYPE
                if (r9 != r10) goto L_0x001d
                com.squareup.moshi.q$f r9 = com.squareup.moshi.C8023q.f24296d
                return r9
            L_0x001d:
                java.lang.Class r10 = java.lang.Double.TYPE
                if (r9 != r10) goto L_0x0024
                com.squareup.moshi.q$g r9 = com.squareup.moshi.C8023q.f24297e
                return r9
            L_0x0024:
                java.lang.Class r10 = java.lang.Float.TYPE
                if (r9 != r10) goto L_0x002b
                com.squareup.moshi.q$h r9 = com.squareup.moshi.C8023q.f24298f
                return r9
            L_0x002b:
                java.lang.Class r10 = java.lang.Integer.TYPE
                if (r9 != r10) goto L_0x0032
                com.squareup.moshi.q$i r9 = com.squareup.moshi.C8023q.f24299g
                return r9
            L_0x0032:
                java.lang.Class r10 = java.lang.Long.TYPE
                if (r9 != r10) goto L_0x0039
                com.squareup.moshi.q$j r9 = com.squareup.moshi.C8023q.f24300h
                return r9
            L_0x0039:
                java.lang.Class r10 = java.lang.Short.TYPE
                if (r9 != r10) goto L_0x0040
                com.squareup.moshi.q$k r9 = com.squareup.moshi.C8023q.f24301i
                return r9
            L_0x0040:
                java.lang.Class<java.lang.Boolean> r10 = java.lang.Boolean.class
                if (r9 != r10) goto L_0x004b
                com.squareup.moshi.q$d r9 = com.squareup.moshi.C8023q.f24294b
                com.squareup.moshi.k r9 = r9.mo25050c()
                return r9
            L_0x004b:
                java.lang.Class<java.lang.Byte> r10 = java.lang.Byte.class
                if (r9 != r10) goto L_0x0056
                com.squareup.moshi.q$e r9 = com.squareup.moshi.C8023q.f24295c
                com.squareup.moshi.k r9 = r9.mo25050c()
                return r9
            L_0x0056:
                java.lang.Class<java.lang.Character> r10 = java.lang.Character.class
                if (r9 != r10) goto L_0x0061
                com.squareup.moshi.q$f r9 = com.squareup.moshi.C8023q.f24296d
                com.squareup.moshi.k r9 = r9.mo25050c()
                return r9
            L_0x0061:
                java.lang.Class<java.lang.Double> r10 = java.lang.Double.class
                if (r9 != r10) goto L_0x006c
                com.squareup.moshi.q$g r9 = com.squareup.moshi.C8023q.f24297e
                com.squareup.moshi.k r9 = r9.mo25050c()
                return r9
            L_0x006c:
                java.lang.Class<java.lang.Float> r10 = java.lang.Float.class
                if (r9 != r10) goto L_0x0077
                com.squareup.moshi.q$h r9 = com.squareup.moshi.C8023q.f24298f
                com.squareup.moshi.k r9 = r9.mo25050c()
                return r9
            L_0x0077:
                java.lang.Class<java.lang.Integer> r10 = java.lang.Integer.class
                if (r9 != r10) goto L_0x0082
                com.squareup.moshi.q$i r9 = com.squareup.moshi.C8023q.f24299g
                com.squareup.moshi.k r9 = r9.mo25050c()
                return r9
            L_0x0082:
                java.lang.Class<java.lang.Long> r10 = java.lang.Long.class
                if (r9 != r10) goto L_0x008d
                com.squareup.moshi.q$j r9 = com.squareup.moshi.C8023q.f24300h
                com.squareup.moshi.k r9 = r9.mo25050c()
                return r9
            L_0x008d:
                java.lang.Class<java.lang.Short> r10 = java.lang.Short.class
                if (r9 != r10) goto L_0x0098
                com.squareup.moshi.q$k r9 = com.squareup.moshi.C8023q.f24301i
                com.squareup.moshi.k r9 = r9.mo25050c()
                return r9
            L_0x0098:
                java.lang.Class<java.lang.String> r10 = java.lang.String.class
                if (r9 != r10) goto L_0x00a3
                com.squareup.moshi.q$a r9 = com.squareup.moshi.C8023q.f24302j
                com.squareup.moshi.k r9 = r9.mo25050c()
                return r9
            L_0x00a3:
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                if (r9 != r10) goto L_0x00b1
                com.squareup.moshi.q$m r9 = new com.squareup.moshi.q$m
                r9.<init>(r11)
                com.squareup.moshi.k r9 = r9.mo25050c()
                return r9
            L_0x00b1:
                java.lang.Class r10 = nb0.C12949m.m32789c(r9)
                java.util.Set<java.lang.annotation.Annotation> r1 = ob0.C12977b.f32131a
                java.lang.Class<com.squareup.moshi.o> r1 = com.squareup.moshi.C8017o.class
                java.lang.Class<nb0.h> r2 = nb0.C12944h.class
                java.lang.annotation.Annotation r2 = r10.getAnnotation(r2)
                nb0.h r2 = (nb0.C12944h) r2
                if (r2 == 0) goto L_0x01df
                boolean r2 = r2.generateAdapter()
                if (r2 != 0) goto L_0x00cb
                goto L_0x01df
            L_0x00cb:
                java.lang.String r2 = r10.getName()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "$"
                java.lang.String r5 = "_"
                java.lang.String r2 = r2.replace(r4, r5)
                r3.append(r2)
                java.lang.String r2 = "JsonAdapter"
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                java.lang.ClassLoader r3 = r10.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x01c7, NoSuchMethodException -> 0x017c, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                r4 = 1
                java.lang.Class r2 = java.lang.Class.forName(r2, r4, r3)     // Catch:{ ClassNotFoundException -> 0x01c7, NoSuchMethodException -> 0x017c, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                boolean r3 = r9 instanceof java.lang.reflect.ParameterizedType     // Catch:{ ClassNotFoundException -> 0x01c7, NoSuchMethodException -> 0x0144, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                r5 = 0
                if (r3 == 0) goto L_0x0120
                r3 = r9
                java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3     // Catch:{ ClassNotFoundException -> 0x01c7, NoSuchMethodException -> 0x0144, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()     // Catch:{ ClassNotFoundException -> 0x01c7, NoSuchMethodException -> 0x0144, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                r6 = 2
                java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x0111, ClassNotFoundException -> 0x01c7, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                r7[r5] = r1     // Catch:{ NoSuchMethodException -> 0x0111, ClassNotFoundException -> 0x01c7, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                java.lang.Class<java.lang.reflect.Type[]> r1 = java.lang.reflect.Type[].class
                r7[r4] = r1     // Catch:{ NoSuchMethodException -> 0x0111, ClassNotFoundException -> 0x01c7, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r7)     // Catch:{ NoSuchMethodException -> 0x0111, ClassNotFoundException -> 0x01c7, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ NoSuchMethodException -> 0x0111, ClassNotFoundException -> 0x01c7, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                r6[r5] = r11     // Catch:{ NoSuchMethodException -> 0x0111, ClassNotFoundException -> 0x01c7, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                r6[r4] = r3     // Catch:{ NoSuchMethodException -> 0x0111, ClassNotFoundException -> 0x01c7, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                goto L_0x0135
            L_0x0111:
                java.lang.Class[] r11 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x01c7, NoSuchMethodException -> 0x0144, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                java.lang.Class<java.lang.reflect.Type[]> r1 = java.lang.reflect.Type[].class
                r11[r5] = r1     // Catch:{ ClassNotFoundException -> 0x01c7, NoSuchMethodException -> 0x0144, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r11)     // Catch:{ ClassNotFoundException -> 0x01c7, NoSuchMethodException -> 0x0144, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x01c7, NoSuchMethodException -> 0x0144, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                r6[r5] = r3     // Catch:{ ClassNotFoundException -> 0x01c7, NoSuchMethodException -> 0x0144, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                goto L_0x0135
            L_0x0120:
                java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x012d, ClassNotFoundException -> 0x01c7, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                r3[r5] = r1     // Catch:{ NoSuchMethodException -> 0x012d, ClassNotFoundException -> 0x01c7, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r3)     // Catch:{ NoSuchMethodException -> 0x012d, ClassNotFoundException -> 0x01c7, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x012d, ClassNotFoundException -> 0x01c7, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                r6[r5] = r11     // Catch:{ NoSuchMethodException -> 0x012d, ClassNotFoundException -> 0x01c7, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                goto L_0x0135
            L_0x012d:
                java.lang.Class[] r11 = new java.lang.Class[r5]     // Catch:{ ClassNotFoundException -> 0x01c7, NoSuchMethodException -> 0x0144, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                java.lang.reflect.Constructor r1 = r2.getDeclaredConstructor(r11)     // Catch:{ ClassNotFoundException -> 0x01c7, NoSuchMethodException -> 0x0144, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ ClassNotFoundException -> 0x01c7, NoSuchMethodException -> 0x0144, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
            L_0x0135:
                r1.setAccessible(r4)     // Catch:{ ClassNotFoundException -> 0x01c7, NoSuchMethodException -> 0x0144, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                java.lang.Object r11 = r1.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x01c7, NoSuchMethodException -> 0x0144, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                com.squareup.moshi.k r11 = (com.squareup.moshi.C8011k) r11     // Catch:{ ClassNotFoundException -> 0x01c7, NoSuchMethodException -> 0x0144, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                com.squareup.moshi.k r9 = r11.mo25050c()     // Catch:{ ClassNotFoundException -> 0x01c7, NoSuchMethodException -> 0x0144, IllegalAccessException -> 0x0164, InstantiationException -> 0x014c, InvocationTargetException -> 0x0147 }
                goto L_0x01e0
            L_0x0144:
                r10 = move-exception
                r0 = r2
                goto L_0x017d
            L_0x0147:
                r9 = move-exception
                ob0.C12977b.m32857j(r9)
                throw r0
            L_0x014c:
                r10 = move-exception
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to instantiate the generated JsonAdapter for "
                r0.append(r1)
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                r11.<init>(r9, r10)
                throw r11
            L_0x0164:
                r10 = move-exception
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to access the generated JsonAdapter for "
                r0.append(r1)
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                r11.<init>(r9, r10)
                throw r11
            L_0x017c:
                r10 = move-exception
            L_0x017d:
                boolean r11 = r9 instanceof java.lang.reflect.ParameterizedType
                if (r11 != 0) goto L_0x01b0
                java.lang.reflect.TypeVariable[] r11 = r0.getTypeParameters()
                int r11 = r11.length
                if (r11 == 0) goto L_0x01b0
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to find the generated JsonAdapter constructor for '"
                r1.append(r2)
                r1.append(r9)
                java.lang.String r9 = "'. Suspiciously, the type was not parameterized but the target class '"
                r1.append(r9)
                java.lang.String r9 = r0.getCanonicalName()
                r1.append(r9)
                java.lang.String r9 = "' is generic. Consider using Types#newParameterizedType() to define these missing type variables."
                r1.append(r9)
                java.lang.String r9 = r1.toString()
                r11.<init>(r9, r10)
                throw r11
            L_0x01b0:
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to find the generated JsonAdapter constructor for "
                r0.append(r1)
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                r11.<init>(r9, r10)
                throw r11
            L_0x01c7:
                r10 = move-exception
                java.lang.RuntimeException r11 = new java.lang.RuntimeException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to find the generated JsonAdapter class for "
                r0.append(r1)
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                r11.<init>(r9, r10)
                throw r11
            L_0x01df:
                r9 = r0
            L_0x01e0:
                if (r9 == 0) goto L_0x01e3
                return r9
            L_0x01e3:
                boolean r9 = r10.isEnum()
                if (r9 == 0) goto L_0x01f3
                com.squareup.moshi.q$l r9 = new com.squareup.moshi.q$l
                r9.<init>(r10)
                com.squareup.moshi.k r9 = r9.mo25050c()
                return r9
            L_0x01f3:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C8023q.C8026c.mo25038a(java.lang.reflect.Type, java.util.Set, com.squareup.moshi.o):com.squareup.moshi.k");
        }
    }

    /* renamed from: com.squareup.moshi.q$d */
    public class C8027d extends C8011k<Boolean> {
        /* renamed from: a */
        public final Object mo11093a(JsonReader jsonReader) throws IOException {
            return Boolean.valueOf(jsonReader.mo25000w());
        }

        /* renamed from: e */
        public final void mo11094e(C12947k kVar, Object obj) throws IOException {
            kVar.mo25069N(((Boolean) obj).booleanValue());
        }

        public final String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* renamed from: com.squareup.moshi.q$e */
    public class C8028e extends C8011k<Byte> {
        /* renamed from: a */
        public final Object mo11093a(JsonReader jsonReader) throws IOException {
            return Byte.valueOf((byte) C8023q.m18313a(jsonReader, "a byte", -128, ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        }

        /* renamed from: e */
        public final void mo11094e(C12947k kVar, Object obj) throws IOException {
            kVar.mo25066C((long) (((Byte) obj).intValue() & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        }

        public final String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* renamed from: com.squareup.moshi.q$f */
    public class C8029f extends C8011k<Character> {
        /* renamed from: a */
        public final Object mo11093a(JsonReader jsonReader) throws IOException {
            String C = jsonReader.mo24985C();
            if (C.length() <= 1) {
                return Character.valueOf(C.charAt(0));
            }
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", new Object[]{"a char", '\"' + C + '\"', jsonReader.mo24998t()}));
        }

        /* renamed from: e */
        public final void mo11094e(C12947k kVar, Object obj) throws IOException {
            kVar.mo25068K(((Character) obj).toString());
        }

        public final String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* renamed from: com.squareup.moshi.q$g */
    public class C8030g extends C8011k<Double> {
        /* renamed from: a */
        public final Object mo11093a(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.mo25001x());
        }

        /* renamed from: e */
        public final void mo11094e(C12947k kVar, Object obj) throws IOException {
            kVar.mo25065B(((Double) obj).doubleValue());
        }

        public final String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* renamed from: com.squareup.moshi.q$h */
    public class C8031h extends C8011k<Float> {
        /* renamed from: a */
        public final Object mo11093a(JsonReader jsonReader) throws IOException {
            float x = (float) jsonReader.mo25001x();
            if (!Float.isInfinite(x)) {
                return Float.valueOf(x);
            }
            throw new JsonDataException("JSON forbids NaN and infinities: " + x + " at path " + jsonReader.mo24998t());
        }

        /* renamed from: e */
        public final void mo11094e(C12947k kVar, Object obj) throws IOException {
            Float f = (Float) obj;
            f.getClass();
            kVar.mo25067H(f);
        }

        public final String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* renamed from: com.squareup.moshi.q$i */
    public class C8032i extends C8011k<Integer> {
        /* renamed from: a */
        public final Object mo11093a(JsonReader jsonReader) throws IOException {
            return Integer.valueOf(jsonReader.mo25002z());
        }

        /* renamed from: e */
        public final void mo11094e(C12947k kVar, Object obj) throws IOException {
            kVar.mo25066C((long) ((Integer) obj).intValue());
        }

        public final String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* renamed from: com.squareup.moshi.q$j */
    public class C8033j extends C8011k<Long> {
        /* renamed from: a */
        public final Object mo11093a(JsonReader jsonReader) throws IOException {
            return Long.valueOf(jsonReader.mo24983A());
        }

        /* renamed from: e */
        public final void mo11094e(C12947k kVar, Object obj) throws IOException {
            kVar.mo25066C(((Long) obj).longValue());
        }

        public final String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* renamed from: com.squareup.moshi.q$k */
    public class C8034k extends C8011k<Short> {
        /* renamed from: a */
        public final Object mo11093a(JsonReader jsonReader) throws IOException {
            return Short.valueOf((short) C8023q.m18313a(jsonReader, "a short", -32768, 32767));
        }

        /* renamed from: e */
        public final void mo11094e(C12947k kVar, Object obj) throws IOException {
            kVar.mo25066C((long) ((Short) obj).intValue());
        }

        public final String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* renamed from: com.squareup.moshi.q$l */
    public static final class C8035l<T extends Enum<T>> extends C8011k<T> {

        /* renamed from: a */
        public final Class<T> f24304a;

        /* renamed from: b */
        public final String[] f24305b;

        /* renamed from: c */
        public final T[] f24306c;

        /* renamed from: d */
        public final JsonReader.C7986a f24307d;

        public C8035l(Class<T> cls) {
            this.f24304a = cls;
            try {
                T[] tArr = (Enum[]) cls.getEnumConstants();
                this.f24306c = tArr;
                this.f24305b = new String[tArr.length];
                int i = 0;
                while (true) {
                    T[] tArr2 = this.f24306c;
                    if (i < tArr2.length) {
                        String name = tArr2[i].name();
                        String[] strArr = this.f24305b;
                        Field field = cls.getField(name);
                        Set<Annotation> set = C12977b.f32131a;
                        C12943g gVar = (C12943g) field.getAnnotation(C12943g.class);
                        if (gVar != null) {
                            String name2 = gVar.name();
                            if (!"\u0000".equals(name2)) {
                                name = name2;
                            }
                        }
                        strArr[i] = name;
                        i++;
                    } else {
                        this.f24307d = JsonReader.C7986a.m18216a(this.f24305b);
                        return;
                    }
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(C25541a.m63876f(cls, C13555b.m33972k("Missing field in ")), e);
            }
        }

        /* renamed from: a */
        public final Object mo11093a(JsonReader jsonReader) throws IOException {
            int R = jsonReader.mo24990R(this.f24307d);
            if (R != -1) {
                return this.f24306c[R];
            }
            String t = jsonReader.mo24998t();
            String C = jsonReader.mo24985C();
            StringBuilder k = C13555b.m33972k("Expected one of ");
            k.append(Arrays.asList(this.f24305b));
            k.append(" but was ");
            k.append(C);
            k.append(" at path ");
            k.append(t);
            throw new JsonDataException(k.toString());
        }

        /* renamed from: e */
        public final void mo11094e(C12947k kVar, Object obj) throws IOException {
            kVar.mo25068K(this.f24305b[((Enum) obj).ordinal()]);
        }

        public final String toString() {
            return C13555b.m33969h(this.f24304a, C13555b.m33972k("JsonAdapter("), ")");
        }
    }

    /* renamed from: com.squareup.moshi.q$m */
    public static final class C8036m extends C8011k<Object> {

        /* renamed from: a */
        public final C8017o f24308a;

        /* renamed from: b */
        public final C8011k<List> f24309b;

        /* renamed from: c */
        public final C8011k<Map> f24310c;

        /* renamed from: d */
        public final C8011k<String> f24311d;

        /* renamed from: e */
        public final C8011k<Double> f24312e;

        /* renamed from: f */
        public final C8011k<Boolean> f24313f;

        public C8036m(C8017o oVar) {
            this.f24308a = oVar;
            this.f24309b = oVar.mo25080a(List.class);
            this.f24310c = oVar.mo25080a(Map.class);
            this.f24311d = oVar.mo25080a(String.class);
            this.f24312e = oVar.mo25080a(Double.class);
            this.f24313f = oVar.mo25080a(Boolean.class);
        }

        /* renamed from: a */
        public final Object mo11093a(JsonReader jsonReader) throws IOException {
            switch (C8025b.f24303a[jsonReader.mo24986H().ordinal()]) {
                case 1:
                    return this.f24309b.mo11093a(jsonReader);
                case 2:
                    return this.f24310c.mo11093a(jsonReader);
                case 3:
                    return this.f24311d.mo11093a(jsonReader);
                case 4:
                    return this.f24312e.mo11093a(jsonReader);
                case 5:
                    return this.f24313f.mo11093a(jsonReader);
                case 6:
                    jsonReader.mo24984B();
                    return null;
                default:
                    StringBuilder k = C13555b.m33972k("Expected a value but was ");
                    k.append(jsonReader.mo24986H());
                    k.append(" at path ");
                    k.append(jsonReader.mo24998t());
                    throw new IllegalStateException(k.toString());
            }
        }

        /* renamed from: e */
        public final void mo11094e(C12947k kVar, Object obj) throws IOException {
            Class cls = obj.getClass();
            if (cls == Object.class) {
                kVar.mo25074i();
                kVar.mo25076t();
                return;
            }
            C8017o oVar = this.f24308a;
            if (Map.class.isAssignableFrom(cls)) {
                cls = Map.class;
            } else if (Collection.class.isAssignableFrom(cls)) {
                cls = Collection.class;
            }
            oVar.mo25082c(cls, C12977b.f32131a, (String) null).mo11094e(kVar, obj);
        }

        public final String toString() {
            return "JsonAdapter(Object)";
        }
    }

    /* renamed from: a */
    public static int m18313a(JsonReader jsonReader, String str, int i, int i2) throws IOException {
        int z = jsonReader.mo25002z();
        if (z >= i && z <= i2) {
            return z;
        }
        throw new JsonDataException(String.format("Expected %s but was %s at path %s", new Object[]{str, Integer.valueOf(z), jsonReader.mo24998t()}));
    }
}
