package com.moovit.design.view;

import android.animation.Animator;
import android.text.TextUtils;
import com.moovit.design.view.TextAnimationView;
import j00.C17682a;

/* renamed from: com.moovit.design.view.a */
public final class C15868a extends C17682a {

    /* renamed from: a */
    public final /* synthetic */ TextAnimationView f41399a;

    /* renamed from: b */
    public final /* synthetic */ String f41400b;

    public C15868a(TextAnimationView textAnimationView, String str) {
        this.f41399a = textAnimationView;
        this.f41400b = str;
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        this.f41399a.f41379h.f41388g = true;
    }

    public final void onAnimationStart(Animator animator) {
        boolean z;
        char charAt;
        TextAnimationView.C15866a aVar = this.f41399a.f41379h;
        String str = this.f41400b;
        if (str != null) {
            aVar.getClass();
            if (!TextUtils.isEmpty(str) && (charAt = str.charAt(0)) >= 1424 && charAt <= 1791) {
                z = true;
            } else {
                z = false;
            }
            aVar.f41385d = z;
            aVar.f41388g = false;
            aVar.f41387f = true;
            return;
        }
        aVar.f41388g = true;
    }
}
