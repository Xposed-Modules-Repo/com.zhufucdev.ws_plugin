plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.zhufucdev.ws_plugin"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.zhufucdev.ws_plugin"
        minSdk = 24
        targetSdk = 34
        versionCode = 3
        versionName = "1.2.2"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.kotlinx.coroutines.android)
    // Xposed
    ksp(libs.yuki.ksp)
    implementation(libs.yuki.api)
    compileOnly(libs.xposed.api)
    // Internal
    implementation(libs.me.stub)
    implementation(libs.me.plugin)
    implementation(libs.me.xposed)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}