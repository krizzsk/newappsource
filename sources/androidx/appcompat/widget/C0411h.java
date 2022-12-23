package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import androidx.emoji2.text.C0836f;
import androidx.fragment.app.Fragment;
import ck0.C21267r;
import com.google.android.play.core.appupdate.C14232j;
import com.google.android.play.core.appupdate.C14238p;
import com.google.android.play.core.appupdate.C14239q;
import fe0.C23341a;
import ge0.C23410c;
import java.io.IOException;
import mf0.C24361g;
import mf0.C24362h;
import p021b2.C1444a;
import p021b2.C1448c;
import p021b2.C1452e;
import p021b2.C1458g;
import p114i.C5224j;
import p434dd.C16552f0;
import p584jl.C17885a;

/* renamed from: androidx.appcompat.widget.h */
public final class C0411h implements C16552f0, C23341a {

    /* renamed from: b */
    public Object f1512b;

    /* renamed from: c */
    public Object f1513c;

    public /* synthetic */ C0411h(Fragment fragment) {
        C24362h.m61211f(fragment, "fragment");
        this.f1512b = fragment;
    }

    public /* synthetic */ C0411h(C14232j jVar, C16552f0 f0Var) {
        this.f1512b = jVar;
        this.f1513c = f0Var;
    }

    /* renamed from: a */
    public final boolean mo2079a() {
        Object obj = this.f1512b;
        return ((Throwable) obj) != null && (((Throwable) obj) instanceof IOException);
    }

    /* renamed from: b */
    public final String mo2080b() {
        Object obj = this.f1512b;
        if (((Throwable) obj) != null) {
            return ((Throwable) obj).getMessage();
        }
        StringBuilder sb = new StringBuilder();
        Object obj2 = this.f1513c;
        if (((C21267r) obj2) != null) {
            if (C23410c.m57533a(((C21267r) obj2).f53229a.f59413e)) {
                sb.append(((C21267r) this.f1513c).f53229a.f59413e);
            } else {
                sb.append(((C21267r) this.f1513c).f53229a.f59412d);
            }
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final Activity mo2081c() {
        Object obj = this.f1512b;
        if (((Fragment) obj) != null) {
            Fragment fragment = (Fragment) obj;
            if (fragment == null) {
                return null;
            }
            return fragment.getActivity();
        }
        android.app.Fragment fragment2 = (android.app.Fragment) this.f1513c;
        if (fragment2 == null) {
            return null;
        }
        return fragment2.getActivity();
    }

    /* renamed from: d */
    public final KeyListener mo2082d(KeyListener keyListener) {
        if (!(!(keyListener instanceof NumberKeyListener))) {
            return keyListener;
        }
        ((C1444a) this.f1513c).f5300a.getClass();
        if (keyListener instanceof C1452e) {
            return keyListener;
        }
        if (keyListener == null) {
            return null;
        }
        if (keyListener instanceof NumberKeyListener) {
            return keyListener;
        }
        return new C1452e(keyListener);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    public final void mo2083e(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = ((EditText) this.f1512b).getContext().obtainStyledAttributes(attributeSet, C5224j.AppCompatTextView, i, 0);
        try {
            int i2 = C5224j.AppCompatTextView_emojiCompatEnabled;
            boolean z = true;
            if (obtainStyledAttributes.hasValue(i2)) {
                z = obtainStyledAttributes.getBoolean(i2, true);
            }
            obtainStyledAttributes.recycle();
            mo2085g(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: f */
    public final InputConnection mo2084f(InputConnection inputConnection, EditorInfo editorInfo) {
        C1444a aVar = (C1444a) this.f1513c;
        if (inputConnection == null) {
            aVar.getClass();
            return null;
        }
        C1444a.C1445a aVar2 = aVar.f5300a;
        aVar2.getClass();
        if (inputConnection instanceof C1448c) {
            return inputConnection;
        }
        return new C1448c(aVar2.f5301a, inputConnection, editorInfo);
    }

    /* renamed from: g */
    public final void mo2085g(boolean z) {
        C1458g gVar = ((C1444a) this.f1513c).f5300a.f5302b;
        if (gVar.f5322e != z) {
            if (gVar.f5321d != null) {
                C0836f a = C0836f.m2528a();
                C1458g.C1459a aVar = gVar.f5321d;
                a.getClass();
                C24361g.m61185s(aVar, "initCallback cannot be null");
                a.f3492a.writeLock().lock();
                try {
                    a.f3493b.remove(aVar);
                } finally {
                    a.f3492a.writeLock().unlock();
                }
            }
            gVar.f5322e = z;
            if (z) {
                C1458g.m3842a(gVar.f5319b, C0836f.m2528a().mo3619b());
            }
        }
    }

    public final int getStatus() {
        Object obj = this.f1513c;
        if (((C21267r) obj) != null) {
            return ((C21267r) obj).f53229a.f59412d;
        }
        return -1;
    }

    public final Object zza() {
        Context context = (Context) ((C14232j) ((C16552f0) this.f1512b)).f35765b.f35762a;
        C17885a.m44409K0(context);
        return new C14238p(context, (C14239q) ((C16552f0) this.f1513c).zza());
    }

    public /* synthetic */ C0411h(Throwable th) {
        this.f1512b = th;
    }

    public /* synthetic */ C0411h(android.app.Fragment fragment) {
        C24362h.m61211f(fragment, "fragment");
        this.f1513c = fragment;
    }

    public /* synthetic */ C0411h(C21267r rVar) {
        this.f1513c = rVar;
    }

    public /* synthetic */ C0411h(EditText editText) {
        this.f1512b = editText;
        this.f1513c = new C1444a(editText);
    }
}
