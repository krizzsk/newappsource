package p255t1;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p177n1.C5799a;
import p255t1.C6541k;
import p988j$.util.Spliterator;

/* renamed from: t1.g */
public final class C6531g {

    /* renamed from: d */
    public static int f20333d;

    /* renamed from: a */
    public final AccessibilityNodeInfo f20334a;

    /* renamed from: b */
    public int f20335b = -1;

    /* renamed from: c */
    public int f20336c = -1;

    /* renamed from: t1.g$a */
    public static class C6532a {

        /* renamed from: e */
        public static final C6532a f20337e = new C6532a(1);

        /* renamed from: f */
        public static final C6532a f20338f = new C6532a(2);

        /* renamed from: g */
        public static final C6532a f20339g = new C6532a(16);

        /* renamed from: h */
        public static final C6532a f20340h = new C6532a(4096);

        /* renamed from: i */
        public static final C6532a f20341i = new C6532a(8192);

        /* renamed from: j */
        public static final C6532a f20342j = new C6532a(SQLiteDatabase.OPEN_PRIVATECACHE);

        /* renamed from: k */
        public static final C6532a f20343k = new C6532a(524288);

        /* renamed from: l */
        public static final C6532a f20344l = new C6532a(1048576);

        /* renamed from: m */
        public static final C6532a f20345m;

        /* renamed from: n */
        public static final C6532a f20346n;

        /* renamed from: o */
        public static final C6532a f20347o;

        /* renamed from: a */
        public final Object f20348a;

        /* renamed from: b */
        public final int f20349b;

        /* renamed from: c */
        public final Class<? extends C6541k.C6542a> f20350c;

        /* renamed from: d */
        public final C6541k f20351d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            Class<C6541k.C6544c> cls = C6541k.C6544c.class;
            Class<C6541k.C6543b> cls2 = C6541k.C6543b.class;
            new C6532a(4);
            new C6532a(8);
            new C6532a(32);
            new C6532a(64);
            new C6532a(RecyclerView.C1119a0.FLAG_IGNORE);
            new C6532a(256, cls2);
            new C6532a(512, cls2);
            new C6532a(1024, cls);
            new C6532a(2048, cls);
            new C6532a(Spliterator.SUBSIZED);
            new C6532a(32768);
            new C6532a(SQLiteDatabase.OPEN_FULLMUTEX);
            new C6532a(SQLiteDatabase.OPEN_SHAREDCACHE, C6541k.C6548g.class);
            new C6532a(2097152, C6541k.C6549h.class);
            int i = Build.VERSION.SDK_INT;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21 = null;
            if (i >= 23) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
            } else {
                accessibilityAction = null;
            }
            new C6532a(accessibilityAction, 16908342, (String) null, (C6541k) null, (Class) null);
            if (i >= 23) {
                accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
            } else {
                accessibilityAction2 = null;
            }
            new C6532a(accessibilityAction2, 16908343, (String) null, (C6541k) null, C6541k.C6546e.class);
            if (i >= 23) {
                accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
            } else {
                accessibilityAction3 = null;
            }
            f20345m = new C6532a(accessibilityAction3, 16908344, (String) null, (C6541k) null, (Class) null);
            if (i >= 23) {
                accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
            } else {
                accessibilityAction4 = null;
            }
            new C6532a(accessibilityAction4, 16908345, (String) null, (C6541k) null, (Class) null);
            if (i >= 23) {
                accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
            } else {
                accessibilityAction5 = null;
            }
            f20346n = new C6532a(accessibilityAction5, 16908346, (String) null, (C6541k) null, (Class) null);
            if (i >= 23) {
                accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
            } else {
                accessibilityAction6 = null;
            }
            new C6532a(accessibilityAction6, 16908347, (String) null, (C6541k) null, (Class) null);
            if (i >= 29) {
                accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            } else {
                accessibilityAction7 = null;
            }
            new C6532a(accessibilityAction7, 16908358, (String) null, (C6541k) null, (Class) null);
            if (i >= 29) {
                accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            } else {
                accessibilityAction8 = null;
            }
            new C6532a(accessibilityAction8, 16908359, (String) null, (C6541k) null, (Class) null);
            if (i >= 29) {
                accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
            } else {
                accessibilityAction9 = null;
            }
            new C6532a(accessibilityAction9, 16908360, (String) null, (C6541k) null, (Class) null);
            if (i >= 29) {
                accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            } else {
                accessibilityAction10 = null;
            }
            new C6532a(accessibilityAction10, 16908361, (String) null, (C6541k) null, (Class) null);
            if (i >= 23) {
                accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
            } else {
                accessibilityAction11 = null;
            }
            new C6532a(accessibilityAction11, 16908348, (String) null, (C6541k) null, (Class) null);
            if (i >= 24) {
                accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            } else {
                accessibilityAction12 = null;
            }
            f20347o = new C6532a(accessibilityAction12, 16908349, (String) null, (C6541k) null, C6541k.C6547f.class);
            if (i >= 26) {
                accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
            } else {
                accessibilityAction13 = null;
            }
            new C6532a(accessibilityAction13, 16908354, (String) null, (C6541k) null, C6541k.C6545d.class);
            if (i >= 28) {
                accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            } else {
                accessibilityAction14 = null;
            }
            new C6532a(accessibilityAction14, 16908356, (String) null, (C6541k) null, (Class) null);
            if (i >= 28) {
                accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            } else {
                accessibilityAction15 = null;
            }
            new C6532a(accessibilityAction15, 16908357, (String) null, (C6541k) null, (Class) null);
            if (i >= 30) {
                accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
            } else {
                accessibilityAction16 = null;
            }
            new C6532a(accessibilityAction16, 16908362, (String) null, (C6541k) null, (Class) null);
            if (i >= 30) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            } else {
                accessibilityAction17 = null;
            }
            new C6532a(accessibilityAction17, 16908372, (String) null, (C6541k) null, (Class) null);
            if (i >= 32) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
            } else {
                accessibilityAction18 = null;
            }
            new C6532a(accessibilityAction18, 16908373, (String) null, (C6541k) null, (Class) null);
            if (i >= 32) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            } else {
                accessibilityAction19 = null;
            }
            new C6532a(accessibilityAction19, 16908374, (String) null, (C6541k) null, (Class) null);
            if (i >= 32) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            } else {
                accessibilityAction20 = null;
            }
            new C6532a(accessibilityAction20, 16908375, (String) null, (C6541k) null, (Class) null);
            if (i >= 33) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            }
            new C6532a(accessibilityAction21, 16908376, (String) null, (C6541k) null, (Class) null);
        }

        public C6532a(int i) {
            this((Object) null, i, (String) null, (C6541k) null, (Class) null);
        }

        /* renamed from: a */
        public final int mo22651a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f20348a).getId();
        }

        /* renamed from: b */
        public final CharSequence mo22652b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f20348a).getLabel();
        }

        public final boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C6532a)) {
                return false;
            }
            C6532a aVar = (C6532a) obj;
            Object obj2 = this.f20348a;
            if (obj2 == null) {
                if (aVar.f20348a != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.f20348a)) {
                return false;
            } else {
                return true;
            }
        }

        public final int hashCode() {
            Object obj = this.f20348a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public C6532a(int i, Class cls) {
            this((Object) null, i, (String) null, (C6541k) null, cls);
        }

        public C6532a(Object obj, int i, String str, C6541k kVar, Class cls) {
            this.f20349b = i;
            this.f20351d = kVar;
            if (obj == null) {
                this.f20348a = new AccessibilityNodeInfo.AccessibilityAction(i, str);
            } else {
                this.f20348a = obj;
            }
            this.f20350c = cls;
        }
    }

    /* renamed from: t1.g$b */
    public static class C6533b {

        /* renamed from: a */
        public final Object f20352a;

        public C6533b(AccessibilityNodeInfo.CollectionInfo collectionInfo) {
            this.f20352a = collectionInfo;
        }

        /* renamed from: a */
        public static C6533b m15466a(int i, int i2, int i3, boolean z) {
            return new C6533b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    /* renamed from: t1.g$c */
    public static class C6534c {

        /* renamed from: a */
        public final Object f20353a;

        public C6534c(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
            this.f20353a = collectionItemInfo;
        }

        /* renamed from: a */
        public static C6534c m15467a(int i, int i2, int i3, int i4, boolean z) {
            return new C6534c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
        }
    }

    public C6531g(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f20334a = accessibilityNodeInfo;
    }

    /* renamed from: a */
    public final void mo22634a(int i) {
        this.f20334a.addAction(i);
    }

    /* renamed from: b */
    public final void mo22635b(C6532a aVar) {
        this.f20334a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f20348a);
    }

    /* renamed from: c */
    public final ArrayList mo22636c(String str) {
        ArrayList<Integer> integerArrayList = this.f20334a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f20334a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    @Deprecated
    /* renamed from: d */
    public final void mo22637d(Rect rect) {
        this.f20334a.getBoundsInParent(rect);
    }

    /* renamed from: e */
    public final CharSequence mo22638e() {
        if (!(!mo22636c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.f20334a.getText();
        }
        ArrayList c = mo22636c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList c2 = mo22636c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList c3 = mo22636c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList c4 = mo22636c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f20334a.getText(), 0, this.f20334a.getText().length()));
        for (int i = 0; i < c.size(); i++) {
            spannableString.setSpan(new C6525a(((Integer) c4.get(i)).intValue(), this, this.f20334a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) c.get(i)).intValue(), ((Integer) c2.get(i)).intValue(), ((Integer) c3.get(i)).intValue());
        }
        return spannableString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C6531g)) {
            return false;
        }
        C6531g gVar = (C6531g) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f20334a;
        if (accessibilityNodeInfo == null) {
            if (gVar.f20334a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(gVar.f20334a)) {
            return false;
        }
        if (this.f20336c == gVar.f20336c && this.f20335b == gVar.f20335b) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo22640f() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f20334a.isShowingHintText();
        }
        Bundle extras = this.f20334a.getExtras();
        if (extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo22641g(int i, boolean z) {
        Bundle extras = this.f20334a.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    @Deprecated
    /* renamed from: h */
    public final void mo22642h(Rect rect) {
        this.f20334a.setBoundsInParent(rect);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f20334a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i */
    public final void mo22644i(CharSequence charSequence) {
        this.f20334a.setClassName(charSequence);
    }

    /* renamed from: j */
    public final void mo22645j(C6534c cVar) {
        this.f20334a.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) cVar.f20353a);
    }

    /* renamed from: k */
    public final void mo22646k(CharSequence charSequence) {
        this.f20334a.setContentDescription(charSequence);
    }

    /* renamed from: l */
    public final void mo22647l(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f20334a.setHintText(charSequence);
        } else {
            this.f20334a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: m */
    public final void mo22648m(boolean z) {
        this.f20334a.setScrollable(z);
    }

    /* renamed from: n */
    public final void mo22649n(CharSequence charSequence) {
        this.f20334a.setText(charSequence);
    }

    public final String toString() {
        String str;
        ArrayList arrayList;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo22637d(rect);
        sb.append("; boundsInParent: " + rect);
        this.f20334a.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.f20334a.getPackageName());
        sb.append("; className: ");
        sb.append(this.f20334a.getClassName());
        sb.append("; text: ");
        sb.append(mo22638e());
        sb.append("; contentDescription: ");
        sb.append(this.f20334a.getContentDescription());
        sb.append("; viewId: ");
        sb.append(this.f20334a.getViewIdResourceName());
        sb.append("; uniqueId: ");
        if (C5799a.m14229c()) {
            str = this.f20334a.getUniqueId();
        } else {
            str = this.f20334a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(str);
        sb.append("; checkable: ");
        sb.append(this.f20334a.isCheckable());
        sb.append("; checked: ");
        sb.append(this.f20334a.isChecked());
        sb.append("; focusable: ");
        sb.append(this.f20334a.isFocusable());
        sb.append("; focused: ");
        sb.append(this.f20334a.isFocused());
        sb.append("; selected: ");
        sb.append(this.f20334a.isSelected());
        sb.append("; clickable: ");
        sb.append(this.f20334a.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.f20334a.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.f20334a.isEnabled());
        sb.append("; password: ");
        sb.append(this.f20334a.isPassword());
        sb.append("; scrollable: " + this.f20334a.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f20334a.getActionList();
        if (actionList != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(new C6532a(actionList.get(i), 0, (String) null, (C6541k) null, (Class) null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = Collections.emptyList();
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C6532a aVar = (C6532a) arrayList.get(i2);
            int a = aVar.mo22651a();
            if (a == 1) {
                str2 = "ACTION_FOCUS";
            } else if (a != 2) {
                switch (a) {
                    case 4:
                        str2 = "ACTION_SELECT";
                        break;
                    case 8:
                        str2 = "ACTION_CLEAR_SELECTION";
                        break;
                    case 16:
                        str2 = "ACTION_CLICK";
                        break;
                    case 32:
                        str2 = "ACTION_LONG_CLICK";
                        break;
                    case 64:
                        str2 = "ACTION_ACCESSIBILITY_FOCUS";
                        break;
                    case RecyclerView.C1119a0.FLAG_IGNORE:
                        str2 = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                        break;
                    case 256:
                        str2 = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 512:
                        str2 = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                        break;
                    case 1024:
                        str2 = "ACTION_NEXT_HTML_ELEMENT";
                        break;
                    case 2048:
                        str2 = "ACTION_PREVIOUS_HTML_ELEMENT";
                        break;
                    case 4096:
                        str2 = "ACTION_SCROLL_FORWARD";
                        break;
                    case 8192:
                        str2 = "ACTION_SCROLL_BACKWARD";
                        break;
                    case Spliterator.SUBSIZED /*16384*/:
                        str2 = "ACTION_COPY";
                        break;
                    case 32768:
                        str2 = "ACTION_PASTE";
                        break;
                    case SQLiteDatabase.OPEN_FULLMUTEX /*65536*/:
                        str2 = "ACTION_CUT";
                        break;
                    case SQLiteDatabase.OPEN_SHAREDCACHE /*131072*/:
                        str2 = "ACTION_SET_SELECTION";
                        break;
                    case SQLiteDatabase.OPEN_PRIVATECACHE /*262144*/:
                        str2 = "ACTION_EXPAND";
                        break;
                    case 524288:
                        str2 = "ACTION_COLLAPSE";
                        break;
                    case 2097152:
                        str2 = "ACTION_SET_TEXT";
                        break;
                    case 16908354:
                        str2 = "ACTION_MOVE_WINDOW";
                        break;
                    default:
                        switch (a) {
                            case 16908342:
                                str2 = "ACTION_SHOW_ON_SCREEN";
                                break;
                            case 16908343:
                                str2 = "ACTION_SCROLL_TO_POSITION";
                                break;
                            case 16908344:
                                str2 = "ACTION_SCROLL_UP";
                                break;
                            case 16908345:
                                str2 = "ACTION_SCROLL_LEFT";
                                break;
                            case 16908346:
                                str2 = "ACTION_SCROLL_DOWN";
                                break;
                            case 16908347:
                                str2 = "ACTION_SCROLL_RIGHT";
                                break;
                            case 16908348:
                                str2 = "ACTION_CONTEXT_CLICK";
                                break;
                            case 16908349:
                                str2 = "ACTION_SET_PROGRESS";
                                break;
                            default:
                                switch (a) {
                                    case 16908356:
                                        str2 = "ACTION_SHOW_TOOLTIP";
                                        break;
                                    case 16908357:
                                        str2 = "ACTION_HIDE_TOOLTIP";
                                        break;
                                    case 16908358:
                                        str2 = "ACTION_PAGE_UP";
                                        break;
                                    case 16908359:
                                        str2 = "ACTION_PAGE_DOWN";
                                        break;
                                    case 16908360:
                                        str2 = "ACTION_PAGE_LEFT";
                                        break;
                                    case 16908361:
                                        str2 = "ACTION_PAGE_RIGHT";
                                        break;
                                    case 16908362:
                                        str2 = "ACTION_PRESS_AND_HOLD";
                                        break;
                                    default:
                                        switch (a) {
                                            case 16908372:
                                                str2 = "ACTION_IME_ENTER";
                                                break;
                                            case 16908373:
                                                str2 = "ACTION_DRAG_START";
                                                break;
                                            case 16908374:
                                                str2 = "ACTION_DRAG_DROP";
                                                break;
                                            case 16908375:
                                                str2 = "ACTION_DRAG_CANCEL";
                                                break;
                                            default:
                                                str2 = "ACTION_UNKNOWN";
                                                break;
                                        }
                                }
                        }
                }
            } else {
                str2 = "ACTION_CLEAR_FOCUS";
            }
            if (str2.equals("ACTION_UNKNOWN") && aVar.mo22652b() != null) {
                str2 = aVar.mo22652b().toString();
            }
            sb.append(str2);
            if (i2 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
