package p875vs;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import c00.C13723g;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.Color;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p242s1.C6333d0;
import p543hq.C17474b;
import p583jk.C17884p;
import p589jq.C17910b;
import y10.C20690e;

/* renamed from: vs.f */
public class C20229f extends C15682c<MoovitActivity> {

    /* renamed from: o */
    public static final /* synthetic */ int f51332o = 0;

    /* renamed from: n */
    public final C20224c f51333n = new C20224c(this);

    public C20229f() {
        super(MoovitActivity.class);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("WEB_PAGES");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.list_view);
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                viewGroup.getChildAt(i).setVisibility(8);
            }
            ArrayList c = C13723g.m34282c((List) mo46776J1("WEB_PAGES"), new C17910b(2));
            int size = c.size();
            int childCount2 = viewGroup.getChildCount();
            if (childCount2 != size) {
                if (childCount2 > size) {
                    viewGroup.removeViews(size, childCount2 - size);
                } else {
                    LayoutInflater from = LayoutInflater.from(getContext());
                    while (childCount2 < size) {
                        View inflate = from.inflate(R.layout.web_page_section_list_item, viewGroup, false);
                        inflate.setOnClickListener(this.f51333n);
                        viewGroup.addView(inflate);
                        childCount2++;
                    }
                }
            }
            for (int i2 = 0; i2 < size; i2++) {
                C20222a aVar = (C20222a) c.get(i2);
                TextView textView = (TextView) viewGroup.getChildAt(i2);
                textView.setTag(aVar);
                Image image = aVar.f51321e;
                if (image != null) {
                    C17884p.m44354Y(textView).mo51642v(image).mo51628o0(image).mo10848R(new C20690e(textView, UiUtils.Edge.LEFT));
                } else {
                    C15780a.m40271d(textView, UiUtils.Edge.LEFT, (Drawable) null);
                }
                textView.setText(aVar.f51319c);
                Color color = aVar.f51322f;
                if (color != null) {
                    C6333d0.m15032t(textView, ColorStateList.valueOf(color.f41007b));
                }
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "web_page");
                aVar2.mo49939g(AnalyticsAttributeKey.ID, aVar.f51317a);
                mo46797j2(aVar2.mo49933a());
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.web_pages_section_fragment, viewGroup, false);
    }
}
