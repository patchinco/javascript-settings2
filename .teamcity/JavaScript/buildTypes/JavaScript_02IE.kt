package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object JavaScript_02IE : BuildType({
    templates(JavaScript_Template)
    uuid = "26ce4b52-03de-4b63-b9ef-ed3daad09d80"
    name = "02. IE"

    params {
        param("Browser", "IE")
    }

    dependencies {
        snapshot(JavaScript_01FastTests) {
        }
    }
})
