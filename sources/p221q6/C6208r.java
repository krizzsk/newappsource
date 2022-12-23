package p221q6;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.C2116c;
import com.bumptech.glide.C2131j;
import java.util.HashSet;

/* renamed from: q6.r */
public class C6208r extends Fragment {

    /* renamed from: b */
    public final C6180a f19618b;

    /* renamed from: c */
    public final C6209a f19619c = new C6209a();

    /* renamed from: d */
    public final HashSet f19620d = new HashSet();

    /* renamed from: e */
    public C6208r f19621e;

    /* renamed from: f */
    public C2131j f19622f;

    /* renamed from: g */
    public Fragment f19623g;

    /* renamed from: q6.r$a */
    public class C6209a implements C6197n {
        public C6209a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + C6208r.this + "}";
        }
    }

    public C6208r() {
        C6180a aVar = new C6180a();
        this.f19618b = aVar;
    }

    /* renamed from: H1 */
    public final void mo22211H1(Context context, FragmentManager fragmentManager) {
        C6208r rVar = this.f19621e;
        if (rVar != null) {
            rVar.f19620d.remove(this);
            this.f19621e = null;
        }
        C6208r j = C2116c.m5520b(context).f6887h.mo22198j(fragmentManager, (Fragment) null);
        this.f19621e = j;
        if (!equals(j)) {
            this.f19621e.f19620d.add(this);
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment fragment = this;
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        FragmentManager fragmentManager = fragment.getFragmentManager();
        if (fragmentManager != null) {
            try {
                mo22211H1(getContext(), fragmentManager);
            } catch (IllegalStateException unused) {
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f19618b.mo22163a();
        C6208r rVar = this.f19621e;
        if (rVar != null) {
            rVar.f19620d.remove(this);
            this.f19621e = null;
        }
    }

    public final void onDetach() {
        super.onDetach();
        this.f19623g = null;
        C6208r rVar = this.f19621e;
        if (rVar != null) {
            rVar.f19620d.remove(this);
            this.f19621e = null;
        }
    }

    public final void onStart() {
        super.onStart();
        this.f19618b.mo22164b();
    }

    public final void onStop() {
        super.onStop();
        this.f19618b.mo22167e();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f19623g;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
