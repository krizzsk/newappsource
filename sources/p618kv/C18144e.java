package p618kv;

import android.widget.RadioGroup;
import androidx.viewpager.widget.ViewPager;

/* renamed from: kv.e */
public final class C18144e extends ViewPager.SimpleOnPageChangeListener {

    /* renamed from: b */
    public final /* synthetic */ RadioGroup f46368b;

    public C18144e(RadioGroup radioGroup) {
        this.f46368b = radioGroup;
    }

    public final void onPageSelected(int i) {
        this.f46368b.check(i);
    }
}
