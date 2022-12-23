package com.moovit;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C0932h0;
import androidx.fragment.app.C0942l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.moovit.C14688a;
import com.moovit.MoovitActivity;
import com.moovit.design.dialog.C15858a;
import java.util.Collections;
import java.util.Set;
import o20.C18704j;
import p435de.C16596f;
import p543hq.C17474b;
import p824tp.C19723b;
import p824tp.C19747y;
import p977zz.C20949l;

/* renamed from: com.moovit.b */
public abstract class C15676b<A extends MoovitActivity> extends C0942l implements C19723b {

    /* renamed from: b */
    public final Class<A> f40791b;

    /* renamed from: c */
    public A f40792c;

    /* renamed from: d */
    public boolean f40793d = false;

    /* renamed from: e */
    public Bundle f40794e;

    /* renamed from: f */
    public C14688a f40795f;

    /* renamed from: g */
    public final C15677a f40796g = new C15677a();

    /* renamed from: com.moovit.b$a */
    public class C15677a implements C14688a.C14690b {
        public C15677a() {
        }

        /* renamed from: a */
        public final void mo20300a() {
            C15676b.this.mo46754M1();
        }

        /* renamed from: c */
        public final void mo20301c(Object obj, String str) {
            C15676b.this.mo45507P1(obj, str);
        }

        /* renamed from: d */
        public final void mo20302d(Object obj, String str) {
            C15676b.this.getClass();
        }
    }

    public C15676b(Class<A> cls) {
        this.f40791b = cls;
        setStyle(0, C19747y.ThemeOverlay_Moovit_Dialog);
    }

    /* renamed from: H1 */
    public final <T> T mo46750H1(String str) {
        return this.f40795f.mo44594b(str);
    }

    /* renamed from: I1 */
    public Set<String> mo22562I1() {
        return Collections.emptySet();
    }

    /* renamed from: J1 */
    public final Object mo46751J1() {
        Class<C18704j> cls = C18704j.class;
        Fragment targetFragment = getTargetFragment();
        if (cls.isInstance(targetFragment)) {
            return cls.cast(targetFragment);
        }
        Fragment parentFragment = getParentFragment();
        if (cls.isInstance(parentFragment)) {
            return cls.cast(parentFragment);
        }
        FragmentActivity activity = getActivity();
        if (cls.isInstance(activity)) {
            return cls.cast(activity);
        }
        return null;
    }

    /* renamed from: K1 */
    public final Bundle mo46752K1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        StringBuilder k = C13555b.m33972k("Missing arguments for fragment ");
        k.append(getClass());
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: L1 */
    public final <C> void mo46753L1(Class<C> cls, C20949l<C> lVar) {
        Fragment targetFragment = getTargetFragment();
        if (!cls.isInstance(targetFragment) || !lVar.invoke(cls.cast(targetFragment))) {
            Fragment parentFragment = getParentFragment();
            if (!cls.isInstance(parentFragment) || !lVar.invoke(cls.cast(parentFragment))) {
                FragmentActivity activity = getActivity();
                if (cls.isInstance(activity)) {
                    lVar.invoke(cls.cast(activity));
                }
            }
        }
    }

    /* renamed from: M1 */
    public void mo46754M1() {
        View view = getView();
        if (view != null) {
            mo22563O1(view);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            mo46755N1(dialog);
        }
    }

    /* renamed from: N1 */
    public void mo46755N1(Dialog dialog) {
    }

    /* renamed from: O1 */
    public void mo22563O1(View view) {
    }

    /* renamed from: P1 */
    public void mo45507P1(Object obj, String str) {
    }

    /* renamed from: Q1 */
    public void mo40414Q1(Bundle bundle) {
    }

    /* renamed from: R1 */
    public void mo22564R1(C17474b bVar) {
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof C15682c) {
            ((C15682c) parentFragment).mo46797j2(bVar);
            return;
        }
        A a = this.f40792c;
        if (a != null) {
            a.mo44545v2(bVar);
        }
    }

    /* renamed from: Y0 */
    public final void mo46756Y0() {
        if (!this.f40793d) {
            this.f40793d = true;
            mo40414Q1(this.f40794e);
            this.f40794e = null;
        }
    }

    public void onActivityCreated(Bundle bundle) {
        Dialog dialog;
        super.onActivityCreated(bundle);
        if (this.f40795f.mo44593a() && (dialog = getDialog()) != null) {
            mo46755N1(dialog);
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (!(activity instanceof MoovitActivity)) {
            throw new IllegalStateException("MoovitFragment can only be used as part of a MoovitActivity");
        } else if (this.f40791b.isInstance(activity)) {
            A a = (MoovitActivity) this.f40791b.cast(activity);
            this.f40792c = a;
            a.f37307P.mo40650a(this);
        } else {
            throw new IllegalStateException(getClass() + " can only be used with a " + this.f40791b);
        }
    }

    public boolean onBackPressed() {
        return false;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C16596f a = C16596f.m42113a();
        a.mo49363b(getClass().getCanonicalName() + " onCreate(), savedState=" + bundle);
        Set<String> I1 = mo22562I1();
        C14688a aVar = new C14688a(I1, this.f40796g);
        this.f40795f = aVar;
        if (aVar.mo44597e()) {
            for (String b : I1) {
                this.f40795f.mo44594b(b);
            }
            mo46754M1();
        }
        this.f40794e = bundle;
        if (this.f40792c.f37299H) {
            mo46756Y0();
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        C15858a aVar = new C15858a(requireContext(), getTheme());
        aVar.setCanceledOnTouchOutside(isCancelable());
        return aVar;
    }

    public void onDestroy() {
        super.onDestroy();
        this.f40795f.mo44596d();
    }

    public void onDetach() {
        super.onDetach();
        this.f40792c.f37307P.mo40651b(this);
        this.f40792c = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f40795f.mo44593a()) {
            mo22563O1(view);
        }
    }

    public final void show(FragmentManager fragmentManager, String str) {
        C16596f a = C16596f.m42113a();
        a.mo49363b("MoovitDialogFragment.show(): " + str);
        try {
            super.show(fragmentManager, str);
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: v1 */
    public final boolean mo46757v1() {
        return false;
    }

    /* renamed from: y */
    public final Fragment mo46758y() {
        return this;
    }

    public final int show(C0932h0 h0Var, String str) {
        C16596f a = C16596f.m42113a();
        a.mo49363b("MoovitDialogFragment.show(): " + str);
        try {
            return super.show(h0Var, str);
        } catch (IllegalStateException unused) {
            return -1;
        }
    }
}
