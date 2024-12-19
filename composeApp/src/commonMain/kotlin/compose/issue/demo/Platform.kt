package compose.issue.demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform