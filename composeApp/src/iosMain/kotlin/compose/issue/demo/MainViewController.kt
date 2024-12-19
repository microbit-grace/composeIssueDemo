package compose.issue.demo

import androidx.compose.runtime.ExperimentalComposeApi
import androidx.compose.ui.platform.AccessibilitySyncOptions
import androidx.compose.ui.window.ComposeUIViewController

@OptIn(ExperimentalComposeApi::class)
fun MainViewController() = ComposeUIViewController(configure = {
    accessibilitySyncOptions = AccessibilitySyncOptions.Always(debugLogger = null)
}) { App() }