package JavaScript

import JavaScript.buildTypes.*
import JavaScript.vcsRoots.*
import JavaScript.vcsRoots.JavaScript_HttpsGithubComPatchincoJavascriptSettings2git
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.versionedSettings

object Project : Project({
    uuid = "0bb5aea2-c587-431f-be87-4ccd64363dd7"
    id("JavaScript")
    parentId("_Root")
    name = "JavaScript"
    description = "My JS Project"
	
    vcsRoot(JavaScript_HttpsGithubComPatchincoJavascriptSettings2git)
    vcsRoot(JavaScript_HttpsGithubComG0t4teamcityCourseCards)

    buildType(JavaScript_03DeployToStaging)
    buildType(JavaScript_02Chrome)
    buildType(JavaScript_02Firefox)
    buildType(JavaScript_01FastTests)

    template(JavaScript_Template)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = "${JavaScript_HttpsGithubComPatchincoJavascriptSettings2git.id}"
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})
