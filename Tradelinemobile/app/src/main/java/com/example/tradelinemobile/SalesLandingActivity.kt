package com.example.tradelinemobile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tradelinemobile.ui.theme.TradelineMobileTheme
import java.text.DateFormat.getDateInstance
import java.util.*


@Composable
fun SalesLandingActivity(storeName: String, staff: String, profit: Int, products: Int, customers: Int) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally,
    )
    {
        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 22.dp),
            horizontalArrangement = Arrangement.End
        )
        {
            Column {
                Text(
                    text = "$storeName Store",
                    style = MaterialTheme.typography.labelMedium,
                    color = colorResource(id = R.color.blue100)
                )

                Row() {

                    Icon(
                        painter = painterResource(id = R.drawable.edit_pen_icon),
                        contentDescription = "edit pen icon",
                        modifier = Modifier.padding(top = 6.dp),
                    )

                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = staff,
                        style = MaterialTheme.typography.labelMedium,
                        color = colorResource(id = R.color.GrayText)
                    )
                }
            }

            Spacer(modifier = Modifier.height(15.dp))
            Spacer(modifier = Modifier.width(8.dp))

            Icon(
                painter = painterResource(R.drawable.store_icon),
                contentDescription = "edit pen icon",
                modifier = Modifier.padding(top = 10.dp),
            )

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp),
            horizontalArrangement = Arrangement.Start
        )
        {

            Spacer(modifier = Modifier.height(8.dp))

            Icon(
                painter = painterResource(R.drawable.time_icon),
                contentDescription = "time icon",
                modifier = Modifier.padding(top = 1.3.dp)
            )

            Spacer(modifier = Modifier.width(4.dp))

            val currentDate = getDateInstance().format(Date())

            Text(
                text = currentDate,
                style = MaterialTheme.typography.labelSmall,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp),
            horizontalArrangement = Arrangement.Start
        )
        {

            ElevatedCard(
                Modifier.size(width = 112.dp, height = 80.dp),
                shape = MaterialTheme.shapes.extraSmall,
                colors = CardDefaults.elevatedCardColors(
                    containerColor = colorResource(id = R.color.container_Blue)
                )
            )
            {
                Row(modifier = Modifier
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start) {
                    Text(
                        text = "Sales",
                        style = MaterialTheme.typography.labelMedium,
                        fontSize = 10. sp,
                        color = Color.Black,
                        modifier = Modifier.padding(top = 8.dp, start = 8.dp)
                    )

                    Icon(
                        painter = painterResource(R.drawable.hide_icon),
                        contentDescription = "hide icon",
                        modifier = Modifier.padding(top = 13.dp, start = 62.dp, end = 8.dp)
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))

                Row(modifier = Modifier
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center)
                {
                    Icon(
                        painter = painterResource(R.drawable.naira_icon),
                        contentDescription = "naira icon",
                        modifier = Modifier.padding(top = 5.2.dp)
                    )
                    Spacer(modifier = Modifier.width(2.dp))

                    Text(
                        text = "$profit",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.Black,
                    )
                }

            }

            Spacer(modifier = Modifier.width(7.dp))

            ElevatedCard(
                Modifier.size(width = 112.dp, height = 80.dp),
                shape = MaterialTheme.shapes.extraSmall,
                colors = CardDefaults.elevatedCardColors(
                    containerColor = colorResource(id = R.color.container_Purple)
                )
            )
            {Row(modifier = Modifier
                .fillMaxWidth(),
                horizontalArrangement = Arrangement.Start) {
                Text(
                    text = "Products",
                    style = MaterialTheme.typography.labelMedium,
                    fontSize = 10. sp,
                    color = Color.Black,
                    modifier = Modifier.padding(top = 8.dp, start = 8.dp)
                )

                Icon(
                    painter = painterResource(R.drawable.hide_icon),
                    contentDescription = "hide icon",
                    modifier = Modifier.padding(top = 13.dp, start = 47.dp, end = 8.dp)
                )
            }
                Spacer(modifier = Modifier.height(16.dp))

                Row(modifier = Modifier
                    .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center)
                {
                    Text(
                        text = "$products",
                        style = MaterialTheme.typography.bodyMedium,
                        color = Color.Black,
                    )
                }

            }

            Spacer(modifier = Modifier.width(7.dp))

            ElevatedCard(
                Modifier.size(width = 112.dp, height = 80.dp),
                shape = MaterialTheme.shapes.extraSmall,
                colors = CardDefaults.elevatedCardColors(
                    containerColor = colorResource(id = R.color.container_Green)
                )
            )
            {

            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp),
            horizontalArrangement = Arrangement.Start
        ) {
            Text(
                text = "QUICK LINKS",
                style = MaterialTheme.typography.displaySmall,
                color = Color.Black
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 24.dp),
            horizontalArrangement = Arrangement.Start
        )
        {
            Spacer(modifier = Modifier.height(6.dp))

            ElevatedCard(
                Modifier.size(width = 112.dp, height = 107.dp),
                shape = MaterialTheme.shapes.extraSmall,
                colors = CardDefaults.elevatedCardColors(
                    containerColor = colorResource(id = R.color.container_Gray)
                )
            )
            {

            }

            Spacer(modifier = Modifier.width(7.dp))

            ElevatedCard(
                Modifier.size(width = 192.dp, height = 107.dp),
                shape = MaterialTheme.shapes.extraSmall,
                colors = CardDefaults.elevatedCardColors(
                    containerColor = colorResource(id = R.color.container_Gray)
                )
            )
            {

            }
        }

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
fun SalesLandingActivityPreview() {
    TradelineMobileTheme { SalesLandingActivity("Hason", "store owner", 205000, 39, 235) }
}