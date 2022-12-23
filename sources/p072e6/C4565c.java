package p072e6;

import android.view.View;
import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import p311x6.C7176l;
import p693nz.C18659h;

/* renamed from: e6.c */
public abstract class C4565c {

    /* renamed from: a */
    public final Object f15729a;

    public C4565c(int i) {
        if (i == 1) {
            this.f15729a = new HashSet();
        } else if (i != 2) {
            char[] cArr = C7176l.f22265a;
            this.f15729a = new ArrayDeque(20);
        } else {
            this.f15729a = new C18659h(20);
        }
    }

    /* renamed from: a */
    public abstract C4578l mo20077a();

    /* renamed from: b */
    public abstract View mo20078b(Object obj);

    /* renamed from: c */
    public final C4578l mo20079c() {
        C4578l lVar = (C4578l) ((Queue) this.f15729a).poll();
        if (lVar == null) {
            return mo20077a();
        }
        return lVar;
    }

    /* renamed from: d */
    public final View mo20080d(Object obj) {
        if (obj == null) {
            return null;
        }
        View view = (View) ((C18659h) this.f15729a).get(obj);
        if (view == null) {
            view = mo20078b(obj);
        }
        if (view == null) {
            return null;
        }
        ((C18659h) this.f15729a).put(obj, view);
        return view;
    }

    /* renamed from: e */
    public boolean mo20081e() {
        return false;
    }

    /* renamed from: f */
    public final void mo20082f(C4578l lVar) {
        if (((Queue) this.f15729a).size() < 20) {
            ((Queue) this.f15729a).offer(lVar);
        }
    }
}
