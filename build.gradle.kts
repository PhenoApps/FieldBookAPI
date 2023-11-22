//https://docs.gradle.org/current/samples/sample_building_kotlin_libraries.html

plugins {
    kotlin("jvm") version "1.9.0"
    `java-library`
    `maven-publish`
    signing
}

group = "org.phenoapps.fieldbook"

/**
 *     Major version number when you make breaking changes.
 *     Minor version number when you add new functionality in a backward-compatible manner.
 *     Patch version number when you make backward-compatible bug fixes.
 *      SNAPSHOT - should be appended for development versions before final release
 */
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}

tasks.jar {
    manifest {
        attributes(mapOf("Implementation-Title" to project.name,
            "Implementation-Version" to project.version))
    }
}

java {
    withJavadocJar()
    withSourcesJar()
}


publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            artifactId = "fieldbook-api-contracts"
            from(components["java"])
            pom {
                name = "FieldBook API Contracts"
                description = "CRUD column references for use with FieldBook's content provider."
                url = "https://www.phenoapps.org/"
//                properties = mapOf(
//                    "myProp" to "value",
//                    "prop.with.dots" to "anotherValue"
//                )
//                licenses {
//                    license {
//                        name = "The Apache License, Version 2.0"
//                        url = "http://www.apache.org/licenses/LICENSE-2.0.txt"
//                    }
//                }
                developers {
                    developer {
                        id = "chaneylc"
                        name = "Chaney Courtney"
                        email = "chaneylc@gmail.com"
                    }
                    developer {
                        id = "trife"
                        name = "Trevor Rife"
                        email = "twrife@clemson.edu"
                    }
                }
//                scm {
//                    connection = "scm:git:git://example.com/my-library.git"
//                    developerConnection = "scm:git:ssh://example.com/my-library.git"
//                    url = "http://example.com/my-library/"
//                }
            }
        }
    }

    repositories {
        maven {
            // change URLs to point to your repos, e.g. http://my.org/repo
            val releasesRepoUrl = uri(layout.buildDirectory.dir("repos/releases"))
            val snapshotsRepoUrl = uri(layout.buildDirectory.dir("repos/snapshots"))
            url = if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
        }
    }
}

signing {
    sign(publishing.publications["mavenJava"])
}

tasks.javadoc {
    if (JavaVersion.current().isJava9Compatible) {
        (options as StandardJavadocDocletOptions).addBooleanOption("html5", true)
    }
}