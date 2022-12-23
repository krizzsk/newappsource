package p009a8;

import android.os.Handler;
import cf0.C21132f;
import com.facebook.GraphRequest;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import mf0.C24362h;

/* renamed from: a8.t */
public final class C0121t extends AbstractList<GraphRequest> {

    /* renamed from: f */
    public static final AtomicInteger f358f = new AtomicInteger();

    /* renamed from: b */
    public Handler f359b;

    /* renamed from: c */
    public final String f360c = String.valueOf(Integer.valueOf(f358f.incrementAndGet()));

    /* renamed from: d */
    public ArrayList f361d;

    /* renamed from: e */
    public ArrayList f362e = new ArrayList();

    /* renamed from: a8.t$a */
    public interface C0122a {
        /* renamed from: a */
        void mo203a(C0121t tVar);
    }

    /* renamed from: a8.t$b */
    public interface C0123b extends C0122a {
        /* renamed from: b */
        void mo279b();
    }

    public C0121t(List list) {
        this.f361d = new ArrayList(list);
    }

    public final void add(int i, Object obj) {
        GraphRequest graphRequest = (GraphRequest) obj;
        C24362h.m61211f(graphRequest, "element");
        this.f361d.add(i, graphRequest);
    }

    public final void clear() {
        this.f361d.clear();
    }

    public final /* bridge */ boolean contains(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof GraphRequest;
        }
        if (!z) {
            return false;
        }
        return super.contains((GraphRequest) obj);
    }

    public final Object get(int i) {
        return (GraphRequest) this.f361d.get(i);
    }

    public final /* bridge */ int indexOf(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof GraphRequest;
        }
        if (!z) {
            return -1;
        }
        return super.indexOf((GraphRequest) obj);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof GraphRequest;
        }
        if (!z) {
            return -1;
        }
        return super.lastIndexOf((GraphRequest) obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj == null ? true : obj instanceof GraphRequest)) {
            return false;
        }
        return super.remove((GraphRequest) obj);
    }

    public final Object set(int i, Object obj) {
        GraphRequest graphRequest = (GraphRequest) obj;
        C24362h.m61211f(graphRequest, "element");
        return (GraphRequest) this.f361d.set(i, graphRequest);
    }

    public final int size() {
        return this.f361d.size();
    }

    public final Object remove(int i) {
        return (GraphRequest) this.f361d.remove(i);
    }

    public final boolean add(Object obj) {
        GraphRequest graphRequest = (GraphRequest) obj;
        C24362h.m61211f(graphRequest, "element");
        return this.f361d.add(graphRequest);
    }

    public C0121t(GraphRequest... graphRequestArr) {
        this.f361d = new ArrayList(C21132f.m49428K0(graphRequestArr));
    }
}
