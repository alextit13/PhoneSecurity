package com.uvpatik.android.phonesecurity.classes;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;

import com.scottyab.rootbeer.RootBeer;

import java.util.ArrayList;
import java.util.List;

public class OSInfo {
    public static String osVersion(){
        return Build.MODEL;
    }
    public static String AndroidVersion(){
        return Build.VERSION.CODENAME;
    }
    public static String andridFirmvareVersion(){
        return Build.VERSION.SDK_INT + "";
    }
    public static String buildVersion(Activity activity){
        String version = "";
        try {
            PackageInfo pInformation = activity.getPackageManager().getPackageInfo(activity.getPackageName(),0);
            version = pInformation.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return version;
    }
    public static String security(){
        return Build.VERSION.SECURITY_PATCH;
    }
    public static String knoxVersion(Activity activity){
        String check = "Не установлен";
        List<ApplicationInfo> pkgAppsList = getListApplications(activity);
        for (int i = 0;i<pkgAppsList.size();i++){
            if (pkgAppsList.get(i).toString().contains("knox")){
                check = pkgAppsList.get(i).toString();
            }
        }
        return check;
    }
    public static List<ApplicationInfo>getListApplications(Activity activity){
        PackageManager mPm = activity.getPackageManager();
        return mPm.getInstalledApplications(PackageManager.GET_META_DATA);
    }
    public static ArrayList<String>getListApp(Activity activity){
        List<ApplicationInfo> pkgAppsList = getListApplications(activity);
        return getList(pkgAppsList,activity.getPackageManager());
    }
    public static ArrayList<String> getList(List<ApplicationInfo> pkgAppsList,PackageManager p) {
        ArrayList list = new ArrayList(pkgAppsList.size());
        for (int i = 0;i<pkgAppsList.size();i++){
            list.add(pkgAppsList.get(i).loadLabel(p));
        }
        return list;
    }
    public static String isRoot(Context context){
        String check = "Нет";
        RootBeer mRootBeer = new RootBeer(context);
        if (mRootBeer.isRooted()){
            check="Да";
        }
        return check;
    }
}
