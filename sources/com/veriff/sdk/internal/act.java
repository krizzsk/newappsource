package com.veriff.sdk.internal;

import com.amazonaws.http.HttpHeader;
import com.veriff.sdk.internal.C22736yk;
import com.veriff.sdk.internal.C22743yo;
import com.veriff.sdk.internal.acq;
import ff0.C23349c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p358af.C13437d;

final class act {

    /* renamed from: a */
    public final String f53737a;

    /* renamed from: b */
    public final boolean f53738b;

    /* renamed from: c */
    private final Method f53739c;

    /* renamed from: d */
    private final C22738yl f53740d;

    /* renamed from: e */
    private final String f53741e;

    /* renamed from: f */
    private final C22736yk f53742f;

    /* renamed from: g */
    private final C22742yn f53743g;

    /* renamed from: h */
    private final boolean f53744h;

    /* renamed from: i */
    private final boolean f53745i;

    /* renamed from: j */
    private final boolean f53746j;

    /* renamed from: k */
    private final acq<?>[] f53747k;

    public act(C21382a aVar) {
        this.f53739c = aVar.f53751b;
        this.f53740d = aVar.f53750a.f53777b;
        this.f53737a = aVar.f53763n;
        this.f53741e = aVar.f53767r;
        this.f53742f = aVar.f53768s;
        this.f53743g = aVar.f53769t;
        this.f53744h = aVar.f53764o;
        this.f53745i = aVar.f53765p;
        this.f53746j = aVar.f53766q;
        this.f53747k = aVar.f53771v;
        this.f53738b = aVar.f53772w;
    }

    /* renamed from: a */
    public static act m50788a(acv acv, Method method) {
        return new C21382a(acv, method).mo54069a();
    }

    /* renamed from: a */
    public C22752ys mo54068a(Object[] objArr) throws IOException {
        acq<?>[] acqArr = this.f53747k;
        int length = objArr.length;
        if (length == acqArr.length) {
            acs acs = new acs(this.f53737a, this.f53740d, this.f53741e, this.f53742f, this.f53743g, this.f53744h, this.f53745i, this.f53746j);
            if (this.f53738b) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(objArr[i]);
                acqArr[i].mo54038a(acs, objArr[i]);
            }
            return acs.mo54054a().mo57405a(acm.class, new acm(this.f53739c, arrayList)).mo57409a();
        }
        throw new IllegalArgumentException(C13437d.m33707l(C25541a.m63887r("Argument count (", length, ") doesn't match expected count ("), acqArr.length, ")"));
    }

    /* renamed from: com.veriff.sdk.internal.act$a */
    public static final class C21382a {

        /* renamed from: x */
        private static final Pattern f53748x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

        /* renamed from: y */
        private static final Pattern f53749y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        public final acv f53750a;

        /* renamed from: b */
        public final Method f53751b;

        /* renamed from: c */
        public final Annotation[] f53752c;

        /* renamed from: d */
        public final Annotation[][] f53753d;

        /* renamed from: e */
        public final Type[] f53754e;

        /* renamed from: f */
        public boolean f53755f;

        /* renamed from: g */
        public boolean f53756g;

        /* renamed from: h */
        public boolean f53757h;

        /* renamed from: i */
        public boolean f53758i;

        /* renamed from: j */
        public boolean f53759j;

        /* renamed from: k */
        public boolean f53760k;

        /* renamed from: l */
        public boolean f53761l;

        /* renamed from: m */
        public boolean f53762m;

        /* renamed from: n */
        public String f53763n;

        /* renamed from: o */
        public boolean f53764o;

        /* renamed from: p */
        public boolean f53765p;

        /* renamed from: q */
        public boolean f53766q;

        /* renamed from: r */
        public String f53767r;

        /* renamed from: s */
        public C22736yk f53768s;

        /* renamed from: t */
        public C22742yn f53769t;

        /* renamed from: u */
        public Set<String> f53770u;

        /* renamed from: v */
        public acq<?>[] f53771v;

        /* renamed from: w */
        public boolean f53772w;

        public C21382a(acv acv, Method method) {
            this.f53750a = acv;
            this.f53751b = method;
            this.f53752c = method.getAnnotations();
            this.f53754e = method.getGenericParameterTypes();
            this.f53753d = method.getParameterAnnotations();
        }

        /* renamed from: a */
        public act mo54069a() {
            for (Annotation a : this.f53752c) {
                m50798a(a);
            }
            if (this.f53763n != null) {
                if (!this.f53764o) {
                    if (this.f53766q) {
                        throw acz.m50834a(this.f53751b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.f53765p) {
                        throw acz.m50834a(this.f53751b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f53753d.length;
                this.f53771v = new acq[length];
                int i = length - 1;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 >= length) {
                        break;
                    }
                    acq<?>[] acqArr = this.f53771v;
                    Type type = this.f53754e[i2];
                    Annotation[] annotationArr = this.f53753d[i2];
                    if (i2 != i) {
                        z = false;
                    }
                    acqArr[i2] = m50791a(i2, type, annotationArr, z);
                    i2++;
                }
                if (this.f53767r != null || this.f53762m) {
                    boolean z2 = this.f53765p;
                    if (!z2 && !this.f53766q && !this.f53764o && this.f53757h) {
                        throw acz.m50834a(this.f53751b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    } else if (z2 && !this.f53755f) {
                        throw acz.m50834a(this.f53751b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    } else if (!this.f53766q || this.f53756g) {
                        return new act(this);
                    } else {
                        throw acz.m50834a(this.f53751b, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                } else {
                    throw acz.m50834a(this.f53751b, "Missing either @%s URL or @Url parameter.", this.f53763n);
                }
            } else {
                throw acz.m50834a(this.f53751b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }

        /* renamed from: a */
        private void m50798a(Annotation annotation) {
            if (annotation instanceof ade) {
                m50797a("DELETE", ((ade) annotation).mo54124a(), false);
            } else if (annotation instanceof adi) {
                m50797a("GET", ((adi) annotation).mo54128a(), false);
            } else if (annotation instanceof adj) {
                m50797a("HEAD", ((adj) annotation).mo54129a(), false);
            } else if (annotation instanceof adq) {
                m50797a("PATCH", ((adq) annotation).mo54136a(), true);
            } else if (annotation instanceof adr) {
                m50797a("POST", ((adr) annotation).mo54137a(), true);
            } else if (annotation instanceof C21390ads) {
                m50797a("PUT", ((C21390ads) annotation).mo54138a(), true);
            } else if (annotation instanceof adp) {
                m50797a("OPTIONS", ((adp) annotation).mo54135a(), false);
            } else if (annotation instanceof adk) {
                adk adk = (adk) annotation;
                m50797a(adk.mo54130a(), adk.mo54131b(), adk.mo54132c());
            } else if (annotation instanceof adn) {
                String[] a = ((adn) annotation).mo54134a();
                if (a.length != 0) {
                    this.f53768s = m50792a(a);
                    return;
                }
                throw acz.m50834a(this.f53751b, "@Headers annotation is empty.", new Object[0]);
            } else if (annotation instanceof ado) {
                if (!this.f53765p) {
                    this.f53766q = true;
                    return;
                }
                throw acz.m50834a(this.f53751b, "Only one encoding annotation is allowed.", new Object[0]);
            } else if (!(annotation instanceof adh)) {
            } else {
                if (!this.f53766q) {
                    this.f53765p = true;
                    return;
                }
                throw acz.m50834a(this.f53751b, "Only one encoding annotation is allowed.", new Object[0]);
            }
        }

        /* renamed from: a */
        private void m50797a(String str, String str2, boolean z) {
            String str3 = this.f53763n;
            if (str3 == null) {
                this.f53763n = str;
                this.f53764o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (f53748x.matcher(substring).find()) {
                            throw acz.m50834a(this.f53751b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.f53767r = str2;
                    this.f53770u = m50794a(str2);
                    return;
                }
                return;
            }
            throw acz.m50834a(this.f53751b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* renamed from: a */
        private C22736yk m50792a(String[] strArr) {
            C22736yk.C22737a aVar = new C22736yk.C22737a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw acz.m50834a(this.f53751b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if (HttpHeader.CONTENT_TYPE.equalsIgnoreCase(substring)) {
                    try {
                        this.f53769t = C22742yn.m55639a(trim);
                    } catch (IllegalArgumentException e) {
                        throw acz.m50836a(this.f53751b, (Throwable) e, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.mo57276a(substring, trim);
                }
            }
            return aVar.mo57277a();
        }

        /* renamed from: a */
        private acq<?> m50791a(int i, Type type, Annotation[] annotationArr, boolean z) {
            acq<?> acq;
            if (annotationArr != null) {
                acq = null;
                for (Annotation a : annotationArr) {
                    acq<?> a2 = m50790a(i, type, annotationArr, a);
                    if (a2 != null) {
                        if (acq == null) {
                            acq = a2;
                        } else {
                            throw acz.m50833a(this.f53751b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                    }
                }
            } else {
                acq = null;
            }
            if (acq != null) {
                return acq;
            }
            if (z) {
                try {
                    if (acz.m50831a(type) == C23349c.class) {
                        this.f53772w = true;
                        return null;
                    }
                } catch (NoClassDefFoundError unused) {
                }
            }
            throw acz.m50833a(this.f53751b, i, "No Retrofit annotation found.", new Object[0]);
        }

        /* renamed from: a */
        private acq<?> m50790a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            Class<String> cls = String.class;
            Class<C22743yo.C22745b> cls2 = C22743yo.C22745b.class;
            if (annotation instanceof aeb) {
                m50796a(i, type);
                if (this.f53762m) {
                    throw acz.m50833a(this.f53751b, i, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f53758i) {
                    throw acz.m50833a(this.f53751b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f53759j) {
                    throw acz.m50833a(this.f53751b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                } else if (this.f53760k) {
                    throw acz.m50833a(this.f53751b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f53761l) {
                    throw acz.m50833a(this.f53751b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f53767r == null) {
                    this.f53762m = true;
                    if (type == C22738yl.class || type == cls || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new acq.C21377n(this.f53751b, i);
                    }
                    throw acz.m50833a(this.f53751b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw acz.m50833a(this.f53751b, i, "@Url cannot be used with @%s URL", this.f53763n);
                }
            } else if (annotation instanceof adv) {
                m50796a(i, type);
                if (this.f53759j) {
                    throw acz.m50833a(this.f53751b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f53760k) {
                    throw acz.m50833a(this.f53751b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                } else if (this.f53761l) {
                    throw acz.m50833a(this.f53751b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                } else if (this.f53762m) {
                    throw acz.m50833a(this.f53751b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f53767r != null) {
                    this.f53758i = true;
                    adv adv = (adv) annotation;
                    String a = adv.mo54142a();
                    m50795a(i, a);
                    return new acq.C21372i(this.f53751b, i, a, this.f53750a.mo54085c(type, annotationArr), adv.mo54143b());
                } else {
                    throw acz.m50833a(this.f53751b, i, "@Path can only be used with relative url on @%s", this.f53763n);
                }
            } else if (annotation instanceof adw) {
                m50796a(i, type);
                adw adw = (adw) annotation;
                String a2 = adw.mo54144a();
                boolean b = adw.mo54145b();
                Class<?> a3 = acz.m50831a(type);
                this.f53759j = true;
                if (Iterable.class.isAssignableFrom(a3)) {
                    if (type instanceof ParameterizedType) {
                        return new acq.C21373j(a2, this.f53750a.mo54085c(acz.m50837a(0, (ParameterizedType) type), annotationArr), b).mo54037a();
                    }
                    throw acz.m50833a(this.f53751b, i, a3.getSimpleName() + " must include generic type (e.g., " + a3.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a3.isArray()) {
                    return new acq.C21373j(a2, this.f53750a.mo54085c(type, annotationArr), b);
                } else {
                    return new acq.C21373j(a2, this.f53750a.mo54085c(m50793a(a3.getComponentType()), annotationArr), b).mo54039b();
                }
            } else if (annotation instanceof ady) {
                m50796a(i, type);
                boolean a4 = ((ady) annotation).mo54147a();
                Class<?> a5 = acz.m50831a(type);
                this.f53760k = true;
                if (Iterable.class.isAssignableFrom(a5)) {
                    if (type instanceof ParameterizedType) {
                        return new acq.C21375l(this.f53750a.mo54085c(acz.m50837a(0, (ParameterizedType) type), annotationArr), a4).mo54037a();
                    }
                    throw acz.m50833a(this.f53751b, i, a5.getSimpleName() + " must include generic type (e.g., " + a5.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a5.isArray()) {
                    return new acq.C21375l(this.f53750a.mo54085c(type, annotationArr), a4);
                } else {
                    return new acq.C21375l(this.f53750a.mo54085c(m50793a(a5.getComponentType()), annotationArr), a4).mo54039b();
                }
            } else if (annotation instanceof adx) {
                m50796a(i, type);
                Class<?> a6 = acz.m50831a(type);
                this.f53761l = true;
                if (Map.class.isAssignableFrom(a6)) {
                    Type b2 = acz.m50846b(type, a6, Map.class);
                    if (b2 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) b2;
                        Type a7 = acz.m50837a(0, parameterizedType);
                        if (cls == a7) {
                            return new acq.C21374k(this.f53751b, i, this.f53750a.mo54085c(acz.m50837a(1, parameterizedType), annotationArr), ((adx) annotation).mo54146a());
                        }
                        throw acz.m50833a(this.f53751b, i, "@QueryMap keys must be of type String: " + a7, new Object[0]);
                    }
                    throw acz.m50833a(this.f53751b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw acz.m50833a(this.f53751b, i, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof adl) {
                m50796a(i, type);
                String a8 = ((adl) annotation).mo54133a();
                Class<?> a9 = acz.m50831a(type);
                if (Iterable.class.isAssignableFrom(a9)) {
                    if (type instanceof ParameterizedType) {
                        return new acq.C21367d(a8, this.f53750a.mo54085c(acz.m50837a(0, (ParameterizedType) type), annotationArr)).mo54037a();
                    }
                    throw acz.m50833a(this.f53751b, i, a9.getSimpleName() + " must include generic type (e.g., " + a9.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a9.isArray()) {
                    return new acq.C21367d(a8, this.f53750a.mo54085c(type, annotationArr));
                } else {
                    return new acq.C21367d(a8, this.f53750a.mo54085c(m50793a(a9.getComponentType()), annotationArr)).mo54039b();
                }
            } else if (annotation instanceof C21389adm) {
                if (type == C22736yk.class) {
                    return new acq.C21369f(this.f53751b, i);
                }
                m50796a(i, type);
                Class<?> a11 = acz.m50831a(type);
                if (Map.class.isAssignableFrom(a11)) {
                    Type b3 = acz.m50846b(type, a11, Map.class);
                    if (b3 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) b3;
                        Type a12 = acz.m50837a(0, parameterizedType2);
                        if (cls == a12) {
                            return new acq.C21368e(this.f53751b, i, this.f53750a.mo54085c(acz.m50837a(1, parameterizedType2), annotationArr));
                        }
                        throw acz.m50833a(this.f53751b, i, "@HeaderMap keys must be of type String: " + a12, new Object[0]);
                    }
                    throw acz.m50833a(this.f53751b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw acz.m50833a(this.f53751b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof adf) {
                m50796a(i, type);
                if (this.f53765p) {
                    adf adf = (adf) annotation;
                    String a13 = adf.mo54125a();
                    boolean b4 = adf.mo54126b();
                    this.f53755f = true;
                    Class<?> a14 = acz.m50831a(type);
                    if (Iterable.class.isAssignableFrom(a14)) {
                        if (type instanceof ParameterizedType) {
                            return new acq.C21365b(a13, this.f53750a.mo54085c(acz.m50837a(0, (ParameterizedType) type), annotationArr), b4).mo54037a();
                        }
                        throw acz.m50833a(this.f53751b, i, a14.getSimpleName() + " must include generic type (e.g., " + a14.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!a14.isArray()) {
                        return new acq.C21365b(a13, this.f53750a.mo54085c(type, annotationArr), b4);
                    } else {
                        return new acq.C21365b(a13, this.f53750a.mo54085c(m50793a(a14.getComponentType()), annotationArr), b4).mo54039b();
                    }
                } else {
                    throw acz.m50833a(this.f53751b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof adg) {
                m50796a(i, type);
                if (this.f53765p) {
                    Class<?> a15 = acz.m50831a(type);
                    if (Map.class.isAssignableFrom(a15)) {
                        Type b5 = acz.m50846b(type, a15, Map.class);
                        if (b5 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) b5;
                            Type a16 = acz.m50837a(0, parameterizedType3);
                            if (cls == a16) {
                                aci c = this.f53750a.mo54085c(acz.m50837a(1, parameterizedType3), annotationArr);
                                this.f53755f = true;
                                return new acq.C21366c(this.f53751b, i, c, ((adg) annotation).mo54127a());
                            }
                            throw acz.m50833a(this.f53751b, i, "@FieldMap keys must be of type String: " + a16, new Object[0]);
                        }
                        throw acz.m50833a(this.f53751b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw acz.m50833a(this.f53751b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw acz.m50833a(this.f53751b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof adt) {
                m50796a(i, type);
                if (this.f53766q) {
                    adt adt = (adt) annotation;
                    this.f53756g = true;
                    String a17 = adt.mo54139a();
                    Class<?> a18 = acz.m50831a(type);
                    if (!a17.isEmpty()) {
                        C22736yk a19 = C22736yk.m55552a("Content-Disposition", C13437d.m33706k("form-data; name=\"", a17, "\""), "Content-Transfer-Encoding", adt.mo54140b());
                        if (Iterable.class.isAssignableFrom(a18)) {
                            if (type instanceof ParameterizedType) {
                                Type a21 = acz.m50837a(0, (ParameterizedType) type);
                                if (!cls2.isAssignableFrom(acz.m50831a(a21))) {
                                    return new acq.C21370g(this.f53751b, i, a19, this.f53750a.mo54081a(a21, annotationArr, this.f53752c)).mo54037a();
                                }
                                throw acz.m50833a(this.f53751b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            throw acz.m50833a(this.f53751b, i, a18.getSimpleName() + " must include generic type (e.g., " + a18.getSimpleName() + "<String>)", new Object[0]);
                        } else if (a18.isArray()) {
                            Class<?> a22 = m50793a(a18.getComponentType());
                            if (!cls2.isAssignableFrom(a22)) {
                                return new acq.C21370g(this.f53751b, i, a19, this.f53750a.mo54081a((Type) a22, annotationArr, this.f53752c)).mo54039b();
                            }
                            throw acz.m50833a(this.f53751b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!cls2.isAssignableFrom(a18)) {
                            return new acq.C21370g(this.f53751b, i, a19, this.f53750a.mo54081a(type, annotationArr, this.f53752c));
                        } else {
                            throw acz.m50833a(this.f53751b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(a18)) {
                        if (!(type instanceof ParameterizedType)) {
                            throw acz.m50833a(this.f53751b, i, a18.getSimpleName() + " must include generic type (e.g., " + a18.getSimpleName() + "<String>)", new Object[0]);
                        } else if (cls2.isAssignableFrom(acz.m50831a(acz.m50837a(0, (ParameterizedType) type)))) {
                            return acq.C21376m.f53714a.mo54037a();
                        } else {
                            throw acz.m50833a(this.f53751b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (a18.isArray()) {
                        if (cls2.isAssignableFrom(a18.getComponentType())) {
                            return acq.C21376m.f53714a.mo54039b();
                        }
                        throw acz.m50833a(this.f53751b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (cls2.isAssignableFrom(a18)) {
                        return acq.C21376m.f53714a;
                    } else {
                        throw acz.m50833a(this.f53751b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw acz.m50833a(this.f53751b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof adu) {
                m50796a(i, type);
                if (this.f53766q) {
                    this.f53756g = true;
                    Class<?> a23 = acz.m50831a(type);
                    if (Map.class.isAssignableFrom(a23)) {
                        Type b6 = acz.m50846b(type, a23, Map.class);
                        if (b6 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) b6;
                            Type a24 = acz.m50837a(0, parameterizedType4);
                            if (cls == a24) {
                                Type a25 = acz.m50837a(1, parameterizedType4);
                                if (!cls2.isAssignableFrom(acz.m50831a(a25))) {
                                    return new acq.C21371h(this.f53751b, i, this.f53750a.mo54081a(a25, annotationArr, this.f53752c), ((adu) annotation).mo54141a());
                                }
                                throw acz.m50833a(this.f53751b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw acz.m50833a(this.f53751b, i, "@PartMap keys must be of type String: " + a24, new Object[0]);
                        }
                        throw acz.m50833a(this.f53751b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw acz.m50833a(this.f53751b, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw acz.m50833a(this.f53751b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof add) {
                m50796a(i, type);
                if (this.f53765p || this.f53766q) {
                    throw acz.m50833a(this.f53751b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f53757h) {
                    try {
                        aci a26 = this.f53750a.mo54081a(type, annotationArr, this.f53752c);
                        this.f53757h = true;
                        return new acq.C21364a(this.f53751b, i, a26);
                    } catch (RuntimeException e) {
                        throw acz.m50835a(this.f53751b, e, i, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw acz.m50833a(this.f53751b, i, "Multiple @Body method annotations found.", new Object[0]);
                }
            } else if (!(annotation instanceof aea)) {
                return null;
            } else {
                m50796a(i, type);
                Class<?> a27 = acz.m50831a(type);
                int i2 = i - 1;
                while (i2 >= 0) {
                    acq<?> acq = this.f53771v[i2];
                    if (!(acq instanceof acq.C21378o) || !((acq.C21378o) acq).f53717a.equals(a27)) {
                        i2--;
                    } else {
                        Method method = this.f53751b;
                        StringBuilder k = C13555b.m33972k("@Tag type ");
                        k.append(a27.getName());
                        k.append(" is duplicate of parameter #");
                        k.append(i2 + 1);
                        k.append(" and would always overwrite its value.");
                        throw acz.m50833a(method, i, k.toString(), new Object[0]);
                    }
                }
                return new acq.C21378o(a27);
            }
        }

        /* renamed from: a */
        private void m50796a(int i, Type type) {
            if (acz.m50848d(type)) {
                throw acz.m50833a(this.f53751b, i, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        /* renamed from: a */
        private void m50795a(int i, String str) {
            if (!f53749y.matcher(str).matches()) {
                throw acz.m50833a(this.f53751b, i, "@Path parameter name must match %s. Found: %s", f53748x.pattern(), str);
            } else if (!this.f53770u.contains(str)) {
                throw acz.m50833a(this.f53751b, i, "URL \"%s\" does not contain \"{%s}\".", this.f53767r, str);
            }
        }

        /* renamed from: a */
        public static Set<String> m50794a(String str) {
            Matcher matcher = f53748x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        /* renamed from: a */
        private static Class<?> m50793a(Class<?> cls) {
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
            return Short.TYPE == cls ? Short.class : cls;
        }
    }
}
