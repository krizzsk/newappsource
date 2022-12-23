package p497fs;

import android.os.Bundle;
import androidx.fragment.app.C0928f0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.moovit.app.gallery.GalleryImageInfo;
import java.util.Collections;
import java.util.List;

/* renamed from: fs.b */
public final class C17069b extends C0928f0 {

    /* renamed from: h */
    public List<GalleryImageInfo> f44250h = Collections.emptyList();

    /* renamed from: i */
    public boolean f44251i;

    /* renamed from: j */
    public boolean f44252j;

    public C17069b(FragmentManager fragmentManager, boolean z, boolean z2) {
        super(fragmentManager, 0);
        this.f44251i = z;
        this.f44252j = z2;
    }

    /* renamed from: a */
    public final Fragment mo4098a(int i) {
        boolean z = this.f44251i;
        boolean z2 = this.f44252j;
        int i2 = C17066a.f44238v;
        Bundle bundle = new Bundle();
        bundle.putParcelable("imageInfo", this.f44250h.get(i));
        bundle.putBoolean("showTitles", z);
        bundle.putBoolean("showMetadata", z2);
        C17066a aVar = new C17066a();
        aVar.setArguments(bundle);
        return aVar;
    }

    public final int getCount() {
        return this.f44250h.size();
    }
}
