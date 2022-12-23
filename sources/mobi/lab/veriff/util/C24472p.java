package mobi.lab.veriff.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import bf0.C21050d;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.veriff.sdk.detector.Point;
import com.veriff.sdk.detector.Rectangle;
import com.veriff.sdk.internal.C22700xq;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import lf0.C24236l;
import mf0.C24362h;
import p068e2.C4524a;
import p583jk.C17875h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001aM\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u0012\u001a\u0004\u0018\u00010\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0007\u001a \u0010\u001b\u001a\u00020\u0003*\u00020\u00142\u0014\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0012\u0004\u0012\u00020\u00030\u0018\"\u0014\u0010\u001d\u001a\u00020\u001c8\u0002XT¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\"\u0014\u0010\u001f\u001a\u00020\u001c8\u0002XT¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e\"\u0014\u0010 \u001a\u00020\u001c8\u0002XT¢\u0006\u0006\n\u0004\b \u0010\u001e\"\u0014\u0010!\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020\u001c8\u0002XT¢\u0006\u0006\n\u0004\b#\u0010\u001e\"\u0014\u0010$\u001a\u00020\u001c8\u0002XT¢\u0006\u0006\n\u0004\b$\u0010\u001e\"\u0014\u0010%\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b%\u0010\"¨\u0006&"}, mo59060d2 = {"Landroid/widget/ImageView;", "Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;", "resourcesProvider", "Lbf0/d;", "fadeOut", "", "axis", "", "animDuration", "Landroid/graphics/drawable/Drawable;", "startImage", "endImage", "", "maxFlips", "Landroid/animation/AnimatorSet;", "flip", "(Landroid/widget/ImageView;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;Ljava/lang/String;JLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)Landroid/animation/AnimatorSet;", "duration", "flipY180", "(Landroid/widget/ImageView;Lmobi/lab/veriff/util/resourcesHelper/VeriffResourcesProvider;JLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)Landroid/animation/AnimatorSet;", "Landroid/view/View;", "other", "Lcom/veriff/sdk/detector/Rectangle;", "relativePositionTo", "Lkotlin/Function1;", "Landroid/graphics/PointF;", "listener", "setLocationClickListener", "", "ALPHA_INVISIBLE", "F", "ALPHA_VISIBLE", "ANIM_CAMERA_DISTANCE", "FADE_DURATION", "J", "FLIP_END", "FLIP_START", "ILLUSTRATION_FADE_DURATION", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: mobi.lab.veriff.util.p */
public final class C24472p {

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b¸\u0006\u0000"}, mo59060d2 = {"mobi/lab/veriff/util/ViewExtensionsKt$fadeOut$fadeOut$1$1", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "Lbf0/d;", "onAnimationRepeat", "onAnimationEnd", "onAnimationStart", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.util.p$a */
    public static final class C24473a implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ ImageView f61939a;

        public C24473a(ImageView imageView) {
            this.f61939a = imageView;
        }

        public void onAnimationEnd(Animation animation) {
            this.f61939a.setVisibility(8);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006¸\u0006\u0000"}, mo59060d2 = {"mobi/lab/veriff/util/ViewExtensionsKt$flip$3$1", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "Lbf0/d;", "onAnimationEnd", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.util.p$b */
    public static final class C24474b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ImageView f61940a;

        /* renamed from: d */
        public final /* synthetic */ Ref$IntRef f61941d;

        /* renamed from: e */
        public final /* synthetic */ Integer f61942e;

        /* renamed from: f */
        public final /* synthetic */ Drawable f61943f;

        /* renamed from: g */
        public final /* synthetic */ AnimatorSet f61944g;

        public C24474b(ImageView imageView, ObjectAnimator objectAnimator, ObjectAnimator objectAnimator2, Ref$IntRef ref$IntRef, Integer num, Drawable drawable, AnimatorSet animatorSet) {
            this.f61940a = imageView;
            this.f61941d = ref$IntRef;
            this.f61942e = num;
            this.f61943f = drawable;
            this.f61944g = animatorSet;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f61940a.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(500).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable(this) {

                /* renamed from: a */
                public final /* synthetic */ C24474b f61945a;

                {
                    this.f61945a = r1;
                }

                public final void run() {
                    C24474b bVar = this.f61945a;
                    Ref$IntRef ref$IntRef = bVar.f61941d;
                    int i = ref$IntRef.element + 1;
                    ref$IntRef.element = i;
                    Integer num = bVar.f61942e;
                    if (num == null || i < num.intValue()) {
                        this.f61945a.f61940a.setRotationY(BitmapDescriptorFactory.HUE_RED);
                        C24474b bVar2 = this.f61945a;
                        bVar2.f61940a.setImageDrawable(bVar2.f61943f);
                        this.f61945a.f61940a.animate().alpha(1.0f).setDuration(500).setInterpolator(new LinearInterpolator()).withEndAction(new Runnable(this) {

                            /* renamed from: a */
                            public final /* synthetic */ C244751 f61946a;

                            {
                                this.f61946a = r1;
                            }

                            public final void run() {
                                this.f61946a.f61945a.f61944g.start();
                            }
                        });
                    }
                }
            });
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0006"}, mo59060d2 = {"mobi/lab/veriff/util/ViewExtensionsKt$flip$1", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "Lbf0/d;", "onAnimationEnd", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.util.p$c */
    public static final class C24477c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ImageView f61947a;

        /* renamed from: b */
        public final /* synthetic */ Drawable f61948b;

        public C24477c(ImageView imageView, Drawable drawable) {
            this.f61947a = imageView;
            this.f61948b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f61947a.setImageDrawable(this.f61948b);
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "it", "Lbf0/d;", "onClick", "(Landroid/view/View;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.util.p$d */
    public static final class C24478d implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ C24236l f61949a;

        /* renamed from: b */
        public final /* synthetic */ Ref$ObjectRef f61950b;

        public C24478d(C24236l lVar, Ref$ObjectRef ref$ObjectRef) {
            this.f61949a = lVar;
            this.f61950b = ref$ObjectRef;
        }

        public final void onClick(View view) {
            this.f61949a.invoke((PointF) this.f61950b.element);
            this.f61950b.element = null;
        }
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, mo59060d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: mobi.lab.veriff.util.p$e */
    public static final class C24479e implements View.OnTouchListener {

        /* renamed from: a */
        public final /* synthetic */ View f61951a;

        /* renamed from: b */
        public final /* synthetic */ Ref$LongRef f61952b;

        /* renamed from: c */
        public final /* synthetic */ int f61953c;

        /* renamed from: d */
        public final /* synthetic */ Ref$ObjectRef f61954d;

        public C24479e(View view, Ref$LongRef ref$LongRef, int i, Ref$ObjectRef ref$ObjectRef) {
            this.f61951a = view;
            this.f61952b = ref$LongRef;
            this.f61953c = i;
            this.f61954d = ref$ObjectRef;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C24362h.m61210e(motionEvent, "event");
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f61952b.element = System.currentTimeMillis();
                return true;
            } else if (action != 1) {
                return false;
            } else {
                if (System.currentTimeMillis() - this.f61952b.element < ((long) this.f61953c)) {
                    Ref$ObjectRef ref$ObjectRef = this.f61954d;
                    float x = motionEvent.getX();
                    C24362h.m61210e(view, "v");
                    ref$ObjectRef.element = new PointF(x - ((float) view.getLeft()), motionEvent.getY() - ((float) view.getTop()));
                }
                this.f61951a.performClick();
                return true;
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ AnimatorSet m61575a(ImageView imageView, C22700xq xqVar, long j, Drawable drawable, Drawable drawable2, Integer num, int i, Object obj) {
        if ((i & 16) != 0) {
            num = null;
        }
        return m61574a(imageView, xqVar, j, drawable, drawable2, num);
    }

    /* renamed from: a */
    public static final AnimatorSet m61574a(ImageView imageView, C22700xq xqVar, long j, Drawable drawable, Drawable drawable2, Integer num) {
        C24362h.m61211f(imageView, "$this$flipY180");
        C24362h.m61211f(xqVar, "resourcesProvider");
        return m61576a(imageView, xqVar, "rotationY", j, drawable, drawable2, num);
    }

    /* renamed from: a */
    public static final void m61578a(View view, C24236l<? super PointF, C21050d> lVar) {
        C24362h.m61211f(view, "$this$setLocationClickListener");
        C24362h.m61211f(lVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        int longPressTimeout = ViewConfiguration.getLongPressTimeout();
        Ref$LongRef ref$LongRef = new Ref$LongRef();
        ref$LongRef.element = Long.MIN_VALUE;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = null;
        view.setOnClickListener(new C24478d(lVar, ref$ObjectRef));
        view.setOnTouchListener(new C24479e(view, ref$LongRef, longPressTimeout, ref$ObjectRef));
    }

    /* renamed from: a */
    private static final AnimatorSet m61576a(ImageView imageView, C22700xq xqVar, String str, long j, Drawable drawable, Drawable drawable2, Integer num) {
        ImageView imageView2 = imageView;
        String str2 = str;
        Drawable drawable3 = drawable2;
        Drawable drawable4 = imageView.getDrawable();
        C24362h.m61210e(drawable4, "drawable");
        imageView.setCameraDistance(((float) drawable4.getIntrinsicWidth()) * 20.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, str, new float[]{BitmapDescriptorFactory.HUE_RED, 90.0f});
        ofFloat.addListener(new C24477c(imageView, drawable3));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView, str, new float[]{90.0f, 180.0f});
        for (ObjectAnimator objectAnimator : C17875h.m44281E(ofFloat, ofFloat2)) {
            objectAnimator.setDuration(j / ((long) 2));
            objectAnimator.setRepeatCount(0);
        }
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 0;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.play(ofFloat).before(ofFloat2);
        animatorSet.addListener(new C24474b(imageView, ofFloat, ofFloat2, ref$IntRef, num, drawable, animatorSet));
        if (xqVar.mo57114a()) {
            imageView.setImageDrawable(drawable3);
            return null;
        }
        animatorSet.start();
        return animatorSet;
    }

    /* renamed from: a */
    public static final void m61579a(ImageView imageView, C22700xq xqVar) {
        C24362h.m61211f(imageView, "$this$fadeOut");
        C24362h.m61211f(xqVar, "resourcesProvider");
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, BitmapDescriptorFactory.HUE_RED);
        alphaAnimation.setDuration(200);
        alphaAnimation.setAnimationListener(new C24473a(imageView));
        alphaAnimation.setInterpolator(new C4524a());
        if (xqVar.mo57114a()) {
            imageView.setVisibility(8);
        } else {
            imageView.startAnimation(alphaAnimation);
        }
    }

    /* renamed from: a */
    public static final Rectangle m61577a(View view, View view2) {
        C24362h.m61211f(view, "$this$relativePositionTo");
        C24362h.m61211f(view2, InneractiveMediationNameConsts.OTHER);
        if (view.getWidth() == 0 || view.getHeight() == 0 || view2.getWidth() == 0 || view2.getHeight() == 0) {
            return null;
        }
        float width = (float) view2.getWidth();
        float height = (float) view2.getHeight();
        return new Rectangle(new Point(((float) (view.getLeft() - view2.getLeft())) / width, ((float) (view.getTop() - view2.getTop())) / height), new Point(((float) (view.getRight() - view2.getLeft())) / width, ((float) (view.getBottom() - view2.getTop())) / height));
    }
}
