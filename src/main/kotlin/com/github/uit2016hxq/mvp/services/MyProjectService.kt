package com.github.uit2016hxq.mvp.services

import com.github.uit2016hxq.mvp.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
