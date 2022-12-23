package p616kt;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import java.util.List;
import n00.C18492b;
import p127j.C5344a;
import p616kt.C18136c;

/* renamed from: kt.b */
public final /* synthetic */ class C18135b implements ViewPager.OnAdapterChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C18136c f46352b;

    /* renamed from: c */
    public final /* synthetic */ TabLayout f46353c;

    public /* synthetic */ C18135b(C18136c cVar, TabLayout tabLayout) {
        this.f46352b = cVar;
        this.f46353c = tabLayout;
    }

    public final void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        C18136c cVar = this.f46352b;
        TabLayout tabLayout = this.f46353c;
        int i3 = C18136c.f46354p;
        cVar.getClass();
        if (pagerAdapter2 instanceof C18492b) {
            PagerAdapter pagerAdapter3 = ((C18492b) pagerAdapter2).f47097a;
            if (pagerAdapter3 instanceof C18136c.C18138b) {
                C18136c.C18138b bVar = (C18136c.C18138b) pagerAdapter3;
                if (bVar.getCount() == 2) {
                    tabLayout.setTabGravity(0);
                    tabLayout.setTabMode(1);
                } else {
                    tabLayout.setTabGravity(1);
                    tabLayout.setTabMode(0);
                }
                for (int i4 = 0; i4 < bVar.getCount(); i4++) {
                    TabLayout.C14143g g = tabLayout.mo42295g(cVar.f46355o.mo47353b(i4));
                    if (g != null) {
                        List<ServerId> list = bVar.f46360g;
                        ServerId serverId = C18136c.C18138b.f46358j;
                        if (i4 == list.indexOf(serverId)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z || i4 != 0) {
                            i = 0;
                        } else {
                            i = R.drawable.ic_star_24_favorite;
                        }
                        if (i != 0) {
                            TabLayout tabLayout2 = g.f35433g;
                            if (tabLayout2 != null) {
                                g.mo42363b(C5344a.m13397a(tabLayout2.getContext(), i));
                            } else {
                                throw new IllegalArgumentException("Tab not attached to a TabLayout");
                            }
                        }
                        if (i4 == bVar.f46360g.indexOf(serverId)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2 || i4 != 0) {
                            i2 = 0;
                        } else {
                            i2 = R.string.favorite_line_tab_no_station_header;
                        }
                        if (i2 == 0) {
                            continue;
                        } else {
                            TabLayout tabLayout3 = g.f35433g;
                            if (tabLayout3 != null) {
                                g.f35429c = tabLayout3.getResources().getText(i2);
                                g.mo42365d();
                            } else {
                                throw new IllegalArgumentException("Tab not attached to a TabLayout");
                            }
                        }
                    }
                }
            }
        }
    }
}
