package p474et;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.moovit.app.home.dashboard.suggestions.SuggestionsSectionFragment;

/* renamed from: et.k */
public final /* synthetic */ class C16879k implements ViewPager2.C1366i {

    /* renamed from: a */
    public final /* synthetic */ int f43900a;

    /* renamed from: b */
    public final /* synthetic */ int f43901b;

    public /* synthetic */ C16879k(int i, int i2) {
        this.f43900a = i;
        this.f43901b = i2;
    }

    public final void transformPage(View view, float f) {
        int i = this.f43900a;
        int i2 = this.f43901b;
        int i3 = SuggestionsSectionFragment.f38283w;
        view.setTranslationX(((float) (i * i2)) * f);
    }
}
