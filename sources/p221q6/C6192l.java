package p221q6;

import android.app.Activity;
import android.app.Fragment;
import com.bumptech.glide.C2116c;
import com.bumptech.glide.C2131j;
import java.util.HashSet;

@Deprecated
/* renamed from: q6.l */
public final class C6192l extends Fragment {

    /* renamed from: b */
    public final C6180a f19578b;

    /* renamed from: c */
    public final C6193a f19579c = new C6193a();

    /* renamed from: d */
    public final HashSet f19580d = new HashSet();

    /* renamed from: e */
    public C2131j f19581e;

    /* renamed from: f */
    public C6192l f19582f;

    /* renamed from: g */
    public Fragment f19583g;

    /* renamed from: q6.l$a */
    public class C6193a implements C6197n {
        public C6193a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + C6192l.this + "}";
        }
    }

    public C6192l() {
        C6180a aVar = new C6180a();
        this.f19578b = aVar;
    }

    /* renamed from: a */
    public final void mo22182a(Activity activity) {
        C6192l lVar = this.f19582f;
        if (lVar != null) {
            lVar.f19580d.remove(this);
            this.f19582f = null;
        }
        C6194m mVar = C2116c.m5520b(activity).f6887h;
        mVar.getClass();
        C6192l i = mVar.mo22197i(activity.getFragmentManager(), (Fragment) null);
        this.f19582f = i;
        if (!equals(i)) {
            this.f19582f.f19580d.add(this);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mo22182a(activity);
        } catch (IllegalStateException unused) {
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f19578b.mo22163a();
        C6192l lVar = this.f19582f;
        if (lVar != null) {
            lVar.f19580d.remove(this);
            this.f19582f = null;
        }
    }

    public final void onDetach() {
        super.onDetach();
        C6192l lVar = this.f19582f;
        if (lVar != null) {
            lVar.f19580d.remove(this);
            this.f19582f = null;
        }
    }

    public final void onStart() {
        super.onStart();
        this.f19578b.mo22164b();
    }

    public final void onStop() {
        super.onStop();
        this.f19578b.mo22167e();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f19583g;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
