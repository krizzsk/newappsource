package ck0;

import ck0.C21220a;
import hi0.C23521b0;
import hi0.C23556q;
import hi0.C23563u;
import java.io.IOException;
import java.util.Map;
import p001a0.C0016g;
import p358af.C13437d;
import si0.C24898f;

/* renamed from: ck0.o */
public abstract class C21247o<T> {

    /* renamed from: ck0.o$a */
    public static final class C21248a<T> extends C21247o<T> {

        /* renamed from: a */
        public final C21230e<T, C23521b0> f53198a;

        public C21248a(C21230e<T, C23521b0> eVar) {
            this.f53198a = eVar;
        }

        /* renamed from: a */
        public final void mo53602a(C21265q qVar, T t) {
            if (t != null) {
                try {
                    qVar.f53226j = this.f53198a.convert(t);
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
                }
            } else {
                throw new IllegalArgumentException("Body parameter value must not be null.");
            }
        }
    }

    /* renamed from: ck0.o$b */
    public static final class C21249b<T> extends C21247o<T> {

        /* renamed from: a */
        public final String f53199a;

        /* renamed from: b */
        public final boolean f53200b;

        public C21249b(String str, boolean z) {
            if (str != null) {
                this.f53199a = str;
                this.f53200b = z;
                return;
            }
            throw new NullPointerException("name == null");
        }

        /* renamed from: a */
        public final void mo53602a(C21265q qVar, T t) throws IOException {
            String obj;
            if (t != null && (obj = t.toString()) != null) {
                qVar.mo53608a(this.f53199a, obj, this.f53200b);
            }
        }
    }

    /* renamed from: ck0.o$c */
    public static final class C21250c<T> extends C21247o<Map<String, T>> {

        /* renamed from: a */
        public final boolean f53201a;

        public C21250c(boolean z) {
            this.f53201a = z;
        }

        /* renamed from: a */
        public final void mo53602a(C21265q qVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                qVar.mo53608a(str, obj2, this.f53201a);
                            } else {
                                throw new IllegalArgumentException("Field map value '" + value + "' converted to null by " + C21220a.C21224d.class.getName() + " for key '" + str + "'.");
                            }
                        } else {
                            throw new IllegalArgumentException(C13437d.m33706k("Field map contained null value for key '", str, "'."));
                        }
                    } else {
                        throw new IllegalArgumentException("Field map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Field map was null.");
        }
    }

    /* renamed from: ck0.o$d */
    public static final class C21251d<T> extends C21247o<T> {

        /* renamed from: a */
        public final String f53202a;

        public C21251d(String str) {
            if (str != null) {
                this.f53202a = str;
                return;
            }
            throw new NullPointerException("name == null");
        }

        /* renamed from: a */
        public final void mo53602a(C21265q qVar, T t) throws IOException {
            String obj;
            if (t != null && (obj = t.toString()) != null) {
                qVar.mo53609b(this.f53202a, obj);
            }
        }
    }

    /* renamed from: ck0.o$e */
    public static final class C21252e<T> extends C21247o<Map<String, T>> {
        /* renamed from: a */
        public final void mo53602a(C21265q qVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            qVar.mo53609b(str, value.toString());
                        } else {
                            throw new IllegalArgumentException(C13437d.m33706k("Header map contained null value for key '", str, "'."));
                        }
                    } else {
                        throw new IllegalArgumentException("Header map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Header map was null.");
        }
    }

    /* renamed from: ck0.o$f */
    public static final class C21253f<T> extends C21247o<T> {

        /* renamed from: a */
        public final C23556q f53203a;

        /* renamed from: b */
        public final C21230e<T, C23521b0> f53204b;

        public C21253f(C23556q qVar, C21230e<T, C23521b0> eVar) {
            this.f53203a = qVar;
            this.f53204b = eVar;
        }

        /* renamed from: a */
        public final void mo53602a(C21265q qVar, T t) {
            if (t != null) {
                try {
                    qVar.mo53610c(this.f53203a, this.f53204b.convert(t));
                } catch (IOException e) {
                    throw new RuntimeException("Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* renamed from: ck0.o$g */
    public static final class C21254g<T> extends C21247o<Map<String, T>> {

        /* renamed from: a */
        public final C21230e<T, C23521b0> f53205a;

        /* renamed from: b */
        public final String f53206b;

        public C21254g(String str, C21230e eVar) {
            this.f53205a = eVar;
            this.f53206b = str;
        }

        /* renamed from: a */
        public final void mo53602a(C21265q qVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            qVar.mo53610c(C23556q.m57709f("Content-Disposition", C13437d.m33706k("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.f53206b), this.f53205a.convert(value));
                        } else {
                            throw new IllegalArgumentException(C13437d.m33706k("Part map contained null value for key '", str, "'."));
                        }
                    } else {
                        throw new IllegalArgumentException("Part map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Part map was null.");
        }
    }

    /* renamed from: ck0.o$h */
    public static final class C21255h<T> extends C21247o<T> {

        /* renamed from: a */
        public final String f53207a;

        /* renamed from: b */
        public final boolean f53208b;

        public C21255h(String str, boolean z) {
            if (str != null) {
                this.f53207a = str;
                this.f53208b = z;
                return;
            }
            throw new NullPointerException("name == null");
        }

        /* renamed from: a */
        public final void mo53602a(C21265q qVar, T t) throws IOException {
            int i;
            int i2;
            if (t != null) {
                String str = this.f53207a;
                String obj = t.toString();
                boolean z = this.f53208b;
                String str2 = qVar.f53219c;
                if (str2 != null) {
                    String k = C13437d.m33706k("{", str, "}");
                    int length = obj.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        int codePointAt = obj.codePointAt(i3);
                        i = 32;
                        i2 = 47;
                        if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                            C24898f fVar = new C24898f();
                            fVar.mo61403b0(0, i3, obj);
                            C24898f fVar2 = null;
                        } else {
                            i3 += Character.charCount(codePointAt);
                        }
                    }
                    C24898f fVar3 = new C24898f();
                    fVar3.mo61403b0(0, i3, obj);
                    C24898f fVar22 = null;
                    while (i3 < length) {
                        int codePointAt2 = obj.codePointAt(i3);
                        if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 < i || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != -1 || (!z && (codePointAt2 == i2 || codePointAt2 == 37))) {
                                if (fVar22 == null) {
                                    fVar22 = new C24898f();
                                }
                                fVar22.mo61406d0(codePointAt2);
                                while (!fVar22.mo61415l1()) {
                                    byte readByte = fVar22.readByte() & 255;
                                    fVar3.mo61395V(37);
                                    char[] cArr = C21265q.f53216k;
                                    fVar3.mo61395V(cArr[(readByte >> 4) & 15]);
                                    fVar3.mo61395V(cArr[readByte & 15]);
                                }
                            } else {
                                fVar3.mo61406d0(codePointAt2);
                            }
                        }
                        i3 += Character.charCount(codePointAt2);
                        i = 32;
                        i2 = 47;
                    }
                    obj = fVar3.mo61380H();
                    qVar.f53219c = str2.replace(k, obj);
                    return;
                }
                throw new AssertionError();
            }
            throw new IllegalArgumentException(C0016g.m31o(C13555b.m33972k("Path parameter \""), this.f53207a, "\" value must not be null."));
        }
    }

    /* renamed from: ck0.o$i */
    public static final class C21256i<T> extends C21247o<T> {

        /* renamed from: a */
        public final String f53209a;

        /* renamed from: b */
        public final boolean f53210b;

        public C21256i(String str, boolean z) {
            if (str != null) {
                this.f53209a = str;
                this.f53210b = z;
                return;
            }
            throw new NullPointerException("name == null");
        }

        /* renamed from: a */
        public final void mo53602a(C21265q qVar, T t) throws IOException {
            String obj;
            if (t != null && (obj = t.toString()) != null) {
                qVar.mo53611d(this.f53209a, obj, this.f53210b);
            }
        }
    }

    /* renamed from: ck0.o$j */
    public static final class C21257j<T> extends C21247o<Map<String, T>> {

        /* renamed from: a */
        public final boolean f53211a;

        public C21257j(boolean z) {
            this.f53211a = z;
        }

        /* renamed from: a */
        public final void mo53602a(C21265q qVar, Object obj) throws IOException {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String obj2 = value.toString();
                            if (obj2 != null) {
                                qVar.mo53611d(str, obj2, this.f53211a);
                            } else {
                                throw new IllegalArgumentException("Query map value '" + value + "' converted to null by " + C21220a.C21224d.class.getName() + " for key '" + str + "'.");
                            }
                        } else {
                            throw new IllegalArgumentException(C13437d.m33706k("Query map contained null value for key '", str, "'."));
                        }
                    } else {
                        throw new IllegalArgumentException("Query map contained null key.");
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Query map was null.");
        }
    }

    /* renamed from: ck0.o$k */
    public static final class C21258k<T> extends C21247o<T> {

        /* renamed from: a */
        public final boolean f53212a;

        public C21258k(boolean z) {
            this.f53212a = z;
        }

        /* renamed from: a */
        public final void mo53602a(C21265q qVar, T t) throws IOException {
            if (t != null) {
                qVar.mo53611d(t.toString(), (String) null, this.f53212a);
            }
        }
    }

    /* renamed from: ck0.o$l */
    public static final class C21259l extends C21247o<C23563u.C23565b> {

        /* renamed from: a */
        public static final C21259l f53213a = new C21259l();

        /* renamed from: a */
        public final void mo53602a(C21265q qVar, Object obj) throws IOException {
            C23563u.C23565b bVar = (C23563u.C23565b) obj;
            if (bVar != null) {
                qVar.f53224h.f59567c.add(bVar);
            }
        }
    }

    /* renamed from: ck0.o$m */
    public static final class C21260m extends C21247o<Object> {
        /* renamed from: a */
        public final void mo53602a(C21265q qVar, Object obj) {
            if (obj != null) {
                qVar.f53219c = obj.toString();
                return;
            }
            throw new NullPointerException("@Url parameter is null.");
        }
    }

    /* renamed from: a */
    public abstract void mo53602a(C21265q qVar, T t) throws IOException;
}
