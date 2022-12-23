package com.fyber.inneractive.sdk.web;

import android.view.KeyEvent;
import android.view.View;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.web.h */
public class C3779h implements View.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ C3764d f13047a;

    public C3779h(C3764d dVar) {
        this.f13047a = dVar;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 4 || !this.f13047a.mo15461h()) {
            return false;
        }
        IAlog.m9905d("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
        this.f13047a.mo15459f();
        return true;
    }
}
