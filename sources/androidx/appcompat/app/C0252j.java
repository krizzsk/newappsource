package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p241s0.C6304d;

/* renamed from: androidx.appcompat.app.j */
public abstract class C0252j {

    /* renamed from: b */
    public static int f737b = -100;

    /* renamed from: c */
    public static final C6304d<WeakReference<C0252j>> f738c = new C6304d<>();

    /* renamed from: d */
    public static final Object f739d = new Object();

    /* renamed from: u */
    public static void m489u(C0252j jVar) {
        synchronized (f739d) {
            Iterator<WeakReference<C0252j>> it = f738c.iterator();
            while (it.hasNext()) {
                C0252j jVar2 = (C0252j) it.next().get();
                if (jVar2 == jVar || jVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: A */
    public void mo844A(int i) {
    }

    /* renamed from: B */
    public abstract void mo845B(CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo867c(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: d */
    public abstract boolean mo868d();

    /* renamed from: e */
    public Context mo869e(Context context) {
        return context;
    }

    /* renamed from: f */
    public abstract <T extends View> T mo870f(int i);

    /* renamed from: g */
    public abstract AppCompatDelegateImpl.C0223b mo871g();

    /* renamed from: h */
    public int mo872h() {
        return -100;
    }

    /* renamed from: i */
    public abstract MenuInflater mo873i();

    /* renamed from: j */
    public abstract ActionBar mo874j();

    /* renamed from: k */
    public abstract void mo875k();

    /* renamed from: l */
    public abstract void mo876l();

    /* renamed from: m */
    public abstract void mo877m(Configuration configuration);

    /* renamed from: n */
    public abstract void mo878n();

    /* renamed from: o */
    public abstract void mo879o();

    /* renamed from: p */
    public abstract void mo882p();

    /* renamed from: q */
    public abstract void mo883q();

    /* renamed from: r */
    public abstract void mo884r();

    /* renamed from: s */
    public abstract void mo885s();

    /* renamed from: t */
    public abstract void mo886t();

    /* renamed from: v */
    public abstract boolean mo887v(int i);

    /* renamed from: w */
    public abstract void mo888w(int i);

    /* renamed from: x */
    public abstract void mo889x(View view);

    /* renamed from: y */
    public abstract void mo890y(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: z */
    public abstract void mo891z(Toolbar toolbar);
}
