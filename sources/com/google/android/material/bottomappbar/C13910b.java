package com.google.android.material.bottomappbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* renamed from: com.google.android.material.bottomappbar.b */
public final class C13910b extends FloatingActionButton.C14020a {

    /* renamed from: a */
    public final /* synthetic */ int f34334a;

    /* renamed from: b */
    public final /* synthetic */ BottomAppBar f34335b;

    /* renamed from: com.google.android.material.bottomappbar.b$a */
    public class C13911a extends FloatingActionButton.C14020a {
        public C13911a() {
        }

        /* renamed from: b */
        public final void mo41041b() {
            BottomAppBar bottomAppBar = C13910b.this.f34335b;
            int i = BottomAppBar.f34297C0;
            bottomAppBar.getClass();
        }
    }

    public C13910b(BottomAppBar bottomAppBar, int i) {
        this.f34335b = bottomAppBar;
        this.f34334a = i;
    }

    /* renamed from: a */
    public final void mo41040a(FloatingActionButton floatingActionButton) {
        BottomAppBar bottomAppBar = this.f34335b;
        int i = this.f34334a;
        int i2 = BottomAppBar.f34297C0;
        floatingActionButton.setTranslationX(bottomAppBar.mo41002A(i));
        floatingActionButton.mo41677n(new C13911a(), true);
    }
}
