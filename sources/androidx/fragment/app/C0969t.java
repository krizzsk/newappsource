package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.PrintWriter;
import mf0.C24361g;

/* renamed from: androidx.fragment.app.t */
public abstract class C0969t<E> extends C0959q {

    /* renamed from: b */
    public final Activity f3853b;

    /* renamed from: c */
    public final Context f3854c;

    /* renamed from: d */
    public final Handler f3855d;

    /* renamed from: e */
    public final C0910a0 f3856e = new C0910a0();

    public C0969t(FragmentActivity fragmentActivity) {
        Handler handler = new Handler();
        this.f3853b = fragmentActivity;
        C24361g.m61185s(fragmentActivity, "context == null");
        this.f3854c = fragmentActivity;
        this.f3855d = handler;
    }

    /* renamed from: d */
    public abstract void mo3900d(PrintWriter printWriter, String[] strArr);

    /* renamed from: e */
    public abstract FragmentActivity mo3901e();

    /* renamed from: f */
    public abstract LayoutInflater mo3902f();

    /* renamed from: g */
    public abstract boolean mo3903g(String str);

    /* renamed from: h */
    public abstract void mo3904h();
}
