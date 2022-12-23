package com.theartofdev.edmodo.cropper;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import com.theartofdev.edmodo.cropper.CropImage;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.File;
import java.io.IOException;
import p090g1.C4732a;
import pb0.C13001b;
import pb0.C13002c;
import pb0.C13003d;
import pb0.C13004e;

public class CropImageActivity extends AppCompatActivity implements CropImageView.C8045g, CropImageView.C8041c {

    /* renamed from: x */
    public CropImageView f24314x;

    /* renamed from: y */
    public Uri f24315y;

    /* renamed from: z */
    public CropImageOptions f24316z;

    /* renamed from: d1 */
    public static void m18341d1(Menu menu, int i, int i2) {
        Drawable icon;
        MenuItem findItem = menu.findItem(i);
        if (findItem != null && (icon = findItem.getIcon()) != null) {
            try {
                icon.mutate();
                icon.setColorFilter(i2, PorterDuff.Mode.SRC_ATOP);
                findItem.setIcon(icon);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b1 */
    public final void mo25103b1(Uri uri, Exception exc, int i) {
        int i2;
        if (exc == null) {
            i2 = -1;
        } else {
            i2 = 204;
        }
        CropImage.ActivityResult activityResult = new CropImage.ActivityResult(this.f24314x.getImageUri(), uri, exc, this.f24314x.getCropPoints(), this.f24314x.getCropRect(), this.f24314x.getRotatedDegrees(), this.f24314x.getWholeImageRect(), i);
        Intent intent = new Intent();
        intent.putExtras(getIntent());
        intent.putExtra("CROP_IMAGE_EXTRA_RESULT", activityResult);
        setResult(i2, intent);
        finish();
    }

    @SuppressLint({"NewApi"})
    public final void onActivityResult(int i, int i2, Intent intent) {
        Uri uri;
        String action;
        if (i == 200) {
            boolean z = false;
            if (i2 == 0) {
                setResult(0);
                finish();
            }
            if (i2 == -1) {
                if (intent == null || intent.getData() == null || ((action = intent.getAction()) != null && action.equals("android.media.action.IMAGE_CAPTURE"))) {
                    z = true;
                }
                if (z || intent.getData() == null) {
                    File externalCacheDir = getExternalCacheDir();
                    if (externalCacheDir != null) {
                        uri = Uri.fromFile(new File(externalCacheDir.getPath(), "pickImageResult.jpeg"));
                    } else {
                        uri = null;
                    }
                } else {
                    uri = intent.getData();
                }
                this.f24315y = uri;
                if (CropImage.m18339c(this, uri)) {
                    requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
                } else {
                    this.f24314x.setImageUriAsync(this.f24315y);
                }
            }
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        setResult(0);
        finish();
    }

    @SuppressLint({"NewApi"})
    public final void onCreate(Bundle bundle) {
        CharSequence charSequence;
        CharSequence charSequence2;
        super.onCreate(bundle);
        setContentView(C13002c.crop_image_activity);
        this.f24314x = (CropImageView) findViewById(C13001b.cropImageView);
        Bundle bundleExtra = getIntent().getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE");
        this.f24315y = (Uri) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_SOURCE");
        this.f24316z = (CropImageOptions) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        if (bundle == null) {
            Uri uri = this.f24315y;
            if (uri == null || uri.equals(Uri.EMPTY)) {
                if (CropImage.m18338b(this)) {
                    requestPermissions(new String[]{"android.permission.CAMERA"}, 2011);
                } else {
                    CropImage.m18340d(this);
                }
            } else if (CropImage.m18339c(this, this.f24315y)) {
                requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 201);
            } else {
                this.f24314x.setImageUriAsync(this.f24315y);
            }
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            CropImageOptions cropImageOptions = this.f24316z;
            if (cropImageOptions == null || (charSequence2 = cropImageOptions.f24321E) == null || charSequence2.length() <= 0) {
                charSequence = getResources().getString(C13004e.crop_image_activity_title);
            } else {
                charSequence = this.f24316z.f24321E;
            }
            supportActionBar.mo801w(charSequence);
            supportActionBar.mo791m(true);
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C13003d.crop_image_menu, menu);
        CropImageOptions cropImageOptions = this.f24316z;
        if (!cropImageOptions.f24332P) {
            menu.removeItem(C13001b.crop_image_menu_rotate_left);
            menu.removeItem(C13001b.crop_image_menu_rotate_right);
        } else if (cropImageOptions.f24334R) {
            menu.findItem(C13001b.crop_image_menu_rotate_left).setVisible(true);
        }
        if (!this.f24316z.f24333Q) {
            menu.removeItem(C13001b.crop_image_menu_flip);
        }
        if (this.f24316z.f24338X != null) {
            menu.findItem(C13001b.crop_image_menu_crop).setTitle(this.f24316z.f24338X);
        }
        Drawable drawable = null;
        try {
            int i = this.f24316z.f24339Y;
            if (i != 0) {
                drawable = C4732a.getDrawable(this, i);
                menu.findItem(C13001b.crop_image_menu_crop).setIcon(drawable);
            }
        } catch (Exception unused) {
        }
        int i2 = this.f24316z.f24322F;
        if (i2 != 0) {
            m18341d1(menu, C13001b.crop_image_menu_rotate_left, i2);
            m18341d1(menu, C13001b.crop_image_menu_rotate_right, this.f24316z.f24322F);
            m18341d1(menu, C13001b.crop_image_menu_flip, this.f24316z.f24322F);
            if (drawable != null) {
                m18341d1(menu, C13001b.crop_image_menu_crop, this.f24316z.f24322F);
            }
        }
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        if (menuItem.getItemId() == C13001b.crop_image_menu_crop) {
            CropImageOptions cropImageOptions = this.f24316z;
            if (cropImageOptions.f24329M) {
                mo25103b1((Uri) null, (Exception) null, 1);
            } else {
                Uri uri = cropImageOptions.f24323G;
                if (uri == null || uri.equals(Uri.EMPTY)) {
                    try {
                        Bitmap.CompressFormat compressFormat = this.f24316z.f24324H;
                        if (compressFormat == Bitmap.CompressFormat.JPEG) {
                            str = ".jpg";
                        } else if (compressFormat == Bitmap.CompressFormat.PNG) {
                            str = ".png";
                        } else {
                            str = ".webp";
                        }
                        uri = Uri.fromFile(File.createTempFile("cropped", str, getCacheDir()));
                    } catch (IOException e) {
                        throw new RuntimeException("Failed to create temp file for output image", e);
                    }
                }
                Uri uri2 = uri;
                CropImageView cropImageView = this.f24314x;
                CropImageOptions cropImageOptions2 = this.f24316z;
                Bitmap.CompressFormat compressFormat2 = cropImageOptions2.f24324H;
                int i = cropImageOptions2.f24325I;
                int i2 = cropImageOptions2.f24326J;
                int i3 = cropImageOptions2.f24327K;
                CropImageView.RequestSizeOptions requestSizeOptions = cropImageOptions2.f24328L;
                if (cropImageView.f24399y != null) {
                    cropImageView.mo25133i(i2, i3, i, compressFormat2, uri2, requestSizeOptions);
                } else {
                    throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
                }
            }
            return true;
        } else if (menuItem.getItemId() == C13001b.crop_image_menu_rotate_left) {
            this.f24314x.mo25115e(-this.f24316z.f24335S);
            return true;
        } else if (menuItem.getItemId() == C13001b.crop_image_menu_rotate_right) {
            this.f24314x.mo25115e(this.f24316z.f24335S);
            return true;
        } else if (menuItem.getItemId() == C13001b.crop_image_menu_flip_horizontally) {
            CropImageView cropImageView2 = this.f24314x;
            cropImageView2.f24387m = !cropImageView2.f24387m;
            cropImageView2.mo25111a((float) cropImageView2.getWidth(), (float) cropImageView2.getHeight(), true, false);
            return true;
        } else if (menuItem.getItemId() == C13001b.crop_image_menu_flip_vertically) {
            CropImageView cropImageView3 = this.f24314x;
            cropImageView3.f24388n = !cropImageView3.f24388n;
            cropImageView3.mo25111a((float) cropImageView3.getWidth(), (float) cropImageView3.getHeight(), true, false);
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            setResult(0);
            finish();
            return true;
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 201) {
            Uri uri = this.f24315y;
            if (uri == null || iArr.length <= 0 || iArr[0] != 0) {
                Toast.makeText(this, C13004e.crop_image_activity_no_permissions, 1).show();
                setResult(0);
                finish();
            } else {
                this.f24314x.setImageUriAsync(uri);
            }
        }
        if (i == 2011) {
            CropImage.m18340d(this);
        }
    }

    public final void onStart() {
        super.onStart();
        this.f24314x.setOnSetImageUriCompleteListener(this);
        this.f24314x.setOnCropImageCompleteListener(this);
    }

    public final void onStop() {
        super.onStop();
        this.f24314x.setOnSetImageUriCompleteListener((CropImageView.C8045g) null);
        this.f24314x.setOnCropImageCompleteListener((CropImageView.C8041c) null);
    }
}
