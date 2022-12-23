package p448dr;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.tranzmate.R;

/* renamed from: dr.b */
public class C16697b extends C15682c<MoovitActivity> {

    /* renamed from: n */
    public static final /* synthetic */ int f43487n = 0;

    public C16697b() {
        super(MoovitActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.ataf_tickets_section_fragment, viewGroup, false);
        inflate.setOnClickListener(new C16696a());
        return inflate;
    }
}
