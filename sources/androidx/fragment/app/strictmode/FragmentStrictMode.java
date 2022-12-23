package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import kotlin.collections.C23826d;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import p304x.C7041e;

public final class FragmentStrictMode {

    /* renamed from: a */
    public static C0968b f3849a = C0968b.f3850c;

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, mo59060d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "(Ljava/lang/String;I)V", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release"}, mo59061k = 1, mo59062mv = {1, 6, 0}, mo59064xi = 48)
    public enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    /* renamed from: androidx.fragment.app.strictmode.FragmentStrictMode$a */
    public interface C0967a {
        /* renamed from: a */
        void mo4190a();
    }

    /* renamed from: androidx.fragment.app.strictmode.FragmentStrictMode$b */
    public static final class C0968b {

        /* renamed from: c */
        public static final C0968b f3850c = new C0968b(EmptySet.f60175b, C23826d.m58530U());

        /* renamed from: a */
        public final Set<Flag> f3851a;

        /* renamed from: b */
        public final LinkedHashMap f3852b;

        public C0968b(EmptySet emptySet, Map map) {
            C24362h.m61211f(emptySet, "flags");
            this.f3851a = emptySet;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ((EmptySet) map.entrySet()).getClass();
            this.f3852b = linkedHashMap;
        }
    }

    /* renamed from: a */
    public static C0968b m2796a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                C24362h.m61210e(fragment.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            fragment = fragment.getParentFragment();
        }
        return f3849a;
    }

    /* renamed from: b */
    public static void m2797b(C0968b bVar, Violation violation) {
        Fragment a = violation.mo4191a();
        String name = a.getClass().getName();
        bVar.f3851a.contains(Flag.PENALTY_LOG);
        bVar.getClass();
        if (bVar.f3851a.contains(Flag.PENALTY_DEATH)) {
            m2800e(a, new C7041e(6, name, violation));
        }
    }

    /* renamed from: c */
    public static void m2798c(Violation violation) {
        if (FragmentManager.m2590J(3)) {
            violation.mo4191a().getClass();
        }
    }

    /* renamed from: d */
    public static final void m2799d(Fragment fragment, String str) {
        C24362h.m61211f(fragment, "fragment");
        C24362h.m61211f(str, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, str);
        m2798c(fragmentReuseViolation);
        C0968b a = m2796a(fragment);
        if (a.f3851a.contains(Flag.DETECT_FRAGMENT_REUSE) && m2801f(a, fragment.getClass(), FragmentReuseViolation.class)) {
            m2797b(a, fragmentReuseViolation);
        }
    }

    /* renamed from: e */
    public static void m2800e(Fragment fragment, Runnable runnable) {
        if (fragment.isAdded()) {
            Handler handler = fragment.getParentFragmentManager().f3643v.f3855d;
            C24362h.m61210e(handler, "fragment.parentFragmentManager.host.handler");
            if (C24362h.m61206a(handler.getLooper(), Looper.myLooper())) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        } else {
            runnable.run();
        }
    }

    /* renamed from: f */
    public static boolean m2801f(C0968b bVar, Class cls, Class cls2) {
        Set set = (Set) bVar.f3852b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (C24362h.m61206a(cls2.getSuperclass(), Violation.class) || !C23825c.m58507d0(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
