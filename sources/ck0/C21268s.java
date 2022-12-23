package ck0;

import ck0.C21227c;
import ck0.C21230e;
import ck0.C21271t;
import hi0.C23521b0;
import hi0.C23534e;
import hi0.C23536e0;
import hi0.C23558r;
import hi0.C23566v;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: ck0.s */
public final class C21268s {

    /* renamed from: a */
    public final ConcurrentHashMap f53231a = new ConcurrentHashMap();

    /* renamed from: b */
    public final C23534e.C23535a f53232b;

    /* renamed from: c */
    public final C23558r f53233c;

    /* renamed from: d */
    public final List<C21230e.C21231a> f53234d;

    /* renamed from: e */
    public final List<C21227c.C21228a> f53235e;

    /* renamed from: f */
    public final Executor f53236f;

    /* renamed from: g */
    public final boolean f53237g;

    /* renamed from: ck0.s$a */
    public class C21269a implements InvocationHandler {

        /* renamed from: a */
        public final C21261p f53238a = C21261p.f53214a;

        /* renamed from: b */
        public final /* synthetic */ Class f53239b;

        public C21269a(Class cls) {
            this.f53239b = cls;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.f53238a.mo53606d(method)) {
                return this.f53238a.mo53605c(method, this.f53239b, obj, objArr);
            }
            C21271t<?, ?> c = C21268s.this.mo53618c(method);
            return c.f53251b.mo53588a(new C21240l(c, objArr));
        }
    }

    public C21268s(C23534e.C23535a aVar, C23558r rVar, ArrayList arrayList, ArrayList arrayList2, Executor executor, boolean z) {
        this.f53232b = aVar;
        this.f53233c = rVar;
        this.f53234d = Collections.unmodifiableList(arrayList);
        this.f53235e = Collections.unmodifiableList(arrayList2);
        this.f53236f = executor;
        this.f53237g = z;
    }

    /* renamed from: a */
    public final C21227c<?, ?> mo53616a(Type type, Annotation[] annotationArr) {
        if (type == null) {
            throw new NullPointerException("returnType == null");
        } else if (annotationArr != null) {
            int indexOf = this.f53235e.indexOf((Object) null) + 1;
            int size = this.f53235e.size();
            for (int i = indexOf; i < size; i++) {
                C21227c<?, ?> a = this.f53235e.get(i).mo53590a(type);
                if (a != null) {
                    return a;
                }
            }
            StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
            sb.append(type);
            sb.append(".\n");
            sb.append("  Tried:");
            int size2 = this.f53235e.size();
            while (indexOf < size2) {
                sb.append("\n   * ");
                sb.append(this.f53235e.get(indexOf).getClass().getName());
                indexOf++;
            }
            throw new IllegalArgumentException(sb.toString());
        } else {
            throw new NullPointerException("annotations == null");
        }
    }

    /* renamed from: b */
    public final <T> T mo53617b(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length <= 0) {
            if (this.f53237g) {
                C21261p pVar = C21261p.f53214a;
                for (Method method : cls.getDeclaredMethods()) {
                    if (!pVar.mo53606d(method)) {
                        mo53618c(method);
                    }
                }
            }
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C21269a(cls));
        } else {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }

    /* renamed from: c */
    public final C21271t<?, ?> mo53618c(Method method) {
        C21271t<?, ?> tVar;
        C21271t<?, ?> tVar2 = (C21271t) this.f53231a.get(method);
        if (tVar2 != null) {
            return tVar2;
        }
        synchronized (this.f53231a) {
            tVar = (C21271t) this.f53231a.get(method);
            if (tVar == null) {
                tVar = new C21271t.C21272a(this, method).mo53626a();
                this.f53231a.put(method, tVar);
            }
        }
        return tVar;
    }

    /* renamed from: d */
    public final <T> C21230e<T, C23521b0> mo53619d(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        if (type == null) {
            throw new NullPointerException("type == null");
        } else if (annotationArr2 != null) {
            int indexOf = this.f53234d.indexOf((Object) null) + 1;
            int size = this.f53234d.size();
            for (int i = indexOf; i < size; i++) {
                C21230e<T, C23521b0> a = this.f53234d.get(i).mo53581a(type);
                if (a != null) {
                    return a;
                }
            }
            StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
            sb.append(type);
            sb.append(".\n");
            sb.append("  Tried:");
            int size2 = this.f53234d.size();
            while (indexOf < size2) {
                sb.append("\n   * ");
                sb.append(this.f53234d.get(indexOf).getClass().getName());
                indexOf++;
            }
            throw new IllegalArgumentException(sb.toString());
        } else {
            throw new NullPointerException("methodAnnotations == null");
        }
    }

    /* renamed from: e */
    public final <T> C21230e<C23536e0, T> mo53620e(Type type, Annotation[] annotationArr) {
        if (type == null) {
            throw new NullPointerException("type == null");
        } else if (annotationArr != null) {
            int indexOf = this.f53234d.indexOf((Object) null) + 1;
            int size = this.f53234d.size();
            for (int i = indexOf; i < size; i++) {
                C21230e<C23536e0, T> b = this.f53234d.get(i).mo53582b(type, annotationArr);
                if (b != null) {
                    return b;
                }
            }
            StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
            sb.append(type);
            sb.append(".\n");
            sb.append("  Tried:");
            int size2 = this.f53234d.size();
            while (indexOf < size2) {
                sb.append("\n   * ");
                sb.append(this.f53234d.get(indexOf).getClass().getName());
                indexOf++;
            }
            throw new IllegalArgumentException(sb.toString());
        } else {
            throw new NullPointerException("annotations == null");
        }
    }

    /* renamed from: f */
    public final void mo53621f(Type type, Annotation[] annotationArr) {
        if (type != null) {
            int size = this.f53234d.size();
            for (int i = 0; i < size; i++) {
                this.f53234d.get(i).getClass();
            }
            return;
        }
        throw new NullPointerException("type == null");
    }

    /* renamed from: ck0.s$b */
    public static final class C21270b {

        /* renamed from: a */
        public final C21261p f53241a;

        /* renamed from: b */
        public C23534e.C23535a f53242b;

        /* renamed from: c */
        public C23558r f53243c;

        /* renamed from: d */
        public final ArrayList f53244d;

        /* renamed from: e */
        public final ArrayList f53245e;

        /* renamed from: f */
        public Executor f53246f;

        /* renamed from: g */
        public boolean f53247g;

        public C21270b() {
            C21261p pVar = C21261p.f53214a;
            ArrayList arrayList = new ArrayList();
            this.f53244d = arrayList;
            this.f53245e = new ArrayList();
            this.f53241a = pVar;
            arrayList.add(new C21220a());
        }

        /* renamed from: a */
        public final void mo53623a(String str) {
            if (str != null) {
                C23558r m = C23558r.m57727m(str);
                if (m != null) {
                    List<String> list = m.f59539f;
                    if ("".equals(list.get(list.size() - 1))) {
                        this.f53243c = m;
                        return;
                    }
                    throw new IllegalArgumentException("baseUrl must end in /: " + m);
                }
                throw new IllegalArgumentException(C25541a.m63881k("Illegal URL: ", str));
            }
            throw new NullPointerException("baseUrl == null");
        }

        /* renamed from: b */
        public final C21268s mo53624b() {
            if (this.f53243c != null) {
                C23534e.C23535a aVar = this.f53242b;
                if (aVar == null) {
                    aVar = new C23566v();
                }
                C23534e.C23535a aVar2 = aVar;
                Executor executor = this.f53246f;
                if (executor == null) {
                    executor = this.f53241a.mo53604b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f53245e);
                arrayList.add(this.f53241a.mo53603a(executor2));
                return new C21268s(aVar2, this.f53243c, new ArrayList(this.f53244d), arrayList, executor2, this.f53247g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        /* renamed from: c */
        public final void mo53625c(C23566v vVar) {
            if (vVar != null) {
                this.f53242b = vVar;
                return;
            }
            throw new NullPointerException("client == null");
        }

        public C21270b(C21268s sVar) {
            ArrayList arrayList = new ArrayList();
            this.f53244d = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f53245e = arrayList2;
            this.f53241a = C21261p.f53214a;
            this.f53242b = sVar.f53232b;
            this.f53243c = sVar.f53233c;
            arrayList.addAll(sVar.f53234d);
            arrayList2.addAll(sVar.f53235e);
            arrayList2.remove(arrayList2.size() - 1);
            this.f53246f = sVar.f53236f;
            this.f53247g = sVar.f53237g;
        }
    }
}
