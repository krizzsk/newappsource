package com.github.clans.fab;

/* renamed from: com.github.clans.fab.e */
public final class C3808e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ FloatingActionButton f13241b;

    /* renamed from: c */
    public final /* synthetic */ boolean f13242c;

    /* renamed from: d */
    public final /* synthetic */ FloatingActionMenu f13243d;

    public C3808e(FloatingActionMenu floatingActionMenu, FloatingActionButton floatingActionButton, boolean z) {
        this.f13243d = floatingActionMenu;
        this.f13241b = floatingActionButton;
        this.f13242c = z;
    }

    public final void run() {
        FloatingActionMenu floatingActionMenu = this.f13243d;
        if (!floatingActionMenu.f13179k) {
            FloatingActionButton floatingActionButton = this.f13241b;
            if (floatingActionButton != floatingActionMenu.f13174f) {
                floatingActionButton.mo15560m(this.f13242c);
            }
            Label label = (Label) this.f13241b.getTag(C3814k.fab_label);
            if (label != null && label.f13226r) {
                if (this.f13242c && label.f13223o != null) {
                    label.f13224p.cancel();
                    label.startAnimation(label.f13223o);
                }
                label.setVisibility(0);
            }
        }
    }
}
