plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}

android {
    namespace = "com.jemutai.retrofit_jetpack"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.jemutai.retrofit_jetpack"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3.android)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)


    // ViewModel and LiveData
    implementation (libs.androidx.lifecycle.viewmodel.ktx.v251)
    implementation (libs.androidx.lifecycle.livedata.ktx.v251)

// Retrofit
    implementation (libs.retrofit)

// Moshi
    implementation (libs.moshi)
    implementation (libs.moshi.kotlin)
    implementation (libs.converter.moshi)

// OkHttp and OkHttp Interceptor
    implementation (libs.okhttp.v493)
    implementation (libs.logging.interceptor)

    // Jetpack Compose
    implementation (libs.ui)
    implementation (libs.androidx.runtime.livedata)



//    implementation (libs.androidx.lifecycle.viewmodel.ktx)
//    implementation (libs.androidx.lifecycle.livedata.ktx)
//    implementation (libs.retrofit)
//    implementation (libs.converter.moshi)
//    implementation (libs.okhttp)
//    implementation (libs.androidx.lifecycle.livedata.ktx)
}