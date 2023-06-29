package com.example.navigationbar

sealed class BottomNavItem(
    var title: String,
    var icon: Int
) {
    object Home :
        BottomNavItem(
            "Home",
            R.drawable.baseline_home_24
        )

    object List :
        BottomNavItem(
            "List",
            R.drawable.baseline_list_24
        )

    object Analytics :
        BottomNavItem(
            "Analytics",
            R.drawable.baseline_access_time_24
        )

    object Profile :
        BottomNavItem(
            "Profile",
            R.drawable.baseline_person_24
        )
}
