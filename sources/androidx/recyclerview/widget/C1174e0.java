package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;
import p242s1.C6315a;
import p255t1.C6531g;
import p255t1.C6535h;

/* renamed from: androidx.recyclerview.widget.e0 */
public class C1174e0 extends C6315a {

    /* renamed from: a */
    public final RecyclerView f4454a;

    /* renamed from: b */
    public final C1175a f4455b;

    /* renamed from: androidx.recyclerview.widget.e0$a */
    public static class C1175a extends C6315a {

        /* renamed from: a */
        public final C1174e0 f4456a;

        /* renamed from: b */
        public WeakHashMap f4457b = new WeakHashMap();

        public C1175a(C1174e0 e0Var) {
            this.f4456a = e0Var;
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C6315a aVar = (C6315a) this.f4457b.get(view);
            if (aVar != null) {
                return aVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public final C6535h getAccessibilityNodeProvider(View view) {
            C6315a aVar = (C6315a) this.f4457b.get(view);
            if (aVar != null) {
                return aVar.getAccessibilityNodeProvider(view);
            }
            return super.getAccessibilityNodeProvider(view);
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C6315a aVar = (C6315a) this.f4457b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
            boolean z;
            RecyclerView recyclerView = this.f4456a.f4454a;
            if (!recyclerView.f4287v || recyclerView.f4229E || recyclerView.f4260e.mo4999g()) {
                z = true;
            } else {
                z = false;
            }
            if (z || this.f4456a.f4454a.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, gVar);
                return;
            }
            this.f4456a.f4454a.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, gVar);
            C6315a aVar = (C6315a) this.f4457b.get(view);
            if (aVar != null) {
                aVar.onInitializeAccessibilityNodeInfo(view, gVar);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, gVar);
            }
        }

        public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C6315a aVar = (C6315a) this.f4457b.get(view);
            if (aVar != null) {
                aVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C6315a aVar = (C6315a) this.f4457b.get(viewGroup);
            if (aVar != null) {
                return aVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            boolean z;
            RecyclerView recyclerView = this.f4456a.f4454a;
            if (!recyclerView.f4287v || recyclerView.f4229E || recyclerView.f4260e.mo4999g()) {
                z = true;
            } else {
                z = false;
            }
            if (z || this.f4456a.f4454a.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            C6315a aVar = (C6315a) this.f4457b.get(view);
            if (aVar != null) {
                if (aVar.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            return this.f4456a.f4454a.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }

        public final void sendAccessibilityEvent(View view, int i) {
            C6315a aVar = (C6315a) this.f4457b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            C6315a aVar = (C6315a) this.f4457b.get(view);
            if (aVar != null) {
                aVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public C1174e0(RecyclerView recyclerView) {
        this.f4454a = recyclerView;
        C1175a aVar = this.f4455b;
        if (aVar != null) {
            this.f4455b = aVar;
        } else {
            this.f4455b = new C1175a(this);
        }
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f4454a;
            if (!recyclerView.f4287v || recyclerView.f4229E || recyclerView.f4260e.mo4999g()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
                }
            }
        }
    }

    public void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(view, gVar);
        RecyclerView recyclerView = this.f4454a;
        if (!recyclerView.f4287v || recyclerView.f4229E || recyclerView.f4260e.mo4999g()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && this.f4454a.getLayoutManager() != null) {
            this.f4454a.getLayoutManager().onInitializeAccessibilityNodeInfo(gVar);
        }
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        boolean z = true;
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f4454a;
        if (recyclerView.f4287v && !recyclerView.f4229E && !recyclerView.f4260e.mo4999g()) {
            z = false;
        }
        if (z || this.f4454a.getLayoutManager() == null) {
            return false;
        }
        return this.f4454a.getLayoutManager().performAccessibilityAction(i, bundle);
    }
}
