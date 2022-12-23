package p242s1;

import android.view.View;
import android.view.ViewParent;
import java.util.Objects;

/* renamed from: s1.p */
public final class C6381p {

    /* renamed from: a */
    public ViewParent f20035a;

    /* renamed from: b */
    public ViewParent f20036b;

    /* renamed from: c */
    public final View f20037c;

    /* renamed from: d */
    public boolean f20038d;

    /* renamed from: e */
    public int[] f20039e;

    public C6381p(View view) {
        this.f20037c = view;
    }

    /* renamed from: a */
    public final boolean mo22483a(float f, float f2, boolean z) {
        ViewParent f3;
        if (!this.f20038d || (f3 = mo22488f(0)) == null) {
            return false;
        }
        try {
            return C6376m0.m15198a(f3, this.f20037c, f, f2, z);
        } catch (AbstractMethodError unused) {
            Objects.toString(f3);
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo22484b(float f, float f2) {
        ViewParent f3;
        if (!this.f20038d || (f3 = mo22488f(0)) == null) {
            return false;
        }
        try {
            return C6376m0.m15199b(f3, this.f20037c, f, f2);
        } catch (AbstractMethodError unused) {
            Objects.toString(f3);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo22485c(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent f;
        int i4;
        int i5;
        int[] iArr3;
        int i6 = i;
        int i7 = i2;
        int i8 = i3;
        int[] iArr4 = iArr2;
        if (!this.f20038d || (f = mo22488f(i8)) == null) {
            return false;
        }
        if (i6 == 0 && i7 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f20037c.getLocationInWindow(iArr4);
            i5 = iArr4[0];
            i4 = iArr4[1];
        } else {
            i5 = 0;
            i4 = 0;
        }
        if (iArr == null) {
            if (this.f20039e == null) {
                this.f20039e = new int[2];
            }
            iArr3 = this.f20039e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view = this.f20037c;
        if (f instanceof C6385q) {
            ((C6385q) f).mo1282k(view, i, i2, iArr3, i3);
        } else if (i8 == 0) {
            try {
                C6376m0.m15200c(f, view, i, i2, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(f);
            }
        }
        if (iArr4 != null) {
            this.f20037c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i5;
            iArr4[1] = iArr4[1] - i4;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo22486d(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        mo22487e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: e */
    public final boolean mo22487e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent f;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        int i8 = i5;
        if (!this.f20038d || (f = mo22488f(i8)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f20037c.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            if (this.f20039e == null) {
                this.f20039e = new int[2];
            }
            int[] iArr5 = this.f20039e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        View view = this.f20037c;
        if (f instanceof C6387r) {
            ((C6387r) f).mo1284n(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (f instanceof C6385q) {
                ((C6385q) f).mo1285o(view, i, i2, i3, i4, i5);
            } else if (i8 == 0) {
                try {
                    C6376m0.m15201d(f, view, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                    Objects.toString(f);
                }
            }
        }
        if (iArr4 != null) {
            this.f20037c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    /* renamed from: f */
    public final ViewParent mo22488f(int i) {
        if (i == 0) {
            return this.f20035a;
        }
        if (i != 1) {
            return null;
        }
        return this.f20036b;
    }

    /* renamed from: g */
    public final boolean mo22489g(int i, int i2) {
        boolean z;
        boolean z2;
        if (mo22488f(i2) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (this.f20038d) {
            View view = this.f20037c;
            for (ViewParent parent = this.f20037c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.f20037c;
                boolean z3 = parent instanceof C6385q;
                if (z3) {
                    z2 = ((C6385q) parent).mo1300p(view, view2, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            z2 = C6376m0.m15203f(parent, view, view2, i);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(parent);
                        }
                    }
                    z2 = false;
                }
                if (z2) {
                    if (i2 == 0) {
                        this.f20035a = parent;
                    } else if (i2 == 1) {
                        this.f20036b = parent;
                    }
                    View view3 = this.f20037c;
                    if (z3) {
                        ((C6385q) parent).mo1281j(view, view3, i, i2);
                    } else if (i2 == 0) {
                        try {
                            C6376m0.m15202e(parent, view, view3, i);
                        } catch (AbstractMethodError unused2) {
                            Objects.toString(parent);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: h */
    public final void mo22490h(int i) {
        ViewParent f = mo22488f(i);
        if (f != null) {
            View view = this.f20037c;
            if (f instanceof C6385q) {
                ((C6385q) f).mo1280i(i, view);
            } else if (i == 0) {
                try {
                    C6376m0.m15204g(f, view);
                } catch (AbstractMethodError unused) {
                    Objects.toString(f);
                }
            }
            if (i == 0) {
                this.f20035a = null;
            } else if (i == 1) {
                this.f20036b = null;
            }
        }
    }
}
