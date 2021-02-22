package com.github.m897329202.jectpack.services

import com.github.m897329202.jectpack.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
