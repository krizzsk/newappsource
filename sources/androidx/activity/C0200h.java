package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.C1035q;
import androidx.lifecycle.Lifecycle;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.usebutton.sdk.internal.api.AppActionRequest;
import mf0.C24362h;
import p080f2.C4646a;

/* renamed from: androidx.activity.h */
public class C0200h extends Dialog implements C1033p, C0202j {

    /* renamed from: b */
    public C1035q f524b;

    /* renamed from: c */
    public final OnBackPressedDispatcher f525c = new OnBackPressedDispatcher(new C0199g(this, 0));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0200h(Context context, int i) {
        super(context, i);
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
    }

    /* renamed from: a */
    public static void m336a(C0200h hVar) {
        C24362h.m61211f(hVar, "this$0");
        super.onBackPressed();
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        mo753b();
        super.addContentView(view, layoutParams);
    }

    /* renamed from: b */
    public final void mo753b() {
        Window window = getWindow();
        C24362h.m61208c(window);
        window.getDecorView().setTag(C4646a.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        C24362h.m61208c(window2);
        View decorView = window2.getDecorView();
        C24362h.m61210e(decorView, "window!!.decorView");
        decorView.setTag(C0203k.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final Lifecycle getLifecycle() {
        C1035q qVar = this.f524b;
        if (qVar != null) {
            return qVar;
        }
        C1035q qVar2 = new C1035q(this);
        this.f524b = qVar2;
        return qVar2;
    }

    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.f525c;
    }

    public final void onBackPressed() {
        this.f525c.mo744b();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1035q qVar = this.f524b;
        if (qVar == null) {
            qVar = new C1035q(this);
            this.f524b = qVar;
        }
        qVar.mo4319f(Lifecycle.Event.ON_CREATE);
    }

    public void onStart() {
        super.onStart();
        C1035q qVar = this.f524b;
        if (qVar == null) {
            qVar = new C1035q(this);
            this.f524b = qVar;
        }
        qVar.mo4319f(Lifecycle.Event.ON_RESUME);
    }

    public void onStop() {
        C1035q qVar = this.f524b;
        if (qVar == null) {
            qVar = new C1035q(this);
            this.f524b = qVar;
        }
        qVar.mo4319f(Lifecycle.Event.ON_DESTROY);
        this.f524b = null;
        super.onStop();
    }

    public void setContentView(int i) {
        mo753b();
        super.setContentView(i);
    }

    public void setContentView(View view) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        mo753b();
        super.setContentView(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        mo753b();
        super.setContentView(view, layoutParams);
    }
}
