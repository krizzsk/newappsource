package p451du;

import a00.C13382a;
import androidx.viewpager.widget.ViewPager;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.commons.view.pager.CharacterPagerStrip;
import com.tranzmate.R;

/* renamed from: du.g */
public final class C16710g extends ViewPager.SimpleOnPageChangeListener {

    /* renamed from: b */
    public final /* synthetic */ CharacterPagerStrip f43518b;

    /* renamed from: c */
    public final /* synthetic */ C15101a f43519c;

    public C16710g(C15101a aVar, CharacterPagerStrip characterPagerStrip) {
        this.f43519c = aVar;
        this.f43518b = characterPagerStrip;
    }

    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            C15101a aVar = this.f43519c;
            if (aVar.f38828R != aVar.f38836t.getCurrentLogicalItem()) {
                this.f43519c.mo45472z2();
                CharacterPagerStrip characterPagerStrip = this.f43518b;
                C15101a aVar2 = this.f43519c;
                C13382a.m33674j(characterPagerStrip, aVar2.getString(R.string.voice_over_lineview_route_letter, characterPagerStrip.mo47317a(aVar2.f38828R)));
            }
        }
    }
}
