package p555ie;

import c70.C13752e;
import ce0.C21100e;
import com.android.billingclient.api.C1947e;
import com.android.billingclient.api.SkuDetails;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.moovit.MoovitApplication;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.subscription.MoovitSubscriptionsManager;
import com.moovit.app.subscription.model.SubscriptionDetails;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.payment.clearance.ClearanceProviderType;
import com.moovit.payment.clearance.model.ClearanceProviderInstructions;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import com.moovit.ticketing.purchase.station.PurchaseStation;
import com.moovit.ticketing.purchase.station.PurchaseStationSelectionStep;
import e90.C12618b;
import h60.C17304c;
import h60.C17307d;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import l30.C5577i;
import m30.C5679b;
import m60.C18345d;
import m80.C12887v;
import o00.C18676l;
import p220q5.C6179a;
import p244s3.C6446u;
import p646lz.C18299a;
import p786rz.C19387a;
import p824tp.C19722a0;
import p949yv.C20772a;
import p977zz.C20944i0;
import p977zz.C20964s0;
import r90.C13052c;

/* renamed from: ie.h */
public final /* synthetic */ class C17589h implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f45231b;

    /* renamed from: c */
    public final /* synthetic */ Object f45232c;

    public /* synthetic */ C17589h(Object obj, int i) {
        this.f45231b = i;
        this.f45232c = obj;
    }

    public final Object call() {
        String str;
        BufferedWriter bufferedWriter;
        ByteArrayOutputStream byteArrayOutputStream;
        String str2;
        boolean z = true;
        BufferedWriter bufferedWriter2 = null;
        switch (this.f45231b) {
            case 0:
                C17590i iVar = (C17590i) this.f45232c;
                synchronized (iVar.f45238f) {
                    if (iVar.f45238f.isMarked()) {
                        str = iVar.f45238f.getReference();
                        iVar.f45238f.set(str, false);
                    } else {
                        z = false;
                        str = null;
                    }
                }
                if (z) {
                    File a = iVar.f45233a.f45211a.mo50830a(iVar.f45235c, "user-data");
                    try {
                        String obj = new C17582d(str).toString();
                        bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(a), C17583e.f45210b));
                        try {
                            bufferedWriter.write(obj);
                            bufferedWriter.flush();
                        } catch (Exception unused) {
                        } catch (Throwable th) {
                            th = th;
                            bufferedWriter2 = bufferedWriter;
                            CommonUtils.m35963a(bufferedWriter2);
                            throw th;
                        }
                    } catch (Exception unused2) {
                        bufferedWriter = null;
                    } catch (Throwable th2) {
                        th = th2;
                        CommonUtils.m35963a(bufferedWriter2);
                        throw th;
                    }
                    CommonUtils.m35963a(bufferedWriter);
                }
                return null;
            case 1:
                MoovitApplication moovitApplication = (MoovitApplication) ((C20772a) this.f45232c).f3907b;
                C21100e.m49355o();
                if (UserContextLoader.m40004l(moovitApplication)) {
                    C13752e l = moovitApplication.mo44560l();
                    if (l.f33853b != null) {
                        return l;
                    }
                    C18299a aVar = moovitApplication.f37321e;
                    C19722a0 a0Var = (C19722a0) aVar.mo50695h("USER_CONTEXT", false);
                    if (a0Var != null) {
                        return new C13752e(moovitApplication, a0Var, (AnalyticsFlowKey) null);
                    }
                    StringBuilder k = C13555b.m33972k("Failed to load user context: ");
                    k.append(aVar.mo50694g("USER_CONTEXT"));
                    throw new ApplicationBugException(k.toString());
                }
                throw new ApplicationBugException("Missing user context!");
            case 2:
                HashSet hashSet = MoovitSubscriptionsManager.f39757g;
                SkuDetails skuDetails = new SkuDetails(((SubscriptionDetails) this.f45232c).f39793g);
                ArrayList<SkuDetails> arrayList = new ArrayList<>();
                arrayList.add(skuDetails);
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        int i2 = i + 1;
                        if (arrayList.get(i) != null) {
                            i = i2;
                        } else {
                            throw new IllegalArgumentException("SKU cannot be null.");
                        }
                    }
                    if (arrayList.size() > 1) {
                        SkuDetails skuDetails2 = arrayList.get(0);
                        String a2 = skuDetails2.mo9553a();
                        int size2 = arrayList.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            SkuDetails skuDetails3 = arrayList.get(i3);
                            if (a2.equals("play_pass_subs") || skuDetails3.mo9553a().equals("play_pass_subs") || a2.equals(skuDetails3.mo9553a())) {
                                i3++;
                            } else {
                                throw new IllegalArgumentException("SKUs should have the same type.");
                            }
                        }
                        String optString = skuDetails2.f6735b.optString("packageName");
                        int size3 = arrayList.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            SkuDetails skuDetails4 = arrayList.get(i4);
                            if (a2.equals("play_pass_subs") || skuDetails4.mo9553a().equals("play_pass_subs") || optString.equals(skuDetails4.f6735b.optString("packageName"))) {
                                i4++;
                            } else {
                                throw new IllegalArgumentException("All SKUs must have the same package name.");
                            }
                        }
                    }
                    C1947e eVar = new C1947e(0);
                    eVar.f6758a = true ^ arrayList.get(0).f6735b.optString("packageName").isEmpty();
                    eVar.f6759b = null;
                    eVar.f6761d = null;
                    eVar.f6760c = null;
                    eVar.f6762e = 0;
                    eVar.f6763f = arrayList;
                    eVar.f6764g = false;
                    return eVar;
                }
                throw new IllegalArgumentException("SkuDetails must be provided.");
            case 3:
                return C5577i.m13787c(((C5577i) this.f45232c).f18277a);
            case 4:
                int i5 = C5679b.f18460q;
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream((File) this.f45232c));
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    C19387a.m46671c(bufferedInputStream, byteArrayOutputStream);
                    ByteBuffer wrap = ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                    byteArrayOutputStream.close();
                    bufferedInputStream.close();
                    return wrap;
                } catch (Throwable th3) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 5:
                C18345d dVar = (C18345d) this.f45232c;
                int i6 = C18345d.f46775u;
                C13752e x1 = dVar.f40822c.mo44548x1();
                ClearanceProviderInstructions clearanceProviderInstructions = dVar.f46768n.f42590b.f42774c;
                ClearanceProviderType clearanceProviderType = clearanceProviderInstructions.f42605c;
                String str3 = clearanceProviderInstructions.f42604b;
                WebInstruction webInstruction = dVar.f46777p;
                C17307d dVar2 = (C17307d) new C17304c(x1, clearanceProviderType, str3, webInstruction.f42777b, webInstruction.f42778c).mo52626J();
                return new C20944i0(dVar2.f44691m, dVar2.f44692n);
            case 6:
                return C12887v.m32669d(((C12887v) this.f45232c).f31895a);
            case 7:
                int i7 = C12618b.f31181w;
                CollectionHashMap.ArrayListHashMap arrayListHashMap = new CollectionHashMap.ArrayListHashMap();
                for (PurchaseStation next : ((PurchaseStationSelectionStep) this.f45232c).f23424f) {
                    String str4 = next.f23420c;
                    if (!C20964s0.m49090h(str4)) {
                        str2 = Character.toString(Character.toUpperCase(str4.charAt(0)));
                    } else {
                        str2 = null;
                    }
                    arrayListHashMap.mo47001a(str2, next);
                }
                C6446u uVar = new C6446u(5);
                ArrayList arrayList2 = new ArrayList(arrayListHashMap.size());
                for (Map.Entry entry : arrayListHashMap.entrySet()) {
                    List list = (List) entry.getValue();
                    Collections.sort(list, uVar);
                    arrayList2.add(new C18676l.C18678b((CharSequence) entry.getKey(), list));
                }
                Collections.sort(arrayList2, new C6179a(4));
                return new C12618b.C12621c(arrayList2);
            default:
                int i8 = C13052c.f32280u;
                ((C13052c) this.f45232c).getClass();
                throw new UnsupportedOperationException("Ximedes sdk not supported in current version");
        }
        throw th;
    }
}
