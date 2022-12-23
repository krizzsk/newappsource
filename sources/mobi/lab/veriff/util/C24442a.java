package mobi.lab.veriff.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import bf0.C21050d;
import com.veriff.sdk.internal.C22700xq;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import lf0.C24225a;
import mf0.C24362h;
import p116i1.C5247f;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aX\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¨\u0006\u0010"}, mo59060d2 = {"Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "resourcesProvider", "Landroid/widget/ImageView;", "illustration", "", "duration", "", "maxFlips", "startImage", "endImage", "illustrationFlip", "Lkotlin/Function0;", "Lbf0/d;", "done", "Landroid/animation/AnimatorSet;", "animateIllustration", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: mobi.lab.veriff.util.a */
public final class C24442a {

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "invoke", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.util.a$a */
    public static final class C24443a extends Lambda implements C24225a<C21050d> {

        /* renamed from: a */
        public static final C24443a f61870a = new C24443a();

        public C24443a() {
            super(0);
        }

        /* renamed from: a */
        public final void mo60657a() {
        }

        public /* synthetic */ Object invoke() {
            mo60657a();
            return C21050d.f52856a;
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lbf0/d;", "run", "()V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.util.a$b */
    public static final class C24444b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Ref$ObjectRef f61871a;

        /* renamed from: b */
        public final /* synthetic */ ImageView f61872b;

        /* renamed from: c */
        public final /* synthetic */ C22700xq f61873c;

        /* renamed from: d */
        public final /* synthetic */ long f61874d;

        /* renamed from: e */
        public final /* synthetic */ int f61875e;

        /* renamed from: f */
        public final /* synthetic */ int f61876f;

        /* renamed from: g */
        public final /* synthetic */ int f61877g;

        /* renamed from: h */
        public final /* synthetic */ ImageView f61878h;

        /* renamed from: i */
        public final /* synthetic */ C24225a f61879i;

        public C24444b(Ref$ObjectRef ref$ObjectRef, ImageView imageView, C22700xq xqVar, long j, int i, int i2, int i3, ImageView imageView2, C24225a aVar) {
            this.f61871a = ref$ObjectRef;
            this.f61872b = imageView;
            this.f61873c = xqVar;
            this.f61874d = j;
            this.f61875e = i;
            this.f61876f = i2;
            this.f61877g = i3;
            this.f61878h = imageView2;
            this.f61879i = aVar;
        }

        public final void run() {
            Ref$ObjectRef ref$ObjectRef = this.f61871a;
            ImageView imageView = this.f61872b;
            C22700xq xqVar = this.f61873c;
            long j = this.f61874d;
            Resources resources = imageView.getResources();
            int i = this.f61875e;
            ThreadLocal<TypedValue> threadLocal = C5247f.f17365a;
            ref$ObjectRef.element = C24472p.m61574a(imageView, xqVar, j, C5247f.C5248a.m13264a(resources, i, (Resources.Theme) null), C5247f.C5248a.m13264a(this.f61872b.getResources(), this.f61876f, (Resources.Theme) null), Integer.valueOf(this.f61877g));
            if (((AnimatorSet) this.f61871a.element) != null) {
                final Ref$IntRef ref$IntRef = new Ref$IntRef();
                ref$IntRef.element = 0;
                AnimatorSet animatorSet = (AnimatorSet) this.f61871a.element;
                if (animatorSet != null) {
                    animatorSet.addListener(new AnimatorListenerAdapter(this) {

                        /* renamed from: a */
                        public final /* synthetic */ C24444b f61880a;

                        {
                            this.f61880a = r1;
                        }

                        public void onAnimationCancel(Animator animator) {
                            super.onAnimationCancel(animator);
                            C24444b bVar = this.f61880a;
                            ImageView imageView = bVar.f61878h;
                            if (imageView != null) {
                                C24472p.m61579a(imageView, bVar.f61873c);
                            }
                            this.f61880a.f61879i.invoke();
                        }

                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            Ref$IntRef ref$IntRef = ref$IntRef;
                            int i = ref$IntRef.element + 1;
                            ref$IntRef.element = i;
                            C24444b bVar = this.f61880a;
                            if (i >= bVar.f61877g) {
                                ImageView imageView = bVar.f61878h;
                                if (imageView != null) {
                                    C24472p.m61579a(imageView, bVar.f61873c);
                                }
                                this.f61880a.f61879i.invoke();
                            }
                        }
                    });
                    return;
                }
                return;
            }
            C24472p.m61579a(this.f61872b, this.f61873c);
            ImageView imageView2 = this.f61878h;
            if (imageView2 != null) {
                C24472p.m61579a(imageView2, this.f61873c);
            }
            this.f61879i.invoke();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ AnimatorSet m61487a(C22700xq xqVar, ImageView imageView, long j, int i, int i2, int i3, ImageView imageView2, C24225a aVar, int i4, Object obj) {
        int i5 = i4;
        return m61486a(xqVar, imageView, j, i, i2, (i5 & 32) != 0 ? i2 : i3, (i5 & 64) != 0 ? null : imageView2, (i5 & RecyclerView.C1119a0.FLAG_IGNORE) != 0 ? C24443a.f61870a : aVar);
    }

    /* renamed from: a */
    public static final AnimatorSet m61486a(C22700xq xqVar, ImageView imageView, long j, int i, int i2, int i3, ImageView imageView2, C24225a<C21050d> aVar) {
        ImageView imageView3 = imageView;
        ImageView imageView4 = imageView2;
        C22700xq xqVar2 = xqVar;
        C24362h.m61211f(xqVar, "resourcesProvider");
        C24362h.m61211f(imageView, "illustration");
        C24362h.m61211f(aVar, "done");
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = null;
        imageView.post(new C24444b(ref$ObjectRef, imageView, xqVar, j, i2, i3, i, imageView2, aVar));
        return (AnimatorSet) ref$ObjectRef.element;
    }
}
