package com.google.android.gms.maps.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.maps.zzi;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.StreetViewPanoramaOptions;

public interface zzf extends IInterface {
    int zzd() throws RemoteException;

    ICameraUpdateFactoryDelegate zze() throws RemoteException;

    IMapFragmentDelegate zzf(IObjectWrapper iObjectWrapper) throws RemoteException;

    IMapViewDelegate zzg(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions) throws RemoteException;

    IStreetViewPanoramaFragmentDelegate zzh(IObjectWrapper iObjectWrapper) throws RemoteException;

    IStreetViewPanoramaViewDelegate zzi(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions) throws RemoteException;

    zzi zzj() throws RemoteException;

    void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException;

    void zzl(IObjectWrapper iObjectWrapper, int i) throws RemoteException;
}
