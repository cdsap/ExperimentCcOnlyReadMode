pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
rootProject.name="ccOnlyReadMode"
plugins {
    id("com.gradle.develocity") version "4.1"
    id("com.gradle.common-custom-user-data-gradle-plugin") version "2.2"
    
}

develocity {
    server = "https://ge.solutions-team.gradle.com/"
    allowUntrustedServer = true
    buildScan {
        uploadInBackground.set(false)
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
} 
include (":core:push")
include (":core:contact")
include (":core:login")
include (":core:identity")
include (":core:checkout")
include (":core:cart")
include (":core:user")
include (":core:profile")
include (":core:feed")
include (":core:comment")
include (":core:post")
include (":core:search")
include (":core:location")
include (":core:network")
include (":feature:sync")
include (":feature:share")
include (":feature:group")
include (":feature:message")
include (":feature:notification")
include (":feature:setting")
include (":feature:account")
include (":feature:session")
include (":feature:analytics")
include (":feature:report")
include (":feature:log")
include (":feature:status")
include (":feature:metric")
include (":feature:task")
include (":domain:calendar")
include (":domain:event")
include (":domain:alarm")
include (":domain:timer")
include (":domain:file")
include (":domain:document")
include (":domain:note")
include (":domain:todo")
include (":domain:list")
include (":domain:map")
include (":domain:weather")
include (":domain:forecast")
include (":domain:news")
include (":domain:article")
include (":repository:podcast")
include (":repository:video")
include (":repository:photo")
include (":repository:gallery")
include (":repository:media")
include (":repository:audio")
include (":repository:playlist")
include (":repository:push-contact")
include (":repository:contact-contact")
include (":repository:login-contact")
include (":repository:identity-contact")
include (":repository:checkout-contact")
include (":repository:cart-contact")
include (":repository:user-contact")
include (":model:profile-contact")
include (":model:feed-contact")
include (":model:comment-contact")
include (":model:post-contact")
include (":model:search-contact")
include (":model:location-contact")
include (":model:network-contact")
include (":model:sync-contact")
include (":model:share-contact")
include (":model:group-contact")
include (":model:message-contact")
include (":model:notification-contact")
include (":model:setting-contact")
include (":model:account-contact")
include (":app:app")