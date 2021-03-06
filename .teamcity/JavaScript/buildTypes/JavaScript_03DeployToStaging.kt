package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object JavaScript_03DeployToStaging : BuildType({
    uuid = "2cef2f34-f9dd-4bd8-871d-a4afc592772f"
    name = "03. Deploy to Staging"

    vcs {
        root(JavaScript.vcsRoots.JavaScript_HttpsGithubComG0t4teamcityCourseCards)
    }
	
	steps {
        script {
            name = "IIS Deploy"
            id = "RUNNER_6"
            scriptContent = """
		rmdir /S /Q \inetpub\wwwroot
		xcopy /S /I /Y app \inetpub\wwwroot\
			"""
        }
    }  

    dependencies {
        snapshot(JavaScript_02Chrome) {
            reuseBuilds = ReuseBuilds.NO
        }
        snapshot(JavaScript_02Firefox) {
            reuseBuilds = ReuseBuilds.NO
        }
    }

    triggers {
        vcs {
            id = "vcsTrigger"
            branchFilter = ""
        }
    }
})
