package p621ky;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.moovit.app.useraccount.providers.ConnectProvider;
import com.moovit.commons.utils.UiUtils;
import p567iq.C17636c;

/* renamed from: ky.a */
public abstract class C18157a<T> extends Fragment {

    /* renamed from: b */
    public int f46393b = 0;

    /* renamed from: ky.a$a */
    public interface C18158a {
        /* renamed from: U0 */
        void mo46546U0(ConnectProvider connectProvider, String str, String str2);

        /* renamed from: g0 */
        void mo46547g0(ConnectProvider connectProvider, int i, String str);

        /* renamed from: n */
        void mo46548n(ConnectProvider connectProvider);
    }

    /* renamed from: H1 */
    public abstract ConnectProvider mo46649H1();

    /* renamed from: I1 */
    public final void mo50583I1(String str, String str2) {
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof C18158a) {
            ((C18158a) targetFragment).mo46546U0(mo46649H1(), str, str2);
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof C18158a) {
            ((C18158a) parentFragment).mo46546U0(mo46649H1(), str, str2);
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof C18158a) {
            ((C18158a) activity).mo46546U0(mo46649H1(), str, str2);
        }
    }

    /* renamed from: J1 */
    public final void mo50584J1() {
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof C18158a) {
            ((C18158a) targetFragment).mo46548n(mo46649H1());
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof C18158a) {
            ((C18158a) parentFragment).mo46548n(mo46649H1());
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof C18158a) {
            ((C18158a) activity).mo46548n(mo46649H1());
        }
    }

    /* renamed from: K1 */
    public final void mo50585K1(int i, String str) {
        Fragment targetFragment = getTargetFragment();
        if (targetFragment instanceof C18158a) {
            ((C18158a) targetFragment).mo46547g0(mo46649H1(), i, str);
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof C18158a) {
            ((C18158a) parentFragment).mo46547g0(mo46649H1(), i, str);
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof C18158a) {
            ((C18158a) activity).mo46547g0(mo46649H1(), i, str);
        }
    }

    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray n = UiUtils.m40255n(context, attributeSet, C17636c.ConnectProvider);
        try {
            this.f46393b = n.getInt(0, 0);
        } finally {
            n.recycle();
        }
    }
}
