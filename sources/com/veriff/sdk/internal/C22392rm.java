package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.C1179g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import mobi.lab.veriff.C24418a;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;
import mobi.lab.veriff.util.C24454g;
import mobi.lab.veriff.util.C24457h;
import n60.C18531b;
import p102h0.C5021e;
import p116i1.C5247f;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.veriff.sdk.internal.rm */
public class C22392rm extends LinearLayout {

    /* renamed from: a */
    private final C22700xq f56529a;

    /* renamed from: b */
    private final C21789ix f56530b;

    /* renamed from: c */
    private final C21616ex f56531c;

    /* renamed from: d */
    private final C24454g f56532d;

    /* renamed from: e */
    private final boolean f56533e;

    /* renamed from: f */
    private final C22393a f56534f;

    /* renamed from: com.veriff.sdk.internal.rm$a */
    public interface C22393a {
        /* renamed from: a */
        void mo56461a();

        /* renamed from: a */
        void mo56462a(C24454g gVar);
    }

    public C22392rm(Context context, C22700xq xqVar, C21789ix ixVar, C21616ex exVar, C24454g gVar, boolean z, C22393a aVar) {
        super(context);
        this.f56534f = aVar;
        this.f56529a = xqVar;
        this.f56530b = ixVar;
        this.f56531c = exVar;
        this.f56532d = gVar;
        this.f56533e = z;
        View.inflate(context, R$layout.vrff_view_language, this);
    }

    /* renamed from: a */
    public void mo56460a(AppCompatActivity appCompatActivity) {
        appCompatActivity.setSupportActionBar((Toolbar) findViewById(R$id.language_toolbar));
        ImageView imageView = (ImageView) findViewById(R$id.language_close);
        imageView.setContentDescription(this.f56531c.mo54719bI());
        imageView.setOnClickListener(new C18531b(this, 10));
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R$id.language_collapsingToolbar);
        collapsingToolbarLayout.setCollapsedTitleTextColor(this.f56529a.mo57135v().mo57098m());
        collapsingToolbarLayout.setExpandedTitleTextColor(this.f56529a.mo57132s());
        collapsingToolbarLayout.setBackgroundColor(this.f56529a.mo57135v().mo57096k());
        collapsingToolbarLayout.setContentScrimColor(this.f56529a.mo57135v().mo57096k());
        collapsingToolbarLayout.setTitle(this.f56531c.mo54749bm());
        RecyclerView recyclerView = (RecyclerView) findViewById(R$id.language_recyclerview);
        C22389rl rlVar = new C22389rl(C24457h.f61897a.mo60702b(), this.f56532d, new C5021e(this, 18), this.f56530b, this.f56531c, this.f56529a);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setItemAnimator(new C1179g());
        recyclerView.setAdapter(rlVar);
        ImageView imageView2 = (ImageView) findViewById(R$id.language_logo);
        Resources resources = getContext().getResources();
        int p = this.f56529a.mo57135v().mo57101p();
        ThreadLocal<TypedValue> threadLocal = C5247f.f17365a;
        imageView2.setImageDrawable(C5247f.C5248a.m13264a(resources, p, (Resources.Theme) null));
        if (this.f56533e && this.f56529a.mo57135v().mo57101p() == C24418a.f61782a) {
            imageView2.setVisibility(4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m54637a(View view) {
        this.f56534f.mo56461a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m54639a(C24454g gVar) {
        this.f56534f.mo56462a(gVar);
    }

    /* renamed from: a */
    public void mo56459a() {
        FrameLayout frameLayout = (FrameLayout) findViewById(R$id.loading);
        frameLayout.setBackgroundColor(this.f56529a.mo57135v().mo57096k());
        frameLayout.setAlpha(1.0f);
    }
}
