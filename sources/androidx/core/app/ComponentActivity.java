package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C0995b0;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.C1035q;
import androidx.lifecycle.Lifecycle;
import p177n1.C5799a;
import p241s0.C6313h;
import p242s1.C6359g;

public class ComponentActivity extends Activity implements C1033p, C6359g.C6360a {
    private C6313h<Class<? extends C0755a>, C0755a> mExtraDataMap = new C6313h<>();
    private C1035q mLifecycleRegistry = new C1035q(this);

    @Deprecated
    /* renamed from: androidx.core.app.ComponentActivity$a */
    public static class C0755a {
    }

    private static boolean shouldSkipDump(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        String str = strArr[0];
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -645125871:
                if (str.equals("--translation")) {
                    c = 0;
                    break;
                }
                break;
            case 100470631:
                if (str.equals("--dump-dumpable")) {
                    c = 1;
                    break;
                }
                break;
            case 472614934:
                if (str.equals("--list-dumpables")) {
                    c = 2;
                    break;
                }
                break;
            case 1159329357:
                if (str.equals("--contentcapture")) {
                    c = 3;
                    break;
                }
                break;
            case 1455016274:
                if (str.equals("--autofill")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (Build.VERSION.SDK_INT >= 31) {
                    return true;
                }
                return false;
            case 1:
            case 2:
                return C5799a.m14229c();
            case 3:
                if (Build.VERSION.SDK_INT >= 29) {
                    return true;
                }
                return false;
            case 4:
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
                return false;
            default:
                return false;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C6359g.m15162a(decorView, keyEvent)) {
            return C6359g.m15163b(this, decorView, this, keyEvent);
        }
        return true;
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C6359g.m15162a(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Deprecated
    public <T extends C0755a> T getExtraData(Class<T> cls) {
        return (C0755a) this.mExtraDataMap.getOrDefault(cls, null);
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0995b0.m2860c(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C1035q qVar = this.mLifecycleRegistry;
        Lifecycle.State state = Lifecycle.State.CREATED;
        qVar.mo4318e("markState");
        qVar.mo4321h(state);
        super.onSaveInstanceState(bundle);
    }

    @Deprecated
    public void putExtraData(C0755a aVar) {
        this.mExtraDataMap.put(aVar.getClass(), aVar);
    }

    public final boolean shouldDumpInternalState(String[] strArr) {
        return !shouldSkipDump(strArr);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
}
