package com.moovit.image;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.utils.DataUnit;
import com.moovit.image.ImageProviderFragment;
import com.theartofdev.edmodo.cropper.CropImageActivity;
import com.theartofdev.edmodo.cropper.CropImageOptions;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.File;
import java.util.concurrent.Callable;
import p824tp.C19746x;
import p977zz.C20978z;

/* renamed from: com.moovit.image.k */
public final /* synthetic */ class C16034k implements Callable {

    /* renamed from: b */
    public final /* synthetic */ ImageProviderFragment f41750b;

    /* renamed from: c */
    public final /* synthetic */ ImageProviderFragment.PhotoTakingParams f41751c;

    /* renamed from: d */
    public final /* synthetic */ Context f41752d;

    public /* synthetic */ C16034k(ImageProviderFragment imageProviderFragment, ImageProviderFragment.PhotoTakingParams photoTakingParams, Context context) {
        this.f41750b = imageProviderFragment;
        this.f41751c = photoTakingParams;
        this.f41752d = context;
    }

    public final Object call() {
        ImageProviderFragment imageProviderFragment = this.f41750b;
        ImageProviderFragment.PhotoTakingParams photoTakingParams = this.f41751c;
        Context context = this.f41752d;
        imageProviderFragment.getClass();
        File file = new File(photoTakingParams.f41704b);
        DataUnit.formatSize(file.length());
        Uri c = C20978z.m49127c(context, file);
        CropImageOptions cropImageOptions = new CropImageOptions();
        cropImageOptions.f24347i = true;
        cropImageOptions.f24332P = true;
        cropImageOptions.f24333Q = false;
        cropImageOptions.f24339Y = 0;
        cropImageOptions.f24338X = imageProviderFragment.getString(C19746x.save);
        cropImageOptions.f24324H = ImageProviderFragment.f41701o;
        CropImageView.RequestSizeOptions requestSizeOptions = CropImageView.RequestSizeOptions.RESIZE_INSIDE;
        cropImageOptions.f24326J = 720;
        cropImageOptions.f24327K = 1280;
        cropImageOptions.f24328L = requestSizeOptions;
        cropImageOptions.f24325I = 50;
        cropImageOptions.f24323G = c;
        cropImageOptions.f24350l = BitmapDescriptorFactory.HUE_RED;
        cropImageOptions.mo25106b();
        Intent intent = new Intent();
        intent.setClass(context, CropImageActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("CROP_IMAGE_EXTRA_SOURCE", c);
        bundle.putParcelable("CROP_IMAGE_EXTRA_OPTIONS", cropImageOptions);
        intent.putExtra("CROP_IMAGE_EXTRA_BUNDLE", bundle);
        return intent;
    }
}
