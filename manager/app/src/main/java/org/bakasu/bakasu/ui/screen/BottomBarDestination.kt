package org.bakasu.bakasu.ui.screen

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AdminPanelSettings
import androidx.compose.material.icons.outlined.Extension
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import org.bakasu.bakasu.R
import org.bakasu.bakasu.ui.screen.main.HomePage
import org.bakasu.bakasu.ui.screen.main.ModulePage
import org.bakasu.bakasu.ui.screen.main.SettingsPage
import org.bakasu.bakasu.ui.screen.main.SuperUserPage

enum class BottomBarDestination(
    val direction: @Composable (bottomPadding: Dp) -> Unit,
    @param:StringRes val label: Int,
    val iconSelected: ImageVector,
    val iconNotSelected: ImageVector,
    val rootRequired: Boolean,
) {
    Home(
        { bottomPadding -> HomePage(bottomPadding) },
        R.string.home,
        Icons.Outlined.Home,
        Icons.Outlined.Home,
        false,
    ),
    SuperUser(
        { bottomPadding -> SuperUserPage(bottomPadding) },
        R.string.superuser,
        Icons.Outlined.AdminPanelSettings,
        Icons.Outlined.AdminPanelSettings,
        true,
    ),
    Module(
        { bottomPadding -> ModulePage(bottomPadding) },
        R.string.module,
        Icons.Outlined.Extension,
        Icons.Outlined.Extension,
        true,
    ),
    Settings(
        { bottomPadding -> SettingsPage(bottomPadding) },
        R.string.settings,
        Icons.Outlined.Settings,
        Icons.Outlined.Settings,
        false,
    ),
    ;

    companion object {
        fun getPages(isKsuValid: Boolean): List<BottomBarDestination> = if (isKsuValid) {
            // 全功能管理器
            BottomBarDestination.entries.toList()
        } else {
            BottomBarDestination.entries.filter {
                !it.rootRequired
            }
        }
    }
}
