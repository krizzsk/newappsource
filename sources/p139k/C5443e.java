package p139k;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import p139k.C5437b;

@SuppressLint({"RestrictedAPI"})
/* renamed from: k.e */
public class C5443e extends C5437b {

    /* renamed from: o */
    public C5444a f17961o;

    /* renamed from: p */
    public boolean f17962p;

    /* renamed from: k.e$a */
    public static class C5444a extends C5437b.C5440c {

        /* renamed from: H */
        public int[][] f17963H;

        public C5444a(C5444a aVar, C5443e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.f17963H = aVar.f17963H;
            } else {
                this.f17963H = new int[this.f17927g.length][];
            }
        }

        /* renamed from: e */
        public void mo21216e() {
            int[] iArr;
            int[][] iArr2 = this.f17963H;
            int[][] iArr3 = new int[iArr2.length][];
            for (int length = iArr2.length - 1; length >= 0; length--) {
                int[] iArr4 = this.f17963H[length];
                if (iArr4 != null) {
                    iArr = (int[]) iArr4.clone();
                } else {
                    iArr = null;
                }
                iArr3[length] = iArr;
            }
            this.f17963H = iArr3;
        }

        /* renamed from: f */
        public final int mo21300f(int[] iArr) {
            int[][] iArr2 = this.f17963H;
            int i = this.f17928h;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        public Drawable newDrawable() {
            return new C5443e(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C5443e(this, resources);
        }
    }

    public C5443e(C5444a aVar, Resources resources) {
        mo21208e(new C5444a(aVar, this, resources));
        onStateChange(getState());
    }

    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* renamed from: e */
    public void mo21208e(C5437b.C5440c cVar) {
        this.f17900b = cVar;
        int i = this.f17906h;
        if (i >= 0) {
            Drawable d = cVar.mo21264d(i);
            this.f17902d = d;
            if (d != null) {
                mo21224c(d);
            }
        }
        this.f17903e = null;
        if (cVar instanceof C5444a) {
            this.f17961o = (C5444a) cVar;
        }
    }

    /* renamed from: f */
    public C5444a mo21207b() {
        return new C5444a(this.f17961o, this, (Resources) null);
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.f17962p) {
            super.mutate();
            this.f17961o.mo21216e();
            this.f17962p = true;
        }
        return this;
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int f = this.f17961o.mo21300f(iArr);
        if (f < 0) {
            f = this.f17961o.mo21300f(StateSet.WILD_CARD);
        }
        if (mo21226d(f) || onStateChange) {
            return true;
        }
        return false;
    }

    public C5443e() {
    }
}
