package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.tranzmate.R;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.p982v1.XmlPullParserException;
import p002a1.C0041c;
import p002a1.C0042d;
import p279v0.C6821c;
import p328z0.C7376a;

/* renamed from: androidx.constraintlayout.widget.a */
public final class C0738a {

    /* renamed from: g */
    public static final int[] f3108g = {0, 4, 8};

    /* renamed from: h */
    public static SparseIntArray f3109h = new SparseIntArray();

    /* renamed from: i */
    public static SparseIntArray f3110i = new SparseIntArray();

    /* renamed from: a */
    public String f3111a;

    /* renamed from: b */
    public String f3112b = "";

    /* renamed from: c */
    public int f3113c = 0;

    /* renamed from: d */
    public HashMap<String, ConstraintAttribute> f3114d = new HashMap<>();

    /* renamed from: e */
    public boolean f3115e = true;

    /* renamed from: f */
    public HashMap<Integer, C0739a> f3116f = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.a$a */
    public static class C0739a {

        /* renamed from: a */
        public int f3117a;

        /* renamed from: b */
        public String f3118b;

        /* renamed from: c */
        public final C0743d f3119c = new C0743d();

        /* renamed from: d */
        public final C0742c f3120d = new C0742c();

        /* renamed from: e */
        public final C0741b f3121e = new C0741b();

        /* renamed from: f */
        public final C0744e f3122f = new C0744e();

        /* renamed from: g */
        public HashMap<String, ConstraintAttribute> f3123g = new HashMap<>();

        /* renamed from: h */
        public C0740a f3124h;

        /* renamed from: androidx.constraintlayout.widget.a$a$a */
        public static class C0740a {

            /* renamed from: a */
            public int[] f3125a = new int[10];

            /* renamed from: b */
            public int[] f3126b = new int[10];

            /* renamed from: c */
            public int f3127c = 0;

            /* renamed from: d */
            public int[] f3128d = new int[10];

            /* renamed from: e */
            public float[] f3129e = new float[10];

            /* renamed from: f */
            public int f3130f = 0;

            /* renamed from: g */
            public int[] f3131g = new int[5];

            /* renamed from: h */
            public String[] f3132h = new String[5];

            /* renamed from: i */
            public int f3133i = 0;

            /* renamed from: j */
            public int[] f3134j = new int[4];

            /* renamed from: k */
            public boolean[] f3135k = new boolean[4];

            /* renamed from: l */
            public int f3136l = 0;

            /* renamed from: a */
            public final void mo3249a(float f, int i) {
                int i2 = this.f3130f;
                int[] iArr = this.f3128d;
                if (i2 >= iArr.length) {
                    this.f3128d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f3129e;
                    this.f3129e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f3128d;
                int i3 = this.f3130f;
                iArr2[i3] = i;
                float[] fArr2 = this.f3129e;
                this.f3130f = i3 + 1;
                fArr2[i3] = f;
            }

            /* renamed from: b */
            public final void mo3250b(int i, int i2) {
                int i3 = this.f3127c;
                int[] iArr = this.f3125a;
                if (i3 >= iArr.length) {
                    this.f3125a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f3126b;
                    this.f3126b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f3125a;
                int i4 = this.f3127c;
                iArr3[i4] = i;
                int[] iArr4 = this.f3126b;
                this.f3127c = i4 + 1;
                iArr4[i4] = i2;
            }

            /* renamed from: c */
            public final void mo3251c(int i, String str) {
                int i2 = this.f3133i;
                int[] iArr = this.f3131g;
                if (i2 >= iArr.length) {
                    this.f3131g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f3132h;
                    this.f3132h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f3131g;
                int i3 = this.f3133i;
                iArr2[i3] = i;
                String[] strArr2 = this.f3132h;
                this.f3133i = i3 + 1;
                strArr2[i3] = str;
            }

            /* renamed from: d */
            public final void mo3252d(int i, boolean z) {
                int i2 = this.f3136l;
                int[] iArr = this.f3134j;
                if (i2 >= iArr.length) {
                    this.f3134j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f3135k;
                    this.f3135k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f3134j;
                int i3 = this.f3136l;
                iArr2[i3] = i;
                boolean[] zArr2 = this.f3135k;
                this.f3136l = i3 + 1;
                zArr2[i3] = z;
            }

            /* renamed from: e */
            public final void mo3253e(C0739a aVar) {
                for (int i = 0; i < this.f3127c; i++) {
                    int i2 = this.f3125a[i];
                    int i3 = this.f3126b[i];
                    int[] iArr = C0738a.f3108g;
                    if (i2 == 6) {
                        aVar.f3121e.f3141D = i3;
                    } else if (i2 == 7) {
                        aVar.f3121e.f3142E = i3;
                    } else if (i2 == 8) {
                        aVar.f3121e.f3148K = i3;
                    } else if (i2 == 27) {
                        aVar.f3121e.f3143F = i3;
                    } else if (i2 == 28) {
                        aVar.f3121e.f3145H = i3;
                    } else if (i2 == 41) {
                        aVar.f3121e.f3160W = i3;
                    } else if (i2 == 42) {
                        aVar.f3121e.f3161X = i3;
                    } else if (i2 == 61) {
                        aVar.f3121e.f3138A = i3;
                    } else if (i2 == 62) {
                        aVar.f3121e.f3139B = i3;
                    } else if (i2 == 72) {
                        aVar.f3121e.f3177g0 = i3;
                    } else if (i2 == 73) {
                        aVar.f3121e.f3179h0 = i3;
                    } else if (i2 == 88) {
                        aVar.f3120d.f3218l = i3;
                    } else if (i2 == 89) {
                        aVar.f3120d.f3219m = i3;
                    } else if (i2 == 2) {
                        aVar.f3121e.f3147J = i3;
                    } else if (i2 == 31) {
                        aVar.f3121e.f3149L = i3;
                    } else if (i2 == 34) {
                        aVar.f3121e.f3146I = i3;
                    } else if (i2 == 38) {
                        aVar.f3117a = i3;
                    } else if (i2 == 64) {
                        aVar.f3120d.f3208b = i3;
                    } else if (i2 == 66) {
                        aVar.f3120d.f3212f = i3;
                    } else if (i2 == 76) {
                        aVar.f3120d.f3211e = i3;
                    } else if (i2 == 78) {
                        aVar.f3119c.f3222c = i3;
                    } else if (i2 == 97) {
                        aVar.f3121e.f3195p0 = i3;
                    } else if (i2 == 93) {
                        aVar.f3121e.f3150M = i3;
                    } else if (i2 != 94) {
                        switch (i2) {
                            case 11:
                                aVar.f3121e.f3154Q = i3;
                                break;
                            case 12:
                                aVar.f3121e.f3155R = i3;
                                break;
                            case 13:
                                aVar.f3121e.f3151N = i3;
                                break;
                            case 14:
                                aVar.f3121e.f3153P = i3;
                                break;
                            case 15:
                                aVar.f3121e.f3156S = i3;
                                break;
                            case 16:
                                aVar.f3121e.f3152O = i3;
                                break;
                            case 17:
                                aVar.f3121e.f3172e = i3;
                                break;
                            case 18:
                                aVar.f3121e.f3174f = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 21:
                                        aVar.f3121e.f3170d = i3;
                                        break;
                                    case 22:
                                        aVar.f3119c.f3221b = i3;
                                        break;
                                    case 23:
                                        aVar.f3121e.f3168c = i3;
                                        break;
                                    case 24:
                                        aVar.f3121e.f3144G = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 54:
                                                aVar.f3121e.f3162Y = i3;
                                                break;
                                            case 55:
                                                aVar.f3121e.f3163Z = i3;
                                                break;
                                            case 56:
                                                aVar.f3121e.f3165a0 = i3;
                                                break;
                                            case 57:
                                                aVar.f3121e.f3167b0 = i3;
                                                break;
                                            case 58:
                                                aVar.f3121e.f3169c0 = i3;
                                                break;
                                            case 59:
                                                aVar.f3121e.f3171d0 = i3;
                                                break;
                                            default:
                                                switch (i2) {
                                                    case 82:
                                                        aVar.f3120d.f3209c = i3;
                                                        break;
                                                    case 83:
                                                        aVar.f3122f.f3234i = i3;
                                                        break;
                                                    case 84:
                                                        aVar.f3120d.f3216j = i3;
                                                        break;
                                                }
                                        }
                                }
                        }
                    } else {
                        aVar.f3121e.f3157T = i3;
                    }
                }
                for (int i4 = 0; i4 < this.f3130f; i4++) {
                    int i5 = this.f3128d[i4];
                    float f = this.f3129e[i4];
                    int[] iArr2 = C0738a.f3108g;
                    if (i5 == 19) {
                        aVar.f3121e.f3176g = f;
                    } else if (i5 == 20) {
                        aVar.f3121e.f3203x = f;
                    } else if (i5 == 37) {
                        aVar.f3121e.f3204y = f;
                    } else if (i5 == 60) {
                        aVar.f3122f.f3227b = f;
                    } else if (i5 == 63) {
                        aVar.f3121e.f3140C = f;
                    } else if (i5 == 79) {
                        aVar.f3120d.f3213g = f;
                    } else if (i5 == 85) {
                        aVar.f3120d.f3215i = f;
                    } else if (i5 == 39) {
                        aVar.f3121e.f3159V = f;
                    } else if (i5 != 40) {
                        switch (i5) {
                            case 43:
                                aVar.f3119c.f3223d = f;
                                break;
                            case 44:
                                C0744e eVar = aVar.f3122f;
                                eVar.f3239n = f;
                                eVar.f3238m = true;
                                break;
                            case 45:
                                aVar.f3122f.f3228c = f;
                                break;
                            case 46:
                                aVar.f3122f.f3229d = f;
                                break;
                            case 47:
                                aVar.f3122f.f3230e = f;
                                break;
                            case 48:
                                aVar.f3122f.f3231f = f;
                                break;
                            case 49:
                                aVar.f3122f.f3232g = f;
                                break;
                            case 50:
                                aVar.f3122f.f3233h = f;
                                break;
                            case 51:
                                aVar.f3122f.f3235j = f;
                                break;
                            case 52:
                                aVar.f3122f.f3236k = f;
                                break;
                            case 53:
                                aVar.f3122f.f3237l = f;
                                break;
                            default:
                                switch (i5) {
                                    case 67:
                                        aVar.f3120d.f3214h = f;
                                        break;
                                    case 68:
                                        aVar.f3119c.f3224e = f;
                                        break;
                                    case 69:
                                        aVar.f3121e.f3173e0 = f;
                                        break;
                                    case 70:
                                        aVar.f3121e.f3175f0 = f;
                                        break;
                                }
                        }
                    } else {
                        aVar.f3121e.f3158U = f;
                    }
                }
                for (int i6 = 0; i6 < this.f3133i; i6++) {
                    int i7 = this.f3131g[i6];
                    String str = this.f3132h[i6];
                    int[] iArr3 = C0738a.f3108g;
                    if (i7 == 5) {
                        aVar.f3121e.f3205z = str;
                    } else if (i7 == 65) {
                        aVar.f3120d.f3210d = str;
                    } else if (i7 == 74) {
                        C0741b bVar = aVar.f3121e;
                        bVar.f3185k0 = str;
                        bVar.f3183j0 = null;
                    } else if (i7 == 77) {
                        aVar.f3121e.f3187l0 = str;
                    } else if (i7 == 90) {
                        aVar.f3120d.f3217k = str;
                    }
                }
                for (int i8 = 0; i8 < this.f3136l; i8++) {
                    int i9 = this.f3134j[i8];
                    boolean z = this.f3135k[i8];
                    int[] iArr4 = C0738a.f3108g;
                    if (i9 == 44) {
                        aVar.f3122f.f3238m = z;
                    } else if (i9 == 75) {
                        aVar.f3121e.f3193o0 = z;
                    } else if (i9 == 80) {
                        aVar.f3121e.f3189m0 = z;
                    } else if (i9 == 81) {
                        aVar.f3121e.f3191n0 = z;
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo3244a(ConstraintLayout.LayoutParams layoutParams) {
            C0741b bVar = this.f3121e;
            layoutParams.f3039e = bVar.f3180i;
            layoutParams.f3041f = bVar.f3182j;
            layoutParams.f3043g = bVar.f3184k;
            layoutParams.f3045h = bVar.f3186l;
            layoutParams.f3047i = bVar.f3188m;
            layoutParams.f3049j = bVar.f3190n;
            layoutParams.f3051k = bVar.f3192o;
            layoutParams.f3053l = bVar.f3194p;
            layoutParams.f3055m = bVar.f3196q;
            layoutParams.f3057n = bVar.f3197r;
            layoutParams.f3059o = bVar.f3198s;
            layoutParams.f3066s = bVar.f3199t;
            layoutParams.f3067t = bVar.f3200u;
            layoutParams.f3068u = bVar.f3201v;
            layoutParams.f3069v = bVar.f3202w;
            layoutParams.leftMargin = bVar.f3144G;
            layoutParams.rightMargin = bVar.f3145H;
            layoutParams.topMargin = bVar.f3146I;
            layoutParams.bottomMargin = bVar.f3147J;
            layoutParams.f3005A = bVar.f3156S;
            layoutParams.f3006B = bVar.f3155R;
            layoutParams.f3071x = bVar.f3152O;
            layoutParams.f3073z = bVar.f3154Q;
            layoutParams.f3009E = bVar.f3203x;
            layoutParams.f3010F = bVar.f3204y;
            layoutParams.f3061p = bVar.f3138A;
            layoutParams.f3063q = bVar.f3139B;
            layoutParams.f3065r = bVar.f3140C;
            layoutParams.f3011G = bVar.f3205z;
            layoutParams.f3024T = bVar.f3141D;
            layoutParams.f3025U = bVar.f3142E;
            layoutParams.f3013I = bVar.f3158U;
            layoutParams.f3012H = bVar.f3159V;
            layoutParams.f3015K = bVar.f3161X;
            layoutParams.f3014J = bVar.f3160W;
            layoutParams.f3027W = bVar.f3189m0;
            layoutParams.f3028X = bVar.f3191n0;
            layoutParams.f3016L = bVar.f3162Y;
            layoutParams.f3017M = bVar.f3163Z;
            layoutParams.f3020P = bVar.f3165a0;
            layoutParams.f3021Q = bVar.f3167b0;
            layoutParams.f3018N = bVar.f3169c0;
            layoutParams.f3019O = bVar.f3171d0;
            layoutParams.f3022R = bVar.f3173e0;
            layoutParams.f3023S = bVar.f3175f0;
            layoutParams.f3026V = bVar.f3143F;
            layoutParams.f3035c = bVar.f3176g;
            layoutParams.f3031a = bVar.f3172e;
            layoutParams.f3033b = bVar.f3174f;
            layoutParams.width = bVar.f3168c;
            layoutParams.height = bVar.f3170d;
            String str = bVar.f3187l0;
            if (str != null) {
                layoutParams.f3029Y = str;
            }
            layoutParams.f3030Z = bVar.f3195p0;
            layoutParams.setMarginStart(bVar.f3149L);
            layoutParams.setMarginEnd(this.f3121e.f3148K);
            layoutParams.mo3198a();
        }

        /* renamed from: b */
        public final C0739a clone() {
            C0739a aVar = new C0739a();
            aVar.f3121e.mo3254a(this.f3121e);
            aVar.f3120d.mo3256a(this.f3120d);
            C0743d dVar = aVar.f3119c;
            C0743d dVar2 = this.f3119c;
            dVar.getClass();
            dVar.f3220a = dVar2.f3220a;
            dVar.f3221b = dVar2.f3221b;
            dVar.f3223d = dVar2.f3223d;
            dVar.f3224e = dVar2.f3224e;
            dVar.f3222c = dVar2.f3222c;
            aVar.f3122f.mo3259a(this.f3122f);
            aVar.f3117a = this.f3117a;
            aVar.f3124h = this.f3124h;
            return aVar;
        }

        /* renamed from: c */
        public final void mo3246c(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f3117a = i;
            C0741b bVar = this.f3121e;
            bVar.f3180i = layoutParams.f3039e;
            bVar.f3182j = layoutParams.f3041f;
            bVar.f3184k = layoutParams.f3043g;
            bVar.f3186l = layoutParams.f3045h;
            bVar.f3188m = layoutParams.f3047i;
            bVar.f3190n = layoutParams.f3049j;
            bVar.f3192o = layoutParams.f3051k;
            bVar.f3194p = layoutParams.f3053l;
            bVar.f3196q = layoutParams.f3055m;
            bVar.f3197r = layoutParams.f3057n;
            bVar.f3198s = layoutParams.f3059o;
            bVar.f3199t = layoutParams.f3066s;
            bVar.f3200u = layoutParams.f3067t;
            bVar.f3201v = layoutParams.f3068u;
            bVar.f3202w = layoutParams.f3069v;
            bVar.f3203x = layoutParams.f3009E;
            bVar.f3204y = layoutParams.f3010F;
            bVar.f3205z = layoutParams.f3011G;
            bVar.f3138A = layoutParams.f3061p;
            bVar.f3139B = layoutParams.f3063q;
            bVar.f3140C = layoutParams.f3065r;
            bVar.f3141D = layoutParams.f3024T;
            bVar.f3142E = layoutParams.f3025U;
            bVar.f3143F = layoutParams.f3026V;
            bVar.f3176g = layoutParams.f3035c;
            bVar.f3172e = layoutParams.f3031a;
            bVar.f3174f = layoutParams.f3033b;
            bVar.f3168c = layoutParams.width;
            bVar.f3170d = layoutParams.height;
            bVar.f3144G = layoutParams.leftMargin;
            bVar.f3145H = layoutParams.rightMargin;
            bVar.f3146I = layoutParams.topMargin;
            bVar.f3147J = layoutParams.bottomMargin;
            bVar.f3150M = layoutParams.f3008D;
            bVar.f3158U = layoutParams.f3013I;
            bVar.f3159V = layoutParams.f3012H;
            bVar.f3161X = layoutParams.f3015K;
            bVar.f3160W = layoutParams.f3014J;
            bVar.f3189m0 = layoutParams.f3027W;
            bVar.f3191n0 = layoutParams.f3028X;
            bVar.f3162Y = layoutParams.f3016L;
            bVar.f3163Z = layoutParams.f3017M;
            bVar.f3165a0 = layoutParams.f3020P;
            bVar.f3167b0 = layoutParams.f3021Q;
            bVar.f3169c0 = layoutParams.f3018N;
            bVar.f3171d0 = layoutParams.f3019O;
            bVar.f3173e0 = layoutParams.f3022R;
            bVar.f3175f0 = layoutParams.f3023S;
            bVar.f3187l0 = layoutParams.f3029Y;
            bVar.f3152O = layoutParams.f3071x;
            bVar.f3154Q = layoutParams.f3073z;
            bVar.f3151N = layoutParams.f3070w;
            bVar.f3153P = layoutParams.f3072y;
            bVar.f3156S = layoutParams.f3005A;
            bVar.f3155R = layoutParams.f3006B;
            bVar.f3157T = layoutParams.f3007C;
            bVar.f3195p0 = layoutParams.f3030Z;
            bVar.f3148K = layoutParams.getMarginEnd();
            this.f3121e.f3149L = layoutParams.getMarginStart();
        }

        /* renamed from: d */
        public final void mo3248d(int i, Constraints.LayoutParams layoutParams) {
            mo3246c(i, layoutParams);
            this.f3119c.f3223d = layoutParams.f3089r0;
            C0744e eVar = this.f3122f;
            eVar.f3227b = layoutParams.f3092u0;
            eVar.f3228c = layoutParams.f3093v0;
            eVar.f3229d = layoutParams.f3094w0;
            eVar.f3230e = layoutParams.f3095x0;
            eVar.f3231f = layoutParams.f3096y0;
            eVar.f3232g = layoutParams.f3097z0;
            eVar.f3233h = layoutParams.f3085A0;
            eVar.f3235j = layoutParams.f3086B0;
            eVar.f3236k = layoutParams.f3087C0;
            eVar.f3237l = layoutParams.f3088D0;
            eVar.f3239n = layoutParams.f3091t0;
            eVar.f3238m = layoutParams.f3090s0;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$b */
    public static class C0741b {

        /* renamed from: q0 */
        public static SparseIntArray f3137q0;

        /* renamed from: A */
        public int f3138A = -1;

        /* renamed from: B */
        public int f3139B = 0;

        /* renamed from: C */
        public float f3140C = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: D */
        public int f3141D = -1;

        /* renamed from: E */
        public int f3142E = -1;

        /* renamed from: F */
        public int f3143F = -1;

        /* renamed from: G */
        public int f3144G = 0;

        /* renamed from: H */
        public int f3145H = 0;

        /* renamed from: I */
        public int f3146I = 0;

        /* renamed from: J */
        public int f3147J = 0;

        /* renamed from: K */
        public int f3148K = 0;

        /* renamed from: L */
        public int f3149L = 0;

        /* renamed from: M */
        public int f3150M = 0;

        /* renamed from: N */
        public int f3151N = Integer.MIN_VALUE;

        /* renamed from: O */
        public int f3152O = Integer.MIN_VALUE;

        /* renamed from: P */
        public int f3153P = Integer.MIN_VALUE;

        /* renamed from: Q */
        public int f3154Q = Integer.MIN_VALUE;

        /* renamed from: R */
        public int f3155R = Integer.MIN_VALUE;

        /* renamed from: S */
        public int f3156S = Integer.MIN_VALUE;

        /* renamed from: T */
        public int f3157T = Integer.MIN_VALUE;

        /* renamed from: U */
        public float f3158U = -1.0f;

        /* renamed from: V */
        public float f3159V = -1.0f;

        /* renamed from: W */
        public int f3160W = 0;

        /* renamed from: X */
        public int f3161X = 0;

        /* renamed from: Y */
        public int f3162Y = 0;

        /* renamed from: Z */
        public int f3163Z = 0;

        /* renamed from: a */
        public boolean f3164a = false;

        /* renamed from: a0 */
        public int f3165a0 = 0;

        /* renamed from: b */
        public boolean f3166b = false;

        /* renamed from: b0 */
        public int f3167b0 = 0;

        /* renamed from: c */
        public int f3168c;

        /* renamed from: c0 */
        public int f3169c0 = 0;

        /* renamed from: d */
        public int f3170d;

        /* renamed from: d0 */
        public int f3171d0 = 0;

        /* renamed from: e */
        public int f3172e = -1;

        /* renamed from: e0 */
        public float f3173e0 = 1.0f;

        /* renamed from: f */
        public int f3174f = -1;

        /* renamed from: f0 */
        public float f3175f0 = 1.0f;

        /* renamed from: g */
        public float f3176g = -1.0f;

        /* renamed from: g0 */
        public int f3177g0 = -1;

        /* renamed from: h */
        public boolean f3178h = true;

        /* renamed from: h0 */
        public int f3179h0 = 0;

        /* renamed from: i */
        public int f3180i = -1;

        /* renamed from: i0 */
        public int f3181i0 = -1;

        /* renamed from: j */
        public int f3182j = -1;

        /* renamed from: j0 */
        public int[] f3183j0;

        /* renamed from: k */
        public int f3184k = -1;

        /* renamed from: k0 */
        public String f3185k0;

        /* renamed from: l */
        public int f3186l = -1;

        /* renamed from: l0 */
        public String f3187l0;

        /* renamed from: m */
        public int f3188m = -1;

        /* renamed from: m0 */
        public boolean f3189m0 = false;

        /* renamed from: n */
        public int f3190n = -1;

        /* renamed from: n0 */
        public boolean f3191n0 = false;

        /* renamed from: o */
        public int f3192o = -1;

        /* renamed from: o0 */
        public boolean f3193o0 = true;

        /* renamed from: p */
        public int f3194p = -1;

        /* renamed from: p0 */
        public int f3195p0 = 0;

        /* renamed from: q */
        public int f3196q = -1;

        /* renamed from: r */
        public int f3197r = -1;

        /* renamed from: s */
        public int f3198s = -1;

        /* renamed from: t */
        public int f3199t = -1;

        /* renamed from: u */
        public int f3200u = -1;

        /* renamed from: v */
        public int f3201v = -1;

        /* renamed from: w */
        public int f3202w = -1;

        /* renamed from: x */
        public float f3203x = 0.5f;

        /* renamed from: y */
        public float f3204y = 0.5f;

        /* renamed from: z */
        public String f3205z = null;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3137q0 = sparseIntArray;
            sparseIntArray.append(C0042d.Layout_layout_constraintLeft_toLeftOf, 24);
            f3137q0.append(C0042d.Layout_layout_constraintLeft_toRightOf, 25);
            f3137q0.append(C0042d.Layout_layout_constraintRight_toLeftOf, 28);
            f3137q0.append(C0042d.Layout_layout_constraintRight_toRightOf, 29);
            f3137q0.append(C0042d.Layout_layout_constraintTop_toTopOf, 35);
            f3137q0.append(C0042d.Layout_layout_constraintTop_toBottomOf, 34);
            f3137q0.append(C0042d.Layout_layout_constraintBottom_toTopOf, 4);
            f3137q0.append(C0042d.Layout_layout_constraintBottom_toBottomOf, 3);
            f3137q0.append(C0042d.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f3137q0.append(C0042d.Layout_layout_editor_absoluteX, 6);
            f3137q0.append(C0042d.Layout_layout_editor_absoluteY, 7);
            f3137q0.append(C0042d.Layout_layout_constraintGuide_begin, 17);
            f3137q0.append(C0042d.Layout_layout_constraintGuide_end, 18);
            f3137q0.append(C0042d.Layout_layout_constraintGuide_percent, 19);
            f3137q0.append(C0042d.Layout_guidelineUseRtl, 90);
            f3137q0.append(C0042d.Layout_android_orientation, 26);
            f3137q0.append(C0042d.Layout_layout_constraintStart_toEndOf, 31);
            f3137q0.append(C0042d.Layout_layout_constraintStart_toStartOf, 32);
            f3137q0.append(C0042d.Layout_layout_constraintEnd_toStartOf, 10);
            f3137q0.append(C0042d.Layout_layout_constraintEnd_toEndOf, 9);
            f3137q0.append(C0042d.Layout_layout_goneMarginLeft, 13);
            f3137q0.append(C0042d.Layout_layout_goneMarginTop, 16);
            f3137q0.append(C0042d.Layout_layout_goneMarginRight, 14);
            f3137q0.append(C0042d.Layout_layout_goneMarginBottom, 11);
            f3137q0.append(C0042d.Layout_layout_goneMarginStart, 15);
            f3137q0.append(C0042d.Layout_layout_goneMarginEnd, 12);
            f3137q0.append(C0042d.Layout_layout_constraintVertical_weight, 38);
            f3137q0.append(C0042d.Layout_layout_constraintHorizontal_weight, 37);
            f3137q0.append(C0042d.Layout_layout_constraintHorizontal_chainStyle, 39);
            f3137q0.append(C0042d.Layout_layout_constraintVertical_chainStyle, 40);
            f3137q0.append(C0042d.Layout_layout_constraintHorizontal_bias, 20);
            f3137q0.append(C0042d.Layout_layout_constraintVertical_bias, 36);
            f3137q0.append(C0042d.Layout_layout_constraintDimensionRatio, 5);
            f3137q0.append(C0042d.Layout_layout_constraintLeft_creator, 91);
            f3137q0.append(C0042d.Layout_layout_constraintTop_creator, 91);
            f3137q0.append(C0042d.Layout_layout_constraintRight_creator, 91);
            f3137q0.append(C0042d.Layout_layout_constraintBottom_creator, 91);
            f3137q0.append(C0042d.Layout_layout_constraintBaseline_creator, 91);
            f3137q0.append(C0042d.Layout_android_layout_marginLeft, 23);
            f3137q0.append(C0042d.Layout_android_layout_marginRight, 27);
            f3137q0.append(C0042d.Layout_android_layout_marginStart, 30);
            f3137q0.append(C0042d.Layout_android_layout_marginEnd, 8);
            f3137q0.append(C0042d.Layout_android_layout_marginTop, 33);
            f3137q0.append(C0042d.Layout_android_layout_marginBottom, 2);
            f3137q0.append(C0042d.Layout_android_layout_width, 22);
            f3137q0.append(C0042d.Layout_android_layout_height, 21);
            f3137q0.append(C0042d.Layout_layout_constraintWidth, 41);
            f3137q0.append(C0042d.Layout_layout_constraintHeight, 42);
            f3137q0.append(C0042d.Layout_layout_constrainedWidth, 41);
            f3137q0.append(C0042d.Layout_layout_constrainedHeight, 42);
            f3137q0.append(C0042d.Layout_layout_wrapBehaviorInParent, 76);
            f3137q0.append(C0042d.Layout_layout_constraintCircle, 61);
            f3137q0.append(C0042d.Layout_layout_constraintCircleRadius, 62);
            f3137q0.append(C0042d.Layout_layout_constraintCircleAngle, 63);
            f3137q0.append(C0042d.Layout_layout_constraintWidth_percent, 69);
            f3137q0.append(C0042d.Layout_layout_constraintHeight_percent, 70);
            f3137q0.append(C0042d.Layout_chainUseRtl, 71);
            f3137q0.append(C0042d.Layout_barrierDirection, 72);
            f3137q0.append(C0042d.Layout_barrierMargin, 73);
            f3137q0.append(C0042d.Layout_constraint_referenced_ids, 74);
            f3137q0.append(C0042d.Layout_barrierAllowsGoneWidgets, 75);
        }

        /* renamed from: a */
        public final void mo3254a(C0741b bVar) {
            this.f3164a = bVar.f3164a;
            this.f3168c = bVar.f3168c;
            this.f3166b = bVar.f3166b;
            this.f3170d = bVar.f3170d;
            this.f3172e = bVar.f3172e;
            this.f3174f = bVar.f3174f;
            this.f3176g = bVar.f3176g;
            this.f3178h = bVar.f3178h;
            this.f3180i = bVar.f3180i;
            this.f3182j = bVar.f3182j;
            this.f3184k = bVar.f3184k;
            this.f3186l = bVar.f3186l;
            this.f3188m = bVar.f3188m;
            this.f3190n = bVar.f3190n;
            this.f3192o = bVar.f3192o;
            this.f3194p = bVar.f3194p;
            this.f3196q = bVar.f3196q;
            this.f3197r = bVar.f3197r;
            this.f3198s = bVar.f3198s;
            this.f3199t = bVar.f3199t;
            this.f3200u = bVar.f3200u;
            this.f3201v = bVar.f3201v;
            this.f3202w = bVar.f3202w;
            this.f3203x = bVar.f3203x;
            this.f3204y = bVar.f3204y;
            this.f3205z = bVar.f3205z;
            this.f3138A = bVar.f3138A;
            this.f3139B = bVar.f3139B;
            this.f3140C = bVar.f3140C;
            this.f3141D = bVar.f3141D;
            this.f3142E = bVar.f3142E;
            this.f3143F = bVar.f3143F;
            this.f3144G = bVar.f3144G;
            this.f3145H = bVar.f3145H;
            this.f3146I = bVar.f3146I;
            this.f3147J = bVar.f3147J;
            this.f3148K = bVar.f3148K;
            this.f3149L = bVar.f3149L;
            this.f3150M = bVar.f3150M;
            this.f3151N = bVar.f3151N;
            this.f3152O = bVar.f3152O;
            this.f3153P = bVar.f3153P;
            this.f3154Q = bVar.f3154Q;
            this.f3155R = bVar.f3155R;
            this.f3156S = bVar.f3156S;
            this.f3157T = bVar.f3157T;
            this.f3158U = bVar.f3158U;
            this.f3159V = bVar.f3159V;
            this.f3160W = bVar.f3160W;
            this.f3161X = bVar.f3161X;
            this.f3162Y = bVar.f3162Y;
            this.f3163Z = bVar.f3163Z;
            this.f3165a0 = bVar.f3165a0;
            this.f3167b0 = bVar.f3167b0;
            this.f3169c0 = bVar.f3169c0;
            this.f3171d0 = bVar.f3171d0;
            this.f3173e0 = bVar.f3173e0;
            this.f3175f0 = bVar.f3175f0;
            this.f3177g0 = bVar.f3177g0;
            this.f3179h0 = bVar.f3179h0;
            this.f3181i0 = bVar.f3181i0;
            this.f3187l0 = bVar.f3187l0;
            int[] iArr = bVar.f3183j0;
            if (iArr == null || bVar.f3185k0 != null) {
                this.f3183j0 = null;
            } else {
                this.f3183j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f3185k0 = bVar.f3185k0;
            this.f3189m0 = bVar.f3189m0;
            this.f3191n0 = bVar.f3191n0;
            this.f3193o0 = bVar.f3193o0;
            this.f3195p0 = bVar.f3195p0;
        }

        /* renamed from: b */
        public final void mo3255b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0042d.Layout);
            this.f3166b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f3137q0.get(index);
                switch (i2) {
                    case 1:
                        this.f3196q = C0738a.m2242m(obtainStyledAttributes, index, this.f3196q);
                        break;
                    case 2:
                        this.f3147J = obtainStyledAttributes.getDimensionPixelSize(index, this.f3147J);
                        break;
                    case 3:
                        this.f3194p = C0738a.m2242m(obtainStyledAttributes, index, this.f3194p);
                        break;
                    case 4:
                        this.f3192o = C0738a.m2242m(obtainStyledAttributes, index, this.f3192o);
                        break;
                    case 5:
                        this.f3205z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f3141D = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3141D);
                        break;
                    case 7:
                        this.f3142E = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3142E);
                        break;
                    case 8:
                        this.f3148K = obtainStyledAttributes.getDimensionPixelSize(index, this.f3148K);
                        break;
                    case 9:
                        this.f3202w = C0738a.m2242m(obtainStyledAttributes, index, this.f3202w);
                        break;
                    case 10:
                        this.f3201v = C0738a.m2242m(obtainStyledAttributes, index, this.f3201v);
                        break;
                    case 11:
                        this.f3154Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f3154Q);
                        break;
                    case 12:
                        this.f3155R = obtainStyledAttributes.getDimensionPixelSize(index, this.f3155R);
                        break;
                    case 13:
                        this.f3151N = obtainStyledAttributes.getDimensionPixelSize(index, this.f3151N);
                        break;
                    case 14:
                        this.f3153P = obtainStyledAttributes.getDimensionPixelSize(index, this.f3153P);
                        break;
                    case 15:
                        this.f3156S = obtainStyledAttributes.getDimensionPixelSize(index, this.f3156S);
                        break;
                    case 16:
                        this.f3152O = obtainStyledAttributes.getDimensionPixelSize(index, this.f3152O);
                        break;
                    case 17:
                        this.f3172e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3172e);
                        break;
                    case 18:
                        this.f3174f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3174f);
                        break;
                    case 19:
                        this.f3176g = obtainStyledAttributes.getFloat(index, this.f3176g);
                        break;
                    case 20:
                        this.f3203x = obtainStyledAttributes.getFloat(index, this.f3203x);
                        break;
                    case 21:
                        this.f3170d = obtainStyledAttributes.getLayoutDimension(index, this.f3170d);
                        break;
                    case 22:
                        this.f3168c = obtainStyledAttributes.getLayoutDimension(index, this.f3168c);
                        break;
                    case 23:
                        this.f3144G = obtainStyledAttributes.getDimensionPixelSize(index, this.f3144G);
                        break;
                    case 24:
                        this.f3180i = C0738a.m2242m(obtainStyledAttributes, index, this.f3180i);
                        break;
                    case 25:
                        this.f3182j = C0738a.m2242m(obtainStyledAttributes, index, this.f3182j);
                        break;
                    case 26:
                        this.f3143F = obtainStyledAttributes.getInt(index, this.f3143F);
                        break;
                    case 27:
                        this.f3145H = obtainStyledAttributes.getDimensionPixelSize(index, this.f3145H);
                        break;
                    case 28:
                        this.f3184k = C0738a.m2242m(obtainStyledAttributes, index, this.f3184k);
                        break;
                    case 29:
                        this.f3186l = C0738a.m2242m(obtainStyledAttributes, index, this.f3186l);
                        break;
                    case 30:
                        this.f3149L = obtainStyledAttributes.getDimensionPixelSize(index, this.f3149L);
                        break;
                    case 31:
                        this.f3199t = C0738a.m2242m(obtainStyledAttributes, index, this.f3199t);
                        break;
                    case 32:
                        this.f3200u = C0738a.m2242m(obtainStyledAttributes, index, this.f3200u);
                        break;
                    case 33:
                        this.f3146I = obtainStyledAttributes.getDimensionPixelSize(index, this.f3146I);
                        break;
                    case 34:
                        this.f3190n = C0738a.m2242m(obtainStyledAttributes, index, this.f3190n);
                        break;
                    case 35:
                        this.f3188m = C0738a.m2242m(obtainStyledAttributes, index, this.f3188m);
                        break;
                    case 36:
                        this.f3204y = obtainStyledAttributes.getFloat(index, this.f3204y);
                        break;
                    case 37:
                        this.f3159V = obtainStyledAttributes.getFloat(index, this.f3159V);
                        break;
                    case 38:
                        this.f3158U = obtainStyledAttributes.getFloat(index, this.f3158U);
                        break;
                    case 39:
                        this.f3160W = obtainStyledAttributes.getInt(index, this.f3160W);
                        break;
                    case 40:
                        this.f3161X = obtainStyledAttributes.getInt(index, this.f3161X);
                        break;
                    case 41:
                        C0738a.m2243n(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        C0738a.m2243n(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i2) {
                            case 61:
                                this.f3138A = C0738a.m2242m(obtainStyledAttributes, index, this.f3138A);
                                break;
                            case 62:
                                this.f3139B = obtainStyledAttributes.getDimensionPixelSize(index, this.f3139B);
                                break;
                            case 63:
                                this.f3140C = obtainStyledAttributes.getFloat(index, this.f3140C);
                                break;
                            default:
                                switch (i2) {
                                    case 69:
                                        this.f3173e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f3175f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        break;
                                    case 72:
                                        this.f3177g0 = obtainStyledAttributes.getInt(index, this.f3177g0);
                                        break;
                                    case 73:
                                        this.f3179h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3179h0);
                                        break;
                                    case 74:
                                        this.f3185k0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f3193o0 = obtainStyledAttributes.getBoolean(index, this.f3193o0);
                                        break;
                                    case 76:
                                        this.f3195p0 = obtainStyledAttributes.getInt(index, this.f3195p0);
                                        break;
                                    case 77:
                                        this.f3197r = C0738a.m2242m(obtainStyledAttributes, index, this.f3197r);
                                        break;
                                    case 78:
                                        this.f3198s = C0738a.m2242m(obtainStyledAttributes, index, this.f3198s);
                                        break;
                                    case 79:
                                        this.f3157T = obtainStyledAttributes.getDimensionPixelSize(index, this.f3157T);
                                        break;
                                    case 80:
                                        this.f3150M = obtainStyledAttributes.getDimensionPixelSize(index, this.f3150M);
                                        break;
                                    case 81:
                                        this.f3162Y = obtainStyledAttributes.getInt(index, this.f3162Y);
                                        break;
                                    case 82:
                                        this.f3163Z = obtainStyledAttributes.getInt(index, this.f3163Z);
                                        break;
                                    case 83:
                                        this.f3167b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3167b0);
                                        break;
                                    case 84:
                                        this.f3165a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3165a0);
                                        break;
                                    case 85:
                                        this.f3171d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3171d0);
                                        break;
                                    case 86:
                                        this.f3169c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f3169c0);
                                        break;
                                    case 87:
                                        this.f3189m0 = obtainStyledAttributes.getBoolean(index, this.f3189m0);
                                        break;
                                    case 88:
                                        this.f3191n0 = obtainStyledAttributes.getBoolean(index, this.f3191n0);
                                        break;
                                    case 89:
                                        this.f3187l0 = obtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f3178h = obtainStyledAttributes.getBoolean(index, this.f3178h);
                                        break;
                                    case 91:
                                        Integer.toHexString(index);
                                        f3137q0.get(index);
                                        break;
                                    default:
                                        Integer.toHexString(index);
                                        f3137q0.get(index);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$c */
    public static class C0742c {

        /* renamed from: n */
        public static SparseIntArray f3206n;

        /* renamed from: a */
        public boolean f3207a = false;

        /* renamed from: b */
        public int f3208b = -1;

        /* renamed from: c */
        public int f3209c = 0;

        /* renamed from: d */
        public String f3210d = null;

        /* renamed from: e */
        public int f3211e = -1;

        /* renamed from: f */
        public int f3212f = 0;

        /* renamed from: g */
        public float f3213g = Float.NaN;

        /* renamed from: h */
        public float f3214h = Float.NaN;

        /* renamed from: i */
        public float f3215i = Float.NaN;

        /* renamed from: j */
        public int f3216j = -1;

        /* renamed from: k */
        public String f3217k = null;

        /* renamed from: l */
        public int f3218l = -3;

        /* renamed from: m */
        public int f3219m = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3206n = sparseIntArray;
            sparseIntArray.append(C0042d.Motion_motionPathRotate, 1);
            f3206n.append(C0042d.Motion_pathMotionArc, 2);
            f3206n.append(C0042d.Motion_transitionEasing, 3);
            f3206n.append(C0042d.Motion_drawPath, 4);
            f3206n.append(C0042d.Motion_animateRelativeTo, 5);
            f3206n.append(C0042d.Motion_animateCircleAngleTo, 6);
            f3206n.append(C0042d.Motion_motionStagger, 7);
            f3206n.append(C0042d.Motion_quantizeMotionSteps, 8);
            f3206n.append(C0042d.Motion_quantizeMotionPhase, 9);
            f3206n.append(C0042d.Motion_quantizeMotionInterpolator, 10);
        }

        /* renamed from: a */
        public final void mo3256a(C0742c cVar) {
            this.f3207a = cVar.f3207a;
            this.f3208b = cVar.f3208b;
            this.f3210d = cVar.f3210d;
            this.f3211e = cVar.f3211e;
            this.f3212f = cVar.f3212f;
            this.f3214h = cVar.f3214h;
            this.f3213g = cVar.f3213g;
        }

        /* renamed from: b */
        public final void mo3257b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0042d.Motion);
            this.f3207a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f3206n.get(index)) {
                    case 1:
                        this.f3214h = obtainStyledAttributes.getFloat(index, this.f3214h);
                        break;
                    case 2:
                        this.f3211e = obtainStyledAttributes.getInt(index, this.f3211e);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f3210d = C6821c.f21097c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f3210d = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f3212f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f3208b = C0738a.m2242m(obtainStyledAttributes, index, this.f3208b);
                        break;
                    case 6:
                        this.f3209c = obtainStyledAttributes.getInteger(index, this.f3209c);
                        break;
                    case 7:
                        this.f3213g = obtainStyledAttributes.getFloat(index, this.f3213g);
                        break;
                    case 8:
                        this.f3216j = obtainStyledAttributes.getInteger(index, this.f3216j);
                        break;
                    case 9:
                        this.f3215i = obtainStyledAttributes.getFloat(index, this.f3215i);
                        break;
                    case 10:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 != 1) {
                            if (i2 != 3) {
                                this.f3218l = obtainStyledAttributes.getInteger(index, this.f3219m);
                                break;
                            } else {
                                String string = obtainStyledAttributes.getString(index);
                                this.f3217k = string;
                                if (string.indexOf("/") <= 0) {
                                    this.f3218l = -1;
                                    break;
                                } else {
                                    this.f3219m = obtainStyledAttributes.getResourceId(index, -1);
                                    this.f3218l = -2;
                                    break;
                                }
                            }
                        } else {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.f3219m = resourceId;
                            if (resourceId == -1) {
                                break;
                            } else {
                                this.f3218l = -2;
                                break;
                            }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$d */
    public static class C0743d {

        /* renamed from: a */
        public boolean f3220a = false;

        /* renamed from: b */
        public int f3221b = 0;

        /* renamed from: c */
        public int f3222c = 0;

        /* renamed from: d */
        public float f3223d = 1.0f;

        /* renamed from: e */
        public float f3224e = Float.NaN;

        /* renamed from: a */
        public final void mo3258a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0042d.PropertySet);
            this.f3220a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.PropertySet_android_alpha) {
                    this.f3223d = obtainStyledAttributes.getFloat(index, this.f3223d);
                } else if (index == C0042d.PropertySet_android_visibility) {
                    int i2 = obtainStyledAttributes.getInt(index, this.f3221b);
                    this.f3221b = i2;
                    this.f3221b = C0738a.f3108g[i2];
                } else if (index == C0042d.PropertySet_visibilityMode) {
                    this.f3222c = obtainStyledAttributes.getInt(index, this.f3222c);
                } else if (index == C0042d.PropertySet_motionProgress) {
                    this.f3224e = obtainStyledAttributes.getFloat(index, this.f3224e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.a$e */
    public static class C0744e {

        /* renamed from: o */
        public static SparseIntArray f3225o;

        /* renamed from: a */
        public boolean f3226a = false;

        /* renamed from: b */
        public float f3227b = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: c */
        public float f3228c = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: d */
        public float f3229d = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: e */
        public float f3230e = 1.0f;

        /* renamed from: f */
        public float f3231f = 1.0f;

        /* renamed from: g */
        public float f3232g = Float.NaN;

        /* renamed from: h */
        public float f3233h = Float.NaN;

        /* renamed from: i */
        public int f3234i = -1;

        /* renamed from: j */
        public float f3235j = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: k */
        public float f3236k = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: l */
        public float f3237l = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: m */
        public boolean f3238m = false;

        /* renamed from: n */
        public float f3239n = BitmapDescriptorFactory.HUE_RED;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f3225o = sparseIntArray;
            sparseIntArray.append(C0042d.Transform_android_rotation, 1);
            f3225o.append(C0042d.Transform_android_rotationX, 2);
            f3225o.append(C0042d.Transform_android_rotationY, 3);
            f3225o.append(C0042d.Transform_android_scaleX, 4);
            f3225o.append(C0042d.Transform_android_scaleY, 5);
            f3225o.append(C0042d.Transform_android_transformPivotX, 6);
            f3225o.append(C0042d.Transform_android_transformPivotY, 7);
            f3225o.append(C0042d.Transform_android_translationX, 8);
            f3225o.append(C0042d.Transform_android_translationY, 9);
            f3225o.append(C0042d.Transform_android_translationZ, 10);
            f3225o.append(C0042d.Transform_android_elevation, 11);
            f3225o.append(C0042d.Transform_transformPivotTarget, 12);
        }

        /* renamed from: a */
        public final void mo3259a(C0744e eVar) {
            this.f3226a = eVar.f3226a;
            this.f3227b = eVar.f3227b;
            this.f3228c = eVar.f3228c;
            this.f3229d = eVar.f3229d;
            this.f3230e = eVar.f3230e;
            this.f3231f = eVar.f3231f;
            this.f3232g = eVar.f3232g;
            this.f3233h = eVar.f3233h;
            this.f3234i = eVar.f3234i;
            this.f3235j = eVar.f3235j;
            this.f3236k = eVar.f3236k;
            this.f3237l = eVar.f3237l;
            this.f3238m = eVar.f3238m;
            this.f3239n = eVar.f3239n;
        }

        /* renamed from: b */
        public final void mo3260b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0042d.Transform);
            this.f3226a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f3225o.get(index)) {
                    case 1:
                        this.f3227b = obtainStyledAttributes.getFloat(index, this.f3227b);
                        break;
                    case 2:
                        this.f3228c = obtainStyledAttributes.getFloat(index, this.f3228c);
                        break;
                    case 3:
                        this.f3229d = obtainStyledAttributes.getFloat(index, this.f3229d);
                        break;
                    case 4:
                        this.f3230e = obtainStyledAttributes.getFloat(index, this.f3230e);
                        break;
                    case 5:
                        this.f3231f = obtainStyledAttributes.getFloat(index, this.f3231f);
                        break;
                    case 6:
                        this.f3232g = obtainStyledAttributes.getDimension(index, this.f3232g);
                        break;
                    case 7:
                        this.f3233h = obtainStyledAttributes.getDimension(index, this.f3233h);
                        break;
                    case 8:
                        this.f3235j = obtainStyledAttributes.getDimension(index, this.f3235j);
                        break;
                    case 9:
                        this.f3236k = obtainStyledAttributes.getDimension(index, this.f3236k);
                        break;
                    case 10:
                        this.f3237l = obtainStyledAttributes.getDimension(index, this.f3237l);
                        break;
                    case 11:
                        this.f3238m = true;
                        this.f3239n = obtainStyledAttributes.getDimension(index, this.f3239n);
                        break;
                    case 12:
                        this.f3234i = C0738a.m2242m(obtainStyledAttributes, index, this.f3234i);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f3109h.append(C0042d.Constraint_layout_constraintLeft_toLeftOf, 25);
        f3109h.append(C0042d.Constraint_layout_constraintLeft_toRightOf, 26);
        f3109h.append(C0042d.Constraint_layout_constraintRight_toLeftOf, 29);
        f3109h.append(C0042d.Constraint_layout_constraintRight_toRightOf, 30);
        f3109h.append(C0042d.Constraint_layout_constraintTop_toTopOf, 36);
        f3109h.append(C0042d.Constraint_layout_constraintTop_toBottomOf, 35);
        f3109h.append(C0042d.Constraint_layout_constraintBottom_toTopOf, 4);
        f3109h.append(C0042d.Constraint_layout_constraintBottom_toBottomOf, 3);
        f3109h.append(C0042d.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f3109h.append(C0042d.Constraint_layout_constraintBaseline_toTopOf, 91);
        f3109h.append(C0042d.Constraint_layout_constraintBaseline_toBottomOf, 92);
        f3109h.append(C0042d.Constraint_layout_editor_absoluteX, 6);
        f3109h.append(C0042d.Constraint_layout_editor_absoluteY, 7);
        f3109h.append(C0042d.Constraint_layout_constraintGuide_begin, 17);
        f3109h.append(C0042d.Constraint_layout_constraintGuide_end, 18);
        f3109h.append(C0042d.Constraint_layout_constraintGuide_percent, 19);
        f3109h.append(C0042d.Constraint_guidelineUseRtl, 99);
        f3109h.append(C0042d.Constraint_android_orientation, 27);
        f3109h.append(C0042d.Constraint_layout_constraintStart_toEndOf, 32);
        f3109h.append(C0042d.Constraint_layout_constraintStart_toStartOf, 33);
        f3109h.append(C0042d.Constraint_layout_constraintEnd_toStartOf, 10);
        f3109h.append(C0042d.Constraint_layout_constraintEnd_toEndOf, 9);
        f3109h.append(C0042d.Constraint_layout_goneMarginLeft, 13);
        f3109h.append(C0042d.Constraint_layout_goneMarginTop, 16);
        f3109h.append(C0042d.Constraint_layout_goneMarginRight, 14);
        f3109h.append(C0042d.Constraint_layout_goneMarginBottom, 11);
        f3109h.append(C0042d.Constraint_layout_goneMarginStart, 15);
        f3109h.append(C0042d.Constraint_layout_goneMarginEnd, 12);
        f3109h.append(C0042d.Constraint_layout_constraintVertical_weight, 40);
        f3109h.append(C0042d.Constraint_layout_constraintHorizontal_weight, 39);
        f3109h.append(C0042d.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f3109h.append(C0042d.Constraint_layout_constraintVertical_chainStyle, 42);
        f3109h.append(C0042d.Constraint_layout_constraintHorizontal_bias, 20);
        f3109h.append(C0042d.Constraint_layout_constraintVertical_bias, 37);
        f3109h.append(C0042d.Constraint_layout_constraintDimensionRatio, 5);
        f3109h.append(C0042d.Constraint_layout_constraintLeft_creator, 87);
        f3109h.append(C0042d.Constraint_layout_constraintTop_creator, 87);
        f3109h.append(C0042d.Constraint_layout_constraintRight_creator, 87);
        f3109h.append(C0042d.Constraint_layout_constraintBottom_creator, 87);
        f3109h.append(C0042d.Constraint_layout_constraintBaseline_creator, 87);
        f3109h.append(C0042d.Constraint_android_layout_marginLeft, 24);
        f3109h.append(C0042d.Constraint_android_layout_marginRight, 28);
        f3109h.append(C0042d.Constraint_android_layout_marginStart, 31);
        f3109h.append(C0042d.Constraint_android_layout_marginEnd, 8);
        f3109h.append(C0042d.Constraint_android_layout_marginTop, 34);
        f3109h.append(C0042d.Constraint_android_layout_marginBottom, 2);
        f3109h.append(C0042d.Constraint_android_layout_width, 23);
        f3109h.append(C0042d.Constraint_android_layout_height, 21);
        f3109h.append(C0042d.Constraint_layout_constraintWidth, 95);
        f3109h.append(C0042d.Constraint_layout_constraintHeight, 96);
        f3109h.append(C0042d.Constraint_android_visibility, 22);
        f3109h.append(C0042d.Constraint_android_alpha, 43);
        f3109h.append(C0042d.Constraint_android_elevation, 44);
        f3109h.append(C0042d.Constraint_android_rotationX, 45);
        f3109h.append(C0042d.Constraint_android_rotationY, 46);
        f3109h.append(C0042d.Constraint_android_rotation, 60);
        f3109h.append(C0042d.Constraint_android_scaleX, 47);
        f3109h.append(C0042d.Constraint_android_scaleY, 48);
        f3109h.append(C0042d.Constraint_android_transformPivotX, 49);
        f3109h.append(C0042d.Constraint_android_transformPivotY, 50);
        f3109h.append(C0042d.Constraint_android_translationX, 51);
        f3109h.append(C0042d.Constraint_android_translationY, 52);
        f3109h.append(C0042d.Constraint_android_translationZ, 53);
        f3109h.append(C0042d.Constraint_layout_constraintWidth_default, 54);
        f3109h.append(C0042d.Constraint_layout_constraintHeight_default, 55);
        f3109h.append(C0042d.Constraint_layout_constraintWidth_max, 56);
        f3109h.append(C0042d.Constraint_layout_constraintHeight_max, 57);
        f3109h.append(C0042d.Constraint_layout_constraintWidth_min, 58);
        f3109h.append(C0042d.Constraint_layout_constraintHeight_min, 59);
        f3109h.append(C0042d.Constraint_layout_constraintCircle, 61);
        f3109h.append(C0042d.Constraint_layout_constraintCircleRadius, 62);
        f3109h.append(C0042d.Constraint_layout_constraintCircleAngle, 63);
        f3109h.append(C0042d.Constraint_animateRelativeTo, 64);
        f3109h.append(C0042d.Constraint_transitionEasing, 65);
        f3109h.append(C0042d.Constraint_drawPath, 66);
        f3109h.append(C0042d.Constraint_transitionPathRotate, 67);
        f3109h.append(C0042d.Constraint_motionStagger, 79);
        f3109h.append(C0042d.Constraint_android_id, 38);
        f3109h.append(C0042d.Constraint_motionProgress, 68);
        f3109h.append(C0042d.Constraint_layout_constraintWidth_percent, 69);
        f3109h.append(C0042d.Constraint_layout_constraintHeight_percent, 70);
        f3109h.append(C0042d.Constraint_layout_wrapBehaviorInParent, 97);
        f3109h.append(C0042d.Constraint_chainUseRtl, 71);
        f3109h.append(C0042d.Constraint_barrierDirection, 72);
        f3109h.append(C0042d.Constraint_barrierMargin, 73);
        f3109h.append(C0042d.Constraint_constraint_referenced_ids, 74);
        f3109h.append(C0042d.Constraint_barrierAllowsGoneWidgets, 75);
        f3109h.append(C0042d.Constraint_pathMotionArc, 76);
        f3109h.append(C0042d.Constraint_layout_constraintTag, 77);
        f3109h.append(C0042d.Constraint_visibilityMode, 78);
        f3109h.append(C0042d.Constraint_layout_constrainedWidth, 80);
        f3109h.append(C0042d.Constraint_layout_constrainedHeight, 81);
        f3109h.append(C0042d.Constraint_polarRelativeTo, 82);
        f3109h.append(C0042d.Constraint_transformPivotTarget, 83);
        f3109h.append(C0042d.Constraint_quantizeMotionSteps, 84);
        f3109h.append(C0042d.Constraint_quantizeMotionPhase, 85);
        f3109h.append(C0042d.Constraint_quantizeMotionInterpolator, 86);
        SparseIntArray sparseIntArray = f3110i;
        int i = C0042d.ConstraintOverride_layout_editor_absoluteY;
        sparseIntArray.append(i, 6);
        f3110i.append(i, 7);
        f3110i.append(C0042d.ConstraintOverride_android_orientation, 27);
        f3110i.append(C0042d.ConstraintOverride_layout_goneMarginLeft, 13);
        f3110i.append(C0042d.ConstraintOverride_layout_goneMarginTop, 16);
        f3110i.append(C0042d.ConstraintOverride_layout_goneMarginRight, 14);
        f3110i.append(C0042d.ConstraintOverride_layout_goneMarginBottom, 11);
        f3110i.append(C0042d.ConstraintOverride_layout_goneMarginStart, 15);
        f3110i.append(C0042d.ConstraintOverride_layout_goneMarginEnd, 12);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintVertical_weight, 40);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintVertical_bias, 37);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintDimensionRatio, 5);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintLeft_creator, 87);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintTop_creator, 87);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintRight_creator, 87);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintBottom_creator, 87);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintBaseline_creator, 87);
        f3110i.append(C0042d.ConstraintOverride_android_layout_marginLeft, 24);
        f3110i.append(C0042d.ConstraintOverride_android_layout_marginRight, 28);
        f3110i.append(C0042d.ConstraintOverride_android_layout_marginStart, 31);
        f3110i.append(C0042d.ConstraintOverride_android_layout_marginEnd, 8);
        f3110i.append(C0042d.ConstraintOverride_android_layout_marginTop, 34);
        f3110i.append(C0042d.ConstraintOverride_android_layout_marginBottom, 2);
        f3110i.append(C0042d.ConstraintOverride_android_layout_width, 23);
        f3110i.append(C0042d.ConstraintOverride_android_layout_height, 21);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintWidth, 95);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintHeight, 96);
        f3110i.append(C0042d.ConstraintOverride_android_visibility, 22);
        f3110i.append(C0042d.ConstraintOverride_android_alpha, 43);
        f3110i.append(C0042d.ConstraintOverride_android_elevation, 44);
        f3110i.append(C0042d.ConstraintOverride_android_rotationX, 45);
        f3110i.append(C0042d.ConstraintOverride_android_rotationY, 46);
        f3110i.append(C0042d.ConstraintOverride_android_rotation, 60);
        f3110i.append(C0042d.ConstraintOverride_android_scaleX, 47);
        f3110i.append(C0042d.ConstraintOverride_android_scaleY, 48);
        f3110i.append(C0042d.ConstraintOverride_android_transformPivotX, 49);
        f3110i.append(C0042d.ConstraintOverride_android_transformPivotY, 50);
        f3110i.append(C0042d.ConstraintOverride_android_translationX, 51);
        f3110i.append(C0042d.ConstraintOverride_android_translationY, 52);
        f3110i.append(C0042d.ConstraintOverride_android_translationZ, 53);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintWidth_default, 54);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintHeight_default, 55);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintWidth_max, 56);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintHeight_max, 57);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintWidth_min, 58);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintHeight_min, 59);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintCircleRadius, 62);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintCircleAngle, 63);
        f3110i.append(C0042d.ConstraintOverride_animateRelativeTo, 64);
        f3110i.append(C0042d.ConstraintOverride_transitionEasing, 65);
        f3110i.append(C0042d.ConstraintOverride_drawPath, 66);
        f3110i.append(C0042d.ConstraintOverride_transitionPathRotate, 67);
        f3110i.append(C0042d.ConstraintOverride_motionStagger, 79);
        f3110i.append(C0042d.ConstraintOverride_android_id, 38);
        f3110i.append(C0042d.ConstraintOverride_motionTarget, 98);
        f3110i.append(C0042d.ConstraintOverride_motionProgress, 68);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintWidth_percent, 69);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintHeight_percent, 70);
        f3110i.append(C0042d.ConstraintOverride_chainUseRtl, 71);
        f3110i.append(C0042d.ConstraintOverride_barrierDirection, 72);
        f3110i.append(C0042d.ConstraintOverride_barrierMargin, 73);
        f3110i.append(C0042d.ConstraintOverride_constraint_referenced_ids, 74);
        f3110i.append(C0042d.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        f3110i.append(C0042d.ConstraintOverride_pathMotionArc, 76);
        f3110i.append(C0042d.ConstraintOverride_layout_constraintTag, 77);
        f3110i.append(C0042d.ConstraintOverride_visibilityMode, 78);
        f3110i.append(C0042d.ConstraintOverride_layout_constrainedWidth, 80);
        f3110i.append(C0042d.ConstraintOverride_layout_constrainedHeight, 81);
        f3110i.append(C0042d.ConstraintOverride_polarRelativeTo, 82);
        f3110i.append(C0042d.ConstraintOverride_transformPivotTarget, 83);
        f3110i.append(C0042d.ConstraintOverride_quantizeMotionSteps, 84);
        f3110i.append(C0042d.ConstraintOverride_quantizeMotionPhase, 85);
        f3110i.append(C0042d.ConstraintOverride_quantizeMotionInterpolator, 86);
        f3110i.append(C0042d.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    /* renamed from: d */
    public static C0739a m2239d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        C0739a aVar = new C0739a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, C0042d.ConstraintOverride);
        m2245p(aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: g */
    public static int[] m2240g(Barrier barrier, String str) {
        int i;
        Object designInformation;
        String[] split = str.split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
        Context context = barrier.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0041c.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, trim)) != null && (designInformation instanceof Integer)) {
                i = ((Integer) designInformation).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        if (i3 != split.length) {
            return Arrays.copyOf(iArr, i3);
        }
        return iArr;
    }

    /* renamed from: h */
    public static C0739a m2241h(Context context, AttributeSet attributeSet, boolean z) {
        int[] iArr;
        C0739a aVar = new C0739a();
        if (z) {
            iArr = C0042d.ConstraintOverride;
        } else {
            iArr = C0042d.Constraint;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (z) {
            m2245p(aVar, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (!(index == C0042d.Constraint_android_id || C0042d.Constraint_android_layout_marginStart == index || C0042d.Constraint_android_layout_marginEnd == index)) {
                    aVar.f3120d.f3207a = true;
                    aVar.f3121e.f3166b = true;
                    aVar.f3119c.f3220a = true;
                    aVar.f3122f.f3226a = true;
                }
                switch (f3109h.get(index)) {
                    case 1:
                        C0741b bVar = aVar.f3121e;
                        bVar.f3196q = m2242m(obtainStyledAttributes, index, bVar.f3196q);
                        break;
                    case 2:
                        C0741b bVar2 = aVar.f3121e;
                        bVar2.f3147J = obtainStyledAttributes.getDimensionPixelSize(index, bVar2.f3147J);
                        break;
                    case 3:
                        C0741b bVar3 = aVar.f3121e;
                        bVar3.f3194p = m2242m(obtainStyledAttributes, index, bVar3.f3194p);
                        break;
                    case 4:
                        C0741b bVar4 = aVar.f3121e;
                        bVar4.f3192o = m2242m(obtainStyledAttributes, index, bVar4.f3192o);
                        break;
                    case 5:
                        aVar.f3121e.f3205z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        C0741b bVar5 = aVar.f3121e;
                        bVar5.f3141D = obtainStyledAttributes.getDimensionPixelOffset(index, bVar5.f3141D);
                        break;
                    case 7:
                        C0741b bVar6 = aVar.f3121e;
                        bVar6.f3142E = obtainStyledAttributes.getDimensionPixelOffset(index, bVar6.f3142E);
                        break;
                    case 8:
                        C0741b bVar7 = aVar.f3121e;
                        bVar7.f3148K = obtainStyledAttributes.getDimensionPixelSize(index, bVar7.f3148K);
                        break;
                    case 9:
                        C0741b bVar8 = aVar.f3121e;
                        bVar8.f3202w = m2242m(obtainStyledAttributes, index, bVar8.f3202w);
                        break;
                    case 10:
                        C0741b bVar9 = aVar.f3121e;
                        bVar9.f3201v = m2242m(obtainStyledAttributes, index, bVar9.f3201v);
                        break;
                    case 11:
                        C0741b bVar10 = aVar.f3121e;
                        bVar10.f3154Q = obtainStyledAttributes.getDimensionPixelSize(index, bVar10.f3154Q);
                        break;
                    case 12:
                        C0741b bVar11 = aVar.f3121e;
                        bVar11.f3155R = obtainStyledAttributes.getDimensionPixelSize(index, bVar11.f3155R);
                        break;
                    case 13:
                        C0741b bVar12 = aVar.f3121e;
                        bVar12.f3151N = obtainStyledAttributes.getDimensionPixelSize(index, bVar12.f3151N);
                        break;
                    case 14:
                        C0741b bVar13 = aVar.f3121e;
                        bVar13.f3153P = obtainStyledAttributes.getDimensionPixelSize(index, bVar13.f3153P);
                        break;
                    case 15:
                        C0741b bVar14 = aVar.f3121e;
                        bVar14.f3156S = obtainStyledAttributes.getDimensionPixelSize(index, bVar14.f3156S);
                        break;
                    case 16:
                        C0741b bVar15 = aVar.f3121e;
                        bVar15.f3152O = obtainStyledAttributes.getDimensionPixelSize(index, bVar15.f3152O);
                        break;
                    case 17:
                        C0741b bVar16 = aVar.f3121e;
                        bVar16.f3172e = obtainStyledAttributes.getDimensionPixelOffset(index, bVar16.f3172e);
                        break;
                    case 18:
                        C0741b bVar17 = aVar.f3121e;
                        bVar17.f3174f = obtainStyledAttributes.getDimensionPixelOffset(index, bVar17.f3174f);
                        break;
                    case 19:
                        C0741b bVar18 = aVar.f3121e;
                        bVar18.f3176g = obtainStyledAttributes.getFloat(index, bVar18.f3176g);
                        break;
                    case 20:
                        C0741b bVar19 = aVar.f3121e;
                        bVar19.f3203x = obtainStyledAttributes.getFloat(index, bVar19.f3203x);
                        break;
                    case 21:
                        C0741b bVar20 = aVar.f3121e;
                        bVar20.f3170d = obtainStyledAttributes.getLayoutDimension(index, bVar20.f3170d);
                        break;
                    case 22:
                        C0743d dVar = aVar.f3119c;
                        dVar.f3221b = obtainStyledAttributes.getInt(index, dVar.f3221b);
                        C0743d dVar2 = aVar.f3119c;
                        dVar2.f3221b = f3108g[dVar2.f3221b];
                        break;
                    case 23:
                        C0741b bVar21 = aVar.f3121e;
                        bVar21.f3168c = obtainStyledAttributes.getLayoutDimension(index, bVar21.f3168c);
                        break;
                    case 24:
                        C0741b bVar22 = aVar.f3121e;
                        bVar22.f3144G = obtainStyledAttributes.getDimensionPixelSize(index, bVar22.f3144G);
                        break;
                    case 25:
                        C0741b bVar23 = aVar.f3121e;
                        bVar23.f3180i = m2242m(obtainStyledAttributes, index, bVar23.f3180i);
                        break;
                    case 26:
                        C0741b bVar24 = aVar.f3121e;
                        bVar24.f3182j = m2242m(obtainStyledAttributes, index, bVar24.f3182j);
                        break;
                    case 27:
                        C0741b bVar25 = aVar.f3121e;
                        bVar25.f3143F = obtainStyledAttributes.getInt(index, bVar25.f3143F);
                        break;
                    case 28:
                        C0741b bVar26 = aVar.f3121e;
                        bVar26.f3145H = obtainStyledAttributes.getDimensionPixelSize(index, bVar26.f3145H);
                        break;
                    case 29:
                        C0741b bVar27 = aVar.f3121e;
                        bVar27.f3184k = m2242m(obtainStyledAttributes, index, bVar27.f3184k);
                        break;
                    case 30:
                        C0741b bVar28 = aVar.f3121e;
                        bVar28.f3186l = m2242m(obtainStyledAttributes, index, bVar28.f3186l);
                        break;
                    case 31:
                        C0741b bVar29 = aVar.f3121e;
                        bVar29.f3149L = obtainStyledAttributes.getDimensionPixelSize(index, bVar29.f3149L);
                        break;
                    case 32:
                        C0741b bVar30 = aVar.f3121e;
                        bVar30.f3199t = m2242m(obtainStyledAttributes, index, bVar30.f3199t);
                        break;
                    case 33:
                        C0741b bVar31 = aVar.f3121e;
                        bVar31.f3200u = m2242m(obtainStyledAttributes, index, bVar31.f3200u);
                        break;
                    case 34:
                        C0741b bVar32 = aVar.f3121e;
                        bVar32.f3146I = obtainStyledAttributes.getDimensionPixelSize(index, bVar32.f3146I);
                        break;
                    case 35:
                        C0741b bVar33 = aVar.f3121e;
                        bVar33.f3190n = m2242m(obtainStyledAttributes, index, bVar33.f3190n);
                        break;
                    case 36:
                        C0741b bVar34 = aVar.f3121e;
                        bVar34.f3188m = m2242m(obtainStyledAttributes, index, bVar34.f3188m);
                        break;
                    case 37:
                        C0741b bVar35 = aVar.f3121e;
                        bVar35.f3204y = obtainStyledAttributes.getFloat(index, bVar35.f3204y);
                        break;
                    case 38:
                        aVar.f3117a = obtainStyledAttributes.getResourceId(index, aVar.f3117a);
                        break;
                    case 39:
                        C0741b bVar36 = aVar.f3121e;
                        bVar36.f3159V = obtainStyledAttributes.getFloat(index, bVar36.f3159V);
                        break;
                    case 40:
                        C0741b bVar37 = aVar.f3121e;
                        bVar37.f3158U = obtainStyledAttributes.getFloat(index, bVar37.f3158U);
                        break;
                    case 41:
                        C0741b bVar38 = aVar.f3121e;
                        bVar38.f3160W = obtainStyledAttributes.getInt(index, bVar38.f3160W);
                        break;
                    case 42:
                        C0741b bVar39 = aVar.f3121e;
                        bVar39.f3161X = obtainStyledAttributes.getInt(index, bVar39.f3161X);
                        break;
                    case 43:
                        C0743d dVar3 = aVar.f3119c;
                        dVar3.f3223d = obtainStyledAttributes.getFloat(index, dVar3.f3223d);
                        break;
                    case 44:
                        C0744e eVar = aVar.f3122f;
                        eVar.f3238m = true;
                        eVar.f3239n = obtainStyledAttributes.getDimension(index, eVar.f3239n);
                        break;
                    case 45:
                        C0744e eVar2 = aVar.f3122f;
                        eVar2.f3228c = obtainStyledAttributes.getFloat(index, eVar2.f3228c);
                        break;
                    case 46:
                        C0744e eVar3 = aVar.f3122f;
                        eVar3.f3229d = obtainStyledAttributes.getFloat(index, eVar3.f3229d);
                        break;
                    case 47:
                        C0744e eVar4 = aVar.f3122f;
                        eVar4.f3230e = obtainStyledAttributes.getFloat(index, eVar4.f3230e);
                        break;
                    case 48:
                        C0744e eVar5 = aVar.f3122f;
                        eVar5.f3231f = obtainStyledAttributes.getFloat(index, eVar5.f3231f);
                        break;
                    case 49:
                        C0744e eVar6 = aVar.f3122f;
                        eVar6.f3232g = obtainStyledAttributes.getDimension(index, eVar6.f3232g);
                        break;
                    case 50:
                        C0744e eVar7 = aVar.f3122f;
                        eVar7.f3233h = obtainStyledAttributes.getDimension(index, eVar7.f3233h);
                        break;
                    case 51:
                        C0744e eVar8 = aVar.f3122f;
                        eVar8.f3235j = obtainStyledAttributes.getDimension(index, eVar8.f3235j);
                        break;
                    case 52:
                        C0744e eVar9 = aVar.f3122f;
                        eVar9.f3236k = obtainStyledAttributes.getDimension(index, eVar9.f3236k);
                        break;
                    case 53:
                        C0744e eVar10 = aVar.f3122f;
                        eVar10.f3237l = obtainStyledAttributes.getDimension(index, eVar10.f3237l);
                        break;
                    case 54:
                        C0741b bVar40 = aVar.f3121e;
                        bVar40.f3162Y = obtainStyledAttributes.getInt(index, bVar40.f3162Y);
                        break;
                    case 55:
                        C0741b bVar41 = aVar.f3121e;
                        bVar41.f3163Z = obtainStyledAttributes.getInt(index, bVar41.f3163Z);
                        break;
                    case 56:
                        C0741b bVar42 = aVar.f3121e;
                        bVar42.f3165a0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar42.f3165a0);
                        break;
                    case 57:
                        C0741b bVar43 = aVar.f3121e;
                        bVar43.f3167b0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar43.f3167b0);
                        break;
                    case 58:
                        C0741b bVar44 = aVar.f3121e;
                        bVar44.f3169c0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar44.f3169c0);
                        break;
                    case 59:
                        C0741b bVar45 = aVar.f3121e;
                        bVar45.f3171d0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar45.f3171d0);
                        break;
                    case 60:
                        C0744e eVar11 = aVar.f3122f;
                        eVar11.f3227b = obtainStyledAttributes.getFloat(index, eVar11.f3227b);
                        break;
                    case 61:
                        C0741b bVar46 = aVar.f3121e;
                        bVar46.f3138A = m2242m(obtainStyledAttributes, index, bVar46.f3138A);
                        break;
                    case 62:
                        C0741b bVar47 = aVar.f3121e;
                        bVar47.f3139B = obtainStyledAttributes.getDimensionPixelSize(index, bVar47.f3139B);
                        break;
                    case 63:
                        C0741b bVar48 = aVar.f3121e;
                        bVar48.f3140C = obtainStyledAttributes.getFloat(index, bVar48.f3140C);
                        break;
                    case 64:
                        C0742c cVar = aVar.f3120d;
                        cVar.f3208b = m2242m(obtainStyledAttributes, index, cVar.f3208b);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            aVar.f3120d.f3210d = C6821c.f21097c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            aVar.f3120d.f3210d = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 66:
                        aVar.f3120d.f3212f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 67:
                        C0742c cVar2 = aVar.f3120d;
                        cVar2.f3214h = obtainStyledAttributes.getFloat(index, cVar2.f3214h);
                        break;
                    case 68:
                        C0743d dVar4 = aVar.f3119c;
                        dVar4.f3224e = obtainStyledAttributes.getFloat(index, dVar4.f3224e);
                        break;
                    case 69:
                        aVar.f3121e.f3173e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 70:
                        aVar.f3121e.f3175f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 71:
                        break;
                    case 72:
                        C0741b bVar49 = aVar.f3121e;
                        bVar49.f3177g0 = obtainStyledAttributes.getInt(index, bVar49.f3177g0);
                        break;
                    case 73:
                        C0741b bVar50 = aVar.f3121e;
                        bVar50.f3179h0 = obtainStyledAttributes.getDimensionPixelSize(index, bVar50.f3179h0);
                        break;
                    case 74:
                        aVar.f3121e.f3185k0 = obtainStyledAttributes.getString(index);
                        break;
                    case 75:
                        C0741b bVar51 = aVar.f3121e;
                        bVar51.f3193o0 = obtainStyledAttributes.getBoolean(index, bVar51.f3193o0);
                        break;
                    case 76:
                        C0742c cVar3 = aVar.f3120d;
                        cVar3.f3211e = obtainStyledAttributes.getInt(index, cVar3.f3211e);
                        break;
                    case 77:
                        aVar.f3121e.f3187l0 = obtainStyledAttributes.getString(index);
                        break;
                    case 78:
                        C0743d dVar5 = aVar.f3119c;
                        dVar5.f3222c = obtainStyledAttributes.getInt(index, dVar5.f3222c);
                        break;
                    case 79:
                        C0742c cVar4 = aVar.f3120d;
                        cVar4.f3213g = obtainStyledAttributes.getFloat(index, cVar4.f3213g);
                        break;
                    case 80:
                        C0741b bVar52 = aVar.f3121e;
                        bVar52.f3189m0 = obtainStyledAttributes.getBoolean(index, bVar52.f3189m0);
                        break;
                    case 81:
                        C0741b bVar53 = aVar.f3121e;
                        bVar53.f3191n0 = obtainStyledAttributes.getBoolean(index, bVar53.f3191n0);
                        break;
                    case 82:
                        C0742c cVar5 = aVar.f3120d;
                        cVar5.f3209c = obtainStyledAttributes.getInteger(index, cVar5.f3209c);
                        break;
                    case 83:
                        C0744e eVar12 = aVar.f3122f;
                        eVar12.f3234i = m2242m(obtainStyledAttributes, index, eVar12.f3234i);
                        break;
                    case 84:
                        C0742c cVar6 = aVar.f3120d;
                        cVar6.f3216j = obtainStyledAttributes.getInteger(index, cVar6.f3216j);
                        break;
                    case 85:
                        C0742c cVar7 = aVar.f3120d;
                        cVar7.f3215i = obtainStyledAttributes.getFloat(index, cVar7.f3215i);
                        break;
                    case 86:
                        int i2 = obtainStyledAttributes.peekValue(index).type;
                        if (i2 != 1) {
                            if (i2 != 3) {
                                C0742c cVar8 = aVar.f3120d;
                                cVar8.f3218l = obtainStyledAttributes.getInteger(index, cVar8.f3219m);
                                break;
                            } else {
                                aVar.f3120d.f3217k = obtainStyledAttributes.getString(index);
                                if (aVar.f3120d.f3217k.indexOf("/") <= 0) {
                                    aVar.f3120d.f3218l = -1;
                                    break;
                                } else {
                                    aVar.f3120d.f3219m = obtainStyledAttributes.getResourceId(index, -1);
                                    aVar.f3120d.f3218l = -2;
                                    break;
                                }
                            }
                        } else {
                            aVar.f3120d.f3219m = obtainStyledAttributes.getResourceId(index, -1);
                            C0742c cVar9 = aVar.f3120d;
                            if (cVar9.f3219m == -1) {
                                break;
                            } else {
                                cVar9.f3218l = -2;
                                break;
                            }
                        }
                    case 87:
                        Integer.toHexString(index);
                        f3109h.get(index);
                        break;
                    case 91:
                        C0741b bVar54 = aVar.f3121e;
                        bVar54.f3197r = m2242m(obtainStyledAttributes, index, bVar54.f3197r);
                        break;
                    case 92:
                        C0741b bVar55 = aVar.f3121e;
                        bVar55.f3198s = m2242m(obtainStyledAttributes, index, bVar55.f3198s);
                        break;
                    case 93:
                        C0741b bVar56 = aVar.f3121e;
                        bVar56.f3150M = obtainStyledAttributes.getDimensionPixelSize(index, bVar56.f3150M);
                        break;
                    case 94:
                        C0741b bVar57 = aVar.f3121e;
                        bVar57.f3157T = obtainStyledAttributes.getDimensionPixelSize(index, bVar57.f3157T);
                        break;
                    case 95:
                        m2243n(aVar.f3121e, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        m2243n(aVar.f3121e, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        C0741b bVar58 = aVar.f3121e;
                        bVar58.f3195p0 = obtainStyledAttributes.getInt(index, bVar58.f3195p0);
                        break;
                    default:
                        Integer.toHexString(index);
                        f3109h.get(index);
                        break;
                }
            }
            C0741b bVar59 = aVar.f3121e;
            if (bVar59.f3185k0 != null) {
                bVar59.f3183j0 = null;
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: m */
    public static int m2242m(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        if (resourceId == -1) {
            return typedArray.getInt(i, -1);
        }
        return resourceId;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r9 == -1) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m2243n(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            if (r8 != 0) goto L_0x0003
            return
        L_0x0003:
            android.util.TypedValue r0 = r9.peekValue(r10)
            int r0 = r0.type
            r1 = 3
            r2 = 21
            r3 = 23
            r4 = 1
            r5 = -1
            r6 = 5
            r7 = 0
            if (r0 == r1) goto L_0x006c
            r1 = -2
            if (r0 == r6) goto L_0x0028
            int r9 = r9.getInt(r10, r7)
            r10 = -4
            if (r9 == r10) goto L_0x0026
            r10 = -3
            if (r9 == r10) goto L_0x002d
            if (r9 == r1) goto L_0x002c
            if (r9 == r5) goto L_0x002c
            goto L_0x002d
        L_0x0026:
            r7 = -2
            goto L_0x002e
        L_0x0028:
            int r9 = r9.getDimensionPixelSize(r10, r7)
        L_0x002c:
            r7 = r9
        L_0x002d:
            r4 = 0
        L_0x002e:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r9 == 0) goto L_0x0040
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r8 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r8
            if (r11 != 0) goto L_0x003b
            r8.width = r7
            r8.f3027W = r4
            goto L_0x006b
        L_0x003b:
            r8.height = r7
            r8.f3028X = r4
            goto L_0x006b
        L_0x0040:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.C0738a.C0741b
            if (r9 == 0) goto L_0x0052
            androidx.constraintlayout.widget.a$b r8 = (androidx.constraintlayout.widget.C0738a.C0741b) r8
            if (r11 != 0) goto L_0x004d
            r8.f3168c = r7
            r8.f3189m0 = r4
            goto L_0x006b
        L_0x004d:
            r8.f3170d = r7
            r8.f3191n0 = r4
            goto L_0x006b
        L_0x0052:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.C0738a.C0739a.C0740a
            if (r9 == 0) goto L_0x006b
            androidx.constraintlayout.widget.a$a$a r8 = (androidx.constraintlayout.widget.C0738a.C0739a.C0740a) r8
            if (r11 != 0) goto L_0x0063
            r8.mo3250b(r3, r7)
            r9 = 80
            r8.mo3252d(r9, r4)
            goto L_0x006b
        L_0x0063:
            r8.mo3250b(r2, r7)
            r9 = 81
            r8.mo3252d(r9, r4)
        L_0x006b:
            return
        L_0x006c:
            java.lang.String r9 = r9.getString(r10)
            if (r9 != 0) goto L_0x0074
            goto L_0x0175
        L_0x0074:
            r10 = 61
            int r10 = r9.indexOf(r10)
            int r0 = r9.length()
            if (r10 <= 0) goto L_0x0175
            int r0 = r0 + r5
            if (r10 >= r0) goto L_0x0175
            java.lang.String r0 = r9.substring(r7, r10)
            int r10 = r10 + r4
            java.lang.String r9 = r9.substring(r10)
            int r10 = r9.length()
            if (r10 <= 0) goto L_0x0175
            java.lang.String r10 = r0.trim()
            java.lang.String r9 = r9.trim()
            java.lang.String r0 = "ratio"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x00c9
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r10 == 0) goto L_0x00b4
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r8 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r8
            if (r11 != 0) goto L_0x00ad
            r8.width = r7
            goto L_0x00af
        L_0x00ad:
            r8.height = r7
        L_0x00af:
            m2244o(r8, r9)
            goto L_0x0175
        L_0x00b4:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.C0738a.C0741b
            if (r10 == 0) goto L_0x00be
            androidx.constraintlayout.widget.a$b r8 = (androidx.constraintlayout.widget.C0738a.C0741b) r8
            r8.f3205z = r9
            goto L_0x0175
        L_0x00be:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.C0738a.C0739a.C0740a
            if (r10 == 0) goto L_0x0175
            androidx.constraintlayout.widget.a$a$a r8 = (androidx.constraintlayout.widget.C0738a.C0739a.C0740a) r8
            r8.mo3251c(r6, r9)
            goto L_0x0175
        L_0x00c9:
            java.lang.String r0 = "weight"
            boolean r0 = r0.equalsIgnoreCase(r10)
            if (r0 == 0) goto L_0x0118
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0175 }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x00ea
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r8 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x00e4
            r8.width = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f3012H = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00e4:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f3013I = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00ea:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.C0738a.C0741b     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x00fe
            androidx.constraintlayout.widget.a$b r8 = (androidx.constraintlayout.widget.C0738a.C0741b) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x00f8
            r8.f3168c = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f3159V = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00f8:
            r8.f3170d = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f3158U = r9     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x00fe:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.C0738a.C0739a.C0740a     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x0175
            androidx.constraintlayout.widget.a$a$a r8 = (androidx.constraintlayout.widget.C0738a.C0739a.C0740a) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x010f
            r8.mo3250b(r3, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r10 = 39
            r8.mo3249a(r9, r10)     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x010f:
            r8.mo3250b(r2, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r10 = 40
            r8.mo3249a(r9, r10)     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x0118:
            java.lang.String r0 = "parent"
            boolean r10 = r0.equalsIgnoreCase(r10)
            if (r10 == 0) goto L_0x0175
            r10 = 1065353216(0x3f800000, float:1.0)
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0175 }
            float r9 = java.lang.Math.min(r10, r9)     // Catch:{ NumberFormatException -> 0x0175 }
            r10 = 0
            float r9 = java.lang.Math.max(r10, r9)     // Catch:{ NumberFormatException -> 0x0175 }
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams     // Catch:{ NumberFormatException -> 0x0175 }
            r0 = 2
            if (r10 == 0) goto L_0x0146
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r8 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x013f
            r8.width = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f3022R = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f3016L = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x013f:
            r8.height = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f3023S = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f3017M = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x0146:
            boolean r10 = r8 instanceof androidx.constraintlayout.widget.C0738a.C0741b     // Catch:{ NumberFormatException -> 0x0175 }
            if (r10 == 0) goto L_0x015c
            androidx.constraintlayout.widget.a$b r8 = (androidx.constraintlayout.widget.C0738a.C0741b) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x0155
            r8.f3168c = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f3173e0 = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f3162Y = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x0155:
            r8.f3170d = r7     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f3175f0 = r9     // Catch:{ NumberFormatException -> 0x0175 }
            r8.f3163Z = r0     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x015c:
            boolean r9 = r8 instanceof androidx.constraintlayout.widget.C0738a.C0739a.C0740a     // Catch:{ NumberFormatException -> 0x0175 }
            if (r9 == 0) goto L_0x0175
            androidx.constraintlayout.widget.a$a$a r8 = (androidx.constraintlayout.widget.C0738a.C0739a.C0740a) r8     // Catch:{ NumberFormatException -> 0x0175 }
            if (r11 != 0) goto L_0x016d
            r8.mo3250b(r3, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r9 = 54
            r8.mo3250b(r9, r0)     // Catch:{ NumberFormatException -> 0x0175 }
            goto L_0x0175
        L_0x016d:
            r8.mo3250b(r2, r7)     // Catch:{ NumberFormatException -> 0x0175 }
            r9 = 55
            r8.mo3250b(r9, r0)     // Catch:{ NumberFormatException -> 0x0175 }
        L_0x0175:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0738a.m2243n(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* renamed from: o */
    public static void m2244o(ConstraintLayout.LayoutParams layoutParams, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    if (substring.equalsIgnoreCase("H")) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                }
                i2 = i;
                i = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            if (indexOf2 < 0 || indexOf2 >= length - 1) {
                String substring2 = str.substring(i);
                if (substring2.length() > 0) {
                    Float.parseFloat(substring2);
                }
            } else {
                String substring3 = str.substring(i, indexOf2);
                String substring4 = str.substring(indexOf2 + 1);
                if (substring3.length() > 0 && substring4.length() > 0) {
                    try {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > BitmapDescriptorFactory.HUE_RED && parseFloat2 > BitmapDescriptorFactory.HUE_RED) {
                            if (i2 == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        layoutParams.f3011G = str;
    }

    /* renamed from: p */
    public static void m2245p(C0739a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        C0739a.C0740a aVar2 = new C0739a.C0740a();
        aVar.f3124h = aVar2;
        aVar.f3120d.f3207a = false;
        aVar.f3121e.f3166b = false;
        aVar.f3119c.f3220a = false;
        aVar.f3122f.f3226a = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (f3110i.get(index)) {
                case 2:
                    aVar2.mo3250b(2, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3147J));
                    break;
                case 5:
                    aVar2.mo3251c(5, typedArray.getString(index));
                    break;
                case 6:
                    aVar2.mo3250b(6, typedArray.getDimensionPixelOffset(index, aVar.f3121e.f3141D));
                    break;
                case 7:
                    aVar2.mo3250b(7, typedArray.getDimensionPixelOffset(index, aVar.f3121e.f3142E));
                    break;
                case 8:
                    aVar2.mo3250b(8, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3148K));
                    break;
                case 11:
                    aVar2.mo3250b(11, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3154Q));
                    break;
                case 12:
                    aVar2.mo3250b(12, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3155R));
                    break;
                case 13:
                    aVar2.mo3250b(13, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3151N));
                    break;
                case 14:
                    aVar2.mo3250b(14, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3153P));
                    break;
                case 15:
                    aVar2.mo3250b(15, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3156S));
                    break;
                case 16:
                    aVar2.mo3250b(16, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3152O));
                    break;
                case 17:
                    aVar2.mo3250b(17, typedArray.getDimensionPixelOffset(index, aVar.f3121e.f3172e));
                    break;
                case 18:
                    aVar2.mo3250b(18, typedArray.getDimensionPixelOffset(index, aVar.f3121e.f3174f));
                    break;
                case 19:
                    aVar2.mo3249a(typedArray.getFloat(index, aVar.f3121e.f3176g), 19);
                    break;
                case 20:
                    aVar2.mo3249a(typedArray.getFloat(index, aVar.f3121e.f3203x), 20);
                    break;
                case 21:
                    aVar2.mo3250b(21, typedArray.getLayoutDimension(index, aVar.f3121e.f3170d));
                    break;
                case 22:
                    aVar2.mo3250b(22, f3108g[typedArray.getInt(index, aVar.f3119c.f3221b)]);
                    break;
                case 23:
                    aVar2.mo3250b(23, typedArray.getLayoutDimension(index, aVar.f3121e.f3168c));
                    break;
                case 24:
                    aVar2.mo3250b(24, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3144G));
                    break;
                case 27:
                    aVar2.mo3250b(27, typedArray.getInt(index, aVar.f3121e.f3143F));
                    break;
                case 28:
                    aVar2.mo3250b(28, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3145H));
                    break;
                case 31:
                    aVar2.mo3250b(31, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3149L));
                    break;
                case 34:
                    aVar2.mo3250b(34, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3146I));
                    break;
                case 37:
                    aVar2.mo3249a(typedArray.getFloat(index, aVar.f3121e.f3204y), 37);
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f3117a);
                    aVar.f3117a = resourceId;
                    aVar2.mo3250b(38, resourceId);
                    break;
                case 39:
                    aVar2.mo3249a(typedArray.getFloat(index, aVar.f3121e.f3159V), 39);
                    break;
                case 40:
                    aVar2.mo3249a(typedArray.getFloat(index, aVar.f3121e.f3158U), 40);
                    break;
                case 41:
                    aVar2.mo3250b(41, typedArray.getInt(index, aVar.f3121e.f3160W));
                    break;
                case 42:
                    aVar2.mo3250b(42, typedArray.getInt(index, aVar.f3121e.f3161X));
                    break;
                case 43:
                    aVar2.mo3249a(typedArray.getFloat(index, aVar.f3119c.f3223d), 43);
                    break;
                case 44:
                    aVar2.mo3252d(44, true);
                    aVar2.mo3249a(typedArray.getDimension(index, aVar.f3122f.f3239n), 44);
                    break;
                case 45:
                    aVar2.mo3249a(typedArray.getFloat(index, aVar.f3122f.f3228c), 45);
                    break;
                case 46:
                    aVar2.mo3249a(typedArray.getFloat(index, aVar.f3122f.f3229d), 46);
                    break;
                case 47:
                    aVar2.mo3249a(typedArray.getFloat(index, aVar.f3122f.f3230e), 47);
                    break;
                case 48:
                    aVar2.mo3249a(typedArray.getFloat(index, aVar.f3122f.f3231f), 48);
                    break;
                case 49:
                    aVar2.mo3249a(typedArray.getDimension(index, aVar.f3122f.f3232g), 49);
                    break;
                case 50:
                    aVar2.mo3249a(typedArray.getDimension(index, aVar.f3122f.f3233h), 50);
                    break;
                case 51:
                    aVar2.mo3249a(typedArray.getDimension(index, aVar.f3122f.f3235j), 51);
                    break;
                case 52:
                    aVar2.mo3249a(typedArray.getDimension(index, aVar.f3122f.f3236k), 52);
                    break;
                case 53:
                    aVar2.mo3249a(typedArray.getDimension(index, aVar.f3122f.f3237l), 53);
                    break;
                case 54:
                    aVar2.mo3250b(54, typedArray.getInt(index, aVar.f3121e.f3162Y));
                    break;
                case 55:
                    aVar2.mo3250b(55, typedArray.getInt(index, aVar.f3121e.f3163Z));
                    break;
                case 56:
                    aVar2.mo3250b(56, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3165a0));
                    break;
                case 57:
                    aVar2.mo3250b(57, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3167b0));
                    break;
                case 58:
                    aVar2.mo3250b(58, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3169c0));
                    break;
                case 59:
                    aVar2.mo3250b(59, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3171d0));
                    break;
                case 60:
                    aVar2.mo3249a(typedArray.getFloat(index, aVar.f3122f.f3227b), 60);
                    break;
                case 62:
                    aVar2.mo3250b(62, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3139B));
                    break;
                case 63:
                    aVar2.mo3249a(typedArray.getFloat(index, aVar.f3121e.f3140C), 63);
                    break;
                case 64:
                    aVar2.mo3250b(64, m2242m(typedArray, index, aVar.f3120d.f3208b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar2.mo3251c(65, C6821c.f21097c[typedArray.getInteger(index, 0)]);
                        break;
                    } else {
                        aVar2.mo3251c(65, typedArray.getString(index));
                        break;
                    }
                case 66:
                    aVar2.mo3250b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    aVar2.mo3249a(typedArray.getFloat(index, aVar.f3120d.f3214h), 67);
                    break;
                case 68:
                    aVar2.mo3249a(typedArray.getFloat(index, aVar.f3119c.f3224e), 68);
                    break;
                case 69:
                    aVar2.mo3249a(typedArray.getFloat(index, 1.0f), 69);
                    break;
                case 70:
                    aVar2.mo3249a(typedArray.getFloat(index, 1.0f), 70);
                    break;
                case 71:
                    break;
                case 72:
                    aVar2.mo3250b(72, typedArray.getInt(index, aVar.f3121e.f3177g0));
                    break;
                case 73:
                    aVar2.mo3250b(73, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3179h0));
                    break;
                case 74:
                    aVar2.mo3251c(74, typedArray.getString(index));
                    break;
                case 75:
                    aVar2.mo3252d(75, typedArray.getBoolean(index, aVar.f3121e.f3193o0));
                    break;
                case 76:
                    aVar2.mo3250b(76, typedArray.getInt(index, aVar.f3120d.f3211e));
                    break;
                case 77:
                    aVar2.mo3251c(77, typedArray.getString(index));
                    break;
                case 78:
                    aVar2.mo3250b(78, typedArray.getInt(index, aVar.f3119c.f3222c));
                    break;
                case 79:
                    aVar2.mo3249a(typedArray.getFloat(index, aVar.f3120d.f3213g), 79);
                    break;
                case 80:
                    aVar2.mo3252d(80, typedArray.getBoolean(index, aVar.f3121e.f3189m0));
                    break;
                case 81:
                    aVar2.mo3252d(81, typedArray.getBoolean(index, aVar.f3121e.f3191n0));
                    break;
                case 82:
                    aVar2.mo3250b(82, typedArray.getInteger(index, aVar.f3120d.f3209c));
                    break;
                case 83:
                    aVar2.mo3250b(83, m2242m(typedArray, index, aVar.f3122f.f3234i));
                    break;
                case 84:
                    aVar2.mo3250b(84, typedArray.getInteger(index, aVar.f3120d.f3216j));
                    break;
                case 85:
                    aVar2.mo3249a(typedArray.getFloat(index, aVar.f3120d.f3215i), 85);
                    break;
                case 86:
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 != 1) {
                        if (i2 != 3) {
                            C0742c cVar = aVar.f3120d;
                            cVar.f3218l = typedArray.getInteger(index, cVar.f3219m);
                            aVar2.mo3250b(88, aVar.f3120d.f3218l);
                            break;
                        } else {
                            aVar.f3120d.f3217k = typedArray.getString(index);
                            aVar2.mo3251c(90, aVar.f3120d.f3217k);
                            if (aVar.f3120d.f3217k.indexOf("/") <= 0) {
                                aVar.f3120d.f3218l = -1;
                                aVar2.mo3250b(88, -1);
                                break;
                            } else {
                                aVar.f3120d.f3219m = typedArray.getResourceId(index, -1);
                                aVar2.mo3250b(89, aVar.f3120d.f3219m);
                                aVar.f3120d.f3218l = -2;
                                aVar2.mo3250b(88, -2);
                                break;
                            }
                        }
                    } else {
                        aVar.f3120d.f3219m = typedArray.getResourceId(index, -1);
                        aVar2.mo3250b(89, aVar.f3120d.f3219m);
                        C0742c cVar2 = aVar.f3120d;
                        if (cVar2.f3219m == -1) {
                            break;
                        } else {
                            cVar2.f3218l = -2;
                            aVar2.mo3250b(88, -2);
                            break;
                        }
                    }
                case 87:
                    Integer.toHexString(index);
                    f3109h.get(index);
                    break;
                case 93:
                    aVar2.mo3250b(93, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3150M));
                    break;
                case 94:
                    aVar2.mo3250b(94, typedArray.getDimensionPixelSize(index, aVar.f3121e.f3157T));
                    break;
                case 95:
                    m2243n(aVar2, typedArray, index, 0);
                    break;
                case 96:
                    m2243n(aVar2, typedArray, index, 1);
                    break;
                case 97:
                    aVar2.mo3250b(97, typedArray.getInt(index, aVar.f3121e.f3195p0));
                    break;
                case 98:
                    if (!MotionLayout.f2657J0) {
                        if (typedArray.peekValue(index).type != 3) {
                            aVar.f3117a = typedArray.getResourceId(index, aVar.f3117a);
                            break;
                        } else {
                            aVar.f3118b = typedArray.getString(index);
                            break;
                        }
                    } else {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f3117a);
                        aVar.f3117a = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            aVar.f3118b = typedArray.getString(index);
                            break;
                        }
                    }
                case 99:
                    aVar2.mo3252d(99, typedArray.getBoolean(index, aVar.f3121e.f3178h));
                    break;
                default:
                    Integer.toHexString(index);
                    f3109h.get(index);
                    break;
            }
        }
    }

    /* renamed from: q */
    public static String m2246q(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return AdError.UNDEFINED_DOMAIN;
        }
    }

    /* renamed from: a */
    public final void mo3235a(ConstraintLayout constraintLayout) {
        C0739a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f3116f.containsKey(Integer.valueOf(id))) {
                C7376a.m16989d(childAt);
            } else if (this.f3115e && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.f3116f.containsKey(Integer.valueOf(id)) && (aVar = this.f3116f.get(Integer.valueOf(id))) != null) {
                ConstraintAttribute.m2207e(childAt, aVar.f3123g);
            }
        }
    }

    /* renamed from: b */
    public final void mo3236b(ConstraintLayout constraintLayout) {
        mo3237c(constraintLayout);
        constraintLayout.setConstraintSet((C0738a) null);
        constraintLayout.requestLayout();
    }

    /* renamed from: c */
    public final void mo3237c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f3116f.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f3116f.containsKey(Integer.valueOf(id))) {
                C7376a.m16989d(childAt);
            } else if (this.f3115e && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1 && this.f3116f.containsKey(Integer.valueOf(id))) {
                hashSet.remove(Integer.valueOf(id));
                C0739a aVar = this.f3116f.get(Integer.valueOf(id));
                if (aVar != null) {
                    if (childAt instanceof Barrier) {
                        aVar.f3121e.f3181i0 = 1;
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(aVar.f3121e.f3177g0);
                        barrier.setMargin(aVar.f3121e.f3179h0);
                        barrier.setAllowsGoneWidget(aVar.f3121e.f3193o0);
                        C0741b bVar = aVar.f3121e;
                        int[] iArr = bVar.f3183j0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = bVar.f3185k0;
                            if (str != null) {
                                bVar.f3183j0 = m2240g(barrier, str);
                                barrier.setReferencedIds(aVar.f3121e.f3183j0);
                            }
                        }
                    }
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                    layoutParams.mo3198a();
                    aVar.mo3244a(layoutParams);
                    ConstraintAttribute.m2207e(childAt, aVar.f3123g);
                    childAt.setLayoutParams(layoutParams);
                    C0743d dVar = aVar.f3119c;
                    if (dVar.f3222c == 0) {
                        childAt.setVisibility(dVar.f3221b);
                    }
                    childAt.setAlpha(aVar.f3119c.f3223d);
                    childAt.setRotation(aVar.f3122f.f3227b);
                    childAt.setRotationX(aVar.f3122f.f3228c);
                    childAt.setRotationY(aVar.f3122f.f3229d);
                    childAt.setScaleX(aVar.f3122f.f3230e);
                    childAt.setScaleY(aVar.f3122f.f3231f);
                    C0744e eVar = aVar.f3122f;
                    if (eVar.f3234i != -1) {
                        View findViewById = ((View) childAt.getParent()).findViewById(aVar.f3122f.f3234i);
                        if (findViewById != null) {
                            float bottom = ((float) (findViewById.getBottom() + findViewById.getTop())) / 2.0f;
                            float right = ((float) (findViewById.getRight() + findViewById.getLeft())) / 2.0f;
                            if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                childAt.setPivotX(right - ((float) childAt.getLeft()));
                                childAt.setPivotY(bottom - ((float) childAt.getTop()));
                            }
                        }
                    } else {
                        if (!Float.isNaN(eVar.f3232g)) {
                            childAt.setPivotX(aVar.f3122f.f3232g);
                        }
                        if (!Float.isNaN(aVar.f3122f.f3233h)) {
                            childAt.setPivotY(aVar.f3122f.f3233h);
                        }
                    }
                    childAt.setTranslationX(aVar.f3122f.f3235j);
                    childAt.setTranslationY(aVar.f3122f.f3236k);
                    childAt.setTranslationZ(aVar.f3122f.f3237l);
                    C0744e eVar2 = aVar.f3122f;
                    if (eVar2.f3238m) {
                        childAt.setElevation(eVar2.f3239n);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0739a aVar2 = this.f3116f.get(num);
            if (aVar2 != null) {
                if (aVar2.f3121e.f3181i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    C0741b bVar2 = aVar2.f3121e;
                    int[] iArr2 = bVar2.f3183j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar2.f3185k0;
                        if (str2 != null) {
                            bVar2.f3183j0 = m2240g(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f3121e.f3183j0);
                        }
                    }
                    barrier2.setType(aVar2.f3121e.f3177g0);
                    barrier2.setMargin(aVar2.f3121e.f3179h0);
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.mo3168t();
                    aVar2.mo3244a(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar2.f3121e.f3164a) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.mo3244a(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).mo2901j(constraintLayout);
            }
        }
    }

    /* renamed from: e */
    public final void mo3238e(ConstraintLayout constraintLayout) {
        C0738a aVar = this;
        int childCount = constraintLayout.getChildCount();
        aVar.f3116f.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!aVar.f3115e || id != -1) {
                if (!aVar.f3116f.containsKey(Integer.valueOf(id))) {
                    aVar.f3116f.put(Integer.valueOf(id), new C0739a());
                }
                C0739a aVar2 = aVar.f3116f.get(Integer.valueOf(id));
                if (aVar2 != null) {
                    HashMap<String, ConstraintAttribute> hashMap = aVar.f3114d;
                    HashMap<String, ConstraintAttribute> hashMap2 = new HashMap<>();
                    Class<?> cls = childAt.getClass();
                    for (String next : hashMap.keySet()) {
                        ConstraintAttribute constraintAttribute = hashMap.get(next);
                        try {
                            if (next.equals("BackgroundColor")) {
                                hashMap2.put(next, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } else {
                                try {
                                    hashMap2.put(next, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + next, new Class[0]).invoke(childAt, new Object[0])));
                                } catch (NoSuchMethodException e) {
                                    e = e;
                                } catch (IllegalAccessException e2) {
                                    e = e2;
                                    e.printStackTrace();
                                } catch (InvocationTargetException e3) {
                                    e = e3;
                                    e.printStackTrace();
                                }
                            }
                        } catch (NoSuchMethodException e4) {
                            e = e4;
                            e.printStackTrace();
                        } catch (IllegalAccessException e5) {
                            e = e5;
                            e.printStackTrace();
                        } catch (InvocationTargetException e6) {
                            e = e6;
                            e.printStackTrace();
                        }
                    }
                    aVar2.f3123g = hashMap2;
                    aVar2.mo3246c(id, layoutParams);
                    aVar2.f3119c.f3221b = childAt.getVisibility();
                    aVar2.f3119c.f3223d = childAt.getAlpha();
                    aVar2.f3122f.f3227b = childAt.getRotation();
                    aVar2.f3122f.f3228c = childAt.getRotationX();
                    aVar2.f3122f.f3229d = childAt.getRotationY();
                    aVar2.f3122f.f3230e = childAt.getScaleX();
                    aVar2.f3122f.f3231f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        C0744e eVar = aVar2.f3122f;
                        eVar.f3232g = pivotX;
                        eVar.f3233h = pivotY;
                    }
                    aVar2.f3122f.f3235j = childAt.getTranslationX();
                    aVar2.f3122f.f3236k = childAt.getTranslationY();
                    aVar2.f3122f.f3237l = childAt.getTranslationZ();
                    C0744e eVar2 = aVar2.f3122f;
                    if (eVar2.f3238m) {
                        eVar2.f3239n = childAt.getElevation();
                    }
                    if (childAt instanceof Barrier) {
                        Barrier barrier = (Barrier) childAt;
                        aVar2.f3121e.f3193o0 = barrier.getAllowsGoneWidget();
                        aVar2.f3121e.f3183j0 = barrier.getReferencedIds();
                        aVar2.f3121e.f3177g0 = barrier.getType();
                        aVar2.f3121e.f3179h0 = barrier.getMargin();
                    }
                }
                i++;
                aVar = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: f */
    public final void mo3239f(int i, int i2, int i3) {
        HashMap<Integer, C0739a> hashMap = this.f3116f;
        Integer valueOf = Integer.valueOf(R.id.marker_icon);
        if (!hashMap.containsKey(valueOf)) {
            this.f3116f.put(valueOf, new C0739a());
        }
        C0739a aVar = this.f3116f.get(valueOf);
        if (aVar != null) {
            switch (i) {
                case 1:
                    if (i3 == 1) {
                        C0741b bVar = aVar.f3121e;
                        bVar.f3180i = i2;
                        bVar.f3182j = -1;
                    } else if (i3 == 2) {
                        C0741b bVar2 = aVar.f3121e;
                        bVar2.f3182j = i2;
                        bVar2.f3180i = -1;
                    } else {
                        StringBuilder k = C13555b.m33972k("Left to ");
                        k.append(m2246q(i3));
                        k.append(" undefined");
                        throw new IllegalArgumentException(k.toString());
                    }
                    aVar.f3121e.f3144G = 0;
                    return;
                case 2:
                    if (i3 == 1) {
                        C0741b bVar3 = aVar.f3121e;
                        bVar3.f3184k = i2;
                        bVar3.f3186l = -1;
                    } else if (i3 == 2) {
                        C0741b bVar4 = aVar.f3121e;
                        bVar4.f3186l = i2;
                        bVar4.f3184k = -1;
                    } else {
                        StringBuilder k2 = C13555b.m33972k("right to ");
                        k2.append(m2246q(i3));
                        k2.append(" undefined");
                        throw new IllegalArgumentException(k2.toString());
                    }
                    aVar.f3121e.f3145H = 0;
                    return;
                case 3:
                    if (i3 == 3) {
                        C0741b bVar5 = aVar.f3121e;
                        bVar5.f3188m = i2;
                        bVar5.f3190n = -1;
                        bVar5.f3196q = -1;
                        bVar5.f3197r = -1;
                        bVar5.f3198s = -1;
                    } else if (i3 == 4) {
                        C0741b bVar6 = aVar.f3121e;
                        bVar6.f3190n = i2;
                        bVar6.f3188m = -1;
                        bVar6.f3196q = -1;
                        bVar6.f3197r = -1;
                        bVar6.f3198s = -1;
                    } else {
                        StringBuilder k3 = C13555b.m33972k("right to ");
                        k3.append(m2246q(i3));
                        k3.append(" undefined");
                        throw new IllegalArgumentException(k3.toString());
                    }
                    aVar.f3121e.f3146I = 0;
                    return;
                case 4:
                    if (i3 == 4) {
                        C0741b bVar7 = aVar.f3121e;
                        bVar7.f3194p = i2;
                        bVar7.f3192o = -1;
                        bVar7.f3196q = -1;
                        bVar7.f3197r = -1;
                        bVar7.f3198s = -1;
                    } else if (i3 == 3) {
                        C0741b bVar8 = aVar.f3121e;
                        bVar8.f3192o = i2;
                        bVar8.f3194p = -1;
                        bVar8.f3196q = -1;
                        bVar8.f3197r = -1;
                        bVar8.f3198s = -1;
                    } else {
                        StringBuilder k4 = C13555b.m33972k("right to ");
                        k4.append(m2246q(i3));
                        k4.append(" undefined");
                        throw new IllegalArgumentException(k4.toString());
                    }
                    aVar.f3121e.f3147J = 0;
                    return;
                case 5:
                    if (i3 == 5) {
                        C0741b bVar9 = aVar.f3121e;
                        bVar9.f3196q = i2;
                        bVar9.f3194p = -1;
                        bVar9.f3192o = -1;
                        bVar9.f3188m = -1;
                        bVar9.f3190n = -1;
                        return;
                    } else if (i3 == 3) {
                        C0741b bVar10 = aVar.f3121e;
                        bVar10.f3197r = i2;
                        bVar10.f3194p = -1;
                        bVar10.f3192o = -1;
                        bVar10.f3188m = -1;
                        bVar10.f3190n = -1;
                        return;
                    } else if (i3 == 4) {
                        C0741b bVar11 = aVar.f3121e;
                        bVar11.f3198s = i2;
                        bVar11.f3194p = -1;
                        bVar11.f3192o = -1;
                        bVar11.f3188m = -1;
                        bVar11.f3190n = -1;
                        return;
                    } else {
                        StringBuilder k5 = C13555b.m33972k("right to ");
                        k5.append(m2246q(i3));
                        k5.append(" undefined");
                        throw new IllegalArgumentException(k5.toString());
                    }
                case 6:
                    if (i3 == 6) {
                        C0741b bVar12 = aVar.f3121e;
                        bVar12.f3200u = i2;
                        bVar12.f3199t = -1;
                    } else if (i3 == 7) {
                        C0741b bVar13 = aVar.f3121e;
                        bVar13.f3199t = i2;
                        bVar13.f3200u = -1;
                    } else {
                        StringBuilder k6 = C13555b.m33972k("right to ");
                        k6.append(m2246q(i3));
                        k6.append(" undefined");
                        throw new IllegalArgumentException(k6.toString());
                    }
                    aVar.f3121e.f3149L = 0;
                    return;
                case 7:
                    if (i3 == 7) {
                        C0741b bVar14 = aVar.f3121e;
                        bVar14.f3202w = i2;
                        bVar14.f3201v = -1;
                    } else if (i3 == 6) {
                        C0741b bVar15 = aVar.f3121e;
                        bVar15.f3201v = i2;
                        bVar15.f3202w = -1;
                    } else {
                        StringBuilder k7 = C13555b.m33972k("right to ");
                        k7.append(m2246q(i3));
                        k7.append(" undefined");
                        throw new IllegalArgumentException(k7.toString());
                    }
                    aVar.f3121e.f3148K = 0;
                    return;
                default:
                    throw new IllegalArgumentException(m2246q(i) + " to " + m2246q(i3) + " unknown");
            }
        }
    }

    /* renamed from: i */
    public final C0739a mo3240i(int i) {
        if (!this.f3116f.containsKey(Integer.valueOf(i))) {
            this.f3116f.put(Integer.valueOf(i), new C0739a());
        }
        return this.f3116f.get(Integer.valueOf(i));
    }

    /* renamed from: j */
    public final C0739a mo3241j(int i) {
        if (this.f3116f.containsKey(Integer.valueOf(i))) {
            return this.f3116f.get(Integer.valueOf(i));
        }
        return null;
    }

    /* renamed from: k */
    public final void mo3242k(int i, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0739a h = m2241h(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        h.f3121e.f3164a = true;
                    }
                    this.f3116f.put(Integer.valueOf(h.f3117a), h);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01cb, code lost:
        continue;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3243l(android.content.Context r10, android.content.res.XmlResourceParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x01da
            if (r0 == 0) goto L_0x01c8
            r4 = -1
            r5 = 0
            r6 = 2
            r7 = 3
            if (r0 == r6) goto L_0x0067
            if (r0 == r7) goto L_0x0015
            goto L_0x01cb
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r0 = r0.toLowerCase(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2075718416: goto L_0x0045;
                case -190376483: goto L_0x003b;
                case 426575017: goto L_0x0031;
                case 2146106725: goto L_0x0027;
                default: goto L_0x0026;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0026:
            goto L_0x004e
        L_0x0027:
            java.lang.String r8 = "constraintset"
            boolean r0 = r0.equals(r8)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 0
            goto L_0x004e
        L_0x0031:
            java.lang.String r5 = "constraintoverride"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 2
            goto L_0x004e
        L_0x003b:
            java.lang.String r5 = "constraint"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 1
            goto L_0x004e
        L_0x0045:
            java.lang.String r5 = "guideline"
            boolean r0 = r0.equals(r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x004e
            r4 = 3
        L_0x004e:
            if (r4 == 0) goto L_0x0066
            if (r4 == r3) goto L_0x0058
            if (r4 == r6) goto L_0x0058
            if (r4 == r7) goto L_0x0058
            goto L_0x01cb
        L_0x0058:
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.a$a> r0 = r9.f3116f     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r3 = r2.f3117a     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2 = r1
            goto L_0x01cb
        L_0x0066:
            return
        L_0x0067:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            switch(r8) {
                case -2025855158: goto L_0x00d0;
                case -1984451626: goto L_0x00c6;
                case -1962203927: goto L_0x00bc;
                case -1269513683: goto L_0x00b2;
                case -1238332596: goto L_0x00a8;
                case -71750448: goto L_0x009e;
                case 366511058: goto L_0x0093;
                case 1331510167: goto L_0x0089;
                case 1791837707: goto L_0x007e;
                case 1803088381: goto L_0x0074;
                default: goto L_0x0072;
            }     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0072:
            goto L_0x00d9
        L_0x0074:
            java.lang.String r6 = "Constraint"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 0
            goto L_0x00d9
        L_0x007e:
            java.lang.String r6 = "CustomAttribute"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 8
            goto L_0x00d9
        L_0x0089:
            java.lang.String r6 = "Barrier"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 3
            goto L_0x00d9
        L_0x0093:
            java.lang.String r6 = "CustomMethod"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 9
            goto L_0x00d9
        L_0x009e:
            java.lang.String r7 = "Guideline"
            boolean r0 = r0.equals(r7)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 2
            goto L_0x00d9
        L_0x00a8:
            java.lang.String r6 = "Transform"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 5
            goto L_0x00d9
        L_0x00b2:
            java.lang.String r6 = "PropertySet"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 4
            goto L_0x00d9
        L_0x00bc:
            java.lang.String r6 = "ConstraintOverride"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 1
            goto L_0x00d9
        L_0x00c6:
            java.lang.String r6 = "Motion"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 7
            goto L_0x00d9
        L_0x00d0:
            java.lang.String r6 = "Layout"
            boolean r0 = r0.equals(r6)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            if (r0 == 0) goto L_0x00d9
            r4 = 6
        L_0x00d9:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r4) {
                case 0: goto L_0x01be;
                case 1: goto L_0x01b5;
                case 2: goto L_0x01a6;
                case 3: goto L_0x0199;
                case 4: goto L_0x0174;
                case 5: goto L_0x014e;
                case 6: goto L_0x0128;
                case 7: goto L_0x0102;
                case 8: goto L_0x00e0;
                case 9: goto L_0x00e0;
                default: goto L_0x00de;
            }
        L_0x00de:
            goto L_0x01cb
        L_0x00e0:
            if (r2 == 0) goto L_0x00e9
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r0 = r2.f3123g     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.ConstraintAttribute.m2206d(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x00e9:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0102:
            if (r2 == 0) goto L_0x010f
            androidx.constraintlayout.widget.a$c r0 = r2.f3120d     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo3257b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x010f:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0128:
            if (r2 == 0) goto L_0x0135
            androidx.constraintlayout.widget.a$b r0 = r2.f3121e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo3255b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0135:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x014e:
            if (r2 == 0) goto L_0x015b
            androidx.constraintlayout.widget.a$e r0 = r2.f3122f     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo3260b(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x015b:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0174:
            if (r2 == 0) goto L_0x0180
            androidx.constraintlayout.widget.a$d r0 = r2.f3119c     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r0.mo3258a(r10, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01cb
        L_0x0180:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            throw r10     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x0199:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.a$a r0 = m2241h(r10, r0, r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.a$b r2 = r0.f3121e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f3181i0 = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01a6:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.a$a r0 = m2241h(r10, r0, r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.a$b r2 = r0.f3121e     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f3164a = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            r2.f3166b = r3     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01b5:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.a$a r0 = m2241h(r10, r0, r3)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x01c6
        L_0x01be:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            androidx.constraintlayout.widget.a$a r0 = m2241h(r10, r0, r5)     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01c6:
            r2 = r0
            goto L_0x01cb
        L_0x01c8:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
        L_0x01cb:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x01d6, IOException -> 0x01d1 }
            goto L_0x0006
        L_0x01d1:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x01da
        L_0x01d6:
            r10 = move-exception
            r10.printStackTrace()
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0738a.mo3243l(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
