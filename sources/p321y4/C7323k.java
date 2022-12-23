package p321y4;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.Path;
import com.airbnb.lottie.model.content.MergePaths;
import java.util.ArrayList;
import java.util.List;
import p332z4.C7477p;

@TargetApi(19)
/* renamed from: y4.k */
public final class C7323k implements C7325l, C7321i {

    /* renamed from: a */
    public final Path f22498a = new Path();

    /* renamed from: b */
    public final Path f22499b = new Path();

    /* renamed from: c */
    public final Path f22500c = new Path();

    /* renamed from: d */
    public final ArrayList f22501d = new ArrayList();

    /* renamed from: e */
    public final MergePaths f22502e;

    /* renamed from: y4.k$a */
    public static /* synthetic */ class C7324a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22503a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode[] r0 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22503a = r0
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.MERGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22503a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.ADD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22503a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22503a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f22503a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.airbnb.lottie.model.content.MergePaths$MergePathsMode r1 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p321y4.C7323k.C7324a.<clinit>():void");
        }
    }

    public C7323k(MergePaths mergePaths) {
        mergePaths.getClass();
        this.f22502e = mergePaths;
    }

    @TargetApi(19)
    /* renamed from: a */
    public final void mo23557a(Path.Op op) {
        Matrix matrix;
        Matrix matrix2;
        this.f22499b.reset();
        this.f22498a.reset();
        for (int size = this.f22501d.size() - 1; size >= 1; size--) {
            C7325l lVar = (C7325l) this.f22501d.get(size);
            if (lVar instanceof C7315c) {
                C7315c cVar = (C7315c) lVar;
                ArrayList arrayList = (ArrayList) cVar.mo23550e();
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    Path q = ((C7325l) arrayList.get(size2)).mo23551q();
                    C7477p pVar = cVar.f22444k;
                    if (pVar != null) {
                        matrix2 = pVar.mo23742d();
                    } else {
                        cVar.f22436c.reset();
                        matrix2 = cVar.f22436c;
                    }
                    q.transform(matrix2);
                    this.f22499b.addPath(q);
                }
            } else {
                this.f22499b.addPath(lVar.mo23551q());
            }
        }
        int i = 0;
        C7325l lVar2 = (C7325l) this.f22501d.get(0);
        if (lVar2 instanceof C7315c) {
            C7315c cVar2 = (C7315c) lVar2;
            List<C7325l> e = cVar2.mo23550e();
            while (true) {
                ArrayList arrayList2 = (ArrayList) e;
                if (i >= arrayList2.size()) {
                    break;
                }
                Path q2 = ((C7325l) arrayList2.get(i)).mo23551q();
                C7477p pVar2 = cVar2.f22444k;
                if (pVar2 != null) {
                    matrix = pVar2.mo23742d();
                } else {
                    cVar2.f22436c.reset();
                    matrix = cVar2.f22436c;
                }
                q2.transform(matrix);
                this.f22498a.addPath(q2);
                i++;
            }
        } else {
            this.f22498a.set(lVar2.mo23551q());
        }
        this.f22500c.op(this.f22498a, this.f22499b, op);
    }

    /* renamed from: b */
    public final void mo6804b(List<C7314b> list, List<C7314b> list2) {
        for (int i = 0; i < this.f22501d.size(); i++) {
            ((C7325l) this.f22501d.get(i)).mo6804b(list, list2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23556e(java.util.ListIterator<p321y4.C7314b> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            y4.b r0 = (p321y4.C7314b) r0
            boolean r1 = r0 instanceof p321y4.C7325l
            if (r1 == 0) goto L_0x000d
            java.util.ArrayList r1 = r2.f22501d
            y4.l r0 = (p321y4.C7325l) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p321y4.C7323k.mo23556e(java.util.ListIterator):void");
    }

    /* renamed from: q */
    public final Path mo23551q() {
        this.f22500c.reset();
        MergePaths mergePaths = this.f22502e;
        if (mergePaths.f6544b) {
            return this.f22500c;
        }
        int i = C7324a.f22503a[mergePaths.f6543a.ordinal()];
        if (i == 1) {
            for (int i2 = 0; i2 < this.f22501d.size(); i2++) {
                this.f22500c.addPath(((C7325l) this.f22501d.get(i2)).mo23551q());
            }
        } else if (i == 2) {
            mo23557a(Path.Op.UNION);
        } else if (i == 3) {
            mo23557a(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            mo23557a(Path.Op.INTERSECT);
        } else if (i == 5) {
            mo23557a(Path.Op.XOR);
        }
        return this.f22500c;
    }
}
