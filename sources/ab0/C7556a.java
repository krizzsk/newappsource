package ab0;

import android.database.DataSetObserver;
import android.os.Handler;
import com.p341rd.PageIndicatorView;

/* renamed from: ab0.a */
public final class C7556a extends DataSetObserver {

    /* renamed from: a */
    public final /* synthetic */ PageIndicatorView f23039a;

    public C7556a(PageIndicatorView pageIndicatorView) {
        this.f23039a = pageIndicatorView;
    }

    public final void onChanged() {
        PageIndicatorView pageIndicatorView = this.f23039a;
        Handler handler = PageIndicatorView.f24178g;
        pageIndicatorView.mo24931g();
    }
}
