package com.fyber.inneractive.sdk.mraid;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3762c;
import com.fyber.inneractive.sdk.web.C3764d;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.n */
public class C2873n extends C2860b {
    public C2873n(Map<String, String> map, C3764d dVar, C3721p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo13659a() {
        int a = mo13658a("w");
        int a2 = mo13658a("h");
        int a3 = mo13658a("offsetX");
        int a4 = mo13658a("offsetY");
        boolean equals = InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equals(this.f9840b.get("allowOffscreen"));
        String str = this.f9840b.get("customClosePosition");
        if (a <= 0) {
            a = this.f9841c.f13007K;
        }
        if (a2 <= 0) {
            a2 = this.f9841c.f13008L;
        }
        C3764d dVar = this.f9841c;
        C3762c cVar = dVar.f12957b;
        if (cVar != null) {
            try {
                ViewGroup viewGroup = (ViewGroup) cVar.getRootView().findViewById(16908290);
                dVar.f12999C = viewGroup;
                if (viewGroup == null) {
                    IAlog.m9906e("Couldn't find content in the view tree", new Object[0]);
                    dVar.mo15451a(C2865f.RESIZE, "Ad can be resized only if it's state is default or resized.");
                } else if (dVar.f13023z != C3764d.C3768d.DISABLED) {
                    C2859a0 a0Var = dVar.f13022y;
                    if (a0Var != C2859a0.DEFAULT && a0Var != C2859a0.RESIZED) {
                        dVar.mo15451a(C2865f.RESIZE, "Ad can be resized only if it's state is default or resized.");
                    } else if (a >= 0 || a2 >= 0) {
                        dVar.mo15455b(false);
                        C3764d.C3772h hVar = dVar.f12997A;
                        if (hVar == C3764d.C3772h.ALWAYS_VISIBLE || (!dVar.f13005I && hVar != C3764d.C3772h.ALWAYS_HIDDEN)) {
                            dVar.mo15457c(true);
                        }
                        dVar.mo15458d(false);
                        dVar.f13012P = C3707l.m9963b(a2);
                        dVar.f13011O = C3707l.m9963b(a);
                        if (!equals) {
                            int i = (a3 + a) - dVar.f13007K;
                            if (i > 0) {
                                a3 -= i;
                            }
                            if (a3 < 0) {
                                a3 = 0;
                            }
                            int i2 = (a4 + a2) - dVar.f13008L;
                            if (i2 > 0) {
                                a4 -= i2;
                            }
                            if (a4 < 0) {
                                a4 = 0;
                            }
                        }
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C3707l.m9963b(a), C3707l.m9963b(a2));
                        layoutParams.leftMargin = a3;
                        layoutParams.topMargin = a4;
                        if (a3 == 0 && a4 == 0) {
                            layoutParams.gravity = 17;
                        }
                        dVar.f12957b.setLayoutParams(layoutParams);
                        C2859a0 a0Var2 = dVar.f13022y;
                        C2859a0 a0Var3 = C2859a0.RESIZED;
                        if (a0Var2 != a0Var3) {
                            dVar.f13022y = a0Var3;
                            dVar.mo15452a((C2879t) new C2884y(a0Var3));
                            int i3 = dVar.f13011O;
                            if (!(i3 == -1 || dVar.f13012P == -1)) {
                                dVar.mo15452a((C2879t) new C2878s(C3707l.m9968c(i3), C3707l.m9968c(dVar.f13012P)));
                            }
                        }
                        L l = dVar.f12962g;
                        if (l != null) {
                            ((C3764d.C3770f) l).mo13920b(dVar);
                        }
                    } else {
                        dVar.mo15451a(C2865f.RESIZE, "Creative size passed to resize() was invalid.");
                    }
                }
            } catch (Exception unused) {
                IAlog.m9906e("Couldn't find content in the view tree", new Object[0]);
                dVar.mo15451a(C2865f.RESIZE, "Ad can be resized only if it's state is default or resized.");
            }
        }
    }

    /* renamed from: b */
    public boolean mo13655b() {
        return true;
    }
}
