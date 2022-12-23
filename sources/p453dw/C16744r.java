package p453dw;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.transit.TransitType;
import com.tranzmate.R;
import java.util.List;
import m00.C18310d;

/* renamed from: dw.r */
public final class C16744r extends C18310d<TransitType, TextView, Void> {
    public C16744r(StopDetailActivity stopDetailActivity, List list) {
        super(stopDetailActivity, R.layout.spinner_text_item_dropdown, R.layout.spinner_text_item_dropdown, list);
    }

    /* renamed from: d */
    public final void mo39512d(View view, Object obj, int i, ViewGroup viewGroup) {
        ((TextView) view).setText(((TransitType) obj).f23758c);
    }
}
