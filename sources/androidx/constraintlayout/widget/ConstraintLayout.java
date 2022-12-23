package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.C0680c;
import androidx.constraintlayout.core.widgets.C0697d;
import androidx.constraintlayout.core.widgets.C0700f;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p002a1.C0037a;
import p002a1.C0040b;
import p002a1.C0042d;
import p305x0.C7129b;

public class ConstraintLayout extends ViewGroup {
    private static C0745b sSharedValues;
    public SparseArray<View> mChildrenByIds = new SparseArray<>();
    /* access modifiers changed from: private */
    public ArrayList<ConstraintHelper> mConstraintHelpers = new ArrayList<>(4);
    public C0037a mConstraintLayoutSpec = null;
    private C0738a mConstraintSet = null;
    private int mConstraintSetId = -1;
    private HashMap<String, Integer> mDesignIds = new HashMap<>();
    public boolean mDirtyHierarchy = true;
    public C0697d mLayoutWidget = new C0697d();
    private int mMaxHeight = Integer.MAX_VALUE;
    private int mMaxWidth = Integer.MAX_VALUE;
    public C0737b mMeasurer = new C0737b(this);
    private int mMinHeight = 0;
    private int mMinWidth = 0;
    /* access modifiers changed from: private */
    public int mOptimizationLevel = 257;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static /* synthetic */ class C0736a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3075a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3075a = r0
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3075a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3075a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3075a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0736a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public class C0737b implements C7129b.C7131b {

        /* renamed from: a */
        public ConstraintLayout f3076a;

        /* renamed from: b */
        public int f3077b;

        /* renamed from: c */
        public int f3078c;

        /* renamed from: d */
        public int f3079d;

        /* renamed from: e */
        public int f3080e;

        /* renamed from: f */
        public int f3081f;

        /* renamed from: g */
        public int f3082g;

        public C0737b(ConstraintLayout constraintLayout) {
            this.f3076a = constraintLayout;
        }

        /* renamed from: a */
        public static boolean m2229a(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:194:0x0294  */
        /* JADX WARNING: Removed duplicated region for block: B:195:0x029b  */
        /* JADX WARNING: Removed duplicated region for block: B:197:0x02a1  */
        /* JADX WARNING: Removed duplicated region for block: B:200:0x02bf  */
        /* JADX WARNING: Removed duplicated region for block: B:201:0x02c1  */
        /* JADX WARNING: Removed duplicated region for block: B:206:0x02cb  */
        /* JADX WARNING: Removed duplicated region for block: B:207:0x02cd  */
        /* JADX WARNING: Removed duplicated region for block: B:210:0x02d4  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo3200b(androidx.constraintlayout.core.widgets.ConstraintWidget r18, p305x0.C7129b.C7130a r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r1.f2429j0
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001b
                boolean r3 = r1.f2390G
                if (r3 != 0) goto L_0x001b
                r2.f22154e = r5
                r2.f22155f = r5
                r2.f22156g = r5
                return
            L_0x001b:
                androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r1.f2406W
                if (r3 != 0) goto L_0x0020
                return
            L_0x0020:
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r3 = r2.f22150a
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = r2.f22151b
                int r6 = r2.f22152c
                int r7 = r2.f22153d
                int r8 = r0.f3077b
                int r9 = r0.f3078c
                int r8 = r8 + r9
                int r9 = r0.f3079d
                java.lang.Object r10 = r1.f2427i0
                android.view.View r10 = (android.view.View) r10
                int[] r11 = androidx.constraintlayout.widget.ConstraintLayout.C0736a.f3075a
                int r12 = r3.ordinal()
                r12 = r11[r12]
                r13 = 3
                r14 = 2
                r15 = 4
                r5 = 1
                if (r12 == r5) goto L_0x00b2
                if (r12 == r14) goto L_0x00aa
                if (r12 == r13) goto L_0x0090
                if (r12 == r15) goto L_0x004a
                r6 = 0
                goto L_0x00b8
            L_0x004a:
                int r6 = r0.f3081f
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int r9 = r1.f2446s
                if (r9 != r5) goto L_0x0057
                r9 = 1
                goto L_0x0058
            L_0x0057:
                r9 = 0
            L_0x0058:
                int r12 = r2.f22159j
                if (r12 == r5) goto L_0x005e
                if (r12 != r14) goto L_0x00b8
            L_0x005e:
                int r12 = r10.getMeasuredHeight()
                int r15 = r18.mo2802o()
                if (r12 != r15) goto L_0x006a
                r12 = 1
                goto L_0x006b
            L_0x006a:
                r12 = 0
            L_0x006b:
                int r15 = r2.f22159j
                if (r15 == r14) goto L_0x0082
                if (r9 == 0) goto L_0x0082
                if (r9 == 0) goto L_0x0075
                if (r12 != 0) goto L_0x0082
            L_0x0075:
                boolean r9 = r10 instanceof androidx.constraintlayout.widget.Placeholder
                if (r9 != 0) goto L_0x0082
                boolean r9 = r18.mo2777E()
                if (r9 == 0) goto L_0x0080
                goto L_0x0082
            L_0x0080:
                r9 = 0
                goto L_0x0083
            L_0x0082:
                r9 = 1
            L_0x0083:
                if (r9 == 0) goto L_0x00b8
                int r6 = r18.mo2807u()
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                goto L_0x00b8
            L_0x0090:
                int r6 = r0.f3081f
                androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r1.f2394K
                if (r12 == 0) goto L_0x009b
                int r12 = r12.f2380g
                r15 = 0
                int r12 = r12 + r15
                goto L_0x009c
            L_0x009b:
                r12 = 0
            L_0x009c:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r15 = r1.f2396M
                if (r15 == 0) goto L_0x00a3
                int r15 = r15.f2380g
                int r12 = r12 + r15
            L_0x00a3:
                int r9 = r9 + r12
                r12 = -1
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                goto L_0x00b8
            L_0x00aa:
                int r6 = r0.f3081f
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                goto L_0x00b8
            L_0x00b2:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            L_0x00b8:
                int r9 = r4.ordinal()
                r9 = r11[r9]
                if (r9 == r5) goto L_0x0136
                if (r9 == r14) goto L_0x012e
                if (r9 == r13) goto L_0x0110
                r7 = 4
                if (r9 == r7) goto L_0x00ca
                r7 = 0
                goto L_0x013c
            L_0x00ca:
                int r7 = r0.f3082g
                r9 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
                int r8 = r1.f2448t
                if (r8 != r5) goto L_0x00d7
                r8 = 1
                goto L_0x00d8
            L_0x00d7:
                r8 = 0
            L_0x00d8:
                int r9 = r2.f22159j
                if (r9 == r5) goto L_0x00de
                if (r9 != r14) goto L_0x013c
            L_0x00de:
                int r9 = r10.getMeasuredWidth()
                int r11 = r18.mo2807u()
                if (r9 != r11) goto L_0x00ea
                r9 = 1
                goto L_0x00eb
            L_0x00ea:
                r9 = 0
            L_0x00eb:
                int r11 = r2.f22159j
                if (r11 == r14) goto L_0x0102
                if (r8 == 0) goto L_0x0102
                if (r8 == 0) goto L_0x00f5
                if (r9 != 0) goto L_0x0102
            L_0x00f5:
                boolean r8 = r10 instanceof androidx.constraintlayout.widget.Placeholder
                if (r8 != 0) goto L_0x0102
                boolean r8 = r18.mo2778F()
                if (r8 == 0) goto L_0x0100
                goto L_0x0102
            L_0x0100:
                r8 = 0
                goto L_0x0103
            L_0x0102:
                r8 = 1
            L_0x0103:
                if (r8 == 0) goto L_0x013c
                int r7 = r18.mo2802o()
                r8 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
                goto L_0x013c
            L_0x0110:
                int r7 = r0.f3082g
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r1.f2394K
                if (r9 == 0) goto L_0x011d
                androidx.constraintlayout.core.widgets.ConstraintAnchor r9 = r1.f2395L
                int r9 = r9.f2380g
                r11 = 0
                int r9 = r9 + r11
                goto L_0x011e
            L_0x011d:
                r9 = 0
            L_0x011e:
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r1.f2396M
                if (r11 == 0) goto L_0x0127
                androidx.constraintlayout.core.widgets.ConstraintAnchor r11 = r1.f2397N
                int r11 = r11.f2380g
                int r9 = r9 + r11
            L_0x0127:
                int r8 = r8 + r9
                r9 = -1
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
                goto L_0x013c
            L_0x012e:
                int r7 = r0.f3082g
                r9 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
                goto L_0x013c
            L_0x0136:
                r8 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            L_0x013c:
                androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r1.f2406W
                androidx.constraintlayout.core.widgets.d r8 = (androidx.constraintlayout.core.widgets.C0697d) r8
                if (r8 == 0) goto L_0x01b4
                androidx.constraintlayout.widget.ConstraintLayout r9 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r9 = r9.mOptimizationLevel
                r11 = 256(0x100, float:3.59E-43)
                boolean r9 = androidx.constraintlayout.core.widgets.C0702g.m2080b(r9, r11)
                if (r9 == 0) goto L_0x01b4
                int r9 = r10.getMeasuredWidth()
                int r11 = r18.mo2807u()
                if (r9 != r11) goto L_0x01b4
                int r9 = r10.getMeasuredWidth()
                int r11 = r8.mo2807u()
                if (r9 >= r11) goto L_0x01b4
                int r9 = r10.getMeasuredHeight()
                int r11 = r18.mo2802o()
                if (r9 != r11) goto L_0x01b4
                int r9 = r10.getMeasuredHeight()
                int r8 = r8.mo2802o()
                if (r9 >= r8) goto L_0x01b4
                int r8 = r10.getBaseline()
                int r9 = r1.f2417d0
                if (r8 != r9) goto L_0x01b4
                boolean r8 = r18.mo2776D()
                if (r8 != 0) goto L_0x01b4
                int r8 = r1.f2392I
                int r9 = r18.mo2807u()
                boolean r8 = m2229a(r8, r6, r9)
                if (r8 == 0) goto L_0x01a0
                int r8 = r1.f2393J
                int r9 = r18.mo2802o()
                boolean r8 = m2229a(r8, r7, r9)
                if (r8 == 0) goto L_0x01a0
                r8 = 1
                goto L_0x01a1
            L_0x01a0:
                r8 = 0
            L_0x01a1:
                if (r8 == 0) goto L_0x01b4
                int r3 = r18.mo2807u()
                r2.f22154e = r3
                int r3 = r18.mo2802o()
                r2.f22155f = r3
                int r1 = r1.f2417d0
                r2.f22156g = r1
                return
            L_0x01b4:
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r3 != r8) goto L_0x01ba
                r9 = 1
                goto L_0x01bb
            L_0x01ba:
                r9 = 0
            L_0x01bb:
                if (r4 != r8) goto L_0x01bf
                r8 = 1
                goto L_0x01c0
            L_0x01bf:
                r8 = 0
            L_0x01c0:
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
                if (r4 == r11) goto L_0x01cb
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                if (r4 != r12) goto L_0x01c9
                goto L_0x01cb
            L_0x01c9:
                r15 = 0
                goto L_0x01cc
            L_0x01cb:
                r15 = 1
            L_0x01cc:
                if (r3 == r11) goto L_0x01d5
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                if (r3 != r4) goto L_0x01d3
                goto L_0x01d5
            L_0x01d3:
                r3 = 0
                goto L_0x01d6
            L_0x01d5:
                r3 = 1
            L_0x01d6:
                r4 = 0
                if (r9 == 0) goto L_0x01e1
                float r11 = r1.f2409Z
                int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r11 <= 0) goto L_0x01e1
                r11 = 1
                goto L_0x01e2
            L_0x01e1:
                r11 = 0
            L_0x01e2:
                if (r8 == 0) goto L_0x01ec
                float r12 = r1.f2409Z
                int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
                if (r4 <= 0) goto L_0x01ec
                r4 = 1
                goto L_0x01ed
            L_0x01ec:
                r4 = 0
            L_0x01ed:
                if (r10 != 0) goto L_0x01f0
                return
            L_0x01f0:
                android.view.ViewGroup$LayoutParams r12 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r12 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r12
                int r13 = r2.f22159j
                if (r13 == r5) goto L_0x0210
                if (r13 == r14) goto L_0x0210
                if (r9 == 0) goto L_0x0210
                int r9 = r1.f2446s
                if (r9 != 0) goto L_0x0210
                if (r8 == 0) goto L_0x0210
                int r8 = r1.f2448t
                if (r8 == 0) goto L_0x0209
                goto L_0x0210
            L_0x0209:
                r0 = 0
                r3 = 0
                r4 = -1
                r13 = 0
            L_0x020d:
                r15 = 0
                goto L_0x02bd
            L_0x0210:
                boolean r8 = r10 instanceof androidx.constraintlayout.widget.VirtualLayout
                if (r8 == 0) goto L_0x0222
                boolean r8 = r1 instanceof androidx.constraintlayout.core.widgets.C0704i
                if (r8 == 0) goto L_0x0222
                r8 = r1
                androidx.constraintlayout.core.widgets.i r8 = (androidx.constraintlayout.core.widgets.C0704i) r8
                r9 = r10
                androidx.constraintlayout.widget.VirtualLayout r9 = (androidx.constraintlayout.widget.VirtualLayout) r9
                r9.mo2900u(r8, r6, r7)
                goto L_0x0225
            L_0x0222:
                r10.measure(r6, r7)
            L_0x0225:
                r1.f2392I = r6
                r1.f2393J = r7
                r8 = 0
                r1.f2422g = r8
                int r8 = r10.getMeasuredWidth()
                int r9 = r10.getMeasuredHeight()
                int r13 = r10.getBaseline()
                int r14 = r1.f2452v
                if (r14 <= 0) goto L_0x0241
                int r14 = java.lang.Math.max(r14, r8)
                goto L_0x0242
            L_0x0241:
                r14 = r8
            L_0x0242:
                int r5 = r1.f2454w
                if (r5 <= 0) goto L_0x024a
                int r14 = java.lang.Math.min(r5, r14)
            L_0x024a:
                int r5 = r1.f2456y
                if (r5 <= 0) goto L_0x0255
                int r5 = java.lang.Math.max(r5, r9)
                r16 = r6
                goto L_0x0258
            L_0x0255:
                r16 = r6
                r5 = r9
            L_0x0258:
                int r6 = r1.f2457z
                if (r6 <= 0) goto L_0x0260
                int r5 = java.lang.Math.min(r6, r5)
            L_0x0260:
                androidx.constraintlayout.widget.ConstraintLayout r6 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r6 = r6.mOptimizationLevel
                r0 = 1
                boolean r6 = androidx.constraintlayout.core.widgets.C0702g.m2080b(r6, r0)
                if (r6 != 0) goto L_0x0287
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r11 == 0) goto L_0x027c
                if (r15 == 0) goto L_0x027c
                float r3 = r1.f2409Z
                float r4 = (float) r5
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r15 = r0
                goto L_0x0288
            L_0x027c:
                if (r4 == 0) goto L_0x0287
                if (r3 == 0) goto L_0x0287
                float r3 = r1.f2409Z
                float r4 = (float) r14
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r5 = r0
            L_0x0287:
                r15 = r14
            L_0x0288:
                if (r8 != r15) goto L_0x0292
                if (r9 == r5) goto L_0x028d
                goto L_0x0292
            L_0x028d:
                r3 = r5
                r0 = r15
                r4 = -1
                goto L_0x020d
            L_0x0292:
                if (r8 == r15) goto L_0x029b
                r0 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
                goto L_0x029f
            L_0x029b:
                r0 = 1073741824(0x40000000, float:2.0)
                r6 = r16
            L_0x029f:
                if (r9 == r5) goto L_0x02a5
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            L_0x02a5:
                r10.measure(r6, r7)
                r1.f2392I = r6
                r1.f2393J = r7
                r15 = 0
                r1.f2422g = r15
                int r0 = r10.getMeasuredWidth()
                int r3 = r10.getMeasuredHeight()
                int r4 = r10.getBaseline()
                r13 = r4
                r4 = -1
            L_0x02bd:
                if (r13 == r4) goto L_0x02c1
                r4 = 1
                goto L_0x02c2
            L_0x02c1:
                r4 = 0
            L_0x02c2:
                int r5 = r2.f22152c
                if (r0 != r5) goto L_0x02cd
                int r5 = r2.f22153d
                if (r3 == r5) goto L_0x02cb
                goto L_0x02cd
            L_0x02cb:
                r5 = 0
                goto L_0x02ce
            L_0x02cd:
                r5 = 1
            L_0x02ce:
                r2.f22158i = r5
                boolean r5 = r12.f3036c0
                if (r5 == 0) goto L_0x02d5
                r4 = 1
            L_0x02d5:
                if (r4 == 0) goto L_0x02e1
                r5 = -1
                if (r13 == r5) goto L_0x02e1
                int r1 = r1.f2417d0
                if (r1 == r13) goto L_0x02e1
                r1 = 1
                r2.f22158i = r1
            L_0x02e1:
                r2.f22154e = r0
                r2.f22155f = r3
                r2.f22157h = r4
                r2.f22156g = r13
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0737b.mo3200b(androidx.constraintlayout.core.widgets.ConstraintWidget, x0.b$a):void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        init((AttributeSet) null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public static C0745b getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new C0745b();
        }
        return sSharedValues;
    }

    private final ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f3064q0;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        C0697d dVar = this.mLayoutWidget;
        dVar.f2427i0 = this;
        C0737b bVar = this.mMeasurer;
        dVar.f2510A0 = bVar;
        dVar.f2529y0.f22167f = bVar;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0042d.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0042d.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == C0042d.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == C0042d.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == C0042d.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == C0042d.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == C0042d.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == C0042d.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0738a aVar = new C0738a();
                        this.mConstraintSet = aVar;
                        aVar.mo3242k(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        C0697d dVar2 = this.mLayoutWidget;
        dVar2.f2519J0 = this.mOptimizationLevel;
        C0680c.f2351p = dVar2.mo2837Z(512);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00be, code lost:
        r8 = r4.f3004i.get(java.lang.Integer.valueOf(r8));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void setChildrenConstraints() {
        /*
            r12 = this;
            boolean r6 = r12.isInEditMode()
            int r7 = r12.getChildCount()
            r0 = 0
            r1 = 0
        L_0x000a:
            if (r1 >= r7) goto L_0x001d
            android.view.View r2 = r12.getChildAt(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r12.getViewWidget(r2)
            if (r2 != 0) goto L_0x0017
            goto L_0x001a
        L_0x0017:
            r2.mo2779G()
        L_0x001a:
            int r1 = r1 + 1
            goto L_0x000a
        L_0x001d:
            r1 = -1
            if (r6 == 0) goto L_0x0059
            r2 = 0
        L_0x0021:
            if (r2 >= r7) goto L_0x0059
            android.view.View r3 = r12.getChildAt(r2)
            android.content.res.Resources r4 = r12.getResources()     // Catch:{ NotFoundException -> 0x0056 }
            int r5 = r3.getId()     // Catch:{ NotFoundException -> 0x0056 }
            java.lang.String r4 = r4.getResourceName(r5)     // Catch:{ NotFoundException -> 0x0056 }
            int r5 = r3.getId()     // Catch:{ NotFoundException -> 0x0056 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NotFoundException -> 0x0056 }
            r12.setDesignInformation(r0, r4, r5)     // Catch:{ NotFoundException -> 0x0056 }
            r5 = 47
            int r5 = r4.indexOf(r5)     // Catch:{ NotFoundException -> 0x0056 }
            if (r5 == r1) goto L_0x004c
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)     // Catch:{ NotFoundException -> 0x0056 }
        L_0x004c:
            int r3 = r3.getId()     // Catch:{ NotFoundException -> 0x0056 }
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r12.getTargetWidget(r3)     // Catch:{ NotFoundException -> 0x0056 }
            r3.f2433l0 = r4     // Catch:{ NotFoundException -> 0x0056 }
        L_0x0056:
            int r2 = r2 + 1
            goto L_0x0021
        L_0x0059:
            int r2 = r12.mConstraintSetId
            if (r2 == r1) goto L_0x007b
            r2 = 0
        L_0x005e:
            if (r2 >= r7) goto L_0x007b
            android.view.View r3 = r12.getChildAt(r2)
            int r4 = r3.getId()
            int r5 = r12.mConstraintSetId
            if (r4 != r5) goto L_0x0078
            boolean r4 = r3 instanceof androidx.constraintlayout.widget.Constraints
            if (r4 == 0) goto L_0x0078
            androidx.constraintlayout.widget.Constraints r3 = (androidx.constraintlayout.widget.Constraints) r3
            androidx.constraintlayout.widget.a r3 = r3.getConstraintSet()
            r12.mConstraintSet = r3
        L_0x0078:
            int r2 = r2 + 1
            goto L_0x005e
        L_0x007b:
            androidx.constraintlayout.widget.a r2 = r12.mConstraintSet
            if (r2 == 0) goto L_0x0082
            r2.mo3237c(r12)
        L_0x0082:
            androidx.constraintlayout.core.widgets.d r2 = r12.mLayoutWidget
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r2.f21718w0
            r2.clear()
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r2 = r12.mConstraintHelpers
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x00f7
            r3 = 0
        L_0x0092:
            if (r3 >= r2) goto L_0x00f7
            java.util.ArrayList<androidx.constraintlayout.widget.ConstraintHelper> r4 = r12.mConstraintHelpers
            java.lang.Object r4 = r4.get(r3)
            androidx.constraintlayout.widget.ConstraintHelper r4 = (androidx.constraintlayout.widget.ConstraintHelper) r4
            boolean r5 = r4.isInEditMode()
            if (r5 == 0) goto L_0x00a7
            java.lang.String r5 = r4.f3001f
            r4.setIds(r5)
        L_0x00a7:
            w0.b r5 = r4.f3000e
            if (r5 != 0) goto L_0x00ac
            goto L_0x00f4
        L_0x00ac:
            r5.mo23204b()
            r5 = 0
        L_0x00b0:
            int r8 = r4.f2998c
            if (r5 >= r8) goto L_0x00ef
            int[] r8 = r4.f2997b
            r8 = r8[r5]
            android.view.View r9 = r12.getViewById(r8)
            if (r9 != 0) goto L_0x00e1
            java.util.HashMap<java.lang.Integer, java.lang.String> r10 = r4.f3004i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r8 = r10.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            int r10 = r4.mo3160k(r12, r8)
            if (r10 == 0) goto L_0x00e1
            int[] r9 = r4.f2997b
            r9[r5] = r10
            java.util.HashMap<java.lang.Integer, java.lang.String> r9 = r4.f3004i
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r9.put(r11, r8)
            android.view.View r9 = r12.getViewById(r10)
        L_0x00e1:
            if (r9 == 0) goto L_0x00ec
            w0.b r8 = r4.f3000e
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r12.getViewWidget(r9)
            r8.mo23203a(r9)
        L_0x00ec:
            int r5 = r5 + 1
            goto L_0x00b0
        L_0x00ef:
            w0.b r4 = r4.f3000e
            r4.mo2850c()
        L_0x00f4:
            int r3 = r3 + 1
            goto L_0x0092
        L_0x00f7:
            r2 = 0
        L_0x00f8:
            if (r2 >= r7) goto L_0x0131
            android.view.View r3 = r12.getChildAt(r2)
            boolean r4 = r3 instanceof androidx.constraintlayout.widget.Placeholder
            if (r4 == 0) goto L_0x012e
            androidx.constraintlayout.widget.Placeholder r3 = (androidx.constraintlayout.widget.Placeholder) r3
            int r4 = r3.f3099b
            if (r4 != r1) goto L_0x0113
            boolean r4 = r3.isInEditMode()
            if (r4 != 0) goto L_0x0113
            int r4 = r3.f3101d
            r3.setVisibility(r4)
        L_0x0113:
            int r4 = r3.f3099b
            android.view.View r4 = r12.findViewById(r4)
            r3.f3100c = r4
            if (r4 == 0) goto L_0x012e
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r4
            r5 = 1
            r4.f3042f0 = r5
            android.view.View r4 = r3.f3100c
            r4.setVisibility(r0)
            r3.setVisibility(r0)
        L_0x012e:
            int r2 = r2 + 1
            goto L_0x00f8
        L_0x0131:
            android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r12.mTempMapIdToWidget
            r1.clear()
            android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r12.mTempMapIdToWidget
            androidx.constraintlayout.core.widgets.d r2 = r12.mLayoutWidget
            r1.put(r0, r2)
            android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r12.mTempMapIdToWidget
            int r2 = r12.getId()
            androidx.constraintlayout.core.widgets.d r3 = r12.mLayoutWidget
            r1.put(r2, r3)
            r1 = 0
        L_0x0149:
            if (r1 >= r7) goto L_0x015f
            android.view.View r2 = r12.getChildAt(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r12.getViewWidget(r2)
            android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r4 = r12.mTempMapIdToWidget
            int r2 = r2.getId()
            r4.put(r2, r3)
            int r1 = r1 + 1
            goto L_0x0149
        L_0x015f:
            r8 = 0
        L_0x0160:
            if (r8 >= r7) goto L_0x0195
            android.view.View r2 = r12.getChildAt(r8)
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r12.getViewWidget(r2)
            if (r3 != 0) goto L_0x016d
            goto L_0x0192
        L_0x016d:
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            r4 = r0
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r4
            androidx.constraintlayout.core.widgets.d r0 = r12.mLayoutWidget
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r0.f21718w0
            r1.add(r3)
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r3.f2406W
            if (r1 == 0) goto L_0x0189
            w0.c r1 = (p292w0.C6962c) r1
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r1 = r1.f21718w0
            r1.remove(r3)
            r3.mo2779G()
        L_0x0189:
            r3.f2406W = r0
            android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r5 = r12.mTempMapIdToWidget
            r0 = r12
            r1 = r6
            r0.applyConstraintsFromLayoutParams(r1, r2, r3, r4, r5)
        L_0x0192:
            int r8 = r8 + 1
            goto L_0x0160
        L_0x0195:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.setChildrenConstraints():void");
    }

    private void setWidgetBaseline(ConstraintWidget constraintWidget, LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray, int i, ConstraintAnchor.Type type) {
        View view = this.mChildrenByIds.get(i);
        ConstraintWidget constraintWidget2 = sparseArray.get(i);
        if (constraintWidget2 != null && view != null && (view.getLayoutParams() instanceof LayoutParams)) {
            layoutParams.f3036c0 = true;
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
            if (type == type2) {
                LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                layoutParams2.f3036c0 = true;
                layoutParams2.f3064q0.f2389F = true;
            }
            constraintWidget.mo2800m(type2).mo2761b(constraintWidget2.mo2800m(type), layoutParams.f3008D, layoutParams.f3007C, true);
            constraintWidget.f2389F = true;
            constraintWidget.mo2800m(ConstraintAnchor.Type.TOP).mo2769j();
            constraintWidget.mo2800m(ConstraintAnchor.Type.BOTTOM).mo2769j();
        }
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:153:0x02d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void applyConstraintsFromLayoutParams(boolean r18, android.view.View r19, androidx.constraintlayout.core.widgets.ConstraintWidget r20, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r21, android.util.SparseArray<androidx.constraintlayout.core.widgets.ConstraintWidget> r22) {
        /*
            r17 = this;
            r0 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r21.mo3198a()
            int r1 = r19.getVisibility()
            r6.f2429j0 = r1
            boolean r1 = r7.f3042f0
            r9 = 1
            if (r1 == 0) goto L_0x001c
            r6.f2390G = r9
            r1 = 8
            r6.f2429j0 = r1
        L_0x001c:
            r6.f2427i0 = r0
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r1 == 0) goto L_0x002e
            androidx.constraintlayout.widget.ConstraintHelper r0 = (androidx.constraintlayout.widget.ConstraintHelper) r0
            r10 = r17
            androidx.constraintlayout.core.widgets.d r1 = r10.mLayoutWidget
            boolean r1 = r1.f2511B0
            r0.mo2875p(r6, r1)
            goto L_0x0030
        L_0x002e:
            r10 = r17
        L_0x0030:
            boolean r0 = r7.f3038d0
            r11 = -1
            if (r0 == 0) goto L_0x0066
            r0 = r6
            androidx.constraintlayout.core.widgets.f r0 = (androidx.constraintlayout.core.widgets.C0700f) r0
            int r1 = r7.f3058n0
            int r2 = r7.f3060o0
            float r3 = r7.f3062p0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 == 0) goto L_0x004e
            if (r5 <= 0) goto L_0x033f
            r0.f2576w0 = r3
            r0.f2577x0 = r11
            r0.f2578y0 = r11
            goto L_0x033f
        L_0x004e:
            if (r1 == r11) goto L_0x005a
            if (r1 <= r11) goto L_0x033f
            r0.f2576w0 = r4
            r0.f2577x0 = r1
            r0.f2578y0 = r11
            goto L_0x033f
        L_0x005a:
            if (r2 == r11) goto L_0x033f
            if (r2 <= r11) goto L_0x033f
            r0.f2576w0 = r4
            r0.f2577x0 = r11
            r0.f2578y0 = r2
            goto L_0x033f
        L_0x0066:
            int r0 = r7.f3044g0
            int r1 = r7.f3046h0
            int r12 = r7.f3048i0
            int r13 = r7.f3050j0
            int r5 = r7.f3052k0
            int r14 = r7.f3054l0
            float r15 = r7.f3056m0
            int r2 = r7.f3061p
            r4 = 0
            if (r2 == r11) goto L_0x0099
            java.lang.Object r0 = r8.get(r2)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x0095
            float r8 = r7.f3065r
            int r5 = r7.f3063q
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER
            r12 = 0
            r0 = r20
            r1 = r3
            r13 = 0
            r4 = r5
            r5 = r12
            r0.mo2812z(r1, r2, r3, r4, r5)
            r6.f2388E = r8
            goto L_0x0096
        L_0x0095:
            r13 = 0
        L_0x0096:
            r9 = 0
            goto L_0x01a6
        L_0x0099:
            if (r0 == r11) goto L_0x00b6
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x00b4
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            int r1 = r7.leftMargin
            r0 = r20
            r16 = r1
            r1 = r3
            r9 = 0
            r4 = r16
            r0.mo2812z(r1, r2, r3, r4, r5)
            goto L_0x00cd
        L_0x00b4:
            r9 = 0
            goto L_0x00cd
        L_0x00b6:
            r9 = 0
            if (r1 == r11) goto L_0x00cd
            java.lang.Object r0 = r8.get(r1)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x00cd
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            int r4 = r7.leftMargin
            r0 = r20
            r0.mo2812z(r1, r2, r3, r4, r5)
        L_0x00cd:
            if (r12 == r11) goto L_0x00e5
            java.lang.Object r0 = r8.get(r12)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x00fb
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            int r4 = r7.rightMargin
            r0 = r20
            r5 = r14
            r0.mo2812z(r1, r2, r3, r4, r5)
            goto L_0x00fb
        L_0x00e5:
            if (r13 == r11) goto L_0x00fb
            java.lang.Object r0 = r8.get(r13)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x00fb
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            int r4 = r7.rightMargin
            r0 = r20
            r1 = r3
            r5 = r14
            r0.mo2812z(r1, r2, r3, r4, r5)
        L_0x00fb:
            int r0 = r7.f3047i
            if (r0 == r11) goto L_0x0115
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x012f
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            int r4 = r7.topMargin
            int r5 = r7.f3071x
            r0 = r20
            r1 = r3
            r0.mo2812z(r1, r2, r3, r4, r5)
            goto L_0x012f
        L_0x0115:
            int r0 = r7.f3049j
            if (r0 == r11) goto L_0x012f
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x012f
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            int r4 = r7.topMargin
            int r5 = r7.f3071x
            r0 = r20
            r0.mo2812z(r1, r2, r3, r4, r5)
        L_0x012f:
            int r0 = r7.f3051k
            if (r0 == r11) goto L_0x014a
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x0163
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            int r4 = r7.bottomMargin
            int r5 = r7.f3073z
            r0 = r20
            r0.mo2812z(r1, r2, r3, r4, r5)
            goto L_0x0163
        L_0x014a:
            int r0 = r7.f3053l
            if (r0 == r11) goto L_0x0163
            java.lang.Object r0 = r8.get(r0)
            r2 = r0
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x0163
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            int r4 = r7.bottomMargin
            int r5 = r7.f3073z
            r0 = r20
            r1 = r3
            r0.mo2812z(r1, r2, r3, r4, r5)
        L_0x0163:
            int r4 = r7.f3055m
            if (r4 == r11) goto L_0x0175
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = r22
            r0.setWidgetBaseline(r1, r2, r3, r4, r5)
            goto L_0x0198
        L_0x0175:
            int r4 = r7.f3057n
            if (r4 == r11) goto L_0x0187
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = r22
            r0.setWidgetBaseline(r1, r2, r3, r4, r5)
            goto L_0x0198
        L_0x0187:
            int r4 = r7.f3059o
            if (r4 == r11) goto L_0x0198
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r5 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            r0 = r17
            r1 = r20
            r2 = r21
            r3 = r22
            r0.setWidgetBaseline(r1, r2, r3, r4, r5)
        L_0x0198:
            int r0 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x019e
            r6.f2423g0 = r15
        L_0x019e:
            float r0 = r7.f3010F
            int r1 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r1 < 0) goto L_0x01a6
            r6.f2425h0 = r0
        L_0x01a6:
            if (r18 == 0) goto L_0x01b6
            int r0 = r7.f3024T
            if (r0 != r11) goto L_0x01b0
            int r1 = r7.f3025U
            if (r1 == r11) goto L_0x01b6
        L_0x01b0:
            int r1 = r7.f3025U
            r6.f2413b0 = r0
            r6.f2415c0 = r1
        L_0x01b6:
            boolean r0 = r7.f3032a0
            r1 = -2
            r2 = 0
            if (r0 != 0) goto L_0x01ed
            int r0 = r7.width
            if (r0 != r11) goto L_0x01e4
            boolean r0 = r7.f3027W
            if (r0 == 0) goto L_0x01ca
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r6.mo2786P(r0)
            goto L_0x01cf
        L_0x01ca:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            r6.mo2786P(r0)
        L_0x01cf:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mo2800m(r0)
            int r3 = r7.leftMargin
            r0.f2380g = r3
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mo2800m(r0)
            int r3 = r7.rightMargin
            r0.f2380g = r3
            goto L_0x0200
        L_0x01e4:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r6.mo2786P(r0)
            r6.mo2788R(r2)
            goto L_0x0200
        L_0x01ed:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6.mo2786P(r0)
            int r0 = r7.width
            r6.mo2788R(r0)
            int r0 = r7.width
            if (r0 != r1) goto L_0x0200
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r6.mo2786P(r0)
        L_0x0200:
            boolean r0 = r7.f3034b0
            if (r0 != 0) goto L_0x0235
            int r0 = r7.height
            if (r0 != r11) goto L_0x022c
            boolean r0 = r7.f3028X
            if (r0 == 0) goto L_0x0212
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r6.mo2787Q(r0)
            goto L_0x0217
        L_0x0212:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            r6.mo2787Q(r0)
        L_0x0217:
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mo2800m(r0)
            int r1 = r7.topMargin
            r0.f2380g = r1
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r0 = r6.mo2800m(r0)
            int r1 = r7.bottomMargin
            r0.f2380g = r1
            goto L_0x0248
        L_0x022c:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r6.mo2787Q(r0)
            r6.mo2785O(r2)
            goto L_0x0248
        L_0x0235:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r6.mo2787Q(r0)
            int r0 = r7.height
            r6.mo2785O(r0)
            int r0 = r7.height
            if (r0 != r1) goto L_0x0248
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r6.mo2787Q(r0)
        L_0x0248:
            java.lang.String r0 = r7.f3011G
            if (r0 == 0) goto L_0x02dc
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0254
            goto L_0x02dc
        L_0x0254:
            int r1 = r0.length()
            r3 = 44
            int r3 = r0.indexOf(r3)
            if (r3 <= 0) goto L_0x0281
            int r4 = r1 + -1
            if (r3 >= r4) goto L_0x0281
            java.lang.String r4 = r0.substring(r2, r3)
            java.lang.String r5 = "W"
            boolean r5 = r4.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0273
            r4 = 1
            r11 = 0
            goto L_0x027f
        L_0x0273:
            java.lang.String r5 = "H"
            boolean r4 = r4.equalsIgnoreCase(r5)
            if (r4 == 0) goto L_0x027e
            r4 = 1
            r11 = 1
            goto L_0x027f
        L_0x027e:
            r4 = 1
        L_0x027f:
            int r3 = r3 + r4
            goto L_0x0283
        L_0x0281:
            r4 = 1
            r3 = 0
        L_0x0283:
            r5 = 58
            int r5 = r0.indexOf(r5)
            if (r5 < 0) goto L_0x02c2
            int r1 = r1 - r4
            if (r5 >= r1) goto L_0x02c2
            java.lang.String r1 = r0.substring(r3, r5)
            int r5 = r5 + r4
            java.lang.String r0 = r0.substring(r5)
            int r3 = r1.length()
            if (r3 <= 0) goto L_0x02d2
            int r3 = r0.length()
            if (r3 <= 0) goto L_0x02d2
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x02d1 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x02d1 }
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x02d2
            int r3 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r3 <= 0) goto L_0x02d2
            r3 = 1
            if (r11 != r3) goto L_0x02bc
            float r0 = r0 / r1
            float r4 = java.lang.Math.abs(r0)     // Catch:{ NumberFormatException -> 0x02d1 }
            goto L_0x02d3
        L_0x02bc:
            float r1 = r1 / r0
            float r4 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x02d1 }
            goto L_0x02d3
        L_0x02c2:
            java.lang.String r0 = r0.substring(r3)
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x02d2
            float r4 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x02d1 }
            goto L_0x02d3
        L_0x02d1:
        L_0x02d2:
            r4 = 0
        L_0x02d3:
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x02de
            r6.f2409Z = r4
            r6.f2411a0 = r11
            goto L_0x02de
        L_0x02dc:
            r6.f2409Z = r9
        L_0x02de:
            float r0 = r7.f3012H
            float[] r1 = r6.f2441p0
            r1[r2] = r0
            float r0 = r7.f3013I
            r3 = 1
            r1[r3] = r0
            int r0 = r7.f3014J
            r6.f2437n0 = r0
            int r0 = r7.f3015K
            r6.f2439o0 = r0
            int r0 = r7.f3030Z
            if (r0 < 0) goto L_0x02fa
            r1 = 3
            if (r0 > r1) goto L_0x02fa
            r6.f2444r = r0
        L_0x02fa:
            int r0 = r7.f3016L
            int r1 = r7.f3018N
            int r3 = r7.f3020P
            float r4 = r7.f3022R
            r6.f2446s = r0
            r6.f2452v = r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r3 != r1) goto L_0x030c
            r3 = 0
        L_0x030c:
            r6.f2454w = r3
            r6.f2455x = r4
            r3 = 2
            r5 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x031f
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x031f
            if (r0 != 0) goto L_0x031f
            r6.f2446s = r3
        L_0x031f:
            int r0 = r7.f3017M
            int r4 = r7.f3019O
            int r8 = r7.f3021Q
            float r7 = r7.f3023S
            r6.f2448t = r0
            r6.f2456y = r4
            if (r8 != r1) goto L_0x032e
            goto L_0x032f
        L_0x032e:
            r2 = r8
        L_0x032f:
            r6.f2457z = r2
            r6.f2384A = r7
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x033f
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x033f
            if (r0 != 0) goto L_0x033f
            r6.f2448t = r3
        L_0x033f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.applyConstraintsFromLayoutParams(boolean, android.view.View, androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.widget.ConstraintLayout$LayoutParams, android.util.SparseArray):void");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).mo2903r(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = (float) i3;
                        float f2 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i4;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f2;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f6, f7, f9, paint3);
                        float f11 = parseInt4;
                        float f12 = f5;
                        canvas2.drawLine(f8, f11, f12, f9, paint3);
                        float f13 = f5;
                        canvas2.drawLine(f13, f11, f12, f3, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f14 = f2;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f13, f3, f14, parseInt4, paint6);
                        canvas2.drawLine(f13, parseInt4, f14, f3, paint6);
                    }
                }
            }
        }
    }

    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.f2519J0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.mLayoutWidget.f2430k == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.f2430k = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.f2430k = "parent";
            }
        }
        C0697d dVar = this.mLayoutWidget;
        if (dVar.f2433l0 == null) {
            dVar.f2433l0 = dVar.f2430k;
            String str = this.mLayoutWidget.f2433l0;
        }
        Iterator<ConstraintWidget> it = this.mLayoutWidget.f21718w0.iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            View view = (View) next.f2427i0;
            if (view != null) {
                if (next.f2430k == null && (id = view.getId()) != -1) {
                    next.f2430k = getContext().getResources().getResourceEntryName(id);
                }
                if (next.f2433l0 == null) {
                    next.f2433l0 = next.f2430k;
                }
            }
        }
        this.mLayoutWidget.mo2805r(sb);
        return sb.toString();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f3064q0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof LayoutParams) {
            return ((LayoutParams) view.getLayoutParams()).f3064q0;
        }
        return null;
    }

    public boolean isRtl() {
        boolean z;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.f3064q0;
            if ((childAt.getVisibility() != 8 || layoutParams.f3038d0 || layoutParams.f3040e0 || isInEditMode) && !layoutParams.f3042f0) {
                int v = constraintWidget.mo2808v();
                int w = constraintWidget.mo2809w();
                int u = constraintWidget.mo2807u() + v;
                int o = constraintWidget.mo2802o() + w;
                childAt.layout(v, w, u, o);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(v, w, u, o);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).mo2902q();
            }
        }
    }

    public void onMeasure(int i, int i2) {
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                } else if (getChildAt(i3).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        this.mLayoutWidget.f2511B0 = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                C0697d dVar = this.mLayoutWidget;
                dVar.f2528x0.mo23381c(dVar);
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        int u = this.mLayoutWidget.mo2807u();
        int o = this.mLayoutWidget.mo2802o();
        C0697d dVar2 = this.mLayoutWidget;
        resolveMeasuredDimension(i, i2, u, o, dVar2.f2520K0, dVar2.f2521L0);
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof C0700f)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            C0700f fVar = new C0700f();
            layoutParams.f3064q0 = fVar;
            layoutParams.f3038d0 = true;
            fVar.mo2848V(layoutParams.f3026V);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.mo3168t();
            ((LayoutParams) view.getLayoutParams()).f3040e0 = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.f21718w0.remove(viewWidget);
        viewWidget.mo2779G();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new C0037a(getContext(), this, i);
    }

    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C0737b bVar = this.mMeasurer;
        int i5 = bVar.f3080e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + bVar.f3079d, i, 0);
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:373:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void resolveSystem(androidx.constraintlayout.core.widgets.C0697d r22, int r23, int r24, int r25) {
        /*
            r21 = this;
            r6 = r22
            r7 = r23
            int r8 = android.view.View.MeasureSpec.getMode(r24)
            int r0 = android.view.View.MeasureSpec.getSize(r24)
            int r9 = android.view.View.MeasureSpec.getMode(r25)
            int r1 = android.view.View.MeasureSpec.getSize(r25)
            int r2 = r21.getPaddingTop()
            r10 = 0
            int r11 = java.lang.Math.max(r10, r2)
            int r2 = r21.getPaddingBottom()
            int r2 = java.lang.Math.max(r10, r2)
            int r3 = r11 + r2
            int r4 = r21.getPaddingWidth()
            r12 = r21
            androidx.constraintlayout.widget.ConstraintLayout$b r5 = r12.mMeasurer
            r5.f3077b = r11
            r5.f3078c = r2
            r5.f3079d = r4
            r5.f3080e = r3
            r2 = r24
            r5.f3081f = r2
            r2 = r25
            r5.f3082g = r2
            int r2 = r21.getPaddingStart()
            int r2 = java.lang.Math.max(r10, r2)
            int r5 = r21.getPaddingEnd()
            int r5 = java.lang.Math.max(r10, r5)
            if (r2 > 0) goto L_0x005d
            if (r5 <= 0) goto L_0x0054
            goto L_0x005d
        L_0x0054:
            int r2 = r21.getPaddingLeft()
            int r2 = java.lang.Math.max(r10, r2)
            goto L_0x0065
        L_0x005d:
            boolean r13 = r21.isRtl()
            if (r13 == 0) goto L_0x0065
            r13 = r5
            goto L_0x0066
        L_0x0065:
            r13 = r2
        L_0x0066:
            int r14 = r0 - r4
            int r15 = r1 - r3
            r0 = r21
            r1 = r22
            r2 = r8
            r3 = r14
            r4 = r9
            r5 = r15
            r0.setSelfDimensionBehaviour(r1, r2, r3, r4, r5)
            r6.f2513D0 = r13
            r6.f2514E0 = r11
            x0.b r0 = r6.f2528x0
            r0.getClass()
            x0.b$b r1 = r6.f2510A0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r2 = r6.f21718w0
            int r2 = r2.size()
            int r3 = r22.mo2807u()
            int r4 = r22.mo2802o()
            r5 = 128(0x80, float:1.794E-43)
            boolean r5 = androidx.constraintlayout.core.widgets.C0702g.m2080b(r7, r5)
            r11 = 64
            if (r5 != 0) goto L_0x00a1
            boolean r7 = androidx.constraintlayout.core.widgets.C0702g.m2080b(r7, r11)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r7 = 0
            goto L_0x00a2
        L_0x00a1:
            r7 = 1
        L_0x00a2:
            r16 = 0
            if (r7 == 0) goto L_0x0102
            r11 = 0
        L_0x00a7:
            if (r11 >= r2) goto L_0x0102
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r13 = r6.f21718w0
            java.lang.Object r13 = r13.get(r11)
            androidx.constraintlayout.core.widgets.ConstraintWidget r13 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r13
            r23 = r7
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r13.f2405V
            r12 = r7[r10]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r12 != r10) goto L_0x00bd
            r12 = 1
            goto L_0x00be
        L_0x00bd:
            r12 = 0
        L_0x00be:
            r17 = 1
            r7 = r7[r17]
            if (r7 != r10) goto L_0x00c6
            r7 = 1
            goto L_0x00c7
        L_0x00c6:
            r7 = 0
        L_0x00c7:
            if (r12 == 0) goto L_0x00d3
            if (r7 == 0) goto L_0x00d3
            float r7 = r13.f2409Z
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d3
            r7 = 1
            goto L_0x00d4
        L_0x00d3:
            r7 = 0
        L_0x00d4:
            boolean r10 = r13.mo2774B()
            if (r10 == 0) goto L_0x00dd
            if (r7 == 0) goto L_0x00dd
            goto L_0x0100
        L_0x00dd:
            boolean r10 = r13.mo2775C()
            if (r10 == 0) goto L_0x00e6
            if (r7 == 0) goto L_0x00e6
            goto L_0x0100
        L_0x00e6:
            boolean r7 = r13 instanceof androidx.constraintlayout.core.widgets.C0704i
            if (r7 == 0) goto L_0x00eb
            goto L_0x0100
        L_0x00eb:
            boolean r7 = r13.mo2774B()
            if (r7 != 0) goto L_0x0100
            boolean r7 = r13.mo2775C()
            if (r7 == 0) goto L_0x00f8
            goto L_0x0100
        L_0x00f8:
            int r11 = r11 + 1
            r12 = r21
            r7 = r23
            r10 = 0
            goto L_0x00a7
        L_0x0100:
            r7 = 0
            goto L_0x0106
        L_0x0102:
            r23 = r7
            r7 = r23
        L_0x0106:
            r10 = 1073741824(0x40000000, float:2.0)
            if (r8 != r10) goto L_0x010c
            if (r9 == r10) goto L_0x010e
        L_0x010c:
            if (r5 == 0) goto L_0x0110
        L_0x010e:
            r11 = 1
            goto L_0x0111
        L_0x0110:
            r11 = 0
        L_0x0111:
            r7 = r7 & r11
            if (r7 == 0) goto L_0x03b8
            int[] r12 = r6.f2387D
            r13 = 0
            r12 = r12[r13]
            int r12 = java.lang.Math.min(r12, r14)
            int[] r13 = r6.f2387D
            r14 = 1
            r13 = r13[r14]
            int r13 = java.lang.Math.min(r13, r15)
            if (r8 != r10) goto L_0x0135
            int r15 = r22.mo2807u()
            if (r15 == r12) goto L_0x0135
            r6.mo2788R(r12)
            x0.e r12 = r6.f2529y0
            r12.f22163b = r14
        L_0x0135:
            if (r9 != r10) goto L_0x0146
            int r12 = r22.mo2802o()
            if (r12 == r13) goto L_0x0146
            r6.mo2785O(r13)
            x0.e r12 = r6.f2529y0
            r13 = 1
            r12.f22163b = r13
            goto L_0x0147
        L_0x0146:
            r13 = 1
        L_0x0147:
            if (r8 != r10) goto L_0x0311
            if (r9 != r10) goto L_0x0311
            x0.e r12 = r6.f2529y0
            r5 = r5 & r13
            boolean r13 = r12.f22163b
            if (r13 != 0) goto L_0x0159
            boolean r13 = r12.f22164c
            if (r13 == 0) goto L_0x0157
            goto L_0x0159
        L_0x0157:
            r15 = 0
            goto L_0x0196
        L_0x0159:
            androidx.constraintlayout.core.widgets.d r13 = r12.f22162a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r13 = r13.f21718w0
            java.util.Iterator r13 = r13.iterator()
        L_0x0161:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x017e
            java.lang.Object r14 = r13.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r14 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r14
            r14.mo2799l()
            r15 = 0
            r14.f2410a = r15
            androidx.constraintlayout.core.widgets.analyzer.c r11 = r14.f2416d
            r11.mo2829n()
            androidx.constraintlayout.core.widgets.analyzer.d r11 = r14.f2418e
            r11.mo2831m()
            goto L_0x0161
        L_0x017e:
            r15 = 0
            androidx.constraintlayout.core.widgets.d r11 = r12.f22162a
            r11.mo2799l()
            androidx.constraintlayout.core.widgets.d r11 = r12.f22162a
            r11.f2410a = r15
            androidx.constraintlayout.core.widgets.analyzer.c r11 = r11.f2416d
            r11.mo2829n()
            androidx.constraintlayout.core.widgets.d r11 = r12.f22162a
            androidx.constraintlayout.core.widgets.analyzer.d r11 = r11.f2418e
            r11.mo2831m()
            r12.f22164c = r15
        L_0x0196:
            androidx.constraintlayout.core.widgets.d r11 = r12.f22165d
            r12.mo23386b(r11)
            androidx.constraintlayout.core.widgets.d r11 = r12.f22162a
            r11.f2413b0 = r15
            r11.f2415c0 = r15
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r11.mo2801n(r15)
            androidx.constraintlayout.core.widgets.d r13 = r12.f22162a
            r14 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = r13.mo2801n(r14)
            boolean r14 = r12.f22163b
            if (r14 == 0) goto L_0x01b3
            r12.mo23387c()
        L_0x01b3:
            androidx.constraintlayout.core.widgets.d r14 = r12.f22162a
            int r14 = r14.mo2808v()
            androidx.constraintlayout.core.widgets.d r15 = r12.f22162a
            int r15 = r15.mo2809w()
            androidx.constraintlayout.core.widgets.d r10 = r12.f22162a
            androidx.constraintlayout.core.widgets.analyzer.c r10 = r10.f2416d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r10.f2483h
            r10.mo2818d(r14)
            androidx.constraintlayout.core.widgets.d r10 = r12.f22162a
            androidx.constraintlayout.core.widgets.analyzer.d r10 = r10.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r10.f2483h
            r10.mo2818d(r15)
            r12.mo23391g()
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r11 == r10) goto L_0x01e0
            if (r13 != r10) goto L_0x01db
            goto L_0x01e0
        L_0x01db:
            r19 = r1
            r18 = r7
            goto L_0x024c
        L_0x01e0:
            if (r5 == 0) goto L_0x01fb
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r10 = r12.f22166e
            java.util.Iterator r10 = r10.iterator()
        L_0x01e8:
            boolean r18 = r10.hasNext()
            if (r18 == 0) goto L_0x01fb
            java.lang.Object r18 = r10.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r18 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r18
            boolean r18 = r18.mo2826k()
            if (r18 != 0) goto L_0x01e8
            r5 = 0
        L_0x01fb:
            if (r5 == 0) goto L_0x0224
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r11 != r10) goto L_0x0224
            androidx.constraintlayout.core.widgets.d r10 = r12.f22162a
            r18 = r7
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.mo2786P(r7)
            androidx.constraintlayout.core.widgets.d r7 = r12.f22162a
            r19 = r1
            r10 = 0
            int r1 = r12.mo23388d(r7, r10)
            r7.mo2788R(r1)
            androidx.constraintlayout.core.widgets.d r1 = r12.f22162a
            androidx.constraintlayout.core.widgets.analyzer.c r7 = r1.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r7 = r7.f2480e
            int r1 = r1.mo2807u()
            r7.mo2818d(r1)
            goto L_0x0228
        L_0x0224:
            r19 = r1
            r18 = r7
        L_0x0228:
            if (r5 == 0) goto L_0x024c
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r13 != r1) goto L_0x024c
            androidx.constraintlayout.core.widgets.d r1 = r12.f22162a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r1.mo2787Q(r5)
            androidx.constraintlayout.core.widgets.d r1 = r12.f22162a
            r5 = 1
            int r7 = r12.mo23388d(r1, r5)
            r1.mo2785O(r7)
            androidx.constraintlayout.core.widgets.d r1 = r12.f22162a
            androidx.constraintlayout.core.widgets.analyzer.d r5 = r1.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r5 = r5.f2480e
            int r1 = r1.mo2802o()
            r5.mo2818d(r1)
        L_0x024c:
            androidx.constraintlayout.core.widgets.d r1 = r12.f22162a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r1.f2405V
            r7 = 0
            r5 = r5[r7]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 == r7) goto L_0x025e
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 != r10) goto L_0x025c
            goto L_0x025e
        L_0x025c:
            r1 = 0
            goto L_0x02a2
        L_0x025e:
            int r1 = r1.mo2807u()
            int r1 = r1 + r14
            androidx.constraintlayout.core.widgets.d r5 = r12.f22162a
            androidx.constraintlayout.core.widgets.analyzer.c r5 = r5.f2416d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.f2484i
            r5.mo2818d(r1)
            androidx.constraintlayout.core.widgets.d r5 = r12.f22162a
            androidx.constraintlayout.core.widgets.analyzer.c r5 = r5.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r5 = r5.f2480e
            int r1 = r1 - r14
            r5.mo2818d(r1)
            r12.mo23391g()
            androidx.constraintlayout.core.widgets.d r1 = r12.f22162a
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r1.f2405V
            r10 = 1
            r5 = r5[r10]
            if (r5 == r7) goto L_0x0286
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 != r7) goto L_0x029e
        L_0x0286:
            int r1 = r1.mo2802o()
            int r1 = r1 + r15
            androidx.constraintlayout.core.widgets.d r5 = r12.f22162a
            androidx.constraintlayout.core.widgets.analyzer.d r5 = r5.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.f2484i
            r5.mo2818d(r1)
            androidx.constraintlayout.core.widgets.d r5 = r12.f22162a
            androidx.constraintlayout.core.widgets.analyzer.d r5 = r5.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r5 = r5.f2480e
            int r1 = r1 - r15
            r5.mo2818d(r1)
        L_0x029e:
            r12.mo23391g()
            r1 = 1
        L_0x02a2:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r5 = r12.f22166e
            java.util.Iterator r5 = r5.iterator()
        L_0x02a8:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x02c3
            java.lang.Object r7 = r5.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r7.f2477b
            androidx.constraintlayout.core.widgets.d r14 = r12.f22162a
            if (r10 != r14) goto L_0x02bf
            boolean r10 = r7.f2482g
            if (r10 != 0) goto L_0x02bf
            goto L_0x02a8
        L_0x02bf:
            r7.mo2822e()
            goto L_0x02a8
        L_0x02c3:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r5 = r12.f22166e
            java.util.Iterator r5 = r5.iterator()
        L_0x02c9:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0300
            java.lang.Object r7 = r5.next()
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r7
            if (r1 != 0) goto L_0x02de
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r7.f2477b
            androidx.constraintlayout.core.widgets.d r14 = r12.f22162a
            if (r10 != r14) goto L_0x02de
            goto L_0x02c9
        L_0x02de:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r7.f2483h
            boolean r10 = r10.f2473j
            if (r10 != 0) goto L_0x02e5
            goto L_0x02fe
        L_0x02e5:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r7.f2484i
            boolean r10 = r10.f2473j
            if (r10 != 0) goto L_0x02f0
            boolean r10 = r7 instanceof p305x0.C7137h
            if (r10 != 0) goto L_0x02f0
            goto L_0x02fe
        L_0x02f0:
            androidx.constraintlayout.core.widgets.analyzer.a r10 = r7.f2480e
            boolean r10 = r10.f2473j
            if (r10 != 0) goto L_0x02c9
            boolean r10 = r7 instanceof p305x0.C7132c
            if (r10 != 0) goto L_0x02c9
            boolean r7 = r7 instanceof p305x0.C7137h
            if (r7 != 0) goto L_0x02c9
        L_0x02fe:
            r1 = 0
            goto L_0x0301
        L_0x0300:
            r1 = 1
        L_0x0301:
            androidx.constraintlayout.core.widgets.d r5 = r12.f22162a
            r5.mo2786P(r11)
            androidx.constraintlayout.core.widgets.d r5 = r12.f22162a
            r5.mo2787Q(r13)
            r5 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            r11 = 2
            goto L_0x03a8
        L_0x0311:
            r19 = r1
            r18 = r7
            x0.e r1 = r6.f2529y0
            boolean r7 = r1.f22163b
            if (r7 == 0) goto L_0x0372
            androidx.constraintlayout.core.widgets.d r7 = r1.f22162a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r7 = r7.f21718w0
            java.util.Iterator r7 = r7.iterator()
        L_0x0323:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x034c
            java.lang.Object r10 = r7.next()
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r10
            r10.mo2799l()
            r11 = 0
            r10.f2410a = r11
            androidx.constraintlayout.core.widgets.analyzer.c r12 = r10.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r13 = r12.f2480e
            r13.f2473j = r11
            r12.f2482g = r11
            r12.mo2829n()
            androidx.constraintlayout.core.widgets.analyzer.d r10 = r10.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r12 = r10.f2480e
            r12.f2473j = r11
            r10.f2482g = r11
            r10.mo2831m()
            goto L_0x0323
        L_0x034c:
            r11 = 0
            androidx.constraintlayout.core.widgets.d r7 = r1.f22162a
            r7.mo2799l()
            androidx.constraintlayout.core.widgets.d r7 = r1.f22162a
            r7.f2410a = r11
            androidx.constraintlayout.core.widgets.analyzer.c r7 = r7.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r10 = r7.f2480e
            r10.f2473j = r11
            r7.f2482g = r11
            r7.mo2829n()
            androidx.constraintlayout.core.widgets.d r7 = r1.f22162a
            androidx.constraintlayout.core.widgets.analyzer.d r7 = r7.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r10 = r7.f2480e
            r10.f2473j = r11
            r7.f2482g = r11
            r7.mo2831m()
            r1.mo23387c()
            goto L_0x0373
        L_0x0372:
            r11 = 0
        L_0x0373:
            androidx.constraintlayout.core.widgets.d r7 = r1.f22165d
            r1.mo23386b(r7)
            androidx.constraintlayout.core.widgets.d r7 = r1.f22162a
            r7.f2413b0 = r11
            r7.f2415c0 = r11
            androidx.constraintlayout.core.widgets.analyzer.c r7 = r7.f2416d
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r7.f2483h
            r7.mo2818d(r11)
            androidx.constraintlayout.core.widgets.d r1 = r1.f22162a
            androidx.constraintlayout.core.widgets.analyzer.d r1 = r1.f2418e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.f2483h
            r1.mo2818d(r11)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 != r1) goto L_0x039a
            boolean r7 = r6.mo2836X(r11, r5)
            r10 = 1
            r7 = r7 & r10
            r11 = 1
            goto L_0x039d
        L_0x039a:
            r10 = 1
            r7 = 1
            r11 = 0
        L_0x039d:
            if (r9 != r1) goto L_0x03a7
            boolean r5 = r6.mo2836X(r10, r5)
            r5 = r5 & r7
            int r11 = r11 + 1
            goto L_0x03a8
        L_0x03a7:
            r5 = r7
        L_0x03a8:
            if (r5 == 0) goto L_0x03be
            if (r8 != r1) goto L_0x03ae
            r7 = 1
            goto L_0x03af
        L_0x03ae:
            r7 = 0
        L_0x03af:
            if (r9 != r1) goto L_0x03b3
            r1 = 1
            goto L_0x03b4
        L_0x03b3:
            r1 = 0
        L_0x03b4:
            r6.mo2789S(r7, r1)
            goto L_0x03be
        L_0x03b8:
            r19 = r1
            r18 = r7
            r5 = 0
            r11 = 0
        L_0x03be:
            if (r5 == 0) goto L_0x03c3
            r1 = 2
            if (r11 == r1) goto L_0x069b
        L_0x03c3:
            int r1 = r6.f2519J0
            if (r2 <= 0) goto L_0x04e0
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r7 = r6.f21718w0
            int r7 = r7.size()
            r8 = 64
            boolean r8 = r6.mo2837Z(r8)
            x0.b$b r9 = r6.f2510A0
            r10 = 0
        L_0x03d6:
            if (r10 >= r7) goto L_0x0464
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r11 = r6.f21718w0
            java.lang.Object r11 = r11.get(r10)
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r11
            boolean r12 = r11 instanceof androidx.constraintlayout.core.widgets.C0700f
            if (r12 == 0) goto L_0x03e6
            goto L_0x0460
        L_0x03e6:
            boolean r12 = r11 instanceof androidx.constraintlayout.core.widgets.C0687a
            if (r12 == 0) goto L_0x03ec
            goto L_0x0460
        L_0x03ec:
            boolean r12 = r11.f2391H
            if (r12 == 0) goto L_0x03f2
            goto L_0x0460
        L_0x03f2:
            if (r8 == 0) goto L_0x0409
            androidx.constraintlayout.core.widgets.analyzer.c r12 = r11.f2416d
            if (r12 == 0) goto L_0x0409
            androidx.constraintlayout.core.widgets.analyzer.d r13 = r11.f2418e
            if (r13 == 0) goto L_0x0409
            androidx.constraintlayout.core.widgets.analyzer.a r12 = r12.f2480e
            boolean r12 = r12.f2473j
            if (r12 == 0) goto L_0x0409
            androidx.constraintlayout.core.widgets.analyzer.a r12 = r13.f2480e
            boolean r12 = r12.f2473j
            if (r12 == 0) goto L_0x0409
            goto L_0x0460
        L_0x0409:
            r12 = 0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r13 = r11.mo2801n(r12)
            r12 = 1
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = r11.mo2801n(r12)
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r15 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r13 != r15) goto L_0x0423
            int r5 = r11.f2446s
            if (r5 == r12) goto L_0x0423
            if (r14 != r15) goto L_0x0423
            int r5 = r11.f2448t
            if (r5 == r12) goto L_0x0423
            r5 = 1
            goto L_0x0424
        L_0x0423:
            r5 = 0
        L_0x0424:
            if (r5 != 0) goto L_0x0459
            boolean r17 = r6.mo2837Z(r12)
            if (r17 == 0) goto L_0x0459
            boolean r12 = r11 instanceof androidx.constraintlayout.core.widgets.C0704i
            if (r12 != 0) goto L_0x0459
            if (r13 != r15) goto L_0x043f
            int r12 = r11.f2446s
            if (r12 != 0) goto L_0x043f
            if (r14 == r15) goto L_0x043f
            boolean r12 = r11.mo2774B()
            if (r12 != 0) goto L_0x043f
            r5 = 1
        L_0x043f:
            if (r14 != r15) goto L_0x044e
            int r12 = r11.f2448t
            if (r12 != 0) goto L_0x044e
            if (r13 == r15) goto L_0x044e
            boolean r12 = r11.mo2774B()
            if (r12 != 0) goto L_0x044e
            r5 = 1
        L_0x044e:
            if (r13 == r15) goto L_0x0452
            if (r14 != r15) goto L_0x0459
        L_0x0452:
            float r12 = r11.f2409Z
            int r12 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r12 <= 0) goto L_0x0459
            r5 = 1
        L_0x0459:
            if (r5 == 0) goto L_0x045c
            goto L_0x0460
        L_0x045c:
            r5 = 0
            r0.mo23379a(r5, r11, r9)
        L_0x0460:
            int r10 = r10 + 1
            goto L_0x03d6
        L_0x0464:
            androidx.constraintlayout.widget.ConstraintLayout$b r9 = (androidx.constraintlayout.widget.ConstraintLayout.C0737b) r9
            androidx.constraintlayout.widget.ConstraintLayout r5 = r9.f3076a
            int r5 = r5.getChildCount()
            r13 = 0
        L_0x046d:
            if (r13 >= r5) goto L_0x04bf
            androidx.constraintlayout.widget.ConstraintLayout r7 = r9.f3076a
            android.view.View r7 = r7.getChildAt(r13)
            boolean r8 = r7 instanceof androidx.constraintlayout.widget.Placeholder
            if (r8 == 0) goto L_0x04bc
            androidx.constraintlayout.widget.Placeholder r7 = (androidx.constraintlayout.widget.Placeholder) r7
            android.view.View r8 = r7.f3100c
            if (r8 != 0) goto L_0x0480
            goto L_0x04bc
        L_0x0480:
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r8 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r8
            android.view.View r7 = r7.f3100c
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r7 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r7.f3064q0
            r11 = 0
            r10.f2429j0 = r11
            androidx.constraintlayout.core.widgets.ConstraintWidget r12 = r8.f3064q0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r14 = r12.f2405V
            r14 = r14[r11]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r14 == r11) goto L_0x04a4
            int r10 = r10.mo2807u()
            r12.mo2788R(r10)
        L_0x04a4:
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r8.f3064q0
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r10 = r8.f2405V
            r12 = 1
            r10 = r10[r12]
            if (r10 == r11) goto L_0x04b6
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r7.f3064q0
            int r10 = r10.mo2802o()
            r8.mo2785O(r10)
        L_0x04b6:
            androidx.constraintlayout.core.widgets.ConstraintWidget r7 = r7.f3064q0
            r8 = 8
            r7.f2429j0 = r8
        L_0x04bc:
            int r13 = r13 + 1
            goto L_0x046d
        L_0x04bf:
            androidx.constraintlayout.widget.ConstraintLayout r5 = r9.f3076a
            java.util.ArrayList r5 = r5.mConstraintHelpers
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x04e0
            r13 = 0
        L_0x04cc:
            if (r13 >= r5) goto L_0x04e0
            androidx.constraintlayout.widget.ConstraintLayout r7 = r9.f3076a
            java.util.ArrayList r7 = r7.mConstraintHelpers
            java.lang.Object r7 = r7.get(r13)
            androidx.constraintlayout.widget.ConstraintHelper r7 = (androidx.constraintlayout.widget.ConstraintHelper) r7
            r7.getClass()
            int r13 = r13 + 1
            goto L_0x04cc
        L_0x04e0:
            r0.mo23381c(r6)
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r5 = r0.f22147a
            int r5 = r5.size()
            if (r2 <= 0) goto L_0x04f0
            r2 = 0
            r0.mo23380b(r6, r2, r3, r4)
            goto L_0x04f1
        L_0x04f0:
            r2 = 0
        L_0x04f1:
            if (r5 <= 0) goto L_0x068d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r6.f2405V
            r8 = r7[r2]
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r9 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r8 != r9) goto L_0x04ff
            r8 = 1
            r17 = 1
            goto L_0x0502
        L_0x04ff:
            r8 = 1
            r17 = 0
        L_0x0502:
            r7 = r7[r8]
            if (r7 != r9) goto L_0x0508
            r7 = 1
            goto L_0x0509
        L_0x0508:
            r7 = 0
        L_0x0509:
            int r8 = r22.mo2807u()
            androidx.constraintlayout.core.widgets.d r9 = r0.f22149c
            int r9 = r9.f2419e0
            int r8 = java.lang.Math.max(r8, r9)
            int r9 = r22.mo2802o()
            androidx.constraintlayout.core.widgets.d r10 = r0.f22149c
            int r10 = r10.f2421f0
            int r9 = java.lang.Math.max(r9, r10)
            r10 = 0
            r13 = 0
        L_0x0523:
            if (r13 >= r5) goto L_0x05af
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r11 = r0.f22147a
            java.lang.Object r11 = r11.get(r13)
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r11
            boolean r12 = r11 instanceof androidx.constraintlayout.core.widgets.C0704i
            if (r12 != 0) goto L_0x0535
            r15 = r19
            goto L_0x05a8
        L_0x0535:
            int r12 = r11.mo2807u()
            int r14 = r11.mo2802o()
            r15 = r19
            r2 = 1
            boolean r16 = r0.mo23379a(r2, r11, r15)
            r2 = r10 | r16
            int r10 = r11.mo2807u()
            r16 = r2
            int r2 = r11.mo2802o()
            if (r10 == r12) goto L_0x0578
            r11.mo2788R(r10)
            if (r17 == 0) goto L_0x0576
            int r10 = r11.mo2808v()
            int r12 = r11.f2407X
            int r10 = r10 + r12
            if (r10 <= r8) goto L_0x0576
            int r10 = r11.mo2808v()
            int r12 = r11.f2407X
            int r10 = r10 + r12
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r12 = r11.mo2800m(r12)
            int r12 = r12.mo2764e()
            int r12 = r12 + r10
            int r8 = java.lang.Math.max(r8, r12)
        L_0x0576:
            r16 = 1
        L_0x0578:
            if (r2 == r14) goto L_0x05a1
            r11.mo2785O(r2)
            if (r7 == 0) goto L_0x059f
            int r2 = r11.mo2809w()
            int r10 = r11.f2408Y
            int r2 = r2 + r10
            if (r2 <= r9) goto L_0x059f
            int r2 = r11.mo2809w()
            int r10 = r11.f2408Y
            int r2 = r2 + r10
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r10 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r10 = r11.mo2800m(r10)
            int r10 = r10.mo2764e()
            int r10 = r10 + r2
            int r2 = java.lang.Math.max(r9, r10)
            r9 = r2
        L_0x059f:
            r16 = 1
        L_0x05a1:
            androidx.constraintlayout.core.widgets.i r11 = (androidx.constraintlayout.core.widgets.C0704i) r11
            boolean r2 = r11.f2586E0
            r2 = r2 | r16
            r10 = r2
        L_0x05a8:
            int r13 = r13 + 1
            r19 = r15
            r2 = 0
            goto L_0x0523
        L_0x05af:
            r15 = r19
            r2 = 2
            r13 = 0
        L_0x05b3:
            if (r13 >= r2) goto L_0x068d
            r11 = r10
            r10 = 0
        L_0x05b7:
            if (r10 >= r5) goto L_0x067a
            java.util.ArrayList<androidx.constraintlayout.core.widgets.ConstraintWidget> r12 = r0.f22147a
            java.lang.Object r12 = r12.get(r10)
            androidx.constraintlayout.core.widgets.ConstraintWidget r12 = (androidx.constraintlayout.core.widgets.ConstraintWidget) r12
            boolean r14 = r12 instanceof p292w0.C6960a
            if (r14 == 0) goto L_0x05c9
            boolean r14 = r12 instanceof androidx.constraintlayout.core.widgets.C0704i
            if (r14 == 0) goto L_0x05cd
        L_0x05c9:
            boolean r14 = r12 instanceof androidx.constraintlayout.core.widgets.C0700f
            if (r14 == 0) goto L_0x05d0
        L_0x05cd:
            r2 = 8
            goto L_0x05ee
        L_0x05d0:
            int r14 = r12.f2429j0
            r2 = 8
            if (r14 != r2) goto L_0x05d7
            goto L_0x05ee
        L_0x05d7:
            if (r18 == 0) goto L_0x05ea
            androidx.constraintlayout.core.widgets.analyzer.c r14 = r12.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r14 = r14.f2480e
            boolean r14 = r14.f2473j
            if (r14 == 0) goto L_0x05ea
            androidx.constraintlayout.core.widgets.analyzer.d r14 = r12.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r14 = r14.f2480e
            boolean r14 = r14.f2473j
            if (r14 == 0) goto L_0x05ea
            goto L_0x05ee
        L_0x05ea:
            boolean r14 = r12 instanceof androidx.constraintlayout.core.widgets.C0704i
            if (r14 == 0) goto L_0x05f4
        L_0x05ee:
            r19 = r1
            r16 = r5
            goto L_0x0671
        L_0x05f4:
            int r14 = r12.mo2807u()
            int r2 = r12.mo2802o()
            r16 = r5
            int r5 = r12.f2417d0
            r19 = r1
            r1 = 1
            if (r13 != r1) goto L_0x0606
            r1 = 2
        L_0x0606:
            boolean r1 = r0.mo23379a(r1, r12, r15)
            r1 = r1 | r11
            int r11 = r12.mo2807u()
            r20 = r1
            int r1 = r12.mo2802o()
            if (r11 == r14) goto L_0x063d
            r12.mo2788R(r11)
            if (r17 == 0) goto L_0x063b
            int r11 = r12.mo2808v()
            int r14 = r12.f2407X
            int r11 = r11 + r14
            if (r11 <= r8) goto L_0x063b
            int r11 = r12.mo2808v()
            int r14 = r12.f2407X
            int r11 = r11 + r14
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r14 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor r14 = r12.mo2800m(r14)
            int r14 = r14.mo2764e()
            int r14 = r14 + r11
            int r8 = java.lang.Math.max(r8, r14)
        L_0x063b:
            r20 = 1
        L_0x063d:
            if (r1 == r2) goto L_0x0665
            r12.mo2785O(r1)
            if (r7 == 0) goto L_0x0663
            int r1 = r12.mo2809w()
            int r2 = r12.f2408Y
            int r1 = r1 + r2
            if (r1 <= r9) goto L_0x0663
            int r1 = r12.mo2809w()
            int r2 = r12.f2408Y
            int r1 = r1 + r2
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor r2 = r12.mo2800m(r2)
            int r2 = r2.mo2764e()
            int r2 = r2 + r1
            int r9 = java.lang.Math.max(r9, r2)
        L_0x0663:
            r20 = 1
        L_0x0665:
            boolean r1 = r12.f2389F
            if (r1 == 0) goto L_0x066f
            int r1 = r12.f2417d0
            if (r5 == r1) goto L_0x066f
            r11 = 1
            goto L_0x0671
        L_0x066f:
            r11 = r20
        L_0x0671:
            int r10 = r10 + 1
            r5 = r16
            r1 = r19
            r2 = 2
            goto L_0x05b7
        L_0x067a:
            r19 = r1
            r16 = r5
            if (r11 == 0) goto L_0x068f
            int r13 = r13 + 1
            r0.mo23380b(r6, r13, r3, r4)
            r5 = r16
            r1 = r19
            r2 = 2
            r10 = 0
            goto L_0x05b3
        L_0x068d:
            r19 = r1
        L_0x068f:
            r0 = r19
            r6.f2519J0 = r0
            r0 = 512(0x200, float:7.175E-43)
            boolean r0 = r6.mo2837Z(r0)
            androidx.constraintlayout.core.C0680c.f2351p = r0
        L_0x069b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.resolveSystem(androidx.constraintlayout.core.widgets.d, int, int, int):void");
    }

    public void setConstraintSet(C0738a aVar) {
        this.mConstraintSet = aVar;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.mMaxHeight) {
            this.mMaxHeight = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.mMaxWidth) {
            this.mMaxWidth = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.mMinHeight) {
            this.mMinHeight = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.mMinWidth) {
            this.mMinWidth = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C0040b bVar) {
        C0037a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        C0697d dVar = this.mLayoutWidget;
        dVar.f2519J0 = i;
        C0680c.f2351p = dVar.mo2837Z(512);
    }

    public void setSelfDimensionBehaviour(C0697d dVar, int i, int i2, int i3, int i4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        C0737b bVar = this.mMeasurer;
        int i5 = bVar.f3080e;
        int i6 = bVar.f3079d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i == 0) {
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.mMinWidth);
                }
            } else if (i != 1073741824) {
                dimensionBehaviour = dimensionBehaviour2;
            } else {
                i2 = Math.min(this.mMaxWidth - i6, i2);
                dimensionBehaviour = dimensionBehaviour2;
            }
            i2 = 0;
        } else {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 == 0) {
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.mMinHeight);
                }
            } else if (i3 == 1073741824) {
                i4 = Math.min(this.mMaxHeight - i5, i4);
            }
            i4 = 0;
        } else {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        }
        if (!(i2 == dVar.mo2807u() && i4 == dVar.mo2802o())) {
            dVar.f2529y0.f22164c = true;
        }
        dVar.f2413b0 = 0;
        dVar.f2415c0 = 0;
        int[] iArr = dVar.f2387D;
        iArr[0] = this.mMaxWidth - i6;
        iArr[1] = this.mMaxHeight - i5;
        dVar.f2419e0 = 0;
        dVar.f2421f0 = 0;
        dVar.mo2786P(dimensionBehaviour);
        dVar.mo2788R(i2);
        dVar.mo2787Q(dimensionBehaviour2);
        dVar.mo2785O(i4);
        int i7 = this.mMinWidth - i6;
        if (i7 < 0) {
            dVar.f2419e0 = 0;
        } else {
            dVar.f2419e0 = i7;
        }
        int i8 = this.mMinHeight - i5;
        if (i8 < 0) {
            dVar.f2421f0 = 0;
        } else {
            dVar.f2421f0 = i8;
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(attributeSet, i, i2);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: A */
        public int f3005A = Integer.MIN_VALUE;

        /* renamed from: B */
        public int f3006B = Integer.MIN_VALUE;

        /* renamed from: C */
        public int f3007C = Integer.MIN_VALUE;

        /* renamed from: D */
        public int f3008D = 0;

        /* renamed from: E */
        public float f3009E = 0.5f;

        /* renamed from: F */
        public float f3010F = 0.5f;

        /* renamed from: G */
        public String f3011G = null;

        /* renamed from: H */
        public float f3012H = -1.0f;

        /* renamed from: I */
        public float f3013I = -1.0f;

        /* renamed from: J */
        public int f3014J = 0;

        /* renamed from: K */
        public int f3015K = 0;

        /* renamed from: L */
        public int f3016L = 0;

        /* renamed from: M */
        public int f3017M = 0;

        /* renamed from: N */
        public int f3018N = 0;

        /* renamed from: O */
        public int f3019O = 0;

        /* renamed from: P */
        public int f3020P = 0;

        /* renamed from: Q */
        public int f3021Q = 0;

        /* renamed from: R */
        public float f3022R = 1.0f;

        /* renamed from: S */
        public float f3023S = 1.0f;

        /* renamed from: T */
        public int f3024T = -1;

        /* renamed from: U */
        public int f3025U = -1;

        /* renamed from: V */
        public int f3026V = -1;

        /* renamed from: W */
        public boolean f3027W = false;

        /* renamed from: X */
        public boolean f3028X = false;

        /* renamed from: Y */
        public String f3029Y = null;

        /* renamed from: Z */
        public int f3030Z = 0;

        /* renamed from: a */
        public int f3031a = -1;

        /* renamed from: a0 */
        public boolean f3032a0 = true;

        /* renamed from: b */
        public int f3033b = -1;

        /* renamed from: b0 */
        public boolean f3034b0 = true;

        /* renamed from: c */
        public float f3035c = -1.0f;

        /* renamed from: c0 */
        public boolean f3036c0 = false;

        /* renamed from: d */
        public boolean f3037d = true;

        /* renamed from: d0 */
        public boolean f3038d0 = false;

        /* renamed from: e */
        public int f3039e = -1;

        /* renamed from: e0 */
        public boolean f3040e0 = false;

        /* renamed from: f */
        public int f3041f = -1;

        /* renamed from: f0 */
        public boolean f3042f0 = false;

        /* renamed from: g */
        public int f3043g = -1;

        /* renamed from: g0 */
        public int f3044g0 = -1;

        /* renamed from: h */
        public int f3045h = -1;

        /* renamed from: h0 */
        public int f3046h0 = -1;

        /* renamed from: i */
        public int f3047i = -1;

        /* renamed from: i0 */
        public int f3048i0 = -1;

        /* renamed from: j */
        public int f3049j = -1;

        /* renamed from: j0 */
        public int f3050j0 = -1;

        /* renamed from: k */
        public int f3051k = -1;

        /* renamed from: k0 */
        public int f3052k0 = Integer.MIN_VALUE;

        /* renamed from: l */
        public int f3053l = -1;

        /* renamed from: l0 */
        public int f3054l0 = Integer.MIN_VALUE;

        /* renamed from: m */
        public int f3055m = -1;

        /* renamed from: m0 */
        public float f3056m0 = 0.5f;

        /* renamed from: n */
        public int f3057n = -1;

        /* renamed from: n0 */
        public int f3058n0;

        /* renamed from: o */
        public int f3059o = -1;

        /* renamed from: o0 */
        public int f3060o0;

        /* renamed from: p */
        public int f3061p = -1;

        /* renamed from: p0 */
        public float f3062p0;

        /* renamed from: q */
        public int f3063q = 0;

        /* renamed from: q0 */
        public ConstraintWidget f3064q0 = new ConstraintWidget();

        /* renamed from: r */
        public float f3065r = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: s */
        public int f3066s = -1;

        /* renamed from: t */
        public int f3067t = -1;

        /* renamed from: u */
        public int f3068u = -1;

        /* renamed from: v */
        public int f3069v = -1;

        /* renamed from: w */
        public int f3070w = Integer.MIN_VALUE;

        /* renamed from: x */
        public int f3071x = Integer.MIN_VALUE;

        /* renamed from: y */
        public int f3072y = Integer.MIN_VALUE;

        /* renamed from: z */
        public int f3073z = Integer.MIN_VALUE;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$LayoutParams$a */
        public static class C0735a {

            /* renamed from: a */
            public static final SparseIntArray f3074a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f3074a = sparseIntArray;
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(C0042d.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0042d.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = C0735a.f3074a.get(index);
                switch (i2) {
                    case 1:
                        this.f3026V = obtainStyledAttributes.getInt(index, this.f3026V);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f3061p);
                        this.f3061p = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f3061p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f3063q = obtainStyledAttributes.getDimensionPixelSize(index, this.f3063q);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f3065r) % 360.0f;
                        this.f3065r = f;
                        if (f >= BitmapDescriptorFactory.HUE_RED) {
                            break;
                        } else {
                            this.f3065r = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f3031a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3031a);
                        break;
                    case 6:
                        this.f3033b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3033b);
                        break;
                    case 7:
                        this.f3035c = obtainStyledAttributes.getFloat(index, this.f3035c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f3039e);
                        this.f3039e = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f3039e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f3041f);
                        this.f3041f = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f3041f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f3043g);
                        this.f3043g = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f3043g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f3045h);
                        this.f3045h = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f3045h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f3047i);
                        this.f3047i = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f3047i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f3049j);
                        this.f3049j = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f3049j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f3051k);
                        this.f3051k = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f3051k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f3053l);
                        this.f3053l = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f3053l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f3055m);
                        this.f3055m = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f3055m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f3066s);
                        this.f3066s = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f3066s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f3067t);
                        this.f3067t = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f3067t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f3068u);
                        this.f3068u = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f3068u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f3069v);
                        this.f3069v = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f3069v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f3070w = obtainStyledAttributes.getDimensionPixelSize(index, this.f3070w);
                        break;
                    case 22:
                        this.f3071x = obtainStyledAttributes.getDimensionPixelSize(index, this.f3071x);
                        break;
                    case 23:
                        this.f3072y = obtainStyledAttributes.getDimensionPixelSize(index, this.f3072y);
                        break;
                    case 24:
                        this.f3073z = obtainStyledAttributes.getDimensionPixelSize(index, this.f3073z);
                        break;
                    case 25:
                        this.f3005A = obtainStyledAttributes.getDimensionPixelSize(index, this.f3005A);
                        break;
                    case 26:
                        this.f3006B = obtainStyledAttributes.getDimensionPixelSize(index, this.f3006B);
                        break;
                    case 27:
                        this.f3027W = obtainStyledAttributes.getBoolean(index, this.f3027W);
                        break;
                    case 28:
                        this.f3028X = obtainStyledAttributes.getBoolean(index, this.f3028X);
                        break;
                    case 29:
                        this.f3009E = obtainStyledAttributes.getFloat(index, this.f3009E);
                        break;
                    case 30:
                        this.f3010F = obtainStyledAttributes.getFloat(index, this.f3010F);
                        break;
                    case 31:
                        this.f3016L = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.f3017M = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.f3018N = obtainStyledAttributes.getDimensionPixelSize(index, this.f3018N);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f3018N) != -2) {
                                break;
                            } else {
                                this.f3018N = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f3020P = obtainStyledAttributes.getDimensionPixelSize(index, this.f3020P);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f3020P) != -2) {
                                break;
                            } else {
                                this.f3020P = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f3022R = Math.max(BitmapDescriptorFactory.HUE_RED, obtainStyledAttributes.getFloat(index, this.f3022R));
                        this.f3016L = 2;
                        break;
                    case 36:
                        try {
                            this.f3019O = obtainStyledAttributes.getDimensionPixelSize(index, this.f3019O);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f3019O) != -2) {
                                break;
                            } else {
                                this.f3019O = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f3021Q = obtainStyledAttributes.getDimensionPixelSize(index, this.f3021Q);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f3021Q) != -2) {
                                break;
                            } else {
                                this.f3021Q = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f3023S = Math.max(BitmapDescriptorFactory.HUE_RED, obtainStyledAttributes.getFloat(index, this.f3023S));
                        this.f3017M = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                C0738a.m2244o(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f3012H = obtainStyledAttributes.getFloat(index, this.f3012H);
                                break;
                            case 46:
                                this.f3013I = obtainStyledAttributes.getFloat(index, this.f3013I);
                                break;
                            case 47:
                                this.f3014J = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f3015K = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f3024T = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3024T);
                                break;
                            case 50:
                                this.f3025U = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3025U);
                                break;
                            case 51:
                                this.f3029Y = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f3057n);
                                this.f3057n = resourceId15;
                                if (resourceId15 != -1) {
                                    break;
                                } else {
                                    this.f3057n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f3059o);
                                this.f3059o = resourceId16;
                                if (resourceId16 != -1) {
                                    break;
                                } else {
                                    this.f3059o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 54:
                                this.f3008D = obtainStyledAttributes.getDimensionPixelSize(index, this.f3008D);
                                break;
                            case 55:
                                this.f3007C = obtainStyledAttributes.getDimensionPixelSize(index, this.f3007C);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        C0738a.m2243n(this, obtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        C0738a.m2243n(this, obtainStyledAttributes, index, 1);
                                        break;
                                    case 66:
                                        this.f3030Z = obtainStyledAttributes.getInt(index, this.f3030Z);
                                        break;
                                    case 67:
                                        this.f3037d = obtainStyledAttributes.getBoolean(index, this.f3037d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            mo3198a();
        }

        /* renamed from: a */
        public final void mo3198a() {
            this.f3038d0 = false;
            this.f3032a0 = true;
            this.f3034b0 = true;
            int i = this.width;
            if (i == -2 && this.f3027W) {
                this.f3032a0 = false;
                if (this.f3016L == 0) {
                    this.f3016L = 1;
                }
            }
            int i2 = this.height;
            if (i2 == -2 && this.f3028X) {
                this.f3034b0 = false;
                if (this.f3017M == 0) {
                    this.f3017M = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f3032a0 = false;
                if (i == 0 && this.f3016L == 1) {
                    this.width = -2;
                    this.f3027W = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f3034b0 = false;
                if (i2 == 0 && this.f3017M == 1) {
                    this.height = -2;
                    this.f3028X = true;
                }
            }
            if (this.f3035c != -1.0f || this.f3031a != -1 || this.f3033b != -1) {
                this.f3038d0 = true;
                this.f3032a0 = true;
                this.f3034b0 = true;
                if (!(this.f3064q0 instanceof C0700f)) {
                    this.f3064q0 = new C0700f();
                }
                ((C0700f) this.f3064q0).mo2848V(this.f3026V);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = 1
                goto L_0x0012
            L_0x0011:
                r11 = 0
            L_0x0012:
                r4 = -1
                r10.f3048i0 = r4
                r10.f3050j0 = r4
                r10.f3044g0 = r4
                r10.f3046h0 = r4
                int r5 = r10.f3070w
                r10.f3052k0 = r5
                int r5 = r10.f3072y
                r10.f3054l0 = r5
                float r5 = r10.f3009E
                r10.f3056m0 = r5
                int r6 = r10.f3031a
                r10.f3058n0 = r6
                int r7 = r10.f3033b
                r10.f3060o0 = r7
                float r8 = r10.f3035c
                r10.f3062p0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0094
                int r11 = r10.f3066s
                if (r11 == r4) goto L_0x003f
                r10.f3048i0 = r11
            L_0x003d:
                r2 = 1
                goto L_0x0046
            L_0x003f:
                int r11 = r10.f3067t
                if (r11 == r4) goto L_0x0046
                r10.f3050j0 = r11
                goto L_0x003d
            L_0x0046:
                int r11 = r10.f3068u
                if (r11 == r4) goto L_0x004d
                r10.f3046h0 = r11
                r2 = 1
            L_0x004d:
                int r11 = r10.f3069v
                if (r11 == r4) goto L_0x0054
                r10.f3044g0 = r11
                r2 = 1
            L_0x0054:
                int r11 = r10.f3005A
                if (r11 == r9) goto L_0x005a
                r10.f3054l0 = r11
            L_0x005a:
                int r11 = r10.f3006B
                if (r11 == r9) goto L_0x0060
                r10.f3052k0 = r11
            L_0x0060:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0068
                float r2 = r11 - r5
                r10.f3056m0 = r2
            L_0x0068:
                boolean r2 = r10.f3038d0
                if (r2 == 0) goto L_0x00b8
                int r2 = r10.f3026V
                if (r2 != r3) goto L_0x00b8
                boolean r2 = r10.f3037d
                if (r2 == 0) goto L_0x00b8
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0082
                float r11 = r11 - r8
                r10.f3062p0 = r11
                r10.f3058n0 = r4
                r10.f3060o0 = r4
                goto L_0x00b8
            L_0x0082:
                if (r6 == r4) goto L_0x008b
                r10.f3060o0 = r6
                r10.f3058n0 = r4
                r10.f3062p0 = r2
                goto L_0x00b8
            L_0x008b:
                if (r7 == r4) goto L_0x00b8
                r10.f3058n0 = r7
                r10.f3060o0 = r4
                r10.f3062p0 = r2
                goto L_0x00b8
            L_0x0094:
                int r11 = r10.f3066s
                if (r11 == r4) goto L_0x009a
                r10.f3046h0 = r11
            L_0x009a:
                int r11 = r10.f3067t
                if (r11 == r4) goto L_0x00a0
                r10.f3044g0 = r11
            L_0x00a0:
                int r11 = r10.f3068u
                if (r11 == r4) goto L_0x00a6
                r10.f3048i0 = r11
            L_0x00a6:
                int r11 = r10.f3069v
                if (r11 == r4) goto L_0x00ac
                r10.f3050j0 = r11
            L_0x00ac:
                int r11 = r10.f3005A
                if (r11 == r9) goto L_0x00b2
                r10.f3052k0 = r11
            L_0x00b2:
                int r11 = r10.f3006B
                if (r11 == r9) goto L_0x00b8
                r10.f3054l0 = r11
            L_0x00b8:
                int r11 = r10.f3068u
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f3069v
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f3067t
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f3066s
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f3043g
                if (r11 == r4) goto L_0x00d7
                r10.f3048i0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
                goto L_0x00e5
            L_0x00d7:
                int r11 = r10.f3045h
                if (r11 == r4) goto L_0x00e5
                r10.f3050j0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
            L_0x00e5:
                int r11 = r10.f3039e
                if (r11 == r4) goto L_0x00f4
                r10.f3044g0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
                goto L_0x0102
            L_0x00f4:
                int r11 = r10.f3041f
                if (r11 == r4) goto L_0x0102
                r10.f3046h0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
            L_0x0102:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
