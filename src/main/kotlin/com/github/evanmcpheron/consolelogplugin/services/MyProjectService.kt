package com.github.evanmcpheron.consolelogplugin.services

import com.intellij.openapi.project.Project
import com.github.evanmcpheron.consolelogplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
