package s20;

import android.util.LruCache;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.moovit.image.model.Image;
import com.moovit.map.C16273d;
import o20.C18706l;
import s20.C19406f;
import s20.C19417l;
import s20.C19418m;

/* renamed from: s20.a */
public abstract class C19400a<GO extends C19418m<GO, O, MEZS, T, ?, GT>, O, MEZS extends C16273d, T extends C18706l<?, MEZS>, GIL extends C19406f<GO, O, MEZS, T, GT>, GT extends C19417l<T, O, MEZS>> extends C19418m<GO, O, MEZS, T, GIL, GT> {

    /* renamed from: d */
    public final LruCache<Image, BitmapDescriptor> f49356d = new LruCache<>(200);
}
