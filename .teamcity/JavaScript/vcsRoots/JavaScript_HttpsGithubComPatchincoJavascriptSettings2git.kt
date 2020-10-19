package JavaScript.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object JavaScript_HttpsGithubComPatchincoJavascriptSettings2git : GitVcsRoot({
    uuid = "d424db55-6a59-40b2-b820-47d26ee0005b"
    name = "https://github.com/patchinco/javascript-settings2.git"
    url = "https://github.com/patchinco/javascript-settings2.git"
    branch = "refs/heads/main"
    authMethod = password {
        userName = "patchinco"
        password = "zxxd7a6b1fce2837e81385bf38472447b2255d6ce10b264d8ba52c9b29c60f2164ac2ca2388d97e2575775d03cbe80d301b"
    }
})
