package com.veriff.sdk.internal;

import com.appboy.support.ValidationUtils;
import com.veriff.sdk.internal.C21420av;
import com.veriff.sdk.internal.C21430ba;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.veriff.sdk.internal.bj */
final class C21454bj {

    /* renamed from: a */
    public static final C21420av.C21424a f53976a = new C21420av.C21424a() {
        /* renamed from: a */
        public C21420av<?> mo54207a(Type type, Set<? extends Annotation> set, C21450bi biVar) {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return C21454bj.f53977b;
            }
            if (type == Byte.TYPE) {
                return C21454bj.f53978c;
            }
            if (type == Character.TYPE) {
                return C21454bj.f53979d;
            }
            if (type == Double.TYPE) {
                return C21454bj.f53980e;
            }
            if (type == Float.TYPE) {
                return C21454bj.f53981f;
            }
            if (type == Integer.TYPE) {
                return C21454bj.f53982g;
            }
            if (type == Long.TYPE) {
                return C21454bj.f53983h;
            }
            if (type == Short.TYPE) {
                return C21454bj.f53984i;
            }
            if (type == Boolean.class) {
                return C21454bj.f53977b.mo54227d();
            }
            if (type == Byte.class) {
                return C21454bj.f53978c.mo54227d();
            }
            if (type == Character.class) {
                return C21454bj.f53979d.mo54227d();
            }
            if (type == Double.class) {
                return C21454bj.f53980e.mo54227d();
            }
            if (type == Float.class) {
                return C21454bj.f53981f.mo54227d();
            }
            if (type == Integer.class) {
                return C21454bj.f53982g.mo54227d();
            }
            if (type == Long.class) {
                return C21454bj.f53983h.mo54227d();
            }
            if (type == Short.class) {
                return C21454bj.f53984i.mo54227d();
            }
            if (type == String.class) {
                return C21454bj.f53985j.mo54227d();
            }
            if (type == Object.class) {
                return new C21467b(biVar).mo54227d();
            }
            Class<?> d = C21468bk.m51268d(type);
            C21420av<?> a = C21472bo.m51285a(biVar, type, d);
            if (a != null) {
                return a;
            }
            if (d.isEnum()) {
                return new C21466a(d).mo54227d();
            }
            return null;
        }
    };

    /* renamed from: b */
    public static final C21420av<Boolean> f53977b = new C21420av<Boolean>() {
        /* renamed from: b */
        public Boolean mo54204a(C21430ba baVar) throws IOException {
            return Boolean.valueOf(baVar.mo54252k());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }

        /* renamed from: a */
        public void mo54205a(C21437bf bfVar, Boolean bool) throws IOException {
            bfVar.mo54270a(bool.booleanValue());
        }
    };

    /* renamed from: c */
    public static final C21420av<Byte> f53978c = new C21420av<Byte>() {
        /* renamed from: b */
        public Byte mo54204a(C21430ba baVar) throws IOException {
            return Byte.valueOf((byte) C21454bj.m51214a(baVar, "a byte", -128, ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }

        /* renamed from: a */
        public void mo54205a(C21437bf bfVar, Byte b) throws IOException {
            bfVar.mo54266a((long) (b.intValue() & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        }
    };

    /* renamed from: d */
    public static final C21420av<Character> f53979d = new C21420av<Character>() {
        /* renamed from: b */
        public Character mo54204a(C21430ba baVar) throws IOException {
            String j = baVar.mo54251j();
            if (j.length() <= 1) {
                return Character.valueOf(j.charAt(0));
            }
            throw new C21426ax(String.format("Expected %s but was %s at path %s", new Object[]{"a char", '\"' + j + '\"', baVar.mo54259r()}));
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }

        /* renamed from: a */
        public void mo54205a(C21437bf bfVar, Character ch) throws IOException {
            bfVar.mo54272b(ch.toString());
        }
    };

    /* renamed from: e */
    public static final C21420av<Double> f53980e = new C21420av<Double>() {
        /* renamed from: b */
        public Double mo54204a(C21430ba baVar) throws IOException {
            return Double.valueOf(baVar.mo54254m());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }

        /* renamed from: a */
        public void mo54205a(C21437bf bfVar, Double d) throws IOException {
            bfVar.mo54265a(d.doubleValue());
        }
    };

    /* renamed from: f */
    public static final C21420av<Float> f53981f = new C21420av<Float>() {
        /* renamed from: b */
        public Float mo54204a(C21430ba baVar) throws IOException {
            float m = (float) baVar.mo54254m();
            if (baVar.mo54240a() || !Float.isInfinite(m)) {
                return Float.valueOf(m);
            }
            throw new C21426ax("JSON forbids NaN and infinities: " + m + " at path " + baVar.mo54259r());
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }

        /* renamed from: a */
        public void mo54205a(C21437bf bfVar, Float f) throws IOException {
            f.getClass();
            bfVar.mo54268a((Number) f);
        }
    };

    /* renamed from: g */
    public static final C21420av<Integer> f53982g = new C21420av<Integer>() {
        /* renamed from: b */
        public Integer mo54204a(C21430ba baVar) throws IOException {
            return Integer.valueOf(baVar.mo54256o());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }

        /* renamed from: a */
        public void mo54205a(C21437bf bfVar, Integer num) throws IOException {
            bfVar.mo54266a((long) num.intValue());
        }
    };

    /* renamed from: h */
    public static final C21420av<Long> f53983h = new C21420av<Long>() {
        /* renamed from: b */
        public Long mo54204a(C21430ba baVar) throws IOException {
            return Long.valueOf(baVar.mo54255n());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }

        /* renamed from: a */
        public void mo54205a(C21437bf bfVar, Long l) throws IOException {
            bfVar.mo54266a(l.longValue());
        }
    };

    /* renamed from: i */
    public static final C21420av<Short> f53984i = new C21420av<Short>() {
        /* renamed from: b */
        public Short mo54204a(C21430ba baVar) throws IOException {
            return Short.valueOf((short) C21454bj.m51214a(baVar, "a short", -32768, 32767));
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }

        /* renamed from: a */
        public void mo54205a(C21437bf bfVar, Short sh) throws IOException {
            bfVar.mo54266a((long) sh.intValue());
        }
    };

    /* renamed from: j */
    public static final C21420av<String> f53985j = new C21420av<String>() {
        /* renamed from: b */
        public String mo54204a(C21430ba baVar) throws IOException {
            return baVar.mo54251j();
        }

        public String toString() {
            return "JsonAdapter(String)";
        }

        /* renamed from: a */
        public void mo54205a(C21437bf bfVar, String str) throws IOException {
            bfVar.mo54272b(str);
        }
    };

    /* renamed from: com.veriff.sdk.internal.bj$3 */
    public static /* synthetic */ class C214593 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53986a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.veriff.sdk.internal.ba$b[] r0 = com.veriff.sdk.internal.C21430ba.C21432b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f53986a = r0
                com.veriff.sdk.internal.ba$b r1 = com.veriff.sdk.internal.C21430ba.C21432b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f53986a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.veriff.sdk.internal.ba$b r1 = com.veriff.sdk.internal.C21430ba.C21432b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f53986a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.veriff.sdk.internal.ba$b r1 = com.veriff.sdk.internal.C21430ba.C21432b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f53986a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.veriff.sdk.internal.ba$b r1 = com.veriff.sdk.internal.C21430ba.C21432b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f53986a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.veriff.sdk.internal.ba$b r1 = com.veriff.sdk.internal.C21430ba.C21432b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f53986a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.veriff.sdk.internal.ba$b r1 = com.veriff.sdk.internal.C21430ba.C21432b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C21454bj.C214593.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m51214a(C21430ba baVar, String str, int i, int i2) throws IOException {
        int o = baVar.mo54256o();
        if (o >= i && o <= i2) {
            return o;
        }
        throw new C21426ax(String.format("Expected %s but was %s at path %s", new Object[]{str, Integer.valueOf(o), baVar.mo54259r()}));
    }

    /* renamed from: com.veriff.sdk.internal.bj$a */
    public static final class C21466a<T extends Enum<T>> extends C21420av<T> {

        /* renamed from: a */
        private final Class<T> f53987a;

        /* renamed from: b */
        private final String[] f53988b;

        /* renamed from: c */
        private final T[] f53989c;

        /* renamed from: d */
        private final C21430ba.C21431a f53990d;

        public C21466a(Class<T> cls) {
            String str;
            this.f53987a = cls;
            try {
                T[] tArr = (Enum[]) cls.getEnumConstants();
                this.f53989c = tArr;
                this.f53988b = new String[tArr.length];
                int i = 0;
                while (true) {
                    T[] tArr2 = this.f53989c;
                    if (i < tArr2.length) {
                        T t = tArr2[i];
                        C21419au auVar = (C21419au) cls.getField(t.name()).getAnnotation(C21419au.class);
                        if (auVar != null) {
                            str = auVar.mo54221a();
                        } else {
                            str = t.name();
                        }
                        this.f53988b[i] = str;
                        i++;
                    } else {
                        this.f53990d = C21430ba.C21431a.m51080a(this.f53988b);
                        return;
                    }
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(C25541a.m63876f(cls, C13555b.m33972k("Missing field in ")), e);
            }
        }

        /* renamed from: b */
        public T mo54204a(C21430ba baVar) throws IOException {
            int b = baVar.mo54241b(this.f53990d);
            if (b != -1) {
                return this.f53989c[b];
            }
            String r = baVar.mo54259r();
            String j = baVar.mo54251j();
            StringBuilder k = C13555b.m33972k("Expected one of ");
            k.append(Arrays.asList(this.f53988b));
            k.append(" but was ");
            k.append(j);
            k.append(" at path ");
            k.append(r);
            throw new C21426ax(k.toString());
        }

        public String toString() {
            return C13555b.m33969h(this.f53987a, C13555b.m33972k("JsonAdapter("), ")");
        }

        /* renamed from: a */
        public void mo54205a(C21437bf bfVar, T t) throws IOException {
            bfVar.mo54272b(this.f53988b[t.ordinal()]);
        }
    }

    /* renamed from: com.veriff.sdk.internal.bj$b */
    public static final class C21467b extends C21420av<Object> {

        /* renamed from: a */
        private final C21450bi f53991a;

        /* renamed from: b */
        private final C21420av<List> f53992b;

        /* renamed from: c */
        private final C21420av<Map> f53993c;

        /* renamed from: d */
        private final C21420av<String> f53994d;

        /* renamed from: e */
        private final C21420av<Double> f53995e;

        /* renamed from: f */
        private final C21420av<Boolean> f53996f;

        public C21467b(C21450bi biVar) {
            this.f53991a = biVar;
            this.f53992b = biVar.mo54334a(List.class);
            this.f53993c = biVar.mo54334a(Map.class);
            this.f53994d = biVar.mo54334a(String.class);
            this.f53995e = biVar.mo54334a(Double.class);
            this.f53996f = biVar.mo54334a(Boolean.class);
        }

        /* renamed from: a */
        public Object mo54204a(C21430ba baVar) throws IOException {
            switch (C214593.f53986a[baVar.mo54249h().ordinal()]) {
                case 1:
                    return this.f53992b.mo54204a(baVar);
                case 2:
                    return this.f53993c.mo54204a(baVar);
                case 3:
                    return this.f53994d.mo54204a(baVar);
                case 4:
                    return this.f53995e.mo54204a(baVar);
                case 5:
                    return this.f53996f.mo54204a(baVar);
                case 6:
                    return baVar.mo54253l();
                default:
                    StringBuilder k = C13555b.m33972k("Expected a value but was ");
                    k.append(baVar.mo54249h());
                    k.append(" at path ");
                    k.append(baVar.mo54259r());
                    throw new IllegalStateException(k.toString());
            }
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }

        /* renamed from: a */
        public void mo54205a(C21437bf bfVar, Object obj) throws IOException {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                bfVar.mo54273c();
                bfVar.mo54275d();
                return;
            }
            this.f53991a.mo54336a(m51256a(cls), C21472bo.f53999a).mo54205a(bfVar, obj);
        }

        /* renamed from: a */
        private Class<?> m51256a(Class<?> cls) {
            if (Map.class.isAssignableFrom(cls)) {
                return Map.class;
            }
            return Collection.class.isAssignableFrom(cls) ? Collection.class : cls;
        }
    }
}
