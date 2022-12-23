package ea0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.appboy.models.InAppMessageBase;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.design.view.ProgressView;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19747y;

/* renamed from: ea0.b */
public class C12623b extends C15676b<MoovitActivity> {

    /* renamed from: i */
    public static final /* synthetic */ int f31209i = 0;

    /* renamed from: h */
    public CharSequence f31210h;

    public C12623b() {
        super(MoovitActivity.class);
        setStyle(0, C19747y.ThemeOverlay_Moovit_Dialog_FullScreen);
        setCancelable(false);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f31210h = mo46752K1().getCharSequence(InAppMessageBase.MESSAGE);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C19742t.wait_dialog_content, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        CharSequence charSequence = this.f31210h;
        if (view != null) {
            ((ProgressView) view.findViewById(C19740r.loading_view)).setText(charSequence);
        }
    }
}
