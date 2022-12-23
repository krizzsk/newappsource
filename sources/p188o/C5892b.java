package p188o;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p154l1.C5554b;
import p154l1.C5555c;
import p241s0.C6313h;
import p718pc.C18888b;

/* renamed from: o.b */
public abstract class C5892b {

    /* renamed from: a */
    public Object f18961a;

    /* renamed from: b */
    public Object f18962b;

    /* renamed from: c */
    public Object f18963c;

    public /* synthetic */ C5892b(Context context) {
        this.f18961a = context;
    }

    /* renamed from: c */
    public abstract void mo21794c();

    /* renamed from: d */
    public final MenuItem mo21795d(MenuItem menuItem) {
        if (!(menuItem instanceof C5554b)) {
            return menuItem;
        }
        C5554b bVar = (C5554b) menuItem;
        if (((C6313h) this.f18962b) == null) {
            this.f18962b = new C6313h();
        }
        MenuItem menuItem2 = (MenuItem) ((C6313h) this.f18962b).getOrDefault(bVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C5893c cVar = new C5893c((Context) this.f18961a, bVar);
        ((C6313h) this.f18962b).put(bVar, cVar);
        return cVar;
    }

    /* renamed from: e */
    public final SubMenu mo21796e(SubMenu subMenu) {
        if (!(subMenu instanceof C5555c)) {
            return subMenu;
        }
        C5555c cVar = (C5555c) subMenu;
        if (((C6313h) this.f18963c) == null) {
            this.f18963c = new C6313h();
        }
        SubMenu subMenu2 = (SubMenu) ((C6313h) this.f18963c).getOrDefault(cVar, null);
        if (subMenu2 != null) {
            return subMenu2;
        }
        C5902g gVar = new C5902g((Context) this.f18961a, cVar);
        ((C6313h) this.f18963c).put(cVar, gVar);
        return gVar;
    }

    /* renamed from: f */
    public abstract void mo21797f();

    /* renamed from: g */
    public abstract void mo21798g(C18888b.C18891c cVar);

    /* renamed from: h */
    public abstract void mo21799h();

    /* renamed from: i */
    public abstract void mo21800i();

    /* renamed from: j */
    public abstract void mo21801j();

    public /* synthetic */ C5892b(int i) {
        this.f18962b = new float[(i * 2)];
        this.f18963c = new int[i];
    }
}
