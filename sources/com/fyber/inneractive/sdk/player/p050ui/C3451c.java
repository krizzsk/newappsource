package com.fyber.inneractive.sdk.player.p050ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.C3724q0;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.ui.c */
public abstract class C3451c extends RelativeLayout implements C3455g {

    /* renamed from: a */
    public final C3721p0 f12315a;

    /* renamed from: b */
    public int f12316b;

    /* renamed from: c */
    public C2703z f12317c;

    /* renamed from: d */
    public UnitDisplayType f12318d;

    /* renamed from: e */
    public boolean f12319e;

    /* renamed from: f */
    public boolean f12320f;

    /* renamed from: g */
    public C3456h f12321g;

    /* renamed from: h */
    public boolean f12322h;

    public C3451c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12315a = C3721p0.m9979a();
        this.f12316b = 0;
        this.f12319e = false;
        this.f12320f = false;
        this.f12322h = false;
        this.f12316b = Math.min(C3707l.m9972e(), C3707l.m9970d());
    }

    /* renamed from: a */
    public String mo14674a() {
        return IAlog.m9899a((Object) this);
    }

    /* renamed from: a */
    public abstract void mo14675a(C3724q0 q0Var, int i, int i2);

    /* renamed from: b */
    public void mo14676b() {
        boolean z;
        if (!isShown() || !hasWindowFocus() || !this.f12320f || this.f12322h) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            z = getGlobalVisibleRect(new Rect());
        }
        if (z != this.f12319e && this.f12321g != null) {
            IAlog.m9902a("%supdateVisibility changing to %s", IAlog.m9899a((Object) this), Boolean.valueOf(z));
            this.f12319e = z;
            this.f12321g.mo13840a(z);
        }
    }

    public void destroy() {
        if (this.f12321g != null) {
            this.f12321g = null;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        IAlog.m9902a("%sGot onAttachedToWindow: mIsAttached = %s", IAlog.m9899a((Object) this), Boolean.valueOf(this.f12320f));
        this.f12320f = true;
        C3456h hVar = this.f12321g;
        if (hVar != null) {
            hVar.mo13841b();
        }
        mo14676b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IAlog.m9902a("%sGot onDetachedFromWindow: mIsAttached = %s", IAlog.m9899a((Object) this), Boolean.valueOf(this.f12320f));
        this.f12320f = false;
        C3456h hVar = this.f12321g;
        if (hVar != null) {
            hVar.mo13876d();
        }
        mo14676b();
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (equals(view)) {
            IAlog.m9902a("%sgot onVisibilityChanged with %d", IAlog.m9899a((Object) this), Integer.valueOf(i));
            mo14676b();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        IAlog.m9902a("%sgot onWindowFocusChanged with: %s", IAlog.m9899a((Object) this), Boolean.valueOf(z));
        mo14676b();
    }

    public void setListener(C3456h hVar) {
        this.f12321g = hVar;
    }

    public void setUnitConfig(C2703z zVar) {
        UnitDisplayType unitDisplayType;
        this.f12317c = zVar;
        C2702y yVar = (C2702y) zVar;
        if (yVar.f9426e == null) {
            unitDisplayType = yVar.f9427f.f9256j;
        } else {
            unitDisplayType = UnitDisplayType.DEFAULT;
        }
        this.f12318d = unitDisplayType;
    }
}
