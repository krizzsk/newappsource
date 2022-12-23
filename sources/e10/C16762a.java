package e10;

import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.gallery.C15878a;
import com.moovit.gallery.EmbeddedGalleryFragment;
import com.moovit.gallery.EmbeddedGalleryImage;
import p543hq.C17474b;
import p824tp.C19746x;

/* renamed from: e10.a */
public final /* synthetic */ class C16762a implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ EmbeddedGalleryFragment f43632b;

    /* renamed from: c */
    public final /* synthetic */ EmbeddedGalleryImage f43633c;

    /* renamed from: d */
    public final /* synthetic */ int f43634d;

    /* renamed from: e */
    public final /* synthetic */ int f43635e;

    public /* synthetic */ C16762a(EmbeddedGalleryFragment embeddedGalleryFragment, EmbeddedGalleryImage embeddedGalleryImage, int i, int i2) {
        this.f43632b = embeddedGalleryFragment;
        this.f43633c = embeddedGalleryImage;
        this.f43634d = i;
        this.f43635e = i2;
    }

    public final void onComplete(Task task) {
        boolean z;
        EmbeddedGalleryFragment embeddedGalleryFragment = this.f43632b;
        EmbeddedGalleryImage embeddedGalleryImage = this.f43633c;
        int i = this.f43634d;
        int i2 = this.f43635e;
        int i3 = EmbeddedGalleryFragment.f41475r;
        if (!embeddedGalleryFragment.f40825f) {
            if (!task.isSuccessful() || !Boolean.TRUE.equals(task.getResult())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                embeddedGalleryFragment.f41477q.remove(embeddedGalleryImage);
                C15878a aVar = embeddedGalleryFragment.f41476p;
                aVar.f41482h.remove(i);
                aVar.notifyDataSetChanged();
            } else if (embeddedGalleryFragment.f40824e) {
                Toast.makeText(embeddedGalleryFragment.requireContext(), embeddedGalleryFragment.getString(C19746x.general_error_title), 0).show();
            }
            C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.TASK_COMPLETED);
            aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "photo_deleted");
            aVar2.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
            embeddedGalleryFragment.mo46797j2(aVar2.mo49933a());
            embeddedGalleryFragment.mo46786U1(EmbeddedGalleryFragment.C15875a.class, new C16763b(embeddedGalleryImage, i2));
        }
    }
}
