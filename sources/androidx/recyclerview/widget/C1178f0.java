package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.f0 */
public final class C1178f0 {
    /* renamed from: a */
    public static int m3241a(RecyclerView.C1152x xVar, C1249z zVar, View view, View view2, RecyclerView.C1134m mVar, boolean z) {
        if (mVar.getChildCount() == 0 || xVar.mo4935b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(mVar.getPosition(view) - mVar.getPosition(view2)) + 1;
        }
        return Math.min(zVar.mo5176l(), zVar.mo5166b(view2) - zVar.mo5169e(view));
    }

    /* renamed from: b */
    public static int m3242b(RecyclerView.C1152x xVar, C1249z zVar, View view, View view2, RecyclerView.C1134m mVar, boolean z, boolean z2) {
        int i;
        if (mVar.getChildCount() == 0 || xVar.mo4935b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(mVar.getPosition(view), mVar.getPosition(view2));
        int max = Math.max(mVar.getPosition(view), mVar.getPosition(view2));
        if (z2) {
            i = Math.max(0, (xVar.mo4935b() - max) - 1);
        } else {
            i = Math.max(0, min);
        }
        if (!z) {
            return i;
        }
        return Math.round((((float) i) * (((float) Math.abs(zVar.mo5166b(view2) - zVar.mo5169e(view))) / ((float) (Math.abs(mVar.getPosition(view) - mVar.getPosition(view2)) + 1)))) + ((float) (zVar.mo5175k() - zVar.mo5169e(view))));
    }

    /* renamed from: c */
    public static int m3243c(RecyclerView.C1152x xVar, C1249z zVar, View view, View view2, RecyclerView.C1134m mVar, boolean z) {
        if (mVar.getChildCount() == 0 || xVar.mo4935b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return xVar.mo4935b();
        }
        return (int) ((((float) (zVar.mo5166b(view2) - zVar.mo5169e(view))) / ((float) (Math.abs(mVar.getPosition(view) - mVar.getPosition(view2)) + 1))) * ((float) xVar.mo4935b()));
    }
}
