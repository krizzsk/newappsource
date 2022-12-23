package com.moovit.app.gallery;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.gallery.C14876a;
import com.moovit.app.stopdetail.StopGalleryActivity;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.List;
import p073e7.C4584b;
import p073e7.C4585c;

public class GalleryActivity extends MoovitAppActivity implements C14876a.C14878b {

    /* renamed from: Y */
    public static final /* synthetic */ int f38010Y = 0;

    /* renamed from: U */
    public List<GalleryImageInfo> f38011U;

    /* renamed from: X */
    public int f38012X;

    /* renamed from: e2 */
    public void mo19425e2(Bundle bundle) {
        ActionBar supportActionBar;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.gallery_activity);
        this.f38011U = mo44973y2();
        if (bundle != null) {
            this.f38012X = bundle.getInt("selectedImagePosition");
        }
        setSupportActionBar((Toolbar) findViewById(R.id.tool_bar));
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.mo791m(true);
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        int i = 0;
        if (((C14876a) supportFragmentManager.mo3923A("gallery_fragment_tag")) == null) {
            List<GalleryImageInfo> list = this.f38011U;
            int i2 = C14876a.f38021u;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelableArrayList("imageInfos", C13717b.m34264k(list));
            bundle2.putBoolean("showTitles", false);
            bundle2.putBoolean("showComment", true);
            C14876a aVar = new C14876a();
            aVar.setArguments(bundle2);
            C0909a aVar2 = new C0909a(supportFragmentManager);
            aVar2.mo4041e(R.id.container, aVar, "gallery_fragment_tag", 1);
            aVar2.mo4040d();
        }
        View findViewById = findViewById(R.id.add_photo);
        if (!(this instanceof StopGalleryActivity)) {
            i = 8;
        }
        findViewById.setVisibility(i);
        findViewById.setOnClickListener(new C4585c(this, 5));
        View findViewById2 = findViewById(R.id.report_photo_action);
        findViewById2.setVisibility(8);
        findViewById2.setOnClickListener(new C4584b(this, 5));
        GalleryImageInfo galleryImageInfo = this.f38011U.get(this.f38012X);
        if (galleryImageInfo != null && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.mo801w(galleryImageInfo.f38015c);
            supportActionBar.mo799u(galleryImageInfo.f38016d);
        }
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putInt("selectedImagePosition", this.f38012X);
    }

    /* renamed from: y */
    public final void mo44972y(int i, GalleryImageInfo galleryImageInfo) {
        ActionBar supportActionBar;
        this.f38012X = i;
        if (galleryImageInfo != null && (supportActionBar = getSupportActionBar()) != null) {
            supportActionBar.mo801w(galleryImageInfo.f38015c);
            supportActionBar.mo799u(galleryImageInfo.f38016d);
        }
    }

    /* renamed from: y2 */
    public ArrayList mo44973y2() {
        return getIntent().getParcelableArrayListExtra("imageInfos");
    }

    /* renamed from: z2 */
    public void mo44974z2() {
    }
}
