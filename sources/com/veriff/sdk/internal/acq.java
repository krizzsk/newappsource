package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C22743yo;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import p001a0.C0016g;
import p358af.C13437d;

abstract class acq<T> {

    /* renamed from: com.veriff.sdk.internal.acq$a */
    public static final class C21364a<T> extends acq<T> {

        /* renamed from: a */
        private final Method f53675a;

        /* renamed from: b */
        private final int f53676b;

        /* renamed from: c */
        private final aci<T, C22754yt> f53677c;

        public C21364a(Method method, int i, aci<T, C22754yt> aci) {
            this.f53675a = method;
            this.f53676b = i;
            this.f53677c = aci;
        }

        /* renamed from: a */
        public void mo54038a(acs acs, T t) {
            if (t != null) {
                try {
                    acs.mo54058a(this.f53677c.mo53996a(t));
                } catch (IOException e) {
                    Method method = this.f53675a;
                    int i = this.f53676b;
                    throw acz.m50835a(method, e, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            } else {
                throw acz.m50833a(this.f53675a, this.f53676b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.acq$b */
    public static final class C21365b<T> extends acq<T> {

        /* renamed from: a */
        private final String f53678a;

        /* renamed from: b */
        private final aci<T, String> f53679b;

        /* renamed from: c */
        private final boolean f53680c;

        public C21365b(String str, aci<T, String> aci, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f53678a = str;
            this.f53679b = aci;
            this.f53680c = z;
        }

        /* renamed from: a */
        public void mo54038a(acs acs, T t) throws IOException {
            String a;
            if (t != null && (a = this.f53679b.mo53996a(t)) != null) {
                acs.mo54064c(this.f53678a, a, this.f53680c);
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.acq$c */
    public static final class C21366c<T> extends acq<Map<String, T>> {

        /* renamed from: a */
        private final Method f53681a;

        /* renamed from: b */
        private final int f53682b;

        /* renamed from: c */
        private final aci<T, String> f53683c;

        /* renamed from: d */
        private final boolean f53684d;

        public C21366c(Method method, int i, aci<T, String> aci, boolean z) {
            this.f53681a = method;
            this.f53682b = i;
            this.f53683c = aci;
            this.f53684d = z;
        }

        /* renamed from: a */
        public void mo54038a(acs acs, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a = this.f53683c.mo53996a(value);
                            if (a != null) {
                                acs.mo54064c(str, a, this.f53684d);
                            } else {
                                Method method = this.f53681a;
                                int i = this.f53682b;
                                throw acz.m50833a(method, i, "Field map value '" + value + "' converted to null by " + this.f53683c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw acz.m50833a(this.f53681a, this.f53682b, C13437d.m33706k("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw acz.m50833a(this.f53681a, this.f53682b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw acz.m50833a(this.f53681a, this.f53682b, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: com.veriff.sdk.internal.acq$d */
    public static final class C21367d<T> extends acq<T> {

        /* renamed from: a */
        private final String f53685a;

        /* renamed from: b */
        private final aci<T, String> f53686b;

        public C21367d(String str, aci<T, String> aci) {
            Objects.requireNonNull(str, "name == null");
            this.f53685a = str;
            this.f53686b = aci;
        }

        /* renamed from: a */
        public void mo54038a(acs acs, T t) throws IOException {
            String a;
            if (t != null && (a = this.f53686b.mo53996a(t)) != null) {
                acs.mo54061a(this.f53685a, a);
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.acq$e */
    public static final class C21368e<T> extends acq<Map<String, T>> {

        /* renamed from: a */
        private final Method f53687a;

        /* renamed from: b */
        private final int f53688b;

        /* renamed from: c */
        private final aci<T, String> f53689c;

        public C21368e(Method method, int i, aci<T, String> aci) {
            this.f53687a = method;
            this.f53688b = i;
            this.f53689c = aci;
        }

        /* renamed from: a */
        public void mo54038a(acs acs, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            acs.mo54061a(str, this.f53689c.mo53996a(value));
                        } else {
                            throw acz.m50833a(this.f53687a, this.f53688b, C13437d.m33706k("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw acz.m50833a(this.f53687a, this.f53688b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw acz.m50833a(this.f53687a, this.f53688b, "Header map was null.", new Object[0]);
        }
    }

    /* renamed from: com.veriff.sdk.internal.acq$f */
    public static final class C21369f extends acq<C22736yk> {

        /* renamed from: a */
        private final Method f53690a;

        /* renamed from: b */
        private final int f53691b;

        public C21369f(Method method, int i) {
            this.f53690a = method;
            this.f53691b = i;
        }

        /* renamed from: a */
        public void mo54038a(acs acs, C22736yk ykVar) {
            if (ykVar != null) {
                acs.mo54055a(ykVar);
                return;
            }
            throw acz.m50833a(this.f53690a, this.f53691b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* renamed from: com.veriff.sdk.internal.acq$g */
    public static final class C21370g<T> extends acq<T> {

        /* renamed from: a */
        private final Method f53692a;

        /* renamed from: b */
        private final int f53693b;

        /* renamed from: c */
        private final C22736yk f53694c;

        /* renamed from: d */
        private final aci<T, C22754yt> f53695d;

        public C21370g(Method method, int i, C22736yk ykVar, aci<T, C22754yt> aci) {
            this.f53692a = method;
            this.f53693b = i;
            this.f53694c = ykVar;
            this.f53695d = aci;
        }

        /* renamed from: a */
        public void mo54038a(acs acs, T t) {
            if (t != null) {
                try {
                    acs.mo54056a(this.f53694c, this.f53695d.mo53996a(t));
                } catch (IOException e) {
                    Method method = this.f53692a;
                    int i = this.f53693b;
                    throw acz.m50833a(method, i, "Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.acq$h */
    public static final class C21371h<T> extends acq<Map<String, T>> {

        /* renamed from: a */
        private final Method f53696a;

        /* renamed from: b */
        private final int f53697b;

        /* renamed from: c */
        private final aci<T, C22754yt> f53698c;

        /* renamed from: d */
        private final String f53699d;

        public C21371h(Method method, int i, aci<T, C22754yt> aci, String str) {
            this.f53696a = method;
            this.f53697b = i;
            this.f53698c = aci;
            this.f53699d = str;
        }

        /* renamed from: a */
        public void mo54038a(acs acs, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            acs.mo54056a(C22736yk.m55552a("Content-Disposition", C13437d.m33706k("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f53699d), this.f53698c.mo53996a(value));
                        } else {
                            throw acz.m50833a(this.f53696a, this.f53697b, C13437d.m33706k("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw acz.m50833a(this.f53696a, this.f53697b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw acz.m50833a(this.f53696a, this.f53697b, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: com.veriff.sdk.internal.acq$i */
    public static final class C21372i<T> extends acq<T> {

        /* renamed from: a */
        private final Method f53700a;

        /* renamed from: b */
        private final int f53701b;

        /* renamed from: c */
        private final String f53702c;

        /* renamed from: d */
        private final aci<T, String> f53703d;

        /* renamed from: e */
        private final boolean f53704e;

        public C21372i(Method method, int i, String str, aci<T, String> aci, boolean z) {
            this.f53700a = method;
            this.f53701b = i;
            Objects.requireNonNull(str, "name == null");
            this.f53702c = str;
            this.f53703d = aci;
            this.f53704e = z;
        }

        /* renamed from: a */
        public void mo54038a(acs acs, T t) throws IOException {
            if (t != null) {
                acs.mo54062a(this.f53702c, this.f53703d.mo53996a(t), this.f53704e);
                return;
            }
            throw acz.m50833a(this.f53700a, this.f53701b, C0016g.m31o(C13555b.m33972k("Path parameter \""), this.f53702c, "\" value must not be null."), new Object[0]);
        }
    }

    /* renamed from: com.veriff.sdk.internal.acq$j */
    public static final class C21373j<T> extends acq<T> {

        /* renamed from: a */
        private final String f53705a;

        /* renamed from: b */
        private final aci<T, String> f53706b;

        /* renamed from: c */
        private final boolean f53707c;

        public C21373j(String str, aci<T, String> aci, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f53705a = str;
            this.f53706b = aci;
            this.f53707c = z;
        }

        /* renamed from: a */
        public void mo54038a(acs acs, T t) throws IOException {
            String a;
            if (t != null && (a = this.f53706b.mo53996a(t)) != null) {
                acs.mo54063b(this.f53705a, a, this.f53707c);
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.acq$k */
    public static final class C21374k<T> extends acq<Map<String, T>> {

        /* renamed from: a */
        private final Method f53708a;

        /* renamed from: b */
        private final int f53709b;

        /* renamed from: c */
        private final aci<T, String> f53710c;

        /* renamed from: d */
        private final boolean f53711d;

        public C21374k(Method method, int i, aci<T, String> aci, boolean z) {
            this.f53708a = method;
            this.f53709b = i;
            this.f53710c = aci;
            this.f53711d = z;
        }

        /* renamed from: a */
        public void mo54038a(acs acs, Map<String, T> map) throws IOException {
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    String str = (String) next.getKey();
                    if (str != null) {
                        Object value = next.getValue();
                        if (value != null) {
                            String a = this.f53710c.mo53996a(value);
                            if (a != null) {
                                acs.mo54063b(str, a, this.f53711d);
                            } else {
                                Method method = this.f53708a;
                                int i = this.f53709b;
                                throw acz.m50833a(method, i, "Query map value '" + value + "' converted to null by " + this.f53710c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw acz.m50833a(this.f53708a, this.f53709b, C13437d.m33706k("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw acz.m50833a(this.f53708a, this.f53709b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw acz.m50833a(this.f53708a, this.f53709b, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: com.veriff.sdk.internal.acq$l */
    public static final class C21375l<T> extends acq<T> {

        /* renamed from: a */
        private final aci<T, String> f53712a;

        /* renamed from: b */
        private final boolean f53713b;

        public C21375l(aci<T, String> aci, boolean z) {
            this.f53712a = aci;
            this.f53713b = z;
        }

        /* renamed from: a */
        public void mo54038a(acs acs, T t) throws IOException {
            if (t != null) {
                acs.mo54063b(this.f53712a.mo53996a(t), (String) null, this.f53713b);
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.acq$m */
    public static final class C21376m extends acq<C22743yo.C22745b> {

        /* renamed from: a */
        public static final C21376m f53714a = new C21376m();

        private C21376m() {
        }

        /* renamed from: a */
        public void mo54038a(acs acs, C22743yo.C22745b bVar) {
            if (bVar != null) {
                acs.mo54057a(bVar);
            }
        }
    }

    /* renamed from: com.veriff.sdk.internal.acq$n */
    public static final class C21377n extends acq<Object> {

        /* renamed from: a */
        private final Method f53715a;

        /* renamed from: b */
        private final int f53716b;

        public C21377n(Method method, int i) {
            this.f53715a = method;
            this.f53716b = i;
        }

        /* renamed from: a */
        public void mo54038a(acs acs, Object obj) {
            if (obj != null) {
                acs.mo54060a(obj);
                return;
            }
            throw acz.m50833a(this.f53715a, this.f53716b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* renamed from: com.veriff.sdk.internal.acq$o */
    public static final class C21378o<T> extends acq<T> {

        /* renamed from: a */
        public final Class<T> f53717a;

        public C21378o(Class<T> cls) {
            this.f53717a = cls;
        }

        /* renamed from: a */
        public void mo54038a(acs acs, T t) {
            acs.mo54059a(this.f53717a, t);
        }
    }

    /* renamed from: a */
    public final acq<Iterable<T>> mo54037a() {
        return new acq<Iterable<T>>() {
            /* renamed from: a */
            public void mo54038a(acs acs, Iterable<T> iterable) throws IOException {
                if (iterable != null) {
                    for (T a : iterable) {
                        acq.this.mo54038a(acs, a);
                    }
                }
            }
        };
    }

    /* renamed from: a */
    public abstract void mo54038a(acs acs, T t) throws IOException;

    /* renamed from: b */
    public final acq<Object> mo54039b() {
        return new acq<Object>() {
            /* renamed from: a */
            public void mo54038a(acs acs, Object obj) throws IOException {
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        acq.this.mo54038a(acs, Array.get(obj, i));
                    }
                }
            }
        };
    }
}
