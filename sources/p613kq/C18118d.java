package p613kq;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.C0965s;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import ce0.C21100e;
import com.moovit.MoovitActivity;
import com.moovit.app.actions.QuickAction;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p001a0.C0017h;
import p977zz.C20944i0;
import q00.C19047a;

/* renamed from: kq.d */
public final class C18118d {

    /* renamed from: a */
    public final MoovitActivity f46325a;

    /* renamed from: b */
    public final C19047a.C19049b<List<QuickAction>> f46326b;

    /* renamed from: c */
    public final View f46327c;

    public C18118d(MoovitActivity moovitActivity, C19047a.C19049b<List<QuickAction>> bVar) {
        C21100e.m49373x(moovitActivity, "activity");
        this.f46325a = moovitActivity;
        C21100e.m49373x(bVar, "actions");
        this.f46326b = bVar;
        this.f46327c = moovitActivity.findViewById(R.id.quick_actions_bar);
    }

    /* renamed from: b */
    public static C0909a m44800b(MoovitActivity moovitActivity) {
        FragmentManager supportFragmentManager = moovitActivity.getSupportFragmentManager();
        C0909a aVar = null;
        for (QuickAction name : QuickAction.values()) {
            Fragment A = supportFragmentManager.mo3923A(name.name());
            if (A != null) {
                if (aVar == null) {
                    aVar = new C0909a(supportFragmentManager);
                }
                aVar.mo4050p(A);
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public final boolean mo50564a() {
        Fragment fragment;
        if (this.f46327c == null || !this.f46325a.f37297F.mo44595c("CONFIGURATION") || this.f46327c.getVisibility() == 0) {
            return false;
        }
        this.f46327c.setVisibility(0);
        C19047a a = C19047a.m46164a(this.f46325a);
        MoovitActivity moovitActivity = this.f46325a;
        List list = (List) a.mo51505b(this.f46326b);
        ArrayList arrayList = new ArrayList(4);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            QuickAction quickAction = (QuickAction) list.get(i);
            if (!quickAction.host.isInstance(moovitActivity)) {
                fragment = null;
            } else {
                C0965s G = moovitActivity.getSupportFragmentManager().mo3929G();
                moovitActivity.getClassLoader();
                Fragment a2 = G.mo3992a(quickAction.fragment.getName());
                int[] iArr = C18116c.f46317q;
                Bundle bundle = new Bundle(1);
                bundle.putInt("position", i);
                a2.setArguments(bundle);
                fragment = a2;
            }
            if (fragment != null) {
                arrayList.add(new C20944i0(quickAction, fragment));
            }
        }
        if (!C13717b.m34258e(arrayList)) {
            FragmentManager supportFragmentManager = moovitActivity.getSupportFragmentManager();
            C0909a b = m44800b(moovitActivity);
            if (b == null) {
                b = C0017h.m54K(supportFragmentManager, supportFragmentManager);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C20944i0 i0Var = (C20944i0) it.next();
                b.mo4041e(0, (Fragment) i0Var.f52693b, ((QuickAction) i0Var.f52692a).name(), 1);
            }
            b.mo4046l();
        }
        return true;
    }

    /* renamed from: c */
    public final void mo50565c() {
        FragmentManager supportFragmentManager = this.f46325a.getSupportFragmentManager();
        for (QuickAction name : QuickAction.values()) {
            C18116c cVar = (C18116c) supportFragmentManager.mo3923A(name.name());
            if (cVar != null) {
                cVar.mo50551m2();
            }
        }
    }
}
