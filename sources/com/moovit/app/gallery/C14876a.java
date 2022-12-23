package com.moovit.app.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.commons.view.pager.ViewPager;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p497fs.C17069b;

/* renamed from: com.moovit.app.gallery.a */
public class C14876a extends C15682c<MoovitActivity> {

    /* renamed from: u */
    public static final /* synthetic */ int f38021u = 0;

    /* renamed from: n */
    public ArrayList<GalleryImageInfo> f38022n;

    /* renamed from: o */
    public ViewPager f38023o;

    /* renamed from: p */
    public View f38024p;

    /* renamed from: q */
    public C17069b f38025q;

    /* renamed from: r */
    public boolean f38026r;

    /* renamed from: s */
    public boolean f38027s;

    /* renamed from: t */
    public final C14877a f38028t = new C14877a();

    /* renamed from: com.moovit.app.gallery.a$a */
    public class C14877a extends ViewPager.SimpleOnPageChangeListener {
        public C14877a() {
        }

        public final void onPageSelected(int i) {
            C14876a aVar = C14876a.this;
            GalleryImageInfo galleryImageInfo = aVar.f38022n.get(i);
            Fragment targetFragment = aVar.getTargetFragment();
            if (targetFragment instanceof C14878b) {
                ((C14878b) targetFragment).mo44972y(i, galleryImageInfo);
            }
            FragmentActivity activity = aVar.getActivity();
            if (activity instanceof C14878b) {
                ((C14878b) activity).mo44972y(i, galleryImageInfo);
            }
        }
    }

    /* renamed from: com.moovit.app.gallery.a$b */
    public interface C14878b {
        /* renamed from: y */
        void mo44972y(int i, GalleryImageInfo galleryImageInfo);
    }

    public C14876a() {
        super(MoovitActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.gallery_fragment, viewGroup, false);
        Bundle Q1 = mo46782Q1();
        this.f38022n = Q1.getParcelableArrayList("imageInfos");
        this.f38026r = Q1.getBoolean("showTitles");
        this.f38027s = Q1.getBoolean("showComment");
        this.f38023o = (com.moovit.commons.view.pager.ViewPager) inflate.findViewById(R.id.pager);
        C17069b bVar = new C17069b(getChildFragmentManager(), this.f38026r, this.f38027s);
        this.f38025q = bVar;
        this.f38023o.setAdapter(bVar);
        this.f38024p = inflate.findViewById(R.id.dot_indicator_group);
        C17069b bVar2 = this.f38025q;
        List<GalleryImageInfo> list = this.f38022n;
        if (list == null) {
            bVar2.getClass();
            list = Collections.emptyList();
        }
        bVar2.f44250h = list;
        bVar2.notifyDataSetChanged();
        int size = this.f38022n.size();
        View view = this.f38024p;
        if (size <= 1) {
            i = 8;
        }
        view.setVisibility(i);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        this.f38023o.addOnPageChangeListener(this.f38028t);
    }

    public final void onStop() {
        super.onStop();
        this.f38023o.removeOnPageChangeListener(this.f38028t);
    }
}
