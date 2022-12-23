package com.fyber.inneractive.sdk.mraid;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.C2524R;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3721p0;
import com.fyber.inneractive.sdk.util.C3727s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3762c;
import com.fyber.inneractive.sdk.web.C3764d;
import com.fyber.inneractive.sdk.web.C3779h;
import com.fyber.inneractive.sdk.web.C3783l;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.mraid.e */
public class C2864e extends C2858a {
    public C2864e(Map<String, String> map, C3764d dVar, C3721p0 p0Var) {
        super(map, dVar, p0Var);
    }

    /* renamed from: a */
    public void mo13659a() {
        int i;
        int a = mo13658a("w");
        int a2 = mo13658a("h");
        String str = this.f9840b.get("url");
        boolean equals = InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equals(this.f9840b.get("shouldUseCustomClose"));
        boolean equals2 = InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equals(this.f9840b.get("lockOrientation"));
        if (a <= 0) {
            a = -1;
        }
        if (a2 <= 0) {
            a2 = -1;
        }
        C3764d dVar = this.f9841c;
        if (dVar.f12957b != null && dVar.f13023z != C3764d.C3768d.DISABLED && dVar.f13022y == C2859a0.DEFAULT) {
            if (str == null || URLUtil.isValidUrl(str)) {
                int i2 = 0;
                try {
                    ViewGroup viewGroup = (ViewGroup) dVar.f12957b.getRootView().findViewById(16908290);
                    dVar.f12999C = viewGroup;
                    if (viewGroup == null) {
                        IAlog.m9906e("Couldn't find content in the view tree", new Object[0]);
                        dVar.mo15451a(C2865f.RESIZE, "Ad can be resized only if it's state is default or resized.");
                        return;
                    }
                    dVar.f13005I = equals;
                    L l = dVar.f12962g;
                    if (l != null) {
                        ((C3764d.C3770f) l).mo13915a(dVar, equals);
                    }
                    dVar.mo15458d(equals2);
                    if (dVar.f13012P >= 0) {
                        dVar.f13012P = C3707l.m9963b(a2);
                    }
                    if (dVar.f13011O >= 0) {
                        dVar.f13011O = C3707l.m9963b(i);
                    }
                    C3762c cVar = dVar.f12957b;
                    if (str != null) {
                        C3762c cVar2 = new C3762c(dVar.mo15460g());
                        dVar.f13000D = cVar2;
                        cVar2.setId(C2524R.C2526id.inneractive_webview_mraid);
                        dVar.f13000D.loadUrl(str);
                        dVar.f13000D.setWebChromeClient(dVar.f12958c);
                        dVar.f13000D.setWebViewClient(dVar.f12959d);
                        cVar = dVar.f13000D;
                        cVar.setOnKeyListener(new C3779h(dVar));
                    } else {
                        ViewGroup viewGroup2 = (ViewGroup) cVar.getParent();
                        if (viewGroup2 != null) {
                            int childCount = viewGroup2.getChildCount();
                            while (i2 < childCount && viewGroup2.getChildAt(i2) != dVar.f12957b) {
                                i2++;
                            }
                            dVar.f13014R = i2;
                            C3727s.m9992a((View) dVar.f13015S);
                            viewGroup2.addView(dVar.f13015S, i2, new ViewGroup.LayoutParams(dVar.f12957b.getWidth(), dVar.f12957b.getHeight()));
                            viewGroup2.removeView(dVar.f12957b);
                        }
                    }
                    float f = dVar.f13006J;
                    int i3 = (int) ((50.0f * f) + 0.5f);
                    if (a2 >= 0 && i >= 0) {
                        i = (int) (((float) i) * f);
                        a2 = (int) (((float) a2) * f);
                        if (i < i3) {
                            i = i3;
                        }
                        if (a2 < i3) {
                            a2 = i3;
                        }
                    }
                    View view = new View(dVar.mo15460g());
                    view.setBackgroundColor(dVar.mo15460g().getResources().getColor(C2524R.color.ia_mraid_expanded_dimmed_bk));
                    view.setOnTouchListener(new C3783l(dVar));
                    dVar.f13017U.addView(view, new RelativeLayout.LayoutParams(-1, -1));
                    C3727s.m9992a((View) cVar);
                    dVar.f13016T.addView(cVar, new RelativeLayout.LayoutParams(-1, -1));
                    C3727s.m9992a((View) dVar.f13016T);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, a2);
                    layoutParams.addRule(13);
                    dVar.f13017U.addView(dVar.f13016T, layoutParams);
                    C3727s.m9992a((View) dVar.f13017U);
                    dVar.f12999C.addView(dVar.f13017U, new ViewGroup.LayoutParams(-1, -1));
                    if (!cVar.hasFocus()) {
                        cVar.requestFocus();
                    }
                    C3764d.C3772h hVar = dVar.f12997A;
                    if (hVar == C3764d.C3772h.ALWAYS_VISIBLE || (!dVar.f13005I && hVar != C3764d.C3772h.ALWAYS_HIDDEN)) {
                        dVar.mo15457c(true);
                    }
                    C2859a0 a0Var = C2859a0.EXPANDED;
                    dVar.f13022y = a0Var;
                    dVar.mo15452a((C2879t) new C2884y(a0Var));
                    int i4 = dVar.f13011O;
                    if (!(i4 == -1 || dVar.f13012P == -1)) {
                        dVar.mo15452a((C2879t) new C2878s(C3707l.m9968c(i4), C3707l.m9968c(dVar.f13012P)));
                    }
                    L l2 = dVar.f12962g;
                    if (l2 != null) {
                        ((C3764d.C3770f) l2).mo13913a(dVar);
                    }
                } catch (Exception unused) {
                    IAlog.m9906e("Couldn't find content in the view tree", new Object[0]);
                    dVar.mo15451a(C2865f.RESIZE, "Ad can be resized only if it's state is default or resized.");
                }
            } else {
                dVar.mo15451a(C2865f.EXPAND, "URL passed to expand() was invalid.");
            }
        }
    }

    /* renamed from: c */
    public String mo13656c() {
        return this.f9840b.get("url");
    }
}
