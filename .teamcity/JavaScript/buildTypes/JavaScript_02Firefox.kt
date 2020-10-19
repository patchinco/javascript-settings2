package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object JavaScript_02Firefox : BuildType({
    templates(JavaScript_Template)
    uuid = "56897dfa-5c83-475b-95e3-f90548a84251"
    name = "02. Firefox"

    params {
        param("Browser", "Firefox")
    }

    dependencies {
        snapshot(JavaScript_01FastTests) {
        }
    }
})
