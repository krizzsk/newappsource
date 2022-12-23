package p242s1;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p055d1.C4329e;
import p255t1.C6531g;
import p255t1.C6535h;
import p255t1.C6541k;

/* renamed from: s1.a */
public class C6315a {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* renamed from: s1.a$a */
    public static final class C6316a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final C6315a f19974a;

        public C6316a(C6315a aVar) {
            this.f19974a = aVar;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f19974a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C6535h accessibilityNodeProvider = this.f19974a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.f20354a;
            }
            return null;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f19974a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        /* JADX WARNING: type inference failed for: r1v18, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onInitializeAccessibilityNodeInfo(android.view.View r18, android.view.accessibility.AccessibilityNodeInfo r19) {
            /*
                r17 = this;
                r0 = r18
                r1 = r19
                java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
                t1.g r3 = new t1.g
                r3.<init>(r1)
                java.util.WeakHashMap<android.view.View, s1.p0> r4 = p242s1.C6333d0.f19990a
                int r4 = p055d1.C4329e.tag_screen_reader_focusable
                int r5 = android.os.Build.VERSION.SDK_INT
                r6 = 28
                r7 = 1
                r8 = 0
                if (r5 < r6) goto L_0x0019
                r5 = 1
                goto L_0x001a
            L_0x0019:
                r5 = 0
            L_0x001a:
                r9 = 0
                if (r5 == 0) goto L_0x0026
                boolean r4 = p242s1.C6333d0.C6347m.m15138d(r18)
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                goto L_0x0032
            L_0x0026:
                java.lang.Object r4 = r0.getTag(r4)
                boolean r5 = r2.isInstance(r4)
                if (r5 == 0) goto L_0x0031
                goto L_0x0032
            L_0x0031:
                r4 = r9
            L_0x0032:
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                if (r4 == 0) goto L_0x003e
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L_0x003e
                r4 = 1
                goto L_0x003f
            L_0x003e:
                r4 = 0
            L_0x003f:
                int r5 = android.os.Build.VERSION.SDK_INT
                if (r5 < r6) goto L_0x0047
                r1.setScreenReaderFocusable(r4)
                goto L_0x004a
            L_0x0047:
                r3.mo22641g(r7, r4)
            L_0x004a:
                int r4 = p055d1.C4329e.tag_accessibility_heading
                int r10 = android.os.Build.VERSION.SDK_INT
                if (r10 < r6) goto L_0x0052
                r10 = 1
                goto L_0x0053
            L_0x0052:
                r10 = 0
            L_0x0053:
                if (r10 == 0) goto L_0x005e
                boolean r2 = p242s1.C6333d0.C6347m.m15137c(r18)
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                goto L_0x006b
            L_0x005e:
                java.lang.Object r4 = r0.getTag(r4)
                boolean r2 = r2.isInstance(r4)
                if (r2 == 0) goto L_0x006a
                r2 = r4
                goto L_0x006b
            L_0x006a:
                r2 = r9
            L_0x006b:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                if (r2 == 0) goto L_0x0077
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x0077
                r2 = 1
                goto L_0x0078
            L_0x0077:
                r2 = 0
            L_0x0078:
                if (r5 < r6) goto L_0x007e
                r1.setHeading(r2)
                goto L_0x0082
            L_0x007e:
                r4 = 2
                r3.mo22641g(r4, r2)
            L_0x0082:
                int r2 = p055d1.C4329e.tag_accessibility_pane_title
                java.lang.Class<java.lang.CharSequence> r4 = java.lang.CharSequence.class
                if (r5 < r6) goto L_0x008a
                r10 = 1
                goto L_0x008b
            L_0x008a:
                r10 = 0
            L_0x008b:
                if (r10 == 0) goto L_0x0092
                java.lang.CharSequence r2 = p242s1.C6333d0.C6347m.m15136b(r18)
                goto L_0x009e
            L_0x0092:
                java.lang.Object r2 = r0.getTag(r2)
                boolean r4 = r4.isInstance(r2)
                if (r4 == 0) goto L_0x009d
                goto L_0x009e
            L_0x009d:
                r2 = r9
            L_0x009e:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                if (r5 < r6) goto L_0x00a6
                r1.setPaneTitle(r2)
                goto L_0x00af
            L_0x00a6:
                android.os.Bundle r4 = r19.getExtras()
                java.lang.String r6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY"
                r4.putCharSequence(r6, r2)
            L_0x00af:
                int r2 = p055d1.C4329e.tag_state_description
                java.lang.Class<java.lang.CharSequence> r4 = java.lang.CharSequence.class
                int r6 = android.os.Build.VERSION.SDK_INT
                r10 = 30
                if (r6 < r10) goto L_0x00bb
                r6 = 1
                goto L_0x00bc
            L_0x00bb:
                r6 = 0
            L_0x00bc:
                if (r6 == 0) goto L_0x00c3
                java.lang.CharSequence r2 = p242s1.C6333d0.C6349o.m15148a(r18)
                goto L_0x00cf
            L_0x00c3:
                java.lang.Object r2 = r0.getTag(r2)
                boolean r4 = r4.isInstance(r2)
                if (r4 == 0) goto L_0x00ce
                goto L_0x00cf
            L_0x00ce:
                r2 = r9
            L_0x00cf:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                if (r5 < r10) goto L_0x00d4
                goto L_0x00d5
            L_0x00d4:
                r7 = 0
            L_0x00d5:
                if (r7 == 0) goto L_0x00db
                r1.setStateDescription(r2)
                goto L_0x00e4
            L_0x00db:
                android.os.Bundle r4 = r19.getExtras()
                java.lang.String r6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"
                r4.putCharSequence(r6, r2)
            L_0x00e4:
                r2 = r17
                s1.a r4 = r2.f19974a
                r4.onInitializeAccessibilityNodeInfo(r0, r3)
                java.lang.CharSequence r4 = r19.getText()
                r6 = 26
                if (r5 >= r6) goto L_0x020a
                android.os.Bundle r5 = r19.getExtras()
                java.lang.String r6 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY"
                r5.remove(r6)
                android.os.Bundle r5 = r19.getExtras()
                java.lang.String r7 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY"
                r5.remove(r7)
                android.os.Bundle r5 = r19.getExtras()
                java.lang.String r10 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY"
                r5.remove(r10)
                android.os.Bundle r1 = r19.getExtras()
                java.lang.String r5 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY"
                r1.remove(r5)
                int r1 = p055d1.C4329e.tag_accessibility_clickable_spans
                java.lang.Object r1 = r0.getTag(r1)
                android.util.SparseArray r1 = (android.util.SparseArray) r1
                if (r1 == 0) goto L_0x015a
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>()
                r12 = 0
            L_0x0127:
                int r13 = r1.size()
                if (r12 >= r13) goto L_0x0143
                java.lang.Object r13 = r1.valueAt(r12)
                java.lang.ref.WeakReference r13 = (java.lang.ref.WeakReference) r13
                java.lang.Object r13 = r13.get()
                if (r13 != 0) goto L_0x0140
                java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
                r11.add(r13)
            L_0x0140:
                int r12 = r12 + 1
                goto L_0x0127
            L_0x0143:
                r12 = 0
            L_0x0144:
                int r13 = r11.size()
                if (r12 >= r13) goto L_0x015a
                java.lang.Object r13 = r11.get(r12)
                java.lang.Integer r13 = (java.lang.Integer) r13
                int r13 = r13.intValue()
                r1.remove(r13)
                int r12 = r12 + 1
                goto L_0x0144
            L_0x015a:
                boolean r1 = r4 instanceof android.text.Spanned
                if (r1 == 0) goto L_0x016e
                r1 = r4
                android.text.Spanned r1 = (android.text.Spanned) r1
                int r9 = r4.length()
                java.lang.Class<android.text.style.ClickableSpan> r11 = android.text.style.ClickableSpan.class
                java.lang.Object[] r1 = r1.getSpans(r8, r9, r11)
                r9 = r1
                android.text.style.ClickableSpan[] r9 = (android.text.style.ClickableSpan[]) r9
            L_0x016e:
                if (r9 == 0) goto L_0x020a
                int r1 = r9.length
                if (r1 <= 0) goto L_0x020a
                android.view.accessibility.AccessibilityNodeInfo r1 = r3.f20334a
                android.os.Bundle r1 = r1.getExtras()
                int r11 = p055d1.C4329e.accessibility_action_clickable_span
                java.lang.String r12 = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY"
                r1.putInt(r12, r11)
                int r1 = p055d1.C4329e.tag_accessibility_clickable_spans
                java.lang.Object r11 = r0.getTag(r1)
                android.util.SparseArray r11 = (android.util.SparseArray) r11
                if (r11 != 0) goto L_0x0192
                android.util.SparseArray r11 = new android.util.SparseArray
                r11.<init>()
                r0.setTag(r1, r11)
            L_0x0192:
                r1 = 0
            L_0x0193:
                int r12 = r9.length
                if (r1 >= r12) goto L_0x020a
                r12 = r9[r1]
                r13 = 0
            L_0x0199:
                int r14 = r11.size()
                if (r13 >= r14) goto L_0x01b9
                java.lang.Object r14 = r11.valueAt(r13)
                java.lang.ref.WeakReference r14 = (java.lang.ref.WeakReference) r14
                java.lang.Object r14 = r14.get()
                android.text.style.ClickableSpan r14 = (android.text.style.ClickableSpan) r14
                boolean r14 = r12.equals(r14)
                if (r14 == 0) goto L_0x01b6
                int r12 = r11.keyAt(r13)
                goto L_0x01bf
            L_0x01b6:
                int r13 = r13 + 1
                goto L_0x0199
            L_0x01b9:
                int r12 = p255t1.C6531g.f20333d
                int r13 = r12 + 1
                p255t1.C6531g.f20333d = r13
            L_0x01bf:
                java.lang.ref.WeakReference r13 = new java.lang.ref.WeakReference
                r14 = r9[r1]
                r13.<init>(r14)
                r11.put(r12, r13)
                r13 = r9[r1]
                r14 = r4
                android.text.Spanned r14 = (android.text.Spanned) r14
                java.util.ArrayList r15 = r3.mo22636c(r6)
                int r16 = r14.getSpanStart(r13)
                java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
                r15.add(r8)
                java.util.ArrayList r8 = r3.mo22636c(r7)
                int r15 = r14.getSpanEnd(r13)
                java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
                r8.add(r15)
                java.util.ArrayList r8 = r3.mo22636c(r10)
                int r13 = r14.getSpanFlags(r13)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r8.add(r13)
                java.util.ArrayList r8 = r3.mo22636c(r5)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r8.add(r12)
                int r1 = r1 + 1
                r8 = 0
                goto L_0x0193
            L_0x020a:
                java.util.List r0 = p242s1.C6315a.getActionList(r18)
                r8 = 0
            L_0x020f:
                int r1 = r0.size()
                if (r8 >= r1) goto L_0x0221
                java.lang.Object r1 = r0.get(r8)
                t1.g$a r1 = (p255t1.C6531g.C6532a) r1
                r3.mo22635b(r1)
                int r8 = r8 + 1
                goto L_0x020f
            L_0x0221:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p242s1.C6315a.C6316a.onInitializeAccessibilityNodeInfo(android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f19974a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f19974a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f19974a.performAccessibilityAction(view, i, bundle);
        }

        public final void sendAccessibilityEvent(View view, int i) {
            this.f19974a.sendAccessibilityEvent(view, i);
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f19974a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    /* renamed from: s1.a$b */
    public static class C6317b {
        /* renamed from: a */
        public static AccessibilityNodeProvider m14970a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        /* renamed from: b */
        public static boolean m14971b(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    public C6315a() {
        this(DEFAULT_DELEGATE);
    }

    public static List<C6531g.C6532a> getActionList(View view) {
        List<C6531g.C6532a> list = (List) view.getTag(C4329e.tag_accessibility_actions);
        if (list == null) {
            return Collections.emptyList();
        }
        return list;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        ClickableSpan[] clickableSpanArr;
        if (clickableSpan != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            } else {
                clickableSpanArr = null;
            }
            int i = 0;
            while (clickableSpanArr != null && i < clickableSpanArr.length) {
                if (clickableSpan.equals(clickableSpanArr[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C4329e.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!isSpanStillValid(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C6535h getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider a = C6317b.m14970a(this.mOriginalDelegate, view);
        if (a != null) {
            return new C6535h(a);
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, gVar.f20334a);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        List<C6531g.C6532a> actionList = getActionList(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= actionList.size()) {
                break;
            }
            C6531g.C6532a aVar = actionList.get(i2);
            if (aVar.mo22651a() != i) {
                i2++;
            } else if (aVar.f20351d != null) {
                Class<? extends C6541k.C6542a> cls = aVar.f20350c;
                if (cls != null) {
                    try {
                        ((C6541k.C6542a) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0])).getClass();
                    } catch (Exception unused) {
                    }
                }
                z = aVar.f20351d.mo3589a(view);
            }
        }
        if (!z) {
            z = C6317b.m14971b(this.mOriginalDelegate, view, i, bundle);
        }
        if (z || i != C4329e.accessibility_action_clickable_span || bundle == null) {
            return z;
        }
        return performClickableSpanAction(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C6315a(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C6316a(this);
    }
}
