package com.github.achaozju.intellijplatformplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.achaozju.intellijplatformplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
