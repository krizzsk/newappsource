package com.veriff.sdk.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.veriff.sdk.views.resubmission.C23004s;
import com.veriff.sdk.views.resubmission.C23006t;
import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import mobi.lab.veriff.R$id;
import mobi.lab.veriff.R$layout;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0003¨\u0006\n"}, mo59060d2 = {"Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Lcom/veriff/sdk/Strings;", "strings", "", "Lcom/veriff/sdk/views/resubmission/ResubmissionReasonGuideSet;", "reasonGuideSets", "Lbf0/d;", "addGuides", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.sf */
public final class C22511sf {
    /* access modifiers changed from: private */
    @SuppressLint({"InflateParams"})
    /* renamed from: b */
    public static final void m54841b(LinearLayout linearLayout, Context context, C21616ex exVar, List<C23006t> list) {
        linearLayout.removeAllViews();
        LayoutInflater from = LayoutInflater.from(context);
        for (C23006t tVar : list) {
            View inflate = from.inflate(R$layout.vrff_resubmission_guide_set, (ViewGroup) null);
            View findViewById = inflate.findViewById(R$id.guide_set_title);
            C24362h.m61210e(findViewById, "guideSetView.findViewById(R.id.guide_set_title)");
            TextView textView = (TextView) findViewById;
            View findViewById2 = inflate.findViewById(R$id.guide_set_description);
            C24362h.m61210e(findViewById2, "guideSetView.findViewByI…id.guide_set_description)");
            TextView textView2 = (TextView) findViewById2;
            CharSequence invoke = tVar.mo57923a().invoke(exVar);
            if (invoke != null) {
                textView.setText(invoke);
                textView.setVisibility(0);
            }
            CharSequence invoke2 = tVar.mo57924b().invoke(exVar);
            if (invoke2 != null) {
                textView2.setText(invoke2);
                textView2.setVisibility(0);
            }
            View findViewById3 = inflate.findViewById(R$id.guide_items);
            C24362h.m61210e(findViewById3, "guideSetView.findViewById(R.id.guide_items)");
            LinearLayout linearLayout2 = (LinearLayout) findViewById3;
            linearLayout2.removeAllViews();
            for (C23004s sVar : tVar.mo57925c()) {
                View inflate2 = from.inflate(R$layout.vrff_resubmission_guide_item, (ViewGroup) null);
                View findViewById4 = inflate2.findViewById(R$id.reason_image);
                C24362h.m61210e(findViewById4, "guideItemView.findViewById(R.id.reason_image)");
                View findViewById5 = inflate2.findViewById(R$id.reason_result_icon);
                C24362h.m61210e(findViewById5, "guideItemView.findViewBy…(R.id.reason_result_icon)");
                View findViewById6 = inflate2.findViewById(R$id.reason_image_title);
                C24362h.m61210e(findViewById6, "guideItemView.findViewBy…(R.id.reason_image_title)");
                TextView textView3 = (TextView) findViewById6;
                ((ImageView) findViewById4).setImageDrawable(context.getDrawable(sVar.mo57916a()));
                ((ImageView) findViewById5).setImageDrawable(context.getDrawable(sVar.mo57917b()));
                CharSequence invoke3 = sVar.mo57918c().invoke(exVar);
                if (invoke3 != null) {
                    textView3.setText(invoke3);
                    textView3.setVisibility(0);
                }
                linearLayout2.addView(inflate2);
            }
            linearLayout.addView(inflate);
        }
    }
}
