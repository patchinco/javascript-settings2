package JavaScript.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object JavaScript_02Chrome : BuildType({
    templates(JavaScript_Template)
    uuid = "1288d3ac-0ab7-45fc-a835-c07739836668"
    name = "02. Chrome"

    params {
        param("Browser", "Chrome")
    }

    dependencies {
        snapshot(JavaScript_01FastTests) {
            reuseBuilds = ReuseBuilds.NO
        }
    }
})
