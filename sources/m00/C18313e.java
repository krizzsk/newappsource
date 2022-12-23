package m00;

import android.widget.AbsListView;

/* renamed from: m00.e */
public abstract class C18313e<T> {

    /* renamed from: a */
    public int f46701a = Math.max(0, 5);

    /* renamed from: b */
    public AbsListView f46702b;

    /* renamed from: c */
    public T f46703c = null;

    /* renamed from: d */
    public final C18314a f46704d = new C18314a();

    /* renamed from: m00.e$a */
    public class C18314a implements AbsListView.OnScrollListener {
        public C18314a() {
        }

        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
            boolean z;
            if (i2 != 0) {
                C18313e eVar = C18313e.this;
                T t = eVar.f46703c;
                if (t != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && i + i2 >= i3 - eVar.f46701a) {
                    eVar.f46703c = null;
                    eVar.mo45697a(t);
                }
            }
        }

        public final void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: a */
    public abstract void mo45697a(Object obj);
}
