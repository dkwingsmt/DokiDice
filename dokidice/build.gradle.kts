plugins {
    id("kotlin")
    id("application")
}

val kotlinVersion: String by rootProject.ext

val miraiCoreVersion: String by rootProject.ext

dependencies {
    implementation("net.mamoe:mirai-core:$miraiCoreVersion")
    implementation("net.mamoe:mirai-core-qqandroid:$miraiCoreVersion")
    implementation("com.xenomachina:kotlin-argparser:2.0.7")
}

application {
    mainClassName = "dokidice.DokiDiceKt"
}
