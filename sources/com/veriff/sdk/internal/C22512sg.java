package com.veriff.sdk.internal;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;

/* renamed from: com.veriff.sdk.internal.sg */
public class C22512sg extends FrameLayout {

    /* renamed from: a */
    private final View f56810a;

    /* renamed from: b */
    private final ViewGroup f56811b = ((ViewGroup) findViewById(R$id.intro_content));

    public C22512sg(Context context, C22700xq xqVar) {
        super(context);
        View.inflate(context, R$layout.vrff_view_loading, this);
        setBackgroundColor(xqVar.mo57135v().mo57096k());
        View findViewById = findViewById(R$id.loading);
        this.f56810a = findViewById;
        findViewById.setAlpha(1.0f);
        ((ProgressBar) findViewById(R$id.progressBar)).setIndeterminateDrawable(xqVar.mo57124k());
    }

    public void setContent(View view) {
        this.f56811b.removeAllViews();
        this.f56811b.addView(view, new ViewGroup.LayoutParams(-1, -1));
    }
}
