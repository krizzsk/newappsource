package com.moovit.app.ads.mapitem;

import android.view.View;
import android.view.ViewGroup;
import bf0.C21050d;
import com.tranzmate.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "adView", "Lbf0/d;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class MapItemAdBottomSheetDialog$onViewCreated$1 extends Lambda implements C24236l<View, C21050d> {
    public final /* synthetic */ View $view;
    public final /* synthetic */ MapItemAdBottomSheetDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MapItemAdBottomSheetDialog$onViewCreated$1(MapItemAdBottomSheetDialog mapItemAdBottomSheetDialog, View view) {
        super(1);
        this.this$0 = mapItemAdBottomSheetDialog;
        this.$view = view;
    }

    public final Object invoke(Object obj) {
        View view = (View) obj;
        MapItemAdBottomSheetDialog mapItemAdBottomSheetDialog = this.this$0;
        View view2 = this.$view;
        C24362h.m61210e(view, "adView");
        int i = MapItemAdBottomSheetDialog.f37544p;
        mapItemAdBottomSheetDialog.getClass();
        View findViewById = view2.findViewById(R.id.container);
        C24362h.m61210e(findViewById, "view.findViewById(R.id.container)");
        ViewGroup viewGroup = (ViewGroup) findViewById;
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        return C21050d.f52856a;
    }
}
