package p021b2;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C0836f;
import androidx.emoji2.text.C0849j;

/* renamed from: b2.e */
public final class C1452e implements KeyListener {

    /* renamed from: a */
    public final KeyListener f5312a;

    /* renamed from: b */
    public final C1453a f5313b;

    /* renamed from: b2.e$a */
    public static class C1453a {
    }

    public C1452e(KeyListener keyListener) {
        C1453a aVar = new C1453a();
        this.f5312a = keyListener;
        this.f5313b = aVar;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f5312a.clearMetaKeyState(view, editable, i);
    }

    public final int getInputType() {
        return this.f5312a.getInputType();
    }

    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        boolean z2;
        this.f5313b.getClass();
        Object obj = C0836f.f3490i;
        if (i == 67) {
            z = C0849j.m2545a(editable, keyEvent, false);
        } else if (i != 112) {
            z = false;
        } else {
            z = C0849j.m2545a(editable, keyEvent, true);
        }
        if (z) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || this.f5312a.onKeyDown(view, editable, i, keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f5312a.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f5312a.onKeyUp(view, editable, i, keyEvent);
    }
}
