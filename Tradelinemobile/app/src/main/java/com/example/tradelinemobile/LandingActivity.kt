package com.example.tradelinemobile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tradelinemobile.ui.theme.TradelineMobileTheme

//@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Landing() {

    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 160.dp),
//            .background(MaterialTheme.colorScheme.background),
        horizontalArrangement = Arrangement.Center,
    )
    {
        Icon(
            painter = painterResource(R.drawable.vector),
            contentDescription = "tradeline logo icon",
            modifier = Modifier.size(22.dp),
            colorResource(id = R.color.blue100)
        )

        Spacer(modifier = Modifier.width(4.dp))
        Surface {
            Text(
                text = "TRADELINE",
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.primary
            )
        }
    }

    Column(
        modifier = Modifier.fillMaxWidth(),
//            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        Spacer(modifier = Modifier.height(260.dp))
        Image(
            painter = painterResource(R.drawable.tradeline_landing_png),
            contentDescription = "tradeline image",
            modifier = Modifier
                .size(230.dp)
        )

        Spacer(modifier = Modifier.height(80.dp))

        Button(
            onClick = {}, shape = MaterialTheme.shapes.large,
            // modifier = Modifier.padding(start = 24.dp, end = 24.dp),
            modifier = Modifier
                .height(50.dp)
                .width(312.dp)
        )
        {
            Text(
                text = "CREATE STORE",
                color = MaterialTheme.colorScheme.onPrimary
            )

            Image(
                painterResource(id = R.drawable.create_store_button_img),
                contentDescription = "create store button icon",
                modifier = Modifier
                    .size(26.dp)
                    .padding(start = 10.dp)
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = { /* ... */ }, shape = MaterialTheme.shapes.large,
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(id = R.color.blue50)
            ),
            modifier = Modifier
                .height(50.dp)
                .width(312.dp)
        )
        {
            Text(
                text = "SIGN IN",
                color = MaterialTheme.colorScheme.primary
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LandingPreview() {
    TradelineMobileTheme { Landing() }
}