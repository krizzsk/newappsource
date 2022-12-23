package i20;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.moovit.location.AddressFragment;

/* renamed from: i20.a */
public final class C17539a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ AddressFragment f45130b;

    public C17539a(AddressFragment addressFragment) {
        this.f45130b = addressFragment;
    }

    public final void onClick(View view) {
        AddressFragment addressFragment = this.f45130b;
        int i = AddressFragment.f42184r;
        Fragment targetFragment = addressFragment.getTargetFragment();
        if (targetFragment instanceof AddressFragment.C16186a) {
            ((AddressFragment.C16186a) targetFragment).mo48498a();
        }
        FragmentActivity activity = addressFragment.getActivity();
        if (activity instanceof AddressFragment.C16186a) {
            ((AddressFragment.C16186a) activity).mo48498a();
        }
    }
}
