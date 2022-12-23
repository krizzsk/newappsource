package g30;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.design.view.AlertMessageView;
import p480ez.C16910b;
import p824tp.C19742t;

/* renamed from: g30.k */
public class C4779k extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public static final /* synthetic */ int f16146h = 0;

    public C4779k() {
        super(MoovitActivity.class);
        setCancelable(false);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C19742t.metro_rev_mismatch_layout, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((AlertMessageView) view).setPositiveButtonClickListener(new C16910b(this, 4));
    }
}
