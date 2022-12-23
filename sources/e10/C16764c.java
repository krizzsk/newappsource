package e10;

import android.net.Uri;
import android.widget.Toast;
import ce0.C21100e;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.gallery.C15878a;
import com.moovit.gallery.EmbeddedGalleryFragment;
import com.moovit.gallery.EmbeddedGalleryImage;
import p054d0.C4267a0;
import p543hq.C17474b;
import p824tp.C19746x;

/* renamed from: e10.c */
public final /* synthetic */ class C16764c implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ EmbeddedGalleryFragment f43637b;

    /* renamed from: c */
    public final /* synthetic */ EmbeddedGalleryImage f43638c;

    /* renamed from: d */
    public final /* synthetic */ int f43639d;

    /* renamed from: e */
    public final /* synthetic */ String f43640e;

    public /* synthetic */ C16764c(EmbeddedGalleryFragment embeddedGalleryFragment, EmbeddedGalleryImage embeddedGalleryImage, int i, String str) {
        this.f43637b = embeddedGalleryFragment;
        this.f43638c = embeddedGalleryImage;
        this.f43639d = i;
        this.f43640e = str;
    }

    public final void onComplete(Task task) {
        boolean z;
        EmbeddedGalleryFragment embeddedGalleryFragment = this.f43637b;
        EmbeddedGalleryImage embeddedGalleryImage = this.f43638c;
        int i = this.f43639d;
        String str = this.f43640e;
        int i2 = EmbeddedGalleryFragment.f41475r;
        if (!embeddedGalleryFragment.f40825f) {
            if (!task.isSuccessful() || !Boolean.TRUE.equals(task.getResult())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                embeddedGalleryFragment.f41477q.add(embeddedGalleryImage);
                C15878a aVar = embeddedGalleryFragment.f41476p;
                Uri parse = Uri.parse(str);
                C21100e.m49373x(parse, "image");
                aVar.f41482h.set(i, new C15878a.C15880b(parse, 3));
                aVar.notifyItemChanged(i);
            } else {
                C15878a aVar2 = embeddedGalleryFragment.f41476p;
                aVar2.f41482h.remove(i);
                aVar2.notifyDataSetChanged();
                if (embeddedGalleryFragment.f40824e) {
                    Toast.makeText(embeddedGalleryFragment.requireContext(), embeddedGalleryFragment.getString(C19746x.general_error_title), 0).show();
                }
            }
            C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.TASK_COMPLETED);
            aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "photo_added");
            aVar3.mo49941i(AnalyticsAttributeKey.SUCCESS, z);
            embeddedGalleryFragment.mo46797j2(aVar3.mo49933a());
            embeddedGalleryFragment.mo46786U1(EmbeddedGalleryFragment.C15875a.class, new C4267a0(str, 10));
        }
    }
}
