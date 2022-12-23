package com.fyber.inneractive.sdk.web;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.p051ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3786o;

/* renamed from: com.fyber.inneractive.sdk.web.c */
public class C3762c extends WebView {

    /* renamed from: a */
    public boolean f12989a = false;

    /* renamed from: b */
    public boolean f12990b;

    /* renamed from: c */
    public C3763a f12991c;

    /* renamed from: d */
    public C3786o f12992d;

    /* renamed from: e */
    public final C3721p0 f12993e = C3721p0.m9979a();

    /* renamed from: f */
    public int f12994f;

    /* renamed from: g */
    public int f12995g;

    /* renamed from: com.fyber.inneractive.sdk.web.c$a */
    public interface C3763a {
    }

    public C3762c() {
        super((Context) null);
    }

    /* renamed from: a */
    public void mo15429a(String str) {
        IAlog.m9902a("injecting JS: %s", str);
        if (str != null) {
            try {
                loadUrl("javascript:" + str);
            } catch (Exception unused) {
                IAlog.m9902a("Failed to inject JS", new Object[0]);
            }
        }
    }

    public void destroy() {
        try {
            super.destroy();
        } catch (Throwable unused) {
        }
        this.f12991c = null;
    }

    public int getHeightDp() {
        return this.f12995g;
    }

    public boolean getIsVisible() {
        return this.f12990b;
    }

    public C3721p0 getLastClickedLocation() {
        return this.f12993e;
    }

    public int getWidthDp() {
        return this.f12994f;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f12989a) {
            this.f12989a = true;
            C3763a aVar = this.f12991c;
            if (aVar != null) {
                C3714n.f12902b.post(new C3777f((C3764d) aVar));
            }
            mo15430a();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12990b = false;
        if (this.f12989a) {
            this.f12989a = false;
            C3763a aVar = this.f12991c;
            if (aVar != null) {
                C3714n.f12902b.post(new C3778g((C3764d) aVar));
            }
            mo15430a();
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        mo15430a();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        C3786o oVar = this.f12992d;
        if (oVar != null) {
            oVar.onTouch(this, motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            C3721p0 p0Var = this.f12993e;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            p0Var.f12907a = x;
            p0Var.f12908b = y;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        mo15430a();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        IAlog.m9905d("onWindowFocusChanged with: %s", Boolean.valueOf(z));
        mo15430a();
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 8) {
            mo15431a(false);
        } else {
            mo15430a();
        }
    }

    public void setHeightDp(int i) {
        this.f12995g = i;
    }

    public void setListener(C3763a aVar) {
        this.f12991c = aVar;
    }

    public void setTapListener(C3786o.C3787a aVar) {
        this.f12992d = new C3786o(aVar, getContext());
    }

    public void setWidthDp(int i) {
        this.f12994f = i;
    }

    public C3762c(Context context) {
        super(context.getApplicationContext());
    }

    /* renamed from: a */
    public boolean mo15430a() {
        boolean z = false;
        IAlog.m9905d("updateVisibility called - is = %s hwf = %s atw = %swinToken - %s app token - %s", Boolean.valueOf(isShown()), Boolean.valueOf(hasWindowFocus()), Boolean.valueOf(this.f12989a), getWindowToken(), getApplicationWindowToken());
        if (getWindowToken() != getApplicationWindowToken()) {
            if (getWindowVisibility() != 8 && isShown() && this.f12989a) {
                z = true;
            }
            return mo15431a(z);
        }
        if (isShown() && hasWindowFocus() && this.f12989a) {
            z = true;
        }
        return mo15431a(z);
    }

    /* renamed from: a */
    public final boolean mo15431a(boolean z) {
        if (z) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                Rect rect = new Rect();
                viewGroup.getHitRect(rect);
                if (!getLocalVisibleRect(rect) && getWindowToken() == getApplicationWindowToken()) {
                    IAlog.m9905d("updateVisibility - Cannot find local visible rect. Scrolled out?", new Object[0]);
                    z = false;
                }
            } else {
                IAlog.m9905d("updateVisibility - No parent available", new Object[0]);
            }
        }
        if (this.f12990b == z) {
            return false;
        }
        this.f12990b = z;
        C3763a aVar = this.f12991c;
        if (aVar != null) {
            ((IAmraidWebViewController) aVar).mo15324e(z);
        }
        return true;
    }
}
