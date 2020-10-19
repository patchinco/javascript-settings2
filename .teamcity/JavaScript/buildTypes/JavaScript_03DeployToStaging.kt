package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object JavaScript_03DeployToStaging : BuildType({
    uuid = "2cef2f34-f9dd-4bd8-871d-a4afc592772f"
    name = "03. Deploy to Staging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCards)
    }

    dependencies {
        snapshot(JavaScript_02Chrome) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(JavaScript_02Firefox) {
            reuseBuilds = ReuseBuilds.NO
        }
    }
})
