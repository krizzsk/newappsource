package com.moovit.barcode.scan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import cf0.C21136j;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.barcode.Barcode;
import com.moovit.barcode.BarcodeFormat;
import com.moovit.barcode.scan.engines.MLKitBarcodeScannerFragment;
import com.moovit.barcode.scan.engines.ZxingBarcodeScannerFragment;
import com.moovit.commons.utils.ApplicationBugException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C23825c;
import mf0.C24362h;
import p001a0.C0017h;
import p432cz.C16527b;
import p432cz.C16528c;
import p480ez.C16911c;
import p977zz.C20943i;
import p977zz.C20948k0;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, mo59060d2 = {"Lcom/moovit/barcode/scan/BarcodeScannerFragment;", "Lcom/moovit/c;", "Lcom/moovit/MoovitActivity;", "<init>", "()V", "a", "Barcode_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class BarcodeScannerFragment extends C15682c<MoovitActivity> {

    /* renamed from: n */
    public static final String f40811n = BarcodeScannerFragment.class.getName();

    /* renamed from: com.moovit.barcode.scan.BarcodeScannerFragment$a */
    public interface C15681a {
        /* renamed from: w */
        void mo23711w(Barcode barcode);
    }

    public BarcodeScannerFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public final void mo46774m2() {
        ArrayList<BarcodeFormat> arrayList;
        Fragment fragment;
        int i;
        if (getChildFragmentManager().mo3923A("scanner") == null && C20948k0.m49058a(requireContext(), "android.permission.CAMERA")) {
            Bundle arguments = getArguments();
            int[] iArr = null;
            if (arguments != null) {
                arrayList = arguments.getParcelableArrayList("formats");
            } else {
                arrayList = null;
            }
            if (C20943i.m49051d(21)) {
                fragment = new MLKitBarcodeScannerFragment();
                Bundle bundle = new Bundle();
                if (arrayList != null) {
                    ArrayList arrayList2 = new ArrayList(C21136j.m49436X(arrayList, 10));
                    for (BarcodeFormat ordinal : arrayList) {
                        switch (C16911c.f43927a[ordinal.ordinal()]) {
                            case 1:
                                i = 4096;
                                break;
                            case 2:
                                i = 8;
                                break;
                            case 3:
                                i = 2;
                                break;
                            case 4:
                                i = 4;
                                break;
                            case 5:
                                i = 1;
                                break;
                            case 6:
                                i = 16;
                                break;
                            case 7:
                                i = 64;
                                break;
                            case 8:
                                i = 32;
                                break;
                            case 9:
                                i = RecyclerView.C1119a0.FLAG_IGNORE;
                                break;
                            case 10:
                                i = 2048;
                                break;
                            case 11:
                                i = 256;
                                break;
                            case 12:
                                i = 512;
                                break;
                            case 13:
                                i = 1024;
                                break;
                            default:
                                throw new NoWhenBranchMatchedException();
                        }
                        arrayList2.add(Integer.valueOf(i));
                    }
                    iArr = C23825c.m58498J0(arrayList2);
                }
                bundle.putIntArray("formats", iArr);
                fragment.setArguments(bundle);
            } else {
                fragment = new ZxingBarcodeScannerFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelableArrayList("formats", C13717b.m34264k(arrayList));
                fragment.setArguments(bundle2);
            }
            FragmentManager childFragmentManager = getChildFragmentManager();
            C0909a K = C0017h.m54K(childFragmentManager, childFragmentManager);
            K.mo4111f(C16527b.qr_fragment, fragment, "scanner");
            K.mo4045k();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (requireView().getId() != C16527b.qr_fragment) {
            throw new ApplicationBugException("BarcodeScannerFragment id must be R.id.qr_fragment!");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C24362h.m61211f(layoutInflater, "inflater");
        return layoutInflater.inflate(C16528c.barcode_scanner_fragment, viewGroup, false);
    }

    public final void onResume() {
        super.onResume();
        mo46774m2();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C24362h.m61211f(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        mo46774m2();
    }
}
