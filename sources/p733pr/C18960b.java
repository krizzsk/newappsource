package p733pr;

import android.view.KeyEvent;
import android.widget.TextView;
import com.moovit.app.home.dashboard.FavoriteLocationEditorActivity;

/* renamed from: pr.b */
public final /* synthetic */ class C18960b implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ int f48270b;

    /* renamed from: c */
    public final /* synthetic */ Object f48271c;

    public /* synthetic */ C18960b(Object obj, int i) {
        this.f48270b = i;
        this.f48271c = obj;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.f48270b) {
            case 0:
                C18961c cVar = (C18961c) this.f48271c;
                int i2 = C18961c.f48272j;
                if (i == 4) {
                    cVar.mo51475O1();
                } else {
                    cVar.getClass();
                }
                return false;
            default:
                FavoriteLocationEditorActivity favoriteLocationEditorActivity = (FavoriteLocationEditorActivity) this.f48271c;
                if (i != 6) {
                    int i3 = FavoriteLocationEditorActivity.f38158s0;
                    favoriteLocationEditorActivity.getClass();
                } else if (favoriteLocationEditorActivity.f38166o0.isEnabled()) {
                    favoriteLocationEditorActivity.mo45101G2();
                }
                return false;
        }
    }
}
