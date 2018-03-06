import Versions.daggerVersion

object Versions {
    val compileSdk = 27
    val minSdk = 16
    val targetSdk = 27
    val versionCode = 1
    val versionName = "1.0"
    val supportVersion = "27.1.0"
    val daggerVersion = "2.14.1"
    val retrofit = "2.3.0"
    val rxJava = "2.1.7"
    val rxAndroid = "2.0.2"
    val loggingInterceptor = "3.4.2"
    val glide = "4.6.1"
    val autoFactory = "1.0-beta5"
    val timber = "4.5.1"
    val rxBinding = "2.1.1"
    val constraintLayout = "1.0.2"
}

object Deps {
    val appCompat = "com.android.support:appcompat-v7:${Versions.supportVersion}"
    val supportAnnotations = "com.android.support:support-annotations:${Versions.supportVersion}"
    val constraintLayout = "com.android.support.constraint:constraint-layout:${Versions.constraintLayout}"
    val daggerCompiler = "com.google.dagger:dagger-compiler:${Versions.daggerVersion}"
    val dagger = "com.google.dagger:dagger:$daggerVersion"
    val daggerAndroidSupport = "com.google.dagger:dagger-android-support:$daggerVersion"
    val daggerAndroidCompiler = "com.google.dagger:dagger-android-processor:$daggerVersion"
    val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"
    val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    val retrofitRx = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"
    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    val autoFactory = "com.google.auto.factory:auto-factory:${Versions.autoFactory}"
    val autoFactoryAnnotation = "com.google.auto.factory:auto-factory:${Versions.autoFactory}"
    val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    val rxBinding = "com.jakewharton.rxbinding2:rxbinding:${Versions.rxBinding}"
    val rxBindingAppCompat = "com.jakewharton.rxbinding2:rxbinding-appcompat-v7:${Versions.rxBinding}"
}