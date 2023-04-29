package com.example.tradelinemobile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tradelinemobile.ui.theme.TradelineMobileTheme


@Composable
fun HomeDashboard() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally,
    )
    {
        Spacer(modifier = Modifier.height(294.dp))

        

        Spacer(modifier = Modifier.height(234.dp))

        var selectedItem by remember { mutableStateOf(0) }
        val items = listOf("home", "sales", "inventory", "analytics", "account")

        NavigationBar(
            containerColor = colorResource(id = R.color.nav_white),
            tonalElevation = 12.dp
        ) {
            items.forEachIndexed { index, item ->
                NavigationBarItem(
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = colorResource(id = R.color.blue100),
                        selectedTextColor = colorResource(id = R.color.blue100),
                        indicatorColor = colorResource(id = R.color.blue50),
                        unselectedIconColor = colorResource(id = R.color.nav_text_gray),
                        unselectedTextColor = colorResource(id = R.color.nav_text_gray),
                    ),
                    icon = {
                        when (item) {
                            "home" -> Icon(
                                painter = painterResource(id = R.drawable.home_inactive_icon),
                                contentDescription = "home icon",
                                modifier = Modifier,
                            )
                            "sales" -> Icon(
                                painter = painterResource(R.drawable.sales_icon),
                                contentDescription = "sales icon",
                                modifier = Modifier,
                            )

                            "inventory" -> Icon(
                                painter = painterResource(id = R.drawable.inventory_inactive_icon),
                                contentDescription = "inventory icon",
                                modifier = Modifier,
                            )
                            "analytics" -> Icon(
                                painter = painterResource(id = R.drawable.analytics_inactive_icon_),
                                contentDescription = "analytics icon"
                            )

                            "account" -> Icon(
                                painter = painterResource(id = R.drawable.account_inactive_icon),
                                contentDescription = "account icon",
                                modifier = Modifier,
                            )
                        }

                    },
                    label = {
                        Text(
                            item,
                            style = MaterialTheme.typography.displaySmall
                        )
                    },
                    selected = selectedItem == index,
                    onClick = { }
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun HomeDashboardPreview() {
    TradelineMobileTheme { HomeDashboard() }
}