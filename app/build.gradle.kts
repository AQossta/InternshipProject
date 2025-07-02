plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.internshipproject"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.internshipproject"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    // Navigation Fragment (для обычных фрагментов)
    implementation("androidx.navigation:navigation-fragment-ktx:2.9.0")

    // Navigation UI (если используешь toolbar, bottom nav и т.д.)
    implementation("androidx.navigation:navigation-ui-ktx:2.9.0")

    // Для Safe Args (опционально — переходы с аргументами)
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:2.9.0")

    implementation ("de.hdodenhof:circleimageview:3.1.0")

}