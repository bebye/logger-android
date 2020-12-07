/**
 * Created by mkwon on 06/11/2020.
 */
object Dependency {
    object GradlePlugin {
        const val build = "com.android.tools.build:gradle:${Versions.buildGradle}"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    }

    object Kotlin {
        const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    }

    object AndroidX {
        const val core = "androidx.core:core-ktx:${Versions.core}"
        const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    }

    object Google {
        const val material = "com.google.android.material:material:${Versions.material}"
    }
}