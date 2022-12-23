package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.appcompat.view.menu.C0300j;

/* renamed from: androidx.appcompat.view.menu.a */
public abstract class C0281a implements C0300j {

    /* renamed from: b */
    public Context f860b;

    /* renamed from: c */
    public Context f861c;

    /* renamed from: d */
    public C0291f f862d;

    /* renamed from: e */
    public LayoutInflater f863e;

    /* renamed from: f */
    public C0300j.C0301a f864f;

    /* renamed from: g */
    public int f865g;

    /* renamed from: h */
    public int f866h;

    /* renamed from: i */
    public C0302k f867i;

    /* renamed from: j */
    public int f868j;

    public C0281a(Context context, int i, int i2) {
        this.f860b = context;
        this.f863e = LayoutInflater.from(context);
        this.f865g = i;
        this.f866h = i2;
    }

    /* renamed from: c */
    public final void mo1044c(C0300j.C0301a aVar) {
        this.f864f = aVar;
    }

    /* renamed from: d */
    public final boolean mo1045d(C0295h hVar) {
        return false;
    }

    public final int getId() {
        return this.f868j;
    }

    /* renamed from: h */
    public final boolean mo1047h(C0295h hVar) {
        return false;
    }
}
