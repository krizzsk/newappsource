package p475eu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import c00.C13720d;
import c00.C13722f;
import com.moovit.design.view.list.ListItemView;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.List;
import m00.C18310d;

/* renamed from: eu.b */
public final class C16882b extends C18310d<CharSequence, ListItemView, Void> {

    /* renamed from: i */
    public final ArrayList f43905i = new ArrayList();

    /* renamed from: j */
    public int f43906j = -1;

    public C16882b(Context context, TransitLineGroup transitLineGroup) {
        super(context, R.layout.line_detail_drop_down_item);
        boolean z;
        ArrayList<O> arrayList;
        if (transitLineGroup.f23695c == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            arrayList = C13720d.m34273c(transitLineGroup.f23700h, (C13722f) null, new C16881a(this, context));
        } else {
            arrayList = new ArrayList<>();
            for (TransitLine next : transitLineGroup.f23700h) {
                if (arrayList.contains(next.f23691g)) {
                    ArrayList arrayList2 = this.f43905i;
                    ((List) arrayList2.get(arrayList2.size() - 1)).add(next);
                } else {
                    arrayList.add(next.f23691g);
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(next);
                    this.f43905i.add(arrayList3);
                }
            }
        }
        int size = arrayList.size();
        boolean z2 = true;
        int i = 0;
        while (z2) {
            i++;
            z2 = false;
            int i2 = 0;
            while (i2 < size - i) {
                CharSequence charSequence = (CharSequence) arrayList.get(i2);
                int i3 = i2 + 1;
                CharSequence charSequence2 = (CharSequence) arrayList.get(i3);
                if (charSequence.toString().compareToIgnoreCase(charSequence2.toString()) > 0) {
                    arrayList.set(i2, charSequence2);
                    arrayList.set(i3, charSequence);
                    ArrayList arrayList4 = this.f43905i;
                    arrayList4.set(i2, (List) arrayList4.get(i3));
                    this.f43905i.set(i3, (List) this.f43905i.get(i2));
                    z2 = true;
                }
                i2 = i3;
            }
        }
        this.f46697g.clear();
        this.f46697g.addAll(arrayList);
        notifyDataSetChanged();
    }

    /* renamed from: d */
    public final void mo39512d(View view, Object obj, int i, ViewGroup viewGroup) {
        ListItemView listItemView = (ListItemView) view;
        listItemView.setTitle((CharSequence) obj);
        if (i == this.f43906j) {
            listItemView.setTitleThemeTextAppearance(R.attr.textAppearanceBodySmallStrong);
            listItemView.setTitleThemeTextColor(R.attr.colorOnSurface);
            return;
        }
        listItemView.setTitleThemeTextAppearance(R.attr.textAppearanceBodySmall);
        listItemView.setTitleThemeTextColor(R.attr.colorOnSurfaceEmphasisHigh);
    }
}
