package p193o4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.xml.sax.Locator;
import p070e4.C4549d;
import p168m4.C5684b;
import p168m4.C5690h;

/* renamed from: o4.i */
public final class C5983i {

    /* renamed from: j */
    public static Vector f19136j = new Vector(0);

    /* renamed from: a */
    public final C5985k f19137a;

    /* renamed from: b */
    public final C5982h f19138b;

    /* renamed from: c */
    public final ArrayList<C5690h> f19139c;

    /* renamed from: d */
    public final C5975a f19140d;

    /* renamed from: e */
    public C5978d f19141e;

    /* renamed from: f */
    public Locator f19142f;

    /* renamed from: g */
    public C5980f f19143g;

    /* renamed from: h */
    public Stack<List<C5684b>> f19144h;

    /* renamed from: i */
    public C5978d f19145i = null;

    public C5983i(C4549d dVar, C5986l lVar, C5978d dVar2) {
        this.f19140d = new C5975a(dVar, this);
        this.f19137a = lVar;
        this.f19138b = new C5982h(dVar, this);
        this.f19139c = new ArrayList<>(3);
        this.f19141e = dVar2;
        this.f19144h = new Stack<>();
        this.f19143g = new C5980f(this);
    }
}
