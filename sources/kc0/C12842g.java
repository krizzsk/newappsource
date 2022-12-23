package kc0;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.FrameLayout;
import com.umo.ads.p350u.zzu;
import fc0.C12669a;
import fc0.C12675e;
import hc0.C12753b;
import kc0.C12844i;
import mf0.C24362h;
import nc0.C12952c;
import p373au.C13535g;

/* renamed from: kc0.g */
public final /* synthetic */ class C12842g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C12844i f31724b;

    /* renamed from: c */
    public final /* synthetic */ int f31725c;

    /* renamed from: d */
    public final /* synthetic */ int f31726d;

    /* renamed from: e */
    public final /* synthetic */ int f31727e;

    /* renamed from: f */
    public final /* synthetic */ int f31728f;

    /* renamed from: g */
    public final /* synthetic */ int f31729g;

    /* renamed from: h */
    public final /* synthetic */ int f31730h;

    /* renamed from: i */
    public final /* synthetic */ C12669a f31731i;

    public /* synthetic */ C12842g(C12844i iVar, int i, int i2, int i3, int i4, int i5, int i6, C12669a aVar) {
        this.f31724b = iVar;
        this.f31725c = i;
        this.f31726d = i2;
        this.f31727e = i3;
        this.f31728f = i4;
        this.f31729g = i5;
        this.f31730h = i6;
        this.f31731i = aVar;
    }

    public final void run() {
        View view;
        ViewParent viewParent;
        Window window;
        C12844i iVar = this.f31724b;
        int i = this.f31725c;
        int i2 = this.f31726d;
        int i3 = this.f31727e;
        int i4 = this.f31728f;
        int i5 = this.f31729g;
        int i6 = this.f31730h;
        C12669a aVar = this.f31731i;
        C24362h.m61211f(iVar, "this$0");
        Context context = iVar.getContext();
        if (context == null || !(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null || (window = activity.getWindow()) == null) {
            view = null;
        } else {
            view = window.getDecorView();
        }
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
            layoutParams.setMargins(i3, i4, Integer.MIN_VALUE, Integer.MIN_VALUE);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C12952c.m32791a(40), C12952c.m32791a(40));
            layoutParams2.setMargins(i5, i6, Integer.MIN_VALUE, Integer.MIN_VALUE);
            FrameLayout frameLayout = iVar.f31760r;
            if (frameLayout == null) {
                C12675e eVar = iVar.f31736A;
                if (eVar == null) {
                    viewParent = null;
                } else {
                    viewParent = eVar.getParent();
                }
                if (viewParent != null) {
                    ((ViewGroup) viewParent).removeView(iVar.f31736A);
                    View view2 = new View(iVar.getContext());
                    iVar.f31761s = view2;
                    view2.setOnClickListener(new C13535g(10, iVar, aVar));
                    FrameLayout frameLayout2 = new FrameLayout(iVar.getContext());
                    iVar.f31760r = frameLayout2;
                    frameLayout2.addView(iVar.f31736A, layoutParams);
                    FrameLayout frameLayout3 = iVar.f31760r;
                    if (frameLayout3 != null) {
                        frameLayout3.addView(iVar.f31761s, layoutParams2);
                    }
                    viewGroup.addView(iVar.f31760r, 0, iVar.f31741F);
                    viewGroup.bringChildToFront(iVar.f31760r);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                }
            } else {
                frameLayout.updateViewLayout(iVar.f31736A, layoutParams);
                FrameLayout frameLayout4 = iVar.f31760r;
                if (frameLayout4 != null) {
                    frameLayout4.updateViewLayout(iVar.f31761s, layoutParams2);
                }
            }
            zzu zzu = zzu.RESIZED;
            iVar.mo39680d(aVar, zzu);
            if (aVar != null) {
                aVar.mo39455b(zzu);
            }
            C12844i.C12846b bVar = iVar.f31745c;
            if (bVar != null) {
                ((C12753b) bVar).mo39575s(iVar.f31744b, new Rect(i3, i4, i, i2));
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
