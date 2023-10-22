plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
}

android {
    buildFeatures{
        viewBinding = true
    }
    namespace = "org.freedu.freeduchat"
    compileSdk = 34

    defaultConfig {
        applicationId = "org.freedu.freeduchat"
        minSdk = 26
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-database:20.3.0")
    implementation("com.google.firebase:firebase-auth:22.2.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

    implementation ("com.github.mukeshsolanki.android-otpview-pinview:otpview-compose:3.1.0")
    implementation ("com.github.mukeshsolanki.android-otpview-pinview:otpview:3.1.0")

    implementation ("com.github.bumptech.glide:glide:4.16.0")

    implementation ("com.github.bumptech.glide:glide:4.16.0")

    implementation ("com.github.pgreze:android-reactions:1.5.1")

    implementation ("com.github.3llomi:CircularStatusView:V1.0.3")

    implementation ("com.github.OMARIHAMZA:StoryView:1.0.2-alpha")

    implementation ("com.github.OMARIHAMZA:StoryView:1.0.2-alpha")
}