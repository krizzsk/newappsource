package com.moovit.image;

import android.os.Bundle;
import com.moovit.MoovitActivity;
import java.io.File;
import p112ha.C5182f0;

/* renamed from: com.moovit.image.c */
public class C16017c extends ImageProviderFragment<MoovitActivity> {

    /* renamed from: p */
    public static final /* synthetic */ int f41713p = 0;

    /* renamed from: com.moovit.image.c$a */
    public interface C16018a {
        /* renamed from: g */
        void mo21527g(Bundle bundle);

        /* renamed from: j0 */
        void mo21528j0(Bundle bundle, Exception exc);

        /* renamed from: s1 */
        void mo21532s1(File file, boolean z, Bundle bundle);
    }

    public C16017c() {
        super(MoovitActivity.class);
    }

    /* renamed from: g */
    public final void mo48175g(Bundle bundle) {
        this.f41702n = null;
        mo46786U1(C16018a.class, new C16015a(bundle));
    }

    /* renamed from: j0 */
    public final void mo48176j0(Bundle bundle, Exception exc) {
        this.f41702n = null;
        mo46786U1(C16018a.class, new C5182f0(2, exc, bundle));
    }

    /* renamed from: s1 */
    public final void mo47928s1(File file, boolean z, Bundle bundle) {
        this.f41702n = null;
        mo46786U1(C16018a.class, new C16016b(file, z, bundle));
    }
}
