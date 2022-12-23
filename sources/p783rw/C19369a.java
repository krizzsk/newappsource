package p783rw;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.C0942l;
import androidx.fragment.app.Fragment;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.tranzmate.R;
import p304x.C7082o;

/* renamed from: rw.a */
public class C19369a extends C15676b<MoovitActivity> {

    /* renamed from: i */
    public static final String f49283i = C19369a.class.getName();

    /* renamed from: h */
    public final C7082o f49284h = new C7082o(this, 15);

    public C19369a() {
        super(MoovitActivity.class);
        setStyle(0, 2131952802);
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setFlags(32, 32);
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.remote_survey_complete_dialog_fragment, viewGroup, false);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof C0942l) {
            ((C0942l) parentFragment).dismissAllowingStateLoss();
        }
    }

    public final void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            view.postDelayed(this.f49284h, 2000);
        }
    }

    public final void onStop() {
        View view = getView();
        if (view != null) {
            view.removeCallbacks(this.f49284h);
        }
        super.onStop();
    }
}
