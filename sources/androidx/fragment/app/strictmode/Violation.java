package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, mo59060d2 = {"Landroidx/fragment/app/strictmode/Violation;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "fragment_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public abstract class Violation extends RuntimeException {
    private final Fragment fragment;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Violation(Fragment fragment2, String str) {
        super(str);
        C24362h.m61211f(fragment2, "fragment");
        this.fragment = fragment2;
    }

    /* renamed from: a */
    public final Fragment mo4191a() {
        return this.fragment;
    }
}
