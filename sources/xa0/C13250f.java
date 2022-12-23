package xa0;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import ua0.C13144b;

/* renamed from: xa0.f */
public final class C13250f extends C13243a {

    /* renamed from: a */
    public final String f32877a;

    /* renamed from: b */
    public final View f32878b;

    /* renamed from: c */
    public final Handler f32879c;

    /* renamed from: d */
    public final C13144b f32880d;

    /* renamed from: e */
    public final int f32881e;

    /* renamed from: f */
    public final int f32882f;

    /* renamed from: g */
    public int f32883g;

    /* renamed from: h */
    public int f32884h;

    /* renamed from: i */
    public int f32885i = -1;

    /* renamed from: j */
    public int f32886j = -1;

    /* renamed from: k */
    public C13247c f32887k;

    /* renamed from: l */
    public Bitmap f32888l = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);

    /* renamed from: m */
    public final Paint f32889m = new Paint(1);

    /* renamed from: n */
    public volatile boolean f32890n = false;

    /* renamed from: o */
    public boolean f32891o = false;

    /* renamed from: p */
    public volatile Matrix f32892p;

    /* renamed from: q */
    public ViewGroup f32893q;

    static {
        C13144b bVar = C13144b.f32650l;
        new C13144b(new C13144b.C13145a());
    }

    public C13250f(View view, Handler handler, C13144b bVar, ViewGroup viewGroup) {
        this.f32880d = bVar;
        this.f32877a = null;
        this.f32878b = view;
        this.f32879c = handler;
        this.f32893q = viewGroup;
        this.f32881e = 0;
        this.f32882f = 0;
        this.f32883g = view.getWidth();
        this.f32884h = view.getHeight();
    }
}
