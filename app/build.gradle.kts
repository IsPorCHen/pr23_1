plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.bignerdranch.android.pr23_1"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.bignerdranch.android.pr23_1"
        minSdk = 25
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

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
}

dependencies {
    implementation("com.google.android.support:wearable:2.8.0")
    implementation ("androidx.wear:wear:1.3.0")
    implementation ("androidx.wear:wear-input-testing:1.1.0")
    implementation ("androidx.wear:wear-ongoing:1.0.0")
    implementation ("androidx.wear:wear-phone-interactions:1.0.1")
    implementation ("androidx.wear:wear-remote-interactions:1.0.0")
    implementation ("androidx.wear:wear-input:1.1.0")
    implementation("com.google.android.gms:play-services-wearable:18.2.0")
    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.wear.compose:compose-material:1.1.2")
    implementation("androidx.wear.compose:compose-foundation:1.1.2")
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation("androidx.core:core-splashscreen:1.0.1")
    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}