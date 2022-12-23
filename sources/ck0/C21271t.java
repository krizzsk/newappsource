package ck0;

import hi0.C23534e;
import hi0.C23536e0;
import hi0.C23556q;
import hi0.C23558r;
import hi0.C23562t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001a0.C0016g;

/* renamed from: ck0.t */
public final class C21271t<R, T> {

    /* renamed from: m */
    public static final Pattern f53248m = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: n */
    public static final Pattern f53249n = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: a */
    public final C23534e.C23535a f53250a;

    /* renamed from: b */
    public final C21227c<R, T> f53251b;

    /* renamed from: c */
    public final C23558r f53252c;

    /* renamed from: d */
    public final C21230e<C23536e0, R> f53253d;

    /* renamed from: e */
    public final String f53254e;

    /* renamed from: f */
    public final String f53255f;

    /* renamed from: g */
    public final C23556q f53256g;

    /* renamed from: h */
    public final C23562t f53257h;

    /* renamed from: i */
    public final boolean f53258i;

    /* renamed from: j */
    public final boolean f53259j;

    /* renamed from: k */
    public final boolean f53260k;

    /* renamed from: l */
    public final C21247o<?>[] f53261l;

    /* renamed from: ck0.t$a */
    public static final class C21272a<T, R> {

        /* renamed from: a */
        public final C21268s f53262a;

        /* renamed from: b */
        public final Method f53263b;

        /* renamed from: c */
        public final Annotation[] f53264c;

        /* renamed from: d */
        public final Annotation[][] f53265d;

        /* renamed from: e */
        public final Type[] f53266e;

        /* renamed from: f */
        public Type f53267f;

        /* renamed from: g */
        public boolean f53268g;

        /* renamed from: h */
        public boolean f53269h;

        /* renamed from: i */
        public boolean f53270i;

        /* renamed from: j */
        public boolean f53271j;

        /* renamed from: k */
        public boolean f53272k;

        /* renamed from: l */
        public boolean f53273l;

        /* renamed from: m */
        public String f53274m;

        /* renamed from: n */
        public boolean f53275n;

        /* renamed from: o */
        public boolean f53276o;

        /* renamed from: p */
        public boolean f53277p;

        /* renamed from: q */
        public String f53278q;

        /* renamed from: r */
        public C23556q f53279r;

        /* renamed from: s */
        public C23562t f53280s;

        /* renamed from: t */
        public LinkedHashSet f53281t;

        /* renamed from: u */
        public C21247o<?>[] f53282u;

        /* renamed from: v */
        public C21230e<C23536e0, T> f53283v;

        /* renamed from: w */
        public C21227c<T, R> f53284w;

        public C21272a(C21268s sVar, Method method) {
            this.f53262a = sVar;
            this.f53263b = method;
            this.f53264c = method.getAnnotations();
            this.f53266e = method.getGenericParameterTypes();
            this.f53265d = method.getParameterAnnotations();
        }

        /* JADX WARNING: type inference failed for: r4v7 */
        /* JADX WARNING: type inference failed for: r4v96 */
        /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r4v5, types: [int, boolean] */
        /* JADX WARNING: Removed duplicated region for block: B:364:0x08ae  */
        /* JADX WARNING: Removed duplicated region for block: B:496:0x08b1 A[SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final ck0.C21271t mo53626a() {
            /*
                r19 = this;
                r1 = r19
                java.lang.reflect.Method r0 = r1.f53263b
                java.lang.reflect.Type r2 = r0.getGenericReturnType()
                boolean r0 = ck0.C21273u.m49951g(r2)
                r3 = 0
                r4 = 1
                r5 = 0
                if (r0 != 0) goto L_0x09aa
                java.lang.Class r0 = java.lang.Void.TYPE
                if (r2 == r0) goto L_0x099f
                java.lang.reflect.Method r0 = r1.f53263b
                java.lang.annotation.Annotation[] r0 = r0.getAnnotations()
                ck0.s r6 = r1.f53262a     // Catch:{ RuntimeException -> 0x0992 }
                ck0.c r0 = r6.mo53616a(r2, r0)     // Catch:{ RuntimeException -> 0x0992 }
                r1.f53284w = r0
                java.lang.reflect.Type r0 = r0.mo53589b()
                r1.f53267f = r0
                java.lang.Class<ck0.r> r2 = ck0.C21267r.class
                if (r0 == r2) goto L_0x096d
                java.lang.Class<hi0.c0> r2 = hi0.C23529c0.class
                if (r0 == r2) goto L_0x096d
                java.lang.reflect.Method r0 = r1.f53263b
                java.lang.annotation.Annotation[] r0 = r0.getAnnotations()
                ck0.s r2 = r1.f53262a     // Catch:{ RuntimeException -> 0x095d }
                java.lang.reflect.Type r6 = r1.f53267f     // Catch:{ RuntimeException -> 0x095d }
                ck0.e r0 = r2.mo53620e(r6, r0)     // Catch:{ RuntimeException -> 0x095d }
                r1.f53283v = r0
                java.lang.annotation.Annotation[] r0 = r1.f53264c
                int r2 = r0.length
                r6 = 0
            L_0x0045:
                if (r6 >= r2) goto L_0x018a
                r7 = r0[r6]
                boolean r8 = r7 instanceof ek0.C23318b
                if (r8 == 0) goto L_0x005a
                ek0.b r7 = (ek0.C23318b) r7
                java.lang.String r7 = r7.value()
                java.lang.String r8 = "DELETE"
                r1.mo53629d(r8, r7, r5)
                goto L_0x0186
            L_0x005a:
                boolean r8 = r7 instanceof ek0.C23322f
                if (r8 == 0) goto L_0x006b
                ek0.f r7 = (ek0.C23322f) r7
                java.lang.String r7 = r7.value()
                java.lang.String r8 = "GET"
                r1.mo53629d(r8, r7, r5)
                goto L_0x0186
            L_0x006b:
                boolean r8 = r7 instanceof ek0.C23323g
                if (r8 == 0) goto L_0x008f
                ek0.g r7 = (ek0.C23323g) r7
                java.lang.String r7 = r7.value()
                java.lang.String r8 = "HEAD"
                r1.mo53629d(r8, r7, r5)
                java.lang.Class<java.lang.Void> r7 = java.lang.Void.class
                java.lang.reflect.Type r8 = r1.f53267f
                boolean r7 = r7.equals(r8)
                if (r7 == 0) goto L_0x0086
                goto L_0x0186
            L_0x0086:
                java.lang.Object[] r0 = new java.lang.Object[r5]
                java.lang.String r2 = "HEAD method must use Void as response type."
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r2, r3, r0)
                throw r0
            L_0x008f:
                boolean r8 = r7 instanceof ek0.C23330n
                if (r8 == 0) goto L_0x00a0
                ek0.n r7 = (ek0.C23330n) r7
                java.lang.String r7 = r7.value()
                java.lang.String r8 = "PATCH"
                r1.mo53629d(r8, r7, r4)
                goto L_0x0186
            L_0x00a0:
                boolean r8 = r7 instanceof ek0.C23331o
                if (r8 == 0) goto L_0x00b1
                ek0.o r7 = (ek0.C23331o) r7
                java.lang.String r7 = r7.value()
                java.lang.String r8 = "POST"
                r1.mo53629d(r8, r7, r4)
                goto L_0x0186
            L_0x00b1:
                boolean r8 = r7 instanceof ek0.C23332p
                if (r8 == 0) goto L_0x00c2
                ek0.p r7 = (ek0.C23332p) r7
                java.lang.String r7 = r7.value()
                java.lang.String r8 = "PUT"
                r1.mo53629d(r8, r7, r4)
                goto L_0x0186
            L_0x00c2:
                boolean r8 = r7 instanceof ek0.C23329m
                if (r8 == 0) goto L_0x00d3
                ek0.m r7 = (ek0.C23329m) r7
                java.lang.String r7 = r7.value()
                java.lang.String r8 = "OPTIONS"
                r1.mo53629d(r8, r7, r5)
                goto L_0x0186
            L_0x00d3:
                boolean r8 = r7 instanceof ek0.C23324h
                if (r8 == 0) goto L_0x00ea
                ek0.h r7 = (ek0.C23324h) r7
                java.lang.String r8 = r7.method()
                java.lang.String r9 = r7.path()
                boolean r7 = r7.hasBody()
                r1.mo53629d(r8, r9, r7)
                goto L_0x0186
            L_0x00ea:
                boolean r8 = r7 instanceof ek0.C23327k
                if (r8 == 0) goto L_0x0160
                ek0.k r7 = (ek0.C23327k) r7
                java.lang.String[] r7 = r7.value()
                int r8 = r7.length
                if (r8 == 0) goto L_0x0157
                hi0.q$a r8 = new hi0.q$a
                r8.<init>()
                int r9 = r7.length
                r10 = 0
            L_0x00fe:
                if (r10 >= r9) goto L_0x014f
                r11 = r7[r10]
                r12 = 58
                int r12 = r11.indexOf(r12)
                r13 = -1
                if (r12 == r13) goto L_0x0144
                if (r12 == 0) goto L_0x0144
                int r13 = r11.length()
                int r13 = r13 - r4
                if (r12 == r13) goto L_0x0144
                java.lang.String r13 = r11.substring(r5, r12)
                int r12 = r12 + 1
                java.lang.String r11 = r11.substring(r12)
                java.lang.String r11 = r11.trim()
                java.lang.String r12 = "Content-Type"
                boolean r12 = r12.equalsIgnoreCase(r13)
                if (r12 == 0) goto L_0x013e
                hi0.t r12 = hi0.C23562t.m57743c(r11)
                if (r12 == 0) goto L_0x0133
                r1.f53280s = r12
                goto L_0x0141
            L_0x0133:
                java.lang.Object[] r0 = new java.lang.Object[r4]
                r0[r5] = r11
                java.lang.String r2 = "Malformed content type: %s"
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r2, r3, r0)
                throw r0
            L_0x013e:
                r8.mo58690a(r13, r11)
            L_0x0141:
                int r10 = r10 + 1
                goto L_0x00fe
            L_0x0144:
                java.lang.Object[] r0 = new java.lang.Object[r4]
                r0[r5] = r11
                java.lang.String r2 = "@Headers value must be in the form \"Name: Value\". Found: \"%s\""
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r2, r3, r0)
                throw r0
            L_0x014f:
                hi0.q r7 = new hi0.q
                r7.<init>((hi0.C23556q.C23557a) r8)
                r1.f53279r = r7
                goto L_0x0186
            L_0x0157:
                java.lang.Object[] r0 = new java.lang.Object[r5]
                java.lang.String r2 = "@Headers annotation is empty."
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r2, r3, r0)
                throw r0
            L_0x0160:
                boolean r8 = r7 instanceof ek0.C23328l
                java.lang.String r9 = "Only one encoding annotation is allowed."
                if (r8 == 0) goto L_0x0174
                boolean r7 = r1.f53276o
                if (r7 != 0) goto L_0x016d
                r1.f53277p = r4
                goto L_0x0186
            L_0x016d:
                java.lang.Object[] r0 = new java.lang.Object[r5]
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r9, r3, r0)
                throw r0
            L_0x0174:
                boolean r7 = r7 instanceof ek0.C23321e
                if (r7 == 0) goto L_0x0186
                boolean r7 = r1.f53277p
                if (r7 != 0) goto L_0x017f
                r1.f53276o = r4
                goto L_0x0186
            L_0x017f:
                java.lang.Object[] r0 = new java.lang.Object[r5]
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r9, r3, r0)
                throw r0
            L_0x0186:
                int r6 = r6 + 1
                goto L_0x0045
            L_0x018a:
                java.lang.String r0 = r1.f53274m
                if (r0 == 0) goto L_0x0953
                boolean r0 = r1.f53275n
                if (r0 != 0) goto L_0x01ad
                boolean r0 = r1.f53277p
                if (r0 != 0) goto L_0x01a4
                boolean r0 = r1.f53276o
                if (r0 != 0) goto L_0x019b
                goto L_0x01ad
            L_0x019b:
                java.lang.Object[] r0 = new java.lang.Object[r5]
                java.lang.String r2 = "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r2, r3, r0)
                throw r0
            L_0x01a4:
                java.lang.Object[] r0 = new java.lang.Object[r5]
                java.lang.String r2 = "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r2, r3, r0)
                throw r0
            L_0x01ad:
                java.lang.annotation.Annotation[][] r0 = r1.f53265d
                int r0 = r0.length
                ck0.o[] r2 = new ck0.C21247o[r0]
                r1.f53282u = r2
                r2 = 0
            L_0x01b5:
                if (r2 >= r0) goto L_0x08f5
                java.lang.reflect.Type[] r5 = r1.f53266e
                r5 = r5[r2]
                boolean r6 = ck0.C21273u.m49951g(r5)
                if (r6 != 0) goto L_0x08e9
                java.lang.annotation.Annotation[][] r6 = r1.f53265d
                r6 = r6[r2]
                java.lang.String r7 = "No Retrofit annotation found."
                if (r6 == 0) goto L_0x08e0
                ck0.o<?>[] r8 = r1.f53282u
                int r9 = r6.length
                r10 = 0
            L_0x01cd:
                if (r10 >= r9) goto L_0x08c6
                r11 = r6[r10]
                java.lang.Class<java.lang.String> r12 = java.lang.String.class
                java.lang.Class<hi0.u$b> r13 = hi0.C23563u.C23565b.class
                boolean r14 = r11 instanceof ek0.C23340x
                java.lang.String r15 = "@Path parameters may not be used with @Url."
                if (r14 == 0) goto L_0x0246
                boolean r11 = r1.f53273l
                if (r11 != 0) goto L_0x023c
                boolean r11 = r1.f53271j
                if (r11 != 0) goto L_0x0234
                boolean r11 = r1.f53272k
                if (r11 != 0) goto L_0x022a
                java.lang.String r11 = r1.f53278q
                if (r11 != 0) goto L_0x021c
                r1.f53273l = r4
                java.lang.Class<hi0.r> r4 = hi0.C23558r.class
                if (r5 == r4) goto L_0x0215
                if (r5 == r12) goto L_0x0215
                java.lang.Class<java.net.URI> r4 = java.net.URI.class
                if (r5 == r4) goto L_0x0215
                boolean r4 = r5 instanceof java.lang.Class
                if (r4 == 0) goto L_0x020b
                java.lang.String r4 = "android.net.Uri"
                r11 = r5
                java.lang.Class r11 = (java.lang.Class) r11
                java.lang.String r11 = r11.getName()
                boolean r4 = r4.equals(r11)
                if (r4 == 0) goto L_0x020b
                goto L_0x0215
            L_0x020b:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x0215:
                ck0.o$m r4 = new ck0.o$m
                r4.<init>()
                goto L_0x03d0
            L_0x021c:
                java.lang.Object[] r0 = new java.lang.Object[r4]
                java.lang.String r3 = r1.f53274m
                r4 = 0
                r0[r4] = r3
                java.lang.String r3 = "@Url cannot be used with @%s URL"
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x022a:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "A @Url parameter must not come after a @Query"
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x0234:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r15, r0)
                throw r0
            L_0x023c:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "Multiple @Url method annotations found."
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x0246:
                boolean r4 = r11 instanceof ek0.C23335s
                r14 = 2
                if (r4 == 0) goto L_0x02cb
                boolean r4 = r1.f53272k
                if (r4 != 0) goto L_0x02c1
                boolean r4 = r1.f53273l
                if (r4 != 0) goto L_0x02b9
                java.lang.String r4 = r1.f53278q
                if (r4 == 0) goto L_0x02aa
                r4 = 1
                r1.f53271j = r4
                ek0.s r11 = (ek0.C23335s) r11
                java.lang.String r4 = r11.value()
                java.util.regex.Pattern r12 = ck0.C21271t.f53249n
                java.util.regex.Matcher r12 = r12.matcher(r4)
                boolean r12 = r12.matches()
                if (r12 == 0) goto L_0x0295
                java.util.LinkedHashSet r12 = r1.f53281t
                boolean r12 = r12.contains(r4)
                if (r12 == 0) goto L_0x0284
                ck0.s r12 = r1.f53262a
                r12.mo53621f(r5, r6)
                ck0.o$h r12 = new ck0.o$h
                boolean r11 = r11.encoded()
                r12.<init>(r4, r11)
                goto L_0x03de
            L_0x0284:
                java.lang.Object[] r0 = new java.lang.Object[r14]
                java.lang.String r3 = r1.f53278q
                r5 = 0
                r0[r5] = r3
                r3 = 1
                r0[r3] = r4
                java.lang.String r3 = "URL \"%s\" does not contain \"{%s}\"."
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x0295:
                r0 = 1
                r3 = 0
                java.lang.Object[] r5 = new java.lang.Object[r14]
                java.util.regex.Pattern r6 = ck0.C21271t.f53248m
                java.lang.String r6 = r6.pattern()
                r5[r3] = r6
                r5[r0] = r4
                java.lang.String r0 = "@Path parameter name must match %s. Found: %s"
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r0, r5)
                throw r0
            L_0x02aa:
                r0 = 1
                r3 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r4 = r1.f53274m
                r0[r3] = r4
                java.lang.String r3 = "@Path can only be used with relative url on @%s"
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x02b9:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r15, r0)
                throw r0
            L_0x02c1:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "A @Path parameter must not come after a @Query."
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x02cb:
                boolean r4 = r11 instanceof ek0.C23336t
                java.lang.String r14 = "<String>)"
                java.lang.String r15 = " must include generic type (e.g., "
                if (r4 == 0) goto L_0x0359
                ek0.t r11 = (ek0.C23336t) r11
                java.lang.String r4 = r11.value()
                boolean r11 = r11.encoded()
                java.lang.Class r12 = ck0.C21273u.m49949e(r5)
                r13 = 1
                r1.f53272k = r13
                java.lang.Class<java.lang.Iterable> r13 = java.lang.Iterable.class
                boolean r13 = r13.isAssignableFrom(r12)
                if (r13 == 0) goto L_0x032e
                boolean r13 = r5 instanceof java.lang.reflect.ParameterizedType
                if (r13 == 0) goto L_0x0309
                r12 = r5
                java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
                r13 = 0
                java.lang.reflect.Type r12 = ck0.C21273u.m49948d(r13, r12)
                ck0.s r13 = r1.f53262a
                r13.mo53621f(r12, r6)
                ck0.o$i r12 = new ck0.o$i
                r12.<init>(r4, r11)
                ck0.m r4 = new ck0.m
                r4.<init>(r12)
                goto L_0x03d0
            L_0x0309:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = r12.getSimpleName()
                r0.append(r3)
                r0.append(r15)
                java.lang.String r3 = r12.getSimpleName()
                r0.append(r3)
                r0.append(r14)
                java.lang.String r0 = r0.toString()
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r0, r3)
                throw r0
            L_0x032e:
                boolean r13 = r12.isArray()
                if (r13 == 0) goto L_0x034d
                java.lang.Class r12 = r12.getComponentType()
                java.lang.Class r12 = ck0.C21271t.m49940a(r12)
                ck0.s r13 = r1.f53262a
                r13.mo53621f(r12, r6)
                ck0.o$i r12 = new ck0.o$i
                r12.<init>(r4, r11)
                ck0.n r4 = new ck0.n
                r4.<init>(r12)
                goto L_0x03d0
            L_0x034d:
                ck0.s r12 = r1.f53262a
                r12.mo53621f(r5, r6)
                ck0.o$i r12 = new ck0.o$i
                r12.<init>(r4, r11)
                goto L_0x03de
            L_0x0359:
                boolean r4 = r11 instanceof ek0.C23338v
                if (r4 == 0) goto L_0x03e2
                ek0.v r11 = (ek0.C23338v) r11
                boolean r4 = r11.encoded()
                java.lang.Class r11 = ck0.C21273u.m49949e(r5)
                r12 = 1
                r1.f53272k = r12
                java.lang.Class<java.lang.Iterable> r12 = java.lang.Iterable.class
                boolean r12 = r12.isAssignableFrom(r11)
                if (r12 == 0) goto L_0x03b3
                boolean r12 = r5 instanceof java.lang.reflect.ParameterizedType
                if (r12 == 0) goto L_0x038e
                r11 = r5
                java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
                r12 = 0
                java.lang.reflect.Type r11 = ck0.C21273u.m49948d(r12, r11)
                ck0.s r12 = r1.f53262a
                r12.mo53621f(r11, r6)
                ck0.o$k r11 = new ck0.o$k
                r11.<init>(r4)
                ck0.m r4 = new ck0.m
                r4.<init>(r11)
                goto L_0x03d0
            L_0x038e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = r11.getSimpleName()
                r0.append(r3)
                r0.append(r15)
                java.lang.String r3 = r11.getSimpleName()
                r0.append(r3)
                r0.append(r14)
                java.lang.String r0 = r0.toString()
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r0, r3)
                throw r0
            L_0x03b3:
                boolean r12 = r11.isArray()
                if (r12 == 0) goto L_0x03d4
                java.lang.Class r11 = r11.getComponentType()
                java.lang.Class r11 = ck0.C21271t.m49940a(r11)
                ck0.s r12 = r1.f53262a
                r12.mo53621f(r11, r6)
                ck0.o$k r11 = new ck0.o$k
                r11.<init>(r4)
                ck0.n r4 = new ck0.n
                r4.<init>(r11)
            L_0x03d0:
                r16 = r0
                goto L_0x06c1
            L_0x03d4:
                ck0.s r11 = r1.f53262a
                r11.mo53621f(r5, r6)
                ck0.o$k r12 = new ck0.o$k
                r12.<init>(r4)
            L_0x03de:
                r16 = r0
                goto L_0x067c
            L_0x03e2:
                boolean r4 = r11 instanceof ek0.C23337u
                r16 = r0
                java.lang.String r0 = "Map must include generic types (e.g., Map<String, String>)"
                if (r4 == 0) goto L_0x044b
                java.lang.Class r4 = ck0.C21273u.m49949e(r5)
                java.lang.Class<java.util.Map> r13 = java.util.Map.class
                boolean r13 = r13.isAssignableFrom(r4)
                if (r13 == 0) goto L_0x0441
                java.lang.Class<java.util.Map> r13 = java.util.Map.class
                java.lang.reflect.Type r4 = ck0.C21273u.m49950f(r5, r4, r13)
                boolean r13 = r4 instanceof java.lang.reflect.ParameterizedType
                if (r13 == 0) goto L_0x0439
                java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
                r0 = 0
                java.lang.reflect.Type r0 = ck0.C21273u.m49948d(r0, r4)
                if (r12 != r0) goto L_0x0420
                r0 = 1
                java.lang.reflect.Type r0 = ck0.C21273u.m49948d(r0, r4)
                ck0.s r4 = r1.f53262a
                r4.mo53621f(r0, r6)
                ck0.o$j r0 = new ck0.o$j
                ek0.u r11 = (ek0.C23337u) r11
                boolean r4 = r11.encoded()
                r0.<init>(r4)
                goto L_0x06d4
            L_0x0420:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "@QueryMap keys must be of type String: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r0, r3)
                throw r0
            L_0x0439:
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r0, r3)
                throw r0
            L_0x0441:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "@QueryMap parameter type must be Map."
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x044b:
                boolean r4 = r11 instanceof ek0.C23325i
                if (r4 == 0) goto L_0x04ce
                ek0.i r11 = (ek0.C23325i) r11
                java.lang.String r0 = r11.value()
                java.lang.Class r4 = ck0.C21273u.m49949e(r5)
                java.lang.Class<java.lang.Iterable> r11 = java.lang.Iterable.class
                boolean r11 = r11.isAssignableFrom(r4)
                if (r11 == 0) goto L_0x04a3
                boolean r11 = r5 instanceof java.lang.reflect.ParameterizedType
                if (r11 == 0) goto L_0x047e
                r4 = r5
                java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
                r11 = 0
                java.lang.reflect.Type r4 = ck0.C21273u.m49948d(r11, r4)
                ck0.s r11 = r1.f53262a
                r11.mo53621f(r4, r6)
                ck0.o$d r4 = new ck0.o$d
                r4.<init>(r0)
                ck0.m r0 = new ck0.m
                r0.<init>(r4)
                goto L_0x06d4
            L_0x047e:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = r4.getSimpleName()
                r0.append(r3)
                r0.append(r15)
                java.lang.String r3 = r4.getSimpleName()
                r0.append(r3)
                r0.append(r14)
                java.lang.String r0 = r0.toString()
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r0, r3)
                throw r0
            L_0x04a3:
                boolean r11 = r4.isArray()
                if (r11 == 0) goto L_0x04c2
                java.lang.Class r4 = r4.getComponentType()
                java.lang.Class r4 = ck0.C21271t.m49940a(r4)
                ck0.s r11 = r1.f53262a
                r11.mo53621f(r4, r6)
                ck0.o$d r4 = new ck0.o$d
                r4.<init>(r0)
                ck0.n r0 = new ck0.n
                r0.<init>(r4)
                goto L_0x06d4
            L_0x04c2:
                ck0.s r4 = r1.f53262a
                r4.mo53621f(r5, r6)
                ck0.o$d r12 = new ck0.o$d
                r12.<init>(r0)
                goto L_0x067c
            L_0x04ce:
                boolean r4 = r11 instanceof ek0.C23326j
                if (r4 == 0) goto L_0x052d
                java.lang.Class r4 = ck0.C21273u.m49949e(r5)
                java.lang.Class<java.util.Map> r11 = java.util.Map.class
                boolean r11 = r11.isAssignableFrom(r4)
                if (r11 == 0) goto L_0x0523
                java.lang.Class<java.util.Map> r11 = java.util.Map.class
                java.lang.reflect.Type r4 = ck0.C21273u.m49950f(r5, r4, r11)
                boolean r11 = r4 instanceof java.lang.reflect.ParameterizedType
                if (r11 == 0) goto L_0x051b
                java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
                r0 = 0
                java.lang.reflect.Type r0 = ck0.C21273u.m49948d(r0, r4)
                if (r12 != r0) goto L_0x0502
                r0 = 1
                java.lang.reflect.Type r0 = ck0.C21273u.m49948d(r0, r4)
                ck0.s r4 = r1.f53262a
                r4.mo53621f(r0, r6)
                ck0.o$e r0 = new ck0.o$e
                r0.<init>()
                goto L_0x06d4
            L_0x0502:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "@HeaderMap keys must be of type String: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r0, r3)
                throw r0
            L_0x051b:
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r0, r3)
                throw r0
            L_0x0523:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "@HeaderMap parameter type must be Map."
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x052d:
                boolean r4 = r11 instanceof ek0.C23319c
                if (r4 == 0) goto L_0x05c5
                boolean r0 = r1.f53276o
                if (r0 == 0) goto L_0x05bb
                ek0.c r11 = (ek0.C23319c) r11
                java.lang.String r0 = r11.value()
                boolean r4 = r11.encoded()
                r11 = 1
                r1.f53268g = r11
                java.lang.Class r11 = ck0.C21273u.m49949e(r5)
                java.lang.Class<java.lang.Iterable> r12 = java.lang.Iterable.class
                boolean r12 = r12.isAssignableFrom(r11)
                if (r12 == 0) goto L_0x0590
                boolean r12 = r5 instanceof java.lang.reflect.ParameterizedType
                if (r12 == 0) goto L_0x056b
                r11 = r5
                java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
                r12 = 0
                java.lang.reflect.Type r11 = ck0.C21273u.m49948d(r12, r11)
                ck0.s r12 = r1.f53262a
                r12.mo53621f(r11, r6)
                ck0.o$b r11 = new ck0.o$b
                r11.<init>(r0, r4)
                ck0.m r0 = new ck0.m
                r0.<init>(r11)
                goto L_0x06d4
            L_0x056b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = r11.getSimpleName()
                r0.append(r3)
                r0.append(r15)
                java.lang.String r3 = r11.getSimpleName()
                r0.append(r3)
                r0.append(r14)
                java.lang.String r0 = r0.toString()
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r0, r3)
                throw r0
            L_0x0590:
                boolean r12 = r11.isArray()
                if (r12 == 0) goto L_0x05af
                java.lang.Class r11 = r11.getComponentType()
                java.lang.Class r11 = ck0.C21271t.m49940a(r11)
                ck0.s r12 = r1.f53262a
                r12.mo53621f(r11, r6)
                ck0.o$b r11 = new ck0.o$b
                r11.<init>(r0, r4)
                ck0.n r0 = new ck0.n
                r0.<init>(r11)
                goto L_0x06d4
            L_0x05af:
                ck0.s r11 = r1.f53262a
                r11.mo53621f(r5, r6)
                ck0.o$b r12 = new ck0.o$b
                r12.<init>(r0, r4)
                goto L_0x067c
            L_0x05bb:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "@Field parameters can only be used with form encoding."
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x05c5:
                boolean r4 = r11 instanceof ek0.C23320d
                if (r4 == 0) goto L_0x063a
                boolean r4 = r1.f53276o
                if (r4 == 0) goto L_0x0630
                java.lang.Class r4 = ck0.C21273u.m49949e(r5)
                java.lang.Class<java.util.Map> r13 = java.util.Map.class
                boolean r13 = r13.isAssignableFrom(r4)
                if (r13 == 0) goto L_0x0626
                java.lang.Class<java.util.Map> r13 = java.util.Map.class
                java.lang.reflect.Type r4 = ck0.C21273u.m49950f(r5, r4, r13)
                boolean r13 = r4 instanceof java.lang.reflect.ParameterizedType
                if (r13 == 0) goto L_0x061e
                java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
                r0 = 0
                java.lang.reflect.Type r0 = ck0.C21273u.m49948d(r0, r4)
                if (r12 != r0) goto L_0x0605
                r0 = 1
                java.lang.reflect.Type r4 = ck0.C21273u.m49948d(r0, r4)
                ck0.s r12 = r1.f53262a
                r12.mo53621f(r4, r6)
                r1.f53268g = r0
                ck0.o$c r0 = new ck0.o$c
                ek0.d r11 = (ek0.C23320d) r11
                boolean r4 = r11.encoded()
                r0.<init>(r4)
                goto L_0x06d4
            L_0x0605:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "@FieldMap keys must be of type String: "
                r3.append(r4)
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r0, r3)
                throw r0
            L_0x061e:
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r0, r3)
                throw r0
            L_0x0626:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "@FieldMap parameter type must be Map."
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x0630:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "@FieldMap parameters can only be used with form encoding."
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x063a:
                boolean r4 = r11 instanceof ek0.C23333q
                if (r4 == 0) goto L_0x07c2
                boolean r0 = r1.f53277p
                if (r0 == 0) goto L_0x07b8
                ek0.q r11 = (ek0.C23333q) r11
                r0 = 1
                r1.f53269h = r0
                java.lang.String r0 = r11.value()
                java.lang.Class r4 = ck0.C21273u.m49949e(r5)
                boolean r12 = r0.isEmpty()
                if (r12 == 0) goto L_0x06e1
                java.lang.Class<java.lang.Iterable> r0 = java.lang.Iterable.class
                boolean r0 = r0.isAssignableFrom(r4)
                java.lang.String r11 = "@Part annotation must supply a name or use MultipartBody.Part parameter type."
                if (r0 == 0) goto L_0x06aa
                boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L_0x0685
                r0 = r5
                java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
                r4 = 0
                java.lang.reflect.Type r0 = ck0.C21273u.m49948d(r4, r0)
                java.lang.Class r0 = ck0.C21273u.m49949e(r0)
                boolean r0 = r13.isAssignableFrom(r0)
                if (r0 == 0) goto L_0x067e
                ck0.o$l r0 = ck0.C21247o.C21259l.f53213a
                ck0.m r12 = new ck0.m
                r12.<init>(r0)
            L_0x067c:
                r0 = r12
                goto L_0x06d4
            L_0x067e:
                java.lang.Object[] r0 = new java.lang.Object[r4]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r11, r0)
                throw r0
            L_0x0685:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = r4.getSimpleName()
                r0.append(r3)
                r0.append(r15)
                java.lang.String r3 = r4.getSimpleName()
                r0.append(r3)
                r0.append(r14)
                java.lang.String r0 = r0.toString()
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r0, r3)
                throw r0
            L_0x06aa:
                boolean r0 = r4.isArray()
                if (r0 == 0) goto L_0x06cb
                java.lang.Class r0 = r4.getComponentType()
                boolean r0 = r13.isAssignableFrom(r0)
                if (r0 == 0) goto L_0x06c3
                ck0.o$l r0 = ck0.C21247o.C21259l.f53213a
                ck0.n r4 = new ck0.n
                r4.<init>(r0)
            L_0x06c1:
                r0 = r4
                goto L_0x06d4
            L_0x06c3:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r11, r0)
                throw r0
            L_0x06cb:
                r0 = 0
                boolean r4 = r13.isAssignableFrom(r4)
                if (r4 == 0) goto L_0x06da
                ck0.o$l r0 = ck0.C21247o.C21259l.f53213a
            L_0x06d4:
                r18 = r7
                r17 = r9
                goto L_0x08ab
            L_0x06da:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r11, r0)
                throw r0
            L_0x06e1:
                r12 = 4
                java.lang.String[] r12 = new java.lang.String[r12]
                java.lang.String r17 = "Content-Disposition"
                r18 = 0
                r12[r18] = r17
                r17 = r9
                java.lang.String r9 = "form-data; name=\""
                r18 = r7
                java.lang.String r7 = "\""
                java.lang.String r0 = p358af.C13437d.m33706k(r9, r0, r7)
                r7 = 1
                r12[r7] = r0
                java.lang.String r0 = "Content-Transfer-Encoding"
                r7 = 2
                r12[r7] = r0
                r0 = 3
                java.lang.String r7 = r11.encoding()
                r12[r0] = r7
                hi0.q r0 = hi0.C23556q.m57709f(r12)
                java.lang.Class<java.lang.Iterable> r7 = java.lang.Iterable.class
                boolean r7 = r7.isAssignableFrom(r4)
                java.lang.String r9 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."
                if (r7 == 0) goto L_0x076a
                boolean r7 = r5 instanceof java.lang.reflect.ParameterizedType
                if (r7 == 0) goto L_0x0745
                r4 = r5
                java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
                r7 = 0
                java.lang.reflect.Type r4 = ck0.C21273u.m49948d(r7, r4)
                java.lang.Class r7 = ck0.C21273u.m49949e(r4)
                boolean r7 = r13.isAssignableFrom(r7)
                if (r7 != 0) goto L_0x073d
                ck0.s r7 = r1.f53262a
                java.lang.annotation.Annotation[] r9 = r1.f53264c
                ck0.e r4 = r7.mo53619d(r4, r6, r9)
                ck0.o$f r7 = new ck0.o$f
                r7.<init>(r0, r4)
                ck0.m r0 = new ck0.m
                r0.<init>(r7)
                goto L_0x08ab
            L_0x073d:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r9, r0)
                throw r0
            L_0x0745:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = r4.getSimpleName()
                r0.append(r3)
                r0.append(r15)
                java.lang.String r3 = r4.getSimpleName()
                r0.append(r3)
                r0.append(r14)
                java.lang.String r0 = r0.toString()
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r0, r3)
                throw r0
            L_0x076a:
                boolean r7 = r4.isArray()
                if (r7 == 0) goto L_0x079a
                java.lang.Class r4 = r4.getComponentType()
                java.lang.Class r4 = ck0.C21271t.m49940a(r4)
                boolean r7 = r13.isAssignableFrom(r4)
                if (r7 != 0) goto L_0x0792
                ck0.s r7 = r1.f53262a
                java.lang.annotation.Annotation[] r9 = r1.f53264c
                ck0.e r4 = r7.mo53619d(r4, r6, r9)
                ck0.o$f r7 = new ck0.o$f
                r7.<init>(r0, r4)
                ck0.n r0 = new ck0.n
                r0.<init>(r7)
                goto L_0x08ab
            L_0x0792:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r9, r0)
                throw r0
            L_0x079a:
                r7 = 0
                boolean r4 = r13.isAssignableFrom(r4)
                if (r4 != 0) goto L_0x07b1
                ck0.s r4 = r1.f53262a
                java.lang.annotation.Annotation[] r7 = r1.f53264c
                ck0.e r4 = r4.mo53619d(r5, r6, r7)
                ck0.o$f r7 = new ck0.o$f
                r7.<init>(r0, r4)
                r0 = r7
                goto L_0x08ab
            L_0x07b1:
                java.lang.Object[] r0 = new java.lang.Object[r7]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r9, r0)
                throw r0
            L_0x07b8:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "@Part parameters can only be used with multipart encoding."
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x07c2:
                r18 = r7
                r17 = r9
                boolean r4 = r11 instanceof ek0.C23334r
                if (r4 == 0) goto L_0x0854
                boolean r4 = r1.f53277p
                if (r4 == 0) goto L_0x084a
                r4 = 1
                r1.f53269h = r4
                java.lang.Class r4 = ck0.C21273u.m49949e(r5)
                java.lang.Class<java.util.Map> r7 = java.util.Map.class
                boolean r7 = r7.isAssignableFrom(r4)
                if (r7 == 0) goto L_0x0840
                java.lang.Class<java.util.Map> r7 = java.util.Map.class
                java.lang.reflect.Type r4 = ck0.C21273u.m49950f(r5, r4, r7)
                boolean r7 = r4 instanceof java.lang.reflect.ParameterizedType
                if (r7 == 0) goto L_0x0838
                java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
                r0 = 0
                java.lang.reflect.Type r0 = ck0.C21273u.m49948d(r0, r4)
                if (r12 != r0) goto L_0x081f
                r0 = 1
                java.lang.reflect.Type r0 = ck0.C21273u.m49948d(r0, r4)
                java.lang.Class r4 = ck0.C21273u.m49949e(r0)
                boolean r4 = r13.isAssignableFrom(r4)
                if (r4 != 0) goto L_0x0815
                ck0.s r4 = r1.f53262a
                java.lang.annotation.Annotation[] r7 = r1.f53264c
                ck0.e r0 = r4.mo53619d(r0, r6, r7)
                ek0.r r11 = (ek0.C23334r) r11
                ck0.o$g r4 = new ck0.o$g
                java.lang.String r7 = r11.encoding()
                r4.<init>(r7, r0)
            L_0x0812:
                r0 = r4
                goto L_0x08ab
            L_0x0815:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x081f:
                r3 = 0
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "@PartMap keys must be of type String: "
                r4.append(r5)
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r0, r3)
                throw r0
            L_0x0838:
                r3 = 0
                java.lang.Object[] r3 = new java.lang.Object[r3]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r0, r3)
                throw r0
            L_0x0840:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "@PartMap parameter type must be Map."
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x084a:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "@PartMap parameters can only be used with multipart encoding."
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x0854:
                boolean r0 = r11 instanceof ek0.C23317a
                if (r0 == 0) goto L_0x08aa
                boolean r0 = r1.f53276o
                if (r0 != 0) goto L_0x08a0
                boolean r0 = r1.f53277p
                if (r0 != 0) goto L_0x08a0
                boolean r0 = r1.f53270i
                if (r0 != 0) goto L_0x0896
                ck0.s r0 = r1.f53262a     // Catch:{ RuntimeException -> 0x0875 }
                java.lang.annotation.Annotation[] r4 = r1.f53264c     // Catch:{ RuntimeException -> 0x0875 }
                ck0.e r0 = r0.mo53619d(r5, r6, r4)     // Catch:{ RuntimeException -> 0x0875 }
                r4 = 1
                r1.f53270i = r4
                ck0.o$a r4 = new ck0.o$a
                r4.<init>(r0)
                goto L_0x0812
            L_0x0875:
                r0 = move-exception
                r3 = 1
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r6 = 0
                r4[r6] = r5
                java.lang.String r5 = "Unable to create @Body converter for %s"
                java.lang.String r6 = " (parameter #"
                java.lang.StringBuilder r5 = p001a0.C0016g.m36t(r5, r6)
                int r2 = r2 + r3
                r5.append(r2)
                java.lang.String r2 = ")"
                r5.append(r2)
                java.lang.String r2 = r5.toString()
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r2, r0, r4)
                throw r0
            L_0x0896:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "Multiple @Body method annotations found."
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x08a0:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "@Body parameters cannot be used with form or multi-part encoding."
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x08aa:
                r0 = 0
            L_0x08ab:
                if (r0 != 0) goto L_0x08ae
                goto L_0x08b1
            L_0x08ae:
                if (r3 != 0) goto L_0x08bc
                r3 = r0
            L_0x08b1:
                int r10 = r10 + 1
                r4 = 1
                r0 = r16
                r9 = r17
                r7 = r18
                goto L_0x01cd
            L_0x08bc:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r3 = "Multiple Retrofit annotations found, only one allowed."
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x08c6:
                r16 = r0
                r18 = r7
                r0 = 0
                if (r3 == 0) goto L_0x08d7
                r8[r2] = r3
                int r2 = r2 + 1
                r3 = 0
                r4 = 1
                r0 = r16
                goto L_0x01b5
            L_0x08d7:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r3 = r18
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x08e0:
                r3 = r7
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r3, r0)
                throw r0
            L_0x08e9:
                r0 = 0
                java.lang.Object[] r3 = new java.lang.Object[r4]
                r3[r0] = r5
                java.lang.String r0 = "Parameter type must not include a type variable or wildcard: %s"
                java.lang.IllegalArgumentException r0 = r1.mo53628c(r2, r0, r3)
                throw r0
            L_0x08f5:
                r0 = 0
                java.lang.String r2 = r1.f53278q
                if (r2 != 0) goto L_0x090d
                boolean r2 = r1.f53273l
                if (r2 == 0) goto L_0x08ff
                goto L_0x090d
            L_0x08ff:
                java.lang.Object[] r2 = new java.lang.Object[r4]
                java.lang.String r3 = r1.f53274m
                r2[r0] = r3
                java.lang.String r0 = "Missing either @%s URL or @Url parameter."
                r3 = 0
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r0, r3, r2)
                throw r0
            L_0x090d:
                boolean r0 = r1.f53276o
                if (r0 != 0) goto L_0x0929
                boolean r2 = r1.f53277p
                if (r2 != 0) goto L_0x0929
                boolean r2 = r1.f53275n
                if (r2 != 0) goto L_0x0929
                boolean r2 = r1.f53270i
                if (r2 != 0) goto L_0x091e
                goto L_0x0929
            L_0x091e:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "Non-body HTTP method cannot contain @Body."
                r3 = 0
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r2, r3, r0)
                throw r0
            L_0x0929:
                r2 = 0
                r3 = 0
                if (r0 == 0) goto L_0x093b
                boolean r0 = r1.f53268g
                if (r0 == 0) goto L_0x0932
                goto L_0x093b
            L_0x0932:
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.String r2 = "Form-encoded method must contain at least one @Field."
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r2, r3, r0)
                throw r0
            L_0x093b:
                boolean r0 = r1.f53277p
                if (r0 == 0) goto L_0x094d
                boolean r0 = r1.f53269h
                if (r0 == 0) goto L_0x0944
                goto L_0x094d
            L_0x0944:
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.String r2 = "Multipart method must contain at least one @Part."
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r2, r3, r0)
                throw r0
            L_0x094d:
                ck0.t r0 = new ck0.t
                r0.<init>(r1)
                return r0
            L_0x0953:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "HTTP method annotation is required (e.g., @GET, @POST, etc.)."
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r2, r3, r0)
                throw r0
            L_0x095d:
                r0 = move-exception
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.reflect.Type r3 = r1.f53267f
                r4 = 0
                r2[r4] = r3
                java.lang.String r3 = "Unable to create converter for %s"
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r3, r0, r2)
                throw r0
            L_0x096d:
                java.lang.String r0 = "'"
                java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
                java.lang.reflect.Type r2 = r1.f53267f
                java.lang.Class r2 = ck0.C21273u.m49949e(r2)
                java.lang.String r2 = r2.getName()
                r0.append(r2)
                java.lang.String r2 = "' is not a valid response body type. Did you mean ResponseBody?"
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r2 = 0
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r0, r3, r2)
                throw r0
            L_0x0992:
                r0 = move-exception
                r3 = 0
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r3] = r2
                java.lang.String r2 = "Unable to create call adapter for %s"
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r2, r0, r4)
                throw r0
            L_0x099f:
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r2 = "Service methods cannot return void."
                r3 = 0
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r2, r3, r0)
                throw r0
            L_0x09aa:
                r0 = 0
                java.lang.Object[] r4 = new java.lang.Object[r4]
                r4[r0] = r2
                java.lang.String r0 = "Method return type must not include a type variable or wildcard: %s"
                java.lang.IllegalArgumentException r0 = r1.mo53627b(r0, r3, r4)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ck0.C21271t.C21272a.mo53626a():ck0.t");
        }

        /* renamed from: b */
        public final IllegalArgumentException mo53627b(String str, RuntimeException runtimeException, Object... objArr) {
            StringBuilder t = C0016g.m36t(String.format(str, objArr), "\n    for method ");
            t.append(this.f53263b.getDeclaringClass().getSimpleName());
            t.append(".");
            t.append(this.f53263b.getName());
            return new IllegalArgumentException(t.toString(), runtimeException);
        }

        /* renamed from: c */
        public final IllegalArgumentException mo53628c(int i, String str, Object... objArr) {
            StringBuilder t = C0016g.m36t(str, " (parameter #");
            t.append(i + 1);
            t.append(")");
            return mo53627b(t.toString(), (RuntimeException) null, objArr);
        }

        /* renamed from: d */
        public final void mo53629d(String str, String str2, boolean z) {
            String str3 = this.f53274m;
            if (str3 == null) {
                this.f53274m = str;
                this.f53275n = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (C21271t.f53248m.matcher(substring).find()) {
                            throw mo53627b("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", (RuntimeException) null, substring);
                        }
                    }
                    this.f53278q = str2;
                    Matcher matcher = C21271t.f53248m.matcher(str2);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (matcher.find()) {
                        linkedHashSet.add(matcher.group(1));
                    }
                    this.f53281t = linkedHashSet;
                    return;
                }
                return;
            }
            throw mo53627b("Only one HTTP method is allowed. Found: %s and %s.", (RuntimeException) null, str3, str);
        }
    }

    public C21271t(C21272a<R, T> aVar) {
        C21268s sVar = aVar.f53262a;
        this.f53250a = sVar.f53232b;
        this.f53251b = aVar.f53284w;
        this.f53252c = sVar.f53233c;
        this.f53253d = aVar.f53283v;
        this.f53254e = aVar.f53274m;
        this.f53255f = aVar.f53278q;
        this.f53256g = aVar.f53279r;
        this.f53257h = aVar.f53280s;
        this.f53258i = aVar.f53275n;
        this.f53259j = aVar.f53276o;
        this.f53260k = aVar.f53277p;
        this.f53261l = aVar.f53282u;
    }

    /* renamed from: a */
    public static Class<?> m49940a(Class<?> cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        return cls;
    }
}
