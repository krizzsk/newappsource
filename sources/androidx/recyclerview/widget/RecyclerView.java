package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C1160a;
import androidx.recyclerview.widget.C1174e0;
import androidx.recyclerview.widget.C1199j0;
import androidx.recyclerview.widget.C1203k0;
import androidx.recyclerview.widget.C1223o;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p001a0.C0016g;
import p177n1.C5813l;
import p204p2.C6032a;
import p204p2.C6033b;
import p204p2.C6035d;
import p242s1.C6315a;
import p242s1.C6333d0;
import p242s1.C6365i0;
import p242s1.C6379o;
import p242s1.C6381p;
import p242s1.C6382p0;
import p255t1.C6526b;
import p255t1.C6531g;
import p358af.C13437d;

public class RecyclerView extends ViewGroup implements C6379o {

    /* renamed from: P0 */
    public static final int[] f4215P0 = {16843830};

    /* renamed from: Q0 */
    public static final boolean f4216Q0;

    /* renamed from: R0 */
    public static final boolean f4217R0 = true;

    /* renamed from: S0 */
    public static final boolean f4218S0 = true;

    /* renamed from: T0 */
    public static final Class<?>[] f4219T0;

    /* renamed from: U0 */
    public static final C1121c f4220U0 = new C1121c();

    /* renamed from: A */
    public int f4221A;

    /* renamed from: A0 */
    public C1132k f4222A0;

    /* renamed from: B */
    public boolean f4223B;

    /* renamed from: B0 */
    public boolean f4224B0;

    /* renamed from: C */
    public final AccessibilityManager f4225C;

    /* renamed from: C0 */
    public C1174e0 f4226C0;

    /* renamed from: D */
    public ArrayList f4227D;

    /* renamed from: D0 */
    public C1126h f4228D0;

    /* renamed from: E */
    public boolean f4229E;

    /* renamed from: E0 */
    public final int[] f4230E0;

    /* renamed from: F */
    public boolean f4231F;

    /* renamed from: F0 */
    public C6381p f4232F0;

    /* renamed from: G */
    public int f4233G;

    /* renamed from: G0 */
    public final int[] f4234G0;

    /* renamed from: H */
    public int f4235H;

    /* renamed from: H0 */
    public final int[] f4236H0;

    /* renamed from: I */
    public C1127i f4237I;

    /* renamed from: I0 */
    public final int[] f4238I0;

    /* renamed from: J */
    public EdgeEffect f4239J;

    /* renamed from: J0 */
    public final ArrayList f4240J0;

    /* renamed from: K */
    public EdgeEffect f4241K;

    /* renamed from: K0 */
    public C1120b f4242K0;

    /* renamed from: L */
    public EdgeEffect f4243L;

    /* renamed from: L0 */
    public boolean f4244L0;

    /* renamed from: M */
    public EdgeEffect f4245M;

    /* renamed from: M0 */
    public int f4246M0;

    /* renamed from: N */
    public C1128j f4247N;

    /* renamed from: N0 */
    public int f4248N0;

    /* renamed from: O */
    public int f4249O;

    /* renamed from: O0 */
    public final C1122d f4250O0;

    /* renamed from: P */
    public int f4251P;

    /* renamed from: Q */
    public VelocityTracker f4252Q;

    /* renamed from: R */
    public int f4253R;

    /* renamed from: S */
    public int f4254S;

    /* renamed from: T */
    public int f4255T;

    /* renamed from: U */
    public int f4256U;

    /* renamed from: b */
    public final C1147u f4257b;

    /* renamed from: c */
    public final C1145s f4258c;

    /* renamed from: d */
    public SavedState f4259d;

    /* renamed from: e */
    public C1160a f4260e;

    /* renamed from: f */
    public C1171e f4261f;

    /* renamed from: g */
    public final C1203k0 f4262g;

    /* renamed from: h */
    public boolean f4263h;

    /* renamed from: i */
    public final C1118a f4264i;

    /* renamed from: j */
    public final Rect f4265j;

    /* renamed from: k */
    public final Rect f4266k;

    /* renamed from: l */
    public final RectF f4267l;

    /* renamed from: l0 */
    public int f4268l0;

    /* renamed from: m */
    public Adapter f4269m;

    /* renamed from: m0 */
    public C1140o f4270m0;

    /* renamed from: n */
    public C1134m f4271n;

    /* renamed from: n0 */
    public final int f4272n0;

    /* renamed from: o */
    public C1146t f4273o;

    /* renamed from: o0 */
    public final int f4274o0;

    /* renamed from: p */
    public final ArrayList f4275p;

    /* renamed from: p0 */
    public float f4276p0;

    /* renamed from: q */
    public final ArrayList<C1133l> f4277q;

    /* renamed from: q0 */
    public float f4278q0;

    /* renamed from: r */
    public final ArrayList<C1141p> f4279r;

    /* renamed from: r0 */
    public boolean f4280r0;

    /* renamed from: s */
    public C1141p f4281s;

    /* renamed from: s0 */
    public final C1154z f4282s0;

    /* renamed from: t */
    public boolean f4283t;

    /* renamed from: t0 */
    public C1223o f4284t0;

    /* renamed from: u */
    public boolean f4285u;

    /* renamed from: u0 */
    public C1223o.C1225b f4286u0;

    /* renamed from: v */
    public boolean f4287v;

    /* renamed from: v0 */
    public final C1152x f4288v0;

    /* renamed from: w */
    public int f4289w;

    /* renamed from: w0 */
    public C1142q f4290w0;

    /* renamed from: x */
    public boolean f4291x;

    /* renamed from: x0 */
    public ArrayList f4292x0;

    /* renamed from: y */
    public boolean f4293y;

    /* renamed from: y0 */
    public boolean f4294y0;

    /* renamed from: z */
    public boolean f4295z;

    /* renamed from: z0 */
    public boolean f4296z0;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class C1118a implements Runnable {
        public C1118a() {
        }

        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4287v && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.f4283t) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.f4293y) {
                    recyclerView2.f4291x = true;
                } else {
                    recyclerView2.mo4628m();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static abstract class C1119a0 {
        public static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        public static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        public static final int FLAG_BOUND = 1;
        public static final int FLAG_IGNORE = 128;
        public static final int FLAG_INVALID = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_NOT_RECYCLABLE = 16;
        public static final int FLAG_REMOVED = 8;
        public static final int FLAG_RETURNED_FROM_SCRAP = 32;
        public static final int FLAG_TMP_DETACHED = 256;
        public static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        public Adapter<? extends C1119a0> mBindingAdapter;
        public int mFlags;
        public boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        public long mItemId = -1;
        public int mItemViewType = -1;
        public WeakReference<RecyclerView> mNestedRecyclerView;
        public int mOldPosition = -1;
        public RecyclerView mOwnerRecyclerView;
        public List<Object> mPayloads = null;
        public int mPendingAccessibilityState = -1;
        public int mPosition = -1;
        public int mPreLayoutPosition = -1;
        public C1145s mScrapContainer = null;
        public C1119a0 mShadowedHolder = null;
        public C1119a0 mShadowingHolder = null;
        public List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public C1119a0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(1024);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (C6333d0.C6337d.m15049i(view)) {
                    return true;
                }
            }
            return false;
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.mo4552G(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final Adapter<? extends C1119a0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int G;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (G = this.mOwnerRecyclerView.mo4552G(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, G);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 1024) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            if (list == null || list.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        /* access modifiers changed from: package-private */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (!C6333d0.C6337d.m15049i(view)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).f4299d = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                View view = this.itemView;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                this.mWasImportantForAccessibilityBeforeHidden = C6333d0.C6337d.m15043c(view);
            }
            if (recyclerView.mo4556N()) {
                this.mPendingAccessibilityState = 4;
                recyclerView.f4240J0.add(this);
                return;
            }
            View view2 = this.itemView;
            WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
            C6333d0.C6337d.m15059s(view2, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            int i = this.mWasImportantForAccessibilityBeforeHidden;
            if (recyclerView.mo4556N()) {
                this.mPendingAccessibilityState = i;
                recyclerView.f4240J0.add(this);
            } else {
                View view = this.itemView;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6337d.m15059s(view, i);
            }
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.m3008j(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i;
            int i2 = this.mIsRecyclableCount;
            if (z) {
                i = i2 - 1;
            } else {
                i = i2 + 1;
            }
            this.mIsRecyclableCount = i;
            if (i < 0) {
                this.mIsRecyclableCount = 0;
                toString();
            } else if (!z && i == 1) {
                this.mFlags |= 16;
            } else if (z && i == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(C1145s sVar, boolean z) {
            this.mScrapContainer = sVar;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & FLAG_IGNORE) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            String str;
            String str2;
            if (getClass().isAnonymousClass()) {
                str = "ViewHolder";
            } else {
                str = getClass().getSimpleName();
            }
            StringBuilder t = C0016g.m36t(str, "{");
            t.append(Integer.toHexString(hashCode()));
            t.append(" position=");
            t.append(this.mPosition);
            t.append(" id=");
            t.append(this.mItemId);
            t.append(", oldPos=");
            t.append(this.mOldPosition);
            t.append(", pLpos:");
            t.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(t.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                if (this.mInChangeScrap) {
                    str2 = "[changeScrap]";
                } else {
                    str2 = "[attachedScrap]";
                }
                sb.append(str2);
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                StringBuilder k = C13555b.m33972k(" not recyclable(");
                k.append(this.mIsRecyclableCount);
                k.append(")");
                sb.append(k.toString());
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.mo4926k(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public class C1120b implements Runnable {
        public C1120b() {
        }

        public final void run() {
            C1128j jVar = RecyclerView.this.f4247N;
            if (jVar != null) {
                jVar.mo4779i();
            }
            RecyclerView.this.f4224B0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public class C1121c implements Interpolator {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public class C1122d {
        public C1122d() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo4756a(androidx.recyclerview.widget.RecyclerView.C1119a0 r9, androidx.recyclerview.widget.RecyclerView.C1128j.C1131c r10, androidx.recyclerview.widget.RecyclerView.C1128j.C1131c r11) {
            /*
                r8 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r0.getClass()
                r1 = 0
                r9.setIsRecyclable(r1)
                androidx.recyclerview.widget.RecyclerView$j r1 = r0.f4247N
                r2 = r1
                androidx.recyclerview.widget.g0 r2 = (androidx.recyclerview.widget.C1185g0) r2
                if (r10 == 0) goto L_0x0029
                r2.getClass()
                int r4 = r10.f4312a
                int r6 = r11.f4312a
                if (r4 != r6) goto L_0x001f
                int r1 = r10.f4313b
                int r3 = r11.f4313b
                if (r1 == r3) goto L_0x0029
            L_0x001f:
                int r5 = r10.f4313b
                int r7 = r11.f4313b
                r3 = r9
                boolean r9 = r2.mo5060l(r3, r4, r5, r6, r7)
                goto L_0x002d
            L_0x0029:
                r2.mo5058j(r9)
                r9 = 1
            L_0x002d:
                if (r9 == 0) goto L_0x0032
                r0.mo4563U()
            L_0x0032:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1122d.mo4756a(androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.RecyclerView$j$c, androidx.recyclerview.widget.RecyclerView$j$c):void");
        }

        /* renamed from: b */
        public final void mo4757b(C1119a0 a0Var, C1128j.C1131c cVar, C1128j.C1131c cVar2) {
            int i;
            int i2;
            boolean z;
            RecyclerView.this.f4258c.mo4926k(a0Var);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mo4590f(a0Var);
            a0Var.setIsRecyclable(false);
            C1185g0 g0Var = (C1185g0) recyclerView.f4247N;
            g0Var.getClass();
            int i3 = cVar.f4312a;
            int i4 = cVar.f4313b;
            View view = a0Var.itemView;
            if (cVar2 == null) {
                i = view.getLeft();
            } else {
                i = cVar2.f4312a;
            }
            int i5 = i;
            if (cVar2 == null) {
                i2 = view.getTop();
            } else {
                i2 = cVar2.f4313b;
            }
            int i6 = i2;
            if (a0Var.isRemoved() || (i3 == i5 && i4 == i6)) {
                g0Var.mo5061m(a0Var);
                z = true;
            } else {
                view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
                z = g0Var.mo5060l(a0Var, i3, i4, i5, i6);
            }
            if (z) {
                recyclerView.mo4563U();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public static /* synthetic */ class C1123e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4305a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy[] r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4305a = r0
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4305a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1123e.<clinit>():void");
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public static class C1124f extends Observable<C1125g> {
        /* renamed from: a */
        public final boolean mo4758a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public final void mo4759b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1125g) this.mObservers.get(size)).mo4765a();
            }
        }

        /* renamed from: c */
        public final void mo4760c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1125g) this.mObservers.get(size)).mo4769e(i, i2);
            }
        }

        /* renamed from: d */
        public final void mo4761d(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1125g) this.mObservers.get(size)).mo4767c(i, i2, obj);
            }
        }

        /* renamed from: e */
        public final void mo4762e(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1125g) this.mObservers.get(size)).mo4768d(i, i2);
            }
        }

        /* renamed from: f */
        public final void mo4763f(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1125g) this.mObservers.get(size)).mo4770f(i, i2);
            }
        }

        /* renamed from: g */
        public final void mo4764g() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C1125g) this.mObservers.get(size)).mo4771g();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class C1125g {
        /* renamed from: a */
        public void mo4765a() {
        }

        /* renamed from: b */
        public void mo4766b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo4767c(int i, int i2, Object obj) {
            mo4766b(i, i2);
        }

        /* renamed from: d */
        public void mo4768d(int i, int i2) {
        }

        /* renamed from: e */
        public void mo4769e(int i, int i2) {
        }

        /* renamed from: f */
        public void mo4770f(int i, int i2) {
        }

        /* renamed from: g */
        public void mo4771g() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public interface C1126h {
        /* renamed from: g */
        int mo255g(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static class C1127i {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public static abstract class C1128j {

        /* renamed from: a */
        public C1130b f4306a = null;

        /* renamed from: b */
        public ArrayList<C1129a> f4307b = new ArrayList<>();

        /* renamed from: c */
        public long f4308c = 120;

        /* renamed from: d */
        public long f4309d = 120;

        /* renamed from: e */
        public long f4310e = 250;

        /* renamed from: f */
        public long f4311f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$j$a */
        public interface C1129a {
            /* renamed from: a */
            void mo4780a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$j$b */
        public interface C1130b {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$j$c */
        public static class C1131c {

            /* renamed from: a */
            public int f4312a;

            /* renamed from: b */
            public int f4313b;

            /* renamed from: a */
            public final void mo4781a(C1119a0 a0Var) {
                View view = a0Var.itemView;
                this.f4312a = view.getLeft();
                this.f4313b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        /* renamed from: b */
        public static void m3082b(C1119a0 a0Var) {
            int i = a0Var.mFlags & 14;
            if (!a0Var.isInvalid() && (i & 4) == 0) {
                a0Var.getOldPosition();
                a0Var.getAbsoluteAdapterPosition();
            }
        }

        /* renamed from: a */
        public abstract boolean mo4772a(C1119a0 a0Var, C1119a0 a0Var2, C1131c cVar, C1131c cVar2);

        /* renamed from: c */
        public boolean mo4773c(C1119a0 a0Var, List<Object> list) {
            if (!((C1185g0) this).f4498g || a0Var.isInvalid()) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final void mo4774d(C1119a0 a0Var) {
            C1130b bVar = this.f4306a;
            if (bVar != null) {
                C1132k kVar = (C1132k) bVar;
                boolean z = true;
                a0Var.setIsRecyclable(true);
                if (a0Var.mShadowedHolder != null && a0Var.mShadowingHolder == null) {
                    a0Var.mShadowedHolder = null;
                }
                a0Var.mShadowingHolder = null;
                if (!a0Var.shouldBeKeptAsChild()) {
                    RecyclerView recyclerView = RecyclerView.this;
                    View view = a0Var.itemView;
                    recyclerView.mo4619i0();
                    C1171e eVar = recyclerView.f4261f;
                    int indexOfChild = ((C1168c0) eVar.f4449a).f4442a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        eVar.mo5039m(view);
                    } else if (eVar.f4450b.mo5044d(indexOfChild)) {
                        eVar.f4450b.mo5046f(indexOfChild);
                        eVar.mo5039m(view);
                        ((C1168c0) eVar.f4449a).mo5020b(indexOfChild);
                    } else {
                        z = false;
                    }
                    if (z) {
                        C1119a0 K = RecyclerView.m3001K(view);
                        recyclerView.f4258c.mo4926k(K);
                        recyclerView.f4258c.mo4923h(K);
                    }
                    recyclerView.mo4623j0(!z);
                    if (!z && a0Var.isTmpDetached()) {
                        RecyclerView.this.removeDetachedView(a0Var.itemView, false);
                    }
                }
            }
        }

        /* renamed from: e */
        public final void mo4775e() {
            int size = this.f4307b.size();
            for (int i = 0; i < size; i++) {
                this.f4307b.get(i).mo4780a();
            }
            this.f4307b.clear();
        }

        /* renamed from: f */
        public abstract void mo4776f(C1119a0 a0Var);

        /* renamed from: g */
        public abstract void mo4777g();

        /* renamed from: h */
        public abstract boolean mo4778h();

        /* renamed from: i */
        public abstract void mo4779i();
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public class C1132k implements C1128j.C1130b {
        public C1132k() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C1133l {
        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, C1152x xVar) {
            onDraw(canvas, recyclerView);
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1152x xVar) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1152x xVar) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).mo4704b(), recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public static abstract class C1134m {
        public boolean mAutoMeasure = false;
        public C1171e mChildHelper;
        private int mHeight;
        private int mHeightMode;
        public C1199j0 mHorizontalBoundCheck;
        private final C1199j0.C1201b mHorizontalBoundCheckCallback;
        public boolean mIsAttachedToWindow = false;
        private boolean mItemPrefetchEnabled = true;
        private boolean mMeasurementCacheEnabled = true;
        public int mPrefetchMaxCountObserved;
        public boolean mPrefetchMaxObservedInInitialPrefetch;
        public RecyclerView mRecyclerView;
        public boolean mRequestedSimpleAnimations = false;
        public C1149w mSmoothScroller;
        public C1199j0 mVerticalBoundCheck;
        private final C1199j0.C1201b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$a */
        public class C1135a implements C1199j0.C1201b {
            public C1135a() {
            }

            /* renamed from: a */
            public final int mo4903a(View view) {
                return C1134m.this.getDecoratedLeft(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: b */
            public final int mo4904b() {
                return C1134m.this.getPaddingLeft();
            }

            /* renamed from: c */
            public final int mo4905c() {
                return C1134m.this.getWidth() - C1134m.this.getPaddingRight();
            }

            /* renamed from: d */
            public final View mo4906d(int i) {
                return C1134m.this.getChildAt(i);
            }

            /* renamed from: e */
            public final int mo4907e(View view) {
                return C1134m.this.getDecoratedRight(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$b */
        public class C1136b implements C1199j0.C1201b {
            public C1136b() {
            }

            /* renamed from: a */
            public final int mo4903a(View view) {
                return C1134m.this.getDecoratedTop(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: b */
            public final int mo4904b() {
                return C1134m.this.getPaddingTop();
            }

            /* renamed from: c */
            public final int mo4905c() {
                return C1134m.this.getHeight() - C1134m.this.getPaddingBottom();
            }

            /* renamed from: d */
            public final View mo4906d(int i) {
                return C1134m.this.getChildAt(i);
            }

            /* renamed from: e */
            public final int mo4907e(View view) {
                return C1134m.this.getDecoratedBottom(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$c */
        public interface C1137c {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$m$d */
        public static class C1138d {

            /* renamed from: a */
            public int f4317a;

            /* renamed from: b */
            public int f4318b;

            /* renamed from: c */
            public boolean f4319c;

            /* renamed from: d */
            public boolean f4320d;
        }

        public C1134m() {
            C1135a aVar = new C1135a();
            this.mHorizontalBoundCheckCallback = aVar;
            C1136b bVar = new C1136b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new C1199j0(aVar);
            this.mVerticalBoundCheck = new C1199j0(bVar);
        }

        private void addViewInt(View view, int i, boolean z) {
            C1119a0 K = RecyclerView.m3001K(view);
            if (z || K.isRemoved()) {
                C1203k0 k0Var = this.mRecyclerView.f4262g;
                C1203k0.C1204a orDefault = k0Var.f4533a.getOrDefault(K, null);
                if (orDefault == null) {
                    orDefault = C1203k0.C1204a.m3290a();
                    k0Var.f4533a.put(K, orDefault);
                }
                orDefault.f4536a |= 1;
            } else {
                this.mRecyclerView.f4262g.mo5090d(K);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (K.wasReturnedFromScrap() || K.isScrap()) {
                if (K.isScrap()) {
                    K.unScrap();
                } else {
                    K.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.mo5028b(view, i, view.getLayoutParams(), false);
            } else {
                int i2 = -1;
                if (view.getParent() == this.mRecyclerView) {
                    int j = this.mChildHelper.mo5036j(view);
                    if (i == -1) {
                        i = this.mChildHelper.mo5031e();
                    }
                    if (j == -1) {
                        StringBuilder k = C13555b.m33972k("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        k.append(this.mRecyclerView.indexOfChild(view));
                        throw new IllegalStateException(C13437d.m33704i(this.mRecyclerView, k));
                    } else if (j != i) {
                        this.mRecyclerView.f4271n.moveView(j, i);
                    }
                } else {
                    this.mChildHelper.mo5027a(view, i, false);
                    layoutParams.f4299d = true;
                    C1149w wVar = this.mSmoothScroller;
                    if (wVar != null && wVar.f4340e) {
                        wVar.f4337b.getClass();
                        C1119a0 K2 = RecyclerView.m3001K(view);
                        if (K2 != null) {
                            i2 = K2.getLayoutPosition();
                        }
                        if (i2 == wVar.f4336a) {
                            wVar.f4341f = view;
                        }
                    }
                }
            }
            if (layoutParams.f4300e) {
                K.itemView.invalidate();
                layoutParams.f4300e = false;
            }
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i2, i3));
            }
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }

        private void detachViewInternal(int i, View view) {
            this.mChildHelper.mo5029c(i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            if (r3 >= 0) goto L_0x0011;
         */
        @java.lang.Deprecated
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L_0x000f
                if (r3 < 0) goto L_0x000d
                goto L_0x0011
            L_0x000d:
                r3 = 0
                goto L_0x0021
            L_0x000f:
                if (r3 < 0) goto L_0x0014
            L_0x0011:
                r2 = 1073741824(0x40000000, float:2.0)
                goto L_0x0021
            L_0x0014:
                r4 = -1
                if (r3 != r4) goto L_0x001b
                r2 = 1073741824(0x40000000, float:2.0)
            L_0x0019:
                r3 = r1
                goto L_0x0021
            L_0x001b:
                r4 = -2
                if (r3 != r4) goto L_0x000d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0019
            L_0x0021:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1134m.getChildMeasureSpec(int, int, int, boolean):int");
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width2 - width;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public static C1138d getProperties(Context context, AttributeSet attributeSet, int i, int i2) {
            C1138d dVar = new C1138d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6035d.RecyclerView, i, i2);
            dVar.f4317a = obtainStyledAttributes.getInt(C6035d.RecyclerView_android_orientation, 1);
            dVar.f4318b = obtainStyledAttributes.getInt(C6035d.RecyclerView_spanCount, 1);
            dVar.f4319c = obtainStyledAttributes.getBoolean(C6035d.RecyclerView_reverseLayout, false);
            dVar.f4320d = obtainStyledAttributes.getBoolean(C6035d.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.f4265j;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            if (rect.left - i >= width || rect.right - i <= paddingLeft || rect.top - i2 >= height || rect.bottom - i2 <= paddingTop) {
                return false;
            }
            return true;
        }

        private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i) {
                    return true;
                }
                return false;
            } else if (size >= i) {
                return true;
            } else {
                return false;
            }
        }

        private void scrapOrRecycleView(C1145s sVar, int i, View view) {
            C1119a0 K = RecyclerView.m3001K(view);
            if (!K.shouldIgnore()) {
                if (!K.isInvalid() || K.isRemoved() || this.mRecyclerView.f4269m.hasStableIds()) {
                    detachViewAt(i);
                    sVar.mo4924i(view);
                    this.mRecyclerView.f4262g.mo5090d(K);
                    return;
                }
                removeViewAt(i);
                sVar.mo4923h(K);
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null && !recyclerView.mo4556N()) {
                if (str == null) {
                    throw new IllegalStateException(C13437d.m33704i(recyclerView, C13555b.m33972k("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
                }
                throw new IllegalStateException(C13437d.m33704i(recyclerView, C13555b.m33972k(str)));
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.mo4618i(str);
            }
        }

        public void attachView(View view, int i, LayoutParams layoutParams) {
            C1119a0 K = RecyclerView.m3001K(view);
            if (K.isRemoved()) {
                C1203k0 k0Var = this.mRecyclerView.f4262g;
                C1203k0.C1204a orDefault = k0Var.f4533a.getOrDefault(K, null);
                if (orDefault == null) {
                    orDefault = C1203k0.C1204a.m3290a();
                    k0Var.f4533a.put(K, orDefault);
                }
                orDefault.f4536a |= 1;
            } else {
                this.mRecyclerView.f4262g.mo5090d(K);
            }
            this.mChildHelper.mo5028b(view, i, layoutParams, K.isRemoved());
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.mo4555M(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public void collectAdjacentPrefetchPositions(int i, int i2, C1152x xVar, C1137c cVar) {
        }

        public void collectInitialPrefetchPositions(int i, C1137c cVar) {
        }

        public int computeHorizontalScrollExtent(C1152x xVar) {
            return 0;
        }

        public int computeHorizontalScrollOffset(C1152x xVar) {
            return 0;
        }

        public int computeHorizontalScrollRange(C1152x xVar) {
            return 0;
        }

        public int computeVerticalScrollExtent(C1152x xVar) {
            return 0;
        }

        public int computeVerticalScrollOffset(C1152x xVar) {
            return 0;
        }

        public int computeVerticalScrollRange(C1152x xVar) {
            return 0;
        }

        public void detachAndScrapAttachedViews(C1145s sVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(sVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(View view, C1145s sVar) {
            scrapOrRecycleView(sVar, this.mChildHelper.mo5036j(view), view);
        }

        public void detachAndScrapViewAt(int i, C1145s sVar) {
            scrapOrRecycleView(sVar, i, getChildAt(i));
        }

        public void detachView(View view) {
            int j = this.mChildHelper.mo5036j(view);
            if (j >= 0) {
                detachViewInternal(j, view);
            }
        }

        public void detachViewAt(int i) {
            detachViewInternal(i, getChildAt(i));
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, C1145s sVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, sVar);
        }

        public void endAnimation(View view) {
            C1128j jVar = this.mRecyclerView.f4247N;
            if (jVar != null) {
                jVar.mo4776f(RecyclerView.m3001K(view));
            }
        }

        public View findContainingItemView(View view) {
            View B;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (B = recyclerView.mo4548B(view)) == null || this.mChildHelper.mo5037k(B)) {
                return null;
            }
            return B;
        }

        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                C1119a0 K = RecyclerView.m3001K(childAt);
                if (K != null && K.getLayoutPosition() == i && !K.shouldIgnore() && (this.mRecyclerView.f4288v0.f4355g || !K.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract LayoutParams generateDefaultLayoutParams();

        public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view) {
            return ((LayoutParams) view.getLayoutParams()).f4298c.bottom;
        }

        public View getChildAt(int i) {
            C1171e eVar = this.mChildHelper;
            if (eVar != null) {
                return eVar.mo5030d(i);
            }
            return null;
        }

        public int getChildCount() {
            C1171e eVar = this.mChildHelper;
            if (eVar != null) {
                return eVar.mo5031e();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.f4263h;
        }

        public int getColumnCountForAccessibility(C1145s sVar, C1152x xVar) {
            return -1;
        }

        public int getDecoratedBottom(View view) {
            return getBottomDecorationHeight(view) + view.getBottom();
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.m3002L(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f4298c;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f4298c;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return getRightDecorationWidth(view) + view.getRight();
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.mo5037k(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            Adapter adapter;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                adapter = recyclerView.getAdapter();
            } else {
                adapter = null;
            }
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(View view) {
            return RecyclerView.m3001K(view).getItemViewType();
        }

        public int getLayoutDirection() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            return C6333d0.C6338e.m15063d(recyclerView);
        }

        public int getLeftDecorationWidth(View view) {
            return ((LayoutParams) view.getLayoutParams()).f4298c.left;
        }

        public int getMinimumHeight() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            return C6333d0.C6337d.m15044d(recyclerView);
        }

        public int getMinimumWidth() {
            RecyclerView recyclerView = this.mRecyclerView;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            return C6333d0.C6337d.m15045e(recyclerView);
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            return C6333d0.C6338e.m15064e(recyclerView);
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            return C6333d0.C6338e.m15065f(recyclerView);
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view) {
            return ((LayoutParams) view.getLayoutParams()).mo4704b();
        }

        public int getRightDecorationWidth(View view) {
            return ((LayoutParams) view.getLayoutParams()).f4298c.right;
        }

        public int getRowCountForAccessibility(C1145s sVar, C1152x xVar) {
            return -1;
        }

        public int getSelectionModeForAccessibility(C1145s sVar, C1152x xVar) {
            return 0;
        }

        public int getTopDecorationHeight(View view) {
            return ((LayoutParams) view.getLayoutParams()).f4298c.top;
        }

        public void getTransformedBoundingBox(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).f4298c;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.mRecyclerView == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.mRecyclerView.f4267l;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException(C13437d.m33704i(this.mRecyclerView, C13555b.m33972k("View should be fully attached to be ignored")));
            }
            C1119a0 K = RecyclerView.m3001K(view);
            K.addFlags(C1119a0.FLAG_IGNORE);
            this.mRecyclerView.f4262g.mo5091e(K);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(C1145s sVar, C1152x xVar) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            C1149w wVar = this.mSmoothScroller;
            if (wVar == null || !wVar.f4340e) {
                return false;
            }
            return true;
        }

        public boolean isViewPartiallyVisible(View view, boolean z, boolean z2) {
            boolean z3;
            if (!this.mHorizontalBoundCheck.mo5083b(view) || !this.mVerticalBoundCheck.mo5083b(view)) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z) {
                return z3;
            }
            return !z3;
        }

        public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).f4298c;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f4298c;
            view.layout(i + rect.left + layoutParams.leftMargin, i2 + rect.top + layoutParams.topMargin, (i3 - rect.right) - layoutParams.rightMargin, (i4 - rect.bottom) - layoutParams.bottomMargin);
        }

        public void measureChild(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect M = this.mRecyclerView.mo4555M(view);
            int i3 = M.left + M.right + i;
            int i4 = M.top + M.bottom + i2;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i3, layoutParams.width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i4, layoutParams.height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view, int i, int i2) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect M = this.mRecyclerView.mo4555M(view);
            int i3 = M.left + M.right + i;
            int i4 = M.top + M.bottom + i2;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin + i3, layoutParams.width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + i4, layoutParams.height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, layoutParams)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                detachViewAt(i);
                attachView(childAt, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
        }

        public void offsetChildrenHorizontal(int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                int e = recyclerView.f4261f.mo5031e();
                for (int i2 = 0; i2 < e; i2++) {
                    recyclerView.f4261f.mo5030d(i2).offsetLeftAndRight(i);
                }
            }
        }

        public void offsetChildrenVertical(int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                int e = recyclerView.f4261f.mo5031e();
                for (int i2 = 0; i2 < e; i2++) {
                    recyclerView.f4261f.mo5030d(i2).offsetTopAndBottom(i);
                }
            }
        }

        public void onAdapterChanged(Adapter adapter, Adapter adapter2) {
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, C1145s sVar) {
            onDetachedFromWindow(recyclerView);
        }

        public View onFocusSearchFailed(View view, int i, C1145s sVar, C1152x xVar) {
            return null;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.f4258c, recyclerView.f4288v0, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(C6531g gVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.f4258c, recyclerView.f4288v0, gVar);
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, C6531g gVar) {
            C1119a0 K = RecyclerView.m3001K(view);
            if (K != null && !K.isRemoved() && !this.mChildHelper.mo5037k(K.itemView)) {
                RecyclerView recyclerView = this.mRecyclerView;
                onInitializeAccessibilityNodeInfoForItem(recyclerView.f4258c, recyclerView.f4288v0, view, gVar);
            }
        }

        public void onInitializeAccessibilityNodeInfoForItem(C1145s sVar, C1152x xVar, View view, C6531g gVar) {
        }

        public View onInterceptFocusSearch(View view, int i) {
            return null;
        }

        public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        public void onLayoutChildren(C1145s sVar, C1152x xVar) {
        }

        public void onLayoutCompleted(C1152x xVar) {
        }

        public void onMeasure(C1145s sVar, C1152x xVar, int i, int i2) {
            this.mRecyclerView.mo4629n(i, i2);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.mo4556N();
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i) {
        }

        public void onSmoothScrollerStopped(C1149w wVar) {
            if (this.mSmoothScroller == wVar) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.f4258c, recyclerView.f4288v0, i, bundle);
        }

        public boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.f4258c, recyclerView.f4288v0, view, i, bundle);
        }

        public boolean performAccessibilityActionForItem(C1145s sVar, C1152x xVar, View view, int i, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6337d.m15053m(recyclerView, runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.mo5038l(childCount);
            }
        }

        public void removeAndRecycleAllViews(C1145s sVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.m3001K(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, sVar);
                }
            }
        }

        public void removeAndRecycleScrapInt(C1145s sVar) {
            int size = sVar.f4327a.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = sVar.f4327a.get(i).itemView;
                C1119a0 K = RecyclerView.m3001K(view);
                if (!K.shouldIgnore()) {
                    K.setIsRecyclable(false);
                    if (K.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    C1128j jVar = this.mRecyclerView.f4247N;
                    if (jVar != null) {
                        jVar.mo4776f(K);
                    }
                    K.setIsRecyclable(true);
                    C1119a0 K2 = RecyclerView.m3001K(view);
                    K2.mScrapContainer = null;
                    K2.mInChangeScrap = false;
                    K2.clearReturnedFromScrapFlag();
                    sVar.mo4923h(K2);
                }
            }
            sVar.f4327a.clear();
            ArrayList<C1119a0> arrayList = sVar.f4328b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, C1145s sVar) {
            removeView(view);
            sVar.mo4922g(view);
        }

        public void removeAndRecycleViewAt(int i, C1145s sVar) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            sVar.mo4922g(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            C1171e eVar = this.mChildHelper;
            int indexOfChild = ((C1168c0) eVar.f4449a).f4442a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (eVar.f4450b.mo5046f(indexOfChild)) {
                    eVar.mo5039m(view);
                }
                ((C1168c0) eVar.f4449a).mo5020b(indexOfChild);
            }
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                this.mChildHelper.mo5038l(i);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i, C1145s sVar, C1152x xVar) {
            return 0;
        }

        public void scrollToPosition(int i) {
        }

        public int scrollVerticallyBy(int i, C1145s sVar, C1152x xVar) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.f4258c.mo4927l();
                }
            }
        }

        public void setMeasureSpecs(int i, int i2) {
            this.mWidth = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.f4216Q0) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mHeightMode = mode2;
            if (mode2 == 0 && !RecyclerView.f4216Q0) {
                this.mHeight = 0;
            }
        }

        public void setMeasuredDimension(Rect rect, int i, int i2) {
            setMeasuredDimension(chooseSize(i, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i2, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.mo4629n(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.f4265j;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i11 = rect.top;
                if (i11 < i6) {
                    i6 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i4) {
                    i4 = i12;
                }
            }
            this.mRecyclerView.f4265j.set(i5, i6, i3, i4);
            setMeasuredDimension(this.mRecyclerView.f4265j, i, i2);
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.f4261f;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view, int i, int i2, LayoutParams layoutParams) {
            if (view.isLayoutRequested() || !this.mMeasurementCacheEnabled || !isMeasurementUpToDate(view.getWidth(), i, layoutParams.width) || !isMeasurementUpToDate(view.getHeight(), i2, layoutParams.height)) {
                return true;
            }
            return false;
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i, int i2, LayoutParams layoutParams) {
            if (!this.mMeasurementCacheEnabled || !isMeasurementUpToDate(view.getMeasuredWidth(), i, layoutParams.width) || !isMeasurementUpToDate(view.getMeasuredHeight(), i2, layoutParams.height)) {
                return true;
            }
            return false;
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, C1152x xVar, int i) {
        }

        public void startSmoothScroll(C1149w wVar) {
            C1149w wVar2 = this.mSmoothScroller;
            if (!(wVar2 == null || wVar == wVar2 || !wVar2.f4340e)) {
                wVar2.mo4932c();
            }
            this.mSmoothScroller = wVar;
            RecyclerView recyclerView = this.mRecyclerView;
            wVar.getClass();
            C1154z zVar = recyclerView.f4282s0;
            RecyclerView.this.removeCallbacks(zVar);
            zVar.f4365d.abortAnimation();
            wVar.f4337b = recyclerView;
            wVar.f4338c = this;
            int i = wVar.f4336a;
            if (i != -1) {
                recyclerView.f4288v0.f4349a = i;
                wVar.f4340e = true;
                wVar.f4339d = true;
                wVar.f4341f = recyclerView.f4271n.findViewByPosition(i);
                wVar.f4337b.f4282s0.mo4937a();
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public void stopIgnoringView(View view) {
            C1119a0 K = RecyclerView.m3001K(view);
            K.stopIgnoring();
            K.resetInternal();
            K.addFlags(4);
        }

        public void stopSmoothScroller() {
            C1149w wVar = this.mSmoothScroller;
            if (wVar != null) {
                wVar.mo4932c();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public void addDisappearingView(View view, int i) {
            addViewInt(view, i, true);
        }

        public void addView(View view, int i) {
            addViewInt(view, i, false);
        }

        public void onInitializeAccessibilityEvent(C1145s sVar, C1152x xVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                Adapter adapter = this.mRecyclerView.f4269m;
                if (adapter != null) {
                    accessibilityEvent.setItemCount(adapter.getItemCount());
                }
            }
        }

        public void onInitializeAccessibilityNodeInfo(C1145s sVar, C1152x xVar, C6531g gVar) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                gVar.mo22634a(8192);
                gVar.mo22648m(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                gVar.mo22634a(4096);
                gVar.mo22648m(true);
            }
            gVar.f20334a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C6531g.C6533b.m15466a(getRowCountForAccessibility(sVar, xVar), getColumnCountForAccessibility(sVar, xVar), getSelectionModeForAccessibility(sVar, xVar), isLayoutHierarchical(sVar, xVar)).f20352a);
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, C1152x xVar, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean performAccessibilityAction(androidx.recyclerview.widget.RecyclerView.C1145s r2, androidx.recyclerview.widget.RecyclerView.C1152x r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r2 = r1.mRecyclerView
                r3 = 0
                if (r2 != 0) goto L_0x0006
                return r3
            L_0x0006:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L_0x0042
                r5 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r5) goto L_0x0012
                r2 = 0
            L_0x0010:
                r4 = 0
                goto L_0x006e
            L_0x0012:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L_0x0029
                int r2 = r1.getHeight()
                int r5 = r1.getPaddingTop()
                int r2 = r2 - r5
                int r5 = r1.getPaddingBottom()
                int r2 = r2 - r5
                int r2 = -r2
                goto L_0x002a
            L_0x0029:
                r2 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r5 = r1.mRecyclerView
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.getWidth()
                int r5 = r1.getPaddingLeft()
                int r4 = r4 - r5
                int r5 = r1.getPaddingRight()
                int r4 = r4 - r5
                int r4 = -r4
                goto L_0x006e
            L_0x0042:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L_0x0057
                int r2 = r1.getHeight()
                int r4 = r1.getPaddingTop()
                int r2 = r2 - r4
                int r4 = r1.getPaddingBottom()
                int r2 = r2 - r4
                goto L_0x0058
            L_0x0057:
                r2 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r4 = r1.mRecyclerView
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L_0x0010
                int r4 = r1.getWidth()
                int r5 = r1.getPaddingLeft()
                int r4 = r4 - r5
                int r5 = r1.getPaddingRight()
                int r4 = r4 - r5
            L_0x006e:
                if (r2 != 0) goto L_0x0073
                if (r4 != 0) goto L_0x0073
                return r3
            L_0x0073:
                androidx.recyclerview.widget.RecyclerView r3 = r1.mRecyclerView
                r3.mo4594g0(r4, r2, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1134m.performAccessibilityAction(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x, int, android.os.Bundle):boolean");
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i = childRectangleOnScreenScrollAmount[0];
            int i2 = childRectangleOnScreenScrollAmount[1];
            if ((z2 && !isFocusedChildVisibleAfterScrolling(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.mo4594g0(i, i2, false);
            }
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1134m.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        public LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void setMeasuredDimension(int i, int i2) {
            this.mRecyclerView.setMeasuredDimension(i, i2);
        }

        public void attachView(View view, int i) {
            attachView(view, i, (LayoutParams) view.getLayoutParams());
        }

        public void attachView(View view) {
            attachView(view, -1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public interface C1139n {
        /* renamed from: a */
        void mo4908a(View view);

        /* renamed from: c */
        void mo4909c(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C1140o {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public interface C1141p {
        /* renamed from: b */
        boolean mo4910b(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: d */
        void mo4911d(boolean z);

        void onTouchEvent(MotionEvent motionEvent);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public static abstract class C1142q {
        /* renamed from: a */
        public void mo4913a(int i, RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public void mo4914b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static class C1143r {

        /* renamed from: a */
        public SparseArray<C1144a> f4321a = new SparseArray<>();

        /* renamed from: b */
        public int f4322b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$r$a */
        public static class C1144a {

            /* renamed from: a */
            public final ArrayList<C1119a0> f4323a = new ArrayList<>();

            /* renamed from: b */
            public int f4324b = 5;

            /* renamed from: c */
            public long f4325c = 0;

            /* renamed from: d */
            public long f4326d = 0;
        }

        /* renamed from: a */
        public final C1144a mo4915a(int i) {
            C1144a aVar = this.f4321a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C1144a aVar2 = new C1144a();
            this.f4321a.put(i, aVar2);
            return aVar2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public final class C1145s {

        /* renamed from: a */
        public final ArrayList<C1119a0> f4327a;

        /* renamed from: b */
        public ArrayList<C1119a0> f4328b = null;

        /* renamed from: c */
        public final ArrayList<C1119a0> f4329c = new ArrayList<>();

        /* renamed from: d */
        public final List<C1119a0> f4330d;

        /* renamed from: e */
        public int f4331e;

        /* renamed from: f */
        public int f4332f;

        /* renamed from: g */
        public C1143r f4333g;

        public C1145s() {
            ArrayList<C1119a0> arrayList = new ArrayList<>();
            this.f4327a = arrayList;
            this.f4330d = Collections.unmodifiableList(arrayList);
            this.f4331e = 2;
            this.f4332f = 2;
        }

        /* renamed from: a */
        public final void mo4916a(C1119a0 a0Var, boolean z) {
            C6315a aVar;
            RecyclerView.m3008j(a0Var);
            View view = a0Var.itemView;
            C1174e0 e0Var = RecyclerView.this.f4226C0;
            if (e0Var != null) {
                C1174e0.C1175a aVar2 = e0Var.f4455b;
                if (aVar2 instanceof C1174e0.C1175a) {
                    aVar = (C6315a) aVar2.f4457b.remove(view);
                } else {
                    aVar = null;
                }
                C6333d0.m15029q(view, aVar);
            }
            if (z) {
                C1146t tVar = RecyclerView.this.f4273o;
                if (tVar != null) {
                    tVar.mo4928a();
                }
                int size = RecyclerView.this.f4275p.size();
                for (int i = 0; i < size; i++) {
                    ((C1146t) RecyclerView.this.f4275p.get(i)).mo4928a();
                }
                Adapter adapter = RecyclerView.this.f4269m;
                if (adapter != null) {
                    adapter.onViewRecycled(a0Var);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f4288v0 != null) {
                    recyclerView.f4262g.mo5091e(a0Var);
                }
            }
            a0Var.mBindingAdapter = null;
            a0Var.mOwnerRecyclerView = null;
            C1143r c = mo4918c();
            c.getClass();
            int itemViewType = a0Var.getItemViewType();
            ArrayList<C1119a0> arrayList = c.mo4915a(itemViewType).f4323a;
            if (c.f4321a.get(itemViewType).f4324b > arrayList.size()) {
                a0Var.resetInternal();
                arrayList.add(a0Var);
            }
        }

        /* renamed from: b */
        public final int mo4917b(int i) {
            if (i < 0 || i >= RecyclerView.this.f4288v0.mo4935b()) {
                StringBuilder r = C25541a.m63887r("invalid position ", i, ". State item count is ");
                r.append(RecyclerView.this.f4288v0.mo4935b());
                throw new IndexOutOfBoundsException(C13437d.m33704i(RecyclerView.this, r));
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f4288v0.f4355g) {
                return i;
            }
            return recyclerView.f4260e.mo4998f(i, 0);
        }

        /* renamed from: c */
        public final C1143r mo4918c() {
            if (this.f4333g == null) {
                this.f4333g = new C1143r();
            }
            return this.f4333g;
        }

        /* renamed from: d */
        public final View mo4919d(int i) {
            return mo4925j(Long.MAX_VALUE, i).itemView;
        }

        /* renamed from: e */
        public final void mo4920e() {
            for (int size = this.f4329c.size() - 1; size >= 0; size--) {
                mo4921f(size);
            }
            this.f4329c.clear();
            if (RecyclerView.f4218S0) {
                C1223o.C1225b bVar = RecyclerView.this.f4286u0;
                int[] iArr = bVar.f4615c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f4616d = 0;
            }
        }

        /* renamed from: f */
        public final void mo4921f(int i) {
            mo4916a(this.f4329c.get(i), true);
            this.f4329c.remove(i);
        }

        /* renamed from: g */
        public final void mo4922g(View view) {
            C1119a0 K = RecyclerView.m3001K(view);
            if (K.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (K.isScrap()) {
                K.unScrap();
            } else if (K.wasReturnedFromScrap()) {
                K.clearReturnedFromScrapFlag();
            }
            mo4923h(K);
            if (RecyclerView.this.f4247N != null && !K.isRecyclable()) {
                RecyclerView.this.f4247N.mo4776f(K);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:40:0x0081 A[LOOP:1: B:40:0x0081->B:51:0x00aa, LOOP_START, PHI: r3 
          PHI: (r3v14 int) = (r3v12 int), (r3v15 int) binds: [B:39:0x007f, B:51:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo4923h(androidx.recyclerview.widget.RecyclerView.C1119a0 r9) {
            /*
                r8 = this;
                boolean r0 = r9.isScrap()
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x00fd
                android.view.View r0 = r9.itemView
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L_0x0012
                goto L_0x00fd
            L_0x0012:
                boolean r0 = r9.isTmpDetached()
                if (r0 != 0) goto L_0x00e4
                boolean r0 = r9.shouldIgnore()
                if (r0 != 0) goto L_0x00d2
                boolean r0 = r9.doesTransientStatePreventRecycling()
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r3 = r3.f4269m
                if (r3 == 0) goto L_0x0032
                if (r0 == 0) goto L_0x0032
                boolean r3 = r3.onFailedToRecycleView(r9)
                if (r3 == 0) goto L_0x0032
                r3 = 1
                goto L_0x0033
            L_0x0032:
                r3 = 0
            L_0x0033:
                if (r3 != 0) goto L_0x003f
                boolean r3 = r9.isRecyclable()
                if (r3 == 0) goto L_0x003c
                goto L_0x003f
            L_0x003c:
                r1 = 0
                goto L_0x00bc
            L_0x003f:
                int r3 = r8.f4332f
                if (r3 <= 0) goto L_0x00b4
                r3 = 526(0x20e, float:7.37E-43)
                boolean r3 = r9.hasAnyOfTheFlags(r3)
                if (r3 != 0) goto L_0x00b4
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r3 = r8.f4329c
                int r3 = r3.size()
                int r4 = r8.f4332f
                if (r3 < r4) goto L_0x005c
                if (r3 <= 0) goto L_0x005c
                r8.mo4921f(r2)
                int r3 = r3 + -1
            L_0x005c:
                boolean r2 = androidx.recyclerview.widget.RecyclerView.f4218S0
                if (r2 == 0) goto L_0x00ad
                if (r3 <= 0) goto L_0x00ad
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.o$b r2 = r2.f4286u0
                int r4 = r9.mPosition
                int[] r5 = r2.f4615c
                if (r5 == 0) goto L_0x007e
                int r5 = r2.f4616d
                int r5 = r5 * 2
                r6 = 0
            L_0x0071:
                if (r6 >= r5) goto L_0x007e
                int[] r7 = r2.f4615c
                r7 = r7[r6]
                if (r7 != r4) goto L_0x007b
                r2 = 1
                goto L_0x007f
            L_0x007b:
                int r6 = r6 + 2
                goto L_0x0071
            L_0x007e:
                r2 = 0
            L_0x007f:
                if (r2 != 0) goto L_0x00ad
            L_0x0081:
                int r3 = r3 + -1
                if (r3 < 0) goto L_0x00ac
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r2 = r8.f4329c
                java.lang.Object r2 = r2.get(r3)
                androidx.recyclerview.widget.RecyclerView$a0 r2 = (androidx.recyclerview.widget.RecyclerView.C1119a0) r2
                int r2 = r2.mPosition
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.o$b r4 = r4.f4286u0
                int[] r5 = r4.f4615c
                if (r5 == 0) goto L_0x00a9
                int r5 = r4.f4616d
                int r5 = r5 * 2
                r6 = 0
            L_0x009c:
                if (r6 >= r5) goto L_0x00a9
                int[] r7 = r4.f4615c
                r7 = r7[r6]
                if (r7 != r2) goto L_0x00a6
                r2 = 1
                goto L_0x00aa
            L_0x00a6:
                int r6 = r6 + 2
                goto L_0x009c
            L_0x00a9:
                r2 = 0
            L_0x00aa:
                if (r2 != 0) goto L_0x0081
            L_0x00ac:
                int r3 = r3 + r1
            L_0x00ad:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r2 = r8.f4329c
                r2.add(r3, r9)
                r2 = 1
                goto L_0x00b5
            L_0x00b4:
                r2 = 0
            L_0x00b5:
                if (r2 != 0) goto L_0x00bb
                r8.mo4916a(r9, r1)
                goto L_0x00bf
            L_0x00bb:
                r1 = r2
            L_0x00bc:
                r2 = 0
                r2 = r1
                r1 = 0
            L_0x00bf:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.k0 r3 = r3.f4262g
                r3.mo5091e(r9)
                if (r2 != 0) goto L_0x00d1
                if (r1 != 0) goto L_0x00d1
                if (r0 == 0) goto L_0x00d1
                r0 = 0
                r9.mBindingAdapter = r0
                r9.mOwnerRecyclerView = r0
            L_0x00d1:
                return
            L_0x00d2:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = p358af.C13437d.m33704i(r1, r0)
                r9.<init>(r0)
                throw r9
            L_0x00e4:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r1.append(r2)
                r1.append(r9)
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r9 = p358af.C13437d.m33704i(r9, r1)
                r0.<init>(r9)
                throw r0
            L_0x00fd:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Scrapped or attached views may not be recycled. isScrap:"
                java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
                boolean r3 = r9.isScrap()
                r2.append(r3)
                java.lang.String r3 = " isAttached:"
                r2.append(r3)
                android.view.View r9 = r9.itemView
                android.view.ViewParent r9 = r9.getParent()
                if (r9 == 0) goto L_0x011a
                goto L_0x011b
            L_0x011a:
                r1 = 0
            L_0x011b:
                r2.append(r1)
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r9 = p358af.C13437d.m33704i(r9, r2)
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1145s.mo4923h(androidx.recyclerview.widget.RecyclerView$a0):void");
        }

        /* renamed from: i */
        public final void mo4924i(View view) {
            boolean z;
            C1119a0 K = RecyclerView.m3001K(view);
            if (!K.hasAnyOfTheFlags(12) && K.isUpdated()) {
                C1128j jVar = RecyclerView.this.f4247N;
                if (jVar == null || jVar.mo4773c(K, K.getUnmodifiedPayloads())) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (this.f4328b == null) {
                        this.f4328b = new ArrayList<>();
                    }
                    K.setScrapContainer(this, true);
                    this.f4328b.add(K);
                    return;
                }
            }
            if (!K.isInvalid() || K.isRemoved() || RecyclerView.this.f4269m.hasStableIds()) {
                K.setScrapContainer(this, false);
                this.f4327a.add(K);
                return;
            }
            throw new IllegalArgumentException(C13437d.m33704i(RecyclerView.this, C13555b.m33972k("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:220:0x0470, code lost:
            if (r5 == false) goto L_0x0472;
         */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x0259  */
        /* JADX WARNING: Removed duplicated region for block: B:200:0x0400  */
        /* JADX WARNING: Removed duplicated region for block: B:205:0x0428  */
        /* JADX WARNING: Removed duplicated region for block: B:206:0x042b  */
        /* JADX WARNING: Removed duplicated region for block: B:258:0x050a  */
        /* JADX WARNING: Removed duplicated region for block: B:259:0x0518  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x008f  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0096  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.recyclerview.widget.RecyclerView.C1119a0 mo4925j(long r19, int r21) {
            /*
                r18 = this;
                r0 = r18
                r1 = r21
                if (r1 < 0) goto L_0x053b
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r2 = r2.f4288v0
                int r2 = r2.mo4935b()
                if (r1 >= r2) goto L_0x053b
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r2 = r2.f4288v0
                boolean r2 = r2.f4355g
                r3 = 32
                r4 = 0
                r5 = 0
                if (r2 == 0) goto L_0x0091
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r2 = r0.f4328b
                if (r2 == 0) goto L_0x008c
                int r2 = r2.size()
                if (r2 != 0) goto L_0x0027
                goto L_0x008c
            L_0x0027:
                r6 = 0
            L_0x0028:
                if (r6 >= r2) goto L_0x0045
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r0.f4328b
                java.lang.Object r7 = r7.get(r6)
                androidx.recyclerview.widget.RecyclerView$a0 r7 = (androidx.recyclerview.widget.RecyclerView.C1119a0) r7
                boolean r8 = r7.wasReturnedFromScrap()
                if (r8 != 0) goto L_0x0042
                int r8 = r7.getLayoutPosition()
                if (r8 != r1) goto L_0x0042
                r7.addFlags(r3)
                goto L_0x008d
            L_0x0042:
                int r6 = r6 + 1
                goto L_0x0028
            L_0x0045:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r6 = r6.f4269m
                boolean r6 = r6.hasStableIds()
                if (r6 == 0) goto L_0x008c
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r6 = r6.f4260e
                int r6 = r6.mo4998f(r1, r5)
                if (r6 <= 0) goto L_0x008c
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r7 = r7.f4269m
                int r7 = r7.getItemCount()
                if (r6 >= r7) goto L_0x008c
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r7 = r7.f4269m
                long r6 = r7.getItemId(r6)
                r8 = 0
            L_0x006c:
                if (r8 >= r2) goto L_0x008c
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r9 = r0.f4328b
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$a0 r9 = (androidx.recyclerview.widget.RecyclerView.C1119a0) r9
                boolean r10 = r9.wasReturnedFromScrap()
                if (r10 != 0) goto L_0x0089
                long r10 = r9.getItemId()
                int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r12 != 0) goto L_0x0089
                r9.addFlags(r3)
                r7 = r9
                goto L_0x008d
            L_0x0089:
                int r8 = r8 + 1
                goto L_0x006c
            L_0x008c:
                r7 = r4
            L_0x008d:
                if (r7 == 0) goto L_0x0092
                r2 = 1
                goto L_0x0093
            L_0x0091:
                r7 = r4
            L_0x0092:
                r2 = 0
            L_0x0093:
                r6 = -1
                if (r7 != 0) goto L_0x0252
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r0.f4327a
                int r7 = r7.size()
                r8 = 0
            L_0x009d:
                if (r8 >= r7) goto L_0x00cf
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r9 = r0.f4327a
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$a0 r9 = (androidx.recyclerview.widget.RecyclerView.C1119a0) r9
                boolean r10 = r9.wasReturnedFromScrap()
                if (r10 != 0) goto L_0x00cc
                int r10 = r9.getLayoutPosition()
                if (r10 != r1) goto L_0x00cc
                boolean r10 = r9.isInvalid()
                if (r10 != 0) goto L_0x00cc
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r10 = r10.f4288v0
                boolean r10 = r10.f4355g
                if (r10 != 0) goto L_0x00c7
                boolean r10 = r9.isRemoved()
                if (r10 != 0) goto L_0x00cc
            L_0x00c7:
                r9.addFlags(r3)
                goto L_0x01b8
            L_0x00cc:
                int r8 = r8 + 1
                goto L_0x009d
            L_0x00cf:
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.e r7 = r7.f4261f
                java.util.ArrayList r8 = r7.f4451c
                int r8 = r8.size()
                r9 = 0
            L_0x00da:
                if (r9 >= r8) goto L_0x0105
                java.util.ArrayList r10 = r7.f4451c
                java.lang.Object r10 = r10.get(r9)
                android.view.View r10 = (android.view.View) r10
                androidx.recyclerview.widget.e$b r11 = r7.f4449a
                androidx.recyclerview.widget.c0 r11 = (androidx.recyclerview.widget.C1168c0) r11
                r11.getClass()
                androidx.recyclerview.widget.RecyclerView$a0 r11 = androidx.recyclerview.widget.RecyclerView.m3001K(r10)
                int r12 = r11.getLayoutPosition()
                if (r12 != r1) goto L_0x0102
                boolean r12 = r11.isInvalid()
                if (r12 != 0) goto L_0x0102
                boolean r11 = r11.isRemoved()
                if (r11 != 0) goto L_0x0102
                goto L_0x0106
            L_0x0102:
                int r9 = r9 + 1
                goto L_0x00da
            L_0x0105:
                r10 = r4
            L_0x0106:
                if (r10 == 0) goto L_0x0190
                androidx.recyclerview.widget.RecyclerView$a0 r7 = androidx.recyclerview.widget.RecyclerView.m3001K(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.e r8 = r8.f4261f
                androidx.recyclerview.widget.e$b r9 = r8.f4449a
                androidx.recyclerview.widget.c0 r9 = (androidx.recyclerview.widget.C1168c0) r9
                androidx.recyclerview.widget.RecyclerView r9 = r9.f4442a
                int r9 = r9.indexOfChild(r10)
                if (r9 < 0) goto L_0x0178
                androidx.recyclerview.widget.e$a r11 = r8.f4450b
                boolean r11 = r11.mo5044d(r9)
                if (r11 == 0) goto L_0x0160
                androidx.recyclerview.widget.e$a r11 = r8.f4450b
                r11.mo5041a(r9)
                r8.mo5039m(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.e r8 = r8.f4261f
                int r8 = r8.mo5036j(r10)
                if (r8 == r6) goto L_0x0147
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.e r9 = r9.f4261f
                r9.mo5029c(r8)
                r0.mo4924i(r10)
                r8 = 8224(0x2020, float:1.1524E-41)
                r7.addFlags(r8)
                goto L_0x01be
            L_0x0147:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = p358af.C13437d.m33704i(r3, r2)
                r1.<init>(r2)
                throw r1
            L_0x0160:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "trying to unhide a view that was not hidden"
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x0178:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "view is not a child, cannot hide "
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x0190:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r0.f4329c
                int r7 = r7.size()
                r8 = 0
            L_0x0197:
                if (r8 >= r7) goto L_0x01bd
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r9 = r0.f4329c
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$a0 r9 = (androidx.recyclerview.widget.RecyclerView.C1119a0) r9
                boolean r10 = r9.isInvalid()
                if (r10 != 0) goto L_0x01ba
                int r10 = r9.getLayoutPosition()
                if (r10 != r1) goto L_0x01ba
                boolean r10 = r9.isAttachedToTransitionOverlay()
                if (r10 != 0) goto L_0x01ba
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r0.f4329c
                r7.remove(r8)
            L_0x01b8:
                r7 = r9
                goto L_0x01be
            L_0x01ba:
                int r8 = r8 + 1
                goto L_0x0197
            L_0x01bd:
                r7 = r4
            L_0x01be:
                if (r7 == 0) goto L_0x0252
                boolean r8 = r7.isRemoved()
                if (r8 == 0) goto L_0x01cd
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r8 = r8.f4288v0
                boolean r8 = r8.f4355g
                goto L_0x0212
            L_0x01cd:
                int r8 = r7.mPosition
                if (r8 < 0) goto L_0x0239
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.f4269m
                int r9 = r9.getItemCount()
                if (r8 >= r9) goto L_0x0239
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r9 = r8.f4288v0
                boolean r9 = r9.f4355g
                if (r9 != 0) goto L_0x01f2
                androidx.recyclerview.widget.RecyclerView$Adapter r8 = r8.f4269m
                int r9 = r7.mPosition
                int r8 = r8.getItemViewType(r9)
                int r9 = r7.getItemViewType()
                if (r8 == r9) goto L_0x01f2
                goto L_0x020f
            L_0x01f2:
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r8 = r8.f4269m
                boolean r8 = r8.hasStableIds()
                if (r8 == 0) goto L_0x0211
                long r8 = r7.getItemId()
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r10 = r10.f4269m
                int r11 = r7.mPosition
                long r10 = r10.getItemId(r11)
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 != 0) goto L_0x020f
                goto L_0x0211
            L_0x020f:
                r8 = 0
                goto L_0x0212
            L_0x0211:
                r8 = 1
            L_0x0212:
                if (r8 != 0) goto L_0x0237
                r8 = 4
                r7.addFlags(r8)
                boolean r8 = r7.isScrap()
                if (r8 == 0) goto L_0x0229
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r7.itemView
                r8.removeDetachedView(r9, r5)
                r7.unScrap()
                goto L_0x0232
            L_0x0229:
                boolean r8 = r7.wasReturnedFromScrap()
                if (r8 == 0) goto L_0x0232
                r7.clearReturnedFromScrapFlag()
            L_0x0232:
                r0.mo4923h(r7)
                r7 = r4
                goto L_0x0252
            L_0x0237:
                r2 = 1
                goto L_0x0252
            L_0x0239:
                java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = p358af.C13437d.m33704i(r3, r2)
                r1.<init>(r2)
                throw r1
            L_0x0252:
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                if (r7 != 0) goto L_0x03e3
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r12 = r12.f4260e
                int r12 = r12.mo4998f(r1, r5)
                if (r12 < 0) goto L_0x03c2
                androidx.recyclerview.widget.RecyclerView r13 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r13 = r13.f4269m
                int r13 = r13.getItemCount()
                if (r12 >= r13) goto L_0x03c2
                androidx.recyclerview.widget.RecyclerView r13 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r13 = r13.f4269m
                int r13 = r13.getItemViewType(r12)
                androidx.recyclerview.widget.RecyclerView r14 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r14 = r14.f4269m
                boolean r14 = r14.hasStableIds()
                if (r14 == 0) goto L_0x031e
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r7 = r7.f4269m
                long r14 = r7.getItemId(r12)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r0.f4327a
                int r7 = r7.size()
                int r7 = r7 + r6
            L_0x028e:
                if (r7 < 0) goto L_0x02e6
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r10 = r0.f4327a
                java.lang.Object r10 = r10.get(r7)
                androidx.recyclerview.widget.RecyclerView$a0 r10 = (androidx.recyclerview.widget.RecyclerView.C1119a0) r10
                long r16 = r10.getItemId()
                int r11 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
                if (r11 != 0) goto L_0x02e1
                boolean r11 = r10.wasReturnedFromScrap()
                if (r11 != 0) goto L_0x02e1
                int r11 = r10.getItemViewType()
                if (r13 != r11) goto L_0x02c5
                r10.addFlags(r3)
                boolean r3 = r10.isRemoved()
                if (r3 == 0) goto L_0x02c3
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r3 = r3.f4288v0
                boolean r3 = r3.f4355g
                if (r3 != 0) goto L_0x02c3
                r3 = 2
                r7 = 14
                r10.setFlags(r3, r7)
            L_0x02c3:
                r7 = r10
                goto L_0x0319
            L_0x02c5:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r11 = r0.f4327a
                r11.remove(r7)
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r3 = r10.itemView
                r11.removeDetachedView(r3, r5)
                android.view.View r3 = r10.itemView
                androidx.recyclerview.widget.RecyclerView$a0 r3 = androidx.recyclerview.widget.RecyclerView.m3001K(r3)
                r3.mScrapContainer = r4
                r3.mInChangeScrap = r5
                r3.clearReturnedFromScrapFlag()
                r0.mo4923h(r3)
            L_0x02e1:
                int r7 = r7 + -1
                r3 = 32
                goto L_0x028e
            L_0x02e6:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r3 = r0.f4329c
                int r3 = r3.size()
                int r3 = r3 + r6
            L_0x02ed:
                if (r3 < 0) goto L_0x0318
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r0.f4329c
                java.lang.Object r7 = r7.get(r3)
                androidx.recyclerview.widget.RecyclerView$a0 r7 = (androidx.recyclerview.widget.RecyclerView.C1119a0) r7
                long r10 = r7.getItemId()
                int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
                if (r16 != 0) goto L_0x0315
                boolean r10 = r7.isAttachedToTransitionOverlay()
                if (r10 != 0) goto L_0x0315
                int r10 = r7.getItemViewType()
                if (r13 != r10) goto L_0x0311
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r10 = r0.f4329c
                r10.remove(r3)
                goto L_0x0319
            L_0x0311:
                r0.mo4921f(r3)
                goto L_0x0318
            L_0x0315:
                int r3 = r3 + -1
                goto L_0x02ed
            L_0x0318:
                r7 = r4
            L_0x0319:
                if (r7 == 0) goto L_0x031e
                r7.mPosition = r12
                r2 = 1
            L_0x031e:
                if (r7 != 0) goto L_0x035e
                androidx.recyclerview.widget.RecyclerView$r r3 = r18.mo4918c()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$r$a> r3 = r3.f4321a
                java.lang.Object r3 = r3.get(r13)
                androidx.recyclerview.widget.RecyclerView$r$a r3 = (androidx.recyclerview.widget.RecyclerView.C1143r.C1144a) r3
                if (r3 == 0) goto L_0x0355
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r3.f4323a
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto L_0x0355
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r3 = r3.f4323a
                int r7 = r3.size()
                int r7 = r7 + r6
            L_0x033d:
                if (r7 < 0) goto L_0x0355
                java.lang.Object r6 = r3.get(r7)
                androidx.recyclerview.widget.RecyclerView$a0 r6 = (androidx.recyclerview.widget.RecyclerView.C1119a0) r6
                boolean r6 = r6.isAttachedToTransitionOverlay()
                if (r6 != 0) goto L_0x0352
                java.lang.Object r3 = r3.remove(r7)
                androidx.recyclerview.widget.RecyclerView$a0 r3 = (androidx.recyclerview.widget.RecyclerView.C1119a0) r3
                goto L_0x0356
            L_0x0352:
                int r7 = r7 + -1
                goto L_0x033d
            L_0x0355:
                r3 = r4
            L_0x0356:
                if (r3 == 0) goto L_0x035d
                r3.resetInternal()
                int[] r6 = androidx.recyclerview.widget.RecyclerView.f4215P0
            L_0x035d:
                r7 = r3
            L_0x035e:
                if (r7 != 0) goto L_0x03e3
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r6 = r3.getNanoTime()
                int r3 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
                if (r3 == 0) goto L_0x0384
                androidx.recyclerview.widget.RecyclerView$r r3 = r0.f4333g
                androidx.recyclerview.widget.RecyclerView$r$a r3 = r3.mo4915a(r13)
                long r10 = r3.f4325c
                r14 = 0
                int r3 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
                if (r3 == 0) goto L_0x0380
                long r10 = r10 + r6
                int r3 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
                if (r3 >= 0) goto L_0x037e
                goto L_0x0380
            L_0x037e:
                r3 = 0
                goto L_0x0381
            L_0x0380:
                r3 = 1
            L_0x0381:
                if (r3 != 0) goto L_0x0384
                return r4
            L_0x0384:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r10 = r3.f4269m
                androidx.recyclerview.widget.RecyclerView$a0 r3 = r10.createViewHolder(r3, r13)
                boolean r10 = androidx.recyclerview.widget.RecyclerView.f4218S0
                if (r10 == 0) goto L_0x039f
                android.view.View r10 = r3.itemView
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.m2999E(r10)
                if (r10 == 0) goto L_0x039f
                java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference
                r11.<init>(r10)
                r3.mNestedRecyclerView = r11
            L_0x039f:
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r10.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$r r12 = r0.f4333g
                long r10 = r10 - r6
                androidx.recyclerview.widget.RecyclerView$r$a r6 = r12.mo4915a(r13)
                long r12 = r6.f4325c
                r14 = 0
                int r7 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
                if (r7 != 0) goto L_0x03b5
                goto L_0x03be
            L_0x03b5:
                r14 = 4
                long r12 = r12 / r14
                r16 = 3
                long r12 = r12 * r16
                long r10 = r10 / r14
                long r10 = r10 + r12
            L_0x03be:
                r6.f4325c = r10
                r7 = r3
                goto L_0x03e3
            L_0x03c2:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.String r3 = "Inconsistency detected. Invalid item position "
                java.lang.String r4 = "(offset:"
                java.lang.String r5 = ").state:"
                java.lang.StringBuilder r1 = p001a0.C0016g.m35s(r3, r1, r4, r12, r5)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r3 = r3.f4288v0
                int r3 = r3.mo4935b()
                r1.append(r3)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r1 = p358af.C13437d.m33704i(r3, r1)
                r2.<init>(r1)
                throw r2
            L_0x03e3:
                if (r2 == 0) goto L_0x041a
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r3 = r3.f4288v0
                boolean r3 = r3.f4355g
                if (r3 != 0) goto L_0x041a
                r3 = 8192(0x2000, float:1.14794E-41)
                boolean r6 = r7.hasAnyOfTheFlags(r3)
                if (r6 == 0) goto L_0x041a
                r7.setFlags(r5, r3)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r3 = r3.f4288v0
                boolean r3 = r3.f4358j
                if (r3 == 0) goto L_0x041a
                androidx.recyclerview.widget.RecyclerView.C1128j.m3082b(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$j r3 = r3.f4247N
                r7.getUnmodifiedPayloads()
                r3.getClass()
                androidx.recyclerview.widget.RecyclerView$j$c r3 = new androidx.recyclerview.widget.RecyclerView$j$c
                r3.<init>()
                r3.mo4781a(r7)
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                r6.mo4566X(r7, r3)
            L_0x041a:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r3 = r3.f4288v0
                boolean r3 = r3.f4355g
                if (r3 == 0) goto L_0x042b
                boolean r3 = r7.isBound()
                if (r3 == 0) goto L_0x042b
                r7.mPreLayoutPosition = r1
                goto L_0x0472
            L_0x042b:
                boolean r3 = r7.isBound()
                if (r3 == 0) goto L_0x043d
                boolean r3 = r7.needsUpdate()
                if (r3 != 0) goto L_0x043d
                boolean r3 = r7.isInvalid()
                if (r3 == 0) goto L_0x0472
            L_0x043d:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r3 = r3.f4260e
                int r3 = r3.mo4998f(r1, r5)
                r7.mBindingAdapter = r4
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                r7.mOwnerRecyclerView = r5
                int r5 = r7.getItemViewType()
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r6.getNanoTime()
                int r6 = (r19 > r8 ? 1 : (r19 == r8 ? 0 : -1))
                if (r6 == 0) goto L_0x0476
                androidx.recyclerview.widget.RecyclerView$r r6 = r0.f4333g
                androidx.recyclerview.widget.RecyclerView$r$a r5 = r6.mo4915a(r5)
                long r5 = r5.f4326d
                r8 = 0
                int r12 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
                if (r12 == 0) goto L_0x046f
                long r5 = r5 + r10
                int r8 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
                if (r8 >= 0) goto L_0x046d
                goto L_0x046f
            L_0x046d:
                r5 = 0
                goto L_0x0470
            L_0x046f:
                r5 = 1
            L_0x0470:
                if (r5 != 0) goto L_0x0476
            L_0x0472:
                r1 = 0
                r3 = 1
                goto L_0x0502
            L_0x0476:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.f4269m
                r5.bindViewHolder(r7, r3)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r5 = r3.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$r r3 = r0.f4333g
                int r8 = r7.getItemViewType()
                long r5 = r5 - r10
                androidx.recyclerview.widget.RecyclerView$r$a r3 = r3.mo4915a(r8)
                long r8 = r3.f4326d
                r10 = 0
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 != 0) goto L_0x0497
                goto L_0x04a0
            L_0x0497:
                r10 = 4
                long r8 = r8 / r10
                r12 = 3
                long r8 = r8 * r12
                long r5 = r5 / r10
                long r5 = r5 + r8
            L_0x04a0:
                r3.f4326d = r5
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                android.view.accessibility.AccessibilityManager r3 = r3.f4225C
                if (r3 == 0) goto L_0x04b0
                boolean r3 = r3.isEnabled()
                if (r3 == 0) goto L_0x04b0
                r3 = 1
                goto L_0x04b1
            L_0x04b0:
                r3 = 0
            L_0x04b1:
                if (r3 == 0) goto L_0x04f6
                android.view.View r3 = r7.itemView
                java.util.WeakHashMap<android.view.View, s1.p0> r5 = p242s1.C6333d0.f19990a
                int r5 = p242s1.C6333d0.C6337d.m15043c(r3)
                if (r5 != 0) goto L_0x04c2
                r5 = 1
                p242s1.C6333d0.C6337d.m15059s(r3, r5)
                goto L_0x04c3
            L_0x04c2:
                r5 = 1
            L_0x04c3:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.e0 r6 = r6.f4226C0
                if (r6 != 0) goto L_0x04ca
                goto L_0x04f4
            L_0x04ca:
                androidx.recyclerview.widget.e0$a r6 = r6.f4455b
                boolean r8 = r6 instanceof androidx.recyclerview.widget.C1174e0.C1175a
                if (r8 == 0) goto L_0x04f1
                r6.getClass()
                android.view.View$AccessibilityDelegate r8 = p242s1.C6333d0.m15017e(r3)
                if (r8 != 0) goto L_0x04da
                goto L_0x04e8
            L_0x04da:
                boolean r4 = r8 instanceof p242s1.C6315a.C6316a
                if (r4 == 0) goto L_0x04e3
                s1.a$a r8 = (p242s1.C6315a.C6316a) r8
                s1.a r4 = r8.f19974a
                goto L_0x04e8
            L_0x04e3:
                s1.a r4 = new s1.a
                r4.<init>(r8)
            L_0x04e8:
                if (r4 == 0) goto L_0x04f1
                if (r4 == r6) goto L_0x04f1
                java.util.WeakHashMap r8 = r6.f4457b
                r8.put(r3, r4)
            L_0x04f1:
                p242s1.C6333d0.m15029q(r3, r6)
            L_0x04f4:
                r3 = r5
                goto L_0x04f7
            L_0x04f6:
                r3 = 1
            L_0x04f7:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r4 = r4.f4288v0
                boolean r4 = r4.f4355g
                if (r4 == 0) goto L_0x0501
                r7.mPreLayoutPosition = r1
            L_0x0501:
                r1 = 1
            L_0x0502:
                android.view.View r4 = r7.itemView
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                if (r4 != 0) goto L_0x0518
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r4 = r4.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r4 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r4
                android.view.View r5 = r7.itemView
                r5.setLayoutParams(r4)
                goto L_0x0530
            L_0x0518:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                boolean r5 = r5.checkLayoutParams(r4)
                if (r5 != 0) goto L_0x052e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r4 = r5.generateLayoutParams((android.view.ViewGroup.LayoutParams) r4)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r4 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r4
                android.view.View r5 = r7.itemView
                r5.setLayoutParams(r4)
                goto L_0x0530
            L_0x052e:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r4 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r4
            L_0x0530:
                r4.f4297b = r7
                if (r2 == 0) goto L_0x0537
                if (r1 == 0) goto L_0x0537
                goto L_0x0538
            L_0x0537:
                r3 = 0
            L_0x0538:
                r4.f4300e = r3
                return r7
            L_0x053b:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.String r3 = "Invalid item position "
                java.lang.String r4 = "("
                java.lang.String r5 = "). Item count:"
                java.lang.StringBuilder r1 = p001a0.C0016g.m35s(r3, r1, r4, r1, r5)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$x r3 = r3.f4288v0
                int r3 = r3.mo4935b()
                r1.append(r3)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r1 = p358af.C13437d.m33704i(r3, r1)
                r2.<init>(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1145s.mo4925j(long, int):androidx.recyclerview.widget.RecyclerView$a0");
        }

        /* renamed from: k */
        public final void mo4926k(C1119a0 a0Var) {
            if (a0Var.mInChangeScrap) {
                this.f4328b.remove(a0Var);
            } else {
                this.f4327a.remove(a0Var);
            }
            a0Var.mScrapContainer = null;
            a0Var.mInChangeScrap = false;
            a0Var.clearReturnedFromScrapFlag();
        }

        /* renamed from: l */
        public final void mo4927l() {
            int i;
            C1134m mVar = RecyclerView.this.f4271n;
            if (mVar != null) {
                i = mVar.mPrefetchMaxCountObserved;
            } else {
                i = 0;
            }
            this.f4332f = this.f4331e + i;
            for (int size = this.f4329c.size() - 1; size >= 0 && this.f4329c.size() > this.f4332f; size--) {
                mo4921f(size);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public interface C1146t {
        /* renamed from: a */
        void mo4928a();
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public class C1147u extends C1125g {
        public C1147u() {
        }

        /* renamed from: a */
        public final void mo4765a() {
            RecyclerView.this.mo4618i((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4288v0.f4354f = true;
            recyclerView.mo4565W(true);
            if (!RecyclerView.this.f4260e.mo4999g()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
            if (r0.f4424b.size() == 1) goto L_0x002a;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo4767c(int r5, int r6, java.lang.Object r7) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.mo4618i(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f4260e
                r1 = 1
                if (r6 >= r1) goto L_0x0011
                r0.getClass()
                goto L_0x0029
            L_0x0011:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r0.f4424b
                r3 = 4
                androidx.recyclerview.widget.a$b r5 = r0.mo5000h(r7, r3, r5, r6)
                r2.add(r5)
                int r5 = r0.f4428f
                r5 = r5 | r3
                r0.f4428f = r5
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r5 = r0.f4424b
                int r5 = r5.size()
                if (r5 != r1) goto L_0x0029
                goto L_0x002a
            L_0x0029:
                r1 = 0
            L_0x002a:
                if (r1 == 0) goto L_0x002f
                r4.mo4929h()
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1147u.mo4767c(int, int, java.lang.Object):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0025, code lost:
            if (r0.f4424b.size() == 1) goto L_0x0029;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo4768d(int r5, int r6) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.mo4618i(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f4260e
                r2 = 1
                if (r6 >= r2) goto L_0x0011
                r0.getClass()
                goto L_0x0028
            L_0x0011:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f4424b
                androidx.recyclerview.widget.a$b r5 = r0.mo5000h(r1, r2, r5, r6)
                r3.add(r5)
                int r5 = r0.f4428f
                r5 = r5 | r2
                r0.f4428f = r5
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r5 = r0.f4424b
                int r5 = r5.size()
                if (r5 != r2) goto L_0x0028
                goto L_0x0029
            L_0x0028:
                r2 = 0
            L_0x0029:
                if (r2 == 0) goto L_0x002e
                r4.mo4929h()
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1147u.mo4768d(int, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
            if (r0.f4424b.size() == 1) goto L_0x002b;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo4769e(int r6, int r7) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.mo4618i(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f4260e
                r0.getClass()
                r2 = 1
                if (r6 != r7) goto L_0x0011
                goto L_0x002a
            L_0x0011:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f4424b
                r4 = 8
                androidx.recyclerview.widget.a$b r6 = r0.mo5000h(r1, r4, r6, r7)
                r3.add(r6)
                int r6 = r0.f4428f
                r6 = r6 | r4
                r0.f4428f = r6
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r6 = r0.f4424b
                int r6 = r6.size()
                if (r6 != r2) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r2 = 0
            L_0x002b:
                if (r2 == 0) goto L_0x0030
                r5.mo4929h()
            L_0x0030:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1147u.mo4769e(int, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
            if (r0.f4424b.size() == 1) goto L_0x002a;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo4770f(int r6, int r7) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.mo4618i(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f4260e
                r2 = 1
                if (r7 >= r2) goto L_0x0011
                r0.getClass()
                goto L_0x0029
            L_0x0011:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f4424b
                r4 = 2
                androidx.recyclerview.widget.a$b r6 = r0.mo5000h(r1, r4, r6, r7)
                r3.add(r6)
                int r6 = r0.f4428f
                r6 = r6 | r4
                r0.f4428f = r6
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r6 = r0.f4424b
                int r6 = r6.size()
                if (r6 != r2) goto L_0x0029
                goto L_0x002a
            L_0x0029:
                r2 = 0
            L_0x002a:
                if (r2 == 0) goto L_0x002f
                r5.mo4929h()
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C1147u.mo4770f(int, int):void");
        }

        /* renamed from: g */
        public final void mo4771g() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4259d != null && (adapter = recyclerView.f4269m) != null && adapter.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: h */
        public final void mo4929h() {
            if (RecyclerView.f4217R0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f4285u && recyclerView.f4283t) {
                    C1118a aVar = recyclerView.f4264i;
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    C6333d0.C6337d.m15053m(recyclerView, aVar);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.f4223B = true;
            recyclerView2.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public static class C1148v implements C1141p {
        /* renamed from: d */
        public final void mo4911d(boolean z) {
        }

        public final void onTouchEvent(MotionEvent motionEvent) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public static abstract class C1149w {

        /* renamed from: a */
        public int f4336a = -1;

        /* renamed from: b */
        public RecyclerView f4337b;

        /* renamed from: c */
        public C1134m f4338c;

        /* renamed from: d */
        public boolean f4339d;

        /* renamed from: e */
        public boolean f4340e;

        /* renamed from: f */
        public View f4341f;

        /* renamed from: g */
        public final C1150a f4342g = new C1150a();

        /* renamed from: androidx.recyclerview.widget.RecyclerView$w$a */
        public static class C1150a {

            /* renamed from: a */
            public int f4343a = 0;

            /* renamed from: b */
            public int f4344b = 0;

            /* renamed from: c */
            public int f4345c = Integer.MIN_VALUE;

            /* renamed from: d */
            public int f4346d = -1;

            /* renamed from: e */
            public Interpolator f4347e = null;

            /* renamed from: f */
            public boolean f4348f = false;

            /* renamed from: a */
            public final void mo4933a(RecyclerView recyclerView) {
                int i = this.f4346d;
                if (i >= 0) {
                    this.f4346d = -1;
                    recyclerView.mo4557O(i);
                    this.f4348f = false;
                } else if (this.f4348f) {
                    Interpolator interpolator = this.f4347e;
                    if (interpolator == null || this.f4345c >= 1) {
                        int i2 = this.f4345c;
                        if (i2 >= 1) {
                            recyclerView.f4282s0.mo4938b(this.f4343a, this.f4344b, i2, interpolator);
                            this.f4348f = false;
                            return;
                        }
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$w$b */
        public interface C1151b {
            PointF computeScrollVectorForPosition(int i);
        }

        /* renamed from: a */
        public final void mo4930a(int i, int i2) {
            C1134m mVar;
            PointF pointF;
            RecyclerView recyclerView = this.f4337b;
            int i3 = -1;
            if (this.f4336a == -1 || recyclerView == null) {
                mo4932c();
            }
            PointF pointF2 = null;
            if (this.f4339d && this.f4341f == null && (mVar = this.f4338c) != null) {
                int i4 = this.f4336a;
                if (mVar instanceof C1151b) {
                    pointF = ((C1151b) mVar).computeScrollVectorForPosition(i4);
                } else {
                    pointF = null;
                }
                if (pointF != null) {
                    float f = pointF.x;
                    if (!(f == BitmapDescriptorFactory.HUE_RED && pointF.y == BitmapDescriptorFactory.HUE_RED)) {
                        recyclerView.mo4579d0((int[]) null, (int) Math.signum(f), (int) Math.signum(pointF.y));
                    }
                }
            }
            boolean z = false;
            this.f4339d = false;
            View view = this.f4341f;
            if (view != null) {
                this.f4337b.getClass();
                C1119a0 K = RecyclerView.m3001K(view);
                if (K != null) {
                    i3 = K.getLayoutPosition();
                }
                if (i3 == this.f4336a) {
                    View view2 = this.f4341f;
                    C1152x xVar = recyclerView.f4288v0;
                    mo4931b(view2, this.f4342g);
                    this.f4342g.mo4933a(recyclerView);
                    mo4932c();
                } else {
                    this.f4341f = null;
                }
            }
            if (this.f4340e) {
                C1152x xVar2 = recyclerView.f4288v0;
                C1150a aVar = this.f4342g;
                C1240t tVar = (C1240t) this;
                if (tVar.f4337b.f4271n.getChildCount() == 0) {
                    tVar.mo4932c();
                } else {
                    int i5 = tVar.f4689n;
                    int i6 = i5 - i;
                    if (i5 * i6 <= 0) {
                        i6 = 0;
                    }
                    tVar.f4689n = i6;
                    int i7 = tVar.f4690o;
                    int i8 = i7 - i2;
                    if (i7 * i8 <= 0) {
                        i8 = 0;
                    }
                    tVar.f4690o = i8;
                    if (i6 == 0 && i8 == 0) {
                        int i9 = tVar.f4336a;
                        C1134m mVar2 = tVar.f4338c;
                        if (mVar2 instanceof C1151b) {
                            pointF2 = ((C1151b) mVar2).computeScrollVectorForPosition(i9);
                        }
                        if (pointF2 != null) {
                            float f2 = pointF2.x;
                            if (!(f2 == BitmapDescriptorFactory.HUE_RED && pointF2.y == BitmapDescriptorFactory.HUE_RED)) {
                                float f3 = pointF2.y;
                                float sqrt = (float) Math.sqrt((double) ((f3 * f3) + (f2 * f2)));
                                float f4 = pointF2.x / sqrt;
                                pointF2.x = f4;
                                float f5 = pointF2.y / sqrt;
                                pointF2.y = f5;
                                tVar.f4685j = pointF2;
                                tVar.f4689n = (int) (f4 * 10000.0f);
                                tVar.f4690o = (int) (f5 * 10000.0f);
                                int f6 = tVar.mo5010f(10000);
                                LinearInterpolator linearInterpolator = tVar.f4683h;
                                aVar.f4343a = (int) (((float) tVar.f4689n) * 1.2f);
                                aVar.f4344b = (int) (((float) tVar.f4690o) * 1.2f);
                                aVar.f4345c = (int) (((float) f6) * 1.2f);
                                aVar.f4347e = linearInterpolator;
                                aVar.f4348f = true;
                            }
                        }
                        aVar.f4346d = tVar.f4336a;
                        tVar.mo4932c();
                    }
                }
                C1150a aVar2 = this.f4342g;
                if (aVar2.f4346d >= 0) {
                    z = true;
                }
                aVar2.mo4933a(recyclerView);
                if (z && this.f4340e) {
                    this.f4339d = true;
                    recyclerView.f4282s0.mo4937a();
                }
            }
        }

        /* renamed from: b */
        public abstract void mo4931b(View view, C1150a aVar);

        /* renamed from: c */
        public final void mo4932c() {
            if (this.f4340e) {
                this.f4340e = false;
                C1240t tVar = (C1240t) this;
                tVar.f4690o = 0;
                tVar.f4689n = 0;
                tVar.f4685j = null;
                this.f4337b.f4288v0.f4349a = -1;
                this.f4341f = null;
                this.f4336a = -1;
                this.f4339d = false;
                this.f4338c.onSmoothScrollerStopped(this);
                this.f4338c = null;
                this.f4337b = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public static class C1152x {

        /* renamed from: a */
        public int f4349a = -1;

        /* renamed from: b */
        public int f4350b = 0;

        /* renamed from: c */
        public int f4351c = 0;

        /* renamed from: d */
        public int f4352d = 1;

        /* renamed from: e */
        public int f4353e = 0;

        /* renamed from: f */
        public boolean f4354f = false;

        /* renamed from: g */
        public boolean f4355g = false;

        /* renamed from: h */
        public boolean f4356h = false;

        /* renamed from: i */
        public boolean f4357i = false;

        /* renamed from: j */
        public boolean f4358j = false;

        /* renamed from: k */
        public boolean f4359k = false;

        /* renamed from: l */
        public int f4360l;

        /* renamed from: m */
        public long f4361m;

        /* renamed from: n */
        public int f4362n;

        /* renamed from: a */
        public final void mo4934a(int i) {
            if ((this.f4352d & i) == 0) {
                StringBuilder k = C13555b.m33972k("Layout state should be one of ");
                k.append(Integer.toBinaryString(i));
                k.append(" but it is ");
                k.append(Integer.toBinaryString(this.f4352d));
                throw new IllegalStateException(k.toString());
            }
        }

        /* renamed from: b */
        public final int mo4935b() {
            if (this.f4355g) {
                return this.f4350b - this.f4351c;
            }
            return this.f4353e;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("State{mTargetPosition=");
            k.append(this.f4349a);
            k.append(", mData=");
            k.append((Object) null);
            k.append(", mItemCount=");
            k.append(this.f4353e);
            k.append(", mIsMeasuring=");
            k.append(this.f4357i);
            k.append(", mPreviousLayoutItemCount=");
            k.append(this.f4350b);
            k.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            k.append(this.f4351c);
            k.append(", mStructureChanged=");
            k.append(this.f4354f);
            k.append(", mInPreLayout=");
            k.append(this.f4355g);
            k.append(", mRunSimpleAnimations=");
            k.append(this.f4358j);
            k.append(", mRunPredictiveAnimations=");
            return C13715c.m34247m(k, this.f4359k, '}');
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static abstract class C1153y {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public class C1154z implements Runnable {

        /* renamed from: b */
        public int f4363b;

        /* renamed from: c */
        public int f4364c;

        /* renamed from: d */
        public OverScroller f4365d;

        /* renamed from: e */
        public Interpolator f4366e;

        /* renamed from: f */
        public boolean f4367f = false;

        /* renamed from: g */
        public boolean f4368g = false;

        public C1154z() {
            C1121c cVar = RecyclerView.f4220U0;
            this.f4366e = cVar;
            this.f4365d = new OverScroller(RecyclerView.this.getContext(), cVar);
        }

        /* renamed from: a */
        public final void mo4937a() {
            if (this.f4367f) {
                this.f4368g = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15053m(recyclerView, this);
        }

        /* renamed from: b */
        public final void mo4938b(int i, int i2, int i3, Interpolator interpolator) {
            boolean z;
            int i4;
            if (i3 == Integer.MIN_VALUE) {
                int abs = Math.abs(i);
                int abs2 = Math.abs(i2);
                if (abs > abs2) {
                    z = true;
                } else {
                    z = false;
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (z) {
                    i4 = recyclerView.getWidth();
                } else {
                    i4 = recyclerView.getHeight();
                }
                if (!z) {
                    abs = abs2;
                }
                i3 = Math.min((int) (((((float) abs) / ((float) i4)) + 1.0f) * 300.0f), 2000);
            }
            int i5 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.f4220U0;
            }
            if (this.f4366e != interpolator) {
                this.f4366e = interpolator;
                this.f4365d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f4364c = 0;
            this.f4363b = 0;
            RecyclerView.this.setScrollState(2);
            this.f4365d.startScroll(0, 0, i, i2, i5);
            if (Build.VERSION.SDK_INT < 23) {
                this.f4365d.computeScrollOffset();
            }
            mo4937a();
        }

        public final void run() {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4271n == null) {
                recyclerView.removeCallbacks(this);
                this.f4365d.abortAnimation();
                return;
            }
            this.f4368g = false;
            this.f4367f = true;
            recyclerView.mo4628m();
            OverScroller overScroller = this.f4365d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f4363b;
                int i5 = currY - this.f4364c;
                this.f4363b = currX;
                this.f4364c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f4238I0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.mo4651s(i4, i5, 1, iArr, (int[]) null)) {
                    int[] iArr2 = RecyclerView.this.f4238I0;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.mo4626l(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f4269m != null) {
                    int[] iArr3 = recyclerView3.f4238I0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.mo4579d0(iArr3, i4, i5);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f4238I0;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i4 -= i;
                    i5 -= i2;
                    C1149w wVar = recyclerView4.f4271n.mSmoothScroller;
                    if (wVar != null && !wVar.f4339d && wVar.f4340e) {
                        int b = recyclerView4.f4288v0.mo4935b();
                        if (b == 0) {
                            wVar.mo4932c();
                        } else if (wVar.f4336a >= b) {
                            wVar.f4336a = b - 1;
                            wVar.mo4930a(i, i2);
                        } else {
                            wVar.mo4930a(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.f4277q.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f4238I0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.mo4678t(i, i2, i4, i5, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f4238I0;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.mo4679u(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z = true;
                } else {
                    z = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (overScroller.isFinished() || ((z || i6 != 0) && (z2 || i7 != 0))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                RecyclerView recyclerView7 = RecyclerView.this;
                C1149w wVar2 = recyclerView7.f4271n.mSmoothScroller;
                if (wVar2 == null || !wVar2.f4339d) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (z4 || !z3) {
                    mo4937a();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    C1223o oVar = recyclerView8.f4284t0;
                    if (oVar != null) {
                        oVar.mo5113a(recyclerView8, i, i2);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i6 < 0) {
                            i3 = -currVelocity;
                        } else if (i6 > 0) {
                            i3 = currVelocity;
                        } else {
                            i3 = 0;
                        }
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView9 = RecyclerView.this;
                        if (i3 < 0) {
                            recyclerView9.mo4681w();
                            if (recyclerView9.f4239J.isFinished()) {
                                recyclerView9.f4239J.onAbsorb(-i3);
                            }
                        } else if (i3 > 0) {
                            recyclerView9.mo4682x();
                            if (recyclerView9.f4243L.isFinished()) {
                                recyclerView9.f4243L.onAbsorb(i3);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView9.mo4683y();
                            if (recyclerView9.f4241K.isFinished()) {
                                recyclerView9.f4241K.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView9.mo4680v();
                            if (recyclerView9.f4245M.isFinished()) {
                                recyclerView9.f4245M.onAbsorb(currVelocity);
                            }
                        } else {
                            recyclerView9.getClass();
                        }
                        if (!(i3 == 0 && currVelocity == 0)) {
                            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                            C6333d0.C6337d.m15051k(recyclerView9);
                        }
                    }
                    if (RecyclerView.f4218S0) {
                        C1223o.C1225b bVar = RecyclerView.this.f4286u0;
                        int[] iArr7 = bVar.f4615c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.f4616d = 0;
                    }
                }
            }
            C1149w wVar3 = RecyclerView.this.f4271n.mSmoothScroller;
            if (wVar3 != null && wVar3.f4339d) {
                wVar3.mo4930a(0, 0);
            }
            this.f4367f = false;
            if (this.f4368g) {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView10 = RecyclerView.this;
                WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                C6333d0.C6337d.m15053m(recyclerView10, this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.mo4625k0(1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16843830(0x1010436, float:2.369658E-38)
            r1[r2] = r3
            f4215P0 = r1
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r1 < r3) goto L_0x0013
            r1 = 1
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            f4216Q0 = r1
            f4217R0 = r0
            f4218S0 = r0
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r1[r2] = r3
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            f4219T0 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            f4220U0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView() {
        throw null;
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6032a.recyclerViewStyle);
    }

    /* renamed from: E */
    public static RecyclerView m2999E(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView E = m2999E(viewGroup.getChildAt(i));
            if (E != null) {
                return E;
            }
        }
        return null;
    }

    /* renamed from: I */
    public static int m3000I(View view) {
        C1119a0 K = m3001K(view);
        if (K != null) {
            return K.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    /* renamed from: K */
    public static C1119a0 m3001K(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f4297b;
    }

    /* renamed from: L */
    public static void m3002L(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.f4298c;
        rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, view.getRight() + rect2.right + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
    }

    /* renamed from: b0 */
    private void m3004b0() {
        VelocityTracker velocityTracker = this.f4252Q;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        mo4625k0(0);
        EdgeEffect edgeEffect = this.f4239J;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.f4239J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4241K;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.f4241K.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4243L;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.f4243L.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4245M;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.f4245M.isFinished();
        }
        if (z) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(this);
        }
    }

    private C6381p getScrollingChildHelper() {
        if (this.f4232F0 == null) {
            this.f4232F0 = new C6381p(this);
        }
        return this.f4232F0;
    }

    /* renamed from: j */
    public static void m3008j(C1119a0 a0Var) {
        WeakReference<RecyclerView> weakReference = a0Var.mNestedRecyclerView;
        if (weakReference != null) {
            View view = weakReference.get();
            while (view != null) {
                if (view != a0Var.itemView) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            a0Var.mNestedRecyclerView = null;
        }
    }

    /* renamed from: A */
    public final void mo4547A(C1152x xVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f4282s0.f4365d;
            overScroller.getFinalX();
            overScroller.getCurrX();
            xVar.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        xVar.getClass();
    }

    /* renamed from: B */
    public final View mo4548B(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* renamed from: C */
    public final boolean mo4549C(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f4279r.size();
        int i = 0;
        while (i < size) {
            C1141p pVar = this.f4279r.get(i);
            if (!pVar.mo4910b(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.f4281s = pVar;
                return true;
            }
        }
        return false;
    }

    /* renamed from: D */
    public final void mo4550D(int[] iArr) {
        int e = this.f4261f.mo5031e();
        if (e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < e; i3++) {
            C1119a0 K = m3001K(this.f4261f.mo5030d(i3));
            if (!K.shouldIgnore()) {
                int layoutPosition = K.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    /* renamed from: F */
    public final C1119a0 mo4551F(int i) {
        C1119a0 a0Var = null;
        if (this.f4229E) {
            return null;
        }
        int h = this.f4261f.mo5034h();
        for (int i2 = 0; i2 < h; i2++) {
            C1119a0 K = m3001K(this.f4261f.mo5033g(i2));
            if (K != null && !K.isRemoved() && mo4552G(K) == i) {
                if (!this.f4261f.mo5037k(K.itemView)) {
                    return K;
                }
                a0Var = K;
            }
        }
        return a0Var;
    }

    /* renamed from: G */
    public final int mo4552G(C1119a0 a0Var) {
        if (a0Var.hasAnyOfTheFlags(524) || !a0Var.isBound()) {
            return -1;
        }
        C1160a aVar = this.f4260e;
        int i = a0Var.mPosition;
        int size = aVar.f4424b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1160a.C1162b bVar = aVar.f4424b.get(i2);
            int i3 = bVar.f4429a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f4430b;
                    if (i4 <= i) {
                        int i5 = bVar.f4432d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f4430b;
                    if (i6 == i) {
                        i = bVar.f4432d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f4432d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f4430b <= i) {
                i += bVar.f4432d;
            }
        }
        return i;
    }

    /* renamed from: H */
    public final long mo4553H(C1119a0 a0Var) {
        return this.f4269m.hasStableIds() ? a0Var.getItemId() : (long) a0Var.mPosition;
    }

    /* renamed from: J */
    public final C1119a0 mo4554J(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return m3001K(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    /* renamed from: M */
    public final Rect mo4555M(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f4299d) {
            return layoutParams.f4298c;
        }
        if (this.f4288v0.f4355g && (layoutParams.mo4705c() || layoutParams.f4297b.isInvalid())) {
            return layoutParams.f4298c;
        }
        Rect rect = layoutParams.f4298c;
        rect.set(0, 0, 0, 0);
        int size = this.f4277q.size();
        for (int i = 0; i < size; i++) {
            this.f4265j.set(0, 0, 0, 0);
            this.f4277q.get(i).getItemOffsets(this.f4265j, view, this, this.f4288v0);
            int i2 = rect.left;
            Rect rect2 = this.f4265j;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f4299d = false;
        return rect;
    }

    /* renamed from: N */
    public final boolean mo4556N() {
        return this.f4233G > 0;
    }

    /* renamed from: O */
    public final void mo4557O(int i) {
        if (this.f4271n != null) {
            setScrollState(2);
            this.f4271n.scrollToPosition(i);
            awakenScrollBars();
        }
    }

    /* renamed from: P */
    public final void mo4558P() {
        int h = this.f4261f.mo5034h();
        for (int i = 0; i < h; i++) {
            ((LayoutParams) this.f4261f.mo5033g(i).getLayoutParams()).f4299d = true;
        }
        C1145s sVar = this.f4258c;
        int size = sVar.f4329c.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutParams layoutParams = (LayoutParams) sVar.f4329c.get(i2).itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f4299d = true;
            }
        }
    }

    /* renamed from: Q */
    public final void mo4559Q(int i, int i2, boolean z) {
        int i3 = i + i2;
        int h = this.f4261f.mo5034h();
        for (int i4 = 0; i4 < h; i4++) {
            C1119a0 K = m3001K(this.f4261f.mo5033g(i4));
            if (K != null && !K.shouldIgnore()) {
                int i5 = K.mPosition;
                if (i5 >= i3) {
                    K.offsetPosition(-i2, z);
                    this.f4288v0.f4354f = true;
                } else if (i5 >= i) {
                    K.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.f4288v0.f4354f = true;
                }
            }
        }
        C1145s sVar = this.f4258c;
        int size = sVar.f4329c.size();
        while (true) {
            size--;
            if (size >= 0) {
                C1119a0 a0Var = sVar.f4329c.get(size);
                if (a0Var != null) {
                    int i6 = a0Var.mPosition;
                    if (i6 >= i3) {
                        a0Var.offsetPosition(-i2, z);
                    } else if (i6 >= i) {
                        a0Var.addFlags(8);
                        sVar.mo4921f(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    /* renamed from: R */
    public final void mo4560R() {
        this.f4233G++;
    }

    /* renamed from: S */
    public final void mo4561S(boolean z) {
        int i;
        boolean z2 = true;
        int i2 = this.f4233G - 1;
        this.f4233G = i2;
        if (i2 < 1) {
            this.f4233G = 0;
            if (z) {
                int i3 = this.f4221A;
                this.f4221A = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.f4225C;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z2 = false;
                    }
                    if (z2) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        C6526b.m15446b(obtain, i3);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.f4240J0.size() - 1; size >= 0; size--) {
                    C1119a0 a0Var = (C1119a0) this.f4240J0.get(size);
                    if (a0Var.itemView.getParent() == this && !a0Var.shouldIgnore() && (i = a0Var.mPendingAccessibilityState) != -1) {
                        View view = a0Var.itemView;
                        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                        C6333d0.C6337d.m15059s(view, i);
                        a0Var.mPendingAccessibilityState = -1;
                    }
                }
                this.f4240J0.clear();
            }
        }
    }

    /* renamed from: T */
    public final void mo4562T(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4251P) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f4251P = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.f4255T = x;
            this.f4253R = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.f4256U = y;
            this.f4254S = y;
        }
    }

    /* renamed from: U */
    public final void mo4563U() {
        if (!this.f4224B0 && this.f4283t) {
            C1120b bVar = this.f4242K0;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15053m(this, bVar);
            this.f4224B0 = true;
        }
    }

    /* renamed from: V */
    public final void mo4564V() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (this.f4229E) {
            C1160a aVar = this.f4260e;
            aVar.mo5004l(aVar.f4424b);
            aVar.mo5004l(aVar.f4425c);
            aVar.f4428f = 0;
            if (this.f4231F) {
                this.f4271n.onItemsChanged(this);
            }
        }
        if (this.f4247N == null || !this.f4271n.supportsPredictiveItemAnimations()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f4260e.mo5002j();
        } else {
            this.f4260e.mo4995c();
        }
        if (this.f4294y0 || this.f4296z0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C1152x xVar = this.f4288v0;
        if (!this.f4287v || this.f4247N == null || ((!(z5 = this.f4229E) && !z2 && !this.f4271n.mRequestedSimpleAnimations) || (z5 && !this.f4269m.hasStableIds()))) {
            z3 = false;
        } else {
            z3 = true;
        }
        xVar.f4358j = z3;
        C1152x xVar2 = this.f4288v0;
        if (xVar2.f4358j && z2 && !this.f4229E) {
            if (this.f4247N == null || !this.f4271n.supportsPredictiveItemAnimations()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                z6 = true;
            }
        }
        xVar2.f4359k = z6;
    }

    /* renamed from: W */
    public final void mo4565W(boolean z) {
        this.f4231F = z | this.f4231F;
        this.f4229E = true;
        int h = this.f4261f.mo5034h();
        for (int i = 0; i < h; i++) {
            C1119a0 K = m3001K(this.f4261f.mo5033g(i));
            if (K != null && !K.shouldIgnore()) {
                K.addFlags(6);
            }
        }
        mo4558P();
        C1145s sVar = this.f4258c;
        int size = sVar.f4329c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1119a0 a0Var = sVar.f4329c.get(i2);
            if (a0Var != null) {
                a0Var.addFlags(6);
                a0Var.addChangePayload((Object) null);
            }
        }
        Adapter adapter = RecyclerView.this.f4269m;
        if (adapter == null || !adapter.hasStableIds()) {
            sVar.mo4920e();
        }
    }

    /* renamed from: X */
    public final void mo4566X(C1119a0 a0Var, C1128j.C1131c cVar) {
        a0Var.setFlags(0, 8192);
        if (this.f4288v0.f4356h && a0Var.isUpdated() && !a0Var.isRemoved() && !a0Var.shouldIgnore()) {
            this.f4262g.f4534b.mo22331k(mo4553H(a0Var), a0Var);
        }
        this.f4262g.mo5088b(a0Var, cVar);
    }

    /* renamed from: Y */
    public final void mo4567Y() {
        C1128j jVar = this.f4247N;
        if (jVar != null) {
            jVar.mo4777g();
        }
        C1134m mVar = this.f4271n;
        if (mVar != null) {
            mVar.removeAndRecycleAllViews(this.f4258c);
            this.f4271n.removeAndRecycleScrapInt(this.f4258c);
        }
        C1145s sVar = this.f4258c;
        sVar.f4327a.clear();
        sVar.mo4920e();
    }

    /* renamed from: Z */
    public final void mo4568Z(C1133l lVar) {
        boolean z;
        C1134m mVar = this.f4271n;
        if (mVar != null) {
            mVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.f4277q.remove(lVar);
        if (this.f4277q.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z = true;
            } else {
                z = false;
            }
            setWillNotDraw(z);
        }
        mo4558P();
        requestLayout();
    }

    /* renamed from: a0 */
    public final void mo4569a0(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.f4265j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f4299d) {
                Rect rect = layoutParams2.f4298c;
                Rect rect2 = this.f4265j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f4265j);
            offsetRectIntoDescendantCoords(view, this.f4265j);
        }
        C1134m mVar = this.f4271n;
        Rect rect3 = this.f4265j;
        boolean z2 = !this.f4287v;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        mVar.requestChildRectangleOnScreen(this, view, rect3, z2, z);
    }

    public final void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C1134m mVar = this.f4271n;
        if (mVar == null || !mVar.onAddFocusables(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ef  */
    /* renamed from: c0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo4571c0(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r18.mo4628m()
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r8.f4269m
            r12 = 1
            r13 = 0
            if (r0 == 0) goto L_0x002b
            int[] r0 = r8.f4238I0
            r0[r13] = r13
            r0[r12] = r13
            r8.mo4579d0(r0, r9, r10)
            int[] r0 = r8.f4238I0
            r1 = r0[r13]
            r0 = r0[r12]
            int r2 = r9 - r1
            int r3 = r10 - r0
            r14 = r0
            r15 = r1
            r16 = r2
            r17 = r3
            goto L_0x0031
        L_0x002b:
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0031:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$l> r0 = r8.f4277q
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x003c
            r18.invalidate()
        L_0x003c:
            int[] r7 = r8.f4238I0
            r7[r13] = r13
            r7[r12] = r13
            int[] r5 = r8.f4234G0
            r0 = r18
            r1 = r15
            r2 = r14
            r3 = r16
            r4 = r17
            r6 = r22
            r0.mo4678t(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.f4238I0
            r1 = r0[r13]
            int r2 = r16 - r1
            r0 = r0[r12]
            int r3 = r17 - r0
            if (r1 != 0) goto L_0x0062
            if (r0 == 0) goto L_0x0060
            goto L_0x0062
        L_0x0060:
            r0 = 0
            goto L_0x0063
        L_0x0062:
            r0 = 1
        L_0x0063:
            int r1 = r8.f4255T
            int[] r4 = r8.f4234G0
            r5 = r4[r13]
            int r1 = r1 - r5
            r8.f4255T = r1
            int r1 = r8.f4256U
            r4 = r4[r12]
            int r1 = r1 - r4
            r8.f4256U = r1
            int[] r1 = r8.f4236H0
            r6 = r1[r13]
            int r6 = r6 + r5
            r1[r13] = r6
            r5 = r1[r12]
            int r5 = r5 + r4
            r1[r12] = r5
            int r1 = r18.getOverScrollMode()
            r4 = 2
            if (r1 == r4) goto L_0x011c
            if (r11 == 0) goto L_0x0119
            r1 = 8194(0x2002, float:1.1482E-41)
            boolean r1 = com.google.android.play.core.assetpacks.C14256d1.m35490h(r11, r1)
            if (r1 != 0) goto L_0x0119
            float r1 = r21.getX()
            float r2 = (float) r2
            float r4 = r21.getY()
            float r3 = (float) r3
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00b9
            r18.mo4681w()
            android.widget.EdgeEffect r7 = r8.f4239J
            float r11 = -r2
            int r12 = r18.getWidth()
            float r12 = (float) r12
            float r11 = r11 / r12
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            float r4 = r5 - r4
            androidx.core.widget.C0789d.C0790a.m2397a(r7, r11, r4)
            goto L_0x00d2
        L_0x00b9:
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d4
            r18.mo4682x()
            android.widget.EdgeEffect r7 = r8.f4243L
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r11 = r2 / r11
            int r12 = r18.getHeight()
            float r12 = (float) r12
            float r4 = r4 / r12
            androidx.core.widget.C0789d.C0790a.m2397a(r7, r11, r4)
        L_0x00d2:
            r4 = 1
            goto L_0x00d5
        L_0x00d4:
            r4 = 0
        L_0x00d5:
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x00ef
            r18.mo4683y()
            android.widget.EdgeEffect r4 = r8.f4241K
            float r5 = -r3
            int r7 = r18.getHeight()
            float r7 = (float) r7
            float r5 = r5 / r7
            int r7 = r18.getWidth()
            float r7 = (float) r7
            float r1 = r1 / r7
            androidx.core.widget.C0789d.C0790a.m2397a(r4, r5, r1)
            goto L_0x0109
        L_0x00ef:
            int r7 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r7 <= 0) goto L_0x010a
            r18.mo4680v()
            android.widget.EdgeEffect r4 = r8.f4245M
            int r7 = r18.getHeight()
            float r7 = (float) r7
            float r7 = r3 / r7
            int r11 = r18.getWidth()
            float r11 = (float) r11
            float r1 = r1 / r11
            float r5 = r5 - r1
            androidx.core.widget.C0789d.C0790a.m2397a(r4, r7, r5)
        L_0x0109:
            r4 = 1
        L_0x010a:
            if (r4 != 0) goto L_0x0114
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0114
            int r1 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0119
        L_0x0114:
            java.util.WeakHashMap<android.view.View, s1.p0> r1 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6337d.m15051k(r18)
        L_0x0119:
            r18.mo4626l(r19, r20)
        L_0x011c:
            if (r15 != 0) goto L_0x0120
            if (r14 == 0) goto L_0x0123
        L_0x0120:
            r8.mo4679u(r15, r14)
        L_0x0123:
            boolean r1 = r18.awakenScrollBars()
            if (r1 != 0) goto L_0x012c
            r18.invalidate()
        L_0x012c:
            if (r0 != 0) goto L_0x0135
            if (r15 != 0) goto L_0x0135
            if (r14 == 0) goto L_0x0133
            goto L_0x0135
        L_0x0133:
            r12 = 0
            goto L_0x0136
        L_0x0135:
            r12 = 1
        L_0x0136:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo4571c0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.f4271n.checkLayoutParams((LayoutParams) layoutParams);
    }

    public final int computeHorizontalScrollExtent() {
        C1134m mVar = this.f4271n;
        if (mVar != null && mVar.canScrollHorizontally()) {
            return this.f4271n.computeHorizontalScrollExtent(this.f4288v0);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        C1134m mVar = this.f4271n;
        if (mVar != null && mVar.canScrollHorizontally()) {
            return this.f4271n.computeHorizontalScrollOffset(this.f4288v0);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        C1134m mVar = this.f4271n;
        if (mVar != null && mVar.canScrollHorizontally()) {
            return this.f4271n.computeHorizontalScrollRange(this.f4288v0);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        C1134m mVar = this.f4271n;
        if (mVar != null && mVar.canScrollVertically()) {
            return this.f4271n.computeVerticalScrollExtent(this.f4288v0);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        C1134m mVar = this.f4271n;
        if (mVar != null && mVar.canScrollVertically()) {
            return this.f4271n.computeVerticalScrollOffset(this.f4288v0);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        C1134m mVar = this.f4271n;
        if (mVar != null && mVar.canScrollVertically()) {
            return this.f4271n.computeVerticalScrollRange(this.f4288v0);
        }
        return 0;
    }

    /* renamed from: d0 */
    public final void mo4579d0(int[] iArr, int i, int i2) {
        int i3;
        int i4;
        C1119a0 a0Var;
        mo4619i0();
        mo4560R();
        int i5 = C5813l.f18762a;
        C5813l.C5814a.m14246a("RV Scroll");
        mo4547A(this.f4288v0);
        if (i != 0) {
            i3 = this.f4271n.scrollHorizontallyBy(i, this.f4258c, this.f4288v0);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.f4271n.scrollVerticallyBy(i2, this.f4258c, this.f4288v0);
        } else {
            i4 = 0;
        }
        C5813l.C5814a.m14247b();
        int e = this.f4261f.mo5031e();
        for (int i6 = 0; i6 < e; i6++) {
            View d = this.f4261f.mo5030d(i6);
            C1119a0 J = mo4554J(d);
            if (!(J == null || (a0Var = J.mShadowingHolder) == null)) {
                View view = a0Var.itemView;
                int left = d.getLeft();
                int top = d.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        mo4561S(true);
        mo4623j0(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo22483a(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo22484b(f, f2);
    }

    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo22485c(i, i2, 0, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo22487e(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void draw(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        super.draw(canvas);
        int size = this.f4277q.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            this.f4277q.get(i3).onDrawOver(canvas, this, this.f4288v0);
        }
        EdgeEffect edgeEffect = this.f4239J;
        boolean z5 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            if (this.f4263h) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i2), BitmapDescriptorFactory.HUE_RED);
            EdgeEffect edgeEffect2 = this.f4239J;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z = false;
            } else {
                z = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f4241K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f4263h) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f4241K;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z3 = false;
            } else {
                z3 = true;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f4243L;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f4263h) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) i, (float) (-width));
            EdgeEffect edgeEffect6 = this.f4243L;
            if (edgeEffect6 == null || !edgeEffect6.draw(canvas)) {
                z2 = false;
            } else {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f4245M;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4263h) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.f4245M;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (z || this.f4247N == null || this.f4277q.size() <= 0 || !this.f4247N.mo4778h()) {
            z5 = z;
        }
        if (z5) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(this);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* renamed from: e0 */
    public final void mo4589e0(int i) {
        if (!this.f4293y) {
            setScrollState(0);
            C1154z zVar = this.f4282s0;
            RecyclerView.this.removeCallbacks(zVar);
            zVar.f4365d.abortAnimation();
            C1134m mVar = this.f4271n;
            if (mVar != null) {
                mVar.stopSmoothScroller();
            }
            C1134m mVar2 = this.f4271n;
            if (mVar2 != null) {
                mVar2.scrollToPosition(i);
                awakenScrollBars();
            }
        }
    }

    /* renamed from: f */
    public final void mo4590f(C1119a0 a0Var) {
        boolean z;
        View view = a0Var.itemView;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.f4258c.mo4926k(mo4554J(view));
        if (a0Var.isTmpDetached()) {
            this.f4261f.mo5028b(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.f4261f.mo5027a(view, -1, true);
        } else {
            C1171e eVar = this.f4261f;
            int indexOfChild = ((C1168c0) eVar.f4449a).f4442a.indexOfChild(view);
            if (indexOfChild >= 0) {
                eVar.f4450b.mo5048h(indexOfChild);
                eVar.mo5035i(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* renamed from: f0 */
    public final void mo4591f0(Adapter adapter, boolean z) {
        Adapter adapter2 = this.f4269m;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.f4257b);
            this.f4269m.onDetachedFromRecyclerView(this);
        }
        mo4567Y();
        C1160a aVar = this.f4260e;
        aVar.mo5004l(aVar.f4424b);
        aVar.mo5004l(aVar.f4425c);
        aVar.f4428f = 0;
        Adapter adapter3 = this.f4269m;
        this.f4269m = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f4257b);
            adapter.onAttachedToRecyclerView(this);
        }
        C1134m mVar = this.f4271n;
        if (mVar != null) {
            mVar.onAdapterChanged(adapter3, this.f4269m);
        }
        C1145s sVar = this.f4258c;
        Adapter adapter4 = this.f4269m;
        sVar.f4327a.clear();
        sVar.mo4920e();
        C1143r c = sVar.mo4918c();
        if (adapter3 != null) {
            c.f4322b--;
        }
        if (!z && c.f4322b == 0) {
            for (int i = 0; i < c.f4321a.size(); i++) {
                c.f4321a.valueAt(i).f4323a.clear();
            }
        }
        if (adapter4 != null) {
            c.f4322b++;
        } else {
            c.getClass();
        }
        this.f4288v0.f4354f = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x016b, code lost:
        if (r3 > 0) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0185, code lost:
        if (r6 > 0) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0188, code lost:
        if (r3 < 0) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x018b, code lost:
        if (r6 < 0) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0194, code lost:
        if ((r6 * r1) <= 0) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x019d, code lost:
        if ((r6 * r1) >= 0) goto L_0x01a1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f4271n
            android.view.View r0 = r0.onInterceptFocusSearch(r14, r15)
            if (r0 == 0) goto L_0x0009
            return r0
        L_0x0009:
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r13.f4269m
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x001f
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f4271n
            if (r0 == 0) goto L_0x001f
            boolean r0 = r13.mo4556N()
            if (r0 != 0) goto L_0x001f
            boolean r0 = r13.f4293y
            if (r0 != 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            r4 = 33
            r5 = 17
            r6 = 0
            r7 = 2
            if (r0 == 0) goto L_0x0093
            if (r15 == r7) goto L_0x0030
            if (r15 != r2) goto L_0x0093
        L_0x0030:
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f4271n
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L_0x0047
            if (r15 != r7) goto L_0x003d
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x003f
        L_0x003d:
            r0 = 33
        L_0x003f:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x0047
            r0 = 1
            goto L_0x0048
        L_0x0047:
            r0 = 0
        L_0x0048:
            if (r0 != 0) goto L_0x0073
            androidx.recyclerview.widget.RecyclerView$m r8 = r13.f4271n
            boolean r8 = r8.canScrollHorizontally()
            if (r8 == 0) goto L_0x0073
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f4271n
            int r0 = r0.getLayoutDirection()
            if (r0 != r2) goto L_0x005c
            r0 = 1
            goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            if (r15 != r7) goto L_0x0061
            r8 = 1
            goto L_0x0062
        L_0x0061:
            r8 = 0
        L_0x0062:
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x0068
            r0 = 66
            goto L_0x006a
        L_0x0068:
            r0 = 17
        L_0x006a:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x0072
            r0 = 1
            goto L_0x0073
        L_0x0072:
            r0 = 0
        L_0x0073:
            if (r0 == 0) goto L_0x008e
            r13.mo4628m()
            android.view.View r0 = r13.mo4548B(r14)
            if (r0 != 0) goto L_0x007f
            return r6
        L_0x007f:
            r13.mo4619i0()
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f4271n
            androidx.recyclerview.widget.RecyclerView$s r8 = r13.f4258c
            androidx.recyclerview.widget.RecyclerView$x r9 = r13.f4288v0
            r0.onFocusSearchFailed(r14, r15, r8, r9)
            r13.mo4623j0(r1)
        L_0x008e:
            android.view.View r0 = r3.findNextFocus(r13, r14, r15)
            goto L_0x00b7
        L_0x0093:
            android.view.View r3 = r3.findNextFocus(r13, r14, r15)
            if (r3 != 0) goto L_0x00b6
            if (r0 == 0) goto L_0x00b6
            r13.mo4628m()
            android.view.View r0 = r13.mo4548B(r14)
            if (r0 != 0) goto L_0x00a5
            return r6
        L_0x00a5:
            r13.mo4619i0()
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f4271n
            androidx.recyclerview.widget.RecyclerView$s r3 = r13.f4258c
            androidx.recyclerview.widget.RecyclerView$x r8 = r13.f4288v0
            android.view.View r0 = r0.onFocusSearchFailed(r14, r15, r3, r8)
            r13.mo4623j0(r1)
            goto L_0x00b7
        L_0x00b6:
            r0 = r3
        L_0x00b7:
            if (r0 == 0) goto L_0x00ce
            boolean r3 = r0.hasFocusable()
            if (r3 != 0) goto L_0x00ce
            android.view.View r1 = r13.getFocusedChild()
            if (r1 != 0) goto L_0x00ca
            android.view.View r14 = super.focusSearch(r14, r15)
            return r14
        L_0x00ca:
            r13.mo4569a0(r0, r6)
            return r14
        L_0x00ce:
            if (r0 == 0) goto L_0x01a1
            if (r0 == r13) goto L_0x01a1
            if (r0 != r14) goto L_0x00d6
            goto L_0x01a1
        L_0x00d6:
            android.view.View r3 = r13.mo4548B(r0)
            if (r3 != 0) goto L_0x00de
            goto L_0x01a2
        L_0x00de:
            if (r14 != 0) goto L_0x00e2
            goto L_0x019f
        L_0x00e2:
            android.view.View r3 = r13.mo4548B(r14)
            if (r3 != 0) goto L_0x00ea
            goto L_0x019f
        L_0x00ea:
            android.graphics.Rect r3 = r13.f4265j
            int r6 = r14.getWidth()
            int r8 = r14.getHeight()
            r3.set(r1, r1, r6, r8)
            android.graphics.Rect r3 = r13.f4266k
            int r6 = r0.getWidth()
            int r8 = r0.getHeight()
            r3.set(r1, r1, r6, r8)
            android.graphics.Rect r1 = r13.f4265j
            r13.offsetDescendantRectToMyCoords(r14, r1)
            android.graphics.Rect r1 = r13.f4266k
            r13.offsetDescendantRectToMyCoords(r0, r1)
            androidx.recyclerview.widget.RecyclerView$m r1 = r13.f4271n
            int r1 = r1.getLayoutDirection()
            if (r1 != r2) goto L_0x0118
            r1 = -1
            goto L_0x0119
        L_0x0118:
            r1 = 1
        L_0x0119:
            android.graphics.Rect r3 = r13.f4265j
            int r6 = r3.left
            android.graphics.Rect r8 = r13.f4266k
            int r9 = r8.left
            if (r6 < r9) goto L_0x0127
            int r10 = r3.right
            if (r10 > r9) goto L_0x012f
        L_0x0127:
            int r10 = r3.right
            int r11 = r8.right
            if (r10 >= r11) goto L_0x012f
            r6 = 1
            goto L_0x013c
        L_0x012f:
            int r10 = r3.right
            int r11 = r8.right
            if (r10 > r11) goto L_0x0137
            if (r6 < r11) goto L_0x013b
        L_0x0137:
            if (r6 <= r9) goto L_0x013b
            r6 = -1
            goto L_0x013c
        L_0x013b:
            r6 = 0
        L_0x013c:
            int r9 = r3.top
            int r10 = r8.top
            if (r9 < r10) goto L_0x0146
            int r11 = r3.bottom
            if (r11 > r10) goto L_0x014e
        L_0x0146:
            int r11 = r3.bottom
            int r12 = r8.bottom
            if (r11 >= r12) goto L_0x014e
            r3 = 1
            goto L_0x015b
        L_0x014e:
            int r3 = r3.bottom
            int r8 = r8.bottom
            if (r3 > r8) goto L_0x0156
            if (r9 < r8) goto L_0x015a
        L_0x0156:
            if (r9 <= r10) goto L_0x015a
            r3 = -1
            goto L_0x015b
        L_0x015a:
            r3 = 0
        L_0x015b:
            if (r15 == r2) goto L_0x0197
            if (r15 == r7) goto L_0x018e
            if (r15 == r5) goto L_0x018b
            if (r15 == r4) goto L_0x0188
            r1 = 66
            if (r15 == r1) goto L_0x0185
            r1 = 130(0x82, float:1.82E-43)
            if (r15 != r1) goto L_0x016e
            if (r3 <= 0) goto L_0x01a1
            goto L_0x019f
        L_0x016e:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid direction: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = p358af.C13437d.m33704i(r13, r0)
            r14.<init>(r15)
            throw r14
        L_0x0185:
            if (r6 <= 0) goto L_0x01a1
            goto L_0x019f
        L_0x0188:
            if (r3 >= 0) goto L_0x01a1
            goto L_0x019f
        L_0x018b:
            if (r6 >= 0) goto L_0x01a1
            goto L_0x019f
        L_0x018e:
            if (r3 > 0) goto L_0x019f
            if (r3 != 0) goto L_0x01a1
            int r6 = r6 * r1
            if (r6 <= 0) goto L_0x01a1
            goto L_0x019f
        L_0x0197:
            if (r3 < 0) goto L_0x019f
            if (r3 != 0) goto L_0x01a1
            int r6 = r6 * r1
            if (r6 >= 0) goto L_0x01a1
        L_0x019f:
            r1 = 1
            goto L_0x01a2
        L_0x01a1:
            r1 = 0
        L_0x01a2:
            if (r1 == 0) goto L_0x01a5
            goto L_0x01a9
        L_0x01a5:
            android.view.View r0 = super.focusSearch(r14, r15)
        L_0x01a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    /* renamed from: g */
    public final void mo4593g(C1133l lVar, int i) {
        C1134m mVar = this.f4271n;
        if (mVar != null) {
            mVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f4277q.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.f4277q.add(lVar);
        } else {
            this.f4277q.add(i, lVar);
        }
        mo4558P();
        requestLayout();
    }

    /* renamed from: g0 */
    public final void mo4594g0(int i, int i2, boolean z) {
        C1134m mVar = this.f4271n;
        if (mVar != null && !this.f4293y) {
            int i3 = 0;
            if (!mVar.canScrollHorizontally()) {
                i = 0;
            }
            if (!this.f4271n.canScrollVertically()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (z) {
                    if (i != 0) {
                        i3 = 1;
                    }
                    if (i2 != 0) {
                        i3 |= 2;
                    }
                    getScrollingChildHelper().mo22489g(i3, 1);
                }
                this.f4282s0.mo4938b(i, i2, Integer.MIN_VALUE, (Interpolator) null);
            }
        }
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C1134m mVar = this.f4271n;
        if (mVar != null) {
            return mVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(C13437d.m33704i(this, C13555b.m33972k("RecyclerView has no LayoutManager")));
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C1134m mVar = this.f4271n;
        if (mVar != null) {
            return mVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(C13437d.m33704i(this, C13555b.m33972k("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public Adapter getAdapter() {
        return this.f4269m;
    }

    public int getBaseline() {
        C1134m mVar = this.f4271n;
        if (mVar != null) {
            return mVar.getBaseline();
        }
        return super.getBaseline();
    }

    public final int getChildDrawingOrder(int i, int i2) {
        C1126h hVar = this.f4228D0;
        if (hVar == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return hVar.mo255g(i, i2);
    }

    public boolean getClipToPadding() {
        return this.f4263h;
    }

    public C1174e0 getCompatAccessibilityDelegate() {
        return this.f4226C0;
    }

    public C1127i getEdgeEffectFactory() {
        return this.f4237I;
    }

    public C1128j getItemAnimator() {
        return this.f4247N;
    }

    public int getItemDecorationCount() {
        return this.f4277q.size();
    }

    public C1134m getLayoutManager() {
        return this.f4271n;
    }

    public int getMaxFlingVelocity() {
        return this.f4274o0;
    }

    public int getMinFlingVelocity() {
        return this.f4272n0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (f4218S0) {
            return System.nanoTime();
        }
        return 0;
    }

    public C1140o getOnFlingListener() {
        return this.f4270m0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4280r0;
    }

    public C1143r getRecycledViewPool() {
        return this.f4258c.mo4918c();
    }

    public int getScrollState() {
        return this.f4249O;
    }

    /* renamed from: h */
    public final void mo4615h(C1142q qVar) {
        if (this.f4292x0 == null) {
            this.f4292x0 = new ArrayList();
        }
        this.f4292x0.add(qVar);
    }

    /* renamed from: h0 */
    public final void mo4616h0(int i) {
        C1134m mVar;
        if (!this.f4293y && (mVar = this.f4271n) != null) {
            mVar.smoothScrollToPosition(this, this.f4288v0, i);
        }
    }

    public final boolean hasNestedScrollingParent() {
        if (getScrollingChildHelper().mo22488f(0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void mo4618i(String str) {
        if (mo4556N()) {
            if (str == null) {
                throw new IllegalStateException(C13437d.m33704i(this, C13555b.m33972k("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.f4235H > 0) {
            new IllegalStateException(C13437d.m33704i(this, C13555b.m33972k("")));
        }
    }

    /* renamed from: i0 */
    public final void mo4619i0() {
        int i = this.f4289w + 1;
        this.f4289w = i;
        if (i == 1 && !this.f4293y) {
            this.f4291x = false;
        }
    }

    public final boolean isAttachedToWindow() {
        return this.f4283t;
    }

    public final boolean isLayoutSuppressed() {
        return this.f4293y;
    }

    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f20038d;
    }

    /* renamed from: j0 */
    public final void mo4623j0(boolean z) {
        if (this.f4289w < 1) {
            this.f4289w = 1;
        }
        if (!z && !this.f4293y) {
            this.f4291x = false;
        }
        if (this.f4289w == 1) {
            if (z && this.f4291x && !this.f4293y && this.f4271n != null && this.f4269m != null) {
                mo4643p();
            }
            if (!this.f4293y) {
                this.f4291x = false;
            }
        }
        this.f4289w--;
    }

    /* renamed from: k */
    public final void mo4624k() {
        int h = this.f4261f.mo5034h();
        for (int i = 0; i < h; i++) {
            C1119a0 K = m3001K(this.f4261f.mo5033g(i));
            if (!K.shouldIgnore()) {
                K.clearOldPosition();
            }
        }
        C1145s sVar = this.f4258c;
        int size = sVar.f4329c.size();
        for (int i2 = 0; i2 < size; i2++) {
            sVar.f4329c.get(i2).clearOldPosition();
        }
        int size2 = sVar.f4327a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            sVar.f4327a.get(i3).clearOldPosition();
        }
        ArrayList<C1119a0> arrayList = sVar.f4328b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                sVar.f4328b.get(i4).clearOldPosition();
            }
        }
    }

    /* renamed from: k0 */
    public final void mo4625k0(int i) {
        getScrollingChildHelper().mo22490h(i);
    }

    /* renamed from: l */
    public final void mo4626l(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.f4239J;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.f4239J.onRelease();
            z = this.f4239J.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4243L;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.f4243L.onRelease();
            z |= this.f4243L.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4241K;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.f4241K.onRelease();
            z |= this.f4241K.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4245M;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.f4245M.onRelease();
            z |= this.f4245M.isFinished();
        }
        if (z) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15051k(this);
        }
    }

    /* renamed from: l0 */
    public final void mo4627l0(Adapter adapter) {
        setLayoutFrozen(false);
        mo4591f0(adapter, true);
        mo4565W(true);
        requestLayout();
    }

    /* renamed from: m */
    public final void mo4628m() {
        boolean z;
        boolean z2;
        if (!this.f4287v || this.f4229E) {
            int i = C5813l.f18762a;
            C5813l.C5814a.m14246a("RV FullInvalidate");
            mo4643p();
            C5813l.C5814a.m14247b();
        } else if (this.f4260e.mo4999g()) {
            C1160a aVar = this.f4260e;
            int i2 = aVar.f4428f;
            boolean z3 = false;
            if ((4 & i2) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if ((11 & i2) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    int i3 = C5813l.f18762a;
                    C5813l.C5814a.m14246a("RV PartialInvalidate");
                    mo4619i0();
                    mo4560R();
                    this.f4260e.mo5002j();
                    if (!this.f4291x) {
                        int e = this.f4261f.mo5031e();
                        int i4 = 0;
                        while (true) {
                            if (i4 < e) {
                                C1119a0 K = m3001K(this.f4261f.mo5030d(i4));
                                if (K != null && !K.shouldIgnore() && K.isUpdated()) {
                                    z3 = true;
                                    break;
                                }
                                i4++;
                            } else {
                                break;
                            }
                        }
                        if (z3) {
                            mo4643p();
                        } else {
                            this.f4260e.mo4994b();
                        }
                    }
                    mo4623j0(true);
                    mo4561S(true);
                    C5813l.C5814a.m14247b();
                    return;
                }
            }
            if (aVar.mo4999g()) {
                int i5 = C5813l.f18762a;
                C5813l.C5814a.m14246a("RV FullInvalidate");
                mo4643p();
                C5813l.C5814a.m14247b();
            }
        }
    }

    /* renamed from: n */
    public final void mo4629n(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        setMeasuredDimension(C1134m.chooseSize(i, paddingRight, C6333d0.C6337d.m15045e(this)), C1134m.chooseSize(i2, getPaddingBottom() + getPaddingTop(), C6333d0.C6337d.m15044d(this)));
    }

    /* renamed from: o */
    public final void mo4630o(View view) {
        C1119a0 K = m3001K(view);
        Adapter adapter = this.f4269m;
        if (!(adapter == null || K == null)) {
            adapter.onViewDetachedFromWindow(K);
        }
        ArrayList arrayList = this.f4227D;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C1139n) this.f4227D.get(size)).mo4908a(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4233G = 0;
        boolean z = true;
        this.f4283t = true;
        if (!this.f4287v || isLayoutRequested()) {
            z = false;
        }
        this.f4287v = z;
        C1134m mVar = this.f4271n;
        if (mVar != null) {
            mVar.dispatchAttachedToWindow(this);
        }
        this.f4224B0 = false;
        if (f4218S0) {
            ThreadLocal<C1223o> threadLocal = C1223o.f4607f;
            C1223o oVar = threadLocal.get();
            this.f4284t0 = oVar;
            if (oVar == null) {
                this.f4284t0 = new C1223o();
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                Display b = C6333d0.C6338e.m15061b(this);
                float f = 60.0f;
                if (!isInEditMode() && b != null) {
                    float refreshRate = b.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                C1223o oVar2 = this.f4284t0;
                oVar2.f4611d = (long) (1.0E9f / f);
                threadLocal.set(oVar2);
            }
            this.f4284t0.f4609b.add(this);
        }
    }

    public final void onDetachedFromWindow() {
        C1223o oVar;
        super.onDetachedFromWindow();
        C1128j jVar = this.f4247N;
        if (jVar != null) {
            jVar.mo4777g();
        }
        setScrollState(0);
        C1154z zVar = this.f4282s0;
        RecyclerView.this.removeCallbacks(zVar);
        zVar.f4365d.abortAnimation();
        C1134m mVar = this.f4271n;
        if (mVar != null) {
            mVar.stopSmoothScroller();
        }
        this.f4283t = false;
        C1134m mVar2 = this.f4271n;
        if (mVar2 != null) {
            mVar2.dispatchDetachedFromWindow(this, this.f4258c);
        }
        this.f4240J0.clear();
        removeCallbacks(this.f4242K0);
        this.f4262g.getClass();
        do {
        } while (C1203k0.C1204a.f4535d.mo22237b() != null);
        if (f4218S0 && (oVar = this.f4284t0) != null) {
            oVar.f4609b.remove(this);
            this.f4284t0 = null;
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f4277q.size();
        for (int i = 0; i < size; i++) {
            this.f4277q.get(i).onDraw(canvas, this, this.f4288v0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            androidx.recyclerview.widget.RecyclerView$m r0 = r14.f4271n
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r14.f4293y
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            int r0 = r15.getAction()
            r2 = 8
            if (r0 != r2) goto L_0x00d5
            int r0 = r15.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L_0x003c
            androidx.recyclerview.widget.RecyclerView$m r0 = r14.f4271n
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L_0x002c
            r0 = 9
            float r0 = r15.getAxisValue(r0)
            float r0 = -r0
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            androidx.recyclerview.widget.RecyclerView$m r3 = r14.f4271n
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L_0x0060
            r3 = 10
            float r3 = r15.getAxisValue(r3)
            goto L_0x0061
        L_0x003c:
            int r0 = r15.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x005f
            r0 = 26
            float r3 = r15.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$m r0 = r14.f4271n
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L_0x0055
            float r0 = -r3
            goto L_0x0060
        L_0x0055:
            androidx.recyclerview.widget.RecyclerView$m r0 = r14.f4271n
            boolean r0 = r0.canScrollHorizontally()
            if (r0 == 0) goto L_0x005f
            r0 = 0
            goto L_0x0061
        L_0x005f:
            r0 = 0
        L_0x0060:
            r3 = 0
        L_0x0061:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0069
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00d5
        L_0x0069:
            float r2 = r14.f4276p0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r14.f4278q0
            float r0 = r0 * r3
            int r0 = (int) r0
            androidx.recyclerview.widget.RecyclerView$m r3 = r14.f4271n
            if (r3 != 0) goto L_0x0079
            goto L_0x00d5
        L_0x0079:
            boolean r4 = r14.f4293y
            if (r4 == 0) goto L_0x007e
            goto L_0x00d5
        L_0x007e:
            int[] r4 = r14.f4238I0
            r4[r1] = r1
            r5 = 1
            r4[r5] = r1
            boolean r3 = r3.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$m r4 = r14.f4271n
            boolean r4 = r4.canScrollVertically()
            if (r4 == 0) goto L_0x0094
            r6 = r3 | 2
            goto L_0x0095
        L_0x0094:
            r6 = r3
        L_0x0095:
            s1.p r7 = r14.getScrollingChildHelper()
            r7.mo22489g(r6, r5)
            if (r3 == 0) goto L_0x00a0
            r9 = r2
            goto L_0x00a1
        L_0x00a0:
            r9 = 0
        L_0x00a1:
            if (r4 == 0) goto L_0x00a5
            r10 = r0
            goto L_0x00a6
        L_0x00a5:
            r10 = 0
        L_0x00a6:
            int[] r12 = r14.f4238I0
            int[] r13 = r14.f4234G0
            r11 = 1
            r8 = r14
            boolean r6 = r8.mo4651s(r9, r10, r11, r12, r13)
            if (r6 == 0) goto L_0x00ba
            int[] r6 = r14.f4238I0
            r7 = r6[r1]
            int r2 = r2 - r7
            r6 = r6[r5]
            int r0 = r0 - r6
        L_0x00ba:
            if (r3 == 0) goto L_0x00be
            r3 = r2
            goto L_0x00bf
        L_0x00be:
            r3 = 0
        L_0x00bf:
            if (r4 == 0) goto L_0x00c3
            r4 = r0
            goto L_0x00c4
        L_0x00c3:
            r4 = 0
        L_0x00c4:
            r14.mo4571c0(r3, r4, r15, r5)
            androidx.recyclerview.widget.o r15 = r14.f4284t0
            if (r15 == 0) goto L_0x00d2
            if (r2 != 0) goto L_0x00cf
            if (r0 == 0) goto L_0x00d2
        L_0x00cf:
            r15.mo5113a(r14, r2, r0)
        L_0x00d2:
            r14.mo4625k0(r5)
        L_0x00d5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.f4293y) {
            return false;
        }
        this.f4281s = null;
        if (mo4549C(motionEvent)) {
            m3004b0();
            setScrollState(0);
            return true;
        }
        C1134m mVar = this.f4271n;
        if (mVar == null) {
            return false;
        }
        boolean canScrollHorizontally = mVar.canScrollHorizontally();
        boolean canScrollVertically = this.f4271n.canScrollVertically();
        if (this.f4252Q == null) {
            this.f4252Q = VelocityTracker.obtain();
        }
        this.f4252Q.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f4295z) {
                this.f4295z = false;
            }
            this.f4251P = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.f4255T = x;
            this.f4253R = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.f4256U = y;
            this.f4254S = y;
            if (this.f4249O == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                mo4625k0(1);
            }
            int[] iArr = this.f4236H0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (canScrollVertically) {
                canScrollHorizontally |= true;
            }
            getScrollingChildHelper().mo22489g(canScrollHorizontally ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f4252Q.clear();
            mo4625k0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f4251P);
            if (findPointerIndex < 0) {
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f4249O != 1) {
                int i = x2 - this.f4253R;
                int i2 = y2 - this.f4254S;
                if (!canScrollHorizontally || Math.abs(i) <= this.f4268l0) {
                    z = false;
                } else {
                    this.f4255T = x2;
                    z = true;
                }
                if (canScrollVertically && Math.abs(i2) > this.f4268l0) {
                    this.f4256U = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            m3004b0();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.f4251P = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f4255T = x3;
            this.f4253R = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f4256U = y3;
            this.f4254S = y3;
        } else if (actionMasked == 6) {
            mo4562T(motionEvent);
        }
        if (this.f4249O == 1) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = C5813l.f18762a;
        C5813l.C5814a.m14246a("RV OnLayout");
        mo4643p();
        C5813l.C5814a.m14247b();
        this.f4287v = true;
    }

    public final void onMeasure(int i, int i2) {
        C1134m mVar = this.f4271n;
        if (mVar == null) {
            mo4629n(i, i2);
            return;
        }
        boolean z = false;
        if (mVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f4271n.onMeasure(this.f4258c, this.f4288v0, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.f4244L0 = z;
            if (!z && this.f4269m != null) {
                if (this.f4288v0.f4352d == 1) {
                    mo4644q();
                }
                this.f4271n.setMeasureSpecs(i, i2);
                this.f4288v0.f4357i = true;
                mo4645r();
                this.f4271n.setMeasuredDimensionFromChildren(i, i2);
                if (this.f4271n.shouldMeasureTwice()) {
                    this.f4271n.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f4288v0.f4357i = true;
                    mo4645r();
                    this.f4271n.setMeasuredDimensionFromChildren(i, i2);
                }
                this.f4246M0 = getMeasuredWidth();
                this.f4248N0 = getMeasuredHeight();
            }
        } else if (this.f4285u) {
            this.f4271n.onMeasure(this.f4258c, this.f4288v0, i, i2);
        } else {
            if (this.f4223B) {
                mo4619i0();
                mo4560R();
                mo4564V();
                mo4561S(true);
                C1152x xVar = this.f4288v0;
                if (xVar.f4359k) {
                    xVar.f4355g = true;
                } else {
                    this.f4260e.mo4995c();
                    this.f4288v0.f4355g = false;
                }
                this.f4223B = false;
                mo4623j0(false);
            } else if (this.f4288v0.f4359k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            Adapter adapter = this.f4269m;
            if (adapter != null) {
                this.f4288v0.f4353e = adapter.getItemCount();
            } else {
                this.f4288v0.f4353e = 0;
            }
            mo4619i0();
            this.f4271n.onMeasure(this.f4258c, this.f4288v0, i, i2);
            mo4623j0(false);
            this.f4288v0.f4355g = false;
        }
    }

    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (mo4556N()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f4259d = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f4259d;
        if (savedState2 != null) {
            savedState.f4301b = savedState2.f4301b;
        } else {
            C1134m mVar = this.f4271n;
            if (mVar != null) {
                savedState.f4301b = mVar.onSaveInstanceState();
            } else {
                savedState.f4301b = null;
            }
        }
        return savedState;
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.f4245M = null;
            this.f4241K = null;
            this.f4243L = null;
            this.f4239J = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:196:0x02fe, code lost:
        if (r0 < r2) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0384, code lost:
        if (r8 != false) goto L_0x038b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0304  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x0313  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r23) {
        /*
            r22 = this;
            r6 = r22
            r7 = r23
            boolean r0 = r6.f4293y
            r8 = 0
            if (r0 != 0) goto L_0x03cc
            boolean r0 = r6.f4295z
            if (r0 == 0) goto L_0x000f
            goto L_0x03cc
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView$p r0 = r6.f4281s
            r1 = 3
            r2 = 0
            r9 = 1
            if (r0 != 0) goto L_0x0023
            int r0 = r23.getAction()
            if (r0 != 0) goto L_0x001e
            r0 = 0
            goto L_0x0031
        L_0x001e:
            boolean r0 = r22.mo4549C(r23)
            goto L_0x0031
        L_0x0023:
            r0.onTouchEvent(r7)
            int r0 = r23.getAction()
            if (r0 == r1) goto L_0x002e
            if (r0 != r9) goto L_0x0030
        L_0x002e:
            r6.f4281s = r2
        L_0x0030:
            r0 = 1
        L_0x0031:
            if (r0 == 0) goto L_0x003a
            r22.m3004b0()
            r6.setScrollState(r8)
            return r9
        L_0x003a:
            androidx.recyclerview.widget.RecyclerView$m r0 = r6.f4271n
            if (r0 != 0) goto L_0x003f
            return r8
        L_0x003f:
            boolean r10 = r0.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$m r0 = r6.f4271n
            boolean r11 = r0.canScrollVertically()
            android.view.VelocityTracker r0 = r6.f4252Q
            if (r0 != 0) goto L_0x0053
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f4252Q = r0
        L_0x0053:
            int r0 = r23.getActionMasked()
            int r3 = r23.getActionIndex()
            if (r0 != 0) goto L_0x0063
            int[] r4 = r6.f4236H0
            r4[r9] = r8
            r4[r8] = r8
        L_0x0063:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r23)
            int[] r4 = r6.f4236H0
            r5 = r4[r8]
            float r5 = (float) r5
            r4 = r4[r9]
            float r4 = (float) r4
            r12.offsetLocation(r5, r4)
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x0390
            r5 = 2
            if (r0 == r9) goto L_0x017a
            if (r0 == r5) goto L_0x00ae
            if (r0 == r1) goto L_0x00a6
            r1 = 5
            if (r0 == r1) goto L_0x008a
            r1 = 6
            if (r0 == r1) goto L_0x0085
            goto L_0x0175
        L_0x0085:
            r22.mo4562T(r23)
            goto L_0x0175
        L_0x008a:
            int r0 = r7.getPointerId(r3)
            r6.f4251P = r0
            float r0 = r7.getX(r3)
            float r0 = r0 + r4
            int r0 = (int) r0
            r6.f4255T = r0
            r6.f4253R = r0
            float r0 = r7.getY(r3)
            float r0 = r0 + r4
            int r0 = (int) r0
            r6.f4256U = r0
            r6.f4254S = r0
            goto L_0x0175
        L_0x00a6:
            r22.m3004b0()
            r6.setScrollState(r8)
            goto L_0x0175
        L_0x00ae:
            int r0 = r6.f4251P
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b7
            return r8
        L_0x00b7:
            float r1 = r7.getX(r0)
            float r1 = r1 + r4
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r4
            int r14 = (int) r0
            int r0 = r6.f4255T
            int r0 = r0 - r13
            int r1 = r6.f4256U
            int r1 = r1 - r14
            int r2 = r6.f4249O
            if (r2 == r9) goto L_0x0100
            if (r10 == 0) goto L_0x00e4
            if (r0 <= 0) goto L_0x00d9
            int r2 = r6.f4268l0
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00e0
        L_0x00d9:
            int r2 = r6.f4268l0
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00e0:
            if (r0 == 0) goto L_0x00e4
            r2 = 1
            goto L_0x00e5
        L_0x00e4:
            r2 = 0
        L_0x00e5:
            if (r11 == 0) goto L_0x00fb
            if (r1 <= 0) goto L_0x00f1
            int r3 = r6.f4268l0
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00f8
        L_0x00f1:
            int r3 = r6.f4268l0
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00f8:
            if (r1 == 0) goto L_0x00fb
            r2 = 1
        L_0x00fb:
            if (r2 == 0) goto L_0x0100
            r6.setScrollState(r9)
        L_0x0100:
            r15 = r0
            r16 = r1
            int r0 = r6.f4249O
            if (r0 != r9) goto L_0x0175
            int[] r4 = r6.f4238I0
            r4[r8] = r8
            r4[r9] = r8
            if (r10 == 0) goto L_0x0111
            r1 = r15
            goto L_0x0112
        L_0x0111:
            r1 = 0
        L_0x0112:
            if (r11 == 0) goto L_0x0117
            r2 = r16
            goto L_0x0118
        L_0x0117:
            r2 = 0
        L_0x0118:
            int[] r5 = r6.f4234G0
            r3 = 0
            r0 = r22
            boolean r0 = r0.mo4651s(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0145
            int[] r0 = r6.f4238I0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.f4236H0
            r1 = r0[r8]
            int[] r2 = r6.f4234G0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r22.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0145:
            r0 = r16
            int[] r1 = r6.f4234G0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f4255T = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f4256U = r14
            if (r10 == 0) goto L_0x0157
            r1 = r15
            goto L_0x0158
        L_0x0157:
            r1 = 0
        L_0x0158:
            if (r11 == 0) goto L_0x015c
            r2 = r0
            goto L_0x015d
        L_0x015c:
            r2 = 0
        L_0x015d:
            boolean r1 = r6.mo4571c0(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x016a
            android.view.ViewParent r1 = r22.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x016a:
            androidx.recyclerview.widget.o r1 = r6.f4284t0
            if (r1 == 0) goto L_0x0175
            if (r15 != 0) goto L_0x0172
            if (r0 == 0) goto L_0x0175
        L_0x0172:
            r1.mo5113a(r6, r15, r0)
        L_0x0175:
            r0 = r6
            r19 = r12
            goto L_0x03ba
        L_0x017a:
            android.view.VelocityTracker r0 = r6.f4252Q
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f4252Q
            r1 = 1000(0x3e8, float:1.401E-42)
            int r3 = r6.f4274o0
            float r3 = (float) r3
            r0.computeCurrentVelocity(r1, r3)
            r0 = 0
            if (r10 == 0) goto L_0x0196
            android.view.VelocityTracker r1 = r6.f4252Q
            int r3 = r6.f4251P
            float r1 = r1.getXVelocity(r3)
            float r1 = -r1
            goto L_0x0197
        L_0x0196:
            r1 = 0
        L_0x0197:
            if (r11 == 0) goto L_0x01a3
            android.view.VelocityTracker r3 = r6.f4252Q
            int r4 = r6.f4251P
            float r3 = r3.getYVelocity(r4)
            float r3 = -r3
            goto L_0x01a4
        L_0x01a3:
            r3 = 0
        L_0x01a4:
            int r4 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x01b3
            int r4 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x01ad
            goto L_0x01b3
        L_0x01ad:
            r0 = r6
            r19 = r12
        L_0x01b0:
            r1 = 0
            goto L_0x0388
        L_0x01b3:
            int r1 = (int) r1
            int r3 = (int) r3
            androidx.recyclerview.widget.RecyclerView$m r4 = r6.f4271n
            if (r4 != 0) goto L_0x01ba
            goto L_0x01e3
        L_0x01ba:
            boolean r7 = r6.f4293y
            if (r7 == 0) goto L_0x01bf
            goto L_0x01e3
        L_0x01bf:
            boolean r4 = r4.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$m r7 = r6.f4271n
            boolean r7 = r7.canScrollVertically()
            if (r4 == 0) goto L_0x01d3
            int r10 = java.lang.Math.abs(r1)
            int r11 = r6.f4272n0
            if (r10 >= r11) goto L_0x01d4
        L_0x01d3:
            r1 = 0
        L_0x01d4:
            if (r7 == 0) goto L_0x01de
            int r10 = java.lang.Math.abs(r3)
            int r11 = r6.f4272n0
            if (r10 >= r11) goto L_0x01df
        L_0x01de:
            r3 = 0
        L_0x01df:
            if (r1 != 0) goto L_0x01e8
            if (r3 != 0) goto L_0x01e8
        L_0x01e3:
            r0 = r6
            r19 = r12
            goto L_0x0384
        L_0x01e8:
            float r10 = (float) r1
            float r11 = (float) r3
            boolean r13 = r6.dispatchNestedPreFling(r10, r11)
            if (r13 != 0) goto L_0x0380
            if (r4 != 0) goto L_0x01f7
            if (r7 == 0) goto L_0x01f5
            goto L_0x01f7
        L_0x01f5:
            r13 = 0
            goto L_0x01f8
        L_0x01f7:
            r13 = 1
        L_0x01f8:
            r6.dispatchNestedFling(r10, r11, r13)
            androidx.recyclerview.widget.RecyclerView$o r10 = r6.f4270m0
            if (r10 == 0) goto L_0x0318
            androidx.recyclerview.widget.h0 r10 = (androidx.recyclerview.widget.C1187h0) r10
            androidx.recyclerview.widget.RecyclerView r11 = r10.f4503a
            androidx.recyclerview.widget.RecyclerView$m r11 = r11.getLayoutManager()
            if (r11 != 0) goto L_0x020a
            goto L_0x0226
        L_0x020a:
            androidx.recyclerview.widget.RecyclerView r14 = r10.f4503a
            androidx.recyclerview.widget.RecyclerView$Adapter r14 = r14.getAdapter()
            if (r14 != 0) goto L_0x0213
            goto L_0x0226
        L_0x0213:
            androidx.recyclerview.widget.RecyclerView r14 = r10.f4503a
            int r14 = r14.getMinFlingVelocity()
            int r15 = java.lang.Math.abs(r3)
            if (r15 > r14) goto L_0x022c
            int r15 = java.lang.Math.abs(r1)
            if (r15 <= r14) goto L_0x0226
            goto L_0x022c
        L_0x0226:
            r21 = r4
            r19 = r12
            goto L_0x0310
        L_0x022c:
            boolean r14 = r11 instanceof androidx.recyclerview.widget.RecyclerView.C1149w.C1151b
            if (r14 != 0) goto L_0x0231
            goto L_0x0244
        L_0x0231:
            androidx.recyclerview.widget.b0 r10 = (androidx.recyclerview.widget.C1165b0) r10
            if (r14 != 0) goto L_0x0237
            r15 = r2
            goto L_0x0242
        L_0x0237:
            androidx.recyclerview.widget.a0 r15 = new androidx.recyclerview.widget.a0
            androidx.recyclerview.widget.RecyclerView r2 = r10.f4503a
            android.content.Context r2 = r2.getContext()
            r15.<init>(r10, r2)
        L_0x0242:
            if (r15 != 0) goto L_0x024a
        L_0x0244:
            r21 = r4
            r19 = r12
            goto L_0x030c
        L_0x024a:
            int r2 = r11.getItemCount()
            if (r2 != 0) goto L_0x0251
            goto L_0x026a
        L_0x0251:
            boolean r17 = r11.canScrollVertically()
            if (r17 == 0) goto L_0x025c
            androidx.recyclerview.widget.z r10 = r10.mo5018h(r11)
            goto L_0x0268
        L_0x025c:
            boolean r17 = r11.canScrollHorizontally()
            if (r17 == 0) goto L_0x0267
            androidx.recyclerview.widget.z r10 = r10.mo5017g(r11)
            goto L_0x0268
        L_0x0267:
            r10 = 0
        L_0x0268:
            if (r10 != 0) goto L_0x0270
        L_0x026a:
            r21 = r4
            r19 = r12
            goto L_0x0300
        L_0x0270:
            int r5 = r11.getChildCount()
            r18 = -2147483648(0xffffffff80000000, float:-0.0)
            r19 = 2147483647(0x7fffffff, float:NaN)
            r19 = r12
            r0 = 0
            r6 = 2147483647(0x7fffffff, float:NaN)
            r8 = 0
            r9 = 0
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0283:
            if (r9 >= r5) goto L_0x02a9
            r20 = r5
            android.view.View r5 = r11.getChildAt(r9)
            if (r5 != 0) goto L_0x0290
            r21 = r4
            goto L_0x02a2
        L_0x0290:
            r21 = r4
            int r4 = androidx.recyclerview.widget.C1165b0.m3198e(r5, r10)
            if (r4 > 0) goto L_0x029c
            if (r4 <= r12) goto L_0x029c
            r12 = r4
            r0 = r5
        L_0x029c:
            if (r4 < 0) goto L_0x02a2
            if (r4 >= r6) goto L_0x02a2
            r6 = r4
            r8 = r5
        L_0x02a2:
            int r9 = r9 + 1
            r5 = r20
            r4 = r21
            goto L_0x0283
        L_0x02a9:
            r21 = r4
            boolean r4 = r11.canScrollHorizontally()
            if (r4 == 0) goto L_0x02b4
            if (r1 <= 0) goto L_0x02b8
            goto L_0x02b6
        L_0x02b4:
            if (r3 <= 0) goto L_0x02b8
        L_0x02b6:
            r4 = 1
            goto L_0x02b9
        L_0x02b8:
            r4 = 0
        L_0x02b9:
            if (r4 == 0) goto L_0x02c2
            if (r8 == 0) goto L_0x02c2
            int r0 = r11.getPosition(r8)
            goto L_0x0301
        L_0x02c2:
            if (r4 != 0) goto L_0x02cb
            if (r0 == 0) goto L_0x02cb
            int r0 = r11.getPosition(r0)
            goto L_0x0301
        L_0x02cb:
            if (r4 == 0) goto L_0x02ce
            r8 = r0
        L_0x02ce:
            if (r8 != 0) goto L_0x02d1
            goto L_0x0300
        L_0x02d1:
            int r0 = r11.getPosition(r8)
            int r5 = r11.getItemCount()
            if (r14 == 0) goto L_0x02f5
            r6 = r11
            androidx.recyclerview.widget.RecyclerView$w$b r6 = (androidx.recyclerview.widget.RecyclerView.C1149w.C1151b) r6
            r8 = 1
            int r5 = r5 - r8
            android.graphics.PointF r5 = r6.computeScrollVectorForPosition(r5)
            if (r5 == 0) goto L_0x02f5
            float r6 = r5.x
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x02f3
            float r5 = r5.y
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x02f5
        L_0x02f3:
            r5 = 1
            goto L_0x02f6
        L_0x02f5:
            r5 = 0
        L_0x02f6:
            if (r5 != r4) goto L_0x02fa
            r4 = -1
            goto L_0x02fb
        L_0x02fa:
            r4 = 1
        L_0x02fb:
            int r0 = r0 + r4
            if (r0 < 0) goto L_0x0300
            if (r0 < r2) goto L_0x0301
        L_0x0300:
            r0 = -1
        L_0x0301:
            r2 = -1
            if (r0 != r2) goto L_0x0306
            r8 = 0
            goto L_0x030c
        L_0x0306:
            r15.f4336a = r0
            r11.startSmoothScroll(r15)
            r8 = 1
        L_0x030c:
            if (r8 == 0) goto L_0x0310
            r0 = 1
            goto L_0x0311
        L_0x0310:
            r0 = 0
        L_0x0311:
            if (r0 == 0) goto L_0x031c
            r8 = 1
            r0 = r22
            goto L_0x0384
        L_0x0318:
            r21 = r4
            r19 = r12
        L_0x031c:
            if (r13 == 0) goto L_0x037d
            if (r7 == 0) goto L_0x0323
            r4 = r21 | 2
            goto L_0x0325
        L_0x0323:
            r4 = r21
        L_0x0325:
            s1.p r0 = r22.getScrollingChildHelper()
            r2 = 1
            r0.mo22489g(r4, r2)
            r0 = r22
            int r2 = r0.f4274o0
            int r4 = -r2
            int r1 = java.lang.Math.min(r1, r2)
            int r8 = java.lang.Math.max(r4, r1)
            int r1 = r0.f4274o0
            int r2 = -r1
            int r1 = java.lang.Math.min(r3, r1)
            int r9 = java.lang.Math.max(r2, r1)
            androidx.recyclerview.widget.RecyclerView$z r1 = r0.f4282s0
            androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
            r3 = 2
            r2.setScrollState(r3)
            r2 = 0
            r1.f4364c = r2
            r1.f4363b = r2
            android.view.animation.Interpolator r2 = r1.f4366e
            androidx.recyclerview.widget.RecyclerView$c r3 = f4220U0
            if (r2 == r3) goto L_0x0367
            r1.f4366e = r3
            android.widget.OverScroller r2 = new android.widget.OverScroller
            androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
            android.content.Context r4 = r4.getContext()
            r2.<init>(r4, r3)
            r1.f4365d = r2
        L_0x0367:
            android.widget.OverScroller r5 = r1.f4365d
            r6 = 0
            r7 = 0
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = 2147483647(0x7fffffff, float:NaN)
            r5.fling(r6, r7, r8, r9, r10, r11, r12, r13)
            r1.mo4937a()
            r8 = 1
            goto L_0x0384
        L_0x037d:
            r0 = r22
            goto L_0x0383
        L_0x0380:
            r0 = r6
            r19 = r12
        L_0x0383:
            r8 = 0
        L_0x0384:
            if (r8 != 0) goto L_0x038b
            goto L_0x01b0
        L_0x0388:
            r0.setScrollState(r1)
        L_0x038b:
            r22.m3004b0()
            r8 = 1
            goto L_0x03bb
        L_0x0390:
            r0 = r6
            r19 = r12
            r1 = 0
            int r2 = r7.getPointerId(r1)
            r0.f4251P = r2
            float r1 = r23.getX()
            float r1 = r1 + r4
            int r1 = (int) r1
            r0.f4255T = r1
            r0.f4253R = r1
            float r1 = r23.getY()
            float r1 = r1 + r4
            int r1 = (int) r1
            r0.f4256U = r1
            r0.f4254S = r1
            if (r11 == 0) goto L_0x03b2
            r10 = r10 | 2
        L_0x03b2:
            s1.p r1 = r22.getScrollingChildHelper()
            r2 = 0
            r1.mo22489g(r10, r2)
        L_0x03ba:
            r8 = 0
        L_0x03bb:
            if (r8 != 0) goto L_0x03c5
            android.view.VelocityTracker r1 = r0.f4252Q
            r2 = r19
            r1.addMovement(r2)
            goto L_0x03c7
        L_0x03c5:
            r2 = r19
        L_0x03c7:
            r2.recycle()
            r1 = 1
            return r1
        L_0x03cc:
            r0 = r6
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:151:0x032a, code lost:
        if (r15.f4261f.mo5037k(getFocusedChild()) == false) goto L_0x03fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03c8, code lost:
        r0 = java.lang.Math.min(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03cc, code lost:
        r0 = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03ce, code lost:
        if (r0 < 0) goto L_0x03e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x03d0, code lost:
        r1 = mo4551F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x03d4, code lost:
        if (r1 != null) goto L_0x03d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x03dd, code lost:
        if (r1.itemView.hasFocusable() == false) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03df, code lost:
        r0 = r1.itemView;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4643p() {
        /*
            r15 = this;
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r15.f4269m
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f4271n
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f4288v0
            r1 = 0
            r0.f4357i = r1
            boolean r0 = r15.f4244L0
            r2 = 1
            if (r0 == 0) goto L_0x0026
            int r0 = r15.f4246M0
            int r3 = r15.getWidth()
            if (r0 != r3) goto L_0x0024
            int r0 = r15.f4248N0
            int r3 = r15.getHeight()
            if (r0 == r3) goto L_0x0026
        L_0x0024:
            r0 = 1
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            r15.f4246M0 = r1
            r15.f4248N0 = r1
            r15.f4244L0 = r1
            androidx.recyclerview.widget.RecyclerView$x r3 = r15.f4288v0
            int r3 = r3.f4352d
            if (r3 != r2) goto L_0x003f
            r15.mo4644q()
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f4271n
            r0.setExactMeasureSpecsFrom(r15)
            r15.mo4645r()
            goto L_0x007f
        L_0x003f:
            androidx.recyclerview.widget.a r3 = r15.f4260e
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r4 = r3.f4425c
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0053
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r3.f4424b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0053
            r3 = 1
            goto L_0x0054
        L_0x0053:
            r3 = 0
        L_0x0054:
            if (r3 != 0) goto L_0x0077
            if (r0 != 0) goto L_0x0077
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f4271n
            int r0 = r0.getWidth()
            int r3 = r15.getWidth()
            if (r0 != r3) goto L_0x0077
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f4271n
            int r0 = r0.getHeight()
            int r3 = r15.getHeight()
            if (r0 == r3) goto L_0x0071
            goto L_0x0077
        L_0x0071:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f4271n
            r0.setExactMeasureSpecsFrom(r15)
            goto L_0x007f
        L_0x0077:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f4271n
            r0.setExactMeasureSpecsFrom(r15)
            r15.mo4645r()
        L_0x007f:
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f4288v0
            r3 = 4
            r0.mo4934a(r3)
            r15.mo4619i0()
            r15.mo4560R()
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f4288v0
            r0.f4352d = r2
            boolean r0 = r0.f4358j
            r4 = 0
            if (r0 == 0) goto L_0x028e
            androidx.recyclerview.widget.e r0 = r15.f4261f
            int r0 = r0.mo5031e()
            int r0 = r0 - r2
        L_0x009b:
            if (r0 < 0) goto L_0x01be
            androidx.recyclerview.widget.e r5 = r15.f4261f
            android.view.View r5 = r5.mo5030d(r0)
            androidx.recyclerview.widget.RecyclerView$a0 r5 = m3001K(r5)
            boolean r6 = r5.shouldIgnore()
            if (r6 == 0) goto L_0x00af
            goto L_0x01ba
        L_0x00af:
            long r6 = r15.mo4553H(r5)
            androidx.recyclerview.widget.RecyclerView$j r8 = r15.f4247N
            r8.getClass()
            androidx.recyclerview.widget.RecyclerView$j$c r8 = new androidx.recyclerview.widget.RecyclerView$j$c
            r8.<init>()
            r8.mo4781a(r5)
            androidx.recyclerview.widget.k0 r9 = r15.f4262g
            s0.e<androidx.recyclerview.widget.RecyclerView$a0> r9 = r9.f4534b
            java.lang.Object r9 = r9.mo22329i(r6, r4)
            androidx.recyclerview.widget.RecyclerView$a0 r9 = (androidx.recyclerview.widget.RecyclerView.C1119a0) r9
            if (r9 == 0) goto L_0x01b5
            boolean r10 = r9.shouldIgnore()
            if (r10 != 0) goto L_0x01b5
            androidx.recyclerview.widget.k0 r10 = r15.f4262g
            s0.h<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.k0$a> r10 = r10.f4533a
            java.lang.Object r10 = r10.getOrDefault(r9, r4)
            androidx.recyclerview.widget.k0$a r10 = (androidx.recyclerview.widget.C1203k0.C1204a) r10
            if (r10 == 0) goto L_0x00e5
            int r10 = r10.f4536a
            r10 = r10 & r2
            if (r10 == 0) goto L_0x00e5
            r10 = 1
            goto L_0x00e6
        L_0x00e5:
            r10 = 0
        L_0x00e6:
            androidx.recyclerview.widget.k0 r11 = r15.f4262g
            s0.h<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.k0$a> r11 = r11.f4533a
            java.lang.Object r11 = r11.getOrDefault(r5, r4)
            androidx.recyclerview.widget.k0$a r11 = (androidx.recyclerview.widget.C1203k0.C1204a) r11
            if (r11 == 0) goto L_0x00f9
            int r11 = r11.f4536a
            r11 = r11 & r2
            if (r11 == 0) goto L_0x00f9
            r11 = 1
            goto L_0x00fa
        L_0x00f9:
            r11 = 0
        L_0x00fa:
            if (r10 == 0) goto L_0x0105
            if (r9 != r5) goto L_0x0105
            androidx.recyclerview.widget.k0 r6 = r15.f4262g
            r6.mo5087a(r5, r8)
            goto L_0x01ba
        L_0x0105:
            androidx.recyclerview.widget.k0 r12 = r15.f4262g
            androidx.recyclerview.widget.RecyclerView$j$c r12 = r12.mo5089c(r9, r3)
            androidx.recyclerview.widget.k0 r13 = r15.f4262g
            r13.mo5087a(r5, r8)
            androidx.recyclerview.widget.k0 r8 = r15.f4262g
            r13 = 8
            androidx.recyclerview.widget.RecyclerView$j$c r8 = r8.mo5089c(r5, r13)
            if (r12 != 0) goto L_0x018b
            androidx.recyclerview.widget.e r8 = r15.f4261f
            int r8 = r8.mo5031e()
            r10 = 0
        L_0x0121:
            if (r10 >= r8) goto L_0x0181
            androidx.recyclerview.widget.e r11 = r15.f4261f
            android.view.View r11 = r11.mo5030d(r10)
            androidx.recyclerview.widget.RecyclerView$a0 r11 = m3001K(r11)
            if (r11 != r5) goto L_0x0130
            goto L_0x017e
        L_0x0130:
            long r12 = r15.mo4553H(r11)
            int r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r14 != 0) goto L_0x017e
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r15.f4269m
            java.lang.String r1 = " \n View Holder 2:"
            if (r0 == 0) goto L_0x0161
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto L_0x0161
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r2.append(r3)
            r2.append(r11)
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = p358af.C13437d.m33704i(r15, r2)
            r0.<init>(r1)
            throw r0
        L_0x0161:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r2.append(r3)
            r2.append(r11)
            r2.append(r1)
            r2.append(r5)
            java.lang.String r1 = p358af.C13437d.m33704i(r15, r2)
            r0.<init>(r1)
            throw r0
        L_0x017e:
            int r10 = r10 + 1
            goto L_0x0121
        L_0x0181:
            java.util.Objects.toString(r9)
            java.util.Objects.toString(r5)
            r15.mo4684z()
            goto L_0x01ba
        L_0x018b:
            r9.setIsRecyclable(r1)
            if (r10 == 0) goto L_0x0193
            r15.mo4590f(r9)
        L_0x0193:
            if (r9 == r5) goto L_0x01a9
            if (r11 == 0) goto L_0x019a
            r15.mo4590f(r5)
        L_0x019a:
            r9.mShadowedHolder = r5
            r15.mo4590f(r9)
            androidx.recyclerview.widget.RecyclerView$s r6 = r15.f4258c
            r6.mo4926k(r9)
            r5.setIsRecyclable(r1)
            r5.mShadowingHolder = r9
        L_0x01a9:
            androidx.recyclerview.widget.RecyclerView$j r6 = r15.f4247N
            boolean r5 = r6.mo4772a(r9, r5, r12, r8)
            if (r5 == 0) goto L_0x01ba
            r15.mo4563U()
            goto L_0x01ba
        L_0x01b5:
            androidx.recyclerview.widget.k0 r6 = r15.f4262g
            r6.mo5087a(r5, r8)
        L_0x01ba:
            int r0 = r0 + -1
            goto L_0x009b
        L_0x01be:
            androidx.recyclerview.widget.k0 r0 = r15.f4262g
            androidx.recyclerview.widget.RecyclerView$d r3 = r15.f4250O0
            s0.h<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.k0$a> r5 = r0.f4533a
            int r5 = r5.f19969d
        L_0x01c6:
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x028e
            s0.h<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.k0$a> r6 = r0.f4533a
            java.lang.Object r6 = r6.mo22416h(r5)
            r8 = r6
            androidx.recyclerview.widget.RecyclerView$a0 r8 = (androidx.recyclerview.widget.RecyclerView.C1119a0) r8
            s0.h<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.k0$a> r6 = r0.f4533a
            java.lang.Object r6 = r6.mo22420j(r5)
            androidx.recyclerview.widget.k0$a r6 = (androidx.recyclerview.widget.C1203k0.C1204a) r6
            int r7 = r6.f4536a
            r9 = r7 & 3
            r10 = 3
            if (r9 != r10) goto L_0x01ef
            androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$m r9 = r7.f4271n
            android.view.View r8 = r8.itemView
            androidx.recyclerview.widget.RecyclerView$s r7 = r7.f4258c
            r9.removeAndRecycleView(r8, r7)
            goto L_0x0281
        L_0x01ef:
            r9 = r7 & 1
            if (r9 == 0) goto L_0x020b
            androidx.recyclerview.widget.RecyclerView$j$c r7 = r6.f4537b
            if (r7 != 0) goto L_0x0204
            androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$m r9 = r7.f4271n
            android.view.View r8 = r8.itemView
            androidx.recyclerview.widget.RecyclerView$s r7 = r7.f4258c
            r9.removeAndRecycleView(r8, r7)
            goto L_0x0281
        L_0x0204:
            androidx.recyclerview.widget.RecyclerView$j$c r9 = r6.f4538c
            r3.mo4757b(r8, r7, r9)
            goto L_0x0281
        L_0x020b:
            r9 = r7 & 14
            r10 = 14
            if (r9 != r10) goto L_0x021a
            androidx.recyclerview.widget.RecyclerView$j$c r7 = r6.f4537b
            androidx.recyclerview.widget.RecyclerView$j$c r9 = r6.f4538c
            r3.mo4756a(r8, r7, r9)
            goto L_0x0281
        L_0x021a:
            r9 = r7 & 12
            r10 = 12
            if (r9 != r10) goto L_0x026c
            androidx.recyclerview.widget.RecyclerView$j$c r7 = r6.f4537b
            androidx.recyclerview.widget.RecyclerView$j$c r9 = r6.f4538c
            r3.getClass()
            r8.setIsRecyclable(r1)
            androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
            boolean r11 = r10.f4229E
            if (r11 == 0) goto L_0x023e
            androidx.recyclerview.widget.RecyclerView$j r10 = r10.f4247N
            boolean r7 = r10.mo4772a(r8, r8, r7, r9)
            if (r7 == 0) goto L_0x0281
            androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
            r7.mo4563U()
            goto L_0x0281
        L_0x023e:
            androidx.recyclerview.widget.RecyclerView$j r10 = r10.f4247N
            androidx.recyclerview.widget.g0 r10 = (androidx.recyclerview.widget.C1185g0) r10
            r10.getClass()
            int r11 = r7.f4312a
            int r12 = r9.f4312a
            if (r11 != r12) goto L_0x0257
            int r13 = r7.f4313b
            int r14 = r9.f4313b
            if (r13 == r14) goto L_0x0252
            goto L_0x0257
        L_0x0252:
            r10.mo4774d(r8)
            r7 = 0
            goto L_0x0264
        L_0x0257:
            int r13 = r7.f4313b
            int r14 = r9.f4313b
            r7 = r10
            r9 = r11
            r10 = r13
            r11 = r12
            r12 = r14
            boolean r7 = r7.mo5060l(r8, r9, r10, r11, r12)
        L_0x0264:
            if (r7 == 0) goto L_0x0281
            androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
            r7.mo4563U()
            goto L_0x0281
        L_0x026c:
            r9 = r7 & 4
            if (r9 == 0) goto L_0x0276
            androidx.recyclerview.widget.RecyclerView$j$c r7 = r6.f4537b
            r3.mo4757b(r8, r7, r4)
            goto L_0x0281
        L_0x0276:
            r7 = r7 & 8
            if (r7 == 0) goto L_0x0281
            androidx.recyclerview.widget.RecyclerView$j$c r7 = r6.f4537b
            androidx.recyclerview.widget.RecyclerView$j$c r9 = r6.f4538c
            r3.mo4756a(r8, r7, r9)
        L_0x0281:
            r6.f4536a = r1
            r6.f4537b = r4
            r6.f4538c = r4
            r1.e r7 = androidx.recyclerview.widget.C1203k0.C1204a.f4535d
            r7.mo22236a(r6)
            goto L_0x01c6
        L_0x028e:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f4271n
            androidx.recyclerview.widget.RecyclerView$s r3 = r15.f4258c
            r0.removeAndRecycleScrapInt(r3)
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f4288v0
            int r3 = r0.f4353e
            r0.f4350b = r3
            r15.f4229E = r1
            r15.f4231F = r1
            r0.f4358j = r1
            r0.f4359k = r1
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f4271n
            r0.mRequestedSimpleAnimations = r1
            androidx.recyclerview.widget.RecyclerView$s r0 = r15.f4258c
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r0.f4328b
            if (r0 == 0) goto L_0x02b0
            r0.clear()
        L_0x02b0:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f4271n
            boolean r3 = r0.mPrefetchMaxObservedInInitialPrefetch
            if (r3 == 0) goto L_0x02bf
            r0.mPrefetchMaxCountObserved = r1
            r0.mPrefetchMaxObservedInInitialPrefetch = r1
            androidx.recyclerview.widget.RecyclerView$s r0 = r15.f4258c
            r0.mo4927l()
        L_0x02bf:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f4271n
            androidx.recyclerview.widget.RecyclerView$x r3 = r15.f4288v0
            r0.onLayoutCompleted(r3)
            r15.mo4561S(r2)
            r15.mo4623j0(r1)
            androidx.recyclerview.widget.k0 r0 = r15.f4262g
            s0.h<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.k0$a> r3 = r0.f4533a
            r3.clear()
            s0.e<androidx.recyclerview.widget.RecyclerView$a0> r0 = r0.f4534b
            r0.mo22326f()
            int[] r0 = r15.f4230E0
            r3 = r0[r1]
            r5 = r0[r2]
            r15.mo4550D(r0)
            int[] r0 = r15.f4230E0
            r6 = r0[r1]
            if (r6 != r3) goto L_0x02ed
            r0 = r0[r2]
            if (r0 == r5) goto L_0x02ec
            goto L_0x02ed
        L_0x02ec:
            r2 = 0
        L_0x02ed:
            if (r2 == 0) goto L_0x02f2
            r15.mo4679u(r1, r1)
        L_0x02f2:
            boolean r0 = r15.f4280r0
            r2 = -1
            if (r0 == 0) goto L_0x03fd
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r15.f4269m
            if (r0 == 0) goto L_0x03fd
            boolean r0 = r15.hasFocus()
            if (r0 == 0) goto L_0x03fd
            int r0 = r15.getDescendantFocusability()
            r5 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r5) goto L_0x03fd
            int r0 = r15.getDescendantFocusability()
            r5 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r5) goto L_0x031a
            boolean r0 = r15.isFocused()
            if (r0 == 0) goto L_0x031a
            goto L_0x03fd
        L_0x031a:
            boolean r0 = r15.isFocused()
            if (r0 != 0) goto L_0x032e
            android.view.View r0 = r15.getFocusedChild()
            androidx.recyclerview.widget.e r5 = r15.f4261f
            boolean r0 = r5.mo5037k(r0)
            if (r0 != 0) goto L_0x032e
            goto L_0x03fd
        L_0x032e:
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f4288v0
            long r5 = r0.f4361m
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0382
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r15.f4269m
            boolean r0 = r0.hasStableIds()
            if (r0 == 0) goto L_0x0382
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f4288v0
            long r5 = r0.f4361m
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = r15.f4269m
            if (r0 == 0) goto L_0x037f
            boolean r0 = r0.hasStableIds()
            if (r0 != 0) goto L_0x034d
            goto L_0x037f
        L_0x034d:
            androidx.recyclerview.widget.e r0 = r15.f4261f
            int r0 = r0.mo5034h()
            r7 = 0
            r8 = r4
        L_0x0355:
            if (r7 >= r0) goto L_0x0380
            androidx.recyclerview.widget.e r9 = r15.f4261f
            android.view.View r9 = r9.mo5033g(r7)
            androidx.recyclerview.widget.RecyclerView$a0 r9 = m3001K(r9)
            if (r9 == 0) goto L_0x037c
            boolean r10 = r9.isRemoved()
            if (r10 != 0) goto L_0x037c
            long r10 = r9.getItemId()
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 != 0) goto L_0x037c
            androidx.recyclerview.widget.e r8 = r15.f4261f
            android.view.View r10 = r9.itemView
            boolean r8 = r8.mo5037k(r10)
            if (r8 == 0) goto L_0x0383
            r8 = r9
        L_0x037c:
            int r7 = r7 + 1
            goto L_0x0355
        L_0x037f:
            r8 = r4
        L_0x0380:
            r9 = r8
            goto L_0x0383
        L_0x0382:
            r9 = r4
        L_0x0383:
            if (r9 == 0) goto L_0x039b
            androidx.recyclerview.widget.e r0 = r15.f4261f
            android.view.View r5 = r9.itemView
            boolean r0 = r0.mo5037k(r5)
            if (r0 != 0) goto L_0x039b
            android.view.View r0 = r9.itemView
            boolean r0 = r0.hasFocusable()
            if (r0 != 0) goto L_0x0398
            goto L_0x039b
        L_0x0398:
            android.view.View r4 = r9.itemView
            goto L_0x03e2
        L_0x039b:
            androidx.recyclerview.widget.e r0 = r15.f4261f
            int r0 = r0.mo5031e()
            if (r0 <= 0) goto L_0x03e2
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f4288v0
            int r5 = r0.f4360l
            r6 = -1
            if (r5 == r6) goto L_0x03ab
            r1 = r5
        L_0x03ab:
            int r0 = r0.mo4935b()
            r5 = r1
        L_0x03b0:
            if (r5 >= r0) goto L_0x03c8
            androidx.recyclerview.widget.RecyclerView$a0 r6 = r15.mo4551F(r5)
            if (r6 != 0) goto L_0x03b9
            goto L_0x03c8
        L_0x03b9:
            android.view.View r7 = r6.itemView
            boolean r7 = r7.hasFocusable()
            if (r7 == 0) goto L_0x03c5
            android.view.View r0 = r6.itemView
        L_0x03c3:
            r4 = r0
            goto L_0x03e2
        L_0x03c5:
            int r5 = r5 + 1
            goto L_0x03b0
        L_0x03c8:
            int r0 = java.lang.Math.min(r0, r1)
        L_0x03cc:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x03e2
            androidx.recyclerview.widget.RecyclerView$a0 r1 = r15.mo4551F(r0)
            if (r1 != 0) goto L_0x03d7
            goto L_0x03e2
        L_0x03d7:
            android.view.View r5 = r1.itemView
            boolean r5 = r5.hasFocusable()
            if (r5 == 0) goto L_0x03cc
            android.view.View r0 = r1.itemView
            goto L_0x03c3
        L_0x03e2:
            if (r4 == 0) goto L_0x03fd
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f4288v0
            int r0 = r0.f4362n
            long r5 = (long) r0
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x03fa
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L_0x03fa
            boolean r1 = r0.isFocusable()
            if (r1 == 0) goto L_0x03fa
            r4 = r0
        L_0x03fa:
            r4.requestFocus()
        L_0x03fd:
            androidx.recyclerview.widget.RecyclerView$x r0 = r15.f4288v0
            r0.f4361m = r2
            r1 = -1
            r0.f4360l = r1
            r0.f4362n = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.mo4643p():void");
    }

    /* renamed from: q */
    public final void mo4644q() {
        View view;
        C1119a0 a0Var;
        boolean z;
        boolean z2;
        int i;
        View B;
        this.f4288v0.mo4934a(1);
        mo4547A(this.f4288v0);
        this.f4288v0.f4357i = false;
        mo4619i0();
        C1203k0 k0Var = this.f4262g;
        k0Var.f4533a.clear();
        k0Var.f4534b.mo22326f();
        mo4560R();
        mo4564V();
        if (!this.f4280r0 || !hasFocus() || this.f4269m == null) {
            view = null;
        } else {
            view = getFocusedChild();
        }
        if (view == null || (B = mo4548B(view)) == null) {
            a0Var = null;
        } else {
            a0Var = mo4554J(B);
        }
        long j = -1;
        if (a0Var == null) {
            C1152x xVar = this.f4288v0;
            xVar.f4361m = -1;
            xVar.f4360l = -1;
            xVar.f4362n = -1;
        } else {
            C1152x xVar2 = this.f4288v0;
            if (this.f4269m.hasStableIds()) {
                j = a0Var.getItemId();
            }
            xVar2.f4361m = j;
            C1152x xVar3 = this.f4288v0;
            if (this.f4229E) {
                i = -1;
            } else if (a0Var.isRemoved()) {
                i = a0Var.mOldPosition;
            } else {
                i = a0Var.getAbsoluteAdapterPosition();
            }
            xVar3.f4360l = i;
            C1152x xVar4 = this.f4288v0;
            View view2 = a0Var.itemView;
            int id = view2.getId();
            while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                view2 = ((ViewGroup) view2).getFocusedChild();
                if (view2.getId() != -1) {
                    id = view2.getId();
                }
            }
            xVar4.f4362n = id;
        }
        C1152x xVar5 = this.f4288v0;
        if (!xVar5.f4358j || !this.f4296z0) {
            z = false;
        } else {
            z = true;
        }
        xVar5.f4356h = z;
        this.f4296z0 = false;
        this.f4294y0 = false;
        xVar5.f4355g = xVar5.f4359k;
        xVar5.f4353e = this.f4269m.getItemCount();
        mo4550D(this.f4230E0);
        if (this.f4288v0.f4358j) {
            int e = this.f4261f.mo5031e();
            for (int i2 = 0; i2 < e; i2++) {
                C1119a0 K = m3001K(this.f4261f.mo5030d(i2));
                if (!K.shouldIgnore() && (!K.isInvalid() || this.f4269m.hasStableIds())) {
                    C1128j jVar = this.f4247N;
                    C1128j.m3082b(K);
                    K.getUnmodifiedPayloads();
                    jVar.getClass();
                    C1128j.C1131c cVar = new C1128j.C1131c();
                    cVar.mo4781a(K);
                    this.f4262g.mo5088b(K, cVar);
                    if (this.f4288v0.f4356h && K.isUpdated() && !K.isRemoved() && !K.shouldIgnore() && !K.isInvalid()) {
                        this.f4262g.f4534b.mo22331k(mo4553H(K), K);
                    }
                }
            }
        }
        if (this.f4288v0.f4359k) {
            int h = this.f4261f.mo5034h();
            for (int i3 = 0; i3 < h; i3++) {
                C1119a0 K2 = m3001K(this.f4261f.mo5033g(i3));
                if (!K2.shouldIgnore()) {
                    K2.saveOldPosition();
                }
            }
            C1152x xVar6 = this.f4288v0;
            boolean z3 = xVar6.f4354f;
            xVar6.f4354f = false;
            this.f4271n.onLayoutChildren(this.f4258c, xVar6);
            this.f4288v0.f4354f = z3;
            for (int i4 = 0; i4 < this.f4261f.mo5031e(); i4++) {
                C1119a0 K3 = m3001K(this.f4261f.mo5030d(i4));
                if (!K3.shouldIgnore()) {
                    C1203k0.C1204a orDefault = this.f4262g.f4533a.getOrDefault(K3, null);
                    if (orDefault == null || (orDefault.f4536a & 4) == 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (!z2) {
                        C1128j.m3082b(K3);
                        boolean hasAnyOfTheFlags = K3.hasAnyOfTheFlags(8192);
                        C1128j jVar2 = this.f4247N;
                        K3.getUnmodifiedPayloads();
                        jVar2.getClass();
                        C1128j.C1131c cVar2 = new C1128j.C1131c();
                        cVar2.mo4781a(K3);
                        if (hasAnyOfTheFlags) {
                            mo4566X(K3, cVar2);
                        } else {
                            C1203k0 k0Var2 = this.f4262g;
                            C1203k0.C1204a orDefault2 = k0Var2.f4533a.getOrDefault(K3, null);
                            if (orDefault2 == null) {
                                orDefault2 = C1203k0.C1204a.m3290a();
                                k0Var2.f4533a.put(K3, orDefault2);
                            }
                            orDefault2.f4536a |= 2;
                            orDefault2.f4537b = cVar2;
                        }
                    }
                }
            }
            mo4624k();
        } else {
            mo4624k();
        }
        mo4561S(true);
        mo4623j0(false);
        this.f4288v0.f4352d = 2;
    }

    /* renamed from: r */
    public final void mo4645r() {
        boolean z;
        mo4619i0();
        mo4560R();
        this.f4288v0.mo4934a(6);
        this.f4260e.mo4995c();
        this.f4288v0.f4353e = this.f4269m.getItemCount();
        this.f4288v0.f4351c = 0;
        if (this.f4259d != null && this.f4269m.canRestoreState()) {
            Parcelable parcelable = this.f4259d.f4301b;
            if (parcelable != null) {
                this.f4271n.onRestoreInstanceState(parcelable);
            }
            this.f4259d = null;
        }
        C1152x xVar = this.f4288v0;
        xVar.f4355g = false;
        this.f4271n.onLayoutChildren(this.f4258c, xVar);
        C1152x xVar2 = this.f4288v0;
        xVar2.f4354f = false;
        if (!xVar2.f4358j || this.f4247N == null) {
            z = false;
        } else {
            z = true;
        }
        xVar2.f4358j = z;
        xVar2.f4352d = 4;
        mo4561S(true);
        mo4623j0(false);
    }

    public final void removeDetachedView(View view, boolean z) {
        C1119a0 K = m3001K(view);
        if (K != null) {
            if (K.isTmpDetached()) {
                K.clearTmpDetachFlag();
            } else if (!K.shouldIgnore()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(K);
                throw new IllegalArgumentException(C13437d.m33704i(this, sb));
            }
        }
        view.clearAnimation();
        mo4630o(view);
        super.removeDetachedView(view, z);
    }

    public final void requestChildFocus(View view, View view2) {
        if (!this.f4271n.onRequestChildFocus(this, this.f4288v0, view, view2) && view2 != null) {
            mo4569a0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.f4271n.requestChildRectangleOnScreen(this, view, rect, z);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.f4279r.size();
        for (int i = 0; i < size; i++) {
            this.f4279r.get(i).mo4911d(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void requestLayout() {
        if (this.f4289w != 0 || this.f4293y) {
            this.f4291x = true;
        } else {
            super.requestLayout();
        }
    }

    /* renamed from: s */
    public final boolean mo4651s(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo22485c(i, i2, i3, iArr, iArr2);
    }

    public final void scrollBy(int i, int i2) {
        C1134m mVar = this.f4271n;
        if (mVar != null && !this.f4293y) {
            boolean canScrollHorizontally = mVar.canScrollHorizontally();
            boolean canScrollVertically = this.f4271n.canScrollVertically();
            if (canScrollHorizontally || canScrollVertically) {
                if (!canScrollHorizontally) {
                    i = 0;
                }
                if (!canScrollVertically) {
                    i2 = 0;
                }
                mo4571c0(i, i2, (MotionEvent) null, 0);
            }
        }
    }

    public final void scrollTo(int i, int i2) {
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i;
        int i2 = 0;
        if (mo4556N()) {
            if (accessibilityEvent != null) {
                i = C6526b.m15445a(accessibilityEvent);
            } else {
                i = 0;
            }
            if (i != 0) {
                i2 = i;
            }
            this.f4221A |= i2;
            i2 = 1;
        }
        if (i2 == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C1174e0 e0Var) {
        this.f4226C0 = e0Var;
        C6333d0.m15029q(this, e0Var);
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        mo4591f0(adapter, false);
        mo4565W(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C1126h hVar) {
        boolean z;
        if (hVar != this.f4228D0) {
            this.f4228D0 = hVar;
            if (hVar != null) {
                z = true;
            } else {
                z = false;
            }
            setChildrenDrawingOrderEnabled(z);
        }
    }

    public void setClipToPadding(boolean z) {
        if (z != this.f4263h) {
            this.f4245M = null;
            this.f4241K = null;
            this.f4243L = null;
            this.f4239J = null;
        }
        this.f4263h = z;
        super.setClipToPadding(z);
        if (this.f4287v) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C1127i iVar) {
        iVar.getClass();
        this.f4237I = iVar;
        this.f4245M = null;
        this.f4241K = null;
        this.f4243L = null;
        this.f4239J = null;
    }

    public void setHasFixedSize(boolean z) {
        this.f4285u = z;
    }

    public void setItemAnimator(C1128j jVar) {
        C1128j jVar2 = this.f4247N;
        if (jVar2 != null) {
            jVar2.mo4777g();
            this.f4247N.f4306a = null;
        }
        this.f4247N = jVar;
        if (jVar != null) {
            jVar.f4306a = this.f4222A0;
        }
    }

    public void setItemViewCacheSize(int i) {
        C1145s sVar = this.f4258c;
        sVar.f4331e = i;
        sVar.mo4927l();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(C1134m mVar) {
        if (mVar != this.f4271n) {
            setScrollState(0);
            C1154z zVar = this.f4282s0;
            RecyclerView.this.removeCallbacks(zVar);
            zVar.f4365d.abortAnimation();
            C1134m mVar2 = this.f4271n;
            if (mVar2 != null) {
                mVar2.stopSmoothScroller();
            }
            if (this.f4271n != null) {
                C1128j jVar = this.f4247N;
                if (jVar != null) {
                    jVar.mo4777g();
                }
                this.f4271n.removeAndRecycleAllViews(this.f4258c);
                this.f4271n.removeAndRecycleScrapInt(this.f4258c);
                C1145s sVar = this.f4258c;
                sVar.f4327a.clear();
                sVar.mo4920e();
                if (this.f4283t) {
                    this.f4271n.dispatchDetachedFromWindow(this, this.f4258c);
                }
                this.f4271n.setRecyclerView((RecyclerView) null);
                this.f4271n = null;
            } else {
                C1145s sVar2 = this.f4258c;
                sVar2.f4327a.clear();
                sVar2.mo4920e();
            }
            C1171e eVar = this.f4261f;
            eVar.f4450b.mo5047g();
            int size = eVar.f4451c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C1168c0 c0Var = (C1168c0) eVar.f4449a;
                c0Var.getClass();
                C1119a0 K = m3001K((View) eVar.f4451c.get(size));
                if (K != null) {
                    K.onLeftHiddenState(c0Var.f4442a);
                }
                eVar.f4451c.remove(size);
            }
            C1168c0 c0Var2 = (C1168c0) eVar.f4449a;
            int a = c0Var2.mo5019a();
            for (int i = 0; i < a; i++) {
                View childAt = c0Var2.f4442a.getChildAt(i);
                c0Var2.f4442a.mo4630o(childAt);
                childAt.clearAnimation();
            }
            c0Var2.f4442a.removeAllViews();
            this.f4271n = mVar;
            if (mVar != null) {
                if (mVar.mRecyclerView == null) {
                    mVar.setRecyclerView(this);
                    if (this.f4283t) {
                        this.f4271n.dispatchAttachedToWindow(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(mVar);
                    sb.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(C13437d.m33704i(mVar.mRecyclerView, sb));
                }
            }
            this.f4258c.mo4927l();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        C6381p scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f20038d) {
            View view = scrollingChildHelper.f20037c;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6342i.m15109z(view);
        }
        scrollingChildHelper.f20038d = z;
    }

    public void setOnFlingListener(C1140o oVar) {
        this.f4270m0 = oVar;
    }

    @Deprecated
    public void setOnScrollListener(C1142q qVar) {
        this.f4290w0 = qVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.f4280r0 = z;
    }

    public void setRecycledViewPool(C1143r rVar) {
        C1145s sVar = this.f4258c;
        C1143r rVar2 = sVar.f4333g;
        if (rVar2 != null) {
            rVar2.f4322b--;
        }
        sVar.f4333g = rVar;
        if (rVar != null && RecyclerView.this.getAdapter() != null) {
            sVar.f4333g.f4322b++;
        }
    }

    @Deprecated
    public void setRecyclerListener(C1146t tVar) {
        this.f4273o = tVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.f4249O) {
            this.f4249O = i;
            if (i != 2) {
                C1154z zVar = this.f4282s0;
                RecyclerView.this.removeCallbacks(zVar);
                zVar.f4365d.abortAnimation();
                C1134m mVar = this.f4271n;
                if (mVar != null) {
                    mVar.stopSmoothScroller();
                }
            }
            C1134m mVar2 = this.f4271n;
            if (mVar2 != null) {
                mVar2.onScrollStateChanged(i);
            }
            C1142q qVar = this.f4290w0;
            if (qVar != null) {
                qVar.mo4913a(i, this);
            }
            ArrayList arrayList = this.f4292x0;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((C1142q) this.f4292x0.get(size)).mo4913a(i, this);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i == 0 || i != 1) {
            this.f4268l0 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f4268l0 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(C1153y yVar) {
        this.f4258c.getClass();
    }

    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo22489g(i, 0);
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().mo22490h(0);
    }

    public final void suppressLayout(boolean z) {
        if (z != this.f4293y) {
            mo4618i("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.f4293y = false;
                if (!(!this.f4291x || this.f4271n == null || this.f4269m == null)) {
                    requestLayout();
                }
                this.f4291x = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0));
            this.f4293y = true;
            this.f4295z = true;
            setScrollState(0);
            C1154z zVar = this.f4282s0;
            RecyclerView.this.removeCallbacks(zVar);
            zVar.f4365d.abortAnimation();
            C1134m mVar = this.f4271n;
            if (mVar != null) {
                mVar.stopSmoothScroller();
            }
        }
    }

    /* renamed from: t */
    public final void mo4678t(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo22487e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: u */
    public final void mo4679u(int i, int i2) {
        this.f4235H++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        C1142q qVar = this.f4290w0;
        if (qVar != null) {
            qVar.mo4914b(this, i, i2);
        }
        ArrayList arrayList = this.f4292x0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((C1142q) this.f4292x0.get(size)).mo4914b(this, i, i2);
            }
        }
        this.f4235H--;
    }

    /* renamed from: v */
    public final void mo4680v() {
        if (this.f4245M == null) {
            this.f4237I.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f4245M = edgeEffect;
            if (this.f4263h) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: w */
    public final void mo4681w() {
        if (this.f4239J == null) {
            this.f4237I.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f4239J = edgeEffect;
            if (this.f4263h) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: x */
    public final void mo4682x() {
        if (this.f4243L == null) {
            this.f4237I.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f4243L = edgeEffect;
            if (this.f4263h) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* renamed from: y */
    public final void mo4683y() {
        if (this.f4241K == null) {
            this.f4237I.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.f4241K = edgeEffect;
            if (this.f4263h) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    /* renamed from: z */
    public final String mo4684z() {
        StringBuilder k = C13555b.m33972k(" ");
        k.append(super.toString());
        k.append(", adapter:");
        k.append(this.f4269m);
        k.append(", layout:");
        k.append(this.f4271n);
        k.append(", context:");
        k.append(getContext());
        return k.toString();
    }

    public static abstract class Adapter<VH extends C1119a0> {
        private boolean mHasStableIds = false;
        private final C1124f mObservable = new C1124f();
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(VH vh, int i) {
            boolean z;
            if (vh.mBindingAdapter == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                int i2 = C5813l.f18762a;
                C5813l.C5814a.m14246a("RV OnBindView");
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).f4299d = true;
                }
                int i3 = C5813l.f18762a;
                C5813l.C5814a.m14247b();
            }
        }

        public boolean canRestoreState() {
            int i = C1123e.f4305a[this.mStateRestorationPolicy.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2 && getItemCount() <= 0) {
                return false;
            }
            return true;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                int i2 = C5813l.f18762a;
                C5813l.C5814a.m14246a("RV CreateView");
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    C5813l.C5814a.m14247b();
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } catch (Throwable th) {
                int i3 = C5813l.f18762a;
                C5813l.C5814a.m14247b();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(Adapter<? extends C1119a0> adapter, C1119a0 a0Var, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.mo4758a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.mo4759b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.mo4761d(i, 1, (Object) null);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.mo4762e(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.mo4760c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.mo4761d(i, i2, (Object) null);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.mo4762e(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.mo4763f(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.mo4763f(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(C1125g gVar) {
            this.mObservable.registerObserver(gVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.mo4764g();
        }

        public void unregisterAdapterDataObserver(C1125g gVar) {
            this.mObservable.unregisterObserver(gVar);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.mo4761d(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.mo4761d(i, i2, obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float f;
        float f2;
        TypedArray typedArray;
        char c;
        ClassLoader classLoader;
        Object[] objArr;
        Constructor<? extends U> constructor;
        NoSuchMethodException noSuchMethodException;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.f4257b = new C1147u();
        this.f4258c = new C1145s();
        this.f4262g = new C1203k0();
        this.f4264i = new C1118a();
        this.f4265j = new Rect();
        this.f4266k = new Rect();
        this.f4267l = new RectF();
        this.f4275p = new ArrayList();
        this.f4277q = new ArrayList<>();
        this.f4279r = new ArrayList<>();
        this.f4289w = 0;
        this.f4229E = false;
        this.f4231F = false;
        this.f4233G = 0;
        this.f4235H = 0;
        this.f4237I = new C1127i();
        this.f4247N = new C1179g();
        this.f4249O = 0;
        this.f4251P = -1;
        this.f4276p0 = Float.MIN_VALUE;
        this.f4278q0 = Float.MIN_VALUE;
        this.f4280r0 = true;
        this.f4282s0 = new C1154z();
        this.f4286u0 = f4218S0 ? new C1223o.C1225b() : null;
        this.f4288v0 = new C1152x();
        this.f4294y0 = false;
        this.f4296z0 = false;
        this.f4222A0 = new C1132k();
        this.f4224B0 = false;
        this.f4230E0 = new int[2];
        this.f4234G0 = new int[2];
        this.f4236H0 = new int[2];
        this.f4238I0 = new int[2];
        this.f4240J0 = new ArrayList();
        this.f4242K0 = new C1120b();
        this.f4246M0 = 0;
        this.f4248N0 = 0;
        this.f4250O0 = new C1122d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4268l0 = viewConfiguration.getScaledTouchSlop();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            Method method = C6365i0.f20017a;
            f = C6365i0.C6366a.m15175a(viewConfiguration);
        } else {
            f = C6365i0.m15174a(viewConfiguration, context2);
        }
        this.f4276p0 = f;
        if (i3 >= 26) {
            f2 = C6365i0.C6366a.m15176b(viewConfiguration);
        } else {
            f2 = C6365i0.m15174a(viewConfiguration, context2);
        }
        this.f4278q0 = f2;
        this.f4272n0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4274o0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f4247N.f4306a = this.f4222A0;
        this.f4260e = new C1160a(new C1170d0(this));
        this.f4261f = new C1171e(new C1168c0(this));
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if ((i3 >= 26 ? C6333d0.C6346l.m15121b(this) : 0) == 0 && i3 >= 26) {
            C6333d0.C6346l.m15131l(this, 8);
        }
        if (C6333d0.C6337d.m15043c(this) == 0) {
            C6333d0.C6337d.m15059s(this, 1);
        }
        this.f4225C = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C1174e0(this));
        int[] iArr = C6035d.RecyclerView;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i2, 0);
        C6333d0.m15028p(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        String string = obtainStyledAttributes.getString(C6035d.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(C6035d.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(SQLiteDatabase.OPEN_PRIVATECACHE);
        }
        this.f4263h = obtainStyledAttributes.getBoolean(C6035d.RecyclerView_android_clipToPadding, true);
        if (obtainStyledAttributes.getBoolean(C6035d.RecyclerView_fastScrollEnabled, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(C6035d.RecyclerView_fastScrollVerticalThumbDrawable);
            Drawable drawable = obtainStyledAttributes.getDrawable(C6035d.RecyclerView_fastScrollVerticalTrackDrawable);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(C6035d.RecyclerView_fastScrollHorizontalThumbDrawable);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(C6035d.RecyclerView_fastScrollHorizontalTrackDrawable);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(C13437d.m33704i(this, C13555b.m33972k("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c = 2;
            typedArray = obtainStyledAttributes;
            new C1218n(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C6033b.fastscroll_default_thickness), resources.getDimensionPixelSize(C6033b.fastscroll_minimum_range), resources.getDimensionPixelOffset(C6033b.fastscroll_margin));
        } else {
            typedArray = obtainStyledAttributes;
            c = 2;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(str, false, classLoader).asSubclass(C1134m.class);
                    try {
                        constructor = asSubclass.getConstructor(f4219T0);
                        objArr = new Object[4];
                        objArr[0] = context2;
                        objArr[1] = attributeSet2;
                        objArr[c] = Integer.valueOf(i);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e) {
                        noSuchMethodException = e;
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C1134m) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(noSuchMethodException);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e7);
                }
            }
        }
        int[] iArr2 = f4215P0;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i2, 0);
        C6333d0.m15028p(this, context, iArr2, attributeSet, obtainStyledAttributes2, i, 0);
        boolean z = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1117a();

        /* renamed from: b */
        public Parcelable f4301b;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        public class C1117a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4301b = parcel.readParcelable(classLoader == null ? C1134m.class.getClassLoader() : classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f4301b, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: b */
        public C1119a0 f4297b;

        /* renamed from: c */
        public final Rect f4298c = new Rect();

        /* renamed from: d */
        public boolean f4299d = true;

        /* renamed from: e */
        public boolean f4300e = false;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: b */
        public final int mo4704b() {
            return this.f4297b.getLayoutPosition();
        }

        /* renamed from: c */
        public final boolean mo4705c() {
            return this.f4297b.isUpdated();
        }

        /* renamed from: d */
        public final boolean mo4706d() {
            return this.f4297b.isRemoved();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1134m mVar = this.f4271n;
        if (mVar != null) {
            return mVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(C13437d.m33704i(this, C13555b.m33972k("RecyclerView has no LayoutManager")));
    }
}
