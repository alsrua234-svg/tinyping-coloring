plugins { id("com.android.application") }
android {
    namespace = "com.twins.tinyping"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.twins.tinyping"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    signingConfigs {
        create("release") {
            storeFile = file("../keystore/tinyping.jks")
            storePassword = "tinyping"
            keyAlias = "tinyping"
            keyPassword = "tinyping"
        }
    }
    buildTypes {
        release { isMinifyEnabled = false; signingConfig = signingConfigs.getByName("release") }
        debug { signingConfig = signingConfigs.getByName("release") }
    }
    compileOptions { sourceCompatibility = JavaVersion.VERSION_17; targetCompatibility = JavaVersion.VERSION_17 }
}
dependencies {
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("androidx.webkit:webkit:1.11.0")
}
