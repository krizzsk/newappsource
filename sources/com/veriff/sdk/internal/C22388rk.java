package com.veriff.sdk.internal;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import bf0.C21050d;
import kotlin.Metadata;
import lf0.C24225a;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, mo59060d2 = {"Lcom/veriff/sdk/views/intro/ui/PrivacyPolicySpan;", "Landroid/text/style/URLSpan;", "Landroid/view/View;", "widget", "Lbf0/d;", "onClick", "Landroid/text/TextPaint;", "ds", "updateDrawState", "", "color", "I", "getColor", "()I", "Lkotlin/Function0;", "Llf0/a;", "getOnClick", "()Llf0/a;", "Landroid/graphics/Typeface;", "typeface", "Landroid/graphics/Typeface;", "<init>", "(Llf0/a;I)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.rk */
public final class C22388rk extends URLSpan {

    /* renamed from: a */
    private Typeface f56517a;

    /* renamed from: b */
    private final C24225a<C21050d> f56518b;

    /* renamed from: c */
    private final int f56519c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22388rk(C24225a<C21050d> aVar, int i) {
        super("https://www.veriff.com/privacy-policy");
        C24362h.m61211f(aVar, "onClick");
        this.f56518b = aVar;
        this.f56519c = i;
    }

    public void onClick(View view) {
        C24362h.m61211f(view, "widget");
        this.f56518b.invoke();
    }

    public void updateDrawState(TextPaint textPaint) {
        C24362h.m61211f(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        if (this.f56517a == null) {
            this.f56517a = Typeface.create(textPaint.getTypeface(), 1);
        }
        textPaint.setTypeface(this.f56517a);
        textPaint.setColor(this.f56519c);
    }
}
