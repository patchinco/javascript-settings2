package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object JavaScript_01FastTests : BuildType({
    templates(JavaScript_Template)
    uuid = "578b30cf-efd9-4e14-8b65-4e86a842721c"
    name = "01. Fast Tests"

    params {
        param("Browser", "PhantomJS")
    }
})
