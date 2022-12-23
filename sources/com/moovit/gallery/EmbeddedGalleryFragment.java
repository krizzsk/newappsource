package com.moovit.gallery;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13720d;
import c00.C13722f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.gallery.C15878a;
import com.moovit.image.ImageProviderFragment;
import com.moovit.location.C16202a;
import e10.C16762a;
import e10.C16764c;
import java.io.File;
import java.util.ArrayList;
import k00.C17992e;
import o00.C18665b;
import o00.C18669f;
import o00.C18670g;
import p543hq.C17474b;
import p824tp.C19738p;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19748z;
import p858uz.C20061g;
import p900wt.C20415e;

public class EmbeddedGalleryFragment extends ImageProviderFragment<MoovitActivity> implements C15878a.C15881c {

    /* renamed from: r */
    public static final /* synthetic */ int f41475r = 0;

    /* renamed from: p */
    public C15878a f41476p;

    /* renamed from: q */
    public ArrayList<EmbeddedGalleryImage> f41477q = new ArrayList<>();

    /* renamed from: com.moovit.gallery.EmbeddedGalleryFragment$a */
    public interface C15875a {
        /* renamed from: O */
        void mo19478O();

        /* renamed from: R0 */
        void mo19479R0();
    }

    public EmbeddedGalleryFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(requireContext()).getPermissionAwareMedAccuracyInfrequentUpdates();
    }

    /* renamed from: o */
    public final void mo47926o(int i) {
        int i2 = i - 1;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "delete_photo_clicked");
        aVar.mo49935c(AnalyticsAttributeKey.SELECTED_INDEX, i2);
        mo46797j2(aVar.mo49933a());
        EmbeddedGalleryImage embeddedGalleryImage = this.f41477q.get(i2);
        mo44980w2(embeddedGalleryImage).addOnCompleteListener(new C16762a(this, embeddedGalleryImage, i, i2));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f41476p = new C15878a(mo46782Q1().getInt("maxImages", Integer.MAX_VALUE), this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C19742t.embedded_gallery_fragment, viewGroup, false);
        mo44981x2(bundle);
        Context context = inflate.getContext();
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C19740r.recycler);
        int i = C19738p.screen_edge;
        recyclerView.mo4593g(new C18670g(new C17992e(context, i, i)), -1);
        int i2 = C19738p.half_screen_edge;
        recyclerView.mo4593g(new C18665b(new C17992e(context, i2, i2)), -1);
        recyclerView.mo4593g(new C18669f(new C17992e(context, i, i)), -1);
        recyclerView.setAdapter(this.f41476p);
        return inflate;
    }

    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(context, attributeSet, bundle);
        TypedArray n = UiUtils.m40255n(context, attributeSet, C19748z.EmbeddedGalleryFragment);
        try {
            int integer = n.getInteger(C19748z.EmbeddedGalleryFragment_maxImages, Integer.MAX_VALUE);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("maxImages", integer);
            setArguments(bundle2);
        } finally {
            n.recycle();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArrayList("images", this.f41477q);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ArrayList arrayList = new ArrayList(this.f41477q.size() + 1);
        arrayList.add(new C15878a.C15880b((Uri) null, 1));
        C13720d.m34276f(this.f41477q, (C13722f) null, new C20415e(7), arrayList);
        C15878a aVar = this.f41476p;
        aVar.f41482h.clear();
        aVar.f41482h.ensureCapacity(arrayList.size());
        aVar.f41482h.addAll(arrayList);
        aVar.notifyDataSetChanged();
    }

    /* renamed from: s0 */
    public final void mo47927s0() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "take_photo_clicked");
        mo46797j2(aVar.mo49933a());
        mo48181u2(true, true, (Bundle) null);
    }

    /* renamed from: s1 */
    public final void mo47928s1(File file, boolean z, Bundle bundle) {
        LatLonE6 latLonE6;
        this.f41702n = null;
        String path = file.getPath();
        if (z) {
            latLonE6 = LatLonE6.m40177j(mo46780O1());
        } else {
            latLonE6 = null;
        }
        EmbeddedGalleryImage embeddedGalleryImage = new EmbeddedGalleryImage(path, latLonE6);
        C15878a aVar = this.f41476p;
        aVar.f41482h.add(new C15878a.C15880b((Uri) null, 2));
        aVar.notifyDataSetChanged();
        mo44979v2(embeddedGalleryImage).addOnCompleteListener(new C16764c(this, embeddedGalleryImage, aVar.f41482h.size() - 1, path));
    }

    /* renamed from: v2 */
    public Task<Boolean> mo44979v2(EmbeddedGalleryImage embeddedGalleryImage) {
        return Tasks.forResult(Boolean.TRUE);
    }

    /* renamed from: w2 */
    public Task<Boolean> mo44980w2(EmbeddedGalleryImage embeddedGalleryImage) {
        return Tasks.forResult(Boolean.TRUE);
    }

    /* renamed from: x2 */
    public void mo44981x2(Bundle bundle) {
        ArrayList<EmbeddedGalleryImage> parcelableArrayList;
        if (bundle != null && (parcelableArrayList = bundle.getParcelableArrayList("images")) != null) {
            this.f41477q = parcelableArrayList;
        }
    }
}
