package p907xc;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.C14071j;
import p811tc.C19647f;
import p811tc.C19648g;
import p811tc.C19651h;
import p811tc.C19654k;

/* renamed from: xc.a */
public final class C20455a extends C19648g implements C14071j.C14073b {

    /* renamed from: A */
    public final Context f51809A;

    /* renamed from: B */
    public final Paint.FontMetrics f51810B = new Paint.FontMetrics();

    /* renamed from: C */
    public final C14071j f51811C;

    /* renamed from: D */
    public final C20456a f51812D;

    /* renamed from: E */
    public final Rect f51813E;

    /* renamed from: F */
    public int f51814F;

    /* renamed from: G */
    public int f51815G;

    /* renamed from: H */
    public int f51816H;

    /* renamed from: I */
    public int f51817I;

    /* renamed from: J */
    public int f51818J;

    /* renamed from: K */
    public int f51819K;

    /* renamed from: L */
    public float f51820L;

    /* renamed from: M */
    public float f51821M;

    /* renamed from: N */
    public float f51822N;

    /* renamed from: O */
    public float f51823O;

    /* renamed from: z */
    public CharSequence f51824z;

    /* renamed from: xc.a$a */
    public class C20456a implements View.OnLayoutChangeListener {
        public C20456a() {
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C20455a aVar = C20455a.this;
            aVar.getClass();
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            aVar.f51819K = iArr[0];
            view.getWindowVisibleDisplayFrame(aVar.f51813E);
        }
    }

    public C20455a(Context context, int i) {
        super(context, (AttributeSet) null, 0, i);
        C14071j jVar = new C14071j(this);
        this.f51811C = jVar;
        this.f51812D = new C20456a();
        this.f51813E = new Rect();
        this.f51820L = 1.0f;
        this.f51821M = 1.0f;
        this.f51822N = 0.5f;
        this.f51823O = 1.0f;
        this.f51809A = context;
        jVar.f35097a.density = context.getResources().getDisplayMetrics().density;
        jVar.f35097a.setTextAlign(Paint.Align.CENTER);
    }

    /* renamed from: a */
    public final void mo40982a() {
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        canvas.save();
        float w = mo52646w();
        double sqrt = Math.sqrt(2.0d);
        canvas.scale(this.f51820L, this.f51821M, (((float) getBounds().width()) * 0.5f) + ((float) getBounds().left), (((float) getBounds().height()) * this.f51822N) + ((float) getBounds().top));
        canvas.translate(w, (float) (-((sqrt * ((double) this.f51818J)) - ((double) this.f51818J))));
        super.draw(canvas);
        if (this.f51824z != null) {
            Rect bounds = getBounds();
            this.f51811C.f35097a.getFontMetrics(this.f51810B);
            Paint.FontMetrics fontMetrics = this.f51810B;
            int centerY = (int) (((float) bounds.centerY()) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f));
            C14071j jVar = this.f51811C;
            if (jVar.f35102f != null) {
                jVar.f35097a.drawableState = getState();
                C14071j jVar2 = this.f51811C;
                jVar2.f35102f.mo51531e(this.f51809A, jVar2.f35097a, jVar2.f35098b);
                this.f51811C.f35097a.setAlpha((int) (this.f51823O * 255.0f));
            }
            CharSequence charSequence = this.f51824z;
            canvas.drawText(charSequence, 0, charSequence.length(), (float) bounds.centerX(), (float) centerY, this.f51811C.f35097a);
        }
        canvas.restore();
    }

    public final int getIntrinsicHeight() {
        return (int) Math.max(this.f51811C.f35097a.getTextSize(), (float) this.f51816H);
    }

    public final int getIntrinsicWidth() {
        float f;
        float f2 = (float) (this.f51814F * 2);
        CharSequence charSequence = this.f51824z;
        if (charSequence == null) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = this.f51811C.mo41882a(charSequence.toString());
        }
        return (int) Math.max(f2 + f, (float) this.f51815G);
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        C19654k kVar = this.f49837b.f49861a;
        kVar.getClass();
        C19654k.C19655a aVar = new C19654k.C19655a(kVar);
        aVar.f49909k = mo52647x();
        setShapeAppearanceModel(new C19654k(aVar));
    }

    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    /* renamed from: w */
    public final float mo52646w() {
        int i;
        if (((this.f51813E.right - getBounds().right) - this.f51819K) - this.f51817I < 0) {
            i = ((this.f51813E.right - getBounds().right) - this.f51819K) - this.f51817I;
        } else if (((this.f51813E.left - getBounds().left) - this.f51819K) + this.f51817I <= 0) {
            return BitmapDescriptorFactory.HUE_RED;
        } else {
            i = ((this.f51813E.left - getBounds().left) - this.f51819K) + this.f51817I;
        }
        return (float) i;
    }

    /* renamed from: x */
    public final C19651h mo52647x() {
        float width = ((float) (((double) getBounds().width()) - (Math.sqrt(2.0d) * ((double) this.f51818J)))) / 2.0f;
        return new C19651h(new C19647f((float) this.f51818J), Math.min(Math.max(-mo52646w(), -width), width));
    }
}
