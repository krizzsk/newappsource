package androidx.viewpager2.adapter;

/* renamed from: androidx.viewpager2.adapter.c */
public final class C1350c implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ FragmentStateAdapter f5061b;

    public C1350c(FragmentStateAdapter fragmentStateAdapter) {
        this.f5061b = fragmentStateAdapter;
    }

    public final void run() {
        FragmentStateAdapter fragmentStateAdapter = this.f5061b;
        fragmentStateAdapter.f5042m = false;
        fragmentStateAdapter.mo5596m();
    }
}
