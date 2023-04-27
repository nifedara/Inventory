package com.example.tradelinemobile

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tradelinemobile.ui.theme.TradelineMobileTheme


@Composable
fun CreateStoreSuccess(storeName: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally,
    )
    {
        Spacer(modifier = Modifier.height(80.dp))

        Image(
            painter = painterResource(R.drawable.startup_investment),
            contentDescription = "tradeline image",
            modifier = Modifier
                .size(230.dp)
        )

        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = "$storeName store has been created successfully",
            style = MaterialTheme.typography.bodyLarge,
            color = Color.Black,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedButton(
            onClick = { /* Do something! */ },
            border = BorderStroke(1.dp, colorResource(id = R.color.blue100)),
            modifier = Modifier
                .height(33.dp)
                .width(132.dp)
        ) {
            Icon(
                painter = painterResource(R.drawable.add_buton),
                contentDescription = "add button",
                modifier = Modifier.size(10.dp),
                colorResource(id = R.color.blue100)
            )

            Spacer(modifier = Modifier.width(4.dp))

            Text(
                "Add Products",
                style = MaterialTheme.typography.labelSmall,
                color = Color.Black
            )
        }

        Spacer(modifier = Modifier.height(182.dp))

//        var selectedItem by remember { mutableStateOf(0) }
//        val items = listOf("Songs", "Artists", "Playlists")

        NavigationBar(
            modifier = Modifier.height(59.dp),
            containerColor = Color.White,
            tonalElevation = 28.dp
        ) {

        }
    }
}

@Preview(showBackground = true)
@Composable
fun CreateStoreSuccessPreview() {
    TradelineMobileTheme { CreateStoreSuccess("Hason") }
}