package p497fs;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bumptech.glide.C2116c;
import com.bumptech.glide.load.engine.GlideException;
import com.github.chrisbanes.photoview.PhotoView;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.app.gallery.GalleryImageInfo;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import p111h9.C5158f;
import p260t6.C6601f;
import p273u6.C6720j;
import p977zz.C20964s0;
import r10.C19221e;

/* renamed from: fs.a */
public class C17066a extends C15682c<MoovitActivity> {

    /* renamed from: v */
    public static final /* synthetic */ int f44238v = 0;

    /* renamed from: n */
    public GalleryImageInfo f44239n;

    /* renamed from: o */
    public boolean f44240o;

    /* renamed from: p */
    public boolean f44241p;

    /* renamed from: q */
    public PhotoView f44242q;

    /* renamed from: r */
    public ProgressBar f44243r;

    /* renamed from: s */
    public ListItemView f44244s;

    /* renamed from: t */
    public TextView f44245t;

    /* renamed from: u */
    public final C17067a f44246u = new C17067a();

    /* renamed from: fs.a$a */
    public class C17067a implements C6601f<Drawable> {
        public C17067a() {
        }

        /* renamed from: f */
        public final boolean mo22747f(GlideException glideException, Object obj) {
            C17066a aVar = C17066a.this;
            aVar.f44243r.setVisibility(8);
            UiUtils.m40238F(0, aVar.f44242q, aVar.f44245t);
            C17066a aVar2 = C17066a.this;
            aVar2.f44242q.setImageResource(R.drawable.img_photo_120);
            aVar2.f44242q.setEnabled(false);
            return true;
        }

        /* renamed from: g */
        public final void mo22748g(Object obj, Object obj2, C6720j jVar) {
            Drawable drawable = (Drawable) obj;
            C17066a aVar = C17066a.this;
            aVar.f44243r.setVisibility(8);
            UiUtils.m40238F(0, aVar.f44242q, aVar.f44245t);
        }
    }

    /* renamed from: fs.a$b */
    public class C17068b implements C5158f {

        /* renamed from: a */
        public boolean f44248a = false;

        public C17068b() {
        }
    }

    public C17066a() {
        super(MoovitActivity.class);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.gallery_image_fragment, viewGroup, false);
        Bundle Q1 = mo46782Q1();
        this.f44239n = (GalleryImageInfo) Q1.getParcelable("imageInfo");
        this.f44240o = Q1.getBoolean("showTitles");
        this.f44241p = Q1.getBoolean("showMetadata");
        this.f44242q = (PhotoView) inflate.findViewById(R.id.image);
        this.f44245t = (TextView) inflate.findViewById(R.id.metadata);
        this.f44244s = (ListItemView) inflate.findViewById(R.id.titles);
        this.f44243r = (ProgressBar) inflate.findViewById(R.id.progress);
        if (this.f44240o) {
            this.f44244s.setTitle((CharSequence) this.f44239n.f38015c);
            this.f44244s.setSubtitle((CharSequence) this.f44239n.f38016d);
            this.f44244s.setVisibility(0);
        }
        if (this.f44241p) {
            String string = getString(R.string.string_list_delimiter_dot);
            GalleryImageInfo galleryImageInfo = this.f44239n;
            String str2 = galleryImageInfo.f38017e;
            long j = galleryImageInfo.f38020h;
            if (j > 0) {
                str = C7925b.m18022j(this.f40822c, j);
            } else {
                str = null;
            }
            CharSequence q = C20964s0.m49099q(string, str2, str);
            if (!C20964s0.m49090h(q)) {
                this.f44245t.setText(q);
                this.f44245t.setVisibility(0);
            } else {
                this.f44245t.setVisibility(8);
            }
        }
        this.f44243r.setVisibility(0);
        UiUtils.m40238F(4, this.f44242q, this.f44245t);
        ((C19221e) C2116c.m5521c(getContext()).mo22194g(this)).mo10880p(this.f44239n.f38014b).mo10851U(this.f44246u).mo10864f0(0.2f).mo10850T(this.f44242q);
        return inflate;
    }

    public final void onStart() {
        super.onStart();
        this.f44242q.setOnScaleChangeListener(new C17068b());
    }

    public final void onStop() {
        super.onStop();
        this.f44242q.setOnScaleChangeListener((C5158f) null);
    }
}
